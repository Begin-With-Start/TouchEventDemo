package com.minifly.demo.touchevent.ViewEvent;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;

import com.minifly.demo.touchevent.R;
import com.minifly.demo.touchevent.tools.ConvertUtils;
import com.minifly.demo.touchevent.tools.LogUtils;

/**
 * author ：minifly
 * date: 2017/9/30
 * time: 11:40
 * desc:
 */
public class TouchEventView extends View {
    private Context mContext;
    private Paint mPaint;

    public TouchEventView(Context context) {
        super(context);
        this.mContext = context;
        init();
    }

    public TouchEventView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        this.mContext = context;
        init();
    }

    public TouchEventView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.mContext = context;
        init();
    }

    public void init(){
        mPaint = new Paint();
        mPaint.setStrokeWidth(ConvertUtils.dip2px(mContext,1));
        mPaint.setStyle(Paint.Style.FILL);
        mPaint.setColor(mContext.getResources().getColor(R.color.colorPrimary));

    }

    @Override
    protected void onDraw(Canvas canvas) {
        Rect rect = new Rect(0,0,ConvertUtils.dip2px(mContext,200),ConvertUtils.dip2px(mContext,200));

        canvas.drawRect(rect,mPaint);

    }


    /**
     * 事件
     * @param event
     * @return
     */
    @Override
    public boolean onTouchEvent(MotionEvent event) {

        LogUtils.showErrLog("TouchEventView------onTouchEvent");
        return false;
    }

    /**
     * 分发时间
     * @param event
     * @return
     */
    @Override
    public boolean dispatchTouchEvent(MotionEvent event) {
        LogUtils.showErrLog("TouchEventView------dispatchTouchEvent");
        return super.dispatchTouchEvent(event);
    }

    /**
     * 普通的view 没有 onInterceptTouchEvent 的时间拦截方法哈哈哈哈哈
     */
}
