package p070c.p074d;

import java.io.PrintStream;
import java.text.NumberFormat;
import java.util.Enumeration;
import p070c.p072b.AbstractC0753i;
import p070c.p072b.AbstractC0756l;
import p070c.p072b.C0745b;
import p070c.p072b.C0755k;
import p070c.p072b.C0757m;
import p070c.p073c.AbstractC0761a;
/* renamed from: c.d.a */
/* loaded from: classes.dex */
public class C0764a implements AbstractC0756l {

    /* renamed from: a */
    PrintStream f1429a;

    /* renamed from: b */
    int f1430b = 0;

    public C0764a(PrintStream printStream) {
        this.f1429a = printStream;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m38117a() {
        m38110b().println();
        m38110b().println("<RETURN> to continue");
    }

    /* renamed from: a */
    protected void m38116a(long j) {
        m38110b().println();
        m38110b().println("Time: " + m38109b(j));
    }

    @Override // p070c.p072b.AbstractC0756l
    /* renamed from: a */
    public void mo836a(AbstractC0753i abstractC0753i) {
    }

    @Override // p070c.p072b.AbstractC0756l
    /* renamed from: a */
    public void mo835a(AbstractC0753i abstractC0753i, C0745b c0745b) {
        m38110b().print("F");
    }

    @Override // p070c.p072b.AbstractC0756l
    /* renamed from: a */
    public void mo834a(AbstractC0753i abstractC0753i, Throwable th) {
        m38110b().print("E");
    }

    /* renamed from: a */
    protected void m38115a(C0755k c0755k) {
        m38110b().print(AbstractC0761a.m38127i(c0755k.m38187c()));
    }

    /* renamed from: a */
    public void m38114a(C0755k c0755k, int i) {
        m38108b(c0755k, i);
        m38115a(c0755k);
    }

    /* renamed from: a */
    protected void m38113a(C0757m c0757m) {
        m38111a(c0757m.m38177b(), c0757m.m38184a(), "error");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public synchronized void m38112a(C0757m c0757m, long j) {
        m38116a(j);
        m38113a(c0757m);
        m38107b(c0757m);
        m38106c(c0757m);
    }

    /* renamed from: a */
    protected void m38111a(Enumeration<C0755k> enumeration, int i, String str) {
        int i2 = 1;
        if (i == 0) {
            return;
        }
        if (i == 1) {
            m38110b().println("There was " + i + " " + str + ":");
        } else {
            m38110b().println("There were " + i + " " + str + "s:");
        }
        while (true) {
            int i3 = i2;
            if (!enumeration.hasMoreElements()) {
                return;
            }
            m38114a(enumeration.nextElement(), i3);
            i2 = i3 + 1;
        }
    }

    /* renamed from: b */
    public PrintStream m38110b() {
        return this.f1429a;
    }

    /* renamed from: b */
    protected String m38109b(long j) {
        return NumberFormat.getInstance().format(j / 1000.0d);
    }

    @Override // p070c.p072b.AbstractC0756l
    /* renamed from: b */
    public void mo833b(AbstractC0753i abstractC0753i) {
        m38110b().print(".");
        int i = this.f1430b;
        this.f1430b = i + 1;
        if (i >= 40) {
            m38110b().println();
            this.f1430b = 0;
        }
    }

    /* renamed from: b */
    protected void m38108b(C0755k c0755k, int i) {
        m38110b().print(i + ") " + c0755k.m38189a());
    }

    /* renamed from: b */
    protected void m38107b(C0757m c0757m) {
        m38111a(c0757m.m38173d(), c0757m.m38174c(), "failure");
    }

    /* renamed from: c */
    protected void m38106c(C0757m c0757m) {
        if (c0757m.m38169h()) {
            m38110b().println();
            m38110b().print("OK");
            m38110b().println(" (" + c0757m.m38172e() + " test" + (c0757m.m38172e() == 1 ? "" : "s") + ")");
        } else {
            m38110b().println();
            m38110b().println("FAILURES!!!");
            m38110b().println("Tests run: " + c0757m.m38172e() + ",  Failures: " + c0757m.m38174c() + ",  Errors: " + c0757m.m38184a());
        }
        m38110b().println();
    }
}
