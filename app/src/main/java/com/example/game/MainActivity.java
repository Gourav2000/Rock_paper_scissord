package com.example.game;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    int hch;
    int c=0,h=0;
    public void rock(View view){
        hch=0;
        ImageView iv=(ImageView) findViewById(R.id.himg);
        iv.setImageResource(R.drawable.r);
        Random rand=new Random();
        int cch= rand.nextInt(3);
        if(cch==0)
        {
            iv=(ImageView) findViewById(R.id.cimg);
            iv.setImageResource(R.drawable.r);
        }
        if(cch==1)
        {
            iv=(ImageView) findViewById(R.id.cimg);
            iv.setImageResource(R.drawable.p);
        }
        if(cch==2)
        {
            iv=(ImageView) findViewById(R.id.cimg);
            iv.setImageResource(R.drawable.s);
        }
        check(cch);
        TextView tv=(TextView)findViewById(R.id.hscore);
        tv.setText("Human:"+h);
        tv=(TextView)findViewById(R.id.cscore);
        tv.setText("Computer:"+c);
    }
    public void paper(View view){
        hch=1;
        ImageView iv=(ImageView) findViewById(R.id.himg);
        iv.setImageResource(R.drawable.p);
        Random rand=new Random();
        int cch= rand.nextInt(3);
        if(cch==0)
        {
            iv=(ImageView) findViewById(R.id.cimg);
            iv.setImageResource(R.drawable.r);
        }
        if(cch==1)
        {
            iv=(ImageView) findViewById(R.id.cimg);
            iv.setImageResource(R.drawable.p);
        }
        if(cch==2)
        {
            iv=(ImageView) findViewById(R.id.cimg);
            iv.setImageResource(R.drawable.s);
        }
        check(cch);
        TextView tv=(TextView)findViewById(R.id.hscore);
        tv.setText("Human:"+h);
        tv=(TextView)findViewById(R.id.cscore);
        tv.setText("Computer:"+c);
    }
    public void scissors(View view){
        hch=2;
        ImageView iv=(ImageView) findViewById(R.id.himg);
        iv.setImageResource(R.drawable.s);
        Random rand=new Random();
        int cch= rand.nextInt(3);
        if(cch==0)
        {
            iv=(ImageView) findViewById(R.id.cimg);
            iv.setImageResource(R.drawable.r);
        }
        if(cch==1)
        {
            iv=(ImageView) findViewById(R.id.cimg);
            iv.setImageResource(R.drawable.p);
        }
        if(cch==2)
        {
            iv=(ImageView) findViewById(R.id.cimg);
            iv.setImageResource(R.drawable.s);
        }
        check(cch);
        TextView tv=(TextView)findViewById(R.id.hscore);
        tv.setText("Human:"+h);
        tv=(TextView)findViewById(R.id.cscore);
        tv.setText("Computer:"+c);
    }
    public void display(String s)
    {
        TextView tv=(TextView) findViewById(R.id.dis);
        tv.setText(s);
    }
    public void check(int cch)
    {
        if((hch==0&&cch==2)||(hch==1&&cch==0)||(hch==2&&cch==1)){
            display("You WON");
            h++;
        }
        else if(hch==cch){
            display("Its a tie");
        }
        else{
            display("You Lose");
            c++;
        }
    }
}
