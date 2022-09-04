package com.android.volley;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.android.volley.AbstractC0900b;
import com.android.volley.C0924p;
import com.android.volley.C0968v;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Collections;
import java.util.Map;
import org.codehaus.jackson.org.objectweb.asm.signature.SignatureVisitor;
/* renamed from: com.android.volley.n */
/* loaded from: classes.dex */
public abstract class AbstractC0916n<T> implements Comparable<AbstractC0916n<T>> {

    /* renamed from: a */
    private static final String f2019a = "UTF-8";

    /* renamed from: q */
    private static long f2020q;

    /* renamed from: b */
    private final C0968v.C0969a f2021b;

    /* renamed from: c */
    private final int f2022c;

    /* renamed from: d */
    private final String f2023d;

    /* renamed from: e */
    private String f2024e;

    /* renamed from: f */
    private String f2025f;

    /* renamed from: g */
    private final int f2026g;

    /* renamed from: h */
    private C0924p.AbstractC0925a f2027h;

    /* renamed from: i */
    private Integer f2028i;

    /* renamed from: j */
    private C0920o f2029j;

    /* renamed from: k */
    private boolean f2030k;

    /* renamed from: l */
    private boolean f2031l;

    /* renamed from: m */
    private boolean f2032m;

    /* renamed from: n */
    private AbstractC0928r f2033n;

    /* renamed from: o */
    private AbstractC0900b.C0901a f2034o;

    /* renamed from: p */
    private Object f2035p;

    /* renamed from: com.android.volley.n$a */
    /* loaded from: classes.dex */
    public interface AbstractC0918a {

        /* renamed from: a */
        public static final int f2039a = -1;

        /* renamed from: b */
        public static final int f2040b = 0;

        /* renamed from: c */
        public static final int f2041c = 1;

        /* renamed from: d */
        public static final int f2042d = 2;

        /* renamed from: e */
        public static final int f2043e = 3;

        /* renamed from: f */
        public static final int f2044f = 4;

        /* renamed from: g */
        public static final int f2045g = 5;

        /* renamed from: h */
        public static final int f2046h = 6;

        /* renamed from: i */
        public static final int f2047i = 7;
    }

    /* renamed from: com.android.volley.n$b */
    /* loaded from: classes.dex */
    public enum EnumC0919b {
        LOW,
        NORMAL,
        HIGH,
        IMMEDIATE
    }

    public AbstractC0916n(int i, String str, C0924p.AbstractC0925a abstractC0925a) {
        this.f2021b = C0968v.C0969a.f2168a ? new C0968v.C0969a() : null;
        this.f2030k = true;
        this.f2031l = false;
        this.f2032m = false;
        this.f2034o = null;
        this.f2022c = i;
        this.f2023d = str;
        this.f2025f = m37428a(i, str);
        this.f2027h = abstractC0925a;
        m37424a((AbstractC0928r) new C0904d());
        this.f2026g = m37411d(str);
    }

    @Deprecated
    public AbstractC0916n(String str, C0924p.AbstractC0925a abstractC0925a) {
        this(-1, str, abstractC0925a);
    }

    /* renamed from: a */
    private static String m37428a(int i, String str) {
        StringBuilder append = new StringBuilder().append("Request:").append(i).append(":").append(str).append(":").append(System.currentTimeMillis()).append(":");
        long j = f2020q;
        f2020q = 1 + j;
        return C0908f.m37437a(append.append(j).toString());
    }

