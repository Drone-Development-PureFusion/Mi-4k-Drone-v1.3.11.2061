package com.google.android.gms.signin.internal;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.AbstractC4502m;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
/* loaded from: classes2.dex */
public class AuthAccountResult extends AbstractSafeParcelable implements AbstractC4502m {
    public static final Parcelable.Creator<AuthAccountResult> CREATOR = new C9006a();

    /* renamed from: a */
    final int f28640a;

    /* renamed from: b */
    private int f28641b;

    /* renamed from: c */
    private Intent f28642c;

    public AuthAccountResult() {
        this(0, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AuthAccountResult(int i, int i2, Intent intent) {
        this.f28640a = i;
        this.f28641b = i2;
        this.f28642c = intent;
    }

    public AuthAccountResult(int i, Intent intent) {
        this(2, i, intent);
    }

    @Override // com.google.android.gms.common.api.AbstractC4502m
    /* renamed from: a */
    public Status mo7645a() {
        return this.f28641b == 0 ? Status.f16786a : Status.f16790e;
    }

    /* renamed from: b */
    public int m9405b() {
        return this.f28641b;
    }

    /* renamed from: c */
    public Intent m9404c() {
        return this.f28642c;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C9006a.m9395a(this, parcel, i);
    }
}
