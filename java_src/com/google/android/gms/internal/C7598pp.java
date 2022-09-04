package com.google.android.gms.internal;

import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.Reader;
import org.codehaus.jackson.org.objectweb.asm.Opcodes;
import org.p286a.p287a.p299f.p302c.C11125l;
import p005b.p006a.p007a.p029b.C0494h;
import p005b.p006a.p007a.p029b.p036g.p037a.AbstractC0437d;
/* renamed from: com.google.android.gms.internal.pp */
/* loaded from: classes2.dex */
public class C7598pp implements Closeable {

    /* renamed from: a */
    private static final char[] f25162a = ")]}'\n".toCharArray();

    /* renamed from: b */
    private final Reader f25163b;

    /* renamed from: j */
    private long f25171j;

    /* renamed from: k */
    private int f25172k;

    /* renamed from: l */
    private String f25173l;

    /* renamed from: n */
    private int f25175n;

    /* renamed from: c */
    private boolean f25164c = false;

    /* renamed from: d */
    private final char[] f25165d = new char[1024];

    /* renamed from: e */
    private int f25166e = 0;

    /* renamed from: f */
    private int f25167f = 0;

    /* renamed from: g */
    private int f25168g = 0;

    /* renamed from: h */
    private int f25169h = 0;

    /* renamed from: i */
    private int f25170i = 0;

    /* renamed from: m */
    private int[] f25174m = new int[32];

    /* renamed from: o */
    private String[] f25176o = new String[32];

    /* renamed from: p */
    private int[] f25177p = new int[32];

    static {
        AbstractC7515ou.f25011a = new AbstractC7515ou() { // from class: com.google.android.gms.internal.pp.1
            @Override // com.google.android.gms.internal.AbstractC7515ou
            /* renamed from: a */
            public void mo14125a(C7598pp c7598pp) {
                if (c7598pp instanceof C7544pf) {
                    ((C7544pf) c7598pp).m14258o();
                    return;
                }
                int i = c7598pp.f25170i;
                if (i == 0) {
                    i = c7598pp.m14137o();
                }
                if (i == 13) {
                    c7598pp.f25170i = 9;
                } else if (i == 12) {
                    c7598pp.f25170i = 8;
                } else if (i == 14) {
                    c7598pp.f25170i = 10;
                } else {
                    String valueOf = String.valueOf(c7598pp.mo14146f());
                    int m14130v = c7598pp.m14130v();
                    int m14129w = c7598pp.m14129w();
                    String m14135q = c7598pp.m14135q();
                    throw new IllegalStateException(new StringBuilder(String.valueOf(valueOf).length() + 70 + String.valueOf(m14135q).length()).append("Expected a name but was ").append(valueOf).append(" ").append(" at line ").append(m14130v).append(" column ").append(m14129w).append(" path ").append(m14135q).toString());
                }
            }
        };
    }

    public C7598pp(Reader reader) {
        this.f25175n = 0;
        int[] iArr = this.f25174m;
        int i = this.f25175n;
        this.f25175n = i + 1;
        iArr[i] = 6;
        if (reader == null) {
            throw new NullPointerException("in == null");
        }
        this.f25163b = reader;
    }

    /* renamed from: A */
    private void m14166A() {
        m14153b(true);
        this.f25166e--;
        if (this.f25166e + f25162a.length <= this.f25167f || m14156b(f25162a.length)) {
            for (int i = 0; i < f25162a.length; i++) {
                if (this.f25165d[this.f25166e + i] != f25162a[i]) {
                    return;
                }
            }
            this.f25166e += f25162a.length;
        }
    }

    /* renamed from: a */
    private void m14163a(int i) {
        if (this.f25175n == this.f25174m.length) {
            int[] iArr = new int[this.f25175n * 2];
            int[] iArr2 = new int[this.f25175n * 2];
            String[] strArr = new String[this.f25175n * 2];
            System.arraycopy(this.f25174m, 0, iArr, 0, this.f25175n);
            System.arraycopy(this.f25177p, 0, iArr2, 0, this.f25175n);
            System.arraycopy(this.f25176o, 0, strArr, 0, this.f25175n);
            this.f25174m = iArr;
            this.f25177p = iArr2;
            this.f25176o = strArr;
        }
        int[] iArr3 = this.f25174m;
        int i2 = this.f25175n;
        this.f25175n = i2 + 1;
        iArr3[i2] = i;
    }

    /* renamed from: a */
    private boolean m14164a(char c) {
        switch (c) {
            case '\t':
            case '\n':
            case '\f':
            case '\r':
            case ' ':
            case ',':
            case ':':
            case '[':
            case ']':
            case Opcodes.LSHR /* 123 */:
            case '}':
                break;
            default:
                return true;
            case '#':
            case '/':
            case ';':
            case '=':
            case '\\':
                m14128x();
                break;
        }
        return false;
    }

