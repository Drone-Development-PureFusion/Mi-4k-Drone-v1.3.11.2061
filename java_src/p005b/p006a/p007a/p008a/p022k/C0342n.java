package p005b.p006a.p007a.p008a.p022k;

import java.util.concurrent.atomic.AtomicLong;
import p005b.p006a.p007a.p008a.p026n.AbstractC0366d;
/* renamed from: b.a.a.a.k.n */
/* loaded from: classes.dex */
public class C0342n extends AbstractC0333e {

    /* renamed from: a */
    AtomicLong f340a = new AtomicLong(System.currentTimeMillis());

    @Override // p005b.p006a.p007a.p029b.p045i.AbstractC0566b
    /* renamed from: a */
    public String mo38694a(AbstractC0366d abstractC0366d) {
        return Long.toString(this.f340a.getAndIncrement());
    }
}
