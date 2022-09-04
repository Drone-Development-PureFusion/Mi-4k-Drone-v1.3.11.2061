package com.google.android.gms.internal;

import com.google.android.gms.internal.AbstractC7642qx;
/* renamed from: com.google.android.gms.internal.qx */
/* loaded from: classes2.dex */
public abstract class AbstractC7642qx<M extends AbstractC7642qx<M>> extends AbstractC7649rd {

    /* renamed from: ag */
    protected C7644qz f25374ag;

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.AbstractC7649rd
    /* renamed from: a */
    public int mo13820a() {
        if (this.f25374ag != null) {
            int i = 0;
            for (int i2 = 0; i2 < this.f25374ag.m13892a(); i2++) {
                i += this.f25374ag.m13886b(i2).m13881a();
            }
            return i;
        }
        return 0;
    }

    /* renamed from: a */
    public final <T> T m13905a(C7643qy<M, T> c7643qy) {
        C7646ra m13891a;
        if (this.f25374ag == null || (m13891a = this.f25374ag.m13891a(C7652rg.m13840b(c7643qy.f25377c))) == null) {
            return null;
        }
        return (T) m13891a.m13879a((C7643qy<?, Object>) c7643qy);
    }

    @Override // com.google.android.gms.internal.AbstractC7649rd
    /* renamed from: a */
    public void mo13818a(C7640qw c7640qw) {
        if (this.f25374ag == null) {
            return;
        }
        for (int i = 0; i < this.f25374ag.m13892a(); i++) {
            this.f25374ag.m13886b(i).m13880a(c7640qw);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean m13906a(C7639qv c7639qv, int i) {
        int m13983t = c7639qv.m13983t();
        if (!c7639qv.m14006b(i)) {
            return false;
        }
        int m13840b = C7652rg.m13840b(i);
        C7651rf c7651rf = new C7651rf(i, c7639qv.m14013a(m13983t, c7639qv.m13983t() - m13983t));
        C7646ra c7646ra = null;
        if (this.f25374ag == null) {
            this.f25374ag = new C7644qz();
        } else {
            c7646ra = this.f25374ag.m13891a(m13840b);
        }
        if (c7646ra == null) {
            c7646ra = new C7646ra();
            this.f25374ag.m13890a(m13840b, c7646ra);
        }
        c7646ra.m13878a(c7651rf);
        return true;
    }

    @Override // com.google.android.gms.internal.AbstractC7649rd
    /* renamed from: d */
    public M clone() {
        M m = (M) super.clone();
        C7647rb.m13875a(this, m);
        return m;
    }

    @Override // com.google.android.gms.internal.AbstractC7649rd
    /* renamed from: e */
    public /* synthetic */ AbstractC7649rd mo13813e() {
        return (AbstractC7642qx) clone();
    }
}
