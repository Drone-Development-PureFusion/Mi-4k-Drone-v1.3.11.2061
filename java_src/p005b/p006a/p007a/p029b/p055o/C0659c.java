package p005b.p006a.p007a.p029b.p055o;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import p005b.p006a.p007a.p029b.AbstractC0401a;
/* renamed from: b.a.a.b.o.c */
/* loaded from: classes.dex */
public class C0659c<E> implements AbstractC0658b<E> {

    /* renamed from: a */
    static final long f1194a = System.currentTimeMillis();

    /* renamed from: b */
    private final CopyOnWriteArrayList<AbstractC0401a<E>> f1195b = new CopyOnWriteArrayList<>();

    /* renamed from: a */
    public int m38568a(E e) {
        int i = 0;
        Iterator<AbstractC0401a<E>> it2 = this.f1195b.iterator();
        while (true) {
            int i2 = i;
            if (it2.hasNext()) {
                it2.next().mo38478d((AbstractC0401a<E>) e);
                i = i2 + 1;
            } else {
                return i2;
            }
        }
    }

    @Override // p005b.p006a.p007a.p029b.p055o.AbstractC0658b
    /* renamed from: a */
    public void mo38569a(AbstractC0401a<E> abstractC0401a) {
        if (abstractC0401a == null) {
            throw new IllegalArgumentException("Null argument disallowed");
        }
        this.f1195b.addIfAbsent(abstractC0401a);
    }

    @Override // p005b.p006a.p007a.p029b.p055o.AbstractC0658b
    /* renamed from: a_ */
    public AbstractC0401a<E> mo38567a_(String str) {
        if (str == null) {
            return null;
        }
        Iterator<AbstractC0401a<E>> it2 = this.f1195b.iterator();
        while (it2.hasNext()) {
            AbstractC0401a<E> next = it2.next();
            if (str.equals(next.mo38476g())) {
                return next;
            }
        }
        return null;
    }

    @Override // p005b.p006a.p007a.p029b.p055o.AbstractC0658b
    /* renamed from: b */
    public boolean mo38566b(AbstractC0401a<E> abstractC0401a) {
        if (abstractC0401a == null) {
            return false;
        }
        Iterator<AbstractC0401a<E>> it2 = this.f1195b.iterator();
        while (it2.hasNext()) {
            if (it2.next() == abstractC0401a) {
                return true;
            }
        }
        return false;
    }

    @Override // p005b.p006a.p007a.p029b.p055o.AbstractC0658b
    /* renamed from: b */
    public boolean mo38565b(String str) {
        boolean z;
        if (str == null) {
            return false;
        }
        Iterator<AbstractC0401a<E>> it2 = this.f1195b.iterator();
        while (true) {
            if (!it2.hasNext()) {
                z = false;
                break;
            }
            AbstractC0401a<E> next = it2.next();
            if (str.equals(next.mo38476g())) {
                z = this.f1195b.remove(next);
                break;
            }
        }
        return z;
    }

    @Override // p005b.p006a.p007a.p029b.p055o.AbstractC0658b
    /* renamed from: c */
    public boolean mo38564c(AbstractC0401a<E> abstractC0401a) {
        if (abstractC0401a == null) {
            return false;
        }
        return this.f1195b.remove(abstractC0401a);
    }

    @Override // p005b.p006a.p007a.p029b.p055o.AbstractC0658b
    /* renamed from: e */
    public void mo38563e() {
        Iterator<AbstractC0401a<E>> it2 = this.f1195b.iterator();
        while (it2.hasNext()) {
            it2.next().k();
        }
        this.f1195b.clear();
    }

    @Override // p005b.p006a.p007a.p029b.p055o.AbstractC0658b
    /* renamed from: f */
    public Iterator<AbstractC0401a<E>> mo38562f() {
        return this.f1195b.iterator();
    }
}
