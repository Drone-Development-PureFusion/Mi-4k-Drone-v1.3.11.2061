package org.p286a.p287a.p306i.p309c;

import android.util.Log;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import org.p286a.p287a.p288a.AbstractC11008b;
import org.p286a.p287a.p320o.C11354a;
@AbstractC11008b
/* renamed from: org.a.a.i.c.u */
/* loaded from: classes2.dex */
public class C11235u {

    /* renamed from: a */
    private static final String f36163a = "Wire";

    /* renamed from: b */
    private final String f36164b;

    public C11235u(String str) {
        this.f36164b = str;
    }

    /* renamed from: a */
    private void m1576a(String str, InputStream inputStream) {
        StringBuilder sb = new StringBuilder();
        while (true) {
            int read = inputStream.read();
            if (read == -1) {
                break;
            } else if (read == 13) {
                sb.append("[\\r]");
            } else if (read == 10) {
                sb.append("[\\n]\"");
                sb.insert(0, "\"");
                sb.insert(0, str);
                Log.d(f36163a, this.f36164b + " " + sb.toString());
                sb.setLength(0);
            } else if (read < 32 || read > 127) {
                sb.append("[0x");
                sb.append(Integer.toHexString(read));
                sb.append("]");
            } else {
                sb.append((char) read);
            }
        }
        if (sb.length() > 0) {
            sb.append('\"');
            sb.insert(0, '\"');
            sb.insert(0, str);
            Log.d(f36163a, this.f36164b + " " + sb.toString());
        }
    }

    /* renamed from: a */
    public void m1579a(int i) {
        m1575a(new byte[]{(byte) i});
    }

    /* renamed from: a */
    public void m1578a(InputStream inputStream) {
        C11354a.m1321a(inputStream, "Output");
        m1576a(">> ", inputStream);
    }

    /* renamed from: a */
    public void m1577a(String str) {
        C11354a.m1321a(str, "Output");
        m1575a(str.getBytes());
    }

    /* renamed from: a */
    public void m1575a(byte[] bArr) {
        C11354a.m1321a(bArr, "Output");
        m1576a(">> ", new ByteArrayInputStream(bArr));
    }

    /* renamed from: a */
    public void m1574a(byte[] bArr, int i, int i2) {
        C11354a.m1321a(bArr, "Output");
        m1576a(">> ", new ByteArrayInputStream(bArr, i, i2));
    }

    /* renamed from: a */
    public boolean m1580a() {
        return Log.isLoggable(f36163a, 3);
    }

    /* renamed from: b */
    public void m1573b(int i) {
        m1570b(new byte[]{(byte) i});
    }

    /* renamed from: b */
    public void m1572b(InputStream inputStream) {
        C11354a.m1321a(inputStream, "Input");
        m1576a("<< ", inputStream);
    }

    /* renamed from: b */
    public void m1571b(String str) {
        C11354a.m1321a(str, "Input");
        m1570b(str.getBytes());
    }

    /* renamed from: b */
    public void m1570b(byte[] bArr) {
        C11354a.m1321a(bArr, "Input");
        m1576a("<< ", new ByteArrayInputStream(bArr));
    }

    /* renamed from: b */
    public void m1569b(byte[] bArr, int i, int i2) {
        C11354a.m1321a(bArr, "Input");
        m1576a("<< ", new ByteArrayInputStream(bArr, i, i2));
    }
}
