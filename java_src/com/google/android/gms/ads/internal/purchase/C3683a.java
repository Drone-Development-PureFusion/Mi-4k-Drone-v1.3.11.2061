package com.google.android.gms.ads.internal.purchase;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C4628a;
import com.google.android.gms.common.internal.safeparcel.C4630b;
/* renamed from: com.google.android.gms.ads.internal.purchase.a */
/* loaded from: classes2.dex */
public class C3683a implements Parcelable.Creator<GInAppPurchaseManagerInfoParcel> {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m27110a(GInAppPurchaseManagerInfoParcel gInAppPurchaseManagerInfoParcel, Parcel parcel, int i) {
        int m23480a = C4630b.m23480a(parcel);
        C4630b.m23475a(parcel, 1, gInAppPurchaseManagerInfoParcel.f14400a);
        C4630b.m23472a(parcel, 3, gInAppPurchaseManagerInfoParcel.m27115b(), false);
        C4630b.m23472a(parcel, 4, gInAppPurchaseManagerInfoParcel.m27114c(), false);
        C4630b.m23472a(parcel, 5, gInAppPurchaseManagerInfoParcel.m27113d(), false);
        C4630b.m23472a(parcel, 6, gInAppPurchaseManagerInfoParcel.m27118a(), false);
        C4630b.m23479a(parcel, m23480a);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public GInAppPurchaseManagerInfoParcel createFromParcel(Parcel parcel) {
        IBinder iBinder = null;
        int m23508b = C4628a.m23508b(parcel);
        int i = 0;
        IBinder iBinder2 = null;
        IBinder iBinder3 = null;
        IBinder iBinder4 = null;
        while (parcel.dataPosition() < m23508b) {
            int m23514a = C4628a.m23514a(parcel);
            switch (C4628a.m23515a(m23514a)) {
                case 1:
                    i = C4628a.m23500g(parcel, m23514a);
                    break;
                case 2:
                default:
                    C4628a.m23507b(parcel, m23514a);
                    break;
                case 3:
                    iBinder4 = C4628a.m23489r(parcel, m23514a);
                    break;
                case 4:
                    iBinder3 = C4628a.m23489r(parcel, m23514a);
                    break;
                case 5:
                    iBinder2 = C4628a.m23489r(parcel, m23514a);
                    break;
                case 6:
                    iBinder = C4628a.m23489r(parcel, m23514a);
                    break;
            }
        }
        if (parcel.dataPosition() != m23508b) {
            throw new C4628a.C4629a(new StringBuilder(37).append("Overread allowed size end=").append(m23508b).toString(), parcel);
        }
        return new GInAppPurchaseManagerInfoParcel(i, iBinder4, iBinder3, iBinder2, iBinder);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public GInAppPurchaseManagerInfoParcel[] newArray(int i) {
        return new GInAppPurchaseManagerInfoParcel[i];
    }
}
