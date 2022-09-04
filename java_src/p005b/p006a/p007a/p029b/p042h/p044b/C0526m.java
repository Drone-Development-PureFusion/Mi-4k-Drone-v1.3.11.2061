package p005b.p006a.p007a.p029b.p042h.p044b;

import java.util.ArrayList;
import java.util.Arrays;
import p005b.p006a.p007a.p029b.p055o.C0662f;
import p005b.p006a.p007a.p029b.p058r.C0724u;
import p005b.p006a.p007a.p029b.p058r.C0727x;
/* renamed from: b.a.a.b.h.b.m */
/* loaded from: classes.dex */
public class C0526m extends C0662f {

    /* renamed from: a */
    private String f818a;

    /* renamed from: b */
    private String f819b;

    /* renamed from: c */
    private String f820c;

    /* renamed from: d */
    private String f821d;

    /* renamed from: e */
    private Boolean f822e;

    /* renamed from: f */
    private Boolean f823f;

    /* renamed from: g */
    private String[] f824g;

    /* renamed from: h */
    private String[] f825h;

    /* renamed from: a */
    private String[] m38980a(String[] strArr, String str, String str2) {
        ArrayList arrayList = new ArrayList(strArr.length);
        arrayList.addAll(Arrays.asList(strArr));
        if (str != null) {
            C0727x.m38358a(arrayList, m38968h(str));
        }
        if (str2 != null) {
            C0727x.m38356b(arrayList, m38968h(str2));
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    /* renamed from: a */
    private String[] m38979a(String[] strArr, String[] strArr2) {
        if (this.f824g == null) {
            if (!C0724u.m38372e(m38984a()) || !C0724u.m38372e(m38978b())) {
                this.f824g = m38980a(strArr, m38984a(), m38978b());
            } else {
                this.f824g = (String[]) Arrays.copyOf(strArr2, strArr2.length);
            }
            String[] strArr3 = this.f824g;
            int length = strArr3.length;
            for (int i = 0; i < length; i++) {
                d("enabled protocol: " + strArr3[i]);
            }
        }
        return this.f824g;
    }

    /* renamed from: b */
    private String[] m38975b(String[] strArr, String[] strArr2) {
        if (this.f825h == null) {
            if (!C0724u.m38372e(m38974c()) || !C0724u.m38372e(m38973d())) {
                this.f825h = m38980a(strArr, m38974c(), m38973d());
            } else {
                this.f825h = (String[]) Arrays.copyOf(strArr2, strArr2.length);
            }
            String[] strArr3 = this.f825h;
            int length = strArr3.length;
            for (int i = 0; i < length; i++) {
                d("enabled cipher suite: " + strArr3[i]);
            }
        }
        return this.f825h;
    }

    /* renamed from: h */
    private String[] m38968h(String str) {
        return str.split("\\s*,\\s*");
    }

    /* renamed from: a */
    public String m38984a() {
        return this.f818a;
    }

    /* renamed from: a */
    public void m38983a(AbstractC0520g abstractC0520g) {
        abstractC0520g.mo39013a(m38979a(abstractC0520g.mo39012b(), abstractC0520g.mo39015a()));
        abstractC0520g.mo39010b(m38975b(abstractC0520g.mo39008d(), abstractC0520g.mo39009c()));
        if (m38972e() != null) {
            abstractC0520g.mo39014a(m38972e().booleanValue());
        }
        if (m38971f() != null) {
            abstractC0520g.mo39011b(m38971f().booleanValue());
        }
    }

    /* renamed from: a */
    public void m38982a(Boolean bool) {
        this.f822e = bool;
    }

    /* renamed from: a */
    public void m38981a(String str) {
        this.f818a = str;
    }

    /* renamed from: b */
    public String m38978b() {
        return this.f819b;
    }

    /* renamed from: b */
    public void m38977b(Boolean bool) {
        this.f823f = bool;
    }

    /* renamed from: b */
    public void m38976b(String str) {
        this.f819b = str;
    }

    /* renamed from: c */
    public String m38974c() {
        return this.f820c;
    }

    /* renamed from: d */
    public String m38973d() {
        return this.f821d;
    }

    /* renamed from: e */
    public Boolean m38972e() {
        return this.f822e;
    }

    /* renamed from: f */
    public Boolean m38971f() {
        return this.f823f;
    }

    /* renamed from: f */
    public void m38970f(String str) {
        this.f820c = str;
    }

    /* renamed from: g */
    public void m38969g(String str) {
        this.f821d = str;
    }
}
