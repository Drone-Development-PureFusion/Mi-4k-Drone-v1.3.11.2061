package p005b.p006a.p007a.p059c.p060a.p061a.p062a.p063a;

import android.content.res.XmlResourceParser;
import android.util.TypedValue;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.xmlpull.v1.XmlPullParserException;
import p005b.p006a.p007a.p059c.p060a.p061a.C0728a;
import p005b.p006a.p007a.p059c.p060a.p061a.p062a.p064b.C0733a;
import p005b.p006a.p007a.p059c.p060a.p066c.C0736b;
import p005b.p006a.p007a.p059c.p067b.p068a.p069a.C0737a;
/* renamed from: b.a.a.c.a.a.a.a.a  reason: invalid class name */
/* loaded from: classes.dex */
public class resXmlResourceParserC0729a implements XmlResourceParser {

    /* renamed from: A */
    private static final int f1331A = 1048832;

    /* renamed from: B */
    private static final int f1332B = 1048832;

    /* renamed from: C */
    private static final int f1333C = 1048833;

    /* renamed from: D */
    private static final int f1334D = 1048834;

    /* renamed from: E */
    private static final int f1335E = 1048835;

    /* renamed from: F */
    private static final int f1336F = 1048836;

    /* renamed from: G */
    private static final int f1337G = 1048836;

    /* renamed from: q */
    private static final Logger f1338q = Logger.getLogger(resXmlResourceParserC0729a.class.getName());

    /* renamed from: r */
    private static final String f1339r = "Method is not supported.";

    /* renamed from: s */
    private static final int f1340s = 0;

    /* renamed from: t */
    private static final int f1341t = 1;

    /* renamed from: u */
    private static final int f1342u = 2;

    /* renamed from: v */
    private static final int f1343v = 3;

    /* renamed from: w */
    private static final int f1344w = 4;

    /* renamed from: x */
    private static final int f1345x = 5;

    /* renamed from: y */
    private static final int f1346y = 524291;

    /* renamed from: z */
    private static final int f1347z = 524672;

    /* renamed from: a */
    private C0736b f1348a;

    /* renamed from: b */
    private C0731b f1349b;

    /* renamed from: c */
    private C0728a f1350c;

    /* renamed from: d */
    private boolean f1351d;

    /* renamed from: e */
    private C0732c f1352e;

    /* renamed from: f */
    private int[] f1353f;

    /* renamed from: g */
    private C0730a f1354g;

    /* renamed from: h */
    private boolean f1355h;

    /* renamed from: i */
    private int f1356i;

    /* renamed from: j */
    private int f1357j;

    /* renamed from: k */
    private int f1358k;

    /* renamed from: l */
    private int f1359l;

    /* renamed from: m */
    private int[] f1360m;

    /* renamed from: n */
    private int f1361n;

    /* renamed from: o */
    private int f1362o;

    /* renamed from: p */
    private int f1363p;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b.a.a.c.a.a.a.a.a$a */
    /* loaded from: classes.dex */
    public static final class C0730a {

        /* renamed from: a */
        private int[] f1364a = new int[32];

        /* renamed from: b */
        private int f1365b;

        /* renamed from: c */
        private int f1366c;

        /* renamed from: d */
        private int f1367d;

        /* renamed from: a */
        private final int m38340a(int i, boolean z) {
            if (this.f1365b == 0) {
                return -1;
            }
            int i2 = this.f1365b - 1;
            for (int i3 = this.f1367d; i3 != 0; i3--) {
                i2 -= 2;
                for (int i4 = this.f1364a[i2]; i4 != 0; i4--) {
                    if (z) {
                        if (this.f1364a[i2] == i) {
                            return this.f1364a[i2 + 1];
                        }
                    } else if (this.f1364a[i2 + 1] == i) {
                        return this.f1364a[i2];
                    }
                    i2 -= 2;
                }
            }
            return -1;
        }

