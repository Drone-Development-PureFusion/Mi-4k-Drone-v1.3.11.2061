package com.google.android.gms.cast;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C4628a;
import com.google.android.gms.common.internal.safeparcel.C4630b;
import com.google.firebase.p253b.C9755a;
import java.util.ArrayList;
/* renamed from: com.google.android.gms.cast.p */
/* loaded from: classes2.dex */
public class C4452p implements Parcelable.Creator<MediaStatus> {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m24090a(MediaStatus mediaStatus, Parcel parcel, int i) {
        int m23480a = C4630b.m23480a(parcel);
        C4630b.m23475a(parcel, 1, mediaStatus.m25068a());
        C4630b.m23470a(parcel, 2, (Parcelable) mediaStatus.m25051f(), i, false);
        C4630b.m23474a(parcel, 3, mediaStatus.m25059b());
        C4630b.m23475a(parcel, 4, mediaStatus.m25045l());
        C4630b.m23477a(parcel, 5, mediaStatus.m25053e());
        C4630b.m23475a(parcel, 6, mediaStatus.m25057c());
        C4630b.m23475a(parcel, 7, mediaStatus.m25055d());
        C4630b.m23474a(parcel, 8, mediaStatus.m25050g());
        C4630b.m23474a(parcel, 9, mediaStatus.f15954u);
        C4630b.m23477a(parcel, 10, mediaStatus.m25049h());
        C4630b.m23461a(parcel, 11, mediaStatus.m25048i());
        C4630b.m23457a(parcel, 12, mediaStatus.m25047j(), false);
        C4630b.m23475a(parcel, 13, mediaStatus.m25044m());
        C4630b.m23475a(parcel, 14, mediaStatus.m25043n());
        C4630b.m23464a(parcel, 15, mediaStatus.f15955v, false);
        C4630b.m23475a(parcel, 16, mediaStatus.f15956w);
        C4630b.m23447c(parcel, 17, mediaStatus.f15957x, false);
        C4630b.m23461a(parcel, 18, mediaStatus.m25039r());
        C4630b.m23479a(parcel, m23480a);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public MediaStatus createFromParcel(Parcel parcel) {
        int m23508b = C4628a.m23508b(parcel);
        int i = 0;
        MediaInfo mediaInfo = null;
        long j = 0;
        int i2 = 0;
        double d = C9755a.f30449c;
        int i3 = 0;
        int i4 = 0;
        long j2 = 0;
        long j3 = 0;
        double d2 = C9755a.f30449c;
        boolean z = false;
        long[] jArr = null;
        int i5 = 0;
        int i6 = 0;
        String str = null;
        int i7 = 0;
        ArrayList arrayList = null;
        boolean z2 = false;
        while (parcel.dataPosition() < m23508b) {
            int m23514a = C4628a.m23514a(parcel);
            switch (C4628a.m23515a(m23514a)) {
                case 1:
                    i = C4628a.m23500g(parcel, m23514a);
                    break;
                case 2:
                    mediaInfo = (MediaInfo) C4628a.m23510a(parcel, m23514a, MediaInfo.CREATOR);
                    break;
                case 3:
                    j = C4628a.m23498i(parcel, m23514a);
                    break;
                case 4:
                    i2 = C4628a.m23500g(parcel, m23514a);
                    break;
                case 5:
                    d = C4628a.m23493n(parcel, m23514a);
                    break;
                case 6:
                    i3 = C4628a.m23500g(parcel, m23514a);
                    break;
                case 7:
                    i4 = C4628a.m23500g(parcel, m23514a);
                    break;
                case 8:
                    j2 = C4628a.m23498i(parcel, m23514a);
                    break;
                case 9:
                    j3 = C4628a.m23498i(parcel, m23514a);
                    break;
                case 10:
                    d2 = C4628a.m23493n(parcel, m23514a);
                    break;
                case 11:
                    z = C4628a.m23505c(parcel, m23514a);
                    break;
                case 12:
                    jArr = C4628a.m23483x(parcel, m23514a);
                    break;
                case 13:
                    i5 = C4628a.m23500g(parcel, m23514a);
                    break;
                case 14:
                    i6 = C4628a.m23500g(parcel, m23514a);
                    break;
                case 15:
                    str = C4628a.m23490q(parcel, m23514a);
                    break;
                case 16:
                    i7 = C4628a.m23500g(parcel, m23514a);
                    break;
                case 17:
                    arrayList = C4628a.m23504c(parcel, m23514a, MediaQueueItem.CREATOR);
                    break;
                case 18:
                    z2 = C4628a.m23505c(parcel, m23514a);
                    break;
                default:
                    C4628a.m23507b(parcel, m23514a);
                    break;
            }
        }
        if (parcel.dataPosition() != m23508b) {
            throw new C4628a.C4629a(new StringBuilder(37).append("Overread allowed size end=").append(m23508b).toString(), parcel);
        }
        return new MediaStatus(i, mediaInfo, j, i2, d, i3, i4, j2, j3, d2, z, jArr, i5, i6, str, i7, arrayList, z2);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public MediaStatus[] newArray(int i) {
        return new MediaStatus[i];
    }
}
