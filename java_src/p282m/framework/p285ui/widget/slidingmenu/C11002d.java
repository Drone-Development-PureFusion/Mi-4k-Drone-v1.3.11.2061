package p282m.framework.p285ui.widget.slidingmenu;

import java.util.ArrayList;
import java.util.Iterator;
/* renamed from: m.framework.ui.widget.slidingmenu.d */
/* loaded from: classes2.dex */
final class C11002d {

    /* renamed from: a */
    int f35468a;

    /* renamed from: b */
    String f35469b;

    /* renamed from: c */
    private ArrayList<C11003e> f35470c = new ArrayList<>();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public int m2327a() {
        if (this.f35470c == null) {
            return 0;
        }
        return this.f35470c.size();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public C11003e m2326a(int i) {
        if (this.f35470c == null) {
            return null;
        }
        Iterator<C11003e> it2 = this.f35470c.iterator();
        while (it2.hasNext()) {
            C11003e next = it2.next();
            if (next != null && next.f35472b == i) {
                return next;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m2325a(C11003e c11003e) {
        if (c11003e == null) {
            return;
        }
        C11003e m2326a = m2326a(c11003e.f35472b);
        c11003e.f35471a = this.f35468a;
        if (m2326a == null) {
            this.f35470c.add(c11003e);
            return;
        }
        int indexOf = this.f35470c.indexOf(m2326a);
        this.f35470c.remove(indexOf);
        this.f35470c.add(indexOf, c11003e);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public C11003e m2324b(int i) {
        return this.f35470c.get(i);
    }
}
