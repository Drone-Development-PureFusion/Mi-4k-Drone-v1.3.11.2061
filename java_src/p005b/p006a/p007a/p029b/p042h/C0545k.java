package p005b.p006a.p007a.p029b.p042h;

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
/* renamed from: b.a.a.b.h.k */
/* loaded from: classes.dex */
public class C0545k extends OutputStream {

    /* renamed from: a */
    private static final int f919a = 1024;

    /* renamed from: b */
    private InetAddress f920b;

    /* renamed from: e */
    private final int f923e;

    /* renamed from: d */
    private ByteArrayOutputStream f922d = new ByteArrayOutputStream();

    /* renamed from: c */
    private DatagramSocket f921c = new DatagramSocket();

    public C0545k(String str, int i) {
        this.f920b = InetAddress.getByName(str);
        this.f923e = i;
    }

    /* renamed from: a */
    public int m38875a() {
        return this.f923e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public int m38874b() {
        return this.f921c.getSendBufferSize();
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f920b = null;
        this.f921c = null;
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() {
        byte[] byteArray = this.f922d.toByteArray();
        DatagramPacket datagramPacket = new DatagramPacket(byteArray, byteArray.length, this.f920b, this.f923e);
        if (this.f922d.size() > 1024) {
            this.f922d = new ByteArrayOutputStream();
        } else {
            this.f922d.reset();
        }
        if (byteArray.length == 0 || this.f921c == null) {
            return;
        }
        this.f921c.send(datagramPacket);
    }

    @Override // java.io.OutputStream
    public void write(int i) {
        this.f922d.write(i);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i, int i2) {
        this.f922d.write(bArr, i, i2);
    }
}
