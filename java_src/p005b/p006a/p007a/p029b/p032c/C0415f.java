package p005b.p006a.p007a.p029b.p032c;

import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import p005b.p006a.p007a.p029b.AbstractC0594j;
import p005b.p006a.p007a.p029b.C0494h;
/* renamed from: b.a.a.b.c.f */
/* loaded from: classes.dex */
public class C0415f<E> extends AbstractC0413d<E> {

    /* renamed from: c */
    protected AbstractC0594j<E> f502c;

    /* renamed from: d */
    private Charset f503d;

    /* renamed from: e */
    private boolean f504e = true;

    /* renamed from: a */
    private void m39382a(StringBuilder sb, String str) {
        if (str != null) {
            sb.append(str);
        }
    }

    /* renamed from: a */
    private byte[] m39383a(String str) {
        if (this.f503d == null) {
            return str.getBytes();
        }
        try {
            return str.getBytes(this.f503d.name());
        } catch (UnsupportedEncodingException e) {
            throw new IllegalStateException("An existing charset cannot possibly be unsupported.");
        }
    }

    @Override // p005b.p006a.p007a.p029b.p032c.AbstractC0412c
    /* renamed from: a */
    public void mo39373a() {
        m39375g();
    }

    /* renamed from: a */
    public void mo38785a(AbstractC0594j<E> abstractC0594j) {
        this.f502c = abstractC0594j;
    }

    @Override // p005b.p006a.p007a.p029b.p032c.AbstractC0413d, p005b.p006a.p007a.p029b.p032c.AbstractC0412c
    /* renamed from: a */
    public void mo39371a(OutputStream outputStream) {
        super.mo39371a(outputStream);
        m39376f();
    }

    @Override // p005b.p006a.p007a.p029b.p032c.AbstractC0412c
    /* renamed from: a */
    public void mo39370a(E e) {
        this.f498b.write(m39383a(this.f502c.mo38773a((AbstractC0594j<E>) e)));
        if (this.f504e) {
            this.f498b.flush();
        }
    }

    /* renamed from: a */
    public void m39381a(Charset charset) {
        this.f503d = charset;
    }

    /* renamed from: a */
    public void m39380a(boolean z) {
        this.f504e = z;
    }

    /* renamed from: b */
    public boolean m39379b() {
        return this.f504e;
    }

    @Override // p005b.p006a.p007a.p029b.p032c.AbstractC0413d, p005b.p006a.p007a.p029b.p055o.AbstractC0669m
    /* renamed from: b_ */
    public boolean mo38480b_() {
        return false;
    }

    /* renamed from: d */
    public AbstractC0594j<E> m39378d() {
        return this.f502c;
    }

    /* renamed from: e */
    public Charset m39377e() {
        return this.f503d;
    }

    /* renamed from: f */
    void m39376f() {
        if (this.f502c == null || this.f498b == null) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        m39382a(sb, this.f502c.mo38763e());
        m39382a(sb, this.f502c.mo38762f());
        if (sb.length() <= 0) {
            return;
        }
        sb.append(C0494h.f715c);
        this.f498b.write(m39383a(sb.toString()));
        this.f498b.flush();
    }

    /* renamed from: g */
    void m39375g() {
        if (this.f502c == null || this.f498b == null) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        m39382a(sb, this.f502c.mo38761g());
        m39382a(sb, this.f502c.mo38760h());
        if (sb.length() <= 0) {
            return;
        }
        this.f498b.write(m39383a(sb.toString()));
        this.f498b.flush();
    }

    @Override // p005b.p006a.p007a.p029b.p032c.AbstractC0413d, p005b.p006a.p007a.p029b.p055o.AbstractC0669m
    /* renamed from: j */
    public void mo38474j() {
        this.f497a = true;
    }

    @Override // p005b.p006a.p007a.p029b.p032c.AbstractC0413d, p005b.p006a.p007a.p029b.p055o.AbstractC0669m
    /* renamed from: k */
    public void mo38473k() {
        this.f497a = false;
        if (this.f498b != null) {
            try {
                this.f498b.flush();
            } catch (IOException e) {
            }
        }
    }
}
