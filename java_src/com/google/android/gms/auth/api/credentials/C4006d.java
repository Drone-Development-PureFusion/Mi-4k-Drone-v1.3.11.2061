package com.google.android.gms.auth.api.credentials;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C4628a;
import com.google.android.gms.common.internal.safeparcel.C4630b;
import java.util.ArrayList;
/* renamed from: com.google.android.gms.auth.api.credentials.d */
/* loaded from: classes2.dex */
public class C4006d implements Parcelable.Creator<Credential> {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m25763a(Credential credential, Parcel parcel, int i) {
        int m23480a = C4630b.m23480a(parcel);
        C4630b.m23464a(parcel, 1, credential.m25842a(), false);
        C4630b.m23464a(parcel, 2, credential.m25840b(), false);
        C4630b.m23470a(parcel, 3, (Parcelable) credential.m25838c(), i, false);
        C4630b.m23447c(parcel, 4, credential.m25836d(), false);
        C4630b.m23464a(parcel, 5, credential.m25834e(), false);
        C4630b.m23464a(parcel, 6, credential.m25830g(), false);
        C4630b.m23464a(parcel, 7, credential.m25832f(), false);
        C4630b.m23475a(parcel, 1000, credential.f15373b);
        C4630b.m23464a(parcel, 8, credential.m25828h(), false);
        C4630b.m23479a(parcel, m23480a);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public Credential createFromParcel(Parcel parcel) {
        String str = null;
        int m23508b = C4628a.m23508b(parcel);
        int i = 0;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        ArrayList arrayList = null;
        Uri uri = null;
        String str5 = null;
        String str6 = null;
        while (parcel.dataPosition() < m23508b) {
            int m23514a = C4628a.m23514a(parcel);
            switch (C4628a.m23515a(m23514a)) {
                case 1:
                    str6 = C4628a.m23490q(parcel, m23514a);
                    break;
                case 2:
                    str5 = C4628a.m23490q(parcel, m23514a);
                    break;
                case 3:
                    uri = (Uri) C4628a.m23510a(parcel, m23514a, Uri.CREATOR);
                    break;
                case 4:
                    arrayList = C4628a.m23504c(parcel, m23514a, IdToken.CREATOR);
                    break;
                case 5:
                    str4 = C4628a.m23490q(parcel, m23514a);
                    break;
                case 6:
                    str3 = C4628a.m23490q(parcel, m23514a);
                    break;
                case 7:
                    str2 = C4628a.m23490q(parcel, m23514a);
                    break;
                case 8:
                    str = C4628a.m23490q(parcel, m23514a);
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
        return new Credential(i, str6, str5, uri, arrayList, str4, str3, str2, str);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public Credential[] newArray(int i) {
        return new Credential[i];
    }
}
