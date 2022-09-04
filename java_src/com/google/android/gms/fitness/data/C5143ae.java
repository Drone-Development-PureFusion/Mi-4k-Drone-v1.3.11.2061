package com.google.android.gms.fitness.data;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C4628a;
import com.google.android.gms.common.internal.safeparcel.C4630b;
import com.google.android.gms.fitness.data.Goal;
/* renamed from: com.google.android.gms.fitness.data.ae */
/* loaded from: classes2.dex */
public class C5143ae implements Parcelable.Creator<Goal.Recurrence> {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m21484a(Goal.Recurrence recurrence, Parcel parcel, int i) {
        int m23480a = C4630b.m23480a(parcel);
        C4630b.m23475a(parcel, 1, recurrence.m21588a());
        C4630b.m23475a(parcel, 2, recurrence.m21585b());
        C4630b.m23475a(parcel, 1000, recurrence.m21584c());
        C4630b.m23479a(parcel, m23480a);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public Goal.Recurrence createFromParcel(Parcel parcel) {
        int i = 0;
        int m23508b = C4628a.m23508b(parcel);
        int i2 = 0;
        int i3 = 0;
        while (parcel.dataPosition() < m23508b) {
            int m23514a = C4628a.m23514a(parcel);
            switch (C4628a.m23515a(m23514a)) {
                case 1:
                    i2 = C4628a.m23500g(parcel, m23514a);
                    break;
                case 2:
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
        return new Goal.Recurrence(i3, i2, i);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public Goal.Recurrence[] newArray(int i) {
        return new Goal.Recurrence[i];
    }
}
