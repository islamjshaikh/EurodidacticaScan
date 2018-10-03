package com.eurodidactica.eurodidacticascan;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ScanActivity extends AppCompatActivity {

    Button scan, cancel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scan);

        scan = (Button) findViewById(R.id.scan1);
        cancel = (Button) findViewById(R.id.cancel);

        scan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(ScanActivity.this, CameraActivity.class);
                startActivity(i);


            }
        });

        cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                finish();
                System.exit(0);
            }

        });

    }
}
