package com.sv.rishabhsinha.compressit;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.ImageButton;


public class MainActivity extends ActionBarActivity implements View.OnClickListener {

    ImageButton gallery,camera ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initialize();
    }

    private void initialize() {
        gallery = (ImageButton)findViewById(R.id.ibGallery);
        camera=(ImageButton)findViewById(R.id.ibCamera);
        gallery.setOnClickListener(this);
        camera.setOnClickListener(this);
    }

    @Override
    protected void onPause() {
        super.onPause();
        finish();
    }

    @Override
    public void onClick(View v) {
        Intent i ;
        if(v.getId()==camera.getId()){
            i=new Intent(MainActivity.this,CameraHome.class);
            startActivity(i);
        }
        else if(v.getId()==gallery.getId()){
            i=new Intent(MainActivity.this,CameraHome.class);
            startActivity(i);

        }

    }



}
