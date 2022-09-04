package com.google.android.gms.nearby.messages;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C4628a;
import com.google.android.gms.common.internal.safeparcel.C4630b;
import com.google.android.gms.nearby.messages.devices.NearbyDevice;
/* renamed from: com.google.android.gms.nearby.messages.o */
/* loaded from: classes2.dex */
public class C8911o implements Parcelable.Creator<Message> {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m9751a(Message message, Parcel parcel, int i) {
        int m23480a = C4630b.m23480a(parcel);
        C4630b.m23460a(parcel, 1, message.m9978d(), false);
        C4630b.m23464a(parcel, 2, message.m9980b(), false);
        C4630b.m23464a(parcel, 3, message.m9979c(), false);
        C4630b.m23456a(parcel, 4, (Parcelable[]) message.m9977e(), i, false);
        C4630b.m23474a(parcel, 5, message.m9976f());
        C4630b.m23475a(parcel, 1000, message.f28171f);
        C4630b.m23479a(parcel, m23480a);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public Message createFromParcel(Parcel parcel) {
        NearbyDevice[] nearbyDeviceArr = null;
        int m23508b = C4628a.m23508b(parcel);
        int i = 0;
        long j = 0;
        String str = null;
        String str2 = null;
        byte[] bArr = null;
        while (parcel.dataPosition() < m23508b) {
            int m23514a = C4628a.m23514a(parcel);
            switch (C4628a.m23515a(m23514a)) {
                case 1:
                    bArr = C4628a.m23487t(parcel, m23514a);
                    break;
                case 2:
                    str = C4628a.m23490q(parcel, m23514a);
                    break;
                case 3:
                    str2 = C4628a.m23490q(parcel, m23514a);
                    break;
                case 4:
                    nearbyDeviceArr = (NearbyDevice[]) C4628a.m23506b(parcel, m23514a, NearbyDevice.CREATOR);
                    break;
                case 5:
                    j = C4628a.m23498i(parcel, m23514a);
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
        return new Message(i, bArr, str2, str, nearbyDeviceArr, j);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public Message[] newArray(int i) {
        return new Message[i];
    }
}
