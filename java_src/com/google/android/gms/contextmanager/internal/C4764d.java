package com.google.android.gms.contextmanager.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import com.google.android.gms.awareness.C4090b;
import com.google.android.gms.awareness.fence.AbstractC4097c;
import com.google.android.gms.awareness.fence.AbstractC4104i;
import com.google.android.gms.awareness.snapshot.internal.AbstractC4137m;
import com.google.android.gms.awareness.snapshot.internal.SnapshotRequest;
import com.google.android.gms.common.api.AbstractC4489g;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.AbstractC4638w;
import com.google.android.gms.common.internal.C4626s;
import com.google.android.gms.contextmanager.fence.internal.BinderC4738e;
import com.google.android.gms.contextmanager.fence.internal.FenceQueryRequestImpl;
import com.google.android.gms.contextmanager.fence.internal.FenceUpdateRequestImpl;
import com.google.android.gms.contextmanager.internal.AbstractC4779i;
import com.google.android.gms.contextmanager.internal.BinderC4766f;
import com.google.android.gms.internal.AbstractC7707st;
import com.google.android.gms.internal.C7716sx;
import com.google.android.gms.internal.ahl;
/* renamed from: com.google.android.gms.contextmanager.internal.d */
/* loaded from: classes2.dex */
public class C4764d extends AbstractC4638w<AbstractC4779i> {

    /* renamed from: a */
    private static AbstractC7707st.AbstractC7708a f17463a = AbstractC7707st.AbstractC7708a.f25553a;

    /* renamed from: e */
    private final Looper f17464e;

    /* renamed from: f */
    private final ContextManagerClientInfo f17465f;

    /* renamed from: g */
    private C7716sx<AbstractC4104i, BinderC4738e> f17466g;

    public C4764d(Context context, Looper looper, C4626s c4626s, C4090b c4090b, AbstractC4489g.AbstractC4491b abstractC4491b, AbstractC4489g.AbstractC4492c abstractC4492c) {
        super(context, looper, 47, c4626s, abstractC4491b, abstractC4492c);
        this.f17464e = looper;
        String str = c4626s.m23533b() == null ? "@@ContextManagerNullAccount@@" : c4626s.m23533b().name;
        this.f17465f = c4090b == null ? ContextManagerClientInfo.m22871a(context, str) : ContextManagerClientInfo.m22870a(context, str, c4090b);
    }

    /* renamed from: a */
    public static Handler m22812a(Looper looper) {
        return f17463a == null ? AbstractC7707st.AbstractC7708a.f25553a.mo13677a(looper) : f17463a.mo13677a(looper);
    }

    /* renamed from: h */
    private C7716sx<AbstractC4104i, BinderC4738e> m22808h() {
        if (this.f17466g == null) {
            this.f17466g = new C7716sx<>(this.f17464e, BinderC4738e.f17397a);
        }
        return this.f17466g;
    }

    @Override // com.google.android.gms.common.internal.AbstractC4600p
    /* renamed from: H */
    public boolean mo15921H() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.common.internal.AbstractC4600p
    /* renamed from: a */
    public AbstractC4779i mo7440b(IBinder iBinder) {
        return AbstractC4779i.AbstractBinderC4780a.m22788a(iBinder);
    }

    @Override // com.google.android.gms.common.internal.AbstractC4600p
    /* renamed from: a */
    protected String mo7443a() {
        return "com.google.android.contextmanager.service.ContextManagerService.START";
    }

    /* renamed from: a */
    public void m22811a(ahl.AbstractC6344b<AbstractC4137m> abstractC6344b, SnapshotRequest snapshotRequest) {
        F();
        ((AbstractC4779i) G()).mo22787a(BinderC4766f.m22804a(abstractC6344b), this.f17465f.m22867d(), this.f17465f.m22869b(), this.f17465f.m22865f(), snapshotRequest);
    }

    /* renamed from: a */
    public void m22810a(ahl.AbstractC6344b<AbstractC4097c> abstractC6344b, FenceQueryRequestImpl fenceQueryRequestImpl) {
        F();
        ((AbstractC4779i) G()).mo22786a(BinderC4766f.m22802b(abstractC6344b), this.f17465f.m22867d(), this.f17465f.m22869b(), this.f17465f.m22865f(), fenceQueryRequestImpl);
    }

    /* renamed from: a */
    public void m22809a(ahl.AbstractC6344b<Status> abstractC6344b, FenceUpdateRequestImpl fenceUpdateRequestImpl) {
        F();
        fenceUpdateRequestImpl.m22955a(m22808h());
        ((AbstractC4779i) G()).mo22785a(BinderC4766f.m22803a(abstractC6344b, (BinderC4766f.AbstractC4772a) null), this.f17465f.m22867d(), this.f17465f.m22869b(), this.f17465f.m22865f(), fenceUpdateRequestImpl);
    }

    @Override // com.google.android.gms.common.internal.AbstractC4600p
    /* renamed from: b */
    protected String mo7441b() {
        return "com.google.android.gms.contextmanager.internal.IContextManagerService";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.common.internal.AbstractC4600p
    /* renamed from: c */
    public Bundle mo9367c() {
        Bundle bundle = new Bundle();
        bundle.putByteArray("com.google.android.contextmanager.service.args", this.f17465f.m22858m());
        return bundle;
    }
}
