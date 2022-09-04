package com.google.android.gms.contextmanager.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C4628a;
import com.google.android.gms.common.internal.safeparcel.C4630b;
import com.google.android.gms.contextmanager.internal.RelationFilterImpl;
/* renamed from: com.google.android.gms.contextmanager.internal.p */
/* loaded from: classes2.dex */
public class C4788p implements Parcelable.Creator<RelationFilterImpl.Inclusion> {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m22756a(RelationFilterImpl.Inclusion inclusion, Parcel parcel, int i) {
        int m23480a = C4630b.m23480a(parcel);
        C4630b.m23475a(parcel, 1, inclusion.m22837a());
        C4630b.m23475a(parcel, 2, inclusion.m22836b());
        C4630b.m23470a(parcel, 3, (Parcelable) inclusion.m22835c(), i, false);
        C4630b.m23470a(parcel, 4, (Parcelable) inclusion.m22834d(), i, false);
        C4630b.m23479a(parcel, m23480a);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public RelationFilterImpl.Inclusion createFromParcel(Parcel parcel) {
        KeyFilterImpl keyFilterImpl;
        TimeFilterImpl timeFilterImpl;
        int i;
        int i2;
        KeyFilterImpl keyFilterImpl2 = null;
        int i3 = 0;
        int m23508b = C4628a.m23508b(parcel);
        TimeFilterImpl timeFilterImpl2 = null;
        int i4 = 0;
        while (parcel.dataPosition() < m23508b) {
            int m23514a = C4628a.m23514a(parcel);
            switch (C4628a.m23515a(m23514a)) {
                case 1:
                    KeyFilterImpl keyFilterImpl3 = keyFilterImpl2;
                    timeFilterImpl = timeFilterImpl2;
                    i = i3;
                    i2 = C4628a.m23500g(parcel, m23514a);
                    keyFilterImpl = keyFilterImpl3;
                    break;
                case 2:
                    i2 = i4;
                    TimeFilterImpl timeFilterImpl3 = timeFilterImpl2;
                    i = C4628a.m23500g(parcel, m23514a);
                    keyFilterImpl = keyFilterImpl2;
                    timeFilterImpl = timeFilterImpl3;
                    break;
                case 3:
                    i = i3;
                    i2 = i4;
                    KeyFilterImpl keyFilterImpl4 = keyFilterImpl2;
                    timeFilterImpl = (TimeFilterImpl) C4628a.m23510a(parcel, m23514a, TimeFilterImpl.CREATOR);
                    keyFilterImpl = keyFilterImpl4;
                    break;
                case 4:
                    keyFilterImpl = (KeyFilterImpl) C4628a.m23510a(parcel, m23514a, KeyFilterImpl.CREATOR);
                    timeFilterImpl = timeFilterImpl2;
                    i = i3;
                    i2 = i4;
                    break;
                default:
                    C4628a.m23507b(parcel, m23514a);
                    keyFilterImpl = keyFilterImpl2;
                    timeFilterImpl = timeFilterImpl2;
                    i = i3;
                    i2 = i4;
                    break;
            }
            i4 = i2;
            i3 = i;
            timeFilterImpl2 = timeFilterImpl;
            keyFilterImpl2 = keyFilterImpl;
        }
        if (parcel.dataPosition() != m23508b) {
            throw new C4628a.C4629a(new StringBuilder(37).append("Overread allowed size end=").append(m23508b).toString(), parcel);
        }
        return new RelationFilterImpl.Inclusion(i4, i3, timeFilterImpl2, keyFilterImpl2);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public RelationFilterImpl.Inclusion[] newArray(int i) {
        return new RelationFilterImpl.Inclusion[i];
    }
}
