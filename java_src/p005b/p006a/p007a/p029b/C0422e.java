package p005b.p006a.p007a.p029b;

import java.util.Arrays;
import p005b.p006a.p007a.p029b.p036g.p040d.EnumC0470d;
import p005b.p006a.p007a.p029b.p056p.AbstractC0682g;
import p005b.p006a.p007a.p029b.p056p.C0688m;
@Deprecated
/* renamed from: b.a.a.b.e */
/* loaded from: classes.dex */
public class C0422e<E> extends C0651o<E> {

    /* renamed from: a */
    protected EnumC0470d f523a = EnumC0470d.SystemOut;

    /* renamed from: b */
    private void m39353b(String str) {
        C0688m c0688m = new C0688m("[" + str + "] should be one of " + Arrays.toString(EnumC0470d.values()), this);
        c0688m.mo38518a(new C0688m("Using previously set target, System.out by default.", this));
        a((AbstractC0682g) c0688m);
    }

    /* renamed from: a */
    public String m39355a() {
        return this.f523a.m39229a();
    }

    /* renamed from: a */
    public void m39354a(String str) {
        EnumC0470d m39228a = EnumC0470d.m39228a(str.trim());
        if (m39228a == null) {
            m39353b(str);
        } else {
            this.f523a = m39228a;
        }
    }

    @Override // p005b.p006a.p007a.p029b.C0651o, p005b.p006a.p007a.p029b.AbstractC0689q, p005b.p006a.p007a.p029b.p055o.AbstractC0669m
    /* renamed from: j */
    public void mo38474j() {
        a(this.f523a.m39227b());
        super.mo38474j();
    }
}
