package com.fimi.soul.utils;

import java.net.InetAddress;
import java.net.UnknownHostException;
/* renamed from: com.fimi.soul.utils.l */
/* loaded from: classes.dex */
public class C3128l extends Thread {

    /* renamed from: a */
    private InetAddress f11672a;

    /* renamed from: b */
    private String f11673b;

    public C3128l(String str) {
        this.f11673b = str;
    }

    /* renamed from: a */
    private synchronized void m29071a(InetAddress inetAddress) {
        this.f11672a = inetAddress;
    }

    /* renamed from: a */
    public synchronized String m29072a() {
        return this.f11672a != null ? this.f11672a.getHostAddress() : null;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        try {
            m29071a(InetAddress.getByName(this.f11673b));
        } catch (UnknownHostException e) {
        }
    }
}
