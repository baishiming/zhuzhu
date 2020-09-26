package com.example.zhuzhu.customview;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.util.Log;
import android.widget.ProgressBar;

/**
 * @author bsm
 * @name zhuzhu
 * @class name：com.example.zhuzhu.customview
 * @class describe
 * @time 2020/9/25 22:20
 */
public class MyProgressBar extends ProgressBar {

    public MyProgressBar(Context context) {
        super(context);
    }

    public MyProgressBar(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public MyProgressBar(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public MyProgressBar(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }


    @Override
    protected synchronized void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Log.e("bsm","getProgress()=="+getProgress());


    }

}
