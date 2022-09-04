package com.google.android.gms.internal;
/* renamed from: com.google.android.gms.internal.qq */
/* loaded from: classes2.dex */
public final class C7634qq extends AbstractC7649rd {

    /* renamed from: a */
    public String f25348a;

    public C7634qq() {
        m14025b();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.AbstractC7649rd
    /* renamed from: a */
    public int mo13820a() {
        int mo13820a = super.mo13820a();
        return !this.f25348a.equals("") ? mo13820a + C7640qw.m13948b(1, this.f25348a) : mo13820a;
    }

    @Override // com.google.android.gms.internal.AbstractC7649rd
    /* renamed from: a */
    public C7634qq mo13816b(C7639qv c7639qv) {
        while (true) {
            int m14015a = c7639qv.m14015a();
            switch (m14015a) {
                case 0:
                    break;
                case 10:
                    this.f25348a = c7639qv.m13993j();
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
        if (!this.f25348a.equals("")) {
            c7640qw.m13970a(1, this.f25348a);
        }
        super.mo13818a(c7640qw);
    }

    /* renamed from: b */
    public C7634qq m14025b() {
        this.f25348a = "";
        this.f25391ah = -1;
        return this;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C7634qq)) {
            return false;
        }
        C7634qq c7634qq = (C7634qq) obj;
        return this.f25348a == null ? c7634qq.f25348a == null : this.f25348a.equals(c7634qq.f25348a);
    }

    public int hashCode() {
        return (this.f25348a == null ? 0 : this.f25348a.hashCode()) + ((getClass().getName().hashCode() + 527) * 31);
    }
}
