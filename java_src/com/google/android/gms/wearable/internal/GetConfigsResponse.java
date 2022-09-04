package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.wearable.ConnectionConfiguration;
/* loaded from: classes2.dex */
public class GetConfigsResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator<GetConfigsResponse> CREATOR = new C9607q();

    /* renamed from: a */
    public final int f29954a;

    /* renamed from: b */
    public final int f29955b;

    /* renamed from: c */
    public final ConnectionConfiguration[] f29956c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public GetConfigsResponse(int i, int i2, ConnectionConfiguration[] connectionConfigurationArr) {
        this.f29954a = i;
        this.f29955b = i2;
        this.f29956c = connectionConfigurationArr;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C9607q.m7749a(this, parcel, i);
    }
}
