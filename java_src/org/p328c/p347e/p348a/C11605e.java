package org.p328c.p347e.p348a;

import java.util.Comparator;
import org.p328c.p347e.C11622c;
/* renamed from: org.c.e.a.e */
/* loaded from: classes.dex */
public class C11605e implements Comparator<C11622c> {

    /* renamed from: a */
    public static final C11605e f36733a = new C11605e(new Comparator<C11622c>() { // from class: org.c.e.a.e.1
        @Override // java.util.Comparator
        /* renamed from: a */
        public int compare(C11622c c11622c, C11622c c11622c2) {
            return 0;
        }
    });

    /* renamed from: b */
    private final Comparator<C11622c> f36734b;

    public C11605e(Comparator<C11622c> comparator) {
        this.f36734b = comparator;
    }

    @Override // java.util.Comparator
    /* renamed from: a */
    public int compare(C11622c c11622c, C11622c c11622c2) {
        return this.f36734b.compare(c11622c, c11622c2);
    }

    /* renamed from: a */
    public void m578a(Object obj) {
        if (obj instanceof AbstractC11604d) {
            ((AbstractC11604d) obj).mo342a(this);
        }
    }
}
