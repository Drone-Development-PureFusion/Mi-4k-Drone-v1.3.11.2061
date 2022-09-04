package com.fimi.x1bh.p220a;

import android.annotation.TargetApi;
import android.os.Handler;
import android.os.Message;
import com.fimi.kernel.p158b.p162d.C1629c;
import com.fimi.overseas.soul.C1704R;
import com.fimi.p140a.AbstractC1493b;
import com.fimi.soul.biz.camera.C1783b;
import com.fimi.soul.biz.camera.C1831e;
import com.fimi.soul.biz.camera.p172a.C1781b;
import com.fimi.soul.biz.camera.p173b.AbstractC1789c;
import com.fimi.soul.biz.p178f.C1845a;
import com.fimi.soul.biz.p179g.C1846a;
import com.fimi.soul.module.login.LoginActivity;
import com.fimi.soul.utils.C3103au;
/* renamed from: com.fimi.x1bh.a.b */
/* loaded from: classes2.dex */
public class C3334b extends AbstractC1493b {

    /* renamed from: r */
    private LoginActivity f13287r;

    /* renamed from: q */
    private final int f13286q = 35000;

    /* renamed from: s */
    private final Handler f13288s = new Handler() { // from class: com.fimi.x1bh.a.b.2
        @Override // android.os.Handler
        @TargetApi(17)
        public void handleMessage(Message message) {
            super.handleMessage(message);
            switch (message.what) {
                case 0:
                    if (C3334b.this.f13287r.m30253o() != 2 || C3334b.this.f3582n > 0) {
                        return;
                    }
                    C3334b.this.f13287r.m30283a(4);
                    if (C1846a.m33917a().m33915b() == 1) {
                        C3334b.this.f13287r.m30282a(C1704R.C1707string.rc_tip_error_x1bh, C1704R.C1707string.unconnetremote_x1bh);
                    } else {
                        C3334b.this.f13287r.m30282a(C1704R.C1707string.rc_tip_error_x1bh, C1704R.C1707string.unconnetremote_x1bh);
                    }
                    C3334b.this.a();
                    return;
                case 1:
                    if (C3334b.this.f13287r.m30253o() != 2 || C3334b.this.f3582n > 0) {
                        return;
                    }
                    C3334b.this.f13287r.m30283a(3);
                    C3334b.this.f13287r.m30254n();
                    C3334b.this.f13287r.m30256l();
                    return;
                case 2:
                case 3:
                default:
                    return;
                case 4:
                    if (C3334b.this.f13287r.m30253o() == 1) {
                        return;
                    }
                    C3334b.this.a();
                    C3334b.this.a(C3334b.this.f13289t);
                    C3334b.this.f13285p.sendEmptyMessageDelayed(0, 35000L);
                    return;
            }
        }
    };

    /* renamed from: p */
    public Handler f13285p = new Handler() { // from class: com.fimi.x1bh.a.b.3
        @Override // android.os.Handler
        public void handleMessage(Message message) {
            super.handleMessage(message);
            switch (message.what) {
                case 0:
                    if (C3334b.this.f13287r.m30253o() != 2 || C3334b.this.f3582n > 0) {
                        return;
                    }
                    C3334b.this.f13287r.m30283a(4);
                    if (C1846a.m33917a().m33915b() == 1) {
                        C3334b.this.f13287r.m30282a(C1704R.C1707string.rc_tip_error_x1bh, C1704R.C1707string.unconnetremote_x1bh);
                    } else {
                        C3334b.this.f13287r.m30282a(C1704R.C1707string.rc_tip_error_x1bh, C1704R.C1707string.unconnetremote_x1bh);
                    }
                    C3334b.this.a();
                    return;
                default:
                    return;
            }
        }
    };

    /* renamed from: t */
    private Runnable f13289t = new Runnable() { // from class: com.fimi.x1bh.a.b.4
        @Override // java.lang.Runnable
        public void run() {
            C3334b.this.a(false);
            boolean z = false;
            for (int i = 0; !C3334b.this.b() && i < 25 && !z; i++) {
                z = C3103au.m29207d(C1831e.f4800a);
                C3334b.this.a(1500);
            }
            if (C3334b.this.f13285p.hasMessages(0)) {
                C3334b.this.f13285p.removeMessages(0);
            }
            if (z) {
                C3334b.this.f13288s.sendEmptyMessageDelayed(1, 1500L);
            } else {
                C3334b.this.f13288s.sendEmptyMessage(0);
            }
        }
    };

    public C3334b(LoginActivity loginActivity) {
        this.f13287r = loginActivity;
    }

    @Override // com.fimi.p140a.p143c.AbstractC1498b
    /* renamed from: a */
    public void mo28259a(C1845a c1845a) {
    }

    @Override // com.fimi.p140a.p143c.AbstractC1498b
    /* renamed from: c */
    public int mo28256c() {
        return 35000;
    }

    @Override // com.fimi.p140a.p143c.AbstractC1498b
    /* renamed from: d */
    public void mo28254d() {
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
        this.f13288s.sendEmptyMessageDelayed(4, 500L);
    }

    @Override // com.fimi.p140a.p143c.AbstractC1498b
    /* renamed from: g */
    public void mo28248g() {
        this.f13288s.removeCallbacks(this.f13289t);
    }

    @Override // com.fimi.p140a.p143c.AbstractC1498b
    /* renamed from: h */
    public void mo28247h() {
        if (this.f13285p.hasMessages(0)) {
            this.f13285p.removeMessages(0);
        }
    }

    @Override // com.fimi.p140a.p143c.AbstractC1498b
    /* renamed from: i */
    public void mo28246i() {
        this.f13285p.postDelayed(new Runnable() { // from class: com.fimi.x1bh.a.b.1
            @Override // java.lang.Runnable
            public void run() {
                C3334b.this.f13287r.m30258j();
            }
        }, 1000L);
    }
}
