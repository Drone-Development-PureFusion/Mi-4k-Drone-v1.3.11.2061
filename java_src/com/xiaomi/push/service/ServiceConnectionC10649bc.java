package com.xiaomi.push.service;

import android.app.Service;
import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.xiaomi.channel.commonutils.logger.AbstractC10404b;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.xiaomi.push.service.bc */
/* loaded from: classes.dex */
public class ServiceConnectionC10649bc implements ServiceConnection {

    /* renamed from: a */
    final /* synthetic */ XMPushService f33106a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ServiceConnectionC10649bc(XMPushService xMPushService) {
        this.f33106a = xMPushService;
    }

    @Override // android.content.ServiceConnection
    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        int i;
        int i2;
        AbstractC10404b.m5266b("onServiceConnected " + iBinder);
        Service m4502a = XMJobService.m4502a();
        if (m4502a == null) {
            AbstractC10404b.m5269a("XMService connected but innerService is null " + iBinder);
            return;
        }
        XMPushService xMPushService = this.f33106a;
        i = XMPushService.f32930g;
        xMPushService.startForeground(i, XMPushService.m4496a((Context) this.f33106a));
        i2 = XMPushService.f32930g;
        m4502a.startForeground(i2, XMPushService.m4496a((Context) this.f33106a));
        m4502a.stopForeground(true);
        this.f33106a.unbindService(this);
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(ComponentName componentName) {
    }
}
