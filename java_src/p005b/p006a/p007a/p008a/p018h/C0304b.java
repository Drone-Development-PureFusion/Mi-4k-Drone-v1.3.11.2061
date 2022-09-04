package p005b.p006a.p007a.p008a.p018h;

import java.util.Enumeration;
import java.util.HashSet;
import java.util.Set;
import java.util.logging.LogManager;
import java.util.logging.Logger;
import p005b.p006a.p007a.p008a.C0281d;
import p005b.p006a.p007a.p008a.C0283e;
import p005b.p006a.p007a.p008a.C0286f;
import p005b.p006a.p007a.p008a.p026n.AbstractC0371i;
import p005b.p006a.p007a.p029b.p055o.AbstractC0669m;
import p005b.p006a.p007a.p029b.p055o.C0662f;
@Deprecated
/* renamed from: b.a.a.a.h.b */
/* loaded from: classes.dex */
public class C0304b extends C0662f implements AbstractC0371i, AbstractC0669m {

    /* renamed from: c */
    private Set f267c = new HashSet();

    /* renamed from: a */
    boolean f265a = false;

    /* renamed from: b */
    boolean f266b = false;

    /* renamed from: b */
    private void m39708b(C0283e c0283e, C0281d c0281d) {
        d("Propagating " + c0281d + " level on " + c0283e + " onto the JUL framework");
        Logger m39715a = C0303a.m39715a(c0283e);
        this.f267c.add(m39715a);
        m39715a.setLevel(C0303a.m39716a(c0281d));
    }

    /* renamed from: d */
    private void m39707d() {
        for (C0283e c0283e : ((C0286f) this.f1199s).m39752c()) {
            if (c0283e.m39779c() != null) {
                m39708b(c0283e, c0283e.m39779c());
            }
        }
    }

    @Override // p005b.p006a.p007a.p008a.p026n.AbstractC0371i
    /* renamed from: a */
    public void mo39563a(C0283e c0283e, C0281d c0281d) {
        m39708b(c0283e, c0281d);
    }

    @Override // p005b.p006a.p007a.p008a.p026n.AbstractC0371i
    /* renamed from: a */
    public void mo39562a(C0286f c0286f) {
    }

    /* renamed from: a */
    public void m39710a(boolean z) {
        this.f266b = z;
    }

    @Override // p005b.p006a.p007a.p008a.p026n.AbstractC0371i
    /* renamed from: a */
    public boolean mo39564a() {
        return false;
    }

    /* renamed from: b */
    public void m39709b() {
        LogManager logManager = LogManager.getLogManager();
        Enumeration<String> loggerNames = logManager.getLoggerNames();
        while (loggerNames.hasMoreElements()) {
            String nextElement = loggerNames.nextElement();
            Logger logger = logManager.getLogger(nextElement);
            if (C0303a.m39713a(logger) && logger.getLevel() != null) {
                d("Setting level of jul logger [" + nextElement + "] to null");
                logger.setLevel(null);
            }
        }
    }

    @Override // p005b.p006a.p007a.p008a.p026n.AbstractC0371i
    /* renamed from: b */
    public void mo39561b(C0286f c0286f) {
    }

    @Override // p005b.p006a.p007a.p029b.p055o.AbstractC0669m
    /* renamed from: b_ */
    public boolean mo38480b_() {
        return this.f265a;
    }

    @Override // p005b.p006a.p007a.p008a.p026n.AbstractC0371i
    /* renamed from: c */
    public void mo39560c(C0286f c0286f) {
    }

    @Override // p005b.p006a.p007a.p029b.p055o.AbstractC0669m
    /* renamed from: j */
    public void mo38474j() {
        if (this.f266b) {
            m39709b();
        }
        m39707d();
        this.f265a = true;
    }

    @Override // p005b.p006a.p007a.p029b.p055o.AbstractC0669m
    /* renamed from: k */
    public void mo38473k() {
        this.f265a = false;
    }
}
