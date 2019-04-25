package com.example.rc;

import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import static android.graphics.Color.RED;


public class LearnActivity extends AppCompatActivity {

    Cube cube;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_learn);

        cube = new Cube();
        cube.scramble();
        refresh();
    }

    public void recolor(ImageView iv, char c)
    {
        if (c == 'w')
        {
            iv.setColorFilter(Color.WHITE);
        }
        else if (c == 'y')
        {
            iv.setColorFilter(Color.YELLOW);
        }
        if (c == 'r')
        {
            iv.setColorFilter(Color.RED);
        }
        if (c == 'o')
        {
            iv.setColorFilter(0xFFA500);
        }
        if (c == 'b')
        {
            iv.setColorFilter(Color.BLUE);
        }
        if (c == 'g')
        {
            iv.setColorFilter(Color.GREEN);
        }
    }

    public void refresh()
    {
        ImageView iv = findViewById(R.id.u1);
        recolor(iv, cube.u[1]);
        iv = findViewById(R.id.u2);
        recolor(iv, cube.u[2]);
        iv = findViewById(R.id.u3);
        recolor(iv, cube.u[3]);
        iv = findViewById(R.id.u4);
        recolor(iv, cube.u[4]);
        iv = findViewById(R.id.u5);
        recolor(iv, cube.u[5]);
        iv = findViewById(R.id.u6);
        recolor(iv, cube.u[6]);
        iv = findViewById(R.id.u7);
        recolor(iv, cube.u[7]);
        iv = findViewById(R.id.u8);
        recolor(iv, cube.u[8]);
        iv = findViewById(R.id.u9);
        recolor(iv, cube.u[9]);

        iv = findViewById(R.id.d1);
        recolor(iv, cube.d[1]);
        iv = findViewById(R.id.d2);
        recolor(iv, cube.d[2]);
        iv = findViewById(R.id.d3);
        recolor(iv, cube.d[3]);
        iv = findViewById(R.id.d4);
        recolor(iv, cube.d[4]);
        iv = findViewById(R.id.d5);
        recolor(iv, cube.d[5]);
        iv = findViewById(R.id.d6);
        recolor(iv, cube.d[6]);
        iv = findViewById(R.id.d7);
        recolor(iv, cube.d[7]);
        iv = findViewById(R.id.d8);
        recolor(iv, cube.d[8]);
        iv = findViewById(R.id.d9);
        recolor(iv, cube.d[9]);

        /*
        iv = findViewById(R.id.u1);
        recolor(iv, cube.u[1]);
        iv = findViewById(R.id.u2);
        recolor(iv, cube.u[2]);
        iv = findViewById(R.id.u3);
        recolor(iv, cube.u[3]);
        iv = findViewById(R.id.u4);
        recolor(iv, cube.u[4]);
        iv = findViewById(R.id.u5);
        recolor(iv, cube.u[5]);
        iv = findViewById(R.id.u6);
        recolor(iv, cube.u[6]);
        iv = findViewById(R.id.u7);
        recolor(iv, cube.u[7]);
        iv = findViewById(R.id.u8);
        recolor(iv, cube.u[8]);
        iv = findViewById(R.id.u9);
        recolor(iv, cube.u[9]);

        iv = findViewById(R.id.u1);
        recolor(iv, cube.u[1]);
        iv = findViewById(R.id.u2);
        recolor(iv, cube.u[2]);
        iv = findViewById(R.id.u3);
        recolor(iv, cube.u[3]);
        iv = findViewById(R.id.u4);
        recolor(iv, cube.u[4]);
        iv = findViewById(R.id.u5);
        recolor(iv, cube.u[5]);
        iv = findViewById(R.id.u6);
        recolor(iv, cube.u[6]);
        iv = findViewById(R.id.u7);
        recolor(iv, cube.u[7]);
        iv = findViewById(R.id.u8);
        recolor(iv, cube.u[8]);
        iv = findViewById(R.id.u9);
        recolor(iv, cube.u[9]);

        iv = findViewById(R.id.u1);
        recolor(iv, cube.u[1]);
        iv = findViewById(R.id.u2);
        recolor(iv, cube.u[2]);
        iv = findViewById(R.id.u3);
        recolor(iv, cube.u[3]);
        iv = findViewById(R.id.u4);
        recolor(iv, cube.u[4]);
        iv = findViewById(R.id.u5);
        recolor(iv, cube.u[5]);
        iv = findViewById(R.id.u6);
        recolor(iv, cube.u[6]);
        iv = findViewById(R.id.u7);
        recolor(iv, cube.u[7]);
        iv = findViewById(R.id.u8);
        recolor(iv, cube.u[8]);
        iv = findViewById(R.id.u9);
        recolor(iv, cube.u[9]);

        iv = findViewById(R.id.u1);
        recolor(iv, cube.u[1]);
        iv = findViewById(R.id.u2);
        recolor(iv, cube.u[2]);
        iv = findViewById(R.id.u3);
        recolor(iv, cube.u[3]);
        iv = findViewById(R.id.u4);
        recolor(iv, cube.u[4]);
        iv = findViewById(R.id.u5);
        recolor(iv, cube.u[5]);
        iv = findViewById(R.id.u6);
        recolor(iv, cube.u[6]);
        iv = findViewById(R.id.u7);
        recolor(iv, cube.u[7]);
        iv = findViewById(R.id.u8);
        recolor(iv, cube.u[8]);
        iv = findViewById(R.id.u9);
        recolor(iv, cube.u[9]);

        */

        //ImageView iv = findViewById(R.id.u1);
        //Drawable d = iv.getDrawable();
        //iv.setColorFilter(0xffff0000);
    }
}
