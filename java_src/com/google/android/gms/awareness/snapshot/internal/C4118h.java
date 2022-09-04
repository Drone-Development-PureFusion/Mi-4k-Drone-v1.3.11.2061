package com.google.android.gms.awareness.snapshot.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C4628a;
import com.google.android.gms.common.internal.safeparcel.C4630b;
import com.google.firebase.p253b.C9755a;
/* renamed from: com.google.android.gms.awareness.snapshot.internal.h */
/* loaded from: classes2.dex */
public class C4118h implements Parcelable.Creator<PowerStateImpl> {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m25402a(PowerStateImpl powerStateImpl, Parcel parcel, int i) {
        int m23480a = C4630b.m23480a(parcel);
        C4630b.m23475a(parcel, 1, powerStateImpl.m25445c());
        C4630b.m23475a(parcel, 2, powerStateImpl.m25448a());
        C4630b.m23477a(parcel, 3, powerStateImpl.m25446b());
        C4630b.m23479a(parcel, m23480a);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public PowerStateImpl createFromParcel(Parcel parcel) {
        int i = 0;
        int m23508b = C4628a.m23508b(parcel);
        double d = C9755a.f30449c;
        int i2 = 0;
        while (parcel.dataPosition() < m23508b) {
            int m23514a = C4628a.m23514a(parcel);
            switch (C4628a.m23515a(m23514a)) {
                case 1:
                    i2 = C4628a.m23500g(parcel, m23514a);
                    break;
                case 2:
                    i = C4628a.m23500g(parcel, m23514a);
                    break;
                case 3:
                    d = C4628a.m23493n(parcel, m23514a);
                    break;
                default:
                    C4628a.m23507b(parcel, m23514a);
                    break;
            }
        }
        if (parcel.dataPosition() != m23508b) {
            throw new C4628a.C4629a(new StringBuilder(37).append("Overread allowed size end=").append(m23508b).toString(), parcel);
        }
        return new PowerStateImpl(i2, i, d);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public PowerStateImpl[] newArray(int i) {
        return new PowerStateImpl[i];
    }
}
