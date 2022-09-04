package p005b.p006a.p007a.p008a.p016g.p017a;

import java.io.FileNotFoundException;
import java.net.URL;
import java.net.UnknownHostException;
import org.xml.sax.Attributes;
import p005b.p006a.p007a.p029b.p036g.p037a.AbstractC0435b;
import p005b.p006a.p007a.p029b.p036g.p040d.C0479k;
/* renamed from: b.a.a.a.g.a.a */
/* loaded from: classes.dex */
public class C0293a extends AbstractC0435b {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b.a.a.a.g.a.a$a */
    /* loaded from: classes.dex */
    public class C0294a {

        /* renamed from: b */
        private URL f249b;

        C0294a() {
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: a */
        public URL m39723a() {
            return this.f249b;
        }

        /* renamed from: a */
        void m39722a(URL url) {
            this.f249b = url;
        }
    }

    /* renamed from: a */
    private URL m39725a(C0479k c0479k) {
        URL m39723a;
        if (!c0479k.m39190e()) {
            Object m39189f = c0479k.m39189f();
            if ((m39189f instanceof C0294a) && (m39723a = ((C0294a) m39189f).m39723a()) != null) {
                return m39723a;
            }
        }
        return null;
    }

    /* renamed from: b */
    private URL m39724b(C0479k c0479k, URL url) {
        C0294a c0294a = new C0294a();
        c0294a.m39722a(url);
        c0479k.m39199a(c0294a);
        return url;
    }

    @Override // p005b.p006a.p007a.p029b.p036g.p037a.AbstractC0435b, p005b.p006a.p007a.p029b.p036g.p037a.AbstractC0436c
    /* renamed from: a */
    public void mo39258a(C0479k c0479k, String str, Attributes attributes) {
        if (m39725a(c0479k) != null) {
            return;
        }
        super.mo39258a(c0479k, str, attributes);
    }

    @Override // p005b.p006a.p007a.p029b.p036g.p037a.AbstractC0435b
    /* renamed from: a */
    protected void mo39272a(C0479k c0479k, URL url) {
        m39724b(c0479k, url);
    }

    @Override // p005b.p006a.p007a.p029b.p036g.p037a.AbstractC0435b
    /* renamed from: a */
    protected void mo39293a(String str, Exception exc) {
        if (exc == null || (exc instanceof FileNotFoundException) || (exc instanceof UnknownHostException)) {
            d(str);
        } else {
            c(str, exc);
        }
    }
}
