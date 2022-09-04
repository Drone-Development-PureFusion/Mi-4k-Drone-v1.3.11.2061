package com.google.firebase.database.connection.idl;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C4628a;
import com.google.android.gms.common.internal.safeparcel.C4630b;
/* renamed from: com.google.firebase.database.connection.idl.d */
/* loaded from: classes2.dex */
public class C9846d implements Parcelable.Creator<HostInfoParcelable> {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m6794a(HostInfoParcelable hostInfoParcelable, Parcel parcel, int i) {
        int m23480a = C4630b.m23480a(parcel);
        C4630b.m23475a(parcel, 1, hostInfoParcelable.f30689a);
        C4630b.m23464a(parcel, 2, hostInfoParcelable.f30690b, false);
        C4630b.m23464a(parcel, 3, hostInfoParcelable.f30691c, false);
        C4630b.m23461a(parcel, 4, hostInfoParcelable.f30692d);
        C4630b.m23479a(parcel, m23480a);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public HostInfoParcelable createFromParcel(Parcel parcel) {
        String str = null;
        boolean z = false;
        int m23508b = C4628a.m23508b(parcel);
        String str2 = null;
        int i = 0;
        while (parcel.dataPosition() < m23508b) {
            int m23514a = C4628a.m23514a(parcel);
            switch (C4628a.m23515a(m23514a)) {
                case 1:
                    i = C4628a.m23500g(parcel, m23514a);
                    break;
                case 2:
                    str2 = C4628a.m23490q(parcel, m23514a);
                    break;
                case 3:
                    str = C4628a.m23490q(parcel, m23514a);
                    break;
                case 4:
                    z = C4628a.m23505c(parcel, m23514a);
                    break;
                default:
                    C4628a.m23507b(parcel, m23514a);
                    break;
            }
        }
        if (parcel.dataPosition() != m23508b) {
            throw new C4628a.C4629a(new StringBuilder(37).append("Overread allowed size end=").append(m23508b).toString(), parcel);
        }
        return new HostInfoParcelable(i, str2, str, z);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public HostInfoParcelable[] newArray(int i) {
        return new HostInfoParcelable[i];
    }
}
