package com.android.volley.toolbox;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.widget.ImageView;
import com.android.volley.AbstractC0916n;
import com.android.volley.AbstractC0928r;
import com.android.volley.C0904d;
import com.android.volley.C0912j;
import com.android.volley.C0914l;
import com.android.volley.C0924p;
import com.android.volley.C0968v;
/* renamed from: com.android.volley.toolbox.l */
/* loaded from: classes.dex */
public class C0958l extends AbstractC0916n<Bitmap> {

    /* renamed from: a */
    private static final int f2143a = 1000;

    /* renamed from: b */
    private static final int f2144b = 2;

    /* renamed from: c */
    private static final float f2145c = 2.0f;

    /* renamed from: i */
    private static final Object f2146i = new Object();

    /* renamed from: d */
    private final C0924p.AbstractC0926b<Bitmap> f2147d;

    /* renamed from: e */
    private final Bitmap.Config f2148e;

    /* renamed from: f */
    private final int f2149f;

    /* renamed from: g */
    private final int f2150g;

    /* renamed from: h */
    private ImageView.ScaleType f2151h;

    @Deprecated
    public C0958l(String str, C0924p.AbstractC0926b<Bitmap> abstractC0926b, int i, int i2, Bitmap.Config config, C0924p.AbstractC0925a abstractC0925a) {
        this(str, abstractC0926b, i, i2, ImageView.ScaleType.CENTER_INSIDE, config, abstractC0925a);
    }

    public C0958l(String str, C0924p.AbstractC0926b<Bitmap> abstractC0926b, int i, int i2, ImageView.ScaleType scaleType, Bitmap.Config config, C0924p.AbstractC0925a abstractC0925a) {
        super(0, str, abstractC0925a);
        a((AbstractC0928r) new C0904d(1000, 2, f2145c));
        this.f2147d = abstractC0926b;
        this.f2148e = config;
        this.f2149f = i;
        this.f2150g = i2;
        this.f2151h = scaleType;
    }

    /* renamed from: a */
    static int m37290a(int i, int i2, int i3, int i4) {
        double min = Math.min(i / i3, i2 / i4);
        float f = 1.0f;
        while (f * f2145c <= min) {
            f *= f2145c;
        }
        return (int) f;
    }

    /* renamed from: a */
    private static int m37289a(int i, int i2, int i3, int i4, ImageView.ScaleType scaleType) {
        if (i == 0 && i2 == 0) {
            return i3;
        }
        if (scaleType == ImageView.ScaleType.FIT_XY) {
            return i == 0 ? i3 : i;
        } else if (i == 0) {
            return (int) ((i2 / i4) * i3);
        } else {
            if (i2 == 0) {
                return i;
            }
            double d = i4 / i3;
            return scaleType == ImageView.ScaleType.CENTER_CROP ? ((double) i) * d < ((double) i2) ? (int) (i2 / d) : i : ((double) i) * d > ((double) i2) ? (int) (i2 / d) : i;
        }
    }

    /* renamed from: b */
    private C0924p<Bitmap> m37287b(C0912j c0912j) {
        Bitmap bitmap;
        byte[] bArr = c0912j.f2015b;
        BitmapFactory.Options options = new BitmapFactory.Options();
        if (this.f2149f == 0 && this.f2150g == 0) {
            options.inPreferredConfig = this.f2148e;
            bitmap = BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
        } else {
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
            int i = options.outWidth;
            int i2 = options.outHeight;
            int m37289a = m37289a(this.f2149f, this.f2150g, i, i2, this.f2151h);
            int m37289a2 = m37289a(this.f2150g, this.f2149f, i2, i, this.f2151h);
            options.inJustDecodeBounds = false;
            options.inSampleSize = m37290a(i, i2, m37289a, m37289a2);
            Bitmap decodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
            if (decodeByteArray == null || (decodeByteArray.getWidth() <= m37289a && decodeByteArray.getHeight() <= m37289a2)) {
                bitmap = decodeByteArray;
            } else {
                bitmap = Bitmap.createScaledBitmap(decodeByteArray, m37289a, m37289a2, true);
                decodeByteArray.recycle();
            }
        }
        return bitmap == null ? C0924p.m37383a(new C0914l(c0912j)) : C0924p.m37382a(bitmap, C0945h.m37331a(c0912j));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.android.volley.AbstractC0916n
    /* renamed from: a */
    public C0924p<Bitmap> mo34917a(C0912j c0912j) {
        C0924p<Bitmap> m37383a;
        synchronized (f2146i) {
            try {
                m37383a = m37287b(c0912j);
            } catch (OutOfMemoryError e) {
                C0968v.m37258c("Caught OOM for %d byte image, url=%s", Integer.valueOf(c0912j.f2015b.length), g());
                m37383a = C0924p.m37383a(new C0914l(e));
            }
        }
        return m37383a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.android.volley.AbstractC0916n
    /* renamed from: a */
    public void mo34916b(Bitmap bitmap) {
        this.f2147d.mo34899a(bitmap);
    }

    @Override // com.android.volley.AbstractC0916n
    /* renamed from: x */
    public AbstractC0916n.EnumC0919b mo37286x() {
        return AbstractC0916n.EnumC0919b.LOW;
    }
}
