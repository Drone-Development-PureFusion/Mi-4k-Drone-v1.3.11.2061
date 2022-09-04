package com.google.android.gms.internal;

import java.io.IOException;
import java.io.StringWriter;
/* renamed from: com.google.android.gms.internal.nx */
/* loaded from: classes2.dex */
public abstract class AbstractC7471nx {
    /* renamed from: b */
    public Number mo14350b() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    /* renamed from: c */
    public String mo14348c() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    /* renamed from: d */
    public double mo14347d() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    /* renamed from: e */
    public long mo14346e() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    /* renamed from: f */
    public int mo14345f() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    /* renamed from: g */
    public boolean mo14344g() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    /* renamed from: h */
    public boolean m14371h() {
        return this instanceof C7468nu;
    }

    /* renamed from: i */
    public boolean m14370i() {
        return this instanceof C7475oa;
    }

    /* renamed from: j */
    public boolean m14369j() {
        return this instanceof C7478od;
    }

    /* renamed from: k */
    public boolean m14368k() {
        return this instanceof C7473nz;
    }

    /* renamed from: l */
    public C7475oa m14367l() {
        if (m14370i()) {
            return (C7475oa) this;
        }
        String valueOf = String.valueOf(this);
        throw new IllegalStateException(new StringBuilder(String.valueOf(valueOf).length() + 19).append("Not a JSON Object: ").append(valueOf).toString());
    }

    /* renamed from: m */
    public C7468nu m14366m() {
        if (m14371h()) {
            return (C7468nu) this;
        }
        throw new IllegalStateException("This is not a JSON Array.");
    }

    /* renamed from: n */
    public C7478od m14365n() {
        if (m14369j()) {
            return (C7478od) this;
        }
        throw new IllegalStateException("This is not a JSON Primitive.");
    }

    /* renamed from: o */
    Boolean mo14343o() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public String toString() {
        try {
            StringWriter stringWriter = new StringWriter();
            C7602ps c7602ps = new C7602ps(stringWriter);
            c7602ps.m14104b(true);
            C7527oz.m14271a(this, c7602ps);
            return stringWriter.toString();
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }
}
