package com.minifly.demo.touchevent.ViewEvent;

import android.content.Context;
import android.support.constraint.ConstraintLayout;
import android.util.AttributeSet;
import android.view.MotionEvent;

import com.minifly.demo.touchevent.tools.LogUtils;

/**
 * author ：minifly
 * date: 2017/9/30
 * time: 14:03
 * desc:
 */
public class ConstraintLayoutMy extends ConstraintLayout {
    public ConstraintLayoutMy(Context context) {
        super(context);
    }

    public ConstraintLayoutMy(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public ConstraintLayoutMy(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        LogUtils.showErrLog("ConstraintLayoutMy------onTouchEvent");
        return super.onTouchEvent(event);
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {
        LogUtils.showErrLog("ConstraintLayoutMy------dispatchTouchEvent");
        return super.dispatchTouchEvent(ev);
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent ev) {
        LogUtils.showErrLog("ConstraintLayoutMy------onInterceptTouchEvent");
        return super.onInterceptTouchEvent(ev);
    }
}
