package com.google.android.gms.drive;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C4628a;
import com.google.android.gms.common.internal.safeparcel.C4630b;
/* renamed from: com.google.android.gms.drive.aa */
/* loaded from: classes2.dex */
public class C4797aa implements Parcelable.Creator<UserMetadata> {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m22702a(UserMetadata userMetadata, Parcel parcel, int i) {
        int m23480a = C4630b.m23480a(parcel);
        C4630b.m23475a(parcel, 1, userMetadata.f17541a);
        C4630b.m23464a(parcel, 2, userMetadata.f17542b, false);
        C4630b.m23464a(parcel, 3, userMetadata.f17543c, false);
        C4630b.m23464a(parcel, 4, userMetadata.f17544d, false);
        C4630b.m23461a(parcel, 5, userMetadata.f17545e);
        C4630b.m23464a(parcel, 6, userMetadata.f17546f, false);
        C4630b.m23479a(parcel, m23480a);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public UserMetadata createFromParcel(Parcel parcel) {
        boolean z = false;
        String str = null;
        int m23508b = C4628a.m23508b(parcel);
        String str2 = null;
        String str3 = null;
        String str4 = null;
        int i = 0;
        while (parcel.dataPosition() < m23508b) {
            int m23514a = C4628a.m23514a(parcel);
            switch (C4628a.m23515a(m23514a)) {
                case 1:
                    i = C4628a.m23500g(parcel, m23514a);
                    break;
                case 2:
                    str4 = C4628a.m23490q(parcel, m23514a);
                    break;
                case 3:
                    str3 = C4628a.m23490q(parcel, m23514a);
                    break;
                case 4:
                    str2 = C4628a.m23490q(parcel, m23514a);
                    break;
                case 5:
                    z = C4628a.m23505c(parcel, m23514a);
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
        return new UserMetadata(i, str4, str3, str2, z, str);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public UserMetadata[] newArray(int i) {
        return new UserMetadata[i];
    }
}
