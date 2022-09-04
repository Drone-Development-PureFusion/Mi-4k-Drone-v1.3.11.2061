package com.fimi.soul.view.cropimage;

import android.graphics.Bitmap;
import android.graphics.Matrix;
/* renamed from: com.fimi.soul.view.cropimage.a */
/* loaded from: classes2.dex */
public class C3237a {

    /* renamed from: a */
    public static final String f12606a = "RotateBitmap";

    /* renamed from: b */
    private Bitmap f12607b;

    /* renamed from: c */
    private int f12608c;

    public C3237a(Bitmap bitmap) {
        this.f12607b = bitmap;
        this.f12608c = 0;
    }

    public C3237a(Bitmap bitmap, int i) {
        this.f12607b = bitmap;
        this.f12608c = i % 360;
    }

    /* renamed from: a */
    public int m28672a() {
        return this.f12608c;
    }

    /* renamed from: a */
    public void m28671a(int i) {
        this.f12608c = i;
    }

    /* renamed from: a */
    public void m28670a(Bitmap bitmap) {
        this.f12607b = bitmap;
    }

    /* renamed from: b */
    public Bitmap m28669b() {
        return this.f12607b;
    }

    /* renamed from: c */
    public Matrix m28668c() {
        Matrix matrix = new Matrix();
        if (this.f12608c != 0) {
            matrix.preTranslate(-(this.f12607b.getWidth() / 2), -(this.f12607b.getHeight() / 2));
            matrix.postRotate(this.f12608c);
            matrix.postTranslate(m28665f() / 2, m28666e() / 2);
        }
        return matrix;
    }

    /* renamed from: d */
    public boolean m28667d() {
        return (this.f12608c / 90) % 2 != 0;
    }

    /* renamed from: e */
    public int m28666e() {
        return m28667d() ? this.f12607b.getWidth() : this.f12607b.getHeight();
    }

    /* renamed from: f */
    public int m28665f() {
        return m28667d() ? this.f12607b.getHeight() : this.f12607b.getWidth();
    }

    /* renamed from: g */
    public void m28664g() {
        if (this.f12607b != null) {
            this.f12607b.recycle();
            this.f12607b = null;
        }
    }
}
