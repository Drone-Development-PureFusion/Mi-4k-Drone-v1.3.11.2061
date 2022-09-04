package com.google.android.gms.internal;

import com.google.android.gms.common.api.C4467a;
import com.google.android.gms.common.api.C4467a.AbstractC4468a;
import com.google.android.gms.common.internal.C4585c;
/* loaded from: classes2.dex */
public final class ahh<O extends C4467a.AbstractC4468a> {

    /* renamed from: a */
    private final boolean f21727a = false;

    /* renamed from: b */
    private final int f21728b;

    /* renamed from: c */
    private final C4467a<O> f21729c;

    /* renamed from: d */
    private final O f21730d;

    private ahh(C4467a<O> c4467a, O o) {
        this.f21729c = c4467a;
        this.f21730d = o;
        this.f21728b = C4585c.m23633a(this.f21729c, this.f21730d);
    }

    /* renamed from: a */
    public static <O extends C4467a.AbstractC4468a> ahh<O> m17488a(C4467a<O> c4467a, O o) {
        return new ahh<>(c4467a, o);
    }

    /* renamed from: a */
    public String m17489a() {
        return this.f21729c.m24007f();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ahh)) {
            return false;
        }
        ahh ahhVar = (ahh) obj;
        return C4585c.m23634a(this.f21729c, ahhVar.f21729c) && C4585c.m23634a(this.f21730d, ahhVar.f21730d);
    }

    public int hashCode() {
        return this.f21728b;
    }
}
