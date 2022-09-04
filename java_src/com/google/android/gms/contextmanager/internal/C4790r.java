package com.google.android.gms.contextmanager.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C4628a;
import com.google.android.gms.common.internal.safeparcel.C4630b;
import com.google.android.gms.contextmanager.internal.TimeFilterImpl;
/* renamed from: com.google.android.gms.contextmanager.internal.r */
/* loaded from: classes2.dex */
public class C4790r implements Parcelable.Creator<TimeFilterImpl.Interval> {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m22750a(TimeFilterImpl.Interval interval, Parcel parcel, int i) {
        int m23480a = C4630b.m23480a(parcel);
        C4630b.m23475a(parcel, 1, interval.m22830a());
        C4630b.m23474a(parcel, 2, interval.m22829b());
        C4630b.m23474a(parcel, 3, interval.m22828c());
        C4630b.m23479a(parcel, m23480a);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public TimeFilterImpl.Interval createFromParcel(Parcel parcel) {
        long j = 0;
        int m23508b = C4628a.m23508b(parcel);
        int i = 0;
        long j2 = 0;
        while (parcel.dataPosition() < m23508b) {
            int m23514a = C4628a.m23514a(parcel);
            switch (C4628a.m23515a(m23514a)) {
                case 1:
                    i = C4628a.m23500g(parcel, m23514a);
                    break;
                case 2:
                    j2 = C4628a.m23498i(parcel, m23514a);
                    break;
                case 3:
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
        return new TimeFilterImpl.Interval(i, j2, j);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public TimeFilterImpl.Interval[] newArray(int i) {
        return new TimeFilterImpl.Interval[i];
    }
}
