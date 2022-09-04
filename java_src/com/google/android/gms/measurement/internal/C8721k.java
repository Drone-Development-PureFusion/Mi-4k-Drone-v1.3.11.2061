package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C4628a;
import com.google.android.gms.common.internal.safeparcel.C4630b;
/* renamed from: com.google.android.gms.measurement.internal.k */
/* loaded from: classes2.dex */
public class C8721k implements Parcelable.Creator<UserAttributeParcel> {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m10552a(UserAttributeParcel userAttributeParcel, Parcel parcel, int i) {
        int m23480a = C4630b.m23480a(parcel);
        C4630b.m23475a(parcel, 1, userAttributeParcel.f27614a);
        C4630b.m23464a(parcel, 2, userAttributeParcel.f27615b, false);
        C4630b.m23474a(parcel, 3, userAttributeParcel.f27616c);
        C4630b.m23465a(parcel, 4, userAttributeParcel.f27617d, false);
        C4630b.m23467a(parcel, 5, userAttributeParcel.f27618e, false);
        C4630b.m23464a(parcel, 6, userAttributeParcel.f27619f, false);
        C4630b.m23464a(parcel, 7, userAttributeParcel.f27620g, false);
        C4630b.m23468a(parcel, 8, userAttributeParcel.f27621h, false);
        C4630b.m23479a(parcel, m23480a);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public UserAttributeParcel createFromParcel(Parcel parcel) {
        Double d = null;
        int m23508b = C4628a.m23508b(parcel);
        int i = 0;
        long j = 0;
        String str = null;
        String str2 = null;
        Float f = null;
        Long l = null;
        String str3 = null;
        while (parcel.dataPosition() < m23508b) {
            int m23514a = C4628a.m23514a(parcel);
            switch (C4628a.m23515a(m23514a)) {
                case 1:
                    i = C4628a.m23500g(parcel, m23514a);
                    break;
                case 2:
                    str3 = C4628a.m23490q(parcel, m23514a);
                    break;
                case 3:
                    j = C4628a.m23498i(parcel, m23514a);
                    break;
                case 4:
                    l = C4628a.m23497j(parcel, m23514a);
                    break;
                case 5:
                    f = C4628a.m23494m(parcel, m23514a);
                    break;
                case 6:
                    str2 = C4628a.m23490q(parcel, m23514a);
                    break;
                case 7:
                    str = C4628a.m23490q(parcel, m23514a);
                    break;
                case 8:
                    d = C4628a.m23492o(parcel, m23514a);
                    break;
                default:
                    C4628a.m23507b(parcel, m23514a);
                    break;
            }
        }
        if (parcel.dataPosition() != m23508b) {
            throw new C4628a.C4629a(new StringBuilder(37).append("Overread allowed size end=").append(m23508b).toString(), parcel);
        }
        return new UserAttributeParcel(i, str3, j, l, f, str2, str, d);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public UserAttributeParcel[] newArray(int i) {
        return new UserAttributeParcel[i];
    }
}
