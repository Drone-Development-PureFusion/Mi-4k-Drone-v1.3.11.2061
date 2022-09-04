package com.google.android.gms.internal;

import com.google.android.gms.internal.AbstractC7030gi;
/* renamed from: com.google.android.gms.internal.el */
/* loaded from: classes2.dex */
public interface AbstractC6896el {

    /* renamed from: com.google.android.gms.internal.el$a */
    /* loaded from: classes2.dex */
    public static final class C6897a extends AbstractC7642qx<C6897a> {

        /* renamed from: a */
        public long f23264a;

        /* renamed from: b */
        public AbstractC7030gi.C7036f f23265b;

        /* renamed from: c */
        public AbstractC7030gi.C7040j f23266c;

        public C6897a() {
            m16016b();
        }

        /* renamed from: a */
        public static C6897a m16017a(byte[] bArr) {
            return (C6897a) AbstractC7649rd.m13856a(new C6897a(), bArr);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.android.gms.internal.AbstractC7642qx, com.google.android.gms.internal.AbstractC7649rd
        /* renamed from: a */
        public int mo13820a() {
            int mo13820a = super.mo13820a() + C7640qw.m13920f(1, this.f23264a);
            if (this.f23265b != null) {
                mo13820a += C7640qw.m13935c(2, this.f23265b);
            }
            return this.f23266c != null ? mo13820a + C7640qw.m13935c(3, this.f23266c) : mo13820a;
        }

        @Override // com.google.android.gms.internal.AbstractC7649rd
        /* renamed from: a */
        public C6897a mo13816b(C7639qv c7639qv) {
            while (true) {
                int m14015a = c7639qv.m14015a();
                switch (m14015a) {
                    case 0:
                        break;
                    case 8:
                        this.f23264a = c7639qv.m13999f();
                        break;
                    case 18:
                        if (this.f23265b == null) {
                            this.f23265b = new AbstractC7030gi.C7036f();
                        }
                        c7639qv.m14011a(this.f23265b);
                        break;
                    case 26:
                        if (this.f23266c == null) {
                            this.f23266c = new AbstractC7030gi.C7040j();
                        }
                        c7639qv.m14011a(this.f23266c);
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
            c7640qw.m13950b(1, this.f23264a);
            if (this.f23265b != null) {
                c7640qw.m13971a(2, this.f23265b);
            }
            if (this.f23266c != null) {
                c7640qw.m13971a(3, this.f23266c);
            }
            super.mo13818a(c7640qw);
        }

        /* renamed from: b */
        public C6897a m16016b() {
            this.f23264a = 0L;
            this.f23265b = null;
            this.f23266c = null;
            this.f25374ag = null;
            this.f25391ah = -1;
            return this;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof C6897a)) {
                return false;
            }
            C6897a c6897a = (C6897a) obj;
            if (this.f23264a != c6897a.f23264a) {
                return false;
            }
            if (this.f23265b == null) {
                if (c6897a.f23265b != null) {
                    return false;
                }
            } else if (!this.f23265b.equals(c6897a.f23265b)) {
                return false;
            }
            if (this.f23266c == null) {
                if (c6897a.f23266c != null) {
                    return false;
                }
            } else if (!this.f23266c.equals(c6897a.f23266c)) {
                return false;
            }
            return (this.f25374ag == null || this.f25374ag.m13887b()) ? c6897a.f25374ag == null || c6897a.f25374ag.m13887b() : this.f25374ag.equals(c6897a.f25374ag);
        }

        public int hashCode() {
            int i = 0;
            int hashCode = ((this.f23266c == null ? 0 : this.f23266c.hashCode()) + (((this.f23265b == null ? 0 : this.f23265b.hashCode()) + ((((getClass().getName().hashCode() + 527) * 31) + ((int) (this.f23264a ^ (this.f23264a >>> 32)))) * 31)) * 31)) * 31;
            if (this.f25374ag != null && !this.f25374ag.m13887b()) {
                i = this.f25374ag.hashCode();
            }
            return hashCode + i;
        }
    }
}
