package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.C3779u;
@aaa
/* renamed from: com.google.android.gms.internal.wg */
/* loaded from: classes.dex */
public class C7900wg extends abq {

    /* renamed from: a */
    final acy f26040a;

    /* renamed from: b */
    final AbstractC7903wi f26041b;

    /* renamed from: c */
    private final String f26042c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C7900wg(acy acyVar, AbstractC7903wi abstractC7903wi, String str) {
        this.f26040a = acyVar;
        this.f26041b = abstractC7903wi;
        this.f26042c = str;
        C3779u.m26898B().m13269a(this);
    }

    @Override // com.google.android.gms.internal.abq
    /* renamed from: a */
    public void mo12782a() {
        try {
            this.f26041b.mo13254a(this.f26042c);
        } finally {
            abv.f21039a.post(new Runnable() { // from class: com.google.android.gms.internal.wg.1
                @Override // java.lang.Runnable
                public void run() {
                    C3779u.m26898B().m13267b(C7900wg.this);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.abq
    /* renamed from: b */
    public void mo12779b() {
        this.f26041b.mo13256a();
    }
}
