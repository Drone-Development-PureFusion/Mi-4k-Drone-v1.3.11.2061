package com.fimi.kernel.utils;

import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.RotateAnimation;
import android.view.animation.ScaleAnimation;
import android.view.animation.TranslateAnimation;
/* renamed from: com.fimi.kernel.utils.b */
/* loaded from: classes.dex */
public class C1652b {

    /* renamed from: a */
    public static final long f4091a = 1;

    /* renamed from: a */
    public static void m34843a(View view, float f) {
        if (view == null) {
            return;
        }
        view.bringToFront();
        m34838c(view, (f / view.getWidth()) + 1.0f);
    }

    /* renamed from: a */
    public static void m34842a(View view, long j, int i, int i2) {
        AnimationSet animationSet = new AnimationSet(true);
        RotateAnimation rotateAnimation = new RotateAnimation(0.0f, 360.0f, 1, 0.5f, 1, 0.5f);
        rotateAnimation.setDuration(j);
        rotateAnimation.setRepeatCount(i);
        rotateAnimation.setRepeatMode(i2);
        rotateAnimation.setInterpolator(view.getContext(), 17432582);
        animationSet.addAnimation(rotateAnimation);
        view.startAnimation(animationSet);
    }

    /* renamed from: b */
    public static void m34840b(View view, float f) {
        if (view == null) {
            return;
        }
        m34838c(view, ((f / view.getWidth()) + 1.0f) * (-1.0f));
    }

    /* renamed from: c */
    private static void m34838c(View view, float f) {
        if (f == 0.0f) {
            return;
        }
        ScaleAnimation scaleAnimation = f > 0.0f ? new ScaleAnimation(1.0f, f, 1.0f, f, 1, 0.5f, 1, 0.5f) : new ScaleAnimation((-1.0f) * f, 1.0f, (-1.0f) * f, 1.0f, 1, 0.5f, 1, 0.5f);
        scaleAnimation.setDuration(1L);
        scaleAnimation.setInterpolator(new AccelerateDecelerateInterpolator());
        scaleAnimation.setFillAfter(true);
        view.startAnimation(scaleAnimation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public void m34837d(final View view, final float f) {
        AnimationSet animationSet = new AnimationSet(true);
        animationSet.addAnimation(new TranslateAnimation(0.0f, 0.0f, 0.0f, -f));
        animationSet.setDuration(300L);
        animationSet.setInterpolator(new AccelerateDecelerateInterpolator());
        animationSet.setFillAfter(true);
        animationSet.setAnimationListener(new Animation.AnimationListener() { // from class: com.fimi.kernel.utils.b.1
            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationEnd(Animation animation) {
                C1652b.this.m34836e(view, f);
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationRepeat(Animation animation) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationStart(Animation animation) {
            }
        });
        view.startAnimation(animationSet);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e */
    public void m34836e(final View view, final float f) {
        AnimationSet animationSet = new AnimationSet(true);
        animationSet.addAnimation(new TranslateAnimation(0.0f, 0.0f, -f, 0.0f));
        animationSet.setDuration(200L);
        animationSet.setInterpolator(new AccelerateInterpolator());
        animationSet.setFillAfter(true);
        animationSet.setAnimationListener(new Animation.AnimationListener() { // from class: com.fimi.kernel.utils.b.2
            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationEnd(Animation animation) {
                view.postDelayed(new Runnable() { // from class: com.fimi.kernel.utils.b.2.1
                    @Override // java.lang.Runnable
                    public void run() {
                        C1652b.this.m34837d(view, f);
                    }
                }, 2000L);
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationRepeat(Animation animation) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationStart(Animation animation) {
            }
        });
        view.startAnimation(animationSet);
    }
}
