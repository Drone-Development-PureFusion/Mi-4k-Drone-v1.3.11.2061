package com.google.android.gms.cast;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C4628a;
import com.google.android.gms.common.internal.safeparcel.C4630b;
/* renamed from: com.google.android.gms.cast.r */
/* loaded from: classes2.dex */
public class C4454r implements Parcelable.Creator<TextTrackStyle> {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m24084a(TextTrackStyle textTrackStyle, Parcel parcel, int i) {
        int m23480a = C4630b.m23480a(parcel);
        C4630b.m23475a(parcel, 1, textTrackStyle.m25012a());
        C4630b.m23476a(parcel, 2, textTrackStyle.m25006b());
        C4630b.m23475a(parcel, 3, textTrackStyle.m25002c());
        C4630b.m23475a(parcel, 4, textTrackStyle.m25000d());
        C4630b.m23475a(parcel, 5, textTrackStyle.m24998e());
        C4630b.m23475a(parcel, 6, textTrackStyle.m24996f());
        C4630b.m23475a(parcel, 7, textTrackStyle.m24994g());
        C4630b.m23475a(parcel, 8, textTrackStyle.m24992h());
        C4630b.m23475a(parcel, 9, textTrackStyle.m24990i());
        C4630b.m23464a(parcel, 10, textTrackStyle.m24988j(), false);
        C4630b.m23475a(parcel, 11, textTrackStyle.m24986k());
        C4630b.m23475a(parcel, 12, textTrackStyle.m24985l());
        C4630b.m23464a(parcel, 13, textTrackStyle.f16020z, false);
        C4630b.m23479a(parcel, m23480a);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public TextTrackStyle createFromParcel(Parcel parcel) {
        int m23508b = C4628a.m23508b(parcel);
        int i = 0;
        float f = 0.0f;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        String str = null;
        int i9 = 0;
        int i10 = 0;
        String str2 = null;
        while (parcel.dataPosition() < m23508b) {
            int m23514a = C4628a.m23514a(parcel);
            switch (C4628a.m23515a(m23514a)) {
                case 1:
                    i = C4628a.m23500g(parcel, m23514a);
                    break;
                case 2:
                    f = C4628a.m23495l(parcel, m23514a);
                    break;
                case 3:
                    i2 = C4628a.m23500g(parcel, m23514a);
                    break;
                case 4:
                    i3 = C4628a.m23500g(parcel, m23514a);
                    break;
                case 5:
                    i4 = C4628a.m23500g(parcel, m23514a);
                    break;
                case 6:
                    i5 = C4628a.m23500g(parcel, m23514a);
                    break;
                case 7:
                    i6 = C4628a.m23500g(parcel, m23514a);
                    break;
                case 8:
                    i7 = C4628a.m23500g(parcel, m23514a);
                    break;
                case 9:
                    i8 = C4628a.m23500g(parcel, m23514a);
                    break;
                case 10:
                    str = C4628a.m23490q(parcel, m23514a);
                    break;
                case 11:
                    i9 = C4628a.m23500g(parcel, m23514a);
                    break;
                case 12:
                    i10 = C4628a.m23500g(parcel, m23514a);
                    break;
                case 13:
                    str2 = C4628a.m23490q(parcel, m23514a);
                    break;
                default:
                    C4628a.m23507b(parcel, m23514a);
                    break;
            }
        }
        if (parcel.dataPosition() != m23508b) {
            throw new C4628a.C4629a(new StringBuilder(37).append("Overread allowed size end=").append(m23508b).toString(), parcel);
        }
        return new TextTrackStyle(i, f, i2, i3, i4, i5, i6, i7, i8, str, i9, i10, str2);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public TextTrackStyle[] newArray(int i) {
        return new TextTrackStyle[i];
    }
}
