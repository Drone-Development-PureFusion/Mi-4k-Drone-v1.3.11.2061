package com.google.android.gms.nearby.connection.dev;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C4628a;
import com.google.android.gms.common.internal.safeparcel.C4630b;
/* renamed from: com.google.android.gms.nearby.connection.dev.a */
/* loaded from: classes2.dex */
public class C8764a implements Parcelable.Creator<AdvertisingOptions> {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m10181a(AdvertisingOptions advertisingOptions, Parcel parcel, int i) {
        int m23480a = C4630b.m23480a(parcel);
        C4630b.m23470a(parcel, 1, (Parcelable) advertisingOptions.m10196a(), i, false);
        C4630b.m23464a(parcel, 2, advertisingOptions.m10195b(), false);
        C4630b.m23475a(parcel, 1000, advertisingOptions.f28060a);
        C4630b.m23479a(parcel, m23480a);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public AdvertisingOptions createFromParcel(Parcel parcel) {
        Strategy strategy;
        int m23500g;
        String str;
        String str2 = null;
        int m23508b = C4628a.m23508b(parcel);
        int i = 0;
        Strategy strategy2 = null;
        while (parcel.dataPosition() < m23508b) {
            int m23514a = C4628a.m23514a(parcel);
            switch (C4628a.m23515a(m23514a)) {
                case 1:
                    Strategy strategy3 = (Strategy) C4628a.m23510a(parcel, m23514a, Strategy.CREATOR);
                    m23500g = i;
                    str = str2;
                    strategy = strategy3;
                    break;
                case 2:
                    str = C4628a.m23490q(parcel, m23514a);
                    strategy = strategy2;
                    m23500g = i;
                    break;
                case 1000:
                    String str3 = str2;
                    strategy = strategy2;
                    m23500g = C4628a.m23500g(parcel, m23514a);
                    str = str3;
                    break;
                default:
                    C4628a.m23507b(parcel, m23514a);
                    str = str2;
                    strategy = strategy2;
                    m23500g = i;
                    break;
            }
            i = m23500g;
            strategy2 = strategy;
            str2 = str;
        }
        if (parcel.dataPosition() != m23508b) {
            throw new C4628a.C4629a(new StringBuilder(37).append("Overread allowed size end=").append(m23508b).toString(), parcel);
        }
        return new AdvertisingOptions(i, strategy2, str2);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public AdvertisingOptions[] newArray(int i) {
        return new AdvertisingOptions[i];
    }
}
