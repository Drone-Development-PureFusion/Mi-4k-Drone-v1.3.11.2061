package com.google.android.gms.vision.face;

import android.graphics.PointF;
import java.util.Arrays;
import java.util.List;
/* renamed from: com.google.android.gms.vision.face.a */
/* loaded from: classes2.dex */
public class C9286a {

    /* renamed from: a */
    public static final float f29284a = -1.0f;

    /* renamed from: b */
    private int f29285b;

    /* renamed from: c */
    private PointF f29286c;

    /* renamed from: d */
    private float f29287d;

    /* renamed from: e */
    private float f29288e;

    /* renamed from: f */
    private float f29289f;

    /* renamed from: g */
    private float f29290g;

    /* renamed from: h */
    private List<C9290c> f29291h;

    /* renamed from: i */
    private float f29292i;

    /* renamed from: j */
    private float f29293j;

    /* renamed from: k */
    private float f29294k;

    public C9286a(int i, PointF pointF, float f, float f2, float f3, float f4, C9290c[] c9290cArr, float f5, float f6, float f7) {
        this.f29285b = i;
        this.f29286c = pointF;
        this.f29287d = f;
        this.f29288e = f2;
        this.f29289f = f3;
        this.f29290g = f4;
        this.f29291h = Arrays.asList(c9290cArr);
        if (f5 < 0.0f || f5 > 1.0f) {
            this.f29292i = -1.0f;
        } else {
            this.f29292i = f5;
        }
        if (f6 < 0.0f || f6 > 1.0f) {
            this.f29293j = -1.0f;
        } else {
            this.f29293j = f6;
        }
        if (f7 < 0.0f || f7 > 1.0f) {
            this.f29294k = -1.0f;
        } else {
            this.f29294k = f7;
        }
    }

    /* renamed from: a */
    public PointF m8718a() {
        return new PointF(this.f29286c.x - (this.f29287d / 2.0f), this.f29286c.y - (this.f29288e / 2.0f));
    }

    /* renamed from: b */
    public float m8717b() {
        return this.f29287d;
    }

    /* renamed from: c */
    public float m8716c() {
        return this.f29288e;
    }

    /* renamed from: d */
    public float m8715d() {
        return this.f29289f;
    }

    /* renamed from: e */
    public float m8714e() {
        return this.f29290g;
    }

    /* renamed from: f */
    public List<C9290c> m8713f() {
        return this.f29291h;
    }

    /* renamed from: g */
    public float m8712g() {
        return this.f29292i;
    }

    /* renamed from: h */
    public float m8711h() {
        return this.f29293j;
    }

    /* renamed from: i */
    public float m8710i() {
        return this.f29294k;
    }

    /* renamed from: j */
    public int m8709j() {
        return this.f29285b;
    }
}
