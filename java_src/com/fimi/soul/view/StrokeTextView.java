package com.fimi.soul.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.TextView;
import com.fimi.soul.utils.C3103au;
/* loaded from: classes.dex */
public class StrokeTextView extends TextView {

    /* renamed from: a */
    private TextView f12232a;

    public StrokeTextView(Context context) {
        super(context);
        this.f12232a = null;
        this.f12232a = new TextView(context);
        C3103au.m29232a(context.getAssets(), this.f12232a, this);
        m28865a();
    }

    public StrokeTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f12232a = null;
        this.f12232a = new TextView(context, attributeSet);
        C3103au.m29232a(context.getAssets(), this.f12232a, this);
        m28865a();
    }

    public StrokeTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f12232a = null;
        this.f12232a = new TextView(context, attributeSet, i);
        C3103au.m29232a(context.getAssets(), this.f12232a, this);
        m28865a();
    }

    /* renamed from: a */
    public void m28865a() {
        TextPaint paint = this.f12232a.getPaint();
        paint.setStrokeWidth(1.0f);
        paint.setStyle(Paint.Style.STROKE);
        this.f12232a.setTextColor(1275068416);
        this.f12232a.setGravity(getGravity());
    }

    @Override // android.widget.TextView, android.view.View
    protected void onDraw(Canvas canvas) {
        this.f12232a.draw(canvas);
        super.onDraw(canvas);
    }

    @Override // android.widget.TextView, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.f12232a.layout(i, i2, i3, i4);
    }

    @Override // android.widget.TextView, android.view.View
    protected void onMeasure(int i, int i2) {
        CharSequence text = this.f12232a.getText();
        if (text == null || !text.equals(getText())) {
            this.f12232a.setText(getText());
            postInvalidate();
        }
        super.onMeasure(i, i2);
        this.f12232a.measure(i, i2);
    }

    @Override // android.view.View
    public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        super.setLayoutParams(layoutParams);
        this.f12232a.setLayoutParams(layoutParams);
    }
}
