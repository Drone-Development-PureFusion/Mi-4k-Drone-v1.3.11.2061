package com.google.android.gms.cast;

import android.annotation.TargetApi;
import android.app.Notification;
import android.app.PendingIntent;
import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Binder;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.support.annotation.NonNull;
import android.support.p001v4.app.NotificationCompat;
import android.support.p004v7.media.MediaRouteSelector;
import android.support.p004v7.media.MediaRouter;
import android.text.TextUtils;
import android.view.Display;
import com.google.android.gms.C3424R;
import com.google.android.gms.cast.C4227d;
import com.google.android.gms.cast.internal.C4440m;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.AbstractC4489g;
import com.google.android.gms.common.api.AbstractC4503n;
import com.google.android.gms.common.api.C4467a;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.C4588d;
import com.google.android.gms.drive.AbstractC4808e;
import java.util.concurrent.atomic.AtomicBoolean;
@TargetApi(19)
/* loaded from: classes2.dex */
public abstract class CastRemoteDisplayLocalService extends Service {

    /* renamed from: a */
    private static final C4440m f15802a = new C4440m("CastRemoteDisplayLocalService");

    /* renamed from: b */
    private static final int f15803b = m25190j();

    /* renamed from: c */
    private static final Object f15804c = new Object();

    /* renamed from: d */
    private static AtomicBoolean f15805d = new AtomicBoolean(false);

    /* renamed from: v */
    private static CastRemoteDisplayLocalService f15806v;

    /* renamed from: e */
    private AbstractC4489g f15807e;

    /* renamed from: f */
    private C4227d.AbstractC4231b f15808f;

    /* renamed from: g */
    private String f15809g;

    /* renamed from: h */
    private AbstractC4189a f15810h;

    /* renamed from: i */
    private C4194e f15811i;

    /* renamed from: j */
    private C4190b f15812j;

    /* renamed from: k */
    private Notification f15813k;

    /* renamed from: l */
    private boolean f15814l;

    /* renamed from: m */
    private PendingIntent f15815m;

    /* renamed from: n */
    private CastDevice f15816n;

    /* renamed from: o */
    private Display f15817o;

    /* renamed from: p */
    private Context f15818p;

    /* renamed from: q */
    private ServiceConnection f15819q;

    /* renamed from: r */
    private Handler f15820r;

    /* renamed from: s */
    private MediaRouter f15821s;

    /* renamed from: t */
    private boolean f15822t = false;

    /* renamed from: u */
    private final MediaRouter.Callback f15823u = new MediaRouter.Callback() { // from class: com.google.android.gms.cast.CastRemoteDisplayLocalService.1
        @Override // android.support.p004v7.media.MediaRouter.Callback
        public void onRouteUnselected(MediaRouter mediaRouter, MediaRouter.RouteInfo routeInfo) {
            CastRemoteDisplayLocalService.this.m25215a("onRouteUnselected");
            if (CastRemoteDisplayLocalService.this.f15816n == null) {
                CastRemoteDisplayLocalService.this.m25215a("onRouteUnselected, no device was selected");
            } else if (!CastDevice.m25243b(routeInfo.getExtras()).m25244b().equals(CastRemoteDisplayLocalService.this.f15816n.m25244b())) {
                CastRemoteDisplayLocalService.this.m25215a("onRouteUnselected, device does not match");
            } else {
                CastRemoteDisplayLocalService.m25198e();
            }
        }
    };

    /* renamed from: w */
    private final IBinder f15824w = new BinderC4193d();

    /* renamed from: com.google.android.gms.cast.CastRemoteDisplayLocalService$a */
    /* loaded from: classes2.dex */
    public interface AbstractC4189a {
        /* renamed from: a */
        void m25180a(CastRemoteDisplayLocalService castRemoteDisplayLocalService);

        /* renamed from: a */
        void m25179a(Status status);

        /* renamed from: b */
        void m25178b(CastRemoteDisplayLocalService castRemoteDisplayLocalService);
    }

