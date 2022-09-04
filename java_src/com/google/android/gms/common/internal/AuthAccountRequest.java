package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
/* loaded from: classes2.dex */
public class AuthAccountRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<AuthAccountRequest> CREATOR = new C4599o();

    /* renamed from: a */
    final int f16984a;

    /* renamed from: b */
    final IBinder f16985b;

    /* renamed from: c */
    final Scope[] f16986c;

    /* renamed from: d */
    Integer f16987d;

    /* renamed from: e */
    Integer f16988e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AuthAccountRequest(int i, IBinder iBinder, Scope[] scopeArr, Integer num, Integer num2) {
        this.f16984a = i;
        this.f16985b = iBinder;
        this.f16986c = scopeArr;
        this.f16987d = num;
        this.f16988e = num2;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C4599o.m23588a(this, parcel, i);
    }
}
