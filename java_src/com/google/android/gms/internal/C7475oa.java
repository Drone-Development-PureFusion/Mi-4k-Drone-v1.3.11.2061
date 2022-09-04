package com.google.android.gms.internal;

import java.util.Map;
import java.util.Set;
/* renamed from: com.google.android.gms.internal.oa */
/* loaded from: classes2.dex */
public final class C7475oa extends AbstractC7471nx {

    /* renamed from: a */
    private final C7517ow<String, AbstractC7471nx> f24953a = new C7517ow<>();

    /* renamed from: a */
    private AbstractC7471nx m14363a(Object obj) {
        return obj == null ? C7473nz.f24952a : new C7478od(obj);
    }

    /* renamed from: a */
    public Set<Map.Entry<String, AbstractC7471nx>> m14364a() {
        return this.f24953a.entrySet();
    }

    /* renamed from: a */
    public void m14361a(String str, AbstractC7471nx abstractC7471nx) {
        if (abstractC7471nx == null) {
            abstractC7471nx = C7473nz.f24952a;
        }
        this.f24953a.put(str, abstractC7471nx);
    }

    /* renamed from: a */
    public void m14360a(String str, Boolean bool) {
        m14361a(str, m14363a(bool));
    }

    /* renamed from: a */
    public void m14359a(String str, String str2) {
        m14361a(str, m14363a((Object) str2));
    }

    /* renamed from: a */
    public boolean m14362a(String str) {
        return this.f24953a.containsKey(str);
    }

    /* renamed from: b */
    public AbstractC7471nx m14358b(String str) {
        return this.f24953a.get(str);
    }

    /* renamed from: c */
    public C7468nu m14357c(String str) {
        return (C7468nu) this.f24953a.get(str);
    }

    public boolean equals(Object obj) {
        return obj == this || ((obj instanceof C7475oa) && ((C7475oa) obj).f24953a.equals(this.f24953a));
    }

    public int hashCode() {
        return this.f24953a.hashCode();
    }
}
