package p005b.p006a.p007a.p008a.p028p;

import java.io.File;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import p005b.p006a.p007a.p008a.C0286f;
import p005b.p006a.p007a.p008a.p016g.C0292a;
import p005b.p006a.p007a.p029b.p030a.AbstractC0402a;
import p005b.p006a.p007a.p029b.p056p.AbstractC0686k;
import p005b.p006a.p007a.p029b.p056p.C0677b;
import p005b.p006a.p007a.p029b.p058r.C0720s;
import p005b.p006a.p007a.p029b.p058r.C0724u;
/* renamed from: b.a.a.a.p.a */
/* loaded from: classes.dex */
public class C0393a {

    /* renamed from: a */
    public static final String f461a = "logback.xml";

    /* renamed from: b */
    public static final String f462b = "logback.configurationFile";

    /* renamed from: c */
    public static final String f463c = "logback.statusListenerClass";

    /* renamed from: f */
    private static final String f464f = AbstractC0402a.m39413c();

    /* renamed from: d */
    final ClassLoader f465d = C0720s.m38398a(this);

    /* renamed from: e */
    final C0286f f466e;

    public C0393a(C0286f c0286f) {
        this.f466e = c0286f;
    }

    /* renamed from: a */
    private InputStream m39438a(String str, ClassLoader classLoader, boolean z) {
        InputStream resourceAsStream = classLoader.getResourceAsStream(str);
        if (z) {
            String str2 = null;
            if (resourceAsStream != null) {
                str2 = str;
            }
            m39439a(str, classLoader, str2);
        }
        return resourceAsStream;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.net.URL] */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* renamed from: a */
    private URL m39437a(boolean z) {
        URL url;
        String str = 0;
        String str2 = null;
        String str3 = null;
        String m38374c = C0724u.m38374c(f462b);
        try {
            if (m38374c != null) {
                try {
                    File file = new File(m38374c);
                    if (!file.exists() || !file.isFile()) {
                        url = new URL(m38374c);
                    } else {
                        if (z) {
                            m39439a(m38374c, this.f465d, m38374c);
                        }
                        url = file.toURI().toURL();
                    }
                    if (!z) {
                        return url;
                    }
                    ClassLoader classLoader = this.f465d;
                    if (url != null) {
                        str2 = url.toString();
                    }
                    m39439a(m38374c, classLoader, str2);
                    return url;
                } catch (MalformedURLException e) {
                    URL m38392b = C0720s.m38392b(m38374c, this.f465d);
                    if (m38392b != null) {
                        if (!z) {
                            return m38392b;
                        }
                        ClassLoader classLoader2 = this.f465d;
                        if (m38392b != null) {
                            str3 = m38392b.toString();
                        }
                        m39439a(m38374c, classLoader2, str3);
                        return m38392b;
                    } else if (z) {
                        m39439a(m38374c, this.f465d, m38392b != null ? m38392b.toString() : null);
                    }
                }
            }
            return null;
        } catch (Throwable th) {
            if (z) {
                ClassLoader classLoader3 = this.f465d;
                if (0 != 0) {
                    str = str.toString();
                }
                m39439a(m38374c, classLoader3, str);
            }
            throw th;
        }
    }

    /* renamed from: a */
    private void m39439a(String str, ClassLoader classLoader, String str2) {
        AbstractC0686k n = this.f466e.n();
        if (str2 == null) {
            n.mo38506a(new C0677b("Could NOT find resource [" + str + "]", this.f466e));
        } else {
            n.mo38506a(new C0677b("Found resource [" + str + "] at [" + str2 + "]", this.f466e));
        }
    }

    /* renamed from: b */
    private InputStream m39436b(boolean z) {
        return m39438a(f464f + "/" + f461a, this.f465d, z);
    }

    /* renamed from: a */
    public void m39440a() {
        InputStream m39436b;
        C0400h.m39421a(this.f466e);
        boolean z = false;
        C0292a c0292a = new C0292a();
        c0292a.a(this.f466e);
        URL m39437a = m39437a(true);
        if (m39437a != null) {
            c0292a.a(m39437a);
            z = true;
        }
        if (z || (m39436b = m39436b(true)) == null) {
            return;
        }
        c0292a.a(m39436b);
    }
}
