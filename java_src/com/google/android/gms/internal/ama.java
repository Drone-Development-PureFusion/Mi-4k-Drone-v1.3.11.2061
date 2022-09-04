package com.google.android.gms.internal;

import android.app.PendingIntent;
import com.google.android.gms.common.api.AbstractC4489g;
import com.google.android.gms.common.api.AbstractC4494i;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.C4588d;
import com.google.android.gms.fitness.AbstractC5176i;
import com.google.android.gms.fitness.data.Session;
import com.google.android.gms.fitness.request.SessionInsertRequest;
import com.google.android.gms.fitness.request.SessionReadRequest;
import com.google.android.gms.fitness.request.SessionRegistrationRequest;
import com.google.android.gms.fitness.request.SessionStartRequest;
import com.google.android.gms.fitness.request.SessionStopRequest;
import com.google.android.gms.fitness.request.SessionUnregistrationRequest;
import com.google.android.gms.fitness.result.SessionReadResult;
import com.google.android.gms.fitness.result.SessionStopResult;
import com.google.android.gms.internal.ahl;
import com.google.android.gms.internal.akv;
import com.google.android.gms.internal.alo;
import com.google.android.gms.internal.alp;
import java.util.concurrent.TimeUnit;
/* loaded from: classes2.dex */
public class ama implements AbstractC5176i {

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.android.gms.internal.ama$a */
    /* loaded from: classes2.dex */
    public static class BinderC6556a extends alo.AbstractBinderC6508a {

        /* renamed from: a */
        private final ahl.AbstractC6344b<SessionReadResult> f22254a;

        private BinderC6556a(ahl.AbstractC6344b<SessionReadResult> abstractC6344b) {
            this.f22254a = abstractC6344b;
        }

