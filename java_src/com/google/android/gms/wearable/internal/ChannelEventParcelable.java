package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.wearable.AbstractC9453c;
/* loaded from: classes2.dex */
public final class ChannelEventParcelable extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ChannelEventParcelable> CREATOR = new C9566bf();

    /* renamed from: a */
    final int f29886a;

    /* renamed from: b */
    final ChannelImpl f29887b;

    /* renamed from: c */
    final int f29888c;

    /* renamed from: d */
    final int f29889d;

    /* renamed from: e */
    final int f29890e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ChannelEventParcelable(int i, ChannelImpl channelImpl, int i2, int i3, int i4) {
        this.f29886a = i;
        this.f29887b = channelImpl;
        this.f29888c = i2;
        this.f29889d = i3;
        this.f29890e = i4;
    }

    /* renamed from: a */
    private static String m8075a(int i) {
        switch (i) {
            case 1:
                return "CHANNEL_OPENED";
            case 2:
                return "CHANNEL_CLOSED";
            case 3:
                return "INPUT_CLOSED";
            case 4:
                return "OUTPUT_CLOSED";
            default:
                return Integer.toString(i);
        }
    }

    /* renamed from: b */
    private static String m8073b(int i) {
        switch (i) {
            case 0:
                return "CLOSE_REASON_NORMAL";
            case 1:
                return "CLOSE_REASON_DISCONNECTED";
            case 2:
                return "CLOSE_REASON_REMOTE_CLOSE";
            case 3:
                return "CLOSE_REASON_LOCAL_CLOSE";
            default:
                return Integer.toString(i);
        }
    }

    /* renamed from: a */
    public void m8074a(AbstractC9453c.AbstractC9454a abstractC9454a) {
        switch (this.f29888c) {
            case 1:
                abstractC9454a.mo7994a(this.f29887b);
                return;
            case 2:
                abstractC9454a.mo7993a(this.f29887b, this.f29889d, this.f29890e);
                return;
            case 3:
                abstractC9454a.mo7992b(this.f29887b, this.f29889d, this.f29890e);
                return;
            case 4:
                abstractC9454a.mo7991c(this.f29887b, this.f29889d, this.f29890e);
                return;
            default:
                Log.w("ChannelEventParcelable", new StringBuilder(25).append("Unknown type: ").append(this.f29888c).toString());
                return;
        }
    }

    public String toString() {
        int i = this.f29886a;
        String valueOf = String.valueOf(this.f29887b);
        String valueOf2 = String.valueOf(m8075a(this.f29888c));
        String valueOf3 = String.valueOf(m8073b(this.f29889d));
        return new StringBuilder(String.valueOf(valueOf).length() + 104 + String.valueOf(valueOf2).length() + String.valueOf(valueOf3).length()).append("ChannelEventParcelable[versionCode=").append(i).append(", channel=").append(valueOf).append(", type=").append(valueOf2).append(", closeReason=").append(valueOf3).append(", appErrorCode=").append(this.f29890e).append("]").toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C9566bf.m7862a(this, parcel, i);
    }
}
