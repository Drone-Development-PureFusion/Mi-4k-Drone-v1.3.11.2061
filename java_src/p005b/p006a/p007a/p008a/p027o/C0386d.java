package p005b.p006a.p007a.p008a.p027o;

import org.p356d.AbstractC11759f;
import org.p356d.C11756e;
import p005b.p006a.p007a.p008a.C0281d;
import p005b.p006a.p007a.p008a.C0283e;
import p005b.p006a.p007a.p029b.p055o.EnumC0668l;
/* renamed from: b.a.a.a.o.d */
/* loaded from: classes.dex */
public class C0386d extends AbstractC0389g {

    /* renamed from: a */
    String f440a;

    /* renamed from: b */
    String f441b;

    @Override // p005b.p006a.p007a.p008a.p027o.AbstractC0392i
    /* renamed from: a */
    public EnumC0668l mo39443a(AbstractC11759f abstractC11759f, C0283e c0283e, C0281d c0281d, String str, Object[] objArr, Throwable th) {
        if (this.f440a == null) {
            return EnumC0668l.NEUTRAL;
        }
        return this.f441b.equals(C11756e.m19a(this.f440a)) ? this.f445c : this.f446d;
    }

    /* renamed from: a */
    public void m39468a(String str) {
        this.f441b = str;
    }

    /* renamed from: b */
    public void m39467b(String str) {
        this.f440a = str;
    }
}
