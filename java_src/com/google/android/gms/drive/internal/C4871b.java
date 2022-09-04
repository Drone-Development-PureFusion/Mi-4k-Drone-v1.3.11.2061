package com.google.android.gms.drive.internal;

import com.google.android.gms.common.api.AbstractC4489g;
import com.google.android.gms.common.api.AbstractC4494i;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.drive.AbstractC4839g;
import com.google.android.gms.drive.AbstractC4987k;
import com.google.android.gms.drive.internal.AbstractC4911bs;
import com.google.android.gms.internal.ahl;
/* renamed from: com.google.android.gms.drive.internal.b */
/* loaded from: classes2.dex */
public class C4871b implements AbstractC4839g {

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.android.gms.drive.internal.b$a */
    /* loaded from: classes2.dex */
    public class BinderC4874a extends BinderC4879bc {

        /* renamed from: b */
        private final ahl.AbstractC6344b<AbstractC4839g.AbstractC4840a> f17846b;

        private BinderC4874a(ahl.AbstractC6344b<AbstractC4839g.AbstractC4840a> abstractC6344b) {
            this.f17846b = abstractC6344b;
        }

        @Override // com.google.android.gms.drive.internal.BinderC4879bc, com.google.android.gms.drive.internal.AbstractC4967o
        /* renamed from: a */
        public void mo22275a(Status status) {
            this.f17846b.mo7413a(new C4875b(status, null));
        }

        @Override // com.google.android.gms.drive.internal.BinderC4879bc, com.google.android.gms.drive.internal.AbstractC4967o
        /* renamed from: a */
        public void mo22270a(OnDeviceUsagePreferenceResponse onDeviceUsagePreferenceResponse) {
            this.f17846b.mo7413a(new C4875b(Status.f16786a, onDeviceUsagePreferenceResponse.m22614a()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.android.gms.drive.internal.b$b */
    /* loaded from: classes2.dex */
    public class C4875b implements AbstractC4839g.AbstractC4840a {

        /* renamed from: b */
        private final Status f17848b;

        /* renamed from: c */
        private final AbstractC4987k f17849c;

        private C4875b(Status status, AbstractC4987k abstractC4987k) {
            this.f17848b = status;
            this.f17849c = abstractC4987k;
        }

        @Override // com.google.android.gms.common.api.AbstractC4502m
        /* renamed from: a */
        public Status mo7645a() {
            return this.f17848b;
        }

        @Override // com.google.android.gms.drive.AbstractC4839g.AbstractC4840a
        /* renamed from: b */
        public AbstractC4987k mo22521b() {
            return this.f17849c;
        }
    }

    /* renamed from: com.google.android.gms.drive.internal.b$c */
    /* loaded from: classes2.dex */
    private abstract class AbstractC4876c extends AbstractC4911bs<AbstractC4839g.AbstractC4840a> {
        public AbstractC4876c(AbstractC4489g abstractC4489g) {
            super(abstractC4489g);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.android.gms.internal.ahn
        /* renamed from: a */
        public AbstractC4839g.AbstractC4840a mo7807b(Status status) {
            return new C4875b(status, null);
        }
    }

    @Override // com.google.android.gms.drive.AbstractC4839g
    /* renamed from: a */
    public AbstractC4494i<AbstractC4839g.AbstractC4840a> mo22525a(AbstractC4489g abstractC4489g) {
        return abstractC4489g.mo17255a((AbstractC4489g) new AbstractC4876c(abstractC4489g) { // from class: com.google.android.gms.drive.internal.b.1
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.android.gms.internal.ahl.AbstractC6343a
            /* renamed from: a  reason: avoid collision after fix types in other method */
            public void mo7809a(C4913bt c4913bt) {
                c4913bt.m22433i().mo22282d(new BinderC4874a(this));
            }
        });
    }

    @Override // com.google.android.gms.drive.AbstractC4839g
    /* renamed from: a */
    public AbstractC4494i<Status> mo22524a(AbstractC4489g abstractC4489g, AbstractC4987k abstractC4987k) {
        if (!(abstractC4987k instanceof FileUploadPreferencesImpl)) {
            throw new IllegalArgumentException("Invalid preference value");
        }
        final FileUploadPreferencesImpl fileUploadPreferencesImpl = (FileUploadPreferencesImpl) abstractC4987k;
        return abstractC4489g.mo17253b((AbstractC4489g) new AbstractC4911bs.AbstractC4912a(abstractC4489g) { // from class: com.google.android.gms.drive.internal.b.2
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.android.gms.internal.ahl.AbstractC6343a
            /* renamed from: a  reason: avoid collision after fix types in other method */
            public void mo7809a(C4913bt c4913bt) {
                c4913bt.m22433i().mo22296a(new SetFileUploadPreferencesRequest(fileUploadPreferencesImpl), new BinderC4864at(this));
            }
        });
    }
}
