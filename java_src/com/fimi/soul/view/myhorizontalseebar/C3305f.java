package com.fimi.soul.view.myhorizontalseebar;

import com.fimi.soul.view.myhorizontalseebar.AbstractC3302c;
/* renamed from: com.fimi.soul.view.myhorizontalseebar.f */
/* loaded from: classes2.dex */
class C3305f<T extends AbstractC3302c<T>> implements AbstractC3301b<T> {

    /* renamed from: a */
    private final AbstractC3301b<T> f13109a;

    /* renamed from: b */
    private final Object f13110b;

    public C3305f(AbstractC3301b<T> abstractC3301b) {
        this.f13109a = abstractC3301b;
        this.f13110b = this;
    }

    public C3305f(AbstractC3301b<T> abstractC3301b, Object obj) {
        this.f13109a = abstractC3301b;
        this.f13110b = obj;
    }

    @Override // com.fimi.soul.view.myhorizontalseebar.AbstractC3301b
    /* renamed from: a */
    public T mo28378a() {
        T mo28378a;
        synchronized (this.f13110b) {
            mo28378a = this.f13109a.mo28378a();
        }
        return mo28378a;
    }

    @Override // com.fimi.soul.view.myhorizontalseebar.AbstractC3301b
    /* renamed from: a */
    public void mo28377a(T t) {
        synchronized (this.f13110b) {
            this.f13109a.mo28377a(t);
        }
    }
}
