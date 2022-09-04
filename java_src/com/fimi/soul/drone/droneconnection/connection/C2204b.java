package com.fimi.soul.drone.droneconnection.connection;

import android.util.Log;
import com.fimi.soul.base.DroidPlannerApp;
import com.fimi.soul.biz.p170b.C1769c;
import com.fimi.soul.biz.p170b.C1772d;
import com.fimi.soul.biz.p178f.C1845a;
import com.fimi.soul.drone.C2083a;
import com.fimi.soul.drone.droneconnection.connection.p198a.C2203a;
import com.fimi.soul.drone.p204h.C2279c;
import com.fimi.soul.utils.C3103au;
/* renamed from: com.fimi.soul.drone.droneconnection.connection.b */
/* loaded from: classes.dex */
public class C2204b {

    /* renamed from: f */
    private static boolean f6945f = false;

    /* renamed from: g */
    private static boolean f6946g = false;

    /* renamed from: j */
    private static boolean f6947j = false;

    /* renamed from: i */
    private boolean f6954i;

    /* renamed from: h */
    private boolean f6953h = true;

    /* renamed from: k */
    private EnumC2207b f6955k = EnumC2207b.IDLE;

    /* renamed from: b */
    public DroidPlannerApp f6949b = DroidPlannerApp.m34272h();

    /* renamed from: a */
    public C2083a f6948a = this.f6949b.f4493a;

    /* renamed from: d */
    private C1772d f6951d = C1772d.m34208a();

    /* renamed from: e */
    private C1769c f6952e = C1769c.m34218a();

    /* renamed from: c */
    private C1845a f6950c = C1845a.m33920b();

    /* renamed from: com.fimi.soul.drone.droneconnection.connection.b$a */
    /* loaded from: classes.dex */
    public class RunnableC2206a implements Runnable {
        public RunnableC2206a() {
        }

        public void a() {
            switch (C2204b.this.f6955k) {
                case IDLE:
                    C2204b.this.m32710a(" 中继心跳需要两秒钟1 ");
                    if (C2204b.this.f6950c.m33919c()) {
                        C2204b.this.f6955k = EnumC2207b.RELAYCONNECT;
                        return;
                    }
                    C2204b.this.m32710a(" 中继心跳需要两秒钟2 ");
                    if (C3103au.m29207d(C2279c.m32453b())) {
                        C2204b.this.m32710a(" Wifi 已经连接");
                        C2204b.this.f6950c.m33922a();
                        C2204b.this.m32710a(" 中继心跳需要两秒钟 3");
                        C2204b.this.f6952e.m34215b();
                        C2204b.this.m32710a(" 中继心跳需要两秒钟 4");
                    }
                    C2204b.this.m32714a(3000);
                    return;
                case RELAYCONNECT:
                    if (C2204b.this.f6948a.mo32906ab().mo32588a()) {
                        C2204b.this.f6955k = EnumC2207b.RCCONNECTED;
                        return;
                    }
                    C2204b.this.m32697f();
                    C2204b.this.f6955k = EnumC2207b.HANDSHAKE;
                    return;
                case HANDSHAKE:
                    if (C2204b.m32708b()) {
                        C2204b.this.m32714a(3000);
                        return;
                    }
                    C2204b.this.m32714a(1500);
                    C2204b.this.f6955k = EnumC2207b.RCCONNECTED;
                    return;
                case RCCONNECTED:
                    C2204b.this.m32714a(3000);
                    if (C2204b.this.f6948a.mo32906ab().mo32588a()) {
                        return;
                    }
                    C2204b.this.f6955k = EnumC2207b.IDLE;
                    C2204b.this.f6950c.m33921a(false);
                    return;
                default:
                    return;
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            while (!C2204b.this.f6954i) {
                if (C2204b.m32705c()) {
                    C2204b.this.m32710a(" 连接界面在连接。。。。");
                    C2204b.this.m32714a(3000);
                } else if (C2204b.m32715a()) {
                    a();
                } else {
                    C2204b.this.m32710a(" ping run threadSleep 没有事情做---等待中");
                    C2204b.this.m32714a(3000);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.fimi.soul.drone.droneconnection.connection.b$b */
    /* loaded from: classes.dex */
    public enum EnumC2207b {
        IDLE,
        RELAYCONNECT,
        HANDSHAKE,
        RCCONNECTED
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m32714a(int i) {
        try {
            Thread.sleep(i);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        m32710a("" + System.currentTimeMillis() + " DroidConnectProcess handshake=" + f6945f + " state=" + this.f6955k + " MavClient().isConnected()=" + this.f6948a.mo32906ab().mo32588a());
    }

    /* renamed from: a */
    public static synchronized void m32709a(boolean z) {
        synchronized (C2204b.class) {
            f6947j = z;
        }
    }

    /* renamed from: a */
    public static synchronized boolean m32715a() {
        boolean z;
        synchronized (C2204b.class) {
            z = f6947j;
        }
        return z;
    }

    /* renamed from: b */
    public static synchronized void m32706b(boolean z) {
        synchronized (C2204b.class) {
            f6945f = z;
        }
    }

    /* renamed from: b */
    public static synchronized boolean m32708b() {
        boolean z;
        synchronized (C2204b.class) {
            z = f6945f;
        }
        return z;
    }

    /* renamed from: c */
    public static synchronized void m32703c(boolean z) {
        synchronized (C2204b.class) {
            f6946g = z;
        }
    }

    /* renamed from: c */
    public static synchronized boolean m32705c() {
        boolean z;
        synchronized (C2204b.class) {
            z = f6946g;
        }
        return z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f */
    public void m32697f() {
        m32706b(true);
        m32710a(" tryConnetDrone " + f6945f + " " + this.f6955k + " ");
        C2203a.m32716a(C2279c.f7267d);
        this.f6948a.mo32906ab().mo32581b();
    }

    /* renamed from: a */
    public void m32710a(String str) {
        if (this.f6953h) {
            Log.i("zdy", str);
        }
    }

    /* renamed from: d */
    public void m32702d() {
        m32699e();
        new Thread(new RunnableC2206a()).start();
    }

    /* renamed from: d */
    public void m32700d(boolean z) {
        this.f6954i = z;
    }

    /* renamed from: e */
    public void m32699e() {
        if (m32715a()) {
            if (this.f6950c.m33919c()) {
                this.f6955k = EnumC2207b.RELAYCONNECT;
            }
            if (this.f6955k != EnumC2207b.RELAYCONNECT || !this.f6948a.mo32905ac()) {
                return;
            }
            this.f6955k = EnumC2207b.RCCONNECTED;
        }
    }
}
