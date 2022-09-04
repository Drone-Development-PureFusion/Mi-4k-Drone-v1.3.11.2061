package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
/* loaded from: classes2.dex */
public class PackageStorageInfo extends AbstractSafeParcelable {
    public static final Parcelable.Creator<PackageStorageInfo> CREATOR = new C9495ag();

    /* renamed from: a */
    public final int f29982a;

    /* renamed from: b */
    public final String f29983b;

    /* renamed from: c */
    public final String f29984c;

    /* renamed from: d */
    public final long f29985d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public PackageStorageInfo(int i, String str, String str2, long j) {
        this.f29982a = i;
        this.f29983b = str;
        this.f29984c = str2;
        this.f29985d = j;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C9495ag.m8007a(this, parcel, i);
    }
}
