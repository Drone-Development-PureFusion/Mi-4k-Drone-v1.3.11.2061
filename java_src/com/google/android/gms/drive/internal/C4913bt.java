package com.google.android.gms.drive.internal;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Looper;
import android.os.Process;
import android.os.RemoteException;
import com.google.android.gms.common.api.AbstractC4489g;
import com.google.android.gms.common.api.AbstractC4494i;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.AbstractC4638w;
import com.google.android.gms.common.internal.C4588d;
import com.google.android.gms.common.internal.C4626s;
import com.google.android.gms.common.util.C4702y;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.events.AbstractC4813a;
import com.google.android.gms.drive.events.AbstractC4817e;
import com.google.android.gms.drive.events.AbstractC4826k;
import com.google.android.gms.drive.events.C4821i;
import com.google.android.gms.drive.events.DriveEventService;
import com.google.android.gms.drive.internal.AbstractC4911bs;
import com.google.android.gms.drive.internal.AbstractC4964n;
import com.google.android.gms.drive.internal.C4894br;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* renamed from: com.google.android.gms.drive.internal.bt */
/* loaded from: classes2.dex */
public class C4913bt extends AbstractC4638w<AbstractC4964n> {

    /* renamed from: a */
    final AbstractC4489g.AbstractC4491b f17877a;

    /* renamed from: i */
    private final String f17882i;

    /* renamed from: j */
    private final Bundle f17883j;

    /* renamed from: k */
    private final boolean f17884k;

    /* renamed from: l */
    private volatile DriveId f17885l;

    /* renamed from: m */
    private volatile DriveId f17886m;

    /* renamed from: n */
    private volatile boolean f17887n = false;

    /* renamed from: e */
    final Map<DriveId, Map<AbstractC4813a, BinderC4953f>> f17878e = new HashMap();

    /* renamed from: f */
    final Map<AbstractC4817e, BinderC4953f> f17879f = new HashMap();

    /* renamed from: g */
    final Map<DriveId, Map<AbstractC4826k, BinderC4953f>> f17880g = new HashMap();

    /* renamed from: h */
    final Map<DriveId, Map<AbstractC4826k, BinderC4953f>> f17881h = new HashMap();

    public C4913bt(Context context, Looper looper, C4626s c4626s, AbstractC4489g.AbstractC4491b abstractC4491b, AbstractC4489g.AbstractC4492c abstractC4492c, Bundle bundle) {
        super(context, looper, 11, c4626s, abstractC4491b, abstractC4492c);
        this.f17882i = c4626s.m23527h();
        this.f17877a = abstractC4491b;
        this.f17883j = bundle;
        Intent intent = new Intent(DriveEventService.f17600a);
        intent.setPackage(context.getPackageName());
        List<ResolveInfo> queryIntentServices = context.getPackageManager().queryIntentServices(intent, 0);
        switch (queryIntentServices.size()) {
            case 0:
                this.f17884k = false;
                return;
            case 1:
                ServiceInfo serviceInfo = queryIntentServices.get(0).serviceInfo;
                if (!serviceInfo.exported) {
                    String valueOf = String.valueOf(serviceInfo.name);
                    throw new IllegalStateException(new StringBuilder(String.valueOf(valueOf).length() + 60).append("Drive event service ").append(valueOf).append(" must be exported in AndroidManifest.xml").toString());
                } else {
                    this.f17884k = true;
                    return;
                }
            default:
                String valueOf2 = String.valueOf(intent.getAction());
                throw new IllegalStateException(new StringBuilder(String.valueOf(valueOf2).length() + 72).append("AndroidManifest.xml can only define one service that handles the ").append(valueOf2).append(" action").toString());
        }
    }

    /* renamed from: a */
    private AbstractC4494i<Status> m22443a(AbstractC4489g abstractC4489g, final int i, final DriveId driveId) {
        C4588d.m23619b(C4821i.m22651a(i, driveId));
        C4588d.m23622a(t(), "Client must be connected");
        return abstractC4489g.mo17253b((AbstractC4489g) new AbstractC4911bs.AbstractC4912a(abstractC4489g) { // from class: com.google.android.gms.drive.internal.bt.4
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.android.gms.internal.ahl.AbstractC6343a
            /* renamed from: a  reason: avoid collision after fix types in other method */
            public void mo7809a(C4913bt c4913bt) {
                c4913bt.m22433i().mo22298a(new RemoveEventListenerRequest(driveId, i), (AbstractC4970p) null, (String) null, new BinderC4864at(this));
            }
        });
    }

