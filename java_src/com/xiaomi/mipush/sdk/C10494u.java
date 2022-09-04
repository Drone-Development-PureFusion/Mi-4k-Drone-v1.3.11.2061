package com.xiaomi.mipush.sdk;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.xiaomi.channel.commonutils.logger.AbstractC10404b;
import com.xiaomi.channel.commonutils.network.C10423d;
import com.xiaomi.channel.commonutils.string.C10432c;
import com.xiaomi.push.service.AbstractC10621am;
import com.xiaomi.push.service.C10625ao;
import com.xiaomi.xmpush.thrift.C10769ab;
import com.xiaomi.xmpush.thrift.C10775ae;
import com.xiaomi.xmpush.thrift.C10777af;
import com.xiaomi.xmpush.thrift.C10791am;
import com.xiaomi.xmpush.thrift.C10799aq;
import com.xiaomi.xmpush.thrift.C10826r;
import com.xiaomi.xmpush.thrift.EnumC10766a;
import com.xiaomi.xmpush.thrift.EnumC10821o;
import java.util.ArrayList;
import java.util.Iterator;
import org.p286a.p321b.AbstractC11361a;
/* renamed from: com.xiaomi.mipush.sdk.u */
/* loaded from: classes.dex */
public class C10494u {

    /* renamed from: b */
    private static C10494u f32596b;

    /* renamed from: e */
    private static final ArrayList<C10495a> f32597e = new ArrayList<>();

    /* renamed from: a */
    private boolean f32598a;

    /* renamed from: c */
    private Context f32599c;

    /* renamed from: f */
    private Handler f32601f;

    /* renamed from: g */
    private Intent f32602g = null;

    /* renamed from: h */
    private Integer f32603h = null;

    /* renamed from: d */
    private String f32600d = null;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.xiaomi.mipush.sdk.u$a */
    /* loaded from: classes2.dex */
    public static class C10495a<T extends AbstractC11361a<T, ?>> {

        /* renamed from: a */
        T f32604a;

        /* renamed from: b */
        EnumC10766a f32605b;

        /* renamed from: c */
        boolean f32606c;

        C10495a() {
        }
    }

    private C10494u(Context context) {
        this.f32598a = false;
        this.f32601f = null;
        this.f32599c = context.getApplicationContext();
        this.f32598a = m4918h();
        this.f32601f = new HandlerC10496v(this, Looper.getMainLooper());
    }

    /* renamed from: a */
    public static C10494u m4943a(Context context) {
        if (f32596b == null) {
            f32596b = new C10494u(context);
        }
        return f32596b;
    }

