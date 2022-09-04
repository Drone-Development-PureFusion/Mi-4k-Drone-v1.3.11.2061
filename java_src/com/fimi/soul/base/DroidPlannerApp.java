package com.fimi.soul.base;

import android.app.Activity;
import android.app.ActivityManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.os.Debug;
import android.os.Handler;
import android.os.Message;
import android.os.Process;
import android.util.Log;
import com.fimi.kernel.utils.C1681v;
import com.fimi.soul.biz.camera.C1783b;
import com.fimi.soul.biz.manager.C2004u;
import com.fimi.soul.biz.p181i.C1867a;
import com.fimi.soul.biz.p187o.C2022a;
import com.fimi.soul.drone.C2083a;
import com.fimi.soul.drone.C2104d;
import com.fimi.soul.drone.droneconnection.connection.C2229g;
import com.fimi.soul.drone.droneconnection.connection.service.C2238a;
import com.fimi.soul.drone.p193b.C2099a;
import com.fimi.soul.drone.p195d.p196a.AbstractC2195b;
import com.fimi.soul.drone.p204h.C2279c;
import com.fimi.soul.utils.C3075ad;
import com.fimi.soul.utils.C3123g;
import com.fimi.soul.utils.C3127k;
import com.fimi.soul.utils.NetUtil;
import com.tencent.p263mm.sdk.platformtools.SystemProperty;
import com.xiaomi.channel.commonutils.logger.LoggerInterface;
import com.xiaomi.mipush.sdk.Logger;
import com.xiaomi.mipush.sdk.MiPushClient;
import com.xiaomi.mistatistic.sdk.MiStatInterface;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
/* loaded from: classes.dex */
public class DroidPlannerApp extends ErrorReportApp implements C2229g.AbstractC2231b {

    /* renamed from: e */
    static DroidPlannerApp f4488e = null;

    /* renamed from: f */
    public static boolean f4489f = false;

    /* renamed from: k */
    private static HashMap f4490k = new HashMap();

    /* renamed from: l */
    private static final int f4491l = 10;

    /* renamed from: m */
    private static final int f4492m = 3000;

    /* renamed from: a */
    public C2083a f4493a;

    /* renamed from: b */
    public C2099a f4494b;

    /* renamed from: d */
    public C2238a f4496d;

    /* renamed from: c */
    public boolean f4495c = true;

    /* renamed from: h */
    private C1681v f4498h = null;

    /* renamed from: i */
    private List<Activity> f4499i = new LinkedList();

    /* renamed from: j */
    private List<Activity> f4500j = new ArrayList();

    /* renamed from: g */
    Handler f4497g = new Handler() { // from class: com.fimi.soul.base.DroidPlannerApp.2
        @Override // android.os.Handler
        public void handleMessage(Message message) {
            super.handleMessage(message);
            if (message.what == 10) {
                DroidPlannerApp.this.f4493a.mo32909a(C2104d.EnumC2105a.DISCONNECTVIDEO);
            }
        }
    };

    /* renamed from: c */
    public static HashMap<String, String> m34275c() {
        return f4490k;
    }

    /* renamed from: g */
    public static Context m34273g() {
        return f4488e;
    }

    /* renamed from: h */
    public static DroidPlannerApp m34272h() {
        return f4488e;
    }

    /* renamed from: i */
    private void m34271i() {
        boolean equals = "1".equals(SystemProperty.getProperty("ro.kernel.qemu"));
        ApplicationInfo applicationInfo = getApplicationInfo();
        int i = applicationInfo.flags & 2;
        applicationInfo.flags = i;
        if (i != 0 || Debug.isDebuggerConnected() || equals) {
            Process.killProcess(Process.myPid());
        }
    }

    /* renamed from: j */
    private void m34270j() {
        new C2004u(m34273g()).m33298a();
    }

