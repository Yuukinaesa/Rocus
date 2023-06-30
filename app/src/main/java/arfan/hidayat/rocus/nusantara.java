package arfan.hidayat.rocus;

import androidx.appcompat.app.AppCompatActivity;
import android.animation.LayoutTransition;
import android.os.Bundle;
import android.transition.AutoTransition;
import android.transition.TransitionManager;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

public class nusantara extends AppCompatActivity {
    TextView nusantara1, nusantara2, nusantara3;
    LinearLayout nusantara1_layout, nusantara2_layout, nusantara3_layout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nusantara);
        //nusantara1
        nusantara1 = findViewById(R.id.detailnusantara1);
        nusantara1_layout = findViewById(R.id.nusantara1_layout);
        nusantara1_layout.getLayoutTransition().enableTransitionType(LayoutTransition.CHANGING);
        //nusantara2
        nusantara2 = findViewById(R.id.detailnusantara2);
        nusantara2_layout = findViewById(R.id.nusantara2_layout);
        nusantara2_layout.getLayoutTransition().enableTransitionType(LayoutTransition.CHANGING);

        //nusantara3
        nusantara3 = findViewById(R.id.detailnusantara3);
        nusantara3_layout = findViewById(R.id.nusantara3_layout);
        nusantara3_layout.getLayoutTransition().enableTransitionType(LayoutTransition.CHANGING);
    }
    //nusantara1 function
    public void nusantara1(View view) {
        int v = (nusantara1.getVisibility() == View.GONE)? View.VISIBLE : View.GONE;
        TransitionManager.beginDelayedTransition(nusantara1_layout, new AutoTransition());
        nusantara1.setVisibility(v);
    }
    //nusantara2 function
    public void nusantara2(View view) {
        int v = (nusantara2.getVisibility() == View.GONE)? View.VISIBLE : View.GONE;
        TransitionManager.beginDelayedTransition(nusantara2_layout, new AutoTransition());
        nusantara2.setVisibility(v);
    }

    //nusantara3 function
    public void nusantara3(View view) {
        int v = (nusantara3.getVisibility() == View.GONE)? View.VISIBLE : View.GONE;
        TransitionManager.beginDelayedTransition(nusantara3_layout, new AutoTransition());
        nusantara3.setVisibility(v);
    }
}