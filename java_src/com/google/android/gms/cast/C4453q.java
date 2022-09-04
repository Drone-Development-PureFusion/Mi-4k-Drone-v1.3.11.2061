package com.google.android.gms.cast;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C4628a;
import com.google.android.gms.common.internal.safeparcel.C4630b;
/* renamed from: com.google.android.gms.cast.q */
/* loaded from: classes2.dex */
public class C4453q implements Parcelable.Creator<MediaTrack> {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m24087a(MediaTrack mediaTrack, Parcel parcel, int i) {
        int m23480a = C4630b.m23480a(parcel);
        C4630b.m23475a(parcel, 1, mediaTrack.m25037a());
        C4630b.m23474a(parcel, 2, mediaTrack.m25033b());
        C4630b.m23475a(parcel, 3, mediaTrack.m25030c());
        C4630b.m23464a(parcel, 4, mediaTrack.m25028d(), false);
        C4630b.m23464a(parcel, 5, mediaTrack.m25026e(), false);
        C4630b.m23464a(parcel, 6, mediaTrack.m25025f(), false);
        C4630b.m23464a(parcel, 7, mediaTrack.m25024g(), false);
        C4630b.m23475a(parcel, 8, mediaTrack.m25023h());
        C4630b.m23464a(parcel, 9, mediaTrack.f15971l, false);
        C4630b.m23479a(parcel, m23480a);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public MediaTrack createFromParcel(Parcel parcel) {
        int i = 0;
        String str = null;
        int m23508b = C4628a.m23508b(parcel);
        long j = 0;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        int i2 = 0;
        int i3 = 0;
        while (parcel.dataPosition() < m23508b) {
            int m23514a = C4628a.m23514a(parcel);
            switch (C4628a.m23515a(m23514a)) {
                case 1:
                    i3 = C4628a.m23500g(parcel, m23514a);
                    break;
                case 2:
                    j = C4628a.m23498i(parcel, m23514a);
                    break;
                case 3:
                    i2 = C4628a.m23500g(parcel, m23514a);
                    break;
                case 4:
                    str5 = C4628a.m23490q(parcel, m23514a);
                    break;
                case 5:
                    str4 = C4628a.m23490q(parcel, m23514a);
                    break;
                case 6:
                    str3 = C4628a.m23490q(parcel, m23514a);
                    break;
                case 7:
                    str2 = C4628a.m23490q(parcel, m23514a);
                    break;
                case 8:
                    i = C4628a.m23500g(parcel, m23514a);
                    break;
                case 9:
                    str = C4628a.m23490q(parcel, m23514a);
                    break;
                default:
                    C4628a.m23507b(parcel, m23514a);
                    break;
            }
        }
        if (parcel.dataPosition() != m23508b) {
            throw new C4628a.C4629a(new StringBuilder(37).append("Overread allowed size end=").append(m23508b).toString(), parcel);
        }
        return new MediaTrack(i3, j, i2, str5, str4, str3, str2, i, str);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public MediaTrack[] newArray(int i) {
        return new MediaTrack[i];
    }
}
