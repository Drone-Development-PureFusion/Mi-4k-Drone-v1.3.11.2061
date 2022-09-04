package p005b.p006a.p007a.p008a.p022k;

import p005b.p006a.p007a.p008a.p026n.AbstractC0366d;
import p005b.p006a.p007a.p029b.p045i.AbstractC0566b;
import p005b.p006a.p007a.p029b.p045i.AbstractC0591k;
import p005b.p006a.p007a.p029b.p045i.C0578c;
/* renamed from: b.a.a.a.k.h */
/* loaded from: classes.dex */
public class C0336h implements AbstractC0591k<AbstractC0366d> {
    @Override // p005b.p006a.p007a.p029b.p045i.AbstractC0591k
    /* renamed from: a */
    public void mo38778a(AbstractC0566b<AbstractC0366d> abstractC0566b) {
        if (abstractC0566b == null) {
            throw new IllegalArgumentException("cannot process empty chain");
        }
        if (m39620b(abstractC0566b)) {
            return;
        }
        C0578c.m38815b(abstractC0566b).m38859b(new C0337i());
    }

    /* renamed from: b */
    public boolean m39620b(AbstractC0566b abstractC0566b) {
        while (abstractC0566b != null) {
            if (abstractC0566b instanceof AbstractC0328ab) {
                return true;
            }
            abstractC0566b = abstractC0566b.m38860b();
        }
        return false;
    }
}
