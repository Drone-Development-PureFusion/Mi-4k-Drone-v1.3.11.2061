package com.google.android.gms.common.stats;

import android.annotation.SuppressLint;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Debug;
import android.os.Process;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.common.stats.C4670c;
import com.google.android.gms.common.util.C4681d;
import com.google.android.gms.common.util.C4697t;
import com.xiaomi.mipush.sdk.Constants;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
/* renamed from: com.google.android.gms.common.stats.b */
/* loaded from: classes2.dex */
public class C4669b {

    /* renamed from: a */
    private static final Object f17257a = new Object();

    /* renamed from: b */
    private static C4669b f17258b;

    /* renamed from: h */
    private static Integer f17259h;

    /* renamed from: c */
    private final List<String> f17260c;

    /* renamed from: d */
    private final List<String> f17261d;

    /* renamed from: e */
    private final List<String> f17262e;

    /* renamed from: f */
    private final List<String> f17263f;

    /* renamed from: g */
    private C4674e f17264g;

    /* renamed from: i */
    private C4674e f17265i;

    private C4669b() {
        if (m23189c() == C4673d.f17277b) {
            this.f17260c = Collections.EMPTY_LIST;
            this.f17261d = Collections.EMPTY_LIST;
            this.f17262e = Collections.EMPTY_LIST;
            this.f17263f = Collections.EMPTY_LIST;
            return;
        }
        String m17161a = C4670c.C4671a.f17269b.m17161a();
        this.f17260c = m17161a == null ? Collections.EMPTY_LIST : Arrays.asList(m17161a.split(Constants.ACCEPT_TIME_SEPARATOR_SP));
        String m17161a2 = C4670c.C4671a.f17270c.m17161a();
        this.f17261d = m17161a2 == null ? Collections.EMPTY_LIST : Arrays.asList(m17161a2.split(Constants.ACCEPT_TIME_SEPARATOR_SP));
        String m17161a3 = C4670c.C4671a.f17271d.m17161a();
        this.f17262e = m17161a3 == null ? Collections.EMPTY_LIST : Arrays.asList(m17161a3.split(Constants.ACCEPT_TIME_SEPARATOR_SP));
        String m17161a4 = C4670c.C4671a.f17272e.m17161a();
        this.f17263f = m17161a4 == null ? Collections.EMPTY_LIST : Arrays.asList(m17161a4.split(Constants.ACCEPT_TIME_SEPARATOR_SP));
        this.f17264g = new C4674e(1024, C4670c.C4671a.f17273f.m17161a().longValue());
        this.f17265i = new C4674e(1024, C4670c.C4671a.f17273f.m17161a().longValue());
    }

    /* renamed from: a */
    public static C4669b m23204a() {
        synchronized (f17257a) {
            if (f17258b == null) {
                f17258b = new C4669b();
            }
        }
        return f17258b;
    }

    /* renamed from: a */
    private static String m23203a(int i, int i2) {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        StringBuffer stringBuffer = new StringBuffer();
        int i3 = i2 + i;
        while (i < i3) {
            stringBuffer.append(m23193a(stackTrace, i)).append(" ");
            i++;
        }
        return stringBuffer.toString();
    }

    /* renamed from: a */
    private String m23195a(ServiceConnection serviceConnection) {
        return String.valueOf((Process.myPid() << 32) | System.identityHashCode(serviceConnection));
    }

    /* renamed from: a */
    private static String m23193a(StackTraceElement[] stackTraceElementArr, int i) {
        if (i + 4 >= stackTraceElementArr.length) {
            return "<bottom of call stack>";
        }
        StackTraceElement stackTraceElement = stackTraceElementArr[i + 4];
        String valueOf = String.valueOf(stackTraceElement.getClassName());
        String valueOf2 = String.valueOf(stackTraceElement.getMethodName());
        return new StringBuilder(String.valueOf(valueOf).length() + 13 + String.valueOf(valueOf2).length()).append(valueOf).append(".").append(valueOf2).append(":").append(stackTraceElement.getLineNumber()).toString();
    }

    /* renamed from: a */
    private void m23198a(Context context, String str, int i, String str2, String str3, String str4, String str5) {
        long currentTimeMillis = System.currentTimeMillis();
        String str6 = null;
        if ((m23189c() & C4673d.f17281f) != 0 && i != 13) {
            str6 = m23203a(3, 5);
        }
        long j = 0;
        if ((m23189c() & C4673d.f17283h) != 0) {
            j = Debug.getNativeHeapAllocatedSize();
        }
        context.startService(new Intent().setComponent(C4673d.f17276a).putExtra("com.google.android.gms.common.stats.EXTRA_LOG_EVENT", (i == 1 || i == 4 || i == 14) ? new ConnectionEvent(currentTimeMillis, i, null, null, null, null, str6, str, SystemClock.elapsedRealtime(), j) : new ConnectionEvent(currentTimeMillis, i, str2, str3, str4, str5, str6, str, SystemClock.elapsedRealtime(), j)));
    }

