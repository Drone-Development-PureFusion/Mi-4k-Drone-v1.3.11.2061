package p005b.p006a.p007a.p008a.p016g.p017a;

import org.xml.sax.Attributes;
import p005b.p006a.p007a.p029b.p036g.p037a.AbstractC0436c;
import p005b.p006a.p007a.p029b.p036g.p040d.C0479k;
/* renamed from: b.a.a.a.g.a.c */
/* loaded from: classes.dex */
public class C0296c extends AbstractC0436c {
    @Override // p005b.p006a.p007a.p029b.p036g.p037a.AbstractC0436c
    /* renamed from: a */
    public void mo39259a(C0479k c0479k, String str) {
    }

    @Override // p005b.p006a.p007a.p029b.p036g.p037a.AbstractC0436c
    /* renamed from: a */
    public void mo39258a(C0479k c0479k, String str, Attributes attributes) {
    }

    @Override // p005b.p006a.p007a.p029b.p036g.p037a.AbstractC0436c
    /* renamed from: b */
    public void mo39269b(C0479k c0479k, String str) {
        String m39188f = c0479k.m39188f(str);
        d("Setting logger context name as [" + m39188f + "]");
        try {
            this.f1199s.mo39318b(m39188f);
        } catch (IllegalStateException e) {
            a("Failed to rename context [" + this.f1199s.mo39314p() + "] as [" + m39188f + "]", e);
        }
    }
}
