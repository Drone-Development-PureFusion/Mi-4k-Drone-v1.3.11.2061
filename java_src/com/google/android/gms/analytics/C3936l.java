package com.google.android.gms.analytics;

import com.google.android.gms.common.internal.C4588d;
import com.google.android.gms.common.util.AbstractC4682e;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* renamed from: com.google.android.gms.analytics.l */
/* loaded from: classes2.dex */
public final class C3936l {

    /* renamed from: a */
    private final AbstractC3939o f15201a;

    /* renamed from: b */
    private final AbstractC4682e f15202b;

    /* renamed from: c */
    private boolean f15203c;

    /* renamed from: d */
    private long f15204d;

    /* renamed from: e */
    private long f15205e;

    /* renamed from: f */
    private long f15206f;

    /* renamed from: g */
    private long f15207g;

    /* renamed from: h */
    private long f15208h;

    /* renamed from: i */
    private boolean f15209i;

    /* renamed from: j */
    private final Map<Class<? extends AbstractC3938n>, AbstractC3938n> f15210j;

    /* renamed from: k */
    private final List<AbstractC3947r> f15211k;

    C3936l(C3936l c3936l) {
        this.f15201a = c3936l.f15201a;
        this.f15202b = c3936l.f15202b;
        this.f15204d = c3936l.f15204d;
        this.f15205e = c3936l.f15205e;
        this.f15206f = c3936l.f15206f;
        this.f15207g = c3936l.f15207g;
        this.f15208h = c3936l.f15208h;
        this.f15211k = new ArrayList(c3936l.f15211k);
        this.f15210j = new HashMap(c3936l.f15210j.size());
        for (Map.Entry<Class<? extends AbstractC3938n>, AbstractC3938n> entry : c3936l.f15210j.entrySet()) {
            AbstractC3938n m25993c = m25993c(entry.getKey());
            entry.getValue().mo17922a(m25993c);
            this.f15210j.put(entry.getKey(), m25993c);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C3936l(AbstractC3939o abstractC3939o, AbstractC4682e abstractC4682e) {
        C4588d.m23627a(abstractC3939o);
        C4588d.m23627a(abstractC4682e);
        this.f15201a = abstractC3939o;
        this.f15202b = abstractC4682e;
        this.f15207g = 1800000L;
        this.f15208h = 3024000000L;
        this.f15210j = new HashMap();
        this.f15211k = new ArrayList();
    }

    /* renamed from: c */
    private static <T extends AbstractC3938n> T m25993c(Class<T> cls) {
        try {
            return cls.newInstance();
        } catch (IllegalAccessException e) {
            throw new IllegalArgumentException("dataType default constructor is not accessible", e);
        } catch (InstantiationException e2) {
            throw new IllegalArgumentException("dataType doesn't have default constructor", e2);
        }
    }

    /* renamed from: a */
    public C3936l m26000a() {
        return new C3936l(this);
    }

    /* renamed from: a */
    public <T extends AbstractC3938n> T m25997a(Class<T> cls) {
        return (T) this.f15210j.get(cls);
    }

    /* renamed from: a */
    public void m25999a(long j) {
        this.f15205e = j;
    }

    /* renamed from: a */
    public void m25998a(AbstractC3938n abstractC3938n) {
        C4588d.m23627a(abstractC3938n);
        Class<?> cls = abstractC3938n.getClass();
        if (cls.getSuperclass() != AbstractC3938n.class) {
            throw new IllegalArgumentException();
        }
        abstractC3938n.mo17922a(m25995b(cls));
    }

    /* renamed from: b */
    public <T extends AbstractC3938n> T m25995b(Class<T> cls) {
        T t = (T) this.f15210j.get(cls);
        if (t == null) {
            T t2 = (T) m25993c(cls);
            this.f15210j.put(cls, t2);
            return t2;
        }
        return t;
    }

    /* renamed from: b */
    public Collection<AbstractC3938n> m25996b() {
        return this.f15210j.values();
    }

    /* renamed from: c */
    public List<AbstractC3947r> m25994c() {
        return this.f15211k;
    }

    /* renamed from: d */
    public long m25992d() {
        return this.f15204d;
    }

    /* renamed from: e */
    public void m25991e() {
        m25987i().m25972a(this);
    }

    /* renamed from: f */
    public boolean m25990f() {
        return this.f15203c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public void m25989g() {
        this.f15206f = this.f15202b.mo16432b();
        if (this.f15205e != 0) {
            this.f15204d = this.f15205e;
        } else {
            this.f15204d = this.f15202b.mo16434a();
        }
        this.f15203c = true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public AbstractC3939o m25988h() {
        return this.f15201a;
    }

    /* renamed from: i */
    C3940p m25987i() {
        return this.f15201a.m25975o();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public boolean m25986j() {
        return this.f15209i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k */
    public void m25985k() {
        this.f15209i = true;
    }
}
