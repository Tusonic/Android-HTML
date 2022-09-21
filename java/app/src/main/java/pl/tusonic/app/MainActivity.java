package pl.tusonic.app;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import pl.tusonic.MarkdownView;
import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;


public class MainActivity extends AppCompatActivity {

    @Override protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        MarkdownView markdownView = (MarkdownView) findViewById(R.id.markdown_view);
        markdownView.setMarkDownText("# Tusonic\n"
                + "Tusonic");
        //markdownView.loadMarkdownFromAssets("README.md");
        markdownView.setOpenUrlInBrowser(true); // default false

    }

  @Override
  public void onBackPressed() {
    new AlertDialog.Builder(this)
            .setMessage("Are You Sure ?")
            .setCancelable(false)
            .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
              public void onClick(DialogInterface dialog, int id) {
                MainActivity.this.finish();
              }
            })
            .setNegativeButton("No", null)
            .show();
  }

}
