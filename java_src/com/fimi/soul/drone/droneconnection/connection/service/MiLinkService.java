package com.fimi.soul.drone.droneconnection.connection.service;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.util.Log;
import com.fimi.soul.drone.droneconnection.connection.AbstractC2202a;
import com.fimi.soul.drone.droneconnection.connection.AbstractC2228f;
import com.fimi.soul.drone.droneconnection.connection.C2232h;
import com.fimi.soul.drone.droneconnection.connection.p198a.C2203a;
import com.fimi.soul.drone.p195d.p196a.C2196c;
import java.io.IOException;
import java.lang.ref.WeakReference;
/* loaded from: classes.dex */
public class MiLinkService extends Service {

    /* renamed from: a */
    private static final String f7052a = MiLinkService.class.getSimpleName();

    /* renamed from: b */
    private final BinderC2237a f7053b = new BinderC2237a(this);

    /* renamed from: c */
    private AbstractC2202a f7054c;

    /* renamed from: com.fimi.soul.drone.droneconnection.connection.service.MiLinkService$a */
    /* loaded from: classes.dex */
    public static class BinderC2237a extends Binder {

        /* renamed from: a */
        private final WeakReference<MiLinkService> f7055a;

        BinderC2237a(MiLinkService miLinkService) {
            this.f7055a = new WeakReference<>(miLinkService);
        }

        /* renamed from: a */
        public int m32598a() {
            MiLinkService miLinkService = this.f7055a.get();
            if (miLinkService == null) {
                return 0;
            }
            return miLinkService.f7054c.i();
        }

        /* renamed from: a */
        public void m32597a(C2196c c2196c) {
            MiLinkService miLinkService = this.f7055a.get();
            if (miLinkService == null || miLinkService.f7054c == null || miLinkService.f7054c.i() == 0) {
                return;
            }
            miLinkService.f7054c.a(c2196c);
        }

        /* renamed from: a */
        public void m32596a(String str) {
            MiLinkService miLinkService = this.f7055a.get();
            if (miLinkService == null || miLinkService.f7054c == null) {
                return;
            }
            miLinkService.f7054c.a(str);
        }

        /* renamed from: a */
        public void m32595a(String str, AbstractC2228f abstractC2228f) {
            MiLinkService miLinkService = this.f7055a.get();
            if (miLinkService == null || miLinkService.f7054c == null) {
                return;
            }
            miLinkService.f7054c.a(str, abstractC2228f);
        }

        /* renamed from: a */
        public void m32594a(boolean z) {
            if (this.f7055a.get().f7054c != null) {
                this.f7055a.get().f7054c.m32720a(z);
            }
        }

        /* renamed from: a */
        public void m32593a(byte[] bArr) {
            MiLinkService miLinkService = this.f7055a.get();
            if (miLinkService == null || miLinkService.f7054c == null || miLinkService.f7054c.i() == 0) {
                return;
            }
            miLinkService.f7054c.c(bArr);
        }

        /* renamed from: b */
        public void m32592b() {
            MiLinkService miLinkService = this.f7055a.get();
            if (miLinkService == null) {
                return;
            }
            miLinkService.m32603a();
        }

        /* renamed from: b */
        public void m32591b(boolean z) {
            if (this.f7055a.get().f7054c != null) {
                this.f7055a.get().f7054c.m32719b(z);
            }
        }

        /* renamed from: c */
        public void m32590c() {
            MiLinkService miLinkService = this.f7055a.get();
            if (miLinkService == null) {
                return;
            }
            miLinkService.stopSelf();
            miLinkService.m32601b();
        }

        /* renamed from: d */
        public boolean m32589d() {
            if (this.f7055a.get().f7054c != null) {
                return this.f7055a.get().f7054c.m32718c();
            }
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m32603a() {
        C2232h.EnumC2234a valueOf = C2232h.EnumC2234a.valueOf(C2203a.m32717a());
        if (this.f7054c == null || this.f7054c.j() != valueOf.m32607a()) {
            this.f7054c = valueOf.mo32605a(this);
        }
        if (this.f7054c != null) {
            try {
                this.f7054c.mo32624e();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        if (this.f7054c.i() != 2) {
            this.f7054c.g();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public void m32601b() {
        Log.d(f7052a, "Pre disconnect");
        if (this.f7054c == null || this.f7054c.i() == 0) {
            return;
        }
        this.f7054c.h();
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return this.f7053b;
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
        m32601b();
    }
}
