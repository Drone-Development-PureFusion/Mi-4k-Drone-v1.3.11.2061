package com.google.firebase.appindexing.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C4628a;
import com.google.android.gms.common.internal.safeparcel.C4630b;
import com.google.firebase.appindexing.internal.ActionImpl;
/* renamed from: com.google.firebase.appindexing.internal.i */
/* loaded from: classes2.dex */
public class C9708i implements Parcelable.Creator<ActionImpl.MetadataImpl> {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m7400a(ActionImpl.MetadataImpl metadataImpl, Parcel parcel, int i) {
        int m23480a = C4630b.m23480a(parcel);
        C4630b.m23475a(parcel, 1, metadataImpl.m7462a());
        C4630b.m23461a(parcel, 2, metadataImpl.m7460b());
        C4630b.m23464a(parcel, 3, metadataImpl.m7459c(), false);
        C4630b.m23464a(parcel, 4, metadataImpl.m7458d(), false);
        C4630b.m23460a(parcel, 5, metadataImpl.m7457e(), false);
        C4630b.m23461a(parcel, 6, metadataImpl.m7456f());
        C4630b.m23475a(parcel, 1000, metadataImpl.f30296a);
        C4630b.m23479a(parcel, m23480a);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public ActionImpl.MetadataImpl createFromParcel(Parcel parcel) {
        byte[] bArr = null;
        boolean z = false;
        int m23508b = C4628a.m23508b(parcel);
        String str = null;
        String str2 = null;
        boolean z2 = false;
        int i = 0;
        int i2 = 0;
        while (parcel.dataPosition() < m23508b) {
            int m23514a = C4628a.m23514a(parcel);
            switch (C4628a.m23515a(m23514a)) {
                case 1:
                    i = C4628a.m23500g(parcel, m23514a);
                    break;
                case 2:
                    z2 = C4628a.m23505c(parcel, m23514a);
                    break;
                case 3:
                    str2 = C4628a.m23490q(parcel, m23514a);
                    break;
                case 4:
                    str = C4628a.m23490q(parcel, m23514a);
                    break;
                case 5:
                    bArr = C4628a.m23487t(parcel, m23514a);
                    break;
                case 6:
                    z = C4628a.m23505c(parcel, m23514a);
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
        return new ActionImpl.MetadataImpl(i2, i, z2, str2, str, bArr, z);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public ActionImpl.MetadataImpl[] newArray(int i) {
        return new ActionImpl.MetadataImpl[i];
    }
}
