package com.google.android.gms.ads.internal.cache;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C4628a;
import com.google.android.gms.common.internal.safeparcel.C4630b;
/* renamed from: com.google.android.gms.ads.internal.cache.d */
/* loaded from: classes2.dex */
public class C3495d implements Parcelable.Creator<CacheOffering> {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m27644a(CacheOffering cacheOffering, Parcel parcel, int i) {
        int m23480a = C4630b.m23480a(parcel);
        C4630b.m23475a(parcel, 1, cacheOffering.f13827a);
        C4630b.m23464a(parcel, 2, cacheOffering.f13828b, false);
        C4630b.m23474a(parcel, 3, cacheOffering.f13829c);
        C4630b.m23464a(parcel, 4, cacheOffering.f13830d, false);
        C4630b.m23464a(parcel, 5, cacheOffering.f13831e, false);
        C4630b.m23464a(parcel, 6, cacheOffering.f13832f, false);
        C4630b.m23473a(parcel, 7, cacheOffering.f13833g, false);
        C4630b.m23461a(parcel, 8, cacheOffering.f13834h);
        C4630b.m23479a(parcel, m23480a);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public CacheOffering createFromParcel(Parcel parcel) {
        boolean z = false;
        Bundle bundle = null;
        int m23508b = C4628a.m23508b(parcel);
        long j = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        int i = 0;
        while (parcel.dataPosition() < m23508b) {
            int m23514a = C4628a.m23514a(parcel);
            switch (C4628a.m23515a(m23514a)) {
                case 1:
                    i = C4628a.m23500g(parcel, m23514a);
                    break;
                case 2:
                    str4 = C4628a.m23490q(parcel, m23514a);
                    break;
                case 3:
                    j = C4628a.m23498i(parcel, m23514a);
                    break;
                case 4:
                    str3 = C4628a.m23490q(parcel, m23514a);
                    break;
                case 5:
                    str2 = C4628a.m23490q(parcel, m23514a);
                    break;
                case 6:
                    str = C4628a.m23490q(parcel, m23514a);
                    break;
                case 7:
                    bundle = C4628a.m23488s(parcel, m23514a);
                    break;
                case 8:
                    z = C4628a.m23505c(parcel, m23514a);
                    break;
                default:
                    C4628a.m23507b(parcel, m23514a);
                    break;
            }
        }
        if (parcel.dataPosition() != m23508b) {
            throw new C4628a.C4629a(new StringBuilder(37).append("Overread allowed size end=").append(m23508b).toString(), parcel);
        }
        return new CacheOffering(i, str4, j, str3, str2, str, bundle, z);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public CacheOffering[] newArray(int i) {
        return new CacheOffering[i];
    }
}
