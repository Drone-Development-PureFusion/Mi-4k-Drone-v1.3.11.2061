package com.fimi.soul.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.support.p001v4.view.ViewCompat;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.TextView;
import com.fimi.soul.utils.C3103au;
/* loaded from: classes2.dex */
public class StrokeDigitalView extends TextView {

    /* renamed from: a */
    private TextView f12231a;

    public StrokeDigitalView(Context context) {
        super(context);
        this.f12231a = null;
        this.f12231a = new TextView(context);
        C3103au.m29218b(context.getAssets(), this.f12231a, this);
        m28866a();
    }

    public StrokeDigitalView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f12231a = null;
        this.f12231a = new TextView(context, attributeSet);
        C3103au.m29218b(context.getAssets(), this.f12231a, this);
        m28866a();
    }

    public StrokeDigitalView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f12231a = null;
        this.f12231a = new TextView(context, attributeSet, i);
        C3103au.m29218b(context.getAssets(), this.f12231a, this);
        m28866a();
    }

    /* renamed from: a */
    public void m28866a() {
        TextPaint paint = this.f12231a.getPaint();
        paint.setStrokeWidth(1.0f);
        paint.setStyle(Paint.Style.STROKE);
        this.f12231a.setTextColor(ViewCompat.MEASURED_STATE_MASK);
        this.f12231a.setGravity(getGravity());
    }

    @Override // android.widget.TextView, android.view.View
    protected void onDraw(Canvas canvas) {
        this.f12231a.draw(canvas);
        super.onDraw(canvas);
    }

    @Override // android.widget.TextView, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.f12231a.layout(i, i2, i3, i4);
    }

    @Override // android.widget.TextView, android.view.View
    protected void onMeasure(int i, int i2) {
        CharSequence text = this.f12231a.getText();
        if (text == null || !text.equals(getText())) {
            this.f12231a.setText(getText());
            postInvalidate();
        }
        super.onMeasure(i, i2);
        this.f12231a.measure(i, i2);
    }

    @Override // android.view.View
    public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        super.setLayoutParams(layoutParams);
        this.f12231a.setLayoutParams(layoutParams);
    }
}