    /* renamed from: a */
    private boolean m14160a(String str) {
        while (true) {
            if (this.f25166e + str.length() <= this.f25167f || m14156b(str.length())) {
                if (this.f25165d[this.f25166e] != '\n') {
                    for (int i = 0; i < str.length(); i++) {
                        if (this.f25165d[this.f25166e + i] == str.charAt(i)) {
                        }
                    }
                    return true;
                }
                this.f25168g++;
                this.f25169h = this.f25166e + 1;
                this.f25166e++;
            } else {
                return false;
            }
        }
    }

    /* renamed from: b */
    private int m14153b(boolean z) {
        char[] cArr = this.f25165d;
        int i = this.f25166e;
        int i2 = this.f25167f;
        while (true) {
            if (i == i2) {
                this.f25166e = i;
                if (!m14156b(1)) {
                    if (!z) {
                        return -1;
                    }
                    String valueOf = String.valueOf("End of input at line ");
                    throw new EOFException(new StringBuilder(String.valueOf(valueOf).length() + 30).append(valueOf).append(m14130v()).append(" column ").append(m14129w()).toString());
                }
                i = this.f25166e;
                i2 = this.f25167f;
            }
            int i3 = i + 1;
            char c = cArr[i];
            if (c == '\n') {
                this.f25168g++;
                this.f25169h = i3;
                i = i3;
            } else if (c == ' ' || c == '\r') {
                i = i3;
            } else if (c == '\t') {
                i = i3;
            } else if (c == '/') {
                this.f25166e = i3;
                if (i3 == i2) {
                    this.f25166e--;
                    boolean m14156b = m14156b(2);
                    this.f25166e++;
                    if (!m14156b) {
                        return c;
                    }
                }
                m14128x();
                switch (cArr[this.f25166e]) {
                    case '*':
                        this.f25166e++;
                        if (!m14160a("*/")) {
                            throw m14154b("Unterminated comment");
                        }
                        i = this.f25166e + 2;
                        i2 = this.f25167f;
                        continue;
                    case '/':
                        this.f25166e++;
                        m14127y();
                        i = this.f25166e;
                        i2 = this.f25167f;
                        continue;
                    default:
                        return c;
                }
            } else if (c != '#') {
                this.f25166e = i3;
                return c;
            } else {
                this.f25166e = i3;
                m14128x();
                m14127y();
                i = this.f25166e;
                i2 = this.f25167f;
            }
        }
    }

    /* renamed from: b */
    private IOException m14154b(String str) {
        int m14130v = m14130v();
        int m14129w = m14129w();
        String m14135q = m14135q();
        throw new C7603pt(new StringBuilder(String.valueOf(str).length() + 45 + String.valueOf(m14135q).length()).append(str).append(" at line ").append(m14130v).append(" column ").append(m14129w).append(" path ").append(m14135q).toString());
    }

    /* renamed from: b */
    private String m14157b(char c) {
        char[] cArr = this.f25165d;
        StringBuilder sb = new StringBuilder();
        do {
            int i = this.f25166e;
            int i2 = this.f25167f;
            int i3 = i;
            while (i3 < i2) {
                int i4 = i3 + 1;
                char c2 = cArr[i3];
                if (c2 == c) {
                    this.f25166e = i4;
                    sb.append(cArr, i, (i4 - i) - 1);
                    return sb.toString();
                }
                if (c2 == '\\') {
                    this.f25166e = i4;
                    sb.append(cArr, i, (i4 - i) - 1);
                    sb.append(m14126z());
                    i = this.f25166e;
                    i2 = this.f25167f;
                    i4 = i;
                } else if (c2 == '\n') {
                    this.f25168g++;
                    this.f25169h = i4;
                }
                i3 = i4;
            }
            sb.append(cArr, i, i3 - i);
            this.f25166e = i3;
        } while (m14156b(1));
        throw m14154b("Unterminated string");
    }

    /* renamed from: b */
    private boolean m14156b(int i) {
        char[] cArr = this.f25165d;
        this.f25169h -= this.f25166e;
        if (this.f25167f != this.f25166e) {
            this.f25167f -= this.f25166e;
            System.arraycopy(cArr, this.f25166e, cArr, 0, this.f25167f);
        } else {
            this.f25167f = 0;
        }
        this.f25166e = 0;
        do {
            int read = this.f25163b.read(cArr, this.f25167f, cArr.length - this.f25167f);
            if (read == -1) {
                return false;
            }
            this.f25167f = read + this.f25167f;
            if (this.f25168g == 0 && this.f25169h == 0 && this.f25167f > 0 && cArr[0] == 65279) {
                this.f25166e++;
                this.f25169h++;
                i++;
            }
        } while (this.f25167f < i);
        return true;
    }

