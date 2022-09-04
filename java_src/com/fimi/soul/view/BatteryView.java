package com.fimi.soul.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import com.fimi.overseas.soul.C1704R;
import com.google.firebase.p253b.C9755a;
/* loaded from: classes.dex */
public class BatteryView extends View {

    /* renamed from: a */
    Paint f11929a;

    /* renamed from: b */
    Paint f11930b;

    /* renamed from: c */
    Rect f11931c;

    /* renamed from: d */
    double f11932d;

    /* renamed from: e */
    int f11933e;

    /* renamed from: f */
    double f11934f;

    /* renamed from: g */
    double f11935g;

    /* renamed from: h */
    int f11936h;

    /* renamed from: i */
    int f11937i;

    /* renamed from: j */
    int f11938j;

    /* renamed from: k */
    int f11939k;

    /* renamed from: l */
    private int f11940l;

    /* renamed from: m */
    private float f11941m;

    public BatteryView(Context context) {
        super(context);
        this.f11940l = 100;
        this.f11929a = null;
        this.f11930b = null;
        this.f11931c = null;
        this.f11932d = 100.0d;
    }

    public BatteryView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f11940l = 100;
        this.f11929a = null;
        this.f11930b = null;
        this.f11931c = null;
        this.f11932d = 100.0d;
        this.f11941m = getContext().getResources().getDisplayMetrics().density;
    }

    /* renamed from: a */
    public void m28969a(int i, double d) {
        this.f11940l = i;
        if (this.f11932d > C9755a.f30449c) {
            this.f11932d = d;
        }
        if (this.f11940l < 0) {
            this.f11940l = 0;
        }
        invalidate();
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float f = (float) (this.f11940l / this.f11932d);
        float f2 = f * 360.0f;
        Paint paint = new Paint();
        paint.setColor(getResources().getColor(C1704R.color.battery));
        paint.setAntiAlias(true);
        canvas.drawCircle(this.f11941m * 12.0f, this.f11941m * 12.0f, this.f11941m * 12.0f, paint);
        Paint paint2 = new Paint();
        paint2.setColor(getResources().getColor(C1704R.color.black));
        paint2.setAntiAlias(true);
        canvas.drawCircle(this.f11941m * 12.0f, this.f11941m * 12.0f, 11.0f * this.f11941m, paint2);
        Paint paint3 = new Paint();
        if (f <= 0.25d) {
            paint3.setColor(getResources().getColor(C1704R.color.battery_red));
        } else if (f > 0.25d && f <= 0.5d) {
            paint3.setColor(getResources().getColor(C1704R.color.battery_orange));
        } else if (f <= 0.5d || f > 0.75d) {
            paint3.setColor(getResources().getColor(C1704R.color.battery_green));
        } else {
            paint3.setColor(getResources().getColor(C1704R.color.battery_yellow));
        }
        paint3.setAntiAlias(true);
        canvas.drawArc(new RectF(this.f11941m * 3.0f, this.f11941m * 3.0f, 21.0f * this.f11941m, 21.0f * this.f11941m), 270.0f - f2, f2, true, paint3);
    }
}