    /* renamed from: k */
    private boolean m34269k() {
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) getSystemService("activity")).getRunningAppProcesses();
        String packageName = getPackageName();
        int myPid = Process.myPid();
        for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
            if (runningAppProcessInfo.pid == myPid && packageName.equals(runningAppProcessInfo.processName)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: l */
    private void m34268l() {
        SharedPreferences m34546a = C1681v.m34543a(this).m34546a();
        C2022a m33223a = C2022a.m33223a();
        if (m34546a.getBoolean(C2279c.f7238bN, false)) {
            m33223a.m33222a(false);
        } else {
            m33223a.m33222a(true);
        }
    }

    /* renamed from: a */
    public void m34279a() {
        if (this.f4500j == null || this.f4500j.size() <= 0) {
            return;
        }
        for (Activity activity : this.f4500j) {
            activity.finish();
        }
        this.f4500j.clear();
    }

    /* renamed from: a */
    public void m34278a(Activity activity) {
        this.f4500j.add(activity);
    }

    @Override // com.fimi.soul.drone.droneconnection.connection.C2229g.AbstractC2231b
    /* renamed from: a */
    public void mo32612a(AbstractC2195b abstractC2195b) {
        this.f4494b.m32936a(abstractC2195b);
    }

    @Override // com.fimi.soul.drone.droneconnection.connection.C2229g.AbstractC2231b
    /* renamed from: a */
    public void mo32611a(boolean z) {
        boolean z2 = true;
        if (z != this.f4493a.mo32905ac()) {
            if (!z || this.f4493a.mo32905ac()) {
                if (!z && this.f4493a.mo32905ac()) {
                    this.f4497g.sendEmptyMessageDelayed(10, 3000L);
                }
            } else if (this.f4497g.hasMessages(10)) {
                this.f4497g.removeMessages(10);
            }
            C2083a c2083a = this.f4493a;
            if (!z && this.f4493a.mo32919Q().m32135a() <= 5) {
                z2 = false;
            }
            c2083a.m32993b(z2);
            if (!z) {
                return;
            }
            C1867a.m33847a().m33842a(this.f4493a);
        }
    }

    /* renamed from: b */
    public void m34277b() {
        if (this.f4499i == null || this.f4499i.size() <= 0) {
            return;
        }
        this.f4499i.clear();
    }

    /* renamed from: b */
    public void m34276b(Activity activity) {
        this.f4499i.add(activity);
    }

    @Override // com.fimi.soul.drone.droneconnection.connection.C2229g.AbstractC2231b
    /* renamed from: b */
    public void mo32610b(boolean z) {
        this.f4493a.m33027a(z);
        if (!z) {
            this.f4493a.m32993b(false);
            this.f4493a.m33011ak();
            this.f4493a.mo32909a(C2104d.EnumC2105a.CLEANALLOBJ);
        }
    }

    /* renamed from: d */
    public void m34274d() {
        try {
            for (Activity activity : this.f4499i) {
                if (activity != null) {
                    activity.finish();
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override // com.fimi.soul.drone.droneconnection.connection.C2229g.AbstractC2231b
    /* renamed from: e */
    public void mo32609e() {
        this.f4493a.mo32909a(C2104d.EnumC2105a.CONNECTSUCESS);
    }

    @Override // com.fimi.soul.drone.droneconnection.connection.C2229g.AbstractC2231b
    /* renamed from: f */
    public void mo32608f() {
        this.f4493a.mo32919Q().m32134a((byte) 0);
        this.f4493a.m32993b(false);
        this.f4493a.m33011ak();
        this.f4493a.mo32909a(C2104d.EnumC2105a.CLEANALLOBJ);
    }

    @Override // com.fimi.soul.base.ErrorReportApp, com.fimi.kernel.BaseApplication, android.app.Application
    public void onCreate() {
        super.onCreate();
        C3127k.m29073a(this);
        f4488e = this;
        this.f4496d = new C2238a(this, this);
        NetUtil.m29414a();
        this.f4498h = C1681v.m34543a(this);
        this.f4493a = new C2083a(this.f4496d, this, new Handler());
        this.f4494b = new C2099a(this.f4493a, m34273g());
        m34268l();
        if (m34269k() && this.f4498h.m34546a().contains("isfirstloading")) {
            MiPushClient.registerPush(this, "2882303761517518920", C1756a.f4559r);
        }
        Logger.setLogger(this, new LoggerInterface() { // from class: com.fimi.soul.base.DroidPlannerApp.1
            @Override // com.xiaomi.channel.commonutils.logger.LoggerInterface
            public void log(String str) {
                Log.d(C1756a.f4545d, str);
            }

            @Override // com.xiaomi.channel.commonutils.logger.LoggerInterface
            public void log(String str, Throwable th) {
                Log.d(C1756a.f4545d, str, th);
            }

            @Override // com.xiaomi.channel.commonutils.logger.LoggerInterface
            public void setTag(String str) {
            }
        });
        MiStatInterface.initialize(this, "2882303761517518920", C1756a.f4559r, "Xiao Mi");
        MiStatInterface.setUploadPolicy(3, 0L);
        MiStatInterface.enableExceptionCatcher(false);
        m34270j();
        C1783b.m34165a(this);
        C3075ad.m29365a();
        C3123g.m29090a().m29089a("-----start-------");
    }

    @Override // com.fimi.kernel.BaseApplication, android.app.Application
    public void onTerminate() {
        super.onTerminate();
        C3075ad.m29359b();
    }
}
