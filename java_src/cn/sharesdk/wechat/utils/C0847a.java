package cn.sharesdk.wechat.utils;

import android.os.Bundle;
import cn.sharesdk.framework.utils.C0831d;
/* renamed from: cn.sharesdk.wechat.utils.a */
/* loaded from: classes.dex */
public class C0847a extends AbstractC0858j {

    /* renamed from: a */
    public String f1713a;

    /* renamed from: b */
    public String f1714b;

    @Override // cn.sharesdk.wechat.utils.AbstractC0858j
    /* renamed from: a */
    public int mo37662a() {
        return 1;
    }

    @Override // cn.sharesdk.wechat.utils.AbstractC0858j
    /* renamed from: a */
    public void mo37661a(Bundle bundle) {
        super.mo37661a(bundle);
        bundle.putString("_wxapi_sendauth_req_scope", this.f1713a);
        bundle.putString("_wxapi_sendauth_req_state", this.f1714b);
    }

    @Override // cn.sharesdk.wechat.utils.AbstractC0858j
    /* renamed from: b */
    public boolean mo37660b() {
        if (this.f1713a == null || this.f1713a.length() == 0 || this.f1713a.length() > 1024) {
            C0831d.m37772a().m6200d("MicroMsg.SDK.SendAuth.Req", "checkArgs fail, scope is invalid");
            return false;
        } else if (this.f1714b == null || this.f1714b.length() <= 1024) {
            return true;
        } else {
            C0831d.m37772a().m6200d("MicroMsg.SDK.SendAuth.Req", "checkArgs fail, state is invalid");
            return false;
        }
    }
}
