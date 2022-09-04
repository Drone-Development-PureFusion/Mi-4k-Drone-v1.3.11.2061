package com.google.android.gms.drive.realtime.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C4628a;
import com.google.android.gms.common.internal.safeparcel.C4630b;
/* renamed from: com.google.android.gms.drive.realtime.internal.q */
/* loaded from: classes2.dex */
public class C5105q implements Parcelable.Creator<ParcelableCollaborator> {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m21813a(ParcelableCollaborator parcelableCollaborator, Parcel parcel, int i) {
        int m23480a = C4630b.m23480a(parcel);
        C4630b.m23475a(parcel, 1, parcelableCollaborator.f18117a);
        C4630b.m23461a(parcel, 2, parcelableCollaborator.f18118b);
        C4630b.m23461a(parcel, 3, parcelableCollaborator.f18119c);
        C4630b.m23464a(parcel, 4, parcelableCollaborator.f18120d, false);
        C4630b.m23464a(parcel, 5, parcelableCollaborator.f18121e, false);
        C4630b.m23464a(parcel, 6, parcelableCollaborator.f18122f, false);
        C4630b.m23464a(parcel, 7, parcelableCollaborator.f18123g, false);
        C4630b.m23464a(parcel, 8, parcelableCollaborator.f18124h, false);
        C4630b.m23479a(parcel, m23480a);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public ParcelableCollaborator createFromParcel(Parcel parcel) {
        boolean z = false;
        String str = null;
        int m23508b = C4628a.m23508b(parcel);
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        boolean z2 = false;
        int i = 0;
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
                    z = C4628a.m23505c(parcel, m23514a);
                    break;
                case 4:
                    str5 = C4628a.m23490q(parcel, m23514a);
                    break;
                case 5:
                    str4 = C4628a.m23490q(parcel, m23514a);
                    break;
                case 6:
                    str3 = C4628a.m23490q(parcel, m23514a);
                    break;
                case 7:
                    str2 = C4628a.m23490q(parcel, m23514a);
                    break;
                case 8:
                    str = C4628a.m23490q(parcel, m23514a);
                    break;
                default:
                    C4628a.m23507b(parcel, m23514a);
                    break;
            }
        }
        if (parcel.dataPosition() != m23508b) {
            throw new C4628a.C4629a(new StringBuilder(37).append("Overread allowed size end=").append(m23508b).toString(), parcel);
        }
        return new ParcelableCollaborator(i, z2, z, str5, str4, str3, str2, str);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public ParcelableCollaborator[] newArray(int i) {
        return new ParcelableCollaborator[i];
    }
}
