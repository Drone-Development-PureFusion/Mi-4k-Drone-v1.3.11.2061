package org.p328c.p346d;

import org.p325b.AbstractC11433k;
import org.p325b.AbstractC11435m;
import org.p325b.C11425d;
import org.p325b.C11436n;
import org.p328c.C11565c;
import org.p328c.p337b.p339b.C11505b;
import org.p328c.p337b.p339b.C11506c;
import org.p328c.p347e.C11622c;
import org.p328c.p350f.p351a.AbstractC11650j;
/* renamed from: org.c.d.c */
/* loaded from: classes.dex */
public class C11571c implements AbstractC11585l {

    /* renamed from: a */
    private final C11573d f36693a = new C11573d();

    /* renamed from: b */
    private String f36694b = "Expected test to throw %s";

    /* renamed from: org.c.d.c$a */
    /* loaded from: classes2.dex */
    private class C11572a extends AbstractC11650j {

        /* renamed from: b */
        private final AbstractC11650j f36696b;

        public C11572a(AbstractC11650j abstractC11650j) {
            this.f36696b = abstractC11650j;
        }

        @Override // org.p328c.p350f.p351a.AbstractC11650j
        /* renamed from: a */
        public void mo318a() {
            try {
                this.f36696b.mo318a();
                if (!C11571c.this.m662d()) {
                    return;
                }
                C11571c.this.m661e();
            } catch (Throwable th) {
                C11571c.this.m672a(th);
            }
        }
    }

    private C11571c() {
    }

    /* renamed from: a */
    public static C11571c m675a() {
        return new C11571c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m672a(Throwable th) {
        if (m662d()) {
            C11565c.m758a(th, (AbstractC11433k<? super Throwable>) this.f36693a.m657b());
            return;
        }
        throw th;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public boolean m662d() {
        return this.f36693a.m659a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e */
    public void m661e() {
        C11565c.m757a(m660f());
    }

    /* renamed from: f */
    private String m660f() {
        return String.format(this.f36694b, C11436n.m1073b((AbstractC11435m) this.f36693a.m657b()));
    }

    /* renamed from: a */
    public C11571c m673a(String str) {
        this.f36694b = str;
        return this;
    }

    @Override // org.p328c.p346d.AbstractC11585l
    /* renamed from: a */
    public AbstractC11650j mo587a(AbstractC11650j abstractC11650j, C11622c c11622c) {
        return new C11572a(abstractC11650j);
    }

    /* renamed from: a */
    public void m674a(Class<? extends Throwable> cls) {
        m671a(C11425d.m1097d((Class<?>) cls));
    }

    /* renamed from: a */
    public void m671a(AbstractC11433k<?> abstractC11433k) {
        this.f36693a.m658a(abstractC11433k);
    }

    @Deprecated
    /* renamed from: b */
    public C11571c m668b() {
        return this;
    }

    /* renamed from: b */
    public void m667b(String str) {
        m666b(C11425d.m1111b(str));
    }

    /* renamed from: b */
    public void m666b(AbstractC11433k<String> abstractC11433k) {
        m671a(C11506c.m904a(abstractC11433k));
    }

    @Deprecated
    /* renamed from: c */
    public C11571c m664c() {
        return this;
    }

    /* renamed from: c */
    public void m663c(AbstractC11433k<? extends Throwable> abstractC11433k) {
        m671a(C11505b.m908a(abstractC11433k));
    }
}
