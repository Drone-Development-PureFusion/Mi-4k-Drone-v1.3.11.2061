package com.p079a.p080a;

import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.zip.Inflater;
import java.util.zip.InflaterInputStream;
import java.util.zip.ZipException;
/* renamed from: com.a.a.y */
/* loaded from: classes.dex */
public class C0892y {

    /* renamed from: A */
    private static final int f1924A = 48;

    /* renamed from: B */
    private static final long f1925B = 26;

    /* renamed from: a */
    static final int f1926a = 15;

    /* renamed from: b */
    static final int f1927b = 8;

    /* renamed from: c */
    private static final int f1928c = 509;

    /* renamed from: d */
    private static final int f1929d = 0;

    /* renamed from: e */
    private static final int f1930e = 1;

    /* renamed from: f */
    private static final int f1931f = 2;

    /* renamed from: g */
    private static final int f1932g = 3;

    /* renamed from: t */
    private static final int f1933t = 42;

    /* renamed from: u */
    private static final long f1934u = C0898z.m37447a(C0860aa.f1755j);

    /* renamed from: v */
    private static final int f1935v = 22;

    /* renamed from: w */
    private static final int f1936w = 65557;

    /* renamed from: x */
    private static final int f1937x = 16;

    /* renamed from: y */
    private static final int f1938y = 20;

    /* renamed from: z */
    private static final int f1939z = 8;

    /* renamed from: C */
    private final Comparator<C0890w> f1940C;

    /* renamed from: h */
    private final Map<C0890w, C0897c> f1941h;

    /* renamed from: i */
    private final Map<String, C0890w> f1942i;

    /* renamed from: j */
    private final String f1943j;

    /* renamed from: k */
    private final AbstractC0887u f1944k;

    /* renamed from: l */
    private final String f1945l;

    /* renamed from: m */
    private final RandomAccessFile f1946m;

    /* renamed from: n */
    private final boolean f1947n;

    /* renamed from: o */
    private boolean f1948o;

    /* renamed from: p */
    private final byte[] f1949p;

    /* renamed from: q */
    private final byte[] f1950q;

    /* renamed from: r */
    private final byte[] f1951r;

    /* renamed from: s */
    private final byte[] f1952s;

    /* renamed from: com.a.a.y$a */
    /* loaded from: classes.dex */
    private class C0895a extends InputStream {

        /* renamed from: b */
        private long f1957b;

        /* renamed from: c */
        private long f1958c;

        /* renamed from: d */
        private boolean f1959d = false;

        C0895a(long j, long j2) {
            this.f1957b = j2;
            this.f1958c = j;
        }

        /* renamed from: a */
        void m37456a() {
            this.f1959d = true;
        }

