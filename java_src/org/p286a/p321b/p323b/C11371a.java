package org.p286a.p321b.p323b;

import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import org.codehaus.jackson.smile.SmileConstants;
import org.p286a.p321b.C11392f;
import org.p286a.p321b.p324c.AbstractC11388d;
/* renamed from: org.a.b.b.a */
/* loaded from: classes2.dex */
public class C11371a extends AbstractC11376e {

    /* renamed from: f */
    private static final C11381j f36462f = new C11381j();

    /* renamed from: a */
    protected boolean f36463a;

    /* renamed from: b */
    protected boolean f36464b;

    /* renamed from: c */
    protected int f36465c;

    /* renamed from: d */
    protected boolean f36466d = false;

    /* renamed from: g */
    private byte[] f36467g = new byte[1];

    /* renamed from: h */
    private byte[] f36468h = new byte[2];

    /* renamed from: i */
    private byte[] f36469i = new byte[4];

    /* renamed from: j */
    private byte[] f36470j = new byte[8];

    /* renamed from: k */
    private byte[] f36471k = new byte[1];

    /* renamed from: l */
    private byte[] f36472l = new byte[2];

    /* renamed from: m */
    private byte[] f36473m = new byte[4];

    /* renamed from: n */
    private byte[] f36474n = new byte[8];

    /* renamed from: org.a.b.b.a$a */
    /* loaded from: classes2.dex */
    public static class C11372a implements AbstractC11378g {

        /* renamed from: a */
        protected boolean f36475a;

        /* renamed from: b */
        protected boolean f36476b;

        /* renamed from: c */
        protected int f36477c;

        public C11372a() {
            this(false, true);
        }

        public C11372a(boolean z, boolean z2) {
            this(z, z2, 0);
        }

        public C11372a(boolean z, boolean z2, int i) {
            this.f36475a = false;
            this.f36476b = true;
            this.f36475a = z;
            this.f36476b = z2;
            this.f36477c = i;
        }

        @Override // org.p286a.p321b.p323b.AbstractC11378g
        /* renamed from: a */
        public AbstractC11376e mo1221a(AbstractC11388d abstractC11388d) {
            C11371a c11371a = new C11371a(abstractC11388d, this.f36475a, this.f36476b);
            if (this.f36477c != 0) {
                c11371a.m1263c(this.f36477c);
            }
            return c11371a;
        }
    }

    public C11371a(AbstractC11388d abstractC11388d, boolean z, boolean z2) {
        super(abstractC11388d);
        this.f36463a = false;
        this.f36464b = true;
        this.f36463a = z;
        this.f36464b = z2;
    }

    /* renamed from: a */
    private int m1265a(byte[] bArr, int i, int i2) {
        m1262d(i2);
        return this.f36486e.m1211d(bArr, i, i2);
    }

    @Override // org.p286a.p321b.p323b.AbstractC11376e
    /* renamed from: a */
    public void mo1261a() {
    }

    @Override // org.p286a.p321b.p323b.AbstractC11376e
    /* renamed from: a */
    public void mo1260a(byte b) {
        this.f36467g[0] = b;
        this.f36486e.mo1213b(this.f36467g, 0, 1);
    }

    @Override // org.p286a.p321b.p323b.AbstractC11376e
    /* renamed from: a */
    public void mo1259a(double d) {
        mo1257a(Double.doubleToLongBits(d));
    }

    @Override // org.p286a.p321b.p323b.AbstractC11376e
    /* renamed from: a */
    public void mo1258a(int i) {
        this.f36469i[0] = (byte) ((i >> 24) & 255);
        this.f36469i[1] = (byte) ((i >> 16) & 255);
        this.f36469i[2] = (byte) ((i >> 8) & 255);
        this.f36469i[3] = (byte) (i & 255);
        this.f36486e.mo1213b(this.f36469i, 0, 4);
    }

