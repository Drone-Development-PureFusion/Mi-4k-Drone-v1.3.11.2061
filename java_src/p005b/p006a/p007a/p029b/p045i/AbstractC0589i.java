package p005b.p006a.p007a.p029b.p045i;

import java.util.HashMap;
import java.util.Map;
import p005b.p006a.p007a.p029b.AbstractC0427f;
import p005b.p006a.p007a.p029b.AbstractC0597k;
import p005b.p006a.p007a.p029b.C0494h;
import p005b.p006a.p007a.p029b.p045i.p047b.C0572f;
import p005b.p006a.p007a.p029b.p055o.C0674r;
import p005b.p006a.p007a.p029b.p056p.C0676a;
/* renamed from: b.a.a.b.i.i */
/* loaded from: classes.dex */
public abstract class AbstractC0589i<E> extends AbstractC0597k<E> {

    /* renamed from: b */
    AbstractC0566b<E> f1013b;

    /* renamed from: h */
    String f1014h;

    /* renamed from: i */
    protected AbstractC0591k<E> f1015i;

    /* renamed from: j */
    Map<String, String> f1016j = new HashMap();

    /* renamed from: k */
    protected boolean f1017k = false;

    /* renamed from: a */
    public abstract Map<String, String> mo38796a();

    /* renamed from: a */
    protected void m38795a(AbstractC0566b<E> abstractC0566b) {
        C0578c.m38817a(c_(), abstractC0566b);
    }

    /* renamed from: a */
    public void m38794a(AbstractC0591k<E> abstractC0591k) {
        this.f1015i = abstractC0591k;
    }

    /* renamed from: a */
    public void m38793a(boolean z) {
        this.f1017k = z;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: b */
    public String m38791b(E e) {
        StringBuilder sb = new StringBuilder(128);
        for (AbstractC0566b<E> abstractC0566b = this.f1013b; abstractC0566b != null; abstractC0566b = abstractC0566b.m38860b()) {
            abstractC0566b.mo38798a(sb, e);
        }
        return sb.toString();
    }

    /* renamed from: b */
    public Map<String, String> m38792b() {
        Map map;
        HashMap hashMap = new HashMap();
        Map<String, String> mo38796a = mo38796a();
        if (mo38796a != null) {
            hashMap.putAll(mo38796a);
        }
        AbstractC0427f c_ = c_();
        if (c_ != null && (map = (Map) c_.mo39316f(C0494h.f719g)) != null) {
            hashMap.putAll(map);
        }
        hashMap.putAll(this.f1016j);
        return hashMap;
    }

    @Override // p005b.p006a.p007a.p029b.AbstractC0597k, p005b.p006a.p007a.p029b.AbstractC0594j
    /* renamed from: f */
    public String mo38762f() {
        return this.f1017k ? m38787n() + this.f1014h : super.mo38762f();
    }

    /* renamed from: f */
    public void m38790f(String str) {
        this.f1014h = str;
    }

    @Override // p005b.p006a.p007a.p029b.AbstractC0597k, p005b.p006a.p007a.p029b.p055o.AbstractC0669m
    /* renamed from: j */
    public void mo38474j() {
        if (this.f1014h == null || this.f1014h.length() == 0) {
            c("Empty or null pattern.");
            return;
        }
        try {
            C0572f c0572f = new C0572f(this.f1014h);
            if (c_() != null) {
                c0572f.a(c_());
            }
            this.f1013b = c0572f.m38841a(c0572f.m38842a(), m38792b());
            if (this.f1015i != null) {
                this.f1015i.mo38778a(this.f1013b);
            }
            C0578c.m38817a(c_(), this.f1013b);
            C0578c.m38816a(this.f1013b);
            super.mo38474j();
        } catch (C0674r e) {
            c_().mo39315n().mo38506a(new C0676a("Failed to parse pattern \"" + m38789l() + "\".", this, e));
        }
    }

    /* renamed from: l */
    public String m38789l() {
        return this.f1014h;
    }

    /* renamed from: m */
    public Map<String, String> m38788m() {
        return this.f1016j;
    }

    /* renamed from: n */
    protected String m38787n() {
        return "";
    }

    /* renamed from: o */
    public boolean m38786o() {
        return this.f1017k;
    }

    public String toString() {
        return getClass().getName() + "(\"" + m38789l() + "\")";
    }
}