        @Override // java.io.InputStream
        public int read() {
            int read;
            long j = this.f1957b;
            this.f1957b = j - 1;
            if (j <= 0) {
                if (!this.f1959d) {
                    return -1;
                }
                this.f1959d = false;
                return 0;
            }
            synchronized (C0892y.this.f1946m) {
                RandomAccessFile randomAccessFile = C0892y.this.f1946m;
                long j2 = this.f1958c;
                this.f1958c = j2 + 1;
                randomAccessFile.seek(j2);
                read = C0892y.this.f1946m.read();
            }
            return read;
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i, int i2) {
            int read;
            if (this.f1957b <= 0) {
                if (!this.f1959d) {
                    return -1;
                }
                this.f1959d = false;
                bArr[i] = 0;
                return 1;
            } else if (i2 <= 0) {
                return 0;
            } else {
                if (i2 > this.f1957b) {
                    i2 = (int) this.f1957b;
                }
                synchronized (C0892y.this.f1946m) {
                    C0892y.this.f1946m.seek(this.f1958c);
                    read = C0892y.this.f1946m.read(bArr, i, i2);
                }
                if (read <= 0) {
                    return read;
                }
                this.f1958c += read;
                this.f1957b -= read;
                return read;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.a.a.y$b */
    /* loaded from: classes.dex */
    public static final class C0896b {

        /* renamed from: a */
        private final byte[] f1960a;

        /* renamed from: b */
        private final byte[] f1961b;

        private C0896b(byte[] bArr, byte[] bArr2) {
            this.f1960a = bArr;
            this.f1961b = bArr2;
        }

        /* synthetic */ C0896b(byte[] bArr, byte[] bArr2, C0896b c0896b) {
            this(bArr, bArr2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.a.a.y$c */
    /* loaded from: classes.dex */
    public static final class C0897c {

        /* renamed from: a */
        private long f1962a;

        /* renamed from: b */
        private long f1963b;

        private C0897c() {
            this.f1962a = -1L;
            this.f1963b = -1L;
        }

        /* synthetic */ C0897c(C0897c c0897c) {
            this();
        }
    }

    public C0892y(File file) {
        this(file, (String) null);
    }

    public C0892y(File file, String str) {
        this(file, str, true);
    }

    public C0892y(File file, String str, boolean z) {
        this.f1941h = new LinkedHashMap((int) f1928c);
        this.f1942i = new HashMap((int) f1928c);
        this.f1949p = new byte[8];
        this.f1950q = new byte[4];
        this.f1951r = new byte[42];
        this.f1952s = new byte[2];
        this.f1940C = new Comparator<C0890w>() { // from class: com.a.a.y.1
            @Override // java.util.Comparator
            /* renamed from: a */
            public int compare(C0890w c0890w, C0890w c0890w2) {
                if (c0890w == c0890w2) {
                    return 0;
                }
                C0897c c0897c = (C0897c) C0892y.this.f1941h.get(c0890w);
                C0897c c0897c2 = (C0897c) C0892y.this.f1941h.get(c0890w2);
                if (c0897c == null) {
                    return 1;
                }
                if (c0897c2 == null) {
                    return -1;
                }
                long j = c0897c.f1962a - c0897c2.f1962a;
                return j == 0 ? 0 : j < 0 ? -1 : 1;
            }
        };
        this.f1945l = file.getAbsolutePath();
        this.f1943j = str;
        this.f1944k = AbstractC0888v.m37518a(str);
        this.f1947n = z;
        this.f1946m = new RandomAccessFile(file, "r");
        try {
            m37467b(m37463e());
        } catch (Throwable th) {
            try {
                this.f1948o = true;
                this.f1946m.close();
            } catch (IOException e) {
            }
            throw th;
        }
    }

    public C0892y(String str) {
        this(new File(str), (String) null);
    }

    public C0892y(String str, String str2) {
        this(new File(str), str2, true);
    }

    /* renamed from: a */
    private void m37477a(int i) {
        int i2 = 0;
        while (i2 < i) {
            int skipBytes = this.f1946m.skipBytes(i - i2);
            if (skipBytes <= 0) {
                throw new EOFException();
            }
            i2 += skipBytes;
        }
    }

    /* renamed from: a */
    private void m37474a(C0890w c0890w, C0897c c0897c, int i) {
        boolean z = true;
        C0882p c0882p = (C0882p) c0890w.m37498b(C0882p.f1854a);
        if (c0882p != null) {
            boolean z2 = c0890w.getSize() == 4294967295L;
            boolean z3 = c0890w.getCompressedSize() == 4294967295L;
            boolean z4 = c0897c.f1962a == 4294967295L;
            if (i != 65535) {
                z = false;
            }
            c0882p.m37540a(z2, z3, z4, z);
            if (z2) {
                c0890w.setSize(c0882p.m37538b().m37525b());
            } else if (z3) {
                c0882p.m37542a(new C0886t(c0890w.getSize()));
            }
            if (z3) {
                c0890w.setCompressedSize(c0882p.m37534g().m37525b());
            } else if (z2) {
                c0882p.m37537b(new C0886t(c0890w.getCompressedSize()));
            }
            if (!z4) {
                return;
            }
            c0897c.f1962a = c0882p.m37533h().m37525b();
        }
    }

    /* renamed from: a */
    public static void m37473a(C0892y c0892y) {
        if (c0892y != null) {
            try {
                c0892y.m37470b();
            } catch (IOException e) {
            }
        }
    }

    /* renamed from: a */
    private void m37471a(Map<C0890w, C0896b> map) {
        this.f1946m.readFully(this.f1951r);
        C0890w c0890w = new C0890w();
        c0890w.m37495c((C0863ab.m37597a(this.f1951r, 0) >> 8) & 15);
        C0870f m37561a = C0870f.m37561a(this.f1951r, 4);
        boolean m37563a = m37561a.m37563a();
        AbstractC0887u abstractC0887u = m37563a ? AbstractC0888v.f1903b : this.f1944k;
        c0890w.m37509a(m37561a);
        c0890w.setMethod(C0863ab.m37597a(this.f1951r, 6));
        c0890w.setTime(AbstractC0864ac.m37587b(C0898z.m37446a(this.f1951r, 8)));
        c0890w.setCrc(C0898z.m37446a(this.f1951r, 12));
        c0890w.setCompressedSize(C0898z.m37446a(this.f1951r, 16));
        c0890w.setSize(C0898z.m37446a(this.f1951r, 20));
        int m37597a = C0863ab.m37597a(this.f1951r, 24);
        int m37597a2 = C0863ab.m37597a(this.f1951r, 26);
        int m37597a3 = C0863ab.m37597a(this.f1951r, 28);
        int m37597a4 = C0863ab.m37597a(this.f1951r, 30);
        c0890w.m37512a(C0863ab.m37597a(this.f1951r, 32));
        c0890w.m37511a(C0898z.m37446a(this.f1951r, 34));
        byte[] bArr = new byte[m37597a];
        this.f1946m.readFully(bArr);
        c0890w.m37506a(abstractC0887u.mo37520a(bArr), bArr);
        C0897c c0897c = new C0897c(null);
        c0897c.f1962a = C0898z.m37446a(this.f1951r, 38);
        this.f1941h.put(c0890w, c0897c);
        this.f1942i.put(c0890w.getName(), c0890w);
        byte[] bArr2 = new byte[m37597a2];
        this.f1946m.readFully(bArr2);
        c0890w.m37504a(bArr2);
        m37474a(c0890w, c0897c, m37597a4);
        byte[] bArr3 = new byte[m37597a3];
        this.f1946m.readFully(bArr3);
        c0890w.setComment(abstractC0887u.mo37520a(bArr3));
        if (m37563a || !this.f1947n) {
            return;
        }
        map.put(c0890w, new C0896b(bArr, bArr3, null));
    }

    /* renamed from: a */
    private boolean m37476a(long j, long j2, byte[] bArr) {
        boolean z = false;
        long length = this.f1946m.length() - j;
        long max = Math.max(0L, this.f1946m.length() - j2);
        if (length >= 0) {
            while (true) {
                if (length >= max) {
                    this.f1946m.seek(length);
                    int read = this.f1946m.read();
                    if (read != -1) {
                        if (read == bArr[0] && this.f1946m.read() == bArr[1] && this.f1946m.read() == bArr[2] && this.f1946m.read() == bArr[3]) {
                            z = true;
                            break;
                        }
                        length--;
                    } else {
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        if (z) {
            this.f1946m.seek(length);
        }
        return z;
    }

    /* renamed from: b */
    private void m37467b(Map<C0890w, C0896b> map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(this.f1941h);
        this.f1941h.clear();
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            C0890w c0890w = (C0890w) entry.getKey();
            C0897c c0897c = (C0897c) entry.getValue();
            long j = c0897c.f1962a;
            this.f1946m.seek(j + f1925B);
            this.f1946m.readFully(this.f1952s);
            int m37598a = C0863ab.m37598a(this.f1952s);
            this.f1946m.readFully(this.f1952s);
            int m37598a2 = C0863ab.m37598a(this.f1952s);
            int i = m37598a;
            while (i > 0) {
                int skipBytes = this.f1946m.skipBytes(i);
                if (skipBytes <= 0) {
                    throw new IOException("failed to skip file name in local file header");
                }
                i -= skipBytes;
            }
            byte[] bArr = new byte[m37598a2];
            this.f1946m.readFully(bArr);
            c0890w.setExtra(bArr);
            c0897c.f1963b = m37598a + j + f1925B + 2 + 2 + m37598a2;
            if (map.containsKey(c0890w)) {
                String name = c0890w.getName();
                C0896b c0896b = map.get(c0890w);
                AbstractC0864ac.m37591a(c0890w, c0896b.f1960a, c0896b.f1961b);
                if (!name.equals(c0890w.getName())) {
                    this.f1942i.remove(name);
                    this.f1942i.put(c0890w.getName(), c0890w);
                }
            }
            this.f1941h.put(c0890w, c0897c);
        }
    }

    /* renamed from: e */
    private Map<C0890w, C0896b> m37463e() {
        HashMap hashMap = new HashMap();
        m37462f();
        this.f1946m.readFully(this.f1950q);
        long m37447a = C0898z.m37447a(this.f1950q);
        if (m37447a == f1934u || !m37458j()) {
            while (m37447a == f1934u) {
                m37471a(hashMap);
                this.f1946m.readFully(this.f1950q);
                m37447a = C0898z.m37447a(this.f1950q);
            }
            return hashMap;
        }
        throw new IOException("central directory is empty, can't expand corrupt archive.");
    }

    /* renamed from: f */
    private void m37462f() {
        boolean z = false;
        m37459i();
        boolean z2 = this.f1946m.getFilePointer() > 20;
        if (z2) {
            this.f1946m.seek(this.f1946m.getFilePointer() - 20);
            this.f1946m.readFully(this.f1950q);
            z = Arrays.equals(C0860aa.f1758m, this.f1950q);
        }
        if (z) {
            m37461g();
            return;
        }
        if (z2) {
            m37477a(16);
        }
        m37460h();
    }

    /* renamed from: g */
    private void m37461g() {
        m37477a(4);
        this.f1946m.readFully(this.f1949p);
        this.f1946m.seek(C0886t.m37527a(this.f1949p));
        this.f1946m.readFully(this.f1950q);
        if (!Arrays.equals(this.f1950q, C0860aa.f1757l)) {
            throw new ZipException("archive's ZIP64 end of central directory locator is corrupt.");
        }
        m37477a(44);
        this.f1946m.readFully(this.f1949p);
        this.f1946m.seek(C0886t.m37527a(this.f1949p));
    }

    /* renamed from: h */
    private void m37460h() {
        m37477a(16);
        this.f1946m.readFully(this.f1950q);
        this.f1946m.seek(C0898z.m37447a(this.f1950q));
    }

    /* renamed from: i */
    private void m37459i() {
        if (!m37476a(22L, 65557L, C0860aa.f1756k)) {
            throw new ZipException("archive is not a ZIP archive");
        }
    }

    /* renamed from: j */
    private boolean m37458j() {
        this.f1946m.seek(0L);
        this.f1946m.readFully(this.f1950q);
        return Arrays.equals(this.f1950q, C0860aa.f1753h);
    }

    /* renamed from: a */
    public C0890w m37472a(String str) {
        return this.f1942i.get(str);
    }

    /* renamed from: a */
    public String m37478a() {
        return this.f1943j;
    }

    /* renamed from: a */
    public boolean m37475a(C0890w c0890w) {
        return AbstractC0864ac.m37592a(c0890w);
    }

    /* renamed from: b */
    public InputStream m37469b(C0890w c0890w) {
        C0897c c0897c = this.f1941h.get(c0890w);
        if (c0897c == null) {
            return null;
        }
        AbstractC0864ac.m37586b(c0890w);
        C0895a c0895a = new C0895a(c0897c.f1963b, c0890w.getCompressedSize());
        switch (c0890w.getMethod()) {
            case 0:
                return c0895a;
            case 8:
                c0895a.m37456a();
                final Inflater inflater = new Inflater(true);
                return new InflaterInputStream(c0895a, inflater) { // from class: com.a.a.y.2
                    @Override // java.util.zip.InflaterInputStream, java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
                    public void close() {
                        super.close();
                        inflater.end();
                    }
                };
            default:
                throw new ZipException("Found unsupported compression method " + c0890w.getMethod());
        }
    }

    /* renamed from: b */
    public void m37470b() {
        this.f1948o = true;
        this.f1946m.close();
    }

    /* renamed from: c */
    public Enumeration<C0890w> m37466c() {
        return Collections.enumeration(this.f1941h.keySet());
    }

    /* renamed from: d */
    public Enumeration<C0890w> m37464d() {
        C0890w[] c0890wArr = (C0890w[]) this.f1941h.keySet().toArray(new C0890w[0]);
        Arrays.sort(c0890wArr, this.f1940C);
        return Collections.enumeration(Arrays.asList(c0890wArr));
    }

    protected void finalize() {
        try {
            if (!this.f1948o) {
                System.err.println("Cleaning up unclosed ZipFile for archive " + this.f1945l);
                m37470b();
            }
        } finally {
            super.finalize();
        }
    }
}
