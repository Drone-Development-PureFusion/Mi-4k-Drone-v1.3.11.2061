package p005b.p006a.p007a.p029b.p036g.p041e;

import java.net.URL;
import p005b.p006a.p007a.p029b.AbstractC0427f;
import p005b.p006a.p007a.p029b.C0494h;
import p005b.p006a.p007a.p029b.p036g.p040d.C0469c;
import p005b.p006a.p007a.p029b.p056p.AbstractC0682g;
import p005b.p006a.p007a.p029b.p056p.AbstractC0686k;
import p005b.p006a.p007a.p029b.p056p.C0677b;
import p005b.p006a.p007a.p029b.p056p.C0688m;
/* renamed from: b.a.a.b.g.e.a */
/* loaded from: classes.dex */
public class C0486a {

    /* renamed from: a */
    static final C0486a f667a = new C0486a();

    private C0486a() {
    }

    /* renamed from: a */
    public static URL m39153a(AbstractC0427f abstractC0427f) {
        C0469c m39145c = m39145c(abstractC0427f);
        if (m39145c == null) {
            return null;
        }
        return m39145c.m39235b();
    }

    /* renamed from: a */
    static void m39152a(AbstractC0427f abstractC0427f, AbstractC0682g abstractC0682g) {
        if (abstractC0427f == null) {
            System.out.println("Null context in " + C0469c.class.getName());
            return;
        }
        AbstractC0686k mo39315n = abstractC0427f.mo39315n();
        if (mo39315n == null) {
            return;
        }
        mo39315n.mo38506a(abstractC0682g);
    }

    /* renamed from: a */
    static void m39151a(AbstractC0427f abstractC0427f, String str) {
        m39152a(abstractC0427f, new C0677b(str, f667a));
    }

    /* renamed from: a */
    public static void m39150a(AbstractC0427f abstractC0427f, URL url) {
        if (abstractC0427f == null) {
            return;
        }
        C0469c m39145c = m39145c(abstractC0427f);
        if (m39145c == null) {
            m39145c = new C0469c();
            m39145c.a(abstractC0427f);
            abstractC0427f.mo39320a(C0494h.f690K, m39145c);
        } else {
            m39145c.m39237a();
        }
        m39149a(abstractC0427f, true);
        m39145c.m39236a(url);
    }

    /* renamed from: a */
    public static void m39149a(AbstractC0427f abstractC0427f, boolean z) {
        abstractC0427f.mo39320a(C0494h.f691L, Boolean.valueOf(z));
    }

    /* renamed from: b */
    static void m39147b(AbstractC0427f abstractC0427f, String str) {
        m39152a(abstractC0427f, new C0688m(str, f667a));
    }

    /* renamed from: b */
    public static void m39146b(AbstractC0427f abstractC0427f, URL url) {
        C0469c m39145c = m39145c(abstractC0427f);
        if (m39145c == null) {
            m39147b(abstractC0427f, "Null ConfigurationWatchList. Cannot add " + url);
            return;
        }
        m39151a(abstractC0427f, "Adding [" + url + "] to configuration watch list.");
        m39145c.m39234b(url);
    }

    /* renamed from: b */
    public static boolean m39148b(AbstractC0427f abstractC0427f) {
        Object mo39316f;
        if (abstractC0427f != null && (mo39316f = abstractC0427f.mo39316f(C0494h.f691L)) != null) {
            return ((Boolean) mo39316f).booleanValue();
        }
        return false;
    }

    /* renamed from: c */
    public static C0469c m39145c(AbstractC0427f abstractC0427f) {
        if (abstractC0427f == null) {
            return null;
        }
        return (C0469c) abstractC0427f.mo39316f(C0494h.f690K);
    }
}
