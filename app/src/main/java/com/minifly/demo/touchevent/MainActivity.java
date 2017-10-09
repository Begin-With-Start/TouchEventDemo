package com.minifly.demo.touchevent;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.minifly.demo.touchevent.ViewEvent.ConstraintLayoutMy;
import com.minifly.demo.touchevent.ViewEvent.TouchEventView;

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

    }
}
