package org.p328c.p347e.p349b;

import org.p328c.p347e.C11622c;
import org.p328c.p347e.C11632j;
import org.p328c.p347e.p349b.C11609b;
/* JADX INFO: Access modifiers changed from: package-private */
@C11609b.AbstractC11610a
/* renamed from: org.c.e.b.e */
/* loaded from: classes.dex */
public final class C11621e extends C11609b {

    /* renamed from: a */
    private final C11609b f36755a;

    /* renamed from: b */
    private final Object f36756b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C11621e(C11609b c11609b, Object obj) {
        this.f36755a = c11609b;
        this.f36756b = obj;
    }

    @Override // org.p328c.p347e.p349b.C11609b
    /* renamed from: a */
    public void mo476a(C11608a c11608a) {
        synchronized (this.f36756b) {
            this.f36755a.mo476a(c11608a);
        }
    }

    @Override // org.p328c.p347e.p349b.C11609b
    /* renamed from: a */
    public void mo475a(C11622c c11622c) {
        synchronized (this.f36756b) {
            this.f36755a.mo475a(c11622c);
        }
    }

    @Override // org.p328c.p347e.p349b.C11609b
    /* renamed from: a */
    public void mo474a(C11632j c11632j) {
        synchronized (this.f36756b) {
            this.f36755a.mo474a(c11632j);
        }
    }

    @Override // org.p328c.p347e.p349b.C11609b
    /* renamed from: b */
    public void mo473b(C11608a c11608a) {
        synchronized (this.f36756b) {
            this.f36755a.mo473b(c11608a);
        }
    }

    @Override // org.p328c.p347e.p349b.C11609b
    /* renamed from: b */
    public void mo553b(C11622c c11622c) {
        synchronized (this.f36756b) {
            this.f36755a.mo553b(c11622c);
        }
    }

    @Override // org.p328c.p347e.p349b.C11609b
    /* renamed from: c */
    public void mo472c(C11622c c11622c) {
        synchronized (this.f36756b) {
            this.f36755a.mo472c(c11622c);
        }
    }

    @Override // org.p328c.p347e.p349b.C11609b
    /* renamed from: d */
    public void mo471d(C11622c c11622c) {
        synchronized (this.f36756b) {
            this.f36755a.mo471d(c11622c);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C11621e) {
            return this.f36755a.equals(((C11621e) obj).f36755a);
        }
        return false;
    }

    public int hashCode() {
        return this.f36755a.hashCode();
    }

    public String toString() {
        return this.f36755a.toString() + " (with synchronization wrapper)";
    }
}
