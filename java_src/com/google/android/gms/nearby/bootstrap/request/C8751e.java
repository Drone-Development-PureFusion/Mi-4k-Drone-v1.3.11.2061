package com.google.android.gms.nearby.bootstrap.request;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C4628a;
import com.google.android.gms.common.internal.safeparcel.C4630b;
/* renamed from: com.google.android.gms.nearby.bootstrap.request.e */
/* loaded from: classes2.dex */
public class C8751e implements Parcelable.Creator<EnableTargetRequest> {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m10239a(EnableTargetRequest enableTargetRequest, Parcel parcel, int i) {
        int m23480a = C4630b.m23480a(parcel);
        C4630b.m23464a(parcel, 1, enableTargetRequest.m10267a(), false);
        C4630b.m23464a(parcel, 2, enableTargetRequest.m10266b(), false);
        C4630b.m23472a(parcel, 3, enableTargetRequest.m10263e(), false);
        C4630b.m23472a(parcel, 4, enableTargetRequest.m10262f(), false);
        C4630b.m23472a(parcel, 5, enableTargetRequest.m10261g(), false);
        C4630b.m23478a(parcel, 6, enableTargetRequest.m10265c());
        C4630b.m23478a(parcel, 7, enableTargetRequest.m10264d());
        C4630b.m23475a(parcel, 1000, enableTargetRequest.f28026a);
        C4630b.m23479a(parcel, m23480a);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public EnableTargetRequest createFromParcel(Parcel parcel) {
        byte b = 0;
        IBinder iBinder = null;
        int m23508b = C4628a.m23508b(parcel);
        IBinder iBinder2 = null;
        IBinder iBinder3 = null;
        byte b2 = 0;
        String str = null;
        String str2 = null;
        int i = 0;
        while (parcel.dataPosition() < m23508b) {
            int m23514a = C4628a.m23514a(parcel);
            switch (C4628a.m23515a(m23514a)) {
                case 1:
                    str2 = C4628a.m23490q(parcel, m23514a);
                    break;
                case 2:
                    str = C4628a.m23490q(parcel, m23514a);
                    break;
                case 3:
                    iBinder3 = C4628a.m23489r(parcel, m23514a);
                    break;
                case 4:
                    iBinder2 = C4628a.m23489r(parcel, m23514a);
                    break;
                case 5:
                    iBinder = C4628a.m23489r(parcel, m23514a);
                    break;
                case 6:
                    b2 = C4628a.m23502e(parcel, m23514a);
                    break;
                case 7:
                    b = C4628a.m23502e(parcel, m23514a);
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
        return new EnableTargetRequest(i, str2, str, b2, b, iBinder3, iBinder2, iBinder);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public EnableTargetRequest[] newArray(int i) {
        return new EnableTargetRequest[i];
    }
}
