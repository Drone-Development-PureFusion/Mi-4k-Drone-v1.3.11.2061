package com.google.android.gms.wearable.internal;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C4628a;
import com.google.android.gms.common.internal.safeparcel.C4630b;
/* renamed from: com.google.android.gms.wearable.internal.f */
/* loaded from: classes2.dex */
public class C9596f implements Parcelable.Creator<DataItemParcelable> {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m7786a(DataItemParcelable dataItemParcelable, Parcel parcel, int i) {
        int m23480a = C4630b.m23480a(parcel);
        C4630b.m23475a(parcel, 1, dataItemParcelable.f29922a);
        C4630b.m23470a(parcel, 2, (Parcelable) dataItemParcelable.mo7782c(), i, false);
        C4630b.m23473a(parcel, 4, dataItemParcelable.m8039g(), false);
        C4630b.m23460a(parcel, 5, dataItemParcelable.mo7781d(), false);
        C4630b.m23479a(parcel, m23480a);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public DataItemParcelable createFromParcel(Parcel parcel) {
        byte[] m23487t;
        Bundle bundle;
        Uri uri;
        int i;
        byte[] bArr = null;
        int m23508b = C4628a.m23508b(parcel);
        int i2 = 0;
        Bundle bundle2 = null;
        Uri uri2 = null;
        while (parcel.dataPosition() < m23508b) {
            int m23514a = C4628a.m23514a(parcel);
            switch (C4628a.m23515a(m23514a)) {
                case 1:
                    byte[] bArr2 = bArr;
                    bundle = bundle2;
                    uri = uri2;
                    i = C4628a.m23500g(parcel, m23514a);
                    m23487t = bArr2;
                    break;
                case 2:
                    i = i2;
                    Bundle bundle3 = bundle2;
                    uri = (Uri) C4628a.m23510a(parcel, m23514a, Uri.CREATOR);
                    m23487t = bArr;
                    bundle = bundle3;
                    break;
                case 3:
                default:
                    C4628a.m23507b(parcel, m23514a);
                    m23487t = bArr;
                    bundle = bundle2;
                    uri = uri2;
                    i = i2;
                    break;
                case 4:
                    uri = uri2;
                    i = i2;
                    byte[] bArr3 = bArr;
                    bundle = C4628a.m23488s(parcel, m23514a);
                    m23487t = bArr3;
                    break;
                case 5:
                    m23487t = C4628a.m23487t(parcel, m23514a);
                    bundle = bundle2;
                    uri = uri2;
                    i = i2;
                    break;
            }
            i2 = i;
            uri2 = uri;
            bundle2 = bundle;
            bArr = m23487t;
        }
        if (parcel.dataPosition() != m23508b) {
            throw new C4628a.C4629a(new StringBuilder(37).append("Overread allowed size end=").append(m23508b).toString(), parcel);
        }
        return new DataItemParcelable(i2, uri2, bundle2, bArr);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public DataItemParcelable[] newArray(int i) {
        return new DataItemParcelable[i];
    }
}
