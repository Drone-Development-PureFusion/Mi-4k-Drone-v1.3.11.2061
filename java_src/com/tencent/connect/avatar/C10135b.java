package com.tencent.connect.avatar;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.View;
/* renamed from: com.tencent.connect.avatar.b */
/* loaded from: classes2.dex */
public class C10135b extends View {

    /* renamed from: a */
    private Rect f31258a;

    /* renamed from: b */
    private Paint f31259b;

    public C10135b(Context context) {
        super(context);
        m6084b();
    }

    /* renamed from: b */
    private void m6084b() {
        this.f31259b = new Paint();
    }

    /* renamed from: a */
    public Rect m6085a() {
        if (this.f31258a == null) {
            this.f31258a = new Rect();
            int measuredWidth = getMeasuredWidth();
            int measuredHeight = getMeasuredHeight();
            int min = Math.min(Math.min((measuredHeight - 60) - 80, measuredWidth), 640);
            int i = (measuredWidth - min) / 2;
            int i2 = (measuredHeight - min) / 2;
            this.f31258a.set(i, i2, i + min, min + i2);
        }
        return this.f31258a;
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Rect m6085a = m6085a();
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        this.f31259b.setStyle(Paint.Style.FILL);
        this.f31259b.setColor(Color.argb(100, 0, 0, 0));
        canvas.drawRect(0.0f, 0.0f, measuredWidth, m6085a.top, this.f31259b);
        canvas.drawRect(0.0f, m6085a.bottom, measuredWidth, measuredHeight, this.f31259b);
        canvas.drawRect(0.0f, m6085a.top, m6085a.left, m6085a.bottom, this.f31259b);
        canvas.drawRect(m6085a.right, m6085a.top, measuredWidth, m6085a.bottom, this.f31259b);
        canvas.drawColor(Color.argb(100, 0, 0, 0));
        this.f31259b.setStyle(Paint.Style.STROKE);
        this.f31259b.setColor(-1);
        canvas.drawRect(m6085a.left, m6085a.top, m6085a.right - 1, m6085a.bottom, this.f31259b);
    }
}
