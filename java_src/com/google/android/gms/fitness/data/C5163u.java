package com.google.android.gms.fitness.data;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C4628a;
import com.google.android.gms.common.internal.safeparcel.C4630b;
import com.google.android.gms.fitness.data.Goal;
/* renamed from: com.google.android.gms.fitness.data.u */
/* loaded from: classes2.dex */
public class C5163u implements Parcelable.Creator<Goal.FrequencyObjective> {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m21423a(Goal.FrequencyObjective frequencyObjective, Parcel parcel, int i) {
        int m23480a = C4630b.m23480a(parcel);
        C4630b.m23475a(parcel, 1, frequencyObjective.m21596a());
        C4630b.m23475a(parcel, 1000, frequencyObjective.m21594b());
        C4630b.m23479a(parcel, m23480a);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public Goal.FrequencyObjective createFromParcel(Parcel parcel) {
        int i = 0;
        int m23508b = C4628a.m23508b(parcel);
        int i2 = 0;
        while (parcel.dataPosition() < m23508b) {
            int m23514a = C4628a.m23514a(parcel);
            switch (C4628a.m23515a(m23514a)) {
                case 1:
                    i = C4628a.m23500g(parcel, m23514a);
                    break;
                case 1000:
                    i2 = C4628a.m23500g(parcel, m23514a);
                    break;
                default:
                    C4628a.m23507b(parcel, m23514a);
                    break;
            }
        }
        if (parcel.dataPosition() != m23508b) {
            throw new C4628a.C4629a(new StringBuilder(37).append("Overread allowed size end=").append(m23508b).toString(), parcel);
        }
        return new Goal.FrequencyObjective(i2, i);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public Goal.FrequencyObjective[] newArray(int i) {
        return new Goal.FrequencyObjective[i];
    }
}
