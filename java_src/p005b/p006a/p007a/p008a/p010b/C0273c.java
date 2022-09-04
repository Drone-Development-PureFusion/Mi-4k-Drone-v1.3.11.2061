package p005b.p006a.p007a.p008a.p010b;

import java.util.ArrayList;
import java.util.List;
import org.p356d.AbstractC11759f;
import p005b.p006a.p007a.p008a.p026n.AbstractC0366d;
import p005b.p006a.p007a.p029b.p031b.AbstractC0407c;
/* renamed from: b.a.a.a.b.c */
/* loaded from: classes.dex */
public class C0273c extends AbstractC0407c<AbstractC0366d> {

    /* renamed from: a */
    List<String> f162a = new ArrayList();

    /* renamed from: a */
    public void m39817a(String str) {
        this.f162a.add(str);
    }

    @Override // p005b.p006a.p007a.p029b.p031b.AbstractC0406b
    /* renamed from: a */
    public boolean mo39408a(AbstractC0366d abstractC0366d) {
        AbstractC11759f mo39529k = abstractC0366d.mo39529k();
        if (mo39529k == null) {
            return false;
        }
        for (String str : this.f162a) {
            if (mo39529k.mo10a(str)) {
                return true;
            }
        }
        return false;
    }
}
