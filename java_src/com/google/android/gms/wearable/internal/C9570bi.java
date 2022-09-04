package com.google.android.gms.wearable.internal;

import android.util.Log;
import com.google.android.gms.common.internal.C4588d;
import com.google.android.gms.wearable.C9457d;
import java.io.IOException;
import java.io.OutputStream;
/* renamed from: com.google.android.gms.wearable.internal.bi */
/* loaded from: classes2.dex */
public final class C9570bi extends OutputStream {

    /* renamed from: a */
    private final OutputStream f30104a;

    /* renamed from: b */
    private volatile C9565be f30105b;

    public C9570bi(OutputStream outputStream) {
        this.f30104a = (OutputStream) C4588d.m23627a(outputStream);
    }

    /* renamed from: a */
    private IOException m7853a(IOException iOException) {
        C9565be c9565be = this.f30105b;
        if (c9565be != null) {
            if (Log.isLoggable("ChannelOutputStream", 2)) {
                Log.v("ChannelOutputStream", "Caught IOException, but channel has been closed. Translating to ChannelIOException.", iOException);
            }
            return new C9457d("Channel closed unexpectedly before stream was finished", c9565be.f30099a, c9565be.f30100b);
        }
        return iOException;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public AbstractC9575bm m7855a() {
        return new AbstractC9575bm() { // from class: com.google.android.gms.wearable.internal.bi.1
            @Override // com.google.android.gms.wearable.internal.AbstractC9575bm
            /* renamed from: a */
            public void mo7845a(C9565be c9565be) {
                C9570bi.this.m7854a(c9565be);
            }
        };
    }

    /* renamed from: a */
    void m7854a(C9565be c9565be) {
        this.f30105b = c9565be;
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        try {
            this.f30104a.close();
        } catch (IOException e) {
            throw m7853a(e);
        }
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() {
        try {
            this.f30104a.flush();
        } catch (IOException e) {
            throw m7853a(e);
        }
    }

    @Override // java.io.OutputStream
    public void write(int i) {
        try {
            this.f30104a.write(i);
        } catch (IOException e) {
            throw m7853a(e);
        }
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr) {
        try {
            this.f30104a.write(bArr);
        } catch (IOException e) {
            throw m7853a(e);
        }
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i, int i2) {
        try {
            this.f30104a.write(bArr, i, i2);
        } catch (IOException e) {
            throw m7853a(e);
        }
    }
}
