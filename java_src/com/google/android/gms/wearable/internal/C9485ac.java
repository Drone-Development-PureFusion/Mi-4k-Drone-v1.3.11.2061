package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C4628a;
import com.google.android.gms.common.internal.safeparcel.C4630b;
/* renamed from: com.google.android.gms.wearable.internal.ac */
/* loaded from: classes2.dex */
public class C9485ac implements Parcelable.Creator<MessageEventParcelable> {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m8024a(MessageEventParcelable messageEventParcelable, Parcel parcel, int i) {
        int m23480a = C4630b.m23480a(parcel);
        C4630b.m23475a(parcel, 1, messageEventParcelable.f29969a);
        C4630b.m23475a(parcel, 2, messageEventParcelable.mo7572a());
        C4630b.m23464a(parcel, 3, messageEventParcelable.mo7571b(), false);
        C4630b.m23460a(parcel, 4, messageEventParcelable.mo7570c(), false);
        C4630b.m23464a(parcel, 5, messageEventParcelable.mo7569d(), false);
        C4630b.m23479a(parcel, m23480a);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public MessageEventParcelable createFromParcel(Parcel parcel) {
        int i = 0;
        String str = null;
        int m23508b = C4628a.m23508b(parcel);
        byte[] bArr = null;
        String str2 = null;
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
                    str2 = C4628a.m23490q(parcel, m23514a);
                    break;
                case 4:
                    bArr = C4628a.m23487t(parcel, m23514a);
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
        return new MessageEventParcelable(i2, i, str2, bArr, str);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public MessageEventParcelable[] newArray(int i) {
        return new MessageEventParcelable[i];
    }
}
