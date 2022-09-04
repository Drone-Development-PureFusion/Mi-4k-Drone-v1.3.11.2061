package com.fimi.soul.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import com.fimi.overseas.soul.C1704R;
/* loaded from: classes2.dex */
public class VerticalSeekBar extends View {

    /* renamed from: d */
    private int f12431d;

    /* renamed from: a */
    private int f12428a = 1;

    /* renamed from: e */
    private float f12432e = 1.0f;

    /* renamed from: b */
    private Bitmap f12429b = BitmapFactory.decodeResource(getResources(), C1704R.C1705drawable.gimbal_measure);

    /* renamed from: c */
    private Bitmap f12430c = BitmapFactory.decodeResource(getResources(), C1704R.C1705drawable.gimbal_measure_bg);

    public VerticalSeekBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        canvas.drawBitmap(this.f12430c, 0.0f, 0.0f, (Paint) null);
        canvas.drawBitmap(this.f12429b, 0.0f, this.f12432e, (Paint) null);
        super.onDraw(canvas);
    }

    public void setScale(int i) {
        int i2 = 100;
        this.f12428a = i;
        this.f12431d = this.f12430c.getHeight() - this.f12429b.getHeight();
        if (this.f12428a < 1) {
            this.f12428a = 1;
            this.f12432e = 1.0f;
        } else {
            if (this.f12428a <= 100) {
                i2 = this.f12428a;
            }
            this.f12432e = (i2 * this.f12431d) / 100;
        }
        invalidate();
    }
}
