package com.fimi.soul.view.marknumberprogress;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.Log;
import android.util.TypedValue;
/* renamed from: com.fimi.soul.view.marknumberprogress.d */
/* loaded from: classes2.dex */
public class C3292d {

    /* renamed from: r */
    private static final float f13025r = 24.0f;

    /* renamed from: a */
    private float f13026a;

    /* renamed from: b */
    private Bitmap f13027b;

    /* renamed from: c */
    private Bitmap f13028c;

    /* renamed from: d */
    private float f13029d;

    /* renamed from: e */
    private float f13030e;

    /* renamed from: f */
    private float f13031f;

    /* renamed from: g */
    private float f13032g;

    /* renamed from: h */
    private boolean f13033h;

    /* renamed from: i */
    private int f13034i;

    /* renamed from: j */
    private float f13035j;

    /* renamed from: k */
    private Paint f13036k;

    /* renamed from: l */
    private Paint f13037l;

    /* renamed from: m */
    private float f13038m;

    /* renamed from: n */
    private boolean f13039n;

    /* renamed from: o */
    private int f13040o;

    /* renamed from: p */
    private int f13041p;

    /* renamed from: q */
    private int f13042q;

    /* renamed from: s */
    private int f13043s;

    /* renamed from: t */
    private int f13044t;

    public C3292d(Context context, int i, int i2, int i3, float f, int i4) {
        this.f13033h = false;
        Resources resources = context.getResources();
        this.f13036k = new Paint(1);
        this.f13036k.setColor(i2);
        this.f13037l = this.f13036k;
        this.f13039n = false;
        float f2 = i4;
        this.f13029d = f2;
        this.f13031f = f2;
        float f3 = i4;
        this.f13030e = f3;
        this.f13032g = f3;
        this.f13038m = i4 / 2.0f;
        this.f13026a = TypedValue.applyDimension(1, (int) Math.max((float) f13025r, f), resources.getDisplayMetrics());
        this.f13035j = this.f13029d;
        this.f13034i = i;
    }

    C3292d(Context context, int i, int i2, int i3, float f, int i4, int i5) {
        this.f13033h = false;
        Resources resources = context.getResources();
        this.f13027b = BitmapFactory.decodeResource(resources, i4);
        this.f13028c = BitmapFactory.decodeResource(resources, i5);
        if (f == -1.0f && i2 == -1 && i3 == -1) {
            this.f13039n = true;
        }
        this.f13042q = this.f13027b.getWidth();
        this.f13029d = this.f13027b.getWidth() / 2.0f;
        this.f13030e = this.f13027b.getHeight() / 2.0f;
        this.f13031f = this.f13028c.getWidth() / 2.0f;
        this.f13032g = this.f13028c.getHeight() / 2.0f;
        this.f13026a = TypedValue.applyDimension(1, (int) Math.max((float) f13025r, f), resources.getDisplayMetrics());
        this.f13035j = this.f13029d;
        this.f13034i = i;
    }

    /* renamed from: a */
    public float m28444a() {
        return this.f13034i;
    }

    /* renamed from: a */
    public void m28443a(float f) {
        this.f13035j = f;
    }

    /* renamed from: a */
    public void m28441a(int i) {
        this.f13034i = i;
    }

    /* renamed from: a */
    public void m28440a(Canvas canvas) {
        if (!this.f13039n) {
            if (this.f13033h) {
                canvas.drawCircle(this.f13035j, this.f13034i, this.f13038m, this.f13037l);
                return;
            } else {
                canvas.drawCircle(this.f13035j, this.f13034i, this.f13038m, this.f13036k);
                return;
            }
        }
        Bitmap bitmap = this.f13033h ? this.f13028c : this.f13027b;
        if (this.f13033h) {
            canvas.drawBitmap(bitmap, this.f13035j - this.f13031f, this.f13034i - this.f13032g, (Paint) null);
        } else {
            canvas.drawBitmap(bitmap, this.f13035j - this.f13029d, this.f13034i - this.f13030e, (Paint) null);
        }
    }

    /* renamed from: a */
    public boolean m28442a(float f, float f2) {
        Log.i("zdy", "" + (((float) this.f13043s) <= this.f13026a + f && f <= ((float) this.f13044t) + this.f13026a) + " " + (Math.abs(f2 - ((float) this.f13034i)) <= this.f13026a) + " " + this.f13043s + " " + f + " " + this.f13044t);
        return ((float) this.f13043s) - this.f13026a <= f && f <= ((float) this.f13044t) + this.f13026a && Math.abs(f2 - ((float) this.f13034i)) <= this.f13026a;
    }

    /* renamed from: b */
    public int m28439b() {
        return this.f13043s;
    }

    /* renamed from: b */
    public void m28438b(int i) {
        this.f13043s = i;
    }

    /* renamed from: c */
    public int m28437c() {
        return this.f13044t;
    }

    /* renamed from: c */
    public void m28436c(int i) {
        this.f13044t = i;
    }

    /* renamed from: d */
    public int m28435d() {
        return this.f13042q;
    }

    /* renamed from: e */
    public float m28434e() {
        return this.f13029d;
    }

    /* renamed from: f */
    public float m28433f() {
        return this.f13030e;
    }

    /* renamed from: g */
    public float m28432g() {
        return this.f13035j;
    }

    /* renamed from: h */
    public boolean m28431h() {
        return this.f13033h;
    }

    /* renamed from: i */
    public void m28430i() {
        this.f13033h = true;
    }

    /* renamed from: j */
    public void m28429j() {
        this.f13033h = false;
    }
}
