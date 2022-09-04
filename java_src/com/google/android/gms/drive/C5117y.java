package com.google.android.gms.drive;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C4628a;
import com.google.android.gms.common.internal.safeparcel.C4630b;
/* renamed from: com.google.android.gms.drive.y */
/* loaded from: classes2.dex */
public class C5117y implements Parcelable.Creator<Permission> {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m21784a(Permission permission, Parcel parcel, int i) {
        int m23480a = C4630b.m23480a(parcel);
        C4630b.m23475a(parcel, 1, permission.f17531a);
        C4630b.m23464a(parcel, 2, permission.m22724a(), false);
        C4630b.m23475a(parcel, 3, permission.m22722b());
        C4630b.m23464a(parcel, 4, permission.m22720c(), false);
        C4630b.m23464a(parcel, 5, permission.m22719d(), false);
        C4630b.m23475a(parcel, 6, permission.m22718e());
        C4630b.m23461a(parcel, 7, permission.m22717f());
        C4630b.m23479a(parcel, m23480a);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public Permission createFromParcel(Parcel parcel) {
        String str = null;
        boolean z = false;
        int m23508b = C4628a.m23508b(parcel);
        int i = 0;
        String str2 = null;
        int i2 = 0;
        String str3 = null;
        int i3 = 0;
        while (parcel.dataPosition() < m23508b) {
            int m23514a = C4628a.m23514a(parcel);
            switch (C4628a.m23515a(m23514a)) {
                case 1:
                    i3 = C4628a.m23500g(parcel, m23514a);
                    break;
                case 2:
                    str3 = C4628a.m23490q(parcel, m23514a);
                    break;
                case 3:
                    i2 = C4628a.m23500g(parcel, m23514a);
                    break;
                case 4:
                    str2 = C4628a.m23490q(parcel, m23514a);
                    break;
                case 5:
                    str = C4628a.m23490q(parcel, m23514a);
                    break;
                case 6:
                    i = C4628a.m23500g(parcel, m23514a);
                    break;
                case 7:
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
        return new Permission(i3, str3, i2, str2, str, i, z);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public Permission[] newArray(int i) {
        return new Permission[i];
    }
}
