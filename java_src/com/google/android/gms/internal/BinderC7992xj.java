package com.google.android.gms.internal;

import android.support.annotation.Nullable;
import com.google.android.gms.internal.AbstractC8011xs;
import com.google.android.gms.internal.C7996xl;
@aaa
/* renamed from: com.google.android.gms.internal.xj */
/* loaded from: classes.dex */
public final class BinderC7992xj extends AbstractC8011xs.AbstractBinderC8012a {

    /* renamed from: a */
    private final Object f26248a = new Object();

    /* renamed from: b */
    private C7996xl.AbstractC7997a f26249b;

    /* renamed from: c */
    private AbstractC7991xi f26250c;

    @Override // com.google.android.gms.internal.AbstractC8011xs
    /* renamed from: a */
    public void mo13049a() {
        synchronized (this.f26248a) {
            if (this.f26250c != null) {
                this.f26250c.mo13105v();
            }
        }
    }

    @Override // com.google.android.gms.internal.AbstractC8011xs
    /* renamed from: a */
    public void mo13048a(int i) {
        synchronized (this.f26248a) {
            if (this.f26249b != null) {
                this.f26249b.mo13073a(i == 3 ? 1 : 2);
                this.f26249b = null;
            }
        }
    }

    /* renamed from: a */
    public void m13100a(@Nullable AbstractC7991xi abstractC7991xi) {
        synchronized (this.f26248a) {
            this.f26250c = abstractC7991xi;
        }
    }

    /* renamed from: a */
    public void m13099a(C7996xl.AbstractC7997a abstractC7997a) {
        synchronized (this.f26248a) {
            this.f26249b = abstractC7997a;
        }
    }

    @Override // com.google.android.gms.internal.AbstractC8011xs
    /* renamed from: a */
    public void mo13047a(AbstractC8014xt abstractC8014xt) {
        synchronized (this.f26248a) {
            if (this.f26249b != null) {
                this.f26249b.mo13072a(0, abstractC8014xt);
                this.f26249b = null;
                return;
            }
            if (this.f26250c != null) {
                this.f26250c.mo13101z();
            }
        }
    }

    @Override // com.google.android.gms.internal.AbstractC8011xs
    /* renamed from: b */
    public void mo13046b() {
        synchronized (this.f26248a) {
            if (this.f26250c != null) {
                this.f26250c.mo13104w();
            }
        }
    }

    @Override // com.google.android.gms.internal.AbstractC8011xs
    /* renamed from: c */
    public void mo13045c() {
        synchronized (this.f26248a) {
            if (this.f26250c != null) {
                this.f26250c.mo13103x();
            }
        }
    }

    @Override // com.google.android.gms.internal.AbstractC8011xs
    /* renamed from: d */
    public void mo13044d() {
        synchronized (this.f26248a) {
            if (this.f26250c != null) {
                this.f26250c.mo13102y();
            }
        }
    }

    @Override // com.google.android.gms.internal.AbstractC8011xs
    /* renamed from: e */
    public void mo13043e() {
        synchronized (this.f26248a) {
            if (this.f26249b != null) {
                this.f26249b.mo13073a(0);
                this.f26249b = null;
                return;
            }
            if (this.f26250c != null) {
                this.f26250c.mo13101z();
            }
        }
    }

    @Override // com.google.android.gms.internal.AbstractC8011xs
    /* renamed from: f */
    public void mo13042f() {
        synchronized (this.f26248a) {
            if (this.f26250c != null) {
                this.f26250c.mo13106A();
            }
        }
    }
}