    /* renamed from: com.google.android.gms.cast.CastRemoteDisplayLocalService$b */
    /* loaded from: classes2.dex */
    public static final class C4190b {

        /* renamed from: a */
        private Notification f15842a;

        /* renamed from: b */
        private PendingIntent f15843b;

        /* renamed from: c */
        private String f15844c;

        /* renamed from: d */
        private String f15845d;

        /* renamed from: com.google.android.gms.cast.CastRemoteDisplayLocalService$b$a */
        /* loaded from: classes2.dex */
        public static final class C4191a {

            /* renamed from: a */
            private C4190b f15846a = new C4190b();

            /* renamed from: a */
            public C4191a m25168a(Notification notification) {
                this.f15846a.f15842a = notification;
                return this;
            }

            /* renamed from: a */
            public C4191a m25167a(PendingIntent pendingIntent) {
                this.f15846a.f15843b = pendingIntent;
                return this;
            }

            /* renamed from: a */
            public C4191a m25166a(String str) {
                this.f15846a.f15844c = str;
                return this;
            }

            /* renamed from: a */
            public C4190b m25169a() {
                if (this.f15846a.f15842a != null) {
                    if (!TextUtils.isEmpty(this.f15846a.f15844c)) {
                        throw new IllegalArgumentException("notificationTitle requires using the default notification");
                    }
                    if (!TextUtils.isEmpty(this.f15846a.f15845d)) {
                        throw new IllegalArgumentException("notificationText requires using the default notification");
                    }
                    if (this.f15846a.f15843b != null) {
                        throw new IllegalArgumentException("notificationPendingIntent requires using the default notification");
                    }
                } else if (TextUtils.isEmpty(this.f15846a.f15844c) && TextUtils.isEmpty(this.f15846a.f15845d) && this.f15846a.f15843b == null) {
                    throw new IllegalArgumentException("At least an argument must be provided");
                }
                return this.f15846a;
            }

            /* renamed from: b */
            public C4191a m25165b(String str) {
                this.f15846a.f15845d = str;
                return this;
            }
        }

        private C4190b() {
        }

        private C4190b(C4190b c4190b) {
            this.f15842a = c4190b.f15842a;
            this.f15843b = c4190b.f15843b;
            this.f15844c = c4190b.f15844c;
            this.f15845d = c4190b.f15845d;
        }
    }

    /* renamed from: com.google.android.gms.cast.CastRemoteDisplayLocalService$c */
    /* loaded from: classes2.dex */
    public static class C4192c {
        @C4227d.AbstractC4233d

        /* renamed from: a */
        int f15847a = 2;

        /* renamed from: a */
        public int m25164a() {
            return this.f15847a;
        }

        /* renamed from: a */
        public void m25163a(@C4227d.AbstractC4233d int i) {
            this.f15847a = i;
        }
    }

    /* renamed from: com.google.android.gms.cast.CastRemoteDisplayLocalService$d */
    /* loaded from: classes2.dex */
    private class BinderC4193d extends Binder {
        private BinderC4193d() {
        }

        /* renamed from: a */
        CastRemoteDisplayLocalService m25162a() {
            return CastRemoteDisplayLocalService.this;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.android.gms.cast.CastRemoteDisplayLocalService$e */
    /* loaded from: classes2.dex */
    public static final class C4194e extends BroadcastReceiver {
        private C4194e() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent.getAction().equals("com.google.android.gms.cast.remote_display.ACTION_NOTIFICATION_DISCONNECT")) {
                CastRemoteDisplayLocalService.f15802a.m24160b("disconnecting", new Object[0]);
                CastRemoteDisplayLocalService.m25198e();
            }
        }
    }

