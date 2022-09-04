package com.google.firebase.appindexing.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C4628a;
import com.google.android.gms.common.internal.safeparcel.C4630b;
import com.google.firebase.appindexing.internal.Thing;
/* renamed from: com.google.firebase.appindexing.internal.j */
/* loaded from: classes2.dex */
public class C9709j implements Parcelable.Creator<Thing> {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m7397a(Thing thing, Parcel parcel, int i) {
        int m23480a = C4630b.m23480a(parcel);
        C4630b.m23473a(parcel, 1, thing.m7454b(), false);
        C4630b.m23470a(parcel, 2, (Parcelable) thing.m7453c(), i, false);
        C4630b.m23464a(parcel, 3, thing.m7452d(), false);
        C4630b.m23464a(parcel, 4, thing.m7451e(), false);
        C4630b.m23475a(parcel, 1000, thing.m7455a());
        C4630b.m23479a(parcel, m23480a);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public Thing createFromParcel(Parcel parcel) {
        String str = null;
        int m23508b = C4628a.m23508b(parcel);
        int i = 0;
        String str2 = null;
        Thing.Metadata metadata = null;
        Bundle bundle = null;
        while (parcel.dataPosition() < m23508b) {
            int m23514a = C4628a.m23514a(parcel);
            switch (C4628a.m23515a(m23514a)) {
                case 1:
                    bundle = C4628a.m23488s(parcel, m23514a);
                    break;
                case 2:
                    metadata = (Thing.Metadata) C4628a.m23510a(parcel, m23514a, Thing.Metadata.CREATOR);
                    break;
                case 3:
                    str2 = C4628a.m23490q(parcel, m23514a);
                    break;
                case 4:
                    str = C4628a.m23490q(parcel, m23514a);
                    break;
                case 1000:
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
        return new Thing(i, bundle, metadata, str2, str);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public Thing[] newArray(int i) {
        return new Thing[i];
    }
}
