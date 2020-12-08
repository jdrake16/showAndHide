package com.example.showandhide;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    public void showPicture(View view) {

        Button butt1 = findViewById(R.id.buttonShow);
        ImageView imageView = findViewById(R.id.taoPic);
        imageView.animate().alpha(1).setDuration(1000);

    }


    public void hidePicture(View view) {

        Button butt2 = findViewById(R.id.buttonHide);
        ImageView imageViewDos = findViewById(R.id.taoPic);
        imageViewDos.animate().alpha(0).setDuration(1000);

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}