    /* renamed from: a */
    private void m23196a(Context context, String str, String str2, Intent intent, int i) {
        String str3;
        String str4;
        String str5 = null;
        if (!m23192b() || this.f17264g == null) {
            return;
        }
        if (i != 4 && i != 1) {
            ServiceInfo m23191b = m23191b(context, intent);
            if (m23191b == null) {
                Log.w("ConnectionTracker", String.format("Client %s made an invalid request %s", str2, intent.toUri(0)));
                return;
            }
            str4 = m23191b.processName;
            str3 = m23191b.name;
            str5 = C4697t.m23100a();
            if (!m23194a(str5, str2, str4, str3)) {
                return;
            }
            this.f17264g.m23187a(str);
        } else if (!this.f17264g.m23186b(str)) {
            return;
        } else {
            str3 = null;
            str4 = null;
        }
        m23198a(context, str, i, str5, str2, str4, str3);
    }

    /* renamed from: a */
    private boolean m23202a(Context context, Intent intent) {
        ComponentName component = intent.getComponent();
        if (component == null) {
            return false;
        }
        return C4681d.m23153c(context, component.getPackageName());
    }

    /* renamed from: a */
    private boolean m23194a(String str, String str2, String str3, String str4) {
        return !this.f17260c.contains(str) && !this.f17261d.contains(str2) && !this.f17262e.contains(str3) && !this.f17263f.contains(str4) && (!str3.equals(str) || (m23189c() & C4673d.f17282g) == 0);
    }

    /* renamed from: b */
    private static ServiceInfo m23191b(Context context, Intent intent) {
        List<ResolveInfo> queryIntentServices = context.getPackageManager().queryIntentServices(intent, 128);
        if (queryIntentServices == null || queryIntentServices.size() == 0) {
            Log.w("ConnectionTracker", String.format("There are no handler of this intent: %s\n Stack trace: %s", intent.toUri(0), m23203a(3, 20)));
            return null;
        } else if (queryIntentServices.size() <= 1) {
            return queryIntentServices.get(0).serviceInfo;
        } else {
            Log.w("ConnectionTracker", String.format("Multiple handlers found for this intent: %s\n Stack trace: %s", intent.toUri(0), m23203a(3, 20)));
            for (ResolveInfo resolveInfo : queryIntentServices) {
                Log.w("ConnectionTracker", resolveInfo.serviceInfo.name);
            }
            return null;
        }
    }

    /* renamed from: b */
    private boolean m23192b() {
        return false;
    }

    /* renamed from: c */
    private static int m23189c() {
        if (f17259h == null) {
            try {
                f17259h = Integer.valueOf(C4681d.m23157a() ? C4670c.C4671a.f17268a.m17161a().intValue() : C4673d.f17277b);
            } catch (SecurityException e) {
                f17259h = Integer.valueOf(C4673d.f17277b);
            }
        }
        return f17259h.intValue();
    }

    @SuppressLint({"UntrackedBindService"})
    /* renamed from: a */
    public void m23200a(Context context, ServiceConnection serviceConnection) {
        context.unbindService(serviceConnection);
        m23196a(context, m23195a(serviceConnection), (String) null, (Intent) null, 1);
    }

    /* renamed from: a */
    public void m23199a(Context context, ServiceConnection serviceConnection, String str, Intent intent) {
        m23196a(context, m23195a(serviceConnection), str, intent, 3);
    }

    /* renamed from: a */
    public boolean m23201a(Context context, Intent intent, ServiceConnection serviceConnection, int i) {
        return m23197a(context, context.getClass().getName(), intent, serviceConnection, i);
    }

    @SuppressLint({"UntrackedBindService"})
    /* renamed from: a */
    public boolean m23197a(Context context, String str, Intent intent, ServiceConnection serviceConnection, int i) {
        if (m23202a(context, intent)) {
            Log.w("ConnectionTracker", "Attempted to bind to a service in a STOPPED package.");
            return false;
        }
        boolean bindService = context.bindService(intent, serviceConnection, i);
        if (bindService) {
            m23196a(context, m23195a(serviceConnection), str, intent, 2);
        }
        return bindService;
    }

    /* renamed from: b */
    public void m23190b(Context context, ServiceConnection serviceConnection) {
        m23196a(context, m23195a(serviceConnection), (String) null, (Intent) null, 4);
    }
}
