package com.example.chen.toucheventdemo;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.widget.RelativeLayout;

/**
 * Created by Chen on 2017/4/19.
 */

public class MyRelativeLayout extends RelativeLayout {
    public final static String TAG = "MyRelativeLayout";
    public MyRelativeLayout(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {
        switch (ev.getAction()) {
            case MotionEvent.ACTION_DOWN:
                Log.e(TAG, "MyRelativeLayout action_down dispatch");
                break;
            case MotionEvent.ACTION_UP:
                Log.e(TAG, "MyRelativeLayout action_up dispatch");
                break;
        }
        return super.dispatchTouchEvent(ev);
//        return true;
//        return false;
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        switch (event.getAction()) {
            case MotionEvent.ACTION_DOWN:
                Log.e(TAG, "MyRelativeLayout action_down consume");
                break;
            case MotionEvent.ACTION_UP:
                Log.e(TAG, "MyRelativeLayout action_up consume");
                break;
        }
        return super.onTouchEvent(event);
//        return true;
//        return false;
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent ev) {
        switch (ev.getAction()) {
            case MotionEvent.ACTION_DOWN:
                Log.e(TAG, "MyRelativeLayout action_down Intercept");
                break;
            case MotionEvent.ACTION_UP:
                Log.e(TAG, "MyRelativeLayout action_up Intercept");
                break;
        }
//        return true;
//        return false;
        return super.onInterceptTouchEvent(ev);
    }
}
