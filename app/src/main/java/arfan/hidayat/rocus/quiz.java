package arfan.hidayat.rocus;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.animation.LayoutTransition;
import android.annotation.SuppressLint;
import android.content.DialogInterface;
import android.os.Bundle;
import android.transition.AutoTransition;
import android.transition.TransitionManager;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Arrays;
import java.util.Collections;


public class quiz extends AppCompatActivity {


    private TextView pilihanA, pilihanB, pilihanC, pilihanD;
    private TextView soalnumber, soal, score;
    private TextView chechkout1, checkout2;
    int currentIndex;
    int mscore = 0;
    int qn = 1;
    ProgressBar progressBar;

    int Currentsoal, CurrentPilihanA, CurrentPilihanB, CurrentPilihanC, CurrentPilihanD;


    private answerclass[] soalBank = new answerclass[]
            {
                    new answerclass(R.string.soal_1, R.string.soal1_A, R.string.soal1_B, R.string.soal1_C, R.string.soal1_D, R.string.answer_1),
                    new answerclass(R.string.soal_2, R.string.soal_2A, R.string.soal_2B, R.string.soal_2C, R.string.soal_2D, R.string.answer_2),
                    new answerclass(R.string.soal_3, R.string.soal_3A, R.string.soal_3B, R.string.soal_3C, R.string.soal_3D, R.string.answer_3),
                    new answerclass(R.string.soal_4, R.string.soal_4A, R.string.soal_4B, R.string.soal_4C, R.string.soal_4D, R.string.answer_4),
                    new answerclass(R.string.soal_5, R.string.soal_5A, R.string.soal_5B, R.string.soal_5C, R.string.soal_5D, R.string.answer_5),
                    new answerclass(R.string.soal_6, R.string.soal_6A, R.string.soal_6B, R.string.soal_6C, R.string.soal_6D, R.string.answer_6),
                    new answerclass(R.string.soal_7, R.string.soal_7A, R.string.soal_7B, R.string.soal_7C, R.string.soal_7D, R.string.answer_7),
                    new answerclass(R.string.soal_8, R.string.soal_8A, R.string.soal_8B, R.string.soal_8C, R.string.soal_8D, R.string.answer_8),
                    new answerclass(R.string.soal_9, R.string.soal_9A, R.string.soal_9B, R.string.soal_9C, R.string.soal_9D, R.string.answer_9),
                    new answerclass(R.string.soal_10, R.string.soal_10A, R.string.soal_10B, R.string.soal_10C, R.string.soal_10D, R.string.answer_10),
                    new answerclass(R.string.soal_11, R.string.soal_11A, R.string.soal_11B, R.string.soal_11C, R.string.soal_11D, R.string.answer_11),
                    new answerclass(R.string.soal_12, R.string.soal_12A, R.string.soal_12B, R.string.soal_12C, R.string.soal_12D, R.string.answer_12),
                    new answerclass(R.string.soal_13, R.string.soal_13A, R.string.soal_13B, R.string.soal_13C, R.string.soal_13D, R.string.answer_13),
                    new answerclass(R.string.soal_14, R.string.soal_14A, R.string.soal_14B, R.string.soal_14C, R.string.soal_14D, R.string.answer_14),
                    new answerclass(R.string.soal_15, R.string.soal_15A, R.string.soal_15B, R.string.soal_15C, R.string.soal_15D, R.string.answer_15),
                    new answerclass(R.string.soal_16, R.string.soal_16A, R.string.soal_16B, R.string.soal_16C, R.string.soal_16D, R.string.answer_16),
                    new answerclass(R.string.soal_17, R.string.soal_17A, R.string.soal_17B, R.string.soal_17C, R.string.soal_17D, R.string.answer_17),
                    new answerclass(R.string.soal_18, R.string.soal_18A, R.string.soal_18B, R.string.soal_18C, R.string.soal_18D, R.string.answer_18),
                    new answerclass(R.string.soal_19, R.string.soal_19A, R.string.soal_19B, R.string.soal_19C, R.string.soal_19D, R.string.answer_19),
                    new answerclass(R.string.soal_20, R.string.soal_20A, R.string.soal_20B, R.string.soal_20C, R.string.soal_20D, R.string.answer_20),

            };

