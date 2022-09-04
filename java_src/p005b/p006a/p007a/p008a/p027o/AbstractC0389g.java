package p005b.p006a.p007a.p008a.p027o;

import p005b.p006a.p007a.p029b.p055o.EnumC0668l;
/* renamed from: b.a.a.a.o.g */
/* loaded from: classes.dex */
public abstract class AbstractC0389g extends AbstractC0392i {

    /* renamed from: c */
    protected EnumC0668l f445c = EnumC0668l.NEUTRAL;

    /* renamed from: d */
    protected EnumC0668l f446d = EnumC0668l.NEUTRAL;

    /* renamed from: h_ */
    public final void m39461h_(String str) {
        if ("NEUTRAL".equals(str)) {
            this.f445c = EnumC0668l.NEUTRAL;
        } else if ("ACCEPT".equals(str)) {
            this.f445c = EnumC0668l.ACCEPT;
        } else if (!"DENY".equals(str)) {
        } else {
            this.f445c = EnumC0668l.DENY;
        }
    }

    /* renamed from: i_ */
    public final void m39460i_(String str) {
        if ("NEUTRAL".equals(str)) {
            this.f446d = EnumC0668l.NEUTRAL;
        } else if ("ACCEPT".equals(str)) {
            this.f446d = EnumC0668l.ACCEPT;
        } else if (!"DENY".equals(str)) {
        } else {
            this.f446d = EnumC0668l.DENY;
        }
    }
}
