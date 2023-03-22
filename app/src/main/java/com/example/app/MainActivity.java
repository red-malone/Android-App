package com.example.app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.ToggleButton;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {

    ToggleButton btn;
    VideoView vv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn=findViewById(R.id.toggleButton);
        TextView txt=findViewById(R.id.txtmain);
        vv=findViewById(R.id.videoView);
        txt.setVisibility(View.VISIBLE);
        vv.setVisibility(View.GONE);
        btn.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    vv.setVisibility(View.VISIBLE);
                    vv.setVideoPath("android.resource://"+getPackageName()+"/"+R.raw.vid2trim);
                    vv.start();
                    txt.setVisibility(View.GONE);
                }
                else
                {
                    vv.stopPlayback();
                    vv.setVisibility(View.GONE);
                    txt.setVisibility(View.VISIBLE);
                    txt.setText("Hello World");
                }
            }
        });
    }




}