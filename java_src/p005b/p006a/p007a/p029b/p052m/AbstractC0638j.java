package p005b.p006a.p007a.p029b.p052m;

import java.io.File;
import java.util.Date;
import p005b.p006a.p007a.p029b.p052m.p053a.AbstractC0606a;
import p005b.p006a.p007a.p029b.p052m.p053a.C0612f;
import p005b.p006a.p007a.p029b.p052m.p053a.C0624o;
import p005b.p006a.p007a.p029b.p055o.C0662f;
/* renamed from: b.a.a.b.m.j */
/* loaded from: classes.dex */
public abstract class AbstractC0638j<E> extends C0662f implements AbstractC0637i<E> {

    /* renamed from: d */
    protected C0639k<E> f1136d;

    /* renamed from: f */
    protected String f1138f;

    /* renamed from: g */
    protected C0624o f1139g;

    /* renamed from: j */
    protected long f1142j;

    /* renamed from: e */
    protected AbstractC0606a f1137e = null;

    /* renamed from: h */
    protected long f1140h = -1;

    /* renamed from: i */
    protected Date f1141i = null;

    /* renamed from: k */
    protected boolean f1143k = false;

    @Override // p005b.p006a.p007a.p029b.p052m.AbstractC0637i
    /* renamed from: a */
    public void mo38644a(long j) {
        this.f1140h = j;
    }

    @Override // p005b.p006a.p007a.p029b.p052m.AbstractC0637i
    /* renamed from: a */
    public void mo38643a(C0639k<E> c0639k) {
        this.f1136d = c0639k;
    }

    /* renamed from: a */
    public void m38642a(Date date) {
        this.f1141i = date;
    }

    /* renamed from: b */
    public String mo38641b() {
        return this.f1136d.f1146c.m38705a((Object) this.f1141i);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: b */
    public void m38640b(long j) {
        this.f1141i.setTime(j);
    }

    @Override // p005b.p006a.p007a.p029b.p055o.AbstractC0669m
    /* renamed from: b_ */
    public boolean mo38480b_() {
        return this.f1143k;
    }

    @Override // p005b.p006a.p007a.p029b.p052m.AbstractC0637i
    /* renamed from: e */
    public String mo38639e() {
        return this.f1138f;
    }

    @Override // p005b.p006a.p007a.p029b.p052m.AbstractC0637i
    /* renamed from: f */
    public AbstractC0606a mo38638f() {
        return this.f1137e;
    }

    @Override // p005b.p006a.p007a.p029b.p052m.AbstractC0637i
    /* renamed from: g */
    public long mo38637g() {
        return this.f1140h >= 0 ? this.f1140h : System.currentTimeMillis();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: h */
    public void m38636h() {
        this.f1142j = this.f1139g.m38683a(this.f1141i);
    }

    /* renamed from: j */
    public void mo38474j() {
        C0612f m38701b = this.f1136d.f1123j.m38701b();
        if (m38701b == null) {
            throw new IllegalStateException("FileNamePattern [" + this.f1136d.f1123j.m38698d() + "] does not contain a valid DateToken");
        }
        this.f1139g = new C0624o();
        this.f1139g.m38684a(m38701b.m38728a());
        d("The date pattern is '" + m38701b.m38728a() + "' from file name pattern '" + this.f1136d.f1123j.m38698d() + "'.");
        this.f1139g.m38685a(this);
        m38642a(new Date(mo38637g()));
        if (this.f1136d.n() != null) {
            File file = new File(this.f1136d.n());
            if (file.exists() && file.canRead()) {
                m38642a(new Date(file.lastModified()));
            }
        }
        d("Setting initial period to " + this.f1141i);
        m38636h();
    }

    @Override // p005b.p006a.p007a.p029b.p055o.AbstractC0669m
    /* renamed from: k */
    public void mo38473k() {
        this.f1143k = false;
    }
}
