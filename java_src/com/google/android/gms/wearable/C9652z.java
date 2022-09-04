package com.google.android.gms.wearable;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C4628a;
import com.google.android.gms.common.internal.safeparcel.C4630b;
/* renamed from: com.google.android.gms.wearable.z */
/* loaded from: classes2.dex */
public class C9652z implements Parcelable.Creator<ConnectionConfiguration> {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m7541a(ConnectionConfiguration connectionConfiguration, Parcel parcel, int i) {
        int m23480a = C4630b.m23480a(parcel);
        C4630b.m23475a(parcel, 1, connectionConfiguration.f29790a);
        C4630b.m23464a(parcel, 2, connectionConfiguration.m8137a(), false);
        C4630b.m23464a(parcel, 3, connectionConfiguration.m8136b(), false);
        C4630b.m23475a(parcel, 4, connectionConfiguration.m8135c());
        C4630b.m23475a(parcel, 5, connectionConfiguration.m8134d());
        C4630b.m23461a(parcel, 6, connectionConfiguration.m8129i());
        C4630b.m23461a(parcel, 7, connectionConfiguration.m8133e());
        C4630b.m23464a(parcel, 8, connectionConfiguration.m8132f(), false);
        C4630b.m23461a(parcel, 9, connectionConfiguration.m8131g());
        C4630b.m23464a(parcel, 10, connectionConfiguration.m8130h(), false);
        C4630b.m23479a(parcel, m23480a);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public ConnectionConfiguration createFromParcel(Parcel parcel) {
        String str = null;
        boolean z = false;
        int m23508b = C4628a.m23508b(parcel);
        String str2 = null;
        boolean z2 = false;
        boolean z3 = false;
        int i = 0;
        int i2 = 0;
        String str3 = null;
        String str4 = null;
        int i3 = 0;
        while (parcel.dataPosition() < m23508b) {
            int m23514a = C4628a.m23514a(parcel);
            switch (C4628a.m23515a(m23514a)) {
                case 1:
                    i3 = C4628a.m23500g(parcel, m23514a);
                    break;
                case 2:
                    str4 = C4628a.m23490q(parcel, m23514a);
                    break;
                case 3:
                    str3 = C4628a.m23490q(parcel, m23514a);
                    break;
                case 4:
                    i2 = C4628a.m23500g(parcel, m23514a);
                    break;
                case 5:
                    i = C4628a.m23500g(parcel, m23514a);
                    break;
                case 6:
                    z3 = C4628a.m23505c(parcel, m23514a);
                    break;
                case 7:
                    z2 = C4628a.m23505c(parcel, m23514a);
                    break;
                case 8:
                    str2 = C4628a.m23490q(parcel, m23514a);
                    break;
                case 9:
                    z = C4628a.m23505c(parcel, m23514a);
                    break;
                case 10:
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
        return new ConnectionConfiguration(i3, str4, str3, i2, i, z3, z2, str2, z, str);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public ConnectionConfiguration[] newArray(int i) {
        return new ConnectionConfiguration[i];
    }
}
