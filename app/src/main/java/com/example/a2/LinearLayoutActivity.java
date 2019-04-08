package com.example.a2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.LinearLayout;

public class LinearLayoutActivity extends AppCompatActivity {
    //绑定控件对象
//    private Button horizontalButton, verticalButton, alignLeftButton;
    private LinearLayout linear;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linearlayout);

        linear = (LinearLayout) findViewById(R.id.linear);

//        horizontalButton = (Button) findViewById(R.id.horizontalbutton);
//        verticalButton = (Button) findViewById(R.id.verticalbutton);
//        alignLeftButton = (Button) findViewById(R.id.alignLeftbutton);
    }

    public void horizontalButtonTapped(View view) {
        linear.setOrientation(LinearLayout.HORIZONTAL);
    }

    public void verticalButtonTapped(View view) {
        linear.setOrientation(LinearLayout.VERTICAL);
    }

    public void alignLeftButtonTapped(View view) {
        linear.setOrientation(LinearLayout.VERTICAL);
        linear.setGravity(Gravity.LEFT | Gravity.CENTER);
    }

    public void dismiss(View view) {
        finish();
    }
}
