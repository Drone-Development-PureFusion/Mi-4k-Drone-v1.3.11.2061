package com.fimi.soul.service;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.fimi.soul.base.C1756a;
import com.fimi.soul.service.CameraSocketService;
/* renamed from: com.fimi.soul.service.a */
/* loaded from: classes.dex */
public class C3056a {

    /* renamed from: a */
    private static CameraSocketService f11452a = null;

    /* renamed from: b */
    private static C3056a f11453b;

    /* renamed from: e */
    private static CameraSocketService.AbstractC3044h f11454e;

    /* renamed from: d */
    private Context f11456d;

    /* renamed from: c */
    private boolean f11455c = false;

    /* renamed from: f */
    private ServiceConnection f11457f = new ServiceConnection() { // from class: com.fimi.soul.service.a.1
        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            C1756a.m34261a("onServiceConnected", CameraSocketService.class);
            CameraSocketService unused = C3056a.f11452a = ((CameraSocketService.BinderC3039c) iBinder).m29485a();
            C3056a.f11452a.m29519a(C3056a.f11454e);
            C3056a.f11452a.m29501e();
            if (C3056a.f11454e != null) {
                C3056a.f11454e.m29484a(1, true, "onServiceConnected");
            }
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            C1756a.m34261a("onServiceDisconnected", CameraSocketService.class);
            CameraSocketService unused = C3056a.f11452a = null;
        }
    };

    public C3056a(Context context) {
        this.f11456d = context;
    }

    /* renamed from: a */
    public static C3056a m29442a(Context context) {
        if (f11453b == null) {
            f11453b = new C3056a(context);
        }
        if (f11452a == null) {
            f11453b.m29437c();
        } else if (!f11452a.m29497g()) {
            f11452a.m29501e();
        }
        return f11453b;
    }

    /* renamed from: a */
    public void m29443a() {
        if (f11452a != null) {
            f11452a.m29509b();
        }
    }

    /* renamed from: a */
    public void m29441a(CameraSocketService.AbstractC3044h abstractC3044h) {
        f11454e = abstractC3044h;
        if (f11452a != null) {
            f11452a.m29519a(f11454e);
        }
    }

    /* renamed from: a */
    public void m29439a(String str, String str2) {
        f11452a.m29511a(str, str2);
    }

    /* renamed from: b */
    public CameraSocketService.EnumC3038b m29438b() {
        return f11452a.m29505c();
    }

    /* renamed from: c */
    public synchronized void m29437c() {
        if (!this.f11455c) {
            this.f11455c = true;
            Intent intent = new Intent();
            intent.setClass(this.f11456d, CameraSocketService.class);
            this.f11456d.getApplicationContext().bindService(intent, this.f11457f, 1);
        }
    }

    /* renamed from: d */
    public synchronized void m29436d() {
        if (this.f11455c) {
            this.f11455c = false;
            new Intent().setClass(this.f11456d, CameraSocketService.class);
            this.f11456d.getApplicationContext().unbindService(this.f11457f);
            f11452a.m29503d();
            f11452a.onDestroy();
            f11452a = null;
            f11453b = null;
        }
    }

    /* renamed from: e */
    public void m29435e() {
        f11452a.m29521a();
    }

    /* renamed from: f */
    public String m29434f() {
        if (f11452a == null) {
            return null;
        }
        return f11452a.m29499f();
    }

    /* renamed from: g */
    public String m29433g() {
        StringBuffer stringBuffer = new StringBuffer();
        if (f11452a == null || !m29432h()) {
            return null;
        }
        stringBuffer.append("rtsp://");
        stringBuffer.append(f11452a.m29499f());
        stringBuffer.append("/media/stream1");
        return stringBuffer.toString();
    }

    /* renamed from: h */
    public boolean m29432h() {
        if (f11452a == null) {
            return false;
        }
        return f11452a.m29497g();
    }

    /* renamed from: i */
    public void m29431i() {
        if (f11452a != null) {
            f11452a.m29501e();
        }
    }
}
