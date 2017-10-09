package com.minifly.demo.touchevent.ViewEvent;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.LinearLayout;

import com.minifly.demo.touchevent.tools.LogUtils;

import static android.view.View.MeasureSpec.EXACTLY;

/**
 * author ：minifly
 * date: 2017/9/30
 * time: 14:11
 * desc:
 */
public class ViewGroupMine extends LinearLayout {
    public ViewGroupMine(Context context) {
        super(context);
    }

    public ViewGroupMine(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public ViewGroupMine(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onLayout(boolean arg0, int arg1, int arg2, int arg3, int arg4) {
        int childCount = this.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View child = this.getChildAt(i);
            LayoutParams lParams = (LayoutParams) child.getLayoutParams();
            child.layout(lParams.leftMargin,lParams.topMargin,lParams.rightMargin,lParams.bottomMargin);
        }
    }

    @Override
    public void setLayoutMode(int layoutMode) {
        super.setLayoutMode(EXACTLY);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        LogUtils.showErrLog("ViewGroupMine------onTouchEvent");
        return super.onTouchEvent(event);
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent ev) {
        LogUtils.showErrLog("ViewGroupMine------onInterceptTouchEvent");
        return super.onInterceptTouchEvent(ev);
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {
        LogUtils.showErrLog("ViewGroupMine------dispatchTouchEvent");
        return super.dispatchTouchEvent(ev);
    }

    @Override
    public LayoutParams generateLayoutParams(AttributeSet attrs)
    {
        return new LayoutParams(getContext(), attrs);
    }
}
