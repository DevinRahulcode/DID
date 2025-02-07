package com.bitdottech.Shield;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;

public class information extends AppCompatActivity {

    Button DM;
    Button SH;
    Button CS;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_information);


        DM = findViewById(R.id.btn_dv);

        DM.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(information.this,Domestic.class);
                startActivity(intent);
            }
        });

        SH = findViewById(R.id.btn_sh);

        SH.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(information.this,SexualH.class);
                startActivity(intent);
            }
        });


        CS = findViewById(R.id.btn_cb);

        CS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(information.this,CyberS.class);
                startActivity(intent);
            }
        });


    }
}