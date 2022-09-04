package com.google.android.gms.internal;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.nio.ByteBuffer;
import java.util.UUID;
/* renamed from: com.google.android.gms.internal.ry */
/* loaded from: classes2.dex */
public final class C7681ry {

    /* renamed from: a */
    private static final char[] f25512a = "0123456789abcdef".toCharArray();

    /* renamed from: a */
    public static String m13697a(String str) {
        if (str == null || !str.matches("^[a-fA-F0-9]{8}-([a-fA-F0-9]{4}-){3}[a-fA-F0-9]{12}$")) {
            return str;
        }
        UUID fromString = UUID.fromString(str);
        byte[] bArr = new byte[16];
        ByteBuffer wrap = ByteBuffer.wrap(bArr);
        wrap.putLong(fromString.getMostSignificantBits());
        wrap.putLong(fromString.getLeastSignificantBits());
        return C7253jl.m15088a(bArr, true);
    }

    /* renamed from: a */
    public static String m13696a(Throwable th) {
        StringWriter stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter(stringWriter));
        return stringWriter.toString();
    }
}
