package com.google.android.gms.internal;

import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.io.Writer;
import p005b.p006a.p007a.p029b.C0494h;
/* renamed from: com.google.android.gms.internal.ps */
/* loaded from: classes2.dex */
public class C7602ps implements Closeable, Flushable {

    /* renamed from: a */
    private static final String[] f25201a = new String[128];

    /* renamed from: b */
    private static final String[] f25202b;

    /* renamed from: c */
    private final Writer f25203c;

    /* renamed from: f */
    private String f25206f;

    /* renamed from: h */
    private boolean f25208h;

    /* renamed from: i */
    private boolean f25209i;

    /* renamed from: j */
    private String f25210j;

    /* renamed from: d */
    private int[] f25204d = new int[32];

    /* renamed from: e */
    private int f25205e = 0;

    /* renamed from: g */
    private String f25207g = ":";

    /* renamed from: k */
    private boolean f25211k = true;

    static {
        for (int i = 0; i <= 31; i++) {
            f25201a[i] = String.format("\\u%04x", Integer.valueOf(i));
        }
        f25201a[34] = "\\\"";
        f25201a[92] = "\\\\";
        f25201a[9] = "\\t";
        f25201a[8] = "\\b";
        f25201a[10] = "\\n";
        f25201a[13] = "\\r";
        f25201a[12] = "\\f";
        f25202b = (String[]) f25201a.clone();
        f25202b[60] = "\\u003c";
        f25202b[62] = "\\u003e";
        f25202b[38] = "\\u0026";
        f25202b[61] = "\\u003d";
        f25202b[39] = "\\u0027";
    }

    public C7602ps(Writer writer) {
        m14114a(6);
        if (writer == null) {
            throw new NullPointerException("out == null");
        }
        this.f25203c = writer;
    }

