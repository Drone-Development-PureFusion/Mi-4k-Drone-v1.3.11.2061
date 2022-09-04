package com.google.android.gms.games.video;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C4628a;
import com.google.android.gms.common.internal.safeparcel.C4630b;
/* renamed from: com.google.android.gms.games.video.e */
/* loaded from: classes2.dex */
public class C6036e implements Parcelable.Creator<VideoEntity> {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m18977a(VideoEntity videoEntity, Parcel parcel, int i) {
        int m23480a = C4630b.m23480a(parcel);
        C4630b.m23475a(parcel, 1, videoEntity.mo18998c());
        C4630b.m23464a(parcel, 2, videoEntity.mo18997d(), false);
        C4630b.m23474a(parcel, 3, videoEntity.mo18996e());
        C4630b.m23474a(parcel, 4, videoEntity.mo18995f());
        C4630b.m23464a(parcel, 5, videoEntity.mo18994g(), false);
        C4630b.m23475a(parcel, 1000, videoEntity.m19000h());
        C4630b.m23479a(parcel, m23480a);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public VideoEntity createFromParcel(Parcel parcel) {
        long j = 0;
        String str = null;
        int i = 0;
        int m23508b = C4628a.m23508b(parcel);
        long j2 = 0;
        String str2 = null;
        int i2 = 0;
        while (parcel.dataPosition() < m23508b) {
            int m23514a = C4628a.m23514a(parcel);
            switch (C4628a.m23515a(m23514a)) {
                case 1:
                    i = C4628a.m23500g(parcel, m23514a);
                    break;
                case 2:
                    str2 = C4628a.m23490q(parcel, m23514a);
                    break;
                case 3:
                    j2 = C4628a.m23498i(parcel, m23514a);
                    break;
                case 4:
                    j = C4628a.m23498i(parcel, m23514a);
                    break;
                case 5:
                    str = C4628a.m23490q(parcel, m23514a);
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
        return new VideoEntity(i2, i, str2, j2, j, str);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public VideoEntity[] newArray(int i) {
        return new VideoEntity[i];
    }
}
