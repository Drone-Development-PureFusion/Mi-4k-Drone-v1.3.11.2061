package com.google.android.gms.ads.internal.cache;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C4628a;
import com.google.android.gms.common.internal.safeparcel.C4630b;
/* renamed from: com.google.android.gms.ads.internal.cache.b */
/* loaded from: classes2.dex */
public class C3493b implements Parcelable.Creator<CacheEntryParcel> {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m27649a(CacheEntryParcel cacheEntryParcel, Parcel parcel, int i) {
        int m23480a = C4630b.m23480a(parcel);
        C4630b.m23475a(parcel, 1, cacheEntryParcel.f13825a);
        C4630b.m23470a(parcel, 2, (Parcelable) cacheEntryParcel.m27667c(), i, false);
        C4630b.m23479a(parcel, m23480a);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public CacheEntryParcel createFromParcel(Parcel parcel) {
        int m23508b = C4628a.m23508b(parcel);
        int i = 0;
        ParcelFileDescriptor parcelFileDescriptor = null;
        while (parcel.dataPosition() < m23508b) {
            int m23514a = C4628a.m23514a(parcel);
            switch (C4628a.m23515a(m23514a)) {
                case 1:
                    i = C4628a.m23500g(parcel, m23514a);
                    break;
                case 2:
                    parcelFileDescriptor = (ParcelFileDescriptor) C4628a.m23510a(parcel, m23514a, ParcelFileDescriptor.CREATOR);
                    break;
                default:
                    C4628a.m23507b(parcel, m23514a);
                    break;
            }
        }
        if (parcel.dataPosition() != m23508b) {
            throw new C4628a.C4629a(new StringBuilder(37).append("Overread allowed size end=").append(m23508b).toString(), parcel);
        }
        return new CacheEntryParcel(i, parcelFileDescriptor);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public CacheEntryParcel[] newArray(int i) {
        return new CacheEntryParcel[i];
    }
}
