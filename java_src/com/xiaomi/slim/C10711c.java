package com.xiaomi.slim;

import android.text.TextUtils;
import com.xiaomi.channel.commonutils.logger.AbstractC10404b;
import com.xiaomi.channel.commonutils.misc.C10408d;
import com.xiaomi.push.protobuf.C10570b;
import com.xiaomi.push.service.C10615ak;
import java.io.BufferedInputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.zip.Adler32;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.xiaomi.slim.c */
/* loaded from: classes2.dex */
public class C10711c {

    /* renamed from: a */
    private ByteBuffer f33379a = ByteBuffer.allocate(2048);

    /* renamed from: b */
    private ByteBuffer f33380b = ByteBuffer.allocate(4);

    /* renamed from: c */
    private Adler32 f33381c = new Adler32();

    /* renamed from: d */
    private C10713e f33382d = new C10713e();

    /* renamed from: e */
    private InputStream f33383e;

    /* renamed from: f */
    private C10714f f33384f;

    /* renamed from: g */
    private volatile boolean f33385g;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C10711c(InputStream inputStream, C10714f c10714f) {
        this.f33383e = new BufferedInputStream(inputStream);
        this.f33384f = c10714f;
    }

    /* renamed from: a */
    private void m4007a(ByteBuffer byteBuffer, int i) {
        int position = byteBuffer.position();
        do {
            int read = this.f33383e.read(byteBuffer.array(), position, i);
            if (read == -1) {
                throw new EOFException();
            }
            i -= read;
            position += read;
        } while (i > 0);
        byteBuffer.position(position);
    }

    /* renamed from: d */
    private void m4004d() {
        boolean z = false;
        this.f33385g = false;
        C10710b m4005c = m4005c();
        if ("CONN".equals(m4005c.m4035a())) {
            C10570b.C10576f m4572b = C10570b.C10576f.m4572b(m4005c.m4012k());
            if (m4572b.m4570e()) {
                this.f33384f.a(m4572b.m4571d());
                z = true;
            }
            if (m4572b.m4567h()) {
                C10570b.C10572b m4566i = m4572b.m4566i();
                C10710b c10710b = new C10710b();
                c10710b.m4030a("SYNC", "CONF");
                c10710b.m4027a(m4566i.c(), (String) null);
                this.f33384f.m3998a(c10710b);
            }
            AbstractC10404b.m5269a("[Slim] CONN: host = " + m4572b.m4569f());
        }
        if (!z) {
            AbstractC10404b.m5269a("[Slim] Invalid CONN");
            throw new IOException("Invalid Connection");
        }
        while (!this.f33385g) {
            C10710b m4005c2 = m4005c();
            this.f33384f.n();
            switch (m4005c2.m4010m()) {
                case 1:
                    this.f33384f.m3998a(m4005c2);
                    break;
                case 2:
                    if ("SECMSG".equals(m4005c2.m4035a()) && TextUtils.isEmpty(m4005c2.m4026b())) {
                        try {
                            this.f33384f.m3996b(this.f33382d.m3999a(m4005c2.m4019d(C10615ak.m4383a().m4374b(Integer.valueOf(m4005c2.m4023c()).toString(), m4005c2.m4013j()).f33004i), this.f33384f));
                            break;
                        } catch (Exception e) {
                            AbstractC10404b.m5269a("[Slim] Parse packet from Blob " + m4005c2.toString() + " failure:" + e.getMessage());
                            break;
                        }
                    } else {
                        this.f33384f.m3998a(m4005c2);
                        break;
                    }
                    break;
                case 3:
                    try {
                        this.f33384f.m3996b(this.f33382d.m3999a(m4005c2.m4012k(), this.f33384f));
                        break;
                    } catch (Exception e2) {
                        AbstractC10404b.m5269a("[Slim] Parse packet from Blob " + m4005c2.toString() + " failure:" + e2.getMessage());
                        break;
                    }
                default:
                    AbstractC10404b.m5269a("[Slim] unknow blob type " + ((int) m4005c2.m4010m()));
                    break;
            }
        }
    }

    /* renamed from: e */
    private ByteBuffer m4003e() {
        if (this.f33379a.capacity() > 4096) {
            this.f33379a = ByteBuffer.allocate(2048);
        }
        this.f33379a.clear();
        m4007a(this.f33379a, C10710b.m4009n());
        int m4021c = C10710b.m4021c(this.f33379a.asReadOnlyBuffer());
        if (m4021c > 32768) {
            throw new IOException("Blob size too large");
        }
        if (m4021c + 4 > this.f33379a.remaining()) {
            ByteBuffer allocate = ByteBuffer.allocate(C10710b.m4009n() + m4021c);
            allocate.put(this.f33379a.array(), 0, this.f33379a.arrayOffset() + this.f33379a.position());
            this.f33379a = allocate;
        }
        m4007a(this.f33379a, m4021c);
        this.f33380b.clear();
        m4007a(this.f33380b, 4);
        this.f33380b.position(0);
        int i = this.f33380b.getInt();
        this.f33381c.reset();
        this.f33381c.update(this.f33379a.array(), 0, this.f33379a.position());
        if (i == ((int) this.f33381c.getValue())) {
            return this.f33379a;
        }
        AbstractC10404b.m5269a("CRC = " + ((int) this.f33381c.getValue()) + " and " + i);
        throw new IOException("Corrupted Blob bad CRC");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m4008a() {
        try {
            m4004d();
        } catch (IOException e) {
            if (this.f33385g) {
                return;
            }
            throw e;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public void m4006b() {
        this.f33385g = true;
    }

    /* renamed from: c */
    C10710b m4005c() {
        IOException iOException;
        int i;
        ByteBuffer m4003e;
        int position;
        try {
            m4003e = m4003e();
            position = m4003e.position();
        } catch (IOException e) {
            iOException = e;
            i = 0;
        }
        try {
            m4003e.flip();
            C10710b m4024b = C10710b.m4024b(m4003e);
            AbstractC10404b.m5265c("[Slim] Read {cmd=" + m4024b.m4035a() + ";chid=" + m4024b.m4023c() + ";len=" + position + "}");
            return m4024b;
        } catch (IOException e2) {
            i = position;
            iOException = e2;
            if (i == 0) {
                i = this.f33379a.position();
            }
            StringBuilder append = new StringBuilder().append("[Slim] read Blob [");
            byte[] array = this.f33379a.array();
            if (i > C10710b.m4009n()) {
                i = C10710b.m4009n();
            }
            AbstractC10404b.m5269a(append.append(C10408d.m5257a(array, 0, i)).append("] Err:").append(iOException.getMessage()).toString());
            throw iOException;
        }
    }
}
