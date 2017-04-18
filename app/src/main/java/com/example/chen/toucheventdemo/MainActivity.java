package com.example.chen.toucheventdemo;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.LinearLayout;

/**
 * Created by Chen on 2017/4/18.
 */

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    final static String TAG = "MainActivity";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        setContentView(R.layout.activity_main);
        super.onCreate(savedInstanceState);
        findViewById(R.id.test_button).setOnClickListener(this);
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {
        switch (ev.getAction()) {
            case MotionEvent.ACTION_DOWN:
                Log.e(TAG, "dispatch action_down event");
                break;
            case MotionEvent.ACTION_MOVE:
                Log.e(TAG, "dispatch action_move event");
                break;
            case MotionEvent.ACTION_UP:
                Log.e(TAG, "dispatch action_up event");
                break;
        }
        return super.dispatchTouchEvent(ev);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        switch (event.getAction()) {
            case MotionEvent.ACTION_DOWN:
                Log.e(TAG, "onConsume action_down event");
                break;
            case MotionEvent.ACTION_MOVE:
                Log.e(TAG, "onConsume action_move event");
                break;
            case MotionEvent.ACTION_UP:
                Log.e(TAG, "onConsume action_up event");
                break;
        }
        return super.onTouchEvent(event);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.test_button:
                Log.e(TAG, "MyButton Click");
        }
    }
}
