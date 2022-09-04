package com.fimi.soul.view.marknumberprogress;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.Log;
import android.util.TypedValue;
/* renamed from: com.fimi.soul.view.marknumberprogress.c */
/* loaded from: classes2.dex */
class C3291c {

    /* renamed from: r */
    private static final float f13005r = 24.0f;

    /* renamed from: a */
    private float f13006a;

    /* renamed from: b */
    private Bitmap f13007b;

    /* renamed from: c */
    private Bitmap f13008c;

    /* renamed from: d */
    private float f13009d;

    /* renamed from: e */
    private float f13010e;

    /* renamed from: f */
    private float f13011f;

    /* renamed from: g */
    private float f13012g;

    /* renamed from: h */
    private boolean f13013h;

    /* renamed from: i */
    private int f13014i;

    /* renamed from: j */
    private float f13015j;

    /* renamed from: k */
    private Paint f13016k;

    /* renamed from: l */
    private Paint f13017l;

    /* renamed from: m */
    private float f13018m;

    /* renamed from: n */
    private boolean f13019n;

    /* renamed from: o */
    private int f13020o;

    /* renamed from: p */
    private int f13021p;

    /* renamed from: q */
    private int f13022q;

    /* renamed from: s */
    private int f13023s;

    /* renamed from: t */
    private int f13024t;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C3291c(Context context, int i, int i2, int i3, float f, int i4) {
        this.f13013h = false;
        Resources resources = context.getResources();
        this.f13016k = new Paint(1);
        this.f13016k.setColor(i2);
        this.f13017l = this.f13016k;
        this.f13019n = false;
        float f2 = i4;
        this.f13009d = f2;
        this.f13011f = f2;
        float f3 = i4;
        this.f13010e = f3;
        this.f13012g = f3;
        this.f13018m = i4 / 2.0f;
        this.f13006a = TypedValue.applyDimension(1, (int) Math.max((float) f13005r, f), resources.getDisplayMetrics());
        this.f13015j = this.f13009d;
        this.f13014i = i;
    }

    C3291c(Context context, int i, int i2, int i3, float f, int i4, int i5) {
        this.f13013h = false;
        Resources resources = context.getResources();
        this.f13007b = BitmapFactory.decodeResource(resources, i4);
        this.f13008c = BitmapFactory.decodeResource(resources, i5);
        if (f == -1.0f && i2 == -1 && i3 == -1) {
            this.f13019n = true;
        }
        this.f13022q = this.f13007b.getWidth();
        this.f13009d = this.f13007b.getWidth() / 2.0f;
        this.f13010e = this.f13007b.getHeight() / 2.0f;
        this.f13011f = this.f13008c.getWidth() / 2.0f;
        this.f13012g = this.f13008c.getHeight() / 2.0f;
        this.f13006a = TypedValue.applyDimension(1, (int) Math.max((float) f13005r, f), resources.getDisplayMetrics());
        this.f13015j = this.f13009d;
        this.f13014i = i;
    }

    /* renamed from: a */
    public float m28460a() {
        return this.f13014i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m28459a(float f) {
        this.f13015j = f;
    }

    /* renamed from: a */
    public void m28457a(int i) {
        this.f13014i = i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m28456a(Canvas canvas) {
        if (!this.f13019n) {
            if (this.f13013h) {
                canvas.drawCircle(this.f13015j, this.f13014i, this.f13018m, this.f13017l);
                return;
            } else {
                canvas.drawCircle(this.f13015j, this.f13014i, this.f13018m, this.f13016k);
                return;
            }
        }
        Bitmap bitmap = this.f13013h ? this.f13008c : this.f13007b;
        if (this.f13013h) {
            canvas.drawBitmap(bitmap, this.f13015j - this.f13011f, this.f13014i - this.f13012g, (Paint) null);
        } else {
            canvas.drawBitmap(bitmap, this.f13015j - this.f13009d, this.f13014i - this.f13010e, (Paint) null);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean m28458a(float f, float f2) {
        Log.i("zdy", "" + (((float) this.f13023s) <= this.f13006a + f && f <= ((float) this.f13024t) + this.f13006a) + " " + (Math.abs(f2 - ((float) this.f13014i)) <= this.f13006a) + " " + this.f13023s + " " + f + " " + this.f13024t);
        return ((float) this.f13023s) - this.f13006a <= f && f <= ((float) this.f13024t) + this.f13006a && Math.abs(f2 - ((float) this.f13014i)) <= this.f13006a;
    }

    /* renamed from: b */
    public int m28455b() {
        return this.f13023s;
    }

    /* renamed from: b */
    public void m28454b(int i) {
        this.f13023s = i;
    }

    /* renamed from: c */
    public int m28453c() {
        return this.f13024t;
    }

    /* renamed from: c */
    public void m28452c(int i) {
        this.f13024t = i;
    }

    /* renamed from: d */
    public int m28451d() {
        return this.f13022q;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public float m28450e() {
        return this.f13009d;
    }

    /* renamed from: f */
    float m28449f() {
        return this.f13010e;
    }

    /* renamed from: g */
    float m28448g() {
        return this.f13015j;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public boolean m28447h() {
        return this.f13013h;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public void m28446i() {
        this.f13013h = true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public void m28445j() {
        this.f13013h = false;
    }
}
