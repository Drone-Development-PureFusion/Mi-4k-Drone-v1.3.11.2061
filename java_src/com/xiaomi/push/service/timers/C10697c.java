package com.xiaomi.push.service.timers;

import android.annotation.TargetApi;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.os.SystemClock;
import com.xiaomi.channel.commonutils.logger.AbstractC10404b;
import com.xiaomi.push.service.XMJobService;
import com.xiaomi.push.service.timers.C10694a;
import com.xiaomi.smack.C10725g;
@TargetApi(21)
/* renamed from: com.xiaomi.push.service.timers.c */
/* loaded from: classes2.dex */
public class C10697c implements C10694a.AbstractC10695a {

    /* renamed from: a */
    Context f33242a;

    /* renamed from: b */
    JobScheduler f33243b;

    /* renamed from: c */
    private boolean f33244c = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C10697c(Context context) {
        this.f33242a = context;
        this.f33243b = (JobScheduler) context.getSystemService("jobscheduler");
    }

    @Override // com.xiaomi.push.service.timers.C10694a.AbstractC10695a
    /* renamed from: a */
    public void mo4081a() {
        this.f33244c = false;
        this.f33243b.cancel(1);
    }

    /* renamed from: a */
    void m4080a(long j) {
        JobInfo.Builder builder = new JobInfo.Builder(1, new ComponentName(this.f33242a.getPackageName(), XMJobService.class.getName()));
        builder.setMinimumLatency(j);
        builder.setOverrideDeadline(j);
        builder.setRequiredNetworkType(1);
        builder.setPersisted(false);
        AbstractC10404b.m5265c("schedule Job = " + builder.build().getId() + " in " + j);
        this.f33243b.schedule(builder.build());
    }

    @Override // com.xiaomi.push.service.timers.C10694a.AbstractC10695a
    /* renamed from: a */
    public void mo4079a(boolean z) {
        if (z || this.f33244c) {
            long m3946c = C10725g.m3946c();
            if (z) {
                mo4081a();
                m3946c -= SystemClock.elapsedRealtime() % m3946c;
            }
            this.f33244c = true;
            m4080a(m3946c);
        }
    }

    @Override // com.xiaomi.push.service.timers.C10694a.AbstractC10695a
    /* renamed from: b */
    public boolean mo4078b() {
        return this.f33244c;
    }
}
