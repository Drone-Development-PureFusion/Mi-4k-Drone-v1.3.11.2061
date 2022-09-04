package com.google.android.gms.internal;
/* renamed from: com.google.android.gms.internal.qj */
/* loaded from: classes2.dex */
public final class C7627qj extends AbstractC7649rd {

    /* renamed from: a */
    public int f25321a;

    public C7627qj() {
        m14040b();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.AbstractC7649rd
    /* renamed from: a */
    public int mo13820a() {
        int mo13820a = super.mo13820a();
        return this.f25321a != 0 ? mo13820a + C7640qw.m13937c(1, this.f25321a) : mo13820a;
    }

    @Override // com.google.android.gms.internal.AbstractC7649rd
    /* renamed from: a */
    public C7627qj mo13816b(C7639qv c7639qv) {
        while (true) {
            int m14015a = c7639qv.m14015a();
            switch (m14015a) {
                case 0:
                    break;
                case 8:
                    int m13997g = c7639qv.m13997g();
                    switch (m13997g) {
                        case 0:
                        case 1:
                        case 2:
                            this.f25321a = m13997g;
                            continue;
                    }
                default:
                    if (C7652rg.m13841a(c7639qv, m14015a)) {
                        break;
                    } else {
                        break;
                    }
            }
        }
        return this;
    }

    @Override // com.google.android.gms.internal.AbstractC7649rd
    /* renamed from: a */
    public void mo13818a(C7640qw c7640qw) {
        if (this.f25321a != 0) {
            c7640qw.m13973a(1, this.f25321a);
        }
        super.mo13818a(c7640qw);
    }

    /* renamed from: b */
    public C7627qj m14040b() {
        this.f25321a = 0;
        this.f25391ah = -1;
        return this;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof C7627qj) && this.f25321a == ((C7627qj) obj).f25321a;
    }

    public int hashCode() {
        return ((getClass().getName().hashCode() + 527) * 31) + this.f25321a;
    }
}
