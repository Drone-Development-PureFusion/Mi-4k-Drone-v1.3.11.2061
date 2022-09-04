package com.google.android.gms.internal;

import com.google.android.gms.common.internal.C4588d;
import java.util.Collections;
import java.util.Comparator;
/* loaded from: classes2.dex */
public class aqy extends aqg {

    /* renamed from: com.google.android.gms.internal.aqy$a */
    /* loaded from: classes2.dex */
    class C6757a implements Comparator<AbstractC6880ea<?>> {

        /* renamed from: a */
        final /* synthetic */ C6885ed f22865a;

        /* renamed from: b */
        final /* synthetic */ apr f22866b;

        C6757a(C6885ed c6885ed, apr aprVar) {
            this.f22865a = c6885ed;
            this.f22866b = aprVar;
        }

        @Override // java.util.Comparator
        /* renamed from: a */
        public int compare(AbstractC6880ea<?> abstractC6880ea, AbstractC6880ea<?> abstractC6880ea2) {
            if (abstractC6880ea == null) {
                return abstractC6880ea2 != null ? 1 : 0;
            } else if (abstractC6880ea2 == null) {
                return abstractC6880ea != null ? -1 : 0;
            } else {
                AbstractC6880ea<?> mo12846a_ = ((aqe) this.f22865a.mo16034b()).mo12846a_(this.f22866b, abstractC6880ea, abstractC6880ea2);
                C4588d.m23623a(mo12846a_ instanceof C6884ec);
                return (int) ((Double) ((C6884ec) mo12846a_).mo16034b()).doubleValue();
            }
        }
    }

    /* renamed from: com.google.android.gms.internal.aqy$b */
    /* loaded from: classes2.dex */
    private static class C6758b implements aqe {
        private C6758b() {
        }

        @Override // com.google.android.gms.internal.aqe
        /* renamed from: a_ */
        public AbstractC6880ea<?> mo12846a_(apr aprVar, AbstractC6880ea<?>... abstractC6880eaArr) {
            return new C6884ec(Double.valueOf(aqf.m16218d(abstractC6880eaArr[0]).compareTo(aqf.m16218d(abstractC6880eaArr[1]))));
        }
    }

    @Override // com.google.android.gms.internal.aqg
    /* renamed from: a */
    protected AbstractC6880ea<?> mo13115a(apr aprVar, AbstractC6880ea<?>... abstractC6880eaArr) {
        C6885ed c6885ed;
        C4588d.m23627a(abstractC6880eaArr);
        C4588d.m23619b(abstractC6880eaArr.length == 1 || abstractC6880eaArr.length == 2);
        C4588d.m23619b(abstractC6880eaArr[0] instanceof C6887ef);
        C6887ef c6887ef = (C6887ef) abstractC6880eaArr[0];
        if (abstractC6880eaArr.length == 2) {
            C4588d.m23619b(abstractC6880eaArr[1] instanceof C6885ed);
            c6885ed = (C6885ed) abstractC6880eaArr[1];
        } else {
            c6885ed = new C6885ed(new C6758b());
        }
        Collections.sort(c6887ef.mo16034b(), new C6757a(c6885ed, aprVar));
        return abstractC6880eaArr[0];
    }
}
