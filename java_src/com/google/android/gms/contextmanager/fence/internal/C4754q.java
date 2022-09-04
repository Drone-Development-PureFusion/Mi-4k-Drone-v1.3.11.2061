package com.google.android.gms.contextmanager.fence.internal;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C4628a;
import com.google.android.gms.common.internal.safeparcel.C4630b;
/* renamed from: com.google.android.gms.contextmanager.fence.internal.q */
/* loaded from: classes2.dex */
public class C4754q implements Parcelable.Creator<UpdateFenceOperation> {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m22885a(UpdateFenceOperation updateFenceOperation, Parcel parcel, int i) {
        int m23480a = C4630b.m23480a(parcel);
        C4630b.m23475a(parcel, 1, updateFenceOperation.m22953a());
        C4630b.m23475a(parcel, 2, updateFenceOperation.m22947c());
        C4630b.m23470a(parcel, 3, (Parcelable) updateFenceOperation.m22946d(), i, false);
        C4630b.m23472a(parcel, 4, updateFenceOperation.m22948b(), false);
        C4630b.m23470a(parcel, 5, (Parcelable) updateFenceOperation.m22945e(), i, false);
        C4630b.m23464a(parcel, 6, updateFenceOperation.m22944f(), false);
        C4630b.m23474a(parcel, 7, updateFenceOperation.m22943g());
        C4630b.m23474a(parcel, 8, updateFenceOperation.m22942h());
        C4630b.m23479a(parcel, m23480a);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public UpdateFenceOperation createFromParcel(Parcel parcel) {
        long j = 0;
        int i = 0;
        String str = null;
        int m23508b = C4628a.m23508b(parcel);
        long j2 = 0;
        PendingIntent pendingIntent = null;
        IBinder iBinder = null;
        ContextFenceRegistrationStub contextFenceRegistrationStub = null;
        int i2 = 0;
        while (parcel.dataPosition() < m23508b) {
            int m23514a = C4628a.m23514a(parcel);
            switch (C4628a.m23515a(m23514a)) {
                case 1:
                    i2 = C4628a.m23500g(parcel, m23514a);
                    break;
                case 2:
                    i = C4628a.m23500g(parcel, m23514a);
                    break;
                case 3:
                    contextFenceRegistrationStub = (ContextFenceRegistrationStub) C4628a.m23510a(parcel, m23514a, ContextFenceRegistrationStub.CREATOR);
                    break;
                case 4:
                    iBinder = C4628a.m23489r(parcel, m23514a);
                    break;
                case 5:
                    pendingIntent = (PendingIntent) C4628a.m23510a(parcel, m23514a, PendingIntent.CREATOR);
                    break;
                case 6:
                    str = C4628a.m23490q(parcel, m23514a);
                    break;
                case 7:
                    j2 = C4628a.m23498i(parcel, m23514a);
                    break;
                case 8:
                    j = C4628a.m23498i(parcel, m23514a);
                    break;
                default:
                    C4628a.m23507b(parcel, m23514a);
                    break;
            }
        }
        if (parcel.dataPosition() != m23508b) {
            throw new C4628a.C4629a(new StringBuilder(37).append("Overread allowed size end=").append(m23508b).toString(), parcel);
        }
        return new UpdateFenceOperation(i2, i, contextFenceRegistrationStub, iBinder, pendingIntent, str, j2, j);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public UpdateFenceOperation[] newArray(int i) {
        return new UpdateFenceOperation[i];
    }
}
