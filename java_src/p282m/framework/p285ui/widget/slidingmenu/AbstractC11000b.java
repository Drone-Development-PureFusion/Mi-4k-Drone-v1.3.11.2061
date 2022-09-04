package p282m.framework.p285ui.widget.slidingmenu;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Iterator;
/* renamed from: m.framework.ui.widget.slidingmenu.b */
/* loaded from: classes2.dex */
public abstract class AbstractC11000b {

    /* renamed from: a */
    private ArrayList<C11002d> f35455a = new ArrayList<>();

    public AbstractC11000b(SlidingMenu slidingMenu) {
    }

    /* renamed from: c */
    private C11002d m2328c(int i) {
        if (this.f35455a == null) {
            return null;
        }
        Iterator<C11002d> it2 = this.f35455a.iterator();
        while (it2.hasNext()) {
            C11002d next = it2.next();
            if (next != null && next.f35468a == i) {
                return next;
            }
        }
        return null;
    }

    /* renamed from: a */
    public View m2342a() {
        return null;
    }

    /* renamed from: a */
    public abstract View m2339a(int i, ViewGroup viewGroup);

    /* renamed from: a */
    public abstract View m2334a(C11003e c11003e, ViewGroup viewGroup);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public C11002d m2341a(int i) {
        return this.f35455a.get(i);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public C11003e m2340a(int i, int i2) {
        return this.f35455a.get(i).m2324b(i2);
    }

    /* renamed from: a */
    public void m2338a(int i, String str) {
        C11002d m2328c = m2328c(i);
        if (m2328c == null) {
            m2328c = new C11002d();
            m2328c.f35468a = i;
            this.f35455a.add(m2328c);
        }
        m2328c.f35469b = str;
    }

    /* renamed from: a */
    public void m2337a(int i, C11003e c11003e) {
        C11002d m2328c;
        if (c11003e == null || (m2328c = m2328c(i)) == null) {
            return;
        }
        m2328c.m2325a(c11003e);
    }

    /* renamed from: a */
    void m2336a(C11002d c11002d) {
        if (c11002d == null) {
            return;
        }
        C11002d m2328c = m2328c(c11002d.f35468a);
        if (m2328c == null) {
            this.f35455a.add(c11002d);
            return;
        }
        int indexOf = this.f35455a.indexOf(m2328c);
        this.f35455a.remove(indexOf);
        this.f35455a.add(indexOf, c11002d);
    }

    /* renamed from: a */
    public void m2335a(C11003e c11003e) {
    }

    /* renamed from: a */
    public void m2333a(boolean z) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public int m2332b() {
        if (this.f35455a == null) {
            return 0;
        }
        return this.f35455a.size();
    }

    /* renamed from: b */
    protected String m2331b(int i) {
        return this.f35455a.get(i).f35469b;
    }

    /* renamed from: b */
    public C11003e m2330b(int i, int i2) {
        C11002d m2328c = m2328c(i);
        if (m2328c == null) {
            return null;
        }
        return m2328c.m2326a(i2);
    }

    /* renamed from: b */
    public boolean m2329b(C11003e c11003e) {
        return false;
    }
}
