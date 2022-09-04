package com.google.firebase.database;

import com.google.android.gms.internal.AbstractC7151ie;
import com.google.android.gms.internal.AbstractC7344lh;
import com.google.android.gms.internal.C7139hz;
import com.google.android.gms.internal.C7160ij;
import com.google.android.gms.internal.C7164im;
import com.google.android.gms.internal.C7237ja;
import com.google.android.gms.internal.C7242jd;
import com.google.android.gms.internal.C7293kf;
import com.google.android.gms.internal.C7296kg;
import com.google.android.gms.internal.C7318ku;
import com.google.android.gms.internal.C7319kv;
import com.google.android.gms.internal.C7333kz;
import com.google.android.gms.internal.C7335la;
import com.google.android.gms.internal.C7338ld;
import com.google.android.gms.internal.C7348lj;
import com.google.android.gms.internal.C7349lk;
import com.google.android.gms.internal.C7350ll;
import com.google.android.gms.internal.C7355lo;
import com.google.android.gms.internal.C7357lp;
import com.google.android.gms.internal.C7392mk;
import com.google.android.gms.internal.C7394ml;
/* renamed from: com.google.firebase.database.n */
/* loaded from: classes2.dex */
public class C9890n {

    /* renamed from: d */
    static final /* synthetic */ boolean f30762d;

    /* renamed from: a */
    protected final C7164im f30763a;

    /* renamed from: b */
    protected final C7160ij f30764b;

    /* renamed from: c */
    protected final C7293kf f30765c;

    /* renamed from: e */
    private final boolean f30766e;

