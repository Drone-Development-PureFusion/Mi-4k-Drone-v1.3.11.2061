package com.google.android.gms.wearable;

import android.annotation.SuppressLint;
import android.app.Service;
import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Binder;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.common.C4536e;
import com.google.android.gms.common.C4657m;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.util.C4702y;
import com.google.android.gms.wearable.AbstractC9441a;
import com.google.android.gms.wearable.AbstractC9453c;
import com.google.android.gms.wearable.AbstractC9458e;
import com.google.android.gms.wearable.AbstractC9630m;
import com.google.android.gms.wearable.AbstractC9636p;
import com.google.android.gms.wearable.internal.AbstractC9618x;
import com.google.android.gms.wearable.internal.AmsEntityUpdateParcelable;
import com.google.android.gms.wearable.internal.AncsNotificationParcelable;
import com.google.android.gms.wearable.internal.CapabilityInfoParcelable;
import com.google.android.gms.wearable.internal.ChannelEventParcelable;
import com.google.android.gms.wearable.internal.MessageEventParcelable;
import com.google.android.gms.wearable.internal.NodeParcelable;
import java.util.List;
/* loaded from: classes2.dex */
public abstract class WearableListenerService extends Service implements AbstractC9441a.AbstractC9444c, AbstractC9453c.AbstractC9454a, AbstractC9458e.AbstractC9460b, AbstractC9630m.AbstractC9632b, AbstractC9636p.AbstractC9639c {

    /* renamed from: e */
    public static final String f29808e = "com.google.android.gms.wearable.BIND_LISTENER";

    /* renamed from: f */
    private ComponentName f29809f;

    /* renamed from: g */
    private HandlerC9430b f29810g;

    /* renamed from: h */
    private IBinder f29811h;

    /* renamed from: i */
    private Intent f29812i;

    /* renamed from: j */
    private final Object f29813j = new Object();

    /* renamed from: k */
    private boolean f29814k;

