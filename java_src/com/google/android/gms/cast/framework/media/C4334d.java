package com.google.android.gms.cast.framework.media;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C4628a;
import com.google.android.gms.common.internal.safeparcel.C4630b;
/* renamed from: com.google.android.gms.cast.framework.media.d */
/* loaded from: classes2.dex */
public class C4334d implements Parcelable.Creator<CastMediaOptions> {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m24491a(CastMediaOptions castMediaOptions, Parcel parcel, int i) {
        int m23480a = C4630b.m23480a(parcel);
        C4630b.m23475a(parcel, 1, castMediaOptions.m24703a());
        C4630b.m23464a(parcel, 2, castMediaOptions.m24702b(), false);
        C4630b.m23464a(parcel, 3, castMediaOptions.m24700d(), false);
        C4630b.m23472a(parcel, 4, castMediaOptions.m24698f(), false);
        C4630b.m23470a(parcel, 5, (Parcelable) castMediaOptions.m24701c(), i, false);
        C4630b.m23479a(parcel, m23480a);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public CastMediaOptions createFromParcel(Parcel parcel) {
        NotificationOptions notificationOptions = null;
        int m23508b = C4628a.m23508b(parcel);
        int i = 0;
        IBinder iBinder = null;
        String str = null;
        String str2 = null;
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
                    str = C4628a.m23490q(parcel, m23514a);
                    break;
                case 4:
                    iBinder = C4628a.m23489r(parcel, m23514a);
                    break;
                case 5:
                    notificationOptions = (NotificationOptions) C4628a.m23510a(parcel, m23514a, NotificationOptions.CREATOR);
                    break;
                default:
                    C4628a.m23507b(parcel, m23514a);
                    break;
            }
        }
        if (parcel.dataPosition() != m23508b) {
            throw new C4628a.C4629a(new StringBuilder(37).append("Overread allowed size end=").append(m23508b).toString(), parcel);
        }
        return new CastMediaOptions(i, str2, str, iBinder, notificationOptions);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public CastMediaOptions[] newArray(int i) {
        return new CastMediaOptions[i];
    }
}
