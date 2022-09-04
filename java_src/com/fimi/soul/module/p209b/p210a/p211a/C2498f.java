package com.fimi.soul.module.p209b.p210a.p211a;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
/* renamed from: com.fimi.soul.module.b.a.a.f */
/* loaded from: classes.dex */
public class C2498f extends View {

    /* renamed from: a */
    private static final int f8121a = 6;

    /* renamed from: b */
    private static final int f8122b = 14;

    /* renamed from: c */
    private static final int f8123c = 52;

    /* renamed from: d */
    private int f8124d;

    /* renamed from: e */
    private int f8125e;

    public C2498f(Context context) {
        super(context);
    }

    /* renamed from: a */
    public void m31500a(int i, int i2) {
        if (i != this.f8125e) {
            this.f8125e = i;
            postInvalidate();
        }
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        if (this.f8124d <= 1) {
            setVisibility(8);
            return;
        }
        float height = getHeight();
        float f = (6.0f * height) / 52.0f;
        float f2 = (14.0f * height) / 52.0f;
        float width = (getWidth() - (((f * 2.0f) * this.f8124d) + ((this.f8124d - 1) * f2))) / 2.0f;
        float f3 = height / 2.0f;
        canvas.drawColor(-1);
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        for (int i = 0; i < this.f8124d; i++) {
            if (i == this.f8125e) {
                paint.setColor(-10653280);
            } else {
                paint.setColor(-5262921);
            }
            canvas.drawCircle((((f * 2.0f) + f2) * i) + width, f3, f, paint);
        }
    }

    public void setScreenCount(int i) {
        this.f8124d = i;
    }
}
