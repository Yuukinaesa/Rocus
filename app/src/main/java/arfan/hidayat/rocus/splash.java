package arfan.hidayat.rocus;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class splash extends AppCompatActivity {

    android.media.MediaPlayer mysong;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        mysong = android.media.MediaPlayer.create(splash.this, R.raw.welcome);
        mysong.start();
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i = new Intent(splash.this, mainmenu.class);
                startActivity(i);
                finish();
            }
        }, 4000);
    }

    @Override
    protected void onPause() {
        super.onPause();
        mysong.release();
        finish();
    }
}