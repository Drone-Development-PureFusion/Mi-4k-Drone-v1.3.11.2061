package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C4628a;
import com.google.android.gms.common.internal.safeparcel.C4630b;
/* renamed from: com.google.firebase.auth.x */
/* loaded from: classes2.dex */
public class C9750x implements Parcelable.Creator<UserProfileChangeRequest> {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m7225a(UserProfileChangeRequest userProfileChangeRequest, Parcel parcel, int i) {
        int m23480a = C4630b.m23480a(parcel);
        C4630b.m23475a(parcel, 1, userProfileChangeRequest.f30359a);
        C4630b.m23464a(parcel, 2, userProfileChangeRequest.m7356a(), false);
        C4630b.m23464a(parcel, 3, userProfileChangeRequest.m7355b(), false);
        C4630b.m23461a(parcel, 4, userProfileChangeRequest.m7353d());
        C4630b.m23461a(parcel, 5, userProfileChangeRequest.m7352e());
        C4630b.m23479a(parcel, m23480a);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public UserProfileChangeRequest createFromParcel(Parcel parcel) {
        String str = null;
        boolean z = false;
        int m23508b = C4628a.m23508b(parcel);
        boolean z2 = false;
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
                    z2 = C4628a.m23505c(parcel, m23514a);
                    break;
                case 5:
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
        return new UserProfileChangeRequest(i, str2, str, z2, z);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public UserProfileChangeRequest[] newArray(int i) {
        return new UserProfileChangeRequest[i];
    }
}
