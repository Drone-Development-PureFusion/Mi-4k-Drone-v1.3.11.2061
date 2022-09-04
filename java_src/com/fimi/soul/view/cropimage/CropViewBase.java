package com.fimi.soul.view.cropimage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.widget.ImageView;
/* loaded from: classes2.dex */
public abstract class CropViewBase extends ImageView {

    /* renamed from: g */
    public static final int f12577g = 0;

    /* renamed from: h */
    public static final int f12578h = 1;

    /* renamed from: i */
    public static final int f12579i = 2;

    /* renamed from: n */
    static final float f12580n = 1.25f;

    /* renamed from: o */
    private static final String f12581o = "ImageViewTouchBase";

    /* renamed from: a */
    protected Matrix f12582a;

    /* renamed from: b */
    protected Matrix f12583b;

    /* renamed from: c */
    public final C3237a f12584c;

    /* renamed from: d */
    int f12585d;

    /* renamed from: e */
    int f12586e;

    /* renamed from: f */
    float f12587f;

    /* renamed from: j */
    protected int f12588j;

    /* renamed from: k */
    protected Handler f12589k;

    /* renamed from: l */
    protected int f12590l;

    /* renamed from: m */
    protected int f12591m;

    /* renamed from: p */
    private final Matrix f12592p;

    /* renamed from: q */
    private final float[] f12593q;

    /* renamed from: r */
    private AbstractC3236a f12594r;

    /* renamed from: s */
    private Runnable f12595s;

    /* renamed from: com.fimi.soul.view.cropimage.CropViewBase$a */
    /* loaded from: classes2.dex */
    public interface AbstractC3236a {
        /* renamed from: a */
        void m28673a(Bitmap bitmap);
    }

    public CropViewBase(Context context) {
        super(context);
        this.f12582a = new Matrix();
        this.f12583b = new Matrix();
        this.f12592p = new Matrix();
        this.f12593q = new float[9];
        this.f12584c = new C3237a(null);
        this.f12585d = -1;
        this.f12586e = -1;
        this.f12588j = 0;
        this.f12589k = new Handler();
        this.f12595s = null;
        m28674e();
    }

    public CropViewBase(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f12582a = new Matrix();
        this.f12583b = new Matrix();
        this.f12592p = new Matrix();
        this.f12593q = new float[9];
        this.f12584c = new C3237a(null);
        this.f12585d = -1;
        this.f12586e = -1;
        this.f12588j = 0;
        this.f12589k = new Handler();
        this.f12595s = null;
        m28674e();
    }

    /* renamed from: a */
    private void m28687a(Bitmap bitmap, int i) {
        super.setImageBitmap(bitmap);
        Drawable drawable = getDrawable();
        if (drawable != null) {
            drawable.setDither(true);
        }
        Bitmap m28669b = this.f12584c.m28669b();
        this.f12584c.m28670a(bitmap);
        this.f12584c.m28671a(i);
        if (m28669b == null || m28669b == bitmap || this.f12594r == null) {
            return;
        }
        this.f12594r.m28673a(m28669b);
    }

    /* renamed from: a */
    private void m28683a(C3237a c3237a, Matrix matrix) {
        float width = getWidth();
        float height = getHeight();
        float m28665f = c3237a.m28665f();
        float m28666e = c3237a.m28666e();
        matrix.reset();
        float min = Math.min(Math.min(width / m28665f, 2.0f), Math.min(height / m28666e, 2.0f));
        matrix.postConcat(c3237a.m28668c());
        matrix.postScale(min, min);
        matrix.postTranslate((width - (m28665f * min)) / 2.0f, (height - (m28666e * min)) / 2.0f);
    }

    /* renamed from: e */
    private void m28674e() {
        setScaleType(ImageView.ScaleType.MATRIX);
    }

    /* renamed from: a */
    protected float m28685a(Matrix matrix) {
        return m28684a(matrix, 0);
    }

    /* renamed from: a */
    protected float m28684a(Matrix matrix, int i) {
        matrix.getValues(this.f12593q);
        return this.f12593q[i];
    }

    /* renamed from: a */
    public void m28692a() {
        m28686a((Bitmap) null, true);
    }

    /* renamed from: a */
    protected void m28691a(float f) {
        m28689a(f, getWidth() / 2.0f, getHeight() / 2.0f);
    }

    /* renamed from: a */
    protected void m28690a(float f, float f2) {
        this.f12583b.postTranslate(f, f2);
    }

    /* renamed from: a */
    protected void m28689a(float f, float f2, float f3) {
        if (f > this.f12587f) {
            f = this.f12587f;
        }
        float scale = f / getScale();
        this.f12583b.postScale(scale, scale, f2, f3);
        setImageMatrix(getImageViewMatrix());
        m28681a(true, true);
    }

    /* renamed from: a */
    protected void m28688a(float f, final float f2, final float f3, final float f4) {
        final float scale = (f - getScale()) / f4;
        final float scale2 = getScale();
        final long currentTimeMillis = System.currentTimeMillis();
        this.f12589k.post(new Runnable() { // from class: com.fimi.soul.view.cropimage.CropViewBase.2
            @Override // java.lang.Runnable
            public void run() {
                float min = Math.min(f4, (float) (System.currentTimeMillis() - currentTimeMillis));
                CropViewBase.this.m28689a(scale2 + (scale * min), f2, f3);
                if (min < f4) {
                    CropViewBase.this.f12589k.post(this);
                }
            }
        });
    }

