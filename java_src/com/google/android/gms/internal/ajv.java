package com.google.android.gms.internal;
/* loaded from: classes2.dex */
public final class ajv extends AbstractC7642qx<ajv> {

    /* renamed from: a */
    public long f22054a;

    /* renamed from: b */
    public long f22055b;

    public ajv() {
        m17082b();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.AbstractC7642qx, com.google.android.gms.internal.AbstractC7649rd
    /* renamed from: a */
    public int mo13820a() {
        return super.mo13820a() + C7640qw.m13914h(1, this.f22054a) + C7640qw.m13914h(2, this.f22055b);
    }

    @Override // com.google.android.gms.internal.AbstractC7649rd
    /* renamed from: a */
    public ajv mo13816b(C7639qv c7639qv) {
        while (true) {
            int m14015a = c7639qv.m14015a();
            switch (m14015a) {
                case 0:
                    break;
                case 8:
                    this.f22054a = c7639qv.m13990m();
                    break;
                case 16:
                    this.f22055b = c7639qv.m13990m();
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
        c7640qw.m13929d(1, this.f22054a);
        c7640qw.m13929d(2, this.f22055b);
        super.mo13818a(c7640qw);
    }

    /* renamed from: b */
    public ajv m17082b() {
        this.f22054a = -1L;
        this.f22055b = -1L;
        this.f25374ag = null;
        this.f25391ah = -1;
        return this;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ajv)) {
            return false;
        }
        ajv ajvVar = (ajv) obj;
        if (this.f22054a != ajvVar.f22054a || this.f22055b != ajvVar.f22055b) {
            return false;
        }
        return (this.f25374ag == null || this.f25374ag.m13887b()) ? ajvVar.f25374ag == null || ajvVar.f25374ag.m13887b() : this.f25374ag.equals(ajvVar.f25374ag);
    }

    public int hashCode() {
        return ((this.f25374ag == null || this.f25374ag.m13887b()) ? 0 : this.f25374ag.hashCode()) + ((((((getClass().getName().hashCode() + 527) * 31) + ((int) (this.f22054a ^ (this.f22054a >>> 32)))) * 31) + ((int) (this.f22055b ^ (this.f22055b >>> 32)))) * 31);
    }
}
