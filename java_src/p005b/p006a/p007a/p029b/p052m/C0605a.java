package p005b.p006a.p007a.p029b.p052m;

import java.io.File;
import java.util.Date;
import p005b.p006a.p007a.p029b.p052m.p053a.C0627q;
/* renamed from: b.a.a.b.m.a */
/* loaded from: classes.dex */
public class C0605a<E> extends AbstractC0638j<E> {
    @Override // p005b.p006a.p007a.p029b.p052m.AbstractC0640l
    /* renamed from: a */
    public boolean mo38623a(File file, E e) {
        long g = g();
        if (g >= this.f1142j) {
            Date date = this.f1141i;
            d("Elapsed period: " + date);
            this.f1138f = this.f1136d.f1146c.m38705a((Object) date);
            b(g);
            h();
            return true;
        }
        return false;
    }

    @Override // p005b.p006a.p007a.p029b.p052m.AbstractC0638j, p005b.p006a.p007a.p029b.p055o.AbstractC0669m
    /* renamed from: j */
    public void mo38474j() {
        super.mo38474j();
        this.f1137e = new C0627q(this.f1136d.f1123j, this.f1139g);
        this.f1137e.a(this.f1199s);
        this.f1143k = true;
    }

    public String toString() {
        return "c.q.l.core.rolling.DefaultTimeBasedFileNamingAndTriggeringPolicy";
    }
}
