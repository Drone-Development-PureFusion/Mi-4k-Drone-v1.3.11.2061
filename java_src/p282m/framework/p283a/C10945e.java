package p282m.framework.p283a;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
/* renamed from: m.framework.a.e */
/* loaded from: classes2.dex */
public class C10945e extends AbstractC10943c {

    /* renamed from: a */
    private ArrayList<AbstractC10943c> f35322a = new ArrayList<>();

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p282m.framework.p283a.AbstractC10943c
    /* renamed from: a */
    public InputStream mo2564a() {
        C10946f c10946f = new C10946f();
        Iterator<AbstractC10943c> it2 = this.f35322a.iterator();
        while (it2.hasNext()) {
            c10946f.m2577a(it2.next().mo2564a());
        }
        return c10946f;
    }

    /* renamed from: a */
    public C10945e m2579a(AbstractC10943c abstractC10943c) {
        this.f35322a.add(abstractC10943c);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p282m.framework.p283a.AbstractC10943c
    /* renamed from: b */
    public long mo2562b() {
        long j = 0;
        Iterator<AbstractC10943c> it2 = this.f35322a.iterator();
        while (true) {
            long j2 = j;
            if (!it2.hasNext()) {
                return j2;
            }
            j = it2.next().mo2562b() + j2;
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        Iterator<AbstractC10943c> it2 = this.f35322a.iterator();
        while (it2.hasNext()) {
            sb.append(it2.next().toString());
        }
        return sb.toString();
    }
}
