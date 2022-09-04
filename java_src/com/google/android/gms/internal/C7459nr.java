package com.google.android.gms.internal;

import java.io.EOFException;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* renamed from: com.google.android.gms.internal.nr */
/* loaded from: classes2.dex */
public final class C7459nr {

    /* renamed from: a */
    final AbstractC7469nv f24926a;

    /* renamed from: b */
    final AbstractC7479oe f24927b;

    /* renamed from: c */
    private final ThreadLocal<Map<C7597po<?>, C7465a<?>>> f24928c;

    /* renamed from: d */
    private final Map<C7597po<?>, AbstractC7488oj<?>> f24929d;

    /* renamed from: e */
    private final List<AbstractC7489ok> f24930e;

    /* renamed from: f */
    private final C7500os f24931f;

    /* renamed from: g */
    private final boolean f24932g;

    /* renamed from: h */
    private final boolean f24933h;

    /* renamed from: i */
    private final boolean f24934i;

    /* renamed from: j */
    private final boolean f24935j;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.gms.internal.nr$a */
    /* loaded from: classes2.dex */
    public static class C7465a<T> extends AbstractC7488oj<T> {

        /* renamed from: a */
        private AbstractC7488oj<T> f24941a;

        C7465a() {
        }

        /* renamed from: a */
        public void m14383a(AbstractC7488oj<T> abstractC7488oj) {
            if (this.f24941a != null) {
                throw new AssertionError();
            }
            this.f24941a = abstractC7488oj;
        }

        @Override // com.google.android.gms.internal.AbstractC7488oj
        /* renamed from: a */
        public void mo14173a(C7602ps c7602ps, T t) {
            if (this.f24941a == null) {
                throw new IllegalStateException();
            }
            this.f24941a.mo14173a(c7602ps, t);
        }

        @Override // com.google.android.gms.internal.AbstractC7488oj
        /* renamed from: b */
        public T mo14172b(C7598pp c7598pp) {
            if (this.f24941a == null) {
                throw new IllegalStateException();
            }
            return this.f24941a.mo14172b(c7598pp);
        }
    }

