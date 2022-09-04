package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C4628a;
import com.google.android.gms.common.internal.safeparcel.C4630b;
import com.google.android.gms.location.internal.ClientIdentity;
import java.util.ArrayList;
/* renamed from: com.google.android.gms.location.t */
/* loaded from: classes2.dex */
public class C8338t implements Parcelable.Creator<ActivityTransitionRequest> {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m12033a(ActivityTransitionRequest activityTransitionRequest, Parcel parcel, int i) {
        int m23480a = C4630b.m23480a(parcel);
        C4630b.m23447c(parcel, 1, activityTransitionRequest.m12652b(), false);
        C4630b.m23464a(parcel, 2, activityTransitionRequest.m12651c(), false);
        C4630b.m23447c(parcel, 3, activityTransitionRequest.m12650d(), false);
        C4630b.m23475a(parcel, 1000, activityTransitionRequest.m12654a());
        C4630b.m23479a(parcel, m23480a);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public ActivityTransitionRequest createFromParcel(Parcel parcel) {
        ArrayList arrayList = null;
        int m23508b = C4628a.m23508b(parcel);
        int i = 0;
        String str = null;
        ArrayList arrayList2 = null;
        while (parcel.dataPosition() < m23508b) {
            int m23514a = C4628a.m23514a(parcel);
            switch (C4628a.m23515a(m23514a)) {
                case 1:
                    arrayList2 = C4628a.m23504c(parcel, m23514a, ActivityTransition.CREATOR);
                    break;
                case 2:
                    str = C4628a.m23490q(parcel, m23514a);
                    break;
                case 3:
                    arrayList = C4628a.m23504c(parcel, m23514a, ClientIdentity.CREATOR);
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
        return new ActivityTransitionRequest(i, arrayList2, str, arrayList);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public ActivityTransitionRequest[] newArray(int i) {
        return new ActivityTransitionRequest[i];
    }
}
