package com.google.android.gms.fitness.data;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C4628a;
import com.google.android.gms.common.internal.safeparcel.C4630b;
import com.google.android.gms.fitness.data.Goal;
import java.util.ArrayList;
/* renamed from: com.google.android.gms.fitness.data.v */
/* loaded from: classes2.dex */
public class C5164v implements Parcelable.Creator<Goal> {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m21420a(Goal goal, Parcel parcel, int i) {
        int m23480a = C4630b.m23480a(parcel);
        C4630b.m23474a(parcel, 1, goal.m21605e());
        C4630b.m23474a(parcel, 2, goal.m21604f());
        C4630b.m23446d(parcel, 3, goal.m21603g(), false);
        C4630b.m23470a(parcel, 4, (Parcelable) goal.m21608b(), i, false);
        C4630b.m23475a(parcel, 5, goal.m21607c());
        C4630b.m23470a(parcel, 6, (Parcelable) goal.m21602h(), i, false);
        C4630b.m23470a(parcel, 7, (Parcelable) goal.m21601i(), i, false);
        C4630b.m23475a(parcel, 1000, goal.m21606d());
        C4630b.m23470a(parcel, 8, (Parcelable) goal.m21600j(), i, false);
        C4630b.m23479a(parcel, m23480a);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public Goal createFromParcel(Parcel parcel) {
        long j = 0;
        int i = 0;
        Goal.FrequencyObjective frequencyObjective = null;
        int m23508b = C4628a.m23508b(parcel);
        ArrayList arrayList = new ArrayList();
        Goal.DurationObjective durationObjective = null;
        Goal.MetricObjective metricObjective = null;
        Goal.Recurrence recurrence = null;
        long j2 = 0;
        int i2 = 0;
        while (parcel.dataPosition() < m23508b) {
            int m23514a = C4628a.m23514a(parcel);
            switch (C4628a.m23515a(m23514a)) {
                case 1:
                    j2 = C4628a.m23498i(parcel, m23514a);
                    break;
                case 2:
                    j = C4628a.m23498i(parcel, m23514a);
                    break;
                case 3:
                    C4628a.m23509a(parcel, m23514a, arrayList, getClass().getClassLoader());
                    break;
                case 4:
                    recurrence = (Goal.Recurrence) C4628a.m23510a(parcel, m23514a, Goal.Recurrence.CREATOR);
                    break;
                case 5:
                    i = C4628a.m23500g(parcel, m23514a);
                    break;
                case 6:
                    metricObjective = (Goal.MetricObjective) C4628a.m23510a(parcel, m23514a, Goal.MetricObjective.CREATOR);
                    break;
                case 7:
                    durationObjective = (Goal.DurationObjective) C4628a.m23510a(parcel, m23514a, Goal.DurationObjective.CREATOR);
                    break;
                case 8:
                    frequencyObjective = (Goal.FrequencyObjective) C4628a.m23510a(parcel, m23514a, Goal.FrequencyObjective.CREATOR);
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
        return new Goal(i2, j2, j, arrayList, recurrence, i, metricObjective, durationObjective, frequencyObjective);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public Goal[] newArray(int i) {
        return new Goal[i];
    }
}
