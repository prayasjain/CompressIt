package com.sv.rishabhsinha.compressit;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by rishabh.sinha on 16-Jan-16.
 */
public class Gallery extends ActionBarActivity implements View.OnClickListener {

    Button bLoad ;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.loadimage);
        initialize();
    }

    private void initialize() {

        bLoad=(Button)findViewById(R.id.bLoad);
        bLoad.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v.getId()==bLoad.getId()){

        }
    }

    public void loadImagefromGallery(View view) {
        // Create intent to Open Image applications like Gallery, Google Photos
        Intent galleryIntent = new Intent(Intent.ACTION_PICK,
                android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
        // Start the Intent
        startActivityForResult(galleryIntent, RESULT_LOAD_IMG);
    }
}
