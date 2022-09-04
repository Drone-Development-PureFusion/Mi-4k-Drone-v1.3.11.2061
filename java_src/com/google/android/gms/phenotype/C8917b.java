package com.google.android.gms.phenotype;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C4628a;
import com.google.android.gms.common.internal.safeparcel.C4630b;
import com.google.firebase.p253b.C9755a;
/* renamed from: com.google.android.gms.phenotype.b */
/* loaded from: classes2.dex */
public class C8917b implements Parcelable.Creator<Flag> {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m9731a(Flag flag, Parcel parcel, int i) {
        int m23480a = C4630b.m23480a(parcel);
        C4630b.m23475a(parcel, 1, flag.f28404a);
        C4630b.m23464a(parcel, 2, flag.f28405b, false);
        C4630b.m23474a(parcel, 3, flag.f28406c);
        C4630b.m23461a(parcel, 4, flag.f28407d);
        C4630b.m23477a(parcel, 5, flag.f28408e);
        C4630b.m23464a(parcel, 6, flag.f28409f, false);
        C4630b.m23460a(parcel, 7, flag.f28410g, false);
        C4630b.m23475a(parcel, 8, flag.f28411h);
        C4630b.m23475a(parcel, 9, flag.f28412i);
        C4630b.m23479a(parcel, m23480a);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public Flag createFromParcel(Parcel parcel) {
        byte[] bArr = null;
        int i = 0;
        int m23508b = C4628a.m23508b(parcel);
        long j = 0;
        double d = C9755a.f30449c;
        int i2 = 0;
        String str = null;
        boolean z = false;
        String str2 = null;
        int i3 = 0;
        while (parcel.dataPosition() < m23508b) {
            int m23514a = C4628a.m23514a(parcel);
            switch (C4628a.m23515a(m23514a)) {
                case 1:
                    i3 = C4628a.m23500g(parcel, m23514a);
                    break;
                case 2:
                    str2 = C4628a.m23490q(parcel, m23514a);
                    break;
                case 3:
                    j = C4628a.m23498i(parcel, m23514a);
                    break;
                case 4:
                    z = C4628a.m23505c(parcel, m23514a);
                    break;
                case 5:
                    d = C4628a.m23493n(parcel, m23514a);
                    break;
                case 6:
                    str = C4628a.m23490q(parcel, m23514a);
                    break;
                case 7:
                    bArr = C4628a.m23487t(parcel, m23514a);
                    break;
                case 8:
                    i2 = C4628a.m23500g(parcel, m23514a);
                    break;
                case 9:
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
        return new Flag(i3, str2, j, z, d, str, bArr, i2, i);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public Flag[] newArray(int i) {
        return new Flag[i];
    }
}
