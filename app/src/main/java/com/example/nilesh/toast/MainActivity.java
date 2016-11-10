package com.example.nilesh.toast;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button voilet=(Button)findViewById(R.id.voilet);
        Button indigo=(Button)findViewById(R.id.Indigo);
        Button blue=(Button)findViewById(R.id.Blue);
        Button green=(Button)findViewById(R.id.Green);
        Button yellow=(Button)findViewById(R.id.Yellow);
        Button orange=(Button)findViewById(R.id.Orange);
        Button red=(Button)findViewById(R.id.Red);



    }


    public void onclick(View v){
        int viewId=v.getId();

        switch (viewId){
            case R.id.voilet:
                Toast.makeText(this,"voilet",Toast.LENGTH_SHORT).show();

            case R.id.Indigo:
                Toast.makeText(this,"indigo",Toast.LENGTH_SHORT).show();

            case R.id.Blue:
                Toast.makeText(this,"Blue",Toast.LENGTH_SHORT).show();

            case R.id.Green:
                Toast.makeText(this,"Green" ,Toast.LENGTH_SHORT).show();

            case R.id.Yellow:
                Toast.makeText(this,"yellow",Toast.LENGTH_SHORT).show();

            case R.id.Orange:
                Toast.makeText(this,"orange",Toast.LENGTH_SHORT).show();

            case R.id.Red:
                Toast.makeText(this,"Red",Toast.LENGTH_SHORT).show();





        }}}
