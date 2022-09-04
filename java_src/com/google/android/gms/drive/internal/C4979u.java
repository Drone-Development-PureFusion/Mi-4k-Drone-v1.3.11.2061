package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C4628a;
import com.google.android.gms.common.internal.safeparcel.C4630b;
import com.google.android.gms.drive.Contents;
/* renamed from: com.google.android.gms.drive.internal.u */
/* loaded from: classes2.dex */
public class C4979u implements Parcelable.Creator<OnContentsResponse> {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m22241a(OnContentsResponse onContentsResponse, Parcel parcel, int i) {
        int m23480a = C4630b.m23480a(parcel);
        C4630b.m23475a(parcel, 1, onContentsResponse.f17747a);
        C4630b.m23470a(parcel, 2, (Parcelable) onContentsResponse.f17748b, i, false);
        C4630b.m23461a(parcel, 3, onContentsResponse.f17749c);
        C4630b.m23479a(parcel, m23480a);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public OnContentsResponse createFromParcel(Parcel parcel) {
        boolean m23505c;
        Contents contents;
        int i;
        boolean z = false;
        int m23508b = C4628a.m23508b(parcel);
        Contents contents2 = null;
        int i2 = 0;
        while (parcel.dataPosition() < m23508b) {
            int m23514a = C4628a.m23514a(parcel);
            switch (C4628a.m23515a(m23514a)) {
                case 1:
                    boolean z2 = z;
                    contents = contents2;
                    i = C4628a.m23500g(parcel, m23514a);
                    m23505c = z2;
                    break;
                case 2:
                    Contents contents3 = (Contents) C4628a.m23510a(parcel, m23514a, Contents.CREATOR);
                    i = i2;
                    m23505c = z;
                    contents = contents3;
                    break;
                case 3:
                    m23505c = C4628a.m23505c(parcel, m23514a);
                    contents = contents2;
                    i = i2;
                    break;
                default:
                    C4628a.m23507b(parcel, m23514a);
                    m23505c = z;
                    contents = contents2;
                    i = i2;
                    break;
            }
            i2 = i;
            contents2 = contents;
            z = m23505c;
        }
        if (parcel.dataPosition() != m23508b) {
            throw new C4628a.C4629a(new StringBuilder(37).append("Overread allowed size end=").append(m23508b).toString(), parcel);
        }
        return new OnContentsResponse(i2, contents2, z);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public OnContentsResponse[] newArray(int i) {
        return new OnContentsResponse[i];
    }
}
