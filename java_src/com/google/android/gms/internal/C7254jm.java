package com.google.android.gms.internal;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
/* renamed from: com.google.android.gms.internal.jm */
/* loaded from: classes2.dex */
public class C7254jm implements AbstractC7257jp {

    /* renamed from: a */
    static final /* synthetic */ boolean f24338a;

    /* renamed from: b */
    private final AbstractC7258jq f24339b;

    /* renamed from: c */
    private final C7264jt f24340c;

    /* renamed from: d */
    private final C7315ks f24341d;

    /* renamed from: e */
    private final AbstractC7251jk f24342e;

    /* renamed from: f */
    private long f24343f;

    static {
        f24338a = !C7254jm.class.desiredAssertionStatus();
    }

    public C7254jm(C7146ic c7146ic, AbstractC7258jq abstractC7258jq, AbstractC7251jk abstractC7251jk) {
        this(c7146ic, abstractC7258jq, abstractC7251jk, new C7382md());
    }

    public C7254jm(C7146ic c7146ic, AbstractC7258jq abstractC7258jq, AbstractC7251jk abstractC7251jk, AbstractC7381mc abstractC7381mc) {
        this.f24343f = 0L;
        this.f24339b = abstractC7258jq;
        this.f24341d = c7146ic.m15413a("Persistence");
        this.f24340c = new C7264jt(this.f24339b, this.f24341d, abstractC7381mc);
        this.f24342e = abstractC7251jk;
    }

