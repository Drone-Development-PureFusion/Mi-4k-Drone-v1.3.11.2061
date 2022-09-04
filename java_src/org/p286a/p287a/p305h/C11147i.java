package org.p286a.p287a.p305h;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;
import org.p286a.p287a.p288a.AbstractC11009c;
import org.p286a.p287a.p320o.C11354a;
@AbstractC11009c
/* renamed from: org.a.a.h.i */
/* loaded from: classes2.dex */
public class C11147i extends AbstractC11139a {

    /* renamed from: e */
    private byte[] f35850e;

    /* renamed from: f */
    private Serializable f35851f;

    public C11147i(Serializable serializable) {
        C11354a.m1321a(serializable, "Source object");
        this.f35851f = serializable;
    }

    public C11147i(Serializable serializable, boolean z) {
        C11354a.m1321a(serializable, "Source object");
        if (z) {
            m1934a(serializable);
        } else {
            this.f35851f = serializable;
        }
    }

    /* renamed from: a */
    private void m1934a(Serializable serializable) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
        objectOutputStream.writeObject(serializable);
        objectOutputStream.flush();
        this.f35850e = byteArrayOutputStream.toByteArray();
    }

    public InputStream getContent() {
        if (this.f35850e == null) {
            m1934a(this.f35851f);
        }
        return new ByteArrayInputStream(this.f35850e);
    }

    public long getContentLength() {
        if (this.f35850e == null) {
            return -1L;
        }
        return this.f35850e.length;
    }

    public boolean isRepeatable() {
        return true;
    }

    public boolean isStreaming() {
        return this.f35850e == null;
    }

    public void writeTo(OutputStream outputStream) {
        C11354a.m1321a(outputStream, "Output stream");
        if (this.f35850e != null) {
            outputStream.write(this.f35850e);
            outputStream.flush();
            return;
        }
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
        objectOutputStream.writeObject(this.f35851f);
        objectOutputStream.flush();
    }
}
