package com.fimi.soul.module.droneFragment;

import android.os.Message;
import com.fimi.kernel.AbstractC1584b;
import com.fimi.overseas.soul.C1704R;
import com.fimi.soul.drone.C2083a;
import com.fimi.soul.drone.p194c.C2102a;
import com.fimi.soul.drone.p194c.C2103b;
import com.google.android.gms.maps.C8499b;
import com.google.android.gms.maps.C8500c;
import com.google.android.gms.maps.model.C8610b;
import com.google.android.gms.maps.model.C8615g;
import java.util.concurrent.atomic.AtomicInteger;
/* renamed from: com.fimi.soul.module.droneFragment.c */
/* loaded from: classes.dex */
public class C2629c extends AbstractC1584b {

    /* renamed from: a */
    public static final int f8812a = 0;

    /* renamed from: b */
    public static final int f8813b = 1;

    /* renamed from: f */
    private static C8615g f8816f;

    /* renamed from: e */
    private C2083a f8818e;

    /* renamed from: g */
    private C8500c f8819g;

    /* renamed from: i */
    private Runnable f8820i = new Runnable() { // from class: com.fimi.soul.module.droneFragment.c.1
        @Override // java.lang.Runnable
        public void run() {
            if (C2629c.f8816f != null) {
                C2629c.this.f8821j = true;
                C2629c.f8814c.set(1);
                C2629c.f8816f.m11033a();
                C8615g unused = C2629c.f8816f = null;
            }
        }
    };

    /* renamed from: j */
    private boolean f8821j = true;

    /* renamed from: c */
    private static AtomicInteger f8814c = new AtomicInteger(0);

    /* renamed from: d */
    private static AtomicInteger f8815d = new AtomicInteger(1);

    /* renamed from: h */
    private static final C2629c f8817h = new C2629c();

    private C2629c() {
    }

    /* renamed from: a */
    public static void m30956a(int i) {
        f8815d.set(i);
    }

    /* renamed from: b */
    public static AtomicInteger m30951b() {
        return f8815d;
    }

    /* renamed from: c */
    public static C2629c m30949c() {
        return f8817h;
    }

    /* renamed from: d */
    public static AtomicInteger m30948d() {
        return f8814c;
    }

    /* renamed from: f */
    public static void m30946f() {
        if (f8816f != null) {
            f8816f.m11033a();
            f8816f = null;
        }
    }

    @Override // com.fimi.kernel.AbstractC1584b
    /* renamed from: a */
    protected void mo30955a(Message message) {
    }

    /* renamed from: a */
    public void m30954a(C2083a c2083a) {
        if (c2083a.m33001au().m32390g().isLightStream()) {
            return;
        }
        this.f8818e = c2083a;
        this.f8819g = c2083a.m33012aj();
        if (!c2083a.mo32906ab().mo32588a() || !c2083a.mo32905ac() || ((c2083a.m33002at().f27462a <= 1.0d || c2083a.m33002at().f27463b <= 1.0d || f8814c.get() != 0) && f8815d.get() != 0)) {
            if (f8816f == null) {
                return;
            }
            f8816f.m11030a(c2083a.m33002at());
        } else if (f8815d.get() != 0) {
            if (f8816f == null) {
                return;
            }
            f8816f.m11030a(c2083a.m33002at());
        } else {
            f8815d.set(1);
            if (f8816f == null) {
                f8816f = this.f8819g.m11577a(C2102a.m32887a(c2083a.m33002at()).m11352a(C8610b.m11085a(C2103b.m32882b((int) C1704R.C1705drawable.handpiece_aspect_infor, c2083a.f5919d.getResources().getString(C1704R.C1707string.flighthead), "", c2083a.f5919d))));
            }
            this.f8819g.m11569b(C8499b.m11619a(c2083a.m33002at(), 18.0f));
            if (f8816f == null || !this.f8821j) {
                return;
            }
            this.f8821j = false;
            a().postDelayed(this.f8820i, 5000L);
        }
    }

    /* renamed from: b */
    public void m30950b(int i) {
        f8814c.set(i);
    }

    /* renamed from: e */
    public void m30947e() {
        this.f8821j = true;
    }
}
