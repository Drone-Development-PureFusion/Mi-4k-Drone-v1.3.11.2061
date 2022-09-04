package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
@Deprecated
/* loaded from: classes.dex */
public class ValidateAccountRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ValidateAccountRequest> CREATOR = new C4595k();

    /* renamed from: a */
    final int f17016a;

    /* renamed from: b */
    final IBinder f17017b;

    /* renamed from: c */
    private final int f17018c;

    /* renamed from: d */
    private final Scope[] f17019d;

    /* renamed from: e */
    private final Bundle f17020e;

    /* renamed from: f */
    private final String f17021f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ValidateAccountRequest(int i, int i2, IBinder iBinder, Scope[] scopeArr, Bundle bundle, String str) {
        this.f17016a = i;
        this.f17018c = i2;
        this.f17017b = iBinder;
        this.f17019d = scopeArr;
        this.f17020e = bundle;
        this.f17021f = str;
    }

    /* renamed from: a */
    public int m23720a() {
        return this.f17018c;
    }

    /* renamed from: b */
    public Scope[] m23719b() {
        return this.f17019d;
    }

    /* renamed from: c */
    public String m23718c() {
        return this.f17021f;
    }

    /* renamed from: d */
    public Bundle m23717d() {
        return this.f17020e;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C4595k.m23599a(this, parcel, i);
    }
}
