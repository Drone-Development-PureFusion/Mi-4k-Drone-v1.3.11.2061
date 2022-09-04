package p005b.p006a.p007a.p008a.p020j;

import java.io.IOException;
import java.io.OutputStream;
import p005b.p006a.p007a.p008a.C0291g;
import p005b.p006a.p007a.p008a.p022k.C0353y;
import p005b.p006a.p007a.p008a.p026n.AbstractC0366d;
import p005b.p006a.p007a.p008a.p026n.AbstractC0367e;
import p005b.p006a.p007a.p008a.p026n.C0378p;
import p005b.p006a.p007a.p008a.p028p.C0397e;
import p005b.p006a.p007a.p029b.AbstractC0594j;
import p005b.p006a.p007a.p029b.C0494h;
import p005b.p006a.p007a.p029b.p042h.AbstractC0543i;
/* renamed from: b.a.a.a.j.k */
/* loaded from: classes.dex */
public class C0324k extends AbstractC0543i<AbstractC0366d> {

    /* renamed from: a */
    public static final String f323a = "[%thread] %logger %msg";

    /* renamed from: b */
    public static final String f324b = "\t";

    /* renamed from: c */
    C0291g f325c = new C0291g();

    /* renamed from: d */
    String f326d = f324b;

    /* renamed from: e */
    boolean f327e = false;

    /* renamed from: a */
    private void m39641a(OutputStream outputStream, AbstractC0367e abstractC0367e, String str, boolean z) {
        StringBuilder append = new StringBuilder().append(str);
        if (!z) {
            append.append(C0494h.f727o);
        }
        append.append(abstractC0367e.mo39488b()).append(": ").append(abstractC0367e.mo39490a());
        outputStream.write(append.toString().getBytes());
        outputStream.flush();
    }

    /* renamed from: r */
    private void m39635r() {
        this.f325c.m().put("syslogStart", C0353y.class.getName());
        this.f325c.f(m39642a() + this.f326d);
        this.f325c.a(c_());
        this.f325c.j();
    }

    /* renamed from: a */
    String m39642a() {
        return "%syslogStart{" + l() + "}%nopex{}";
    }

    @Override // p005b.p006a.p007a.p029b.p042h.AbstractC0543i
    /* renamed from: a */
    protected void mo38891a(Object obj, OutputStream outputStream) {
        AbstractC0366d abstractC0366d;
        AbstractC0367e mo39532h;
        if (!this.f327e && (mo39532h = (abstractC0366d = (AbstractC0366d) obj).mo39532h()) != null) {
            String mo38773a = this.f325c.mo38773a(abstractC0366d);
            boolean z = true;
            while (mo39532h != null) {
                C0378p[] mo39487c = mo39532h.mo39487c();
                try {
                    m39641a(outputStream, mo39532h, mo38773a, z);
                    for (C0378p c0378p : mo39487c) {
                        StringBuilder sb = new StringBuilder();
                        sb.append(mo38773a).append(c0378p);
                        outputStream.write(sb.toString().getBytes());
                        outputStream.flush();
                    }
                    mo39532h = mo39532h.mo39485e();
                    z = false;
                } catch (IOException e) {
                    return;
                }
            }
        }
    }

    /* renamed from: a */
    public void m39640a(String str) {
        this.f326d = str;
    }

    /* renamed from: a */
    public void m39638a(boolean z) {
        this.f327e = z;
    }

    /* renamed from: a */
    boolean m39639a(StringBuilder sb, boolean z) {
        return false;
    }

    @Override // p005b.p006a.p007a.p029b.p042h.AbstractC0543i
    /* renamed from: b */
    public int mo38888b(Object obj) {
        return C0397e.m39429a((AbstractC0366d) obj);
    }

    @Override // p005b.p006a.p007a.p029b.p042h.AbstractC0543i
    /* renamed from: b */
    public AbstractC0594j<AbstractC0366d> mo38890b() {
        C0291g c0291g = new C0291g();
        c0291g.m().put("syslogStart", C0353y.class.getName());
        if (this.f881n == null) {
            this.f881n = f323a;
        }
        c0291g.f(m39642a() + this.f881n);
        c0291g.a(c_());
        c0291g.j();
        return c0291g;
    }

    /* renamed from: d */
    public boolean m39637d() {
        return this.f327e;
    }

    /* renamed from: e */
    public String m39636e() {
        return this.f326d;
    }

    @Override // p005b.p006a.p007a.p029b.p042h.AbstractC0543i, p005b.p006a.p007a.p029b.AbstractC0404b, p005b.p006a.p007a.p029b.p055o.AbstractC0669m
    /* renamed from: j */
    public void mo38474j() {
        super.mo38474j();
        m39635r();
    }
}
