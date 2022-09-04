package org.p286a.p287a.p305h;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.nio.charset.UnsupportedCharsetException;
import org.p286a.p287a.p288a.AbstractC11009c;
import org.p286a.p287a.p320o.C11354a;
@AbstractC11009c
/* renamed from: org.a.a.h.j */
/* loaded from: classes.dex */
public class C11148j extends AbstractC11139a implements Cloneable {

    /* renamed from: e */
    protected final byte[] f35852e;

    public C11148j(String str) {
        this(str, C11143e.f35841m);
    }

    public C11148j(String str, String str2) {
        this(str, C11143e.m1945a(C11143e.f35838j.m1947a(), str2));
    }

    @Deprecated
    public C11148j(String str, String str2, String str3) {
        C11354a.m1321a(str, "Source string");
        str2 = str2 == null ? "text/plain" : str2;
        str3 = str3 == null ? "ISO-8859-1" : str3;
        this.f35852e = str.getBytes(str3);
        a(str2 + "; charset=" + str3);
    }

    public C11148j(String str, Charset charset) {
        this(str, C11143e.m1944a(C11143e.f35838j.m1947a(), charset));
    }

    public C11148j(String str, C11143e c11143e) {
        C11354a.m1321a(str, "Source string");
        Charset m1940b = c11143e != null ? c11143e.m1940b() : null;
        m1940b = m1940b == null ? Charset.forName("ISO-8859-1") : m1940b;
        try {
            this.f35852e = str.getBytes(m1940b.name());
            if (c11143e == null) {
                return;
            }
            a(c11143e.toString());
        } catch (UnsupportedEncodingException e) {
            throw new UnsupportedCharsetException(m1940b.name());
        }
    }

    public Object clone() {
        return super.clone();
    }

    public InputStream getContent() {
        return new ByteArrayInputStream(this.f35852e);
    }

    public long getContentLength() {
        return this.f35852e.length;
    }

    public boolean isRepeatable() {
        return true;
    }

    public boolean isStreaming() {
        return false;
    }

    public void writeTo(OutputStream outputStream) {
        C11354a.m1321a(outputStream, "Output stream");
        outputStream.write(this.f35852e);
        outputStream.flush();
    }
}
