package com.google.android.gms.nearby.messages.internal;

import com.google.android.gms.common.internal.C4588d;
import com.google.android.gms.common.util.C4679b;
import java.util.Arrays;
/* renamed from: com.google.android.gms.nearby.messages.internal.f */
/* loaded from: classes2.dex */
public class C8846f extends AbstractC8843c {
    public C8846f(String str) {
        this(a(str));
    }

    public C8846f(String str, String str2) {
        this(a(str), a(str2));
    }

    public C8846f(byte[] bArr) {
        super(m9876d(bArr));
    }

    public C8846f(byte[] bArr, byte[] bArr2) {
        this(C4679b.m23162a(m9880b(bArr), m9878c(bArr2)));
    }

    /* renamed from: b */
    private static byte[] m9880b(byte[] bArr) {
        C4588d.m23618b(bArr.length == 10, new StringBuilder(62).append("Namespace length(").append(bArr.length).append(" bytes) must be ").append(10).append(" bytes.").toString());
        return bArr;
    }

    /* renamed from: c */
    private static byte[] m9878c(byte[] bArr) {
        C4588d.m23618b(bArr.length == 6, new StringBuilder(61).append("Instance length(").append(bArr.length).append(" bytes) must be ").append(6).append(" bytes.").toString());
        return bArr;
    }

    /* renamed from: d */
    private static byte[] m9876d(byte[] bArr) {
        C4588d.m23618b(bArr.length == 10 || bArr.length == 16, "Bytes must be a namespace (10 bytes), or a namespace plus instance (16 bytes).");
        return bArr;
    }

    /* renamed from: c */
    public String m9879c() {
        return AbstractC8843c.m9888a(Arrays.copyOfRange(a(), 0, 10));
    }

    /* renamed from: d */
    public String m9877d() {
        byte[] a = a();
        if (a.length < 16) {
            return null;
        }
        return AbstractC8843c.m9888a(Arrays.copyOfRange(a, 10, 16));
    }

    @Override // com.google.android.gms.nearby.messages.internal.AbstractC8843c
    public String toString() {
        String valueOf = String.valueOf(b());
        return new StringBuilder(String.valueOf(valueOf).length() + 26).append("EddystoneUidPrefix{bytes=").append(valueOf).append("}").toString();
    }
}
