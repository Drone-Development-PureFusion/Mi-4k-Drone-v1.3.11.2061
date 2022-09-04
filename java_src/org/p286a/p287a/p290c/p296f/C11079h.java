package org.p286a.p287a.p290c.p296f;

import java.net.URI;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.apache.http.NameValuePair;
import org.apache.http.message.BasicNameValuePair;
import org.p286a.p287a.C11011b;
import org.p286a.p287a.p288a.AbstractC11009c;
import org.p286a.p287a.p299f.p303d.C11129a;
import p005b.p006a.p007a.p008a.p026n.C0363a;
import p005b.p006a.p007a.p029b.C0494h;
@AbstractC11009c
/* renamed from: org.a.a.c.f.h */
/* loaded from: classes.dex */
public class C11079h {

    /* renamed from: a */
    private String f35646a;

    /* renamed from: b */
    private String f35647b;

    /* renamed from: c */
    private String f35648c;

    /* renamed from: d */
    private String f35649d;

    /* renamed from: e */
    private String f35650e;

    /* renamed from: f */
    private String f35651f;

    /* renamed from: g */
    private int f35652g;

    /* renamed from: h */
    private String f35653h;

    /* renamed from: i */
    private String f35654i;

    /* renamed from: j */
    private String f35655j;

    /* renamed from: k */
    private List<NameValuePair> f35656k;

    /* renamed from: l */
    private String f35657l;

    /* renamed from: m */
    private String f35658m;

    /* renamed from: n */
    private String f35659n;

    public C11079h() {
        this.f35652g = -1;
    }

    public C11079h(String str) {
        m2133a(new URI(str));
    }

    public C11079h(URI uri) {
        m2133a(uri);
    }

    /* renamed from: a */
    private List<NameValuePair> m2134a(String str, Charset charset) {
        if (str == null || str.length() <= 0) {
            return null;
        }
        return C11081j.m2091a(str, charset);
    }

    /* renamed from: a */
    private void m2133a(URI uri) {
        this.f35646a = uri.getScheme();
        this.f35647b = uri.getRawSchemeSpecificPart();
        this.f35648c = uri.getRawAuthority();
        this.f35651f = uri.getHost();
        this.f35652g = uri.getPort();
        this.f35650e = uri.getRawUserInfo();
        this.f35649d = uri.getUserInfo();
        this.f35654i = uri.getRawPath();
        this.f35653h = uri.getPath();
        this.f35655j = uri.getRawQuery();
        this.f35656k = m2134a(uri.getRawQuery(), C11011b.f35498e);
        this.f35659n = uri.getRawFragment();
        this.f35658m = uri.getFragment();
    }

    /* renamed from: c */
    private String m2123c(List<NameValuePair> list) {
        return C11081j.m2093a(list, C11011b.f35498e);
    }

    /* renamed from: h */
    private String m2113h(String str) {
        return C11081j.m2080b(str, C11011b.f35498e);
    }

    /* renamed from: i */
    private String m2111i(String str) {
        return C11081j.m2077d(str, C11011b.f35498e);
    }

    /* renamed from: j */
    private String m2109j(String str) {
        return C11081j.m2078c(str, C11011b.f35498e);
    }

    /* renamed from: k */
    private static String m2107k(String str) {
        if (str == null) {
            return null;
        }
        int i = 0;
        while (i < str.length() && str.charAt(i) == '/') {
            i++;
        }
        return i > 1 ? str.substring(i - 1) : str;
    }

    /* renamed from: m */
    private String m2105m() {
        StringBuilder sb = new StringBuilder();
        if (this.f35646a != null) {
            sb.append(this.f35646a).append(C0494h.f680A);
        }
        if (this.f35647b != null) {
            sb.append(this.f35647b);
        } else {
            if (this.f35648c != null) {
                sb.append("//").append(this.f35648c);
            } else if (this.f35651f != null) {
                sb.append("//");
                if (this.f35650e != null) {
                    sb.append(this.f35650e).append("@");
                } else if (this.f35649d != null) {
                    sb.append(m2113h(this.f35649d)).append("@");
                }
                if (C11129a.m1959e(this.f35651f)) {
                    sb.append("[").append(this.f35651f).append("]");
                } else {
                    sb.append(this.f35651f);
                }
                if (this.f35652g >= 0) {
                    sb.append(":").append(this.f35652g);
                }
            }
            if (this.f35654i != null) {
                sb.append(m2107k(this.f35654i));
            } else if (this.f35653h != null) {
                sb.append(m2111i(m2107k(this.f35653h)));
            }
            if (this.f35655j != null) {
                sb.append(C0363a.f360a).append(this.f35655j);
            } else if (this.f35656k != null) {
                sb.append(C0363a.f360a).append(m2123c(this.f35656k));
            } else if (this.f35657l != null) {
                sb.append(C0363a.f360a).append(m2109j(this.f35657l));
            }
        }
        if (this.f35659n != null) {
            sb.append("#").append(this.f35659n);
        } else if (this.f35658m != null) {
            sb.append("#").append(m2109j(this.f35658m));
        }
        return sb.toString();
    }

