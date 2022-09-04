package com.google.android.gms.internal;

import android.app.Activity;
import android.content.Intent;
import com.google.android.gms.appinvite.AbstractC3967b;
import com.google.android.gms.appinvite.AbstractC3971d;
import com.google.android.gms.appinvite.C3965a;
import com.google.android.gms.appinvite.C3972e;
import com.google.android.gms.common.api.AbstractC4489g;
import com.google.android.gms.common.api.AbstractC4494i;
import com.google.android.gms.common.api.AbstractC4502m;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.ael;
import com.google.android.gms.internal.ahl;
/* loaded from: classes2.dex */
public class aei implements AbstractC3967b {

    /* renamed from: com.google.android.gms.internal.aei$a */
    /* loaded from: classes2.dex */
    static class BinderC6228a extends ael.AbstractBinderC6236a {
        BinderC6228a() {
        }

        @Override // com.google.android.gms.internal.ael
        /* renamed from: a */
        public void mo17855a(Status status) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.android.gms.internal.ael
        /* renamed from: a */
        public void mo17854a(Status status, Intent intent) {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: com.google.android.gms.internal.aei$b */
    /* loaded from: classes2.dex */
    static abstract class AbstractC6229b<R extends AbstractC4502m> extends ahl.AbstractC6343a<R, aej> {
        public AbstractC6229b(AbstractC4489g abstractC4489g) {
            super(C3965a.f15317b, abstractC4489g);
        }
    }

    /* renamed from: com.google.android.gms.internal.aei$c */
    /* loaded from: classes2.dex */
    final class C6230c extends AbstractC6229b<Status> {

        /* renamed from: b */
        private final String f21347b;

        public C6230c(AbstractC4489g abstractC4489g, String str) {
            super(abstractC4489g);
            this.f21347b = str;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.android.gms.internal.ahn
        /* renamed from: a */
        public Status mo7807b(Status status) {
            return status;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.android.gms.internal.ahl.AbstractC6343a
        /* renamed from: a  reason: avoid collision after fix types in other method */
        public void mo7809a(aej aejVar) {
            aejVar.m17859b(new BinderC6228a() { // from class: com.google.android.gms.internal.aei.c.1
                @Override // com.google.android.gms.internal.aei.BinderC6228a, com.google.android.gms.internal.ael
                /* renamed from: a */
                public void mo17855a(Status status) {
                    C6230c.this.b((C6230c) status);
                }
            }, this.f21347b);
        }
    }

    /* renamed from: com.google.android.gms.internal.aei$d */
    /* loaded from: classes2.dex */
    final class C6232d extends AbstractC6229b<Status> {

        /* renamed from: b */
        private final String f21350b;

        public C6232d(AbstractC4489g abstractC4489g, String str) {
            super(abstractC4489g);
            this.f21350b = str;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.android.gms.internal.ahn
        /* renamed from: a */
        public Status mo7807b(Status status) {
            return status;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.android.gms.internal.ahl.AbstractC6343a
        /* renamed from: a  reason: avoid collision after fix types in other method */
        public void mo7809a(aej aejVar) {
            aejVar.m17860a(new BinderC6228a() { // from class: com.google.android.gms.internal.aei.d.1
                @Override // com.google.android.gms.internal.aei.BinderC6228a, com.google.android.gms.internal.ael
                /* renamed from: a */
                public void mo17855a(Status status) {
                    C6232d.this.b((C6232d) status);
                }
            }, this.f21350b);
        }
    }

    /* renamed from: com.google.android.gms.internal.aei$e */
    /* loaded from: classes2.dex */
    final class C6234e extends AbstractC6229b<AbstractC3971d> {

        /* renamed from: b */
        private final Activity f21353b;

        /* renamed from: c */
        private final boolean f21354c;

        /* renamed from: d */
        private final Intent f21355d;

        public C6234e(AbstractC4489g abstractC4489g, Activity activity, boolean z) {
            super(abstractC4489g);
            this.f21353b = activity;
            this.f21354c = z;
            this.f21355d = this.f21353b != null ? this.f21353b.getIntent() : null;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.android.gms.internal.ahn
        /* renamed from: a */
        public AbstractC3971d mo7807b(Status status) {
            return new aek(status, new Intent());
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.android.gms.internal.ahl.AbstractC6343a
        /* renamed from: a  reason: avoid collision after fix types in other method */
        public void mo7809a(aej aejVar) {
            if (!C3972e.m25881a(this.f21355d)) {
                aejVar.m17861a((ael) new BinderC6228a() { // from class: com.google.android.gms.internal.aei.e.1
                    @Override // com.google.android.gms.internal.aei.BinderC6228a, com.google.android.gms.internal.ael
                    /* renamed from: a */
                    public void mo17854a(Status status, Intent intent) {
                        C6234e.this.b((C6234e) new aek(status, intent));
                        if (!C3972e.m25881a(intent) || !C6234e.this.f21354c || C6234e.this.f21353b == null) {
                            return;
                        }
                        C6234e.this.f21353b.startActivity(intent);
                    }
                });
                return;
            }
            b((C6234e) new aek(Status.f16786a, this.f21355d));
            aejVar.m17861a((ael) null);
        }
    }

    @Override // com.google.android.gms.appinvite.AbstractC3967b
    /* renamed from: a */
    public AbstractC4494i<AbstractC3971d> mo17873a(AbstractC4489g abstractC4489g, Activity activity, boolean z) {
        return abstractC4489g.mo17255a((AbstractC4489g) new C6234e(abstractC4489g, activity, z));
    }

    @Override // com.google.android.gms.appinvite.AbstractC3967b
    /* renamed from: a */
    public AbstractC4494i<Status> mo17872a(AbstractC4489g abstractC4489g, String str) {
        return abstractC4489g.mo17255a((AbstractC4489g) new C6230c(abstractC4489g, str));
    }

    @Override // com.google.android.gms.appinvite.AbstractC3967b
    /* renamed from: b */
    public AbstractC4494i<Status> mo17871b(AbstractC4489g abstractC4489g, String str) {
        return abstractC4489g.mo17255a((AbstractC4489g) new C6232d(abstractC4489g, str));
    }
}
