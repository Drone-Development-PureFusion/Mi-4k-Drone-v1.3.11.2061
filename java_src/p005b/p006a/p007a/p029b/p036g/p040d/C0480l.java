package p005b.p006a.p007a.p029b.p036g.p040d;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Stack;
import java.util.Vector;
import org.xml.sax.Attributes;
import org.xml.sax.Locator;
import p005b.p006a.p007a.p029b.AbstractC0427f;
import p005b.p006a.p007a.p029b.p036g.p037a.AbstractC0436c;
import p005b.p006a.p007a.p029b.p036g.p037a.AbstractC0447l;
import p005b.p006a.p007a.p029b.p036g.p038b.C0460a;
import p005b.p006a.p007a.p029b.p036g.p038b.C0461b;
import p005b.p006a.p007a.p029b.p036g.p038b.C0465f;
/* renamed from: b.a.a.b.g.d.l */
/* loaded from: classes.dex */
public class C0480l {

    /* renamed from: e */
    private static List<AbstractC0436c> f655e = new Vector(0);

    /* renamed from: a */
    Locator f656a;

    /* renamed from: f */
    private final AbstractC0484p f660f;

    /* renamed from: g */
    private final C0479k f661g;

    /* renamed from: i */
    private final C0468b f663i;

    /* renamed from: j */
    private C0475g f664j;

    /* renamed from: d */
    C0475g f659d = null;

    /* renamed from: h */
    private final ArrayList<AbstractC0447l> f662h = new ArrayList<>(3);

    /* renamed from: c */
    Stack<List<AbstractC0436c>> f658c = new Stack<>();

    /* renamed from: b */
    C0477i f657b = new C0477i(this);

    public C0480l(AbstractC0427f abstractC0427f, AbstractC0484p abstractC0484p, C0475g c0475g) {
        this.f663i = new C0468b(abstractC0427f, this);
        this.f660f = abstractC0484p;
        this.f661g = new C0479k(abstractC0427f, this);
        this.f664j = c0475g;
    }

    /* renamed from: a */
    private void m39176a(String str, String str2, String str3) {
        List<AbstractC0436c> pop = this.f658c.pop();
        if (this.f659d != null) {
            if (this.f659d.equals(this.f664j)) {
                this.f659d = null;
            }
        } else if (pop != f655e) {
            m39169b(pop, m39177a(str2, str3));
        }
        this.f664j.m39217c();
    }

    /* renamed from: a */
    private void m39175a(String str, String str2, String str3, Attributes attributes) {
        String m39177a = m39177a(str2, str3);
        this.f664j.m39220a(m39177a);
        if (this.f659d != null) {
            m39164g();
            return;
        }
        List<AbstractC0436c> m39179a = m39179a(this.f664j, attributes);
        if (m39179a != null) {
            this.f658c.add(m39179a);
            m39173a(m39179a, m39177a, attributes);
            return;
        }
        m39164g();
        this.f663i.c("no applicable action for [" + m39177a + "], current ElementPath  is [" + this.f664j + "]");
    }

    /* renamed from: a */
    private void m39174a(List<AbstractC0436c> list, String str) {
        if (list == null) {
            return;
        }
        for (AbstractC0436c abstractC0436c : list) {
            try {
                abstractC0436c.mo39269b(this.f661g, str);
            } catch (C0467a e) {
                this.f663i.a("Exception in end() methd for action [" + abstractC0436c + "]", e);
            }
        }
    }

    /* renamed from: b */
    private void m39169b(List<AbstractC0436c> list, String str) {
        if (list == null) {
            return;
        }
        for (AbstractC0436c abstractC0436c : list) {
            try {
                abstractC0436c.mo39259a(this.f661g, str);
            } catch (C0467a e) {
                this.f663i.a("ActionException in Action for tag [" + str + "]", e);
            } catch (RuntimeException e2) {
                this.f663i.a("RuntimeException in Action for tag [" + str + "]", e2);
            }
        }
    }

    /* renamed from: g */
    private void m39164g() {
        this.f658c.add(f655e);
    }

    /* renamed from: a */
    public C0477i m39184a() {
        return this.f657b;
    }

    /* renamed from: a */
    String m39177a(String str, String str2) {
        return (str == null || str.length() < 1) ? str2 : str;
    }

    /* renamed from: a */
    List<AbstractC0436c> m39179a(C0475g c0475g, Attributes attributes) {
        List<AbstractC0436c> mo39162a = this.f660f.mo39162a(c0475g);
        return mo39162a == null ? m39178a(c0475g, attributes, this.f661g) : mo39162a;
    }

    /* renamed from: a */
    List<AbstractC0436c> m39178a(C0475g c0475g, Attributes attributes, C0479k c0479k) {
        int size = this.f662h.size();
        for (int i = 0; i < size; i++) {
            AbstractC0447l abstractC0447l = this.f662h.get(i);
            if (abstractC0447l.mo39268a(c0475g, attributes, c0479k)) {
                ArrayList arrayList = new ArrayList(1);
                arrayList.add(abstractC0447l);
                return arrayList;
            }
        }
        return null;
    }

    /* renamed from: a */
    public void m39183a(AbstractC0447l abstractC0447l) {
        this.f662h.add(abstractC0447l);
    }

    /* renamed from: a */
    public void m39182a(C0460a c0460a) {
        m39171a(c0460a.f626d);
        String m39254a = c0460a.m39254a();
        List<AbstractC0436c> peek = this.f658c.peek();
        if (m39254a != null) {
            String trim = m39254a.trim();
            if (trim.length() <= 0) {
                return;
            }
            m39174a(peek, trim);
        }
    }

    /* renamed from: a */
    public void m39181a(C0461b c0461b) {
        m39171a(c0461b.f626d);
        m39176a(c0461b.f623a, c0461b.f624b, c0461b.f625c);
    }

    /* renamed from: a */
    public void m39180a(C0465f c0465f) {
        m39171a(c0465f.c());
        m39175a(c0465f.f623a, c0465f.f624b, c0465f.f625c, c0465f.f631e);
    }

    /* renamed from: a */
    void m39173a(List<AbstractC0436c> list, String str, Attributes attributes) {
        if (list == null) {
            return;
        }
        for (AbstractC0436c abstractC0436c : list) {
            try {
                abstractC0436c.mo39258a(this.f661g, str, attributes);
            } catch (C0467a e) {
                this.f659d = this.f664j.m39222a();
                this.f663i.a("ActionException in Action for tag [" + str + "]", e);
            } catch (RuntimeException e2) {
                this.f659d = this.f664j.m39222a();
                this.f663i.a("RuntimeException in Action for tag [" + str + "]", e2);
            }
        }
    }

    /* renamed from: a */
    public void m39172a(Map<String, String> map) {
        this.f661g.m39197a(map);
    }

    /* renamed from: a */
    public void m39171a(Locator locator) {
        this.f656a = locator;
    }

    /* renamed from: b */
    public C0479k m39170b() {
        return m39168c();
    }

    /* renamed from: c */
    public C0479k m39168c() {
        return this.f661g;
    }

    /* renamed from: d */
    public void m39167d() {
    }

    /* renamed from: e */
    public Locator m39166e() {
        return this.f656a;
    }

    /* renamed from: f */
    public AbstractC0484p m39165f() {
        return this.f660f;
    }
}
