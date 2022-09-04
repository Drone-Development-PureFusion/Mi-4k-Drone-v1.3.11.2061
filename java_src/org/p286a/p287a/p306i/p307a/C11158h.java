package org.p286a.p287a.p306i.p307a;

import android.util.Base64;
import java.io.UnsupportedEncodingException;
import java.security.Key;
import java.security.MessageDigest;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Locale;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import org.apache.http.impl.auth.NTLMEngine;
import org.apache.http.impl.auth.NTLMEngineException;
import org.apache.http.util.EncodingUtils;
import org.codehaus.jackson.smile.SmileConstants;
import org.p286a.p287a.p288a.AbstractC11009c;
import p005b.p006a.p007a.p029b.p042h.p044b.AbstractC0518e;
/* JADX INFO: Access modifiers changed from: package-private */
@AbstractC11009c
/* renamed from: org.a.a.i.a.h */
/* loaded from: classes2.dex */
public final class C11158h implements NTLMEngine {

    /* renamed from: a */
    protected static final int f35880a = 1;

    /* renamed from: b */
    protected static final int f35881b = 4;

    /* renamed from: c */
    protected static final int f35882c = 16;

    /* renamed from: d */
    protected static final int f35883d = 32;

    /* renamed from: e */
    protected static final int f35884e = 128;

    /* renamed from: f */
    protected static final int f35885f = 512;

    /* renamed from: g */
    protected static final int f35886g = 4096;

    /* renamed from: h */
    protected static final int f35887h = 8192;

    /* renamed from: i */
    protected static final int f35888i = 32768;

    /* renamed from: j */
    protected static final int f35889j = 524288;

    /* renamed from: k */
    protected static final int f35890k = 33554432;

    /* renamed from: l */
    protected static final int f35891l = 8388608;

    /* renamed from: m */
    protected static final int f35892m = 536870912;

    /* renamed from: n */
    protected static final int f35893n = 1073741824;

    /* renamed from: o */
    protected static final int f35894o = Integer.MIN_VALUE;

    /* renamed from: p */
    static final String f35895p = "ASCII";

    /* renamed from: q */
    private static final SecureRandom f35896q;

    /* renamed from: s */
    private static final byte[] f35897s;

    /* renamed from: r */
    private String f35898r = f35895p;

    /* renamed from: org.a.a.i.a.h$a */
    /* loaded from: classes2.dex */
    protected static class C11159a {

        /* renamed from: a */
        protected final String f35899a;

        /* renamed from: b */
        protected final String f35900b;

        /* renamed from: c */
        protected final String f35901c;

        /* renamed from: d */
        protected final byte[] f35902d;

        /* renamed from: e */
        protected final String f35903e;

        /* renamed from: f */
        protected final byte[] f35904f;

        /* renamed from: g */
        protected byte[] f35905g;

        /* renamed from: h */
        protected byte[] f35906h;

        /* renamed from: i */
        protected byte[] f35907i;

        /* renamed from: j */
        protected byte[] f35908j;

        /* renamed from: k */
        protected byte[] f35909k;

        /* renamed from: l */
        protected byte[] f35910l;

        /* renamed from: m */
        protected byte[] f35911m;

        /* renamed from: n */
        protected byte[] f35912n;

        /* renamed from: o */
        protected byte[] f35913o;

        /* renamed from: p */
        protected byte[] f35914p;

        /* renamed from: q */
        protected byte[] f35915q;

        /* renamed from: r */
        protected byte[] f35916r;

        /* renamed from: s */
        protected byte[] f35917s;

        /* renamed from: t */
        protected byte[] f35918t;

        /* renamed from: u */
        protected byte[] f35919u;

        /* renamed from: v */
        protected byte[] f35920v;

        /* renamed from: w */
        protected byte[] f35921w;

        /* renamed from: x */
        protected byte[] f35922x;

        /* renamed from: y */
        protected byte[] f35923y;

        /* renamed from: z */
        protected byte[] f35924z;

        public C11159a(String str, String str2, String str3, byte[] bArr, String str4, byte[] bArr2) {
            this(str, str2, str3, bArr, str4, bArr2, null, null, null, null);
        }

        public C11159a(String str, String str2, String str3, byte[] bArr, String str4, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5, byte[] bArr6) {
            this.f35909k = null;
            this.f35910l = null;
            this.f35911m = null;
            this.f35912n = null;
            this.f35913o = null;
            this.f35914p = null;
            this.f35915q = null;
            this.f35916r = null;
            this.f35917s = null;
            this.f35918t = null;
            this.f35919u = null;
            this.f35920v = null;
            this.f35921w = null;
            this.f35922x = null;
            this.f35923y = null;
            this.f35924z = null;
            this.f35899a = str;
            this.f35903e = str4;
            this.f35900b = str2;
            this.f35901c = str3;
            this.f35902d = bArr;
            this.f35904f = bArr2;
            this.f35905g = bArr3;
            this.f35906h = bArr4;
            this.f35907i = bArr5;
            this.f35908j = bArr6;
        }

        /* renamed from: a */
        public byte[] m1857a() {
            if (this.f35905g == null) {
                this.f35905g = C11158h.m1870e();
            }
            return this.f35905g;
        }

        /* renamed from: b */
        public byte[] m1856b() {
            if (this.f35906h == null) {
                this.f35906h = C11158h.m1870e();
            }
            return this.f35906h;
        }

        /* renamed from: c */
        public byte[] m1855c() {
            if (this.f35907i == null) {
                this.f35907i = C11158h.m1866f();
            }
            return this.f35907i;
        }

        /* renamed from: d */
        public byte[] m1854d() {
            if (this.f35909k == null) {
                this.f35909k = C11158h.m1859i(this.f35901c);
            }
            return this.f35909k;
        }

        /* renamed from: e */
        public byte[] m1853e() {
            if (this.f35910l == null) {
                this.f35910l = C11158h.m1872d(m1854d(), this.f35902d);
            }
            return this.f35910l;
        }

        /* renamed from: f */
        public byte[] m1852f() {
            if (this.f35911m == null) {
                this.f35911m = C11158h.m1858j(this.f35901c);
            }
            return this.f35911m;
        }

