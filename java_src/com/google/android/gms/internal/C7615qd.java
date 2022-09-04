package com.google.android.gms.internal;
/* renamed from: com.google.android.gms.internal.qd */
/* loaded from: classes2.dex */
public final class C7615qd extends AbstractC7649rd {

    /* renamed from: a */
    public int f25274a;

    /* renamed from: b */
    public int f25275b;

    public C7615qd() {
        m14063b();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.AbstractC7649rd
    /* renamed from: a */
    public int mo13820a() {
        int mo13820a = super.mo13820a();
        if (this.f25274a != 0) {
            mo13820a += C7640qw.m13937c(1, this.f25274a);
        }
        return this.f25275b != 0 ? mo13820a + C7640qw.m13937c(2, this.f25275b) : mo13820a;
    }

    @Override // com.google.android.gms.internal.AbstractC7649rd
    /* renamed from: a */
    public C7615qd mo13816b(C7639qv c7639qv) {
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
                        case 3:
                            this.f25274a = m13997g;
                            continue;
                    }
                case 16:
                    int m13997g2 = c7639qv.m13997g();
                    switch (m13997g2) {
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                            this.f25275b = m13997g2;
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
        if (this.f25274a != 0) {
            c7640qw.m13973a(1, this.f25274a);
        }
        if (this.f25275b != 0) {
            c7640qw.m13973a(2, this.f25275b);
        }
        super.mo13818a(c7640qw);
    }

    /* renamed from: b */
    public C7615qd m14063b() {
        this.f25274a = 0;
        this.f25275b = 0;
        this.f25391ah = -1;
        return this;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C7615qd)) {
            return false;
        }
        C7615qd c7615qd = (C7615qd) obj;
        return this.f25274a == c7615qd.f25274a && this.f25275b == c7615qd.f25275b;
    }

    public int hashCode() {
        return ((((getClass().getName().hashCode() + 527) * 31) + this.f25274a) * 31) + this.f25275b;
    }
}
