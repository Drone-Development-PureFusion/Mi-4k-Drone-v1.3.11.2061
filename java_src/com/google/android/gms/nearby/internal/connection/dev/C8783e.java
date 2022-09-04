package com.google.android.gms.nearby.internal.connection.dev;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C4628a;
import com.google.android.gms.common.internal.safeparcel.C4630b;
import com.google.android.gms.nearby.connection.dev.AdvertisingOptions;
/* renamed from: com.google.android.gms.nearby.internal.connection.dev.e */
/* loaded from: classes2.dex */
public class C8783e implements Parcelable.Creator<StartAdvertisingParams> {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m10076a(StartAdvertisingParams startAdvertisingParams, Parcel parcel, int i) {
        int m23480a = C4630b.m23480a(parcel);
        C4630b.m23472a(parcel, 1, startAdvertisingParams.m10124a(), false);
        C4630b.m23472a(parcel, 2, startAdvertisingParams.m10123b(), false);
        C4630b.m23464a(parcel, 3, startAdvertisingParams.m10122c(), false);
        C4630b.m23474a(parcel, 4, startAdvertisingParams.m10121d());
        C4630b.m23470a(parcel, 5, (Parcelable) startAdvertisingParams.m10120e(), i, false);
        C4630b.m23475a(parcel, 1000, startAdvertisingParams.f28139a);
        C4630b.m23479a(parcel, m23480a);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public StartAdvertisingParams createFromParcel(Parcel parcel) {
        AdvertisingOptions advertisingOptions = null;
        int m23508b = C4628a.m23508b(parcel);
        int i = 0;
        long j = 0;
        String str = null;
        IBinder iBinder = null;
        IBinder iBinder2 = null;
        while (parcel.dataPosition() < m23508b) {
            int m23514a = C4628a.m23514a(parcel);
            switch (C4628a.m23515a(m23514a)) {
                case 1:
                    iBinder2 = C4628a.m23489r(parcel, m23514a);
                    break;
                case 2:
                    iBinder = C4628a.m23489r(parcel, m23514a);
                    break;
                case 3:
                    str = C4628a.m23490q(parcel, m23514a);
                    break;
                case 4:
                    j = C4628a.m23498i(parcel, m23514a);
                    break;
                case 5:
                    advertisingOptions = (AdvertisingOptions) C4628a.m23510a(parcel, m23514a, AdvertisingOptions.CREATOR);
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
        return new StartAdvertisingParams(i, iBinder2, iBinder, str, j, advertisingOptions);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public StartAdvertisingParams[] newArray(int i) {
        return new StartAdvertisingParams[i];
    }
}
