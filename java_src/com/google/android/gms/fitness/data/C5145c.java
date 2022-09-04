package com.google.android.gms.fitness.data;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C4628a;
import com.google.android.gms.common.internal.safeparcel.C4630b;
/* renamed from: com.google.android.gms.fitness.data.c */
/* loaded from: classes2.dex */
public class C5145c implements Parcelable.Creator<Session> {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m21481a(Session session, Parcel parcel, int i) {
        int m23480a = C4630b.m23480a(parcel);
        C4630b.m23474a(parcel, 1, session.m21558k());
        C4630b.m23474a(parcel, 2, session.m21557l());
        C4630b.m23464a(parcel, 3, session.m21567c(), false);
        C4630b.m23464a(parcel, 4, session.m21565d(), false);
        C4630b.m23464a(parcel, 5, session.m21564e(), false);
        C4630b.m23475a(parcel, 7, session.m21562g());
        C4630b.m23475a(parcel, 1000, session.m21559j());
        C4630b.m23470a(parcel, 8, (Parcelable) session.m21561h(), i, false);
        C4630b.m23465a(parcel, 9, session.m21556m(), false);
        C4630b.m23479a(parcel, m23480a);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public Session createFromParcel(Parcel parcel) {
        long j = 0;
        int i = 0;
        Long l = null;
        int m23508b = C4628a.m23508b(parcel);
        Application application = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        long j2 = 0;
        int i2 = 0;
        while (parcel.dataPosition() < m23508b) {
            int m23514a = C4628a.m23514a(parcel);
            switch (C4628a.m23515a(m23514a)) {
                case 1:
                    j2 = C4628a.m23498i(parcel, m23514a);
                    break;
                case 2:
                    j = C4628a.m23498i(parcel, m23514a);
                    break;
                case 3:
                    str3 = C4628a.m23490q(parcel, m23514a);
                    break;
                case 4:
                    str2 = C4628a.m23490q(parcel, m23514a);
                    break;
                case 5:
                    str = C4628a.m23490q(parcel, m23514a);
                    break;
                case 7:
                    i = C4628a.m23500g(parcel, m23514a);
                    break;
                case 8:
                    application = (Application) C4628a.m23510a(parcel, m23514a, Application.CREATOR);
                    break;
                case 9:
                    l = C4628a.m23497j(parcel, m23514a);
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
        return new Session(i2, j2, j, str3, str2, str, i, application, l);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public Session[] newArray(int i) {
        return new Session[i];
    }
}
