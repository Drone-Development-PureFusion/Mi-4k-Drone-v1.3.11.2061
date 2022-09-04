package com.google.android.gms.awareness.snapshot.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C4628a;
import com.google.android.gms.common.internal.safeparcel.C4630b;
/* renamed from: com.google.android.gms.awareness.snapshot.internal.o */
/* loaded from: classes2.dex */
public class C4139o implements Parcelable.Creator<WeatherImpl> {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m25361a(WeatherImpl weatherImpl, Parcel parcel, int i) {
        int m23480a = C4630b.m23480a(parcel);
        C4630b.m23475a(parcel, 1, weatherImpl.m25428a());
        C4630b.m23476a(parcel, 2, weatherImpl.m25423d());
        C4630b.m23476a(parcel, 3, weatherImpl.m25424c());
        C4630b.m23476a(parcel, 4, weatherImpl.m25425b());
        C4630b.m23475a(parcel, 5, weatherImpl.mo25350e());
        C4630b.m23458a(parcel, 6, weatherImpl.mo25349f(), false);
        C4630b.m23479a(parcel, m23480a);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public WeatherImpl createFromParcel(Parcel parcel) {
        int i = 0;
        float f = 0.0f;
        int m23508b = C4628a.m23508b(parcel);
        int[] iArr = null;
        float f2 = 0.0f;
        float f3 = 0.0f;
        int i2 = 0;
        while (parcel.dataPosition() < m23508b) {
            int m23514a = C4628a.m23514a(parcel);
            switch (C4628a.m23515a(m23514a)) {
                case 1:
                    i2 = C4628a.m23500g(parcel, m23514a);
                    break;
                case 2:
                    f3 = C4628a.m23495l(parcel, m23514a);
                    break;
                case 3:
                    f2 = C4628a.m23495l(parcel, m23514a);
                    break;
                case 4:
                    f = C4628a.m23495l(parcel, m23514a);
                    break;
                case 5:
                    i = C4628a.m23500g(parcel, m23514a);
                    break;
                case 6:
                    iArr = C4628a.m23484w(parcel, m23514a);
                    break;
                default:
                    C4628a.m23507b(parcel, m23514a);
                    break;
            }
        }
        if (parcel.dataPosition() != m23508b) {
            throw new C4628a.C4629a(new StringBuilder(37).append("Overread allowed size end=").append(m23508b).toString(), parcel);
        }
        return new WeatherImpl(i2, f3, f2, f, i, iArr);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public WeatherImpl[] newArray(int i) {
        return new WeatherImpl[i];
    }
}
