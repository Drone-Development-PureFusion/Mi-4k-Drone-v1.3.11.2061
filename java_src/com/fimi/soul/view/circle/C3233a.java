package com.fimi.soul.view.circle;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
/* renamed from: com.fimi.soul.view.circle.a */
/* loaded from: classes2.dex */
public class C3233a extends Drawable {

    /* renamed from: a */
    public static final String f12571a = "CircleDrawable";

    /* renamed from: b */
    protected final Paint f12572b;

    /* renamed from: c */
    protected final int f12573c;

    /* renamed from: d */
    protected final BitmapShader f12574d;

    /* renamed from: e */
    protected float f12575e;

    /* renamed from: f */
    protected Bitmap f12576f;

    public C3233a(Bitmap bitmap) {
        this(bitmap, 0);
    }

    public C3233a(Bitmap bitmap, int i) {
        this.f12573c = i;
        this.f12576f = bitmap;
        this.f12574d = new BitmapShader(bitmap, Shader.TileMode.CLAMP, Shader.TileMode.CLAMP);
        this.f12572b = new Paint();
        this.f12572b.setAntiAlias(true);
        this.f12572b.setShader(this.f12574d);
    }

    /* renamed from: a */
    public void m28694a() {
        Rect bounds = getBounds();
        if (bounds == null) {
            return;
        }
        Matrix matrix = new Matrix();
        float width = bounds.width() / this.f12576f.getWidth();
        float height = bounds.height() / this.f12576f.getHeight();
        if (width <= height) {
            width = height;
        }
        matrix.postScale(width, width);
        this.f12574d.setLocalMatrix(matrix);
    }

    /* renamed from: b */
    public void m28693b() {
        Rect bounds = getBounds();
        this.f12575e = bounds.width() < bounds.height() ? (bounds.width() / 2.0f) - this.f12573c : (bounds.height() / 2.0f) - this.f12573c;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Rect bounds = getBounds();
        canvas.drawCircle(bounds.width() / 2.0f, bounds.height() / 2.0f, this.f12575e, this.f12572b);
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        m28694a();
        m28693b();
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.f12572b.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f12572b.setColorFilter(colorFilter);
    }
}
