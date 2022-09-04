package com.google.android.gms.auth.api.credentials;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C4628a;
import com.google.android.gms.common.internal.safeparcel.C4630b;
import java.util.ArrayList;
/* renamed from: com.google.android.gms.auth.api.credentials.i */
/* loaded from: classes2.dex */
public class C4011i implements Parcelable.Creator<PasswordSpecification> {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m25748a(PasswordSpecification passwordSpecification, Parcel parcel, int i) {
        int m23480a = C4630b.m23480a(parcel);
        C4630b.m23464a(parcel, 1, passwordSpecification.f15425d, false);
        C4630b.m23449b(parcel, 2, passwordSpecification.f15426e, false);
        C4630b.m23463a(parcel, 3, passwordSpecification.f15427f, false);
        C4630b.m23475a(parcel, 4, passwordSpecification.f15428g);
        C4630b.m23475a(parcel, 5, passwordSpecification.f15429h);
        C4630b.m23475a(parcel, 1000, passwordSpecification.f15424c);
        C4630b.m23479a(parcel, m23480a);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public PasswordSpecification createFromParcel(Parcel parcel) {
        ArrayList<Integer> arrayList = null;
        int i = 0;
        int m23508b = C4628a.m23508b(parcel);
        int i2 = 0;
        ArrayList<String> arrayList2 = null;
        String str = null;
        int i3 = 0;
        while (parcel.dataPosition() < m23508b) {
            int m23514a = C4628a.m23514a(parcel);
            switch (C4628a.m23515a(m23514a)) {
                case 1:
                    str = C4628a.m23490q(parcel, m23514a);
                    break;
                case 2:
                    arrayList2 = C4628a.m23518E(parcel, m23514a);
                    break;
                case 3:
                    arrayList = C4628a.m23519D(parcel, m23514a);
                    break;
                case 4:
                    i2 = C4628a.m23500g(parcel, m23514a);
                    break;
                case 5:
                    i = C4628a.m23500g(parcel, m23514a);
                    break;
                case 1000:
                    i3 = C4628a.m23500g(parcel, m23514a);
                    break;
                default:
                    C4628a.m23507b(parcel, m23514a);
                    break;
            }
        }
        if (parcel.dataPosition() != m23508b) {
            throw new C4628a.C4629a(new StringBuilder(37).append("Overread allowed size end=").append(m23508b).toString(), parcel);
        }
        return new PasswordSpecification(i3, str, arrayList2, arrayList, i2, i);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public PasswordSpecification[] newArray(int i) {
        return new PasswordSpecification[i];
    }
}
