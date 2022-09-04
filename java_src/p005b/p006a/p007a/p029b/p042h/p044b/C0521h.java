package p005b.p006a.p007a.p029b.p042h.p044b;

import javax.net.ssl.SSLServerSocket;
/* renamed from: b.a.a.b.h.b.h */
/* loaded from: classes.dex */
public class C0521h implements AbstractC0520g {

    /* renamed from: a */
    private final SSLServerSocket f806a;

    public C0521h(SSLServerSocket sSLServerSocket) {
        this.f806a = sSLServerSocket;
    }

    @Override // p005b.p006a.p007a.p029b.p042h.p044b.AbstractC0520g
    /* renamed from: a */
    public void mo39014a(boolean z) {
        this.f806a.setNeedClientAuth(z);
    }

    @Override // p005b.p006a.p007a.p029b.p042h.p044b.AbstractC0520g
    /* renamed from: a */
    public void mo39013a(String[] strArr) {
        this.f806a.setEnabledProtocols(strArr);
    }

    @Override // p005b.p006a.p007a.p029b.p042h.p044b.AbstractC0520g
    /* renamed from: a */
    public String[] mo39015a() {
        return this.f806a.getEnabledProtocols();
    }

    @Override // p005b.p006a.p007a.p029b.p042h.p044b.AbstractC0520g
    /* renamed from: b */
    public void mo39011b(boolean z) {
        this.f806a.setWantClientAuth(z);
    }

    @Override // p005b.p006a.p007a.p029b.p042h.p044b.AbstractC0520g
    /* renamed from: b */
    public void mo39010b(String[] strArr) {
        this.f806a.setEnabledCipherSuites(strArr);
    }

    @Override // p005b.p006a.p007a.p029b.p042h.p044b.AbstractC0520g
    /* renamed from: b */
    public String[] mo39012b() {
        return this.f806a.getSupportedProtocols();
    }

    @Override // p005b.p006a.p007a.p029b.p042h.p044b.AbstractC0520g
    /* renamed from: c */
    public String[] mo39009c() {
        return this.f806a.getEnabledCipherSuites();
    }

    @Override // p005b.p006a.p007a.p029b.p042h.p044b.AbstractC0520g
    /* renamed from: d */
    public String[] mo39008d() {
        return this.f806a.getSupportedCipherSuites();
    }
}
