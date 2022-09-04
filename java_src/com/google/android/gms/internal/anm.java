package com.google.android.gms.internal;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.api.AbstractC4489g;
import com.google.android.gms.common.api.AbstractC4494i;
import com.google.android.gms.common.api.AbstractC4502m;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.ahl;
import com.google.android.gms.internal.anj;
import com.google.android.gms.p237e.AbstractC5121b;
import com.google.android.gms.p237e.C5119a;
/* loaded from: classes2.dex */
public class anm implements AbstractC5121b {

    /* renamed from: com.google.android.gms.internal.anm$a */
    /* loaded from: classes2.dex */
    private static abstract class AbstractC6643a extends AbstractC6645c<AbstractC5121b.AbstractC5122a> {
        public AbstractC6643a(AbstractC4489g abstractC4489g) {
            super(abstractC4489g);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.android.gms.internal.ahn
        /* renamed from: a */
        public AbstractC5121b.AbstractC5122a mo7807b(Status status) {
            return new ano(status, null);
        }
    }

    /* renamed from: com.google.android.gms.internal.anm$b */
    /* loaded from: classes2.dex */
    private static final class BinderC6644b extends anj.AbstractBinderC6635a {

        /* renamed from: a */
        private final ahl.AbstractC6344b<AbstractC5121b.AbstractC5122a> f22490a;

        public BinderC6644b(ahl.AbstractC6344b<AbstractC5121b.AbstractC5122a> abstractC6344b) {
            this.f22490a = abstractC6344b;
        }

        @Override // com.google.android.gms.internal.anj
        /* renamed from: a */
        public void mo16612a(int i, Bundle bundle, int i2, Intent intent) {
            this.f22490a.mo7413a(new ano(new Status(i, null, bundle != null ? (PendingIntent) bundle.getParcelable("pendingIntent") : null), intent));
        }
    }

    /* renamed from: com.google.android.gms.internal.anm$c */
    /* loaded from: classes2.dex */
    private static abstract class AbstractC6645c<R extends AbstractC4502m> extends ahl.AbstractC6343a<R, ann> {
        protected AbstractC6645c(AbstractC4489g abstractC4489g) {
            super(C5119a.f18205a, abstractC4489g);
        }

        /* renamed from: a */
        protected abstract void mo16611a(Context context, anl anlVar);

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.android.gms.internal.ahl.AbstractC6343a
        /* renamed from: a  reason: avoid collision after fix types in other method */
        public final void mo7809a(ann annVar) {
            mo16611a(annVar.B(), (anl) annVar.G());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public static void m16616b(Context context, Uri uri) {
        context.revokeUriPermission(uri, 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public static void m16615b(final Context context, anl anlVar, final anj anjVar, final Uri uri, Bundle bundle) {
        context.grantUriPermission("com.google.android.gms", uri, 1);
        try {
            anlVar.mo16620a(new anj.AbstractBinderC6635a() { // from class: com.google.android.gms.internal.anm.3
                @Override // com.google.android.gms.internal.anj
                /* renamed from: a */
                public void mo16612a(int i, Bundle bundle2, int i2, Intent intent) {
                    anm.m16616b(context, uri);
                    anjVar.mo16612a(i, bundle2, i2, intent);
                }
            }, uri, bundle, true);
        } catch (RemoteException e) {
            m16616b(context, uri);
            throw e;
        } catch (RuntimeException e2) {
            m16616b(context, uri);
            throw e2;
        }
    }

    @Override // com.google.android.gms.p237e.AbstractC5121b
    /* renamed from: a */
    public AbstractC4494i<AbstractC5121b.AbstractC5122a> mo16617a(AbstractC4489g abstractC4489g, final Uri uri) {
        return abstractC4489g.mo17255a((AbstractC4489g) new AbstractC6643a(abstractC4489g) { // from class: com.google.android.gms.internal.anm.1
            @Override // com.google.android.gms.internal.anm.AbstractC6645c
            /* renamed from: a */
            protected void mo16611a(Context context, anl anlVar) {
                anlVar.mo16620a(new BinderC6644b(this), uri, null, false);
            }
        });
    }

    @Override // com.google.android.gms.p237e.AbstractC5121b
    /* renamed from: b */
    public AbstractC4494i<AbstractC5121b.AbstractC5122a> mo16614b(AbstractC4489g abstractC4489g, final Uri uri) {
        return abstractC4489g.mo17255a((AbstractC4489g) new AbstractC6643a(abstractC4489g) { // from class: com.google.android.gms.internal.anm.2
            @Override // com.google.android.gms.internal.anm.AbstractC6645c
            /* renamed from: a */
            protected void mo16611a(Context context, anl anlVar) {
                anm.m16615b(context, anlVar, new BinderC6644b(this), uri, null);
            }
        });
    }
}
