package com.fimi.soul.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import com.fimi.overseas.soul.C1704R;
/* loaded from: classes2.dex */
public class MediaImageLoadingView extends View {

    /* renamed from: a */
    private Paint f12119a;

    /* renamed from: b */
    private float f12120b;

    public MediaImageLoadingView(Context context) {
        this(context, null);
        m28878c();
    }

    public MediaImageLoadingView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        m28878c();
    }

    public MediaImageLoadingView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m28878c();
    }

    /* renamed from: c */
    private void m28878c() {
        setBackgroundResource(C1704R.C1705drawable.download_circle_bg);
        this.f12119a = new Paint();
        this.f12119a.setAntiAlias(true);
        this.f12119a.setStrokeWidth(2.0f);
        this.f12119a.setStyle(Paint.Style.STROKE);
    }

    /* renamed from: a */
    public void m28880a() {
        this.f12119a.setColor(getResources().getColor(C1704R.color.loading_blue));
        invalidate();
    }

    /* renamed from: b */
    public void m28879b() {
        this.f12119a.setColor(getResources().getColor(C1704R.color.loading_hot));
        invalidate();
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawArc(new RectF(2.0f, 2.0f, getWidth() - 2, getWidth() - 2), -90.0f, this.f12120b, false, this.f12119a);
    }

    public void setPaintColor(int i) {
        this.f12119a.setColor(i);
    }

    public void setSweepAngle(float f) {
        this.f12120b = 3.6f * f;
        invalidate();
    }
}
