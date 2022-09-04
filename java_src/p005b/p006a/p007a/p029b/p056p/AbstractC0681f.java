package p005b.p006a.p007a.p029b.p056p;

import java.io.PrintStream;
import p005b.p006a.p007a.p029b.p055o.AbstractC0669m;
import p005b.p006a.p007a.p029b.p055o.C0662f;
import p005b.p006a.p007a.p029b.p058r.C0726w;
/* renamed from: b.a.a.b.p.f */
/* loaded from: classes.dex */
abstract class AbstractC0681f extends C0662f implements AbstractC0669m, AbstractC0684i {

    /* renamed from: b */
    static final long f1213b = 300;

    /* renamed from: a */
    boolean f1214a = false;

    /* renamed from: c */
    long f1215c = f1213b;

    /* renamed from: b */
    private void m38521b(AbstractC0682g abstractC0682g) {
        StringBuilder sb = new StringBuilder();
        C0726w.m38366a(sb, "", abstractC0682g);
        mo38524a().print(sb);
    }

    /* renamed from: d */
    private void m38520d() {
        if (this.f1199s == null) {
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        for (AbstractC0682g abstractC0682g : this.f1199s.mo39315n().mo38507a()) {
            if (currentTimeMillis - abstractC0682g.mo38512f().longValue() < this.f1215c) {
                m38521b(abstractC0682g);
            }
        }
    }

    /* renamed from: a */
    protected abstract PrintStream mo38524a();

    /* renamed from: a */
    public void mo38523a(long j) {
        this.f1215c = j;
    }

    /* renamed from: a_ */
    public void mo38508a_(AbstractC0682g abstractC0682g) {
        if (!this.f1214a) {
            return;
        }
        m38521b(abstractC0682g);
    }

    /* renamed from: b */
    public long mo38522b() {
        return this.f1215c;
    }

    /* renamed from: b_ */
    public boolean mo38480b_() {
        return this.f1214a;
    }

    /* renamed from: j */
    public void mo38474j() {
        this.f1214a = true;
        if (this.f1215c > 0) {
            m38520d();
        }
    }

    /* renamed from: k */
    public void mo38473k() {
        this.f1214a = false;
    }
}
