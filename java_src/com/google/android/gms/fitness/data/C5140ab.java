package com.google.android.gms.fitness.data;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C4628a;
import com.google.android.gms.common.internal.safeparcel.C4630b;
import java.util.ArrayList;
/* renamed from: com.google.android.gms.fitness.data.ab */
/* loaded from: classes2.dex */
public class C5140ab implements Parcelable.Creator<RawBucket> {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m21493a(RawBucket rawBucket, Parcel parcel, int i) {
        int m23480a = C4630b.m23480a(parcel);
        C4630b.m23474a(parcel, 1, rawBucket.f18618b);
        C4630b.m23474a(parcel, 2, rawBucket.f18619c);
        C4630b.m23470a(parcel, 3, (Parcelable) rawBucket.f18620d, i, false);
        C4630b.m23475a(parcel, 4, rawBucket.f18621e);
        C4630b.m23447c(parcel, 5, rawBucket.f18622f, false);
        C4630b.m23475a(parcel, 6, rawBucket.f18623g);
        C4630b.m23461a(parcel, 7, rawBucket.f18624h);
        C4630b.m23475a(parcel, 1000, rawBucket.f18617a);
        C4630b.m23479a(parcel, m23480a);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public RawBucket createFromParcel(Parcel parcel) {
        long j = 0;
        ArrayList arrayList = null;
        boolean z = false;
        int m23508b = C4628a.m23508b(parcel);
        int i = 0;
        int i2 = 0;
        Session session = null;
        long j2 = 0;
        int i3 = 0;
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
                    session = (Session) C4628a.m23510a(parcel, m23514a, Session.CREATOR);
                    break;
                case 4:
                    i2 = C4628a.m23500g(parcel, m23514a);
                    break;
                case 5:
                    arrayList = C4628a.m23504c(parcel, m23514a, RawDataSet.CREATOR);
                    break;
                case 6:
                    i = C4628a.m23500g(parcel, m23514a);
                    break;
                case 7:
                    z = C4628a.m23505c(parcel, m23514a);
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
        return new RawBucket(i3, j2, j, session, i2, arrayList, i, z);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public RawBucket[] newArray(int i) {
        return new RawBucket[i];
    }
}
