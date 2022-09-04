package com.google.android.gms.internal;

import com.google.android.gms.ads.p225a.C3433a;
import com.google.android.gms.internal.AbstractC6830df;
import java.io.IOException;
/* renamed from: com.google.android.gms.internal.sf */
/* loaded from: classes2.dex */
public class C7689sf extends AbstractCallableC7701sq {
    public C7689sf(C7677rw c7677rw, String str, String str2, AbstractC6830df.C6831a c6831a, int i, int i2) {
        super(c7677rw, str, str2, c6831a, i, i2);
    }

    /* renamed from: a */
    private void m13695a(String str) {
    }

    /* renamed from: c */
    private void m13694c() {
        synchronized (this.f25545e) {
            this.f25545e.f22957aa = (String) this.f25546f.invoke(null, this.f25542b.m13721b());
        }
    }

    /* renamed from: d */
    private void m13693d() {
        C3433a m13706n = this.f25542b.m13706n();
        if (m13706n == null) {
            m13695a("E1");
            return;
        }
        try {
            C3433a.C3434a m27870b = m13706n.m27870b();
            String m13697a = C7681ry.m13697a(m27870b.m27865a());
            if (m13697a != null) {
                synchronized (this.f25545e) {
                    this.f25545e.f22957aa = m13697a;
                    this.f25545e.f22959ac = Boolean.valueOf(m27870b.m27864b());
                    this.f25545e.f22958ab = 5;
                }
            } else {
                m13695a("E");
            }
        } catch (IOException e) {
            m13695a("E");
        }
    }

    @Override // com.google.android.gms.internal.AbstractCallableC7701sq
    /* renamed from: a */
    protected void mo13687a() {
        if (this.f25542b.m13712h()) {
            m13693d();
        } else {
            m13694c();
        }
    }
}
