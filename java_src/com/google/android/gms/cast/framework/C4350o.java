package com.google.android.gms.cast.framework;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.cast.LaunchOptions;
import com.google.android.gms.cast.framework.media.CastMediaOptions;
import com.google.android.gms.common.internal.safeparcel.C4628a;
import com.google.android.gms.common.internal.safeparcel.C4630b;
import com.google.firebase.p253b.C9755a;
import java.util.ArrayList;
/* renamed from: com.google.android.gms.cast.framework.o */
/* loaded from: classes2.dex */
public class C4350o implements Parcelable.Creator<CastOptions> {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m24422a(CastOptions castOptions, Parcel parcel, int i) {
        int m23480a = C4630b.m23480a(parcel);
        C4630b.m23475a(parcel, 1, castOptions.m24913a());
        C4630b.m23464a(parcel, 2, castOptions.m24912b(), false);
        C4630b.m23449b(parcel, 3, castOptions.m24911c(), false);
        C4630b.m23461a(parcel, 4, castOptions.m24910d());
        C4630b.m23470a(parcel, 5, (Parcelable) castOptions.m24909e(), i, false);
        C4630b.m23461a(parcel, 6, castOptions.m24908f());
        C4630b.m23470a(parcel, 7, (Parcelable) castOptions.m24907g(), i, false);
        C4630b.m23461a(parcel, 8, castOptions.m24906h());
        C4630b.m23477a(parcel, 9, castOptions.m24905i());
        C4630b.m23479a(parcel, m23480a);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public CastOptions createFromParcel(Parcel parcel) {
        CastMediaOptions castMediaOptions = null;
        boolean z = false;
        int m23508b = C4628a.m23508b(parcel);
        double d = C9755a.f30449c;
        boolean z2 = false;
        LaunchOptions launchOptions = null;
        boolean z3 = false;
        ArrayList<String> arrayList = null;
        String str = null;
        int i = 0;
        while (parcel.dataPosition() < m23508b) {
            int m23514a = C4628a.m23514a(parcel);
            switch (C4628a.m23515a(m23514a)) {
                case 1:
                    i = C4628a.m23500g(parcel, m23514a);
                    break;
                case 2:
                    str = C4628a.m23490q(parcel, m23514a);
                    break;
                case 3:
                    arrayList = C4628a.m23518E(parcel, m23514a);
                    break;
                case 4:
                    z3 = C4628a.m23505c(parcel, m23514a);
                    break;
                case 5:
                    launchOptions = (LaunchOptions) C4628a.m23510a(parcel, m23514a, LaunchOptions.CREATOR);
                    break;
                case 6:
                    z2 = C4628a.m23505c(parcel, m23514a);
                    break;
                case 7:
                    castMediaOptions = (CastMediaOptions) C4628a.m23510a(parcel, m23514a, CastMediaOptions.CREATOR);
                    break;
                case 8:
                    z = C4628a.m23505c(parcel, m23514a);
                    break;
                case 9:
                    d = C4628a.m23493n(parcel, m23514a);
                    break;
                default:
                    C4628a.m23507b(parcel, m23514a);
                    break;
            }
        }
        if (parcel.dataPosition() != m23508b) {
            throw new C4628a.C4629a(new StringBuilder(37).append("Overread allowed size end=").append(m23508b).toString(), parcel);
        }
        return new CastOptions(i, str, arrayList, z3, launchOptions, z2, castMediaOptions, z, d);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public CastOptions[] newArray(int i) {
        return new CastOptions[i];
    }
}