    final int PROGRESS_BAR = (int) Math.ceil(100 / soalBank.length);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);

        pilihanA = findViewById(R.id.pilihanA);
        pilihanB = findViewById(R.id.pilihanB);
        pilihanC = findViewById(R.id.pilihanC);
        pilihanD = findViewById(R.id.pilihanD);
        Collections.shuffle(Arrays.asList(soalBank));

        soal = findViewById(R.id.soal);
        score = findViewById(R.id.score);
        soalnumber = findViewById(R.id.SoalNumber);

        chechkout1 = findViewById(R.id.selectpilihan);
        checkout2 = findViewById(R.id.CorrectAnswer);
        progressBar = findViewById(R.id.progress_bar);

        Currentsoal = soalBank[currentIndex].getsoalid();
        soal.setText(Currentsoal);
        CurrentPilihanA = soalBank[currentIndex].getPilihanA();
        pilihanA.setText(CurrentPilihanA);
        CurrentPilihanB = soalBank[currentIndex].getPilihanB();
        pilihanB.setText(CurrentPilihanB);
        CurrentPilihanC = soalBank[currentIndex].getPilihanC();
        pilihanC.setText(CurrentPilihanC);
        CurrentPilihanD = soalBank[currentIndex].getPilihanD();
        pilihanD.setText(CurrentPilihanD);

        pilihanA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkAnswer(CurrentPilihanA);
                updatesoal();

            }
        });

        pilihanB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkAnswer(CurrentPilihanB);
                updatesoal();


            }
        });
        pilihanC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkAnswer(CurrentPilihanC);
                updatesoal();


            }
        });
        pilihanD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                checkAnswer(CurrentPilihanD);
                updatesoal();

            }
        });


    }

    private void checkAnswer(int userSelection) {

        int correctanswer = soalBank[currentIndex].getAnswerid();

        chechkout1.setText(userSelection);
        checkout2.setText(correctanswer);

        String m = chechkout1.getText().toString().trim();
        String n = checkout2.getText().toString().trim();

        if (m.equals(n)) {
            Toast.makeText(getApplicationContext(), "Benar", Toast.LENGTH_SHORT).show();
            mscore = mscore + 1;
        } else {
            Toast.makeText(getApplicationContext(), "Salah", Toast.LENGTH_SHORT).show();
        }


    }

    @SuppressLint("soalupdate")
    private void updatesoal() {

        currentIndex = (currentIndex + 1) % soalBank.length;

        if (currentIndex == 0) {

            AlertDialog.Builder alert = new AlertDialog.Builder(this);
            alert.setTitle("Selesai");
            alert.setCancelable(false);
            alert.setMessage("Nilai Kamu" +" "+ mscore +" "+ "Point");
            alert.setPositiveButton("Kembali ke menu", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    finish();
                }
            });

            alert.setNegativeButton("Ulangi", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    Collections.shuffle(Arrays.asList(soalBank));
                    mscore = 0;
                    qn = 1;
                    progressBar.setProgress(0);
                    score.setText("Score" + mscore + "/" + soalBank.length);
                    soalnumber.setText(qn + "/" + soalBank.length );
                }
            });

            alert.show();

        }


        Currentsoal = soalBank[currentIndex].getsoalid();
        soal.setText(Currentsoal);
        CurrentPilihanA = soalBank[currentIndex].getPilihanA();
        pilihanA.setText(CurrentPilihanA);
        CurrentPilihanB = soalBank[currentIndex].getPilihanB();
        pilihanB.setText(CurrentPilihanB);
        CurrentPilihanC = soalBank[currentIndex].getPilihanC();
        pilihanC.setText(CurrentPilihanC);
        CurrentPilihanD = soalBank[currentIndex].getPilihanD();
        pilihanD.setText(CurrentPilihanD);


        qn = qn + 1;


        if (qn <= soalBank.length) {
            soalnumber.setText(qn + "/" + soalBank.length);
        }
        score.setText("Score" + mscore + "/" + 20);
        progressBar.incrementProgressBy(PROGRESS_BAR);


    }
}