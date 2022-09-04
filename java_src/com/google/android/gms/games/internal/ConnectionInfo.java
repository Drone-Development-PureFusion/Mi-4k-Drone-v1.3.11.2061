package com.google.android.gms.games.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
/* loaded from: classes2.dex */
public class ConnectionInfo implements SafeParcelable {
    public static final C5668c CREATOR = new C5668c();

    /* renamed from: a */
    private final int f19537a;

    /* renamed from: b */
    private final String f19538b;

    /* renamed from: c */
    private final int f19539c;

    public ConnectionInfo(int i, String str, int i2) {
        this.f19537a = i;
        this.f19538b = str;
        this.f19539c = i2;
    }

    /* renamed from: a */
    public int m20454a() {
        return this.f19537a;
    }

    /* renamed from: b */
    public String m20453b() {
        return this.f19538b;
    }

    /* renamed from: c */
    public int m20452c() {
        return this.f19539c;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C5668c.m20220a(this, parcel, i);
    }
}
