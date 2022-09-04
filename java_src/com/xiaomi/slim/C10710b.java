package com.xiaomi.slim;

import android.text.TextUtils;
import com.xiaomi.channel.commonutils.logger.AbstractC10404b;
import com.xiaomi.mipush.sdk.Constants;
import com.xiaomi.push.protobuf.C10570b;
import com.xiaomi.push.service.C10627aq;
import com.xiaomi.smack.packet.AbstractC10735d;
import com.xiaomi.smack.util.C10749d;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
/* renamed from: com.xiaomi.slim.b */
/* loaded from: classes.dex */
public class C10710b {

    /* renamed from: b */
    private static String f33372b = C10749d.m3839a(5) + Constants.ACCEPT_TIME_SEPARATOR_SERVER;

    /* renamed from: c */
    private static long f33373c = 0;

    /* renamed from: f */
    private static final byte[] f33374f = new byte[0];

    /* renamed from: a */
    String f33375a;

    /* renamed from: d */
    private C10570b.C10571a f33376d;

    /* renamed from: e */
    private short f33377e;

    /* renamed from: g */
    private byte[] f33378g;

    public C10710b() {
        this.f33377e = (short) 2;
        this.f33378g = f33374f;
        this.f33375a = null;
        this.f33376d = new C10570b.C10571a();
    }

    C10710b(C10570b.C10571a c10571a, short s, byte[] bArr) {
        this.f33377e = (short) 2;
        this.f33378g = f33374f;
        this.f33375a = null;
        this.f33376d = c10571a;
        this.f33377e = s;
        this.f33378g = bArr;
    }

