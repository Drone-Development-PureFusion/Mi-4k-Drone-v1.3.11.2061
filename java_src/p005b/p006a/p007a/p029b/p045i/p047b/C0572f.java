package p005b.p006a.p007a.p029b.p045i.p047b;

import com.google.android.gms.location.places.AbstractC8240d;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p005b.p006a.p007a.p029b.p045i.AbstractC0566b;
import p005b.p006a.p007a.p029b.p045i.C0585e;
import p005b.p006a.p007a.p029b.p045i.C0587g;
import p005b.p006a.p007a.p029b.p045i.C0592l;
import p005b.p006a.p007a.p029b.p045i.p048c.AbstractC0581c;
import p005b.p006a.p007a.p029b.p045i.p048c.C0582d;
import p005b.p006a.p007a.p029b.p055o.C0662f;
import p005b.p006a.p007a.p029b.p055o.C0674r;
/* renamed from: b.a.a.b.i.b.f */
/* loaded from: classes.dex */
public class C0572f<E> extends C0662f {

    /* renamed from: a */
    public static final String f965a = "http://logback.qos.ch/codes.html#missingRightParenthesis";

    /* renamed from: b */
    public static final Map<String, String> f966b = new HashMap();

    /* renamed from: c */
    public static final String f967c = "replace";

    /* renamed from: d */
    final List f968d;

    /* renamed from: e */
    int f969e;

    static {
        f966b.put(C0574h.f985o.m38827b().toString(), C0587g.class.getName());
        f966b.put(f967c, C0592l.class.getName());
    }

    C0572f(C0575i c0575i) {
        this.f969e = 0;
        this.f968d = c0575i.m38826a();
    }

    public C0572f(String str) {
        this(str, new C0582d());
    }

    public C0572f(String str, AbstractC0581c abstractC0581c) {
        this.f969e = 0;
        try {
            this.f968d = new C0575i(str, abstractC0581c).m38826a();
        } catch (IllegalArgumentException e) {
            throw new C0674r("Failed to initialize Parser", e);
        }
    }

    /* renamed from: a */
    C0569c m38839a(String str) {
        C0568b c0568b = new C0568b(str);
        c0568b.m38853a(m38838b());
        C0574h m38833g = m38833g();
        if (m38833g == null || m38833g.m38828a() != 41) {
            String str2 = "Expecting RIGHT_PARENTHESIS token but got " + m38833g;
            c(str2);
            c("See also http://logback.qos.ch/codes.html#missingRightParenthesis");
            throw new C0674r(str2);
        }
        C0574h m38832h = m38832h();
        if (m38832h != null && m38832h.m38828a() == 1006) {
            c0568b.a((List) m38832h.m38827b());
            m38831j();
        }
        return c0568b;
    }

    /* renamed from: a */
    public C0570d m38842a() {
        return m38838b();
    }

    /* renamed from: a */
    public AbstractC0566b<E> m38841a(C0570d c0570d, Map map) {
        C0567a c0567a = new C0567a(c0570d, map);
        c0567a.a(this.f1199s);
        return c0567a.m38858a();
    }

    /* renamed from: a */
    void m38840a(C0574h c0574h, String str) {
        if (c0574h == null) {
            throw new IllegalStateException("All tokens consumed but was expecting " + str);
        }
    }

    /* renamed from: b */
    C0570d m38838b() {
        C0570d m38836d = m38836d();
        if (m38836d == null) {
            return null;
        }
        C0570d m38837c = m38837c();
        if (m38837c == null) {
            return m38836d;
        }
        m38836d.m38850b(m38837c);
        return m38836d;
    }

    /* renamed from: c */
    C0570d m38837c() {
        if (m38832h() == null) {
            return null;
        }
        return m38838b();
    }

    /* renamed from: d */
    C0570d m38836d() {
        C0574h m38832h = m38832h();
        m38840a(m38832h, "a LITERAL or '%'");
        switch (m38832h.m38828a()) {
            case 37:
                m38831j();
                C0574h m38832h2 = m38832h();
                m38840a(m38832h2, "a FORMAT_MODIFIER, SIMPLE_KEYWORD or COMPOUND_KEYWORD");
                if (m38832h2.m38828a() != 1002) {
                    return m38835e();
                }
                C0585e m38806a = C0585e.m38806a((String) m38832h2.m38827b());
                m38831j();
                C0569c m38835e = m38835e();
                m38835e.m38852a(m38806a);
                return m38835e;
            case 1000:
                m38831j();
                return new C0570d(0, m38832h.m38827b());
            default:
                return null;
        }
    }

    /* renamed from: e */
    C0569c m38835e() {
        C0574h m38832h = m38832h();
        m38840a(m38832h, "a LEFT_PARENTHESIS or KEYWORD");
        switch (m38832h.m38828a()) {
            case AbstractC8240d.f26967aW /* 1004 */:
                return m38834f();
            case AbstractC8240d.f26968aX /* 1005 */:
                m38831j();
                return m38839a(m38832h.m38827b().toString());
            default:
                throw new IllegalStateException("Unexpected token " + m38832h);
        }
    }

    /* renamed from: f */
    C0569c m38834f() {
        C0573g c0573g = new C0573g(m38833g().m38827b());
        C0574h m38832h = m38832h();
        if (m38832h != null && m38832h.m38828a() == 1006) {
            c0573g.m38830a((List) m38832h.m38827b());
            m38831j();
        }
        return c0573g;
    }

    /* renamed from: g */
    C0574h m38833g() {
        if (this.f969e < this.f968d.size()) {
            List list = this.f968d;
            int i = this.f969e;
            this.f969e = i + 1;
            return (C0574h) list.get(i);
        }
        return null;
    }

    /* renamed from: h */
    C0574h m38832h() {
        if (this.f969e < this.f968d.size()) {
            return (C0574h) this.f968d.get(this.f969e);
        }
        return null;
    }

    /* renamed from: j */
    void m38831j() {
        this.f969e++;
    }
}