        /* renamed from: b */
        private final int m38336b(int i, boolean z) {
            if (this.f1365b == 0 || i < 0) {
                return -1;
            }
            int i2 = 0;
            for (int i3 = this.f1367d; i3 != 0; i3--) {
                int i4 = this.f1364a[i2];
                if (i < i4) {
                    int i5 = (i * 2) + 1 + i2;
                    if (!z) {
                        i5++;
                    }
                    return this.f1364a[i5];
                }
                i -= i4;
                i2 += (i4 * 2) + 2;
            }
            return -1;
        }

        /* renamed from: f */
        private void m38328f(int i) {
            int length = this.f1364a.length - this.f1365b;
            if (length > i) {
                return;
            }
            int[] iArr = new int[(length + this.f1364a.length) * 2];
            System.arraycopy(this.f1364a, 0, iArr, 0, this.f1365b);
            this.f1364a = iArr;
        }

        /* renamed from: a */
        public final int m38342a(int i) {
            int i2 = 0;
            if (this.f1365b != 0 && i >= 0) {
                if (i > this.f1367d) {
                    i = this.f1367d;
                }
                int i3 = 0;
                while (i != 0) {
                    int i4 = this.f1364a[i3];
                    i--;
                    i3 = (i4 * 2) + 2 + i3;
                    i2 += i4;
                }
            }
            return i2;
        }

        /* renamed from: a */
        public final void m38343a() {
            this.f1365b = 0;
            this.f1366c = 0;
            this.f1367d = 0;
        }

        /* renamed from: a */
        public final void m38341a(int i, int i2) {
            if (this.f1367d == 0) {
                m38329f();
            }
            m38328f(2);
            int i3 = this.f1365b - 1;
            int i4 = this.f1364a[i3];
            this.f1364a[(i3 - 1) - (i4 * 2)] = i4 + 1;
            this.f1364a[i3] = i;
            this.f1364a[i3 + 1] = i2;
            this.f1364a[i3 + 2] = i4 + 1;
            this.f1365b += 2;
            this.f1366c++;
        }

        /* renamed from: b */
        public final int m38339b() {
            return this.f1366c;
        }

        /* renamed from: b */
        public final int m38338b(int i) {
            return m38336b(i, true);
        }

        /* renamed from: b */
        public final boolean m38337b(int i, int i2) {
            if (this.f1365b == 0) {
                return false;
            }
            int i3 = this.f1365b - 1;
            int i4 = this.f1364a[i3];
            int i5 = i3 - 2;
            int i6 = 0;
            while (i6 != i4) {
                if (this.f1364a[i5] == i && this.f1364a[i5 + 1] == i2) {
                    int i7 = i4 - 1;
                    if (i6 == 0) {
                        this.f1364a[i5] = i7;
                        this.f1364a[i5 - ((i7 * 2) + 1)] = i7;
                    } else {
                        this.f1364a[i3] = i7;
                        this.f1364a[i3 - ((i7 * 2) + 3)] = i7;
                        System.arraycopy(this.f1364a, i5 + 2, this.f1364a, i5, this.f1365b - i5);
                    }
                    this.f1365b -= 2;
                    this.f1366c--;
                    return true;
                }
                i6++;
                i5 -= 2;
            }
            return false;
        }

        /* renamed from: c */
        public final int m38335c() {
            if (this.f1365b == 0) {
                return 0;
            }
            return this.f1364a[this.f1365b - 1];
        }

        /* renamed from: c */
        public final int m38334c(int i) {
            return m38336b(i, false);
        }

        /* renamed from: d */
        public final int m38332d(int i) {
            return m38340a(i, false);
        }

        /* renamed from: d */
        public final boolean m38333d() {
            int i;
            int i2;
            if (this.f1365b == 0 || (i2 = this.f1364a[this.f1365b - 1]) == 0) {
                return false;
            }
            int i3 = i2 - 1;
            int i4 = i - 2;
            this.f1364a[i4] = i3;
            this.f1364a[i4 - ((i3 * 2) + 1)] = i3;
            this.f1365b -= 2;
            this.f1366c--;
            return true;
        }

        /* renamed from: e */
        public final int m38331e() {
            return this.f1367d;
        }

        /* renamed from: e */
        public final int m38330e(int i) {
            return m38340a(i, true);
        }

