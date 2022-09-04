package com.google.android.gms.cast;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C4628a;
import com.google.android.gms.common.internal.safeparcel.C4630b;
import java.util.ArrayList;
/* renamed from: com.google.android.gms.cast.m */
/* loaded from: classes2.dex */
public class C4449m implements Parcelable.Creator<MediaInfo> {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m24099a(MediaInfo mediaInfo, Parcel parcel, int i) {
        int m23480a = C4630b.m23480a(parcel);
        C4630b.m23475a(parcel, 1, mediaInfo.m25151a());
        C4630b.m23464a(parcel, 2, mediaInfo.m25143b(), false);
        C4630b.m23475a(parcel, 3, mediaInfo.m25141c());
        C4630b.m23464a(parcel, 4, mediaInfo.m25140d(), false);
        C4630b.m23470a(parcel, 5, (Parcelable) mediaInfo.m25139e(), i, false);
        C4630b.m23474a(parcel, 6, mediaInfo.m25138f());
        C4630b.m23447c(parcel, 7, mediaInfo.m25137g(), false);
        C4630b.m23470a(parcel, 8, (Parcelable) mediaInfo.m25136h(), i, false);
        C4630b.m23464a(parcel, 9, mediaInfo.f15860f, false);
        C4630b.m23447c(parcel, 10, mediaInfo.m25134j(), false);
        C4630b.m23479a(parcel, m23480a);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public MediaInfo createFromParcel(Parcel parcel) {
        int i = 0;
        ArrayList arrayList = null;
        int m23508b = C4628a.m23508b(parcel);
        long j = 0;
        String str = null;
        TextTrackStyle textTrackStyle = null;
        ArrayList arrayList2 = null;
        MediaMetadata mediaMetadata = null;
        String str2 = null;
        String str3 = null;
        int i2 = 0;
        while (parcel.dataPosition() < m23508b) {
            int m23514a = C4628a.m23514a(parcel);
            switch (C4628a.m23515a(m23514a)) {
                case 1:
                    i2 = C4628a.m23500g(parcel, m23514a);
                    break;
                case 2:
                    str3 = C4628a.m23490q(parcel, m23514a);
                    break;
                case 3:
                    i = C4628a.m23500g(parcel, m23514a);
                    break;
                case 4:
                    str2 = C4628a.m23490q(parcel, m23514a);
                    break;
                case 5:
                    mediaMetadata = (MediaMetadata) C4628a.m23510a(parcel, m23514a, MediaMetadata.CREATOR);
                    break;
                case 6:
                    j = C4628a.m23498i(parcel, m23514a);
                    break;
                case 7:
                    arrayList2 = C4628a.m23504c(parcel, m23514a, MediaTrack.CREATOR);
                    break;
                case 8:
                    textTrackStyle = (TextTrackStyle) C4628a.m23510a(parcel, m23514a, TextTrackStyle.CREATOR);
                    break;
                case 9:
                    str = C4628a.m23490q(parcel, m23514a);
                    break;
                case 10:
                    arrayList = C4628a.m23504c(parcel, m23514a, AdBreakInfo.CREATOR);
                    break;
                default:
                    C4628a.m23507b(parcel, m23514a);
                    break;
            }
        }
        if (parcel.dataPosition() != m23508b) {
            throw new C4628a.C4629a(new StringBuilder(37).append("Overread allowed size end=").append(m23508b).toString(), parcel);
        }
        return new MediaInfo(i2, str3, i, str2, mediaMetadata, j, arrayList2, textTrackStyle, str, arrayList);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public MediaInfo[] newArray(int i) {
        return new MediaInfo[i];
    }
}
