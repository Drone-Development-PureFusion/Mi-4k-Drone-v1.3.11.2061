package com.google.android.gms.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Looper;
import android.os.RemoteException;
import com.google.android.gms.cast.C4227d;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.cast.internal.C4440m;
import com.google.android.gms.common.api.AbstractC4489g;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.AbstractC4638w;
import com.google.android.gms.common.internal.C4626s;
import com.google.android.gms.internal.agx;
import com.google.android.gms.internal.agy;
/* loaded from: classes.dex */
public class agv extends AbstractC4638w<agx> implements IBinder.DeathRecipient {

    /* renamed from: a */
    private static final C4440m f21675a = new C4440m("CastRemoteDisplayClientImpl");

    /* renamed from: e */
    private C4227d.AbstractC4231b f21676e;

    /* renamed from: f */
    private CastDevice f21677f;

    /* renamed from: g */
    private Bundle f21678g;

    public agv(Context context, Looper looper, C4626s c4626s, CastDevice castDevice, Bundle bundle, C4227d.AbstractC4231b abstractC4231b, AbstractC4489g.AbstractC4491b abstractC4491b, AbstractC4489g.AbstractC4492c abstractC4492c) {
        super(context, looper, 83, c4626s, abstractC4491b, abstractC4492c);
        f21675a.m24160b("instance created", new Object[0]);
        this.f21676e = abstractC4231b;
        this.f21677f = castDevice;
        this.f21678g = bundle;
    }

    @Override // com.google.android.gms.common.internal.AbstractC4600p
    /* renamed from: a */
    public agx mo7440b(IBinder iBinder) {
        return agx.AbstractBinderC6315a.m17545a(iBinder);
    }

    @Override // com.google.android.gms.common.internal.AbstractC4600p
    /* renamed from: a */
    protected String mo7443a() {
        return "com.google.android.gms.cast.remote_display.service.START";
    }

    /* renamed from: a */
    public void m17554a(agw agwVar) {
        f21675a.m24160b("stopRemoteDisplay", new Object[0]);
        ((agx) G()).mo17543a(agwVar);
    }

    /* renamed from: a */
    public void m17553a(agw agwVar, int i) {
        ((agx) G()).mo17542a(agwVar, i);
    }

    /* renamed from: a */
    public void m17552a(agw agwVar, final agy agyVar, String str) {
        f21675a.m24160b("startRemoteDisplay", new Object[0]);
        ((agx) G()).mo17540a(agwVar, new agy.AbstractBinderC6317a() { // from class: com.google.android.gms.internal.agv.1
            @Override // com.google.android.gms.internal.agy
            /* renamed from: a */
            public void mo17537a(int i) {
                agv.f21675a.m24160b("onRemoteDisplayEnded", new Object[0]);
                if (agyVar != null) {
                    agyVar.mo17537a(i);
                }
                if (agv.this.f21676e != null) {
                    agv.this.f21676e.mo24915a(new Status(i));
                }
            }
        }, this.f21677f.m25244b(), str, this.f21678g);
    }

    @Override // com.google.android.gms.common.internal.AbstractC4600p
    /* renamed from: b */
    protected String mo7441b() {
        return "com.google.android.gms.cast.remote_display.ICastRemoteDisplayService";
    }

    @Override // android.os.IBinder.DeathRecipient
    public void binderDied() {
    }

    @Override // com.google.android.gms.common.internal.AbstractC4600p, com.google.android.gms.common.api.C4467a.AbstractC4477f
    /* renamed from: f */
    public void mo9828f() {
        f21675a.m24160b("disconnect", new Object[0]);
        this.f21676e = null;
        this.f21677f = null;
        try {
            ((agx) G()).mo17539b();
            super.f();
        } catch (RemoteException e) {
            super.f();
        } catch (IllegalStateException e2) {
            super.f();
        } catch (Throwable th) {
            super.f();
            throw th;
        }
    }
}
