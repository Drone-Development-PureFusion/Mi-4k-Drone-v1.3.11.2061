package com.google.android.gms.common.internal;

import android.annotation.TargetApi;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import com.google.android.gms.common.stats.C4669b;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.common.internal.z */
/* loaded from: classes2.dex */
public final class C4644z extends AbstractC4643y implements Handler.Callback {

    /* renamed from: b */
    private final Context f17149b;

    /* renamed from: c */
    private final Handler f17150c;

    /* renamed from: a */
    private final HashMap<C4645a, C4646b> f17148a = new HashMap<>();

    /* renamed from: d */
    private final C4669b f17151d = C4669b.m23204a();

    /* renamed from: e */
    private final long f17152e = 5000;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.android.gms.common.internal.z$a */
    /* loaded from: classes2.dex */
    public static final class C4645a {

        /* renamed from: a */
        private final String f17153a;

        /* renamed from: b */
        private final String f17154b;

        /* renamed from: c */
        private final ComponentName f17155c;

        public C4645a(ComponentName componentName) {
            this.f17153a = null;
            this.f17154b = null;
            this.f17155c = (ComponentName) C4588d.m23627a(componentName);
        }

        public C4645a(String str, String str2) {
            this.f17153a = C4588d.m23625a(str);
            this.f17154b = C4588d.m23625a(str2);
            this.f17155c = null;
        }

