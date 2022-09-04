package it.p273a.p274a;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
/* renamed from: it.a.a.u */
/* loaded from: classes.dex */
class C10882u extends Reader {

    /* renamed from: a */
    private static final String f34890a = System.getProperty("line.separator");

    /* renamed from: b */
    private InputStream f34891b;

    /* renamed from: c */
    private Reader f34892c;

    public C10882u(InputStream inputStream, String str) {
        this.f34891b = inputStream;
        this.f34892c = new InputStreamReader(inputStream, str);
    }

    /* renamed from: a */
    public String m2978a() {
        StringBuffer stringBuffer = new StringBuffer();
        int i = -1;
        while (true) {
            int read = this.f34892c.read();
            if (read == -1) {
                if (stringBuffer.length() != 0) {
                    return stringBuffer.toString();
                }
                return null;
            } else if (read == 10) {
                return stringBuffer.toString();
            } else {
                if (i == 13 && read == 0) {
                    stringBuffer.append(f34890a);
                } else if (read != 0 && read != 13) {
                    stringBuffer.append((char) read);
                }
                i = read;
            }
        }
    }

    /* renamed from: a */
    public void m2977a(String str) {
        synchronized (this) {
            this.f34892c = new InputStreamReader(this.f34891b, str);
        }
    }

    @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        synchronized (this) {
            this.f34892c.close();
        }
    }

    @Override // java.io.Reader
    public int read(char[] cArr, int i, int i2) {
        int read;
        synchronized (this) {
            read = this.f34892c.read(cArr, i, i2);
        }
        return read;
    }
}