    /* renamed from: a */
    public void m28686a(Bitmap bitmap, boolean z) {
        m28682a(new C3237a(bitmap), z);
    }

    /* renamed from: a */
    public void m28682a(final C3237a c3237a, final boolean z) {
        if (getWidth() <= 0) {
            this.f12595s = new Runnable() { // from class: com.fimi.soul.view.cropimage.CropViewBase.1
                @Override // java.lang.Runnable
                public void run() {
                    CropViewBase.this.m28682a(c3237a, z);
                }
            };
            return;
        }
        if (c3237a.m28669b() != null) {
            m28683a(c3237a, this.f12582a);
            m28687a(c3237a.m28669b(), c3237a.m28672a());
        } else {
            this.f12582a.reset();
            setImageBitmap(null);
        }
        if (z) {
            this.f12583b.reset();
        }
        setImageMatrix(getImageViewMatrix());
        this.f12587f = m28680b();
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x004a  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void m28681a(boolean z, boolean z2) {
        float f;
        float f2 = 0.0f;
        if (this.f12584c.m28669b() == null) {
            return;
        }
        Matrix imageViewMatrix = getImageViewMatrix();
        RectF rectF = new RectF(0.0f, 0.0f, this.f12584c.m28669b().getWidth(), this.f12584c.m28669b().getHeight());
        imageViewMatrix.mapRect(rectF);
        float height = rectF.height();
        float width = rectF.width();
        if (z2) {
            int height2 = getHeight();
            if (height < height2) {
                f = ((height2 - height) / 2.0f) - rectF.top;
            } else if (rectF.top > 0.0f) {
                f = -rectF.top;
            } else if (rectF.bottom < height2) {
                f = getHeight() - rectF.bottom;
            }
            if (z) {
                int width2 = getWidth();
                if (width < width2) {
                    f2 = ((width2 - width) / 2.0f) - rectF.left;
                } else if (rectF.left > 0.0f) {
                    f2 = -rectF.left;
                } else if (rectF.right < width2) {
                    f2 = width2 - rectF.right;
                }
            }
            m28690a(f2, f);
            setImageMatrix(getImageViewMatrix());
        }
        f = 0.0f;
        if (z) {
        }
        m28690a(f2, f);
        setImageMatrix(getImageViewMatrix());
    }

    /* renamed from: b */
    protected float m28680b() {
        if (this.f12584c.m28669b() == null) {
            return 1.0f;
        }
        float max = Math.max(this.f12584c.m28665f() / this.f12585d, this.f12584c.m28666e() / this.f12586e) * 4.0f;
        if (max < 1.0f) {
            return 1.0f;
        }
        return max;
    }

    /* renamed from: b */
    protected void m28679b(float f) {
        if (getScale() < this.f12587f && this.f12584c.m28669b() != null) {
            this.f12583b.postScale(f, f, getWidth() / 2.0f, getHeight() / 2.0f);
            setImageMatrix(getImageViewMatrix());
        }
    }

    /* renamed from: b */
    protected void m28678b(float f, float f2) {
        m28690a(f, f2);
        setImageMatrix(getImageViewMatrix());
    }

    /* renamed from: c */
    protected void m28677c() {
        m28679b(f12580n);
    }

    /* renamed from: c */
    protected void m28676c(float f) {
        if (this.f12584c.m28669b() == null) {
            return;
        }
        float width = getWidth() / 2.0f;
        float height = getHeight() / 2.0f;
        Matrix matrix = new Matrix(this.f12583b);
        matrix.postScale(1.0f / f, 1.0f / f, width, height);
        if (m28685a(matrix) < 1.0f) {
            this.f12583b.setScale(1.0f, 1.0f, width, height);
        } else {
            this.f12583b.postScale(1.0f / f, 1.0f / f, width, height);
        }
        setImageMatrix(getImageViewMatrix());
        m28681a(true, true);
    }

    /* renamed from: d */
    protected void m28675d() {
        m28676c(f12580n);
    }

    protected Matrix getImageViewMatrix() {
        this.f12592p.set(this.f12582a);
        this.f12592p.postConcat(this.f12583b);
        return this.f12592p;
    }

    public float getScale() {
        return m28685a(this.f12583b);
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i != 4 || getScale() <= 1.0f) {
            return super.onKeyDown(i, keyEvent);
        }
        m28691a(1.0f);
        return true;
    }

    @Override // android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.f12585d = i3 - i;
        this.f12586e = i4 - i2;
        Runnable runnable = this.f12595s;
        if (runnable != null) {
            this.f12595s = null;
            runnable.run();
        }
        if (this.f12584c.m28669b() != null) {
            m28683a(this.f12584c, this.f12582a);
            setImageMatrix(getImageViewMatrix());
        }
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        m28687a(bitmap, 0);
    }

    public void setRecycler(AbstractC3236a abstractC3236a) {
        this.f12594r = abstractC3236a;
    }
}
