package com.google.android.gms.common.images;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C4628a;
import com.google.android.gms.common.internal.safeparcel.C4630b;
/* renamed from: com.google.android.gms.common.images.c */
/* loaded from: classes2.dex */
public class C4554c implements Parcelable.Creator<WebImage> {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m23744a(WebImage webImage, Parcel parcel, int i) {
        int m23480a = C4630b.m23480a(parcel);
        C4630b.m23475a(parcel, 1, webImage.m23765a());
        C4630b.m23470a(parcel, 2, (Parcelable) webImage.m23763b(), i, false);
        C4630b.m23475a(parcel, 3, webImage.m23762c());
        C4630b.m23475a(parcel, 4, webImage.m23761d());
        C4630b.m23479a(parcel, m23480a);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public WebImage createFromParcel(Parcel parcel) {
        int m23500g;
        int i;
        Uri uri;
        int i2;
        int i3 = 0;
        int m23508b = C4628a.m23508b(parcel);
        Uri uri2 = null;
        int i4 = 0;
        int i5 = 0;
        while (parcel.dataPosition() < m23508b) {
            int m23514a = C4628a.m23514a(parcel);
            switch (C4628a.m23515a(m23514a)) {
                case 1:
                    int i6 = i3;
                    i = i4;
                    uri = uri2;
                    i2 = C4628a.m23500g(parcel, m23514a);
                    m23500g = i6;
                    break;
                case 2:
                    i2 = i5;
                    int i7 = i4;
                    uri = (Uri) C4628a.m23510a(parcel, m23514a, Uri.CREATOR);
                    m23500g = i3;
                    i = i7;
                    break;
                case 3:
                    uri = uri2;
                    i2 = i5;
                    int i8 = i3;
                    i = C4628a.m23500g(parcel, m23514a);
                    m23500g = i8;
                    break;
                case 4:
                    m23500g = C4628a.m23500g(parcel, m23514a);
                    i = i4;
                    uri = uri2;
                    i2 = i5;
                    break;
                default:
                    C4628a.m23507b(parcel, m23514a);
                    m23500g = i3;
                    i = i4;
                    uri = uri2;
                    i2 = i5;
                    break;
            }
            i5 = i2;
            uri2 = uri;
            i4 = i;
            i3 = m23500g;
        }
        if (parcel.dataPosition() != m23508b) {
            throw new C4628a.C4629a(new StringBuilder(37).append("Overread allowed size end=").append(m23508b).toString(), parcel);
        }
        return new WebImage(i5, uri2, i4, i3);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public WebImage[] newArray(int i) {
        return new WebImage[i];
    }
}
