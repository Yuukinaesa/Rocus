package arfan.hidayat.rocus;

import androidx.appcompat.app.AppCompatActivity;
import android.animation.LayoutTransition;
import android.os.Bundle;
import android.transition.AutoTransition;
import android.transition.TransitionManager;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;


public class penjelasan extends AppCompatActivity {
    TextView penjelasan1, penjelasan2, penjelasan3, penjelasan4, penjelasan5, penjelasan6, penjelasan7, penjelasan8;
    LinearLayout penjelasan1_layout, penjelasan2_layout, penjelasan3_layout, penjelasan4_layout,penjelasan5_layout, penjelasan6_layout, penjelasan7_layout, penjelasan8_layout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_penjelasan);

        //penjelasan1
        penjelasan1 = findViewById(R.id.detailpenjelasan1);
        penjelasan1_layout = findViewById(R.id.penjelasan1_layout);
        penjelasan1_layout.getLayoutTransition().enableTransitionType(LayoutTransition.CHANGING);
        //penjelasan2
        penjelasan2 = findViewById(R.id.detailpenjelasan2);
        penjelasan2_layout = findViewById(R.id.penjelasan2_layout);
        penjelasan2_layout.getLayoutTransition().enableTransitionType(LayoutTransition.CHANGING);
        //penjelasan3
        penjelasan3 = findViewById(R.id.detailpenjelasan3);
        penjelasan3_layout = findViewById(R.id.penjelasan3_layout);
        penjelasan3_layout.getLayoutTransition().enableTransitionType(LayoutTransition.CHANGING);
        //penjelasan4
        penjelasan4 = findViewById(R.id.detailpenjelasan4);
        penjelasan4_layout = findViewById(R.id.penjelasan4_layout);
        penjelasan4_layout.getLayoutTransition().enableTransitionType(LayoutTransition.CHANGING);
        //penjelasan5
        penjelasan5 = findViewById(R.id.detailpenjelasan5);
        penjelasan5_layout = findViewById(R.id.penjelasan5_layout);
        penjelasan5_layout.getLayoutTransition().enableTransitionType(LayoutTransition.CHANGING);
        //penjelasan6
        penjelasan6 = findViewById(R.id.detailpenjelasan6);
        penjelasan6_layout = findViewById(R.id.penjelasan6_layout);
        penjelasan6_layout.getLayoutTransition().enableTransitionType(LayoutTransition.CHANGING);
        //penjelasan7
        penjelasan7 = findViewById(R.id.detailpenjelasan7);
        penjelasan7_layout = findViewById(R.id.penjelasan7_layout);
        penjelasan7_layout.getLayoutTransition().enableTransitionType(LayoutTransition.CHANGING);
        //penjelasan8
        penjelasan8 = findViewById(R.id.detailpenjelasan8);
        penjelasan8_layout = findViewById(R.id.penjelasan8_layout);
        penjelasan8_layout.getLayoutTransition().enableTransitionType(LayoutTransition.CHANGING);
    }
    //penjelasan1 function
    public void penjelasan1(View view){
        int v = (penjelasan1.getVisibility() == View.GONE)? View.VISIBLE: View.GONE;
        TransitionManager.beginDelayedTransition(penjelasan1_layout, new AutoTransition());
        penjelasan1.setVisibility(v);
    }
    //penjelasan2 function
    public void penjelasan2(View view) {
        int v = (penjelasan2.getVisibility() == View.GONE)? View.VISIBLE: View.GONE;
        TransitionManager.beginDelayedTransition(penjelasan2_layout, new AutoTransition());
        penjelasan2.setVisibility(v);
    }
    //penjelasan3 function
    public void penjelasan3(View view){
        int v = (penjelasan3.getVisibility() == View.GONE)? View.VISIBLE: View.GONE;
        TransitionManager.beginDelayedTransition(penjelasan3_layout, new AutoTransition());
        penjelasan3.setVisibility(v);
    }
    //penjelasan4 function
    public void penjelasan4(View view){
        int v = (penjelasan4.getVisibility() == View.GONE)? View.VISIBLE: View.GONE;
        TransitionManager.beginDelayedTransition(penjelasan4_layout, new AutoTransition());
        penjelasan4.setVisibility(v);
    }
    //penjelasan5 function
    public void penjelasan5(View view){
        int v = (penjelasan5.getVisibility() == View.GONE)? View.VISIBLE: View.GONE;
        TransitionManager.beginDelayedTransition(penjelasan5_layout, new AutoTransition());
        penjelasan5.setVisibility(v);
    }
    //penjelasan6 function
    public void penjelasan6(View view){
        int v = (penjelasan6.getVisibility() == View.GONE)? View.VISIBLE: View.GONE;
        TransitionManager.beginDelayedTransition(penjelasan6_layout, new AutoTransition());
        penjelasan6.setVisibility(v);
    }
    //penjelasan7 function
    public void penjelasan7(View view){
        int v = (penjelasan7.getVisibility() == View.GONE)? View.VISIBLE: View.GONE;
        TransitionManager.beginDelayedTransition(penjelasan7_layout, new AutoTransition());
        penjelasan7.setVisibility(v);
    }
    //penjelasan8 function
    public void penjelasan8(View view){
        int v = (penjelasan8.getVisibility() == View.GONE)? View.VISIBLE: View.GONE;
        TransitionManager.beginDelayedTransition(penjelasan8_layout, new AutoTransition());
        penjelasan8.setVisibility(v);
    }
}