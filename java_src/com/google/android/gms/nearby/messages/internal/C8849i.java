package com.google.android.gms.nearby.messages.internal;

import android.support.annotation.Nullable;
import com.google.android.gms.common.internal.C4588d;
import java.nio.ByteBuffer;
import java.util.UUID;
/* renamed from: com.google.android.gms.nearby.messages.internal.i */
/* loaded from: classes2.dex */
public class C8849i extends AbstractC8843c {
    public C8849i(UUID uuid, @Nullable Short sh, @Nullable Short sh2) {
        this(m9869a(uuid, sh, sh2));
    }

    public C8849i(byte[] bArr) {
        super(m9868b(bArr));
    }

    /* renamed from: a */
    private static byte[] m9869a(UUID uuid, Short sh, Short sh2) {
        int i = 0;
        int i2 = (sh == null ? 0 : 2) + 16;
        if (sh2 != null) {
            i = 2;
        }
        ByteBuffer allocate = ByteBuffer.allocate(i + i2);
        allocate.putLong(uuid.getMostSignificantBits()).putLong(uuid.getLeastSignificantBits());
        if (sh != null) {
            allocate.putShort(sh.shortValue());
        }
        if (sh2 != null) {
            allocate.putShort(sh2.shortValue());
        }
        return allocate.array();
    }

    /* renamed from: b */
    private static byte[] m9868b(byte[] bArr) {
        C4588d.m23618b(bArr.length == 16 || bArr.length == 18 || bArr.length == 20, "Prefix must be a UUID, a UUID and a major, or a UUID, a major, and a minor.");
        return bArr;
    }

    /* renamed from: c */
    public UUID m9867c() {
        ByteBuffer wrap = ByteBuffer.wrap(a());
        return new UUID(wrap.getLong(), wrap.getLong());
    }

    /* renamed from: d */
    public Short m9866d() {
        byte[] a = a();
        if (a.length >= 18) {
            return Short.valueOf(ByteBuffer.wrap(a).getShort(16));
        }
        return null;
    }

    /* renamed from: e */
    public Short m9865e() {
        byte[] a = a();
        if (a.length == 20) {
            return Short.valueOf(ByteBuffer.wrap(a).getShort(18));
        }
        return null;
    }

    @Override // com.google.android.gms.nearby.messages.internal.AbstractC8843c
    public String toString() {
        String valueOf = String.valueOf(m9867c());
        String valueOf2 = String.valueOf(m9866d());
        String valueOf3 = String.valueOf(m9865e());
        return new StringBuilder(String.valueOf(valueOf).length() + 47 + String.valueOf(valueOf2).length() + String.valueOf(valueOf3).length()).append("IBeaconIdPrefix{proximityUuid=").append(valueOf).append(", major=").append(valueOf2).append(", minor=").append(valueOf3).append("}").toString();
    }
}
