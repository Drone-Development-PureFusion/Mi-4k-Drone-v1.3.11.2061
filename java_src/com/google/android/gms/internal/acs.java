package com.google.android.gms.internal;

import com.google.android.gms.internal.acr;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
@aaa
/* loaded from: classes.dex */
public class acs<T> implements acr<T> {

    /* renamed from: c */
    protected T f21158c;

    /* renamed from: d */
    private final Object f21159d = new Object();

    /* renamed from: a */
    protected int f21156a = 0;

    /* renamed from: b */
    protected final BlockingQueue<C6194a> f21157b = new LinkedBlockingQueue();

    /* renamed from: com.google.android.gms.internal.acs$a */
    /* loaded from: classes2.dex */
    class C6194a {

        /* renamed from: a */
        public final acr.AbstractC6193c<T> f21160a;

        /* renamed from: b */
        public final acr.AbstractC6191a f21161b;

        public C6194a(acr.AbstractC6193c<T> abstractC6193c, acr.AbstractC6191a abstractC6191a) {
            this.f21160a = abstractC6193c;
            this.f21161b = abstractC6191a;
        }
    }

    /* renamed from: a */
    public void mo13123a() {
        synchronized (this.f21159d) {
            if (this.f21156a != 0) {
                throw new UnsupportedOperationException();
            }
            this.f21156a = -1;
            for (C6194a c6194a : this.f21157b) {
                c6194a.f21161b.mo12763a();
            }
            this.f21157b.clear();
        }
    }

    @Override // com.google.android.gms.internal.acr
    /* renamed from: a */
    public void mo13122a(acr.AbstractC6193c<T> abstractC6193c, acr.AbstractC6191a abstractC6191a) {
        synchronized (this.f21159d) {
            if (this.f21156a == 1) {
                abstractC6193c.mo12764a(this.f21158c);
            } else if (this.f21156a == -1) {
                abstractC6191a.mo12763a();
            } else if (this.f21156a == 0) {
                this.f21157b.add(new C6194a(abstractC6193c, abstractC6191a));
            }
        }
    }

    @Override // com.google.android.gms.internal.acr
    /* renamed from: a */
    public void mo13120a(T t) {
        synchronized (this.f21159d) {
            if (this.f21156a != 0) {
                throw new UnsupportedOperationException();
            }
            this.f21158c = t;
            this.f21156a = 1;
            for (C6194a c6194a : this.f21157b) {
                c6194a.f21160a.mo12764a(t);
            }
            this.f21157b.clear();
        }
    }

    /* renamed from: b */
    public int mo13119b() {
        return this.f21156a;
    }
}
