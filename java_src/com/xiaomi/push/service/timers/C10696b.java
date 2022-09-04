package com.xiaomi.push.service.timers;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.SystemClock;
import com.xiaomi.channel.commonutils.logger.AbstractC10404b;
import com.xiaomi.channel.commonutils.reflect.C10426a;
import com.xiaomi.push.service.AbstractC10621am;
import com.xiaomi.push.service.timers.C10694a;
import com.xiaomi.smack.C10725g;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.xiaomi.push.service.timers.b */
/* loaded from: classes2.dex */
public class C10696b implements C10694a.AbstractC10695a {

    /* renamed from: b */
    private Context f33240b;

    /* renamed from: a */
    private PendingIntent f33239a = null;

    /* renamed from: c */
    private volatile long f33241c = 0;

    public C10696b(Context context) {
        this.f33240b = null;
        this.f33240b = context;
    }

    /* renamed from: a */
    private void m4083a(AlarmManager alarmManager, long j, PendingIntent pendingIntent) {
        try {
            AlarmManager.class.getMethod("setExact", Integer.TYPE, Long.TYPE, PendingIntent.class).invoke(alarmManager, 0, Long.valueOf(j), pendingIntent);
        } catch (Exception e) {
            AbstractC10404b.m5267a(e);
        }
    }

    @Override // com.xiaomi.push.service.timers.C10694a.AbstractC10695a
    /* renamed from: a */
    public void mo4081a() {
        if (this.f33239a != null) {
            ((AlarmManager) this.f33240b.getSystemService("alarm")).cancel(this.f33239a);
            this.f33239a = null;
            AbstractC10404b.m5265c("unregister timer");
        }
        this.f33241c = 0L;
    }

    /* renamed from: a */
    public void m4082a(Intent intent, long j) {
        AlarmManager alarmManager = (AlarmManager) this.f33240b.getSystemService("alarm");
        this.f33239a = PendingIntent.getBroadcast(this.f33240b, 0, intent, 0);
        if (Build.VERSION.SDK_INT >= 23) {
            C10426a.m5200a(alarmManager, "setExactAndAllowWhileIdle", 0, Long.valueOf(j), this.f33239a);
        } else if (Build.VERSION.SDK_INT >= 19) {
            m4083a(alarmManager, j, this.f33239a);
        } else {
            alarmManager.set(0, j, this.f33239a);
        }
        AbstractC10404b.m5265c("register timer " + j);
    }

    @Override // com.xiaomi.push.service.timers.C10694a.AbstractC10695a
    /* renamed from: a */
    public void mo4079a(boolean z) {
        long m3946c = C10725g.m3946c();
        if (z || this.f33241c != 0) {
            if (z) {
                mo4081a();
            }
            if (z || this.f33241c == 0) {
                this.f33241c = (m3946c - (SystemClock.elapsedRealtime() % m3946c)) + System.currentTimeMillis();
            } else {
                this.f33241c += m3946c;
                if (this.f33241c < System.currentTimeMillis()) {
                    this.f33241c = m3946c + System.currentTimeMillis();
                }
            }
            Intent intent = new Intent(AbstractC10621am.f33040o);
            intent.setPackage(this.f33240b.getPackageName());
            m4082a(intent, this.f33241c);
        }
    }

    @Override // com.xiaomi.push.service.timers.C10694a.AbstractC10695a
    /* renamed from: b */
    public boolean mo4078b() {
        return this.f33241c != 0;
    }
}
