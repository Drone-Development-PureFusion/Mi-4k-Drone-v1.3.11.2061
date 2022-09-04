package com.google.android.gms.internal;

import android.os.Looper;
import android.support.annotation.NonNull;
import com.google.android.gms.common.api.AbstractC4502m;
import com.google.android.gms.common.api.AbstractC4510u;
import com.google.android.gms.common.api.C4467a;
import com.google.android.gms.common.api.C4467a.AbstractC4468a;
import com.google.android.gms.internal.ahl;
/* loaded from: classes2.dex */
public class aid<O extends C4467a.AbstractC4468a> extends ahu {

    /* renamed from: c */
    private final AbstractC4510u<O> f21925c;

    public aid(AbstractC4510u<O> abstractC4510u) {
        super("Method is not supported by connectionless client. APIs supporting connectionless client must not call this method.");
        this.f21925c = abstractC4510u;
    }

    @Override // com.google.android.gms.common.api.AbstractC4489g
    /* renamed from: a */
    public <A extends C4467a.AbstractC4474c, R extends AbstractC4502m, T extends ahl.AbstractC6343a<R, A>> T mo17255a(@NonNull T t) {
        return (T) this.f21925c.m23938a((AbstractC4510u<O>) t);
    }

    @Override // com.google.android.gms.common.api.AbstractC4489g
    /* renamed from: a */
    public void mo17254a(aiw aiwVar) {
        this.f21925c.m23936b();
    }

    @Override // com.google.android.gms.common.api.AbstractC4489g
    /* renamed from: b */
    public <A extends C4467a.AbstractC4474c, T extends ahl.AbstractC6343a<? extends AbstractC4502m, A>> T mo17253b(@NonNull T t) {
        return (T) this.f21925c.m23935b((AbstractC4510u<O>) t);
    }

    @Override // com.google.android.gms.common.api.AbstractC4489g
    /* renamed from: b */
    public void mo17252b(aiw aiwVar) {
        this.f21925c.m23933c();
    }

    @Override // com.google.android.gms.common.api.AbstractC4489g
    /* renamed from: c */
    public Looper mo17251c() {
        return this.f21925c.m23928h();
    }
}
