package com.google.android.gms.wearable.internal;

import com.google.android.gms.common.api.AbstractC4489g;
import com.google.android.gms.common.api.AbstractC4494i;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.C4588d;
import com.google.android.gms.internal.ahl;
import com.google.android.gms.internal.ail;
/* renamed from: com.google.android.gms.wearable.internal.ab */
/* loaded from: classes2.dex */
final class C9483ab<T> extends AbstractC9546ba<Status> {

    /* renamed from: a */
    private T f30011a;

    /* renamed from: b */
    private ail<T> f30012b;

    /* renamed from: c */
    private AbstractC9484a<T> f30013c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.gms.wearable.internal.ab$a */
    /* loaded from: classes2.dex */
    public interface AbstractC9484a<T> {
        /* renamed from: a */
        void mo7811a(C9527ar c9527ar, ahl.AbstractC6344b<Status> abstractC6344b, T t, ail<T> ailVar);
    }

    private C9483ab(AbstractC4489g abstractC4489g, T t, ail<T> ailVar, AbstractC9484a<T> abstractC9484a) {
        super(abstractC4489g);
        this.f30011a = (T) C4588d.m23627a(t);
        this.f30012b = (ail) C4588d.m23627a(ailVar);
        this.f30013c = (AbstractC9484a) C4588d.m23627a(abstractC9484a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static <T> AbstractC4494i<Status> m8028a(AbstractC4489g abstractC4489g, AbstractC9484a<T> abstractC9484a, T t) {
        return abstractC4489g.mo17255a((AbstractC4489g) new C9483ab(abstractC4489g, t, abstractC4489g.mo17373a((AbstractC4489g) t), abstractC9484a));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ahn
    /* renamed from: a */
    public Status mo7807b(Status status) {
        this.f30011a = null;
        this.f30012b = null;
        return status;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ahl.AbstractC6343a
    /* renamed from: a  reason: avoid collision after fix types in other method */
    public void mo7809a(C9527ar c9527ar) {
        this.f30013c.mo7811a(c9527ar, this, this.f30011a, this.f30012b);
        this.f30011a = null;
        this.f30012b = null;
    }
}
