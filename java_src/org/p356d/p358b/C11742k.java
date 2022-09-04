package org.p356d.p358b;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Queue;
import org.p356d.AbstractC11747c;
import org.p356d.AbstractC11759f;
import org.p356d.p357a.AbstractC11728d;
import org.p356d.p357a.C11726b;
import org.p356d.p357a.C11729e;
/* renamed from: org.d.b.k */
/* loaded from: classes3.dex */
public class C11742k implements AbstractC11747c {

    /* renamed from: a */
    private final String f37049a;

    /* renamed from: b */
    private volatile AbstractC11747c f37050b;

    /* renamed from: d */
    private Boolean f37051d;

    /* renamed from: e */
    private Method f37052e;

    /* renamed from: f */
    private C11726b f37053f;

    /* renamed from: g */
    private Queue<C11729e> f37054g;

    /* renamed from: h */
    private final boolean f37055h;

    public C11742k(String str, Queue<C11729e> queue, boolean z) {
        this.f37049a = str;
        this.f37054g = queue;
        this.f37055h = z;
    }

    /* renamed from: f */
    private AbstractC11747c m132f() {
        if (this.f37053f == null) {
            this.f37053f = new C11726b(this, this.f37054g);
        }
        return this.f37053f;
    }

    /* renamed from: a */
    AbstractC11747c m138a() {
        return this.f37050b != null ? this.f37050b : this.f37055h ? C11738g.f37047a : m132f();
    }

    @Override // org.p356d.AbstractC11747c
    /* renamed from: a */
    public void mo118a(String str, Object obj) {
        m138a().mo118a(str, obj);
    }

    @Override // org.p356d.AbstractC11747c
    /* renamed from: a */
    public void mo117a(String str, Object obj, Object obj2) {
        m138a().mo117a(str, obj, obj2);
    }

    @Override // org.p356d.AbstractC11747c
    /* renamed from: a */
    public void mo116a(String str, Throwable th) {
        m138a().mo116a(str, th);
    }

    @Override // org.p356d.AbstractC11747c
    /* renamed from: a */
    public void mo115a(String str, Object... objArr) {
        m138a().mo115a(str, objArr);
    }

    /* renamed from: a */
    public void m137a(AbstractC11728d abstractC11728d) {
        if (m135b()) {
            try {
                this.f37052e.invoke(this.f37050b, abstractC11728d);
            } catch (IllegalAccessException e) {
            } catch (IllegalArgumentException e2) {
            } catch (InvocationTargetException e3) {
            }
        }
    }

    /* renamed from: a */
    public void m136a(AbstractC11747c abstractC11747c) {
        this.f37050b = abstractC11747c;
    }

    @Override // org.p356d.AbstractC11747c
    /* renamed from: a */
    public void mo113a(AbstractC11759f abstractC11759f, String str) {
        m138a().mo113a(abstractC11759f, str);
    }

    @Override // org.p356d.AbstractC11747c
    /* renamed from: a */
    public void mo112a(AbstractC11759f abstractC11759f, String str, Object obj) {
        m138a().mo112a(abstractC11759f, str, obj);
    }

    @Override // org.p356d.AbstractC11747c
    /* renamed from: a */
    public void mo111a(AbstractC11759f abstractC11759f, String str, Object obj, Object obj2) {
        m138a().mo111a(abstractC11759f, str, obj, obj2);
    }

    @Override // org.p356d.AbstractC11747c
    /* renamed from: a */
    public void mo110a(AbstractC11759f abstractC11759f, String str, Throwable th) {
        m138a().mo110a(abstractC11759f, str, th);
    }

    @Override // org.p356d.AbstractC11747c
    /* renamed from: a */
    public void mo109a(AbstractC11759f abstractC11759f, String str, Object... objArr) {
        m138a().mo109a(abstractC11759f, str, objArr);
    }

    @Override // org.p356d.AbstractC11747c
    /* renamed from: a */
    public boolean mo114a(AbstractC11759f abstractC11759f) {
        return m138a().mo114a(abstractC11759f);
    }

    @Override // org.p356d.AbstractC11747c
    /* renamed from: b */
    public void mo108b(String str, Object obj) {
        m138a().mo108b(str, obj);
    }

    @Override // org.p356d.AbstractC11747c
    /* renamed from: b */
    public void mo107b(String str, Object obj, Object obj2) {
        m138a().mo107b(str, obj, obj2);
    }

    @Override // org.p356d.AbstractC11747c
    /* renamed from: b */
    public void mo106b(String str, Throwable th) {
        m138a().mo106b(str, th);
    }

    @Override // org.p356d.AbstractC11747c
    /* renamed from: b */
    public void mo105b(String str, Object... objArr) {
        m138a().mo105b(str, objArr);
    }

    @Override // org.p356d.AbstractC11747c
    /* renamed from: b */
    public void mo103b(AbstractC11759f abstractC11759f, String str) {
        m138a().mo103b(abstractC11759f, str);
    }

