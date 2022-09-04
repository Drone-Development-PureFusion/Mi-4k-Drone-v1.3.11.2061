package com.fimi.soul.biz.camera.p174c;

import com.fimi.kernel.C1642c;
import com.fimi.soul.biz.camera.AbstractC1794c;
import com.fimi.soul.biz.camera.C1783b;
import com.fimi.soul.biz.camera.C1827d;
import com.fimi.soul.biz.camera.C1831e;
import com.fimi.soul.biz.camera.entity.BaseX11Cmd;
import com.fimi.soul.biz.camera.entity.X11RespCmd;
import com.fimi.soul.entity.CameraValue;
/* renamed from: com.fimi.soul.biz.camera.c.f */
/* loaded from: classes.dex */
public class C1825f extends AbstractC1808a {

    /* renamed from: a */
    int f4763a = 0;

    public C1825f(AbstractC1794c abstractC1794c) {
        super(abstractC1794c);
    }

    /* renamed from: a */
    public void m33997a(boolean z) {
        BaseX11Cmd b = b(C1831e.f4831ae, null, null);
        b.setToken(this.f4763a);
        b.setRval(z ? 0 : -1);
        if (z) {
            b.setToken(this.f4763a);
            a().m34144a(this.f4763a);
        }
        a(b);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.fimi.soul.biz.camera.p174c.AbstractC1808a, com.fimi.soul.biz.camera.p173b.AbstractC1792f
    /* renamed from: a */
    public void mo28055a(boolean z, X11RespCmd x11RespCmd) {
        super.mo28055a(z, x11RespCmd);
        switch (x11RespCmd.getMsg_id()) {
            case 257:
                if (!z) {
                    a().m34144a(x11RespCmd.getRval());
                    return;
                }
                a().m34144a(Integer.parseInt(x11RespCmd.getParam().toString()));
                this.f4763a = a().m34100f();
                a().m34137a(AbstractC1794c.EnumC1804a.Normal);
                a().m34089p();
                ((C1827d) C1783b.m34166a().m34150d()).m33989u().m34047d();
                C1642c.m34885e().m34527d(true);
                C1642c.m34885e().m34523e(true);
                return;
            case C1831e.f4831ae /* 1793 */:
                m33997a(true);
                return;
            default:
                return;
        }
    }

    /* renamed from: b */
    public void m33996b() {
        if (!CameraValue.hasSession) {
            BaseX11Cmd b = b(257, null, null);
            b.setToken(0);
            a(b);
        }
    }

    /* renamed from: c */
    public void m33995c() {
        a(258);
    }
}
