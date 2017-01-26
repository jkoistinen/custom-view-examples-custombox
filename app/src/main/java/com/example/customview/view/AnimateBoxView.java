package com.example.customview.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Toast;

/**
 * Created by jk on 2017-01-26.
 */

public class AnimateBoxView extends View {

    public AnimateBoxView(Context context) {
        super(context);
    }

    public AnimateBoxView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public AnimateBoxView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

    @Override
    public boolean performClick() {

        toggleAlphaChannel(this);
        invalidate();
        return super.performClick();
    }

    public void toggleAlphaChannel(View v){
        if(v.getAlpha() == 1.0f) {
            v.setAlpha(0.0f);
        } else {
            v.setAlpha(1.0f);
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        if(event.getAction() == MotionEvent.ACTION_UP){
            performClick();
        }
        return true;
    }



}
