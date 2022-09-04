package com.google.android.gms.common.data;

import android.database.CursorWindow;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C4628a;
import com.google.android.gms.common.internal.safeparcel.C4630b;
/* renamed from: com.google.android.gms.common.data.l */
/* loaded from: classes2.dex */
public class C4533l implements Parcelable.Creator<DataHolder> {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m23829a(DataHolder dataHolder, Parcel parcel, int i) {
        int m23480a = C4630b.m23480a(parcel);
        C4630b.m23455a(parcel, 1, dataHolder.m23887c(), false);
        C4630b.m23456a(parcel, 2, (Parcelable[]) dataHolder.m23885d(), i, false);
        C4630b.m23475a(parcel, 3, dataHolder.m23883e());
        C4630b.m23473a(parcel, 4, dataHolder.m23881f(), false);
        C4630b.m23475a(parcel, 1000, dataHolder.m23890b());
        C4630b.m23479a(parcel, m23480a);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public DataHolder createFromParcel(Parcel parcel) {
        int i = 0;
        Bundle bundle = null;
        int m23508b = C4628a.m23508b(parcel);
        CursorWindow[] cursorWindowArr = null;
        String[] strArr = null;
        int i2 = 0;
        while (parcel.dataPosition() < m23508b) {
            int m23514a = C4628a.m23514a(parcel);
            switch (C4628a.m23515a(m23514a)) {
                case 1:
                    strArr = C4628a.m23520C(parcel, m23514a);
                    break;
                case 2:
                    cursorWindowArr = (CursorWindow[]) C4628a.m23506b(parcel, m23514a, CursorWindow.CREATOR);
                    break;
                case 3:
                    i = C4628a.m23500g(parcel, m23514a);
                    break;
                case 4:
                    bundle = C4628a.m23488s(parcel, m23514a);
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
        DataHolder dataHolder = new DataHolder(i2, strArr, cursorWindowArr, i, bundle);
        dataHolder.m23899a();
        return dataHolder;
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public DataHolder[] newArray(int i) {
        return new DataHolder[i];
    }
}
