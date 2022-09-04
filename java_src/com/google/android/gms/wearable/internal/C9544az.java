package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C4628a;
import com.google.android.gms.common.internal.safeparcel.C4630b;
/* renamed from: com.google.android.gms.wearable.internal.az */
/* loaded from: classes2.dex */
public class C9544az implements Parcelable.Creator<AncsNotificationParcelable> {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m7905a(AncsNotificationParcelable ancsNotificationParcelable, Parcel parcel, int i) {
        int m23480a = C4630b.m23480a(parcel);
        C4630b.m23475a(parcel, 1, ancsNotificationParcelable.f29868a);
        C4630b.m23475a(parcel, 2, ancsNotificationParcelable.m8089a());
        C4630b.m23464a(parcel, 3, ancsNotificationParcelable.m8088b(), false);
        C4630b.m23464a(parcel, 4, ancsNotificationParcelable.m8087c(), false);
        C4630b.m23464a(parcel, 5, ancsNotificationParcelable.m8086d(), false);
        C4630b.m23464a(parcel, 6, ancsNotificationParcelable.m8085e(), false);
        C4630b.m23464a(parcel, 7, ancsNotificationParcelable.m8084f(), false);
        C4630b.m23464a(parcel, 8, ancsNotificationParcelable.m8083g(), false);
        C4630b.m23478a(parcel, 9, ancsNotificationParcelable.m8082h());
        C4630b.m23478a(parcel, 10, ancsNotificationParcelable.m8081i());
        C4630b.m23478a(parcel, 11, ancsNotificationParcelable.m8080j());
        C4630b.m23478a(parcel, 12, ancsNotificationParcelable.m8079k());
        C4630b.m23464a(parcel, 13, ancsNotificationParcelable.m8078l(), false);
        C4630b.m23479a(parcel, m23480a);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public AncsNotificationParcelable createFromParcel(Parcel parcel) {
        int m23508b = C4628a.m23508b(parcel);
        int i = 0;
        int i2 = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        byte b = 0;
        byte b2 = 0;
        byte b3 = 0;
        byte b4 = 0;
        String str7 = null;
        while (parcel.dataPosition() < m23508b) {
            int m23514a = C4628a.m23514a(parcel);
            switch (C4628a.m23515a(m23514a)) {
                case 1:
                    i = C4628a.m23500g(parcel, m23514a);
                    break;
                case 2:
                    i2 = C4628a.m23500g(parcel, m23514a);
                    break;
                case 3:
                    str = C4628a.m23490q(parcel, m23514a);
                    break;
                case 4:
                    str2 = C4628a.m23490q(parcel, m23514a);
                    break;
                case 5:
                    str3 = C4628a.m23490q(parcel, m23514a);
                    break;
                case 6:
                    str4 = C4628a.m23490q(parcel, m23514a);
                    break;
                case 7:
                    str5 = C4628a.m23490q(parcel, m23514a);
                    break;
                case 8:
                    str6 = C4628a.m23490q(parcel, m23514a);
                    break;
                case 9:
                    b = C4628a.m23502e(parcel, m23514a);
                    break;
                case 10:
                    b2 = C4628a.m23502e(parcel, m23514a);
                    break;
                case 11:
                    b3 = C4628a.m23502e(parcel, m23514a);
                    break;
                case 12:
                    b4 = C4628a.m23502e(parcel, m23514a);
                    break;
                case 13:
                    str7 = C4628a.m23490q(parcel, m23514a);
                    break;
                default:
                    C4628a.m23507b(parcel, m23514a);
                    break;
            }
        }
        if (parcel.dataPosition() != m23508b) {
            throw new C4628a.C4629a(new StringBuilder(37).append("Overread allowed size end=").append(m23508b).toString(), parcel);
        }
        return new AncsNotificationParcelable(i, i2, str, str2, str3, str4, str5, str6, b, b2, b3, b4, str7);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public AncsNotificationParcelable[] newArray(int i) {
        return new AncsNotificationParcelable[i];
    }
}
