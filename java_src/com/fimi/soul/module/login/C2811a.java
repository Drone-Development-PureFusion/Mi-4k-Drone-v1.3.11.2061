package com.fimi.soul.module.login;

import android.annotation.TargetApi;
import android.os.Handler;
import android.os.Message;
import com.android.volley.C0904d;
import com.fimi.kernel.p158b.p162d.C1629c;
import com.fimi.overseas.soul.C1704R;
import com.fimi.p140a.AbstractC1493b;
import com.fimi.soul.biz.camera.C1783b;
import com.fimi.soul.biz.camera.C1831e;
import com.fimi.soul.biz.camera.p172a.C1781b;
import com.fimi.soul.biz.camera.p173b.AbstractC1789c;
import com.fimi.soul.biz.p170b.C1769c;
import com.fimi.soul.biz.p170b.C1772d;
import com.fimi.soul.biz.p178f.C1845a;
import com.fimi.soul.biz.p179g.C1846a;
import com.fimi.soul.drone.C2083a;
import com.fimi.soul.drone.droneconnection.connection.C2204b;
import com.fimi.soul.drone.droneconnection.connection.p198a.C2203a;
import com.fimi.soul.drone.p201e.C2262o;
import com.fimi.soul.drone.p204h.C2279c;
import com.fimi.soul.module.setting.GimalCalibration.C2874a;
import com.fimi.soul.utils.C3103au;
/* renamed from: com.fimi.soul.module.login.a */
/* loaded from: classes.dex */
public class C2811a extends AbstractC1493b {

    /* renamed from: r */
    private C2083a f9876r;

    /* renamed from: s */
    private LoginActivity f9877s;

    /* renamed from: t */
    private C1845a f9878t;

    /* renamed from: w */
    private C2874a f9881w;

    /* renamed from: q */
    private final int f9875q = 35000;

    /* renamed from: x */
    private final Handler f9882x = new Handler() { // from class: com.fimi.soul.module.login.a.2
        @Override // android.os.Handler
        @TargetApi(17)
        public void handleMessage(Message message) {
            super.handleMessage(message);
            switch (message.what) {
                case 0:
                    if (C2811a.this.f9877s.m30253o() != 2 || C2811a.this.f3582n > 0) {
                        return;
                    }
                    C2811a.this.f9877s.m30283a(4);
                    if (C1846a.m33917a().m33915b() == 1) {
                        C2811a.this.f9877s.m30282a(C1704R.C1707string.rc_tip_error, C1704R.C1707string.unconnetremote);
                    } else {
                        C2811a.this.f9877s.m30282a(C1704R.C1707string.rc_tip_error2, C1704R.C1707string.unconnetremote);
                    }
                    C2811a.this.a();
                    return;
                case 1:
                    if (C2811a.this.f9877s.m30253o() != 2 || C2811a.this.f3582n > 0) {
                        return;
                    }
                    for (int i = 0; !C2811a.this.f9876r.mo32905ac() && i < 5; i++) {
                        C2811a.this.a(50);
                    }
                    if (!C2811a.this.f9876r.mo32905ac()) {
                        C2811a.this.f9877s.m30282a(C1704R.C1707string.fc_tip_error, C1704R.C1707string.unconnectdrone);
                    } else {
                        C2811a.this.f9881w.m30118d();
                        if (C2811a.this.f9876r.m33008an()) {
                            C2811a.this.f9877s.m30283a(3);
                            C2811a.this.f9877s.m30255m();
                            C2811a.this.f9877s.m30256l();
                        } else {
                            C2811a.this.f9877s.m30257k();
                        }
                        C2204b.m32709a(true);
                    }
                    C2811a.this.f9878t.m33918d();
                    return;
                case 2:
                case 3:
                default:
                    return;
                case 4:
                    if (C2811a.this.f9877s.m30253o() == 1) {
                        return;
                    }
                    if (C2811a.this.f9878t != null) {
                        C2811a.this.f9878t.m33921a(false);
                    }
                    C2811a.this.a();
                    C2811a.this.a(C2811a.this.f9883y);
                    C2811a.this.f9874p.sendEmptyMessageDelayed(0, 35000L);
                    C2204b.m32709a(false);
                    return;
            }
        }
    };

    /* renamed from: p */
    public Handler f9874p = new Handler() { // from class: com.fimi.soul.module.login.a.3
        @Override // android.os.Handler
        public void handleMessage(Message message) {
            super.handleMessage(message);
            switch (message.what) {
                case 0:
                    if (C2811a.this.f9877s.m30253o() != 2 || C2811a.this.f3582n > 0) {
                        return;
                    }
                    C2811a.this.f9877s.m30283a(4);
                    if (C1846a.m33917a().m33915b() == 1) {
                        C2811a.this.f9877s.m30282a(C1704R.C1707string.rc_tip_error, C1704R.C1707string.unconnetremote);
                    } else {
                        C2811a.this.f9877s.m30282a(C1704R.C1707string.rc_tip_error2, C1704R.C1707string.unconnetremote);
                    }
                    C2811a.this.a();
                    return;
                default:
                    return;
            }
        }
    };

