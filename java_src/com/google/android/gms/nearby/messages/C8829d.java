package com.google.android.gms.nearby.messages;

import com.google.android.gms.common.internal.C4585c;
import com.google.android.gms.common.internal.C4588d;
import com.google.android.gms.nearby.messages.internal.C8849i;
import java.util.UUID;
/* renamed from: com.google.android.gms.nearby.messages.d */
/* loaded from: classes2.dex */
public class C8829d {

    /* renamed from: a */
    public static final int f28214a = 20;

    /* renamed from: b */
    private final C8849i f28215b;

    public C8829d(UUID uuid, short s, short s2) {
        this.f28215b = new C8849i(uuid, Short.valueOf(s), Short.valueOf(s2));
    }

    public C8829d(byte[] bArr) {
        this.f28215b = new C8849i(m9948a(bArr));
    }

    /* renamed from: a */
    public static C8829d m9949a(Message message) {
        boolean m9982a = message.m9982a(Message.f28169e);
        String valueOf = String.valueOf(message.m9980b());
        C4588d.m23618b(m9982a, new StringBuilder(String.valueOf(valueOf).length() + 55).append("Message type '").append(valueOf).append("' is not Message.MESSAGE_TYPE_I_BEACON_ID").toString());
        return new C8829d(message.m9978d());
    }

    /* renamed from: a */
    private static byte[] m9948a(byte[] bArr) {
        C4588d.m23618b(bArr.length == 20, "iBeacon ID must be a UUID, a major, and a minor (20 total bytes).");
        return bArr;
    }

    /* renamed from: a */
    public UUID m9950a() {
        return this.f28215b.m9867c();
    }

    /* renamed from: b */
    public short m9947b() {
        return this.f28215b.m9866d().shortValue();
    }

    /* renamed from: c */
    public short m9946c() {
        return this.f28215b.m9865e().shortValue();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C8829d) {
            return C4585c.m23634a(this.f28215b, ((C8829d) obj).f28215b);
        }
        return false;
    }

    public int hashCode() {
        return C4585c.m23633a(this.f28215b);
    }

    public String toString() {
        String valueOf = String.valueOf(m9950a());
        short m9947b = m9947b();
        return new StringBuilder(String.valueOf(valueOf).length() + 53).append("IBeaconId{proximityUuid=").append(valueOf).append(", major=").append((int) m9947b).append(", minor=").append((int) m9946c()).append("}").toString();
    }
}
