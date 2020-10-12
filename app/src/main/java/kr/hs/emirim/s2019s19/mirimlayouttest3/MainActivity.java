package kr.hs.emirim.s2019s19.mirimlayouttest3;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);


        LinearLayout linear1 = new LinearLayout(this);
        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.MATCH_PARENT); //width, height

        linear1.setBackgroundColor(Color.rgb(118, 178, 252));
        linear1.setOrientation(LinearLayout.VERTICAL);

        Button btn = new Button(this);
        btn.setText("클릭해 보세요.");
        btn.setBackgroundColor(Color.rgb(35, 133, 152));
        btn.setTextColor(Color.WHITE);
        linear1.addView(btn);

        btn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

            }
        });

        setContentView(linear1, params);
    }
}