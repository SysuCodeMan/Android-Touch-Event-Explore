package com.example.chen.toucheventdemo;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.widget.Button;

/**
 * Created by Chen on 2017/4/18.
 */

public class MyButton extends Button {
    public static String TAG = "MyButton";
    public MyButton(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent event) {
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
        return super.dispatchTouchEvent(event);
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
//        return super.onTouchEvent(event);
//        return false;
        return true;
    }

}