    /* renamed from: a */
    private AbstractC4494i<Status> m22440a(AbstractC4489g abstractC4489g, final AddEventListenerRequest addEventListenerRequest) {
        C4588d.m23619b(C4821i.m22651a(addEventListenerRequest.m22622b(), addEventListenerRequest.m22623a()));
        C4588d.m23622a(t(), "Client must be connected");
        if (!this.f17884k) {
            throw new IllegalStateException("Application must define an exported DriveEventService subclass in AndroidManifest.xml to add event subscriptions");
        }
        return abstractC4489g.mo17253b((AbstractC4489g) new AbstractC4911bs.AbstractC4912a(abstractC4489g) { // from class: com.google.android.gms.drive.internal.bt.3
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.android.gms.internal.ahl.AbstractC6343a
            /* renamed from: a  reason: avoid collision after fix types in other method */
            public void mo7809a(C4913bt c4913bt) {
                c4913bt.m22433i().mo22324a(addEventListenerRequest, (AbstractC4970p) null, (String) null, new BinderC4864at(this));
            }
        });
    }

    /* renamed from: a */
    private AbstractC4494i<Status> m22439a(AbstractC4489g abstractC4489g, final AddEventListenerRequest addEventListenerRequest, final BinderC4953f binderC4953f) {
        return abstractC4489g.mo17253b((AbstractC4489g) new AbstractC4911bs.AbstractC4912a(abstractC4489g) { // from class: com.google.android.gms.drive.internal.bt.1
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.android.gms.internal.ahl.AbstractC6343a
            /* renamed from: a  reason: avoid collision after fix types in other method */
            public void mo7809a(C4913bt c4913bt) {
                c4913bt.m22433i().mo22324a(addEventListenerRequest, binderC4953f, (String) null, new BinderC4864at(this));
            }
        });
    }

    /* renamed from: a */
    private AbstractC4494i<Status> m22438a(AbstractC4489g abstractC4489g, final RemoveEventListenerRequest removeEventListenerRequest, final BinderC4953f binderC4953f) {
        return abstractC4489g.mo17253b((AbstractC4489g) new AbstractC4911bs.AbstractC4912a(abstractC4489g) { // from class: com.google.android.gms.drive.internal.bt.2
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.android.gms.internal.ahl.AbstractC6343a
            /* renamed from: a  reason: avoid collision after fix types in other method */
            public void mo7809a(C4913bt c4913bt) {
                c4913bt.m22433i().mo22298a(removeEventListenerRequest, binderC4953f, (String) null, new BinderC4864at(this));
            }
        });
    }

