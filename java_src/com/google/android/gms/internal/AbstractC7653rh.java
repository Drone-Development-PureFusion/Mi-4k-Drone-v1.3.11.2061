package com.google.android.gms.internal;
/* renamed from: com.google.android.gms.internal.rh */
/* loaded from: classes2.dex */
public interface AbstractC7653rh {

    /* renamed from: com.google.android.gms.internal.rh$a */
    /* loaded from: classes2.dex */
    public static final class C7654a extends AbstractC7642qx<C7654a> {

        /* renamed from: a */
        public boolean f25402a;

        /* renamed from: b */
        public int f25403b;

        /* renamed from: c */
        public String f25404c;

        public C7654a() {
            m13837b();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.android.gms.internal.AbstractC7642qx, com.google.android.gms.internal.AbstractC7649rd
        /* renamed from: a */
        public int mo13820a() {
            int mo13820a = super.mo13820a();
            if (this.f25402a) {
                mo13820a += C7640qw.m13947b(1, this.f25402a);
            }
            if (this.f25403b != 0) {
                mo13820a += C7640qw.m13937c(2, this.f25403b);
            }
            return !this.f25404c.equals("") ? mo13820a + C7640qw.m13948b(3, this.f25404c) : mo13820a;
        }

        @Override // com.google.android.gms.internal.AbstractC7649rd
        /* renamed from: a */
        public C7654a mo13816b(C7639qv c7639qv) {
            while (true) {
                int m14015a = c7639qv.m14015a();
                switch (m14015a) {
                    case 0:
                        break;
                    case 8:
                        this.f25402a = c7639qv.m13994i();
                        break;
                    case 16:
                        this.f25403b = c7639qv.m13997g();
                        break;
                    case 26:
                        this.f25404c = c7639qv.m13993j();
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
            if (this.f25402a) {
                c7640qw.m13969a(1, this.f25402a);
            }
            if (this.f25403b != 0) {
                c7640qw.m13973a(2, this.f25403b);
            }
            if (!this.f25404c.equals("")) {
                c7640qw.m13970a(3, this.f25404c);
            }
            super.mo13818a(c7640qw);
        }

        /* renamed from: b */
        public C7654a m13837b() {
            this.f25402a = false;
            this.f25403b = 0;
            this.f25404c = "";
            this.f25374ag = null;
            this.f25391ah = -1;
            return this;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof C7654a)) {
                return false;
            }
            C7654a c7654a = (C7654a) obj;
            if (this.f25402a != c7654a.f25402a || this.f25403b != c7654a.f25403b) {
                return false;
            }
            if (this.f25404c == null) {
                if (c7654a.f25404c != null) {
                    return false;
                }
            } else if (!this.f25404c.equals(c7654a.f25404c)) {
                return false;
            }
            return (this.f25374ag == null || this.f25374ag.m13887b()) ? c7654a.f25374ag == null || c7654a.f25374ag.m13887b() : this.f25374ag.equals(c7654a.f25374ag);
        }

        public int hashCode() {
            int i = 0;
            int hashCode = ((this.f25404c == null ? 0 : this.f25404c.hashCode()) + (((((this.f25402a ? 1231 : 1237) + ((getClass().getName().hashCode() + 527) * 31)) * 31) + this.f25403b) * 31)) * 31;
            if (this.f25374ag != null && !this.f25374ag.m13887b()) {
                i = this.f25374ag.hashCode();
            }
            return hashCode + i;
        }
    }
}
