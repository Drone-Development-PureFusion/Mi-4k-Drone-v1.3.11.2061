package com.fimi.soul.view;

import android.content.Context;
import android.graphics.PointF;
import android.support.p001v4.view.ViewPager;
import android.util.AttributeSet;
import android.view.MotionEvent;
/* loaded from: classes2.dex */
public class MyViewPage extends ViewPager {

    /* renamed from: a */
    PointF f12154a = new PointF();

    /* renamed from: b */
    PointF f12155b = new PointF();

    /* renamed from: c */
    private float f12156c;

    public MyViewPage(Context context) {
        super(context);
    }

    public MyViewPage(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.support.p001v4.view.ViewPager, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        System.out.println("MyViewPage2 onInterceptTouchEvent");
        return true;
    }

    @Override // android.support.p001v4.view.ViewPager, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        this.f12155b.x = motionEvent.getX();
        this.f12155b.y = motionEvent.getY();
        if (motionEvent.getAction() == 0) {
            this.f12154a.x = motionEvent.getX();
            this.f12154a.y = motionEvent.getY();
            getParent().requestDisallowInterceptTouchEvent(true);
        }
        if (motionEvent.getAction() == 2) {
            getParent().requestDisallowInterceptTouchEvent(true);
        }
        if (motionEvent.getAction() == 1 && this.f12154a.x == this.f12155b.x && this.f12154a.y == this.f12155b.y) {
            return true;
        }
        try {
            return super.onTouchEvent(motionEvent);
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
            return false;
        }
    }
}
