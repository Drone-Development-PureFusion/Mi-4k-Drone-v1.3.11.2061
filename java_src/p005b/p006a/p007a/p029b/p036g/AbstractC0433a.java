package p005b.p006a.p007a.p029b.p036g;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import org.xml.sax.InputSource;
import p005b.p006a.p007a.p029b.AbstractC0427f;
import p005b.p006a.p007a.p029b.C0494h;
import p005b.p006a.p007a.p029b.p036g.p038b.C0463d;
import p005b.p006a.p007a.p029b.p036g.p038b.C0464e;
import p005b.p006a.p007a.p029b.p036g.p040d.AbstractC0484p;
import p005b.p006a.p007a.p029b.p036g.p040d.C0474f;
import p005b.p006a.p007a.p029b.p036g.p040d.C0475g;
import p005b.p006a.p007a.p029b.p036g.p040d.C0479k;
import p005b.p006a.p007a.p029b.p036g.p040d.C0480l;
import p005b.p006a.p007a.p029b.p036g.p040d.C0481m;
import p005b.p006a.p007a.p029b.p036g.p040d.C0485q;
import p005b.p006a.p007a.p029b.p036g.p041e.C0486a;
import p005b.p006a.p007a.p029b.p055o.C0662f;
import p005b.p006a.p007a.p029b.p056p.C0687l;
/* renamed from: b.a.a.b.g.a */
/* loaded from: classes.dex */
public abstract class AbstractC0433a extends C0662f {

    /* renamed from: a */
    protected C0480l f548a;

    /* renamed from: a */
    public static void m39308a(AbstractC0427f abstractC0427f, URL url) {
        C0486a.m39150a(abstractC0427f, url);
    }

    /* renamed from: a */
    private final void m39302a(InputSource inputSource) {
        long currentTimeMillis = System.currentTimeMillis();
        if (!C0486a.m39148b(this.f1199s)) {
            m39308a(c_(), (URL) null);
        }
        C0464e c0464e = new C0464e(this.f1199s);
        c0464e.mo39244a(inputSource);
        mo38598a(c0464e.m39240d());
        if (new C0687l(this.f1199s).m38488b(currentTimeMillis)) {
            d("Registering current configuration as safe fallback point");
            m39301d();
        }
    }

    /* renamed from: a */
    protected C0475g mo39309a() {
        return new C0475g();
    }

    /* renamed from: a */
    protected void mo39307a(C0474f c0474f) {
    }

    /* renamed from: a */
    protected abstract void mo38600a(C0480l c0480l);

    /* renamed from: a */
    protected abstract void mo38599a(AbstractC0484p abstractC0484p);

    /* renamed from: a */
    public final void m39306a(File file) {
        try {
            m39308a(c_(), file.toURI().toURL());
            m39305a(new FileInputStream(file));
        } catch (IOException e) {
            String str = "Could not open [" + file.getPath() + "].";
            a(str, e);
            throw new C0481m(str, e);
        }
    }

    /* renamed from: a */
    public final void m39305a(InputStream inputStream) {
        try {
            m39302a(new InputSource(inputStream));
            try {
                inputStream.close();
            } catch (IOException e) {
                a("Could not close the stream", e);
                throw new C0481m("Could not close the stream", e);
            }
        } catch (Throwable th) {
            try {
                inputStream.close();
                throw th;
            } catch (IOException e2) {
                a("Could not close the stream", e2);
                throw new C0481m("Could not close the stream", e2);
            }
        }
    }

    /* renamed from: a */
    public final void m39304a(String str) {
        m39306a(new File(str));
    }

    /* renamed from: a */
    public final void m39303a(URL url) {
        try {
            m39308a(c_(), url);
            URLConnection openConnection = url.openConnection();
            openConnection.setUseCaches(false);
            m39305a(openConnection.getInputStream());
        } catch (IOException e) {
            String str = "Could not open URL [" + url + "].";
            a(str, e);
            throw new C0481m(str, e);
        }
    }

    /* renamed from: a */
    public void mo38598a(List<C0463d> list) {
        mo39257b();
        synchronized (this.f1199s.mo39312r()) {
            this.f548a.m39184a().m39207a(list);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: b */
    public void mo39257b() {
        C0485q c0485q = new C0485q(this.f1199s);
        mo38599a(c0485q);
        this.f548a = new C0480l(this.f1199s, c0485q, mo39309a());
        C0479k m39168c = this.f548a.m39168c();
        m39168c.a(this.f1199s);
        mo38600a(this.f548a);
        mo39307a(m39168c.m39203a());
    }

    /* renamed from: d */
    public void m39301d() {
        this.f1199s.mo39320a(C0494h.f692M, this.f548a.m39184a().m39208a());
    }

    /* renamed from: e */
    public List<C0463d> m39300e() {
        return (List) this.f1199s.mo39316f(C0494h.f692M);
    }
}
