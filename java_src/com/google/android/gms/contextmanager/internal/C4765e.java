package com.google.android.gms.contextmanager.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C4628a;
import com.google.android.gms.common.internal.safeparcel.C4630b;
/* renamed from: com.google.android.gms.contextmanager.internal.e */
/* loaded from: classes2.dex */
public class C4765e implements Parcelable.Creator<ContextManagerClientInfo> {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m22805a(ContextManagerClientInfo contextManagerClientInfo, Parcel parcel, int i) {
        int m23480a = C4630b.m23480a(parcel);
        C4630b.m23475a(parcel, 1, contextManagerClientInfo.m22872a());
        C4630b.m23464a(parcel, 2, contextManagerClientInfo.m22869b(), false);
        C4630b.m23464a(parcel, 3, contextManagerClientInfo.m22867d(), false);
        C4630b.m23475a(parcel, 4, contextManagerClientInfo.m22866e());
        C4630b.m23464a(parcel, 5, contextManagerClientInfo.m22865f(), false);
        C4630b.m23475a(parcel, 6, contextManagerClientInfo.m22864g());
        C4630b.m23475a(parcel, 7, contextManagerClientInfo.m22863h());
        C4630b.m23464a(parcel, 8, contextManagerClientInfo.m22862i(), false);
        C4630b.m23464a(parcel, 9, contextManagerClientInfo.m22861j(), false);
        C4630b.m23475a(parcel, 10, contextManagerClientInfo.m22860k());
        C4630b.m23479a(parcel, m23480a);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public ContextManagerClientInfo createFromParcel(Parcel parcel) {
        String str = null;
        int i = 0;
        int m23508b = C4628a.m23508b(parcel);
        String str2 = null;
        int i2 = 0;
        int i3 = 0;
        String str3 = null;
        int i4 = 0;
        String str4 = null;
        String str5 = null;
        int i5 = 0;
        while (parcel.dataPosition() < m23508b) {
            int m23514a = C4628a.m23514a(parcel);
            switch (C4628a.m23515a(m23514a)) {
                case 1:
                    i5 = C4628a.m23500g(parcel, m23514a);
                    break;
                case 2:
                    str5 = C4628a.m23490q(parcel, m23514a);
                    break;
                case 3:
                    str4 = C4628a.m23490q(parcel, m23514a);
                    break;
                case 4:
                    i4 = C4628a.m23500g(parcel, m23514a);
                    break;
                case 5:
                    str3 = C4628a.m23490q(parcel, m23514a);
                    break;
                case 6:
                    i3 = C4628a.m23500g(parcel, m23514a);
                    break;
                case 7:
                    i2 = C4628a.m23500g(parcel, m23514a);
                    break;
                case 8:
                    str2 = C4628a.m23490q(parcel, m23514a);
                    break;
                case 9:
                    str = C4628a.m23490q(parcel, m23514a);
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
        return new ContextManagerClientInfo(i5, str5, str4, i4, str3, i3, i2, str2, str, i);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public ContextManagerClientInfo[] newArray(int i) {
        return new ContextManagerClientInfo[i];
    }
}