    /* renamed from: a */
    private AbstractC4489g m25225a(CastDevice castDevice, C4192c c4192c) {
        C4227d.C4229a.C4230a c4230a = new C4227d.C4229a.C4230a(castDevice, this.f15808f);
        if (c4192c != null) {
            c4230a.m24916a(c4192c.f15847a);
        }
        return new AbstractC4489g.C4490a(this, new AbstractC4489g.AbstractC4491b() { // from class: com.google.android.gms.cast.CastRemoteDisplayLocalService.2
            @Override // com.google.android.gms.common.api.AbstractC4489g.AbstractC4491b
            /* renamed from: a */
            public void mo17285a(int i) {
                CastRemoteDisplayLocalService.f15802a.m24155d(String.format("[Instance: %s] ConnectionSuspended %d", this, Integer.valueOf(i)), new Object[0]);
            }

            @Override // com.google.android.gms.common.api.AbstractC4489g.AbstractC4491b
            /* renamed from: a */
            public void mo17281a(Bundle bundle) {
                CastRemoteDisplayLocalService.this.m25215a("onConnected");
                CastRemoteDisplayLocalService.this.m25188l();
            }
        }, new AbstractC4489g.AbstractC4492c() { // from class: com.google.android.gms.cast.CastRemoteDisplayLocalService.3
            @Override // com.google.android.gms.common.api.AbstractC4489g.AbstractC4492c
            /* renamed from: a */
            public void mo17280a(ConnectionResult connectionResult) {
                CastRemoteDisplayLocalService castRemoteDisplayLocalService = CastRemoteDisplayLocalService.this;
                String valueOf = String.valueOf(connectionResult);
                castRemoteDisplayLocalService.m25206b(new StringBuilder(String.valueOf(valueOf).length() + 19).append("Connection failed: ").append(valueOf).toString());
                CastRemoteDisplayLocalService.this.m25186n();
            }
        }).m23967a((C4467a<C4467a<C4227d.C4229a>>) C4227d.f16090d, (C4467a<C4227d.C4229a>) c4230a.m24917a()).m23957c();
    }

    /* renamed from: a */
    protected static void m25230a() {
        f15802a.m24162a(true);
    }

    /* renamed from: a */
    private static void m25229a(Context context, Class<? extends CastRemoteDisplayLocalService> cls) {
        try {
            ServiceInfo serviceInfo = context.getPackageManager().getServiceInfo(new ComponentName(context, cls), 128);
            if (serviceInfo == null || !serviceInfo.exported) {
                return;
            }
            throw new IllegalStateException("The service must not be exported, verify the manifest configuration");
        } catch (PackageManager.NameNotFoundException e) {
            throw new IllegalStateException("Service not found, did you forget to configure it in the manifest?");
        }
    }

    /* renamed from: a */
    public static void m25228a(Context context, Class<? extends CastRemoteDisplayLocalService> cls, String str, CastDevice castDevice, C4190b c4190b, AbstractC4189a abstractC4189a) {
        m25227a(context, cls, str, castDevice, new C4192c(), c4190b, abstractC4189a);
    }

