package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C4628a;
import com.google.android.gms.common.internal.safeparcel.C4630b;
/* renamed from: com.google.android.gms.wearable.internal.bf */
/* loaded from: classes2.dex */
public class C9566bf implements Parcelable.Creator<ChannelEventParcelable> {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m7862a(ChannelEventParcelable channelEventParcelable, Parcel parcel, int i) {
        int m23480a = C4630b.m23480a(parcel);
        C4630b.m23475a(parcel, 1, channelEventParcelable.f29886a);
        C4630b.m23470a(parcel, 2, (Parcelable) channelEventParcelable.f29887b, i, false);
        C4630b.m23475a(parcel, 3, channelEventParcelable.f29888c);
        C4630b.m23475a(parcel, 4, channelEventParcelable.f29889d);
        C4630b.m23475a(parcel, 5, channelEventParcelable.f29890e);
        C4630b.m23479a(parcel, m23480a);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public ChannelEventParcelable createFromParcel(Parcel parcel) {
        int i = 0;
        int m23508b = C4628a.m23508b(parcel);
        ChannelImpl channelImpl = null;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (parcel.dataPosition() < m23508b) {
            int m23514a = C4628a.m23514a(parcel);
            switch (C4628a.m23515a(m23514a)) {
                case 1:
                    i4 = C4628a.m23500g(parcel, m23514a);
                    break;
                case 2:
                    channelImpl = (ChannelImpl) C4628a.m23510a(parcel, m23514a, ChannelImpl.CREATOR);
                    break;
                case 3:
                    i3 = C4628a.m23500g(parcel, m23514a);
                    break;
                case 4:
                    i2 = C4628a.m23500g(parcel, m23514a);
                    break;
                case 5:
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
        return new ChannelEventParcelable(i4, channelImpl, i3, i2, i);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public ChannelEventParcelable[] newArray(int i) {
        return new ChannelEventParcelable[i];
    }
}
