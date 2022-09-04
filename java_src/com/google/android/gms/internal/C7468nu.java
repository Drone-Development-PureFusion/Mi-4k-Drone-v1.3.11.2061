package com.google.android.gms.internal;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* renamed from: com.google.android.gms.internal.nu */
/* loaded from: classes2.dex */
public final class C7468nu extends AbstractC7471nx implements Iterable<AbstractC7471nx> {

    /* renamed from: a */
    private final List<AbstractC7471nx> f24951a = new ArrayList();

    /* renamed from: a */
    public int m14375a() {
        return this.f24951a.size();
    }

    /* renamed from: a */
    public AbstractC7471nx m14374a(int i) {
        return this.f24951a.get(i);
    }

    /* renamed from: a */
    public void m14373a(AbstractC7471nx abstractC7471nx) {
        if (abstractC7471nx == null) {
            abstractC7471nx = C7473nz.f24952a;
        }
        this.f24951a.add(abstractC7471nx);
    }

    @Override // com.google.android.gms.internal.AbstractC7471nx
    /* renamed from: b */
    public Number mo14350b() {
        if (this.f24951a.size() == 1) {
            return this.f24951a.get(0).mo14350b();
        }
        throw new IllegalStateException();
    }

    @Override // com.google.android.gms.internal.AbstractC7471nx
    /* renamed from: c */
    public String mo14348c() {
        if (this.f24951a.size() == 1) {
            return this.f24951a.get(0).mo14348c();
        }
        throw new IllegalStateException();
    }

    @Override // com.google.android.gms.internal.AbstractC7471nx
    /* renamed from: d */
    public double mo14347d() {
        if (this.f24951a.size() == 1) {
            return this.f24951a.get(0).mo14347d();
        }
        throw new IllegalStateException();
    }

    @Override // com.google.android.gms.internal.AbstractC7471nx
    /* renamed from: e */
    public long mo14346e() {
        if (this.f24951a.size() == 1) {
            return this.f24951a.get(0).mo14346e();
        }
        throw new IllegalStateException();
    }

    public boolean equals(Object obj) {
        return obj == this || ((obj instanceof C7468nu) && ((C7468nu) obj).f24951a.equals(this.f24951a));
    }

    @Override // com.google.android.gms.internal.AbstractC7471nx
    /* renamed from: f */
    public int mo14345f() {
        if (this.f24951a.size() == 1) {
            return this.f24951a.get(0).mo14345f();
        }
        throw new IllegalStateException();
    }

    @Override // com.google.android.gms.internal.AbstractC7471nx
    /* renamed from: g */
    public boolean mo14344g() {
        if (this.f24951a.size() == 1) {
            return this.f24951a.get(0).mo14344g();
        }
        throw new IllegalStateException();
    }

    public int hashCode() {
        return this.f24951a.hashCode();
    }

    @Override // java.lang.Iterable
    public Iterator<AbstractC7471nx> iterator() {
        return this.f24951a.iterator();
    }
}
