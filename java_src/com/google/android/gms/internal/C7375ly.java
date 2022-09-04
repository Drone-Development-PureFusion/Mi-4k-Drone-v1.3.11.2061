package com.google.android.gms.internal;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.Channels;
import java.nio.channels.WritableByteChannel;
import java.util.Random;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
/* renamed from: com.google.android.gms.internal.ly */
/* loaded from: classes2.dex */
class C7375ly {

    /* renamed from: e */
    private C7365ls f24597e;

    /* renamed from: f */
    private WritableByteChannel f24598f;

    /* renamed from: b */
    private final Random f24594b = new Random();

    /* renamed from: c */
    private volatile boolean f24595c = false;

    /* renamed from: d */
    private boolean f24596d = false;

    /* renamed from: g */
    private final Thread f24599g = C7365ls.m14691a().newThread(new Runnable() { // from class: com.google.android.gms.internal.ly.1
        @Override // java.lang.Runnable
        public void run() {
            C7375ly.this.m14643e();
        }
    });

    /* renamed from: a */
    private BlockingQueue<ByteBuffer> f24593a = new LinkedBlockingQueue();

    /* JADX INFO: Access modifiers changed from: package-private */
    public C7375ly(C7365ls c7365ls, String str, int i) {
        C7365ls.m14683b().mo14672a(m14647b(), new StringBuilder(String.valueOf(str).length() + 18).append(str).append("Writer-").append(i).toString());
        this.f24597e = c7365ls;
    }

    /* renamed from: a */
    private void m14650a(C7371lu c7371lu) {
        this.f24597e.m14687a(c7371lu);
    }

    /* renamed from: b */
    private ByteBuffer m14646b(byte b, boolean z, byte[] bArr) {
        int i = 2;
        if (z) {
            i = 6;
        }
        int length = bArr.length;
        if (length >= 126) {
            i = length <= 65535 ? i + 2 : i + 8;
        }
        ByteBuffer allocate = ByteBuffer.allocate(i + bArr.length);
        allocate.put((byte) (b | Byte.MIN_VALUE));
        if (length < 126) {
            allocate.put((byte) (z ? length | 128 : length));
        } else if (length <= 65535) {
            allocate.put((byte) (z ? 254 : 126));
            allocate.putShort((short) length);
        } else {
            int i2 = 127;
            if (z) {
                i2 = 255;
            }
            allocate.put((byte) i2);
            allocate.putInt(0);
            allocate.putInt(length);
        }
        if (z) {
            byte[] m14645c = m14645c();
            allocate.put(m14645c);
            for (int i3 = 0; i3 < bArr.length; i3++) {
                allocate.put((byte) (bArr[i3] ^ m14645c[i3 % 4]));
            }
        }
        allocate.flip();
        return allocate;
    }

    /* renamed from: c */
    private byte[] m14645c() {
        byte[] bArr = new byte[4];
        this.f24594b.nextBytes(bArr);
        return bArr;
    }

    /* renamed from: d */
    private void m14644d() {
        this.f24598f.write(this.f24593a.take());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e */
    public void m14643e() {
        while (!this.f24595c && !Thread.interrupted()) {
            try {
                m14644d();
            } catch (IOException e) {
                m14650a(new C7371lu("IO Exception", e));
                return;
            } catch (InterruptedException e2) {
                return;
            }
        }
        for (int i = 0; i < this.f24593a.size(); i++) {
            m14644d();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m14652a() {
        this.f24595c = true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public synchronized void m14651a(byte b, boolean z, byte[] bArr) {
        ByteBuffer m14646b = m14646b(b, z, bArr);
        if (this.f24595c && (this.f24596d || b != 8)) {
            throw new C7371lu("Shouldn't be sending");
        }
        if (b == 8) {
            this.f24596d = true;
        }
        this.f24593a.add(m14646b);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m14648a(OutputStream outputStream) {
        this.f24598f = Channels.newChannel(outputStream);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public Thread m14647b() {
        return this.f24599g;
    }
}
