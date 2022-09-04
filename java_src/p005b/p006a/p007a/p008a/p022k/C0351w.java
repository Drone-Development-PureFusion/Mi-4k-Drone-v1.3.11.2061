package p005b.p006a.p007a.p008a.p022k;

import p005b.p006a.p007a.p008a.p026n.AbstractC0366d;
/* renamed from: b.a.a.a.k.w */
/* loaded from: classes.dex */
public class C0351w extends AbstractC0333e {

    /* renamed from: a */
    long f346a = -1;

    /* renamed from: b */
    String f347b = null;

    @Override // p005b.p006a.p007a.p029b.p045i.AbstractC0566b
    /* renamed from: a */
    public String mo38694a(AbstractC0366d abstractC0366d) {
        String str;
        long mo39526n = abstractC0366d.mo39526n();
        synchronized (this) {
            if (mo39526n != this.f346a) {
                this.f346a = mo39526n;
                this.f347b = Long.toString(mo39526n - abstractC0366d.mo39533g().m39557c());
            }
            str = this.f347b;
        }
        return str;
    }
}
