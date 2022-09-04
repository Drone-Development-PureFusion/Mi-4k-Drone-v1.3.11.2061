package com.fimi.soul.biz.p181i;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Handler;
import com.fimi.kernel.utils.C1685x;
import com.fimi.soul.drone.C2083a;
import com.fimi.soul.module.p214c.C2523d;
import com.fimi.soul.utils.C3103au;
import java.util.ArrayList;
import java.util.List;
/* renamed from: com.fimi.soul.biz.i.a */
/* loaded from: classes.dex */
public class C1867a {

    /* renamed from: a */
    public static final int f5078a = 0;

    /* renamed from: b */
    public static final int f5079b = 1;

    /* renamed from: c */
    private List<String> f5080c;

    /* renamed from: d */
    private Handler f5081d;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.fimi.soul.biz.i.a$a */
    /* loaded from: classes.dex */
    public static class C1871a {

        /* renamed from: a */
        private static final C1867a f5091a = new C1867a();

        private C1871a() {
        }
    }

    private C1867a() {
        this.f5081d = new Handler();
        this.f5080c = new ArrayList();
    }

    /* renamed from: a */
    public static C1867a m33847a() {
        return C1871a.f5091a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m33846a(final int i, final C2083a c2083a) {
        if (c2083a.mo32905ac()) {
            this.f5081d.post(new Runnable() { // from class: com.fimi.soul.biz.i.a.2
                @Override // java.lang.Runnable
                public void run() {
                    if (c2083a.mo32905ac()) {
                        if (1 == i && !c2083a.m33009am()) {
                            C2523d.m31374a(c2083a).m31368c(i);
                        } else if (i != 0) {
                        } else {
                            C2523d.m31374a(c2083a).m31368c(i);
                        }
                    }
                }
            });
        }
    }

    /* renamed from: a */
    public String m33845a(Context context) {
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        return C3103au.m29184r(context) ? activityManager.getRunningTasks(2).get(1).topActivity.getShortClassName() : activityManager.getRunningTasks(1).get(0).topActivity.getShortClassName();
    }

    /* renamed from: a */
    public void m33842a(final C2083a c2083a) {
        C1685x.m34455b(new Runnable() { // from class: com.fimi.soul.biz.i.a.3
            @Override // java.lang.Runnable
            public void run() {
                if (!C1867a.this.f5080c.contains(C1867a.this.m33845a(c2083a.f5919d))) {
                    C1867a.this.m33846a(0, c2083a);
                } else {
                    C1867a.this.m33846a(1, c2083a);
                }
            }
        });
    }

    /* renamed from: a */
    public void m33841a(String str) {
        String m33838c = m33838c(str);
        if (!this.f5080c.contains(m33838c)) {
            this.f5080c.add(m33838c);
        }
    }

    /* renamed from: a */
    public void m33840a(final String str, final int i, final C2083a c2083a) {
        C1685x.m34455b(new Runnable() { // from class: com.fimi.soul.biz.i.a.1
            @Override // java.lang.Runnable
            public void run() {
                String m33845a = C1867a.this.m33845a(c2083a.f5919d);
                String m33838c = C1867a.this.m33838c(str);
                if (C1867a.this.f5080c.contains(m33838c) && m33838c.equals(m33845a) && 1 == i) {
                    C1867a.this.m33846a(i, c2083a);
                } else if (i != 0) {
                } else {
                    C1867a.this.m33846a(i, c2083a);
                }
            }
        });
    }

    /* renamed from: b */
    public void m33839b(String str) {
        String m33838c = m33838c(str);
        if (this.f5080c.contains(m33838c)) {
            this.f5080c.remove(m33838c);
        }
    }

    /* renamed from: c */
    public String m33838c(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(".").append(str);
        return sb.toString();
    }
}
