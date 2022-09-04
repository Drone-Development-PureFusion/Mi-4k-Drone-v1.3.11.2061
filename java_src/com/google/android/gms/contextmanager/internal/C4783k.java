package com.google.android.gms.contextmanager.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.contextmanager.interest.InterestRecordStub;
import com.google.android.gms.common.internal.safeparcel.C4628a;
import com.google.android.gms.common.internal.safeparcel.C4630b;
import com.google.android.gms.contextmanager.internal.InterestUpdateBatchImpl;
/* renamed from: com.google.android.gms.contextmanager.internal.k */
/* loaded from: classes2.dex */
public class C4783k implements Parcelable.Creator<InterestUpdateBatchImpl.Operation> {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m22771a(InterestUpdateBatchImpl.Operation operation, Parcel parcel, int i) {
        int m23480a = C4630b.m23480a(parcel);
        C4630b.m23475a(parcel, 1, operation.m22855a());
        C4630b.m23475a(parcel, 2, operation.m22852d());
        C4630b.m23470a(parcel, 3, (Parcelable) operation.m22854b(), i, false);
        C4630b.m23464a(parcel, 4, operation.m22853c(), false);
        C4630b.m23479a(parcel, m23480a);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public InterestUpdateBatchImpl.Operation createFromParcel(Parcel parcel) {
        String m23490q;
        InterestRecordStub interestRecordStub;
        int i;
        int i2;
        String str = null;
        int i3 = 0;
        int m23508b = C4628a.m23508b(parcel);
        InterestRecordStub interestRecordStub2 = null;
        int i4 = 0;
        while (parcel.dataPosition() < m23508b) {
            int m23514a = C4628a.m23514a(parcel);
            switch (C4628a.m23515a(m23514a)) {
                case 1:
                    String str2 = str;
                    interestRecordStub = interestRecordStub2;
                    i = i3;
                    i2 = C4628a.m23500g(parcel, m23514a);
                    m23490q = str2;
                    break;
                case 2:
                    i2 = i4;
                    InterestRecordStub interestRecordStub3 = interestRecordStub2;
                    i = C4628a.m23500g(parcel, m23514a);
                    m23490q = str;
                    interestRecordStub = interestRecordStub3;
                    break;
                case 3:
                    i = i3;
                    i2 = i4;
                    String str3 = str;
                    interestRecordStub = (InterestRecordStub) C4628a.m23510a(parcel, m23514a, InterestRecordStub.CREATOR);
                    m23490q = str3;
                    break;
                case 4:
                    m23490q = C4628a.m23490q(parcel, m23514a);
                    interestRecordStub = interestRecordStub2;
                    i = i3;
                    i2 = i4;
                    break;
                default:
                    C4628a.m23507b(parcel, m23514a);
                    m23490q = str;
                    interestRecordStub = interestRecordStub2;
                    i = i3;
                    i2 = i4;
                    break;
            }
            i4 = i2;
            i3 = i;
            interestRecordStub2 = interestRecordStub;
            str = m23490q;
        }
        if (parcel.dataPosition() != m23508b) {
            throw new C4628a.C4629a(new StringBuilder(37).append("Overread allowed size end=").append(m23508b).toString(), parcel);
        }
        return new InterestUpdateBatchImpl.Operation(i4, i3, interestRecordStub2, str);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public InterestUpdateBatchImpl.Operation[] newArray(int i) {
        return new InterestUpdateBatchImpl.Operation[i];
    }
}
