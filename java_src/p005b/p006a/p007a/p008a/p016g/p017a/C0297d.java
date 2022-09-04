package p005b.p006a.p007a.p008a.p016g.p017a;

import java.io.InputStream;
import java.net.URL;
import org.xml.sax.Attributes;
import p005b.p006a.p007a.p008a.p009a.C0264a;
import p005b.p006a.p007a.p008a.p016g.p017a.C0293a;
import p005b.p006a.p007a.p029b.p036g.p037a.C0448m;
import p005b.p006a.p007a.p029b.p036g.p038b.C0464e;
import p005b.p006a.p007a.p029b.p036g.p040d.C0479k;
import p005b.p006a.p007a.p029b.p036g.p040d.C0481m;
/* renamed from: b.a.a.a.g.a.d */
/* loaded from: classes.dex */
public class C0297d extends C0448m {

    /* renamed from: a */
    private static final int f254a = 1;

    public C0297d() {
        a(1);
    }

    @Override // p005b.p006a.p007a.p029b.p036g.p037a.C0448m
    /* renamed from: a */
    protected C0464e mo39271a(InputStream inputStream, URL url) {
        if (url.toString().endsWith("AndroidManifest.xml")) {
            C0264a c0264a = new C0264a();
            c0264a.m39857a("logback");
            return c0264a;
        }
        return new C0464e(c_());
    }

    @Override // p005b.p006a.p007a.p029b.p036g.p037a.AbstractC0435b, p005b.p006a.p007a.p029b.p036g.p037a.AbstractC0436c
    /* renamed from: a */
    public void mo39259a(C0479k c0479k, String str) {
        if (c0479k.m39190e() || !(c0479k.m39189f() instanceof C0293a.C0294a)) {
            return;
        }
        URL m39723a = ((C0293a.C0294a) c0479k.m39187g()).m39723a();
        if (m39723a == null) {
            d("No paths found from includes");
            return;
        }
        d("Path found [" + m39723a.toString() + "]");
        try {
            a(c0479k, m39723a);
        } catch (C0481m e) {
            a("Failed to process include [" + m39723a.toString() + "]", (Throwable) e);
        }
    }

    @Override // p005b.p006a.p007a.p029b.p036g.p037a.AbstractC0435b, p005b.p006a.p007a.p029b.p036g.p037a.AbstractC0436c
    /* renamed from: a */
    public void mo39258a(C0479k c0479k, String str, Attributes attributes) {
    }
}
