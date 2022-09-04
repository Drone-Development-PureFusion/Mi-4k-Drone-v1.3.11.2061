package com.google.android.gms.internal;
/* renamed from: com.google.android.gms.internal.js */
/* loaded from: classes2.dex */
public class C7263js {

    /* renamed from: a */
    public final long f24353a;

    /* renamed from: b */
    public final C7296kg f24354b;

    /* renamed from: c */
    public final long f24355c;

    /* renamed from: d */
    public final boolean f24356d;

    /* renamed from: e */
    public final boolean f24357e;

    public C7263js(long j, C7296kg c7296kg, long j2, boolean z, boolean z2) {
        this.f24353a = j;
        if (!c7296kg.m14894e() || c7296kg.m14895d()) {
            this.f24354b = c7296kg;
            this.f24355c = j2;
            this.f24356d = z;
            this.f24357e = z2;
            return;
        }
        throw new IllegalArgumentException("Can't create TrackedQuery for a non-default query that loads all data");
    }

    /* renamed from: a */
    public C7263js m15033a() {
        return new C7263js(this.f24353a, this.f24354b, this.f24355c, true, this.f24357e);
    }

    /* renamed from: a */
    public C7263js m15032a(long j) {
        return new C7263js(this.f24353a, this.f24354b, j, this.f24356d, this.f24357e);
    }

    /* renamed from: a */
    public C7263js m15031a(boolean z) {
        return new C7263js(this.f24353a, this.f24354b, this.f24355c, this.f24356d, z);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != getClass()) {
            return false;
        }
        C7263js c7263js = (C7263js) obj;
        return this.f24353a == c7263js.f24353a && this.f24354b.equals(c7263js.f24354b) && this.f24355c == c7263js.f24355c && this.f24356d == c7263js.f24356d && this.f24357e == c7263js.f24357e;
    }

    public int hashCode() {
        return (((((((Long.valueOf(this.f24353a).hashCode() * 31) + this.f24354b.hashCode()) * 31) + Long.valueOf(this.f24355c).hashCode()) * 31) + Boolean.valueOf(this.f24356d).hashCode()) * 31) + Boolean.valueOf(this.f24357e).hashCode();
    }

    public String toString() {
        long j = this.f24353a;
        String valueOf = String.valueOf(this.f24354b);
        long j2 = this.f24355c;
        boolean z = this.f24356d;
        return new StringBuilder(String.valueOf(valueOf).length() + 109).append("TrackedQuery{id=").append(j).append(", querySpec=").append(valueOf).append(", lastUse=").append(j2).append(", complete=").append(z).append(", active=").append(this.f24357e).append("}").toString();
    }
}
