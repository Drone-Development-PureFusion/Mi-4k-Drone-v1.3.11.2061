package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C4628a;
import com.google.android.gms.common.internal.safeparcel.C4630b;
/* renamed from: com.google.android.gms.measurement.internal.w */
/* loaded from: classes2.dex */
public class C8737w implements Parcelable.Creator<EventParcel> {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m10339a(EventParcel eventParcel, Parcel parcel, int i) {
        int m23480a = C4630b.m23480a(parcel);
        C4630b.m23475a(parcel, 1, eventParcel.f27609a);
        C4630b.m23464a(parcel, 2, eventParcel.f27610b, false);
        C4630b.m23470a(parcel, 3, (Parcelable) eventParcel.f27611c, i, false);
        C4630b.m23464a(parcel, 4, eventParcel.f27612d, false);
        C4630b.m23474a(parcel, 5, eventParcel.f27613e);
        C4630b.m23479a(parcel, m23480a);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public EventParcel createFromParcel(Parcel parcel) {
        String str = null;
        int m23508b = C4628a.m23508b(parcel);
        int i = 0;
        long j = 0;
        EventParams eventParams = null;
        String str2 = null;
        while (parcel.dataPosition() < m23508b) {
            int m23514a = C4628a.m23514a(parcel);
            switch (C4628a.m23515a(m23514a)) {
                case 1:
                    i = C4628a.m23500g(parcel, m23514a);
                    break;
                case 2:
                    str2 = C4628a.m23490q(parcel, m23514a);
                    break;
                case 3:
                    eventParams = (EventParams) C4628a.m23510a(parcel, m23514a, EventParams.CREATOR);
                    break;
                case 4:
                    str = C4628a.m23490q(parcel, m23514a);
                    break;
                case 5:
                    j = C4628a.m23498i(parcel, m23514a);
                    break;
                default:
                    C4628a.m23507b(parcel, m23514a);
                    break;
            }
        }
        if (parcel.dataPosition() != m23508b) {
            throw new C4628a.C4629a(new StringBuilder(37).append("Overread allowed size end=").append(m23508b).toString(), parcel);
        }
        return new EventParcel(i, str2, eventParams, str, j);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public EventParcel[] newArray(int i) {
        return new EventParcel[i];
    }
}
