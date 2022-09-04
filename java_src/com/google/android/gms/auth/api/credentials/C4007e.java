package com.google.android.gms.auth.api.credentials;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C4628a;
import com.google.android.gms.common.internal.safeparcel.C4630b;
/* renamed from: com.google.android.gms.auth.api.credentials.e */
/* loaded from: classes.dex */
public class C4007e implements Parcelable.Creator<CredentialPickerConfig> {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m25760a(CredentialPickerConfig credentialPickerConfig, Parcel parcel, int i) {
        int m23480a = C4630b.m23480a(parcel);
        C4630b.m23461a(parcel, 1, credentialPickerConfig.m25821a());
        C4630b.m23461a(parcel, 2, credentialPickerConfig.m25820b());
        C4630b.m23461a(parcel, 3, credentialPickerConfig.m25819c());
        C4630b.m23475a(parcel, 4, credentialPickerConfig.m25818d());
        C4630b.m23475a(parcel, 1000, credentialPickerConfig.f15390a);
        C4630b.m23479a(parcel, m23480a);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public CredentialPickerConfig createFromParcel(Parcel parcel) {
        int i = 0;
        int m23508b = C4628a.m23508b(parcel);
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        int i2 = 0;
        while (parcel.dataPosition() < m23508b) {
            int m23514a = C4628a.m23514a(parcel);
            switch (C4628a.m23515a(m23514a)) {
                case 1:
                    z3 = C4628a.m23505c(parcel, m23514a);
                    break;
                case 2:
                    z2 = C4628a.m23505c(parcel, m23514a);
                    break;
                case 3:
                    z = C4628a.m23505c(parcel, m23514a);
                    break;
                case 4:
                    i = C4628a.m23500g(parcel, m23514a);
                    break;
                case 1000:
                    i2 = C4628a.m23500g(parcel, m23514a);
                    break;
                default:
                    C4628a.m23507b(parcel, m23514a);
                    break;
            }
        }
        if (parcel.dataPosition() != m23508b) {
            throw new C4628a.C4629a(new StringBuilder(37).append("Overread allowed size end=").append(m23508b).toString(), parcel);
        }
        return new CredentialPickerConfig(i2, z3, z2, z, i);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public CredentialPickerConfig[] newArray(int i) {
        return new CredentialPickerConfig[i];
    }
}
