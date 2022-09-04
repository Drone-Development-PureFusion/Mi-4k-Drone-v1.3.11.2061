package p005b.p006a.p007a.p008a.p027o;

import java.util.HashMap;
import java.util.Map;
import org.p356d.AbstractC11759f;
import org.p356d.C11756e;
import p005b.p006a.p007a.p008a.C0281d;
import p005b.p006a.p007a.p008a.C0283e;
import p005b.p006a.p007a.p029b.p055o.EnumC0668l;
/* renamed from: b.a.a.a.o.b */
/* loaded from: classes.dex */
public class C0384b extends AbstractC0392i {

    /* renamed from: c */
    private String f436c;

    /* renamed from: a */
    private Map<String, C0281d> f434a = new HashMap();

    /* renamed from: b */
    private C0281d f435b = C0281d.f211p;

    /* renamed from: d */
    private EnumC0668l f437d = EnumC0668l.NEUTRAL;

    /* renamed from: e */
    private EnumC0668l f438e = EnumC0668l.DENY;

    @Override // p005b.p006a.p007a.p008a.p027o.AbstractC0392i
    /* renamed from: a */
    public EnumC0668l mo39443a(AbstractC11759f abstractC11759f, C0283e c0283e, C0281d c0281d, String str, Object[] objArr, Throwable th) {
        String m19a = C11756e.m19a(this.f436c);
        if (!b_()) {
            return EnumC0668l.NEUTRAL;
        }
        C0281d c0281d2 = null;
        if (m19a != null) {
            c0281d2 = this.f434a.get(m19a);
        }
        if (c0281d2 == null) {
            c0281d2 = this.f435b;
        }
        return c0281d.m39801a(c0281d2) ? this.f437d : this.f438e;
    }

    /* renamed from: a */
    public String m39478a() {
        return this.f436c;
    }

    /* renamed from: a */
    public void m39477a(C0281d c0281d) {
        this.f435b = c0281d;
    }

    /* renamed from: a */
    public void m39476a(C0387e c0387e) {
        if (this.f434a.containsKey(c0387e.m39466a())) {
            c(c0387e.m39466a() + " has been already set");
        } else {
            this.f434a.put(c0387e.m39466a(), c0387e.m39463b());
        }
    }

    /* renamed from: a */
    public void m39475a(EnumC0668l enumC0668l) {
        this.f437d = enumC0668l;
    }

    /* renamed from: a */
    public void m39474a(String str) {
        this.f436c = str;
    }

    /* renamed from: b */
    public C0281d m39473b() {
        return this.f435b;
    }

    /* renamed from: b */
    public void m39472b(EnumC0668l enumC0668l) {
        this.f438e = enumC0668l;
    }

    /* renamed from: d */
    public EnumC0668l m39471d() {
        return this.f437d;
    }

    /* renamed from: e */
    public EnumC0668l m39470e() {
        return this.f438e;
    }

    @Override // p005b.p006a.p007a.p008a.p027o.AbstractC0392i, p005b.p006a.p007a.p029b.p055o.AbstractC0669m
    /* renamed from: j */
    public void mo38474j() {
        if (this.f436c == null) {
            c("No key name was specified");
        }
        super.mo38474j();
    }
}
