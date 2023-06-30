package arfan.hidayat.rocus;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.ImageButton;

public class mainmenu extends AppCompatActivity {
    ImageButton klik;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //button penjelasan
        klik =(ImageButton)findViewById(R.id.btn_penjelasan);
        klik.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent klikk = new Intent(mainmenu.this, penjelasan.class);
                startActivity(klikk);
            }
        });

        //button nusantara
        klik =(ImageButton)findViewById(R.id.btn_nusantara);
        klik.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent klikk = new Intent(mainmenu.this, nusantara.class);
                startActivity(klikk);
            }
        });

        //button pixel
        klik =(ImageButton)findViewById(R.id.btn_pixel);
        klik.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent klikk = new Intent(mainmenu.this, pixel.class);
                startActivity(klikk);
            }
        });

        //button corvus
        klik =(ImageButton)findViewById(R.id.btn_corvus);
        klik.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent klikk = new Intent(mainmenu.this, corvus.class);
                startActivity(klikk);
            }
        });

        //button quiz
        klik =(ImageButton)findViewById(R.id.btn_quiz);
        klik.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent klikk = new Intent(mainmenu.this, quiz.class);
                startActivity(klikk);
            }
        });
        //button video
        klik =(ImageButton)findViewById(R.id.btn_video);
        klik.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent klikk = new Intent(mainmenu.this, video.class);
                startActivity(klikk);
            }
        });
        //button tentang
        klik =(ImageButton)findViewById(R.id.btn_tentang);
        klik.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent klikk = new Intent(mainmenu.this, tentang.class);
                startActivity(klikk);
            }
        });
    }

    @Override
    public void onBackPressed() {
        new AlertDialog.Builder(this)
                .setMessage("Keluar aplikasi ?")
                .setCancelable(false)
                .setPositiveButton("Ya", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        finish();
                    }
                })
                .setNegativeButton("Tidak", null)
                .show();
    }
}