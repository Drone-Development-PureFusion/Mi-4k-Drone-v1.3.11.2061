package com.google.firebase.appindexing.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C4628a;
import com.google.android.gms.common.internal.safeparcel.C4630b;
import com.google.firebase.appindexing.internal.ActionImpl;
/* renamed from: com.google.firebase.appindexing.internal.a */
/* loaded from: classes2.dex */
public class C9684a implements Parcelable.Creator<ActionImpl> {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m7444a(ActionImpl actionImpl, Parcel parcel, int i) {
        int m23480a = C4630b.m23480a(parcel);
        C4630b.m23464a(parcel, 1, actionImpl.m7468a(), false);
        C4630b.m23464a(parcel, 2, actionImpl.m7467b(), false);
        C4630b.m23464a(parcel, 3, actionImpl.m7466c(), false);
        C4630b.m23464a(parcel, 4, actionImpl.m7465d(), false);
        C4630b.m23470a(parcel, 5, (Parcelable) actionImpl.m7464e(), i, false);
        C4630b.m23464a(parcel, 6, actionImpl.m7463f(), false);
        C4630b.m23475a(parcel, 1000, actionImpl.f30289a);
        C4630b.m23479a(parcel, m23480a);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public ActionImpl createFromParcel(Parcel parcel) {
        String str = null;
        int m23508b = C4628a.m23508b(parcel);
        int i = 0;
        ActionImpl.MetadataImpl metadataImpl = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        while (parcel.dataPosition() < m23508b) {
            int m23514a = C4628a.m23514a(parcel);
            switch (C4628a.m23515a(m23514a)) {
                case 1:
                    str5 = C4628a.m23490q(parcel, m23514a);
                    break;
                case 2:
                    str4 = C4628a.m23490q(parcel, m23514a);
                    break;
                case 3:
                    str3 = C4628a.m23490q(parcel, m23514a);
                    break;
                case 4:
                    str2 = C4628a.m23490q(parcel, m23514a);
                    break;
                case 5:
                    metadataImpl = (ActionImpl.MetadataImpl) C4628a.m23510a(parcel, m23514a, ActionImpl.MetadataImpl.CREATOR);
                    break;
                case 6:
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
        return new ActionImpl(i, str5, str4, str3, str2, metadataImpl, str);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public ActionImpl[] newArray(int i) {
        return new ActionImpl[i];
    }
}
