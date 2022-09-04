package com.google.android.gms.drive;

import com.google.android.gms.drive.C4985j;
/* renamed from: com.google.android.gms.drive.w */
/* loaded from: classes2.dex */
public class C5111w extends C4985j {

    /* renamed from: d */
    private String f18201d;

    /* renamed from: e */
    private String f18202e;

    /* renamed from: com.google.android.gms.drive.w$a */
    /* loaded from: classes2.dex */
    public static class C5113a extends C4985j.C4986a {
        @Override // com.google.android.gms.drive.C4985j.C4986a
        /* renamed from: b */
        public C5113a mo21794a(int i) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.android.gms.drive.C4985j.C4986a
        /* renamed from: b */
        public C5113a mo21793a(String str) {
            super.mo21793a(str);
            return this;
        }

        @Override // com.google.android.gms.drive.C4985j.C4986a
        /* renamed from: b */
        public C5113a mo21792a(boolean z) {
            super.mo21792a(z);
            return this;
        }

        @Override // com.google.android.gms.drive.C4985j.C4986a
        /* renamed from: c */
        public C5111w mo21791b() {
            a();
            return new C5111w(this.f17964a, this.f17965b, null, null, this.f17966c);
        }
    }

    private C5111w(String str, boolean z, String str2, String str3, int i) {
        super(str, z, i);
        this.f18201d = str2;
        this.f18202e = str3;
    }

    /* renamed from: a */
    public static C5111w m21803a(C4985j c4985j) {
        C5113a c5113a = new C5113a();
        if (c4985j != null) {
            if (c4985j.m22219c() != 0) {
                throw new IllegalStateException("May not set a conflict strategy for new file creation.");
            }
            String m22225a = c4985j.m22225a();
            if (m22225a != null) {
                C5113a c5113a2 = (C5113a) c5113a.mo21793a(m22225a);
            }
            C5113a c5113a3 = (C5113a) c5113a.mo21792a(c4985j.m22221b());
        }
        return (C5111w) c5113a.mo21791b();
    }

    /* renamed from: d */
    public String m21802d() {
        return this.f18201d;
    }

    /* renamed from: e */
    public String m21801e() {
        return this.f18202e;
    }
}