    @Deprecated
    /* renamed from: a */
    public static C10710b m4032a(AbstractC10735d abstractC10735d, String str) {
        C10710b c10710b = new C10710b();
        int i = 1;
        try {
            i = Integer.parseInt(abstractC10735d.m3884l());
        } catch (Exception e) {
            AbstractC10404b.m5269a("Blob parse chid err " + e.getMessage());
        }
        c10710b.m4034a(i);
        c10710b.m4031a(abstractC10735d.m3886k());
        c10710b.m4022c(abstractC10735d.m3880n());
        c10710b.m4025b(abstractC10735d.m3878o());
        c10710b.m4030a("XMLMSG", (String) null);
        try {
            c10710b.m4027a(abstractC10735d.mo3862c().getBytes("utf8"), str);
            if (TextUtils.isEmpty(str)) {
                c10710b.m4028a((short) 3);
            } else {
                c10710b.m4028a((short) 2);
                c10710b.m4030a("SECMSG", (String) null);
            }
        } catch (UnsupportedEncodingException e2) {
            AbstractC10404b.m5269a("Blob setPayload err： " + e2.getMessage());
        }
        return c10710b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static C10710b m4024b(ByteBuffer byteBuffer) {
        try {
            if (byteBuffer.getShort(0) != -15618 || byteBuffer.getShort(2) != 4) {
                throw new IOException("Malformed Input");
            }
            short s = byteBuffer.getShort(6);
            short s2 = byteBuffer.getShort(8);
            int i = byteBuffer.getInt(10);
            C10570b.C10571a c10571a = new C10570b.C10571a();
            c10571a.b(byteBuffer.array(), 14, s2);
            byte[] bArr = new byte[i];
            byteBuffer.position(s2 + 14);
            byteBuffer.get(bArr, 0, i);
            return new C10710b(c10571a, s, bArr);
        } catch (Exception e) {
            AbstractC10404b.m5269a("read Blob err :" + e.getMessage());
            throw new IOException("Malformed Input");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static int m4021c(ByteBuffer byteBuffer) {
        return byteBuffer.getShort(8) + byteBuffer.getInt(10);
    }

    /* renamed from: g */
    public static synchronized String m4016g() {
        String sb;
        synchronized (C10710b.class) {
            StringBuilder append = new StringBuilder().append(f33372b);
            long j = f33373c;
            f33373c = 1 + j;
            sb = append.append(Long.toString(j)).toString();
        }
        return sb;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: n */
    public static int m4009n() {
        return 14;
    }

    /* renamed from: a */
    public String m4035a() {
        return this.f33376d.m4669l();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public ByteBuffer m4029a(ByteBuffer byteBuffer) {
        int m4011l = m4011l();
        if (byteBuffer == null || byteBuffer.remaining() < m4011l) {
            if (byteBuffer != null) {
                m4011l += byteBuffer.capacity();
            }
            ByteBuffer allocate = ByteBuffer.allocate(m4011l);
            if (byteBuffer != null) {
                allocate.put(byteBuffer.array(), byteBuffer.arrayOffset(), byteBuffer.position());
            }
            byteBuffer = allocate;
        }
        ByteBuffer slice = byteBuffer.slice();
        slice.putShort((short) -15618);
        slice.putShort((short) 4);
        slice.putShort((short) 1);
        slice.putShort(this.f33377e);
        slice.putShort((short) this.f33376d.mo4533a());
        slice.putInt(this.f33378g.length);
        int position = slice.position();
        this.f33376d.a(slice.array(), slice.arrayOffset() + position, this.f33376d.mo4533a());
        slice.position(position + this.f33376d.mo4533a());
        slice.put(this.f33378g);
        byteBuffer.position(slice.position() + byteBuffer.position());
        return byteBuffer;
    }

    /* renamed from: a */
    public void m4034a(int i) {
        this.f33376d.m4689a(i);
    }

    /* renamed from: a */
    public void m4033a(long j, String str, String str2) {
        if (j != 0) {
            this.f33376d.m4688a(j);
        }
        if (!TextUtils.isEmpty(str)) {
            this.f33376d.m4687a(str);
        }
        if (!TextUtils.isEmpty(str2)) {
            this.f33376d.m4684b(str2);
        }
    }

    /* renamed from: a */
    public void m4031a(String str) {
        this.f33376d.m4677e(str);
    }

    /* renamed from: a */
    public void m4030a(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("command should not be empty");
        }
        this.f33376d.m4682c(str);
        this.f33376d.m4665p();
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        this.f33376d.m4679d(str2);
    }

    /* renamed from: a */
    public void m4028a(short s) {
        this.f33377e = s;
    }

    /* renamed from: a */
    public void m4027a(byte[] bArr, String str) {
        if (!TextUtils.isEmpty(str)) {
            this.f33376d.m4683c(1);
            this.f33378g = C10627aq.m4346a(C10627aq.m4350a(str, m4015h()), bArr);
            return;
        }
        this.f33376d.m4683c(0);
        this.f33378g = bArr;
    }

    /* renamed from: b */
    public String m4026b() {
        return this.f33376d.m4667n();
    }

    /* renamed from: b */
    public void m4025b(String str) {
        this.f33375a = str;
    }

    /* renamed from: c */
    public int m4023c() {
        return this.f33376d.m4681d();
    }

    /* renamed from: c */
    public void m4022c(String str) {
        if (!TextUtils.isEmpty(str)) {
            int indexOf = str.indexOf("@");
            try {
                long parseLong = Long.parseLong(str.substring(0, indexOf));
                int indexOf2 = str.indexOf("/", indexOf);
                String substring = str.substring(indexOf + 1, indexOf2);
                String substring2 = str.substring(indexOf2 + 1);
                this.f33376d.m4688a(parseLong);
                this.f33376d.m4687a(substring);
                this.f33376d.m4684b(substring2);
            } catch (Exception e) {
                AbstractC10404b.m5269a("Blob parse user err " + e.getMessage());
            }
        }
    }

    /* renamed from: d */
    public boolean m4020d() {
        return this.f33376d.m4657x();
    }

    /* renamed from: d */
    public byte[] m4019d(String str) {
        if (this.f33376d.m4660u() == 1) {
            return C10627aq.m4346a(C10627aq.m4350a(str, m4015h()), this.f33378g);
        }
        if (this.f33376d.m4660u() == 0) {
            return this.f33378g;
        }
        AbstractC10404b.m5269a("unknow cipher = " + this.f33376d.m4660u());
        return this.f33378g;
    }

    /* renamed from: e */
    public int m4018e() {
        return this.f33376d.m4658w();
    }

    /* renamed from: f */
    public String m4017f() {
        return this.f33376d.m4656y();
    }

    /* renamed from: h */
    public String m4015h() {
        String m4664q = this.f33376d.m4664q();
        if ("ID_NOT_AVAILABLE".equals(m4664q)) {
            return null;
        }
        if (this.f33376d.m4663r()) {
            return m4664q;
        }
        String m4016g = m4016g();
        this.f33376d.m4677e(m4016g);
        return m4016g;
    }

    /* renamed from: i */
    public String m4014i() {
        return this.f33375a;
    }

    /* renamed from: j */
    public String m4013j() {
        if (this.f33376d.m4674g()) {
            return Long.toString(this.f33376d.m4676f()) + "@" + this.f33376d.m4673h() + "/" + this.f33376d.m4671j();
        }
        return null;
    }

    /* renamed from: k */
    public byte[] m4012k() {
        return this.f33378g;
    }

    /* renamed from: l */
    public int m4011l() {
        return m4009n() + this.f33376d.mo4526b() + this.f33378g.length;
    }

    /* renamed from: m */
    public short m4010m() {
        return this.f33377e;
    }

    public String toString() {
        return "Blob [chid=" + m4023c() + "; Id=" + m4015h() + "; cmd=" + m4035a() + "; type=" + ((int) m4010m()) + "; from=" + m4013j() + " ]";
    }
}
