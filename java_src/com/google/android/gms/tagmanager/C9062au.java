package com.google.android.gms.tagmanager;

import com.google.android.gms.common.util.AbstractC4682e;
import com.google.firebase.p253b.C9755a;
/* renamed from: com.google.android.gms.tagmanager.au */
/* loaded from: classes2.dex */
class C9062au implements AbstractC9095bu {

    /* renamed from: a */
    private final long f28713a;

    /* renamed from: b */
    private final long f28714b;

    /* renamed from: c */
    private final int f28715c;

    /* renamed from: d */
    private double f28716d;

    /* renamed from: e */
    private long f28717e;

    /* renamed from: f */
    private final Object f28718f = new Object();

    /* renamed from: g */
    private final String f28719g;

    /* renamed from: h */
    private final AbstractC4682e f28720h;

    public C9062au(int i, int i2, long j, long j2, String str, AbstractC4682e abstractC4682e) {
        this.f28715c = i2;
        this.f28716d = Math.min(i, i2);
        this.f28713a = j;
        this.f28714b = j2;
        this.f28719g = str;
        this.f28720h = abstractC4682e;
    }

    @Override // com.google.android.gms.tagmanager.AbstractC9095bu
    /* renamed from: a */
    public boolean mo9185a() {
        boolean z = false;
        synchronized (this.f28718f) {
            long mo16434a = this.f28720h.mo16434a();
            if (mo16434a - this.f28717e < this.f28714b) {
                String str = this.f28719g;
                C9065aw.m9299b(new StringBuilder(String.valueOf(str).length() + 34).append("Excessive ").append(str).append(" detected; call ignored.").toString());
            } else {
                if (this.f28716d < this.f28715c) {
                    double d = (mo16434a - this.f28717e) / this.f28713a;
                    if (d > C9755a.f30449c) {
                        this.f28716d = Math.min(this.f28715c, d + this.f28716d);
                    }
                }
                this.f28717e = mo16434a;
                if (this.f28716d >= 1.0d) {
                    this.f28716d -= 1.0d;
                    z = true;
                } else {
                    String str2 = this.f28719g;
                    C9065aw.m9299b(new StringBuilder(String.valueOf(str2).length() + 34).append("Excessive ").append(str2).append(" detected; call ignored.").toString());
                }
            }
        }
        return z;
    }
}
