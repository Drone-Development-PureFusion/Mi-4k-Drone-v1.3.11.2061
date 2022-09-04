package com.google.android.gms.games.video;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C4628a;
import com.google.android.gms.common.internal.safeparcel.C4630b;
/* renamed from: com.google.android.gms.games.video.d */
/* loaded from: classes2.dex */
public class C6035d implements Parcelable.Creator<VideoConfiguration> {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m18980a(VideoConfiguration videoConfiguration, Parcel parcel, int i) {
        int m23480a = C4630b.m23480a(parcel);
        C4630b.m23475a(parcel, 1, videoConfiguration.m19014b());
        C4630b.m23475a(parcel, 2, videoConfiguration.m19012c());
        C4630b.m23464a(parcel, 3, videoConfiguration.m19010e(), false);
        C4630b.m23464a(parcel, 4, videoConfiguration.m19011d(), false);
        C4630b.m23464a(parcel, 5, videoConfiguration.m19009f(), false);
        C4630b.m23464a(parcel, 6, videoConfiguration.m19008g(), false);
        C4630b.m23461a(parcel, 7, videoConfiguration.m19007h());
        C4630b.m23475a(parcel, 1000, videoConfiguration.m19016a());
        C4630b.m23479a(parcel, m23480a);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public VideoConfiguration createFromParcel(Parcel parcel) {
        String str = null;
        boolean z = false;
        int m23508b = C4628a.m23508b(parcel);
        String str2 = null;
        String str3 = null;
        String str4 = null;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (parcel.dataPosition() < m23508b) {
            int m23514a = C4628a.m23514a(parcel);
            switch (C4628a.m23515a(m23514a)) {
                case 1:
                    i2 = C4628a.m23500g(parcel, m23514a);
                    break;
                case 2:
                    i = C4628a.m23500g(parcel, m23514a);
                    break;
                case 3:
                    str4 = C4628a.m23490q(parcel, m23514a);
                    break;
                case 4:
                    str3 = C4628a.m23490q(parcel, m23514a);
                    break;
                case 5:
                    str2 = C4628a.m23490q(parcel, m23514a);
                    break;
                case 6:
                    str = C4628a.m23490q(parcel, m23514a);
                    break;
                case 7:
                    z = C4628a.m23505c(parcel, m23514a);
                    break;
                case 1000:
                    i3 = C4628a.m23500g(parcel, m23514a);
                    break;
                default:
                    C4628a.m23507b(parcel, m23514a);
                    break;
            }
        }
        if (parcel.dataPosition() != m23508b) {
            throw new C4628a.C4629a(new StringBuilder(37).append("Overread allowed size end=").append(m23508b).toString(), parcel);
        }
        return new VideoConfiguration(i3, i2, i, str4, str3, str2, str, z);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public VideoConfiguration[] newArray(int i) {
        return new VideoConfiguration[i];
    }
}
