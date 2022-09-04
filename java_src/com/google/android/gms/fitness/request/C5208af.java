package com.google.android.gms.fitness.request;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C4628a;
import com.google.android.gms.common.internal.safeparcel.C4630b;
import java.util.ArrayList;
/* renamed from: com.google.android.gms.fitness.request.af */
/* loaded from: classes2.dex */
public class C5208af implements Parcelable.Creator<GoalsReadRequest> {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m21089a(GoalsReadRequest goalsReadRequest, Parcel parcel, int i) {
        int m23480a = C4630b.m23480a(parcel);
        C4630b.m23472a(parcel, 1, goalsReadRequest.m21235c(), false);
        C4630b.m23446d(parcel, 2, goalsReadRequest.m21238a(), false);
        C4630b.m23475a(parcel, 1000, goalsReadRequest.m21236b());
        C4630b.m23479a(parcel, m23480a);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public GoalsReadRequest createFromParcel(Parcel parcel) {
        int m23508b = C4628a.m23508b(parcel);
        int i = 0;
        IBinder iBinder = null;
        ArrayList arrayList = new ArrayList();
        while (parcel.dataPosition() < m23508b) {
            int m23514a = C4628a.m23514a(parcel);
            switch (C4628a.m23515a(m23514a)) {
                case 1:
                    iBinder = C4628a.m23489r(parcel, m23514a);
                    break;
                case 2:
                    C4628a.m23509a(parcel, m23514a, arrayList, getClass().getClassLoader());
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
        return new GoalsReadRequest(i, iBinder, arrayList);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public GoalsReadRequest[] newArray(int i) {
        return new GoalsReadRequest[i];
    }
}
