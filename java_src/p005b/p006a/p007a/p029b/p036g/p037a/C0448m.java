package p005b.p006a.p007a.p029b.p036g.p037a;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.List;
import p005b.p006a.p007a.p029b.p036g.p038b.C0463d;
import p005b.p006a.p007a.p029b.p036g.p038b.C0464e;
import p005b.p006a.p007a.p029b.p036g.p040d.C0479k;
import p005b.p006a.p007a.p029b.p036g.p040d.C0481m;
import p005b.p006a.p007a.p029b.p036g.p041e.C0486a;
/* renamed from: b.a.a.b.g.a.m */
/* loaded from: classes.dex */
public class C0448m extends AbstractC0435b {

    /* renamed from: a */
    private static final String f603a = "included";

    /* renamed from: b */
    private static final String f604b = "configuration";

    /* renamed from: c */
    private int f605c = 2;

    /* renamed from: a */
    private InputStream m39270a(URL url) {
        try {
            return url.openStream();
        } catch (IOException e) {
            if (!c()) {
                a("Failed to open [" + url.toString() + "]", (Throwable) e);
            }
            return null;
        }
    }

    /* renamed from: a */
    private String m39274a(C0463d c0463d) {
        return c0463d.f625c.length() > 0 ? c0463d.f625c : c0463d.f624b;
    }

    /* renamed from: a */
    private void m39273a(C0464e c0464e) {
        boolean z;
        boolean z2;
        int i;
        C0463d c0463d;
        List<C0463d> m39240d = c0464e.m39240d();
        if (m39240d.size() == 0) {
            return;
        }
        C0463d c0463d2 = m39240d.get(0);
        if (c0463d2 != null) {
            String m39274a = m39274a(c0463d2);
            z2 = f603a.equalsIgnoreCase(m39274a);
            z = f604b.equalsIgnoreCase(m39274a);
        } else {
            z = false;
            z2 = false;
        }
        if (!z2 && !z) {
            return;
        }
        m39240d.remove(0);
        int size = m39240d.size();
        if (size == 0 || (c0463d = m39240d.get(size - 1)) == null) {
            return;
        }
        String m39274a2 = m39274a(c0463d);
        if ((!z2 || !f603a.equalsIgnoreCase(m39274a2)) && (!z || !f604b.equalsIgnoreCase(m39274a2))) {
            return;
        }
        m39240d.remove(i);
    }

    /* renamed from: a */
    protected C0464e mo39271a(InputStream inputStream, URL url) {
        return new C0464e(c_());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public void m39275a(int i) {
        this.f605c = i;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p005b.p006a.p007a.p029b.p036g.p037a.AbstractC0435b
    /* renamed from: a */
    public void mo39272a(C0479k c0479k, URL url) {
        InputStream m39270a = m39270a(url);
        try {
            if (m39270a != null) {
                C0486a.m39146b(c_(), url);
                C0464e mo39271a = mo39271a(m39270a, url);
                mo39271a.mo38551a(c_());
                mo39271a.m39246a(m39270a);
                m39273a(mo39271a);
                c0479k.m39192c().m39184a().m39206a(mo39271a.m39240d(), this.f605c);
            }
        } catch (C0481m e) {
            a("Failed processing [" + url.toString() + "]", (Throwable) e);
        } finally {
            a(m39270a);
        }
    }
}
