package com.google.android.gms.cast;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C4628a;
import com.google.android.gms.common.internal.safeparcel.C4630b;
import com.google.firebase.p253b.C9755a;
/* renamed from: com.google.android.gms.cast.o */
/* loaded from: classes2.dex */
public class C4451o implements Parcelable.Creator<MediaQueueItem> {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m24093a(MediaQueueItem mediaQueueItem, Parcel parcel, int i) {
        int m23480a = C4630b.m23480a(parcel);
        C4630b.m23475a(parcel, 1, mediaQueueItem.m25095a());
        C4630b.m23470a(parcel, 2, (Parcelable) mediaQueueItem.m25089b(), i, false);
        C4630b.m23475a(parcel, 3, mediaQueueItem.m25086c());
        C4630b.m23461a(parcel, 4, mediaQueueItem.m25084d());
        C4630b.m23477a(parcel, 5, mediaQueueItem.m25083e());
        C4630b.m23477a(parcel, 6, mediaQueueItem.m25082f());
        C4630b.m23477a(parcel, 7, mediaQueueItem.m25081g());
        C4630b.m23457a(parcel, 8, mediaQueueItem.m25080h(), false);
        C4630b.m23464a(parcel, 9, mediaQueueItem.f15909c, false);
        C4630b.m23479a(parcel, m23480a);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public MediaQueueItem createFromParcel(Parcel parcel) {
        int m23508b = C4628a.m23508b(parcel);
        int i = 0;
        MediaInfo mediaInfo = null;
        int i2 = 0;
        boolean z = false;
        double d = C9755a.f30449c;
        double d2 = C9755a.f30449c;
        double d3 = C9755a.f30449c;
        long[] jArr = null;
        String str = null;
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
                    i2 = C4628a.m23500g(parcel, m23514a);
                    break;
                case 4:
                    z = C4628a.m23505c(parcel, m23514a);
                    break;
                case 5:
                    d = C4628a.m23493n(parcel, m23514a);
                    break;
                case 6:
                    d2 = C4628a.m23493n(parcel, m23514a);
                    break;
                case 7:
                    d3 = C4628a.m23493n(parcel, m23514a);
                    break;
                case 8:
                    jArr = C4628a.m23483x(parcel, m23514a);
                    break;
                case 9:
                    str = C4628a.m23490q(parcel, m23514a);
                    break;
                default:
                    C4628a.m23507b(parcel, m23514a);
                    break;
            }
        }
        if (parcel.dataPosition() != m23508b) {
            throw new C4628a.C4629a(new StringBuilder(37).append("Overread allowed size end=").append(m23508b).toString(), parcel);
        }
        return new MediaQueueItem(i, mediaInfo, i2, z, d, d2, d3, jArr, str);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public MediaQueueItem[] newArray(int i) {
        return new MediaQueueItem[i];
    }
}
