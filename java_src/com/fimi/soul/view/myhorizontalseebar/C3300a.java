package com.fimi.soul.view.myhorizontalseebar;

import android.util.Log;
import com.fimi.soul.view.myhorizontalseebar.AbstractC3302c;
/* renamed from: com.fimi.soul.view.myhorizontalseebar.a */
/* loaded from: classes2.dex */
class C3300a<T extends AbstractC3302c<T>> implements AbstractC3301b<T> {

    /* renamed from: a */
    private static final String f13103a = "FinitePool";

    /* renamed from: b */
    private final AbstractC3303d<T> f13104b;

    /* renamed from: c */
    private final int f13105c;

    /* renamed from: d */
    private final boolean f13106d;

    /* renamed from: e */
    private T f13107e;

    /* renamed from: f */
    private int f13108f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C3300a(AbstractC3303d<T> abstractC3303d) {
        this.f13104b = abstractC3303d;
        this.f13105c = 0;
        this.f13106d = true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C3300a(AbstractC3303d<T> abstractC3303d, int i) {
        if (i <= 0) {
            throw new IllegalArgumentException("The pool limit must be > 0");
        }
        this.f13104b = abstractC3303d;
        this.f13105c = i;
        this.f13106d = false;
    }

    @Override // com.fimi.soul.view.myhorizontalseebar.AbstractC3301b
    /* renamed from: a */
    public T mo28378a() {
        T mo28385a;
        if (this.f13107e != null) {
            T t = this.f13107e;
            this.f13107e = (T) t.mo28389a();
            this.f13108f--;
            mo28385a = t;
        } else {
            mo28385a = this.f13104b.mo28385a();
        }
        if (mo28385a != null) {
            mo28385a.mo28388a(null);
            mo28385a.mo28387a(false);
            this.f13104b.mo28384a(mo28385a);
        }
        return mo28385a;
    }

    @Override // com.fimi.soul.view.myhorizontalseebar.AbstractC3301b
    /* renamed from: a */
    public void mo28377a(T t) {
        if (t.mo28386b()) {
            Log.w(f13103a, "Element is already in pool: " + t);
            return;
        }
        if (this.f13106d || this.f13108f < this.f13105c) {
            this.f13108f++;
            t.mo28388a(this.f13107e);
            t.mo28387a(true);
            this.f13107e = t;
        }
        this.f13104b.mo28383b(t);
    }
}
