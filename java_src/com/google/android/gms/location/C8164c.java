package com.google.android.gms.location;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C4628a;
import com.google.android.gms.common.internal.safeparcel.C4630b;
import java.util.ArrayList;
/* renamed from: com.google.android.gms.location.c */
/* loaded from: classes2.dex */
public class C8164c implements Parcelable.Creator<ActivityRecognitionResult> {

    /* renamed from: a */
    public static final int f26709a = 0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m12570a(ActivityRecognitionResult activityRecognitionResult, Parcel parcel, int i) {
        int m23480a = C4630b.m23480a(parcel);
        C4630b.m23447c(parcel, 1, activityRecognitionResult.f26624a, false);
        C4630b.m23474a(parcel, 2, activityRecognitionResult.f26625b);
        C4630b.m23474a(parcel, 3, activityRecognitionResult.f26626c);
        C4630b.m23475a(parcel, 4, activityRecognitionResult.f26627d);
        C4630b.m23473a(parcel, 5, activityRecognitionResult.f26628e, false);
        C4630b.m23475a(parcel, 1000, activityRecognitionResult.m12660e());
        C4630b.m23479a(parcel, m23480a);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public ActivityRecognitionResult createFromParcel(Parcel parcel) {
        long j = 0;
        Bundle bundle = null;
        int i = 0;
        int m23508b = C4628a.m23508b(parcel);
        long j2 = 0;
        ArrayList arrayList = null;
        int i2 = 0;
        while (parcel.dataPosition() < m23508b) {
            int m23514a = C4628a.m23514a(parcel);
            switch (C4628a.m23515a(m23514a)) {
                case 1:
                    arrayList = C4628a.m23504c(parcel, m23514a, DetectedActivity.CREATOR);
                    break;
                case 2:
                    j2 = C4628a.m23498i(parcel, m23514a);
                    break;
                case 3:
                    j = C4628a.m23498i(parcel, m23514a);
                    break;
                case 4:
                    i = C4628a.m23500g(parcel, m23514a);
                    break;
                case 5:
                    bundle = C4628a.m23488s(parcel, m23514a);
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
        return new ActivityRecognitionResult(i2, arrayList, j2, j, i, bundle);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public ActivityRecognitionResult[] newArray(int i) {
        return new ActivityRecognitionResult[i];
    }
}
