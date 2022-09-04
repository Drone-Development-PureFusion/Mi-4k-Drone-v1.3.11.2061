package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C4628a;
import com.google.android.gms.common.internal.safeparcel.C4630b;
import java.util.ArrayList;
/* renamed from: com.google.android.gms.drive.internal.ag */
/* loaded from: classes2.dex */
public class C4851ag implements Parcelable.Creator<OnResourceIdSetResponse> {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m22577a(OnResourceIdSetResponse onResourceIdSetResponse, Parcel parcel, int i) {
        int m23480a = C4630b.m23480a(parcel);
        C4630b.m23475a(parcel, 1, onResourceIdSetResponse.m22604a());
        C4630b.m23449b(parcel, 2, onResourceIdSetResponse.m22603b(), false);
        C4630b.m23479a(parcel, m23480a);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public OnResourceIdSetResponse createFromParcel(Parcel parcel) {
        int m23508b = C4628a.m23508b(parcel);
        int i = 0;
        ArrayList<String> arrayList = null;
        while (parcel.dataPosition() < m23508b) {
            int m23514a = C4628a.m23514a(parcel);
            switch (C4628a.m23515a(m23514a)) {
                case 1:
                    i = C4628a.m23500g(parcel, m23514a);
                    break;
                case 2:
                    arrayList = C4628a.m23518E(parcel, m23514a);
                    break;
                default:
                    C4628a.m23507b(parcel, m23514a);
                    break;
            }
        }
        if (parcel.dataPosition() != m23508b) {
            throw new C4628a.C4629a(new StringBuilder(37).append("Overread allowed size end=").append(m23508b).toString(), parcel);
        }
        return new OnResourceIdSetResponse(i, arrayList);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public OnResourceIdSetResponse[] newArray(int i) {
        return new OnResourceIdSetResponse[i];
    }
}
