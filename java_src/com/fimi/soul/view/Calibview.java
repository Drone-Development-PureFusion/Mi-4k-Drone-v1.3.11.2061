package com.fimi.soul.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.support.p001v4.view.ViewCompat;
import android.util.AttributeSet;
import android.view.View;
import com.fimi.soul.utils.C3125i;
/* loaded from: classes.dex */
public class Calibview extends View {

    /* renamed from: a */
    Context f11980a;

    /* renamed from: b */
    RectF f11981b;

    /* renamed from: c */
    private float f11982c;

    /* renamed from: d */
    private int f11983d;

    /* renamed from: e */
    private int f11984e;

    /* renamed from: f */
    private int f11985f;

    /* renamed from: g */
    private int f11986g;

    /* renamed from: h */
    private int f11987h;

    /* renamed from: i */
    private int f11988i;

    /* renamed from: j */
    private int f11989j;

    public Calibview(Context context) {
        super(context);
        this.f11983d = 10;
        this.f11984e = 100;
        this.f11985f = 60;
        this.f11980a = context;
    }

    public Calibview(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f11983d = 10;
        this.f11984e = 100;
        this.f11985f = 60;
        this.f11980a = context;
        this.f11982c = getResources().getDisplayMetrics().density;
        if (this.f11982c == 1.5d) {
            this.f11984e = C3125i.m29082a(context, 65.0f);
            this.f11983d = C3125i.m29082a(context, 5.0f);
            this.f11985f = C3125i.m29082a(context, 40.0f);
        } else if (this.f11982c == 2.0f) {
            this.f11984e = C3125i.m29082a(context, 50.0f);
            this.f11983d = C3125i.m29082a(context, 5.0f);
            this.f11985f = C3125i.m29082a(context, 30.0f);
        } else if (this.f11982c != 3.0f) {
        } else {
            this.f11984e = C3125i.m29082a(context, 33.0f);
            this.f11983d = C3125i.m29082a(context, 3.0f);
            this.f11985f = C3125i.m29082a(context, 20.0f);
        }
    }

    /* renamed from: a */
    public void m28957a(int i, int i2, int i3, int i4) {
        this.f11986g = i;
        this.f11987h = i2;
        this.f11988i = i3;
        this.f11989j = i4;
        invalidate();
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.save();
        Paint paint = new Paint();
        paint.setStrokeWidth(3.0f);
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(-1);
        paint.setAntiAlias(true);
        canvas.drawCircle(this.f11984e * this.f11982c, this.f11984e * this.f11982c, this.f11985f * this.f11982c, paint);
        paint.setStyle(Paint.Style.FILL);
        canvas.drawCircle(this.f11984e * this.f11982c, this.f11984e * this.f11982c, this.f11983d * this.f11982c, paint);
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(ViewCompat.MEASURED_STATE_MASK);
        paint.setStrokeWidth(3.0f);
        this.f11981b = new RectF((this.f11984e - this.f11985f) * this.f11982c, (this.f11984e - this.f11983d) * this.f11982c, (this.f11984e - this.f11983d) * this.f11982c, (this.f11984e + this.f11983d) * this.f11982c);
        canvas.drawRoundRect(this.f11981b, this.f11982c * 10.0f, this.f11982c * 10.0f, paint);
        this.f11981b = new RectF((this.f11984e - this.f11983d) * this.f11982c, (this.f11984e - this.f11985f) * this.f11982c, (this.f11984e + this.f11983d) * this.f11982c, (this.f11984e - this.f11983d) * this.f11982c);
        canvas.drawRoundRect(this.f11981b, this.f11982c * 10.0f, this.f11982c * 10.0f, paint);
        this.f11981b = new RectF((this.f11984e + this.f11983d) * this.f11982c, (this.f11984e - this.f11983d) * this.f11982c, (this.f11984e + this.f11985f) * this.f11982c, (this.f11984e + this.f11983d) * this.f11982c);
        canvas.drawRoundRect(this.f11981b, this.f11982c * 10.0f, this.f11982c * 10.0f, paint);
        this.f11981b = new RectF((this.f11984e - this.f11983d) * this.f11982c, (this.f11984e + this.f11983d) * this.f11982c, (this.f11984e + this.f11983d) * this.f11982c, (this.f11984e + this.f11985f) * this.f11982c);
        canvas.drawRoundRect(this.f11981b, this.f11982c * 10.0f, this.f11982c * 10.0f, paint);
        Paint paint2 = new Paint();
        paint2.setColor(ViewCompat.MEASURED_STATE_MASK);
        paint2.setTextSize(15.0f * this.f11982c);
        paint2.setTextAlign(Paint.Align.CENTER);
        paint.setStrokeWidth(1.0f);
        paint2.setAntiAlias(true);
        canvas.drawText((this.f11987h * 2) + "%", ((this.f11984e - this.f11985f) - 20) * this.f11982c, (this.f11984e + 2) * this.f11982c, paint2);
        canvas.drawText((this.f11986g * 2) + "%", this.f11984e * this.f11982c, ((this.f11984e - this.f11985f) - 5) * this.f11982c, paint2);
        canvas.drawText((this.f11988i * 2) + "%", (this.f11984e + this.f11985f + 20) * this.f11982c, (this.f11984e + 2) * this.f11982c, paint2);
        canvas.drawText((this.f11989j * 2) + "%", this.f11984e * this.f11982c, (this.f11984e + this.f11985f + 15) * this.f11982c, paint2);
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(-16711936);
        this.f11981b = new RectF(((this.f11984e - this.f11983d) - this.f11987h) * this.f11982c, (this.f11984e - this.f11983d) * this.f11982c, (this.f11984e - this.f11983d) * this.f11982c, (this.f11984e + this.f11983d) * this.f11982c);
        canvas.drawRoundRect(this.f11981b, this.f11982c * 10.0f, this.f11982c * 10.0f, paint);
        this.f11981b = new RectF((this.f11984e - this.f11983d) * this.f11982c, ((this.f11984e - this.f11983d) - this.f11986g) * this.f11982c, (this.f11984e + this.f11983d) * this.f11982c, (this.f11984e - this.f11983d) * this.f11982c);
        canvas.drawRoundRect(this.f11981b, this.f11982c * 10.0f, this.f11982c * 10.0f, paint);
        this.f11981b = new RectF((this.f11984e + this.f11983d) * this.f11982c, (this.f11984e - this.f11983d) * this.f11982c, (this.f11984e + this.f11983d + this.f11988i) * this.f11982c, (this.f11984e + this.f11983d) * this.f11982c);
        canvas.drawRoundRect(this.f11981b, this.f11982c * 10.0f, this.f11982c * 10.0f, paint);
        this.f11981b = new RectF((this.f11984e - this.f11983d) * this.f11982c, (this.f11984e + this.f11983d) * this.f11982c, (this.f11984e + this.f11983d) * this.f11982c, (this.f11984e + this.f11983d + this.f11989j) * this.f11982c);
        canvas.drawRoundRect(this.f11981b, this.f11982c * 10.0f, this.f11982c * 10.0f, paint);
    }
}