        /* renamed from: g */
        public byte[] m1851g() {
            if (this.f35912n == null) {
                this.f35912n = C11158h.m1872d(m1852f(), this.f35902d);
            }
            return this.f35912n;
        }

        /* renamed from: h */
        public byte[] m1850h() {
            if (this.f35914p == null) {
                this.f35914p = C11158h.m1880c(this.f35899a, this.f35900b, m1852f());
            }
            return this.f35914p;
        }

        /* renamed from: i */
        public byte[] m1849i() {
            if (this.f35913o == null) {
                this.f35913o = C11158h.m1874d(this.f35899a, this.f35900b, m1852f());
            }
            return this.f35913o;
        }

        /* renamed from: j */
        public byte[] m1848j() {
            if (this.f35908j == null) {
                long currentTimeMillis = 10000 * (System.currentTimeMillis() + 11644473600000L);
                this.f35908j = new byte[8];
                for (int i = 0; i < 8; i++) {
                    this.f35908j[i] = (byte) currentTimeMillis;
                    currentTimeMillis >>>= 8;
                }
            }
            return this.f35908j;
        }

        /* renamed from: k */
        public byte[] m1847k() {
            if (this.f35916r == null) {
                this.f35916r = C11158h.m1867e(m1856b(), this.f35904f, m1848j());
            }
            return this.f35916r;
        }

        /* renamed from: l */
        public byte[] m1846l() {
            if (this.f35917s == null) {
                this.f35917s = C11158h.m1871d(m1849i(), this.f35902d, m1847k());
            }
            return this.f35917s;
        }

        /* renamed from: m */
        public byte[] m1845m() {
            if (this.f35915q == null) {
                this.f35915q = C11158h.m1871d(m1850h(), this.f35902d, m1857a());
            }
            return this.f35915q;
        }

        /* renamed from: n */
        public byte[] m1844n() {
            if (this.f35918t == null) {
                this.f35918t = C11158h.m1891a(m1852f(), this.f35902d, m1857a());
            }
            return this.f35918t;
        }

        /* renamed from: o */
        public byte[] m1843o() {
            if (this.f35919u == null) {
                byte[] m1857a = m1857a();
                this.f35919u = new byte[24];
                System.arraycopy(m1857a, 0, this.f35919u, 0, m1857a.length);
                Arrays.fill(this.f35919u, m1857a.length, this.f35919u.length, (byte) 0);
            }
            return this.f35919u;
        }

        /* renamed from: p */
        public byte[] m1842p() {
            if (this.f35920v == null) {
                this.f35920v = new byte[16];
                System.arraycopy(m1854d(), 0, this.f35920v, 0, 8);
                Arrays.fill(this.f35920v, 8, 16, (byte) 0);
            }
            return this.f35920v;
        }

        /* renamed from: q */
        public byte[] m1841q() {
            if (this.f35921w == null) {
                C11161c c11161c = new C11161c();
                c11161c.m1833a(m1852f());
                this.f35921w = c11161c.m1834a();
            }
            return this.f35921w;
        }

        /* renamed from: r */
        public byte[] m1840r() {
            if (this.f35922x == null) {
                byte[] m1849i = m1849i();
                byte[] bArr = new byte[16];
                System.arraycopy(m1846l(), 0, bArr, 0, 16);
                this.f35922x = C11158h.m1892a(bArr, m1849i);
            }
            return this.f35922x;
        }

        /* renamed from: s */
        public byte[] m1839s() {
            if (this.f35923y == null) {
                byte[] m1843o = m1843o();
                byte[] bArr = new byte[this.f35902d.length + m1843o.length];
                System.arraycopy(this.f35902d, 0, bArr, 0, this.f35902d.length);
                System.arraycopy(m1843o, 0, bArr, this.f35902d.length, m1843o.length);
                this.f35923y = C11158h.m1892a(bArr, m1841q());
            }
            return this.f35923y;
        }

