package com.fimi.soul.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.support.p001v4.view.ViewCompat;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
/* loaded from: classes.dex */
public class AutoScrollTextView extends TextView implements View.OnClickListener {

    /* renamed from: a */
    public static final String f11877a = AutoScrollTextView.class.getSimpleName();

    /* renamed from: c */
    String f11879c;

    /* renamed from: d */
    private float f11880d = 0.0f;

    /* renamed from: e */
    private float f11881e = 0.0f;

    /* renamed from: f */
    private float f11882f = 0.0f;

    /* renamed from: g */
    private float f11883g = 0.0f;

    /* renamed from: h */
    private float f11884h = 0.0f;

    /* renamed from: i */
    private float f11885i = 0.0f;

    /* renamed from: b */
    public boolean f11878b = false;

    /* renamed from: j */
    private Paint f11886j = null;

    /* renamed from: k */
    private CharSequence f11887k = "";

    /* renamed from: l */
    private float f11888l = 2.0f;

    /* renamed from: m */
    private int f11889m = ViewCompat.MEASURED_STATE_MASK;

    /* renamed from: n */
    private int f11890n = 0;

    public AutoScrollTextView(Context context) {
        super(context);
        m28990c();
    }

    public AutoScrollTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m28990c();
    }

    public AutoScrollTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m28990c();
    }

    /* renamed from: c */
    private void m28990c() {
        setOnClickListener(this);
    }

    /* renamed from: a */
    public void m28993a() {
        this.f11878b = true;
        invalidate();
    }

    /* renamed from: a */
    public void m28992a(float f) {
        this.f11887k = super.getText();
        this.f11886j = super.getPaint();
        this.f11887k = getText().toString();
        this.f11880d = this.f11886j.measureText(this.f11887k.toString());
        this.f11881e = getWidth();
        this.f11881e = f;
        this.f11882f = this.f11880d;
        this.f11884h = this.f11881e + this.f11880d;
        this.f11885i = this.f11881e + (this.f11880d * 1.5f);
        this.f11883g = getTextSize() + getPaddingTop();
        this.f11886j.setColor(this.f11889m);
    }

    /* renamed from: b */
    public void m28991b() {
        this.f11878b = false;
        invalidate();
    }

    public float getSpeed() {
        return this.f11888l;
    }

    public int getTextColor() {
        return this.f11889m;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (this.f11878b) {
            m28991b();
        } else {
            m28993a();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        if (this.f11886j != null) {
            canvas.drawText(this.f11887k, 0, this.f11887k.length(), this.f11884h - this.f11882f, this.f11883g, this.f11886j);
            if (!this.f11878b) {
                return;
            }
            this.f11882f += this.f11888l;
            if (this.f11882f > this.f11885i) {
                this.f11890n++;
                if (this.f11890n == this.f11887k.length()) {
                    this.f11890n = 0;
                }
                m28992a(0.0f);
                this.f11882f = this.f11880d;
            }
            invalidate();
        }
    }

    public void setSpeed(float f) {
        this.f11888l = f;
    }

    @Override // android.widget.TextView
    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        super.setText(charSequence, bufferType);
        m28992a(0.0f);
    }

    @Override // android.widget.TextView
    public void setTextColor(int i) {
        this.f11889m = i;
    }
}