    public C7459nr() {
        this(C7513ot.f24999a, EnumC7451no.IDENTITY, Collections.emptyMap(), false, false, false, true, false, false, EnumC7482oh.DEFAULT, Collections.emptyList());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C7459nr(C7513ot c7513ot, AbstractC7458nq abstractC7458nq, Map<Type, AbstractC7467nt<?>> map, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, EnumC7482oh enumC7482oh, List<AbstractC7489ok> list) {
        this.f24928c = new ThreadLocal<>();
        this.f24929d = Collections.synchronizedMap(new HashMap());
        this.f24926a = new AbstractC7469nv() { // from class: com.google.android.gms.internal.nr.1
        };
        this.f24927b = new AbstractC7479oe() { // from class: com.google.android.gms.internal.nr.2
        };
        this.f24931f = new C7500os(map);
        this.f24932g = z;
        this.f24934i = z3;
        this.f24933h = z4;
        this.f24935j = z5;
        ArrayList arrayList = new ArrayList();
        arrayList.add(C7562pn.f25114Q);
        arrayList.add(C7550pi.f25074a);
        arrayList.add(c7513ot);
        arrayList.addAll(list);
        arrayList.add(C7562pn.f25139x);
        arrayList.add(C7562pn.f25128m);
        arrayList.add(C7562pn.f25122g);
        arrayList.add(C7562pn.f25124i);
        arrayList.add(C7562pn.f25126k);
        arrayList.add(C7562pn.m14229a(Long.TYPE, Long.class, m14405a(enumC7482oh)));
        arrayList.add(C7562pn.m14229a(Double.TYPE, Double.class, m14391a(z6)));
        arrayList.add(C7562pn.m14229a(Float.TYPE, Float.class, m14390b(z6)));
        arrayList.add(C7562pn.f25133r);
        arrayList.add(C7562pn.f25135t);
        arrayList.add(C7562pn.f25141z);
        arrayList.add(C7562pn.f25099B);
        arrayList.add(C7562pn.m14230a(BigDecimal.class, C7562pn.f25137v));
        arrayList.add(C7562pn.m14230a(BigInteger.class, C7562pn.f25138w));
        arrayList.add(C7562pn.f25101D);
        arrayList.add(C7562pn.f25103F);
        arrayList.add(C7562pn.f25107J);
        arrayList.add(C7562pn.f25112O);
        arrayList.add(C7562pn.f25105H);
        arrayList.add(C7562pn.f25119d);
        arrayList.add(C7541pd.f25055a);
        arrayList.add(C7562pn.f25110M);
        arrayList.add(C7559pl.f25093a);
        arrayList.add(C7557pk.f25091a);
        arrayList.add(C7562pn.f25108K);
        arrayList.add(C7537pb.f25049a);
        arrayList.add(C7562pn.f25117b);
        arrayList.add(new C7539pc(this.f24931f));
        arrayList.add(new C7548ph(this.f24931f, z2));
        arrayList.add(new C7543pe(this.f24931f));
        arrayList.add(C7562pn.f25115R);
        arrayList.add(new C7553pj(this.f24931f, abstractC7458nq, c7513ot));
        this.f24930e = Collections.unmodifiableList(arrayList);
    }

    /* renamed from: a */
    private AbstractC7488oj<Number> m14405a(EnumC7482oh enumC7482oh) {
        return enumC7482oh == EnumC7482oh.DEFAULT ? C7562pn.f25129n : new AbstractC7488oj<Number>() { // from class: com.google.android.gms.internal.nr.5
            @Override // com.google.android.gms.internal.AbstractC7488oj
            /* renamed from: a */
            public Number mo14172b(C7598pp c7598pp) {
                if (c7598pp.mo14146f() == EnumC7600pq.NULL) {
                    c7598pp.mo14142j();
                    return null;
                }
                return Long.valueOf(c7598pp.mo14140l());
            }

            @Override // com.google.android.gms.internal.AbstractC7488oj
            /* renamed from: a  reason: avoid collision after fix types in other method */
            public void mo14173a(C7602ps c7602ps, Number number) {
                if (number == null) {
                    c7602ps.mo14095f();
                } else {
                    c7602ps.mo14105b(number.toString());
                }
            }
        };
    }

    /* renamed from: a */
    private AbstractC7488oj<Number> m14391a(boolean z) {
        return z ? C7562pn.f25131p : new AbstractC7488oj<Number>() { // from class: com.google.android.gms.internal.nr.3
            @Override // com.google.android.gms.internal.AbstractC7488oj
            /* renamed from: a */
            public Double mo14172b(C7598pp c7598pp) {
                if (c7598pp.mo14146f() == EnumC7600pq.NULL) {
                    c7598pp.mo14142j();
                    return null;
                }
                return Double.valueOf(c7598pp.mo14141k());
            }

            @Override // com.google.android.gms.internal.AbstractC7488oj
            /* renamed from: a  reason: avoid collision after fix types in other method */
            public void mo14173a(C7602ps c7602ps, Number number) {
                if (number == null) {
                    c7602ps.mo14095f();
                    return;
                }
                C7459nr.this.m14412a(number.doubleValue());
                c7602ps.mo14110a(number);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m14412a(double d) {
        if (Double.isNaN(d) || Double.isInfinite(d)) {
            throw new IllegalArgumentException(new StringBuilder(168).append(d).append(" is not a valid double value as per JSON specification. To override this").append(" behavior, use GsonBuilder.serializeSpecialFloatingPointValues() method.").toString());
        }
    }

    /* renamed from: a */
    private static void m14397a(Object obj, C7598pp c7598pp) {
        if (obj != null) {
            try {
                if (c7598pp.mo14146f() == EnumC7600pq.END_DOCUMENT) {
                    return;
                }
                throw new C7472ny("JSON document was not fully consumed.");
            } catch (C7603pt e) {
                throw new C7481og(e);
            } catch (IOException e2) {
                throw new C7472ny(e2);
            }
        }
    }

    /* renamed from: b */
    private AbstractC7488oj<Number> m14390b(boolean z) {
        return z ? C7562pn.f25130o : new AbstractC7488oj<Number>() { // from class: com.google.android.gms.internal.nr.4
            @Override // com.google.android.gms.internal.AbstractC7488oj
            /* renamed from: a */
            public Float mo14172b(C7598pp c7598pp) {
                if (c7598pp.mo14146f() == EnumC7600pq.NULL) {
                    c7598pp.mo14142j();
                    return null;
                }
                return Float.valueOf((float) c7598pp.mo14141k());
            }

            @Override // com.google.android.gms.internal.AbstractC7488oj
            /* renamed from: a  reason: avoid collision after fix types in other method */
            public void mo14173a(C7602ps c7602ps, Number number) {
                if (number == null) {
                    c7602ps.mo14095f();
                    return;
                }
                C7459nr.this.m14412a(number.floatValue());
                c7602ps.mo14110a(number);
            }
        };
    }

    /* renamed from: a */
    public <T> AbstractC7488oj<T> m14404a(AbstractC7489ok abstractC7489ok, C7597po<T> c7597po) {
        boolean z = false;
        if (!this.f24930e.contains(abstractC7489ok)) {
            z = true;
        }
        boolean z2 = z;
        for (AbstractC7489ok abstractC7489ok2 : this.f24930e) {
            if (z2) {
                AbstractC7488oj<T> mo14182a = abstractC7489ok2.mo14182a(this, c7597po);
                if (mo14182a != null) {
                    return mo14182a;
                }
            } else if (abstractC7489ok2 == abstractC7489ok) {
                z2 = true;
            }
        }
        String valueOf = String.valueOf(c7597po);
        throw new IllegalArgumentException(new StringBuilder(String.valueOf(valueOf).length() + 22).append("GSON cannot serialize ").append(valueOf).toString());
    }

    /* renamed from: a */
    public <T> AbstractC7488oj<T> m14403a(C7597po<T> c7597po) {
        HashMap hashMap;
        AbstractC7488oj<T> abstractC7488oj = (AbstractC7488oj<T>) this.f24929d.get(c7597po);
        if (abstractC7488oj == null) {
            Map<C7597po<?>, C7465a<?>> map = this.f24928c.get();
            boolean z = false;
            if (map == null) {
                HashMap hashMap2 = new HashMap();
                this.f24928c.set(hashMap2);
                hashMap = hashMap2;
                z = true;
            } else {
                hashMap = map;
            }
            abstractC7488oj = hashMap.get(c7597po);
            if (abstractC7488oj == null) {
                try {
                    C7465a<?> c7465a = new C7465a<>();
                    hashMap.put(c7597po, c7465a);
                    for (AbstractC7489ok abstractC7489ok : this.f24930e) {
                        abstractC7488oj = abstractC7489ok.mo14182a(this, c7597po);
                        if (abstractC7488oj != null) {
                            c7465a.m14383a((AbstractC7488oj<?>) abstractC7488oj);
                            this.f24929d.put(c7597po, abstractC7488oj);
                            hashMap.remove(c7597po);
                            if (z) {
                                this.f24928c.remove();
                            }
                        }
                    }
                    String valueOf = String.valueOf(c7597po);
                    throw new IllegalArgumentException(new StringBuilder(String.valueOf(valueOf).length() + 19).append("GSON cannot handle ").append(valueOf).toString());
                } catch (Throwable th) {
                    hashMap.remove(c7597po);
                    if (z) {
                        this.f24928c.remove();
                    }
                    throw th;
                }
            }
        }
        return abstractC7488oj;
    }

    /* renamed from: a */
    public <T> AbstractC7488oj<T> m14399a(Class<T> cls) {
        return m14403a((C7597po) C7597po.m14167b(cls));
    }

    /* renamed from: a */
    public C7602ps m14400a(Writer writer) {
        if (this.f24934i) {
            writer.write(")]}'\n");
        }
        C7602ps c7602ps = new C7602ps(writer);
        if (this.f24935j) {
            c7602ps.m14102c("  ");
        }
        c7602ps.m14098d(this.f24932g);
        return c7602ps;
    }

    /* renamed from: a */
    public <T> T m14407a(AbstractC7471nx abstractC7471nx, Class<T> cls) {
        return (T) C7526oy.m14274a((Class) cls).cast(m14406a(abstractC7471nx, (Type) cls));
    }

    /* renamed from: a */
    public <T> T m14406a(AbstractC7471nx abstractC7471nx, Type type) {
        if (abstractC7471nx == null) {
            return null;
        }
        return (T) m14402a((C7598pp) new C7544pf(abstractC7471nx), type);
    }

    /* renamed from: a */
    public <T> T m14402a(C7598pp c7598pp, Type type) {
        boolean z = true;
        boolean m14136p = c7598pp.m14136p();
        try {
            try {
                c7598pp.mo14146f();
                z = false;
                return m14403a((C7597po) C7597po.m14169a(type)).mo14172b(c7598pp);
            } catch (EOFException e) {
                if (!z) {
                    throw new C7481og(e);
                }
                c7598pp.m14159a(m14136p);
                return null;
            } catch (IOException e2) {
                throw new C7481og(e2);
            } catch (IllegalStateException e3) {
                throw new C7481og(e3);
            }
        } finally {
            c7598pp.m14159a(m14136p);
        }
    }

    /* renamed from: a */
    public <T> T m14401a(Reader reader, Type type) {
        C7598pp c7598pp = new C7598pp(reader);
        T t = (T) m14402a(c7598pp, type);
        m14397a(t, c7598pp);
        return t;
    }

    /* renamed from: a */
    public <T> T m14393a(String str, Class<T> cls) {
        return (T) C7526oy.m14274a((Class) cls).cast(m14392a(str, (Type) cls));
    }

    /* renamed from: a */
    public <T> T m14392a(String str, Type type) {
        if (str == null) {
            return null;
        }
        return (T) m14401a((Reader) new StringReader(str), type);
    }

    /* renamed from: a */
    public String m14410a(AbstractC7471nx abstractC7471nx) {
        StringWriter stringWriter = new StringWriter();
        m14408a(abstractC7471nx, stringWriter);
        return stringWriter.toString();
    }

    /* renamed from: a */
    public String m14398a(Object obj) {
        return obj == null ? m14410a((AbstractC7471nx) C7473nz.f24952a) : m14396a(obj, obj.getClass());
    }

    /* renamed from: a */
    public String m14396a(Object obj, Type type) {
        StringWriter stringWriter = new StringWriter();
        m14394a(obj, type, stringWriter);
        return stringWriter.toString();
    }

    /* renamed from: a */
    public void m14409a(AbstractC7471nx abstractC7471nx, C7602ps c7602ps) {
        boolean m14094g = c7602ps.m14094g();
        c7602ps.m14104b(true);
        boolean m14093h = c7602ps.m14093h();
        c7602ps.m14101c(this.f24933h);
        boolean m14092i = c7602ps.m14092i();
        c7602ps.m14098d(this.f24932g);
        try {
            try {
                C7527oz.m14271a(abstractC7471nx, c7602ps);
            } catch (IOException e) {
                throw new C7472ny(e);
            }
        } finally {
            c7602ps.m14104b(m14094g);
            c7602ps.m14101c(m14093h);
            c7602ps.m14098d(m14092i);
        }
    }

    /* renamed from: a */
    public void m14408a(AbstractC7471nx abstractC7471nx, Appendable appendable) {
        try {
            m14409a(abstractC7471nx, m14400a(C7527oz.m14269a(appendable)));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: a */
    public void m14395a(Object obj, Type type, C7602ps c7602ps) {
        AbstractC7488oj m14403a = m14403a((C7597po) C7597po.m14169a(type));
        boolean m14094g = c7602ps.m14094g();
        c7602ps.m14104b(true);
        boolean m14093h = c7602ps.m14093h();
        c7602ps.m14101c(this.f24933h);
        boolean m14092i = c7602ps.m14092i();
        c7602ps.m14098d(this.f24932g);
        try {
            try {
                m14403a.mo14173a(c7602ps, obj);
            } catch (IOException e) {
                throw new C7472ny(e);
            }
        } finally {
            c7602ps.m14104b(m14094g);
            c7602ps.m14101c(m14093h);
            c7602ps.m14098d(m14092i);
        }
    }

    /* renamed from: a */
    public void m14394a(Object obj, Type type, Appendable appendable) {
        try {
            m14395a(obj, type, m14400a(C7527oz.m14269a(appendable)));
        } catch (IOException e) {
            throw new C7472ny(e);
        }
    }

    public String toString() {
        return "{serializeNulls:" + this.f24932g + "factories:" + this.f24930e + ",instanceCreators:" + this.f24931f + "}";
    }
}
