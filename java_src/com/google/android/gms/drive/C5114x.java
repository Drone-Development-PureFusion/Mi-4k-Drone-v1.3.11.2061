package com.google.android.gms.drive;

import com.google.android.gms.drive.C4985j;
/* renamed from: com.google.android.gms.drive.x */
/* loaded from: classes2.dex */
public class C5114x extends C4985j {

    /* renamed from: d */
    private boolean f18203d;

    /* renamed from: com.google.android.gms.drive.x$a */
    /* loaded from: classes2.dex */
    public static class C5116a extends C4985j.C4986a {

        /* renamed from: d */
        private boolean f18204d = true;

        @Override // com.google.android.gms.drive.C4985j.C4986a
        /* renamed from: b */
        public C5116a mo21794a(int i) {
            super.mo21794a(i);
            return this;
        }

        @Override // com.google.android.gms.drive.C4985j.C4986a
        /* renamed from: b */
        public C5116a mo21793a(String str) {
            super.mo21793a(str);
            return this;
        }

        @Override // com.google.android.gms.drive.C4985j.C4986a
        /* renamed from: b */
        public C5116a mo21792a(boolean z) {
            super.mo21792a(z);
            return this;
        }

        @Override // com.google.android.gms.drive.C4985j.C4986a
        /* renamed from: c */
        public C5114x mo21791b() {
            a();
            return new C5114x(this.f17964a, this.f17965b, this.f17966c, this.f18204d);
        }
    }

    private C5114x(String str, boolean z, int i, boolean z2) {
        super(str, z, i);
        this.f18203d = z2;
    }

    /* renamed from: a */
    public static C5114x m21796a(C4985j c4985j) {
        C5116a c5116a = new C5116a();
        if (c4985j != null) {
            C5116a c5116a2 = (C5116a) c5116a.mo21794a(c4985j.m22219c());
            C5116a c5116a3 = (C5116a) c5116a.mo21792a(c4985j.m22221b());
            String m22225a = c4985j.m22225a();
            if (m22225a != null) {
                C5116a c5116a4 = (C5116a) c5116a.mo21793a(m22225a);
            }
        }
        return (C5114x) c5116a.mo21791b();
    }

    /* renamed from: d */
    public boolean m21795d() {
        return this.f18203d;
    }
}
