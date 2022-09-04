package com.p120c.p121a.p129b.p133c;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import com.p120c.p121a.p129b.p130a.EnumC1301f;
import com.p120c.p121a.p129b.p135e.AbstractC1333a;
import com.p120c.p121a.p129b.p135e.C1334b;
/* renamed from: com.c.a.b.c.c */
/* loaded from: classes.dex */
public class C1316c implements AbstractC1314a {

    /* renamed from: a */
    protected final int f3348a;

    /* renamed from: b */
    protected final int f3349b;

    /* renamed from: com.c.a.b.c.c$a */
    /* loaded from: classes.dex */
    public static class C1317a extends Drawable {

        /* renamed from: a */
        protected final float f3350a;

        /* renamed from: b */
        protected final int f3351b;

        /* renamed from: d */
        protected final RectF f3353d;

        /* renamed from: e */
        protected final BitmapShader f3354e;

        /* renamed from: c */
        protected final RectF f3352c = new RectF();

        /* renamed from: f */
        protected final Paint f3355f = new Paint();

        public C1317a(Bitmap bitmap, int i, int i2) {
            this.f3350a = i;
            this.f3351b = i2;
            this.f3354e = new BitmapShader(bitmap, Shader.TileMode.CLAMP, Shader.TileMode.CLAMP);
            this.f3353d = new RectF(i2, i2, bitmap.getWidth() - i2, bitmap.getHeight() - i2);
            this.f3355f.setAntiAlias(true);
            this.f3355f.setShader(this.f3354e);
        }

        @Override // android.graphics.drawable.Drawable
        public void draw(Canvas canvas) {
            canvas.drawRoundRect(this.f3352c, this.f3350a, this.f3350a, this.f3355f);
        }

        @Override // android.graphics.drawable.Drawable
        public int getOpacity() {
            return -3;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.graphics.drawable.Drawable
        public void onBoundsChange(Rect rect) {
            super.onBoundsChange(rect);
            this.f3352c.set(this.f3351b, this.f3351b, rect.width() - this.f3351b, rect.height() - this.f3351b);
            Matrix matrix = new Matrix();
            matrix.setRectToRect(this.f3353d, this.f3352c, Matrix.ScaleToFit.FILL);
            this.f3354e.setLocalMatrix(matrix);
        }

        @Override // android.graphics.drawable.Drawable
        public void setAlpha(int i) {
            this.f3355f.setAlpha(i);
        }

        @Override // android.graphics.drawable.Drawable
        public void setColorFilter(ColorFilter colorFilter) {
            this.f3355f.setColorFilter(colorFilter);
        }
    }

    public C1316c(int i) {
        this(i, 0);
    }

    public C1316c(int i, int i2) {
        this.f3348a = i;
        this.f3349b = i2;
    }

    @Override // com.p120c.p121a.p129b.p133c.AbstractC1314a
    /* renamed from: a */
    public void mo35795a(Bitmap bitmap, AbstractC1333a abstractC1333a, EnumC1301f enumC1301f) {
        if (!(abstractC1333a instanceof C1334b)) {
            throw new IllegalArgumentException("ImageAware should wrap ImageView. ImageViewAware is expected.");
        }
        abstractC1333a.mo35683a(new C1317a(bitmap, this.f3348a, this.f3349b));
    }
}
