package com.google.firebase.database.connection.idl;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C4628a;
import com.google.android.gms.common.internal.safeparcel.C4630b;
import java.util.ArrayList;
/* renamed from: com.google.firebase.database.connection.idl.b */
/* loaded from: classes2.dex */
public class C9842b implements Parcelable.Creator<ConnectionConfig> {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m6815a(ConnectionConfig connectionConfig, Parcel parcel, int i) {
        int m23480a = C4630b.m23480a(parcel);
        C4630b.m23475a(parcel, 1, connectionConfig.f30681a);
        C4630b.m23470a(parcel, 2, (Parcelable) connectionConfig.f30682b, i, false);
        C4630b.m23475a(parcel, 3, connectionConfig.f30683c);
        C4630b.m23449b(parcel, 4, connectionConfig.f30684d, false);
        C4630b.m23461a(parcel, 5, connectionConfig.f30685e);
        C4630b.m23464a(parcel, 6, connectionConfig.f30686f, false);
        C4630b.m23464a(parcel, 7, connectionConfig.f30687g, false);
        C4630b.m23479a(parcel, m23480a);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public ConnectionConfig createFromParcel(Parcel parcel) {
        boolean z = false;
        String str = null;
        int m23508b = C4628a.m23508b(parcel);
        String str2 = null;
        ArrayList<String> arrayList = null;
        int i = 0;
        HostInfoParcelable hostInfoParcelable = null;
        int i2 = 0;
        while (parcel.dataPosition() < m23508b) {
            int m23514a = C4628a.m23514a(parcel);
            switch (C4628a.m23515a(m23514a)) {
                case 1:
                    i2 = C4628a.m23500g(parcel, m23514a);
                    break;
                case 2:
                    hostInfoParcelable = (HostInfoParcelable) C4628a.m23510a(parcel, m23514a, HostInfoParcelable.CREATOR);
                    break;
                case 3:
                    i = C4628a.m23500g(parcel, m23514a);
                    break;
                case 4:
                    arrayList = C4628a.m23518E(parcel, m23514a);
                    break;
                case 5:
                    z = C4628a.m23505c(parcel, m23514a);
                    break;
                case 6:
                    str2 = C4628a.m23490q(parcel, m23514a);
                    break;
                case 7:
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
        return new ConnectionConfig(i2, hostInfoParcelable, i, arrayList, z, str2, str);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public ConnectionConfig[] newArray(int i) {
        return new ConnectionConfig[i];
    }
}
