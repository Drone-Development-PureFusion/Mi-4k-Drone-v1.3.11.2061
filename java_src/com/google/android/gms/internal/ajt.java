package com.google.android.gms.internal;
/* loaded from: classes2.dex */
public final class ajt extends AbstractC7642qx<ajt> {

    /* renamed from: a */
    public int f22045a;

    /* renamed from: b */
    public long f22046b;

    /* renamed from: c */
    public long f22047c;

    /* renamed from: d */
    public long f22048d;

    public ajt() {
        m17087b();
    }

    @Override // com.google.android.gms.internal.AbstractC7642qx, com.google.android.gms.internal.AbstractC7649rd
    /* renamed from: a */
    protected int mo13820a() {
        return super.mo13820a() + C7640qw.m13937c(1, this.f22045a) + C7640qw.m13914h(2, this.f22046b) + C7640qw.m13914h(3, this.f22047c) + C7640qw.m13914h(4, this.f22048d);
    }

    @Override // com.google.android.gms.internal.AbstractC7649rd
    /* renamed from: a */
    public ajt mo13816b(C7639qv c7639qv) {
        while (true) {
            int m14015a = c7639qv.m14015a();
            switch (m14015a) {
                case 0:
                    break;
                case 8:
                    this.f22045a = c7639qv.m13997g();
                    break;
                case 16:
                    this.f22046b = c7639qv.m13990m();
                    break;
                case 24:
                    this.f22047c = c7639qv.m13990m();
                    break;
                case 32:
                    this.f22048d = c7639qv.m13990m();
                    break;
                default:
                    if (super.m13906a(c7639qv, m14015a)) {
                        break;
                    } else {
                        break;
                    }
            }
        }
        return this;
    }

    @Override // com.google.android.gms.internal.AbstractC7642qx, com.google.android.gms.internal.AbstractC7649rd
    /* renamed from: a */
    public void mo13818a(C7640qw c7640qw) {
        c7640qw.m13973a(1, this.f22045a);
        c7640qw.m13929d(2, this.f22046b);
        c7640qw.m13929d(3, this.f22047c);
        c7640qw.m13929d(4, this.f22048d);
        super.mo13818a(c7640qw);
    }

    /* renamed from: b */
    public ajt m17087b() {
        this.f22045a = 1;
        this.f22046b = -1L;
        this.f22047c = -1L;
        this.f22048d = -1L;
        this.f25374ag = null;
        this.f25391ah = -1;
        return this;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ajt)) {
            return false;
        }
        ajt ajtVar = (ajt) obj;
        if (this.f22045a != ajtVar.f22045a || this.f22046b != ajtVar.f22046b || this.f22047c != ajtVar.f22047c || this.f22048d != ajtVar.f22048d) {
            return false;
        }
        return (this.f25374ag == null || this.f25374ag.m13887b()) ? ajtVar.f25374ag == null || ajtVar.f25374ag.m13887b() : this.f25374ag.equals(ajtVar.f25374ag);
    }

    public int hashCode() {
        return ((this.f25374ag == null || this.f25374ag.m13887b()) ? 0 : this.f25374ag.hashCode()) + ((((((((((getClass().getName().hashCode() + 527) * 31) + this.f22045a) * 31) + ((int) (this.f22046b ^ (this.f22046b >>> 32)))) * 31) + ((int) (this.f22047c ^ (this.f22047c >>> 32)))) * 31) + ((int) (this.f22048d ^ (this.f22048d >>> 32)))) * 31);
    }
}