    /* renamed from: com.google.android.gms.wearable.WearableListenerService$a */
    /* loaded from: classes2.dex */
    private class ServiceConnectionC9429a implements ServiceConnection {
        private ServiceConnectionC9429a() {
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.android.gms.wearable.WearableListenerService$b */
    /* loaded from: classes2.dex */
    public final class HandlerC9430b extends Handler {

        /* renamed from: b */
        private boolean f29817b;

        /* renamed from: c */
        private ServiceConnectionC9429a f29818c;

        HandlerC9430b(Looper looper) {
            super(looper);
            this.f29818c = new ServiceConnectionC9429a();
        }

        @Override // android.os.Handler
        @SuppressLint({"UntrackedBindService"})
        public void dispatchMessage(Message message) {
            if (!this.f29817b) {
                String valueOf = String.valueOf(WearableListenerService.this.f29809f);
                Log.v("WearableLS", new StringBuilder(String.valueOf(valueOf).length() + 13).append("bindService: ").append(valueOf).toString());
                WearableListenerService.this.bindService(WearableListenerService.this.f29812i, this.f29818c, 1);
                this.f29817b = true;
            }
            try {
                super.dispatchMessage(message);
            } finally {
                if (!hasMessages(0)) {
                    String valueOf2 = String.valueOf(WearableListenerService.this.f29809f);
                    Log.v("WearableLS", new StringBuilder(String.valueOf(valueOf2).length() + 15).append("unbindService: ").append(valueOf2).toString());
                    try {
                        WearableListenerService.this.unbindService(this.f29818c);
                    } catch (RuntimeException e) {
                        Log.e("WearableLS", "Exception when unbinding from local service", e);
                    }
                    this.f29817b = false;
                }
            }
        }
    }

    /* renamed from: com.google.android.gms.wearable.WearableListenerService$c */
    /* loaded from: classes2.dex */
    private final class BinderC9431c extends AbstractC9618x.AbstractBinderC9619a {

        /* renamed from: b */
        private volatile int f29820b;

        private BinderC9431c() {
            this.f29820b = -1;
        }

        /* renamed from: a */
        private void m8102a() {
            int callingUid = Binder.getCallingUid();
            if (callingUid == this.f29820b) {
                return;
            }
            if (C4536e.a(WearableListenerService.this, callingUid, "com.google.android.wearable.app.cn")) {
                if (!C4657m.m23326a(WearableListenerService.this).m23322a(WearableListenerService.this.getPackageManager(), "com.google.android.wearable.app.cn")) {
                    throw new SecurityException("Caller is not Android Wear.");
                }
                this.f29820b = callingUid;
            } else if (!C4702y.m23090a(WearableListenerService.this, callingUid)) {
                throw new SecurityException("Caller is not GooglePlayServices");
            } else {
                this.f29820b = callingUid;
            }
        }

        /* renamed from: a */
        private boolean m8101a(Runnable runnable, String str, Object obj) {
            if (Log.isLoggable("WearableLS", 3)) {
                Log.d("WearableLS", String.format("%s: %s %s", str, WearableListenerService.this.f29809f.toString(), obj));
            }
            m8102a();
            synchronized (WearableListenerService.this.f29813j) {
                if (WearableListenerService.this.f29814k) {
                    return false;
                }
                WearableListenerService.this.f29810g.post(runnable);
                return true;
            }
        }

        @Override // com.google.android.gms.wearable.internal.AbstractC9618x
        /* renamed from: a */
        public void mo7707a(final DataHolder dataHolder) {
            Runnable runnable = new Runnable() { // from class: com.google.android.gms.wearable.WearableListenerService.c.1
                @Override // java.lang.Runnable
                public void run() {
                    C9465g c9465g = new C9465g(dataHolder);
                    try {
                        WearableListenerService.this.mo8095a(c9465g);
                    } finally {
                        c9465g.b();
                    }
                }
            };
            try {
                String valueOf = String.valueOf(dataHolder);
                if (m8101a(runnable, "onDataItemChanged", new StringBuilder(String.valueOf(valueOf).length() + 18).append(valueOf).append(", rows=").append(dataHolder.m23879g()).toString())) {
                }
            } finally {
                dataHolder.close();
            }
        }

        @Override // com.google.android.gms.wearable.internal.AbstractC9618x
        /* renamed from: a */
        public void mo7706a(final AmsEntityUpdateParcelable amsEntityUpdateParcelable) {
            m8101a(new Runnable() { // from class: com.google.android.gms.wearable.WearableListenerService.c.8
                @Override // java.lang.Runnable
                public void run() {
                    WearableListenerService.this.m8109a(amsEntityUpdateParcelable);
                }
            }, "onEntityUpdate", amsEntityUpdateParcelable);
        }

        @Override // com.google.android.gms.wearable.internal.AbstractC9618x
        /* renamed from: a */
        public void mo7705a(final AncsNotificationParcelable ancsNotificationParcelable) {
            m8101a(new Runnable() { // from class: com.google.android.gms.wearable.WearableListenerService.c.7
                @Override // java.lang.Runnable
                public void run() {
                    WearableListenerService.this.m8108a(ancsNotificationParcelable);
                }
            }, "onNotificationReceived", ancsNotificationParcelable);
        }

        @Override // com.google.android.gms.wearable.internal.AbstractC9618x
        /* renamed from: a */
        public void mo7704a(final CapabilityInfoParcelable capabilityInfoParcelable) {
            m8101a(new Runnable() { // from class: com.google.android.gms.wearable.WearableListenerService.c.6
                @Override // java.lang.Runnable
                public void run() {
                    WearableListenerService.this.mo7884a(capabilityInfoParcelable);
                }
            }, "onConnectedCapabilityChanged", capabilityInfoParcelable);
        }

        @Override // com.google.android.gms.wearable.internal.AbstractC9618x
        /* renamed from: a */
        public void mo7703a(final ChannelEventParcelable channelEventParcelable) {
            m8101a(new Runnable() { // from class: com.google.android.gms.wearable.WearableListenerService.c.9
                @Override // java.lang.Runnable
                public void run() {
                    channelEventParcelable.m8074a(WearableListenerService.this);
                }
            }, "onChannelEvent", channelEventParcelable);
        }

        @Override // com.google.android.gms.wearable.internal.AbstractC9618x
        /* renamed from: a */
        public void mo7702a(final MessageEventParcelable messageEventParcelable) {
            m8101a(new Runnable() { // from class: com.google.android.gms.wearable.WearableListenerService.c.2
                @Override // java.lang.Runnable
                public void run() {
                    WearableListenerService.this.mo7574a(messageEventParcelable);
                }
            }, "onMessageReceived", messageEventParcelable);
        }

        @Override // com.google.android.gms.wearable.internal.AbstractC9618x
        /* renamed from: a */
        public void mo7701a(final NodeParcelable nodeParcelable) {
            m8101a(new Runnable() { // from class: com.google.android.gms.wearable.WearableListenerService.c.3
                @Override // java.lang.Runnable
                public void run() {
                    WearableListenerService.this.mo7559a(nodeParcelable);
                }
            }, "onPeerConnected", nodeParcelable);
        }

        @Override // com.google.android.gms.wearable.internal.AbstractC9618x
        /* renamed from: a */
        public void mo7700a(final List<NodeParcelable> list) {
            m8101a(new Runnable() { // from class: com.google.android.gms.wearable.WearableListenerService.c.5
                @Override // java.lang.Runnable
                public void run() {
                    WearableListenerService.this.m8107a(list);
                }
            }, "onConnectedNodes", list);
        }

        @Override // com.google.android.gms.wearable.internal.AbstractC9618x
        /* renamed from: b */
        public void mo7699b(final NodeParcelable nodeParcelable) {
            m8101a(new Runnable() { // from class: com.google.android.gms.wearable.WearableListenerService.c.4
                @Override // java.lang.Runnable
                public void run() {
                    WearableListenerService.this.mo7558b(nodeParcelable);
                }
            }, "onPeerDisconnected", nodeParcelable);
        }
    }

    @Override // com.google.android.gms.wearable.AbstractC9453c.AbstractC9454a
    /* renamed from: a */
    public void mo7994a(Channel channel) {
    }

    @Override // com.google.android.gms.wearable.AbstractC9453c.AbstractC9454a
    /* renamed from: a */
    public void mo7993a(Channel channel, int i, int i2) {
    }

    @Override // com.google.android.gms.wearable.AbstractC9441a.AbstractC9444c
    /* renamed from: a */
    public void mo7884a(AbstractC9452b abstractC9452b) {
    }

    @Override // com.google.android.gms.wearable.AbstractC9458e.AbstractC9460b
    /* renamed from: a */
    public void mo8095a(C9465g c9465g) {
    }

    @Override // com.google.android.gms.wearable.AbstractC9630m.AbstractC9632b
    /* renamed from: a */
    public void mo7574a(AbstractC9634n abstractC9634n) {
    }

    @Override // com.google.android.gms.wearable.AbstractC9636p.AbstractC9639c
    /* renamed from: a */
    public void mo7559a(AbstractC9635o abstractC9635o) {
    }

    /* renamed from: a */
    public void m8109a(AbstractC9647u abstractC9647u) {
    }

    /* renamed from: a */
    public void m8108a(AbstractC9649w abstractC9649w) {
    }

    /* renamed from: a */
    public void m8107a(List<AbstractC9635o> list) {
    }

    @Override // com.google.android.gms.wearable.AbstractC9453c.AbstractC9454a
    /* renamed from: b */
    public void mo7992b(Channel channel, int i, int i2) {
    }

    @Override // com.google.android.gms.wearable.AbstractC9636p.AbstractC9639c
    /* renamed from: b */
    public void mo7558b(AbstractC9635o abstractC9635o) {
    }

    @Override // com.google.android.gms.wearable.AbstractC9453c.AbstractC9454a
    /* renamed from: c */
    public void mo7991c(Channel channel, int i, int i2) {
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        if (f29808e.equals(intent.getAction())) {
            return this.f29811h;
        }
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        this.f29809f = new ComponentName(this, getClass().getName());
        if (Log.isLoggable("WearableLS", 3)) {
            String valueOf = String.valueOf(this.f29809f);
            Log.d("WearableLS", new StringBuilder(String.valueOf(valueOf).length() + 10).append("onCreate: ").append(valueOf).toString());
        }
        HandlerThread handlerThread = new HandlerThread("WearableListenerService");
        handlerThread.start();
        this.f29810g = new HandlerC9430b(handlerThread.getLooper());
        this.f29812i = new Intent(f29808e);
        this.f29812i.setComponent(this.f29809f);
        this.f29811h = new BinderC9431c();
    }

    @Override // android.app.Service
    public void onDestroy() {
        if (Log.isLoggable("WearableLS", 3)) {
            String valueOf = String.valueOf(this.f29809f);
            Log.d("WearableLS", new StringBuilder(String.valueOf(valueOf).length() + 11).append("onDestroy: ").append(valueOf).toString());
        }
        synchronized (this.f29813j) {
            this.f29814k = true;
            if (this.f29810g == null) {
                String valueOf2 = String.valueOf(this.f29809f);
                throw new IllegalStateException(new StringBuilder(String.valueOf(valueOf2).length() + 111).append("onDestroy: mServiceHandler not set, did you override onCreate() but forget to call super.onCreate()? component=").append(valueOf2).toString());
            }
            this.f29810g.getLooper().quit();
        }
        super.onDestroy();
    }
}
