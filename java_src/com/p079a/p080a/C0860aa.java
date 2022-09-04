package com.p079a.p080a;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.zip.CRC32;
import java.util.zip.Deflater;
import java.util.zip.ZipEntry;
import java.util.zip.ZipException;
/* renamed from: com.a.a.aa */
/* loaded from: classes.dex */
public class C0860aa extends FilterOutputStream {

    /* renamed from: a */
    public static final int f1748a = 8;

    /* renamed from: b */
    public static final int f1749b = -1;

    /* renamed from: c */
    public static final int f1750c = 0;
    @Deprecated

    /* renamed from: e */
    public static final int f1752e = 2048;

    /* renamed from: n */
    private static final int f1759n = 512;

    /* renamed from: p */
    private static final int f1760p = 8192;

    /* renamed from: A */
    private long f1762A;

    /* renamed from: D */
    private final Map<ZipEntry, Long> f1763D;

    /* renamed from: E */
    private String f1764E;

    /* renamed from: F */
    private AbstractC0887u f1765F;

    /* renamed from: G */
    private final RandomAccessFile f1766G;

    /* renamed from: H */
    private boolean f1767H;

    /* renamed from: I */
    private boolean f1768I;

    /* renamed from: J */
    private C0862b f1769J;

    /* renamed from: K */
    private boolean f1770K;

    /* renamed from: L */
    private EnumC0883q f1771L;

    /* renamed from: f */
    protected final Deflater f1772f;

    /* renamed from: g */
    protected byte[] f1773g;

    /* renamed from: o */
    private boolean f1774o;

    /* renamed from: r */
    private C0861a f1775r;

    /* renamed from: s */
    private String f1776s;

    /* renamed from: t */
    private int f1777t;

    /* renamed from: u */
    private boolean f1778u;

    /* renamed from: v */
    private int f1779v;

    /* renamed from: w */
    private final List<C0890w> f1780w;

    /* renamed from: x */
    private final CRC32 f1781x;

    /* renamed from: y */
    private long f1782y;

    /* renamed from: z */
    private long f1783z;

    /* renamed from: d */
    static final String f1751d = null;

    /* renamed from: q */
    private static final byte[] f1761q = new byte[0];

    /* renamed from: B */
    private static final byte[] f1745B = new byte[2];

    /* renamed from: C */
    private static final byte[] f1746C = new byte[4];

    /* renamed from: h */
    protected static final byte[] f1753h = C0898z.f1965b.m37449a();

    /* renamed from: i */
    protected static final byte[] f1754i = C0898z.f1966c.m37449a();

    /* renamed from: j */
    protected static final byte[] f1755j = C0898z.f1964a.m37449a();

    /* renamed from: k */
    protected static final byte[] f1756k = C0898z.m37448a(101010256);

    /* renamed from: l */
    static final byte[] f1757l = C0898z.m37448a(101075792);

    /* renamed from: m */
    static final byte[] f1758m = C0898z.m37448a(117853008);

    /* renamed from: M */
    private static final byte[] f1747M = C0898z.m37448a(1);

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.a.a.aa$a */
    /* loaded from: classes.dex */
    public static final class C0861a {

        /* renamed from: a */
        private final C0890w f1784a;

        /* renamed from: b */
        private long f1785b;

        /* renamed from: c */
        private long f1786c;

        /* renamed from: d */
        private long f1787d;

        /* renamed from: e */
        private boolean f1788e;

        /* renamed from: f */
        private boolean f1789f;

        private C0861a(C0890w c0890w) {
            this.f1785b = 0L;
            this.f1786c = 0L;
            this.f1787d = 0L;
            this.f1788e = false;
            this.f1784a = c0890w;
        }

        /* synthetic */ C0861a(C0890w c0890w, C0861a c0861a) {
            this(c0890w);
        }
    }

    /* renamed from: com.a.a.aa$b */
    /* loaded from: classes.dex */
    public static final class C0862b {

        /* renamed from: a */
        public static final C0862b f1790a = new C0862b("always");

        /* renamed from: b */
        public static final C0862b f1791b = new C0862b("never");

        /* renamed from: c */
        public static final C0862b f1792c = new C0862b("not encodeable");

        /* renamed from: d */
        private final String f1793d;

        private C0862b(String str) {
            this.f1793d = str;
        }

