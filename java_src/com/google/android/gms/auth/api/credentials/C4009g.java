package com.google.android.gms.auth.api.credentials;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C4628a;
import com.google.android.gms.common.internal.safeparcel.C4630b;
/* renamed from: com.google.android.gms.auth.api.credentials.g */
/* loaded from: classes2.dex */
public class C4009g implements Parcelable.Creator<HintRequest> {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m25754a(HintRequest hintRequest, Parcel parcel, int i) {
        int m23480a = C4630b.m23480a(parcel);
        C4630b.m23470a(parcel, 1, (Parcelable) hintRequest.m25794a(), i, false);
        C4630b.m23461a(parcel, 2, hintRequest.m25793b());
        C4630b.m23461a(parcel, 3, hintRequest.m25792c());
        C4630b.m23455a(parcel, 4, hintRequest.m25791d(), false);
        C4630b.m23475a(parcel, 1000, hintRequest.f15410a);
        C4630b.m23479a(parcel, m23480a);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public HintRequest createFromParcel(Parcel parcel) {
        String[] strArr = null;
        boolean z = false;
        int m23508b = C4628a.m23508b(parcel);
        boolean z2 = false;
        CredentialPickerConfig credentialPickerConfig = null;
        int i = 0;
        while (parcel.dataPosition() < m23508b) {
            int m23514a = C4628a.m23514a(parcel);
            switch (C4628a.m23515a(m23514a)) {
                case 1:
                    credentialPickerConfig = (CredentialPickerConfig) C4628a.m23510a(parcel, m23514a, CredentialPickerConfig.CREATOR);
                    break;
                case 2:
                    z2 = C4628a.m23505c(parcel, m23514a);
                    break;
                case 3:
                    z = C4628a.m23505c(parcel, m23514a);
                    break;
                case 4:
                    strArr = C4628a.m23520C(parcel, m23514a);
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
        return new HintRequest(i, credentialPickerConfig, z2, z, strArr);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public HintRequest[] newArray(int i) {
        return new HintRequest[i];
    }
}
