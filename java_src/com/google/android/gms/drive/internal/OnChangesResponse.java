package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.drive.ChangeSequenceNumber;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.WriteAwareParcelable;
import java.util.List;
/* loaded from: classes2.dex */
public class OnChangesResponse extends WriteAwareParcelable {
    public static final Parcelable.Creator<OnChangesResponse> CREATOR = new C4978t();

    /* renamed from: a */
    final int f17742a;

    /* renamed from: b */
    final DataHolder f17743b;

    /* renamed from: c */
    final List<DriveId> f17744c;

    /* renamed from: d */
    final ChangeSequenceNumber f17745d;

    /* renamed from: e */
    final boolean f17746e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public OnChangesResponse(int i, DataHolder dataHolder, List<DriveId> list, ChangeSequenceNumber changeSequenceNumber, boolean z) {
        this.f17742a = i;
        this.f17743b = dataHolder;
        this.f17744c = list;
        this.f17745d = changeSequenceNumber;
        this.f17746e = z;
    }

    @Override // com.google.android.gms.drive.WriteAwareParcelable
    /* renamed from: a */
    protected void mo22607a(Parcel parcel, int i) {
        C4978t.m22244a(this, parcel, i | 1);
    }
}
