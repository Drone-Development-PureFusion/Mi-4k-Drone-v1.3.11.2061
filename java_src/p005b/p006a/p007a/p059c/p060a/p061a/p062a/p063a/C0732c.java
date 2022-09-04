package p005b.p006a.p007a.p059c.p060a.p061a.p062a.p063a;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.codehaus.jackson.smile.SmileConstants;
import org.p286a.p287a.p299f.p302c.C11125l;
import p005b.p006a.p007a.p059c.p060a.p061a.p062a.p064b.C0733a;
import p005b.p006a.p007a.p059c.p060a.p066c.C0736b;
/* renamed from: b.a.a.c.a.a.a.a.c */
/* loaded from: classes.dex */
public class C0732c {

    /* renamed from: f */
    private static final CharsetDecoder f1368f = Charset.forName("UTF-16LE").newDecoder();

    /* renamed from: g */
    private static final CharsetDecoder f1369g = Charset.forName("UTF-8").newDecoder();

    /* renamed from: h */
    private static final Logger f1370h = Logger.getLogger(C0732c.class.getName());

    /* renamed from: i */
    private static final int f1371i = 1835009;

    /* renamed from: j */
    private static final int f1372j = 256;

    /* renamed from: a */
    private int[] f1373a;

    /* renamed from: b */
    private byte[] f1374b;

    /* renamed from: c */
    private int[] f1375c;

    /* renamed from: d */
    private int[] f1376d;

    /* renamed from: e */
    private boolean f1377e;

    private C0732c() {
    }

    /* renamed from: a */
    private static final int m38319a(byte[] bArr, int i) {
        return ((bArr[i + 1] & SmileConstants.BYTE_MARKER_END_OF_CONTENT) << 8) | (bArr[i] & SmileConstants.BYTE_MARKER_END_OF_CONTENT);
    }

    /* renamed from: a */
    private static final int m38318a(int[] iArr, int i) {
        int i2 = iArr[i / 4];
        return (i % 4) / 2 == 0 ? i2 & 65535 : i2 >>> 16;
    }

    /* renamed from: a */
    public static C0732c m38322a(C0736b c0736b) {
        c0736b.m38301b(f1371i);
        int readInt = c0736b.readInt();
        int readInt2 = c0736b.readInt();
        int readInt3 = c0736b.readInt();
        int readInt4 = c0736b.readInt();
        int readInt5 = c0736b.readInt();
        int readInt6 = c0736b.readInt();
        C0732c c0732c = new C0732c();
        c0732c.f1377e = (readInt4 & 256) != 0;
        c0732c.f1373a = c0736b.m38304a(readInt2);
        if (readInt3 != 0) {
            c0732c.f1375c = c0736b.m38304a(readInt3);
        }
        int i = (readInt6 == 0 ? readInt : readInt6) - readInt5;
        if (i % 4 != 0) {
            throw new IOException("String data size is not multiple of 4 (" + i + ").");
        }
        c0732c.f1374b = new byte[i];
        c0736b.readFully(c0732c.f1374b);
        if (readInt6 != 0) {
            int i2 = readInt - readInt6;
            if (i2 % 4 != 0) {
                throw new IOException("Style data size is not multiple of 4 (" + i2 + ").");
            }
            c0732c.f1376d = c0736b.m38304a(i2 / 4);
        }
        return c0732c;
    }

    /* renamed from: a */
    private String m38323a(int i, int i2) {
        String str = null;
        try {
            str = (this.f1377e ? f1369g : f1368f).decode(ByteBuffer.wrap(this.f1374b, i, i2)).toString();
            return str;
        } catch (CharacterCodingException e) {
            f1370h.log(Level.WARNING, str, (Throwable) e);
            return str;
        }
    }

    /* renamed from: a */
    private void m38320a(String str, StringBuilder sb, boolean z) {
        String substring;
        sb.append('<');
        if (z) {
            sb.append('/');
        }
        int indexOf = str.indexOf(59);
        if (indexOf == -1) {
            sb.append(str);
        } else {
            sb.append(str.substring(0, indexOf));
            if (!z) {
                boolean z2 = true;
                while (z2) {
                    int indexOf2 = str.indexOf(61, indexOf + 1);
                    sb.append(C11125l.f35805c).append(str.substring(indexOf + 1, indexOf2)).append("=\"");
                    int indexOf3 = str.indexOf(59, indexOf2 + 1);
                    if (indexOf3 != -1) {
                        substring = str.substring(indexOf2 + 1, indexOf3);
                    } else {
                        substring = str.substring(indexOf2 + 1);
                        z2 = false;
                    }
                    sb.append(C0733a.m38312a(substring)).append('\"');
                    indexOf = indexOf3;
                }
            }
        }
        sb.append('>');
    }

