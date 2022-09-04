package com.fimi.soul.drone.droneconnection.connection.service;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;
import android.util.Log;
import com.fimi.soul.drone.droneconnection.connection.AbstractC2228f;
import com.fimi.soul.drone.droneconnection.connection.C2229g;
import com.fimi.soul.drone.droneconnection.connection.p198a.C2203a;
import com.fimi.soul.drone.droneconnection.connection.service.MiLinkService;
import com.fimi.soul.drone.p195d.p196a.AbstractC2195b;
import com.fimi.soul.drone.p195d.p196a.C2196c;
import java.util.concurrent.atomic.AtomicReference;
/* renamed from: com.fimi.soul.drone.droneconnection.connection.service.a */
/* loaded from: classes.dex */
public class C2238a implements C2229g.AbstractC2230a {

    /* renamed from: a */
    private static final String f7056a = C2238a.class.getSimpleName();

    /* renamed from: b */
    private boolean f7057b;

    /* renamed from: c */
    private final Handler f7058c = new Handler();

    /* renamed from: d */
    private final AtomicReference<String> f7059d = new AtomicReference<>();

    /* renamed from: e */
    private final AbstractC2228f f7060e = new AbstractC2228f() { // from class: com.fimi.soul.drone.droneconnection.connection.service.a.1

        /* renamed from: b */
        private final Runnable f7068b = new Runnable() { // from class: com.fimi.soul.drone.droneconnection.connection.service.a.1.1
            @Override // java.lang.Runnable
            public void run() {
                C2238a.this.f7063h.mo32609e();
            }
        };

        /* renamed from: c */
        private final Runnable f7069c = new Runnable() { // from class: com.fimi.soul.drone.droneconnection.connection.service.a.1.2
            @Override // java.lang.Runnable
            public void run() {
                C2238a.this.f7057b = false;
                C2238a.this.f7063h.mo32608f();
                C2238a.this.m32571g();
            }
        };

        /* renamed from: d */
        private final Runnable f7070d = new Runnable() { // from class: com.fimi.soul.drone.droneconnection.connection.service.a.1.3
            @Override // java.lang.Runnable
            public void run() {
                C2238a.this.f7058c.removeCallbacks(this);
                C2238a.this.f7057b = false;
                String str = (String) C2238a.this.f7059d.get();
                if (str != null) {
                    Log.e("error", str);
                }
            }
        };

        @Override // com.fimi.soul.drone.droneconnection.connection.AbstractC2228f
        /* renamed from: a */
        public void mo32566a() {
            C2238a.this.f7058c.post(this.f7068b);
        }

        @Override // com.fimi.soul.drone.droneconnection.connection.AbstractC2228f
        /* renamed from: a */
        public void mo32565a(final AbstractC2195b abstractC2195b) {
            C2238a.this.f7058c.post(new Runnable() { // from class: com.fimi.soul.drone.droneconnection.connection.service.a.1.4
                @Override // java.lang.Runnable
                public void run() {
                    C2238a.this.f7057b = true;
                    C2238a.this.f7063h.mo32612a(abstractC2195b);
                }
            });
        }

        @Override // com.fimi.soul.drone.droneconnection.connection.AbstractC2228f
        /* renamed from: a */
        public void mo32564a(String str) {
            C2238a.this.f7059d.set(str);
            C2238a.this.f7058c.post(this.f7070d);
        }

        @Override // com.fimi.soul.drone.droneconnection.connection.AbstractC2228f
        /* renamed from: a */
        public void mo32563a(final boolean z) {
            C2238a.this.f7058c.post(new Runnable() { // from class: com.fimi.soul.drone.droneconnection.connection.service.a.1.5
                @Override // java.lang.Runnable
                public void run() {
                    C2238a.this.f7063h.mo32611a(z);
                }
            });
        }

        @Override // com.fimi.soul.drone.droneconnection.connection.AbstractC2228f
        /* renamed from: b */
        public void mo32562b() {
            C2238a.this.f7058c.post(this.f7069c);
        }

        @Override // com.fimi.soul.drone.droneconnection.connection.AbstractC2228f
        /* renamed from: b */
        public void mo32561b(final boolean z) {
            C2238a.this.f7058c.post(new Runnable() { // from class: com.fimi.soul.drone.droneconnection.connection.service.a.1.6
                @Override // java.lang.Runnable
                public void run() {
                    C2238a.this.f7057b = z;
                    C2238a.this.f7063h.mo32610b(z);
                }
            });
        }
    };