    @Override // org.p286a.p321b.p323b.AbstractC11376e
    /* renamed from: a */
    public void mo1257a(long j) {
        this.f36470j[0] = (byte) ((j >> 56) & 255);
        this.f36470j[1] = (byte) ((j >> 48) & 255);
        this.f36470j[2] = (byte) ((j >> 40) & 255);
        this.f36470j[3] = (byte) ((j >> 32) & 255);
        this.f36470j[4] = (byte) ((j >> 24) & 255);
        this.f36470j[5] = (byte) ((j >> 16) & 255);
        this.f36470j[6] = (byte) ((j >> 8) & 255);
        this.f36470j[7] = (byte) (255 & j);
        this.f36486e.mo1213b(this.f36470j, 0, 8);
    }

    @Override // org.p286a.p321b.p323b.AbstractC11376e
    /* renamed from: a */
    public void mo1256a(String str) {
        try {
            byte[] bytes = str.getBytes("UTF-8");
            mo1258a(bytes.length);
            this.f36486e.mo1213b(bytes, 0, bytes.length);
        } catch (UnsupportedEncodingException e) {
            throw new C11392f("JVM DOES NOT SUPPORT UTF-8");
        }
    }

    @Override // org.p286a.p321b.p323b.AbstractC11376e
    /* renamed from: a */
    public void mo1255a(ByteBuffer byteBuffer) {
        int limit = (byteBuffer.limit() - byteBuffer.position()) - byteBuffer.arrayOffset();
        mo1258a(limit);
        this.f36486e.mo1213b(byteBuffer.array(), byteBuffer.position() + byteBuffer.arrayOffset(), limit);
    }

    @Override // org.p286a.p321b.p323b.AbstractC11376e
    /* renamed from: a */
    public void mo1254a(C11373b c11373b) {
        mo1260a(c11373b.f36479b);
        mo1249a(c11373b.f36480c);
    }

    @Override // org.p286a.p321b.p323b.AbstractC11376e
    /* renamed from: a */
    public void mo1253a(C11374c c11374c) {
        mo1260a(c11374c.f36481a);
        mo1258a(c11374c.f36482b);
    }

    @Override // org.p286a.p321b.p323b.AbstractC11376e
    /* renamed from: a */
    public void mo1252a(C11375d c11375d) {
        mo1260a(c11375d.f36483a);
        mo1260a(c11375d.f36484b);
        mo1258a(c11375d.f36485c);
    }

    @Override // org.p286a.p321b.p323b.AbstractC11376e
    /* renamed from: a */
    public void mo1251a(C11380i c11380i) {
        mo1260a(c11380i.f36489a);
        mo1258a(c11380i.f36490b);
    }

    @Override // org.p286a.p321b.p323b.AbstractC11376e
    /* renamed from: a */
    public void mo1250a(C11381j c11381j) {
    }

    @Override // org.p286a.p321b.p323b.AbstractC11376e
    /* renamed from: a */
    public void mo1249a(short s) {
        this.f36468h[0] = (byte) ((s >> 8) & 255);
        this.f36468h[1] = (byte) (s & 255);
        this.f36486e.mo1213b(this.f36468h, 0, 2);
    }

    @Override // org.p286a.p321b.p323b.AbstractC11376e
    /* renamed from: a */
    public void mo1248a(boolean z) {
        mo1260a(z ? (byte) 1 : (byte) 0);
    }

    /* renamed from: b */
    public String m1264b(int i) {
        try {
            m1262d(i);
            byte[] bArr = new byte[i];
            this.f36486e.m1211d(bArr, 0, i);
            return new String(bArr, "UTF-8");
        } catch (UnsupportedEncodingException e) {
            throw new C11392f("JVM DOES NOT SUPPORT UTF-8");
        }
    }

    @Override // org.p286a.p321b.p323b.AbstractC11376e
    /* renamed from: b */
    public void mo1247b() {
    }

