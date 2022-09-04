package com.google.firebase.appindexing.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C4628a;
import com.google.android.gms.common.internal.safeparcel.C4630b;
import com.google.firebase.appindexing.internal.Thing;
/* renamed from: com.google.firebase.appindexing.internal.h */
/* loaded from: classes2.dex */
public class C9707h implements Parcelable.Creator<Thing.Metadata> {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m7403a(Thing.Metadata metadata, Parcel parcel, int i) {
        int m23480a = C4630b.m23480a(parcel);
        C4630b.m23461a(parcel, 1, metadata.m7449a());
        C4630b.m23475a(parcel, 2, metadata.m7448b());
        C4630b.m23464a(parcel, 3, metadata.m7447c(), false);
        C4630b.m23475a(parcel, 1000, metadata.f30308a);
        C4630b.m23479a(parcel, m23480a);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public Thing.Metadata createFromParcel(Parcel parcel) {
        int i = 0;
        int m23508b = C4628a.m23508b(parcel);
        String str = null;
        boolean z = false;
        int i2 = 0;
        while (parcel.dataPosition() < m23508b) {
            int m23514a = C4628a.m23514a(parcel);
            switch (C4628a.m23515a(m23514a)) {
                case 1:
                    z = C4628a.m23505c(parcel, m23514a);
                    break;
                case 2:
                    i = C4628a.m23500g(parcel, m23514a);
                    break;
                case 3:
                    str = C4628a.m23490q(parcel, m23514a);
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
        return new Thing.Metadata(i2, z, i, str);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public Thing.Metadata[] newArray(int i) {
        return new Thing.Metadata[i];
    }
}
