package com.google.android.gms.drive.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C4628a;
import com.google.android.gms.common.internal.safeparcel.C4630b;
/* renamed from: com.google.android.gms.drive.internal.ah */
/* loaded from: classes2.dex */
public class C4852ah implements Parcelable.Creator<OnStartStreamSession> {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m22574a(OnStartStreamSession onStartStreamSession, Parcel parcel, int i) {
        int m23480a = C4630b.m23480a(parcel);
        C4630b.m23475a(parcel, 1, onStartStreamSession.f17783a);
        C4630b.m23470a(parcel, 2, (Parcelable) onStartStreamSession.f17784b, i, false);
        C4630b.m23472a(parcel, 3, onStartStreamSession.f17785c, false);
        C4630b.m23464a(parcel, 4, onStartStreamSession.f17786d, false);
        C4630b.m23479a(parcel, m23480a);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public OnStartStreamSession createFromParcel(Parcel parcel) {
        String m23490q;
        IBinder iBinder;
        ParcelFileDescriptor parcelFileDescriptor;
        int i;
        String str = null;
        int m23508b = C4628a.m23508b(parcel);
        int i2 = 0;
        IBinder iBinder2 = null;
        ParcelFileDescriptor parcelFileDescriptor2 = null;
        while (parcel.dataPosition() < m23508b) {
            int m23514a = C4628a.m23514a(parcel);
            switch (C4628a.m23515a(m23514a)) {
                case 1:
                    String str2 = str;
                    iBinder = iBinder2;
                    parcelFileDescriptor = parcelFileDescriptor2;
                    i = C4628a.m23500g(parcel, m23514a);
                    m23490q = str2;
                    break;
                case 2:
                    i = i2;
                    IBinder iBinder3 = iBinder2;
                    parcelFileDescriptor = (ParcelFileDescriptor) C4628a.m23510a(parcel, m23514a, ParcelFileDescriptor.CREATOR);
                    m23490q = str;
                    iBinder = iBinder3;
                    break;
                case 3:
                    parcelFileDescriptor = parcelFileDescriptor2;
                    i = i2;
                    String str3 = str;
                    iBinder = C4628a.m23489r(parcel, m23514a);
                    m23490q = str3;
                    break;
                case 4:
                    m23490q = C4628a.m23490q(parcel, m23514a);
                    iBinder = iBinder2;
                    parcelFileDescriptor = parcelFileDescriptor2;
                    i = i2;
                    break;
                default:
                    C4628a.m23507b(parcel, m23514a);
                    m23490q = str;
                    iBinder = iBinder2;
                    parcelFileDescriptor = parcelFileDescriptor2;
                    i = i2;
                    break;
            }
            i2 = i;
            parcelFileDescriptor2 = parcelFileDescriptor;
            iBinder2 = iBinder;
            str = m23490q;
        }
        if (parcel.dataPosition() != m23508b) {
            throw new C4628a.C4629a(new StringBuilder(37).append("Overread allowed size end=").append(m23508b).toString(), parcel);
        }
        return new OnStartStreamSession(i2, parcelFileDescriptor2, iBinder2, str);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public OnStartStreamSession[] newArray(int i) {
        return new OnStartStreamSession[i];
    }
}
