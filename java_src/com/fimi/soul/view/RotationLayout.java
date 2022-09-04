package com.fimi.soul.view;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.FrameLayout;
@SuppressLint({"Instantiatable"})
/* loaded from: classes2.dex */
class RotationLayout extends FrameLayout {

    /* renamed from: a */
    private int f12230a;

    public RotationLayout(Context context) {
        super(context);
    }

    public RotationLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public RotationLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    /* renamed from: a */
    public void m28867a(int i) {
        this.f12230a = ((i + 360) % 360) / 90;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        if (this.f12230a == 0) {
            super.dispatchDraw(canvas);
            return;
        }
        if (this.f12230a == 1) {
            canvas.translate(getWidth(), 0.0f);
            canvas.rotate(90.0f, getWidth() / 2, 0.0f);
            canvas.translate(getHeight() / 2, getWidth() / 2);
        } else if (this.f12230a == 2) {
            canvas.rotate(180.0f, getWidth() / 2, getHeight() / 2);
        } else {
            canvas.translate(0.0f, getHeight());
            canvas.rotate(270.0f, getWidth() / 2, 0.0f);
            canvas.translate(getHeight() / 2, (-getWidth()) / 2);
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        if (this.f12230a != 1 && this.f12230a != 3) {
            super.onMeasure(i, i2);
            return;
        }
        super.onMeasure(i, i2);
        setMeasuredDimension(getMeasuredHeight(), getMeasuredWidth());
    }
}
