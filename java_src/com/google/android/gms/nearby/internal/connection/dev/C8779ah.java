package com.google.android.gms.nearby.internal.connection.dev;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C4628a;
import com.google.android.gms.common.internal.safeparcel.C4630b;
/* renamed from: com.google.android.gms.nearby.internal.connection.dev.ah */
/* loaded from: classes2.dex */
public class C8779ah implements Parcelable.Creator<ParcelablePayload> {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m10088a(ParcelablePayload parcelablePayload, Parcel parcel, int i) {
        int m23480a = C4630b.m23480a(parcel);
        C4630b.m23474a(parcel, 1, parcelablePayload.m10140a());
        C4630b.m23475a(parcel, 2, parcelablePayload.m10139b());
        C4630b.m23460a(parcel, 3, parcelablePayload.m10138c(), false);
        C4630b.m23470a(parcel, 4, (Parcelable) parcelablePayload.m10137d(), i, false);
        C4630b.m23475a(parcel, 1000, parcelablePayload.f28119a);
        C4630b.m23479a(parcel, m23480a);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public ParcelablePayload createFromParcel(Parcel parcel) {
        ParcelFileDescriptor parcelFileDescriptor = null;
        int i = 0;
        int m23508b = C4628a.m23508b(parcel);
        long j = 0;
        byte[] bArr = null;
        int i2 = 0;
        while (parcel.dataPosition() < m23508b) {
            int m23514a = C4628a.m23514a(parcel);
            switch (C4628a.m23515a(m23514a)) {
                case 1:
                    j = C4628a.m23498i(parcel, m23514a);
                    break;
                case 2:
                    i = C4628a.m23500g(parcel, m23514a);
                    break;
                case 3:
                    bArr = C4628a.m23487t(parcel, m23514a);
                    break;
                case 4:
                    parcelFileDescriptor = (ParcelFileDescriptor) C4628a.m23510a(parcel, m23514a, ParcelFileDescriptor.CREATOR);
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
        return new ParcelablePayload(i2, j, i, bArr, parcelFileDescriptor);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public ParcelablePayload[] newArray(int i) {
        return new ParcelablePayload[i];
    }
}
