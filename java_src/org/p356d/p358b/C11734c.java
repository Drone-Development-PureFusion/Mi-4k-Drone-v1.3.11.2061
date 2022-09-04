package org.p356d.p358b;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import org.p356d.AbstractC11730b;
import org.p356d.AbstractC11759f;
/* renamed from: org.d.b.c */
/* loaded from: classes3.dex */
public class C11734c implements AbstractC11730b {

    /* renamed from: a */
    private final ConcurrentMap<String, AbstractC11759f> f37038a = new ConcurrentHashMap();

    @Override // org.p356d.AbstractC11730b
    /* renamed from: a */
    public AbstractC11759f mo164a(String str) {
        if (str == null) {
            throw new IllegalArgumentException("Marker name cannot be null");
        }
        AbstractC11759f abstractC11759f = this.f37038a.get(str);
        if (abstractC11759f != null) {
            return abstractC11759f;
        }
        C11733b c11733b = new C11733b(str);
        AbstractC11759f putIfAbsent = this.f37038a.putIfAbsent(str, c11733b);
        return putIfAbsent != null ? putIfAbsent : c11733b;
    }

    @Override // org.p356d.AbstractC11730b
    /* renamed from: b */
    public boolean mo163b(String str) {
        if (str == null) {
            return false;
        }
        return this.f37038a.containsKey(str);
    }

    @Override // org.p356d.AbstractC11730b
    /* renamed from: c */
    public boolean mo162c(String str) {
        return (str == null || this.f37038a.remove(str) == null) ? false : true;
    }

    @Override // org.p356d.AbstractC11730b
    /* renamed from: d */
    public AbstractC11759f mo161d(String str) {
        return new C11733b(str);
    }
}
