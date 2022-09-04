package com.google.android.gms.drive;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
/* loaded from: classes2.dex */
public class UserMetadata extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<UserMetadata> CREATOR = new C4797aa();

    /* renamed from: a */
    final int f17541a;

    /* renamed from: b */
    final String f17542b;

    /* renamed from: c */
    final String f17543c;

    /* renamed from: d */
    final String f17544d;

    /* renamed from: e */
    final boolean f17545e;

    /* renamed from: f */
    final String f17546f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public UserMetadata(int i, String str, String str2, String str3, boolean z, String str4) {
        this.f17541a = i;
        this.f17542b = str;
        this.f17543c = str2;
        this.f17544d = str3;
        this.f17545e = z;
        this.f17546f = str4;
    }

    public UserMetadata(String str, String str2, String str3, boolean z, String str4) {
        this(1, str, str2, str3, z, str4);
    }

    public String toString() {
        return String.format("Permission ID: '%s', Display Name: '%s', Picture URL: '%s', Authenticated User: %b, Email: '%s'", this.f17542b, this.f17543c, this.f17544d, Boolean.valueOf(this.f17545e), this.f17546f);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C4797aa.m22702a(this, parcel, i);
    }
}
