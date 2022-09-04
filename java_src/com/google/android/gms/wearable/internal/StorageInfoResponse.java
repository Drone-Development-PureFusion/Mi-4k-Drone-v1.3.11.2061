package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.List;
/* loaded from: classes2.dex */
public class StorageInfoResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator<StorageInfoResponse> CREATOR = new C9502an();

    /* renamed from: a */
    public final int f29996a;

    /* renamed from: b */
    public final int f29997b;

    /* renamed from: c */
    public final long f29998c;

    /* renamed from: d */
    public final List<PackageStorageInfo> f29999d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public StorageInfoResponse(int i, int i2, long j, List<PackageStorageInfo> list) {
        this.f29996a = i;
        this.f29997b = i2;
        this.f29998c = j;
        this.f29999d = list;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C9502an.m7987a(this, parcel, i);
    }
}
