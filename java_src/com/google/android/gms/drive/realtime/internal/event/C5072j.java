package com.google.android.gms.drive.realtime.internal.event;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C4628a;
import com.google.android.gms.common.internal.safeparcel.C4630b;
/* renamed from: com.google.android.gms.drive.realtime.internal.event.j */
/* loaded from: classes2.dex */
public class C5072j implements Parcelable.Creator<ValuesRemovedDetails> {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m21899a(ValuesRemovedDetails valuesRemovedDetails, Parcel parcel, int i) {
        int m23480a = C4630b.m23480a(parcel);
        C4630b.m23475a(parcel, 1, valuesRemovedDetails.f18181a);
        C4630b.m23475a(parcel, 2, valuesRemovedDetails.f18182b);
        C4630b.m23475a(parcel, 3, valuesRemovedDetails.f18183c);
        C4630b.m23475a(parcel, 4, valuesRemovedDetails.f18184d);
        C4630b.m23464a(parcel, 5, valuesRemovedDetails.f18185e, false);
        C4630b.m23475a(parcel, 6, valuesRemovedDetails.f18186f);
        C4630b.m23479a(parcel, m23480a);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public ValuesRemovedDetails createFromParcel(Parcel parcel) {
        int i = 0;
        int m23508b = C4628a.m23508b(parcel);
        String str = null;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        while (parcel.dataPosition() < m23508b) {
            int m23514a = C4628a.m23514a(parcel);
            switch (C4628a.m23515a(m23514a)) {
                case 1:
                    i5 = C4628a.m23500g(parcel, m23514a);
                    break;
                case 2:
                    i4 = C4628a.m23500g(parcel, m23514a);
                    break;
                case 3:
                    i3 = C4628a.m23500g(parcel, m23514a);
                    break;
                case 4:
                    i2 = C4628a.m23500g(parcel, m23514a);
                    break;
                case 5:
                    str = C4628a.m23490q(parcel, m23514a);
                    break;
                case 6:
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
        return new ValuesRemovedDetails(i5, i4, i3, i2, str, i);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public ValuesRemovedDetails[] newArray(int i) {
        return new ValuesRemovedDetails[i];
    }
}
