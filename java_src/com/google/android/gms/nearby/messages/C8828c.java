package com.google.android.gms.nearby.messages;

import com.google.android.gms.common.internal.C4585c;
import com.google.android.gms.common.internal.C4588d;
import com.google.android.gms.nearby.messages.internal.AbstractC8843c;
import com.google.android.gms.nearby.messages.internal.C8846f;
/* renamed from: com.google.android.gms.nearby.messages.c */
/* loaded from: classes2.dex */
public class C8828c {

    /* renamed from: a */
    public static final int f28210a = 16;

    /* renamed from: b */
    public static final int f28211b = 10;

    /* renamed from: c */
    public static final int f28212c = 6;

    /* renamed from: d */
    private final C8846f f28213d;

    public C8828c(String str) {
        this(AbstractC8843c.m9889a(str));
    }

    public C8828c(String str, String str2) {
        this.f28213d = new C8846f(str, str2);
    }

    public C8828c(byte[] bArr) {
        this.f28213d = new C8846f(m9953a(bArr));
    }

    /* renamed from: a */
    public static C8828c m9954a(Message message) {
        boolean m9982a = message.m9982a(Message.f28168d);
        String valueOf = String.valueOf(message.m9980b());
        C4588d.m23618b(m9982a, new StringBuilder(String.valueOf(valueOf).length() + 58).append("Message type '").append(valueOf).append("' is not Message.MESSAGE_TYPE_EDDYSTONE_UID.").toString());
        return new C8828c(message.m9978d());
    }

    /* renamed from: a */
    private static byte[] m9953a(byte[] bArr) {
        C4588d.m23618b(bArr.length == 16, "Bytes must be a namespace plus instance (16 bytes).");
        return bArr;
    }

    /* renamed from: a */
    public String m9955a() {
        return this.f28213d.m9879c();
    }

    /* renamed from: b */
    public String m9952b() {
        return this.f28213d.m9877d();
    }

    /* renamed from: c */
    public String m9951c() {
        return this.f28213d.b();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C8828c) {
            return C4585c.m23634a(this.f28213d, ((C8828c) obj).f28213d);
        }
        return false;
    }

    public int hashCode() {
        return C4585c.m23633a(this.f28213d);
    }

    public String toString() {
        String valueOf = String.valueOf(m9951c());
        return new StringBuilder(String.valueOf(valueOf).length() + 17).append("EddystoneUid{id=").append(valueOf).append("}").toString();
    }
}
