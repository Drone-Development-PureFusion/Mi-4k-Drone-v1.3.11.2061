package com.fimi.soul.module.dronemanage;

import android.os.Handler;
import android.os.Message;
import com.fimi.kernel.utils.C1685x;
import com.google.android.gms.maps.model.PolylineOptions;
/* renamed from: com.fimi.soul.module.dronemanage.g */
/* loaded from: classes.dex */
abstract class AbstractC2708g {

    /* renamed from: b */
    private HandlerC2709a f9299b = new HandlerC2709a();

    /* renamed from: a */
    public PolylineOptions f9298a = new PolylineOptions();

    /* renamed from: com.fimi.soul.module.dronemanage.g$a */
    /* loaded from: classes.dex */
    class HandlerC2709a extends Handler {
        HandlerC2709a() {
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            AbstractC2708g.this.m30547a(message);
        }
    }

    public AbstractC2708g() {
        this.f9298a.m11303a(-256).m11304a(5.0f);
    }

    /* renamed from: a */
    public void m30548a() {
        if (this.f9298a != null) {
            this.f9298a = null;
            this.f9298a = new PolylineOptions();
            this.f9298a.m11303a(-256).m11304a(5.0f);
        }
    }

    /* renamed from: a */
    protected abstract void m30547a(Message message);

    /* renamed from: a */
    protected void m30546a(Runnable runnable) {
        C1685x.m34457a(runnable);
    }

    /* renamed from: b */
    protected Handler m30545b() {
        return this.f9299b;
    }
}
