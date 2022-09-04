package com.google.firebase.appindexing.internal;

import android.content.Context;
import com.google.android.gms.appdatasearch.C3952a;
import com.google.android.gms.common.api.AbstractC4510u;
import com.google.android.gms.common.api.C4467a;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.C4588d;
import com.google.android.gms.internal.aeb;
import com.google.android.gms.internal.aee;
import com.google.android.gms.internal.aeh;
import com.google.android.gms.internal.ahl;
import com.google.android.gms.internal.aiv;
import com.google.android.gms.p239g.AbstractC5285f;
import com.google.android.gms.p239g.C5286g;
import com.google.android.gms.p239g.C5290i;
import com.google.firebase.appindexing.AbstractC9658a;
import com.google.firebase.appindexing.AbstractC9679f;
import com.google.firebase.appindexing.C9677d;
/* renamed from: com.google.firebase.appindexing.internal.e */
/* loaded from: classes2.dex */
public final class C9699e extends AbstractC9679f {

    /* renamed from: b */
    private C9701a f30338b;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.firebase.appindexing.internal.e$a */
    /* loaded from: classes2.dex */
    public static class C9701a extends AbstractC4510u<C4467a.AbstractC4468a.C4470b> {
        C9701a(Context context) {
            super(context, C3952a.f15295b, null);
        }
    }

    /* renamed from: com.google.firebase.appindexing.internal.e$b */
    /* loaded from: classes2.dex */
    private static abstract class AbstractC9702b extends aiv<aee, Void> implements ahl.AbstractC6344b<Status> {

        /* renamed from: c */
        protected C5286g<Void> f30341c;

        private AbstractC9702b() {
        }

        @Override // com.google.android.gms.internal.ahl.AbstractC6344b
        /* renamed from: a  reason: avoid collision after fix types in other method */
        public void mo7413a(Status status) {
            if (status.m24018f()) {
                this.f30341c.m20830a((C5286g<Void>) null);
            } else {
                this.f30341c.m20831a(C9710k.m7396a(status, "User Action indexing error, please try again."));
            }
        }

        /* renamed from: a */
        protected abstract void mo7415a(aeb aebVar);

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.android.gms.internal.aiv
        /* renamed from: a  reason: avoid collision after fix types in other method */
        public final void mo7416a(aee aeeVar, C5286g<Void> c5286g) {
            this.f30341c = c5286g;
            mo7415a((aeb) aeeVar.G());
        }

        @Override // com.google.android.gms.internal.ahl.AbstractC6344b
        /* renamed from: c */
        public void mo7412c(Status status) {
            C4588d.m23618b(!status.m24018f(), "Failed result must not be success.");
            mo7413a(status);
        }
    }

    public C9699e(Context context) {
        this.f30338b = new C9701a(context);
    }

    /* renamed from: a */
    private AbstractC5285f<Void> m7420a(int i, AbstractC9658a abstractC9658a) {
        if (!(abstractC9658a instanceof ActionImpl)) {
            return C5290i.m20826a((Exception) new C9677d("Custom Action objects are not allowed. Please use the 'Actions' or 'ActionBuilder' class for creating Action objects."));
        }
        final ActionImpl[] actionImplArr = {(ActionImpl) abstractC9658a};
        actionImplArr[0].m7464e().m7461a(i);
        return this.f30338b.b(new AbstractC9702b() { // from class: com.google.firebase.appindexing.internal.e.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super();
            }

            @Override // com.google.firebase.appindexing.internal.C9699e.AbstractC9702b
            /* renamed from: a */
            protected void mo7415a(aeb aebVar) {
                aebVar.mo17908a(new aeh.BinderC6227d(this), actionImplArr);
            }
        });
    }

    @Override // com.google.firebase.appindexing.AbstractC9679f
    /* renamed from: a */
    public AbstractC5285f<Void> mo7419a(AbstractC9658a abstractC9658a) {
        return m7420a(1, abstractC9658a);
    }

    @Override // com.google.firebase.appindexing.AbstractC9679f
    /* renamed from: b */
    public AbstractC5285f<Void> mo7418b(AbstractC9658a abstractC9658a) {
        return m7420a(2, abstractC9658a);
    }
}
