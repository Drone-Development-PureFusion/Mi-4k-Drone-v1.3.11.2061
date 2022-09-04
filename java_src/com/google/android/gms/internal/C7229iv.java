package com.google.android.gms.internal;
/* renamed from: com.google.android.gms.internal.iv */
/* loaded from: classes2.dex */
public class C7229iv {

    /* renamed from: a */
    private final long f24285a;

    public C7229iv(long j) {
        this.f24285a = j;
    }

    /* renamed from: a */
    public long m15161a() {
        return this.f24285a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.f24285a == ((C7229iv) obj).f24285a;
    }

    public int hashCode() {
        return (int) (this.f24285a ^ (this.f24285a >>> 32));
    }

    public String toString() {
        return new StringBuilder(35).append("Tag{tagNumber=").append(this.f24285a).append("}").toString();
    }
}
