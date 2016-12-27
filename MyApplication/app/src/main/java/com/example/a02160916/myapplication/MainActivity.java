package com.example.a02160916.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView ansview=(TextView) findViewById(R.id.ansview);
        Button m1=(Button)findViewById(R.id.m1);
        Button m2=(Button)findViewById(R.id.m2);
        Button m3=(Button)findViewById(R.id.m3);
        Button m4=(Button)findViewById(R.id.m4);
        Button m5=(Button)findViewById(R.id.m5);
        Button m6=(Button)findViewById(R.id.m6);
        Button m7=(Button)findViewById(R.id.m7);
        Button m8=(Button)findViewById(R.id.m8);
        Button m9=(Button)findViewById(R.id.m9);
        Button m0=(Button)findViewById(R.id.m0);
        Button plus=(Button)findViewById(R.id.plus);
        Button minus=(Button)findViewById(R.id.minus);
        Button times=(Button)findViewById(R.id.times);
        Button divide=(Button)findViewById(R.id.divide);
        Button ans=(Button)findViewById(R.id.ans);
        Button undo=(Button)findViewById(R.id.undo);

        final double[] x = new double[100];//nudo
        final double[] abc = new double[3];
        final int[] lx = {1000};//x位置
        final boolean[] y = {true};//ansview是否為0
        final int[] h = {0};//運算子
        final boolean[] v = {true};//是否清空螢幕

        undo.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                ansview.setText(String.valueOf(x[--lx[0]%100]));
                if(Double.parseDouble(String.valueOf(ansview.getText()))==0)y[0]=true;
            }
        });

        m1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                if(y[0]||v[0]){
                    ansview.setText("1.0");
                    x[lx[0]%100] = Double.parseDouble(String.valueOf(ansview.getText()));
                    //System.out.println(x[lx[0]%100]);System.out.println(ansview.getText());
                    y[0] = false;v[0] = false;
                }
                else {
                    x[lx[0]%100] = Double.parseDouble(String.valueOf(ansview.getText()));
                    ansview.setText((int)x[lx[0]%100] + "1.0");
                    x[++lx[0]%100] = Double.parseDouble(String.valueOf(ansview.getText()));
                    //System.out.println(x[lx[0]%100]);System.out.println(ansview.getText());

                    //System.out.println(x[lx[0]%100]);System.out.println(ansview.getText());
                }
            }
        });
        m2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                if(y[0]||v[0]){
                    ansview.setText("2.0");
                    x[lx[0]%100] = Double.parseDouble(String.valueOf(ansview.getText()));
                    System.out.println(x[lx[0]%100]);System.out.println(ansview.getText());
                    y[0] = false;v[0] = false;
                }
                else {
                    x[lx[0]%100] = Double.parseDouble(String.valueOf(ansview.getText()));
                    ansview.setText((int)x[lx[0]%100] + "2.0");
                    x[++lx[0]%100] = Double.parseDouble(String.valueOf(ansview.getText()));
                }
            }
        });
        m3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                if(y[0]||v[0]){
                    ansview.setText("3.0");
                    x[lx[0]%100] = Double.parseDouble(String.valueOf(ansview.getText()));
                    y[0] = false;v[0] = false;
                }
                else {
                    x[lx[0]%100] = Double.parseDouble(String.valueOf(ansview.getText()));
                    ansview.setText((int)x[lx[0]%100] + "3.0");
                    x[++lx[0]%100] = Double.parseDouble(String.valueOf(ansview.getText()));
                }
            }
        });
        m4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                if(y[0]||v[0]){
                    ansview.setText("4.0");
                    x[lx[0]%100] = Double.parseDouble(String.valueOf(ansview.getText()));
                    y[0] = false;v[0] = false;
                }
                else {
                    x[lx[0]%100] = Double.parseDouble(String.valueOf(ansview.getText()));
                    ansview.setText((int)x[lx[0]%100] + "4.0");
                    x[++lx[0]%100] = Double.parseDouble(String.valueOf(ansview.getText()));
                }
            }
        });
        m5.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                if(y[0]||v[0]){
                    ansview.setText("5.0");
                    x[lx[0]%100] = Double.parseDouble(String.valueOf(ansview.getText()));
                    y[0] = false;v[0] = false;
                }
                else {
                    x[lx[0]%100] = Double.parseDouble(String.valueOf(ansview.getText()));
                    ansview.setText((int)x[lx[0]%100] + "5.0");
                    x[++lx[0]%100] = Double.parseDouble(String.valueOf(ansview.getText()));

                }
            }
        });
        m6.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                if(y[0]||v[0]){
                    ansview.setText("6.0");
                    x[lx[0]%100] = Double.parseDouble(String.valueOf(ansview.getText()));
                    y[0] = false;v[0] = false;
                }
                else {
                    x[lx[0]%100] = Double.parseDouble(String.valueOf(ansview.getText()));
                    ansview.setText((int)x[lx[0]%100] + "6.0");
                    x[++lx[0]%100] = Double.parseDouble(String.valueOf(ansview.getText()));

                }
            }
        });
        m7.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                if(y[0]||v[0]){
                    ansview.setText("7.0");
                    x[lx[0]%100] = Double.parseDouble(String.valueOf(ansview.getText()));
                    y[0] = false;v[0] = false;
                }
                else {
                    x[lx[0]%100] = Double.parseDouble(String.valueOf(ansview.getText()));
                    ansview.setText((int)x[lx[0]%100] + "7.0");
                    x[++lx[0]%100] = Double.parseDouble(String.valueOf(ansview.getText()));
                }
            }
        });
        m8.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                if(y[0]||v[0]){
                    ansview.setText("8.0");
                    x[lx[0]%100] = Double.parseDouble(String.valueOf(ansview.getText()));
                    y[0] = false;v[0] = false;
                }
                else {
                    x[lx[0]%100] = Double.parseDouble(String.valueOf(ansview.getText()));
                    ansview.setText((int)x[lx[0]%100] + "8.0");
                    x[++lx[0]%100] = Double.parseDouble(String.valueOf(ansview.getText()));
                }
            }
        });
        m9.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                if(y[0]||v[0]){
                    ansview.setText("9.0");
                    x[lx[0]%100] = Double.parseDouble(String.valueOf(ansview.getText()));
                    y[0] = false;v[0] = false;
                }
                else {
                    x[lx[0]%100] = Double.parseDouble(String.valueOf(ansview.getText()));
                    ansview.setText((int)x[lx[0]%100] + "9.0");
                    x[++lx[0]%100] = Double.parseDouble(String.valueOf(ansview.getText()));
                }
            }
        });
        m0.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                if(!y[0]){
                    x[lx[0]%100] = Double.parseDouble(String.valueOf(ansview.getText()));
                    ansview.setText((int)x[lx[0]%100] + "0.0");
                    x[++lx[0]%100] = Double.parseDouble(String.valueOf(ansview.getText()));
                }
            }
        });

        plus.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                h[0] =1;
                y[0] = true;
                abc[0]=x[lx[0]%100];
                System.out.println("+");System.out.println(abc[0]);
            }
        });
        minus.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                h[0] =2;
                y[0] = true;
                abc[0]=x[lx[0]%100];
                System.out.println("-");System.out.println(abc[0]);
            }
        });
        times.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                h[0] =3;
                y[0] = true;
                abc[0]=x[lx[0]%100];
                System.out.println("*");System.out.println(abc[0]);
            }
        });
        divide.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                h[0] =4;
                y[0] = true;
                abc[0]=x[lx[0]%100];
                System.out.println("/");System.out.println(abc[0]);
            }
        });

        ans.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                int g=lx[0];
                double a;
                switch (h[0]){
                    case 1 :
                        abc[1]=Double.parseDouble(String.valueOf(ansview.getText()));
                        System.out.println(abc[1]);
                        abc[2]=abc[0]+abc[1];
                        x[++lx[0]%100]=abc[2];
                        ansview.setText(String.valueOf(abc[2]));
                        v[0]=true;
                        System.out.println(abc[0]);System.out.println(abc[1]);System.out.println(abc[2]);
                        //ansview.setText(String.valueOf(x[lx[0]]%100));
                        break;
                    case 2 :
                        abc[1]=Double.parseDouble(String.valueOf(ansview.getText()));
                        System.out.println(abc[1]);
                        abc[2]=abc[0]-abc[1];
                        x[++lx[0]%100]=abc[2];
                        ansview.setText(String.valueOf(abc[2]));
                        v[0]=true;
                        System.out.println(abc[0]);System.out.println(abc[1]);System.out.println(abc[2]);
                        break;
                    case 3 :
                        abc[1]=Double.parseDouble(String.valueOf(ansview.getText()));
                        System.out.println(abc[1]);
                        abc[2]=abc[0]*abc[1];
                        x[++lx[0]%100]=abc[2];
                        ansview.setText(String.valueOf(abc[2]));
                        v[0]=true;
                        System.out.println(abc[0]);System.out.println(abc[1]);System.out.println(abc[2]);
                        break;
                    case 4 :
                        abc[1]=Double.parseDouble(String.valueOf(ansview.getText()));
                        System.out.println(abc[1]);
                        abc[2]=abc[0]/abc[1];
                        x[++lx[0]%100]=abc[2];
                        ansview.setText(String.valueOf(abc[2]));
                        v[0]=true;
                        System.out.println(abc[0]);System.out.println(abc[1]);System.out.println(abc[2]);
                        break;
                }
            }
        });
    }
}
