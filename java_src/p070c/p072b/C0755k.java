package p070c.p072b;

import java.io.PrintWriter;
import java.io.StringWriter;
/* renamed from: c.b.k */
/* loaded from: classes.dex */
public class C0755k {

    /* renamed from: a */
    protected AbstractC0753i f1410a;

    /* renamed from: b */
    protected Throwable f1411b;

    public C0755k(AbstractC0753i abstractC0753i, Throwable th) {
        this.f1410a = abstractC0753i;
        this.f1411b = th;
    }

    /* renamed from: a */
    public AbstractC0753i m38189a() {
        return this.f1410a;
    }

    /* renamed from: b */
    public Throwable m38188b() {
        return this.f1411b;
    }

    /* renamed from: c */
    public String m38187c() {
        StringWriter stringWriter = new StringWriter();
        m38188b().printStackTrace(new PrintWriter(stringWriter));
        return stringWriter.toString();
    }

    /* renamed from: d */
    public String m38186d() {
        return m38188b().getMessage();
    }

    /* renamed from: e */
    public boolean m38185e() {
        return m38188b() instanceof C0745b;
    }

    public String toString() {
        return this.f1410a + ": " + this.f1411b.getMessage();
    }
}
