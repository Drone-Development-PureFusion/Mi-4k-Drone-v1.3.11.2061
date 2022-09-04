package com.google.android.gms.nearby.messages.internal;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Application;
import android.app.PendingIntent;
import android.app.Service;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Looper;
import android.os.RemoteException;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.p001v4.util.SimpleArrayMap;
import android.util.Log;
import com.google.android.gms.common.api.AbstractC4489g;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.AbstractC4638w;
import com.google.android.gms.common.internal.C4626s;
import com.google.android.gms.common.util.C4696s;
import com.google.android.gms.internal.ahl;
import com.google.android.gms.internal.ail;
import com.google.android.gms.nearby.messages.AbstractC8833e;
import com.google.android.gms.nearby.messages.AbstractC8902j;
import com.google.android.gms.nearby.messages.AbstractC8906l;
import com.google.android.gms.nearby.messages.AbstractC8907m;
import com.google.android.gms.nearby.messages.C8835g;
import com.google.android.gms.nearby.messages.C8903k;
import com.google.android.gms.nearby.messages.C8908n;
import com.google.android.gms.nearby.messages.internal.AbstractC8850j;
import com.google.android.gms.nearby.messages.internal.AbstractC8856l;
import com.google.android.gms.nearby.messages.internal.AbstractC8859m;
import com.google.android.gms.nearby.messages.internal.AbstractC8862n;
import com.google.android.gms.nearby.messages.internal.AbstractC8865o;
import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.nearby.messages.internal.s */
/* loaded from: classes2.dex */
public class C8871s extends AbstractC4638w<AbstractC8856l> {

    /* renamed from: a */
    private final ClientAppContext f28338a;

    /* renamed from: e */
    private final int f28339e;

    /* renamed from: f */
    private final AbstractC8883h<AbstractC8906l, BinderC8880f> f28340f = new AbstractC8883h<AbstractC8906l, BinderC8880f>() { // from class: com.google.android.gms.nearby.messages.internal.s.1
        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.android.gms.nearby.messages.internal.C8871s.AbstractC8883h
        /* renamed from: a */
        public BinderC8880f mo9810b(ail<AbstractC8906l> ailVar) {
            return new BinderC8880f(ailVar);
        }
    };

    /* renamed from: g */
    private final AbstractC8883h<AbstractC8833e, BinderC8876c> f28341g = new AbstractC8883h<AbstractC8833e, BinderC8876c>() { // from class: com.google.android.gms.nearby.messages.internal.s.2
        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.android.gms.nearby.messages.internal.C8871s.AbstractC8883h
        /* renamed from: a */
        public BinderC8876c mo9810b(ail<AbstractC8833e> ailVar) {
            return new BinderC8876c(ailVar);
        }
    };

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.android.gms.nearby.messages.internal.s$a */
    /* loaded from: classes2.dex */
    public interface AbstractC8874a<C> {
        /* renamed from: a */
        ail<C> mo9818a();
    }

    @TargetApi(14)
    /* renamed from: com.google.android.gms.nearby.messages.internal.s$b */
    /* loaded from: classes2.dex */
    private static class C8875b implements Application.ActivityLifecycleCallbacks {

        /* renamed from: a */
        private final Activity f28344a;

        /* renamed from: b */
        private final C8871s f28345b;

