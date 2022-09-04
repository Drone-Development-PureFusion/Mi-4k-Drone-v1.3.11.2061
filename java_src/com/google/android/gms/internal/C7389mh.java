package com.google.android.gms.internal;

import com.xiaomi.mipush.sdk.Constants;
/* renamed from: com.google.android.gms.internal.mh */
/* loaded from: classes2.dex */
public class C7389mh<T, U> {

    /* renamed from: a */
    private final T f24611a;

    /* renamed from: b */
    private final U f24612b;

    public C7389mh(T t, U u) {
        this.f24611a = t;
        this.f24612b = u;
    }

    /* renamed from: a */
    public T m14616a() {
        return this.f24611a;
    }

    /* renamed from: b */
    public U m14615b() {
        return this.f24612b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C7389mh c7389mh = (C7389mh) obj;
        if (this.f24611a == null ? c7389mh.f24611a != null : !this.f24611a.equals(c7389mh.f24611a)) {
            return false;
        }
        if (this.f24612b != null) {
            if (this.f24612b.equals(c7389mh.f24612b)) {
                return true;
            }
        } else if (c7389mh.f24612b == null) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i = 0;
        int hashCode = (this.f24611a != null ? this.f24611a.hashCode() : 0) * 31;
        if (this.f24612b != null) {
            i = this.f24612b.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        String valueOf = String.valueOf(this.f24611a);
        String valueOf2 = String.valueOf(this.f24612b);
        return new StringBuilder(String.valueOf(valueOf).length() + 7 + String.valueOf(valueOf2).length()).append("Pair(").append(valueOf).append(Constants.ACCEPT_TIME_SEPARATOR_SP).append(valueOf2).append(")").toString();
    }
}
