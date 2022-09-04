package com.fimi.soul.view;

import android.content.Context;
import android.graphics.Point;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.RelativeLayout;
import com.google.android.gms.maps.C8500c;
import com.google.android.gms.maps.model.C8615g;
/* loaded from: classes.dex */
public class MapWrapperLayout extends RelativeLayout {

    /* renamed from: a */
    private C8500c f12115a;

    /* renamed from: b */
    private int f12116b;

    /* renamed from: c */
    private C8615g f12117c;

    /* renamed from: d */
    private View f12118d;

    public MapWrapperLayout(Context context) {
        super(context);
    }

    public MapWrapperLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public MapWrapperLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    /* renamed from: a */
    public void m28882a(C8500c c8500c, int i) {
        this.f12115a = c8500c;
        this.f12116b = i;
    }

    /* renamed from: a */
    public void m28881a(C8615g c8615g, View view) {
        this.f12117c = c8615g;
        this.f12118d = view;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean z;
        if (this.f12117c == null || !this.f12117c.m11011j() || this.f12115a == null || this.f12118d == null) {
            z = false;
        } else {
            Point m11482a = this.f12115a.m11554n().m11482a(this.f12117c.m11020c());
            MotionEvent obtain = MotionEvent.obtain(motionEvent);
            obtain.offsetLocation((-m11482a.x) + (this.f12118d.getWidth() / 3), (-m11482a.y) + this.f12118d.getHeight() + this.f12116b);
            z = this.f12118d.dispatchTouchEvent(obtain);
        }
        return z || super.dispatchTouchEvent(motionEvent);
    }
}
