package com.google.android.gms.wearable.internal;

import android.content.IntentFilter;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C4628a;
import com.google.android.gms.common.internal.safeparcel.C4630b;
/* renamed from: com.google.android.gms.wearable.internal.au */
/* loaded from: classes2.dex */
public class C9539au implements Parcelable.Creator<AddListenerRequest> {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m7914a(AddListenerRequest addListenerRequest, Parcel parcel, int i) {
        int m23480a = C4630b.m23480a(parcel);
        C4630b.m23475a(parcel, 1, addListenerRequest.f29857a);
        C4630b.m23472a(parcel, 2, addListenerRequest.m8093a(), false);
        C4630b.m23456a(parcel, 3, (Parcelable[]) addListenerRequest.f29859c, i, false);
        C4630b.m23464a(parcel, 4, addListenerRequest.f29860d, false);
        C4630b.m23464a(parcel, 5, addListenerRequest.f29861e, false);
        C4630b.m23479a(parcel, m23480a);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public AddListenerRequest createFromParcel(Parcel parcel) {
        String str = null;
        int m23508b = C4628a.m23508b(parcel);
        int i = 0;
        String str2 = null;
        IntentFilter[] intentFilterArr = null;
        IBinder iBinder = null;
        while (parcel.dataPosition() < m23508b) {
            int m23514a = C4628a.m23514a(parcel);
            switch (C4628a.m23515a(m23514a)) {
                case 1:
                    i = C4628a.m23500g(parcel, m23514a);
                    break;
                case 2:
                    iBinder = C4628a.m23489r(parcel, m23514a);
                    break;
                case 3:
                    intentFilterArr = (IntentFilter[]) C4628a.m23506b(parcel, m23514a, IntentFilter.CREATOR);
                    break;
                case 4:
                    str2 = C4628a.m23490q(parcel, m23514a);
                    break;
                case 5:
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
        return new AddListenerRequest(i, iBinder, intentFilterArr, str2, str);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public AddListenerRequest[] newArray(int i) {
        return new AddListenerRequest[i];
    }
}
