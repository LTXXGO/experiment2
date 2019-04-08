package com.example.a2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class RelativeLayoutActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_relativelayout);
    }

    public void firstButtonTapped(View view) {}

    public void secondButtonTapped(View view) {}

    public void thirdButtonTapped(View view) {}

    public void fourthButtonTapped(View view) {}

    public void dismiss(View view) {
        finish();
    }
}
