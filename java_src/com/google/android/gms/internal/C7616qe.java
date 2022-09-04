package com.google.android.gms.internal;
/* renamed from: com.google.android.gms.internal.qe */
/* loaded from: classes2.dex */
public final class C7616qe extends AbstractC7649rd {

    /* renamed from: a */
    public int f25276a;

    /* renamed from: b */
    public String f25277b;

    public C7616qe() {
        m14061b();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.AbstractC7649rd
    /* renamed from: a */
    public int mo13820a() {
        int mo13820a = super.mo13820a();
        if (this.f25276a != 0) {
            mo13820a += C7640qw.m13937c(1, this.f25276a);
        }
        return !this.f25277b.equals("") ? mo13820a + C7640qw.m13948b(2, this.f25277b) : mo13820a;
    }

    @Override // com.google.android.gms.internal.AbstractC7649rd
    /* renamed from: a */
    public C7616qe mo13816b(C7639qv c7639qv) {
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
                            this.f25276a = m13997g;
                            continue;
                    }
                case 18:
                    this.f25277b = c7639qv.m13993j();
                    break;
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
        if (this.f25276a != 0) {
            c7640qw.m13973a(1, this.f25276a);
        }
        if (!this.f25277b.equals("")) {
            c7640qw.m13970a(2, this.f25277b);
        }
        super.mo13818a(c7640qw);
    }

    /* renamed from: b */
    public C7616qe m14061b() {
        this.f25276a = 0;
        this.f25277b = "";
        this.f25391ah = -1;
        return this;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C7616qe)) {
            return false;
        }
        C7616qe c7616qe = (C7616qe) obj;
        if (this.f25276a != c7616qe.f25276a) {
            return false;
        }
        return this.f25277b == null ? c7616qe.f25277b == null : this.f25277b.equals(c7616qe.f25277b);
    }

    public int hashCode() {
        return (this.f25277b == null ? 0 : this.f25277b.hashCode()) + ((((getClass().getName().hashCode() + 527) * 31) + this.f25276a) * 31);
    }
}
