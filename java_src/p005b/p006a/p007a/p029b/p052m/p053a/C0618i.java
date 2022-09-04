package p005b.p006a.p007a.p029b.p052m.p053a;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import p005b.p006a.p007a.p029b.AbstractC0427f;
import p005b.p006a.p007a.p029b.p045i.AbstractC0566b;
import p005b.p006a.p007a.p029b.p045i.C0578c;
import p005b.p006a.p007a.p029b.p045i.C0588h;
import p005b.p006a.p007a.p029b.p045i.p047b.C0572f;
import p005b.p006a.p007a.p029b.p045i.p048c.C0579a;
import p005b.p006a.p007a.p029b.p055o.C0662f;
import p005b.p006a.p007a.p029b.p055o.C0674r;
/* renamed from: b.a.a.b.m.a.i */
/* loaded from: classes.dex */
public class C0618i extends C0662f {

    /* renamed from: a */
    static final Map<String, String> f1078a = new HashMap();

    /* renamed from: b */
    String f1079b;

    /* renamed from: c */
    AbstractC0566b<Object> f1080c;

    static {
        f1078a.put(C0620k.f1083a, C0620k.class.getName());
        f1078a.put(C0612f.f1063a, C0612f.class.getName());
    }

    public C0618i(String str, AbstractC0427f abstractC0427f) {
        m38700b(C0614h.m38711b(str));
        a(abstractC0427f);
        m38707a();
        C0578c.m38816a(this.f1080c);
    }

    /* renamed from: a */
    public String m38706a(int i) {
        return m38705a(Integer.valueOf(i));
    }

    /* renamed from: a */
    public String m38705a(Object obj) {
        StringBuilder sb = new StringBuilder();
        for (AbstractC0566b<Object> abstractC0566b = this.f1080c; abstractC0566b != null; abstractC0566b = abstractC0566b.m38860b()) {
            sb.append(abstractC0566b.mo38694a(obj));
        }
        return sb.toString();
    }

    /* renamed from: a */
    String m38704a(String str) {
        return this.f1079b.replace(")", "\\)");
    }

    /* renamed from: a */
    public String m38703a(Date date) {
        StringBuilder sb = new StringBuilder();
        for (AbstractC0566b<Object> abstractC0566b = this.f1080c; abstractC0566b != null; abstractC0566b = abstractC0566b.m38860b()) {
            if (abstractC0566b instanceof C0588h) {
                sb.append(abstractC0566b.mo38694a(null));
            } else if (abstractC0566b instanceof C0620k) {
                sb.append("(\\d{1,3})");
            } else if (abstractC0566b instanceof C0612f) {
                sb.append(abstractC0566b.mo38694a(date));
            }
        }
        return sb.toString();
    }

    /* renamed from: a */
    public String m38702a(Object... objArr) {
        StringBuilder sb = new StringBuilder();
        for (AbstractC0566b<Object> abstractC0566b = this.f1080c; abstractC0566b != null; abstractC0566b = abstractC0566b.m38860b()) {
            if (abstractC0566b instanceof AbstractC0621l) {
                AbstractC0621l abstractC0621l = (AbstractC0621l) abstractC0566b;
                for (Object obj : objArr) {
                    if (abstractC0621l.mo38693b(obj)) {
                        sb.append(abstractC0566b.mo38694a(obj));
                    }
                }
            } else {
                sb.append(abstractC0566b.mo38694a(objArr));
            }
        }
        return sb.toString();
    }

    /* renamed from: a */
    void m38707a() {
        try {
            C0572f c0572f = new C0572f(m38704a(this.f1079b), new C0579a());
            c0572f.a(this.f1199s);
            this.f1080c = c0572f.m38841a(c0572f.m38842a(), f1078a);
        } catch (C0674r e) {
            a("Failed to parse pattern \"" + this.f1079b + "\".", e);
        }
    }

    /* renamed from: b */
    public C0612f m38701b() {
        for (AbstractC0566b<Object> abstractC0566b = this.f1080c; abstractC0566b != null; abstractC0566b = abstractC0566b.m38860b()) {
            if (abstractC0566b instanceof C0612f) {
                C0612f c0612f = (C0612f) abstractC0566b;
                if (c0612f.m38725h()) {
                    return c0612f;
                }
            }
        }
        return null;
    }

    /* renamed from: b */
    public void m38700b(String str) {
        if (str != null) {
            this.f1079b = str.trim();
        }
    }

    /* renamed from: c */
    public C0620k m38699c() {
        for (AbstractC0566b<Object> abstractC0566b = this.f1080c; abstractC0566b != null; abstractC0566b = abstractC0566b.m38860b()) {
            if (abstractC0566b instanceof C0620k) {
                return (C0620k) abstractC0566b;
            }
        }
        return null;
    }

    /* renamed from: d */
    public String m38698d() {
        return this.f1079b;
    }

    /* renamed from: e */
    public String m38697e() {
        StringBuilder sb = new StringBuilder();
        for (AbstractC0566b<Object> abstractC0566b = this.f1080c; abstractC0566b != null; abstractC0566b = abstractC0566b.m38860b()) {
            if (abstractC0566b instanceof C0588h) {
                sb.append(abstractC0566b.mo38694a(null));
            } else if (abstractC0566b instanceof C0620k) {
                sb.append("\\d{1,2}");
            } else if (abstractC0566b instanceof C0612f) {
                sb.append(((C0612f) abstractC0566b).m38726g());
            }
        }
        return sb.toString();
    }

    public String toString() {
        return this.f1079b;
    }
}
