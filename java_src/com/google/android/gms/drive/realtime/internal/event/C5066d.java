package com.google.android.gms.drive.realtime.internal.event;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.safeparcel.C4628a;
import com.google.android.gms.common.internal.safeparcel.C4630b;
import com.google.android.gms.drive.realtime.internal.ParcelableChangeInfo;
import java.util.ArrayList;
/* renamed from: com.google.android.gms.drive.realtime.internal.event.d */
/* loaded from: classes2.dex */
public class C5066d implements Parcelable.Creator<ParcelableEventList> {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m21917a(ParcelableEventList parcelableEventList, Parcel parcel, int i) {
        int m23480a = C4630b.m23480a(parcel);
        C4630b.m23475a(parcel, 1, parcelableEventList.f18156a);
        C4630b.m23447c(parcel, 2, parcelableEventList.f18157b, false);
        C4630b.m23470a(parcel, 3, (Parcelable) parcelableEventList.f18158c, i, false);
        C4630b.m23461a(parcel, 4, parcelableEventList.f18159d);
        C4630b.m23449b(parcel, 5, parcelableEventList.f18160e, false);
        C4630b.m23470a(parcel, 6, (Parcelable) parcelableEventList.f18161f, i, false);
        C4630b.m23479a(parcel, m23480a);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public ParcelableEventList createFromParcel(Parcel parcel) {
        boolean z = false;
        ParcelableChangeInfo parcelableChangeInfo = null;
        int m23508b = C4628a.m23508b(parcel);
        ArrayList<String> arrayList = null;
        DataHolder dataHolder = null;
        ArrayList arrayList2 = null;
        int i = 0;
        while (parcel.dataPosition() < m23508b) {
            int m23514a = C4628a.m23514a(parcel);
            switch (C4628a.m23515a(m23514a)) {
                case 1:
                    i = C4628a.m23500g(parcel, m23514a);
                    break;
                case 2:
                    arrayList2 = C4628a.m23504c(parcel, m23514a, ParcelableEvent.CREATOR);
                    break;
                case 3:
                    dataHolder = (DataHolder) C4628a.m23510a(parcel, m23514a, DataHolder.CREATOR);
                    break;
                case 4:
                    z = C4628a.m23505c(parcel, m23514a);
                    break;
                case 5:
                    arrayList = C4628a.m23518E(parcel, m23514a);
                    break;
                case 6:
                    parcelableChangeInfo = (ParcelableChangeInfo) C4628a.m23510a(parcel, m23514a, ParcelableChangeInfo.CREATOR);
                    break;
                default:
                    C4628a.m23507b(parcel, m23514a);
                    break;
            }
        }
        if (parcel.dataPosition() != m23508b) {
            throw new C4628a.C4629a(new StringBuilder(37).append("Overread allowed size end=").append(m23508b).toString(), parcel);
        }
        return new ParcelableEventList(i, arrayList2, dataHolder, z, arrayList, parcelableChangeInfo);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public ParcelableEventList[] newArray(int i) {
        return new ParcelableEventList[i];
    }
}
