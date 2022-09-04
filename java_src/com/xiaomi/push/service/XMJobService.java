package com.xiaomi.push.service;

import android.annotation.TargetApi;
import android.app.Service;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.Intent;
import android.os.Binder;
import android.os.Build;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import com.xiaomi.channel.commonutils.logger.AbstractC10404b;
import com.xiaomi.channel.commonutils.reflect.C10426a;
import com.xiaomi.push.service.timers.C10694a;
/* loaded from: classes.dex */
public class XMJobService extends Service {

    /* renamed from: a */
    static Service f32924a = null;

    /* renamed from: b */
    private IBinder f32925b = null;

    @TargetApi(21)
    /* renamed from: com.xiaomi.push.service.XMJobService$a  reason: invalid class name */
    /* loaded from: classes.dex */
    static class jobJobServiceC10583a extends JobService {

        /* renamed from: a */
        Binder f32926a;

        /* renamed from: b */
        private Handler f32927b;

        /* renamed from: com.xiaomi.push.service.XMJobService$a$a */
        /* loaded from: classes2.dex */
        private static class HandlerC10584a extends Handler {

            /* renamed from: a */
            JobService f32928a;

            HandlerC10584a(JobService jobService) {
                super(jobService.getMainLooper());
                this.f32928a = jobService;
            }

            @Override // android.os.Handler
            public void handleMessage(Message message) {
                switch (message.what) {
                    case 1:
                        JobParameters jobParameters = (JobParameters) message.obj;
                        AbstractC10404b.m5269a("Job finished " + jobParameters.getJobId());
                        this.f32928a.jobFinished(jobParameters, false);
                        if (jobParameters.getJobId() != 1) {
                            return;
                        }
                        C10694a.m4085a(false);
                        return;
                    default:
                        return;
                }
            }
        }

        jobJobServiceC10583a(Service service) {
            this.f32926a = null;
            this.f32926a = (Binder) C10426a.m5200a(this, "onBind", new Intent());
            C10426a.m5200a(this, "attachBaseContext", service);
        }

        @Override // android.app.job.JobService
        public boolean onStartJob(JobParameters jobParameters) {
            AbstractC10404b.m5269a("Job started " + jobParameters.getJobId());
            Intent intent = new Intent(this, XMPushService.class);
            intent.setAction("com.xiaomi.push.timer");
            intent.setPackage(getPackageName());
            startService(intent);
            if (this.f32927b == null) {
                this.f32927b = new HandlerC10584a(this);
            }
            this.f32927b.sendMessage(Message.obtain(this.f32927b, 1, jobParameters));
            return true;
        }

        @Override // android.app.job.JobService
        public boolean onStopJob(JobParameters jobParameters) {
            AbstractC10404b.m5269a("Job stop " + jobParameters.getJobId());
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static Service m4502a() {
        return f32924a;
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return this.f32925b != null ? this.f32925b : new Binder();
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        if (Build.VERSION.SDK_INT >= 21) {
            this.f32925b = new jobJobServiceC10583a(this).f32926a;
        }
        f32924a = this;
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
        f32924a = null;
    }
}
