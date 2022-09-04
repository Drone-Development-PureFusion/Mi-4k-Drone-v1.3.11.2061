package com.fimi.soul.service;

import android.app.IntentService;
import android.content.Intent;
import com.fimi.soul.base.DroidPlannerApp;
import com.fimi.soul.module.update.p218a.C3021a;
import com.fimi.soul.module.update.p218a.C3027g;
/* loaded from: classes.dex */
public class RequestVersionService extends IntentService {

    /* renamed from: a */
    public static final String f11434a = "RequestVersionService";

    public RequestVersionService() {
        super(f11434a);
    }

    public RequestVersionService(String str) {
        super(str);
    }

    @Override // android.app.IntentService
    protected void onHandleIntent(Intent intent) {
        C3027g c3027g = new C3027g(this, ((DroidPlannerApp) getApplication()).f4493a);
        for (int i = 0; i < 5; i++) {
            c3027g.m29532c();
            if (C3021a.m29616a().m29615a(0).m29566b() > 0) {
                return;
            }
        }
    }
}
