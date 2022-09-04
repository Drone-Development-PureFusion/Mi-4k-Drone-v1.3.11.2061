package p005b.p006a.p007a.p008a.p026n;

import java.io.Serializable;
import java.util.Comparator;
import org.p356d.AbstractC11747c;
import p005b.p006a.p007a.p008a.C0283e;
/* renamed from: b.a.a.a.n.f */
/* loaded from: classes.dex */
public class C0368f implements Serializable, Comparator<C0283e> {
    private static final long serialVersionUID = 1;

    @Override // java.util.Comparator
    /* renamed from: a */
    public int compare(C0283e c0283e, C0283e c0283e2) {
        if (c0283e.mo88d().equals(c0283e2.mo88d())) {
            return 0;
        }
        if (c0283e.mo88d().equals(AbstractC11747c.f37061c)) {
            return -1;
        }
        if (!c0283e2.mo88d().equals(AbstractC11747c.f37061c)) {
            return c0283e.mo88d().compareTo(c0283e2.mo88d());
        }
        return 1;
    }
}
