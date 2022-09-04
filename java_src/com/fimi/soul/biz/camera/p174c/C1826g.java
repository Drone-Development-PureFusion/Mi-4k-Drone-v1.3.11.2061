package com.fimi.soul.biz.camera.p174c;

import com.fimi.soul.biz.camera.AbstractC1794c;
import com.fimi.soul.biz.camera.C1831e;
import com.fimi.soul.biz.camera.entity.X11ApWifiConfig;
import com.fimi.soul.biz.camera.entity.X11RespCmd;
/* renamed from: com.fimi.soul.biz.camera.c.g */
/* loaded from: classes.dex */
public class C1826g extends AbstractC1808a {

    /* renamed from: a */
    private X11ApWifiConfig f4764a = null;

    public C1826g(AbstractC1794c abstractC1794c) {
        super(abstractC1794c);
    }

    /* renamed from: a */
    public void m33994a(X11ApWifiConfig x11ApWifiConfig) {
        String format = String.format("AP_SSID=%s\\nLOCAL_IP=%s\\nESSID=%s\\nAP_CHANNEL=%d", x11ApWifiConfig.getApSSID(), x11ApWifiConfig.getApIP(), x11ApWifiConfig.getApESSID(), Integer.valueOf(x11ApWifiConfig.getApChannel()));
        this.f4764a = x11ApWifiConfig;
        a(C1831e.f4799Z, format);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.fimi.soul.biz.camera.p174c.AbstractC1808a, com.fimi.soul.biz.camera.p173b.AbstractC1792f
    /* renamed from: a */
    public void mo28055a(boolean z, X11RespCmd x11RespCmd) {
        super.mo28055a(z, x11RespCmd);
        switch (x11RespCmd.getMsg_id()) {
            case C1831e.f4799Z /* 1538 */:
                a().m34126a(this.f4764a);
                return;
            default:
                return;
        }
    }

    /* renamed from: b */
    public void m33992b() {
        a(C1831e.f4798Y);
    }

    /* renamed from: b */
    public void m33991b(X11ApWifiConfig x11ApWifiConfig) {
        a(C1831e.f4827aa);
    }
}
