package com.google.android.gms.ads.internal.client;

import android.location.Location;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C4628a;
import com.google.android.gms.common.internal.safeparcel.C4630b;
import java.util.ArrayList;
/* renamed from: com.google.android.gms.ads.internal.client.x */
/* loaded from: classes2.dex */
public class C3585x implements Parcelable.Creator<AdRequestParcel> {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m27415a(AdRequestParcel adRequestParcel, Parcel parcel, int i) {
        int m23480a = C4630b.m23480a(parcel);
        C4630b.m23475a(parcel, 1, adRequestParcel.f13845a);
        C4630b.m23474a(parcel, 2, adRequestParcel.f13846b);
        C4630b.m23473a(parcel, 3, adRequestParcel.f13847c, false);
        C4630b.m23475a(parcel, 4, adRequestParcel.f13848d);
        C4630b.m23449b(parcel, 5, adRequestParcel.f13849e, false);
        C4630b.m23461a(parcel, 6, adRequestParcel.f13850f);
        C4630b.m23475a(parcel, 7, adRequestParcel.f13851g);
        C4630b.m23461a(parcel, 8, adRequestParcel.f13852h);
        C4630b.m23464a(parcel, 9, adRequestParcel.f13853i, false);
        C4630b.m23470a(parcel, 10, (Parcelable) adRequestParcel.f13854j, i, false);
        C4630b.m23470a(parcel, 11, (Parcelable) adRequestParcel.f13855k, i, false);
        C4630b.m23464a(parcel, 12, adRequestParcel.f13856l, false);
        C4630b.m23473a(parcel, 13, adRequestParcel.f13857m, false);
        C4630b.m23473a(parcel, 14, adRequestParcel.f13858n, false);
        C4630b.m23449b(parcel, 15, adRequestParcel.f13859o, false);
        C4630b.m23464a(parcel, 16, adRequestParcel.f13860p, false);
        C4630b.m23464a(parcel, 17, adRequestParcel.f13861q, false);
        C4630b.m23461a(parcel, 18, adRequestParcel.f13862r);
        C4630b.m23479a(parcel, m23480a);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public AdRequestParcel createFromParcel(Parcel parcel) {
        int m23508b = C4628a.m23508b(parcel);
        int i = 0;
        long j = 0;
        Bundle bundle = null;
        int i2 = 0;
        ArrayList<String> arrayList = null;
        boolean z = false;
        int i3 = 0;
        boolean z2 = false;
        String str = null;
        SearchAdRequestParcel searchAdRequestParcel = null;
        Location location = null;
        String str2 = null;
        Bundle bundle2 = null;
        Bundle bundle3 = null;
        ArrayList<String> arrayList2 = null;
        String str3 = null;
        String str4 = null;
        boolean z3 = false;
        while (parcel.dataPosition() < m23508b) {
            int m23514a = C4628a.m23514a(parcel);
            switch (C4628a.m23515a(m23514a)) {
                case 1:
                    i = C4628a.m23500g(parcel, m23514a);
                    break;
                case 2:
                    j = C4628a.m23498i(parcel, m23514a);
                    break;
                case 3:
                    bundle = C4628a.m23488s(parcel, m23514a);
                    break;
                case 4:
                    i2 = C4628a.m23500g(parcel, m23514a);
                    break;
                case 5:
                    arrayList = C4628a.m23518E(parcel, m23514a);
                    break;
                case 6:
                    z = C4628a.m23505c(parcel, m23514a);
                    break;
                case 7:
                    i3 = C4628a.m23500g(parcel, m23514a);
                    break;
                case 8:
                    z2 = C4628a.m23505c(parcel, m23514a);
                    break;
                case 9:
                    str = C4628a.m23490q(parcel, m23514a);
                    break;
                case 10:
                    searchAdRequestParcel = (SearchAdRequestParcel) C4628a.m23510a(parcel, m23514a, SearchAdRequestParcel.CREATOR);
                    break;
                case 11:
                    location = (Location) C4628a.m23510a(parcel, m23514a, Location.CREATOR);
                    break;
                case 12:
                    str2 = C4628a.m23490q(parcel, m23514a);
                    break;
                case 13:
                    bundle2 = C4628a.m23488s(parcel, m23514a);
                    break;
                case 14:
                    bundle3 = C4628a.m23488s(parcel, m23514a);
                    break;
                case 15:
                    arrayList2 = C4628a.m23518E(parcel, m23514a);
                    break;
                case 16:
                    str3 = C4628a.m23490q(parcel, m23514a);
                    break;
                case 17:
                    str4 = C4628a.m23490q(parcel, m23514a);
                    break;
                case 18:
                    z3 = C4628a.m23505c(parcel, m23514a);
                    break;
                default:
                    C4628a.m23507b(parcel, m23514a);
                    break;
            }
        }
        if (parcel.dataPosition() != m23508b) {
            throw new C4628a.C4629a(new StringBuilder(37).append("Overread allowed size end=").append(m23508b).toString(), parcel);
        }
        return new AdRequestParcel(i, j, bundle, i2, arrayList, z, i3, z2, str, searchAdRequestParcel, location, str2, bundle2, bundle3, arrayList2, str3, str4, z3);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public AdRequestParcel[] newArray(int i) {
        return new AdRequestParcel[i];
    }
}
