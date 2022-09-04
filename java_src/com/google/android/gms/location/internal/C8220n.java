package com.google.android.gms.location.internal;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C4628a;
import com.google.android.gms.common.internal.safeparcel.C4630b;
/* renamed from: com.google.android.gms.location.internal.n */
/* loaded from: classes2.dex */
public class C8220n implements Parcelable.Creator<LocationRequestUpdateData> {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m12390a(LocationRequestUpdateData locationRequestUpdateData, Parcel parcel, int i) {
        int m23480a = C4630b.m23480a(parcel);
        C4630b.m23475a(parcel, 1, locationRequestUpdateData.f26747a);
        C4630b.m23470a(parcel, 2, (Parcelable) locationRequestUpdateData.f26748b, i, false);
        C4630b.m23472a(parcel, 3, locationRequestUpdateData.m12538b(), false);
        C4630b.m23470a(parcel, 4, (Parcelable) locationRequestUpdateData.f26750d, i, false);
        C4630b.m23472a(parcel, 5, locationRequestUpdateData.m12537c(), false);
        C4630b.m23472a(parcel, 6, locationRequestUpdateData.m12536d(), false);
        C4630b.m23475a(parcel, 1000, locationRequestUpdateData.m12545a());
        C4630b.m23479a(parcel, m23480a);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public LocationRequestUpdateData createFromParcel(Parcel parcel) {
        IBinder iBinder = null;
        int m23508b = C4628a.m23508b(parcel);
        int i = 0;
        int i2 = 1;
        IBinder iBinder2 = null;
        PendingIntent pendingIntent = null;
        IBinder iBinder3 = null;
        LocationRequestInternal locationRequestInternal = null;
        while (parcel.dataPosition() < m23508b) {
            int m23514a = C4628a.m23514a(parcel);
            switch (C4628a.m23515a(m23514a)) {
                case 1:
                    i2 = C4628a.m23500g(parcel, m23514a);
                    break;
                case 2:
                    locationRequestInternal = (LocationRequestInternal) C4628a.m23510a(parcel, m23514a, LocationRequestInternal.CREATOR);
                    break;
                case 3:
                    iBinder3 = C4628a.m23489r(parcel, m23514a);
                    break;
                case 4:
                    pendingIntent = (PendingIntent) C4628a.m23510a(parcel, m23514a, PendingIntent.CREATOR);
                    break;
                case 5:
                    iBinder2 = C4628a.m23489r(parcel, m23514a);
                    break;
                case 6:
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
        return new LocationRequestUpdateData(i, i2, locationRequestInternal, iBinder3, pendingIntent, iBinder2, iBinder);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public LocationRequestUpdateData[] newArray(int i) {
        return new LocationRequestUpdateData[i];
    }
}
