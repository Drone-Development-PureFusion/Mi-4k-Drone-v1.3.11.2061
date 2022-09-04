package p005b.p006a.p007a.p029b.p051l;

import java.io.IOException;
import java.io.OutputStream;
import p005b.p006a.p007a.p029b.AbstractC0427f;
import p005b.p006a.p007a.p029b.p056p.AbstractC0682g;
import p005b.p006a.p007a.p029b.p056p.AbstractC0686k;
import p005b.p006a.p007a.p029b.p056p.C0676a;
import p005b.p006a.p007a.p029b.p056p.C0677b;
/* renamed from: b.a.a.b.l.c */
/* loaded from: classes.dex */
public abstract class AbstractC0602c extends OutputStream {

    /* renamed from: a */
    static final int f1042a = 8;

    /* renamed from: b */
    protected OutputStream f1043b;

    /* renamed from: f */
    private AbstractC0427f f1047f;

    /* renamed from: g */
    private C0600a f1048g;

    /* renamed from: d */
    private int f1045d = 0;

    /* renamed from: e */
    private int f1046e = 0;

    /* renamed from: c */
    protected boolean f1044c = true;

    /* renamed from: a */
    private boolean m38746a() {
        return this.f1048g != null && !this.f1044c;
    }

    /* renamed from: b */
    private void m38742b() {
        if (this.f1048g != null) {
            this.f1048g = null;
            this.f1046e = 0;
            m38741b(new C0677b("Recovered from IO failure on " + mo38738c(), this));
        }
    }

    /* renamed from: a */
    public void m38745a(AbstractC0427f abstractC0427f) {
        this.f1047f = abstractC0427f;
    }

    /* renamed from: a */
    void m38744a(AbstractC0682g abstractC0682g) {
        this.f1046e++;
        if (this.f1046e < 8) {
            m38741b(abstractC0682g);
        }
        if (this.f1046e == 8) {
            m38741b(abstractC0682g);
            m38741b(new C0677b("Will supress future messages regarding " + mo38738c(), this));
        }
    }

    /* renamed from: a */
    void m38743a(IOException iOException) {
        m38744a(new C0676a("IO failure while writing to " + mo38738c(), this, iOException));
        this.f1044c = false;
        if (this.f1048g == null) {
            this.f1048g = new C0600a();
        }
    }

    /* renamed from: b */
    public void m38741b(AbstractC0682g abstractC0682g) {
        if (this.f1047f != null) {
            AbstractC0686k mo39315n = this.f1047f.mo39315n();
            if (mo39315n == null) {
                return;
            }
            mo39315n.mo38506a(abstractC0682g);
            return;
        }
        int i = this.f1045d;
        this.f1045d = i + 1;
        if (i != 0) {
            return;
        }
        System.out.println("LOGBACK: No context given for " + this);
    }

    /* renamed from: c */
    abstract String mo38738c();

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.f1043b != null) {
            this.f1043b.close();
        }
    }

    /* renamed from: d */
    abstract OutputStream mo38737d();

    /* renamed from: e */
    void m38740e() {
        try {
            close();
        } catch (IOException e) {
        }
        m38744a(new C0677b("Attempting to recover from IO failure on " + mo38738c(), this));
        try {
            this.f1043b = mo38737d();
            this.f1044c = true;
        } catch (IOException e2) {
            m38744a(new C0676a("Failed to open " + mo38738c(), this, e2));
        }
    }

    /* renamed from: f */
    public AbstractC0427f m38739f() {
        return this.f1047f;
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() {
        if (this.f1043b != null) {
            try {
                this.f1043b.flush();
                m38742b();
            } catch (IOException e) {
                m38743a(e);
            }
        }
    }

    @Override // java.io.OutputStream
    public void write(int i) {
        if (m38746a()) {
            if (this.f1048g.m38752a()) {
                return;
            }
            m38740e();
            return;
        }
        try {
            this.f1043b.write(i);
            m38742b();
        } catch (IOException e) {
            m38743a(e);
        }
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i, int i2) {
        if (m38746a()) {
            if (this.f1048g.m38752a()) {
                return;
            }
            m38740e();
            return;
        }
        try {
            this.f1043b.write(bArr, i, i2);
            m38742b();
        } catch (IOException e) {
            m38743a(e);
        }
    }
}
