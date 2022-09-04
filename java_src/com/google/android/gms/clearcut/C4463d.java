package com.google.android.gms.clearcut;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C4628a;
import com.google.android.gms.common.internal.safeparcel.C4630b;
import com.google.android.gms.playlog.internal.PlayLoggerContext;
/* renamed from: com.google.android.gms.clearcut.d */
/* loaded from: classes2.dex */
public class C4463d implements Parcelable.Creator<LogEventParcelable> {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m24051a(LogEventParcelable logEventParcelable, Parcel parcel, int i) {
        int m23480a = C4630b.m23480a(parcel);
        C4630b.m23475a(parcel, 1, logEventParcelable.f16698a);
        C4630b.m23470a(parcel, 2, (Parcelable) logEventParcelable.f16699b, i, false);
        C4630b.m23460a(parcel, 3, logEventParcelable.f16700c, false);
        C4630b.m23458a(parcel, 4, logEventParcelable.f16701d, false);
        C4630b.m23455a(parcel, 5, logEventParcelable.f16702e, false);
        C4630b.m23458a(parcel, 6, logEventParcelable.f16703f, false);
        C4630b.m23453a(parcel, 7, logEventParcelable.f16704g, false);
        C4630b.m23461a(parcel, 8, logEventParcelable.f16705h);
        C4630b.m23479a(parcel, m23480a);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public LogEventParcelable createFromParcel(Parcel parcel) {
        byte[][] bArr = null;
        int m23508b = C4628a.m23508b(parcel);
        int i = 0;
        boolean z = true;
        int[] iArr = null;
        String[] strArr = null;
        int[] iArr2 = null;
        byte[] bArr2 = null;
        PlayLoggerContext playLoggerContext = null;
        while (parcel.dataPosition() < m23508b) {
            int m23514a = C4628a.m23514a(parcel);
            switch (C4628a.m23515a(m23514a)) {
                case 1:
                    i = C4628a.m23500g(parcel, m23514a);
                    break;
                case 2:
                    playLoggerContext = (PlayLoggerContext) C4628a.m23510a(parcel, m23514a, PlayLoggerContext.CREATOR);
                    break;
                case 3:
                    bArr2 = C4628a.m23487t(parcel, m23514a);
                    break;
                case 4:
                    iArr2 = C4628a.m23484w(parcel, m23514a);
                    break;
                case 5:
                    strArr = C4628a.m23520C(parcel, m23514a);
                    break;
                case 6:
                    iArr = C4628a.m23484w(parcel, m23514a);
                    break;
                case 7:
                    bArr = C4628a.m23486u(parcel, m23514a);
                    break;
                case 8:
                    z = C4628a.m23505c(parcel, m23514a);
                    break;
                default:
                    C4628a.m23507b(parcel, m23514a);
                    break;
            }
        }
        if (parcel.dataPosition() != m23508b) {
            throw new C4628a.C4629a(new StringBuilder(37).append("Overread allowed size end=").append(m23508b).toString(), parcel);
        }
        return new LogEventParcelable(i, playLoggerContext, bArr2, iArr2, strArr, iArr, bArr, z);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public LogEventParcelable[] newArray(int i) {
        return new LogEventParcelable[i];
    }
}
