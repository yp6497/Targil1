package com.example.targil1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    Button btn;
    ImageView[] iv=new ImageView[3];
    int []id=new int[3];
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn=findViewById(R.id.btn);
        iv[0]=(ImageView) findViewById(R.id.iv1);
        iv[1]=(ImageView) findViewById(R.id.iv2);
        iv[2]=(ImageView) findViewById(R.id.iv3);

        id[0]=R.drawable.cloud;
        id[1]=R.drawable.sky;
        id[2]=R.drawable.tree;
    }

    public void go(View view) {
        int x = (int) (Math.random() * 3 + 1);
        btn.setText(x + " ");
        if (x == 1){
            iv[0].setVisibility(view.VISIBLE);
            iv[1].setVisibility(view.INVISIBLE);
            iv[2].setVisibility(view.INVISIBLE);
            iv[0].setImageResource(id[0]);
         }
        if (x == 2){
            iv[1].setVisibility(view.VISIBLE);
            iv[0].setVisibility(view.INVISIBLE);
            iv[2].setVisibility(view.INVISIBLE);
            iv[1].setImageResource(id[1]);
         }
        if (x == 3){
            iv[2].setVisibility(view.VISIBLE);
            iv[0].setVisibility(view.INVISIBLE);
            iv[1].setVisibility(view.INVISIBLE);
            iv[2].setImageResource(id[2]);
         }

        }
    }

