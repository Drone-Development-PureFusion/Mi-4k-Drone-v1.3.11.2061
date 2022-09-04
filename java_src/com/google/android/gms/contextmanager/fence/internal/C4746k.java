package com.google.android.gms.contextmanager.fence.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C4628a;
import com.google.android.gms.common.internal.safeparcel.C4630b;
/* renamed from: com.google.android.gms.contextmanager.fence.internal.k */
/* loaded from: classes2.dex */
public class C4746k implements Parcelable.Creator<FenceTriggerInfoImpl> {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m22905a(FenceTriggerInfoImpl fenceTriggerInfoImpl, Parcel parcel, int i) {
        int m23480a = C4630b.m23480a(parcel);
        C4630b.m23475a(parcel, 1, fenceTriggerInfoImpl.m22959a());
        C4630b.m23461a(parcel, 2, fenceTriggerInfoImpl.m22958b());
        C4630b.m23464a(parcel, 3, fenceTriggerInfoImpl.m22957c(), false);
        C4630b.m23479a(parcel, m23480a);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public FenceTriggerInfoImpl createFromParcel(Parcel parcel) {
        boolean z = false;
        int m23508b = C4628a.m23508b(parcel);
        String str = null;
        int i = 0;
        while (parcel.dataPosition() < m23508b) {
            int m23514a = C4628a.m23514a(parcel);
            switch (C4628a.m23515a(m23514a)) {
                case 1:
                    i = C4628a.m23500g(parcel, m23514a);
                    break;
                case 2:
                    z = C4628a.m23505c(parcel, m23514a);
                    break;
                case 3:
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
        return new FenceTriggerInfoImpl(i, z, str);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public FenceTriggerInfoImpl[] newArray(int i) {
        return new FenceTriggerInfoImpl[i];
    }
}
