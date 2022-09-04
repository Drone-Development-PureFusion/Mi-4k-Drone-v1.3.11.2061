package com.google.android.gms.contextmanager.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C4628a;
import com.google.android.gms.common.internal.safeparcel.C4630b;
import com.google.android.gms.contextmanager.internal.ContextDataFilterImpl;
/* renamed from: com.google.android.gms.contextmanager.internal.b */
/* loaded from: classes2.dex */
public class C4757b implements Parcelable.Creator<ContextDataFilterImpl.Inclusion> {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m22817a(ContextDataFilterImpl.Inclusion inclusion, Parcel parcel, int i) {
        int m23480a = C4630b.m23480a(parcel);
        C4630b.m23475a(parcel, 1, inclusion.m22877a());
        C4630b.m23475a(parcel, 2, inclusion.m22876b());
        C4630b.m23475a(parcel, 3, inclusion.m22875c());
        C4630b.m23470a(parcel, 4, (Parcelable) inclusion.m22874d(), i, false);
        C4630b.m23470a(parcel, 5, (Parcelable) inclusion.m22873e(), i, false);
        C4630b.m23479a(parcel, m23480a);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public ContextDataFilterImpl.Inclusion createFromParcel(Parcel parcel) {
        KeyFilterImpl keyFilterImpl = null;
        int i = 0;
        int m23508b = C4628a.m23508b(parcel);
        TimeFilterImpl timeFilterImpl = null;
        int i2 = 0;
        int i3 = 0;
        while (parcel.dataPosition() < m23508b) {
            int m23514a = C4628a.m23514a(parcel);
            switch (C4628a.m23515a(m23514a)) {
                case 1:
                    i3 = C4628a.m23500g(parcel, m23514a);
                    break;
                case 2:
                    i2 = C4628a.m23500g(parcel, m23514a);
                    break;
                case 3:
                    i = C4628a.m23500g(parcel, m23514a);
                    break;
                case 4:
                    timeFilterImpl = (TimeFilterImpl) C4628a.m23510a(parcel, m23514a, TimeFilterImpl.CREATOR);
                    break;
                case 5:
                    keyFilterImpl = (KeyFilterImpl) C4628a.m23510a(parcel, m23514a, KeyFilterImpl.CREATOR);
                    break;
                default:
                    C4628a.m23507b(parcel, m23514a);
                    break;
            }
        }
        if (parcel.dataPosition() != m23508b) {
            throw new C4628a.C4629a(new StringBuilder(37).append("Overread allowed size end=").append(m23508b).toString(), parcel);
        }
        return new ContextDataFilterImpl.Inclusion(i3, i2, i, timeFilterImpl, keyFilterImpl);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public ContextDataFilterImpl.Inclusion[] newArray(int i) {
        return new ContextDataFilterImpl.Inclusion[i];
    }
}
