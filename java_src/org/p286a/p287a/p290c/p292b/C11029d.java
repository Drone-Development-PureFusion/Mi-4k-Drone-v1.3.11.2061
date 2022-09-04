package org.p286a.p287a.p290c.p292b;

import java.io.File;
import java.io.InputStream;
import java.io.Serializable;
import java.util.Arrays;
import java.util.List;
import org.apache.http.HttpEntity;
import org.apache.http.NameValuePair;
import org.p286a.p287a.p288a.AbstractC11009c;
import org.p286a.p287a.p305h.AbstractC11139a;
import org.p286a.p287a.p305h.C11140b;
import org.p286a.p287a.p305h.C11142d;
import org.p286a.p287a.p305h.C11143e;
import org.p286a.p287a.p305h.C11144f;
import org.p286a.p287a.p305h.C11146h;
import org.p286a.p287a.p305h.C11147i;
import org.p286a.p287a.p305h.C11148j;
@AbstractC11009c
/* renamed from: org.a.a.c.b.d */
/* loaded from: classes2.dex */
public class C11029d {

    /* renamed from: a */
    private String f35562a;

    /* renamed from: b */
    private byte[] f35563b;

    /* renamed from: c */
    private InputStream f35564c;

    /* renamed from: d */
    private List<NameValuePair> f35565d;

    /* renamed from: e */
    private Serializable f35566e;

    /* renamed from: f */
    private File f35567f;

    /* renamed from: g */
    private C11143e f35568g;

    /* renamed from: h */
    private String f35569h;

    /* renamed from: i */
    private boolean f35570i;

    /* renamed from: j */
    private boolean f35571j;

    C11029d() {
    }

    /* renamed from: a */
    public static C11029d m2260a() {
        return new C11029d();
    }

    /* renamed from: b */
    private C11143e m2249b(C11143e c11143e) {
        return this.f35568g != null ? this.f35568g : c11143e;
    }

    /* renamed from: o */
    private void m2236o() {
        this.f35562a = null;
        this.f35563b = null;
        this.f35564c = null;
        this.f35565d = null;
        this.f35566e = null;
        this.f35567f = null;
    }

    /* renamed from: a */
    public C11029d m2259a(File file) {
        m2236o();
        this.f35567f = file;
        return this;
    }

    /* renamed from: a */
    public C11029d m2258a(InputStream inputStream) {
        m2236o();
        this.f35564c = inputStream;
        return this;
    }

    /* renamed from: a */
    public C11029d m2257a(Serializable serializable) {
        m2236o();
        this.f35566e = serializable;
        return this;
    }

    /* renamed from: a */
    public C11029d m2256a(String str) {
        m2236o();
        this.f35562a = str;
        return this;
    }

    /* renamed from: a */
    public C11029d m2255a(List<NameValuePair> list) {
        m2236o();
        this.f35565d = list;
        return this;
    }

    /* renamed from: a */
    public C11029d m2254a(C11143e c11143e) {
        this.f35568g = c11143e;
        return this;
    }

    /* renamed from: a */
    public C11029d m2253a(byte[] bArr) {
        m2236o();
        this.f35563b = bArr;
        return this;
    }

    /* renamed from: a */
    public C11029d m2252a(NameValuePair... nameValuePairArr) {
        return m2255a(Arrays.asList(nameValuePairArr));
    }

    /* renamed from: b */
    public String m2251b() {
        return this.f35562a;
    }

    /* renamed from: b */
    public C11029d m2250b(String str) {
        this.f35569h = str;
        return this;
    }

    /* renamed from: c */
    public byte[] m2248c() {
        return this.f35563b;
    }

    /* renamed from: d */
    public InputStream m2247d() {
        return this.f35564c;
    }

    /* renamed from: e */
    public List<NameValuePair> m2246e() {
        return this.f35565d;
    }

    /* renamed from: f */
    public Serializable m2245f() {
        return this.f35566e;
    }

    /* renamed from: g */
    public File m2244g() {
        return this.f35567f;
    }

    /* renamed from: h */
    public C11143e m2243h() {
        return this.f35568g;
    }

    /* renamed from: i */
    public String m2242i() {
        return this.f35569h;
    }

    /* renamed from: j */
    public boolean m2241j() {
        return this.f35570i;
    }

    /* renamed from: k */
    public C11029d m2240k() {
        this.f35570i = true;
        return this;
    }

    /* renamed from: l */
    public boolean m2239l() {
        return this.f35571j;
    }

    /* renamed from: m */
    public C11029d m2238m() {
        this.f35571j = true;
        return this;
    }

    /* renamed from: n */
    public HttpEntity m2237n() {
        AbstractC11139a c11144f;
        if (this.f35562a != null) {
            c11144f = new C11148j(this.f35562a, m2249b(C11143e.f35841m));
        } else if (this.f35563b != null) {
            c11144f = new C11142d(this.f35563b, m2249b(C11143e.f35842n));
        } else if (this.f35564c != null) {
            c11144f = new C11146h(this.f35564c, 1L, m2249b(C11143e.f35842n));
        } else if (this.f35565d != null) {
            c11144f = new C11033h(this.f35565d, this.f35568g != null ? this.f35568g.m1940b() : null);
        } else if (this.f35566e != null) {
            c11144f = new C11147i(this.f35566e);
            c11144f.m1954a(C11143e.f35842n.toString());
        } else {
            c11144f = this.f35567f != null ? new C11144f(this.f35567f, m2249b(C11143e.f35842n)) : new C11140b();
        }
        if (c11144f.getContentType() != null && this.f35568g != null) {
            c11144f.m1954a(this.f35568g.toString());
        }
        c11144f.m1951b(this.f35569h);
        c11144f.m1952a(this.f35570i);
        return this.f35571j ? new C11030e(c11144f) : c11144f;
    }
}
