package com.google.ads;

import android.content.Context;
import com.google.android.gms.ads.C3446d;
import it.p273a.p274a.AbstractC10866e;
@Deprecated
/* renamed from: com.google.ads.b */
/* loaded from: classes.dex */
public final class C3395b {

    /* renamed from: a */
    public static final int f13639a = -1;

    /* renamed from: b */
    public static final int f13640b = -2;

    /* renamed from: c */
    public static final int f13641c = 32;

    /* renamed from: d */
    public static final int f13642d = 50;

    /* renamed from: e */
    public static final int f13643e = 90;

    /* renamed from: f */
    public static final C3395b f13644f = new C3395b(-1, -2, "mb");

    /* renamed from: g */
    public static final C3395b f13645g = new C3395b(320, 50, "mb");

    /* renamed from: h */
    public static final C3395b f13646h = new C3395b(300, AbstractC10866e.f34828G, "as");

    /* renamed from: i */
    public static final C3395b f13647i = new C3395b(468, 60, "as");

    /* renamed from: j */
    public static final C3395b f13648j = new C3395b(728, 90, "as");

    /* renamed from: k */
    public static final C3395b f13649k = new C3395b(160, 600, "as");

    /* renamed from: l */
    private final C3446d f13650l;

    public C3395b(int i, int i2) {
        this(new C3446d(i, i2));
    }

    private C3395b(int i, int i2, String str) {
        this(new C3446d(i, i2));
    }

    public C3395b(C3446d c3446d) {
        this.f13650l = c3446d;
    }

    /* renamed from: a */
    public int m27930a() {
        return this.f13650l.m27815b();
    }

    /* renamed from: a */
    public int m27928a(Context context) {
        return this.f13650l.m27814b(context);
    }

    /* renamed from: a */
    public C3395b m27927a(C3395b... c3395bArr) {
        int m27930a;
        int m27926b;
        float f;
        C3395b c3395b;
        C3395b c3395b2 = null;
        if (c3395bArr != null) {
            float f2 = 0.0f;
            int m27930a2 = m27930a();
            int m27926b2 = m27926b();
            int length = c3395bArr.length;
            int i = 0;
            while (i < length) {
                C3395b c3395b3 = c3395bArr[i];
                if (m27929a(c3395b3.m27930a(), c3395b3.m27926b())) {
                    f = (m27930a * m27926b) / (m27930a2 * m27926b2);
                    if (f > 1.0f) {
                        f = 1.0f / f;
                    }
                    if (f > f2) {
                        c3395b = c3395b3;
                        i++;
                        c3395b2 = c3395b;
                        f2 = f;
                    }
                }
                f = f2;
                c3395b = c3395b2;
                i++;
                c3395b2 = c3395b;
                f2 = f;
            }
        }
        return c3395b2;
    }

    /* renamed from: a */
    public boolean m27929a(int i, int i2) {
        int m27930a = m27930a();
        int m27926b = m27926b();
        return ((float) i) <= ((float) m27930a) * 1.25f && ((float) i) >= ((float) m27930a) * 0.8f && ((float) i2) <= ((float) m27926b) * 1.25f && ((float) i2) >= ((float) m27926b) * 0.8f;
    }

    /* renamed from: b */
    public int m27926b() {
        return this.f13650l.m27817a();
    }

    /* renamed from: b */
    public int m27925b(Context context) {
        return this.f13650l.m27816a(context);
    }

    /* renamed from: c */
    public boolean m27924c() {
        return this.f13650l.m27812d();
    }

    /* renamed from: d */
    public boolean m27923d() {
        return this.f13650l.m27813c();
    }

    /* renamed from: e */
    public boolean m27922e() {
        return false;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C3395b)) {
            return false;
        }
        return this.f13650l.equals(((C3395b) obj).f13650l);
    }

    public int hashCode() {
        return this.f13650l.hashCode();
    }

    public String toString() {
        return this.f13650l.toString();
    }
}
