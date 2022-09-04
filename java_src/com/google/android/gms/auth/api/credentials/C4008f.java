package com.google.android.gms.auth.api.credentials;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C4628a;
import com.google.android.gms.common.internal.safeparcel.C4630b;
/* renamed from: com.google.android.gms.auth.api.credentials.f */
/* loaded from: classes2.dex */
public class C4008f implements Parcelable.Creator<CredentialRequest> {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m25757a(CredentialRequest credentialRequest, Parcel parcel, int i) {
        int m23480a = C4630b.m23480a(parcel);
        C4630b.m23461a(parcel, 1, credentialRequest.m25808b());
        C4630b.m23455a(parcel, 2, credentialRequest.m25807c(), false);
        C4630b.m23470a(parcel, 3, (Parcelable) credentialRequest.m25806d(), i, false);
        C4630b.m23470a(parcel, 4, (Parcelable) credentialRequest.m25805e(), i, false);
        C4630b.m23475a(parcel, 1000, credentialRequest.f15401a);
        C4630b.m23479a(parcel, m23480a);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public CredentialRequest createFromParcel(Parcel parcel) {
        boolean z = false;
        CredentialPickerConfig credentialPickerConfig = null;
        int m23508b = C4628a.m23508b(parcel);
        CredentialPickerConfig credentialPickerConfig2 = null;
        String[] strArr = null;
        int i = 0;
        while (parcel.dataPosition() < m23508b) {
            int m23514a = C4628a.m23514a(parcel);
            switch (C4628a.m23515a(m23514a)) {
                case 1:
                    z = C4628a.m23505c(parcel, m23514a);
                    break;
                case 2:
                    strArr = C4628a.m23520C(parcel, m23514a);
                    break;
                case 3:
                    credentialPickerConfig2 = (CredentialPickerConfig) C4628a.m23510a(parcel, m23514a, CredentialPickerConfig.CREATOR);
                    break;
                case 4:
                    credentialPickerConfig = (CredentialPickerConfig) C4628a.m23510a(parcel, m23514a, CredentialPickerConfig.CREATOR);
                    break;
                case 1000:
                    i = C4628a.m23500g(parcel, m23514a);
                    break;
                default:
                    C4628a.m23507b(parcel, m23514a);
                    break;
            }
        }
        if (parcel.dataPosition() != m23508b) {
            throw new C4628a.C4629a(new StringBuilder(37).append("Overread allowed size end=").append(m23508b).toString(), parcel);
        }
        return new CredentialRequest(i, z, strArr, credentialPickerConfig2, credentialPickerConfig);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public CredentialRequest[] newArray(int i) {
        return new CredentialRequest[i];
    }
}
