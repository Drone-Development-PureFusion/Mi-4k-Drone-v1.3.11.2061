package com.fimi.soul.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.widget.ImageView;
import com.fimi.overseas.soul.C1704R;
/* loaded from: classes2.dex */
public class ImageLoadingView extends ImageView {

    /* renamed from: a */
    private Paint f12103a;

    /* renamed from: b */
    private float f12104b;

    public ImageLoadingView(Context context) {
        this(context, null);
        m28885c();
    }

    public ImageLoadingView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        m28885c();
    }

    public ImageLoadingView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m28885c();
    }

    /* renamed from: c */
    private void m28885c() {
        setBackgroundResource(C1704R.C1705drawable.download_circle_bg);
        this.f12103a = new Paint();
        this.f12103a.setAntiAlias(true);
        this.f12103a.setStrokeWidth(2.0f);
        this.f12103a.setStyle(Paint.Style.STROKE);
    }

    /* renamed from: a */
    public void m28887a() {
        this.f12103a.setColor(getResources().getColor(C1704R.color.loading_blue));
        invalidate();
    }

    /* renamed from: b */
    public void m28886b() {
        this.f12103a.setColor(getResources().getColor(C1704R.color.loading_hot));
        invalidate();
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawArc(new RectF(2.0f, 2.0f, getWidth() - 2, getWidth() - 2), -90.0f, this.f12104b, false, this.f12103a);
    }

    public void setPaintColor(int i) {
        this.f12103a.setColor(i);
    }

    public void setSweepAngle(float f) {
        this.f12104b = 3.6f * f;
        invalidate();
    }
}