        /* renamed from: t */
        public byte[] m1838t() {
            if (this.f35924z == null) {
                try {
                    byte[] bArr = new byte[14];
                    System.arraycopy(m1854d(), 0, bArr, 0, 8);
                    Arrays.fill(bArr, 8, bArr.length, (byte) -67);
                    Key m1860h = C11158h.m1860h(bArr, 0);
                    Key m1860h2 = C11158h.m1860h(bArr, 7);
                    byte[] bArr2 = new byte[8];
                    System.arraycopy(m1853e(), 0, bArr2, 0, bArr2.length);
                    Cipher cipher = Cipher.getInstance("DES/ECB/NoPadding");
                    cipher.init(1, m1860h);
                    byte[] doFinal = cipher.doFinal(bArr2);
                    Cipher cipher2 = Cipher.getInstance("DES/ECB/NoPadding");
                    cipher2.init(1, m1860h2);
                    byte[] doFinal2 = cipher2.doFinal(bArr2);
                    this.f35924z = new byte[16];
                    System.arraycopy(doFinal, 0, this.f35924z, 0, doFinal.length);
                    System.arraycopy(doFinal2, 0, this.f35924z, doFinal.length, doFinal2.length);
                } catch (Exception e) {
                    throw new NTLMEngineException(e.getMessage(), e);
                }
            }
            return this.f35924z;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: org.a.a.i.a.h$b */
    /* loaded from: classes2.dex */
    public static class C11160b {

        /* renamed from: a */
        protected byte[] f35925a;

        /* renamed from: b */
        protected byte[] f35926b;

        /* renamed from: c */
        protected MessageDigest f35927c;

        C11160b(byte[] bArr) {
            try {
                this.f35927c = MessageDigest.getInstance("MD5");
                this.f35925a = new byte[64];
                this.f35926b = new byte[64];
                int length = bArr.length;
                if (length > 64) {
                    this.f35927c.update(bArr);
                    bArr = this.f35927c.digest();
                    length = bArr.length;
                }
                int i = 0;
                while (i < length) {
                    this.f35925a[i] = (byte) (bArr[i] ^ 54);
                    this.f35926b[i] = (byte) (bArr[i] ^ 92);
                    i++;
                }
                for (int i2 = i; i2 < 64; i2++) {
                    this.f35925a[i2] = 54;
                    this.f35926b[i2] = 92;
                }
                this.f35927c.reset();
                this.f35927c.update(this.f35925a);
            } catch (Exception e) {
                throw new NTLMEngineException("Error getting md5 message digest implementation: " + e.getMessage(), e);
            }
        }

        /* renamed from: a */
        void m1836a(byte[] bArr) {
            this.f35927c.update(bArr);
        }

        /* renamed from: a */
        void m1835a(byte[] bArr, int i, int i2) {
            this.f35927c.update(bArr, i, i2);
        }

        /* renamed from: a */
        byte[] m1837a() {
            byte[] digest = this.f35927c.digest();
            this.f35927c.update(this.f35926b);
            return this.f35927c.digest(digest);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: org.a.a.i.a.h$c */
    /* loaded from: classes2.dex */
    public static class C11161c {

        /* renamed from: a */
        protected int f35928a = 1732584193;

        /* renamed from: b */
        protected int f35929b = -271733879;

        /* renamed from: c */
        protected int f35930c = -1732584194;

        /* renamed from: d */
        protected int f35931d = 271733878;

        /* renamed from: e */
        protected long f35932e = 0;

        /* renamed from: f */
        protected byte[] f35933f = new byte[64];

        C11161c() {
        }

        /* renamed from: a */
        void m1833a(byte[] bArr) {
            int i = (int) (this.f35932e & 63);
            int i2 = 0;
            while ((bArr.length - i2) + i >= this.f35933f.length) {
                int length = this.f35933f.length - i;
                System.arraycopy(bArr, i2, this.f35933f, i, length);
                this.f35932e += length;
                i2 += length;
                m1831b();
                i = 0;
            }
            if (i2 < bArr.length) {
                int length2 = bArr.length - i2;
                System.arraycopy(bArr, i2, this.f35933f, i, length2);
                this.f35932e += length2;
                int i3 = i + length2;
            }
        }

        /* renamed from: a */
        protected void m1832a(int[] iArr) {
            this.f35928a = C11158h.m1902a(this.f35928a + C11158h.m1901a(this.f35929b, this.f35930c, this.f35931d) + iArr[0], 3);
            this.f35931d = C11158h.m1902a(this.f35931d + C11158h.m1901a(this.f35928a, this.f35929b, this.f35930c) + iArr[1], 7);
            this.f35930c = C11158h.m1902a(this.f35930c + C11158h.m1901a(this.f35931d, this.f35928a, this.f35929b) + iArr[2], 11);
            this.f35929b = C11158h.m1902a(this.f35929b + C11158h.m1901a(this.f35930c, this.f35931d, this.f35928a) + iArr[3], 19);
            this.f35928a = C11158h.m1902a(this.f35928a + C11158h.m1901a(this.f35929b, this.f35930c, this.f35931d) + iArr[4], 3);
            this.f35931d = C11158h.m1902a(this.f35931d + C11158h.m1901a(this.f35928a, this.f35929b, this.f35930c) + iArr[5], 7);
            this.f35930c = C11158h.m1902a(this.f35930c + C11158h.m1901a(this.f35931d, this.f35928a, this.f35929b) + iArr[6], 11);
            this.f35929b = C11158h.m1902a(this.f35929b + C11158h.m1901a(this.f35930c, this.f35931d, this.f35928a) + iArr[7], 19);
            this.f35928a = C11158h.m1902a(this.f35928a + C11158h.m1901a(this.f35929b, this.f35930c, this.f35931d) + iArr[8], 3);
            this.f35931d = C11158h.m1902a(this.f35931d + C11158h.m1901a(this.f35928a, this.f35929b, this.f35930c) + iArr[9], 7);
            this.f35930c = C11158h.m1902a(this.f35930c + C11158h.m1901a(this.f35931d, this.f35928a, this.f35929b) + iArr[10], 11);
            this.f35929b = C11158h.m1902a(this.f35929b + C11158h.m1901a(this.f35930c, this.f35931d, this.f35928a) + iArr[11], 19);
            this.f35928a = C11158h.m1902a(this.f35928a + C11158h.m1901a(this.f35929b, this.f35930c, this.f35931d) + iArr[12], 3);
            this.f35931d = C11158h.m1902a(this.f35931d + C11158h.m1901a(this.f35928a, this.f35929b, this.f35930c) + iArr[13], 7);
            this.f35930c = C11158h.m1902a(this.f35930c + C11158h.m1901a(this.f35931d, this.f35928a, this.f35929b) + iArr[14], 11);
            this.f35929b = C11158h.m1902a(this.f35929b + C11158h.m1901a(this.f35930c, this.f35931d, this.f35928a) + iArr[15], 19);
        }

        /* renamed from: a */
        byte[] m1834a() {
            int i = (int) (this.f35932e & 63);
            int i2 = i < 56 ? 56 - i : 120 - i;
            byte[] bArr = new byte[i2 + 8];
            bArr[0] = Byte.MIN_VALUE;
            for (int i3 = 0; i3 < 8; i3++) {
                bArr[i2 + i3] = (byte) ((this.f35932e * 8) >>> (i3 * 8));
            }
            m1833a(bArr);
            byte[] bArr2 = new byte[16];
            C11158h.m1893a(bArr2, this.f35928a, 0);
            C11158h.m1893a(bArr2, this.f35929b, 4);
            C11158h.m1893a(bArr2, this.f35930c, 8);
            C11158h.m1893a(bArr2, this.f35931d, 12);
            return bArr2;
        }

        /* renamed from: b */
        protected void m1831b() {
            int[] iArr = new int[16];
            for (int i = 0; i < 16; i++) {
                iArr[i] = (this.f35933f[i * 4] & SmileConstants.BYTE_MARKER_END_OF_CONTENT) + ((this.f35933f[(i * 4) + 1] & SmileConstants.BYTE_MARKER_END_OF_CONTENT) << 8) + ((this.f35933f[(i * 4) + 2] & SmileConstants.BYTE_MARKER_END_OF_CONTENT) << 16) + ((this.f35933f[(i * 4) + 3] & SmileConstants.BYTE_MARKER_END_OF_CONTENT) << 24);
            }
            int i2 = this.f35928a;
            int i3 = this.f35929b;
            int i4 = this.f35930c;
            int i5 = this.f35931d;
            m1832a(iArr);
            m1830b(iArr);
            m1829c(iArr);
            this.f35928a = i2 + this.f35928a;
            this.f35929b += i3;
            this.f35930c += i4;
            this.f35931d += i5;
        }

        /* renamed from: b */
        protected void m1830b(int[] iArr) {
            this.f35928a = C11158h.m1902a(this.f35928a + C11158h.m1889b(this.f35929b, this.f35930c, this.f35931d) + iArr[0] + 1518500249, 3);
            this.f35931d = C11158h.m1902a(this.f35931d + C11158h.m1889b(this.f35928a, this.f35929b, this.f35930c) + iArr[4] + 1518500249, 5);
            this.f35930c = C11158h.m1902a(this.f35930c + C11158h.m1889b(this.f35931d, this.f35928a, this.f35929b) + iArr[8] + 1518500249, 9);
            this.f35929b = C11158h.m1902a(this.f35929b + C11158h.m1889b(this.f35930c, this.f35931d, this.f35928a) + iArr[12] + 1518500249, 13);
            this.f35928a = C11158h.m1902a(this.f35928a + C11158h.m1889b(this.f35929b, this.f35930c, this.f35931d) + iArr[1] + 1518500249, 3);
            this.f35931d = C11158h.m1902a(this.f35931d + C11158h.m1889b(this.f35928a, this.f35929b, this.f35930c) + iArr[5] + 1518500249, 5);
            this.f35930c = C11158h.m1902a(this.f35930c + C11158h.m1889b(this.f35931d, this.f35928a, this.f35929b) + iArr[9] + 1518500249, 9);
            this.f35929b = C11158h.m1902a(this.f35929b + C11158h.m1889b(this.f35930c, this.f35931d, this.f35928a) + iArr[13] + 1518500249, 13);
            this.f35928a = C11158h.m1902a(this.f35928a + C11158h.m1889b(this.f35929b, this.f35930c, this.f35931d) + iArr[2] + 1518500249, 3);
            this.f35931d = C11158h.m1902a(this.f35931d + C11158h.m1889b(this.f35928a, this.f35929b, this.f35930c) + iArr[6] + 1518500249, 5);
            this.f35930c = C11158h.m1902a(this.f35930c + C11158h.m1889b(this.f35931d, this.f35928a, this.f35929b) + iArr[10] + 1518500249, 9);
            this.f35929b = C11158h.m1902a(this.f35929b + C11158h.m1889b(this.f35930c, this.f35931d, this.f35928a) + iArr[14] + 1518500249, 13);
            this.f35928a = C11158h.m1902a(this.f35928a + C11158h.m1889b(this.f35929b, this.f35930c, this.f35931d) + iArr[3] + 1518500249, 3);
            this.f35931d = C11158h.m1902a(this.f35931d + C11158h.m1889b(this.f35928a, this.f35929b, this.f35930c) + iArr[7] + 1518500249, 5);
            this.f35930c = C11158h.m1902a(this.f35930c + C11158h.m1889b(this.f35931d, this.f35928a, this.f35929b) + iArr[11] + 1518500249, 9);
            this.f35929b = C11158h.m1902a(this.f35929b + C11158h.m1889b(this.f35930c, this.f35931d, this.f35928a) + iArr[15] + 1518500249, 13);
        }

        /* renamed from: c */
        protected void m1829c(int[] iArr) {
            this.f35928a = C11158h.m1902a(this.f35928a + C11158h.m1882c(this.f35929b, this.f35930c, this.f35931d) + iArr[0] + 1859775393, 3);
            this.f35931d = C11158h.m1902a(this.f35931d + C11158h.m1882c(this.f35928a, this.f35929b, this.f35930c) + iArr[8] + 1859775393, 9);
            this.f35930c = C11158h.m1902a(this.f35930c + C11158h.m1882c(this.f35931d, this.f35928a, this.f35929b) + iArr[4] + 1859775393, 11);
            this.f35929b = C11158h.m1902a(this.f35929b + C11158h.m1882c(this.f35930c, this.f35931d, this.f35928a) + iArr[12] + 1859775393, 15);
            this.f35928a = C11158h.m1902a(this.f35928a + C11158h.m1882c(this.f35929b, this.f35930c, this.f35931d) + iArr[2] + 1859775393, 3);
            this.f35931d = C11158h.m1902a(this.f35931d + C11158h.m1882c(this.f35928a, this.f35929b, this.f35930c) + iArr[10] + 1859775393, 9);
            this.f35930c = C11158h.m1902a(this.f35930c + C11158h.m1882c(this.f35931d, this.f35928a, this.f35929b) + iArr[6] + 1859775393, 11);
            this.f35929b = C11158h.m1902a(this.f35929b + C11158h.m1882c(this.f35930c, this.f35931d, this.f35928a) + iArr[14] + 1859775393, 15);
            this.f35928a = C11158h.m1902a(this.f35928a + C11158h.m1882c(this.f35929b, this.f35930c, this.f35931d) + iArr[1] + 1859775393, 3);
            this.f35931d = C11158h.m1902a(this.f35931d + C11158h.m1882c(this.f35928a, this.f35929b, this.f35930c) + iArr[9] + 1859775393, 9);
            this.f35930c = C11158h.m1902a(this.f35930c + C11158h.m1882c(this.f35931d, this.f35928a, this.f35929b) + iArr[5] + 1859775393, 11);
            this.f35929b = C11158h.m1902a(this.f35929b + C11158h.m1882c(this.f35930c, this.f35931d, this.f35928a) + iArr[13] + 1859775393, 15);
            this.f35928a = C11158h.m1902a(this.f35928a + C11158h.m1882c(this.f35929b, this.f35930c, this.f35931d) + iArr[3] + 1859775393, 3);
            this.f35931d = C11158h.m1902a(this.f35931d + C11158h.m1882c(this.f35928a, this.f35929b, this.f35930c) + iArr[11] + 1859775393, 9);
            this.f35930c = C11158h.m1902a(this.f35930c + C11158h.m1882c(this.f35931d, this.f35928a, this.f35929b) + iArr[7] + 1859775393, 11);
            this.f35929b = C11158h.m1902a(this.f35929b + C11158h.m1882c(this.f35930c, this.f35931d, this.f35928a) + iArr[15] + 1859775393, 15);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: org.a.a.i.a.h$d */
    /* loaded from: classes2.dex */
    public static class C11162d {

        /* renamed from: a */
        private byte[] f35934a;

        /* renamed from: b */
        private int f35935b;

        C11162d() {
            this.f35934a = null;
            this.f35935b = 0;
        }

        C11162d(String str, int i) {
            this.f35934a = null;
            this.f35935b = 0;
            this.f35934a = Base64.decode(EncodingUtils.getBytes(str, C11158h.f35895p), 2);
            if (this.f35934a.length < C11158h.f35897s.length) {
                throw new NTLMEngineException("NTLM message decoding error - packet too short");
            }
            for (int i2 = 0; i2 < C11158h.f35897s.length; i2++) {
                if (this.f35934a[i2] != C11158h.f35897s[i2]) {
                    throw new NTLMEngineException("NTLM message expected - instead got unrecognized bytes");
                }
            }
            int m1820c = m1820c(C11158h.f35897s.length);
            if (m1820c != i) {
                throw new NTLMEngineException("NTLM type " + Integer.toString(i) + " message expected - instead got type " + Integer.toString(m1820c));
            }
            this.f35935b = this.f35934a.length;
        }

        /* renamed from: a */
        protected byte m1826a(int i) {
            if (this.f35934a.length < i + 1) {
                throw new NTLMEngineException("NTLM: Message too short");
            }
            return this.f35934a[i];
        }

        /* renamed from: a */
        protected int m1828a() {
            return C11158h.f35897s.length + 4;
        }

        /* renamed from: a */
        protected void m1827a(byte b) {
            this.f35934a[this.f35935b] = b;
            this.f35935b++;
        }

        /* renamed from: a */
        protected void m1825a(int i, int i2) {
            this.f35934a = new byte[i];
            this.f35935b = 0;
            m1824a(C11158h.f35897s);
            m1817f(i2);
        }

        /* renamed from: a */
        protected void m1824a(byte[] bArr) {
            if (bArr == null) {
                return;
            }
            for (byte b : bArr) {
                this.f35934a[this.f35935b] = b;
                this.f35935b++;
            }
        }

        /* renamed from: a */
        protected void m1823a(byte[] bArr, int i) {
            if (this.f35934a.length < bArr.length + i) {
                throw new NTLMEngineException("NTLM: Message too short");
            }
            System.arraycopy(this.f35934a, i, bArr, 0, bArr.length);
        }

        /* renamed from: b */
        protected int m1822b() {
            return this.f35935b;
        }

        /* renamed from: b */
        protected int m1821b(int i) {
            return C11158h.m1864f(this.f35934a, i);
        }

        /* renamed from: c */
        protected int m1820c(int i) {
            return C11158h.m1868e(this.f35934a, i);
        }

        /* renamed from: c */
        String mo1812c() {
            byte[] bArr;
            if (this.f35934a.length > this.f35935b) {
                bArr = new byte[this.f35935b];
                System.arraycopy(this.f35934a, 0, bArr, 0, this.f35935b);
            } else {
                bArr = this.f35934a;
            }
            return EncodingUtils.getAsciiString(Base64.encode(bArr, 2));
        }

        /* renamed from: d */
        protected byte[] m1819d(int i) {
            return C11158h.m1862g(this.f35934a, i);
        }

        /* renamed from: e */
        protected void m1818e(int i) {
            m1827a((byte) (i & 255));
            m1827a((byte) ((i >> 8) & 255));
        }

        /* renamed from: f */
        protected void m1817f(int i) {
            m1827a((byte) (i & 255));
            m1827a((byte) ((i >> 8) & 255));
            m1827a((byte) ((i >> 16) & 255));
            m1827a((byte) ((i >> 24) & 255));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: org.a.a.i.a.h$e */
    /* loaded from: classes2.dex */
    public static class C11163e extends C11162d {

        /* renamed from: a */
        protected byte[] f35936a;

        /* renamed from: b */
        protected byte[] f35937b;

        C11163e(String str, String str2) {
            byte[] bArr = null;
            try {
                String m1863g = C11158h.m1863g(str2);
                String m1861h = C11158h.m1861h(str);
                this.f35936a = m1863g != null ? m1863g.getBytes(C11158h.f35895p) : null;
                this.f35937b = m1861h != null ? m1861h.toUpperCase(Locale.ENGLISH).getBytes(C11158h.f35895p) : bArr;
            } catch (UnsupportedEncodingException e) {
                throw new NTLMEngineException("Unicode unsupported: " + e.getMessage(), e);
            }
        }

        @Override // org.p286a.p287a.p306i.p307a.C11158h.C11162d
        /* renamed from: c */
        String mo1812c() {
            a(40, 1);
            f(-1576500735);
            e(0);
            e(0);
            f(40);
            e(0);
            e(0);
            f(40);
            e(261);
            f(2600);
            e(3840);
            return super.mo1812c();
        }
    }

    /* renamed from: org.a.a.i.a.h$f */
    /* loaded from: classes2.dex */
    static class C11164f extends C11162d {

        /* renamed from: b */
        protected String f35939b;

        /* renamed from: c */
        protected byte[] f35940c;

        /* renamed from: a */
        protected byte[] f35938a = new byte[8];

        /* renamed from: d */
        protected int f35941d = c(20);

        C11164f(String str) {
            super(str, 2);
            a(this.f35938a, 24);
            if ((this.f35941d & 1) == 0) {
                throw new NTLMEngineException("NTLM type 2 message has flags that make no sense: " + Integer.toString(this.f35941d));
            }
            this.f35939b = null;
            if (b() >= 20) {
                byte[] d = d(12);
                if (d.length != 0) {
                    try {
                        this.f35939b = new String(d, "UnicodeLittleUnmarked");
                    } catch (UnsupportedEncodingException e) {
                        throw new NTLMEngineException(e.getMessage(), e);
                    }
                }
            }
            this.f35940c = null;
            if (b() < 48) {
                return;
            }
            byte[] d2 = d(40);
            if (d2.length == 0) {
                return;
            }
            this.f35940c = d2;
        }

        /* renamed from: d */
        byte[] m1816d() {
            return this.f35938a;
        }

        /* renamed from: e */
        String m1815e() {
            return this.f35939b;
        }

        /* renamed from: f */
        byte[] m1814f() {
            return this.f35940c;
        }

        /* renamed from: g */
        int m1813g() {
            return this.f35941d;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: org.a.a.i.a.h$g */
    /* loaded from: classes2.dex */
    public static class C11165g extends C11162d {

        /* renamed from: a */
        protected int f35942a;

        /* renamed from: b */
        protected byte[] f35943b;

        /* renamed from: c */
        protected byte[] f35944c;

        /* renamed from: d */
        protected byte[] f35945d;

        /* renamed from: e */
        protected byte[] f35946e;

        /* renamed from: f */
        protected byte[] f35947f;

        /* renamed from: g */
        protected byte[] f35948g;

        C11165g(String str, String str2, String str3, String str4, byte[] bArr, int i, String str5, byte[] bArr2) {
            byte[] m1838t;
            byte[] bytes;
            this.f35942a = i;
            String m1863g = C11158h.m1863g(str2);
            String m1861h = C11158h.m1861h(str);
            C11159a c11159a = new C11159a(m1861h, str3, str4, bArr, str5, bArr2);
            try {
                if ((8388608 & i) != 0 && bArr2 != null && str5 != null) {
                    this.f35947f = c11159a.m1846l();
                    this.f35946e = c11159a.m1845m();
                    m1838t = (i & 128) != 0 ? c11159a.m1838t() : c11159a.m1840r();
                } else if ((524288 & i) != 0) {
                    this.f35947f = c11159a.m1844n();
                    this.f35946e = c11159a.m1843o();
                    m1838t = (i & 128) != 0 ? c11159a.m1838t() : c11159a.m1839s();
                } else {
                    this.f35947f = c11159a.m1851g();
                    this.f35946e = c11159a.m1853e();
                    m1838t = (i & 128) != 0 ? c11159a.m1838t() : c11159a.m1841q();
                }
            } catch (NTLMEngineException e) {
                this.f35947f = new byte[0];
                this.f35946e = c11159a.m1853e();
                m1838t = (i & 128) != 0 ? c11159a.m1838t() : c11159a.m1842p();
            }
            if ((i & 16) == 0) {
                this.f35948g = null;
            } else if ((C11158h.f35893n & i) != 0) {
                this.f35948g = C11158h.m1885b(c11159a.m1855c(), m1838t);
            } else {
                this.f35948g = m1838t;
            }
            if (m1863g != null) {
                try {
                    bytes = m1863g.getBytes("UnicodeLittleUnmarked");
                } catch (UnsupportedEncodingException e2) {
                    throw new NTLMEngineException("Unicode not supported: " + e2.getMessage(), e2);
                }
            } else {
                bytes = null;
            }
            this.f35944c = bytes;
            this.f35943b = m1861h != null ? m1861h.toUpperCase(Locale.ENGLISH).getBytes("UnicodeLittleUnmarked") : null;
            this.f35945d = str3.getBytes("UnicodeLittleUnmarked");
        }

        @Override // org.p286a.p287a.p306i.p307a.C11158h.C11162d
        /* renamed from: c */
        String mo1812c() {
            int i = 0;
            int length = this.f35947f.length;
            int length2 = this.f35946e.length;
            int length3 = this.f35943b != null ? this.f35943b.length : 0;
            int length4 = this.f35944c != null ? this.f35944c.length : 0;
            int length5 = this.f35945d.length;
            if (this.f35948g != null) {
                i = this.f35948g.length;
            }
            int i2 = length2 + 72;
            int i3 = i2 + length;
            int i4 = i3 + length3;
            int i5 = i4 + length5;
            int i6 = i5 + length4;
            a(i6 + i, 3);
            e(length2);
            e(length2);
            f(72);
            e(length);
            e(length);
            f(i2);
            e(length3);
            e(length3);
            f(i3);
            e(length5);
            e(length5);
            f(i4);
            e(length4);
            e(length4);
            f(i5);
            e(i);
            e(i);
            f(i6);
            f((this.f35942a & 128) | (this.f35942a & 512) | (this.f35942a & 524288) | C11158h.f35890k | (this.f35942a & 32768) | (this.f35942a & 32) | (this.f35942a & 16) | (this.f35942a & 536870912) | (this.f35942a & Integer.MIN_VALUE) | (this.f35942a & C11158h.f35893n) | (this.f35942a & 8388608) | (this.f35942a & 1) | (this.f35942a & 4));
            e(261);
            f(2600);
            e(3840);
            a(this.f35946e);
            a(this.f35947f);
            a(this.f35943b);
            a(this.f35945d);
            a(this.f35944c);
            if (this.f35948g != null) {
                a(this.f35948g);
            }
            return super.mo1812c();
        }
    }

    static {
        SecureRandom secureRandom = null;
        try {
            secureRandom = SecureRandom.getInstance(AbstractC0518e.f805d);
        } catch (Exception e) {
        }
        f35896q = secureRandom;
        byte[] bytes = EncodingUtils.getBytes("NTLMSSP", f35895p);
        f35897s = new byte[bytes.length + 1];
        System.arraycopy(bytes, 0, f35897s, 0, bytes.length);
        f35897s[bytes.length] = 0;
    }

    /* renamed from: a */
    static int m1902a(int i, int i2) {
        return (i << i2) | (i >>> (32 - i2));
    }

    /* renamed from: a */
    static int m1901a(int i, int i2, int i3) {
        return (i & i2) | ((i ^ (-1)) & i3);
    }

    /* renamed from: a */
    private static void m1895a(byte[] bArr) {
        for (int i = 0; i < bArr.length; i++) {
            byte b = bArr[i];
            if ((((b >>> 1) ^ ((((((b >>> 7) ^ (b >>> 6)) ^ (b >>> 5)) ^ (b >>> 4)) ^ (b >>> 3)) ^ (b >>> 2))) & 1) == 0) {
                bArr[i] = (byte) (bArr[i] | 1);
            } else {
                bArr[i] = (byte) (bArr[i] & (-2));
            }
        }
    }

    /* renamed from: a */
    static void m1893a(byte[] bArr, int i, int i2) {
        bArr[i2] = (byte) (i & 255);
        bArr[i2 + 1] = (byte) ((i >> 8) & 255);
        bArr[i2 + 2] = (byte) ((i >> 16) & 255);
        bArr[i2 + 3] = (byte) ((i >> 24) & 255);
    }

    /* renamed from: a */
    static byte[] m1892a(byte[] bArr, byte[] bArr2) {
        C11160b c11160b = new C11160b(bArr2);
        c11160b.m1836a(bArr);
        return c11160b.m1837a();
    }

    /* renamed from: a */
    static byte[] m1891a(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.update(bArr2);
            messageDigest.update(bArr3);
            byte[] bArr4 = new byte[8];
            System.arraycopy(messageDigest.digest(), 0, bArr4, 0, 8);
            return m1872d(bArr, bArr4);
        } catch (Exception e) {
            if (!(e instanceof NTLMEngineException)) {
                throw new NTLMEngineException(e.getMessage(), e);
            }
            throw e;
        }
    }

    /* renamed from: b */
    static int m1889b(int i, int i2, int i3) {
        return (i & i2) | (i & i3) | (i2 & i3);
    }

    /* renamed from: b */
    static byte[] m1885b(byte[] bArr, byte[] bArr2) {
        try {
            Cipher cipher = Cipher.getInstance("RC4");
            cipher.init(1, new SecretKeySpec(bArr2, "RC4"));
            return cipher.doFinal(bArr);
        } catch (Exception e) {
            throw new NTLMEngineException(e.getMessage(), e);
        }
    }

    /* renamed from: c */
    static int m1882c(int i, int i2, int i3) {
        return (i ^ i2) ^ i3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public static byte[] m1880c(String str, String str2, byte[] bArr) {
        try {
            C11160b c11160b = new C11160b(bArr);
            c11160b.m1836a(str2.toUpperCase(Locale.ENGLISH).getBytes("UnicodeLittleUnmarked"));
            if (str != null) {
                c11160b.m1836a(str.toUpperCase(Locale.ENGLISH).getBytes("UnicodeLittleUnmarked"));
            }
            return c11160b.m1837a();
        } catch (UnsupportedEncodingException e) {
            throw new NTLMEngineException("Unicode not supported! " + e.getMessage(), e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public static byte[] m1874d(String str, String str2, byte[] bArr) {
        try {
            C11160b c11160b = new C11160b(bArr);
            c11160b.m1836a(str2.toUpperCase(Locale.ENGLISH).getBytes("UnicodeLittleUnmarked"));
            if (str != null) {
                c11160b.m1836a(str.getBytes("UnicodeLittleUnmarked"));
            }
            return c11160b.m1837a();
        } catch (UnsupportedEncodingException e) {
            throw new NTLMEngineException("Unicode not supported! " + e.getMessage(), e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public static byte[] m1872d(byte[] bArr, byte[] bArr2) {
        try {
            byte[] bArr3 = new byte[21];
            System.arraycopy(bArr, 0, bArr3, 0, 16);
            Key m1860h = m1860h(bArr3, 0);
            Key m1860h2 = m1860h(bArr3, 7);
            Key m1860h3 = m1860h(bArr3, 14);
            Cipher cipher = Cipher.getInstance("DES/ECB/NoPadding");
            cipher.init(1, m1860h);
            byte[] doFinal = cipher.doFinal(bArr2);
            cipher.init(1, m1860h2);
            byte[] doFinal2 = cipher.doFinal(bArr2);
            cipher.init(1, m1860h3);
            byte[] doFinal3 = cipher.doFinal(bArr2);
            byte[] bArr4 = new byte[24];
            System.arraycopy(doFinal, 0, bArr4, 0, 8);
            System.arraycopy(doFinal2, 0, bArr4, 8, 8);
            System.arraycopy(doFinal3, 0, bArr4, 16, 8);
            return bArr4;
        } catch (Exception e) {
            throw new NTLMEngineException(e.getMessage(), e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public static byte[] m1871d(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        C11160b c11160b = new C11160b(bArr);
        c11160b.m1836a(bArr2);
        c11160b.m1836a(bArr3);
        byte[] m1837a = c11160b.m1837a();
        byte[] bArr4 = new byte[m1837a.length + bArr3.length];
        System.arraycopy(m1837a, 0, bArr4, 0, m1837a.length);
        System.arraycopy(bArr3, 0, bArr4, m1837a.length, bArr3.length);
        return bArr4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e */
    public static int m1868e(byte[] bArr, int i) {
        if (bArr.length < i + 4) {
            throw new NTLMEngineException("NTLM authentication - buffer too small for DWORD");
        }
        return (bArr[i] & SmileConstants.BYTE_MARKER_END_OF_CONTENT) | ((bArr[i + 1] & SmileConstants.BYTE_MARKER_END_OF_CONTENT) << 8) | ((bArr[i + 2] & SmileConstants.BYTE_MARKER_END_OF_CONTENT) << 16) | ((bArr[i + 3] & SmileConstants.BYTE_MARKER_END_OF_CONTENT) << 24);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e */
    public static byte[] m1870e() {
        if (f35896q == null) {
            throw new NTLMEngineException("Random generator not available");
        }
        byte[] bArr = new byte[8];
        synchronized (f35896q) {
            f35896q.nextBytes(bArr);
        }
        return bArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e */
    public static byte[] m1867e(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        byte[] bArr4 = {1, 1, 0, 0};
        byte[] bArr5 = {0, 0, 0, 0};
        byte[] bArr6 = {0, 0, 0, 0};
        byte[] bArr7 = {0, 0, 0, 0};
        byte[] bArr8 = new byte[bArr4.length + bArr5.length + bArr3.length + 8 + bArr6.length + bArr2.length + bArr7.length];
        System.arraycopy(bArr4, 0, bArr8, 0, bArr4.length);
        int length = bArr4.length + 0;
        System.arraycopy(bArr5, 0, bArr8, length, bArr5.length);
        int length2 = length + bArr5.length;
        System.arraycopy(bArr3, 0, bArr8, length2, bArr3.length);
        int length3 = length2 + bArr3.length;
        System.arraycopy(bArr, 0, bArr8, length3, 8);
        int i = length3 + 8;
        System.arraycopy(bArr6, 0, bArr8, i, bArr6.length);
        int length4 = i + bArr6.length;
        System.arraycopy(bArr2, 0, bArr8, length4, bArr2.length);
        int length5 = length4 + bArr2.length;
        System.arraycopy(bArr7, 0, bArr8, length5, bArr7.length);
        int length6 = length5 + bArr7.length;
        return bArr8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f */
    public static int m1864f(byte[] bArr, int i) {
        if (bArr.length < i + 2) {
            throw new NTLMEngineException("NTLM authentication - buffer too small for WORD");
        }
        return (bArr[i] & SmileConstants.BYTE_MARKER_END_OF_CONTENT) | ((bArr[i + 1] & SmileConstants.BYTE_MARKER_END_OF_CONTENT) << 8);
    }

    /* renamed from: f */
    private static String m1865f(String str) {
        if (str == null) {
            return null;
        }
        int indexOf = str.indexOf(".");
        return indexOf != -1 ? str.substring(0, indexOf) : str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f */
    public static byte[] m1866f() {
        if (f35896q == null) {
            throw new NTLMEngineException("Random generator not available");
        }
        byte[] bArr = new byte[16];
        synchronized (f35896q) {
            f35896q.nextBytes(bArr);
        }
        return bArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g */
    public static String m1863g(String str) {
        return m1865f(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g */
    public static byte[] m1862g(byte[] bArr, int i) {
        int m1864f = m1864f(bArr, i);
        int m1868e = m1868e(bArr, i + 4);
        if (bArr.length < m1868e + m1864f) {
            throw new NTLMEngineException("NTLM authentication - buffer too small for data item");
        }
        byte[] bArr2 = new byte[m1864f];
        System.arraycopy(bArr, m1868e, bArr2, 0, m1864f);
        return bArr2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h */
    public static String m1861h(String str) {
        return m1865f(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h */
    public static Key m1860h(byte[] bArr, int i) {
        byte[] bArr2 = new byte[7];
        System.arraycopy(bArr, i, bArr2, 0, 7);
        byte[] bArr3 = {bArr2[0], (byte) ((bArr2[0] << 7) | ((bArr2[1] & SmileConstants.BYTE_MARKER_END_OF_CONTENT) >>> 1)), (byte) ((bArr2[1] << 6) | ((bArr2[2] & SmileConstants.BYTE_MARKER_END_OF_CONTENT) >>> 2)), (byte) ((bArr2[2] << 5) | ((bArr2[3] & SmileConstants.BYTE_MARKER_END_OF_CONTENT) >>> 3)), (byte) ((bArr2[3] << 4) | ((bArr2[4] & SmileConstants.BYTE_MARKER_END_OF_CONTENT) >>> 4)), (byte) ((bArr2[4] << 3) | ((bArr2[5] & SmileConstants.BYTE_MARKER_END_OF_CONTENT) >>> 5)), (byte) ((bArr2[5] << 2) | ((bArr2[6] & SmileConstants.BYTE_MARKER_END_OF_CONTENT) >>> 6)), (byte) (bArr2[6] << 1)};
        m1895a(bArr3);
        return new SecretKeySpec(bArr3, "DES");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i */
    public static byte[] m1859i(String str) {
        try {
            byte[] bytes = str.toUpperCase(Locale.ENGLISH).getBytes("US-ASCII");
            byte[] bArr = new byte[14];
            System.arraycopy(bytes, 0, bArr, 0, Math.min(bytes.length, 14));
            Key m1860h = m1860h(bArr, 0);
            Key m1860h2 = m1860h(bArr, 7);
            byte[] bytes2 = "KGS!@#$%".getBytes("US-ASCII");
            Cipher cipher = Cipher.getInstance("DES/ECB/NoPadding");
            cipher.init(1, m1860h);
            byte[] doFinal = cipher.doFinal(bytes2);
            cipher.init(1, m1860h2);
            byte[] doFinal2 = cipher.doFinal(bytes2);
            byte[] bArr2 = new byte[16];
            System.arraycopy(doFinal, 0, bArr2, 0, 8);
            System.arraycopy(doFinal2, 0, bArr2, 8, 8);
            return bArr2;
        } catch (Exception e) {
            throw new NTLMEngineException(e.getMessage(), e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: j */
    public static byte[] m1858j(String str) {
        try {
            byte[] bytes = str.getBytes("UnicodeLittleUnmarked");
            C11161c c11161c = new C11161c();
            c11161c.m1833a(bytes);
            return c11161c.m1834a();
        } catch (UnsupportedEncodingException e) {
            throw new NTLMEngineException("Unicode not supported: " + e.getMessage(), e);
        }
    }

    /* renamed from: a */
    String m1903a() {
        return this.f35898r;
    }

    /* renamed from: a */
    String m1899a(String str, String str2) {
        return new C11163e(str2, str).mo1812c();
    }

    /* renamed from: a */
    final String m1898a(String str, String str2, String str3, String str4, String str5) {
        if (str == null || str.trim().equals("")) {
            return m1899a(str4, str5);
        }
        C11164f c11164f = new C11164f(str);
        return m1897a(str2, str3, str4, str5, c11164f.m1816d(), c11164f.m1813g(), c11164f.m1815e(), c11164f.m1814f());
    }

    /* renamed from: a */
    String m1897a(String str, String str2, String str3, String str4, byte[] bArr, int i, String str5, byte[] bArr2) {
        return new C11165g(str4, str3, str, str2, bArr, i, str5, bArr2).mo1812c();
    }

    /* renamed from: a */
    void m1900a(String str) {
        this.f35898r = str;
    }

    public String generateType1Msg(String str, String str2) {
        return m1899a(str2, str);
    }

    public String generateType3Msg(String str, String str2, String str3, String str4, String str5) {
        C11164f c11164f = new C11164f(str5);
        return m1897a(str, str2, str4, str3, c11164f.m1816d(), c11164f.m1813g(), c11164f.m1815e(), c11164f.m1814f());
    }
}
