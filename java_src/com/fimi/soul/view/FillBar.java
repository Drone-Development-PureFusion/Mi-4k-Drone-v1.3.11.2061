package com.fimi.soul.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import android.view.SurfaceHolder;
import android.view.View;
/* loaded from: classes.dex */
public class FillBar extends View {

    /* renamed from: a */
    SurfaceHolder f12039a;

    /* renamed from: b */
    private Paint f12040b;

    /* renamed from: c */
    private Paint f12041c;

    /* renamed from: f */
    private int f12044f;

    /* renamed from: g */
    private int f12045g;

    /* renamed from: l */
    private int f12050l;

    /* renamed from: m */
    private int f12051m;

    /* renamed from: n */
    private int f12052n;

    /* renamed from: o */
    private int f12053o;

    /* renamed from: p */
    private int f12054p;

    /* renamed from: d */
    private Path f12042d = new Path();

    /* renamed from: e */
    private Path f12043e = new Path();

    /* renamed from: h */
    private float f12046h = 0.0f;

    /* renamed from: i */
    private float f12047i = 0.5f;

    /* renamed from: j */
    private float f12048j = 0.5f;

    /* renamed from: k */
    private boolean f12049k = false;

    /* renamed from: q */
    private boolean f12055q = false;

    public FillBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m28938b();
    }

    /* renamed from: b */
    private void m28938b() {
        this.f12050l = Color.parseColor("#D6D6D6");
        this.f12051m = Color.parseColor("#FFFFFF");
        this.f12052n = Color.parseColor("#F49748");
        this.f12040b = new Paint();
        this.f12040b.setAntiAlias(false);
        this.f12040b.setStyle(Paint.Style.STROKE);
        this.f12040b.setStrokeWidth(3.0f);
        this.f12041c = new Paint(this.f12040b);
        this.f12041c.setStyle(Paint.Style.FILL);
    }

    /* renamed from: a */
    public void m28940a(int i, int i2) {
        this.f12053o = i;
        this.f12054p = i2;
    }

    /* renamed from: a */
    public void m28939a(boolean z) {
        this.f12055q = z;
    }

    /* renamed from: a */
    public boolean m28941a() {
        return this.f12049k;
    }

    public int getColorBar() {
        return this.f12052n;
    }

    public int getColorMin() {
        return this.f12051m;
    }

    public int getColorOutline() {
        return this.f12050l;
    }

    public float getMax() {
        return this.f12048j;
    }

    public int getMaxValue() {
        return this.f12054p + ((int) (getMax() * (this.f12053o - this.f12054p)));
    }

    public float getMin() {
        return this.f12047i;
    }

    public int getMinValue() {
        return this.f12054p + ((int) (getMin() * (this.f12053o - this.f12054p)));
    }

    public float getPercentage() {
        return this.f12046h;
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float f = this.f12044f < this.f12045g ? this.f12044f : this.f12044f * (1.0f - this.f12046h);
        float f2 = this.f12044f < this.f12045g ? this.f12045g * this.f12046h : this.f12045g;
        this.f12041c.setColor(this.f12050l);
        this.f12042d.reset();
        this.f12042d.moveTo(0.0f, 0.0f);
        this.f12042d.lineTo(0.0f, this.f12044f);
        this.f12042d.lineTo(this.f12045g, this.f12044f);
        this.f12042d.lineTo(this.f12045g, 0.0f);
        this.f12042d.lineTo(0.0f, 0.0f);
        canvas.drawPath(this.f12042d, this.f12041c);
        this.f12041c.setColor(this.f12052n);
        this.f12043e.reset();
        if (this.f12055q) {
            if (this.f12044f > this.f12045g) {
                this.f12043e.moveTo(0.0f, 0.0f);
                this.f12043e.lineTo(0.0f, this.f12044f - f);
                this.f12043e.lineTo(this.f12045g, this.f12044f - f);
                this.f12043e.lineTo(this.f12045g, 0.0f);
                this.f12043e.lineTo(0.0f, 0.0f);
            } else {
                this.f12043e.moveTo(0.0f, 0.0f);
                this.f12043e.lineTo(0.0f, this.f12044f);
                this.f12043e.lineTo(this.f12045g - f2, this.f12044f);
                this.f12043e.lineTo(this.f12045g - f2, 0.0f);
                this.f12043e.lineTo(0.0f, 0.0f);
            }
        } else if (this.f12044f > this.f12045g) {
            this.f12043e.moveTo(0.0f, f);
            this.f12043e.lineTo(0.0f, this.f12044f);
            this.f12043e.lineTo(f2, this.f12044f);
            this.f12043e.lineTo(f2, f);
            this.f12043e.lineTo(0.0f, f);
        } else {
            this.f12043e.moveTo(0.0f, 0.0f);
            this.f12043e.lineTo(0.0f, this.f12044f);
            this.f12043e.lineTo(f2, this.f12044f);
            this.f12043e.lineTo(f2, 0.0f);
            this.f12043e.lineTo(0.0f, 0.0f);
        }
        canvas.drawPath(this.f12043e, this.f12041c);
        this.f12040b.setColor(this.f12051m);
        if (m28941a()) {
            this.f12042d.reset();
            if (this.f12055q) {
                if (this.f12044f > this.f12045g) {
                    float f3 = this.f12044f * this.f12047i;
                    this.f12042d.reset();
                    this.f12042d.moveTo(0.0f, f3);
                    this.f12042d.lineTo(this.f12045g, f3);
                    canvas.drawPath(this.f12042d, this.f12040b);
                    this.f12042d.reset();
                    float f4 = this.f12044f * this.f12048j;
                    this.f12042d.moveTo(0.0f, f4);
                    this.f12042d.lineTo(this.f12045g, f4);
                    canvas.drawPath(this.f12042d, this.f12040b);
                } else {
                    float f5 = this.f12045g * this.f12048j;
                    this.f12042d.reset();
                    this.f12042d.moveTo(f5, 0.0f);
                    this.f12042d.lineTo(f5, this.f12044f);
                    canvas.drawPath(this.f12042d, this.f12040b);
                    float f6 = this.f12045g * this.f12047i;
                    this.f12042d.reset();
                    this.f12042d.moveTo(f6, 0.0f);
                    this.f12042d.lineTo(f6, this.f12044f);
                    canvas.drawPath(this.f12042d, this.f12040b);
                }
            } else if (this.f12044f > this.f12045g) {
                float f7 = this.f12044f * (1.0f - this.f12047i);
                this.f12042d.reset();
                this.f12042d.moveTo(0.0f, f7);
                this.f12042d.lineTo(this.f12045g, f7);
                canvas.drawPath(this.f12042d, this.f12040b);
                this.f12042d.reset();
                float f8 = this.f12044f * (1.0f - this.f12048j);
                this.f12042d.moveTo(0.0f, f8);
                this.f12042d.lineTo(this.f12045g, f8);
                canvas.drawPath(this.f12042d, this.f12040b);
            } else {
                float f9 = this.f12045g * this.f12047i;
                this.f12042d.reset();
                this.f12042d.moveTo(f9, 0.0f);
                this.f12042d.lineTo(f9, this.f12044f);
                canvas.drawPath(this.f12042d, this.f12040b);
                float f10 = this.f12045g * this.f12048j;
                this.f12042d.reset();
                this.f12042d.moveTo(f10, 0.0f);
                this.f12042d.lineTo(f10, this.f12044f);
                canvas.drawPath(this.f12042d, this.f12040b);
            }
        }
        invalidate();
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.f12045g = i - 1;
        this.f12044f = i2 - 1;
    }

    public void setColorBar(int i) {
        this.f12052n = i;
    }

    public void setColorMin(int i) {
        this.f12051m = i;
    }

    public void setColorOutline(int i) {
        this.f12050l = i;
    }

    public void setPercentage(float f) {
        this.f12046h = f;
        this.f12047i = this.f12047i > f ? f : this.f12047i;
        if (this.f12048j >= f) {
            f = this.f12048j;
        }
        this.f12048j = f;
        invalidate();
    }

    public void setShowMinMax(boolean z) {
        this.f12049k = z;
        if (z) {
            this.f12047i = 0.5f;
            this.f12048j = 0.5f;
        }
        invalidate();
    }

    public void setValue(int i) {
        setPercentage((i - this.f12054p) / (this.f12053o - this.f12054p));
    }
}
