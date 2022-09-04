package com.google.android.gms.drive.internal;

import android.annotation.SuppressLint;
import com.google.android.gms.common.api.AbstractC4489g;
import com.google.android.gms.common.api.AbstractC4494i;
import com.google.android.gms.common.api.AbstractC4500k;
import com.google.android.gms.common.api.C4467a;
import com.google.android.gms.common.api.C4487e;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.drive.AbstractC4803c;
import com.google.android.gms.drive.AbstractC4807d;
import com.google.android.gms.drive.AbstractC4808e;
import com.google.android.gms.drive.AbstractC4836f;
import com.google.android.gms.drive.C4795a;
import com.google.android.gms.drive.C4798b;
import com.google.android.gms.drive.C4989m;
import com.google.android.gms.drive.C5023o;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.internal.AbstractC4911bs;
import com.google.android.gms.drive.query.Query;
import com.google.android.gms.internal.ahl;
import java.util.List;
/* renamed from: com.google.android.gms.drive.internal.br */
/* loaded from: classes2.dex */
public class C4894br implements AbstractC4803c {

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.android.gms.drive.internal.br$a */
    /* loaded from: classes2.dex */
    public static class BinderC4901a extends BinderC4879bc {

        /* renamed from: a */
        private final ahl.AbstractC6344b<AbstractC4803c.AbstractC4804a> f17867a;

        public BinderC4901a(ahl.AbstractC6344b<AbstractC4803c.AbstractC4804a> abstractC6344b) {
            this.f17867a = abstractC6344b;
        }

        @Override // com.google.android.gms.drive.internal.BinderC4879bc, com.google.android.gms.drive.internal.AbstractC4967o
        /* renamed from: a */
        public void mo22275a(Status status) {
            this.f17867a.mo7413a(new C4902b(status, null));
        }

