package com.fimi.soul.module.p209b.p210a.p211a;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.ImageView;
/* renamed from: com.fimi.soul.module.b.a.a.k */
/* loaded from: classes.dex */
public class C2508k extends ImageView {

    /* renamed from: a */
    private float f8161a;

    public C2508k(Context context) {
        super(context);
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onDraw(Canvas canvas) {
        canvas.rotate(this.f8161a, getWidth() / 2, getHeight() / 2);
        super.onDraw(canvas);
    }

    @Override // android.view.View
    public void setRotation(float f) {
        this.f8161a = f;
        invalidate();
    }
}
