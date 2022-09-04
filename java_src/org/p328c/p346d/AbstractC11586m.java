package org.p328c.p346d;

import java.util.ArrayList;
import java.util.List;
import org.p328c.C11595e;
import org.p328c.p337b.C11503b;
import org.p328c.p347e.C11622c;
import org.p328c.p350f.p351a.AbstractC11650j;
import org.p328c.p350f.p351a.C11646f;
/* renamed from: org.c.d.m */
/* loaded from: classes.dex */
public abstract class AbstractC11586m implements AbstractC11585l {
    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m620a(Throwable th, C11622c c11622c, List<Throwable> list) {
        try {
            mo621a(th, c11622c);
        } catch (Throwable th2) {
            list.add(th2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m618a(C11503b c11503b, C11622c c11622c, List<Throwable> list) {
        try {
            if (c11503b instanceof C11595e) {
                mo612a((C11595e) c11503b, c11622c);
            } else {
                m619a(c11503b, c11622c);
            }
        } catch (Throwable th) {
            list.add(th);
        }
    }

    /* renamed from: a */
    static /* synthetic */ void m617a(AbstractC11586m abstractC11586m, Throwable th, C11622c c11622c, List list) {
        abstractC11586m.m620a(th, c11622c, list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m613a(C11622c c11622c, List<Throwable> list) {
        try {
            mo607c(c11622c);
        } catch (Throwable th) {
            list.add(th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public void m609b(C11622c c11622c, List<Throwable> list) {
        try {
            mo614a(c11622c);
        } catch (Throwable th) {
            list.add(th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public void m606c(C11622c c11622c, List<Throwable> list) {
        try {
            mo610b(c11622c);
        } catch (Throwable th) {
            list.add(th);
        }
    }

    @Override // org.p328c.p346d.AbstractC11585l
    /* renamed from: a */
    public AbstractC11650j mo587a(final AbstractC11650j abstractC11650j, final C11622c c11622c) {
        return new AbstractC11650j() { // from class: org.c.d.m.1
            @Override // org.p328c.p350f.p351a.AbstractC11650j
            /* renamed from: a */
            public void mo318a() {
                ArrayList arrayList = new ArrayList();
                AbstractC11586m.this.m609b(c11622c, arrayList);
                try {
                    try {
                        abstractC11650j.mo318a();
                        AbstractC11586m.this.m613a(c11622c, arrayList);
                    } catch (C11503b e) {
                        arrayList.add(e);
                        AbstractC11586m.this.m618a(e, c11622c, (List<Throwable>) arrayList);
                        AbstractC11586m.this.m606c(c11622c, arrayList);
                    }
                    C11646f.m438a(arrayList);
                } finally {
                    AbstractC11586m.this.m606c(c11622c, arrayList);
                }
            }
        };
    }

    /* renamed from: a */
    protected void mo621a(Throwable th, C11622c c11622c) {
    }

    @Deprecated
    /* renamed from: a */
    protected void m619a(C11503b c11503b, C11622c c11622c) {
    }

    /* renamed from: a */
    protected void mo614a(C11622c c11622c) {
    }

    /* renamed from: a */
    protected void mo612a(C11595e c11595e, C11622c c11622c) {
        m619a((C11503b) c11595e, c11622c);
    }

    /* renamed from: b */
    protected void mo610b(C11622c c11622c) {
    }

    /* renamed from: c */
    protected void mo607c(C11622c c11622c) {
    }
}
