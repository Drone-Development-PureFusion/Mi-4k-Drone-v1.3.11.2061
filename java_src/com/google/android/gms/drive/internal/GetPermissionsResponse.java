package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.drive.Permission;
import java.util.List;
/* loaded from: classes2.dex */
public class GetPermissionsResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator<GetPermissionsResponse> CREATOR = new C4963m();

    /* renamed from: a */
    final int f17730a;

    /* renamed from: b */
    final List<Permission> f17731b;

    /* renamed from: c */
    final int f17732c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public GetPermissionsResponse(int i, List<Permission> list, int i2) {
        this.f17730a = i;
        this.f17731b = list;
        this.f17732c = i2;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C4963m.m22327a(this, parcel, i);
    }
}
