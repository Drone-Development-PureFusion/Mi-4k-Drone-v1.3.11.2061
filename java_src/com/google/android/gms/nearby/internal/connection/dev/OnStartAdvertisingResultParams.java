package com.google.android.gms.nearby.internal.connection.dev;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C4585c;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
/* loaded from: classes2.dex */
public final class OnStartAdvertisingResultParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator<OnStartAdvertisingResultParams> CREATOR = new C8776ae();

    /* renamed from: a */
    final int f28112a;

    /* renamed from: b */
    private final int f28113b;

    /* renamed from: c */
    private final String f28114c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public OnStartAdvertisingResultParams(int i, int i2, String str) {
        this.f28112a = i;
        this.f28113b = i2;
        this.f28114c = str;
    }

    /* renamed from: a */
    public int m10144a() {
        return this.f28113b;
    }

    /* renamed from: b */
    public String m10143b() {
        return this.f28114c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OnStartAdvertisingResultParams)) {
            return false;
        }
        OnStartAdvertisingResultParams onStartAdvertisingResultParams = (OnStartAdvertisingResultParams) obj;
        return this.f28112a == onStartAdvertisingResultParams.f28112a && C4585c.m23634a(Integer.valueOf(this.f28113b), Integer.valueOf(onStartAdvertisingResultParams.f28113b)) && C4585c.m23634a(this.f28114c, onStartAdvertisingResultParams.f28114c);
    }

    public int hashCode() {
        return C4585c.m23633a(Integer.valueOf(this.f28112a), Integer.valueOf(this.f28113b), this.f28114c);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C8776ae.m10097a(this, parcel, i);
    }
}
