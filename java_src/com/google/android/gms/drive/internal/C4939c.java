package com.google.android.gms.drive.internal;

import com.google.android.gms.common.api.AbstractC4489g;
import com.google.android.gms.common.api.AbstractC4494i;
import com.google.android.gms.common.api.C4467a;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.drive.AbstractC4803c;
import com.google.android.gms.drive.AbstractC4841h;
import com.google.android.gms.drive.AbstractC4988l;
import com.google.android.gms.drive.C4798b;
import com.google.android.gms.drive.C4989m;
import com.google.android.gms.drive.C5021n;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.events.AbstractC4813a;
import com.google.android.gms.drive.internal.AbstractC4911bs;
import com.google.android.gms.drive.internal.C4894br;
import com.google.android.gms.internal.ahl;
import java.util.ArrayList;
import java.util.Set;
/* renamed from: com.google.android.gms.drive.internal.c */
/* loaded from: classes2.dex */
public class C4939c implements AbstractC4841h {

    /* renamed from: a */
    protected final DriveId f17932a;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.android.gms.drive.internal.c$a */
    /* loaded from: classes2.dex */
    public static class BinderC4947a extends BinderC4879bc {

        /* renamed from: a */
        private final ahl.AbstractC6344b<AbstractC4803c.AbstractC4806c> f17943a;

        public BinderC4947a(ahl.AbstractC6344b<AbstractC4803c.AbstractC4806c> abstractC6344b) {
            this.f17943a = abstractC6344b;
        }

        @Override // com.google.android.gms.drive.internal.BinderC4879bc, com.google.android.gms.drive.internal.AbstractC4967o
        /* renamed from: a */
        public void mo22275a(Status status) {
            this.f17943a.mo7413a(new C4894br.C4907g(status, null, false));
        }

