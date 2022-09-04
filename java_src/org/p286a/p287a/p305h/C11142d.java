package org.p286a.p287a.p305h;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import org.p286a.p287a.p288a.AbstractC11009c;
import org.p286a.p287a.p320o.C11354a;
@AbstractC11009c
/* renamed from: org.a.a.h.d */
/* loaded from: classes.dex */
public class C11142d extends AbstractC11139a implements Cloneable {
    @Deprecated

    /* renamed from: e */
    protected final byte[] f35825e;

    /* renamed from: f */
    private final byte[] f35826f;

    /* renamed from: g */
    private final int f35827g;

    /* renamed from: h */
    private final int f35828h;

    public C11142d(byte[] bArr) {
        this(bArr, null);
    }

    public C11142d(byte[] bArr, int i, int i2) {
        this(bArr, i, i2, null);
    }

    public C11142d(byte[] bArr, int i, int i2, C11143e c11143e) {
        C11354a.m1321a(bArr, "Source byte array");
        if (i < 0 || i > bArr.length || i2 < 0 || i + i2 < 0 || i + i2 > bArr.length) {
            throw new IndexOutOfBoundsException("off: " + i + " len: " + i2 + " b.length: " + bArr.length);
        }
        this.f35825e = bArr;
        this.f35826f = bArr;
        this.f35827g = i;
        this.f35828h = i2;
        if (c11143e == null) {
            return;
        }
        a(c11143e.toString());
    }

    public C11142d(byte[] bArr, C11143e c11143e) {
        C11354a.m1321a(bArr, "Source byte array");
        this.f35825e = bArr;
        this.f35826f = bArr;
        this.f35827g = 0;
        this.f35828h = this.f35826f.length;
        if (c11143e != null) {
            a(c11143e.toString());
        }
    }

    public Object clone() {
        return super.clone();
    }

    public InputStream getContent() {
        return new ByteArrayInputStream(this.f35826f, this.f35827g, this.f35828h);
    }

    public long getContentLength() {
        return this.f35828h;
    }

    public boolean isRepeatable() {
        return true;
    }

    public boolean isStreaming() {
        return false;
    }

    public void writeTo(OutputStream outputStream) {
        C11354a.m1321a(outputStream, "Output stream");
        outputStream.write(this.f35826f, this.f35827g, this.f35828h);
        outputStream.flush();
    }
}
