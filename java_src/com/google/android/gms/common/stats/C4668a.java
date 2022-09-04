package com.google.android.gms.common.stats;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C4628a;
import com.google.android.gms.common.internal.safeparcel.C4630b;
/* renamed from: com.google.android.gms.common.stats.a */
/* loaded from: classes2.dex */
public class C4668a implements Parcelable.Creator<ConnectionEvent> {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m23205a(ConnectionEvent connectionEvent, Parcel parcel, int i) {
        int m23480a = C4630b.m23480a(parcel);
        C4630b.m23475a(parcel, 1, connectionEvent.f17230a);
        C4630b.m23474a(parcel, 2, connectionEvent.mo23222a());
        C4630b.m23464a(parcel, 4, connectionEvent.m23230c(), false);
        C4630b.m23464a(parcel, 5, connectionEvent.m23229d(), false);
        C4630b.m23464a(parcel, 6, connectionEvent.m23228e(), false);
        C4630b.m23464a(parcel, 7, connectionEvent.m23227f(), false);
        C4630b.m23464a(parcel, 8, connectionEvent.m23226g(), false);
        C4630b.m23474a(parcel, 10, connectionEvent.m23223k());
        C4630b.m23474a(parcel, 11, connectionEvent.m23224j());
        C4630b.m23475a(parcel, 12, connectionEvent.mo23221b());
        C4630b.m23464a(parcel, 13, connectionEvent.m23225h(), false);
        C4630b.m23479a(parcel, m23480a);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public ConnectionEvent createFromParcel(Parcel parcel) {
        int m23508b = C4628a.m23508b(parcel);
        int i = 0;
        long j = 0;
        int i2 = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        long j2 = 0;
        long j3 = 0;
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
                case 9:
                default:
                    C4628a.m23507b(parcel, m23514a);
                    break;
                case 4:
                    str = C4628a.m23490q(parcel, m23514a);
                    break;
                case 5:
                    str2 = C4628a.m23490q(parcel, m23514a);
                    break;
                case 6:
                    str3 = C4628a.m23490q(parcel, m23514a);
                    break;
                case 7:
                    str4 = C4628a.m23490q(parcel, m23514a);
                    break;
                case 8:
                    str5 = C4628a.m23490q(parcel, m23514a);
                    break;
                case 10:
                    j2 = C4628a.m23498i(parcel, m23514a);
                    break;
                case 11:
                    j3 = C4628a.m23498i(parcel, m23514a);
                    break;
                case 12:
                    i2 = C4628a.m23500g(parcel, m23514a);
                    break;
                case 13:
                    str6 = C4628a.m23490q(parcel, m23514a);
                    break;
            }
        }
        if (parcel.dataPosition() != m23508b) {
            throw new C4628a.C4629a(new StringBuilder(37).append("Overread allowed size end=").append(m23508b).toString(), parcel);
        }
        return new ConnectionEvent(i, j, i2, str, str2, str3, str4, str5, str6, j2, j3);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public ConnectionEvent[] newArray(int i) {
        return new ConnectionEvent[i];
    }
}
