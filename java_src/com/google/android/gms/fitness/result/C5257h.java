package com.google.android.gms.fitness.result;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.C4628a;
import com.google.android.gms.common.internal.safeparcel.C4630b;
/* renamed from: com.google.android.gms.fitness.result.h */
/* loaded from: classes2.dex */
public class C5257h implements Parcelable.Creator<FileUriResult> {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m20882a(FileUriResult fileUriResult, Parcel parcel, int i) {
        int m23480a = C4630b.m23480a(parcel);
        C4630b.m23470a(parcel, 1, (Parcelable) fileUriResult.m20931b(), i, false);
        C4630b.m23470a(parcel, 2, (Parcelable) fileUriResult.mo7645a(), i, false);
        C4630b.m23475a(parcel, 1000, fileUriResult.m20930c());
        C4630b.m23479a(parcel, m23480a);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public FileUriResult createFromParcel(Parcel parcel) {
        Uri uri;
        int m23500g;
        Status status;
        Status status2 = null;
        int m23508b = C4628a.m23508b(parcel);
        int i = 0;
        Uri uri2 = null;
        while (parcel.dataPosition() < m23508b) {
            int m23514a = C4628a.m23514a(parcel);
            switch (C4628a.m23515a(m23514a)) {
                case 1:
                    Uri uri3 = (Uri) C4628a.m23510a(parcel, m23514a, Uri.CREATOR);
                    m23500g = i;
                    status = status2;
                    uri = uri3;
                    break;
                case 2:
                    status = (Status) C4628a.m23510a(parcel, m23514a, Status.CREATOR);
                    uri = uri2;
                    m23500g = i;
                    break;
                case 1000:
                    Status status3 = status2;
                    uri = uri2;
                    m23500g = C4628a.m23500g(parcel, m23514a);
                    status = status3;
                    break;
                default:
                    C4628a.m23507b(parcel, m23514a);
                    status = status2;
                    uri = uri2;
                    m23500g = i;
                    break;
            }
            i = m23500g;
            uri2 = uri;
            status2 = status;
        }
        if (parcel.dataPosition() != m23508b) {
            throw new C4628a.C4629a(new StringBuilder(37).append("Overread allowed size end=").append(m23508b).toString(), parcel);
        }
        return new FileUriResult(i, uri2, status2);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public FileUriResult[] newArray(int i) {
        return new FileUriResult[i];
    }
}
