package p005b.p006a.p007a.p029b.p045i;

import java.util.List;
import java.util.regex.Pattern;
/* renamed from: b.a.a.b.i.l */
/* loaded from: classes.dex */
public class C0592l<E> extends AbstractC0547a<E> {

    /* renamed from: b */
    Pattern f1020b;

    /* renamed from: c */
    String f1021c;

    /* renamed from: d */
    String f1022d;

    @Override // p005b.p006a.p007a.p029b.p045i.AbstractC0547a
    /* renamed from: a */
    protected String mo38777a(E e, String str) {
        return !this.f1004h ? str : this.f1020b.matcher(str).replaceAll(this.f1022d);
    }

    @Override // p005b.p006a.p007a.p029b.p045i.AbstractC0584d, p005b.p006a.p007a.p029b.p055o.AbstractC0669m
    /* renamed from: j */
    public void mo38474j() {
        List<String> e = e();
        if (e == null) {
            c("at least two options are expected whereas you have declared none");
            return;
        }
        int size = e.size();
        if (size < 2) {
            c("at least two options are expected whereas you have declared only " + size + "as [" + e + "]");
            return;
        }
        this.f1021c = e.get(0);
        this.f1020b = Pattern.compile(this.f1021c);
        this.f1022d = e.get(1);
        super.j();
    }
}
