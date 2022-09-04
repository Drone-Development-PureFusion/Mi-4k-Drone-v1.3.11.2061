package com.google.android.gms.internal;

import java.util.ArrayList;
/* renamed from: com.google.android.gms.internal.pi */
/* loaded from: classes2.dex */
public final class C7550pi extends AbstractC7488oj<Object> {

    /* renamed from: a */
    public static final AbstractC7489ok f25074a = new AbstractC7489ok() { // from class: com.google.android.gms.internal.pi.1
        @Override // com.google.android.gms.internal.AbstractC7489ok
        /* renamed from: a */
        public <T> AbstractC7488oj<T> mo14182a(C7459nr c7459nr, C7597po<T> c7597po) {
            if (c7597po.m14171a() == Object.class) {
                return new C7550pi(c7459nr);
            }
            return null;
        }
    };

    /* renamed from: b */
    private final C7459nr f25075b;

    private C7550pi(C7459nr c7459nr) {
        this.f25075b = c7459nr;
    }

    @Override // com.google.android.gms.internal.AbstractC7488oj
    /* renamed from: a */
    public void mo14173a(C7602ps c7602ps, Object obj) {
        if (obj == null) {
            c7602ps.mo14095f();
            return;
        }
        AbstractC7488oj m14399a = this.f25075b.m14399a((Class) obj.getClass());
        if (!(m14399a instanceof C7550pi)) {
            m14399a.mo14173a(c7602ps, obj);
            return;
        }
        c7602ps.mo14100d();
        c7602ps.mo14097e();
    }

    @Override // com.google.android.gms.internal.AbstractC7488oj
    /* renamed from: b */
    public Object mo14172b(C7598pp c7598pp) {
        switch (c7598pp.mo14146f()) {
            case BEGIN_ARRAY:
                ArrayList arrayList = new ArrayList();
                c7598pp.mo14165a();
                while (c7598pp.mo14147e()) {
                    arrayList.add(mo14172b(c7598pp));
                }
                c7598pp.mo14158b();
                return arrayList;
            case BEGIN_OBJECT:
                C7517ow c7517ow = new C7517ow();
                c7598pp.mo14152c();
                while (c7598pp.mo14147e()) {
                    c7517ow.put(c7598pp.mo14145g(), mo14172b(c7598pp));
                }
                c7598pp.mo14149d();
                return c7517ow;
            case STRING:
                return c7598pp.mo14144h();
            case NUMBER:
                return Double.valueOf(c7598pp.mo14141k());
            case BOOLEAN:
                return Boolean.valueOf(c7598pp.mo14143i());
            case NULL:
                c7598pp.mo14142j();
                return null;
            default:
                throw new IllegalStateException();
        }
    }
}