    /* renamed from: a */
    private byte[] m37420a(Map<String, String> map, String str) {
        StringBuilder sb = new StringBuilder();
        try {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                sb.append(URLEncoder.encode(entry.getKey(), str));
                sb.append(SignatureVisitor.INSTANCEOF);
                sb.append(URLEncoder.encode(entry.getValue(), str));
                sb.append('&');
            }
            return sb.toString().getBytes(str);
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException("Encoding not supported: " + str, e);
        }
    }

    /* renamed from: d */
    private static int m37411d(String str) {
        Uri parse;
        String host;
        if (TextUtils.isEmpty(str) || (parse = Uri.parse(str)) == null || (host = parse.getHost()) == null) {
            return 0;
        }
        return host.hashCode();
    }

    /* renamed from: A */
    public void m37432A() {
        this.f2032m = true;
    }

    /* renamed from: B */
    public boolean m37431B() {
        return this.f2032m;
    }

    /* renamed from: a */
    public int m37430a() {
        return this.f2022c;
    }

    /* renamed from: a */
    public int m37426a(AbstractC0916n<T> abstractC0916n) {
        EnumC0919b mo37286x = mo37286x();
        EnumC0919b mo37286x2 = abstractC0916n.mo37286x();
        return mo37286x == mo37286x2 ? this.f2028i.intValue() - abstractC0916n.f2028i.intValue() : mo37286x2.ordinal() - mo37286x.ordinal();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public final AbstractC0916n<?> m37429a(int i) {
        this.f2028i = Integer.valueOf(i);
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public AbstractC0916n<?> m37427a(AbstractC0900b.C0901a c0901a) {
        this.f2034o = c0901a;
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public AbstractC0916n<?> m37425a(C0920o c0920o) {
        this.f2029j = c0920o;
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public AbstractC0916n<?> m37424a(AbstractC0928r abstractC0928r) {
        this.f2033n = abstractC0928r;
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public AbstractC0916n<?> m37422a(Object obj) {
        this.f2035p = obj;
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public final AbstractC0916n<?> m37419a(boolean z) {
        this.f2030k = z;
        return this;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public abstract C0924p<T> mo34917a(C0912j c0912j);

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public C0967u m37423a(C0967u c0967u) {
        return c0967u;
    }

    /* renamed from: a */
    public void m37421a(String str) {
        if (C0968v.C0969a.f2168a) {
            this.f2021b.m37253a(str, Thread.currentThread().getId());
        }
    }

    /* renamed from: b */
    public Object m37418b() {
        return this.f2035p;
    }

    /* renamed from: b */
    public void m37416b(C0967u c0967u) {
        if (this.f2027h != null) {
            this.f2027h.mo29150a(c0967u);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: b */
    public abstract void mo34916b(T t);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public void m37415b(final String str) {
        if (this.f2029j != null) {
            this.f2029j.m37390b(this);
            mo37270e();
        }
        if (C0968v.C0969a.f2168a) {
            final long id = Thread.currentThread().getId();
            if (Looper.myLooper() != Looper.getMainLooper()) {
                new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.android.volley.n.1
                    @Override // java.lang.Runnable
                    public void run() {
                        AbstractC0916n.this.f2021b.m37253a(str, id);
                        AbstractC0916n.this.f2021b.m37254a(toString());
                    }
                });
                return;
            }
            this.f2021b.m37253a(str, id);
            this.f2021b.m37254a(toString());
        }
    }

    /* renamed from: c */
    public C0924p.AbstractC0925a m37414c() {
        return this.f2027h;
    }

    /* renamed from: c */
    public void m37413c(String str) {
        this.f2024e = str;
    }

    @Override // java.lang.Comparable
    public /* synthetic */ int compareTo(Object obj) {
        return m37426a((AbstractC0916n) ((AbstractC0916n) obj));
    }

    /* renamed from: d */
    public int m37412d() {
        return this.f2026g;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: e */
    public void mo37270e() {
        this.f2027h = null;
    }

    /* renamed from: f */
    public final int m37410f() {
        if (this.f2028i == null) {
            throw new IllegalStateException("getSequence called before setSequence");
        }
        return this.f2028i.intValue();
    }

    /* renamed from: g */
    public String m37409g() {
        return this.f2024e != null ? this.f2024e : this.f2023d;
    }

    /* renamed from: h */
    public String m37408h() {
        return this.f2023d;
    }

    /* renamed from: i */
    public String m37407i() {
        return this.f2025f;
    }

    /* renamed from: j */
    public String m37406j() {
        return this.f2022c + ":" + this.f2023d;
    }

    /* renamed from: k */
    public AbstractC0900b.C0901a m37405k() {
        return this.f2034o;
    }

    /* renamed from: l */
    public void m37404l() {
        this.f2031l = true;
    }

    /* renamed from: m */
    public boolean mo37356m() {
        return this.f2031l;
    }

    /* renamed from: n */
    public Map<String, String> m37403n() {
        return Collections.emptyMap();
    }

    @Deprecated
    /* renamed from: o */
    protected Map<String, String> m37402o() {
        return mo34901s();
    }

    @Deprecated
    /* renamed from: p */
    protected String m37401p() {
        return m37400t();
    }

    @Deprecated
    /* renamed from: q */
    public String mo37285q() {
        return mo37283u();
    }

    @Deprecated
    /* renamed from: r */
    public byte[] mo37284r() {
        Map<String, String> m37402o = m37402o();
        if (m37402o == null || m37402o.size() <= 0) {
            return null;
        }
        return m37420a(m37402o, m37401p());
    }

    /* renamed from: s */
    protected Map<String, String> mo34901s() {
        return null;
    }

    /* renamed from: t */
    protected String m37400t() {
        return "UTF-8";
    }

    public String toString() {
        return (this.f2031l ? "[X] " : "[ ] ") + m37409g() + " " + ("0x" + Integer.toHexString(m37412d())) + " " + mo37286x() + " " + this.f2028i;
    }

    /* renamed from: u */
    public String mo37283u() {
        return "application/x-www-form-urlencoded; charset=" + m37400t();
    }

    /* renamed from: v */
    public byte[] mo37282v() {
        Map<String, String> mo34901s = mo34901s();
        if (mo34901s == null || mo34901s.size() <= 0) {
            return null;
        }
        return m37420a(mo34901s, m37400t());
    }

    /* renamed from: w */
    public final boolean m37399w() {
        return this.f2030k;
    }

    /* renamed from: x */
    public EnumC0919b mo37286x() {
        return EnumC0919b.NORMAL;
    }

    /* renamed from: y */
    public final int m37398y() {
        return this.f2033n.mo37378a();
    }

    /* renamed from: z */
    public AbstractC0928r m37397z() {
        return this.f2033n;
    }
}
