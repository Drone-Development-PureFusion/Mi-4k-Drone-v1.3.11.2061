package com.fimi.p153f;

import android.util.Log;
import com.fimi.p148c.AbstractC1522a;
import com.fimi.p152e.C1545c;
import com.fimi.p152e.C1549d;
import com.fimi.soul.entity.CameraValue;
import java.net.InetSocketAddress;
import java.net.Socket;
/* renamed from: com.fimi.f.a */
/* loaded from: classes.dex */
public class RunnableC1551a implements Runnable {

    /* renamed from: e */
    private static final String f3788e = "ConnectThread";

    /* renamed from: a */
    Socket f3789a;

    /* renamed from: b */
    private final String f3790b = "192.168.42.1";

    /* renamed from: c */
    private AbstractC1522a f3791c;

    /* renamed from: d */
    private boolean f3792d;

    public RunnableC1551a(AbstractC1522a abstractC1522a) {
        this.f3791c = abstractC1522a;
    }

    /* renamed from: a */
    public void m35203a() {
        this.f3792d = true;
    }

    /* renamed from: a */
    public boolean m35202a(String str) {
        boolean z = false;
        Process process = null;
        try {
            process = Runtime.getRuntime().exec("ping -c 1 -W 1 " + str);
            if (process.waitFor() == 0) {
                z = true;
            }
            if (process != null) {
                process.destroy();
            }
        } catch (Exception e) {
            if (process != null) {
                process.destroy();
            }
        } catch (Throwable th) {
            if (process != null) {
                process.destroy();
            }
            throw th;
        }
        return z;
    }

    @Override // java.lang.Runnable
    public void run() {
        while (!this.f3792d) {
            boolean m35202a = m35202a("192.168.42.1");
            Log.d(f3788e, "run: isAutoConnect:" + CameraValue.isAutoConnect + ",hasSession:" + CameraValue.hasSession);
            if (!m35202a || C1549d.m35208b().m35205d() || !CameraValue.isAutoConnect || !CameraValue.hasSession) {
                try {
                    Thread.sleep(2000L);
                } catch (InterruptedException e) {
                    this.f3792d = true;
                    e.printStackTrace();
                }
            } else {
                try {
                    this.f3789a = new Socket();
                    this.f3789a.connect(new InetSocketAddress("192.168.42.1", 12080), 5000);
                    C1545c c1545c = new C1545c(this.f3789a);
                    c1545c.mo35225a();
                    C1549d.m35208b().m35211a(c1545c);
                } catch (Exception e2) {
                    e2.printStackTrace();
                    this.f3791c.mo28161c("Socket Exception" + e2.toString());
                }
            }
        }
    }
}
