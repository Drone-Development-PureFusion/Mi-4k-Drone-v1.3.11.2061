package p005b.p006a.p007a.p029b.p052m.p053a;

import java.util.Date;
import java.util.List;
import p005b.p006a.p007a.p029b.p045i.AbstractC0584d;
import p005b.p006a.p007a.p029b.p058r.C0703b;
import p005b.p006a.p007a.p029b.p058r.C0709h;
/* renamed from: b.a.a.b.m.a.f */
/* loaded from: classes.dex */
public class C0612f<E> extends AbstractC0584d<E> implements AbstractC0621l {

    /* renamed from: a */
    public static final String f1063a = "d";

    /* renamed from: b */
    public static final String f1064b = "AUX";

    /* renamed from: c */
    public static final String f1065c = "yyyy-MM-dd";

    /* renamed from: d */
    private String f1066d;

    /* renamed from: e */
    private C0703b f1067e;

    /* renamed from: l */
    private boolean f1068l = true;

    /* renamed from: a */
    public String m38728a() {
        return this.f1066d;
    }

    @Override // p005b.p006a.p007a.p029b.p045i.AbstractC0566b
    /* renamed from: a */
    public String mo38694a(Object obj) {
        if (obj == null) {
            throw new IllegalArgumentException("Null argument forbidden");
        }
        if (!(obj instanceof Date)) {
            throw new IllegalArgumentException("Cannot convert " + obj + " of type" + obj.getClass().getName());
        }
        return m38727a((Date) obj);
    }

    /* renamed from: a */
    public String m38727a(Date date) {
        return this.f1067e.m38440a(date.getTime());
    }

    @Override // p005b.p006a.p007a.p029b.p052m.p053a.AbstractC0621l
    /* renamed from: b */
    public boolean mo38693b(Object obj) {
        return obj instanceof Date;
    }

    /* renamed from: g */
    public String m38726g() {
        return new C0709h(this.f1066d).m38428a();
    }

    /* renamed from: h */
    public boolean m38725h() {
        return this.f1068l;
    }

    @Override // p005b.p006a.p007a.p029b.p045i.AbstractC0584d, p005b.p006a.p007a.p029b.p055o.AbstractC0669m
    /* renamed from: j */
    public void mo38474j() {
        this.f1066d = d();
        if (this.f1066d == null) {
            this.f1066d = "yyyy-MM-dd";
        }
        List<String> e = e();
        if (e != null && e.size() > 1 && f1064b.equalsIgnoreCase(e.get(1))) {
            this.f1068l = false;
        }
        this.f1067e = new C0703b(this.f1066d);
    }
}