        @Override // com.google.android.gms.drive.internal.BinderC4879bc, com.google.android.gms.drive.internal.AbstractC4967o
        /* renamed from: a */
        public void mo22271a(OnContentsResponse onContentsResponse) {
            this.f17867a.mo7413a(new C4902b(Status.f16786a, new C4919bu(onContentsResponse.m22616a())));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.gms.drive.internal.br$b */
    /* loaded from: classes2.dex */
    public static class C4902b implements AbstractC4500k, AbstractC4803c.AbstractC4804a {

        /* renamed from: a */
        private final Status f17868a;

        /* renamed from: b */
        private final AbstractC4807d f17869b;

        public C4902b(Status status, AbstractC4807d abstractC4807d) {
            this.f17868a = status;
            this.f17869b = abstractC4807d;
        }

        @Override // com.google.android.gms.common.api.AbstractC4502m
        /* renamed from: a */
        public Status mo7645a() {
            return this.f17868a;
        }

        @Override // com.google.android.gms.common.api.AbstractC4500k
        /* renamed from: b */
        public void mo7804b() {
            if (this.f17869b != null) {
                this.f17869b.mo22411g();
            }
        }

        @Override // com.google.android.gms.drive.AbstractC4803c.AbstractC4804a
        /* renamed from: c */
        public AbstractC4807d mo22452c() {
            return this.f17869b;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.gms.drive.internal.br$c */
    /* loaded from: classes2.dex */
    public static abstract class AbstractC4903c extends AbstractC4911bs<AbstractC4803c.AbstractC4804a> {
        /* JADX INFO: Access modifiers changed from: package-private */
        public AbstractC4903c(AbstractC4489g abstractC4489g) {
            super(abstractC4489g);
        }

        @Override // com.google.android.gms.internal.ahn
        /* renamed from: a */
        public AbstractC4803c.AbstractC4804a mo7807b(Status status) {
            return new C4902b(status, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.gms.drive.internal.br$d */
    /* loaded from: classes2.dex */
    public static class BinderC4904d extends BinderC4879bc {

        /* renamed from: a */
        private final ahl.AbstractC6344b<AbstractC4803c.AbstractC4805b> f17870a;

        public BinderC4904d(ahl.AbstractC6344b<AbstractC4803c.AbstractC4805b> abstractC6344b) {
            this.f17870a = abstractC6344b;
        }

        @Override // com.google.android.gms.drive.internal.BinderC4879bc, com.google.android.gms.drive.internal.AbstractC4967o
        /* renamed from: a */
        public void mo22275a(Status status) {
            this.f17870a.mo7413a(new C4905e(status, null));
        }

        @Override // com.google.android.gms.drive.internal.BinderC4879bc, com.google.android.gms.drive.internal.AbstractC4967o
        /* renamed from: a */
        public void mo22268a(OnDriveIdResponse onDriveIdResponse) {
            this.f17870a.mo7413a(new C4905e(Status.f16786a, onDriveIdResponse.m22611a()));
        }

        @Override // com.google.android.gms.drive.internal.BinderC4879bc, com.google.android.gms.drive.internal.AbstractC4967o
        /* renamed from: a */
        public void mo22263a(OnMetadataResponse onMetadataResponse) {
            this.f17870a.mo7413a(new C4905e(Status.f16786a, new C4891bo(onMetadataResponse.m22605a()).h()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.android.gms.drive.internal.br$e */
    /* loaded from: classes2.dex */
    public static class C4905e implements AbstractC4803c.AbstractC4805b {

        /* renamed from: a */
        private final Status f17871a;

        /* renamed from: b */
        private final DriveId f17872b;

        public C4905e(Status status, DriveId driveId) {
            this.f17871a = status;
            this.f17872b = driveId;
        }

        @Override // com.google.android.gms.common.api.AbstractC4502m
        /* renamed from: a */
        public Status mo7645a() {
            return this.f17871a;
        }

        @Override // com.google.android.gms.drive.AbstractC4803c.AbstractC4805b
        /* renamed from: b */
        public DriveId mo22450b() {
            return this.f17872b;
        }
    }

    /* renamed from: com.google.android.gms.drive.internal.br$f */
    /* loaded from: classes2.dex */
    static abstract class AbstractC4906f extends AbstractC4911bs<AbstractC4803c.AbstractC4805b> {
        AbstractC4906f(AbstractC4489g abstractC4489g) {
            super(abstractC4489g);
        }

        @Override // com.google.android.gms.internal.ahn
        /* renamed from: a */
        public AbstractC4803c.AbstractC4805b mo7807b(Status status) {
            return new C4905e(status, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.gms.drive.internal.br$g */
    /* loaded from: classes2.dex */
    public static class C4907g implements AbstractC4803c.AbstractC4806c {

        /* renamed from: a */
        private final Status f17873a;

        /* renamed from: b */
        private final C4989m f17874b;

        /* renamed from: c */
        private final boolean f17875c;

        public C4907g(Status status, C4989m c4989m, boolean z) {
            this.f17873a = status;
            this.f17874b = c4989m;
            this.f17875c = z;
        }

        @Override // com.google.android.gms.common.api.AbstractC4502m
        /* renamed from: a */
        public Status mo7645a() {
            return this.f17873a;
        }

        @Override // com.google.android.gms.common.api.AbstractC4500k
        /* renamed from: b */
        public void mo7804b() {
            if (this.f17874b != null) {
                this.f17874b.mo7804b();
            }
        }

        @Override // com.google.android.gms.drive.AbstractC4803c.AbstractC4806c
        /* renamed from: c */
        public C4989m mo22448c() {
            return this.f17874b;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.gms.drive.internal.br$h */
    /* loaded from: classes2.dex */
    public static abstract class AbstractC4908h extends AbstractC4911bs<AbstractC4803c.AbstractC4806c> {
        /* JADX INFO: Access modifiers changed from: package-private */
        public AbstractC4908h(AbstractC4489g abstractC4489g) {
            super(abstractC4489g);
        }

        @Override // com.google.android.gms.internal.ahn
        /* renamed from: a */
        public AbstractC4803c.AbstractC4806c mo7807b(Status status) {
            return new C4907g(status, null, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.android.gms.drive.internal.br$i */
    /* loaded from: classes2.dex */
    public static class BinderC4909i extends BinderC4879bc {

        /* renamed from: a */
        private final ahl.AbstractC6344b<AbstractC4803c.AbstractC4806c> f17876a;

        public BinderC4909i(ahl.AbstractC6344b<AbstractC4803c.AbstractC4806c> abstractC6344b) {
            this.f17876a = abstractC6344b;
        }

        @Override // com.google.android.gms.drive.internal.BinderC4879bc, com.google.android.gms.drive.internal.AbstractC4967o
        /* renamed from: a */
        public void mo22275a(Status status) {
            this.f17876a.mo7413a(new C4907g(status, null, false));
        }

        @Override // com.google.android.gms.drive.internal.BinderC4879bc, com.google.android.gms.drive.internal.AbstractC4967o
        /* renamed from: a */
        public void mo22266a(OnListEntriesResponse onListEntriesResponse) {
            this.f17876a.mo7413a(new C4907g(Status.f16786a, new C4989m(onListEntriesResponse.m22609b()), onListEntriesResponse.m22608c()));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @SuppressLint({"MissingRemoteException"})
    /* renamed from: com.google.android.gms.drive.internal.br$j */
    /* loaded from: classes2.dex */
    public static class C4910j extends AbstractC4911bs.AbstractC4912a {
        /* JADX INFO: Access modifiers changed from: package-private */
        public C4910j(AbstractC4489g abstractC4489g, Status status) {
            super(abstractC4489g);
            b((C4910j) status);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.android.gms.internal.ahl.AbstractC6343a
        /* renamed from: a  reason: avoid collision after fix types in other method */
        public void mo7809a(C4913bt c4913bt) {
        }
    }

    @Override // com.google.android.gms.drive.AbstractC4803c
    /* renamed from: a */
    public AbstractC4494i<AbstractC4803c.AbstractC4804a> mo22470a(AbstractC4489g abstractC4489g) {
        return m22469a(abstractC4489g, AbstractC4808e.f17572c);
    }

    /* renamed from: a */
    public AbstractC4494i<AbstractC4803c.AbstractC4804a> m22469a(AbstractC4489g abstractC4489g, final int i) {
        return abstractC4489g.mo17255a((AbstractC4489g) new AbstractC4903c(abstractC4489g) { // from class: com.google.android.gms.drive.internal.br.2
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.android.gms.internal.ahl.AbstractC6343a
            /* renamed from: a  reason: avoid collision after fix types in other method */
            public void mo7809a(C4913bt c4913bt) {
                c4913bt.m22433i().mo22315a(new CreateContentsRequest(i), new BinderC4901a(this));
            }
        });
    }

    @Override // com.google.android.gms.drive.AbstractC4803c
    /* renamed from: a */
    public AbstractC4494i<AbstractC4803c.AbstractC4806c> mo22467a(AbstractC4489g abstractC4489g, final Query query) {
        if (query == null) {
            throw new IllegalArgumentException("Query must be provided.");
        }
        return abstractC4489g.mo17255a((AbstractC4489g) new AbstractC4908h(abstractC4489g) { // from class: com.google.android.gms.drive.internal.br.1
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.android.gms.internal.ahl.AbstractC6343a
            /* renamed from: a  reason: avoid collision after fix types in other method */
            public void mo7809a(C4913bt c4913bt) {
                c4913bt.m22433i().mo22300a(new QueryRequest(query), new BinderC4909i(this));
            }
        });
    }

    @Override // com.google.android.gms.drive.AbstractC4803c
    /* renamed from: a */
    public AbstractC4494i<AbstractC4803c.AbstractC4805b> mo22466a(AbstractC4489g abstractC4489g, final String str) {
        return abstractC4489g.mo17255a((AbstractC4489g) new AbstractC4906f(abstractC4489g) { // from class: com.google.android.gms.drive.internal.br.3
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.android.gms.internal.ahl.AbstractC6343a
            /* renamed from: a  reason: avoid collision after fix types in other method */
            public void mo7809a(C4913bt c4913bt) {
                c4913bt.m22433i().mo22306a(new GetMetadataRequest(DriveId.m22736a(str), false), new BinderC4904d(this));
            }
        });
    }

    @Override // com.google.android.gms.drive.AbstractC4803c
    /* renamed from: a */
    public AbstractC4494i<Status> mo22465a(AbstractC4489g abstractC4489g, List<String> list) {
        return ((C4913bt) abstractC4489g.mo17383a((C4467a.C4475d<C4467a.AbstractC4477f>) C4798b.f17559a)).m22437a(abstractC4489g, list);
    }

    @Override // com.google.android.gms.drive.AbstractC4803c
    /* renamed from: a */
    public AbstractC4808e mo22468a(AbstractC4489g abstractC4489g, DriveId driveId) {
        if (driveId == null) {
            throw new IllegalArgumentException("Id must be provided.");
        }
        if (abstractC4489g.mo17353j()) {
            return new C4924bv(driveId);
        }
        throw new IllegalStateException("Client must be connected");
    }

    @Override // com.google.android.gms.drive.AbstractC4803c
    /* renamed from: a */
    public C5023o mo22471a() {
        return new C5023o();
    }

    @Override // com.google.android.gms.drive.AbstractC4803c
    /* renamed from: b */
    public C4795a mo22464b() {
        return new C4795a();
    }

    @Override // com.google.android.gms.drive.AbstractC4803c
    /* renamed from: b */
    public AbstractC4836f mo22463b(AbstractC4489g abstractC4489g) {
        C4913bt c4913bt = (C4913bt) abstractC4489g.mo17383a((C4467a.C4475d<C4467a.AbstractC4477f>) C4798b.f17559a);
        if (!c4913bt.m22430l()) {
            throw new IllegalStateException("Client is not yet connected");
        }
        DriveId m22432j = c4913bt.m22432j();
        if (m22432j == null) {
            return null;
        }
        return new C4929bx(m22432j);
    }

    @Override // com.google.android.gms.drive.AbstractC4803c
    /* renamed from: b */
    public AbstractC4836f mo22462b(AbstractC4489g abstractC4489g, DriveId driveId) {
        if (driveId == null) {
            throw new IllegalArgumentException("Id must be provided.");
        }
        if (abstractC4489g.mo17353j()) {
            return new C4929bx(driveId);
        }
        throw new IllegalStateException("Client must be connected");
    }

    @Override // com.google.android.gms.drive.AbstractC4803c
    /* renamed from: c */
    public AbstractC4836f mo22461c(AbstractC4489g abstractC4489g) {
        C4913bt c4913bt = (C4913bt) abstractC4489g.mo17383a((C4467a.C4475d<C4467a.AbstractC4477f>) C4798b.f17559a);
        if (!c4913bt.m22430l()) {
            throw new IllegalStateException("Client is not yet connected");
        }
        DriveId m22431k = c4913bt.m22431k();
        if (m22431k == null) {
            return null;
        }
        return new C4929bx(m22431k);
    }

    @Override // com.google.android.gms.drive.AbstractC4803c
    /* renamed from: d */
    public AbstractC4494i<Status> mo22460d(AbstractC4489g abstractC4489g) {
        return abstractC4489g.mo17253b((AbstractC4489g) new AbstractC4911bs.AbstractC4912a(abstractC4489g) { // from class: com.google.android.gms.drive.internal.br.4
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.android.gms.internal.ahl.AbstractC6343a
            /* renamed from: a  reason: avoid collision after fix types in other method */
            public void mo7809a(C4913bt c4913bt) {
                c4913bt.m22433i().mo22287a(new BinderC4864at(this));
            }
        });
    }

    @Override // com.google.android.gms.drive.AbstractC4803c
    /* renamed from: e */
    public AbstractC4494i<C4487e> mo22459e(AbstractC4489g abstractC4489g) {
        return abstractC4489g.mo17255a((AbstractC4489g) new AbstractC4911bs<C4487e>(abstractC4489g) { // from class: com.google.android.gms.drive.internal.br.5
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.android.gms.internal.ahn
            /* renamed from: a */
            public C4487e mo7807b(Status status) {
                return new C4487e(status, false);
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.android.gms.internal.ahl.AbstractC6343a
            /* renamed from: a  reason: avoid collision after fix types in other method */
            public void mo7809a(C4913bt c4913bt) {
                c4913bt.m22433i().mo22281e(new BinderC4879bc() { // from class: com.google.android.gms.drive.internal.br.5.1
                    @Override // com.google.android.gms.drive.internal.BinderC4879bc, com.google.android.gms.drive.internal.AbstractC4967o
                    /* renamed from: a */
                    public void mo22257a(boolean z) {
                        this.b((AbstractC4911bs) new C4487e(Status.f16786a, z));
                    }
                });
            }
        });
    }
}
