package com.fimi.soul.module.update;

import java.util.Timer;
import java.util.TimerTask;
/* renamed from: com.fimi.soul.module.update.c */
/* loaded from: classes.dex */
public class C3030c {

    /* renamed from: b */
    AbstractC3032a f11328b;

    /* renamed from: d */
    private int f11330d;

    /* renamed from: c */
    private final int f11329c = 100;

    /* renamed from: a */
    Timer f11327a = new Timer();

    /* renamed from: com.fimi.soul.module.update.c$a */
    /* loaded from: classes.dex */
    public interface AbstractC3032a {
        /* renamed from: a */
        void mo28057a(boolean z);
    }

    public C3030c(int i, AbstractC3032a abstractC3032a) {
        this.f11330d = i;
        this.f11328b = abstractC3032a;
    }

    /* renamed from: a */
    static /* synthetic */ int m29527a(C3030c c3030c) {
        int i = c3030c.f11330d;
        c3030c.f11330d = i + 1;
        return i;
    }

    /* renamed from: a */
    public void m29529a() {
        TimerTask timerTask = new TimerTask() { // from class: com.fimi.soul.module.update.c.1
            @Override // java.util.TimerTask, java.lang.Runnable
            public void run() {
                C3030c.m29527a(C3030c.this);
                if (C3030c.this.f11330d == 100) {
                    C3030c.this.m29526b();
                    C3030c.this.m29523d();
                    C3030c.this.f11328b.mo28057a(true);
                }
                System.out.println(" counter=" + C3030c.this.f11330d);
            }
        };
        if (this.f11327a != null) {
            this.f11327a.schedule(timerTask, 100L, 1000L);
        }
    }

    /* renamed from: a */
    public void m29528a(int i) {
        this.f11330d = i;
    }

    /* renamed from: b */
    public void m29526b() {
        m29528a(0);
    }

    /* renamed from: c */
    public int m29524c() {
        return this.f11330d;
    }

    /* renamed from: d */
    public void m29523d() {
        this.f11330d = 0;
        if (this.f11327a != null) {
            this.f11327a.cancel();
            this.f11327a = null;
        }
    }
}
