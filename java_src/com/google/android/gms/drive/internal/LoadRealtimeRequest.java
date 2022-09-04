package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.drive.DriveId;
import java.util.List;
/* loaded from: classes2.dex */
public class LoadRealtimeRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<LoadRealtimeRequest> CREATOR = new C4977s();

    /* renamed from: a */
    final int f17735a;

    /* renamed from: b */
    final DriveId f17736b;

    /* renamed from: c */
    final boolean f17737c;

    /* renamed from: d */
    final List<String> f17738d;

    /* renamed from: e */
    final boolean f17739e;

    /* renamed from: f */
    final DataHolder f17740f;

    /* renamed from: g */
    final String f17741g;

    /* JADX INFO: Access modifiers changed from: package-private */
    public LoadRealtimeRequest(int i, DriveId driveId, boolean z, List<String> list, boolean z2, DataHolder dataHolder, String str) {
        this.f17735a = i;
        this.f17736b = driveId;
        this.f17737c = z;
        this.f17738d = list;
        this.f17739e = z2;
        this.f17740f = dataHolder;
        this.f17741g = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C4977s.m22247a(this, parcel, i);
    }
}
