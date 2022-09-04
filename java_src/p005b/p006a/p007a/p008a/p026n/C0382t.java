package p005b.p006a.p007a.p008a.p026n;

import java.util.concurrent.CopyOnWriteArrayList;
import org.p356d.AbstractC11759f;
import p005b.p006a.p007a.p008a.C0281d;
import p005b.p006a.p007a.p008a.C0283e;
import p005b.p006a.p007a.p008a.p027o.AbstractC0392i;
import p005b.p006a.p007a.p029b.p055o.EnumC0668l;
/* renamed from: b.a.a.a.n.t */
/* loaded from: classes.dex */
public final class C0382t extends CopyOnWriteArrayList<AbstractC0392i> {
    private static final long serialVersionUID = 1;

    /* renamed from: a */
    public EnumC0668l m39483a(AbstractC11759f abstractC11759f, C0283e c0283e, C0281d c0281d, String str, Object[] objArr, Throwable th) {
        if (size() == 1) {
            try {
                return get(0).mo39443a(abstractC11759f, c0283e, c0281d, str, objArr, th);
            } catch (IndexOutOfBoundsException e) {
                return EnumC0668l.NEUTRAL;
            }
        }
        for (Object obj : toArray()) {
            EnumC0668l mo39443a = ((AbstractC0392i) obj).mo39443a(abstractC11759f, c0283e, c0281d, str, objArr, th);
            if (mo39443a == EnumC0668l.DENY || mo39443a == EnumC0668l.ACCEPT) {
                return mo39443a;
            }
        }
        return EnumC0668l.NEUTRAL;
    }
}