        @Override // com.google.android.gms.drive.internal.BinderC4879bc, com.google.android.gms.drive.internal.AbstractC4967o
        /* renamed from: a */
        public void mo22265a(OnListParentsResponse onListParentsResponse) {
            this.f17943a.mo7413a(new C4894br.C4907g(Status.f16786a, new C4989m(onListParentsResponse.m22606b()), false));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.android.gms.drive.internal.c$b */
    /* loaded from: classes2.dex */
    public static class BinderC4948b extends BinderC4879bc {

        /* renamed from: a */
        private final ahl.AbstractC6344b<AbstractC4841h.AbstractC4842a> f17944a;

        public BinderC4948b(ahl.AbstractC6344b<AbstractC4841h.AbstractC4842a> abstractC6344b) {
            this.f17944a = abstractC6344b;
        }

        @Override // com.google.android.gms.drive.internal.BinderC4879bc, com.google.android.gms.drive.internal.AbstractC4967o
        /* renamed from: a */
        public void mo22275a(Status status) {
            this.f17944a.mo7413a(new C4949c(status, null));
        }

        @Override // com.google.android.gms.drive.internal.BinderC4879bc, com.google.android.gms.drive.internal.AbstractC4967o
        /* renamed from: a */
        public void mo22263a(OnMetadataResponse onMetadataResponse) {
            this.f17944a.mo7413a(new C4949c(Status.f16786a, new C4891bo(onMetadataResponse.m22605a())));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.android.gms.drive.internal.c$c */
    /* loaded from: classes2.dex */
    public static class C4949c implements AbstractC4841h.AbstractC4842a {

        /* renamed from: a */
        private final Status f17945a;

        /* renamed from: b */
        private final AbstractC4988l f17946b;

        public C4949c(Status status, AbstractC4988l abstractC4988l) {
            this.f17945a = status;
            this.f17946b = abstractC4988l;
        }

        @Override // com.google.android.gms.common.api.AbstractC4502m
        /* renamed from: a */
        public Status mo7645a() {
            return this.f17945a;
        }

        @Override // com.google.android.gms.drive.AbstractC4841h.AbstractC4842a
        /* renamed from: b */
        public AbstractC4988l mo22356b() {
            return this.f17946b;
        }
    }

    /* renamed from: com.google.android.gms.drive.internal.c$d */
    /* loaded from: classes2.dex */
    private abstract class AbstractC4950d extends AbstractC4911bs<AbstractC4841h.AbstractC4842a> {
        private AbstractC4950d(AbstractC4489g abstractC4489g) {
            super(abstractC4489g);
        }

        @Override // com.google.android.gms.internal.ahn
        /* renamed from: a */
        public AbstractC4841h.AbstractC4842a mo7807b(Status status) {
            return new C4949c(status, null);
        }
    }

    public C4939c(DriveId driveId) {
        this.f17932a = driveId;
    }

    /* renamed from: a */
    private AbstractC4494i<AbstractC4841h.AbstractC4842a> m22373a(AbstractC4489g abstractC4489g, final boolean z) {
        return abstractC4489g.mo17255a((AbstractC4489g) new AbstractC4950d(abstractC4489g) { // from class: com.google.android.gms.drive.internal.c.1
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.android.gms.internal.ahl.AbstractC6343a
            /* renamed from: a  reason: avoid collision after fix types in other method */
            public void mo7809a(C4913bt c4913bt) {
                c4913bt.m22433i().mo22306a(new GetMetadataRequest(C4939c.this.f17932a, z), new BinderC4948b(this));
            }
        });
    }

    @Override // com.google.android.gms.drive.AbstractC4841h
    /* renamed from: a */
    public AbstractC4494i<Status> mo22375a(AbstractC4489g abstractC4489g, AbstractC4813a abstractC4813a) {
        return ((C4913bt) abstractC4489g.mo17383a((C4467a.C4475d<C4467a.AbstractC4477f>) C4798b.f17559a)).m22441a(abstractC4489g, this.f17932a, abstractC4813a);
    }

    @Override // com.google.android.gms.drive.AbstractC4841h
    /* renamed from: a */
    public AbstractC4494i<Status> mo22374a(AbstractC4489g abstractC4489g, Set<DriveId> set) {
        if (set == null) {
            throw new IllegalArgumentException("ParentIds must be provided.");
        }
        final ArrayList arrayList = new ArrayList(set);
        return abstractC4489g.mo17253b((AbstractC4489g) new AbstractC4911bs.AbstractC4912a(abstractC4489g) { // from class: com.google.android.gms.drive.internal.c.3
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.android.gms.internal.ahl.AbstractC6343a
            /* renamed from: a  reason: avoid collision after fix types in other method */
            public void mo7809a(C4913bt c4913bt) {
                c4913bt.m22433i().mo22294a(new SetResourceParentsRequest(C4939c.this.f17932a, arrayList), new BinderC4864at(this));
            }
        });
    }

    @Override // com.google.android.gms.drive.AbstractC4841h
    /* renamed from: a */
    public DriveId mo22376a() {
        return this.f17932a;
    }

    @Override // com.google.android.gms.drive.AbstractC4841h
    /* renamed from: b */
    public AbstractC4494i<AbstractC4841h.AbstractC4842a> mo22372b(AbstractC4489g abstractC4489g) {
        return m22373a(abstractC4489g, false);
    }

    @Override // com.google.android.gms.drive.AbstractC4841h
    /* renamed from: b */
    public AbstractC4494i<Status> mo22371b(AbstractC4489g abstractC4489g, AbstractC4813a abstractC4813a) {
        return ((C4913bt) abstractC4489g.mo17383a((C4467a.C4475d<C4467a.AbstractC4477f>) C4798b.f17559a)).m22435b(abstractC4489g, this.f17932a, abstractC4813a);
    }

    @Override // com.google.android.gms.drive.AbstractC4841h
    /* renamed from: b */
    public AbstractC4494i<AbstractC4841h.AbstractC4842a> mo22370b(AbstractC4489g abstractC4489g, final C5021n c5021n) {
        if (c5021n == null) {
            throw new IllegalArgumentException("ChangeSet must be provided.");
        }
        return abstractC4489g.mo17253b((AbstractC4489g) new AbstractC4950d(abstractC4489g) { // from class: com.google.android.gms.drive.internal.c.4
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.android.gms.internal.ahl.AbstractC6343a
            /* renamed from: a  reason: avoid collision after fix types in other method */
            public void mo7809a(C4913bt c4913bt) {
                c5021n.m22081j().m22155a(c4913bt.B());
                c4913bt.m22433i().mo22289a(new UpdateMetadataRequest(C4939c.this.f17932a, c5021n.m22081j()), new BinderC4948b(this));
            }
        });
    }

    @Override // com.google.android.gms.drive.AbstractC4841h
    /* renamed from: c */
    public AbstractC4494i<AbstractC4803c.AbstractC4806c> mo22369c(AbstractC4489g abstractC4489g) {
        return abstractC4489g.mo17255a((AbstractC4489g) new C4894br.AbstractC4908h(abstractC4489g) { // from class: com.google.android.gms.drive.internal.c.2
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.android.gms.internal.ahl.AbstractC6343a
            /* renamed from: a  reason: avoid collision after fix types in other method */
            public void mo7809a(C4913bt c4913bt) {
                c4913bt.m22433i().mo22304a(new ListParentsRequest(C4939c.this.f17932a), new BinderC4947a(this));
            }
        });
    }

    @Override // com.google.android.gms.drive.AbstractC4841h
    /* renamed from: d */
    public AbstractC4494i<Status> mo22368d(AbstractC4489g abstractC4489g) {
        return abstractC4489g.mo17253b((AbstractC4489g) new AbstractC4911bs.AbstractC4912a(abstractC4489g) { // from class: com.google.android.gms.drive.internal.c.5
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.android.gms.internal.ahl.AbstractC6343a
            /* renamed from: a  reason: avoid collision after fix types in other method */
            public void mo7809a(C4913bt c4913bt) {
                c4913bt.m22433i().mo22311a(new DeleteResourceRequest(C4939c.this.f17932a), new BinderC4864at(this));
            }
        });
    }

    @Override // com.google.android.gms.drive.AbstractC4841h
    /* renamed from: e */
    public AbstractC4494i<Status> mo22367e(AbstractC4489g abstractC4489g) {
        return ((C4913bt) abstractC4489g.mo17383a((C4467a.C4475d<C4467a.AbstractC4477f>) C4798b.f17559a)).m22442a(abstractC4489g, this.f17932a);
    }

    @Override // com.google.android.gms.drive.AbstractC4841h
    /* renamed from: f */
    public AbstractC4494i<Status> mo22366f(AbstractC4489g abstractC4489g) {
        return ((C4913bt) abstractC4489g.mo17383a((C4467a.C4475d<C4467a.AbstractC4477f>) C4798b.f17559a)).m22436b(abstractC4489g, this.f17932a);
    }

    @Override // com.google.android.gms.drive.AbstractC4841h
    /* renamed from: g */
    public AbstractC4494i<Status> mo22365g(AbstractC4489g abstractC4489g) {
        return abstractC4489g.mo17253b((AbstractC4489g) new AbstractC4911bs.AbstractC4912a(abstractC4489g) { // from class: com.google.android.gms.drive.internal.c.6
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.android.gms.internal.ahl.AbstractC6343a
            /* renamed from: a  reason: avoid collision after fix types in other method */
            public void mo7809a(C4913bt c4913bt) {
                c4913bt.m22433i().mo22292a(new TrashResourceRequest(C4939c.this.f17932a), new BinderC4864at(this));
            }
        });
    }

    @Override // com.google.android.gms.drive.AbstractC4841h
    /* renamed from: h */
    public AbstractC4494i<Status> mo22364h(AbstractC4489g abstractC4489g) {
        return abstractC4489g.mo17253b((AbstractC4489g) new AbstractC4911bs.AbstractC4912a(abstractC4489g) { // from class: com.google.android.gms.drive.internal.c.7
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.android.gms.internal.ahl.AbstractC6343a
            /* renamed from: a  reason: avoid collision after fix types in other method */
            public void mo7809a(C4913bt c4913bt) {
                c4913bt.m22433i().mo22290a(new UntrashResourceRequest(C4939c.this.f17932a), new BinderC4864at(this));
            }
        });
    }
}
