package com.fimi.soul.media.gallery;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;
/* loaded from: classes.dex */
public class MyImageView extends ImageView {

    /* renamed from: a */
    private AbstractC2403a f7932a;

    /* renamed from: com.fimi.soul.media.gallery.MyImageView$a */
    /* loaded from: classes.dex */
    public interface AbstractC2403a {
        /* renamed from: a */
        void m31625a(int i, int i2);
    }

    public MyImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public MyImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.f7932a != null) {
            this.f7932a.m31625a(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setOnMeasureListener(AbstractC2403a abstractC2403a) {
        this.f7932a = abstractC2403a;
    }
}