        /* renamed from: f */
        public final void m38329f() {
            m38328f(2);
            int i = this.f1365b;
            this.f1364a[i] = 0;
            this.f1364a[i + 1] = 0;
            this.f1365b += 2;
            this.f1367d++;
        }

        /* renamed from: g */
        public final void m38327g() {
            if (this.f1365b == 0) {
                return;
            }
            int i = this.f1365b - 1;
            int i2 = this.f1364a[i];
            if ((i - 1) - (i2 * 2) == 0) {
                return;
            }
            this.f1365b -= (i2 * 2) + 2;
            this.f1366c -= i2;
            this.f1367d--;
        }
    }

    public resXmlResourceParserC0729a() {
        this.f1349b = new C0731b();
        this.f1351d = false;
        this.f1354g = new C0730a();
        m38345d();
    }

    public resXmlResourceParserC0729a(InputStream inputStream) {
        this();
        m38351a(inputStream);
    }

    /* renamed from: a */
    private final int m38350a(String str, String str2) {
        int m38321a;
        if (this.f1352e == null || str2 == null || (m38321a = this.f1352e.m38321a(str2)) == -1) {
            return -1;
        }
        int m38321a2 = str != null ? this.f1352e.m38321a(str) : -1;
        for (int i = 0; i != this.f1360m.length; i++) {
            if (m38321a == this.f1360m[i + 1] && (m38321a2 == -1 || m38321a2 == this.f1360m[i + 0])) {
                return i / 5;
            }
        }
        return -1;
    }

    /* renamed from: a */
    private void m38352a(C0728a c0728a) {
        if (this.f1350c == null) {
            this.f1350c = c0728a;
        }
    }

    /* renamed from: c */
    private final int m38346c(int i) {
        if (this.f1356i != 2) {
            throw new IndexOutOfBoundsException("Current event is not START_TAG.");
        }
        int i2 = i * 5;
        if (i2 < this.f1360m.length) {
            return i2;
        }
        throw new IndexOutOfBoundsException("Invalid attribute index (" + i + ").");
    }

