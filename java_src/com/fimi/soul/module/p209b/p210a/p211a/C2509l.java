package com.fimi.soul.module.p209b.p210a.p211a;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
/* renamed from: com.fimi.soul.module.b.a.a.l */
/* loaded from: classes.dex */
public class C2509l extends View {

    /* renamed from: a */
    private float f8162a;

    public C2509l(Context context) {
        super(context);
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        int width = getWidth() / 2;
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setColor(-6250336);
        canvas.drawRect(width, 0.0f, getWidth(), getHeight() / 2, paint);
        Paint paint2 = new Paint();
        paint2.setAntiAlias(true);
        paint2.setStrokeWidth(3.0f * this.f8162a);
        paint2.setColor(-1);
        float f = 8.0f * this.f8162a;
        canvas.drawLine(width + f, f, getWidth() - f, width - f, paint2);
        canvas.drawLine(width + f, width - f, getWidth() - f, f, paint2);
    }

    public void setRatio(float f) {
        this.f8162a = f;
    }
}
