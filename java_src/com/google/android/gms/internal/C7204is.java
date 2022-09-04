package com.google.android.gms.internal;

import com.google.android.gms.internal.C7322kw;
import java.util.HashMap;
import java.util.Map;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.is */
/* loaded from: classes2.dex */
public class C7204is {

    /* renamed from: a */
    private AbstractC7344lh f24210a = null;

    /* renamed from: b */
    private Map<C7319kv, C7204is> f24211b = null;

    /* renamed from: com.google.android.gms.internal.is$a */
    /* loaded from: classes2.dex */
    public interface AbstractC7207a {
        /* renamed from: a */
        void mo15241a(C7319kv c7319kv, C7204is c7204is);
    }

    /* renamed from: com.google.android.gms.internal.is$b */
    /* loaded from: classes2.dex */
    public interface AbstractC7208b {
        /* renamed from: a */
        void mo15240a(C7160ij c7160ij, AbstractC7344lh abstractC7344lh);
    }

    /* renamed from: a */
    public void m15244a(final C7160ij c7160ij, final AbstractC7208b abstractC7208b) {
        if (this.f24210a != null) {
            abstractC7208b.mo15240a(c7160ij, this.f24210a);
        } else {
            m15242a(new AbstractC7207a() { // from class: com.google.android.gms.internal.is.2
                @Override // com.google.android.gms.internal.C7204is.AbstractC7207a
                /* renamed from: a */
                public void mo15241a(C7319kv c7319kv, C7204is c7204is) {
                    c7204is.m15244a(c7160ij.m15368a(c7319kv), abstractC7208b);
                }
            });
        }
    }

    /* renamed from: a */
    public void m15243a(C7160ij c7160ij, AbstractC7344lh abstractC7344lh) {
        if (c7160ij.m15356h()) {
            this.f24210a = abstractC7344lh;
            this.f24211b = null;
        } else if (this.f24210a != null) {
            this.f24210a = this.f24210a.mo14749a(c7160ij, abstractC7344lh);
        } else {
            if (this.f24211b == null) {
                this.f24211b = new HashMap();
            }
            C7319kv m15363d = c7160ij.m15363d();
            if (!this.f24211b.containsKey(m15363d)) {
                this.f24211b.put(m15363d, new C7204is());
            }
            this.f24211b.get(m15363d).m15243a(c7160ij.m15361e(), abstractC7344lh);
        }
    }

    /* renamed from: a */
    public void m15242a(AbstractC7207a abstractC7207a) {
        if (this.f24211b != null) {
            for (Map.Entry<C7319kv, C7204is> entry : this.f24211b.entrySet()) {
                abstractC7207a.mo15241a(entry.getKey(), entry.getValue());
            }
        }
    }

    /* renamed from: a */
    public boolean m15245a(final C7160ij c7160ij) {
        if (c7160ij.m15356h()) {
            this.f24210a = null;
            this.f24211b = null;
            return true;
        } else if (this.f24210a != null) {
            if (this.f24210a.mo14743e()) {
                return false;
            }
            this.f24210a = null;
            ((C7322kw) this.f24210a).m14819a(new C7322kw.AbstractC7325a() { // from class: com.google.android.gms.internal.is.1
                @Override // com.google.android.gms.internal.C7322kw.AbstractC7325a
                /* renamed from: a */
                public void mo14802a(C7319kv c7319kv, AbstractC7344lh abstractC7344lh) {
                    C7204is.this.m15243a(c7160ij.m15368a(c7319kv), abstractC7344lh);
                }
            });
            return m15245a(c7160ij);
        } else if (this.f24211b == null) {
            return true;
        } else {
            C7319kv m15363d = c7160ij.m15363d();
            C7160ij m15361e = c7160ij.m15361e();
            if (this.f24211b.containsKey(m15363d) && this.f24211b.get(m15363d).m15245a(m15361e)) {
                this.f24211b.remove(m15363d);
            }
            if (!this.f24211b.isEmpty()) {
                return false;
            }
            this.f24211b = null;
            return true;
        }
    }
}
