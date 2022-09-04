package com.fimi.soul.biz.camera.p174c;

import com.fimi.soul.biz.camera.AbstractC1794c;
import com.fimi.soul.biz.camera.C1831e;
import com.fimi.soul.biz.camera.entity.X11RespCmd;
import com.fimi.soul.drone.C2083a;
import com.fimi.soul.drone.C2104d;
/* renamed from: com.fimi.soul.biz.camera.c.e */
/* loaded from: classes.dex */
public class C1824e extends AbstractC1808a implements C2104d.AbstractC2106b {
    public C1824e(AbstractC1794c abstractC1794c) {
        super(abstractC1794c);
    }

    /* renamed from: a */
    public void mo34009a(C1831e.EnumC1832a enumC1832a) {
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.fimi.soul.biz.camera.p174c.AbstractC1808a, com.fimi.soul.biz.camera.p173b.AbstractC1792f
    /* renamed from: a */
    public void mo28055a(boolean z, X11RespCmd x11RespCmd) {
        super.mo28055a(z, x11RespCmd);
        if (z) {
            switch (x11RespCmd.getMsg_id()) {
                case 513:
                    a().m34137a(AbstractC1794c.EnumC1804a.Recoding);
                    return;
                case 514:
                case C1831e.f4787N /* 770 */:
                    a().m34137a(AbstractC1794c.EnumC1804a.Normal);
                    return;
                case C1831e.f4786M /* 769 */:
                    if (!a().m34095j().isContinueCaptureMode()) {
                        return;
                    }
                    a().m34137a(AbstractC1794c.EnumC1804a.ContinueCapturing);
                    return;
                default:
                    return;
            }
        }
    }

    /* renamed from: b */
    public boolean mo34008b() {
        return false;
    }

    /* renamed from: c */
    public void mo34007c() {
        a(C1831e.f4786M);
    }

    /* renamed from: d */
    public void mo34006d() {
        a(C1831e.f4787N);
    }

    /* renamed from: e */
    public void mo34005e() {
    }

    /* renamed from: f */
    public void mo34004f() {
        a(513);
    }

    /* renamed from: g */
    public void mo34003g() {
        a(514);
    }

    /* renamed from: i */
    public void mo34002i() {
    }

    /* renamed from: j */
    public void mo34001j() {
    }

    /* renamed from: k */
    public void mo34000k() {
    }

    /* renamed from: m */
    public void m33999m() {
        a(515);
    }

    /* renamed from: n */
    public void m33998n() {
        a(C1831e.f4785L);
    }

    public void onDroneEvent(C2104d.EnumC2105a enumC2105a, C2083a c2083a) {
    }
}
