package com.bitdottech.Shield;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageButton;

public class navigation_Interface extends AppCompatActivity {

    ImageButton hospitalIbtn, policeIbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_navigation__interface);

        hospitalIbtn = findViewById(R.id.imgBtnhos);
        policeIbtn = findViewById(R.id.imgBtnpol);


        hospitalIbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(navigation_Interface.this, Hospital.class);
                startActivity(intent);
            }
        });

        policeIbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(navigation_Interface.this, Police_Station.class);
                startActivity(intent);
            }
        });

    }

    public void callambu(View view) {
        String number = "1990";
        Intent intent = new Intent(Intent.ACTION_DIAL);
        intent.setData(Uri.parse("tel:" + number));

//        if (ActivityCompat.checkSelfPermission(this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED){
//            return;

//        }
        startActivity(intent);
    }

    public void callpolic119(View view) {

        String number = "119";
        Intent intent = new Intent(Intent.ACTION_DIAL);
        intent.setData(Uri.parse("tel:" + number));


        startActivity(intent);
    }
}