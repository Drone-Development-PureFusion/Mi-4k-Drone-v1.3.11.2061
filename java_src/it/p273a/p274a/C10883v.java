package it.p273a.p274a;

import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.StringTokenizer;
import org.p286a.p287a.p299f.p302c.C11125l;
/* renamed from: it.a.a.v */
/* loaded from: classes.dex */
class C10883v extends Writer {

    /* renamed from: a */
    private static final String f34893a = "\r\n";

    /* renamed from: b */
    private OutputStream f34894b;

    /* renamed from: c */
    private Writer f34895c;

    public C10883v(OutputStream outputStream, String str) {
        this.f34894b = outputStream;
        this.f34895c = new OutputStreamWriter(outputStream, str);
    }

    /* renamed from: a */
    public void m2976a(String str) {
        synchronized (this) {
            this.f34895c = new OutputStreamWriter(this.f34894b, str);
        }
    }

    /* renamed from: b */
    public void m2975b(String str) {
        StringBuffer stringBuffer = new StringBuffer();
        StringTokenizer stringTokenizer = new StringTokenizer(str, f34893a);
        int countTokens = stringTokenizer.countTokens();
        boolean z = false;
        for (int i = 0; i < countTokens; i++) {
            String nextToken = stringTokenizer.nextToken();
            if (nextToken.length() > 0) {
                if (z) {
                    stringBuffer.append(C11125l.f35803a);
                    stringBuffer.append((char) 0);
                }
                stringBuffer.append(nextToken);
                z = true;
            }
        }
        if (stringBuffer.length() > 0) {
            this.f34895c.write(stringBuffer.toString());
            this.f34895c.write(f34893a);
            this.f34895c.flush();
        }
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        synchronized (this) {
            this.f34895c.close();
        }
    }

    @Override // java.io.Writer, java.io.Flushable
    public void flush() {
        synchronized (this) {
            this.f34895c.flush();
        }
    }

    @Override // java.io.Writer
    public void write(char[] cArr, int i, int i2) {
        synchronized (this) {
            this.f34895c.write(cArr, i, i2);
        }
    }
}
