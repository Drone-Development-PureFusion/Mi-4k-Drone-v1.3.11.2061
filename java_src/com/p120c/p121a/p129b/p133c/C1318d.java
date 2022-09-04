package com.p120c.p121a.p129b.p133c;

import android.graphics.Bitmap;
import android.graphics.ComposeShader;
import android.graphics.Matrix;
import android.graphics.PorterDuff;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.Shader;
import com.p120c.p121a.p129b.p130a.EnumC1301f;
import com.p120c.p121a.p129b.p133c.C1316c;
import com.p120c.p121a.p129b.p135e.AbstractC1333a;
import com.p120c.p121a.p129b.p135e.C1334b;
/* renamed from: com.c.a.b.c.d */
/* loaded from: classes.dex */
public class C1318d extends C1316c {

    /* renamed from: com.c.a.b.c.d$a */
    /* loaded from: classes.dex */
    protected static class C1319a extends C1316c.C1317a {
        C1319a(Bitmap bitmap, int i, int i2) {
            super(bitmap, i, i2);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.p120c.p121a.p129b.p133c.C1316c.C1317a, android.graphics.drawable.Drawable
        public void onBoundsChange(Rect rect) {
            super.onBoundsChange(rect);
            RadialGradient radialGradient = new RadialGradient(this.f3352c.centerX(), (this.f3352c.centerY() * 1.0f) / 0.7f, this.f3352c.centerX() * 1.3f, new int[]{0, 0, 2130706432}, new float[]{0.0f, 0.7f, 1.0f}, Shader.TileMode.CLAMP);
            Matrix matrix = new Matrix();
            matrix.setScale(1.0f, 0.7f);
            radialGradient.setLocalMatrix(matrix);
            this.f3355f.setShader(new ComposeShader(this.f3354e, radialGradient, PorterDuff.Mode.SRC_OVER));
        }
    }

    public C1318d(int i, int i2) {
        super(i, i2);
    }

    @Override // com.p120c.p121a.p129b.p133c.C1316c, com.p120c.p121a.p129b.p133c.AbstractC1314a
    /* renamed from: a */
    public void mo35795a(Bitmap bitmap, AbstractC1333a abstractC1333a, EnumC1301f enumC1301f) {
        if (!(abstractC1333a instanceof C1334b)) {
            throw new IllegalArgumentException("ImageAware should wrap ImageView. ImageViewAware is expected.");
        }
        abstractC1333a.mo35683a(new C1319a(bitmap, this.f3348a, this.f3349b));
    }
}
