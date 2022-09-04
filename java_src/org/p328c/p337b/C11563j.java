package org.p328c.p337b;

import java.io.PrintStream;
import java.text.NumberFormat;
import java.util.List;
import org.p328c.p347e.C11622c;
import org.p328c.p347e.C11632j;
import org.p328c.p347e.p349b.C11608a;
import org.p328c.p347e.p349b.C11609b;
import p005b.p006a.p007a.p029b.C0494h;
/* renamed from: org.c.b.j */
/* loaded from: classes2.dex */
public class C11563j extends C11609b {

    /* renamed from: a */
    private final PrintStream f36685a;

    public C11563j(PrintStream printStream) {
        this.f36685a = printStream;
    }

    public C11563j(AbstractC11558g abstractC11558g) {
        this(abstractC11558g.mo776a());
    }

    /* renamed from: a */
    private PrintStream m774a() {
        return this.f36685a;
    }

    /* renamed from: a */
    protected void m773a(long j) {
        m774a().println();
        m774a().println("Time: " + m771b(j));
    }

    @Override // org.p328c.p347e.p349b.C11609b
    /* renamed from: a */
    public void mo476a(C11608a c11608a) {
        this.f36685a.append('E');
    }

    /* renamed from: a */
    protected void m772a(C11608a c11608a, String str) {
        m774a().println(str + ") " + c11608a.m575a());
        m774a().print(c11608a.m572d());
    }

    @Override // org.p328c.p347e.p349b.C11609b
    /* renamed from: a */
    public void mo474a(C11632j c11632j) {
        m773a(c11632j.m484c());
        m770b(c11632j);
        m769c(c11632j);
    }

    /* renamed from: b */
    protected String m771b(long j) {
        return NumberFormat.getInstance().format(j / 1000.0d);
    }

    @Override // org.p328c.p347e.p349b.C11609b
    /* renamed from: b */
    public void mo553b(C11622c c11622c) {
        this.f36685a.append(C0494h.f686G);
    }

    /* renamed from: b */
    protected void m770b(C11632j c11632j) {
        List<C11608a> m482d = c11632j.m482d();
        if (m482d.size() == 0) {
            return;
        }
        if (m482d.size() == 1) {
            m774a().println("There was " + m482d.size() + " failure:");
        } else {
            m774a().println("There were " + m482d.size() + " failures:");
        }
        int i = 1;
        for (C11608a c11608a : m482d) {
            m772a(c11608a, "" + i);
            i++;
        }
    }

    @Override // org.p328c.p347e.p349b.C11609b
    /* renamed from: c */
    public void mo472c(C11622c c11622c) {
        this.f36685a.append('I');
    }

    /* renamed from: c */
    protected void m769c(C11632j c11632j) {
        if (c11632j.m478f()) {
            m774a().println();
            m774a().print("OK");
            m774a().println(" (" + c11632j.m488a() + " test" + (c11632j.m488a() == 1 ? "" : "s") + ")");
        } else {
            m774a().println();
            m774a().println("FAILURES!!!");
            m774a().println("Tests run: " + c11632j.m488a() + ",  Failures: " + c11632j.m486b());
        }
        m774a().println();
    }
}
