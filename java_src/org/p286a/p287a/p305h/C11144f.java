package org.p286a.p287a.p305h;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import org.p286a.p287a.p288a.AbstractC11009c;
import org.p286a.p287a.p320o.C11354a;
@AbstractC11009c
/* renamed from: org.a.a.h.f */
/* loaded from: classes.dex */
public class C11144f extends AbstractC11139a implements Cloneable {

    /* renamed from: e */
    protected final File f35846e;

    public C11144f(File file) {
        this.f35846e = (File) C11354a.m1321a(file, "File");
    }

    @Deprecated
    public C11144f(File file, String str) {
        this.f35846e = (File) C11354a.m1321a(file, "File");
        a(str);
    }

    public C11144f(File file, C11143e c11143e) {
        this.f35846e = (File) C11354a.m1321a(file, "File");
        if (c11143e != null) {
            a(c11143e.toString());
        }
    }

    public Object clone() {
        return super.clone();
    }

    public InputStream getContent() {
        return new FileInputStream(this.f35846e);
    }

    public long getContentLength() {
        return this.f35846e.length();
    }

    public boolean isRepeatable() {
        return true;
    }

    public boolean isStreaming() {
        return false;
    }

    public void writeTo(OutputStream outputStream) {
        C11354a.m1321a(outputStream, "Output stream");
        FileInputStream fileInputStream = new FileInputStream(this.f35846e);
        try {
            byte[] bArr = new byte[4096];
            while (true) {
                int read = fileInputStream.read(bArr);
                if (read == -1) {
                    outputStream.flush();
                    return;
                }
                outputStream.write(bArr, 0, read);
            }
        } finally {
            fileInputStream.close();
        }
    }
}