    /* renamed from: a */
    private void m4942a(Intent intent) {
        try {
            this.f32599c.startService(intent);
        } catch (Exception e) {
            AbstractC10404b.m5267a(e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public final void m4935a(String str, boolean z) {
        C10775ae c10775ae;
        int i = 0;
        if (!C10469a.m5034a(this.f32599c).m5028b() || !C10423d.m5213d(this.f32599c)) {
            return;
        }
        C10775ae c10775ae2 = new C10775ae();
        Intent m4917i = m4917i();
        if (TextUtils.isEmpty(str)) {
            str = MiPushClient.generatePacketID();
            c10775ae2.m3706a(str);
            c10775ae = new C10775ae(str, true);
            synchronized (C10489p.class) {
                C10489p.m4970a(this.f32599c).m4969a(str);
            }
        } else {
            c10775ae2.m3706a(str);
            c10775ae = new C10775ae(str, true);
        }
        if (z) {
            c10775ae2.m3695c(EnumC10821o.DisablePushMessage.f34418N);
            c10775ae.m3695c(EnumC10821o.DisablePushMessage.f34418N);
            m4917i.setAction("com.xiaomi.mipush.DISABLE_PUSH_MESSAGE");
        } else {
            c10775ae2.m3695c(EnumC10821o.EnablePushMessage.f34418N);
            c10775ae.m3695c(EnumC10821o.EnablePushMessage.f34418N);
            m4917i.setAction("com.xiaomi.mipush.ENABLE_PUSH_MESSAGE");
        }
        c10775ae2.m3698b(C10469a.m5034a(this.f32599c).m5026c());
        c10775ae2.m3693d(this.f32599c.getPackageName());
        m4932a(c10775ae2, EnumC10766a.Notification, false, null);
        c10775ae.m3698b(C10469a.m5034a(this.f32599c).m5026c());
        c10775ae.m3693d(this.f32599c.getPackageName());
        byte[] m3471a = C10799aq.m3471a(C10490q.m4961a(this.f32599c, c10775ae, EnumC10766a.Notification, false, this.f32599c.getPackageName(), C10469a.m5034a(this.f32599c).m5026c()));
        if (m3471a != null) {
            m4917i.putExtra("mipush_payload", m3471a);
            m4917i.putExtra("com.xiaomi.mipush.MESSAGE_CACHE", true);
            m4917i.putExtra("mipush_app_id", C10469a.m5034a(this.f32599c).m5026c());
            m4917i.putExtra("mipush_app_token", C10469a.m5034a(this.f32599c).m5025d());
            m4942a(m4917i);
        }
        Message obtain = Message.obtain();
        if (z) {
            i = 1;
        }
        obtain.obj = str;
        obtain.arg1 = i;
        this.f32601f.sendMessageDelayed(obtain, 5000L);
    }

    /* renamed from: h */
    private boolean m4918h() {
        try {
            PackageInfo packageInfo = this.f32599c.getPackageManager().getPackageInfo("com.xiaomi.xmsf", 4);
            if (packageInfo == null) {
                return false;
            }
            return packageInfo.versionCode >= 105;
        } catch (Exception e) {
            return false;
        }
    }

    /* renamed from: i */
    private Intent m4917i() {
        Intent intent = new Intent();
        String packageName = this.f32599c.getPackageName();
        if (!m4923c() || "com.xiaomi.xmsf".equals(packageName)) {
            m4914l();
            intent.setComponent(new ComponentName(this.f32599c, "com.xiaomi.push.service.XMPushService"));
            intent.putExtra("mipush_app_package", packageName);
        } else {
            intent.setPackage("com.xiaomi.xmsf");
            intent.setClassName("com.xiaomi.xmsf", m4916j());
            intent.putExtra("mipush_app_package", packageName);
            m4915k();
        }
        return intent;
    }

    /* renamed from: j */
    private String m4916j() {
        return this.f32599c.getPackageManager().getPackageInfo("com.xiaomi.xmsf", 4).versionCode >= 106 ? "com.xiaomi.push.service.XMPushService" : "com.xiaomi.xmsf.push.service.XMPushService";
    }

    /* renamed from: k */
    private void m4915k() {
        try {
            this.f32599c.getPackageManager().setComponentEnabledSetting(new ComponentName(this.f32599c, "com.xiaomi.push.service.XMPushService"), 2, 1);
        } catch (Throwable th) {
        }
    }

    /* renamed from: l */
    private void m4914l() {
        try {
            this.f32599c.getPackageManager().setComponentEnabledSetting(new ComponentName(this.f32599c, "com.xiaomi.push.service.XMPushService"), 1, 1);
        } catch (Throwable th) {
        }
    }

    /* renamed from: m */
    private boolean m4913m() {
        String packageName = this.f32599c.getPackageName();
        return packageName.contains("miui") || packageName.contains("xiaomi") || (this.f32599c.getApplicationInfo().flags & 1) != 0;
    }

    /* renamed from: a */
    public void m4945a() {
        m4942a(m4917i());
    }

    /* renamed from: a */
    public void m4944a(int i) {
        Intent m4917i = m4917i();
        m4917i.setAction("com.xiaomi.mipush.CLEAR_NOTIFICATION");
        m4917i.putExtra(AbstractC10621am.f33050y, this.f32599c.getPackageName());
        m4917i.putExtra(AbstractC10621am.f33051z, i);
        m4942a(m4917i);
    }

    /* renamed from: a */
    public final void m4938a(C10777af c10777af, boolean z) {
        this.f32602g = null;
        Intent m4917i = m4917i();
        byte[] m3471a = C10799aq.m3471a(C10490q.m4962a(this.f32599c, c10777af, EnumC10766a.Registration));
        if (m3471a == null) {
            AbstractC10404b.m5269a("register fail, because msgBytes is null.");
            return;
        }
        m4917i.setAction("com.xiaomi.mipush.REGISTER_APP");
        m4917i.putExtra("mipush_app_id", C10469a.m5034a(this.f32599c).m5026c());
        m4917i.putExtra("mipush_payload", m3471a);
        m4917i.putExtra("mipush_session", this.f32600d);
        m4917i.putExtra("mipush_env_chanage", z);
        m4917i.putExtra("mipush_env_type", C10469a.m5034a(this.f32599c).m5016m());
        if (!C10423d.m5213d(this.f32599c) || !m4919g()) {
            this.f32602g = m4917i;
        } else {
            m4942a(m4917i);
        }
    }

    /* renamed from: a */
    public final void m4937a(C10791am c10791am) {
        Intent m4917i = m4917i();
        byte[] m3471a = C10799aq.m3471a(C10490q.m4962a(this.f32599c, c10791am, EnumC10766a.UnRegistration));
        if (m3471a == null) {
            AbstractC10404b.m5269a("unregister fail, because msgBytes is null.");
            return;
        }
        m4917i.setAction("com.xiaomi.mipush.UNREGISTER_APP");
        m4917i.putExtra("mipush_app_id", C10469a.m5034a(this.f32599c).m5026c());
        m4917i.putExtra("mipush_payload", m3471a);
        m4942a(m4917i);
    }

    /* renamed from: a */
    public void m4936a(String str, String str2) {
        Intent m4917i = m4917i();
        m4917i.setAction("com.xiaomi.mipush.CLEAR_NOTIFICATION");
        m4917i.putExtra(AbstractC10621am.f33050y, this.f32599c.getPackageName());
        m4917i.putExtra(AbstractC10621am.f33021D, str);
        m4917i.putExtra(AbstractC10621am.f33022E, str2);
        m4942a(m4917i);
    }

    /* renamed from: a */
    public final <T extends AbstractC11361a<T, ?>> void m4934a(T t, EnumC10766a enumC10766a, C10826r c10826r) {
        m4932a(t, enumC10766a, !enumC10766a.equals(EnumC10766a.Registration), c10826r);
    }

    /* renamed from: a */
    public <T extends AbstractC11361a<T, ?>> void m4933a(T t, EnumC10766a enumC10766a, boolean z) {
        C10495a c10495a = new C10495a();
        c10495a.f32604a = t;
        c10495a.f32605b = enumC10766a;
        c10495a.f32606c = z;
        synchronized (f32597e) {
            f32597e.add(c10495a);
            if (f32597e.size() > 10) {
                f32597e.remove(0);
            }
        }
    }

    /* renamed from: a */
    public final <T extends AbstractC11361a<T, ?>> void m4932a(T t, EnumC10766a enumC10766a, boolean z, C10826r c10826r) {
        m4930a(t, enumC10766a, z, true, c10826r, true);
    }

    /* renamed from: a */
    public final <T extends AbstractC11361a<T, ?>> void m4931a(T t, EnumC10766a enumC10766a, boolean z, C10826r c10826r, boolean z2) {
        m4930a(t, enumC10766a, z, true, c10826r, z2);
    }

    /* renamed from: a */
    public final <T extends AbstractC11361a<T, ?>> void m4930a(T t, EnumC10766a enumC10766a, boolean z, boolean z2, C10826r c10826r, boolean z3) {
        m4929a(t, enumC10766a, z, z2, c10826r, z3, this.f32599c.getPackageName(), C10469a.m5034a(this.f32599c).m5026c());
    }

    /* renamed from: a */
    public final <T extends AbstractC11361a<T, ?>> void m4929a(T t, EnumC10766a enumC10766a, boolean z, boolean z2, C10826r c10826r, boolean z3, String str, String str2) {
        if (!C10469a.m5034a(this.f32599c).m5020i()) {
            if (z2) {
                m4933a((C10494u) t, enumC10766a, z);
                return;
            } else {
                AbstractC10404b.m5269a("drop the message before initialization.");
                return;
            }
        }
        Intent m4917i = m4917i();
        C10769ab m4961a = C10490q.m4961a(this.f32599c, t, enumC10766a, z, str, str2);
        if (c10826r != null) {
            m4961a.m3748a(c10826r);
        }
        byte[] m3471a = C10799aq.m3471a(m4961a);
        if (m3471a == null) {
            AbstractC10404b.m5269a("send message fail, because msgBytes is null.");
            return;
        }
        m4917i.setAction("com.xiaomi.mipush.SEND_MESSAGE");
        m4917i.putExtra("mipush_payload", m3471a);
        m4917i.putExtra("com.xiaomi.mipush.MESSAGE_CACHE", z3);
        m4942a(m4917i);
    }

    /* renamed from: a */
    public final void m4928a(boolean z) {
        m4927a(z, (String) null);
    }

    /* renamed from: a */
    public final void m4927a(boolean z, String str) {
        if (z) {
            C10489p.m4970a(this.f32599c).m4964f("disable_syncing");
        } else {
            C10489p.m4970a(this.f32599c).m4964f("enable_syncing");
        }
        m4935a(str, z);
    }

    /* renamed from: b */
    public final void m4926b() {
        Intent m4917i = m4917i();
        m4917i.setAction("com.xiaomi.mipush.DISABLE_PUSH");
        m4942a(m4917i);
    }

    /* renamed from: b */
    public void m4925b(int i) {
        Intent m4917i = m4917i();
        m4917i.setAction("com.xiaomi.mipush.SET_NOTIFICATION_TYPE");
        m4917i.putExtra(AbstractC10621am.f33050y, this.f32599c.getPackageName());
        m4917i.putExtra(AbstractC10621am.f33018A, i);
        m4917i.putExtra(AbstractC10621am.f33020C, C10432c.m5178b(this.f32599c.getPackageName() + i));
        m4942a(m4917i);
    }

    /* renamed from: c */
    public boolean m4923c() {
        return this.f32598a && 1 == C10469a.m5034a(this.f32599c).m5016m();
    }

    /* renamed from: d */
    public void m4922d() {
        if (this.f32602g != null) {
            m4942a(this.f32602g);
            this.f32602g = null;
        }
    }

    /* renamed from: e */
    public void m4921e() {
        synchronized (f32597e) {
            Iterator<C10495a> it2 = f32597e.iterator();
            while (it2.hasNext()) {
                C10495a next = it2.next();
                m4930a(next.f32604a, next.f32605b, next.f32606c, false, null, true);
            }
            f32597e.clear();
        }
    }

    /* renamed from: f */
    public void m4920f() {
        Intent m4917i = m4917i();
        m4917i.setAction("com.xiaomi.mipush.SET_NOTIFICATION_TYPE");
        m4917i.putExtra(AbstractC10621am.f33050y, this.f32599c.getPackageName());
        m4917i.putExtra(AbstractC10621am.f33020C, C10432c.m5178b(this.f32599c.getPackageName()));
        m4942a(m4917i);
    }

    /* renamed from: g */
    public boolean m4919g() {
        if (!m4923c() || !m4913m()) {
            return true;
        }
        if (this.f32603h == null) {
            this.f32603h = Integer.valueOf(C10625ao.m4356a(this.f32599c).m4355b());
            if (this.f32603h.intValue() == 0) {
                this.f32599c.getContentResolver().registerContentObserver(C10625ao.m4356a(this.f32599c).m4354c(), false, new C10497w(this, new Handler(Looper.getMainLooper())));
            }
        }
        return this.f32603h.intValue() != 0;
    }
}
