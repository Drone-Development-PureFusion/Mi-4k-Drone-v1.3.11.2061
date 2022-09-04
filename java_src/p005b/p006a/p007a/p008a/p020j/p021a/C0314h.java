package p005b.p006a.p007a.p008a.p020j.p021a;

import java.io.IOException;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.util.concurrent.Executor;
import javax.net.ServerSocketFactory;
import p005b.p006a.p007a.p008a.p020j.AbstractC0315b;
import p005b.p006a.p007a.p029b.p042h.AbstractRunnableC0513b;
import p005b.p006a.p007a.p029b.p042h.p043a.AbstractC0508j;
import p005b.p006a.p007a.p029b.p042h.p043a.AbstractRunnableC0509k;
import p005b.p006a.p007a.p029b.p058r.C0706e;
/* renamed from: b.a.a.a.j.a.h */
/* loaded from: classes.dex */
public class C0314h extends AbstractC0315b {

    /* renamed from: a */
    public static final int f284a = 50;

    /* renamed from: b */
    private int f285b = AbstractRunnableC0513b.f775a;

    /* renamed from: c */
    private int f286c = 50;

    /* renamed from: d */
    private String f287d;

    /* renamed from: e */
    private ServerSocket f288e;

    /* renamed from: f */
    private AbstractRunnableC0509k f289f;

    /* renamed from: a */
    protected AbstractC0508j<AbstractC0307a> m39687a(ServerSocket serverSocket) {
        return new C0308b(serverSocket);
    }

    /* renamed from: a */
    protected AbstractRunnableC0509k m39689a(AbstractC0508j<AbstractC0307a> abstractC0508j, Executor executor) {
        return new C0309c(abstractC0508j, executor);
    }

    /* renamed from: a */
    public void m39690a(int i) {
        this.f285b = i;
    }

    /* renamed from: a */
    public void m39688a(String str) {
        this.f287d = str;
    }

    @Override // p005b.p006a.p007a.p008a.p020j.AbstractC0315b
    /* renamed from: a */
    protected boolean mo39655a() {
        try {
            this.f289f = m39689a(m39687a(mo39685e().createServerSocket(m39683h(), m39682i(), m39684g())), c_().mo39311s());
            this.f289f.a(c_());
            return true;
        } catch (Exception e) {
            a("server startup error: " + e, e);
            C0706e.m38434a(this.f288e);
            return false;
        }
    }

    @Override // p005b.p006a.p007a.p008a.p020j.AbstractC0315b
    /* renamed from: b */
    protected void mo39649b() {
        try {
            if (this.f289f == null) {
                return;
            }
            this.f289f.mo39071b();
        } catch (IOException e) {
            a("server shutdown error: " + e, e);
        }
    }

    /* renamed from: b */
    public void m39686b(int i) {
        this.f286c = i;
    }

    @Override // p005b.p006a.p007a.p008a.p020j.AbstractC0315b
    /* renamed from: d */
    protected Runnable mo39645d() {
        return this.f289f;
    }

    /* renamed from: e */
    protected ServerSocketFactory mo39685e() {
        return ServerSocketFactory.getDefault();
    }

    /* renamed from: g */
    protected InetAddress m39684g() {
        if (m39681l() == null) {
            return null;
        }
        return InetAddress.getByName(m39681l());
    }

    /* renamed from: h */
    public int m39683h() {
        return this.f285b;
    }

    /* renamed from: i */
    public int m39682i() {
        return this.f286c;
    }

    /* renamed from: l */
    public String m39681l() {
        return this.f287d;
    }
}
