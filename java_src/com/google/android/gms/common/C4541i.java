package com.google.android.gms.common;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C4628a;
import com.google.android.gms.common.internal.safeparcel.C4630b;
/* renamed from: com.google.android.gms.common.i */
/* loaded from: classes2.dex */
public class C4541i implements Parcelable.Creator<ConnectionResult> {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m23797a(ConnectionResult connectionResult, Parcel parcel, int i) {
        int m23480a = C4630b.m23480a(parcel);
        C4630b.m23475a(parcel, 1, connectionResult.f16765w);
        C4630b.m23475a(parcel, 2, connectionResult.m24046c());
        C4630b.m23470a(parcel, 3, (Parcelable) connectionResult.m24045d(), i, false);
        C4630b.m23464a(parcel, 4, connectionResult.m24044e(), false);
        C4630b.m23479a(parcel, m23480a);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public ConnectionResult createFromParcel(Parcel parcel) {
        String m23490q;
        PendingIntent pendingIntent;
        int i;
        int i2;
        String str = null;
        int i3 = 0;
        int m23508b = C4628a.m23508b(parcel);
        PendingIntent pendingIntent2 = null;
        int i4 = 0;
        while (parcel.dataPosition() < m23508b) {
            int m23514a = C4628a.m23514a(parcel);
            switch (C4628a.m23515a(m23514a)) {
                case 1:
                    String str2 = str;
                    pendingIntent = pendingIntent2;
                    i = i3;
                    i2 = C4628a.m23500g(parcel, m23514a);
                    m23490q = str2;
                    break;
                case 2:
                    i2 = i4;
                    PendingIntent pendingIntent3 = pendingIntent2;
                    i = C4628a.m23500g(parcel, m23514a);
                    m23490q = str;
                    pendingIntent = pendingIntent3;
                    break;
                case 3:
                    i = i3;
                    i2 = i4;
                    String str3 = str;
                    pendingIntent = (PendingIntent) C4628a.m23510a(parcel, m23514a, PendingIntent.CREATOR);
                    m23490q = str3;
                    break;
                case 4:
                    m23490q = C4628a.m23490q(parcel, m23514a);
                    pendingIntent = pendingIntent2;
                    i = i3;
                    i2 = i4;
                    break;
                default:
                    C4628a.m23507b(parcel, m23514a);
                    m23490q = str;
                    pendingIntent = pendingIntent2;
                    i = i3;
                    i2 = i4;
                    break;
            }
            i4 = i2;
            i3 = i;
            pendingIntent2 = pendingIntent;
            str = m23490q;
        }
        if (parcel.dataPosition() != m23508b) {
            throw new C4628a.C4629a(new StringBuilder(37).append("Overread allowed size end=").append(m23508b).toString(), parcel);
        }
        return new ConnectionResult(i4, i3, pendingIntent2, str);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public ConnectionResult[] newArray(int i) {
        return new ConnectionResult[i];
    }
}
