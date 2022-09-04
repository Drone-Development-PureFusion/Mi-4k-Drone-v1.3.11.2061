package com.fimi.soul.service;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.preference.PreferenceManager;
import android.support.annotation.Nullable;
import com.fimi.kernel.p164c.C1645c;
import com.fimi.soul.base.C1756a;
import com.fimi.soul.biz.p169a.C1757a;
import com.fimi.soul.drone.p202f.C2269a;
import com.fimi.soul.drone.p204h.C2279c;
import com.fimi.soul.entity.DroneInfoBean;
import com.fimi.soul.entity.UpdateDroneInforBean;
import com.fimi.soul.entity.User;
import com.fimi.soul.utils.C3103au;
import com.fimi.soul.utils.C3134q;
import com.xiaomi.mipush.sdk.Constants;
/* loaded from: classes.dex */
public class FlyInforService extends Service {

    /* renamed from: a */
    private DroneInfoBean f11414a = new DroneInfoBean();

    /* renamed from: b */
    private C1645c f11415b;

    /* renamed from: a */
    private void m29475a() {
        UpdateDroneInforBean updateDroneInforBean = new UpdateDroneInforBean();
        User m34259c = C1756a.m34259c(this);
        if (m34259c != null && m34259c.getUserID() != null && !"".equals(m34259c.getUserID())) {
            updateDroneInforBean.setUserID(m34259c.getUserID());
        }
        C2269a c2269a = (C2269a) this.f11415b.mo34880a("0", C2269a.class);
        if (c2269a != null) {
            updateDroneInforBean.setPlaneID(c2269a.m32513d() + "" + c2269a.m32511e() + "" + c2269a.m32509g());
            this.f11414a.setFlySoftVersion(c2269a.m32515c());
        }
        C2269a c2269a2 = (C2269a) this.f11415b.mo34880a("1", C2269a.class);
        if (c2269a2 != null) {
            this.f11414a.setRemoteId(c2269a2.m32513d() + "" + c2269a2.m32511e() + "" + c2269a2.m32509g());
            this.f11414a.setRemoteSoftVersion(c2269a2.m32515c());
        }
        C2269a c2269a3 = (C2269a) this.f11415b.mo34880a("3", C2269a.class);
        if (c2269a3 != null) {
            this.f11414a.setCoulidId(c2269a3.m32513d() + "" + c2269a3.m32511e() + "" + c2269a3.m32509g());
            this.f11414a.setCloudSoftVersion(c2269a3.m32515c());
        }
        C2269a c2269a4 = (C2269a) this.f11415b.mo34880a(C3134q.f11826n, C2269a.class);
        if (c2269a4 != null) {
            this.f11414a.setLightStreamVersion(c2269a4.m32515c());
        }
        updateDroneInforBean.setmDroneInfoBean(this.f11414a);
        this.f11415b.mo34879a(C2279c.f7281r, updateDroneInforBean);
    }

    @Override // android.app.Service
    @Nullable
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        this.f11415b = C1645c.m34884a();
        this.f11414a.setPhoneDevice(C3103au.m29198g(getApplicationContext()).substring(0, C3103au.m29198g(getApplicationContext()).indexOf(Constants.ACCEPT_TIME_SEPARATOR_SP)));
        this.f11414a.setTelePhoneId(C3103au.m29198g(getApplicationContext()).substring(C3103au.m29198g(getApplicationContext()).indexOf(Constants.ACCEPT_TIME_SEPARATOR_SP) + 1));
        this.f11414a.setAppSoftVersion(C3103au.m29209d(getApplicationContext()));
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
        if (C3103au.m29221b(getApplicationContext())) {
            new C1757a(getApplicationContext()).m34256a();
        }
        m29475a();
        return super.onStartCommand(intent, i, i2);
    }
}