    /* renamed from: c */
    private void m14151c(char c) {
        char[] cArr = this.f25165d;
        do {
            int i = this.f25166e;
            int i2 = this.f25167f;
            int i3 = i;
            while (i3 < i2) {
                int i4 = i3 + 1;
                char c2 = cArr[i3];
                if (c2 == c) {
                    this.f25166e = i4;
                    return;
                }
                if (c2 == '\\') {
                    this.f25166e = i4;
                    m14126z();
                    i4 = this.f25166e;
                    i2 = this.f25167f;
                } else if (c2 == '\n') {
                    this.f25168g++;
                    this.f25169h = i4;
                }
                i3 = i4;
            }
            this.f25166e = i3;
        } while (m14156b(1));
        throw m14154b("Unterminated string");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: o */
    public int m14137o() {
        int i = this.f25174m[this.f25175n - 1];
        if (i == 1) {
            this.f25174m[this.f25175n - 1] = 2;
        } else if (i == 2) {
            switch (m14153b(true)) {
                case 44:
                    break;
                case 59:
                    m14128x();
                    break;
                case 93:
                    this.f25170i = 4;
                    return 4;
                default:
                    throw m14154b("Unterminated array");
            }
        } else if (i == 3 || i == 5) {
            this.f25174m[this.f25175n - 1] = 4;
            if (i == 5) {
                switch (m14153b(true)) {
                    case 44:
                        break;
                    case 59:
                        m14128x();
                        break;
                    case 125:
                        this.f25170i = 2;
                        return 2;
                    default:
                        throw m14154b("Unterminated object");
                }
            }
            int m14153b = m14153b(true);
            switch (m14153b) {
                case 34:
                    this.f25170i = 13;
                    return 13;
                case 39:
                    m14128x();
                    this.f25170i = 12;
                    return 12;
                case 125:
                    if (i == 5) {
                        throw m14154b("Expected name");
                    }
                    this.f25170i = 2;
                    return 2;
                default:
                    m14128x();
                    this.f25166e--;
                    if (!m14164a((char) m14153b)) {
                        throw m14154b("Expected name");
                    }
                    this.f25170i = 14;
                    return 14;
            }
        } else if (i == 4) {
            this.f25174m[this.f25175n - 1] = 5;
            switch (m14153b(true)) {
                case 58:
                    break;
                case 59:
                case 60:
                default:
                    throw m14154b("Expected ':'");
                case 61:
                    m14128x();
                    if ((this.f25166e < this.f25167f || m14156b(1)) && this.f25165d[this.f25166e] == '>') {
                        this.f25166e++;
                        break;
                    }
                    break;
            }
        } else if (i == 6) {
            if (this.f25164c) {
                m14166A();
            }
            this.f25174m[this.f25175n - 1] = 7;
        } else if (i == 7) {
            if (m14153b(false) == -1) {
                this.f25170i = 17;
                return 17;
            }
            m14128x();
            this.f25166e--;
        } else if (i == 8) {
            throw new IllegalStateException("JsonReader is closed");
        }
        switch (m14153b(true)) {
            case 34:
                if (this.f25175n == 1) {
                    m14128x();
                }
                this.f25170i = 9;
                return 9;
            case 39:
                m14128x();
                this.f25170i = 8;
                return 8;
            case 44:
            case 59:
                break;
            case 91:
                this.f25170i = 3;
                return 3;
            case 93:
                if (i == 1) {
                    this.f25170i = 4;
                    return 4;
                }
                break;
            case Opcodes.LSHR /* 123 */:
                this.f25170i = 1;
                return 1;
            default:
                this.f25166e--;
                if (this.f25175n == 1) {
                    m14128x();
                }
                int m14134r = m14134r();
                if (m14134r != 0) {
                    return m14134r;
                }
                int m14133s = m14133s();
                if (m14133s != 0) {
                    return m14133s;
                }
                if (!m14164a(this.f25165d[this.f25166e])) {
                    throw m14154b("Expected value");
                }
                m14128x();
                this.f25170i = 10;
                return 10;
        }
        if (i == 1 || i == 2) {
            m14128x();
            this.f25166e--;
            this.f25170i = 7;
            return 7;
        }
        throw m14154b("Unexpected value");
    }

    /* renamed from: r */
    private int m14134r() {
        String str;
        String str2;
        int i;
        char c = this.f25165d[this.f25166e];
        if (c == 't' || c == 'T') {
            str = "true";
            str2 = "TRUE";
            i = 5;
        } else if (c == 'f' || c == 'F') {
            str = "false";
            str2 = "FALSE";
            i = 6;
        } else if (c != 'n' && c != 'N') {
            return 0;
        } else {
            str = "null";
            str2 = AbstractC0437d.f576k;
            i = 7;
        }
        int length = str.length();
        for (int i2 = 1; i2 < length; i2++) {
            if (this.f25166e + i2 >= this.f25167f && !m14156b(i2 + 1)) {
                return 0;
            }
            char c2 = this.f25165d[this.f25166e + i2];
            if (c2 != str.charAt(i2) && c2 != str2.charAt(i2)) {
                return 0;
            }
        }
        if ((this.f25166e + length < this.f25167f || m14156b(length + 1)) && m14164a(this.f25165d[this.f25166e + length])) {
            return 0;
        }
        this.f25166e += length;
        this.f25170i = i;
        return i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0021, code lost:
        if (r3 != 2) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0023, code lost:
        if (r4 == false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0029, code lost:
        if (r6 != Long.MIN_VALUE) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x002b, code lost:
        if (r5 == false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002d, code lost:
        if (r5 == false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x002f, code lost:
        r15.f25171j = r6;
        r15.f25166e += r10;
        r15.f25170i = 15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:?, code lost:
        return 15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00dc, code lost:
        r6 = -r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00e0, code lost:
        if (r3 == 2) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00e3, code lost:
        if (r3 == 4) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00e6, code lost:
        if (r3 != 7) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00f0, code lost:
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00e8, code lost:
        r15.f25172k = r10;
        r15.f25170i = 16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:?, code lost:
        return 16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0052, code lost:
        if (m14164a(r2) == false) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0054, code lost:
        return 0;
     */
    /* renamed from: s */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private int m14133s() {
        char c;
        boolean z;
        boolean z2;
        char[] cArr = this.f25165d;
        int i = this.f25166e;
        long j = 0;
        boolean z3 = false;
        boolean z4 = true;
        char c2 = 0;
        int i2 = 0;
        int i3 = this.f25167f;
        int i4 = i;
        while (true) {
            if (i4 + i2 == i3) {
                if (i2 == cArr.length) {
                    return 0;
                }
                if (m14156b(i2 + 1)) {
                    i4 = this.f25166e;
                    i3 = this.f25167f;
                }
            }
            char c3 = cArr[i4 + i2];
            switch (c3) {
                case '+':
                    if (c2 != 5) {
                        return 0;
                    }
                    c = 6;
                    z = z4;
                    z2 = z3;
                    break;
                case '-':
                    if (c2 == 0) {
                        c = 1;
                        boolean z5 = z4;
                        z2 = true;
                        z = z5;
                        break;
                    } else if (c2 != 5) {
                        return 0;
                    } else {
                        c = 6;
                        z = z4;
                        z2 = z3;
                        break;
                    }
                case '.':
                    if (c2 != 2) {
                        return 0;
                    }
                    c = 3;
                    z = z4;
                    z2 = z3;
                    break;
                case 'E':
                case 'e':
                    if (c2 != 2 && c2 != 4) {
                        return 0;
                    }
                    c = 5;
                    z = z4;
                    z2 = z3;
                    break;
                    break;
                default:
                    if (c3 >= '0' && c3 <= '9') {
                        if (c2 != 1 && c2 != 0) {
                            if (c2 != 2) {
                                if (c2 != 3) {
                                    if (c2 != 5 && c2 != 6) {
                                        c = c2;
                                        z = z4;
                                        z2 = z3;
                                        break;
                                    } else {
                                        c = 7;
                                        z = z4;
                                        z2 = z3;
                                        break;
                                    }
                                } else {
                                    c = 4;
                                    z = z4;
                                    z2 = z3;
                                    break;
                                }
                            } else if (j != 0) {
                                long j2 = (10 * j) - (c3 - '0');
                                boolean z6 = (j > -922337203685477580L || (j == -922337203685477580L && j2 < j)) & z4;
                                z2 = z3;
                                j = j2;
                                char c4 = c2;
                                z = z6;
                                c = c4;
                                break;
                            } else {
                                return 0;
                            }
                        } else {
                            j = -(c3 - '0');
                            c = 2;
                            z = z4;
                            z2 = z3;
                            break;
                        }
                    }
                    break;
            }
            i2++;
            z3 = z2;
            z4 = z;
            c2 = c;
        }
    }

    /* renamed from: t */
    private String m14132t() {
        String sb;
        StringBuilder sb2 = null;
        int i = 0;
        while (true) {
            if (this.f25166e + i < this.f25167f) {
                switch (this.f25165d[this.f25166e + i]) {
                    case '\t':
                    case '\n':
                    case '\f':
                    case '\r':
                    case ' ':
                    case ',':
                    case ':':
                    case '[':
                    case ']':
                    case Opcodes.LSHR /* 123 */:
                    case '}':
                        break;
                    case '#':
                    case '/':
                    case ';':
                    case '=':
                    case '\\':
                        m14128x();
                        break;
                    default:
                        i++;
                }
            } else if (i >= this.f25165d.length) {
                if (sb2 == null) {
                    sb2 = new StringBuilder();
                }
                sb2.append(this.f25165d, this.f25166e, i);
                this.f25166e = i + this.f25166e;
                if (!m14156b(1)) {
                    i = 0;
                } else {
                    i = 0;
                }
            } else if (m14156b(i + 1)) {
            }
        }
        if (sb2 == null) {
            sb = new String(this.f25165d, this.f25166e, i);
        } else {
            sb2.append(this.f25165d, this.f25166e, i);
            sb = sb2.toString();
        }
        this.f25166e = i + this.f25166e;
        return sb;
    }

    /* renamed from: u */
    private void m14131u() {
        do {
            int i = 0;
            while (this.f25166e + i < this.f25167f) {
                switch (this.f25165d[this.f25166e + i]) {
                    case '\t':
                    case '\n':
                    case '\f':
                    case '\r':
                    case ' ':
                    case ',':
                    case ':':
                    case '[':
                    case ']':
                    case Opcodes.LSHR /* 123 */:
                    case '}':
                        this.f25166e = i + this.f25166e;
                        return;
                    case '#':
                    case '/':
                    case ';':
                    case '=':
                    case '\\':
                        m14128x();
                        this.f25166e = i + this.f25166e;
                        return;
                    default:
                        i++;
                }
            }
            this.f25166e = i + this.f25166e;
        } while (m14156b(1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: v */
    public int m14130v() {
        return this.f25168g + 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: w */
    public int m14129w() {
        return (this.f25166e - this.f25169h) + 1;
    }

    /* renamed from: x */
    private void m14128x() {
        if (!this.f25164c) {
            throw m14154b("Use JsonReader.setLenient(true) to accept malformed JSON");
        }
    }

    /* renamed from: y */
    private void m14127y() {
        char c;
        do {
            if (this.f25166e >= this.f25167f && !m14156b(1)) {
                return;
            }
            char[] cArr = this.f25165d;
            int i = this.f25166e;
            this.f25166e = i + 1;
            c = cArr[i];
            if (c == '\n') {
                this.f25168g++;
                this.f25169h = this.f25166e;
                return;
            }
        } while (c != '\r');
    }

    /* renamed from: z */
    private char m14126z() {
        int i;
        if (this.f25166e != this.f25167f || m14156b(1)) {
            char[] cArr = this.f25165d;
            int i2 = this.f25166e;
            this.f25166e = i2 + 1;
            char c = cArr[i2];
            switch (c) {
                case '\n':
                    this.f25168g++;
                    this.f25169h = this.f25166e;
                    return c;
                case 'b':
                    return '\b';
                case 'f':
                    return '\f';
                case 'n':
                    return '\n';
                case 'r':
                    return C11125l.f35803a;
                case Opcodes.INEG /* 116 */:
                    return '\t';
                case Opcodes.LNEG /* 117 */:
                    if (this.f25166e + 4 > this.f25167f && !m14156b(4)) {
                        throw m14154b("Unterminated escape sequence");
                    }
                    int i3 = this.f25166e;
                    int i4 = i3 + 4;
                    char c2 = 0;
                    for (int i5 = i3; i5 < i4; i5++) {
                        char c3 = this.f25165d[i5];
                        char c4 = (char) (c2 << 4);
                        if (c3 >= '0' && c3 <= '9') {
                            i = c3 - '0';
                        } else if (c3 >= 'a' && c3 <= 'f') {
                            i = (c3 - 'a') + 10;
                        } else if (c3 < 'A' || c3 > 'F') {
                            String valueOf = String.valueOf(new String(this.f25165d, this.f25166e, 4));
                            throw new NumberFormatException(valueOf.length() != 0 ? "\\u".concat(valueOf) : new String("\\u"));
                        } else {
                            i = (c3 - 'A') + 10;
                        }
                        c2 = (char) (c4 + i);
                    }
                    this.f25166e += 4;
                    return c2;
                default:
                    return c;
            }
        }
        throw m14154b("Unterminated escape sequence");
    }

    /* renamed from: a */
    public void mo14165a() {
        int i = this.f25170i;
        if (i == 0) {
            i = m14137o();
        }
        if (i == 3) {
            m14163a(1);
            this.f25177p[this.f25175n - 1] = 0;
            this.f25170i = 0;
            return;
        }
        String valueOf = String.valueOf(mo14146f());
        int m14130v = m14130v();
        int m14129w = m14129w();
        String m14135q = m14135q();
        throw new IllegalStateException(new StringBuilder(String.valueOf(valueOf).length() + 74 + String.valueOf(m14135q).length()).append("Expected BEGIN_ARRAY but was ").append(valueOf).append(" at line ").append(m14130v).append(" column ").append(m14129w).append(" path ").append(m14135q).toString());
    }

    /* renamed from: a */
    public final void m14159a(boolean z) {
        this.f25164c = z;
    }

    /* renamed from: b */
    public void mo14158b() {
        int i = this.f25170i;
        if (i == 0) {
            i = m14137o();
        }
        if (i != 4) {
            String valueOf = String.valueOf(mo14146f());
            int m14130v = m14130v();
            int m14129w = m14129w();
            String m14135q = m14135q();
            throw new IllegalStateException(new StringBuilder(String.valueOf(valueOf).length() + 72 + String.valueOf(m14135q).length()).append("Expected END_ARRAY but was ").append(valueOf).append(" at line ").append(m14130v).append(" column ").append(m14129w).append(" path ").append(m14135q).toString());
        }
        this.f25175n--;
        int[] iArr = this.f25177p;
        int i2 = this.f25175n - 1;
        iArr[i2] = iArr[i2] + 1;
        this.f25170i = 0;
    }

    /* renamed from: c */
    public void mo14152c() {
        int i = this.f25170i;
        if (i == 0) {
            i = m14137o();
        }
        if (i == 1) {
            m14163a(3);
            this.f25170i = 0;
            return;
        }
        String valueOf = String.valueOf(mo14146f());
        int m14130v = m14130v();
        int m14129w = m14129w();
        String m14135q = m14135q();
        throw new IllegalStateException(new StringBuilder(String.valueOf(valueOf).length() + 75 + String.valueOf(m14135q).length()).append("Expected BEGIN_OBJECT but was ").append(valueOf).append(" at line ").append(m14130v).append(" column ").append(m14129w).append(" path ").append(m14135q).toString());
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f25170i = 0;
        this.f25174m[0] = 8;
        this.f25175n = 1;
        this.f25163b.close();
    }

    /* renamed from: d */
    public void mo14149d() {
        int i = this.f25170i;
        if (i == 0) {
            i = m14137o();
        }
        if (i != 2) {
            String valueOf = String.valueOf(mo14146f());
            int m14130v = m14130v();
            int m14129w = m14129w();
            String m14135q = m14135q();
            throw new IllegalStateException(new StringBuilder(String.valueOf(valueOf).length() + 73 + String.valueOf(m14135q).length()).append("Expected END_OBJECT but was ").append(valueOf).append(" at line ").append(m14130v).append(" column ").append(m14129w).append(" path ").append(m14135q).toString());
        }
        this.f25175n--;
        this.f25176o[this.f25175n] = null;
        int[] iArr = this.f25177p;
        int i2 = this.f25175n - 1;
        iArr[i2] = iArr[i2] + 1;
        this.f25170i = 0;
    }

    /* renamed from: e */
    public boolean mo14147e() {
        int i = this.f25170i;
        if (i == 0) {
            i = m14137o();
        }
        return (i == 2 || i == 4) ? false : true;
    }

    /* renamed from: f */
    public EnumC7600pq mo14146f() {
        int i = this.f25170i;
        if (i == 0) {
            i = m14137o();
        }
        switch (i) {
            case 1:
                return EnumC7600pq.BEGIN_OBJECT;
            case 2:
                return EnumC7600pq.END_OBJECT;
            case 3:
                return EnumC7600pq.BEGIN_ARRAY;
            case 4:
                return EnumC7600pq.END_ARRAY;
            case 5:
            case 6:
                return EnumC7600pq.BOOLEAN;
            case 7:
                return EnumC7600pq.NULL;
            case 8:
            case 9:
            case 10:
            case 11:
                return EnumC7600pq.STRING;
            case 12:
            case 13:
            case 14:
                return EnumC7600pq.NAME;
            case 15:
            case 16:
                return EnumC7600pq.NUMBER;
            case 17:
                return EnumC7600pq.END_DOCUMENT;
            default:
                throw new AssertionError();
        }
    }

    /* renamed from: g */
    public String mo14145g() {
        String m14157b;
        int i = this.f25170i;
        if (i == 0) {
            i = m14137o();
        }
        if (i == 14) {
            m14157b = m14132t();
        } else if (i == 12) {
            m14157b = m14157b(C0494h.f738z);
        } else if (i != 13) {
            String valueOf = String.valueOf(mo14146f());
            int m14130v = m14130v();
            int m14129w = m14129w();
            String m14135q = m14135q();
            throw new IllegalStateException(new StringBuilder(String.valueOf(valueOf).length() + 69 + String.valueOf(m14135q).length()).append("Expected a name but was ").append(valueOf).append(" at line ").append(m14130v).append(" column ").append(m14129w).append(" path ").append(m14135q).toString());
        } else {
            m14157b = m14157b('\"');
        }
        this.f25170i = 0;
        this.f25176o[this.f25175n - 1] = m14157b;
        return m14157b;
    }

    /* renamed from: h */
    public String mo14144h() {
        String str;
        int i = this.f25170i;
        if (i == 0) {
            i = m14137o();
        }
        if (i == 10) {
            str = m14132t();
        } else if (i == 8) {
            str = m14157b(C0494h.f738z);
        } else if (i == 9) {
            str = m14157b('\"');
        } else if (i == 11) {
            str = this.f25173l;
            this.f25173l = null;
        } else if (i == 15) {
            str = Long.toString(this.f25171j);
        } else if (i != 16) {
            String valueOf = String.valueOf(mo14146f());
            int m14130v = m14130v();
            int m14129w = m14129w();
            String m14135q = m14135q();
            throw new IllegalStateException(new StringBuilder(String.valueOf(valueOf).length() + 71 + String.valueOf(m14135q).length()).append("Expected a string but was ").append(valueOf).append(" at line ").append(m14130v).append(" column ").append(m14129w).append(" path ").append(m14135q).toString());
        } else {
            str = new String(this.f25165d, this.f25166e, this.f25172k);
            this.f25166e += this.f25172k;
        }
        this.f25170i = 0;
        int[] iArr = this.f25177p;
        int i2 = this.f25175n - 1;
        iArr[i2] = iArr[i2] + 1;
        return str;
    }

    /* renamed from: i */
    public boolean mo14143i() {
        int i = this.f25170i;
        if (i == 0) {
            i = m14137o();
        }
        if (i == 5) {
            this.f25170i = 0;
            int[] iArr = this.f25177p;
            int i2 = this.f25175n - 1;
            iArr[i2] = iArr[i2] + 1;
            return true;
        } else if (i == 6) {
            this.f25170i = 0;
            int[] iArr2 = this.f25177p;
            int i3 = this.f25175n - 1;
            iArr2[i3] = iArr2[i3] + 1;
            return false;
        } else {
            String valueOf = String.valueOf(mo14146f());
            int m14130v = m14130v();
            int m14129w = m14129w();
            String m14135q = m14135q();
            throw new IllegalStateException(new StringBuilder(String.valueOf(valueOf).length() + 72 + String.valueOf(m14135q).length()).append("Expected a boolean but was ").append(valueOf).append(" at line ").append(m14130v).append(" column ").append(m14129w).append(" path ").append(m14135q).toString());
        }
    }

    /* renamed from: j */
    public void mo14142j() {
        int i = this.f25170i;
        if (i == 0) {
            i = m14137o();
        }
        if (i == 7) {
            this.f25170i = 0;
            int[] iArr = this.f25177p;
            int i2 = this.f25175n - 1;
            iArr[i2] = iArr[i2] + 1;
            return;
        }
        String valueOf = String.valueOf(mo14146f());
        int m14130v = m14130v();
        int m14129w = m14129w();
        String m14135q = m14135q();
        throw new IllegalStateException(new StringBuilder(String.valueOf(valueOf).length() + 67 + String.valueOf(m14135q).length()).append("Expected null but was ").append(valueOf).append(" at line ").append(m14130v).append(" column ").append(m14129w).append(" path ").append(m14135q).toString());
    }

    /* renamed from: k */
    public double mo14141k() {
        int i = this.f25170i;
        if (i == 0) {
            i = m14137o();
        }
        if (i == 15) {
            this.f25170i = 0;
            int[] iArr = this.f25177p;
            int i2 = this.f25175n - 1;
            iArr[i2] = iArr[i2] + 1;
            return this.f25171j;
        }
        if (i == 16) {
            this.f25173l = new String(this.f25165d, this.f25166e, this.f25172k);
            this.f25166e += this.f25172k;
        } else if (i == 8 || i == 9) {
            this.f25173l = m14157b(i == 8 ? C0494h.f738z : '\"');
        } else if (i == 10) {
            this.f25173l = m14132t();
        } else if (i != 11) {
            String valueOf = String.valueOf(mo14146f());
            int m14130v = m14130v();
            int m14129w = m14129w();
            String m14135q = m14135q();
            throw new IllegalStateException(new StringBuilder(String.valueOf(valueOf).length() + 71 + String.valueOf(m14135q).length()).append("Expected a double but was ").append(valueOf).append(" at line ").append(m14130v).append(" column ").append(m14129w).append(" path ").append(m14135q).toString());
        }
        this.f25170i = 11;
        double parseDouble = Double.parseDouble(this.f25173l);
        if (!this.f25164c && (Double.isNaN(parseDouble) || Double.isInfinite(parseDouble))) {
            int m14130v2 = m14130v();
            int m14129w2 = m14129w();
            String m14135q2 = m14135q();
            throw new C7603pt(new StringBuilder(String.valueOf(m14135q2).length() + 102).append("JSON forbids NaN and infinities: ").append(parseDouble).append(" at line ").append(m14130v2).append(" column ").append(m14129w2).append(" path ").append(m14135q2).toString());
        }
        this.f25173l = null;
        this.f25170i = 0;
        int[] iArr2 = this.f25177p;
        int i3 = this.f25175n - 1;
        iArr2[i3] = iArr2[i3] + 1;
        return parseDouble;
    }

    /* renamed from: l */
    public long mo14140l() {
        int i = this.f25170i;
        if (i == 0) {
            i = m14137o();
        }
        if (i == 15) {
            this.f25170i = 0;
            int[] iArr = this.f25177p;
            int i2 = this.f25175n - 1;
            iArr[i2] = iArr[i2] + 1;
            return this.f25171j;
        }
        if (i == 16) {
            this.f25173l = new String(this.f25165d, this.f25166e, this.f25172k);
            this.f25166e += this.f25172k;
        } else if (i != 8 && i != 9) {
            String valueOf = String.valueOf(mo14146f());
            int m14130v = m14130v();
            int m14129w = m14129w();
            String m14135q = m14135q();
            throw new IllegalStateException(new StringBuilder(String.valueOf(valueOf).length() + 69 + String.valueOf(m14135q).length()).append("Expected a long but was ").append(valueOf).append(" at line ").append(m14130v).append(" column ").append(m14129w).append(" path ").append(m14135q).toString());
        } else {
            this.f25173l = m14157b(i == 8 ? C0494h.f738z : '\"');
            try {
                long parseLong = Long.parseLong(this.f25173l);
                this.f25170i = 0;
                int[] iArr2 = this.f25177p;
                int i3 = this.f25175n - 1;
                iArr2[i3] = iArr2[i3] + 1;
                return parseLong;
            } catch (NumberFormatException e) {
            }
        }
        this.f25170i = 11;
        double parseDouble = Double.parseDouble(this.f25173l);
        long j = (long) parseDouble;
        if (j != parseDouble) {
            String str = this.f25173l;
            int m14130v2 = m14130v();
            int m14129w2 = m14129w();
            String m14135q2 = m14135q();
            throw new NumberFormatException(new StringBuilder(String.valueOf(str).length() + 69 + String.valueOf(m14135q2).length()).append("Expected a long but was ").append(str).append(" at line ").append(m14130v2).append(" column ").append(m14129w2).append(" path ").append(m14135q2).toString());
        }
        this.f25173l = null;
        this.f25170i = 0;
        int[] iArr3 = this.f25177p;
        int i4 = this.f25175n - 1;
        iArr3[i4] = iArr3[i4] + 1;
        return j;
    }

    /* renamed from: m */
    public int mo14139m() {
        int i = this.f25170i;
        if (i == 0) {
            i = m14137o();
        }
        if (i == 15) {
            int i2 = (int) this.f25171j;
            if (this.f25171j != i2) {
                long j = this.f25171j;
                int m14130v = m14130v();
                int m14129w = m14129w();
                String m14135q = m14135q();
                throw new NumberFormatException(new StringBuilder(String.valueOf(m14135q).length() + 89).append("Expected an int but was ").append(j).append(" at line ").append(m14130v).append(" column ").append(m14129w).append(" path ").append(m14135q).toString());
            }
            this.f25170i = 0;
            int[] iArr = this.f25177p;
            int i3 = this.f25175n - 1;
            iArr[i3] = iArr[i3] + 1;
            return i2;
        }
        if (i == 16) {
            this.f25173l = new String(this.f25165d, this.f25166e, this.f25172k);
            this.f25166e += this.f25172k;
        } else if (i != 8 && i != 9) {
            String valueOf = String.valueOf(mo14146f());
            int m14130v2 = m14130v();
            int m14129w2 = m14129w();
            String m14135q2 = m14135q();
            throw new IllegalStateException(new StringBuilder(String.valueOf(valueOf).length() + 69 + String.valueOf(m14135q2).length()).append("Expected an int but was ").append(valueOf).append(" at line ").append(m14130v2).append(" column ").append(m14129w2).append(" path ").append(m14135q2).toString());
        } else {
            this.f25173l = m14157b(i == 8 ? C0494h.f738z : '\"');
            try {
                int parseInt = Integer.parseInt(this.f25173l);
                this.f25170i = 0;
                int[] iArr2 = this.f25177p;
                int i4 = this.f25175n - 1;
                iArr2[i4] = iArr2[i4] + 1;
                return parseInt;
            } catch (NumberFormatException e) {
            }
        }
        this.f25170i = 11;
        double parseDouble = Double.parseDouble(this.f25173l);
        int i5 = (int) parseDouble;
        if (i5 != parseDouble) {
            String str = this.f25173l;
            int m14130v3 = m14130v();
            int m14129w3 = m14129w();
            String m14135q3 = m14135q();
            throw new NumberFormatException(new StringBuilder(String.valueOf(str).length() + 69 + String.valueOf(m14135q3).length()).append("Expected an int but was ").append(str).append(" at line ").append(m14130v3).append(" column ").append(m14129w3).append(" path ").append(m14135q3).toString());
        }
        this.f25173l = null;
        this.f25170i = 0;
        int[] iArr3 = this.f25177p;
        int i6 = this.f25175n - 1;
        iArr3[i6] = iArr3[i6] + 1;
        return i5;
    }

    /* renamed from: n */
    public void mo14138n() {
        int i = 0;
        do {
            int i2 = this.f25170i;
            if (i2 == 0) {
                i2 = m14137o();
            }
            if (i2 == 3) {
                m14163a(1);
                i++;
            } else if (i2 == 1) {
                m14163a(3);
                i++;
            } else if (i2 == 4) {
                this.f25175n--;
                i--;
            } else if (i2 == 2) {
                this.f25175n--;
                i--;
            } else if (i2 == 14 || i2 == 10) {
                m14131u();
            } else if (i2 == 8 || i2 == 12) {
                m14151c(C0494h.f738z);
            } else if (i2 == 9 || i2 == 13) {
                m14151c('\"');
            } else if (i2 == 16) {
                this.f25166e += this.f25172k;
            }
            this.f25170i = 0;
        } while (i != 0);
        int[] iArr = this.f25177p;
        int i3 = this.f25175n - 1;
        iArr[i3] = iArr[i3] + 1;
        this.f25176o[this.f25175n - 1] = "null";
    }

    /* renamed from: p */
    public final boolean m14136p() {
        return this.f25164c;
    }

    /* renamed from: q */
    public String m14135q() {
        StringBuilder append = new StringBuilder().append(C0494h.f688I);
        int i = this.f25175n;
        for (int i2 = 0; i2 < i; i2++) {
            switch (this.f25174m[i2]) {
                case 1:
                case 2:
                    append.append('[').append(this.f25177p[i2]).append(']');
                    break;
                case 3:
                case 4:
                case 5:
                    append.append(C0494h.f686G);
                    if (this.f25176o[i2] != null) {
                        append.append(this.f25176o[i2]);
                        break;
                    } else {
                        break;
                    }
            }
        }
        return append.toString();
    }

    public String toString() {
        String valueOf = String.valueOf(getClass().getSimpleName());
        int m14130v = m14130v();
        return new StringBuilder(String.valueOf(valueOf).length() + 39).append(valueOf).append(" at line ").append(m14130v).append(" column ").append(m14129w()).toString();
    }
}
