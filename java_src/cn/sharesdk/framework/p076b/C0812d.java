package cn.sharesdk.framework.p076b;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.util.Log;
import cn.sharesdk.framework.p076b.p077a.C0801e;
import cn.sharesdk.framework.p076b.p078b.AbstractC0805c;
import cn.sharesdk.framework.p076b.p078b.C0807e;
import cn.sharesdk.framework.p076b.p078b.C0810g;
import cn.sharesdk.framework.utils.C0831d;
import com.mob.commons.SHARESDK;
import com.mob.commons.clt.DvcClt;
import com.mob.commons.clt.PkgClt;
import com.mob.commons.clt.RtClt;
import com.mob.commons.iosbridge.UDPServer;
import com.mob.tools.SSDKHandlerThread;
import com.mob.tools.utils.DeviceHelper;
import com.mob.tools.utils.FileLocker;
import com.tencent.p263mm.sdk.platformtools.Util;
import java.io.File;
import java.util.Calendar;
/* renamed from: cn.sharesdk.framework.b.d */
/* loaded from: classes.dex */
public class C0812d extends SSDKHandlerThread {

    /* renamed from: a */
    private static C0812d f1600a;

    /* renamed from: b */
    private Context f1601b;

    /* renamed from: c */
    private DeviceHelper f1602c;

    /* renamed from: d */
    private C0796a f1603d;

    /* renamed from: e */
    private String f1604e;

    /* renamed from: f */
    private Handler f1605f;

    /* renamed from: g */
    private boolean f1606g;

    /* renamed from: h */
    private int f1607h;

    /* renamed from: i */
    private boolean f1608i;

    /* renamed from: j */
    private long f1609j;

    /* renamed from: k */
    private boolean f1610k;

    /* renamed from: l */
    private File f1611l;

    /* renamed from: m */
    private FileLocker f1612m = new FileLocker();

    private C0812d(Context context, String str) {
        this.f1601b = context;
        this.f1604e = str;
        this.f1602c = DeviceHelper.getInstance(context);
        this.f1603d = C0796a.m37967a(context, str);
        this.f1611l = new File(context.getFilesDir(), ".statistics");
        if (!this.f1611l.exists()) {
            try {
                this.f1611l.createNewFile();
            } catch (Exception e) {
                C0831d.m37772a().m6199d(e);
            }
        }
    }

    /* renamed from: a */
    public static synchronized C0812d m37877a(Context context, String str) {
        C0812d c0812d = null;
        synchronized (C0812d.class) {
            if (f1600a == null) {
                if (context != null && !TextUtils.isEmpty(str)) {
                    f1600a = new C0812d(context.getApplicationContext(), str);
                }
            }
            c0812d = f1600a;
        }
        return c0812d;
    }

    /* renamed from: a */
    private void m37879a() {
        boolean m37873b = m37873b();
        if (m37873b) {
            if (this.f1610k) {
                return;
            }
            this.f1610k = m37873b;
            this.f1609j = System.currentTimeMillis();
            m37875a(new C0810g());
        } else if (!this.f1610k) {
        } else {
            this.f1610k = m37873b;
            long currentTimeMillis = System.currentTimeMillis() - this.f1609j;
            C0807e c0807e = new C0807e();
            c0807e.f1572a = currentTimeMillis;
            m37875a(c0807e);
        }
    }

    /* renamed from: b */
    private void m37872b(AbstractC0805c abstractC0805c) {
        abstractC0805c.f1557f = this.f1602c.getDeviceKey();
        abstractC0805c.f1558g = this.f1604e;
        abstractC0805c.f1559h = this.f1602c.getPackageName();
        abstractC0805c.f1560i = this.f1602c.getAppVersion();
        abstractC0805c.f1561j = String.valueOf(60000 + this.f1607h);
        abstractC0805c.f1562k = this.f1602c.getPlatformCode();
        abstractC0805c.f1563l = this.f1602c.getDetailNetworkTypeForStatic();
        if (TextUtils.isEmpty(this.f1604e)) {
            Log.w("ShareSDKCore", "Your appKey of ShareSDK is null , this will cause its data won't be count!");
        } else if (!"cn.sharesdk.demo".equals(abstractC0805c.f1559h) && ("api20".equals(this.f1604e) || "androidv1101".equals(this.f1604e))) {
            Log.w("ShareSDKCore", "Your app is using the appkey of ShareSDK Demo, this will cause its data won't be count!");
        }
        abstractC0805c.f1564m = this.f1602c.getDeviceData();
    }

