package it.p273a.p274a.p275a;

import java.io.IOException;
import java.io.InputStream;
/* renamed from: it.a.a.a.b */
/* loaded from: classes2.dex */
class C10848b extends InputStream {

    /* renamed from: a */
    private InputStream f34731a;

    /* renamed from: b */
    private int[] f34732b;

    /* renamed from: c */
    private int f34733c = 0;

    /* renamed from: d */
    private boolean f34734d = false;

    public C10848b(InputStream inputStream) {
        this.f34731a = inputStream;
    }

    /* renamed from: a */
    private void m3132a() {
        int i = 1;
        char[] cArr = new char[4];
        int i2 = 0;
        do {
            int read = this.f34731a.read();
            if (read == -1) {
                if (i2 != 0) {
                    throw new IOException("Bad base64 stream");
                }
                this.f34732b = new int[0];
                this.f34734d = true;
                return;
            }
            char c = (char) read;
            if (C10847a.f34729a.indexOf(c) != -1 || c == C10847a.f34730b) {
                cArr[i2] = c;
                i2++;
                continue;
            } else if (c != '\r' && c != '\n') {
                throw new IOException("Bad base64 stream");
            }
        } while (i2 < 4);
        boolean z = false;
        for (int i3 = 0; i3 < 4; i3++) {
            if (cArr[i3] != C10847a.f34730b) {
                if (z) {
                    throw new IOException("Bad base64 stream");
                }
            } else if (!z) {
                z = true;
            }
        }
        if (cArr[3] != C10847a.f34730b) {
            i = 3;
        } else if (this.f34731a.read() != -1) {
            throw new IOException("Bad base64 stream");
        } else {
            this.f34734d = true;
            if (cArr[2] != C10847a.f34730b) {
                i = 2;
            }
        }
        int i4 = 0;
        for (int i5 = 0; i5 < 4; i5++) {
            if (cArr[i5] != C10847a.f34730b) {
                i4 |= C10847a.f34729a.indexOf(cArr[i5]) << ((3 - i5) * 6);
            }
        }
        this.f34732b = new int[i];
        for (int i6 = 0; i6 < i; i6++) {
            this.f34732b[i6] = (i4 >>> ((2 - i6) * 8)) & 255;
        }
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f34731a.close();
    }

    @Override // java.io.InputStream
    public int read() {
        if (this.f34732b == null || this.f34733c == this.f34732b.length) {
            if (this.f34734d) {
                return -1;
            }
            m3132a();
            if (this.f34732b.length == 0) {
                this.f34732b = null;
                return -1;
            }
            this.f34733c = 0;
        }
        int[] iArr = this.f34732b;
        int i = this.f34733c;
        this.f34733c = i + 1;
        return iArr[i];
    }
}
