package com.example.daniellouro.csoulol;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    ImageView imageView;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageView = (ImageView) findViewById(R.id.imageBox);
        btn = (Button) findViewById(R.id.btn);
        btn.getBackground().setAlpha(128);
    }

    public  void  randomImage() {
        Random random = new Random();
        int a;

        a = random.nextInt(18);

        switch (a) {
            case 0:
                imageView.setBackgroundResource(R.drawable.boltz);
                break;
            case 1:
                imageView.setBackgroundResource(R.drawable.brtt);
                break;
            case 2:
                imageView.setBackgroundResource(R.drawable.coldzera);
                break;
            case 3:
                imageView.setBackgroundResource(R.drawable.fallen);
                break;
            case 4:
                imageView.setBackgroundResource(R.drawable.felps);
                break;
            case 5:
                imageView.setBackgroundResource(R.drawable.fer);
                break;
            case 6:
                imageView.setBackgroundResource(R.drawable.fnx);
                break;
            case 7:
                imageView.setBackgroundResource(R.drawable.hen1);
                break;
            case 8:
                imageView.setBackgroundResource(R.drawable.kami);
                break;
            case 9:
                imageView.setBackgroundResource(R.drawable.lucas1);
                break;
            case 10:
                imageView.setBackgroundResource(R.drawable.minerva);
                break;
            case 11:
                imageView.setBackgroundResource(R.drawable.mylon);
                break;
            case 12:
                imageView.setBackgroundResource(R.drawable.picoca);
                break;
            case 13:
                imageView.setBackgroundResource(R.drawable.shoowtime);
                break;
            case 14:
                imageView.setBackgroundResource(R.drawable.sirt);
                break;
            case 15:
                imageView.setBackgroundResource(R.drawable.taco);
                break;
            case 16:
                imageView.setBackgroundResource(R.drawable.taeyeon);
                break;
            case 17:
                imageView.setBackgroundResource(R.drawable.zakk);
                break;
            case 18:
                imageView.setBackgroundResource(R.drawable.ziriguidun);
                break;
        }
    }

}
