package com.google.android.gms.internal;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.AbstractC4489g;
import com.google.android.gms.common.api.AbstractC4502m;
import com.google.android.gms.common.api.C4467a;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.C4588d;
/* loaded from: classes.dex */
public class ahl {

    /* renamed from: com.google.android.gms.internal.ahl$a */
    /* loaded from: classes.dex */
    public static abstract class AbstractC6343a<R extends AbstractC4502m, A extends C4467a.AbstractC4474c> extends ahn<R> implements AbstractC6344b<R> {

        /* renamed from: a */
        private final C4467a.C4475d<A> f21738a;

        /* renamed from: b */
        private final C4467a<?> f21739b;

        /* JADX INFO: Access modifiers changed from: protected */
        @Deprecated
        public AbstractC6343a(C4467a.C4475d<A> c4475d, AbstractC4489g abstractC4489g) {
            super((AbstractC4489g) C4588d.m23626a(abstractC4489g, "GoogleApiClient must not be null"));
            this.f21738a = (C4467a.C4475d) C4588d.m23627a(c4475d);
            this.f21739b = null;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        public AbstractC6343a(C4467a<?> c4467a, AbstractC4489g abstractC4489g) {
            super((AbstractC4489g) C4588d.m23626a(abstractC4489g, "GoogleApiClient must not be null"));
            this.f21738a = (C4467a.C4475d<A>) c4467a.m24009d();
            this.f21739b = c4467a;
        }

        /* renamed from: a */
        private void m17478a(RemoteException remoteException) {
            mo7412c(new Status(8, remoteException.getLocalizedMessage(), null));
        }

        /* renamed from: a */
        protected abstract void mo7809a(A a);

        /* renamed from: a */
        protected void m17477a(R r) {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.android.gms.internal.ahl.AbstractC6344b
        /* renamed from: a */
        public /* synthetic */ void mo7413a(Object obj) {
            super.m17464b((AbstractC6343a<R, A>) ((AbstractC4502m) obj));
        }

        /* renamed from: b */
        public final void m17476b(A a) {
            try {
                mo7809a((AbstractC6343a<R, A>) a);
            } catch (DeadObjectException e) {
                m17478a((RemoteException) e);
                throw e;
            } catch (RemoteException e2) {
                m17478a(e2);
            }
        }

        @Override // com.google.android.gms.internal.ahl.AbstractC6344b
        /* renamed from: c */
        public final void mo7412c(Status status) {
            C4588d.m23618b(!status.m24018f(), "Failed result must not be success");
            R b = b(status);
            b((AbstractC6343a<R, A>) b);
            m17477a((AbstractC6343a<R, A>) b);
        }

        /* renamed from: g */
        public final C4467a.C4475d<A> m17475g() {
            return this.f21738a;
        }

        /* renamed from: h */
        public final C4467a<?> m17474h() {
            return this.f21739b;
        }
    }

    /* renamed from: com.google.android.gms.internal.ahl$b */
    /* loaded from: classes.dex */
    public interface AbstractC6344b<R> {
        /* renamed from: a */
        void mo7413a(R r);

        /* renamed from: c */
        void mo7412c(Status status);
    }
}
