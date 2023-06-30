package arfan.hidayat.rocus;

import androidx.appcompat.app.AppCompatActivity;

import android.animation.LayoutTransition;
import android.os.Bundle;
import android.transition.AutoTransition;
import android.transition.TransitionManager;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

public class pixel extends AppCompatActivity {
    TextView pixel1, pixel2, pixel3;
    LinearLayout pixel1_layout, pixel2_layout, pixel3_layout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pixel);
        //pixel1
        pixel1 = findViewById(R.id.detailpixel1);
        pixel1_layout = findViewById(R.id.pixel1_layout);
        pixel1_layout.getLayoutTransition().enableTransitionType(LayoutTransition.CHANGING);
        //pixel2
        pixel2 = findViewById(R.id.detailpixel2);
        pixel2_layout = findViewById(R.id.pixel2_layout);
        pixel2_layout.getLayoutTransition().enableTransitionType(LayoutTransition.CHANGING);
        //pixel3
        pixel3 = findViewById(R.id.detailpixel3);
        pixel3_layout = findViewById(R.id.pixel3_layout);
        pixel3_layout.getLayoutTransition().enableTransitionType(LayoutTransition.CHANGING);
    }
    //pixel1 function
    public void pixel1(View view){
        int v = (pixel1.getVisibility() == View.GONE)? View.VISIBLE : View.GONE;
        TransitionManager.beginDelayedTransition(pixel1_layout);
        pixel1.setVisibility(v);
    }

    //pixel2 function
    public void pixel2(View view){
        int v = (pixel2.getVisibility() == View.GONE)? View.VISIBLE : View.GONE;
        TransitionManager.beginDelayedTransition(pixel2_layout);
        pixel2.setVisibility(v);
    }

    //pixel3 function
    public void pixel3(View view){
        int v = (pixel3.getVisibility() == View.GONE)? View.VISIBLE : View.GONE;
        TransitionManager.beginDelayedTransition(pixel3_layout);
        pixel3.setVisibility(v);
    }

}