        /* renamed from: a */
        public Intent m23398a() {
            return this.f17153a != null ? new Intent(this.f17153a).setPackage(this.f17154b) : new Intent().setComponent(this.f17155c);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C4645a)) {
                return false;
            }
            C4645a c4645a = (C4645a) obj;
            return C4585c.m23634a(this.f17153a, c4645a.f17153a) && C4585c.m23634a(this.f17155c, c4645a.f17155c);
        }

        public int hashCode() {
            return C4585c.m23633a(this.f17153a, this.f17155c);
        }

        public String toString() {
            return this.f17153a == null ? this.f17155c.flattenToString() : this.f17153a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.android.gms.common.internal.z$b */
    /* loaded from: classes2.dex */
    public final class C4646b {

        /* renamed from: b */
        private final ServiceConnectionC4647a f17157b = new ServiceConnectionC4647a();

        /* renamed from: c */
        private final Set<ServiceConnection> f17158c = new HashSet();

        /* renamed from: d */
        private int f17159d = 2;

        /* renamed from: e */
        private boolean f17160e;

        /* renamed from: f */
        private IBinder f17161f;

        /* renamed from: g */
        private final C4645a f17162g;

        /* renamed from: h */
        private ComponentName f17163h;

        /* renamed from: com.google.android.gms.common.internal.z$b$a */
        /* loaded from: classes2.dex */
        public class ServiceConnectionC4647a implements ServiceConnection {
            public ServiceConnectionC4647a() {
            }

            @Override // android.content.ServiceConnection
            public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
                synchronized (C4644z.this.f17148a) {
                    C4646b.this.f17161f = iBinder;
                    C4646b.this.f17163h = componentName;
                    for (ServiceConnection serviceConnection : C4646b.this.f17158c) {
                        serviceConnection.onServiceConnected(componentName, iBinder);
                    }
                    C4646b.this.f17159d = 1;
                }
            }

            @Override // android.content.ServiceConnection
            public void onServiceDisconnected(ComponentName componentName) {
                synchronized (C4644z.this.f17148a) {
                    C4646b.this.f17161f = null;
                    C4646b.this.f17163h = componentName;
                    for (ServiceConnection serviceConnection : C4646b.this.f17158c) {
                        serviceConnection.onServiceDisconnected(componentName);
                    }
                    C4646b.this.f17159d = 2;
                }
            }
        }

        public C4646b(C4645a c4645a) {
            this.f17162g = c4645a;
        }

        /* renamed from: a */
        public void m23395a(ServiceConnection serviceConnection, String str) {
            C4644z.this.f17151d.m23199a(C4644z.this.f17149b, serviceConnection, str, this.f17162g.m23398a());
            this.f17158c.add(serviceConnection);
        }

        @TargetApi(14)
        /* renamed from: a */
        public void m23390a(String str) {
            this.f17159d = 3;
            this.f17160e = C4644z.this.f17151d.m23197a(C4644z.this.f17149b, str, this.f17162g.m23398a(), this.f17157b, 129);
            if (!this.f17160e) {
                this.f17159d = 2;
                try {
                    C4644z.this.f17151d.m23200a(C4644z.this.f17149b, this.f17157b);
                } catch (IllegalArgumentException e) {
                }
            }
        }

        /* renamed from: a */
        public boolean m23397a() {
            return this.f17160e;
        }

        /* renamed from: a */
        public boolean m23396a(ServiceConnection serviceConnection) {
            return this.f17158c.contains(serviceConnection);
        }

        /* renamed from: b */
        public int m23389b() {
            return this.f17159d;
        }

        /* renamed from: b */
        public void m23388b(ServiceConnection serviceConnection, String str) {
            C4644z.this.f17151d.m23190b(C4644z.this.f17149b, serviceConnection);
            this.f17158c.remove(serviceConnection);
        }

        /* renamed from: b */
        public void m23386b(String str) {
            C4644z.this.f17151d.m23200a(C4644z.this.f17149b, this.f17157b);
            this.f17160e = false;
            this.f17159d = 2;
        }

        /* renamed from: c */
        public boolean m23385c() {
            return this.f17158c.isEmpty();
        }

        /* renamed from: d */
        public IBinder m23384d() {
            return this.f17161f;
        }

        /* renamed from: e */
        public ComponentName m23383e() {
            return this.f17163h;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C4644z(Context context) {
        this.f17149b = context.getApplicationContext();
        this.f17150c = new Handler(context.getMainLooper(), this);
    }

    /* renamed from: a */
    private boolean m23406a(C4645a c4645a, ServiceConnection serviceConnection, String str) {
        boolean m23397a;
        C4588d.m23626a(serviceConnection, "ServiceConnection must not be null");
        synchronized (this.f17148a) {
            C4646b c4646b = this.f17148a.get(c4645a);
            if (c4646b != null) {
                this.f17150c.removeMessages(0, c4646b);
                if (!c4646b.m23396a(serviceConnection)) {
                    c4646b.m23395a(serviceConnection, str);
                    switch (c4646b.m23389b()) {
                        case 1:
                            serviceConnection.onServiceConnected(c4646b.m23383e(), c4646b.m23384d());
                            break;
                        case 2:
                            c4646b.m23390a(str);
                            break;
                    }
                } else {
                    String valueOf = String.valueOf(c4645a);
                    throw new IllegalStateException(new StringBuilder(String.valueOf(valueOf).length() + 81).append("Trying to bind a GmsServiceConnection that was already connected before.  config=").append(valueOf).toString());
                }
            } else {
                c4646b = new C4646b(c4645a);
                c4646b.m23395a(serviceConnection, str);
                c4646b.m23390a(str);
                this.f17148a.put(c4645a, c4646b);
            }
            m23397a = c4646b.m23397a();
        }
        return m23397a;
    }

    /* renamed from: b */
    private void m23402b(C4645a c4645a, ServiceConnection serviceConnection, String str) {
        C4588d.m23626a(serviceConnection, "ServiceConnection must not be null");
        synchronized (this.f17148a) {
            C4646b c4646b = this.f17148a.get(c4645a);
            if (c4646b == null) {
                String valueOf = String.valueOf(c4645a);
                throw new IllegalStateException(new StringBuilder(String.valueOf(valueOf).length() + 50).append("Nonexistent connection status for service config: ").append(valueOf).toString());
            } else if (!c4646b.m23396a(serviceConnection)) {
                String valueOf2 = String.valueOf(c4645a);
                throw new IllegalStateException(new StringBuilder(String.valueOf(valueOf2).length() + 76).append("Trying to unbind a GmsServiceConnection  that was not bound before.  config=").append(valueOf2).toString());
            } else {
                c4646b.m23388b(serviceConnection, str);
                if (c4646b.m23385c()) {
                    this.f17150c.sendMessageDelayed(this.f17150c.obtainMessage(0, c4646b), this.f17152e);
                }
            }
        }
    }

    @Override // com.google.android.gms.common.internal.AbstractC4643y
    /* renamed from: a */
    public boolean mo23407a(ComponentName componentName, ServiceConnection serviceConnection, String str) {
        return m23406a(new C4645a(componentName), serviceConnection, str);
    }

    @Override // com.google.android.gms.common.internal.AbstractC4643y
    /* renamed from: a */
    public boolean mo23404a(String str, String str2, ServiceConnection serviceConnection, String str3) {
        return m23406a(new C4645a(str, str2), serviceConnection, str3);
    }

    @Override // com.google.android.gms.common.internal.AbstractC4643y
    /* renamed from: b */
    public void mo23403b(ComponentName componentName, ServiceConnection serviceConnection, String str) {
        m23402b(new C4645a(componentName), serviceConnection, str);
    }

    @Override // com.google.android.gms.common.internal.AbstractC4643y
    /* renamed from: b */
    public void mo23400b(String str, String str2, ServiceConnection serviceConnection, String str3) {
        m23402b(new C4645a(str, str2), serviceConnection, str3);
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        switch (message.what) {
            case 0:
                C4646b c4646b = (C4646b) message.obj;
                synchronized (this.f17148a) {
                    if (c4646b.m23385c()) {
                        if (c4646b.m23397a()) {
                            c4646b.m23386b("GmsClientSupervisor");
                        }
                        this.f17148a.remove(c4646b.f17162g);
                    }
                }
                return true;
            default:
                return false;
        }
    }
}
