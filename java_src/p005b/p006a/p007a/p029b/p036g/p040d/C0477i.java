package p005b.p006a.p007a.p029b.p036g.p040d;

import java.util.ArrayList;
import java.util.List;
import p005b.p006a.p007a.p029b.p036g.p038b.C0460a;
import p005b.p006a.p007a.p029b.p036g.p038b.C0461b;
import p005b.p006a.p007a.p029b.p036g.p038b.C0463d;
import p005b.p006a.p007a.p029b.p036g.p038b.C0465f;
/* renamed from: b.a.a.b.g.d.i */
/* loaded from: classes.dex */
public class C0477i {

    /* renamed from: a */
    final C0480l f644a;

    /* renamed from: b */
    List<C0463d> f645b;

    /* renamed from: c */
    int f646c;

    public C0477i(C0480l c0480l) {
        this.f644a = c0480l;
    }

    /* renamed from: a */
    public List<C0463d> m39208a() {
        return new ArrayList(this.f645b);
    }

    /* renamed from: a */
    public void m39207a(List<C0463d> list) {
        this.f645b = list;
        this.f646c = 0;
        while (this.f646c < this.f645b.size()) {
            C0463d c0463d = this.f645b.get(this.f646c);
            if (c0463d instanceof C0465f) {
                this.f644a.m39180a((C0465f) c0463d);
                this.f644a.m39168c().m39200a(c0463d);
            }
            if (c0463d instanceof C0460a) {
                this.f644a.m39168c().m39200a(c0463d);
                this.f644a.m39182a((C0460a) c0463d);
            }
            if (c0463d instanceof C0461b) {
                this.f644a.m39168c().m39200a(c0463d);
                this.f644a.m39181a((C0461b) c0463d);
            }
            this.f646c++;
        }
    }

    /* renamed from: a */
    public void m39206a(List<C0463d> list, int i) {
        this.f645b.addAll(this.f646c + i, list);
    }
}