    /* renamed from: f */
    private final ServiceConnection f7061f = new ServiceConnection() { // from class: com.fimi.soul.drone.droneconnection.connection.service.a.2
        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            C2238a.this.f7064i = (MiLinkService.BinderC2237a) iBinder;
            C2238a.this.m32568j();
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            C2238a.this.m32567k();
        }
    };

    /* renamed from: g */
    private final Context f7062g;

    /* renamed from: h */
    private final C2229g.AbstractC2231b f7063h;

    /* renamed from: i */
    private MiLinkService.BinderC2237a f7064i;

    /* renamed from: j */
    private boolean f7065j;

    /* renamed from: k */
    private boolean f7066k;

    public C2238a(Context context, C2229g.AbstractC2231b abstractC2231b) {
        this.f7062g = context;
        this.f7063h = abstractC2231b;
    }

    /* renamed from: h */
    private void m32570h() {
        if (this.f7065j) {
            m32569i();
        } else {
            this.f7062g.bindService(new Intent(this.f7062g, MiLinkService.class), this.f7061f, 1);
        }
    }

    /* renamed from: i */
    private void m32569i() {
        this.f7064i.m32592b();
        this.f7064i.m32595a(f7056a, this.f7060e);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: j */
    public void m32568j() {
        this.f7065j = true;
        m32569i();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: k */
    public void m32567k() {
        this.f7057b = false;
        this.f7065j = false;
        this.f7063h.mo32608f();
    }

    @Override // com.fimi.soul.drone.droneconnection.connection.C2229g.AbstractC2230a
    /* renamed from: a */
    public void mo32587a(C2196c c2196c) {
        if (!mo32588a()) {
            return;
        }
        this.f7064i.m32597a(c2196c);
    }

    @Override // com.fimi.soul.drone.droneconnection.connection.C2229g.AbstractC2230a
    /* renamed from: a */
    public void mo32583a(boolean z) {
        this.f7064i.m32594a(z);
    }

    @Override // com.fimi.soul.drone.droneconnection.connection.C2229g.AbstractC2230a
    /* renamed from: a */
    public void mo32582a(byte[] bArr) {
        if (!mo32588a()) {
            return;
        }
        this.f7064i.m32593a(bArr);
    }

    @Override // com.fimi.soul.drone.droneconnection.connection.C2229g.AbstractC2230a
    /* renamed from: a */
    public boolean mo32588a() {
        return this.f7057b;
    }

    @Override // com.fimi.soul.drone.droneconnection.connection.C2229g.AbstractC2230a
    /* renamed from: b */
    public void mo32581b() {
        if (mo32588a()) {
            m32571g();
        } else {
            m32570h();
        }
    }

    @Override // com.fimi.soul.drone.droneconnection.connection.C2229g.AbstractC2230a
    /* renamed from: b */
    public void mo32579b(boolean z) {
        this.f7064i.m32591b(z);
    }

    @Override // com.fimi.soul.drone.droneconnection.connection.C2229g.AbstractC2230a
    /* renamed from: c */
    public void mo32578c() {
        if (mo32588a()) {
            this.f7063h.mo32609e();
        } else {
            this.f7063h.mo32608f();
        }
    }

    @Override // com.fimi.soul.drone.droneconnection.connection.C2229g.AbstractC2230a
    /* renamed from: d */
    public void mo32576d() {
        m32571g();
    }

    @Override // com.fimi.soul.drone.droneconnection.connection.C2229g.AbstractC2230a
    /* renamed from: e */
    public String mo32574e() {
        return C2203a.m32717a();
    }

    @Override // com.fimi.soul.drone.droneconnection.connection.C2229g.AbstractC2230a
    /* renamed from: f */
    public boolean mo32572f() {
        return this.f7064i.m32589d();
    }

    /* renamed from: g */
    public void m32571g() {
        if (this.f7065j) {
            if (this.f7064i.m32598a() == 2) {
                this.f7064i.m32590c();
            }
            this.f7064i.m32596a(f7056a);
            try {
                this.f7062g.unbindService(this.f7061f);
            } catch (Exception e) {
            }
            m32567k();
        }
    }
}