    @Override // org.p286a.p321b.p323b.AbstractC11376e
    /* renamed from: c */
    public void mo1246c() {
        mo1260a((byte) 0);
    }

    /* renamed from: c */
    public void m1263c(int i) {
        this.f36465c = i;
        this.f36466d = true;
    }

    @Override // org.p286a.p321b.p323b.AbstractC11376e
    /* renamed from: d */
    public void mo1245d() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: d */
    public void m1262d(int i) {
        if (i < 0) {
            throw new C11392f("Negative length: " + i);
        }
        if (!this.f36466d) {
            return;
        }
        this.f36465c -= i;
        if (this.f36465c >= 0) {
            return;
        }
        throw new C11392f("Message length exceeded: " + i);
    }

    @Override // org.p286a.p321b.p323b.AbstractC11376e
    /* renamed from: e */
    public void mo1244e() {
    }

    @Override // org.p286a.p321b.p323b.AbstractC11376e
    /* renamed from: f */
    public void mo1243f() {
    }

    @Override // org.p286a.p321b.p323b.AbstractC11376e
    /* renamed from: g */
    public C11381j mo1242g() {
        return f36462f;
    }

    @Override // org.p286a.p321b.p323b.AbstractC11376e
    /* renamed from: h */
    public void mo1241h() {
    }

    @Override // org.p286a.p321b.p323b.AbstractC11376e
    /* renamed from: i */
    public C11373b mo1240i() {
        byte mo1234r = mo1234r();
        return new C11373b("", mo1234r, mo1234r == 0 ? (short) 0 : mo1233s());
    }

    @Override // org.p286a.p321b.p323b.AbstractC11376e
    /* renamed from: j */
    public void mo1239j() {
    }

    @Override // org.p286a.p321b.p323b.AbstractC11376e
    /* renamed from: k */
    public C11375d mo1226k() {
        return new C11375d(mo1234r(), mo1234r(), mo1232t());
    }

    @Override // org.p286a.p321b.p323b.AbstractC11376e
    /* renamed from: l */
    public void mo1238l() {
    }

    @Override // org.p286a.p321b.p323b.AbstractC11376e
    /* renamed from: m */
    public C11374c mo1225m() {
        return new C11374c(mo1234r(), mo1232t());
    }

    @Override // org.p286a.p321b.p323b.AbstractC11376e
    /* renamed from: n */
    public void mo1237n() {
    }

    @Override // org.p286a.p321b.p323b.AbstractC11376e
    /* renamed from: o */
    public C11380i mo1224o() {
        return new C11380i(mo1234r(), mo1232t());
    }

    @Override // org.p286a.p321b.p323b.AbstractC11376e
    /* renamed from: p */
    public void mo1236p() {
    }

    @Override // org.p286a.p321b.p323b.AbstractC11376e
    /* renamed from: q */
    public boolean mo1235q() {
        return mo1234r() == 1;
    }

    @Override // org.p286a.p321b.p323b.AbstractC11376e
    /* renamed from: r */
    public byte mo1234r() {
        if (this.f36486e.mo1212c() < 1) {
            m1265a(this.f36471k, 0, 1);
            return this.f36471k[0];
        }
        byte b = this.f36486e.mo1217a()[this.f36486e.mo1214b()];
        this.f36486e.mo1216a(1);
        return b;
    }

    @Override // org.p286a.p321b.p323b.AbstractC11376e
    /* renamed from: s */
    public short mo1233s() {
        int i = 0;
        byte[] bArr = this.f36472l;
        if (this.f36486e.mo1212c() >= 2) {
            bArr = this.f36486e.mo1217a();
            i = this.f36486e.mo1214b();
            this.f36486e.mo1216a(2);
        } else {
            m1265a(this.f36472l, 0, 2);
        }
        return (short) ((bArr[i + 1] & SmileConstants.BYTE_MARKER_END_OF_CONTENT) | ((bArr[i] & SmileConstants.BYTE_MARKER_END_OF_CONTENT) << 8));
    }

