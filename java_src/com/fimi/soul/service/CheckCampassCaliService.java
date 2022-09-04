package com.fimi.soul.service;

import android.app.IntentService;
import android.content.Intent;
import android.location.Location;
import com.fimi.kernel.p164c.C1645c;
import com.fimi.soul.base.DroidPlannerApp;
import com.fimi.soul.biz.manager.MyLocationManager;
import com.fimi.soul.drone.C2104d;
import com.fimi.soul.drone.p204h.C2279c;
import com.fimi.soul.entity.CheckCampssBeann;
import com.fimi.soul.module.update.p218a.C3024d;
import com.fimi.soul.utils.C3077ae;
import com.google.android.gms.maps.model.LatLng;
/* loaded from: classes.dex */
public class CheckCampassCaliService extends IntentService {

    /* renamed from: a */
    DroidPlannerApp f11394a;

    /* renamed from: b */
    private Location f11395b;

    public CheckCampassCaliService() {
        super("CheckCampassCaliService");
    }

    public CheckCampassCaliService(String str) {
        super(str);
    }

    @Override // android.app.IntentService, android.app.Service
    public void onCreate() {
        super.onCreate();
        this.f11394a = (DroidPlannerApp) getApplication();
    }

    @Override // android.app.IntentService
    protected void onHandleIntent(Intent intent) {
        C3024d.m29573a(this.f11394a.f4493a);
        this.f11394a.f4493a.mo32909a(C2104d.EnumC2105a.XIAOMI_INSURENCE);
        CheckCampssBeann checkCampssBeann = (CheckCampssBeann) C1645c.m34884a().mo34880a(C2279c.f7170Z, CheckCampssBeann.class);
        if (checkCampssBeann == null) {
            this.f11394a.f4493a.mo32909a(C2104d.EnumC2105a.SHOWCAMPASSCALI);
            return;
        }
        Location m33438c = MyLocationManager.m33443a(this).m33438c();
        if (m33438c == null) {
            this.f11394a.f4493a.mo32909a(C2104d.EnumC2105a.SHOWCAMPASSCALI);
            return;
        }
        LatLng latLng = new LatLng(m33438c.getLatitude(), m33438c.getLongitude());
        double d = 0.0d;
        for (LatLng latLng2 : checkCampssBeann.getListLatlng()) {
            d = C3077ae.m29349c(latLng, latLng2).m29318a();
            if (d <= 3000.0d) {
                break;
            }
        }
        if (d <= 3000.0d) {
            return;
        }
        this.f11394a.f4493a.mo32909a(C2104d.EnumC2105a.SHOWCAMPASSCALI);
    }

    @Override // android.app.IntentService, android.app.Service
    public void onStart(Intent intent, int i) {
        super.onStart(intent, i);
    }
}
