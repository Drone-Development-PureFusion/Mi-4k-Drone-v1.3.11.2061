package com.google.android.gms.nearby.messages;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C4628a;
import com.google.android.gms.common.internal.safeparcel.C4630b;
import com.google.android.gms.nearby.messages.devices.NearbyDeviceFilter;
import com.google.android.gms.nearby.messages.internal.MessageType;
import java.util.ArrayList;
/* renamed from: com.google.android.gms.nearby.messages.p */
/* loaded from: classes2.dex */
public class C8912p implements Parcelable.Creator<MessageFilter> {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m9748a(MessageFilter messageFilter, Parcel parcel, int i) {
        int m23480a = C4630b.m23480a(parcel);
        C4630b.m23447c(parcel, 1, messageFilter.m9975a(), false);
        C4630b.m23447c(parcel, 2, messageFilter.m9973c(), false);
        C4630b.m23461a(parcel, 3, messageFilter.m9974b());
        C4630b.m23475a(parcel, 1000, messageFilter.f28178b);
        C4630b.m23479a(parcel, m23480a);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public MessageFilter createFromParcel(Parcel parcel) {
        ArrayList arrayList = null;
        boolean z = false;
        int m23508b = C4628a.m23508b(parcel);
        ArrayList arrayList2 = null;
        int i = 0;
        while (parcel.dataPosition() < m23508b) {
            int m23514a = C4628a.m23514a(parcel);
            switch (C4628a.m23515a(m23514a)) {
                case 1:
                    arrayList2 = C4628a.m23504c(parcel, m23514a, MessageType.CREATOR);
                    break;
                case 2:
                    arrayList = C4628a.m23504c(parcel, m23514a, NearbyDeviceFilter.CREATOR);
                    break;
                case 3:
                    z = C4628a.m23505c(parcel, m23514a);
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
        return new MessageFilter(i, arrayList2, arrayList, z);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public MessageFilter[] newArray(int i) {
        return new MessageFilter[i];
    }
}
