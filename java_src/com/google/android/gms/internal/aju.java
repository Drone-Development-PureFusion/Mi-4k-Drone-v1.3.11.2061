package com.google.android.gms.internal;
/* loaded from: classes2.dex */
public final class aju extends AbstractC7642qx<aju> {

    /* renamed from: a */
    public int f22049a;

    /* renamed from: b */
    public String f22050b;

    /* renamed from: c */
    public long f22051c;

    /* renamed from: d */
    public long f22052d;

    /* renamed from: e */
    public int f22053e;

    public aju() {
        m17084b();
    }

    /* renamed from: a */
    public static aju m17085a(byte[] bArr) {
        return (aju) AbstractC7649rd.m13856a(new aju(), bArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.AbstractC7642qx, com.google.android.gms.internal.AbstractC7649rd
    /* renamed from: a */
    public int mo13820a() {
        int mo13820a = super.mo13820a() + C7640qw.m13937c(1, this.f22049a) + C7640qw.m13948b(2, this.f22050b) + C7640qw.m13914h(3, this.f22051c) + C7640qw.m13914h(4, this.f22052d);
        return this.f22053e != -1 ? mo13820a + C7640qw.m13937c(5, this.f22053e) : mo13820a;
    }

    @Override // com.google.android.gms.internal.AbstractC7649rd
    /* renamed from: a */
    public aju mo13816b(C7639qv c7639qv) {
        while (true) {
            int m14015a = c7639qv.m14015a();
            switch (m14015a) {
                case 0:
                    break;
                case 8:
                    this.f22049a = c7639qv.m13997g();
                    break;
                case 18:
                    this.f22050b = c7639qv.m13993j();
                    break;
                case 24:
                    this.f22051c = c7639qv.m13990m();
                    break;
                case 32:
                    this.f22052d = c7639qv.m13990m();
                    break;
                case 40:
                    this.f22053e = c7639qv.m13997g();
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
        c7640qw.m13973a(1, this.f22049a);
        c7640qw.m13970a(2, this.f22050b);
        c7640qw.m13929d(3, this.f22051c);
        c7640qw.m13929d(4, this.f22052d);
        if (this.f22053e != -1) {
            c7640qw.m13973a(5, this.f22053e);
        }
        super.mo13818a(c7640qw);
    }

    /* renamed from: b */
    public aju m17084b() {
        this.f22049a = 1;
        this.f22050b = "";
        this.f22051c = -1L;
        this.f22052d = -1L;
        this.f22053e = -1;
        this.f25374ag = null;
        this.f25391ah = -1;
        return this;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof aju)) {
            return false;
        }
        aju ajuVar = (aju) obj;
        if (this.f22049a != ajuVar.f22049a) {
            return false;
        }
        if (this.f22050b == null) {
            if (ajuVar.f22050b != null) {
                return false;
            }
        } else if (!this.f22050b.equals(ajuVar.f22050b)) {
            return false;
        }
        if (this.f22051c != ajuVar.f22051c || this.f22052d != ajuVar.f22052d || this.f22053e != ajuVar.f22053e) {
            return false;
        }
        return (this.f25374ag == null || this.f25374ag.m13887b()) ? ajuVar.f25374ag == null || ajuVar.f25374ag.m13887b() : this.f25374ag.equals(ajuVar.f25374ag);
    }

    public int hashCode() {
        int i = 0;
        int hashCode = ((((((((this.f22050b == null ? 0 : this.f22050b.hashCode()) + ((((getClass().getName().hashCode() + 527) * 31) + this.f22049a) * 31)) * 31) + ((int) (this.f22051c ^ (this.f22051c >>> 32)))) * 31) + ((int) (this.f22052d ^ (this.f22052d >>> 32)))) * 31) + this.f22053e) * 31;
        if (this.f25374ag != null && !this.f25374ag.m13887b()) {
            i = this.f25374ag.hashCode();
        }
        return hashCode + i;
    }
}