    static {
        f30762d = !C9890n.class.desiredAssertionStatus();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C9890n(C7164im c7164im, C7160ij c7160ij) {
        this.f30763a = c7164im;
        this.f30764b = c7160ij;
        this.f30765c = C7293kf.f24417a;
        this.f30766e = false;
    }

    C9890n(C7164im c7164im, C7160ij c7160ij, C7293kf c7293kf, boolean z) {
        this.f30763a = c7164im;
        this.f30764b = c7160ij;
        this.f30765c = c7293kf;
        this.f30766e = z;
        C7392mk.m14606a(c7293kf.m14904o(), "Validation of queries failed.");
    }

    /* renamed from: a */
    private C9890n m6687a(AbstractC7344lh abstractC7344lh, String str) {
        C7394ml.m14596c(str);
        if (abstractC7344lh.mo14743e() || abstractC7344lh.mo14739b()) {
            if (this.f30765c.m14925a()) {
                throw new IllegalArgumentException("Can't call startAt() or equalTo() multiple times");
            }
            C7293kf m14921a = this.f30765c.m14921a(abstractC7344lh, str != null ? C7319kv.m14828a(str) : null);
            m6676b(m14921a);
            m6688a(m14921a);
            if (!f30762d && !m14921a.m14904o()) {
                throw new AssertionError();
            }
            return new C9890n(this.f30763a, this.f30764b, m14921a, this.f30766e);
        }
        throw new IllegalArgumentException("Can only use simple values for startAt()");
    }

    /* renamed from: a */
    private void m6693a() {
        if (this.f30765c.m14925a()) {
            throw new IllegalArgumentException("Can't call equalTo() and startAt() combined");
        }
        if (!this.f30765c.m14915d()) {
            return;
        }
        throw new IllegalArgumentException("Can't call equalTo() and endAt() combined");
    }

    /* renamed from: a */
    private void m6689a(final AbstractC7151ie abstractC7151ie) {
        C7242jd.m15107a().m15104c(abstractC7151ie);
        this.f30763a.m15320a(new Runnable() { // from class: com.google.firebase.database.n.2
            @Override // java.lang.Runnable
            public void run() {
                C9890n.this.f30763a.m15344a(abstractC7151ie);
            }
        });
    }

    /* renamed from: a */
    private void m6688a(C7293kf c7293kf) {
        if (!c7293kf.m14909j().equals(C7338ld.m14761d())) {
            if (!c7293kf.m14909j().equals(C7349lk.m14731d())) {
                return;
            }
            if ((c7293kf.m14925a() && !C7350ll.m14729a(c7293kf.m14919b())) || (c7293kf.m14915d() && !C7350ll.m14729a(c7293kf.m14914e()))) {
                throw new IllegalArgumentException("When using orderByPriority(), values provided to startAt(), endAt(), or equalTo() must be valid priorities.");
            }
            return;
        }
        if (c7293kf.m14925a()) {
            AbstractC7344lh m14919b = c7293kf.m14919b();
            if (c7293kf.m14916c() != C7319kv.m14830a() || !(m14919b instanceof C7355lo)) {
                throw new IllegalArgumentException("You must use startAt(String value), endAt(String value) or equalTo(String value) in combination with orderByKey(). Other type of values or using the version with 2 parameters is not supported");
            }
        }
        if (!c7293kf.m14915d()) {
            return;
        }
        AbstractC7344lh m14914e = c7293kf.m14914e();
        if (c7293kf.m14913f() == C7319kv.m14827b() && (m14914e instanceof C7355lo)) {
            return;
        }
        throw new IllegalArgumentException("You must use startAt(String value), endAt(String value) or equalTo(String value) in combination with orderByKey(). Other type of values or using the version with 2 parameters is not supported");
    }

    /* renamed from: b */
    private C9890n m6675b(AbstractC7344lh abstractC7344lh, String str) {
        C7394ml.m14596c(str);
        if (abstractC7344lh.mo14743e() || abstractC7344lh.mo14739b()) {
            C7319kv m14828a = str != null ? C7319kv.m14828a(str) : null;
            if (this.f30765c.m14915d()) {
                throw new IllegalArgumentException("Can't call endAt() or equalTo() multiple times");
            }
            C7293kf m14917b = this.f30765c.m14917b(abstractC7344lh, m14828a);
            m6676b(m14917b);
            m6688a(m14917b);
            if (!f30762d && !m14917b.m14904o()) {
                throw new AssertionError();
            }
            return new C9890n(this.f30763a, this.f30764b, m14917b, this.f30766e);
        }
        throw new IllegalArgumentException("Can only use simple values for endAt()");
    }

    /* renamed from: b */
    private void m6681b() {
        if (this.f30766e) {
            throw new IllegalArgumentException("You can't combine multiple orderBy calls!");
        }
    }

    /* renamed from: b */
    private void m6677b(final AbstractC7151ie abstractC7151ie) {
        C7242jd.m15107a().m15105b(abstractC7151ie);
        this.f30763a.m15320a(new Runnable() { // from class: com.google.firebase.database.n.3
            @Override // java.lang.Runnable
            public void run() {
                C9890n.this.f30763a.m15314b(abstractC7151ie);
            }
        });
    }

    /* renamed from: b */
    private void m6676b(C7293kf c7293kf) {
        if (!c7293kf.m14925a() || !c7293kf.m14915d() || !c7293kf.m14912g() || c7293kf.m14911h()) {
            return;
        }
        throw new IllegalArgumentException("Can't combine startAt(), endAt() and limit(). Use limitToFirst() or limitToLast() instead");
    }

    /* renamed from: a */
    public AbstractC9827a m6686a(AbstractC9827a abstractC9827a) {
        m6677b(new C7139hz(this.f30763a, abstractC9827a, m6653o()));
        return abstractC9827a;
    }

    /* renamed from: a */
    public C9890n m6692a(double d) {
        return m6691a(d, (String) null);
    }

    /* renamed from: a */
    public C9890n m6691a(double d, String str) {
        return m6687a(new C7333kz(Double.valueOf(d), C7350ll.m14730a()), str);
    }

    /* renamed from: a */
    public C9890n m6690a(int i) {
        if (i <= 0) {
            throw new IllegalArgumentException("Limit must be a positive integer!");
        }
        if (!this.f30765c.m14912g()) {
            return new C9890n(this.f30763a, this.f30764b, this.f30765c.m14924a(i), this.f30766e);
        }
        throw new IllegalArgumentException("Can't call limitToLast on query with previously set limit!");
    }

    /* renamed from: a */
    public C9890n m6684a(String str, String str2) {
        return m6687a(str != null ? new C7355lo(str, C7350ll.m14730a()) : C7335la.m14778j(), str2);
    }

    /* renamed from: a */
    public C9890n m6682a(boolean z, String str) {
        return m6687a(new C7318ku(Boolean.valueOf(z), C7350ll.m14730a()), str);
    }

    /* renamed from: a */
    public AbstractC9901r m6685a(AbstractC9901r abstractC9901r) {
        m6677b(new C7237ja(this.f30763a, abstractC9901r, m6653o()));
        return abstractC9901r;
    }

    /* renamed from: a */
    public void m6683a(final boolean z) {
        if (this.f30764b.m15356h() || !this.f30764b.m15363d().equals(C7319kv.m14824d())) {
            this.f30763a.m15320a(new Runnable() { // from class: com.google.firebase.database.n.4
                @Override // java.lang.Runnable
                public void run() {
                    C9890n.this.f30763a.m15323a(C9890n.this.m6653o(), z);
                }
            });
            return;
        }
        throw new C9866d("Can't call keepSynced() on .info paths.");
    }

    /* renamed from: b */
    public C9890n m6680b(double d) {
        return m6679b(d, (String) null);
    }

    /* renamed from: b */
    public C9890n m6679b(double d, String str) {
        return m6675b(new C7333kz(Double.valueOf(d), C7350ll.m14730a()), str);
    }

    /* renamed from: b */
    public C9890n m6678b(int i) {
        if (i <= 0) {
            throw new IllegalArgumentException("Limit must be a positive integer!");
        }
        if (!this.f30765c.m14912g()) {
            return new C9890n(this.f30763a, this.f30764b, this.f30765c.m14918b(i), this.f30766e);
        }
        throw new IllegalArgumentException("Can't call limitToLast on query with previously set limit!");
    }

    /* renamed from: b */
    public C9890n m6672b(String str) {
        return m6684a(str, (String) null);
    }

    /* renamed from: b */
    public C9890n m6671b(String str, String str2) {
        return m6675b(str != null ? new C7355lo(str, C7350ll.m14730a()) : C7335la.m14778j(), str2);
    }

    /* renamed from: b */
    public C9890n m6670b(boolean z) {
        return m6682a(z, (String) null);
    }

    /* renamed from: b */
    public C9890n m6669b(boolean z, String str) {
        return m6675b(new C7318ku(Boolean.valueOf(z), C7350ll.m14730a()), str);
    }

    /* renamed from: b */
    public void m6674b(AbstractC9827a abstractC9827a) {
        if (abstractC9827a == null) {
            throw new NullPointerException("listener must not be null");
        }
        m6689a(new C7139hz(this.f30763a, abstractC9827a, m6653o()));
    }

    /* renamed from: b */
    public void m6673b(final AbstractC9901r abstractC9901r) {
        m6677b(new C7237ja(this.f30763a, new AbstractC9901r() { // from class: com.google.firebase.database.n.1
            @Override // com.google.firebase.database.AbstractC9901r
            /* renamed from: a */
            public void mo6645a(C9828b c9828b) {
                C9890n.this.m6666c(this);
                abstractC9901r.mo6645a(c9828b);
            }

            @Override // com.google.firebase.database.AbstractC9901r
            /* renamed from: a */
            public void mo6644a(C9831c c9831c) {
                abstractC9901r.mo6644a(c9831c);
            }
        }, m6653o()));
    }

    /* renamed from: c */
    public C9890n m6668c(double d) {
        m6693a();
        return m6692a(d).m6680b(d);
    }

    /* renamed from: c */
    public C9890n m6667c(double d, String str) {
        m6693a();
        return m6691a(d, str).m6679b(d, str);
    }

    /* renamed from: c */
    public C9890n m6665c(String str) {
        return m6671b(str, (String) null);
    }

    /* renamed from: c */
    public C9890n m6664c(String str, String str2) {
        m6693a();
        return m6684a(str, str2).m6671b(str, str2);
    }

    /* renamed from: c */
    public C9890n m6663c(boolean z) {
        return m6669b(z, (String) null);
    }

    /* renamed from: c */
    public C9890n m6662c(boolean z, String str) {
        m6693a();
        return m6682a(z, str).m6669b(z, str);
    }

    /* renamed from: c */
    public void m6666c(AbstractC9901r abstractC9901r) {
        if (abstractC9901r == null) {
            throw new NullPointerException("listener must not be null");
        }
        m6689a(new C7237ja(this.f30763a, abstractC9901r, m6653o()));
    }

    /* renamed from: d */
    public C9890n m6661d(String str) {
        m6693a();
        return m6672b(str).m6665c(str);
    }

    /* renamed from: d */
    public C9890n m6660d(boolean z) {
        m6693a();
        return m6670b(z).m6663c(z);
    }

    /* renamed from: e */
    public C9890n m6659e(String str) {
        if (str == null) {
            throw new NullPointerException("Key can't be null");
        }
        if (str.equals("$key") || str.equals(".key")) {
            throw new IllegalArgumentException(new StringBuilder(String.valueOf(str).length() + 54).append("Can't use '").append(str).append("' as path, please use orderByKey() instead!").toString());
        }
        if (str.equals("$priority") || str.equals(".priority")) {
            throw new IllegalArgumentException(new StringBuilder(String.valueOf(str).length() + 59).append("Can't use '").append(str).append("' as path, please use orderByPriority() instead!").toString());
        }
        if (str.equals("$value") || str.equals(".value")) {
            throw new IllegalArgumentException(new StringBuilder(String.valueOf(str).length() + 56).append("Can't use '").append(str).append("' as path, please use orderByValue() instead!").toString());
        }
        C7394ml.m14599a(str);
        m6681b();
        C7160ij c7160ij = new C7160ij(str);
        if (c7160ij.m15355i() == 0) {
            throw new IllegalArgumentException("Can't use empty path, use orderByValue() instead!");
        }
        return new C9890n(this.f30763a, this.f30764b, this.f30765c.m14923a(new C7348lj(c7160ij)), true);
    }

    /* renamed from: j */
    public C9890n m6658j() {
        m6681b();
        C7293kf m14923a = this.f30765c.m14923a(C7349lk.m14731d());
        m6688a(m14923a);
        return new C9890n(this.f30763a, this.f30764b, m14923a, true);
    }

    /* renamed from: k */
    public C9890n m6657k() {
        m6681b();
        C7293kf m14923a = this.f30765c.m14923a(C7338ld.m14761d());
        m6688a(m14923a);
        return new C9890n(this.f30763a, this.f30764b, m14923a, true);
    }

    /* renamed from: l */
    public C9890n m6656l() {
        m6681b();
        return new C9890n(this.f30763a, this.f30764b, this.f30765c.m14923a(C7357lp.m14698d()), true);
    }

    /* renamed from: m */
    public C9867e m6655m() {
        return new C9867e(this.f30763a, m6654n());
    }

    /* renamed from: n */
    public C7160ij m6654n() {
        return this.f30764b;
    }

    /* renamed from: o */
    public C7296kg m6653o() {
        return new C7296kg(this.f30764b, this.f30765c);
    }
}
