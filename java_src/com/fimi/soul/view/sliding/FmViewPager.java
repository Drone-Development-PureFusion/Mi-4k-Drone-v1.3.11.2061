package com.fimi.soul.view.sliding;

import android.content.Context;
import android.support.p001v4.view.ViewPager;
import android.util.AttributeSet;
import android.view.MotionEvent;
/* loaded from: classes2.dex */
public class FmViewPager extends ViewPager {

    /* renamed from: a */
    private boolean f13198a = true;

    public FmViewPager(Context context) {
        super(context);
    }

    public FmViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.support.p001v4.view.ViewPager, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.f13198a) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        return false;
    }

    @Override // android.support.p001v4.view.ViewPager, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f13198a) {
            return super.onTouchEvent(motionEvent);
        }
        return false;
    }

    public void setPagingEnabled(boolean z) {
        this.f13198a = z;
    }
}