    /* renamed from: d */
    private final void m38345d() {
        this.f1356i = -1;
        this.f1357j = -1;
        this.f1358k = -1;
        this.f1359l = -1;
        this.f1360m = null;
        this.f1361n = -1;
        this.f1362o = -1;
        this.f1363p = -1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:72:0x00c1, code lost:
        throw new java.io.IOException("Invalid chunk type (" + r1 + ").");
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0087, code lost:
        throw new java.io.IOException("Invalid resource ids size (" + r1 + ").");
     */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void m38344e() {
        if (this.f1352e == null) {
            this.f1348a.m38301b(f1346y);
            this.f1348a.m38306a();
            this.f1352e = C0732c.m38322a(this.f1348a);
            this.f1354g.m38329f();
            this.f1351d = true;
        }
        if (this.f1356i == 1) {
            return;
        }
        int i = this.f1356i;
        m38345d();
        while (true) {
            if (this.f1355h) {
                this.f1355h = false;
                this.f1354g.m38327g();
            }
            if (i == 3 && this.f1354g.m38331e() == 1 && this.f1354g.m38335c() == 0) {
                this.f1356i = 1;
                return;
            }
            int readInt = i == 0 ? f1334D : this.f1348a.readInt();
            if (readInt == f1347z) {
                int readInt2 = this.f1348a.readInt();
                if (readInt2 < 8 || readInt2 % 4 != 0) {
                    break;
                }
                this.f1353f = this.f1348a.m38304a((readInt2 / 4) - 2);
            } else if (readInt < 1048832 || readInt > 1048836) {
                break;
            } else if (readInt == f1334D && i == -1) {
                this.f1356i = 0;
                return;
            } else {
                this.f1348a.m38306a();
                int readInt3 = this.f1348a.readInt();
                this.f1348a.m38306a();
                if (readInt != 1048832 && readInt != f1333C) {
                    this.f1357j = readInt3;
                    if (readInt == f1334D) {
                        this.f1359l = this.f1348a.readInt();
                        this.f1358k = this.f1348a.readInt();
                        this.f1348a.m38306a();
                        int readInt4 = this.f1348a.readInt();
                        this.f1361n = (readInt4 >>> 16) - 1;
                        this.f1362o = this.f1348a.readInt();
                        this.f1363p = (this.f1362o >>> 16) - 1;
                        this.f1362o = (this.f1362o & 65535) - 1;
                        this.f1360m = this.f1348a.m38304a((readInt4 & 65535) * 5);
                        for (int i2 = 3; i2 < this.f1360m.length; i2 += 5) {
                            this.f1360m[i2] = this.f1360m[i2] >>> 24;
                        }
                        this.f1354g.m38329f();
                        this.f1356i = 2;
                        return;
                    } else if (readInt == f1335E) {
                        this.f1359l = this.f1348a.readInt();
                        this.f1358k = this.f1348a.readInt();
                        this.f1356i = 3;
                        this.f1355h = true;
                        return;
                    } else if (readInt == 1048836) {
                        this.f1358k = this.f1348a.readInt();
                        this.f1348a.m38306a();
                        this.f1348a.m38306a();
                        this.f1356i = 4;
                        return;
                    }
                } else if (readInt == 1048832) {
                    this.f1354g.m38341a(this.f1348a.readInt(), this.f1348a.readInt());
                } else {
                    this.f1348a.m38306a();
                    this.f1348a.m38306a();
                    this.f1354g.m38333d();
                }
            }
        }
    }

    /* renamed from: a */
    public int m38354a(int i) {
        return this.f1360m[m38346c(i) + 3];
    }

    /* renamed from: a */
    public C0728a m38355a() {
        return this.f1350c;
    }

    /* renamed from: a */
    public void m38353a(C0731b c0731b) {
        this.f1349b = c0731b;
    }

    /* renamed from: a */
    public void m38351a(InputStream inputStream) {
        close();
        if (inputStream != null) {
            this.f1348a = new C0736b(new C0737a(inputStream));
        }
    }

    /* renamed from: b */
    public int m38348b(int i) {
        return this.f1360m[m38346c(i) + 4];
    }

    /* renamed from: b */
    public C0731b m38349b() {
        return this.f1349b;
    }

    /* renamed from: c */
    final C0732c m38347c() {
        return this.f1352e;
    }

    @Override // android.content.res.XmlResourceParser, java.lang.AutoCloseable
    public void close() {
        if (!this.f1351d) {
            return;
        }
        this.f1351d = false;
        this.f1348a = null;
        this.f1352e = null;
        this.f1353f = null;
        this.f1354g.m38343a();
        m38345d();
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public void defineEntityReplacementText(String str, String str2) {
        throw new XmlPullParserException(f1339r);
    }

    @Override // android.util.AttributeSet
    public boolean getAttributeBooleanValue(int i, boolean z) {
        return getAttributeIntValue(i, z ? 1 : 0) != 0;
    }

    @Override // android.util.AttributeSet
    public boolean getAttributeBooleanValue(String str, String str2, boolean z) {
        int m38350a = m38350a(str, str2);
        return m38350a == -1 ? z : getAttributeBooleanValue(m38350a, z);
    }

    @Override // org.xmlpull.v1.XmlPullParser, android.util.AttributeSet
    public int getAttributeCount() {
        if (this.f1356i != 2) {
            return -1;
        }
        return this.f1360m.length / 5;
    }

    @Override // android.util.AttributeSet
    public float getAttributeFloatValue(int i, float f) {
        int m38346c = m38346c(i);
        return this.f1360m[m38346c + 3] == 4 ? Float.intBitsToFloat(this.f1360m[m38346c + 4]) : f;
    }

    @Override // android.util.AttributeSet
    public float getAttributeFloatValue(String str, String str2, float f) {
        int m38350a = m38350a(str, str2);
        return m38350a == -1 ? f : getAttributeFloatValue(m38350a, f);
    }

    @Override // android.util.AttributeSet
    public int getAttributeIntValue(int i, int i2) {
        int m38346c = m38346c(i);
        int i3 = this.f1360m[m38346c + 3];
        return (i3 < 16 || i3 > 31) ? i2 : this.f1360m[m38346c + 4];
    }

    @Override // android.util.AttributeSet
    public int getAttributeIntValue(String str, String str2, int i) {
        int m38350a = m38350a(str, str2);
        return m38350a == -1 ? i : getAttributeIntValue(m38350a, i);
    }

    @Override // android.util.AttributeSet
    public int getAttributeListValue(int i, String[] strArr, int i2) {
        return 0;
    }

    @Override // android.util.AttributeSet
    public int getAttributeListValue(String str, String str2, String[] strArr, int i) {
        return 0;
    }

    @Override // org.xmlpull.v1.XmlPullParser, android.util.AttributeSet
    public String getAttributeName(int i) {
        int i2 = this.f1360m[m38346c(i) + 1];
        return i2 == -1 ? "" : this.f1352e.m38324a(i2);
    }

    @Override // android.util.AttributeSet
    public int getAttributeNameResource(int i) {
        int i2 = this.f1360m[m38346c(i) + 1];
        if (this.f1353f == null || i2 < 0 || i2 >= this.f1353f.length) {
            return 0;
        }
        return this.f1353f[i2];
    }

    @Override // android.content.res.XmlResourceParser, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet
    public String getAttributeNamespace(int i) {
        int i2 = this.f1360m[m38346c(i) + 0];
        return i2 == -1 ? "" : this.f1352e.m38324a(i2);
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public String getAttributePrefix(int i) {
        int m38332d = this.f1354g.m38332d(this.f1360m[m38346c(i) + 0]);
        return m38332d == -1 ? "" : this.f1352e.m38324a(m38332d);
    }

    @Override // android.util.AttributeSet
    public int getAttributeResourceValue(int i, int i2) {
        int m38346c = m38346c(i);
        return this.f1360m[m38346c + 3] == 1 ? this.f1360m[m38346c + 4] : i2;
    }

    @Override // android.util.AttributeSet
    public int getAttributeResourceValue(String str, String str2, int i) {
        int m38350a = m38350a(str, str2);
        return m38350a == -1 ? i : getAttributeResourceValue(m38350a, i);
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public String getAttributeType(int i) {
        return "CDATA";
    }

    @Override // android.util.AttributeSet
    public int getAttributeUnsignedIntValue(int i, int i2) {
        return getAttributeIntValue(i, i2);
    }

    @Override // android.util.AttributeSet
    public int getAttributeUnsignedIntValue(String str, String str2, int i) {
        int m38350a = m38350a(str, str2);
        return m38350a == -1 ? i : getAttributeUnsignedIntValue(m38350a, i);
    }

    @Override // org.xmlpull.v1.XmlPullParser, android.util.AttributeSet
    public String getAttributeValue(int i) {
        int m38346c = m38346c(i);
        int i2 = this.f1360m[m38346c + 3];
        int i3 = this.f1360m[m38346c + 4];
        int i4 = this.f1360m[m38346c + 2];
        if (this.f1349b != null) {
            try {
                return this.f1349b.m38326a(i2, i3, i4 == -1 ? null : C0733a.m38312a(this.f1352e.m38324a(i4)), getAttributeNameResource(i));
            } catch (C0728a e) {
                m38352a(e);
                f1338q.log(Level.WARNING, String.format("Could not decode attr value, using undecoded value instead: ns=%s, name=%s, value=0x%08x", getAttributePrefix(i), getAttributeName(i), Integer.valueOf(i3)), (Throwable) e);
            }
        }
        return TypedValue.coerceToString(i2, i3);
    }

    @Override // org.xmlpull.v1.XmlPullParser, android.util.AttributeSet
    public String getAttributeValue(String str, String str2) {
        int m38350a = m38350a(str, str2);
        if (m38350a == -1) {
            return null;
        }
        return getAttributeValue(m38350a);
    }

    @Override // android.util.AttributeSet
    public String getClassAttribute() {
        if (this.f1362o == -1) {
            return null;
        }
        return this.f1352e.m38324a(this.f1360m[m38346c(this.f1362o) + 2]);
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public int getColumnNumber() {
        return -1;
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public int getDepth() {
        return this.f1354g.m38331e() - 1;
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public int getEventType() {
        return this.f1356i;
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public boolean getFeature(String str) {
        return false;
    }

    @Override // android.util.AttributeSet
    public String getIdAttribute() {
        if (this.f1361n == -1) {
            return null;
        }
        return this.f1352e.m38324a(this.f1360m[m38346c(this.f1361n) + 2]);
    }

    @Override // android.util.AttributeSet
    public int getIdAttributeResourceValue(int i) {
        if (this.f1361n == -1) {
            return i;
        }
        int m38346c = m38346c(this.f1361n);
        return this.f1360m[m38346c + 3] == 1 ? this.f1360m[m38346c + 4] : i;
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public String getInputEncoding() {
        return null;
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public int getLineNumber() {
        return this.f1357j;
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public String getName() {
        if (this.f1358k == -1 || !(this.f1356i == 2 || this.f1356i == 3)) {
            return null;
        }
        return this.f1352e.m38324a(this.f1358k);
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public String getNamespace() {
        return this.f1352e.m38324a(this.f1359l);
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public String getNamespace(String str) {
        throw new RuntimeException(f1339r);
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public int getNamespaceCount(int i) {
        return this.f1354g.m38342a(i);
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public String getNamespacePrefix(int i) {
        return this.f1352e.m38324a(this.f1354g.m38338b(i));
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public String getNamespaceUri(int i) {
        return this.f1352e.m38324a(this.f1354g.m38334c(i));
    }

    @Override // org.xmlpull.v1.XmlPullParser, android.util.AttributeSet
    public String getPositionDescription() {
        return "XML line #" + getLineNumber();
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public String getPrefix() {
        return this.f1352e.m38324a(this.f1354g.m38332d(this.f1359l));
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public Object getProperty(String str) {
        return null;
    }

    @Override // android.util.AttributeSet
    public int getStyleAttribute() {
        if (this.f1363p == -1) {
            return 0;
        }
        return this.f1360m[m38346c(this.f1363p) + 4];
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public String getText() {
        if (this.f1358k == -1 || this.f1356i != 4) {
            return null;
        }
        return this.f1352e.m38324a(this.f1358k);
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public char[] getTextCharacters(int[] iArr) {
        String text = getText();
        if (text == null) {
            return null;
        }
        iArr[0] = 0;
        iArr[1] = text.length();
        char[] cArr = new char[text.length()];
        text.getChars(0, text.length(), cArr, 0);
        return cArr;
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public boolean isAttributeDefault(int i) {
        return false;
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public boolean isEmptyElementTag() {
        return false;
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public boolean isWhitespace() {
        return false;
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public int next() {
        if (this.f1348a == null) {
            throw new XmlPullParserException("Parser is not opened.", this, null);
        }
        try {
            m38344e();
            return this.f1356i;
        } catch (IOException e) {
            close();
            throw e;
        }
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public int nextTag() {
        int next = next();
        if (next == 4 && isWhitespace()) {
            next = next();
        }
        if (next == 2 || next == 3) {
            return next;
        }
        throw new XmlPullParserException("Expected start or end tag.", this, null);
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public String nextText() {
        if (getEventType() != 2) {
            throw new XmlPullParserException("Parser must be on START_TAG to read next text.", this, null);
        }
        int next = next();
        if (next != 4) {
            if (next != 3) {
                throw new XmlPullParserException("Parser must be on START_TAG or TEXT to read text.", this, null);
            }
            return "";
        }
        String text = getText();
        if (next() == 3) {
            return text;
        }
        throw new XmlPullParserException("Event TEXT must be immediately followed by END_TAG.", this, null);
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public int nextToken() {
        return next();
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public void require(int i, String str, String str2) {
        if (i != getEventType() || ((str != null && !str.equals(getNamespace())) || (str2 != null && !str2.equals(getName())))) {
            throw new XmlPullParserException(TYPES[i] + " is expected.", this, null);
        }
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public void setFeature(String str, boolean z) {
        throw new XmlPullParserException(f1339r);
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public void setInput(InputStream inputStream, String str) {
        m38351a(inputStream);
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public void setInput(Reader reader) {
        throw new XmlPullParserException(f1339r);
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public void setProperty(String str, Object obj) {
        throw new XmlPullParserException(f1339r);
    }
}