    /* renamed from: c */
    private void m15087c() {
        this.f24343f++;
        if (this.f24342e.mo15085a(this.f24343f)) {
            if (this.f24341d.m14844a()) {
                this.f24341d.m14840a("Reached prune check threshold.", new Object[0]);
            }
            this.f24343f = 0L;
            boolean z = true;
            long mo15053b = this.f24339b.mo15053b();
            if (this.f24341d.m14844a()) {
                this.f24341d.m14840a(new StringBuilder(32).append("Cache size: ").append(mo15053b).toString(), new Object[0]);
            }
            while (z && this.f24342e.mo15084a(mo15053b, this.f24340c.m15030a())) {
                C7259jr m15028a = this.f24340c.m15028a(this.f24342e);
                if (m15028a.m15043a()) {
                    this.f24339b.mo15058a(C7160ij.m15371a(), m15028a);
                } else {
                    z = false;
                }
                mo15053b = this.f24339b.mo15053b();
                if (this.f24341d.m14844a()) {
                    this.f24341d.m14840a(new StringBuilder(44).append("Cache size after prune: ").append(mo15053b).toString(), new Object[0]);
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.AbstractC7257jp
    /* renamed from: a */
    public C7282jy mo15075a(C7296kg c7296kg) {
        Set<C7319kv> m15020b;
        boolean z;
        if (this.f24340c.m15009f(c7296kg)) {
            C7263js m15023a = this.f24340c.m15023a(c7296kg);
            m15020b = (c7296kg.m14894e() || m15023a == null || !m15023a.f24356d) ? null : this.f24339b.mo15047d(m15023a.f24353a);
            z = true;
        } else {
            m15020b = this.f24340c.m15020b(c7296kg.m14900a());
            z = false;
        }
        AbstractC7344lh mo15061a = this.f24339b.mo15061a(c7296kg.m14900a());
        if (m15020b != null) {
            C7335la m14778j = C7335la.m14778j();
            for (C7319kv c7319kv : m15020b) {
                m14778j = m14778j.mo14748a(c7319kv, mo15061a.mo14738c(c7319kv));
            }
            return new C7282jy(C7337lc.m14768a(m14778j, c7296kg.m14896c()), z, true);
        }
        return new C7282jy(C7337lc.m14768a(mo15061a, c7296kg.m14896c()), z, false);
    }

    @Override // com.google.android.gms.internal.AbstractC7257jp
    /* renamed from: a */
    public <T> T mo15071a(Callable<T> callable) {
        this.f24339b.mo15046e();
        try {
            T call = callable.call();
            this.f24339b.mo15044g();
            return call;
        } finally {
        }
    }

    @Override // com.google.android.gms.internal.AbstractC7257jp
    /* renamed from: a */
    public void mo15081a() {
        this.f24339b.mo15048d();
    }

    @Override // com.google.android.gms.internal.AbstractC7257jp
    /* renamed from: a */
    public void mo15080a(long j) {
        this.f24339b.mo15064a(j);
    }

    @Override // com.google.android.gms.internal.AbstractC7257jp
    /* renamed from: a */
    public void mo15079a(C7160ij c7160ij, C7142ia c7142ia) {
        Iterator<Map.Entry<C7160ij, AbstractC7344lh>> it2 = c7142ia.iterator();
        while (it2.hasNext()) {
            Map.Entry<C7160ij, AbstractC7344lh> next = it2.next();
            mo15077a(c7160ij.m15370a(next.getKey()), next.getValue());
        }
    }

    @Override // com.google.android.gms.internal.AbstractC7257jp
    /* renamed from: a */
    public void mo15078a(C7160ij c7160ij, C7142ia c7142ia, long j) {
        this.f24339b.mo15059a(c7160ij, c7142ia, j);
    }

    @Override // com.google.android.gms.internal.AbstractC7257jp
    /* renamed from: a */
    public void mo15077a(C7160ij c7160ij, AbstractC7344lh abstractC7344lh) {
        if (!this.f24340c.m15014d(c7160ij)) {
            this.f24339b.mo15057a(c7160ij, abstractC7344lh);
            this.f24340c.m15016c(c7160ij);
        }
    }

    @Override // com.google.android.gms.internal.AbstractC7257jp
    /* renamed from: a */
    public void mo15076a(C7160ij c7160ij, AbstractC7344lh abstractC7344lh, long j) {
        this.f24339b.mo15056a(c7160ij, abstractC7344lh, j);
    }

    @Override // com.google.android.gms.internal.AbstractC7257jp
    /* renamed from: a */
    public void mo15074a(C7296kg c7296kg, AbstractC7344lh abstractC7344lh) {
        if (c7296kg.m14894e()) {
            this.f24339b.mo15057a(c7296kg.m14900a(), abstractC7344lh);
        } else {
            this.f24339b.mo15051b(c7296kg.m14900a(), abstractC7344lh);
        }
        mo15066d(c7296kg);
        m15087c();
    }

    @Override // com.google.android.gms.internal.AbstractC7257jp
    /* renamed from: a */
    public void mo15073a(C7296kg c7296kg, Set<C7319kv> set) {
        if (f24338a || !c7296kg.m14894e()) {
            C7263js m15023a = this.f24340c.m15023a(c7296kg);
            if (!f24338a && (m15023a == null || !m15023a.f24357e)) {
                throw new AssertionError("We only expect tracked keys for currently-active queries.");
            }
            this.f24339b.mo15063a(m15023a.f24353a, set);
            return;
        }
        throw new AssertionError("We should only track keys for filtered queries.");
    }

    @Override // com.google.android.gms.internal.AbstractC7257jp
    /* renamed from: a */
    public void mo15072a(C7296kg c7296kg, Set<C7319kv> set, Set<C7319kv> set2) {
        if (f24338a || !c7296kg.m14894e()) {
            C7263js m15023a = this.f24340c.m15023a(c7296kg);
            if (!f24338a && (m15023a == null || !m15023a.f24357e)) {
                throw new AssertionError("We only expect tracked keys for currently-active queries.");
            }
            this.f24339b.mo15062a(m15023a.f24353a, set, set2);
            return;
        }
        throw new AssertionError("We should only track keys for filtered queries.");
    }

    @Override // com.google.android.gms.internal.AbstractC7257jp
    /* renamed from: b */
    public List<C7234iy> mo15070b() {
        return this.f24339b.mo15065a();
    }

    @Override // com.google.android.gms.internal.AbstractC7257jp
    /* renamed from: b */
    public void mo15069b(C7160ij c7160ij, C7142ia c7142ia) {
        this.f24339b.mo15060a(c7160ij, c7142ia);
        m15087c();
    }

    @Override // com.google.android.gms.internal.AbstractC7257jp
    /* renamed from: b */
    public void mo15068b(C7296kg c7296kg) {
        this.f24340c.m15015c(c7296kg);
    }

    @Override // com.google.android.gms.internal.AbstractC7257jp
    /* renamed from: c */
    public void mo15067c(C7296kg c7296kg) {
        this.f24340c.m15013d(c7296kg);
    }

    @Override // com.google.android.gms.internal.AbstractC7257jp
    /* renamed from: d */
    public void mo15066d(C7296kg c7296kg) {
        if (c7296kg.m14894e()) {
            this.f24340c.m15029a(c7296kg.m14900a());
        } else {
            this.f24340c.m15011e(c7296kg);
        }
    }
}
