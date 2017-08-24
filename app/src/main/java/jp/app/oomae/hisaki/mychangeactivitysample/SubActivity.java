package jp.app.oomae.hisaki.mychangeactivitysample;

/**
 * Created by hisaki on 2017/08/25.
 */

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class SubActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_submain);

        findViewById(R.id.button1).setOnClickListener(changeActivity);
    }

    View.OnClickListener changeActivity = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(SubActivity.this, SubSubActivity.class);
            startActivity(intent);
        }
    };
}
