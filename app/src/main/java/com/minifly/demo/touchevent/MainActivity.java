package com.minifly.demo.touchevent;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Toast;

import com.minifly.demo.touchevent.ViewEvent.ConstraintLayoutMy;
import com.minifly.demo.touchevent.ViewEvent.TouchEventView;
import com.minifly.demo.touchevent.tools.LogUtils;

public class MainActivity extends AppCompatActivity {

    private TouchEventView mEventDemoViewid;
    private ConstraintLayoutMy constraintLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        mEventDemoViewid = (TouchEventView) findViewById(R.id.event_demo_viewid);
        constraintLayout = (ConstraintLayoutMy) findViewById(R.id.event_demo_constraintlayoutid);

        mEventDemoViewid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this,"我被点击了",Toast.LENGTH_LONG).show();
                LogUtils.showErrLog("我还被点击了一下呢....view ");
            }
        });
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        LogUtils.showErrLog("MainActivity------onTouchEvent");
//        return false;
        return super.onTouchEvent(event);
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {

        LogUtils.showErrLog("MainActivity------dispatchTouchEvent");
        return super.dispatchTouchEvent(ev);
    }
}
