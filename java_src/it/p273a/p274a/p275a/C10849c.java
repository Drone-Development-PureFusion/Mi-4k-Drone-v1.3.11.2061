package it.p273a.p274a.p275a;

import java.io.OutputStream;
/* renamed from: it.a.a.a.c */
/* loaded from: classes2.dex */
class C10849c extends OutputStream {

    /* renamed from: a */
    private OutputStream f34735a;

    /* renamed from: b */
    private int f34736b;

    /* renamed from: c */
    private int f34737c;

    /* renamed from: d */
    private int f34738d;

    /* renamed from: e */
    private int f34739e;

    public C10849c(OutputStream outputStream) {
        this(outputStream, 76);
    }

    public C10849c(OutputStream outputStream, int i) {
        this.f34735a = null;
        this.f34736b = 0;
        this.f34737c = 0;
        this.f34738d = 0;
        this.f34739e = 0;
        this.f34735a = outputStream;
        this.f34739e = i;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public void m3131a() {
        if (this.f34737c > 0) {
            if (this.f34739e > 0 && this.f34738d == this.f34739e) {
                this.f34735a.write("\r\n".getBytes());
                this.f34738d = 0;
            }
            char charAt = C10847a.f34729a.charAt((this.f34736b << 8) >>> 26);
            char charAt2 = C10847a.f34729a.charAt((this.f34736b << 14) >>> 26);
            char charAt3 = this.f34737c < 2 ? C10847a.f34730b : C10847a.f34729a.charAt((this.f34736b << 20) >>> 26);
            char charAt4 = this.f34737c < 3 ? C10847a.f34730b : C10847a.f34729a.charAt((this.f34736b << 26) >>> 26);
            this.f34735a.write(charAt);
            this.f34735a.write(charAt2);
            this.f34735a.write(charAt3);
            this.f34735a.write(charAt4);
            this.f34738d += 4;
            this.f34737c = 0;
            this.f34736b = 0;
        }
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        m3131a();
        this.f34735a.close();
    }

    @Override // java.io.OutputStream
    public void write(int i) {
        this.f34736b = ((i & 255) << (16 - (this.f34737c * 8))) | this.f34736b;
        this.f34737c++;
        if (this.f34737c == 3) {
            m3131a();
        }
    }
}
