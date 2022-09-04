package com.google.android.gms.internal;

import android.support.annotation.Nullable;
import android.view.View;
import com.google.android.gms.ads.internal.AbstractC3623h;
import com.google.android.gms.internal.AbstractC7804uq;
import com.google.android.gms.p232c.AbstractC4170e;
import com.google.android.gms.p232c.BinderC4173f;
@aaa
/* renamed from: com.google.android.gms.internal.uo */
/* loaded from: classes.dex */
public final class BinderC7802uo extends AbstractC7804uq.AbstractBinderC7805a {

    /* renamed from: a */
    private final AbstractC3623h f25940a;
    @Nullable

    /* renamed from: b */
    private final String f25941b;

    /* renamed from: c */
    private final String f25942c;

    public BinderC7802uo(AbstractC3623h abstractC3623h, @Nullable String str, String str2) {
        this.f25940a = abstractC3623h;
        this.f25941b = str;
        this.f25942c = str2;
    }

    @Override // com.google.android.gms.internal.AbstractC7804uq
    /* renamed from: a */
    public String mo13422a() {
        return this.f25941b;
    }

    @Override // com.google.android.gms.internal.AbstractC7804uq
    /* renamed from: a */
    public void mo13421a(@Nullable AbstractC4170e abstractC4170e) {
        if (abstractC4170e == null) {
            return;
        }
        this.f25940a.mo27335b((View) BinderC4173f.m25294a(abstractC4170e));
    }

    @Override // com.google.android.gms.internal.AbstractC7804uq
    /* renamed from: b */
    public String mo13420b() {
        return this.f25942c;
    }

    @Override // com.google.android.gms.internal.AbstractC7804uq
    /* renamed from: c */
    public void mo13419c() {
        this.f25940a.mo27337E();
    }

    @Override // com.google.android.gms.internal.AbstractC7804uq
    /* renamed from: d */
    public void mo13418d() {
        this.f25940a.mo27336F();
    }
}
