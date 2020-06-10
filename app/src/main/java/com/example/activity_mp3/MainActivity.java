package com.example.activity_mp3;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public MediaPlayer player=new MediaPlayer();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        player = MediaPlayer.create(getApplicationContext(),R.raw.soy_yo_2020);


    }

    


    public void bt1(View view) { //when click btn 開始播音樂
        player.setLooping(true);
        player.start();
        onStart();
}


    public void bt2(View view) {  //when click btn 暫停音樂
        player.pause();
        onPause();
    }

    public void bt3(View view) {  //when click btn 結束
      player.release();
      finish();
    }

    @Override
    protected void onStart() {

        Log.v("brad","onstart");
        Toast.makeText(getApplicationContext(),"onstart",Toast.LENGTH_SHORT).show();

        super.onStart();

    }

    @Override
    protected void onResume() {

        Log.v("brad","onresume");
        Toast.makeText(getApplicationContext(),"onresume",Toast.LENGTH_SHORT).show();
        super.onResume();

    }
    @Override
    protected void onRestart() {

        Log.v("brad","onrestart");
        Toast.makeText(getApplicationContext(),"onrestart",Toast.LENGTH_SHORT).show();
        super.onRestart();
    }


    @Override
    protected void onPause() {

        Log.v("brad","onpause");
        Toast.makeText(getApplicationContext(),"onpause",Toast.LENGTH_SHORT).show();
        super.onPause();
    }


    @Override
    protected void onStop() {

        Log.v("brad","onstop");
        Toast.makeText(getApplicationContext(),"onstop",Toast.LENGTH_SHORT).show();
        super.onStop();
    }

    @Override
    protected void onDestroy() {

        Log.v("brad","ondestroy");
        Toast.makeText(getApplicationContext(),"onDestroy",Toast.LENGTH_SHORT).show();
        super.onDestroy();
    }



}










