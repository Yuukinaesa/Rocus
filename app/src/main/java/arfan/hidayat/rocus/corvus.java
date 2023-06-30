package arfan.hidayat.rocus;

import androidx.appcompat.app.AppCompatActivity;

import android.animation.LayoutTransition;
import android.os.Bundle;
import android.transition.AutoTransition;
import android.transition.TransitionManager;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

public class corvus extends AppCompatActivity {
    TextView corvus1, corvus2, corvus3;
    LinearLayout corvus1_layout, corvus2_layout, corvus3_layout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_corvus);
        //corvus1
        corvus1 = findViewById(R.id.detailcorvus1);
        corvus1_layout = findViewById(R.id.corvus1_layout);
        corvus1_layout.getLayoutTransition().enableTransitionType(LayoutTransition.CHANGING);
        //corvus2
        corvus2 = findViewById(R.id.detailcorvus2);
        corvus2_layout = findViewById(R.id.corvus2_layout);
        corvus2_layout.getLayoutTransition().enableTransitionType(LayoutTransition.CHANGING);
        //corvus3
        corvus3 = findViewById(R.id.detailcorvus3);
        corvus3_layout = findViewById(R.id.corvus3_layout);
        corvus3_layout.getLayoutTransition().enableTransitionType(LayoutTransition.CHANGING);
    }
    //corvus1 function
    public void corvus1(View view){
        int v = (corvus1.getVisibility() == View.GONE)? View.VISIBLE : View.GONE;
        TransitionManager.beginDelayedTransition(corvus1_layout, new AutoTransition());
        corvus1.setVisibility(v);
    }
    //corvus2 function
    public void corvus2(View view){
        int v = (corvus2.getVisibility() == View.GONE)? View.VISIBLE : View.GONE;
        TransitionManager.beginDelayedTransition(corvus2_layout, new AutoTransition());
        corvus2.setVisibility(v);
    }
    //corvus3 function
    public void corvus3(View view){
        int v = (corvus3.getVisibility() == View.GONE)? View.VISIBLE : View.GONE;
        TransitionManager.beginDelayedTransition(corvus3_layout, new AutoTransition());
        corvus3.setVisibility(v);
    }
}