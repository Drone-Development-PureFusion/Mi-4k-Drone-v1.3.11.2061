package p005b.p006a.p007a.p029b.p045i;

import p005b.p006a.p007a.p029b.AbstractC0427f;
import p005b.p006a.p007a.p029b.p055o.AbstractC0661e;
/* renamed from: b.a.a.b.i.c */
/* loaded from: classes.dex */
public class C0578c {
    /* renamed from: a */
    public static <E> void m38817a(AbstractC0427f abstractC0427f, AbstractC0566b<E> abstractC0566b) {
        for (AbstractC0566b<E> abstractC0566b2 = abstractC0566b; abstractC0566b2 != null; abstractC0566b2 = abstractC0566b2.m38860b()) {
            if (abstractC0566b2 instanceof AbstractC0661e) {
                ((AbstractC0661e) abstractC0566b2).mo38551a(abstractC0427f);
            }
        }
    }

    /* renamed from: a */
    public static <E> void m38816a(AbstractC0566b<E> abstractC0566b) {
        for (AbstractC0566b<E> abstractC0566b2 = abstractC0566b; abstractC0566b2 != null; abstractC0566b2 = abstractC0566b2.m38860b()) {
            if (abstractC0566b2 instanceof AbstractC0547a) {
                AbstractC0547a abstractC0547a = (AbstractC0547a) abstractC0566b2;
                m38816a(abstractC0547a.f929a);
                abstractC0547a.j();
            } else if (abstractC0566b2 instanceof AbstractC0584d) {
                ((AbstractC0584d) abstractC0566b2).mo38474j();
            }
        }
    }

    /* renamed from: b */
    public static <E> AbstractC0566b<E> m38815b(AbstractC0566b<E> abstractC0566b) {
        while (abstractC0566b != null) {
            AbstractC0566b<E> m38860b = abstractC0566b.m38860b();
            if (m38860b == null) {
                break;
            }
            abstractC0566b = m38860b;
        }
        return abstractC0566b;
    }
}
