package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
@Deprecated
/* loaded from: classes.dex */
public final class Address extends AbstractSafeParcelable {
    public static final Parcelable.Creator<Address> CREATOR = new C9359f();

    /* renamed from: a */
    String f29413a;

    /* renamed from: b */
    String f29414b;

    /* renamed from: c */
    String f29415c;

    /* renamed from: d */
    String f29416d;

    /* renamed from: e */
    String f29417e;

    /* renamed from: f */
    String f29418f;

    /* renamed from: g */
    String f29419g;

    /* renamed from: h */
    String f29420h;

    /* renamed from: i */
    String f29421i;

    /* renamed from: j */
    boolean f29422j;

    /* renamed from: k */
    String f29423k;

    /* renamed from: l */
    private final int f29424l;

    Address() {
        this.f29424l = 1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Address(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, boolean z, String str10) {
        this.f29424l = i;
        this.f29413a = str;
        this.f29414b = str2;
        this.f29415c = str3;
        this.f29416d = str4;
        this.f29417e = str5;
        this.f29418f = str6;
        this.f29419g = str7;
        this.f29420h = str8;
        this.f29421i = str9;
        this.f29422j = z;
        this.f29423k = str10;
    }

    /* renamed from: a */
    public int m8605a() {
        return this.f29424l;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C9359f.m8429a(this, parcel, i);
    }
}
