package com.google.android.gms.vision.internal.client;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C4628a;
import com.google.android.gms.common.internal.safeparcel.C4630b;
/* renamed from: com.google.android.gms.vision.internal.client.b */
/* loaded from: classes2.dex */
public class C9306b implements Parcelable.Creator<FrameMetadataParcel> {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m8661a(FrameMetadataParcel frameMetadataParcel, Parcel parcel, int i) {
        int m23480a = C4630b.m23480a(parcel);
        C4630b.m23475a(parcel, 1, frameMetadataParcel.f29357a);
        C4630b.m23475a(parcel, 2, frameMetadataParcel.f29358b);
        C4630b.m23475a(parcel, 3, frameMetadataParcel.f29359c);
        C4630b.m23475a(parcel, 4, frameMetadataParcel.f29360d);
        C4630b.m23474a(parcel, 5, frameMetadataParcel.f29361e);
        C4630b.m23475a(parcel, 6, frameMetadataParcel.f29362f);
        C4630b.m23479a(parcel, m23480a);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public FrameMetadataParcel createFromParcel(Parcel parcel) {
        int i = 0;
        int m23508b = C4628a.m23508b(parcel);
        long j = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        while (parcel.dataPosition() < m23508b) {
            int m23514a = C4628a.m23514a(parcel);
            switch (C4628a.m23515a(m23514a)) {
                case 1:
                    i5 = C4628a.m23500g(parcel, m23514a);
                    break;
                case 2:
                    i4 = C4628a.m23500g(parcel, m23514a);
                    break;
                case 3:
                    i3 = C4628a.m23500g(parcel, m23514a);
                    break;
                case 4:
                    i2 = C4628a.m23500g(parcel, m23514a);
                    break;
                case 5:
                    j = C4628a.m23498i(parcel, m23514a);
                    break;
                case 6:
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
        return new FrameMetadataParcel(i5, i4, i3, i2, j, i);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public FrameMetadataParcel[] newArray(int i) {
        return new FrameMetadataParcel[i];
    }
}
