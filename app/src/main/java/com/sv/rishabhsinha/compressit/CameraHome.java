package com.sv.rishabhsinha.compressit;

import android.content.Intent;
import android.os.Bundle;
import android.provider.MediaStore;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

/**
 * Created by rishabh.sinha on 16-Jan-16.
 */
public class CameraHome extends ActionBarActivity implements View.OnClickListener {
     Button bLoad ;
    public static int cameraData=1234;
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
        switch(v.getId()){
            case R.id.bLoad:
                Intent inte = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivityForResult(inte,cameraData);

                break ;

        }
    }


    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode==cameraData&& resultCode==RESULT_OK){
            //Bundle extras = data.getExtras();
            //cambmp = (Bitmap)extras.get("data");
            //ivv.setImageBitmap(cambmp);
            Toast.makeText(this, "Inside activity", Toast.LENGTH_SHORT).show();
        }

    }
}
