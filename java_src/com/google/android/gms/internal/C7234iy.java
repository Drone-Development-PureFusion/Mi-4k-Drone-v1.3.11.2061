package com.google.android.gms.internal;
/* renamed from: com.google.android.gms.internal.iy */
/* loaded from: classes2.dex */
public class C7234iy {

    /* renamed from: a */
    private final long f24291a;

    /* renamed from: b */
    private final C7160ij f24292b;

    /* renamed from: c */
    private final AbstractC7344lh f24293c;

    /* renamed from: d */
    private final C7142ia f24294d;

    /* renamed from: e */
    private final boolean f24295e;

    public C7234iy(long j, C7160ij c7160ij, C7142ia c7142ia) {
        this.f24291a = j;
        this.f24292b = c7160ij;
        this.f24293c = null;
        this.f24294d = c7142ia;
        this.f24295e = true;
    }

    public C7234iy(long j, C7160ij c7160ij, AbstractC7344lh abstractC7344lh, boolean z) {
        this.f24291a = j;
        this.f24292b = c7160ij;
        this.f24293c = abstractC7344lh;
        this.f24294d = null;
        this.f24295e = z;
    }

    /* renamed from: a */
    public long m15154a() {
        return this.f24291a;
    }

    /* renamed from: b */
    public C7160ij m15153b() {
        return this.f24292b;
    }

    /* renamed from: c */
    public AbstractC7344lh m15152c() {
        if (this.f24293c == null) {
            throw new IllegalArgumentException("Can't access overwrite when write is a merge!");
        }
        return this.f24293c;
    }

    /* renamed from: d */
    public C7142ia m15151d() {
        if (this.f24294d == null) {
            throw new IllegalArgumentException("Can't access merge when write is an overwrite!");
        }
        return this.f24294d;
    }

    /* renamed from: e */
    public boolean m15150e() {
        return this.f24293c != null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C7234iy c7234iy = (C7234iy) obj;
        if (this.f24291a == c7234iy.f24291a && this.f24292b.equals(c7234iy.f24292b) && this.f24295e == c7234iy.f24295e) {
            if (this.f24293c == null ? c7234iy.f24293c != null : !this.f24293c.equals(c7234iy.f24293c)) {
                return false;
            }
            if (this.f24294d != null) {
                if (this.f24294d.equals(c7234iy.f24294d)) {
                    return true;
                }
            } else if (c7234iy.f24294d == null) {
                return true;
            }
            return false;
        }
        return false;
    }

    /* renamed from: f */
    public boolean m15149f() {
        return this.f24295e;
    }

    public int hashCode() {
        int i = 0;
        int hashCode = ((this.f24293c != null ? this.f24293c.hashCode() : 0) + (((((Long.valueOf(this.f24291a).hashCode() * 31) + Boolean.valueOf(this.f24295e).hashCode()) * 31) + this.f24292b.hashCode()) * 31)) * 31;
        if (this.f24294d != null) {
            i = this.f24294d.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        long j = this.f24291a;
        String valueOf = String.valueOf(this.f24292b);
        boolean z = this.f24295e;
        String valueOf2 = String.valueOf(this.f24293c);
        String valueOf3 = String.valueOf(this.f24294d);
        return new StringBuilder(String.valueOf(valueOf).length() + 78 + String.valueOf(valueOf2).length() + String.valueOf(valueOf3).length()).append("UserWriteRecord{id=").append(j).append(" path=").append(valueOf).append(" visible=").append(z).append(" overwrite=").append(valueOf2).append(" merge=").append(valueOf3).append("}").toString();
    }
}