    /* renamed from: a */
    public URI m2138a() {
        return new URI(m2105m());
    }

    /* renamed from: a */
    public C11079h m2137a(int i) {
        if (i < 0) {
            i = -1;
        }
        this.f35652g = i;
        this.f35647b = null;
        this.f35648c = null;
        return this;
    }

    /* renamed from: a */
    public C11079h m2136a(String str) {
        this.f35646a = str;
        return this;
    }

    /* renamed from: a */
    public C11079h m2135a(String str, String str2) {
        return m2129b(str + C0494h.f680A + str2);
    }

    /* renamed from: a */
    public C11079h m2132a(List<NameValuePair> list) {
        if (this.f35656k == null) {
            this.f35656k = new ArrayList();
        } else {
            this.f35656k.clear();
        }
        this.f35656k.addAll(list);
        this.f35655j = null;
        this.f35647b = null;
        this.f35657l = null;
        return this;
    }

    /* renamed from: a */
    public C11079h m2131a(NameValuePair... nameValuePairArr) {
        if (this.f35656k == null) {
            this.f35656k = new ArrayList();
        } else {
            this.f35656k.clear();
        }
        for (NameValuePair nameValuePair : nameValuePairArr) {
            this.f35656k.add(nameValuePair);
        }
        this.f35655j = null;
        this.f35647b = null;
        this.f35657l = null;
        return this;
    }

    /* renamed from: b */
    public C11079h m2130b() {
        this.f35656k = null;
        this.f35657l = null;
        this.f35655j = null;
        this.f35647b = null;
        return this;
    }

    /* renamed from: b */
    public C11079h m2129b(String str) {
        this.f35649d = str;
        this.f35647b = null;
        this.f35648c = null;
        this.f35650e = null;
        return this;
    }

    /* renamed from: b */
    public C11079h m2128b(String str, String str2) {
        if (this.f35656k == null) {
            this.f35656k = new ArrayList();
        }
        this.f35656k.add(new BasicNameValuePair(str, str2));
        this.f35655j = null;
        this.f35647b = null;
        this.f35657l = null;
        return this;
    }

    /* renamed from: b */
    public C11079h m2127b(List<NameValuePair> list) {
        if (this.f35656k == null) {
            this.f35656k = new ArrayList();
        }
        this.f35656k.addAll(list);
        this.f35655j = null;
        this.f35647b = null;
        this.f35657l = null;
        return this;
    }

    /* renamed from: c */
    public C11079h m2126c() {
        this.f35656k = null;
        this.f35655j = null;
        this.f35647b = null;
        return this;
    }

    /* renamed from: c */
    public C11079h m2125c(String str) {
        this.f35651f = str;
        this.f35647b = null;
        this.f35648c = null;
        return this;
    }

    /* renamed from: c */
    public C11079h m2124c(String str, String str2) {
        if (this.f35656k == null) {
            this.f35656k = new ArrayList();
        }
        if (!this.f35656k.isEmpty()) {
            Iterator<NameValuePair> it2 = this.f35656k.iterator();
            while (it2.hasNext()) {
                if (it2.next().getName().equals(str)) {
                    it2.remove();
                }
            }
        }
        this.f35656k.add(new BasicNameValuePair(str, str2));
        this.f35655j = null;
        this.f35647b = null;
        this.f35657l = null;
        return this;
    }

    /* renamed from: d */
    public C11079h m2121d(String str) {
        this.f35653h = str;
        this.f35647b = null;
        this.f35654i = null;
        return this;
    }

    /* renamed from: d */
    public boolean m2122d() {
        return this.f35646a != null;
    }

    @Deprecated
    /* renamed from: e */
    public C11079h m2119e(String str) {
        this.f35656k = m2134a(str, C11011b.f35498e);
        this.f35657l = null;
        this.f35655j = null;
        this.f35647b = null;
        return this;
    }

    /* renamed from: e */
    public boolean m2120e() {
        return this.f35653h == null;
    }

    /* renamed from: f */
    public String m2118f() {
        return this.f35646a;
    }

    /* renamed from: f */
    public C11079h m2117f(String str) {
        this.f35657l = str;
        this.f35655j = null;
        this.f35647b = null;
        this.f35656k = null;
        return this;
    }

    /* renamed from: g */
    public String m2116g() {
        return this.f35649d;
    }

    /* renamed from: g */
    public C11079h m2115g(String str) {
        this.f35658m = str;
        this.f35659n = null;
        return this;
    }

    /* renamed from: h */
    public String m2114h() {
        return this.f35651f;
    }

    /* renamed from: i */
    public int m2112i() {
        return this.f35652g;
    }

    /* renamed from: j */
    public String m2110j() {
        return this.f35653h;
    }

    /* renamed from: k */
    public List<NameValuePair> m2108k() {
        return this.f35656k != null ? new ArrayList(this.f35656k) : new ArrayList();
    }

    /* renamed from: l */
    public String m2106l() {
        return this.f35658m;
    }

    public String toString() {
        return m2105m();
    }
}