    @Override // org.p356d.AbstractC11747c
    /* renamed from: b */
    public void mo102b(AbstractC11759f abstractC11759f, String str, Object obj) {
        m138a().mo102b(abstractC11759f, str, obj);
    }

    @Override // org.p356d.AbstractC11747c
    /* renamed from: b */
    public void mo101b(AbstractC11759f abstractC11759f, String str, Object obj, Object obj2) {
        m138a().mo101b(abstractC11759f, str, obj, obj2);
    }

    @Override // org.p356d.AbstractC11747c
    /* renamed from: b */
    public void mo100b(AbstractC11759f abstractC11759f, String str, Throwable th) {
        m138a().mo100b(abstractC11759f, str, th);
    }

    @Override // org.p356d.AbstractC11747c
    /* renamed from: b */
    public void mo99b(AbstractC11759f abstractC11759f, String str, Object... objArr) {
        m138a().mo99b(abstractC11759f, str, objArr);
    }

    /* renamed from: b */
    public boolean m135b() {
        if (this.f37051d != null) {
            return this.f37051d.booleanValue();
        }
        try {
            this.f37052e = this.f37050b.getClass().getMethod("log", AbstractC11728d.class);
            this.f37051d = Boolean.TRUE;
        } catch (NoSuchMethodException e) {
            this.f37051d = Boolean.FALSE;
        }
        return this.f37051d.booleanValue();
    }

    @Override // org.p356d.AbstractC11747c
    /* renamed from: b */
    public boolean mo104b(AbstractC11759f abstractC11759f) {
        return m138a().mo104b(abstractC11759f);
    }

    @Override // org.p356d.AbstractC11747c
    /* renamed from: c */
    public void mo98c(String str, Object obj) {
        m138a().mo98c(str, obj);
    }

    @Override // org.p356d.AbstractC11747c
    /* renamed from: c */
    public void mo97c(String str, Object obj, Object obj2) {
        m138a().mo97c(str, obj, obj2);
    }

    @Override // org.p356d.AbstractC11747c
    /* renamed from: c */
    public void mo96c(String str, Throwable th) {
        m138a().mo96c(str, th);
    }

    @Override // org.p356d.AbstractC11747c
    /* renamed from: c */
    public void mo95c(String str, Object... objArr) {
        m138a().mo95c(str, objArr);
    }

    @Override // org.p356d.AbstractC11747c
    /* renamed from: c */
    public void mo93c(AbstractC11759f abstractC11759f, String str) {
        m138a().mo93c(abstractC11759f, str);
    }

    @Override // org.p356d.AbstractC11747c
    /* renamed from: c */
    public void mo92c(AbstractC11759f abstractC11759f, String str, Object obj) {
        m138a().mo92c(abstractC11759f, str, obj);
    }

    @Override // org.p356d.AbstractC11747c
    /* renamed from: c */
    public void mo91c(AbstractC11759f abstractC11759f, String str, Object obj, Object obj2) {
        m138a().mo91c(abstractC11759f, str, obj, obj2);
    }

    @Override // org.p356d.AbstractC11747c
    /* renamed from: c */
    public void mo90c(AbstractC11759f abstractC11759f, String str, Throwable th) {
        m138a().mo90c(abstractC11759f, str, th);
    }

    @Override // org.p356d.AbstractC11747c
    /* renamed from: c */
    public void mo89c(AbstractC11759f abstractC11759f, String str, Object... objArr) {
        m138a().mo89c(abstractC11759f, str, objArr);
    }

    /* renamed from: c */
    public boolean m134c() {
        return this.f37050b == null;
    }

    @Override // org.p356d.AbstractC11747c
    /* renamed from: c */
    public boolean mo94c(AbstractC11759f abstractC11759f) {
        return m138a().mo94c(abstractC11759f);
    }

    @Override // org.p356d.AbstractC11747c
    /* renamed from: d */
    public String mo88d() {
        return this.f37049a;
    }

    @Override // org.p356d.AbstractC11747c
    /* renamed from: d */
    public void mo87d(String str, Object obj) {
        m138a().mo87d(str, obj);
    }

    @Override // org.p356d.AbstractC11747c
    /* renamed from: d */
    public void mo86d(String str, Object obj, Object obj2) {
        m138a().mo86d(str, obj, obj2);
    }

    @Override // org.p356d.AbstractC11747c
    /* renamed from: d */
    public void mo85d(String str, Throwable th) {
        m138a().mo85d(str, th);
    }

    @Override // org.p356d.AbstractC11747c
    /* renamed from: d */
    public void mo84d(String str, Object... objArr) {
        m138a().mo84d(str, objArr);
    }

    @Override // org.p356d.AbstractC11747c
    /* renamed from: d */
    public void mo82d(AbstractC11759f abstractC11759f, String str) {
        m138a().mo82d(abstractC11759f, str);
    }

