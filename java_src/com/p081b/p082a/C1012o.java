package com.p081b.p082a;
/* renamed from: com.b.a.o */
/* loaded from: classes.dex */
public class C1012o extends C1015q {

    /* renamed from: p */
    private AbstractC1013a f2285p;

    /* renamed from: q */
    private long f2286q = -1;

    /* renamed from: com.b.a.o$a */
    /* loaded from: classes.dex */
    public interface AbstractC1013a {
        /* renamed from: a */
        void m37112a(C1012o c1012o, long j, long j2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.p081b.p082a.C1015q
    /* renamed from: a */
    public void mo37100a(float f) {
    }

    /* renamed from: a */
    public void m37113a(AbstractC1013a abstractC1013a) {
        this.f2285p = abstractC1013a;
    }

    @Override // com.p081b.p082a.C1015q
    /* renamed from: c */
    boolean mo37075c(long j) {
        long j2 = 0;
        if (this.f2320i == 0) {
            this.f2320i = 1;
            if (this.f2319h < 0) {
                this.f2318g = j;
            } else {
                this.f2318g = j - this.f2319h;
                this.f2319h = -1L;
            }
        }
        if (this.f2285p != null) {
            long j3 = j - this.f2318g;
            if (this.f2286q >= 0) {
                j2 = j - this.f2286q;
            }
            this.f2286q = j;
            this.f2285p.m37112a(this, j3, j2);
            return false;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.p081b.p082a.C1015q
    /* renamed from: n */
    public void mo37063n() {
    }
}
