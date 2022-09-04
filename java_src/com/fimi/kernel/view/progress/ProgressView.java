package com.fimi.kernel.view.progress;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.support.p001v4.internal.view.SupportMenu;
import android.util.AttributeSet;
import android.view.View;
/* loaded from: classes.dex */
public class ProgressView extends View {

    /* renamed from: a */
    private static final int[] f4267a = {-16711936, -256, SupportMenu.CATEGORY_MASK};

    /* renamed from: b */
    private float f4268b;

    /* renamed from: c */
    private float f4269c;

    /* renamed from: d */
    private Paint f4270d;

    /* renamed from: e */
    private int f4271e;

    /* renamed from: f */
    private int f4272f;

    /* renamed from: g */
    private int f4273g = 0;

    /* renamed from: h */
    private int f4274h = 0;

    public ProgressView(Context context) {
        super(context);
        m34377a(context);
    }

    public ProgressView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m34377a(context);
    }

    public ProgressView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m34377a(context);
    }

    /* renamed from: a */
    private int m34378a(int i) {
        return (int) (((i >= 0 ? 1 : -1) * 0.5f) + (i * getContext().getResources().getDisplayMetrics().density));
    }

    /* renamed from: a */
    private void m34377a(Context context) {
    }

    public float getCurrentCount() {
        return this.f4269c;
    }

    public float getMaxCount() {
        return this.f4268b;
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f4270d = new Paint();
        this.f4270d.setAntiAlias(true);
        int i = this.f4272f / 2;
        if (this.f4274h == 0) {
            this.f4270d.setColor(771751935);
        } else {
            this.f4270d.setColor(this.f4274h);
        }
        canvas.drawRoundRect(new RectF(0.0f, 0.0f, this.f4271e, this.f4272f), i, i, this.f4270d);
        RectF rectF = new RectF(0.0f, 0.0f, (this.f4269c / this.f4268b) * this.f4271e, this.f4272f);
        if (this.f4273g == 0) {
            this.f4270d.setColor(1895825407);
        } else {
            this.f4270d.setColor(this.f4273g);
        }
        canvas.drawRoundRect(rectF, i, i, this.f4270d);
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        if (mode == 1073741824 || mode == Integer.MIN_VALUE) {
            this.f4271e = size;
        } else {
            this.f4271e = 0;
        }
        if (mode2 == Integer.MIN_VALUE || mode2 == 0) {
            this.f4272f = m34378a(15);
        } else {
            this.f4272f = size2;
        }
        setMeasuredDimension(this.f4271e, this.f4272f);
    }

    public void setBackColor(int i) {
        this.f4274h = i;
    }

    public void setCurrentCount(float f) {
        if (f > this.f4268b) {
            f = this.f4268b;
        }
        this.f4269c = f;
        invalidate();
    }

    public void setFrontColor(int i) {
        this.f4273g = i;
    }

    public void setMaxCount(float f) {
        this.f4268b = f;
    }
}
