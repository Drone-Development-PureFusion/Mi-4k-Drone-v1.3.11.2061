package com.google.android.gms.drive.realtime.internal.event;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.drive.realtime.internal.ParcelableChangeInfo;
import java.util.List;
/* loaded from: classes2.dex */
public class ParcelableEventList extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ParcelableEventList> CREATOR = new C5066d();

    /* renamed from: a */
    final int f18156a;

    /* renamed from: b */
    final List<ParcelableEvent> f18157b;

    /* renamed from: c */
    final DataHolder f18158c;

    /* renamed from: d */
    final boolean f18159d;

    /* renamed from: e */
    final List<String> f18160e;

    /* renamed from: f */
    final ParcelableChangeInfo f18161f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ParcelableEventList(int i, List<ParcelableEvent> list, DataHolder dataHolder, boolean z, List<String> list2, ParcelableChangeInfo parcelableChangeInfo) {
        this.f18156a = i;
        this.f18157b = list;
        this.f18158c = dataHolder;
        this.f18159d = z;
        this.f18160e = list2;
        this.f18161f = parcelableChangeInfo;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C5066d.m21917a(this, parcel, i);
    }
}
