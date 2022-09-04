package p005b.p006a.p007a.p029b.p054n;

import java.util.List;
import java.util.Map;
import p005b.p006a.p007a.p029b.AbstractC0401a;
import p005b.p006a.p007a.p029b.C0494h;
import p005b.p006a.p007a.p029b.p036g.AbstractC0433a;
import p005b.p006a.p007a.p029b.p036g.p037a.C0444i;
import p005b.p006a.p007a.p029b.p036g.p037a.C0450o;
import p005b.p006a.p007a.p029b.p036g.p037a.C0452p;
import p005b.p006a.p007a.p029b.p036g.p037a.C0456s;
import p005b.p006a.p007a.p029b.p036g.p037a.C0458u;
import p005b.p006a.p007a.p029b.p036g.p038b.C0463d;
import p005b.p006a.p007a.p029b.p036g.p040d.AbstractC0484p;
import p005b.p006a.p007a.p029b.p036g.p040d.C0476h;
import p005b.p006a.p007a.p029b.p036g.p040d.C0480l;
/* renamed from: b.a.a.b.n.h */
/* loaded from: classes.dex */
public abstract class AbstractC0650h<E> extends AbstractC0433a {

    /* renamed from: e */
    static final String f1169e = "http://logback.qos.ch/codes.html#1andOnly1";

    /* renamed from: b */
    protected final String f1170b;

    /* renamed from: c */
    protected final String f1171c;

    /* renamed from: d */
    protected final Map<String, String> f1172d;

    /* renamed from: f */
    int f1173f = 0;

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC0650h(String str, String str2, Map<String, String> map) {
        this.f1170b = str;
        this.f1171c = str2;
        this.f1172d = map;
    }

    @Override // p005b.p006a.p007a.p029b.p036g.AbstractC0433a
    /* renamed from: a */
    protected void mo38600a(C0480l c0480l) {
        C0452p c0452p = new C0452p();
        c0452p.a(this.f1199s);
        c0480l.m39183a(c0452p);
        C0450o c0450o = new C0450o();
        c0450o.a(this.f1199s);
        c0480l.m39183a(c0450o);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p005b.p006a.p007a.p029b.p036g.AbstractC0433a
    /* renamed from: a */
    public void mo38599a(AbstractC0484p abstractC0484p) {
        abstractC0484p.mo39160a(new C0476h("configuration/property"), new C0456s());
        abstractC0484p.mo39160a(new C0476h("configuration/timestamp"), new C0458u());
        abstractC0484p.mo39160a(new C0476h("configuration/define"), new C0444i());
    }

    @Override // p005b.p006a.p007a.p029b.p036g.AbstractC0433a
    /* renamed from: a */
    public void mo38598a(List<C0463d> list) {
        super.mo38598a(list);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public void m38597a(Map<?, ?> map) {
        String str = null;
        if (map.size() == 0) {
            this.f1173f++;
            str = "No nested appenders found within the <sift> element in SiftingAppender.";
        } else if (map.size() > 1) {
            this.f1173f++;
            str = "Only and only one appender can be nested the <sift> element in SiftingAppender. See also http://logback.qos.ch/codes.html#1andOnly1";
        }
        if (str == null || this.f1173f >= 4) {
            return;
        }
        c(str);
    }

    /* renamed from: c */
    public abstract AbstractC0401a<E> mo38596c();

    public String toString() {
        return getClass().getName() + "{" + this.f1170b + "=" + this.f1171c + C0494h.f735w;
    }
}
