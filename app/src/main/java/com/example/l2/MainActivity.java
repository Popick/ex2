package com.example.l2;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void changeImg(View view) {

        Button btn1 = (Button) findViewById(R.id.btn);
        ImageView iv = (ImageView) findViewById(R.id.img);

        //אלברט אם אני כותב את ה2 שורות מעל מחוץ לפונקציה האפליקציה לא נפתחת, אפשר לדעת למה?

        int rand = (int)(Math.random() * 3) + 1;
        System.out.print(rand);
        if (rand==1) {
            iv.setImageResource(R.drawable.fbam);
        }else if(rand==2){
            iv.setImageResource(R.drawable.rbam);
        }else if(rand==3){
            iv.setImageResource(R.drawable.nbam);
        }
        btn1.setText("YOUR NUMBER IS! "+ rand);
    }

}