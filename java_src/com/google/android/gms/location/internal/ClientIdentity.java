package com.google.android.gms.location.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.C4585c;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
/* loaded from: classes2.dex */
public class ClientIdentity extends AbstractSafeParcelable {
    public static final C8178c CREATOR = new C8178c();

    /* renamed from: a */
    public final int f26733a;

    /* renamed from: b */
    public final String f26734b;

    /* renamed from: c */
    private final int f26735c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ClientIdentity(int i, int i2, String str) {
        this.f26735c = i;
        this.f26733a = i2;
        this.f26734b = str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public int m12550a() {
        return this.f26735c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || !(obj instanceof ClientIdentity)) {
            return false;
        }
        ClientIdentity clientIdentity = (ClientIdentity) obj;
        return clientIdentity.f26733a == this.f26733a && C4585c.m23634a(clientIdentity.f26734b, this.f26734b);
    }

    public int hashCode() {
        return this.f26733a;
    }

    public String toString() {
        return String.format("%d:%s", Integer.valueOf(this.f26733a), this.f26734b);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C8178c.m12509a(this, parcel, i);
    }
}
