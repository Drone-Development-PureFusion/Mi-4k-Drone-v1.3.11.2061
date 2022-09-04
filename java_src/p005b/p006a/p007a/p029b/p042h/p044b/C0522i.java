package p005b.p006a.p007a.p029b.p042h.p044b;

import javax.net.ssl.SSLSocket;
/* renamed from: b.a.a.b.h.b.i */
/* loaded from: classes.dex */
public class C0522i implements AbstractC0520g {

    /* renamed from: a */
    private final SSLSocket f807a;

    public C0522i(SSLSocket sSLSocket) {
        this.f807a = sSLSocket;
    }

    @Override // p005b.p006a.p007a.p029b.p042h.p044b.AbstractC0520g
    /* renamed from: a */
    public void mo39014a(boolean z) {
        this.f807a.setNeedClientAuth(z);
    }

    @Override // p005b.p006a.p007a.p029b.p042h.p044b.AbstractC0520g
    /* renamed from: a */
    public void mo39013a(String[] strArr) {
        this.f807a.setEnabledProtocols(strArr);
    }

    @Override // p005b.p006a.p007a.p029b.p042h.p044b.AbstractC0520g
    /* renamed from: a */
    public String[] mo39015a() {
        return this.f807a.getEnabledProtocols();
    }

    @Override // p005b.p006a.p007a.p029b.p042h.p044b.AbstractC0520g
    /* renamed from: b */
    public void mo39011b(boolean z) {
        this.f807a.setWantClientAuth(z);
    }

    @Override // p005b.p006a.p007a.p029b.p042h.p044b.AbstractC0520g
    /* renamed from: b */
    public void mo39010b(String[] strArr) {
        this.f807a.setEnabledCipherSuites(strArr);
    }

    @Override // p005b.p006a.p007a.p029b.p042h.p044b.AbstractC0520g
    /* renamed from: b */
    public String[] mo39012b() {
        return this.f807a.getSupportedProtocols();
    }

    @Override // p005b.p006a.p007a.p029b.p042h.p044b.AbstractC0520g
    /* renamed from: c */
    public String[] mo39009c() {
        return this.f807a.getEnabledCipherSuites();
    }

    @Override // p005b.p006a.p007a.p029b.p042h.p044b.AbstractC0520g
    /* renamed from: d */
    public String[] mo39008d() {
        return this.f807a.getSupportedCipherSuites();
    }
}
