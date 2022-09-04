package com.google.android.gms.games.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C4628a;
import com.google.android.gms.common.internal.safeparcel.C4630b;
/* renamed from: com.google.android.gms.games.internal.m */
/* loaded from: classes2.dex */
public class C5917m implements Parcelable.Creator<PopupLocationInfoParcelable> {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m19574a(PopupLocationInfoParcelable popupLocationInfoParcelable, Parcel parcel, int i) {
        int m23480a = C4630b.m23480a(parcel);
        C4630b.m23473a(parcel, 1, popupLocationInfoParcelable.m20449b(), false);
        C4630b.m23472a(parcel, 2, popupLocationInfoParcelable.m20448c(), false);
        C4630b.m23475a(parcel, 1000, popupLocationInfoParcelable.m20450a());
        C4630b.m23479a(parcel, m23480a);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public PopupLocationInfoParcelable createFromParcel(Parcel parcel) {
        IBinder iBinder = null;
        int m23508b = C4628a.m23508b(parcel);
        int i = 0;
        Bundle bundle = null;
        while (parcel.dataPosition() < m23508b) {
            int m23514a = C4628a.m23514a(parcel);
            switch (C4628a.m23515a(m23514a)) {
                case 1:
                    bundle = C4628a.m23488s(parcel, m23514a);
                    break;
                case 2:
                    iBinder = C4628a.m23489r(parcel, m23514a);
                    break;
                case 1000:
                    i = C4628a.m23500g(parcel, m23514a);
                    break;
                default:
                    C4628a.m23507b(parcel, m23514a);
                    break;
            }
        }
        if (parcel.dataPosition() != m23508b) {
            throw new C4628a.C4629a(new StringBuilder(37).append("Overread allowed size end=").append(m23508b).toString(), parcel);
        }
        return new PopupLocationInfoParcelable(i, bundle, iBinder);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public PopupLocationInfoParcelable[] newArray(int i) {
        return new PopupLocationInfoParcelable[i];
    }
}