        private C8875b(Activity activity, C8871s c8871s) {
            this.f28344a = activity;
            this.f28345b = c8871s;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            if (activity == this.f28344a) {
                Log.v("NearbyMessagesClient", String.format("Unregistering ClientLifecycleSafetyNet's ActivityLifecycleCallbacks for %s", activity.getPackageName()));
                activity.getApplication().unregisterActivityLifecycleCallbacks(this);
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
            if (activity == this.f28344a) {
                try {
                    this.f28345b.m9829c(1);
                } catch (RemoteException e) {
                    Log.v("NearbyMessagesClient", String.format("Failed to emit ACTIVITY_STOPPED from ClientLifecycleSafetyNet for Activity %s: %s", activity.getPackageName(), e));
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.android.gms.nearby.messages.internal.s$c */
    /* loaded from: classes2.dex */
    public static class BinderC8876c extends AbstractC8850j.AbstractBinderC8851a implements AbstractC8874a<AbstractC8833e> {

        /* renamed from: a */
        private final ail<AbstractC8833e> f28346a;

        private BinderC8876c(ail<AbstractC8833e> ailVar) {
            this.f28346a = ailVar;
        }

        @Override // com.google.android.gms.nearby.messages.internal.C8871s.AbstractC8874a
        /* renamed from: a */
        public ail<AbstractC8833e> mo9818a() {
            return this.f28346a;
        }

        @Override // com.google.android.gms.nearby.messages.internal.AbstractC8850j
        /* renamed from: a */
        public void mo9825a(MessageWrapper messageWrapper) {
        }

        @Override // com.google.android.gms.nearby.messages.internal.AbstractC8850j
        /* renamed from: a */
        public void mo9824a(final List<Update> list) {
            this.f28346a.m17214a(new AbstractC8878d<AbstractC8833e>() { // from class: com.google.android.gms.nearby.messages.internal.s.c.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super();
                }

                @Override // com.google.android.gms.internal.ail.AbstractC6386c
                /* renamed from: a */
                public void mo7917a(AbstractC8833e abstractC8833e) {
                    C8884t.m9798a(list, abstractC8833e);
                }
            });
        }

        @Override // com.google.android.gms.nearby.messages.internal.AbstractC8850j
        /* renamed from: b */
        public void mo9823b(MessageWrapper messageWrapper) {
        }
    }

    /* renamed from: com.google.android.gms.nearby.messages.internal.s$d */
    /* loaded from: classes2.dex */
    private static abstract class AbstractC8878d<T> implements ail.AbstractC6386c<T> {
        private AbstractC8878d() {
        }

        @Override // com.google.android.gms.internal.ail.AbstractC6386c
        /* renamed from: a */
        public void mo7919a() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.android.gms.nearby.messages.internal.s$e */
    /* loaded from: classes2.dex */
    public static class BinderC8879e extends AbstractC8859m.AbstractBinderC8860a {

        /* renamed from: a */
        private final AbstractC8902j f28349a;

        private BinderC8879e(AbstractC8902j abstractC8902j) {
            this.f28349a = abstractC8902j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Nullable
        /* renamed from: b */
        public static BinderC8879e m9819b(@Nullable AbstractC8902j abstractC8902j) {
            if (abstractC8902j == null) {
                return null;
            }
            return new BinderC8879e(abstractC8902j);
        }

        @Override // com.google.android.gms.nearby.messages.internal.AbstractC8859m
        /* renamed from: a */
        public void mo9821a() {
            this.f28349a.m9768a();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.android.gms.nearby.messages.internal.s$f */
    /* loaded from: classes2.dex */
    public static class BinderC8880f extends AbstractC8862n.AbstractBinderC8863a implements AbstractC8874a<AbstractC8906l> {

        /* renamed from: a */
        private final ail<AbstractC8906l> f28350a;

        private BinderC8880f(ail<AbstractC8906l> ailVar) {
            this.f28350a = ailVar;
        }

        @Override // com.google.android.gms.nearby.messages.internal.C8871s.AbstractC8874a
        /* renamed from: a */
        public ail<AbstractC8906l> mo9818a() {
            return this.f28350a;
        }

        @Override // com.google.android.gms.nearby.messages.internal.AbstractC8862n
        /* renamed from: a */
        public void mo9817a(final boolean z) {
            this.f28350a.m17214a(new AbstractC8878d<AbstractC8906l>() { // from class: com.google.android.gms.nearby.messages.internal.s.f.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super();
                }

                @Override // com.google.android.gms.internal.ail.AbstractC6386c
                /* renamed from: a */
                public void mo7917a(AbstractC8906l abstractC8906l) {
                    abstractC8906l.m9762a(z);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.android.gms.nearby.messages.internal.s$g */
    /* loaded from: classes2.dex */
    public static class BinderC8882g extends AbstractC8865o.AbstractBinderC8866a {

        /* renamed from: a */
        private final AbstractC8907m f28353a;

        private BinderC8882g(AbstractC8907m abstractC8907m) {
            this.f28353a = abstractC8907m;
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Nullable
        /* renamed from: b */
        public static BinderC8882g m9813b(@Nullable AbstractC8907m abstractC8907m) {
            if (abstractC8907m == null) {
                return null;
            }
            return new BinderC8882g(abstractC8907m);
        }

        @Override // com.google.android.gms.nearby.messages.internal.AbstractC8865o
        /* renamed from: a */
        public void mo9815a() {
            this.f28353a.m9761a();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.android.gms.nearby.messages.internal.s$h */
    /* loaded from: classes2.dex */
    public static abstract class AbstractC8883h<C, W extends AbstractC8874a<C>> {

        /* renamed from: a */
        private final SimpleArrayMap<C, W> f28354a;

        private AbstractC8883h() {
            this.f28354a = new SimpleArrayMap<>(1);
        }

        /* renamed from: a */
        W m9812a(ail<C> ailVar, C c) {
            W w = this.f28354a.get(c);
            if (w != null) {
                ailVar.m17215a();
                return w;
            }
            W mo9810b = mo9810b((ail) ailVar);
            this.f28354a.put(c, mo9810b);
            return mo9810b;
        }

        @Nullable
        /* renamed from: a */
        W m9811a(C c) {
            return this.f28354a.get(c);
        }

        /* renamed from: b */
        protected abstract W mo9810b(ail<C> ailVar);

        @Nullable
        /* renamed from: b */
        W m9809b(C c) {
            W remove = this.f28354a.remove(c);
            if (remove != null) {
                remove.mo9818a().m17215a();
            }
            return remove;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @TargetApi(14)
    public C8871s(Context context, Looper looper, AbstractC4489g.AbstractC4491b abstractC4491b, AbstractC4489g.AbstractC4492c abstractC4492c, C4626s c4626s, C8835g c8835g) {
        super(context, looper, 62, c4626s, abstractC4491b, abstractC4492c);
        String m23527h = c4626s.m23527h();
        int m9843a = m9843a(context);
        if (c8835g != null) {
            this.f28338a = new ClientAppContext(m23527h, c8835g.f28235a, c8835g.f28236b, c8835g.f28238d, m9843a);
            this.f28339e = c8835g.f28237c;
        } else {
            this.f28338a = new ClientAppContext(m23527h, null, false, null, m9843a);
            this.f28339e = -1;
        }
        if (m9843a != 1 || !C4696s.m23110d()) {
            return;
        }
        Activity activity = (Activity) context;
        Log.v("NearbyMessagesClient", String.format("Registering ClientLifecycleSafetyNet's ActivityLifecycleCallbacks for %s", activity.getPackageName()));
        activity.getApplication().registerActivityLifecycleCallbacks(new C8875b(activity, this));
    }

    /* renamed from: a */
    private static int m9843a(Context context) {
        if (context instanceof Activity) {
            return 1;
        }
        if (context instanceof Application) {
            return 2;
        }
        return context instanceof Service ? 3 : 0;
    }

    /* renamed from: a */
    private static <C> ail<C> m9839a(AbstractC4489g abstractC4489g, C c, AbstractC8883h<C, ? extends AbstractC8874a<C>> abstractC8883h) {
        AbstractC8874a<C> m9811a = abstractC8883h.m9811a(c);
        return m9811a != null ? m9811a.mo9818a() : abstractC4489g.mo17373a((AbstractC4489g) c);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public ail<AbstractC8833e> m9841a(AbstractC4489g abstractC4489g, AbstractC8833e abstractC8833e) {
        return m9839a(abstractC4489g, abstractC8833e, this.f28341g);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public ail<AbstractC8906l> m9840a(AbstractC4489g abstractC4489g, AbstractC8906l abstractC8906l) {
        return m9839a(abstractC4489g, abstractC8906l, this.f28340f);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.common.internal.AbstractC4600p
    /* renamed from: a */
    public AbstractC8856l mo7440b(IBinder iBinder) {
        return AbstractC8856l.AbstractBinderC8857a.m9862a(iBinder);
    }

    @Override // com.google.android.gms.common.internal.AbstractC4600p
    @NonNull
    /* renamed from: a */
    protected String mo7443a() {
        return "com.google.android.gms.nearby.messages.service.NearbyMessagesService.START";
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m9838a(ahl.AbstractC6344b<Status> abstractC6344b) {
        ((AbstractC8856l) G()).mo9861a(new GetPermissionStatusRequest(BinderC8897v.m9781a(abstractC6344b)));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m9837a(ahl.AbstractC6344b<Status> abstractC6344b, PendingIntent pendingIntent) {
        ((AbstractC8856l) G()).mo9855a(new UnsubscribeRequest(null, BinderC8897v.m9781a(abstractC6344b), pendingIntent, 0));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m9836a(ahl.AbstractC6344b<Status> abstractC6344b, PendingIntent pendingIntent, C8908n c8908n) {
        ((AbstractC8856l) G()).mo9857a(new SubscribeRequest(null, c8908n.m9760a(), BinderC8897v.m9781a(abstractC6344b), c8908n.m9759b(), pendingIntent, 0, null, BinderC8882g.m9813b(c8908n.m9758c()), c8908n.f28390b));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m9835a(ahl.AbstractC6344b<Status> abstractC6344b, ail<AbstractC8833e> ailVar, AbstractC8833e abstractC8833e) {
        if (this.f28341g.m9811a(abstractC8833e) == null) {
            return;
        }
        ((AbstractC8856l) G()).mo9855a(new UnsubscribeRequest(this.f28341g.m9812a(ailVar, abstractC8833e), BinderC8897v.m9781a(abstractC6344b), null, 0));
        this.f28341g.m9809b((AbstractC8883h<AbstractC8833e, BinderC8876c>) abstractC8833e);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m9834a(ahl.AbstractC6344b<Status> abstractC6344b, ail<AbstractC8833e> ailVar, AbstractC8833e abstractC8833e, C8908n c8908n, @Nullable byte[] bArr) {
        ((AbstractC8856l) G()).mo9857a(new SubscribeRequest(this.f28341g.m9812a(ailVar, abstractC8833e), c8908n.m9760a(), BinderC8897v.m9781a(abstractC6344b), c8908n.m9759b(), null, 0, bArr, BinderC8882g.m9813b(c8908n.m9758c()), c8908n.f28390b));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m9833a(ahl.AbstractC6344b<Status> abstractC6344b, ail<AbstractC8906l> ailVar, AbstractC8906l abstractC8906l) {
        RegisterStatusCallbackRequest registerStatusCallbackRequest = new RegisterStatusCallbackRequest(BinderC8897v.m9781a(abstractC6344b), this.f28340f.m9812a(ailVar, abstractC8906l));
        registerStatusCallbackRequest.f28291d = true;
        ((AbstractC8856l) G()).mo9858a(registerStatusCallbackRequest);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m9832a(ahl.AbstractC6344b<Status> abstractC6344b, MessageWrapper messageWrapper) {
        ((AbstractC8856l) G()).mo9856a(new UnpublishRequest(messageWrapper, BinderC8897v.m9781a(abstractC6344b), this.f28338a));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m9831a(ahl.AbstractC6344b<Status> abstractC6344b, MessageWrapper messageWrapper, C8903k c8903k) {
        ((AbstractC8856l) G()).mo9859a(new PublishRequest(messageWrapper, c8903k.m9767a(), BinderC8897v.m9781a(abstractC6344b), BinderC8879e.m9819b(c8903k.m9766b())));
    }

    @Override // com.google.android.gms.common.internal.AbstractC4600p
    @NonNull
    /* renamed from: b */
    protected String mo7441b() {
        return "com.google.android.gms.nearby.messages.internal.INearbyMessagesService";
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public void m9830b(ahl.AbstractC6344b<Status> abstractC6344b, ail<AbstractC8906l> ailVar, AbstractC8906l abstractC8906l) {
        if (this.f28340f.m9811a(abstractC8906l) == null) {
            return;
        }
        RegisterStatusCallbackRequest registerStatusCallbackRequest = new RegisterStatusCallbackRequest(BinderC8897v.m9781a(abstractC6344b), this.f28340f.m9812a(ailVar, abstractC8906l));
        registerStatusCallbackRequest.f28291d = false;
        ((AbstractC8856l) G()).mo9858a(registerStatusCallbackRequest);
        this.f28340f.m9809b((AbstractC8883h<AbstractC8906l, BinderC8880f>) abstractC8906l);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.common.internal.AbstractC4600p
    @NonNull
    /* renamed from: c */
    public Bundle mo9367c() {
        Bundle c = super.c();
        c.putInt("NearbyPermissions", this.f28339e);
        c.putParcelable("ClientAppContext", this.f28338a);
        return c;
    }

    /* renamed from: c */
    void m9829c(int i) {
        String str;
        switch (i) {
            case 1:
                str = "ACTIVITY_STOPPED";
                break;
            case 2:
                str = "CLIENT_DISCONNECTED";
                break;
            default:
                Log.w("NearbyMessagesClient", String.format("Received unknown/unforeseen client lifecycle event %d, can't do anything with it.", Integer.valueOf(i)));
                return;
        }
        if (!t()) {
            Log.d("NearbyMessagesClient", String.format("Failed to emit client lifecycle event %s due to GmsClient being disconnected", str));
            return;
        }
        HandleClientLifecycleEventRequest handleClientLifecycleEventRequest = new HandleClientLifecycleEventRequest(i);
        Log.d("NearbyMessagesClient", String.format("Emitting client lifecycle event %s", str));
        ((AbstractC8856l) G()).mo9860a(handleClientLifecycleEventRequest);
    }

    @Override // com.google.android.gms.common.internal.AbstractC4600p, com.google.android.gms.common.api.C4467a.AbstractC4477f
    /* renamed from: f */
    public void mo9828f() {
        try {
            m9829c(2);
        } catch (RemoteException e) {
            Log.v("NearbyMessagesClient", String.format("Failed to emit CLIENT_DISCONNECTED from override of GmsClient#disconnect(): %s", e));
        }
        super.f();
    }
}
