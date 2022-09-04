package p005b.p006a.p007a.p029b;

import java.io.IOException;
import java.io.OutputStream;
import p005b.p006a.p007a.p029b.p032c.AbstractC0412c;
import p005b.p006a.p007a.p029b.p032c.C0415f;
import p005b.p006a.p007a.p029b.p055o.AbstractC0665i;
import p005b.p006a.p007a.p029b.p055o.C0670n;
import p005b.p006a.p007a.p029b.p056p.AbstractC0682g;
import p005b.p006a.p007a.p029b.p056p.C0676a;
/* renamed from: b.a.a.b.o */
/* loaded from: classes.dex */
public class C0651o<E> extends AbstractC0689q<E> {

    /* renamed from: a */
    private OutputStream f1174a;

    /* renamed from: c */
    protected AbstractC0412c<E> f1175c;

    /* renamed from: d */
    protected C0670n f1176d = new C0670n();

    /* renamed from: a */
    public void m38595a(AbstractC0412c<E> abstractC0412c) {
        this.f1175c = abstractC0412c;
    }

    /* renamed from: a */
    public void m38594a(AbstractC0594j<E> abstractC0594j) {
        e("This appender no longer admits a layout as a sub-component, set an encoder instead.");
        e("To ensure compatibility, wrapping your layout in LayoutWrappingEncoder.");
        e("See also http://logback.qos.ch/codes.html#layoutInsteadOfEncoder for details");
        C0415f c0415f = new C0415f();
        c0415f.mo38785a((AbstractC0594j) abstractC0594j);
        c0415f.a(this.f1199s);
        this.f1175c = c0415f;
    }

    /* renamed from: a */
    public void m38593a(OutputStream outputStream) {
        synchronized (this.f1176d) {
            m38589m();
            this.f1174a = outputStream;
            if (this.f1175c == null) {
                e("Encoder has not been set. Cannot invoke its init method.");
            } else {
                m38588n();
            }
        }
    }

    @Override // p005b.p006a.p007a.p029b.AbstractC0689q
    /* renamed from: a */
    protected void mo38482a(E e) {
        if (!b_()) {
            return;
        }
        mo38591c((C0651o<E>) e);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: b */
    public void mo38592b(E e) {
        this.f1175c.mo39370a((AbstractC0412c<E>) e);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: c */
    public void mo38591c(E e) {
        if (!b_()) {
            return;
        }
        try {
            if (e instanceof AbstractC0665i) {
                ((AbstractC0665i) e).mo38531o();
            }
            synchronized (this.f1176d) {
                mo38592b(e);
            }
        } catch (IOException e2) {
            this.f1233j = false;
            a((AbstractC0682g) new C0676a("IO failure in appender", this, e2));
        }
    }

    @Override // p005b.p006a.p007a.p029b.AbstractC0689q, p005b.p006a.p007a.p029b.p055o.AbstractC0669m
    /* renamed from: j */
    public void mo38474j() {
        int i = 0;
        if (this.f1175c == null) {
            a((AbstractC0682g) new C0676a("No encoder set for the appender named \"" + this.f1234k + "\".", this));
            i = 1;
        }
        if (this.f1174a == null) {
            a((AbstractC0682g) new C0676a("No output stream set for the appender named \"" + this.f1234k + "\".", this));
            i++;
        }
        if (i == 0) {
            super.mo38474j();
        }
    }

    @Override // p005b.p006a.p007a.p029b.AbstractC0689q, p005b.p006a.p007a.p029b.p055o.AbstractC0669m
    /* renamed from: k */
    public void mo38473k() {
        synchronized (this.f1176d) {
            m38589m();
            super.mo38473k();
        }
    }

    /* renamed from: l */
    public OutputStream m38590l() {
        return this.f1174a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: m */
    public void m38589m() {
        if (this.f1174a != null) {
            try {
                m38587o();
                this.f1174a.close();
                this.f1174a = null;
            } catch (IOException e) {
                a((AbstractC0682g) new C0676a("Could not close output stream for OutputStreamAppender.", this, e));
            }
        }
    }

    /* renamed from: n */
    void m38588n() {
        if (this.f1175c == null || this.f1174a == null) {
            return;
        }
        try {
            this.f1175c.mo39371a(this.f1174a);
        } catch (IOException e) {
            this.f1233j = false;
            a((AbstractC0682g) new C0676a("Failed to initialize encoder for appender named [" + this.f1234k + "].", this, e));
        }
    }

    /* renamed from: o */
    void m38587o() {
        if (this.f1175c == null || this.f1174a == null) {
            return;
        }
        try {
            this.f1175c.mo39373a();
        } catch (IOException e) {
            this.f1233j = false;
            a((AbstractC0682g) new C0676a("Failed to write footer for appender named [" + this.f1234k + "].", this, e));
        }
    }

    /* renamed from: p */
    public AbstractC0412c<E> m38586p() {
        return this.f1175c;
    }
}