    @Override // org.p286a.p321b.p323b.AbstractC11376e
    /* renamed from: t */
    public int mo1232t() {
        int i = 0;
        byte[] bArr = this.f36473m;
        if (this.f36486e.mo1212c() >= 4) {
            bArr = this.f36486e.mo1217a();
            i = this.f36486e.mo1214b();
            this.f36486e.mo1216a(4);
        } else {
            m1265a(this.f36473m, 0, 4);
        }
        return (bArr[i + 3] & SmileConstants.BYTE_MARKER_END_OF_CONTENT) | ((bArr[i] & SmileConstants.BYTE_MARKER_END_OF_CONTENT) << 24) | ((bArr[i + 1] & SmileConstants.BYTE_MARKER_END_OF_CONTENT) << 16) | ((bArr[i + 2] & SmileConstants.BYTE_MARKER_END_OF_CONTENT) << 8);
    }

    @Override // org.p286a.p321b.p323b.AbstractC11376e
    /* renamed from: u */
    public long mo1231u() {
        int i = 0;
        byte[] bArr = this.f36474n;
        if (this.f36486e.mo1212c() >= 8) {
            bArr = this.f36486e.mo1217a();
            i = this.f36486e.mo1214b();
            this.f36486e.mo1216a(8);
        } else {
            m1265a(this.f36474n, 0, 8);
        }
        return (bArr[i + 7] & SmileConstants.BYTE_MARKER_END_OF_CONTENT) | ((bArr[i] & SmileConstants.BYTE_MARKER_END_OF_CONTENT) << 56) | ((bArr[i + 1] & SmileConstants.BYTE_MARKER_END_OF_CONTENT) << 48) | ((bArr[i + 2] & SmileConstants.BYTE_MARKER_END_OF_CONTENT) << 40) | ((bArr[i + 3] & SmileConstants.BYTE_MARKER_END_OF_CONTENT) << 32) | ((bArr[i + 4] & SmileConstants.BYTE_MARKER_END_OF_CONTENT) << 24) | ((bArr[i + 5] & SmileConstants.BYTE_MARKER_END_OF_CONTENT) << 16) | ((bArr[i + 6] & SmileConstants.BYTE_MARKER_END_OF_CONTENT) << 8);
    }

    @Override // org.p286a.p321b.p323b.AbstractC11376e
    /* renamed from: v */
    public double mo1230v() {
        return Double.longBitsToDouble(mo1231u());
    }

    @Override // org.p286a.p321b.p323b.AbstractC11376e
    /* renamed from: w */
    public String mo1223w() {
        int mo1232t = mo1232t();
        if (this.f36486e.mo1212c() >= mo1232t) {
            try {
                String str = new String(this.f36486e.mo1217a(), this.f36486e.mo1214b(), mo1232t, "UTF-8");
                this.f36486e.mo1216a(mo1232t);
                return str;
            } catch (UnsupportedEncodingException e) {
                throw new C11392f("JVM DOES NOT SUPPORT UTF-8");
            }
        }
        return m1264b(mo1232t);
    }

    @Override // org.p286a.p321b.p323b.AbstractC11376e
    /* renamed from: x */
    public ByteBuffer mo1222x() {
        int mo1232t = mo1232t();
        m1262d(mo1232t);
        if (this.f36486e.mo1212c() >= mo1232t) {
            ByteBuffer wrap = ByteBuffer.wrap(this.f36486e.mo1217a(), this.f36486e.mo1214b(), mo1232t);
            this.f36486e.mo1216a(mo1232t);
            return wrap;
        }
        byte[] bArr = new byte[mo1232t];
        this.f36486e.m1211d(bArr, 0, mo1232t);
        return ByteBuffer.wrap(bArr);
    }
}
