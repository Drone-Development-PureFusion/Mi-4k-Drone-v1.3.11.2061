package com.p120c.p121a.p138c;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
/* renamed from: com.c.a.c.c */
/* loaded from: classes.dex */
public final class C1354c {

    /* renamed from: a */
    public static final int f3529a = 32768;

    /* renamed from: b */
    public static final int f3530b = 512000;

    /* renamed from: c */
    public static final int f3531c = 75;

    /* renamed from: com.c.a.c.c$a */
    /* loaded from: classes.dex */
    public interface AbstractC1355a {
        /* renamed from: a */
        boolean mo35615a(int i, int i2);
    }

    private C1354c() {
    }

    /* renamed from: a */
    public static void m35619a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Exception e) {
            }
        }
    }

    /* renamed from: a */
    public static void m35618a(InputStream inputStream) {
        do {
            try {
            } catch (IOException e) {
                return;
            } finally {
                m35619a((Closeable) inputStream);
            }
        } while (inputStream.read(new byte[32768], 0, 32768) != -1);
    }

    /* renamed from: a */
    private static boolean m35620a(AbstractC1355a abstractC1355a, int i, int i2) {
        return abstractC1355a != null && !abstractC1355a.mo35615a(i, i2) && (i * 100) / i2 < 75;
    }

    /* renamed from: a */
    public static boolean m35617a(InputStream inputStream, OutputStream outputStream, AbstractC1355a abstractC1355a) {
        return m35616a(inputStream, outputStream, abstractC1355a, 32768);
    }

    /* renamed from: a */
    public static boolean m35616a(InputStream inputStream, OutputStream outputStream, AbstractC1355a abstractC1355a, int i) {
        int available = inputStream.available();
        if (available <= 0) {
            available = 512000;
        }
        byte[] bArr = new byte[i];
        if (m35620a(abstractC1355a, 0, available)) {
            return false;
        }
        int i2 = 0;
        do {
            int read = inputStream.read(bArr, 0, i);
            if (read == -1) {
                outputStream.flush();
                return true;
            }
            outputStream.write(bArr, 0, read);
            i2 += read;
        } while (!m35620a(abstractC1355a, i2, available));
        return false;
    }
}