    /* renamed from: b */
    private static final int[] m38316b(byte[] bArr, int i) {
        byte b = bArr[i];
        boolean z = (b & 128) != 0;
        int i2 = b & Byte.MAX_VALUE;
        return !z ? new int[]{i2, 1} : new int[]{(i2 << 8) | (bArr[i + 1] & SmileConstants.BYTE_MARKER_END_OF_CONTENT), 2};
    }

    /* renamed from: d */
    private int[] m38314d(int i) {
        int i2 = 0;
        if (this.f1375c == null || this.f1376d == null || i >= this.f1375c.length) {
            return null;
        }
        int i3 = this.f1375c[i] / 4;
        int i4 = 0;
        for (int i5 = i3; i5 < this.f1376d.length && this.f1376d[i5] != -1; i5++) {
            i4++;
        }
        if (i4 == 0 || i4 % 3 != 0) {
            return null;
        }
        int[] iArr = new int[i4];
        while (i3 < this.f1376d.length && this.f1376d[i3] != -1) {
            iArr[i2] = this.f1376d[i3];
            i2++;
            i3++;
        }
        return iArr;
    }

    /* renamed from: a */
    public int m38325a() {
        if (this.f1373a != null) {
            return this.f1373a.length;
        }
        return 0;
    }

    /* renamed from: a */
    public int m38321a(String str) {
        if (str == null) {
            return -1;
        }
        for (int i = 0; i != this.f1373a.length; i++) {
            int i2 = this.f1373a[i];
            int m38319a = m38319a(this.f1374b, i2);
            if (m38319a == str.length()) {
                int i3 = i2;
                int i4 = 0;
                while (i4 != m38319a) {
                    i3 += 2;
                    if (str.charAt(i4) != m38319a(this.f1374b, i3)) {
                        break;
                    }
                    i4++;
                }
                if (i4 == m38319a) {
                    return i;
                }
            }
        }
        return -1;
    }

    /* renamed from: a */
    public String m38324a(int i) {
        int i2;
        int i3;
        if (i < 0 || this.f1373a == null || i >= this.f1373a.length) {
            return null;
        }
        int i4 = this.f1373a[i];
        if (!this.f1377e) {
            i3 = m38319a(this.f1374b, i4) * 2;
            i2 = i4 + 2;
        } else {
            int i5 = m38316b(this.f1374b, i4)[1] + i4;
            int[] m38316b = m38316b(this.f1374b, i5);
            i2 = m38316b[1] + i5;
            i3 = m38316b[0];
        }
        return m38323a(i2, i3);
    }

    /* renamed from: b */
    public CharSequence m38317b(int i) {
        return m38324a(i);
    }

    /* renamed from: c */
    public String m38315c(int i) {
        String m38324a = m38324a(i);
        if (m38324a == null) {
            return m38324a;
        }
        int[] m38314d = m38314d(i);
        if (m38314d == null) {
            return C0733a.m38312a(m38324a);
        }
        StringBuilder sb = new StringBuilder(m38324a.length() + 32);
        int[] iArr = new int[m38314d.length / 3];
        int i2 = 0;
        int i3 = 0;
        while (true) {
            int i4 = -1;
            for (int i5 = 0; i5 != m38314d.length; i5 += 3) {
                if (m38314d[i5 + 1] != -1 && (i4 == -1 || m38314d[i4 + 1] > m38314d[i5 + 1])) {
                    i4 = i5;
                }
            }
            int length = i4 != -1 ? m38314d[i4 + 1] : m38324a.length();
            int i6 = i2 - 1;
            int i7 = i3;
            int i8 = i6;
            while (i8 >= 0) {
                int i9 = iArr[i8];
                int i10 = m38314d[i9 + 2];
                if (i10 >= length) {
                    break;
                }
                if (i7 <= i10) {
                    sb.append(C0733a.m38312a(m38324a.substring(i7, i10 + 1)));
                    i7 = i10 + 1;
                }
                m38320a(m38324a(m38314d[i9]), sb, true);
                i8--;
            }
            int i11 = i8 + 1;
            if (i7 < length) {
                sb.append(C0733a.m38312a(m38324a.substring(i7, length)));
                i3 = length;
            } else {
                i3 = i7;
            }
            if (i4 == -1) {
                return sb.toString();
            }
            m38320a(m38324a(m38314d[i4]), sb, false);
            m38314d[i4 + 1] = -1;
            i2 = i11 + 1;
            iArr[i11] = i4;
        }
    }
}
