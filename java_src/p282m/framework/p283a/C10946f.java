package p282m.framework.p283a;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
/* renamed from: m.framework.a.f */
/* loaded from: classes2.dex */
public class C10946f extends InputStream {

    /* renamed from: a */
    private ArrayList<InputStream> f35323a = new ArrayList<>();

    /* renamed from: b */
    private int f35324b;

    /* renamed from: a */
    private boolean m2578a() {
        return this.f35323a == null || this.f35323a.size() <= 0;
    }

    /* renamed from: a */
    public void m2577a(InputStream inputStream) {
        this.f35323a.add(inputStream);
    }

    @Override // java.io.InputStream
    public int available() {
        if (m2578a()) {
            return 0;
        }
        return this.f35323a.get(this.f35324b).available();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        Iterator<InputStream> it2 = this.f35323a.iterator();
        while (it2.hasNext()) {
            it2.next().close();
        }
    }

    @Override // java.io.InputStream
    public int read() {
        if (m2578a()) {
            return -1;
        }
        int read = this.f35323a.get(this.f35324b).read();
        while (read < 0) {
            this.f35324b++;
            if (this.f35324b >= this.f35323a.size()) {
                return read;
            }
            read = this.f35323a.get(this.f35324b).read();
        }
        return read;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) {
        if (m2578a()) {
            return -1;
        }
        int read = this.f35323a.get(this.f35324b).read(bArr, i, i2);
        while (read < 0) {
            this.f35324b++;
            if (this.f35324b >= this.f35323a.size()) {
                return read;
            }
            read = this.f35323a.get(this.f35324b).read(bArr, i, i2);
        }
        return read;
    }

    @Override // java.io.InputStream
    public long skip(long j) {
        throw new IOException();
    }
}