    /* renamed from: y */
    private Runnable f9883y = new Runnable() { // from class: com.fimi.soul.module.login.a.4
        @Override // java.lang.Runnable
        public void run() {
            C2204b.m32703c(true);
            C2811a.this.a(false);
            boolean z = false;
            boolean z2 = false;
            boolean z3 = false;
            for (int i = 0; !C2811a.this.b() && i < 25; i++) {
                z = C2811a.this.f9878t.m33919c();
                if (z) {
                    if (!z2) {
                        z2 = C3103au.m29207d(C2279c.m32453b());
                    }
                    if (z2 && !C2811a.this.f9876r.mo32906ab().mo32588a()) {
                        C2811a.this.m30202j();
                    }
                    C2811a.this.a(1500);
                    if (C2811a.this.f9876r.mo32906ab().mo32588a() && !z3) {
                        C2262o.f7109a.f6364d = (byte) 0;
                        C2262o.f7109a.f6365e = (byte) 2;
                        C2811a.this.f9876r.mo32906ab().mo32587a(C2262o.f7109a.mo32762b());
                        z3 = true;
                    }
                    if ((C2811a.this.f9876r.mo32906ab().mo32588a() || C2811a.this.f9876r.mo32905ac()) && z) {
                        break;
                    }
                } else {
                    C2811a.this.f9878t.m33922a();
                    C2811a.this.f9880v.m34215b();
                    C2811a.this.a(C0904d.f1994a);
                }
            }
            if (C2811a.this.f9874p.hasMessages(0)) {
                C2811a.this.f9874p.removeMessages(0);
            }
            if (!C2811a.this.f9876r.mo32906ab().mo32588a() || !z) {
                C2811a.this.f9882x.sendEmptyMessage(0);
            } else {
                C2811a.this.f9882x.sendEmptyMessageDelayed(1, 1500L);
            }
            C2204b.m32703c(false);
        }
    };

    /* renamed from: u */
    private C1772d f9879u = C1772d.m34208a();

    /* renamed from: v */
    private C1769c f9880v = C1769c.m34218a();

    public C2811a(LoginActivity loginActivity, C2083a c2083a) {
        this.f9876r = c2083a;
        this.f9877s = loginActivity;
        this.f9881w = new C2874a(null, c2083a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: j */
    public void m30202j() {
        C2203a.m32716a(C2279c.f7267d);
        this.f9876r.mo32906ab().mo32581b();
    }

    @Override // com.fimi.p140a.p143c.AbstractC1498b
    /* renamed from: a */
    public void mo28259a(C1845a c1845a) {
        this.f9878t = c1845a;
    }

    @Override // com.fimi.p140a.p143c.AbstractC1498b
    /* renamed from: c */
    public int mo28256c() {
        getClass();
        return 35000;
    }

    @Override // com.fimi.p140a.p143c.AbstractC1498b
    /* renamed from: d */
    public void mo28254d() {
        this.f9879u.m34183o().m34929f().a(C1831e.m33976b());
        this.f9880v.m34209f().m34929f().a(C1831e.m33975c());
        mo28252e();
    }

    @Override // com.fimi.p140a.p143c.AbstractC1498b
    /* renamed from: e */
    public void mo28252e() {
        AbstractC1789c m34148e = C1783b.m34166a().m34148e();
        if (m34148e == null || !(m34148e instanceof C1781b)) {
            return;
        }
        C1781b c1781b = (C1781b) m34148e;
        C1629c m34167g = c1781b.m34167g();
        if (m34167g != null) {
            m34167g.m34929f().a(C1831e.m33977a());
        }
        C1629c m34168f = c1781b.m34168f();
        if (m34168f == null) {
            return;
        }
        m34168f.m34929f().a(C1831e.m33977a());
    }

    @Override // com.fimi.p140a.p143c.AbstractC1498b
    /* renamed from: f */
    public void mo28250f() {
        this.f9882x.sendEmptyMessageDelayed(4, 500L);
    }

    @Override // com.fimi.p140a.p143c.AbstractC1498b
    /* renamed from: g */
    public void mo28248g() {
        this.f9882x.removeCallbacks(this.f9883y);
    }

    @Override // com.fimi.p140a.p143c.AbstractC1498b
    /* renamed from: h */
    public void mo28247h() {
        if (this.f9874p.hasMessages(0)) {
            this.f9874p.removeMessages(0);
        }
    }

    @Override // com.fimi.p140a.p143c.AbstractC1498b
    /* renamed from: i */
    public void mo28246i() {
        this.f9874p.postDelayed(new Runnable() { // from class: com.fimi.soul.module.login.a.1
            @Override // java.lang.Runnable
            public void run() {
                C2811a.this.f9877s.m30258j();
            }
        }, 1000L);
    }
}
