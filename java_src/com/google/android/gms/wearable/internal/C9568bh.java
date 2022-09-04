package com.google.android.gms.wearable.internal;

import com.google.android.gms.common.internal.C4588d;
import com.google.android.gms.wearable.C9457d;
import java.io.InputStream;
/* renamed from: com.google.android.gms.wearable.internal.bh */
/* loaded from: classes2.dex */
public final class C9568bh extends InputStream {

    /* renamed from: a */
    private final InputStream f30101a;

    /* renamed from: b */
    private volatile C9565be f30102b;

    public C9568bh(InputStream inputStream) {
        this.f30101a = (InputStream) C4588d.m23627a(inputStream);
    }

    /* renamed from: a */
    private int m7857a(int i) {
        C9565be c9565be;
        if (i != -1 || (c9565be = this.f30102b) == null) {
            return i;
        }
        throw new C9457d("Channel closed unexpectedly before stream was finished", c9565be.f30099a, c9565be.f30100b);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public AbstractC9575bm m7858a() {
        return new AbstractC9575bm() { // from class: com.google.android.gms.wearable.internal.bh.1
            @Override // com.google.android.gms.wearable.internal.AbstractC9575bm
            /* renamed from: a */
            public void mo7845a(C9565be c9565be) {
                C9568bh.this.m7856a(c9565be);
            }
        };
    }

    /* renamed from: a */
    void m7856a(C9565be c9565be) {
        this.f30102b = (C9565be) C4588d.m23627a(c9565be);
    }

    @Override // java.io.InputStream
    public int available() {
        return this.f30101a.available();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f30101a.close();
    }

    @Override // java.io.InputStream
    public void mark(int i) {
        this.f30101a.mark(i);
    }

    @Override // java.io.InputStream
    public boolean markSupported() {
        return this.f30101a.markSupported();
    }

    @Override // java.io.InputStream
    public int read() {
        return m7857a(this.f30101a.read());
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) {
        return m7857a(this.f30101a.read(bArr));
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) {
        return m7857a(this.f30101a.read(bArr, i, i2));
    }

    @Override // java.io.InputStream
    public void reset() {
        this.f30101a.reset();
    }

    @Override // java.io.InputStream
    public long skip(long j) {
        return this.f30101a.skip(j);
    }
}
