package com.google.android.gms.playlog.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C4628a;
import com.google.android.gms.common.internal.safeparcel.C4630b;
/* renamed from: com.google.android.gms.playlog.internal.a */
/* loaded from: classes2.dex */
public class C8919a implements Parcelable.Creator<PlayLoggerContext> {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m9728a(PlayLoggerContext playLoggerContext, Parcel parcel, int i) {
        int m23480a = C4630b.m23480a(parcel);
        C4630b.m23475a(parcel, 1, playLoggerContext.f28413a);
        C4630b.m23464a(parcel, 2, playLoggerContext.f28414b, false);
        C4630b.m23475a(parcel, 3, playLoggerContext.f28415c);
        C4630b.m23475a(parcel, 4, playLoggerContext.f28416d);
        C4630b.m23464a(parcel, 5, playLoggerContext.f28417e, false);
        C4630b.m23464a(parcel, 6, playLoggerContext.f28418f, false);
        C4630b.m23461a(parcel, 7, playLoggerContext.f28419g);
        C4630b.m23464a(parcel, 8, playLoggerContext.f28420h, false);
        C4630b.m23461a(parcel, 9, playLoggerContext.f28421i);
        C4630b.m23475a(parcel, 10, playLoggerContext.f28422j);
        C4630b.m23479a(parcel, m23480a);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public PlayLoggerContext createFromParcel(Parcel parcel) {
        String str = null;
        int i = 0;
        int m23508b = C4628a.m23508b(parcel);
        boolean z = true;
        boolean z2 = false;
        String str2 = null;
        String str3 = null;
        int i2 = 0;
        int i3 = 0;
        String str4 = null;
        int i4 = 0;
        while (parcel.dataPosition() < m23508b) {
            int m23514a = C4628a.m23514a(parcel);
            switch (C4628a.m23515a(m23514a)) {
                case 1:
                    i4 = C4628a.m23500g(parcel, m23514a);
                    break;
                case 2:
                    str4 = C4628a.m23490q(parcel, m23514a);
                    break;
                case 3:
                    i3 = C4628a.m23500g(parcel, m23514a);
                    break;
                case 4:
                    i2 = C4628a.m23500g(parcel, m23514a);
                    break;
                case 5:
                    str3 = C4628a.m23490q(parcel, m23514a);
                    break;
                case 6:
                    str2 = C4628a.m23490q(parcel, m23514a);
                    break;
                case 7:
                    z = C4628a.m23505c(parcel, m23514a);
                    break;
                case 8:
                    str = C4628a.m23490q(parcel, m23514a);
                    break;
                case 9:
                    z2 = C4628a.m23505c(parcel, m23514a);
                    break;
                case 10:
                    i = C4628a.m23500g(parcel, m23514a);
                    break;
                default:
                    C4628a.m23507b(parcel, m23514a);
                    break;
            }
        }
        if (parcel.dataPosition() != m23508b) {
            throw new C4628a.C4629a(new StringBuilder(37).append("Overread allowed size end=").append(m23508b).toString(), parcel);
        }
        return new PlayLoggerContext(i4, str4, i3, i2, str3, str2, z, str, z2, i);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public PlayLoggerContext[] newArray(int i) {
        return new PlayLoggerContext[i];
    }
}
