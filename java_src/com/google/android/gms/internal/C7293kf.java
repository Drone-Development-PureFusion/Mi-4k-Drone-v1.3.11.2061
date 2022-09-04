package com.google.android.gms.internal;

import com.fimi.soul.biz.camera.C1831e;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import p005b.p006a.p007a.p029b.p052m.p053a.C0620k;
/* renamed from: com.google.android.gms.internal.kf */
/* loaded from: classes2.dex */
public class C7293kf {

    /* renamed from: a */
    public static final C7293kf f24417a;

    /* renamed from: b */
    static final /* synthetic */ boolean f24418b;

    /* renamed from: c */
    private Integer f24419c;

    /* renamed from: d */
    private EnumC7295a f24420d;

    /* renamed from: e */
    private AbstractC7344lh f24421e = null;

    /* renamed from: f */
    private C7319kv f24422f = null;

    /* renamed from: g */
    private AbstractC7344lh f24423g = null;

    /* renamed from: h */
    private C7319kv f24424h = null;

    /* renamed from: i */
    private AbstractC7336lb f24425i = C7349lk.m14731d();

    /* renamed from: j */
    private String f24426j = null;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.android.gms.internal.kf$a */
    /* loaded from: classes2.dex */
    public enum EnumC7295a {
        LEFT,
        RIGHT
    }

    static {
        f24418b = !C7293kf.class.desiredAssertionStatus();
        f24417a = new C7293kf();
    }

    /* renamed from: a */
    public static C7293kf m14920a(Map<String, Object> map) {
        C7293kf c7293kf = new C7293kf();
        c7293kf.f24419c = (Integer) map.get("l");
        if (map.containsKey("sp")) {
            c7293kf.f24421e = m14922a(C7347li.m14735a(map.get("sp")));
            String str = (String) map.get("sn");
            if (str != null) {
                c7293kf.f24422f = C7319kv.m14828a(str);
            }
        }
        if (map.containsKey("ep")) {
            c7293kf.f24423g = m14922a(C7347li.m14735a(map.get("ep")));
            String str2 = (String) map.get("en");
            if (str2 != null) {
                c7293kf.f24424h = C7319kv.m14828a(str2);
            }
        }
        String str3 = (String) map.get(C1831e.f4915cI);
        if (str3 != null) {
            c7293kf.f24420d = str3.equals("l") ? EnumC7295a.LEFT : EnumC7295a.RIGHT;
        }
        String str4 = (String) map.get(C0620k.f1083a);
        if (str4 != null) {
            c7293kf.f24425i = AbstractC7336lb.m14774a(str4);
        }
        return c7293kf;
    }

    /* renamed from: a */
    private static AbstractC7344lh m14922a(AbstractC7344lh abstractC7344lh) {
        if ((abstractC7344lh instanceof C7355lo) || (abstractC7344lh instanceof C7318ku) || (abstractC7344lh instanceof C7333kz) || (abstractC7344lh instanceof C7335la)) {
            return abstractC7344lh;
        }
        if (abstractC7344lh instanceof C7342lf) {
            return new C7333kz(Double.valueOf(((Long) abstractC7344lh.mo14710a()).doubleValue()), C7350ll.m14730a());
        }
        String valueOf = String.valueOf(abstractC7344lh.mo14710a());
        throw new IllegalStateException(new StringBuilder(String.valueOf(valueOf).length() + 43).append("Unexpected value passed to normalizeValue: ").append(valueOf).toString());
    }

    /* renamed from: r */
    private C7293kf m14901r() {
        C7293kf c7293kf = new C7293kf();
        c7293kf.f24419c = this.f24419c;
        c7293kf.f24421e = this.f24421e;
        c7293kf.f24422f = this.f24422f;
        c7293kf.f24423g = this.f24423g;
        c7293kf.f24424h = this.f24424h;
        c7293kf.f24420d = this.f24420d;
        c7293kf.f24425i = this.f24425i;
        return c7293kf;
    }

    /* renamed from: a */
    public C7293kf m14924a(int i) {
        C7293kf m14901r = m14901r();
        m14901r.f24419c = Integer.valueOf(i);
        m14901r.f24420d = EnumC7295a.LEFT;
        return m14901r;
    }

    /* renamed from: a */
    public C7293kf m14923a(AbstractC7336lb abstractC7336lb) {
        C7293kf m14901r = m14901r();
        m14901r.f24425i = abstractC7336lb;
        return m14901r;
    }

    /* renamed from: a */
    public C7293kf m14921a(AbstractC7344lh abstractC7344lh, C7319kv c7319kv) {
        if (f24418b || abstractC7344lh.mo14743e() || abstractC7344lh.mo14739b()) {
            C7392mk.m14607a(!(abstractC7344lh instanceof C7342lf));
            C7293kf m14901r = m14901r();
            m14901r.f24421e = abstractC7344lh;
            m14901r.f24422f = c7319kv;
            return m14901r;
        }
        throw new AssertionError();
    }

    /* renamed from: a */
    public boolean m14925a() {
        return this.f24421e != null;
    }

    /* renamed from: b */
    public C7293kf m14918b(int i) {
        C7293kf m14901r = m14901r();
        m14901r.f24419c = Integer.valueOf(i);
        m14901r.f24420d = EnumC7295a.RIGHT;
        return m14901r;
    }

    /* renamed from: b */
    public C7293kf m14917b(AbstractC7344lh abstractC7344lh, C7319kv c7319kv) {
        if (f24418b || abstractC7344lh.mo14743e() || abstractC7344lh.mo14739b()) {
            C7392mk.m14607a(!(abstractC7344lh instanceof C7342lf));
            C7293kf m14901r = m14901r();
            m14901r.f24423g = abstractC7344lh;
            m14901r.f24424h = c7319kv;
            return m14901r;
        }
        throw new AssertionError();
    }