        public String toString() {
            return this.f1793d;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0860aa(File file) {
        super(null);
        RandomAccessFile randomAccessFile;
        RandomAccessFile randomAccessFile2 = null;
        this.f1774o = false;
        this.f1776s = "";
        this.f1777t = -1;
        this.f1778u = false;
        this.f1779v = 8;
        this.f1780w = new LinkedList();
        this.f1781x = new CRC32();
        this.f1782y = 0L;
        this.f1783z = 0L;
        this.f1762A = 0L;
        this.f1763D = new HashMap();
        this.f1764E = null;
        this.f1765F = AbstractC0888v.m37518a(f1751d);
        this.f1772f = new Deflater(this.f1777t, true);
        this.f1773g = new byte[512];
        this.f1767H = true;
        this.f1768I = false;
        this.f1769J = C0862b.f1791b;
        this.f1770K = false;
        this.f1771L = EnumC0883q.AsNeeded;
        try {
            randomAccessFile = new RandomAccessFile(file, "rw");
        } catch (IOException e) {
            randomAccessFile = null;
        }
        try {
            randomAccessFile.setLength(0L);
            randomAccessFile2 = randomAccessFile;
        } catch (IOException e2) {
            if (randomAccessFile != null) {
                try {
                    randomAccessFile.close();
                } catch (IOException e3) {
                }
            } else {
                randomAccessFile2 = randomAccessFile;
            }
            this.out = new FileOutputStream(file);
            this.f1766G = randomAccessFile2;
        }
        this.f1766G = randomAccessFile2;
    }

    public C0860aa(OutputStream outputStream) {
        super(outputStream);
        this.f1774o = false;
        this.f1776s = "";
        this.f1777t = -1;
        this.f1778u = false;
        this.f1779v = 8;
        this.f1780w = new LinkedList();
        this.f1781x = new CRC32();
        this.f1782y = 0L;
        this.f1783z = 0L;
        this.f1762A = 0L;
        this.f1763D = new HashMap();
        this.f1764E = null;
        this.f1765F = AbstractC0888v.m37518a(f1751d);
        this.f1772f = new Deflater(this.f1777t, true);
        this.f1773g = new byte[512];
        this.f1767H = true;
        this.f1768I = false;
        this.f1769J = C0862b.f1791b;
        this.f1770K = false;
        this.f1771L = EnumC0883q.AsNeeded;
        this.f1766G = null;
    }

    /* renamed from: a */
    protected static C0898z m37643a(Date date) {
        return AbstractC0864ac.m37589a(date);
    }

    /* renamed from: a */
    private void m37652a(int i, boolean z, boolean z2) {
        int i2;
        C0870f c0870f = new C0870f();
        c0870f.m37562a(this.f1767H || z);
        if (i == 8 && this.f1766G == null) {
            i2 = 20;
            c0870f.m37559b(true);
        } else {
            i2 = 10;
        }
        if (z2) {
            i2 = 45;
        }
        m37639a(C0863ab.m37599a(i2));
        m37639a(c0870f.m37554e());
    }

    /* renamed from: a */
    private void m37646a(C0890w c0890w, long j, boolean z) {
        if (z) {
            C0882p m37617f = m37617f(c0890w);
            if (c0890w.getCompressedSize() >= 4294967295L || c0890w.getSize() >= 4294967295L) {
                m37617f.m37537b(new C0886t(c0890w.getCompressedSize()));
                m37617f.m37542a(new C0886t(c0890w.getSize()));
            } else {
                m37617f.m37537b(null);
                m37617f.m37542a((C0886t) null);
            }
            if (j >= 4294967295L) {
                m37617f.m37535c(new C0886t(j));
            }
            c0890w.m37490h();
        }
    }

    /* renamed from: a */
    private void m37645a(C0890w c0890w, boolean z, ByteBuffer byteBuffer) {
        if (this.f1769J == C0862b.f1790a || !z) {
            c0890w.m37508a(new C0876k(c0890w.getName(), byteBuffer.array(), byteBuffer.arrayOffset(), byteBuffer.limit() - byteBuffer.position()));
        }
        String comment = c0890w.getComment();
        if (comment == null || "".equals(comment)) {
            return;
        }
        boolean mo37521a = this.f1765F.mo37521a(comment);
        if (this.f1769J != C0862b.f1790a && mo37521a) {
            return;
        }
        ByteBuffer mo37519b = m37625c((ZipEntry) c0890w).mo37519b(comment);
        c0890w.m37508a(new C0875j(comment, mo37519b.array(), mo37519b.arrayOffset(), mo37519b.limit() - mo37519b.position()));
    }

    /* renamed from: a */
    private void m37642a(ZipEntry zipEntry) {
        if (zipEntry.getMethod() == -1) {
            zipEntry.setMethod(this.f1779v);
        }
        if (zipEntry.getTime() == -1) {
            zipEntry.setTime(System.currentTimeMillis());
        }
    }

    /* renamed from: a */
    private boolean m37650a(long j, long j2, EnumC0883q enumC0883q) {
        if (this.f1775r.f1784a.getMethod() == 8) {
            this.f1775r.f1784a.setSize(this.f1775r.f1787d);
            this.f1775r.f1784a.setCompressedSize(j);
            this.f1775r.f1784a.setCrc(j2);
            this.f1772f.reset();
        } else if (this.f1766G != null) {
            this.f1775r.f1784a.setSize(j);
            this.f1775r.f1784a.setCompressedSize(j);
            this.f1775r.f1784a.setCrc(j2);
        } else if (this.f1775r.f1784a.getCrc() != j2) {
            throw new ZipException("bad CRC checksum for entry " + this.f1775r.f1784a.getName() + ": " + Long.toHexString(this.f1775r.f1784a.getCrc()) + " instead of " + Long.toHexString(j2));
        } else {
            if (this.f1775r.f1784a.getSize() != j) {
                throw new ZipException("bad size for entry " + this.f1775r.f1784a.getName() + ": " + this.f1775r.f1784a.getSize() + " instead of " + j);
            }
        }
        boolean z = enumC0883q == EnumC0883q.Always || this.f1775r.f1784a.getSize() >= 4294967295L || this.f1775r.f1784a.getCompressedSize() >= 4294967295L;
        if (!z || enumC0883q != EnumC0883q.Never) {
            return z;
        }
        throw new C0884r(C0884r.m37531a(this.f1775r.f1784a));
    }

    /* renamed from: a */
    private boolean m37641a(ZipEntry zipEntry, EnumC0883q enumC0883q) {
        return enumC0883q == EnumC0883q.Always || zipEntry.getSize() >= 4294967295L || zipEntry.getCompressedSize() >= 4294967295L || !(zipEntry.getSize() != -1 || this.f1766G == null || enumC0883q == EnumC0883q.Never);
    }

    /* renamed from: a */
    protected static byte[] m37651a(long j) {
        return AbstractC0864ac.m37594a(j);
    }

    /* renamed from: b */
    private EnumC0883q m37632b(ZipEntry zipEntry) {
        return (this.f1771L == EnumC0883q.AsNeeded && this.f1766G == null && zipEntry.getMethod() == 8 && zipEntry.getSize() == -1) ? EnumC0883q.Never : this.f1771L;
    }

    /* renamed from: b */
    private void m37635b(EnumC0883q enumC0883q) {
        if (this.f1775r.f1784a.getMethod() == 0 && this.f1766G == null) {
            if (this.f1775r.f1784a.getSize() == -1) {
                throw new ZipException("uncompressed size is required for STORED method when not writing to a file");
            }
            if (this.f1775r.f1784a.getCrc() == -1) {
                throw new ZipException("crc checksum is required for STORED method when not writing to a file");
            }
            this.f1775r.f1784a.setCompressedSize(this.f1775r.f1784a.getSize());
        }
        if ((this.f1775r.f1784a.getSize() >= 4294967295L || this.f1775r.f1784a.getCompressedSize() >= 4294967295L) && enumC0883q == EnumC0883q.Never) {
            throw new C0884r(C0884r.m37531a(this.f1775r.f1784a));
        }
    }

    /* renamed from: b */
    private void m37630b(byte[] bArr, int i, int i2) {
        if (i2 <= 0 || this.f1772f.finished()) {
            return;
        }
        this.f1775r.f1787d += i2;
        if (i2 <= 8192) {
            this.f1772f.setInput(bArr, i, i2);
            m37612j();
            return;
        }
        int i3 = i2 / 8192;
        for (int i4 = 0; i4 < i3; i4++) {
            this.f1772f.setInput(bArr, (i4 * 8192) + i, 8192);
            m37612j();
        }
        int i5 = i3 * 8192;
        if (i5 >= i2) {
            return;
        }
        this.f1772f.setInput(bArr, i + i5, i2 - i5);
        m37612j();
    }

    /* renamed from: c */
    protected static long m37628c(int i) {
        return AbstractC0864ac.m37595a(i);
    }

    /* renamed from: c */
    private AbstractC0887u m37625c(ZipEntry zipEntry) {
        return (this.f1765F.mo37521a(zipEntry.getName()) || !this.f1768I) ? this.f1765F : AbstractC0888v.f1903b;
    }

    /* renamed from: c */
    private void m37624c(boolean z) {
        long filePointer = this.f1766G.getFilePointer();
        this.f1766G.seek(this.f1775r.f1785b);
        m37639a(C0898z.m37448a(this.f1775r.f1784a.getCrc()));
        if (!m37615g(this.f1775r.f1784a) || !z) {
            m37639a(C0898z.m37448a(this.f1775r.f1784a.getCompressedSize()));
            m37639a(C0898z.m37448a(this.f1775r.f1784a.getSize()));
        } else {
            m37639a(C0898z.f1967d.m37449a());
            m37639a(C0898z.f1967d.m37449a());
        }
        if (m37615g(this.f1775r.f1784a)) {
            this.f1766G.seek(this.f1775r.f1785b + 12 + 4 + m37621d((ZipEntry) this.f1775r.f1784a).limit() + 4);
            m37639a(C0886t.m37529a(this.f1775r.f1784a.getSize()));
            m37639a(C0886t.m37529a(this.f1775r.f1784a.getCompressedSize()));
            if (!z) {
                this.f1766G.seek(this.f1775r.f1785b - 10);
                m37639a(C0863ab.m37599a(10));
                this.f1775r.f1784a.m37510a(C0882p.f1854a);
                this.f1775r.f1784a.m37490h();
                if (this.f1775r.f1788e) {
                    this.f1770K = false;
                }
            }
        }
        this.f1766G.seek(filePointer);
    }

    /* renamed from: d */
    private ByteBuffer m37621d(ZipEntry zipEntry) {
        return m37625c(zipEntry).mo37519b(zipEntry.getName());
    }

    /* renamed from: f */
    private C0882p m37617f(C0890w c0890w) {
        if (this.f1775r != null) {
            this.f1775r.f1788e = !this.f1770K;
        }
        this.f1770K = true;
        C0882p c0882p = (C0882p) c0890w.m37498b(C0882p.f1854a);
        if (c0882p == null) {
            c0882p = new C0882p();
        }
        c0890w.m37497b(c0882p);
        return c0882p;
    }

    /* renamed from: g */
    private boolean m37615g(C0890w c0890w) {
        return c0890w.m37498b(C0882p.f1854a) != null;
    }

    /* renamed from: i */
    private void m37613i() {
        if (this.f1775r.f1784a.getMethod() == 8) {
            this.f1772f.finish();
            while (!this.f1772f.finished()) {
                m37620e();
            }
        }
    }

    /* renamed from: j */
    private void m37612j() {
        while (!this.f1772f.needsInput()) {
            m37620e();
        }
    }

    /* renamed from: a */
    public void m37653a(int i) {
        if (i < -1 || i > 9) {
            throw new IllegalArgumentException("Invalid compression level: " + i);
        }
        this.f1778u = this.f1777t != i;
        this.f1777t = i;
    }

    /* renamed from: a */
    public void m37649a(C0862b c0862b) {
        this.f1769J = c0862b;
    }

    /* renamed from: a */
    public void m37648a(EnumC0883q enumC0883q) {
        this.f1771L = enumC0883q;
    }

    /* renamed from: a */
    public void m37647a(C0890w c0890w) {
        if (this.f1774o) {
            throw new IOException("Stream has already been finished");
        }
        if (this.f1775r != null) {
            m37623d();
        }
        this.f1775r = new C0861a(c0890w, null);
        this.f1780w.add(this.f1775r.f1784a);
        m37642a((ZipEntry) this.f1775r.f1784a);
        EnumC0883q m37632b = m37632b((ZipEntry) this.f1775r.f1784a);
        m37635b(m37632b);
        if (m37641a(this.f1775r.f1784a, m37632b)) {
            C0882p m37617f = m37617f(this.f1775r.f1784a);
            C0886t c0886t = C0886t.f1877a;
            if (this.f1775r.f1784a.getMethod() == 0 && this.f1775r.f1784a.getSize() != -1) {
                c0886t = new C0886t(this.f1775r.f1784a.getSize());
            }
            m37617f.m37542a(c0886t);
            m37617f.m37537b(c0886t);
            this.f1775r.f1784a.m37490h();
        }
        if (this.f1775r.f1784a.getMethod() == 8 && this.f1778u) {
            this.f1772f.setLevel(this.f1777t);
            this.f1778u = false;
        }
        m37627c(this.f1775r.f1784a);
    }

    /* renamed from: a */
    public void m37644a(String str) {
        this.f1764E = str;
        this.f1765F = AbstractC0888v.m37518a(str);
        if (!this.f1767H || AbstractC0888v.m37515b(str)) {
            return;
        }
        this.f1767H = false;
    }

    /* renamed from: a */
    public void m37640a(boolean z) {
        this.f1767H = z && AbstractC0888v.m37515b(this.f1764E);
    }

    /* renamed from: a */
    protected final void m37639a(byte[] bArr) {
        m37638a(bArr, 0, bArr.length);
    }

    /* renamed from: a */
    protected final void m37638a(byte[] bArr, int i, int i2) {
        if (this.f1766G != null) {
            this.f1766G.write(bArr, i, i2);
        } else {
            this.out.write(bArr, i, i2);
        }
    }

    /* renamed from: a */
    public boolean m37654a() {
        return this.f1766G != null;
    }

    /* renamed from: b */
    public String m37637b() {
        return this.f1764E;
    }

    /* renamed from: b */
    public void m37636b(int i) {
        this.f1779v = i;
    }

    /* renamed from: b */
    public void m37633b(String str) {
        this.f1776s = str;
    }

    /* renamed from: b */
    public void m37631b(boolean z) {
        this.f1768I = z;
    }

    /* renamed from: b */
    public boolean m37634b(C0890w c0890w) {
        return AbstractC0864ac.m37592a(c0890w);
    }

    /* renamed from: c */
    public void m37629c() {
        if (this.f1774o) {
            throw new IOException("This archive has already been finished");
        }
        if (this.f1775r != null) {
            m37623d();
        }
        this.f1783z = this.f1782y;
        for (C0890w c0890w : this.f1780w) {
            m37619e(c0890w);
        }
        this.f1762A = this.f1782y - this.f1783z;
        m37616g();
        m37618f();
        this.f1763D.clear();
        this.f1780w.clear();
        this.f1772f.end();
        this.f1774o = true;
    }

    /* renamed from: c */
    protected void m37627c(C0890w c0890w) {
        boolean mo37521a = this.f1765F.mo37521a(c0890w.getName());
        ByteBuffer m37621d = m37621d((ZipEntry) c0890w);
        if (this.f1769J != C0862b.f1791b) {
            m37645a(c0890w, mo37521a, m37621d);
        }
        this.f1763D.put(c0890w, Long.valueOf(this.f1782y));
        m37639a(f1753h);
        this.f1782y += 4;
        int method = c0890w.getMethod();
        m37652a(method, !mo37521a && this.f1768I, m37615g(c0890w));
        this.f1782y += 4;
        m37639a(C0863ab.m37599a(method));
        this.f1782y += 2;
        m37639a(AbstractC0864ac.m37594a(c0890w.getTime()));
        this.f1782y += 4;
        this.f1775r.f1785b = this.f1782y;
        if (method == 8 || this.f1766G != null) {
            m37639a(f1746C);
            if (m37615g(this.f1775r.f1784a)) {
                m37639a(C0898z.f1967d.m37449a());
                m37639a(C0898z.f1967d.m37449a());
            } else {
                m37639a(f1746C);
                m37639a(f1746C);
            }
        } else {
            m37639a(C0898z.m37448a(c0890w.getCrc()));
            byte[] m37449a = C0898z.f1967d.m37449a();
            if (!m37615g(c0890w)) {
                m37449a = C0898z.m37448a(c0890w.getSize());
            }
            m37639a(m37449a);
            m37639a(m37449a);
        }
        this.f1782y += 12;
        m37639a(C0863ab.m37599a(m37621d.limit()));
        this.f1782y += 2;
        byte[] m37489i = c0890w.m37489i();
        m37639a(C0863ab.m37599a(m37489i.length));
        this.f1782y += 2;
        m37638a(m37621d.array(), m37621d.arrayOffset(), m37621d.limit() - m37621d.position());
        this.f1782y += m37621d.limit();
        m37639a(m37489i);
        this.f1782y = m37489i.length + this.f1782y;
        this.f1775r.f1786c = this.f1782y;
    }

    /* renamed from: c */
    protected byte[] m37626c(String str) {
        try {
            ByteBuffer mo37519b = AbstractC0888v.m37518a(this.f1764E).mo37519b(str);
            byte[] bArr = new byte[mo37519b.limit()];
            System.arraycopy(mo37519b.array(), mo37519b.arrayOffset(), bArr, 0, bArr.length);
            return bArr;
        } catch (IOException e) {
            throw new ZipException("Failed to encode name: " + e.getMessage());
        }
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (!this.f1774o) {
            m37629c();
        }
        m37614h();
    }

    /* renamed from: d */
    public void m37623d() {
        if (this.f1774o) {
            throw new IOException("Stream has already been finished");
        }
        if (this.f1775r == null) {
            throw new IOException("No current entry to close");
        }
        if (!this.f1775r.f1789f) {
            write(f1761q, 0, 0);
        }
        m37613i();
        EnumC0883q m37632b = m37632b((ZipEntry) this.f1775r.f1784a);
        long j = this.f1782y - this.f1775r.f1786c;
        long value = this.f1781x.getValue();
        this.f1781x.reset();
        boolean m37650a = m37650a(j, value, m37632b);
        if (this.f1766G != null) {
            m37624c(m37650a);
        }
        m37622d(this.f1775r.f1784a);
        this.f1775r = null;
    }

    /* renamed from: d */
    protected void m37622d(C0890w c0890w) {
        if (c0890w.getMethod() == 8 && this.f1766G == null) {
            m37639a(f1754i);
            m37639a(C0898z.m37448a(c0890w.getCrc()));
            int i = 4;
            if (!m37615g(c0890w)) {
                m37639a(C0898z.m37448a(c0890w.getCompressedSize()));
                m37639a(C0898z.m37448a(c0890w.getSize()));
            } else {
                m37639a(C0886t.m37529a(c0890w.getCompressedSize()));
                m37639a(C0886t.m37529a(c0890w.getSize()));
                i = 8;
            }
            this.f1782y = (i * 2) + 8 + this.f1782y;
        }
    }

    /* renamed from: e */
    protected final void m37620e() {
        int deflate = this.f1772f.deflate(this.f1773g, 0, this.f1773g.length);
        if (deflate > 0) {
            m37638a(this.f1773g, 0, deflate);
            this.f1782y = deflate + this.f1782y;
        }
    }

    /* renamed from: e */
    protected void m37619e(C0890w c0890w) {
        m37639a(f1755j);
        this.f1782y += 4;
        long longValue = this.f1763D.get(c0890w).longValue();
        boolean z = m37615g(c0890w) || c0890w.getCompressedSize() >= 4294967295L || c0890w.getSize() >= 4294967295L || longValue >= 4294967295L;
        if (!z || this.f1771L != EnumC0883q.Never) {
            m37646a(c0890w, longValue, z);
            m37639a(C0863ab.m37599a((!this.f1770K ? 20 : 45) | (c0890w.m37494d() << 8)));
            this.f1782y += 2;
            int method = c0890w.getMethod();
            m37652a(method, !this.f1765F.mo37521a(c0890w.getName()) && this.f1768I, z);
            this.f1782y += 4;
            m37639a(C0863ab.m37599a(method));
            this.f1782y += 2;
            m37639a(AbstractC0864ac.m37594a(c0890w.getTime()));
            this.f1782y += 4;
            m37639a(C0898z.m37448a(c0890w.getCrc()));
            if (c0890w.getCompressedSize() >= 4294967295L || c0890w.getSize() >= 4294967295L) {
                m37639a(C0898z.f1967d.m37449a());
                m37639a(C0898z.f1967d.m37449a());
            } else {
                m37639a(C0898z.m37448a(c0890w.getCompressedSize()));
                m37639a(C0898z.m37448a(c0890w.getSize()));
            }
            this.f1782y += 12;
            ByteBuffer m37621d = m37621d((ZipEntry) c0890w);
            m37639a(C0863ab.m37599a(m37621d.limit()));
            this.f1782y += 2;
            byte[] m37488j = c0890w.m37488j();
            m37639a(C0863ab.m37599a(m37488j.length));
            this.f1782y += 2;
            String comment = c0890w.getComment();
            if (comment == null) {
                comment = "";
            }
            ByteBuffer mo37519b = m37625c((ZipEntry) c0890w).mo37519b(comment);
            m37639a(C0863ab.m37599a(mo37519b.limit()));
            this.f1782y += 2;
            m37639a(f1745B);
            this.f1782y += 2;
            m37639a(C0863ab.m37599a(c0890w.m37513a()));
            this.f1782y += 2;
            m37639a(C0898z.m37448a(c0890w.m37501b()));
            this.f1782y += 4;
            m37639a(C0898z.m37448a(Math.min(longValue, 4294967295L)));
            this.f1782y += 4;
            m37638a(m37621d.array(), m37621d.arrayOffset(), m37621d.limit() - m37621d.position());
            this.f1782y += m37621d.limit();
            m37639a(m37488j);
            this.f1782y = m37488j.length + this.f1782y;
            m37638a(mo37519b.array(), mo37519b.arrayOffset(), mo37519b.limit() - mo37519b.position());
            this.f1782y = mo37519b.limit() + this.f1782y;
            return;
        }
        throw new C0884r("archive's size exceeds the limit of 4GByte.");
    }

    /* renamed from: f */
    protected void m37618f() {
        m37639a(f1756k);
        m37639a(f1745B);
        m37639a(f1745B);
        int size = this.f1780w.size();
        if (size <= 65535 || this.f1771L != EnumC0883q.Never) {
            if (this.f1783z > 4294967295L && this.f1771L == EnumC0883q.Never) {
                throw new C0884r("archive's size exceeds the limit of 4GByte.");
            }
            byte[] m37599a = C0863ab.m37599a(Math.min(size, 65535));
            m37639a(m37599a);
            m37639a(m37599a);
            m37639a(C0898z.m37448a(Math.min(this.f1762A, 4294967295L)));
            m37639a(C0898z.m37448a(Math.min(this.f1783z, 4294967295L)));
            ByteBuffer mo37519b = this.f1765F.mo37519b(this.f1776s);
            m37639a(C0863ab.m37599a(mo37519b.limit()));
            m37638a(mo37519b.array(), mo37519b.arrayOffset(), mo37519b.limit() - mo37519b.position());
            return;
        }
        throw new C0884r("archive contains more than 65535 entries.");
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Flushable
    public void flush() {
        if (this.out != null) {
            this.out.flush();
        }
    }

    /* renamed from: g */
    protected void m37616g() {
        if (this.f1771L == EnumC0883q.Never) {
            return;
        }
        if (!this.f1770K && (this.f1783z >= 4294967295L || this.f1762A >= 4294967295L || this.f1780w.size() >= 65535)) {
            this.f1770K = true;
        }
        if (!this.f1770K) {
            return;
        }
        long j = this.f1782y;
        m37639a(f1757l);
        m37639a(C0886t.m37529a(44L));
        m37639a(C0863ab.m37599a(45));
        m37639a(C0863ab.m37599a(45));
        m37639a(f1746C);
        m37639a(f1746C);
        byte[] m37529a = C0886t.m37529a(this.f1780w.size());
        m37639a(m37529a);
        m37639a(m37529a);
        m37639a(C0886t.m37529a(this.f1762A));
        m37639a(C0886t.m37529a(this.f1783z));
        m37639a(f1758m);
        m37639a(f1746C);
        m37639a(C0886t.m37529a(j));
        m37639a(f1747M);
    }

    /* renamed from: h */
    void m37614h() {
        if (this.f1766G != null) {
            this.f1766G.close();
        }
        if (this.out != null) {
            this.out.close();
        }
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(byte[] bArr, int i, int i2) {
        AbstractC0864ac.m37586b(this.f1775r.f1784a);
        this.f1775r.f1789f = true;
        if (this.f1775r.f1784a.getMethod() == 8) {
            m37630b(bArr, i, i2);
        } else {
            m37638a(bArr, i, i2);
            this.f1782y += i2;
        }
        this.f1781x.update(bArr, i, i2);
    }
}
