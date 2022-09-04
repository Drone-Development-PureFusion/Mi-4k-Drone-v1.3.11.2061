package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C4628a;
import com.google.android.gms.common.internal.safeparcel.C4630b;
import com.google.android.gms.drive.Contents;
/* renamed from: com.google.android.gms.drive.internal.bh */
/* loaded from: classes2.dex */
public class C4884bh implements Parcelable.Creator<CloseContentsRequest> {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m22499a(CloseContentsRequest closeContentsRequest, Parcel parcel, int i) {
        int m23480a = C4630b.m23480a(parcel);
        C4630b.m23475a(parcel, 1, closeContentsRequest.f17675a);
        C4630b.m23470a(parcel, 2, (Parcelable) closeContentsRequest.f17676b, i, false);
        C4630b.m23469a(parcel, 3, closeContentsRequest.f17677c, false);
        C4630b.m23475a(parcel, 4, closeContentsRequest.f17678d);
        C4630b.m23479a(parcel, m23480a);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public CloseContentsRequest createFromParcel(Parcel parcel) {
        int m23500g;
        Boolean bool;
        Contents contents;
        int i;
        Boolean bool2 = null;
        int i2 = 0;
        int m23508b = C4628a.m23508b(parcel);
        Contents contents2 = null;
        int i3 = 0;
        while (parcel.dataPosition() < m23508b) {
            int m23514a = C4628a.m23514a(parcel);
            switch (C4628a.m23515a(m23514a)) {
                case 1:
                    int i4 = i2;
                    bool = bool2;
                    contents = contents2;
                    i = C4628a.m23500g(parcel, m23514a);
                    m23500g = i4;
                    break;
                case 2:
                    i = i3;
                    Boolean bool3 = bool2;
                    contents = (Contents) C4628a.m23510a(parcel, m23514a, Contents.CREATOR);
                    m23500g = i2;
                    bool = bool3;
                    break;
                case 3:
                    contents = contents2;
                    i = i3;
                    int i5 = i2;
                    bool = C4628a.m23503d(parcel, m23514a);
                    m23500g = i5;
                    break;
                case 4:
                    m23500g = C4628a.m23500g(parcel, m23514a);
                    bool = bool2;
                    contents = contents2;
                    i = i3;
                    break;
                default:
                    C4628a.m23507b(parcel, m23514a);
                    m23500g = i2;
                    bool = bool2;
                    contents = contents2;
                    i = i3;
                    break;
            }
            i3 = i;
            contents2 = contents;
            bool2 = bool;
            i2 = m23500g;
        }
        if (parcel.dataPosition() != m23508b) {
            throw new C4628a.C4629a(new StringBuilder(37).append("Overread allowed size end=").append(m23508b).toString(), parcel);
        }
        return new CloseContentsRequest(i3, contents2, bool2, i2);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public CloseContentsRequest[] newArray(int i) {
        return new CloseContentsRequest[i];
    }
}