    @Override // org.p356d.AbstractC11747c
    /* renamed from: d */
    public void mo81d(AbstractC11759f abstractC11759f, String str, Object obj) {
        m138a().mo81d(abstractC11759f, str, obj);
    }

    @Override // org.p356d.AbstractC11747c
    /* renamed from: d */
    public void mo80d(AbstractC11759f abstractC11759f, String str, Object obj, Object obj2) {
        m138a().mo80d(abstractC11759f, str, obj, obj2);
    }

    @Override // org.p356d.AbstractC11747c
    /* renamed from: d */
    public void mo79d(AbstractC11759f abstractC11759f, String str, Throwable th) {
        m138a().mo79d(abstractC11759f, str, th);
    }

    @Override // org.p356d.AbstractC11747c
    /* renamed from: d */
    public void mo78d(AbstractC11759f abstractC11759f, String str, Object... objArr) {
        m138a().mo78d(abstractC11759f, str, objArr);
    }

    @Override // org.p356d.AbstractC11747c
    /* renamed from: d */
    public boolean mo83d(AbstractC11759f abstractC11759f) {
        return m138a().mo83d(abstractC11759f);
    }

    @Override // org.p356d.AbstractC11747c
    /* renamed from: e */
    public void mo77e(String str, Object obj) {
        m138a().mo77e(str, obj);
    }

    @Override // org.p356d.AbstractC11747c
    /* renamed from: e */
    public void mo76e(String str, Object obj, Object obj2) {
        m138a().mo76e(str, obj, obj2);
    }

    @Override // org.p356d.AbstractC11747c
    /* renamed from: e */
    public void mo75e(String str, Throwable th) {
        m138a().mo75e(str, th);
    }

    @Override // org.p356d.AbstractC11747c
    /* renamed from: e */
    public void mo74e(String str, Object... objArr) {
        m138a().mo74e(str, objArr);
    }

    @Override // org.p356d.AbstractC11747c
    /* renamed from: e */
    public void mo72e(AbstractC11759f abstractC11759f, String str) {
        m138a().mo72e(abstractC11759f, str);
    }

    @Override // org.p356d.AbstractC11747c
    /* renamed from: e */
    public void mo71e(AbstractC11759f abstractC11759f, String str, Object obj) {
        m138a().mo71e(abstractC11759f, str, obj);
    }

    @Override // org.p356d.AbstractC11747c
    /* renamed from: e */
    public void mo70e(AbstractC11759f abstractC11759f, String str, Object obj, Object obj2) {
        m138a().mo70e(abstractC11759f, str, obj, obj2);
    }

    @Override // org.p356d.AbstractC11747c
    /* renamed from: e */
    public void mo69e(AbstractC11759f abstractC11759f, String str, Throwable th) {
        m138a().mo69e(abstractC11759f, str, th);
    }

    @Override // org.p356d.AbstractC11747c
    /* renamed from: e */
    public void mo68e(AbstractC11759f abstractC11759f, String str, Object... objArr) {
        m138a().mo68e(abstractC11759f, str, objArr);
    }

    /* renamed from: e */
    public boolean m133e() {
        return this.f37050b instanceof C11738g;
    }

    @Override // org.p356d.AbstractC11747c
    /* renamed from: e */
    public boolean mo73e(AbstractC11759f abstractC11759f) {
        return m138a().mo73e(abstractC11759f);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.f37049a.equals(((C11742k) obj).f37049a);
    }

    @Override // org.p356d.AbstractC11747c
    /* renamed from: f */
    public void mo67f(String str) {
        m138a().mo67f(str);
    }

    @Override // org.p356d.AbstractC11747c
    /* renamed from: g */
    public void mo66g(String str) {
        m138a().mo66g(str);
    }

    @Override // org.p356d.AbstractC11747c
    /* renamed from: h */
    public void mo64h(String str) {
        m138a().mo64h(str);
    }

    @Override // org.p356d.AbstractC11747c
    /* renamed from: h */
    public boolean mo65h() {
        return m138a().mo65h();
    }

    public int hashCode() {
        return this.f37049a.hashCode();
    }

    @Override // org.p356d.AbstractC11747c
    /* renamed from: i */
    public void mo62i(String str) {
        m138a().mo62i(str);
    }

    @Override // org.p356d.AbstractC11747c
    /* renamed from: i */
    public boolean mo63i() {
        return m138a().mo63i();
    }

    @Override // org.p356d.AbstractC11747c
    /* renamed from: j */
    public void mo60j(String str) {
        m138a().mo60j(str);
    }

    @Override // org.p356d.AbstractC11747c
    /* renamed from: j */
    public boolean mo61j() {
        return m138a().mo61j();
    }

    @Override // org.p356d.AbstractC11747c
    /* renamed from: k */
    public boolean mo59k() {
        return m138a().mo59k();
    }

    @Override // org.p356d.AbstractC11747c
    /* renamed from: l */
    public boolean mo58l() {
        return m138a().mo58l();
    }
}