        @Override // com.google.android.gms.internal.alo
        /* renamed from: a */
        public void mo16846a(SessionReadResult sessionReadResult) {
            this.f22254a.mo7413a(sessionReadResult);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.android.gms.internal.ama$b */
    /* loaded from: classes2.dex */
    public static class BinderC6557b extends alp.AbstractBinderC6510a {

        /* renamed from: a */
        private final ahl.AbstractC6344b<SessionStopResult> f22255a;

        private BinderC6557b(ahl.AbstractC6344b<SessionStopResult> abstractC6344b) {
            this.f22255a = abstractC6344b;
        }

        @Override // com.google.android.gms.internal.alp
        /* renamed from: a */
        public void mo16845a(SessionStopResult sessionStopResult) {
            this.f22255a.mo7413a(sessionStopResult);
        }
    }

    /* renamed from: a */
    private AbstractC4494i<SessionStopResult> m16856a(AbstractC4489g abstractC4489g, final String str, final String str2) {
        return abstractC4489g.mo17253b((AbstractC4489g) new akv.AbstractC6469a<SessionStopResult>(abstractC4489g) { // from class: com.google.android.gms.internal.ama.2
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.android.gms.internal.ahn
            /* renamed from: a */
            public SessionStopResult mo7807b(Status status) {
                return SessionStopResult.m20912a(status);
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.android.gms.internal.ahl.AbstractC6343a
            /* renamed from: a  reason: avoid collision after fix types in other method */
            public void mo7809a(akv akvVar) {
                ((alk) akvVar.G()).mo16941a(new SessionStopRequest(str, str2, new BinderC6557b(this)));
            }
        });
    }

    @Override // com.google.android.gms.fitness.AbstractC5176i
    /* renamed from: a */
    public AbstractC4494i<Status> mo16862a(AbstractC4489g abstractC4489g, PendingIntent pendingIntent) {
        return m16861a(abstractC4489g, pendingIntent, 0);
    }

    /* renamed from: a */
    public AbstractC4494i<Status> m16861a(AbstractC4489g abstractC4489g, final PendingIntent pendingIntent, final int i) {
        return abstractC4489g.mo17253b((AbstractC4489g) new akv.AbstractC6471c(abstractC4489g) { // from class: com.google.android.gms.internal.ama.5
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.android.gms.internal.ahl.AbstractC6343a
            /* renamed from: a  reason: avoid collision after fix types in other method */
            public void mo7809a(akv akvVar) {
                ((alk) akvVar.G()).mo16943a(new SessionRegistrationRequest(pendingIntent, new amb(this), i));
            }
        });
    }

    @Override // com.google.android.gms.fitness.AbstractC5176i
    /* renamed from: a */
    public AbstractC4494i<Status> mo16860a(AbstractC4489g abstractC4489g, final Session session) {
        C4588d.m23626a(session, "Session cannot be null");
        C4588d.m23618b(session.m21568b(TimeUnit.MILLISECONDS) == 0, "Cannot start a session which has already ended");
        return abstractC4489g.mo17253b((AbstractC4489g) new akv.AbstractC6471c(abstractC4489g) { // from class: com.google.android.gms.internal.ama.1
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.android.gms.internal.ahl.AbstractC6343a
            /* renamed from: a  reason: avoid collision after fix types in other method */
            public void mo7809a(akv akvVar) {
                ((alk) akvVar.G()).mo16942a(new SessionStartRequest(session, new amb(this)));
            }
        });
    }

    @Override // com.google.android.gms.fitness.AbstractC5176i
    /* renamed from: a */
    public AbstractC4494i<Status> mo16859a(AbstractC4489g abstractC4489g, final SessionInsertRequest sessionInsertRequest) {
        return abstractC4489g.mo17255a((AbstractC4489g) new akv.AbstractC6471c(abstractC4489g) { // from class: com.google.android.gms.internal.ama.3
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.android.gms.internal.ahl.AbstractC6343a
            /* renamed from: a  reason: avoid collision after fix types in other method */
            public void mo7809a(akv akvVar) {
                ((alk) akvVar.G()).mo16945a(new SessionInsertRequest(sessionInsertRequest, new amb(this)));
            }
        });
    }

    @Override // com.google.android.gms.fitness.AbstractC5176i
    /* renamed from: a */
    public AbstractC4494i<SessionReadResult> mo16858a(AbstractC4489g abstractC4489g, final SessionReadRequest sessionReadRequest) {
        return abstractC4489g.mo17255a((AbstractC4489g) new akv.AbstractC6469a<SessionReadResult>(abstractC4489g) { // from class: com.google.android.gms.internal.ama.4
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.android.gms.internal.ahn
            /* renamed from: a */
            public SessionReadResult mo7807b(Status status) {
                return SessionReadResult.m20919a(status);
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.android.gms.internal.ahl.AbstractC6343a
            /* renamed from: a  reason: avoid collision after fix types in other method */
            public void mo7809a(akv akvVar) {
                ((alk) akvVar.G()).mo16944a(new SessionReadRequest(sessionReadRequest, new BinderC6556a(this)));
            }
        });
    }

    @Override // com.google.android.gms.fitness.AbstractC5176i
    /* renamed from: a */
    public AbstractC4494i<SessionStopResult> mo16857a(AbstractC4489g abstractC4489g, String str) {
        return m16856a(abstractC4489g, (String) null, str);
    }

    @Override // com.google.android.gms.fitness.AbstractC5176i
    /* renamed from: b */
    public AbstractC4494i<Status> mo16855b(AbstractC4489g abstractC4489g, final PendingIntent pendingIntent) {
        return abstractC4489g.mo17253b((AbstractC4489g) new akv.AbstractC6471c(abstractC4489g) { // from class: com.google.android.gms.internal.ama.6
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.android.gms.internal.ahl.AbstractC6343a
            /* renamed from: a  reason: avoid collision after fix types in other method */
            public void mo7809a(akv akvVar) {
                ((alk) akvVar.G()).mo16940a(new SessionUnregistrationRequest(pendingIntent, new amb(this)));
            }
        });
    }
}
