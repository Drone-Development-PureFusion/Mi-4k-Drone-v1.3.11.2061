package com.google.android.gms.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.support.annotation.MainThread;
import android.support.annotation.Nullable;
import android.support.annotation.WorkerThread;
import com.google.android.gms.common.stats.C4669b;
import com.google.android.gms.internal.apf;
import com.google.android.gms.tagmanager.TagManagerService;
/* loaded from: classes2.dex */
public class aqa implements ServiceConnection {

    /* renamed from: a */
    private final Context f22847a;

    /* renamed from: b */
    private final C4669b f22848b;

    /* renamed from: c */
    private volatile boolean f22849c;

    /* renamed from: d */
    private volatile boolean f22850d;

    /* renamed from: e */
    private apf f22851e;

    public aqa(Context context) {
        this(context, C4669b.m23204a());
    }

    aqa(Context context, C4669b c4669b) {
        this.f22849c = false;
        this.f22850d = false;
        this.f22847a = context;
        this.f22848b = c4669b;
    }

    @WorkerThread
    /* renamed from: a */
    private void m16240a(@Nullable ape apeVar, String str) {
        if (apeVar != null) {
            try {
                apeVar.mo16254a(false, str);
            } catch (RemoteException e) {
                aph.m16395a("Error - local callback should not throw RemoteException", e);
            }
        }
    }

    @WorkerThread
    /* renamed from: a */
    public void m16239a(String str, Bundle bundle, String str2, long j, boolean z) {
        if (m16241a()) {
            try {
                this.f22851e.mo16250a(str, bundle, str2, j, z);
            } catch (RemoteException e) {
                aph.m16393b("Error calling service to emit event", e);
            }
        }
    }

    @WorkerThread
    /* renamed from: a */
    public void m16238a(String str, @Nullable String str2, @Nullable String str3, @Nullable ape apeVar) {
        if (!m16241a()) {
            m16240a(apeVar, str);
            return;
        }
        try {
            this.f22851e.mo16248a(str, str2, str3, apeVar);
        } catch (RemoteException e) {
            aph.m16393b("Error calling service to load container", e);
            m16240a(apeVar, str);
        }
    }

    @WorkerThread
    /* renamed from: a */
    public boolean m16241a() {
        if (this.f22849c) {
            return true;
        }
        synchronized (this) {
            if (this.f22849c) {
                return true;
            }
            if (!this.f22850d) {
                if (!this.f22848b.m23201a(this.f22847a, new Intent(this.f22847a, TagManagerService.class), this, 1)) {
                    return false;
                }
                this.f22850d = true;
            }
            while (this.f22850d) {
                try {
                    wait();
                    this.f22850d = false;
                } catch (InterruptedException e) {
                    aph.m16393b("Error connecting to TagManagerService", e);
                    this.f22850d = false;
                }
            }
            return this.f22849c;
        }
    }

    @WorkerThread
    /* renamed from: b */
    public boolean m16237b() {
        if (m16241a()) {
            try {
                this.f22851e.mo16252a();
                return true;
            } catch (RemoteException e) {
                aph.m16393b("Error in resetting service", e);
            }
        }
        return false;
    }

    @WorkerThread
    /* renamed from: c */
    public void m16236c() {
        if (m16241a()) {
            try {
                this.f22851e.mo16247b();
            } catch (RemoteException e) {
                aph.m16393b("Error calling service to dispatch pending events", e);
            }
        }
    }

    @Override // android.content.ServiceConnection
    @MainThread
    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        synchronized (this) {
            this.f22851e = apf.AbstractBinderC6709a.m16400a(iBinder);
            this.f22849c = true;
            this.f22850d = false;
            notifyAll();
        }
    }

    @Override // android.content.ServiceConnection
    @MainThread
    public void onServiceDisconnected(ComponentName componentName) {
        synchronized (this) {
            this.f22851e = null;
            this.f22849c = false;
            this.f22850d = false;
        }
    }
}
