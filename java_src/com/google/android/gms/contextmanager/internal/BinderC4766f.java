package com.google.android.gms.contextmanager.internal;

import com.google.android.gms.awareness.fence.AbstractC4097c;
import com.google.android.gms.awareness.fence.AbstractC4098d;
import com.google.android.gms.awareness.snapshot.internal.AbstractC4137m;
import com.google.android.gms.awareness.snapshot.internal.Snapshot;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.contextmanager.AbstractC4729d;
import com.google.android.gms.contextmanager.AbstractC4730e;
import com.google.android.gms.contextmanager.C4725a;
import com.google.android.gms.contextmanager.C4731f;
import com.google.android.gms.contextmanager.fence.internal.FenceStateMapImpl;
import com.google.android.gms.contextmanager.internal.AbstractC4776h;
import com.google.android.gms.internal.C7715sw;
import com.google.android.gms.internal.ahl;
/* renamed from: com.google.android.gms.contextmanager.internal.f */
/* loaded from: classes2.dex */
public class BinderC4766f extends AbstractC4776h.AbstractBinderC4777a {

    /* renamed from: a */
    private final AbstractC4772a f17467a;

    /* renamed from: b */
    private ahl.AbstractC6344b<Status> f17468b;

    /* renamed from: c */
    private ahl.AbstractC6344b<AbstractC4730e> f17469c;

    /* renamed from: d */
    private ahl.AbstractC6344b<AbstractC4792t> f17470d;

    /* renamed from: e */
    private ahl.AbstractC6344b<AbstractC4729d> f17471e;

    /* renamed from: f */
    private ahl.AbstractC6344b<AbstractC4137m> f17472f;

    /* renamed from: g */
    private ahl.AbstractC6344b<AbstractC4097c> f17473g;

    /* renamed from: com.google.android.gms.contextmanager.internal.f$a */
    /* loaded from: classes2.dex */
    public interface AbstractC4772a {
        /* renamed from: a */
        void m22799a(Status status);
    }

    private BinderC4766f(ahl.AbstractC6344b<Status> abstractC6344b, ahl.AbstractC6344b<AbstractC4730e> abstractC6344b2, ahl.AbstractC6344b<AbstractC4792t> abstractC6344b3, ahl.AbstractC6344b<AbstractC4729d> abstractC6344b4, ahl.AbstractC6344b<AbstractC4137m> abstractC6344b5, ahl.AbstractC6344b<AbstractC4097c> abstractC6344b6, AbstractC4772a abstractC4772a) {
        this.f17468b = abstractC6344b;
        this.f17469c = abstractC6344b2;
        this.f17470d = abstractC6344b3;
        this.f17471e = abstractC6344b4;
        this.f17472f = abstractC6344b5;
        this.f17473g = abstractC6344b6;
        this.f17467a = abstractC4772a;
    }

    /* renamed from: a */
    public static BinderC4766f m22804a(ahl.AbstractC6344b<AbstractC4137m> abstractC6344b) {
        return new BinderC4766f(null, null, null, null, abstractC6344b, null, null);
    }

    /* renamed from: a */
    public static BinderC4766f m22803a(ahl.AbstractC6344b<Status> abstractC6344b, AbstractC4772a abstractC4772a) {
        return new BinderC4766f(abstractC6344b, null, null, null, null, null, abstractC4772a);
    }

    /* renamed from: b */
    public static BinderC4766f m22802b(ahl.AbstractC6344b<AbstractC4097c> abstractC6344b) {
        return new BinderC4766f(null, null, null, null, null, abstractC6344b, null);
    }

    @Override // com.google.android.gms.contextmanager.internal.AbstractC4776h
    /* renamed from: a */
    public void mo22794a(Status status) {
        if (this.f17468b == null) {
            C7715sw.m13662b("ContextManagerPendingResult", "Unexpected callback to onStatusResult.");
            return;
        }
        this.f17468b.mo7413a(status);
        this.f17468b = null;
        if (this.f17467a == null) {
            return;
        }
        this.f17467a.m22799a(status);
    }

