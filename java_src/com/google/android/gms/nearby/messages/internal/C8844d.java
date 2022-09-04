package com.google.android.gms.nearby.messages.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C4628a;
import com.google.android.gms.common.internal.safeparcel.C4630b;
/* renamed from: com.google.android.gms.nearby.messages.internal.d */
/* loaded from: classes2.dex */
public class C8844d implements Parcelable.Creator<ClientAppContext> {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m9884a(ClientAppContext clientAppContext, Parcel parcel, int i) {
        int m23480a = C4630b.m23480a(parcel);
        C4630b.m23475a(parcel, 1, clientAppContext.f28257a);
        C4630b.m23464a(parcel, 2, clientAppContext.f28258b, false);
        C4630b.m23464a(parcel, 3, clientAppContext.f28259c, false);
        C4630b.m23461a(parcel, 4, clientAppContext.f28260d);
        C4630b.m23475a(parcel, 5, clientAppContext.f28261e);
        C4630b.m23464a(parcel, 6, clientAppContext.f28262f, false);
        C4630b.m23479a(parcel, m23480a);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public ClientAppContext createFromParcel(Parcel parcel) {
        String str = null;
        int i = 0;
        int m23508b = C4628a.m23508b(parcel);
        boolean z = false;
        String str2 = null;
        String str3 = null;
        int i2 = 0;
        while (parcel.dataPosition() < m23508b) {
            int m23514a = C4628a.m23514a(parcel);
            switch (C4628a.m23515a(m23514a)) {
                case 1:
                    i2 = C4628a.m23500g(parcel, m23514a);
                    break;
                case 2:
                    str3 = C4628a.m23490q(parcel, m23514a);
                    break;
                case 3:
                    str2 = C4628a.m23490q(parcel, m23514a);
                    break;
                case 4:
                    z = C4628a.m23505c(parcel, m23514a);
                    break;
                case 5:
                    i = C4628a.m23500g(parcel, m23514a);
                    break;
                case 6:
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
        return new ClientAppContext(i2, str3, str2, z, i, str);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public ClientAppContext[] newArray(int i) {
        return new ClientAppContext[i];
    }
}
