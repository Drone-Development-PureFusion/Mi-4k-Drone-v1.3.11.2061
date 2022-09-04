package org.p328c.p329a.p334e.p335a;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.p328c.p329a.p334e.AbstractC11482e;
import org.p328c.p329a.p334e.AbstractC11483f;
import org.p328c.p329a.p334e.AbstractC11484g;
import org.p328c.p329a.p334e.C11481d;
import org.p328c.p350f.p351a.C11651k;
/* renamed from: org.c.a.e.a.b */
/* loaded from: classes2.dex */
public class C11472b {

    /* renamed from: a */
    private final List<AbstractC11484g> f36578a;

    /* renamed from: b */
    private final List<C11481d> f36579b;

    /* renamed from: c */
    private final C11651k f36580c;

    private C11472b(List<AbstractC11484g> list, List<C11481d> list2, C11651k c11651k) {
        this.f36579b = list2;
        this.f36578a = list;
        this.f36580c = c11651k;
    }

    /* renamed from: a */
    private List<AbstractC11484g> m981a(C11481d c11481d) {
        Class<?> m960a = c11481d.m960a();
        return m960a.isEnum() ? new C11474d(m960a).mo945a(c11481d) : (m960a.equals(Boolean.class) || m960a.equals(Boolean.TYPE)) ? new C11473c().mo945a(c11481d) : Collections.emptyList();
    }

    /* renamed from: a */
    public static C11472b m982a(Method method, C11651k c11651k) {
        List<C11481d> m956a = C11481d.m956a(c11651k.m408f());
        m956a.addAll(C11481d.m955a(method));
        return new C11472b(new ArrayList(), m956a, c11651k);
    }

    /* renamed from: a */
    private AbstractC11482e m983a(Class<? extends AbstractC11482e> cls) {
        Constructor<?>[] constructors;
        for (Constructor<?> constructor : cls.getConstructors()) {
            Class<?>[] parameterTypes = constructor.getParameterTypes();
            if (parameterTypes.length == 1 && parameterTypes[0].equals(C11651k.class)) {
                return (AbstractC11482e) constructor.newInstance(this.f36580c);
            }
        }
        return cls.newInstance();
    }

    /* renamed from: b */
    private AbstractC11482e m977b(C11481d c11481d) {
        AbstractC11483f abstractC11483f = (AbstractC11483f) c11481d.m947d(AbstractC11483f.class);
        return abstractC11483f != null ? m983a(abstractC11483f.m944a()) : new C11469a(this.f36580c);
    }

    /* renamed from: g */
    private int m972g() {
        return C11481d.m956a(this.f36580c.m408f()).size();
    }

    /* renamed from: a */
    public C11472b m980a(AbstractC11484g abstractC11484g) {
        ArrayList arrayList = new ArrayList(this.f36578a);
        arrayList.add(abstractC11484g);
        return new C11472b(arrayList, this.f36579b.subList(1, this.f36579b.size()), this.f36580c);
    }

    /* renamed from: a */
    public boolean m985a() {
        return this.f36579b.size() == 0;
    }

    /* renamed from: a */
    public Object[] m984a(int i, int i2) {
        Object[] objArr = new Object[i2 - i];
        for (int i3 = i; i3 < i2; i3++) {
            objArr[i3 - i] = this.f36578a.get(i3).mo942a();
        }
        return objArr;
    }

    /* renamed from: a */
    public Object[] m979a(boolean z) {
        Object[] objArr = new Object[this.f36578a.size()];
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 < objArr.length) {
                objArr[i2] = this.f36578a.get(i2).mo941b();
                i = i2 + 1;
            } else {
                return objArr;
            }
        }
    }

    /* renamed from: b */
    public C11481d m978b() {
        return this.f36579b.get(0);
    }

    /* renamed from: c */
    public List<AbstractC11484g> m976c() {
        C11481d m978b = m978b();
        List<AbstractC11484g> mo945a = m977b(m978b).mo945a(m978b);
        return mo945a.size() == 0 ? m981a(m978b) : mo945a;
    }

    /* renamed from: d */
    public Object[] m975d() {
        return m984a(0, m972g());
    }

    /* renamed from: e */
    public Object[] m974e() {
        return m984a(m972g(), this.f36578a.size());
    }

    /* renamed from: f */
    public Object[] m973f() {
        return m984a(0, this.f36578a.size());
    }
}