    /* renamed from: a */
    private int m14115a() {
        if (this.f25205e == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
        return this.f25204d[this.f25205e - 1];
    }

    /* renamed from: a */
    private C7602ps m14113a(int i, int i2, String str) {
        int m14115a = m14115a();
        if (m14115a == i2 || m14115a == i) {
            if (this.f25210j != null) {
                String valueOf = String.valueOf(this.f25210j);
                throw new IllegalStateException(valueOf.length() != 0 ? "Dangling name: ".concat(valueOf) : new String("Dangling name: "));
            }
            this.f25205e--;
            if (m14115a == i2) {
                m14090k();
            }
            this.f25203c.write(str);
            return this;
        }
        throw new IllegalStateException("Nesting problem.");
    }

    /* renamed from: a */
    private C7602ps m14112a(int i, String str) {
        m14096e(true);
        m14114a(i);
        this.f25203c.write(str);
        return this;
    }

    /* renamed from: a */
    private void m14114a(int i) {
        if (this.f25205e == this.f25204d.length) {
            int[] iArr = new int[this.f25205e * 2];
            System.arraycopy(this.f25204d, 0, iArr, 0, this.f25205e);
            this.f25204d = iArr;
        }
        int[] iArr2 = this.f25204d;
        int i2 = this.f25205e;
        this.f25205e = i2 + 1;
        iArr2[i2] = i;
    }

    /* renamed from: b */
    private void m14106b(int i) {
        this.f25204d[this.f25205e - 1] = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0030  */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void m14099d(String str) {
        String str2;
        int i = 0;
        String[] strArr = this.f25209i ? f25202b : f25201a;
        this.f25203c.write("\"");
        int length = str.length();
        for (int i2 = 0; i2 < length; i2++) {
            char charAt = str.charAt(i2);
            if (charAt < 128) {
                str2 = strArr[charAt];
                if (str2 == null) {
                }
                if (i < i2) {
                    this.f25203c.write(str, i, i2 - i);
                }
                this.f25203c.write(str2);
                i = i2 + 1;
            } else {
                if (charAt == 8232) {
                    str2 = "\\u2028";
                } else if (charAt == 8233) {
                    str2 = "\\u2029";
                }
                if (i < i2) {
                }
                this.f25203c.write(str2);
                i = i2 + 1;
            }
        }
        if (i < length) {
            this.f25203c.write(str, i, length - i);
        }
        this.f25203c.write("\"");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: e */
    private void m14096e(boolean z) {
        switch (m14115a()) {
            case 1:
                m14106b(2);
                m14090k();
                return;
            case 2:
                this.f25203c.append(C0494h.f736x);
                m14090k();
                return;
            case 3:
            case 5:
            default:
                throw new IllegalStateException("Nesting problem.");
            case 4:
                this.f25203c.append((CharSequence) this.f25207g);
                m14106b(5);
                return;
            case 6:
                break;
            case 7:
                if (!this.f25208h) {
                    throw new IllegalStateException("JSON must have only one top-level value.");
                }
                break;
        }
        if (this.f25208h || z) {
            m14106b(7);
            return;
        }
        throw new IllegalStateException("JSON must start with an array or an object.");
    }

    /* renamed from: j */
    private void m14091j() {
        if (this.f25210j != null) {
            m14089l();
            m14099d(this.f25210j);
            this.f25210j = null;
        }
    }

    /* renamed from: k */
    private void m14090k() {
        if (this.f25206f == null) {
            return;
        }
        this.f25203c.write("\n");
        int i = this.f25205e;
        for (int i2 = 1; i2 < i; i2++) {
            this.f25203c.write(this.f25206f);
        }
    }

    /* renamed from: l */
    private void m14089l() {
        int m14115a = m14115a();
        if (m14115a == 5) {
            this.f25203c.write(44);
        } else if (m14115a != 3) {
            throw new IllegalStateException("Nesting problem.");
        }
        m14090k();
        m14106b(4);
    }

    /* renamed from: a */
    public C7602ps mo14111a(long j) {
        m14091j();
        m14096e(false);
        this.f25203c.write(Long.toString(j));
        return this;
    }

    /* renamed from: a */
    public C7602ps mo14110a(Number number) {
        if (number == null) {
            return mo14095f();
        }
        m14091j();
        String obj = number.toString();
        if (!this.f25208h && (obj.equals("-Infinity") || obj.equals("Infinity") || obj.equals("NaN"))) {
            String valueOf = String.valueOf(number);
            throw new IllegalArgumentException(new StringBuilder(String.valueOf(valueOf).length() + 39).append("Numeric values must be finite, but was ").append(valueOf).toString());
        }
        m14096e(false);
        this.f25203c.append((CharSequence) obj);
        return this;
    }

    /* renamed from: a */
    public C7602ps mo14109a(String str) {
        if (str == null) {
            throw new NullPointerException("name == null");
        }
        if (this.f25210j != null) {
            throw new IllegalStateException();
        }
        if (this.f25205e == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
        this.f25210j = str;
        return this;
    }

    /* renamed from: a */
    public C7602ps mo14108a(boolean z) {
        m14091j();
        m14096e(false);
        this.f25203c.write(z ? "true" : "false");
        return this;
    }

    /* renamed from: b */
    public C7602ps mo14107b() {
        m14091j();
        return m14112a(1, "[");
    }

    /* renamed from: b */
    public C7602ps mo14105b(String str) {
        if (str == null) {
            return mo14095f();
        }
        m14091j();
        m14096e(false);
        m14099d(str);
        return this;
    }

    /* renamed from: b */
    public final void m14104b(boolean z) {
        this.f25208h = z;
    }

    /* renamed from: c */
    public C7602ps mo14103c() {
        return m14113a(1, 2, "]");
    }

    /* renamed from: c */
    public final void m14102c(String str) {
        if (str.length() == 0) {
            this.f25206f = null;
            this.f25207g = ":";
            return;
        }
        this.f25206f = str;
        this.f25207g = ": ";
    }

    /* renamed from: c */
    public final void m14101c(boolean z) {
        this.f25209i = z;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f25203c.close();
        int i = this.f25205e;
        if (i > 1 || (i == 1 && this.f25204d[i - 1] != 7)) {
            throw new IOException("Incomplete document");
        }
        this.f25205e = 0;
    }

    /* renamed from: d */
    public C7602ps mo14100d() {
        m14091j();
        return m14112a(3, "{");
    }

    /* renamed from: d */
    public final void m14098d(boolean z) {
        this.f25211k = z;
    }

    /* renamed from: e */
    public C7602ps mo14097e() {
        return m14113a(3, 5, "}");
    }

    /* renamed from: f */
    public C7602ps mo14095f() {
        if (this.f25210j != null) {
            if (!this.f25211k) {
                this.f25210j = null;
                return this;
            }
            m14091j();
        }
        m14096e(false);
        this.f25203c.write("null");
        return this;
    }

    public void flush() {
        if (this.f25205e == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
        this.f25203c.flush();
    }

    /* renamed from: g */
    public boolean m14094g() {
        return this.f25208h;
    }

    /* renamed from: h */
    public final boolean m14093h() {
        return this.f25209i;
    }

    /* renamed from: i */
    public final boolean m14092i() {
        return this.f25211k;
    }
}
