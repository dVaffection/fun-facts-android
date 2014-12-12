package com.example.dv.funfacts;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;


public class FunFactsActivity extends Activity {

    final public static String TAG = FunFactsActivity.class.getSimpleName();
    final private FactBook factBook = new FactBook();
    final private ColorWheel colorWheel = new ColorWheel();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fun_facts);


        final TextView textView = (TextView) findViewById(R.id.funFactTextView);
        final Button button = (Button) findViewById(R.id.funFactButton);
        final RelativeLayout layout = (RelativeLayout) findViewById(R.id.relativeLayout);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int color = Color.parseColor(colorWheel.getRandomColor());
                layout.setBackgroundColor(color);
                button.setTextColor(color);

                String fact = factBook.getRandomFact();
                textView.setText(fact);
            }
        });

        String message = "Yay! Out activity was created!";
        Toast.makeText(this, message, Toast.LENGTH_LONG).show();
        Log.d(TAG, message);
    }

}