    /* renamed from: a */
    public static void m25227a(@NonNull final Context context, @NonNull Class<? extends CastRemoteDisplayLocalService> cls, @NonNull final String str, @NonNull final CastDevice castDevice, @NonNull final C4192c c4192c, @NonNull final C4190b c4190b, @NonNull final AbstractC4189a abstractC4189a) {
        f15802a.m24160b("Starting Service", new Object[0]);
        synchronized (f15804c) {
            if (f15806v != null) {
                f15802a.m24155d("An existing service had not been stopped before starting one", new Object[0]);
                m25199d(true);
            }
        }
        m25229a(context, cls);
        C4588d.m23626a(context, "activityContext is required.");
        C4588d.m23626a(cls, "serviceClass is required.");
        C4588d.m23626a(str, (Object) "applicationId is required.");
        C4588d.m23626a(castDevice, "device is required.");
        C4588d.m23626a(c4192c, "options is required.");
        C4588d.m23626a(c4190b, "notificationSettings is required.");
        C4588d.m23626a(abstractC4189a, "callbacks is required.");
        if (c4190b.f15842a == null && c4190b.f15843b == null) {
            throw new IllegalArgumentException("notificationSettings: Either the notification or the notificationPendingIntent must be provided");
        }
        if (f15805d.getAndSet(true)) {
            f15802a.m24154e("Service is already being started, startService has been called twice", new Object[0]);
            return;
        }
        Intent intent = new Intent(context, cls);
        context.startService(intent);
        context.bindService(intent, new ServiceConnection() { // from class: com.google.android.gms.cast.CastRemoteDisplayLocalService.5
            @Override // android.content.ServiceConnection
            public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
                CastRemoteDisplayLocalService m25162a = ((BinderC4193d) iBinder).m25162a();
                if (m25162a == null || !m25162a.m25214a(str, castDevice, c4192c, c4190b, context, this, abstractC4189a)) {
                    CastRemoteDisplayLocalService.f15802a.m24154e("Connected but unable to get the service instance", new Object[0]);
                    abstractC4189a.m25179a(new Status(C4235f.f16115q));
                    CastRemoteDisplayLocalService.f15805d.set(false);
                    try {
                        context.unbindService(this);
                    } catch (IllegalArgumentException e) {
                        CastRemoteDisplayLocalService.f15802a.m24160b("No need to unbind service, already unbound", new Object[0]);
                    }
                }
            }

            @Override // android.content.ServiceConnection
            public void onServiceDisconnected(ComponentName componentName) {
                CastRemoteDisplayLocalService.f15802a.m24160b("onServiceDisconnected", new Object[0]);
                abstractC4189a.m25179a(new Status(C4235f.f16116r, "Service Disconnected"));
                CastRemoteDisplayLocalService.f15805d.set(false);
                try {
                    context.unbindService(this);
                } catch (IllegalArgumentException e) {
                    CastRemoteDisplayLocalService.f15802a.m24160b("No need to unbind service, already unbound", new Object[0]);
                }
            }
        }, 64);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m25215a(String str) {
        f15802a.m24160b("[Instance: %s] %s", this, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public boolean m25214a(String str, CastDevice castDevice, C4192c c4192c, C4190b c4190b, Context context, ServiceConnection serviceConnection, AbstractC4189a abstractC4189a) {
        m25215a("startRemoteDisplaySession");
        C4588d.m23620b("Starting the Cast Remote Display must be done on the main thread");
        synchronized (f15804c) {
            if (f15806v != null) {
                f15802a.m24155d("An existing service had not been stopped before starting one", new Object[0]);
                return false;
            }
            f15806v = this;
            this.f15810h = abstractC4189a;
            this.f15809g = str;
            this.f15816n = castDevice;
            this.f15818p = context;
            this.f15819q = serviceConnection;
            this.f15821s = MediaRouter.getInstance(getApplicationContext());
            MediaRouteSelector build = new MediaRouteSelector.Builder().addControlCategory(C4225b.m24921b(this.f15809g)).build();
            m25215a("addMediaRouterCallback");
            this.f15821s.addCallback(build, this.f15823u, 4);
            this.f15808f = new C4227d.AbstractC4231b() { // from class: com.google.android.gms.cast.CastRemoteDisplayLocalService.8
                @Override // com.google.android.gms.cast.C4227d.AbstractC4231b
                /* renamed from: a */
                public void mo24915a(Status status) {
                    CastRemoteDisplayLocalService.f15802a.m24160b(String.format("Cast screen has ended: %d", Integer.valueOf(status.m24015i())), new Object[0]);
                    CastRemoteDisplayLocalService.m25199d(false);
                }
            };
            this.f15813k = c4190b.f15842a;
            this.f15811i = new C4194e();
            registerReceiver(this.f15811i, new IntentFilter("com.google.android.gms.cast.remote_display.ACTION_NOTIFICATION_DISCONNECT"));
            this.f15812j = new C4190b(c4190b);
            if (this.f15812j.f15842a == null) {
                this.f15814l = true;
                this.f15813k = m25196e(false);
            } else {
                this.f15814l = false;
                this.f15813k = this.f15812j.f15842a;
            }
            startForeground(f15803b, this.f15813k);
            this.f15807e = m25225a(castDevice, c4192c);
            this.f15807e.mo17358e();
            if (this.f15810h != null) {
                this.f15810h.m25180a(this);
            }
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public void m25211b(Display display) {
        this.f15817o = display;
        if (this.f15814l) {
            this.f15813k = m25196e(true);
            startForeground(f15803b, this.f15813k);
        }
        if (this.f15810h != null) {
            this.f15810h.m25178b(this);
            this.f15810h = null;
        }
        m25226a(this.f15817o);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public void m25210b(C4190b c4190b) {
        C4588d.m23620b("updateNotificationSettingsInternal must be called on the main thread");
        if (this.f15812j == null) {
            throw new IllegalStateException("No current notification settings to update");
        }
        if (!this.f15814l) {
            C4588d.m23626a(c4190b.f15842a, "notification is required.");
            this.f15813k = c4190b.f15842a;
            this.f15812j.f15842a = this.f15813k;
        } else if (c4190b.f15842a != null) {
            throw new IllegalStateException("Current mode is default notification, notification attribute must not be provided");
        } else {
            if (c4190b.f15843b != null) {
                this.f15812j.f15843b = c4190b.f15843b;
            }
            if (!TextUtils.isEmpty(c4190b.f15844c)) {
                this.f15812j.f15844c = c4190b.f15844c;
            }
            if (!TextUtils.isEmpty(c4190b.f15845d)) {
                this.f15812j.f15845d = c4190b.f15845d;
            }
            this.f15813k = m25196e(true);
        }
        startForeground(f15803b, this.f15813k);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public void m25206b(String str) {
        f15802a.m24154e("[Instance: %s] %s", this, str);
    }

    /* renamed from: b */
    private void m25205b(final boolean z) {
        if (this.f15820r != null) {
            if (Looper.myLooper() != Looper.getMainLooper()) {
                this.f15820r.post(new Runnable() { // from class: com.google.android.gms.cast.CastRemoteDisplayLocalService.6
                    @Override // java.lang.Runnable
                    public void run() {
                        CastRemoteDisplayLocalService.this.m25202c(z);
                    }
                });
            } else {
                m25202c(z);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public void m25202c(boolean z) {
        m25215a("Stopping Service");
        C4588d.m23620b("stopServiceInstanceInternal must be called on the main thread");
        if (!z && this.f15821s != null) {
            m25215a("Setting default route");
            this.f15821s.selectRoute(this.f15821s.getDefaultRoute());
        }
        if (this.f15811i != null) {
            m25215a("Unregistering notification receiver");
            unregisterReceiver(this.f15811i);
        }
        m25185o();
        m25184p();
        m25189k();
        if (this.f15807e != null) {
            this.f15807e.mo17356g();
            this.f15807e = null;
        }
        if (this.f15818p != null && this.f15819q != null) {
            try {
                this.f15818p.unbindService(this.f15819q);
            } catch (IllegalArgumentException e) {
                m25215a("No need to unbind service, already unbound");
            }
            this.f15819q = null;
            this.f15818p = null;
        }
        this.f15809g = null;
        this.f15807e = null;
        this.f15813k = null;
        this.f15817o = null;
    }

    /* renamed from: d */
    public static CastRemoteDisplayLocalService m25201d() {
        CastRemoteDisplayLocalService castRemoteDisplayLocalService;
        synchronized (f15804c) {
            castRemoteDisplayLocalService = f15806v;
        }
        return castRemoteDisplayLocalService;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public static void m25199d(boolean z) {
        f15802a.m24160b("Stopping Service", new Object[0]);
        f15805d.set(false);
        synchronized (f15804c) {
            if (f15806v == null) {
                f15802a.m24154e("Service is already being stopped", new Object[0]);
                return;
            }
            CastRemoteDisplayLocalService castRemoteDisplayLocalService = f15806v;
            f15806v = null;
            castRemoteDisplayLocalService.m25205b(z);
        }
    }

    /* renamed from: e */
    private Notification m25196e(boolean z) {
        int i;
        int i2;
        m25215a("createDefaultNotification");
        int i3 = getApplicationInfo().labelRes;
        String str = this.f15812j.f15844c;
        String str2 = this.f15812j.f15845d;
        if (z) {
            i = C3424R.C3427string.cast_notification_connected_message;
            i2 = C3424R.C3425drawable.cast_ic_notification_on;
        } else {
            i = C3424R.C3427string.cast_notification_connecting_message;
            i2 = C3424R.C3425drawable.cast_ic_notification_connecting;
        }
        if (TextUtils.isEmpty(str)) {
            str = getString(i3);
        }
        return new NotificationCompat.Builder(this).setContentTitle(str).setContentText(TextUtils.isEmpty(str2) ? getString(i, new Object[]{this.f15816n.m25240e()}) : str2).setContentIntent(this.f15812j.f15843b).setSmallIcon(i2).setOngoing(true).addAction(17301560, getString(C3424R.C3427string.cast_notification_disconnect), m25183q()).build();
    }

    /* renamed from: e */
    public static void m25198e() {
        m25199d(false);
    }

    /* renamed from: j */
    private static int m25190j() {
        return C3424R.C3426id.cast_notification_id;
    }

    /* renamed from: k */
    private void m25189k() {
        if (this.f15821s != null) {
            C4588d.m23620b("CastRemoteDisplayLocalService calls must be done on the main thread");
            m25215a("removeMediaRouterCallback");
            this.f15821s.removeCallback(this.f15823u);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: l */
    public void m25188l() {
        m25215a("startRemoteDisplay");
        if (this.f15807e == null || !this.f15807e.mo17353j()) {
            f15802a.m24154e("Unable to start the remote display as the API client is not ready", new Object[0]);
        } else {
            C4227d.f16091e.mo17567a(this.f15807e, this.f15809g).mo13673a(new AbstractC4503n<C4227d.AbstractC4232c>() { // from class: com.google.android.gms.cast.CastRemoteDisplayLocalService.9
                @Override // com.google.android.gms.common.api.AbstractC4503n
                /* renamed from: a  reason: avoid collision after fix types in other method */
                public void mo7161a(C4227d.AbstractC4232c abstractC4232c) {
                    if (!abstractC4232c.a().m24018f()) {
                        CastRemoteDisplayLocalService.f15802a.m24154e("Connection was not successful", new Object[0]);
                        CastRemoteDisplayLocalService.this.m25186n();
                        return;
                    }
                    CastRemoteDisplayLocalService.f15802a.m24160b("startRemoteDisplay successful", new Object[0]);
                    synchronized (CastRemoteDisplayLocalService.f15804c) {
                        if (CastRemoteDisplayLocalService.f15806v == null) {
                            CastRemoteDisplayLocalService.f15802a.m24160b("Remote Display started but session already cancelled", new Object[0]);
                            CastRemoteDisplayLocalService.this.m25186n();
                        } else {
                            Display mo17557b = abstractC4232c.mo17557b();
                            if (mo17557b != null) {
                                CastRemoteDisplayLocalService.this.m25211b(mo17557b);
                            } else {
                                CastRemoteDisplayLocalService.f15802a.m24154e("Cast Remote Display session created without display", new Object[0]);
                            }
                            CastRemoteDisplayLocalService.f15805d.set(false);
                            if (CastRemoteDisplayLocalService.this.f15818p != null && CastRemoteDisplayLocalService.this.f15819q != null) {
                                try {
                                    CastRemoteDisplayLocalService.this.f15818p.unbindService(CastRemoteDisplayLocalService.this.f15819q);
                                } catch (IllegalArgumentException e) {
                                    CastRemoteDisplayLocalService.f15802a.m24160b("No need to unbind service, already unbound", new Object[0]);
                                }
                                CastRemoteDisplayLocalService.this.f15819q = null;
                                CastRemoteDisplayLocalService.this.f15818p = null;
                            }
                        }
                    }
                }
            });
        }
    }

    /* renamed from: m */
    private void m25187m() {
        m25215a("stopRemoteDisplay");
        if (this.f15807e == null || !this.f15807e.mo17353j()) {
            f15802a.m24154e("Unable to stop the remote display as the API client is not ready", new Object[0]);
        } else {
            C4227d.f16091e.mo17568a(this.f15807e).mo13673a(new AbstractC4503n<C4227d.AbstractC4232c>() { // from class: com.google.android.gms.cast.CastRemoteDisplayLocalService.10
                @Override // com.google.android.gms.common.api.AbstractC4503n
                /* renamed from: a  reason: avoid collision after fix types in other method */
                public void mo7161a(C4227d.AbstractC4232c abstractC4232c) {
                    if (!abstractC4232c.a().m24018f()) {
                        CastRemoteDisplayLocalService.this.m25215a("Unable to stop the remote display, result unsuccessful");
                    } else {
                        CastRemoteDisplayLocalService.this.m25215a("remote display stopped");
                    }
                    CastRemoteDisplayLocalService.this.f15817o = null;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: n */
    public void m25186n() {
        if (this.f15810h != null) {
            this.f15810h.m25179a(new Status(C4235f.f16115q));
            this.f15810h = null;
        }
        m25198e();
    }

    /* renamed from: o */
    private void m25185o() {
        m25215a("stopRemoteDisplaySession");
        m25187m();
        m25204c();
    }

    /* renamed from: p */
    private void m25184p() {
        m25215a("Stopping the remote display Service");
        stopForeground(true);
        stopSelf();
    }

    /* renamed from: q */
    private PendingIntent m25183q() {
        if (this.f15815m == null) {
            Intent intent = new Intent("com.google.android.gms.cast.remote_display.ACTION_NOTIFICATION_DISCONNECT");
            intent.setPackage(this.f15818p.getPackageName());
            this.f15815m = PendingIntent.getBroadcast(this, 0, intent, AbstractC4808e.f17570a_);
        }
        return this.f15815m;
    }

    /* renamed from: a */
    public abstract void m25226a(Display display);

    /* renamed from: a */
    public void m25224a(final C4190b c4190b) {
        C4588d.m23626a(c4190b, "notificationSettings is required.");
        C4588d.m23626a(this.f15820r, "Service is not ready yet.");
        this.f15820r.post(new Runnable() { // from class: com.google.android.gms.cast.CastRemoteDisplayLocalService.7
            @Override // java.lang.Runnable
            public void run() {
                CastRemoteDisplayLocalService.this.m25210b(c4190b);
            }
        });
    }

    /* renamed from: b */
    protected Display m25212b() {
        return this.f15817o;
    }

    /* renamed from: c */
    public abstract void m25204c();

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        m25215a("onBind");
        return this.f15824w;
    }

    @Override // android.app.Service
    public void onCreate() {
        m25215a("onCreate");
        super.onCreate();
        this.f15820r = new Handler(getMainLooper());
        this.f15820r.postDelayed(new Runnable() { // from class: com.google.android.gms.cast.CastRemoteDisplayLocalService.4
            @Override // java.lang.Runnable
            public void run() {
                CastRemoteDisplayLocalService.this.m25215a(new StringBuilder(59).append("onCreate after delay. The local service been started: ").append(CastRemoteDisplayLocalService.this.f15822t).toString());
                if (!CastRemoteDisplayLocalService.this.f15822t) {
                    CastRemoteDisplayLocalService.this.m25206b("The local service has not been been started, stopping it");
                    CastRemoteDisplayLocalService.this.stopSelf();
                }
            }
        }, 100L);
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        m25215a("onStartCommand");
        this.f15822t = true;
        return 2;
    }
}
