package com.google.android.gms.cast.framework.media;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C4628a;
import com.google.android.gms.common.internal.safeparcel.C4630b;
import java.util.ArrayList;
/* renamed from: com.google.android.gms.cast.framework.media.g */
/* loaded from: classes2.dex */
public class C4341g implements Parcelable.Creator<NotificationOptions> {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m24479a(NotificationOptions notificationOptions, Parcel parcel, int i) {
        int m23480a = C4630b.m23480a(parcel);
        C4630b.m23475a(parcel, 1, notificationOptions.m24674a());
        C4630b.m23449b(parcel, 2, notificationOptions.m24673b(), false);
        C4630b.m23458a(parcel, 3, notificationOptions.m24672c(), false);
        C4630b.m23474a(parcel, 4, notificationOptions.m24671d());
        C4630b.m23464a(parcel, 5, notificationOptions.m24670e(), false);
        C4630b.m23475a(parcel, 6, notificationOptions.m24669f());
        C4630b.m23475a(parcel, 7, notificationOptions.m24668g());
        C4630b.m23475a(parcel, 8, notificationOptions.m24667h());
        C4630b.m23475a(parcel, 9, notificationOptions.m24666i());
        C4630b.m23475a(parcel, 10, notificationOptions.m24665j());
        C4630b.m23475a(parcel, 11, notificationOptions.m24664k());
        C4630b.m23475a(parcel, 12, notificationOptions.m24663l());
        C4630b.m23475a(parcel, 13, notificationOptions.m24662m());
        C4630b.m23475a(parcel, 14, notificationOptions.m24661n());
        C4630b.m23475a(parcel, 15, notificationOptions.m24660o());
        C4630b.m23475a(parcel, 16, notificationOptions.m24659p());
        C4630b.m23475a(parcel, 17, notificationOptions.m24658q());
        C4630b.m23475a(parcel, 18, notificationOptions.m24657r());
        C4630b.m23475a(parcel, 19, notificationOptions.m24656s());
        C4630b.m23475a(parcel, 20, notificationOptions.m24655t());
        C4630b.m23475a(parcel, 21, notificationOptions.m24654u());
        C4630b.m23475a(parcel, 22, notificationOptions.m24653v());
        C4630b.m23475a(parcel, 23, notificationOptions.m24652w());
        C4630b.m23475a(parcel, 24, notificationOptions.m24651x());
        C4630b.m23475a(parcel, 25, notificationOptions.m24650y());
        C4630b.m23475a(parcel, 26, notificationOptions.m24649z());
        C4630b.m23475a(parcel, 27, notificationOptions.m24682A());
        C4630b.m23475a(parcel, 28, notificationOptions.m24681B());
        C4630b.m23475a(parcel, 29, notificationOptions.m24680C());
        C4630b.m23475a(parcel, 30, notificationOptions.m24679D());
        C4630b.m23475a(parcel, 31, notificationOptions.m24678E());
        C4630b.m23475a(parcel, 32, notificationOptions.m24677F());
        C4630b.m23479a(parcel, m23480a);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public NotificationOptions createFromParcel(Parcel parcel) {
        int m23508b = C4628a.m23508b(parcel);
        int i = 0;
        ArrayList<String> arrayList = null;
        int[] iArr = null;
        long j = 0;
        String str = null;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        int i18 = 0;
        int i19 = 0;
        int i20 = 0;
        int i21 = 0;
        int i22 = 0;
        int i23 = 0;
        int i24 = 0;
        int i25 = 0;
        int i26 = 0;
        int i27 = 0;
        int i28 = 0;
        while (parcel.dataPosition() < m23508b) {
            int m23514a = C4628a.m23514a(parcel);
            switch (C4628a.m23515a(m23514a)) {
                case 1:
                    i = C4628a.m23500g(parcel, m23514a);
                    break;
                case 2:
                    arrayList = C4628a.m23518E(parcel, m23514a);
                    break;
                case 3:
                    iArr = C4628a.m23484w(parcel, m23514a);
                    break;
                case 4:
                    j = C4628a.m23498i(parcel, m23514a);
                    break;
                case 5:
                    str = C4628a.m23490q(parcel, m23514a);
                    break;
                case 6:
                    i2 = C4628a.m23500g(parcel, m23514a);
                    break;
                case 7:
                    i3 = C4628a.m23500g(parcel, m23514a);
                    break;
                case 8:
                    i4 = C4628a.m23500g(parcel, m23514a);
                    break;
                case 9:
                    i5 = C4628a.m23500g(parcel, m23514a);
                    break;
                case 10:
                    i6 = C4628a.m23500g(parcel, m23514a);
                    break;
                case 11:
                    i7 = C4628a.m23500g(parcel, m23514a);
                    break;
                case 12:
                    i8 = C4628a.m23500g(parcel, m23514a);
                    break;
                case 13:
                    i9 = C4628a.m23500g(parcel, m23514a);
                    break;
                case 14:
                    i10 = C4628a.m23500g(parcel, m23514a);
                    break;
                case 15:
                    i11 = C4628a.m23500g(parcel, m23514a);
                    break;
                case 16:
                    i12 = C4628a.m23500g(parcel, m23514a);
                    break;
                case 17:
                    i13 = C4628a.m23500g(parcel, m23514a);
                    break;
                case 18:
                    i14 = C4628a.m23500g(parcel, m23514a);
                    break;
                case 19:
                    i15 = C4628a.m23500g(parcel, m23514a);
                    break;
                case 20:
                    i16 = C4628a.m23500g(parcel, m23514a);
                    break;
                case 21:
                    i17 = C4628a.m23500g(parcel, m23514a);
                    break;
                case 22:
                    i18 = C4628a.m23500g(parcel, m23514a);
                    break;
                case 23:
                    i19 = C4628a.m23500g(parcel, m23514a);
                    break;
                case 24:
                    i20 = C4628a.m23500g(parcel, m23514a);
                    break;
                case 25:
                    i21 = C4628a.m23500g(parcel, m23514a);
                    break;
                case 26:
                    i22 = C4628a.m23500g(parcel, m23514a);
                    break;
                case 27:
                    i23 = C4628a.m23500g(parcel, m23514a);
                    break;
                case 28:
                    i24 = C4628a.m23500g(parcel, m23514a);
                    break;
                case 29:
                    i25 = C4628a.m23500g(parcel, m23514a);
                    break;
                case 30:
                    i26 = C4628a.m23500g(parcel, m23514a);
                    break;
                case 31:
                    i27 = C4628a.m23500g(parcel, m23514a);
                    break;
                case 32:
                    i28 = C4628a.m23500g(parcel, m23514a);
                    break;
                default:
                    C4628a.m23507b(parcel, m23514a);
                    break;
            }
        }
        if (parcel.dataPosition() != m23508b) {
            throw new C4628a.C4629a(new StringBuilder(37).append("Overread allowed size end=").append(m23508b).toString(), parcel);
        }
        return new NotificationOptions(i, arrayList, iArr, j, str, i2, i3, i4, i5, i6, i7, i8, i9, i10, i11, i12, i13, i14, i15, i16, i17, i18, i19, i20, i21, i22, i23, i24, i25, i26, i27, i28);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public NotificationOptions[] newArray(int i) {
        return new NotificationOptions[i];
    }
}
