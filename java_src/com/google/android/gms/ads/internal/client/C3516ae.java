package com.google.android.gms.ads.internal.client;

import com.google.android.gms.ads.AbstractC3432a;
import com.google.android.gms.internal.aaa;
@aaa
/* renamed from: com.google.android.gms.ads.internal.client.ae */
/* loaded from: classes.dex */
public class C3516ae extends AbstractC3432a {

    /* renamed from: a */
    private final Object f13940a = new Object();

    /* renamed from: b */
    private AbstractC3432a f13941b;

    @Override // com.google.android.gms.ads.AbstractC3432a
    /* renamed from: a */
    public void mo27472a() {
        synchronized (this.f13940a) {
            if (this.f13941b != null) {
                this.f13941b.mo27472a();
            }
        }
    }

    @Override // com.google.android.gms.ads.AbstractC3432a
    /* renamed from: a */
    public void mo27471a(int i) {
        synchronized (this.f13940a) {
            if (this.f13941b != null) {
                this.f13941b.mo27471a(i);
            }
        }
    }

    /* renamed from: a */
    public void m27581a(AbstractC3432a abstractC3432a) {
        synchronized (this.f13940a) {
            this.f13941b = abstractC3432a;
        }
    }

    @Override // com.google.android.gms.ads.AbstractC3432a
    /* renamed from: b */
    public void mo27580b() {
        synchronized (this.f13940a) {
            if (this.f13941b != null) {
                this.f13941b.mo27580b();
            }
        }
    }

    @Override // com.google.android.gms.ads.AbstractC3432a
    /* renamed from: c */
    public void mo27579c() {
        synchronized (this.f13940a) {
            if (this.f13941b != null) {
                this.f13941b.mo27579c();
            }
        }
    }

    @Override // com.google.android.gms.ads.AbstractC3432a
    /* renamed from: d */
    public void mo27578d() {
        synchronized (this.f13940a) {
            if (this.f13941b != null) {
                this.f13941b.mo27578d();
            }
        }
    }
}
