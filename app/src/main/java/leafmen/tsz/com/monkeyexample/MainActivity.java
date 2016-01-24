package leafmen.tsz.com.monkeyexample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        FrameLayout frameLayout = (FrameLayout) findViewById(R.id.fl_monkey);
        final MonkeyView monkeyView = new MonkeyView(this);
        monkeyView.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                monkeyView.bitmapX = event.getX();
                monkeyView.bitmapY = event.getY();
                monkeyView.invalidate();
                return true;
            }
        });
        frameLayout.addView(monkeyView);
    }
}
