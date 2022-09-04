package p005b.p006a.p007a.p029b.p052m;

import java.io.File;
import java.util.Date;
import p005b.p006a.p007a.p029b.p036g.p040d.AbstractC0482n;
import p005b.p006a.p007a.p029b.p052m.p053a.AbstractC0606a;
import p005b.p006a.p007a.p029b.p052m.p053a.C0614h;
import p005b.p006a.p007a.p029b.p052m.p053a.C0626p;
import p005b.p006a.p007a.p029b.p052m.p053a.EnumC0608c;
import p005b.p006a.p007a.p029b.p058r.C0715n;
@AbstractC0482n
/* renamed from: b.a.a.b.m.g */
/* loaded from: classes.dex */
public class C0635g<E> extends AbstractC0638j<E> {

    /* renamed from: b */
    C0715n f1127b;

    /* renamed from: c */
    String f1128c;

    /* renamed from: l */
    private int f1129l;

    /* renamed from: a */
    int f1126a = 0;

    /* renamed from: m */
    private int f1130m = 1;

    /* renamed from: a */
    private String m38650a(Date date, int i) {
        return this.f1136d.f1123j.m38702a(this.f1141i, Integer.valueOf(i));
    }

    /* renamed from: a */
    protected AbstractC0606a m38652a() {
        return new C0626p(this.f1136d.f1123j, this.f1139g);
    }

    /* renamed from: a */
    void m38651a(String str) {
        File[] m38716a = C0614h.m38716a(new File(mo38641b()).getParentFile(), str);
        if (m38716a == null || m38716a.length == 0) {
            this.f1126a = 0;
            return;
        }
        this.f1126a = C0614h.m38713a(m38716a, str);
        if (this.f1136d.n() == null && this.f1136d.f1122i == EnumC0608c.NONE) {
            return;
        }
        this.f1126a++;
    }

    @Override // p005b.p006a.p007a.p029b.p052m.AbstractC0640l
    /* renamed from: a */
    public boolean mo38623a(File file, E e) {
        long g = g();
        if (g >= this.f1142j) {
            this.f1138f = this.f1136d.f1146c.m38702a(this.f1141i, Integer.valueOf(this.f1126a));
            this.f1126a = 0;
            b(g);
            h();
            return true;
        }
        int i = this.f1129l + 1;
        this.f1129l = i;
        if ((i & this.f1130m) != this.f1130m) {
            return false;
        }
        if (this.f1130m < 15) {
            this.f1130m = (this.f1130m << 1) + 1;
        }
        if (file.length() < this.f1127b.m38410a()) {
            return false;
        }
        this.f1138f = this.f1136d.f1146c.m38702a(this.f1141i, Integer.valueOf(this.f1126a));
        this.f1126a++;
        return true;
    }

    @Override // p005b.p006a.p007a.p029b.p052m.AbstractC0638j, p005b.p006a.p007a.p029b.p052m.AbstractC0637i
    /* renamed from: b */
    public String mo38641b() {
        return this.f1136d.f1146c.m38702a(this.f1141i, Integer.valueOf(this.f1126a));
    }

    /* renamed from: b */
    public void m38649b(String str) {
        this.f1128c = str;
        this.f1127b = C0715n.m38409a(str);
    }

    /* renamed from: d */
    public String m38648d() {
        return this.f1128c;
    }

    @Override // p005b.p006a.p007a.p029b.p052m.AbstractC0638j, p005b.p006a.p007a.p029b.p055o.AbstractC0669m
    /* renamed from: j */
    public void mo38474j() {
        super.mo38474j();
        this.f1137e = m38652a();
        this.f1137e.a(this.f1199s);
        m38651a(C0614h.m38715a(this.f1136d.f1123j.m38703a(this.f1141i)));
        this.f1143k = true;
    }
}
