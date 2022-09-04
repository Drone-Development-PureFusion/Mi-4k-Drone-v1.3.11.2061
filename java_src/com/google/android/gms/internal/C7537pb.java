package com.google.android.gms.internal;

import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.util.ArrayList;
/* renamed from: com.google.android.gms.internal.pb */
/* loaded from: classes2.dex */
public final class C7537pb<E> extends AbstractC7488oj<Object> {

    /* renamed from: a */
    public static final AbstractC7489ok f25049a = new AbstractC7489ok() { // from class: com.google.android.gms.internal.pb.1
        @Override // com.google.android.gms.internal.AbstractC7489ok
        /* renamed from: a */
        public <T> AbstractC7488oj<T> mo14182a(C7459nr c7459nr, C7597po<T> c7597po) {
            Type m14168b = c7597po.m14168b();
            if ((m14168b instanceof GenericArrayType) || ((m14168b instanceof Class) && ((Class) m14168b).isArray())) {
                Type m14309g = C7496or.m14309g(m14168b);
                return new C7537pb(c7459nr, c7459nr.m14403a((C7597po) C7597po.m14169a(m14309g)), C7496or.m14311e(m14309g));
            }
            return null;
        }
    };

    /* renamed from: b */
    private final Class<E> f25050b;

    /* renamed from: c */
    private final AbstractC7488oj<E> f25051c;

    public C7537pb(C7459nr c7459nr, AbstractC7488oj<E> abstractC7488oj, Class<E> cls) {
        this.f25051c = new C7561pm(c7459nr, abstractC7488oj, cls);
        this.f25050b = cls;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.AbstractC7488oj
    /* renamed from: a */
    public void mo14173a(C7602ps c7602ps, Object obj) {
        if (obj == null) {
            c7602ps.mo14095f();
            return;
        }
        c7602ps.mo14107b();
        int length = Array.getLength(obj);
        for (int i = 0; i < length; i++) {
            this.f25051c.mo14173a(c7602ps, Array.get(obj, i));
        }
        c7602ps.mo14103c();
    }

    @Override // com.google.android.gms.internal.AbstractC7488oj
    /* renamed from: b */
    public Object mo14172b(C7598pp c7598pp) {
        if (c7598pp.mo14146f() == EnumC7600pq.NULL) {
            c7598pp.mo14142j();
            return null;
        }
        ArrayList arrayList = new ArrayList();
        c7598pp.mo14165a();
        while (c7598pp.mo14147e()) {
            arrayList.add(this.f25051c.mo14172b(c7598pp));
        }
        c7598pp.mo14158b();
        Object newInstance = Array.newInstance((Class<?>) this.f25050b, arrayList.size());
        for (int i = 0; i < arrayList.size(); i++) {
            Array.set(newInstance, i, arrayList.get(i));
        }
        return newInstance;
    }
}
