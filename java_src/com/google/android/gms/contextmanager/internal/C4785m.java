package com.google.android.gms.contextmanager.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C4628a;
import com.google.android.gms.common.internal.safeparcel.C4630b;
import com.google.android.gms.contextmanager.internal.KeyFilterImpl;
/* renamed from: com.google.android.gms.contextmanager.internal.m */
/* loaded from: classes2.dex */
public class C4785m implements Parcelable.Creator<KeyFilterImpl.Inclusion> {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m22765a(KeyFilterImpl.Inclusion inclusion, Parcel parcel, int i) {
        int m23480a = C4630b.m23480a(parcel);
        C4630b.m23475a(parcel, 1, inclusion.m22849a());
        C4630b.m23455a(parcel, 2, inclusion.m22848b(), false);
        C4630b.m23455a(parcel, 3, inclusion.m22847c(), false);
        C4630b.m23455a(parcel, 4, inclusion.m22846d(), false);
        C4630b.m23479a(parcel, m23480a);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public KeyFilterImpl.Inclusion createFromParcel(Parcel parcel) {
        String[] strArr = null;
        int m23508b = C4628a.m23508b(parcel);
        int i = 0;
        String[] strArr2 = null;
        String[] strArr3 = null;
        while (parcel.dataPosition() < m23508b) {
            int m23514a = C4628a.m23514a(parcel);
            switch (C4628a.m23515a(m23514a)) {
                case 1:
                    i = C4628a.m23500g(parcel, m23514a);
                    break;
                case 2:
                    strArr3 = C4628a.m23520C(parcel, m23514a);
                    break;
                case 3:
                    strArr2 = C4628a.m23520C(parcel, m23514a);
                    break;
                case 4:
                    strArr = C4628a.m23520C(parcel, m23514a);
                    break;
                default:
                    C4628a.m23507b(parcel, m23514a);
                    break;
            }
        }
        if (parcel.dataPosition() != m23508b) {
            throw new C4628a.C4629a(new StringBuilder(37).append("Overread allowed size end=").append(m23508b).toString(), parcel);
        }
        return new KeyFilterImpl.Inclusion(i, strArr3, strArr2, strArr);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public KeyFilterImpl.Inclusion[] newArray(int i) {
        return new KeyFilterImpl.Inclusion[i];
    }
}