    @Override // com.google.android.gms.contextmanager.internal.AbstractC4776h
    /* renamed from: a */
    public void mo22793a(final Status status, final Snapshot snapshot) {
        if (this.f17472f == null) {
            C7715sw.m13662b("ContextManagerPendingResult", "Unexpected callback to onSnapshotResult");
            return;
        }
        this.f17472f.mo7413a(new AbstractC4137m() { // from class: com.google.android.gms.contextmanager.internal.f.4
            @Override // com.google.android.gms.common.api.AbstractC4502m
            /* renamed from: a */
            public Status mo7645a() {
                return status;
            }

            @Override // com.google.android.gms.awareness.snapshot.internal.AbstractC4137m
            /* renamed from: b */
            public Snapshot mo22801b() {
                return snapshot;
            }
        });
        this.f17472f = null;
    }

    @Override // com.google.android.gms.contextmanager.internal.AbstractC4776h
    /* renamed from: a */
    public void mo22792a(final Status status, final DataHolder dataHolder) {
        if (this.f17471e == null) {
            C7715sw.m13662b("ContextManagerPendingResult", "Unexpected callback to onStateResult");
            return;
        }
        this.f17471e.mo7413a(new AbstractC4729d() { // from class: com.google.android.gms.contextmanager.internal.f.3

            /* renamed from: d */
            private final C4725a f17486d;

            {
                this.f17486d = dataHolder == null ? null : new C4725a(dataHolder);
            }

            @Override // com.google.android.gms.common.api.AbstractC4502m
            /* renamed from: a */
            public Status mo7645a() {
                return status;
            }
        });
        this.f17471e = null;
    }

    @Override // com.google.android.gms.contextmanager.internal.AbstractC4776h
    /* renamed from: a */
    public void mo22791a(final Status status, final DataHolder dataHolder, final DataHolder dataHolder2) {
        if (this.f17469c == null) {
            C7715sw.m13662b("ContextManagerPendingResult", "Unexpected callback to onReadResult.");
            return;
        }
        this.f17469c.mo7413a(new AbstractC4730e(this) { // from class: com.google.android.gms.contextmanager.internal.f.1

            /* renamed from: d */
            final /* synthetic */ BinderC4766f f17477d;

            /* renamed from: e */
            private final C4725a f17478e;

            /* renamed from: f */
            private final C4731f f17479f;

            {
                C4731f c4731f = null;
                this.f17477d = this;
                this.f17478e = dataHolder == null ? null : new C4725a(dataHolder);
                this.f17479f = dataHolder2 != null ? new C4731f(dataHolder2) : c4731f;
            }

            @Override // com.google.android.gms.common.api.AbstractC4502m
            /* renamed from: a */
            public Status mo7645a() {
                return status;
            }
        });
        this.f17469c = null;
    }

    @Override // com.google.android.gms.contextmanager.internal.AbstractC4776h
    /* renamed from: a */
    public void mo22790a(final Status status, final FenceStateMapImpl fenceStateMapImpl) {
        if (this.f17473g == null) {
            C7715sw.m13662b("ContextManagerPendingResult", "Unexpected callback to onFenceQueryResult");
        } else {
            this.f17473g.mo7413a(new AbstractC4097c() { // from class: com.google.android.gms.contextmanager.internal.f.5
                @Override // com.google.android.gms.common.api.AbstractC4502m
                /* renamed from: a */
                public Status mo7645a() {
                    return status;
                }

                @Override // com.google.android.gms.awareness.fence.AbstractC4097c
                /* renamed from: b */
                public AbstractC4098d mo22800b() {
                    return fenceStateMapImpl;
                }
            });
        }
    }

    @Override // com.google.android.gms.contextmanager.internal.AbstractC4776h
    /* renamed from: a */
    public void mo22789a(final Status status, final WriteBatchImpl writeBatchImpl) {
        if (this.f17470d == null) {
            C7715sw.m13662b("ContextManagerPendingResult", "Unexpected callback to onWriteBatchResult");
            return;
        }
        this.f17470d.mo7413a(new AbstractC4792t() { // from class: com.google.android.gms.contextmanager.internal.f.2
            @Override // com.google.android.gms.common.api.AbstractC4502m
            /* renamed from: a */
            public Status mo7645a() {
                return status;
            }
        });
        this.f17470d = null;
    }
}
