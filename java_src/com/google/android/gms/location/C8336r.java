package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.WorkSource;
import com.google.android.gms.common.internal.safeparcel.C4628a;
import com.google.android.gms.common.internal.safeparcel.C4630b;
/* renamed from: com.google.android.gms.location.r */
/* loaded from: classes2.dex */
public class C8336r implements Parcelable.Creator<ActivityRecognitionRequest> {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m12039a(ActivityRecognitionRequest activityRecognitionRequest, Parcel parcel, int i) {
        int m23480a = C4630b.m23480a(parcel);
        C4630b.m23474a(parcel, 1, activityRecognitionRequest.m12679a());
        C4630b.m23461a(parcel, 2, activityRecognitionRequest.m12678b());
        C4630b.m23470a(parcel, 3, (Parcelable) activityRecognitionRequest.m12677c(), i, false);
        C4630b.m23464a(parcel, 4, activityRecognitionRequest.m12676d(), false);
        C4630b.m23458a(parcel, 5, activityRecognitionRequest.m12675e(), false);
        C4630b.m23461a(parcel, 6, activityRecognitionRequest.m12674f());
        C4630b.m23464a(parcel, 7, activityRecognitionRequest.m12673g(), false);
        C4630b.m23475a(parcel, 1000, activityRecognitionRequest.m12671i());
        C4630b.m23474a(parcel, 8, activityRecognitionRequest.m12672h());
        C4630b.m23479a(parcel, m23480a);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public ActivityRecognitionRequest createFromParcel(Parcel parcel) {
        long j = 0;
        boolean z = false;
        String str = null;
        int m23508b = C4628a.m23508b(parcel);
        int[] iArr = null;
        String str2 = null;
        WorkSource workSource = null;
        boolean z2 = false;
        long j2 = 0;
        int i = 0;
        while (parcel.dataPosition() < m23508b) {
            int m23514a = C4628a.m23514a(parcel);
            switch (C4628a.m23515a(m23514a)) {
                case 1:
                    j2 = C4628a.m23498i(parcel, m23514a);
                    break;
                case 2:
                    z2 = C4628a.m23505c(parcel, m23514a);
                    break;
                case 3:
                    workSource = (WorkSource) C4628a.m23510a(parcel, m23514a, WorkSource.CREATOR);
                    break;
                case 4:
                    str2 = C4628a.m23490q(parcel, m23514a);
                    break;
                case 5:
                    iArr = C4628a.m23484w(parcel, m23514a);
                    break;
                case 6:
                    z = C4628a.m23505c(parcel, m23514a);
                    break;
                case 7:
                    str = C4628a.m23490q(parcel, m23514a);
                    break;
                case 8:
                    j = C4628a.m23498i(parcel, m23514a);
                    break;
                case 1000:
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
        return new ActivityRecognitionRequest(i, j2, z2, workSource, str2, iArr, z, str, j);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public ActivityRecognitionRequest[] newArray(int i) {
        return new ActivityRecognitionRequest[i];
    }
}
