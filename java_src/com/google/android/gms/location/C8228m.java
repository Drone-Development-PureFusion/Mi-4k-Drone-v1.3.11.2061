package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C4628a;
import com.google.android.gms.common.internal.safeparcel.C4630b;
import com.tencent.p263mm.sdk.platformtools.Util;
/* renamed from: com.google.android.gms.location.m */
/* loaded from: classes2.dex */
public class C8228m implements Parcelable.Creator<LocationRequest> {

    /* renamed from: a */
    public static final int f26828a = 0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m12373a(LocationRequest locationRequest, Parcel parcel, int i) {
        int m23480a = C4630b.m23480a(parcel);
        C4630b.m23475a(parcel, 1, locationRequest.f26675e);
        C4630b.m23474a(parcel, 2, locationRequest.f26676f);
        C4630b.m23474a(parcel, 3, locationRequest.f26677g);
        C4630b.m23461a(parcel, 4, locationRequest.f26678h);
        C4630b.m23474a(parcel, 5, locationRequest.f26679i);
        C4630b.m23475a(parcel, 6, locationRequest.f26680j);
        C4630b.m23476a(parcel, 7, locationRequest.f26681k);
        C4630b.m23475a(parcel, 1000, locationRequest.m12607i());
        C4630b.m23474a(parcel, 8, locationRequest.f26682l);
        C4630b.m23479a(parcel, m23480a);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public LocationRequest createFromParcel(Parcel parcel) {
        int m23508b = C4628a.m23508b(parcel);
        int i = 0;
        int i2 = 102;
        long j = Util.MILLSECONDS_OF_HOUR;
        long j2 = 600000;
        boolean z = false;
        long j3 = Long.MAX_VALUE;
        int i3 = Integer.MAX_VALUE;
        float f = 0.0f;
        long j4 = 0;
        while (parcel.dataPosition() < m23508b) {
            int m23514a = C4628a.m23514a(parcel);
            switch (C4628a.m23515a(m23514a)) {
                case 1:
                    i2 = C4628a.m23500g(parcel, m23514a);
                    break;
                case 2:
                    j = C4628a.m23498i(parcel, m23514a);
                    break;
                case 3:
                    j2 = C4628a.m23498i(parcel, m23514a);
                    break;
                case 4:
                    z = C4628a.m23505c(parcel, m23514a);
                    break;
                case 5:
                    j3 = C4628a.m23498i(parcel, m23514a);
                    break;
                case 6:
                    i3 = C4628a.m23500g(parcel, m23514a);
                    break;
                case 7:
                    f = C4628a.m23495l(parcel, m23514a);
                    break;
                case 8:
                    j4 = C4628a.m23498i(parcel, m23514a);
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
        return new LocationRequest(i, i2, j, j2, z, j3, i3, f, j4);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public LocationRequest[] newArray(int i) {
        return new LocationRequest[i];
    }
}
