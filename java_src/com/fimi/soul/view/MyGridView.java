package com.fimi.soul.view;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.GridView;
import android.widget.ListAdapter;
import com.fimi.soul.p168b.C1735f;
/* loaded from: classes2.dex */
public class MyGridView extends GridView {

    /* renamed from: a */
    private C1735f f12150a;

    public MyGridView(Context context) {
        super(context);
    }

    public MyGridView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public MyGridView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View
    protected void onMeasure(int i, int i2) {
        if (this.f12150a != null) {
            this.f12150a.m34326a();
        }
        super.onMeasure(i, i2);
    }

    public void setAdapter(C1735f c1735f) {
        this.f12150a = c1735f;
        super.setAdapter((ListAdapter) c1735f);
    }
}