    @Override // com.google.android.gms.common.internal.AbstractC4600p
    /* renamed from: H */
    public boolean mo15921H() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public AbstractC4494i<Status> m22442a(AbstractC4489g abstractC4489g, DriveId driveId) {
        return m22440a(abstractC4489g, new AddEventListenerRequest(1, driveId));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public AbstractC4494i<Status> m22441a(AbstractC4489g abstractC4489g, DriveId driveId, AbstractC4813a abstractC4813a) {
        HashMap hashMap;
        AbstractC4494i<Status> c4910j;
        C4588d.m23619b(C4821i.m22651a(1, driveId));
        C4588d.m23626a(abstractC4813a, "listener");
        C4588d.m23622a(t(), "Client must be connected");
        synchronized (this.f17878e) {
            Map<AbstractC4813a, BinderC4953f> map = this.f17878e.get(driveId);
            if (map == null) {
                HashMap hashMap2 = new HashMap();
                this.f17878e.put(driveId, hashMap2);
                hashMap = hashMap2;
            } else {
                hashMap = map;
            }
            BinderC4953f binderC4953f = hashMap.get(abstractC4813a);
            if (binderC4953f == null) {
                binderC4953f = new BinderC4953f(C(), B(), 1, abstractC4813a);
                hashMap.put(abstractC4813a, binderC4953f);
            } else if (binderC4953f.m22350b(1)) {
                c4910j = new C4894br.C4910j(abstractC4489g, Status.f16786a);
            }
            binderC4953f.m22351a(1);
            c4910j = m22439a(abstractC4489g, new AddEventListenerRequest(1, driveId), binderC4953f);
        }
        return c4910j;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public AbstractC4494i<Status> m22437a(AbstractC4489g abstractC4489g, final List<String> list) {
        boolean z = true;
        C4588d.m23619b(list != null);
        if (list.isEmpty()) {
            z = false;
        }
        C4588d.m23619b(z);
        C4588d.m23622a(t(), "Client must be connected");
        return abstractC4489g.mo17253b((AbstractC4489g) new AbstractC4911bs.AbstractC4912a(abstractC4489g) { // from class: com.google.android.gms.drive.internal.bt.5
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.android.gms.internal.ahl.AbstractC6343a
            /* renamed from: a  reason: avoid collision after fix types in other method */
            public void mo7809a(C4913bt c4913bt) {
                c4913bt.m22433i().mo22321a(new CancelPendingActionsRequest(list), new BinderC4864at(this));
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.common.internal.AbstractC4600p
    /* renamed from: a */
    public AbstractC4964n mo7440b(IBinder iBinder) {
        return AbstractC4964n.AbstractBinderC4965a.m22326a(iBinder);
    }

    @Override // com.google.android.gms.common.internal.AbstractC4600p
    /* renamed from: a */
    protected String mo7443a() {
        return "com.google.android.gms.drive.ApiService.START";
    }

    @Override // com.google.android.gms.common.internal.AbstractC4600p
    /* renamed from: a */
    protected void mo7981a(int i, IBinder iBinder, Bundle bundle, int i2) {
        if (bundle != null) {
            bundle.setClassLoader(getClass().getClassLoader());
            this.f17885l = (DriveId) bundle.getParcelable("com.google.android.gms.drive.root_id");
            this.f17886m = (DriveId) bundle.getParcelable("com.google.android.gms.drive.appdata_id");
            this.f17887n = true;
        }
        super.a(i, iBinder, bundle, i2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public AbstractC4494i<Status> m22436b(AbstractC4489g abstractC4489g, DriveId driveId) {
        return m22443a(abstractC4489g, 1, driveId);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public AbstractC4494i<Status> m22435b(AbstractC4489g abstractC4489g, DriveId driveId, AbstractC4813a abstractC4813a) {
        AbstractC4494i<Status> m22438a;
        C4588d.m23619b(C4821i.m22651a(1, driveId));
        C4588d.m23622a(t(), "Client must be connected");
        C4588d.m23626a(abstractC4813a, "listener");
        synchronized (this.f17878e) {
            Map<AbstractC4813a, BinderC4953f> map = this.f17878e.get(driveId);
            if (map == null) {
                m22438a = new C4894br.C4910j(abstractC4489g, Status.f16786a);
            } else {
                BinderC4953f remove = map.remove(abstractC4813a);
                if (remove == null) {
                    m22438a = new C4894br.C4910j(abstractC4489g, Status.f16786a);
                } else {
                    if (map.isEmpty()) {
                        this.f17878e.remove(driveId);
                    }
                    m22438a = m22438a(abstractC4489g, new RemoveEventListenerRequest(driveId, 1), remove);
                }
            }
        }
        return m22438a;
    }

    @Override // com.google.android.gms.common.internal.AbstractC4600p
    /* renamed from: b */
    protected String mo7441b() {
        return "com.google.android.gms.drive.internal.IDriveService";
    }

    @Override // com.google.android.gms.common.internal.AbstractC4600p
    /* renamed from: c */
    protected Bundle mo9367c() {
        String packageName = B().getPackageName();
        C4588d.m23627a(packageName);
        C4588d.m23623a(!J().m23529f().isEmpty());
        Bundle bundle = new Bundle();
        if (!packageName.equals(this.f17882i)) {
            bundle.putString("proxy_package_name", this.f17882i);
        }
        bundle.putAll(this.f17883j);
        return bundle;
    }

    @Override // com.google.android.gms.common.internal.AbstractC4600p, com.google.android.gms.common.api.C4467a.AbstractC4477f
    /* renamed from: f */
    public void mo9828f() {
        if (t()) {
            try {
                ((AbstractC4964n) G()).mo22310a(new DisconnectRequest());
            } catch (RemoteException e) {
            }
        }
        super.f();
        synchronized (this.f17878e) {
            this.f17878e.clear();
        }
        synchronized (this.f17879f) {
            this.f17879f.clear();
        }
        synchronized (this.f17880g) {
            this.f17880g.clear();
        }
        synchronized (this.f17881h) {
            this.f17881h.clear();
        }
    }

    /* renamed from: h */
    boolean m22434h() {
        return C4702y.m23090a(B(), Process.myUid());
    }

    /* renamed from: i */
    public AbstractC4964n m22433i() {
        return (AbstractC4964n) G();
    }

    /* renamed from: j */
    public DriveId m22432j() {
        return this.f17885l;
    }

    /* renamed from: k */
    public DriveId m22431k() {
        return this.f17886m;
    }

    /* renamed from: l */
    public boolean m22430l() {
        return this.f17887n;
    }

    /* renamed from: m */
    public boolean m22429m() {
        return this.f17884k;
    }

    @Override // com.google.android.gms.common.internal.AbstractC4600p, com.google.android.gms.common.api.C4467a.AbstractC4477f
    /* renamed from: v */
    public boolean mo9364v() {
        return !B().getPackageName().equals(this.f17882i) || !m22434h();
    }
}
