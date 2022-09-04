package com.google.android.gms.drive.realtime.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.drive.realtime.internal.event.ParcelableEvent;
import java.util.List;
/* loaded from: classes2.dex */
public class ParcelableChangeInfo extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ParcelableChangeInfo> CREATOR = new C5104p();

    /* renamed from: a */
    final int f18114a;

    /* renamed from: b */
    final long f18115b;

    /* renamed from: c */
    final List<ParcelableEvent> f18116c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ParcelableChangeInfo(int i, long j, List<ParcelableEvent> list) {
        this.f18114a = i;
        this.f18115b = j;
        this.f18116c = list;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C5104p.m21816a(this, parcel, i);
    }
}
