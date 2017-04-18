package com.example.rlcr.ejemplomartes;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {


    private Button braulio;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        braulio = (Button) findViewById(R.id.btn_braulio);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        braulio.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent braulioActivity = new Intent(MainActivity.this, BraulioBriones.class);
            }
        });
    }
}