    /* renamed from: b */
    public AbstractC7344lh m14919b() {
        if (!m14925a()) {
            throw new IllegalArgumentException("Cannot get index start value if start has not been set");
        }
        return this.f24421e;
    }

    /* renamed from: c */
    public C7319kv m14916c() {
        if (!m14925a()) {
            throw new IllegalArgumentException("Cannot get index start name if start has not been set");
        }
        return this.f24422f != null ? this.f24422f : C7319kv.m14830a();
    }

    /* renamed from: d */
    public boolean m14915d() {
        return this.f24423g != null;
    }

    /* renamed from: e */
    public AbstractC7344lh m14914e() {
        if (!m14915d()) {
            throw new IllegalArgumentException("Cannot get index end value if start has not been set");
        }
        return this.f24423g;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C7293kf c7293kf = (C7293kf) obj;
        if (this.f24419c == null ? c7293kf.f24419c != null : !this.f24419c.equals(c7293kf.f24419c)) {
            return false;
        }
        if (this.f24425i == null ? c7293kf.f24425i != null : !this.f24425i.equals(c7293kf.f24425i)) {
            return false;
        }
        if (this.f24424h == null ? c7293kf.f24424h != null : !this.f24424h.equals(c7293kf.f24424h)) {
            return false;
        }
        if (this.f24423g == null ? c7293kf.f24423g != null : !this.f24423g.equals(c7293kf.f24423g)) {
            return false;
        }
        if (this.f24422f == null ? c7293kf.f24422f != null : !this.f24422f.equals(c7293kf.f24422f)) {
            return false;
        }
        if (this.f24421e == null ? c7293kf.f24421e != null : !this.f24421e.equals(c7293kf.f24421e)) {
            return false;
        }
        return m14908k() == c7293kf.m14908k();
    }

    /* renamed from: f */
    public C7319kv m14913f() {
        if (!m14915d()) {
            throw new IllegalArgumentException("Cannot get index end name if start has not been set");
        }
        return this.f24424h != null ? this.f24424h : C7319kv.m14827b();
    }

    /* renamed from: g */
    public boolean m14912g() {
        return this.f24419c != null;
    }

    /* renamed from: h */
    public boolean m14911h() {
        return m14912g() && this.f24420d != null;
    }

    public int hashCode() {
        int i = 0;
        int hashCode = ((this.f24424h != null ? this.f24424h.hashCode() : 0) + (((this.f24423g != null ? this.f24423g.hashCode() : 0) + (((this.f24422f != null ? this.f24422f.hashCode() : 0) + (((this.f24421e != null ? this.f24421e.hashCode() : 0) + (((m14908k() ? 1231 : 1237) + ((this.f24419c != null ? this.f24419c.intValue() : 0) * 31)) * 31)) * 31)) * 31)) * 31)) * 31;
        if (this.f24425i != null) {
            i = this.f24425i.hashCode();
        }
        return hashCode + i;
    }

    /* renamed from: i */
    public int m14910i() {
        if (!m14912g()) {
            throw new IllegalArgumentException("Cannot get limit if limit has not been set");
        }
        return this.f24419c.intValue();
    }

    /* renamed from: j */
    public AbstractC7336lb m14909j() {
        return this.f24425i;
    }

    /* renamed from: k */
    public boolean m14908k() {
        return this.f24420d != null ? this.f24420d == EnumC7295a.LEFT : m14925a();
    }

    /* renamed from: l */
    public Map<String, Object> m14907l() {
        HashMap hashMap = new HashMap();
        if (m14925a()) {
            hashMap.put("sp", this.f24421e.mo14710a());
            if (this.f24422f != null) {
                hashMap.put("sn", this.f24422f.m14823e());
            }
        }
        if (m14915d()) {
            hashMap.put("ep", this.f24423g.mo14710a());
            if (this.f24424h != null) {
                hashMap.put("en", this.f24424h.m14823e());
            }
        }
        if (this.f24419c != null) {
            hashMap.put("l", this.f24419c);
            EnumC7295a enumC7295a = this.f24420d;
            if (enumC7295a == null) {
                enumC7295a = m14925a() ? EnumC7295a.LEFT : EnumC7295a.RIGHT;
            }
            switch (enumC7295a) {
                case LEFT:
                    hashMap.put(C1831e.f4915cI, "l");
                    break;
                case RIGHT:
                    hashMap.put(C1831e.f4915cI, "r");
                    break;
            }
        }
        if (!this.f24425i.equals(C7349lk.m14731d())) {
            hashMap.put(C0620k.f1083a, this.f24425i.mo14699c());
        }
        return hashMap;
    }

    /* renamed from: m */
    public boolean m14906m() {
        return !m14925a() && !m14915d() && !m14912g();
    }

    /* renamed from: n */
    public boolean m14905n() {
        return m14906m() && this.f24425i.equals(C7349lk.m14731d());
    }

    /* renamed from: o */
    public boolean m14904o() {
        return !m14925a() || !m14915d() || !m14912g() || m14911h();
    }

    /* renamed from: p */
    public String m14903p() {
        if (this.f24426j == null) {
            try {
                this.f24426j = C7380mb.m14634a(m14907l());
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        return this.f24426j;
    }

    /* renamed from: q */
    public AbstractC7309ko m14902q() {
        return m14906m() ? new C7306kl(m14909j()) : m14912g() ? new C7308kn(this) : new C7311kp(this);
    }

    public String toString() {
        return m14907l().toString();
    }
}
