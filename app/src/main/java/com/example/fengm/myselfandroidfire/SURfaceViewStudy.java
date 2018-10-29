package com.example.fengm.myselfandroidfire;

import android.content.Context;
import android.util.AttributeSet;
import android.view.SurfaceHolder;
import android.view.SurfaceView;

/**
 * Created by fengm on 2018/7/6.
 * surfaceHolder可以控制surface的大小,格式,可以监控或者改变surfaceview
 */

public class SURfaceViewStudy extends SurfaceView implements SurfaceHolder.Callback,Runnable{
    public SURfaceViewStudy(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    /**
     * surface 创建
     * @param holder
     */
    @Override
    public void surfaceCreated(SurfaceHolder holder) {

    }

    /**
     * surface改变
     * @param holder
     * @param format
     * @param width
     * @param height
     */
    @Override
    public void surfaceChanged(SurfaceHolder holder, int format, int width, int height) {

    }

    /**
     * surface销毁
     * @param holder
     */
    @Override
    public void surfaceDestroyed(SurfaceHolder holder) {

    }

    @Override
    public void run() {

    }
}
