package br.com.carinatiemiyoshida.basicphrases;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void buttonTapped(View view){

        int id = view.getId();
        String ourId = "";
        ourId = view.getResources().getResourceEntryName(id);
        int resourceId = getResources().getIdentifier(ourId, "raw", "br.com.carinatiemiyoshida.basicphrases");
        MediaPlayer mPlayer = MediaPlayer.create(this, resourceId);
        mPlayer.start();
        Log.e("buttonTapped: ", ourId);
        Log.i("buttonTapped:", ourId);
    }
}
