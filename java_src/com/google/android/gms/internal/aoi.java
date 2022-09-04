package com.google.android.gms.internal;

import android.util.Log;
import com.google.android.gms.common.api.AbstractC4489g;
import com.google.android.gms.common.api.AbstractC4494i;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.ahl;
import com.google.android.gms.internal.aof;
import com.google.android.gms.search.AbstractC9003b;
import com.google.android.gms.search.C9000a;
import com.google.android.gms.search.GoogleNowAuthState;
/* loaded from: classes2.dex */
public class aoi implements AbstractC9003b {

    /* renamed from: com.google.android.gms.internal.aoi$a */
    /* loaded from: classes2.dex */
    static abstract class AbstractBinderC6683a extends aof.AbstractBinderC6679a {
        AbstractBinderC6683a() {
        }

        @Override // com.google.android.gms.internal.aof
        /* renamed from: a */
        public void mo16511a(Status status) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.android.gms.internal.aof
        /* renamed from: a */
        public void mo16507a(Status status, GoogleNowAuthState googleNowAuthState) {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: com.google.android.gms.internal.aoi$b */
    /* loaded from: classes2.dex */
    static class C6684b extends ahl.AbstractC6343a<Status, aoh> {

        /* renamed from: a */
        private final String f22572a;

        /* renamed from: b */
        private final String f22573b;

        /* renamed from: c */
        private final boolean f22574c = Log.isLoggable("SearchAuth", 3);

        protected C6684b(AbstractC4489g abstractC4489g, String str) {
            super(C9000a.f28632b, abstractC4489g);
            this.f22573b = str;
            this.f22572a = abstractC4489g.mo17372b().getPackageName();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.android.gms.internal.ahn
        /* renamed from: a */
        public Status mo7807b(Status status) {
            if (this.f22574c) {
                String valueOf = String.valueOf(status.m24021c());
                Log.d("SearchAuth", valueOf.length() != 0 ? "ClearTokenImpl received failure: ".concat(valueOf) : new String("ClearTokenImpl received failure: "));
            }
            return status;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.android.gms.internal.ahl.AbstractC6343a
        /* renamed from: a  reason: avoid collision after fix types in other method */
        public void mo7809a(aoh aohVar) {
            if (this.f22574c) {
                Log.d("SearchAuth", "ClearTokenImpl started");
            }
            ((aog) aohVar.G()).mo16516b(new AbstractBinderC6683a() { // from class: com.google.android.gms.internal.aoi.b.1
                @Override // com.google.android.gms.internal.aoi.AbstractBinderC6683a, com.google.android.gms.internal.aof
                /* renamed from: a */
                public void mo16511a(Status status) {
                    if (C6684b.this.f22574c) {
                        Log.d("SearchAuth", "ClearTokenImpl success");
                    }
                    C6684b.this.b((C6684b) status);
                }
            }, this.f22572a, this.f22573b);
        }
    }

    /* renamed from: com.google.android.gms.internal.aoi$c */
    /* loaded from: classes2.dex */
    static class C6686c extends ahl.AbstractC6343a<AbstractC9003b.AbstractC9004a, aoh> {

        /* renamed from: a */
        private final String f22576a;

        /* renamed from: b */
        private final String f22577b;

        /* renamed from: c */
        private final boolean f22578c = Log.isLoggable("SearchAuth", 3);

        protected C6686c(AbstractC4489g abstractC4489g, String str) {
            super(C9000a.f28632b, abstractC4489g);
            this.f22576a = str;
            this.f22577b = abstractC4489g.mo17372b().getPackageName();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.android.gms.internal.ahn
        /* renamed from: a */
        public AbstractC9003b.AbstractC9004a mo7807b(Status status) {
            if (this.f22578c) {
                String valueOf = String.valueOf(status.m24021c());
                Log.d("SearchAuth", valueOf.length() != 0 ? "GetGoogleNowAuthImpl received failure: ".concat(valueOf) : new String("GetGoogleNowAuthImpl received failure: "));
            }
            return new C6688d(status, null);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.android.gms.internal.ahl.AbstractC6343a
        /* renamed from: a  reason: avoid collision after fix types in other method */
        public void mo7809a(aoh aohVar) {
            if (this.f22578c) {
                Log.d("SearchAuth", "GetGoogleNowAuthImpl started");
            }
            ((aog) aohVar.G()).mo16517a(new AbstractBinderC6683a() { // from class: com.google.android.gms.internal.aoi.c.1
                @Override // com.google.android.gms.internal.aoi.AbstractBinderC6683a, com.google.android.gms.internal.aof
                /* renamed from: a */
                public void mo16507a(Status status, GoogleNowAuthState googleNowAuthState) {
                    if (C6686c.this.f22578c) {
                        Log.d("SearchAuth", "GetGoogleNowAuthImpl success");
                    }
                    C6686c.this.b((C6686c) new C6688d(status, googleNowAuthState));
                }
            }, this.f22577b, this.f22576a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.gms.internal.aoi$d */
    /* loaded from: classes2.dex */
    public static class C6688d implements AbstractC9003b.AbstractC9004a {

        /* renamed from: a */
        private final Status f22580a;

        /* renamed from: b */
        private final GoogleNowAuthState f22581b;

        C6688d(Status status, GoogleNowAuthState googleNowAuthState) {
            this.f22580a = status;
            this.f22581b = googleNowAuthState;
        }

        @Override // com.google.android.gms.common.api.AbstractC4502m
        /* renamed from: a */
        public Status mo7645a() {
            return this.f22580a;
        }

        @Override // com.google.android.gms.search.AbstractC9003b.AbstractC9004a
        /* renamed from: b */
        public GoogleNowAuthState mo9409b() {
            return this.f22581b;
        }
    }

    @Override // com.google.android.gms.search.AbstractC9003b
    /* renamed from: a */
    public AbstractC4494i<AbstractC9003b.AbstractC9004a> mo9411a(AbstractC4489g abstractC4489g, String str) {
        return abstractC4489g.mo17255a((AbstractC4489g) new C6686c(abstractC4489g, str));
    }

    @Override // com.google.android.gms.search.AbstractC9003b
    /* renamed from: b */
    public AbstractC4494i<Status> mo9410b(AbstractC4489g abstractC4489g, String str) {
        return abstractC4489g.mo17255a((AbstractC4489g) new C6684b(abstractC4489g, str));
    }
}
