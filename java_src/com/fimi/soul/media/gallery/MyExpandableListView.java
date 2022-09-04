package com.fimi.soul.media.gallery;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
/* loaded from: classes.dex */
public class MyExpandableListView extends ExpandableListView {

    /* renamed from: a */
    private float f7929a;

    /* renamed from: b */
    private float f7930b;

    /* renamed from: c */
    private int f7931c;

    public MyExpandableListView(Context context) {
        super(context);
        m31626a();
    }

    public MyExpandableListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m31626a();
    }

    public MyExpandableListView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m31626a();
    }

    /* renamed from: a */
    private void m31626a() {
        this.f7931c = ViewConfiguration.get(getContext()).getScaledTouchSlop();
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        switch (action) {
            case 0:
                this.f7929a = x;
                this.f7930b = y;
                break;
            case 2:
                int i = (int) (this.f7929a - x);
                if (Math.abs(i) > this.f7931c && Math.abs(((int) (this.f7930b - y)) / i) < 1) {
                    return true;
                }
                break;
        }
        return false;
    }
}