    /* renamed from: b */
    private boolean m37873b() {
        DeviceHelper deviceHelper = DeviceHelper.getInstance(this.f1601b);
        String topTaskPackageName = deviceHelper.getTopTaskPackageName();
        String packageName = deviceHelper.getPackageName();
        return packageName != null && packageName.equals(topTaskPackageName);
    }

    /* renamed from: c */
    private void m37871c(AbstractC0805c abstractC0805c) {
        try {
            this.f1603d.m37963a(abstractC0805c);
            abstractC0805c.mo37908b(this.f1601b);
        } catch (Throwable th) {
            C0831d.m37772a().m6199d(th);
            C0831d.m37772a().m6200d(abstractC0805c.toString(), new Object[0]);
        }
    }

    /* renamed from: a */
    public void m37878a(int i) {
        this.f1607h = i;
    }

    /* renamed from: a */
    public void m37876a(Handler handler) {
        this.f1605f = handler;
    }

    /* renamed from: a */
    public void m37875a(AbstractC0805c abstractC0805c) {
        if (this.f1608i) {
            m37872b(abstractC0805c);
            if (!abstractC0805c.mo37910a(this.f1601b)) {
                C0831d.m37772a().m6200d("Drop event: " + abstractC0805c.toString(), new Object[0]);
                return;
            }
            Message message = new Message();
            message.what = 3;
            message.obj = abstractC0805c;
            try {
                this.handler.sendMessage(message);
            } catch (Throwable th) {
                C0831d.m37772a().m6199d(th);
            }
        }
    }

    /* renamed from: a */
    public void m37874a(boolean z) {
        this.f1606g = z;
    }

    @Override // com.mob.tools.SSDKHandlerThread
    protected void onMessage(Message message) {
        switch (message.what) {
            case 1:
                m37879a();
                try {
                    this.handler.sendEmptyMessageDelayed(1, 5000L);
                    return;
                } catch (Throwable th) {
                    C0831d.m37772a().m6199d(th);
                    return;
                }
            case 2:
                try {
                    this.f1603d.m37952c();
                    return;
                } catch (Throwable th2) {
                    C0831d.m37772a().m6199d(th2);
                    return;
                }
            case 3:
                if (message.obj == null) {
                    return;
                }
                m37871c((AbstractC0805c) message.obj);
                this.handler.removeMessages(2);
                this.handler.sendEmptyMessageDelayed(2, 10000L);
                return;
            case 4:
                long longValue = C0801e.m37936a(this.f1601b).m37919f().longValue();
                Calendar calendar = Calendar.getInstance();
                calendar.setTimeInMillis(longValue);
                int i = calendar.get(1);
                int i2 = calendar.get(2);
                int i3 = calendar.get(5);
                calendar.setTimeInMillis(System.currentTimeMillis());
                int i4 = calendar.get(1);
                int i5 = calendar.get(2);
                int i6 = calendar.get(5);
                if (i != i4 || i2 != i5 || i3 != i6) {
                    this.f1603d.m37954b();
                }
                this.handler.sendEmptyMessageDelayed(4, Util.MILLSECONDS_OF_HOUR);
                return;
            default:
                return;
        }
    }

    @Override // com.mob.tools.SSDKHandlerThread
    protected void onStart(Message message) {
        if (!this.f1608i) {
            this.f1608i = true;
            try {
                this.f1612m.setLockFile(this.f1611l.getAbsolutePath());
                if (!this.f1612m.lock(false)) {
                    return;
                }
                this.f1603d.m37968a();
                this.f1603d.m37954b();
                SHARESDK.setAppKey(this.f1604e);
                new SHARESDK().getDuid(this.f1601b);
                DvcClt.startCollector(this.f1601b);
                PkgClt.startCollector(this.f1601b);
                RtClt.startCollector(this.f1601b);
                UDPServer.start(this.f1601b);
                this.handler.sendEmptyMessageDelayed(4, Util.MILLSECONDS_OF_HOUR);
                this.f1603d.m37955a(this.f1606g);
                this.handler.sendEmptyMessage(1);
                this.handler.sendEmptyMessage(2);
            } catch (Throwable th) {
                C0831d.m37772a().m6199d(th);
            }
        }
    }

    @Override // com.mob.tools.SSDKHandlerThread
    protected void onStop(Message message) {
        if (this.f1608i) {
            long currentTimeMillis = System.currentTimeMillis() - this.f1609j;
            C0807e c0807e = new C0807e();
            c0807e.f1572a = currentTimeMillis;
            m37875a(c0807e);
            this.f1608i = false;
            try {
                this.f1605f.sendEmptyMessage(1);
            } catch (Throwable th) {
                C0831d.m37772a().m6199d(th);
            }
            f1600a = null;
            this.handler.getLooper().quit();
        }
    }
}
