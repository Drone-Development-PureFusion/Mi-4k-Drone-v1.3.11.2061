package p005b.p006a.p007a.p029b.p055o;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import p005b.p006a.p007a.p029b.p033d.AbstractC0421c;
/* renamed from: b.a.a.b.o.k */
/* loaded from: classes.dex */
public final class C0667k<E> implements AbstractC0666j<E> {

    /* renamed from: a */
    CopyOnWriteArrayList<AbstractC0421c<E>> f1207a = new CopyOnWriteArrayList<>();

    @Override // p005b.p006a.p007a.p029b.p055o.AbstractC0666j
    /* renamed from: a */
    public void mo38483a(AbstractC0421c<E> abstractC0421c) {
        this.f1207a.add(abstractC0421c);
    }

    @Override // p005b.p006a.p007a.p029b.p055o.AbstractC0666j
    /* renamed from: a_ */
    public List<AbstractC0421c<E>> mo38481a_() {
        return new ArrayList(this.f1207a);
    }

    /* JADX WARN: Removed duplicated region for block: B:4:0x000c  */
    @Override // p005b.p006a.p007a.p029b.p055o.AbstractC0666j
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public EnumC0668l mo38477e(E e) {
        Iterator<AbstractC0421c<E>> it2 = this.f1207a.iterator();
        while (it2.hasNext()) {
            EnumC0668l mo39358a = it2.next().mo39358a((AbstractC0421c<E>) e);
            if (mo39358a == EnumC0668l.DENY || mo39358a == EnumC0668l.ACCEPT) {
                return mo39358a;
            }
            while (it2.hasNext()) {
            }
        }
        return EnumC0668l.NEUTRAL;
    }

    @Override // p005b.p006a.p007a.p029b.p055o.AbstractC0666j
    /* renamed from: h */
    public void mo38475h() {
        this.f1207a.clear();
    }
}
