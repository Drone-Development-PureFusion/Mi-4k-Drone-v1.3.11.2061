package p005b.p006a.p007a.p029b.p052m;

import java.io.File;
import java.io.IOException;
import p005b.p006a.p007a.p029b.C0546i;
import p005b.p006a.p007a.p029b.p052m.p053a.C0618i;
import p005b.p006a.p007a.p029b.p052m.p053a.EnumC0608c;
/* renamed from: b.a.a.b.m.c */
/* loaded from: classes.dex */
public class C0631c<E> extends C0546i<E> {

    /* renamed from: h */
    private static String f1114h = "http://logback.qos.ch/codes.html#rfa_no_tp";

    /* renamed from: i */
    private static String f1115i = "http://logback.qos.ch/codes.html#rfa_no_rp";

    /* renamed from: m */
    private static String f1116m = "http://logback.qos.ch/codes.html#rfa_collision";

    /* renamed from: e */
    File f1117e;

    /* renamed from: f */
    AbstractC0640l<E> f1118f;

    /* renamed from: g */
    AbstractC0632d f1119g;

    /* renamed from: t */
    private boolean m38660t() {
        C0618i c0618i;
        if (!(this.f1118f instanceof AbstractC0633e) || (c0618i = ((AbstractC0633e) this.f1118f).f1123j) == null || this.f925b == null) {
            return false;
        }
        return this.f925b.matches(c0618i.m38697e());
    }

    /* renamed from: a */
    public void m38667a(AbstractC0632d abstractC0632d) {
        this.f1119g = abstractC0632d;
        if (this.f1119g instanceof AbstractC0640l) {
            this.f1118f = (AbstractC0640l) abstractC0632d;
        }
    }

    /* renamed from: a */
    public void m38666a(AbstractC0640l<E> abstractC0640l) {
        this.f1118f = abstractC0640l;
        if (abstractC0640l instanceof AbstractC0632d) {
            this.f1119g = (AbstractC0632d) abstractC0640l;
        }
    }

    @Override // p005b.p006a.p007a.p029b.C0546i
    /* renamed from: a */
    public void mo38665a(String str) {
        if (str != null && (this.f1118f != null || this.f1119g != null)) {
            c("File property must be set before any triggeringPolicy or rollingPolicy properties");
            c("Visit http://logback.qos.ch/codes.html#rfa_file_after for more information");
        }
        super.mo38665a(str);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p005b.p006a.p007a.p029b.C0546i, p005b.p006a.p007a.p029b.C0651o
    /* renamed from: c */
    public void mo38591c(E e) {
        synchronized (this.f1118f) {
            if (this.f1118f.mo38623a(this.f1117e, e)) {
                m38663q();
            }
        }
        super.mo38591c((C0631c<E>) e);
    }

    @Override // p005b.p006a.p007a.p029b.C0546i
    /* renamed from: d */
    public String mo38664d() {
        return this.f1119g.mo38627d();
    }

    @Override // p005b.p006a.p007a.p029b.C0546i, p005b.p006a.p007a.p029b.C0651o, p005b.p006a.p007a.p029b.AbstractC0689q, p005b.p006a.p007a.p029b.p055o.AbstractC0669m
    /* renamed from: j */
    public void mo38474j() {
        if (this.f1118f == null) {
            e("No TriggeringPolicy was set for the RollingFileAppender named " + g());
            e("For more information, please visit " + f1114h);
            return;
        }
        if (!this.f924a) {
            e("Append mode is mandatory for RollingFileAppender");
            this.f924a = true;
        }
        if (this.f1119g == null) {
            c("No RollingPolicy was set for the RollingFileAppender named " + g());
            c("For more information, please visit " + f1115i);
        } else if (m38660t()) {
            c("File property collides with fileNamePattern. Aborting.");
            c("For more information, please visit " + f1116m);
        } else {
            if (e()) {
                if (b() != null) {
                    e("Setting \"File\" property to null on account of prudent mode");
                    mo38665a((String) null);
                }
                if (this.f1119g.mo38657g() != EnumC0608c.NONE) {
                    c("Compression is not supported in prudent mode. Aborting");
                    return;
                }
            }
            this.f1117e = new File(mo38664d());
            d("Active log file name: " + mo38664d());
            super.mo38474j();
        }
    }

    @Override // p005b.p006a.p007a.p029b.C0651o, p005b.p006a.p007a.p029b.AbstractC0689q, p005b.p006a.p007a.p029b.p055o.AbstractC0669m
    /* renamed from: k */
    public void mo38473k() {
        if (this.f1119g != null) {
            this.f1119g.k();
        }
        if (this.f1118f != null) {
            this.f1118f.k();
        }
        super.k();
    }

    /* renamed from: q */
    public void m38663q() {
        synchronized (this.f1176d) {
            m();
            try {
                this.f1119g.mo38629b();
            } catch (C0634f e) {
                e("RolloverFailure occurred. Deferring rollover");
                this.f924a = true;
            }
            String mo38627d = this.f1119g.mo38627d();
            try {
                this.f1117e = new File(mo38627d);
                b(mo38627d);
            } catch (IOException e2) {
                a("openFile(" + mo38627d + ") failed", e2);
            }
        }
    }

    /* renamed from: r */
    public AbstractC0632d m38662r() {
        return this.f1119g;
    }

    /* renamed from: s */
    public AbstractC0640l<E> m38661s() {
        return this.f1118f;
    }
}
