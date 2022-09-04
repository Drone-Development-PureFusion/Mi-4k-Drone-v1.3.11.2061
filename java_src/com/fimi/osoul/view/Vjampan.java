package com.fimi.osoul.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import com.fimi.overseas.soul.C1704R;
/* loaded from: classes.dex */
public class Vjampan extends View {

    /* renamed from: e */
    private Bitmap f4279e;

    /* renamed from: g */
    private int f4281g;

    /* renamed from: d */
    private int f4278d = 0;

    /* renamed from: h */
    private float f4282h = 1.0f;

    /* renamed from: c */
    float f4277c = getResources().getDisplayMetrics().density;

    /* renamed from: f */
    private Bitmap f4280f = BitmapFactory.decodeResource(getResources(), C1704R.C1705drawable.jampan);

    /* renamed from: a */
    int f4275a = this.f4280f.getHeight();

    /* renamed from: b */
    int f4276b = this.f4280f.getWidth();

    public Vjampan(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        canvas.drawBitmap(this.f4280f, 0.0f, 0.0f, (Paint) null);
        Paint paint = new Paint();
        paint.setColor(-256);
        paint.setStyle(Paint.Style.FILL);
        paint.setAlpha(100);
        if (this.f4278d >= this.f4275a / 2) {
            canvas.drawRoundRect(new RectF(0.0f, this.f4275a - this.f4278d, this.f4276b, this.f4275a / 2), 20.0f, 20.0f, paint);
        } else if (this.f4278d >= 0 && this.f4278d < this.f4275a / 2) {
            canvas.drawRoundRect(new RectF(0.0f, this.f4275a / 2, this.f4276b, this.f4275a - this.f4278d), 20.0f, 20.0f, paint);
        }
        super.onDraw(canvas);
    }

    public void setScale(int i) {
        if (this.f4277c == 1.5d) {
            this.f4278d = i * 2;
        } else if (this.f4277c == 2.0f) {
            this.f4278d = i * 3;
        } else if (this.f4277c == 3.0f) {
            this.f4278d = (int) (i * 4.5d);
        }
        invalidate();
    }
}
