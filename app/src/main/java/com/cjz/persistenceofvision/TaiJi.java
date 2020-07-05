package com.cjz.persistenceofvision;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.util.AttributeSet;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;

/**
 * @Author: ChenJingZhuo
 * @Date: 2020-07-05 08:49
 * @Version 1.0
 */
public class TaiJi extends AppCompatImageView {

    private ObjectAnimator animator;
    //private Handler handler = new Handler();

    public TaiJi(Context context) {
        super(context);
    }

    public TaiJi(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        this.setImageResource(R.drawable.taiji);
        this.setScaleType(ScaleType.FIT_CENTER);
    }

    /*private Runnable run = new Runnable() {
        @Override
        public void run() {
            this
            //TaiJi.this.setDur
        }
    };*/

    public void setDuration(int values){
        animator = new ObjectAnimator();
        animator.setTarget(this);
        animator.setPropertyName("rotation");
        animator.setFloatValues(0, 360);
        animator.setRepeatCount(-1);
        // 十形
        animator.setDuration(values);
        // 八卦
        //animator.setDuration(5);
        // 六合
        //animator.setDuration(4);
        // 四象
        //animator.setDuration(3);
        // 两仪
        //animator.setDuration(2);
        animator.setStartDelay(0);
        animator.start();
    }

}
