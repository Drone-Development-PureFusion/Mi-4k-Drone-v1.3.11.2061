package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C4628a;
import com.google.android.gms.common.internal.safeparcel.C4630b;
/* renamed from: com.google.android.gms.wearable.internal.ae */
/* loaded from: classes2.dex */
public class C9493ae implements Parcelable.Creator<NodeParcelable> {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m8013a(NodeParcelable nodeParcelable, Parcel parcel, int i) {
        int m23480a = C4630b.m23480a(parcel);
        C4630b.m23475a(parcel, 1, nodeParcelable.f29974a);
        C4630b.m23464a(parcel, 2, nodeParcelable.mo7568a(), false);
        C4630b.m23464a(parcel, 3, nodeParcelable.mo7567b(), false);
        C4630b.m23475a(parcel, 4, nodeParcelable.m8038d());
        C4630b.m23461a(parcel, 5, nodeParcelable.mo7566c());
        C4630b.m23479a(parcel, m23480a);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public NodeParcelable createFromParcel(Parcel parcel) {
        String str = null;
        boolean z = false;
        int m23508b = C4628a.m23508b(parcel);
        int i = 0;
        String str2 = null;
        int i2 = 0;
        while (parcel.dataPosition() < m23508b) {
            int m23514a = C4628a.m23514a(parcel);
            switch (C4628a.m23515a(m23514a)) {
                case 1:
                    i2 = C4628a.m23500g(parcel, m23514a);
                    break;
                case 2:
                    str2 = C4628a.m23490q(parcel, m23514a);
                    break;
                case 3:
                    str = C4628a.m23490q(parcel, m23514a);
                    break;
                case 4:
                    i = C4628a.m23500g(parcel, m23514a);
                    break;
                case 5:
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
        return new NodeParcelable(i2, str2, str, i, z);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public NodeParcelable[] newArray(int i) {
        return new NodeParcelable[i];
    }
}
