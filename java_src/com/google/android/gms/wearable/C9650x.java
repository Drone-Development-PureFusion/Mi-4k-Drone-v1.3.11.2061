package com.google.android.gms.wearable;

import android.net.Uri;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C4628a;
import com.google.android.gms.common.internal.safeparcel.C4630b;
/* renamed from: com.google.android.gms.wearable.x */
/* loaded from: classes2.dex */
public class C9650x implements Parcelable.Creator<Asset> {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m7544a(Asset asset, Parcel parcel, int i) {
        int m23480a = C4630b.m23480a(parcel);
        C4630b.m23475a(parcel, 1, asset.f29785a);
        C4630b.m23460a(parcel, 2, asset.m8145a(), false);
        C4630b.m23464a(parcel, 3, asset.m8140b(), false);
        C4630b.m23470a(parcel, 4, (Parcelable) asset.f29786b, i, false);
        C4630b.m23470a(parcel, 5, (Parcelable) asset.f29787c, i, false);
        C4630b.m23479a(parcel, m23480a);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public Asset createFromParcel(Parcel parcel) {
        Uri uri = null;
        int m23508b = C4628a.m23508b(parcel);
        int i = 0;
        ParcelFileDescriptor parcelFileDescriptor = null;
        String str = null;
        byte[] bArr = null;
        while (parcel.dataPosition() < m23508b) {
            int m23514a = C4628a.m23514a(parcel);
            switch (C4628a.m23515a(m23514a)) {
                case 1:
                    i = C4628a.m23500g(parcel, m23514a);
                    break;
                case 2:
                    bArr = C4628a.m23487t(parcel, m23514a);
                    break;
                case 3:
                    str = C4628a.m23490q(parcel, m23514a);
                    break;
                case 4:
                    parcelFileDescriptor = (ParcelFileDescriptor) C4628a.m23510a(parcel, m23514a, ParcelFileDescriptor.CREATOR);
                    break;
                case 5:
                    uri = (Uri) C4628a.m23510a(parcel, m23514a, Uri.CREATOR);
                    break;
                default:
                    C4628a.m23507b(parcel, m23514a);
                    break;
            }
        }
        if (parcel.dataPosition() != m23508b) {
            throw new C4628a.C4629a(new StringBuilder(37).append("Overread allowed size end=").append(m23508b).toString(), parcel);
        }
        return new Asset(i, bArr, str, parcelFileDescriptor, uri);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public Asset[] newArray(int i) {
        return new Asset[i];
    }
}
