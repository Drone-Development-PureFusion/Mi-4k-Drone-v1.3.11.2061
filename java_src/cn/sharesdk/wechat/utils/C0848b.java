package cn.sharesdk.wechat.utils;

import android.os.Bundle;
/* renamed from: cn.sharesdk.wechat.utils.b */
/* loaded from: classes.dex */
public class C0848b extends WechatResp {

    /* renamed from: a */
    public String f1715a;

    /* renamed from: b */
    public String f1716b;

    /* renamed from: c */
    public int f1717c;

    /* renamed from: d */
    public String f1718d;

    /* renamed from: e */
    public String f1719e;

    public C0848b(Bundle bundle) {
        super(bundle);
    }

    @Override // cn.sharesdk.wechat.utils.WechatResp
    /* renamed from: a */
    public int mo37694a() {
        return 1;
    }

    @Override // cn.sharesdk.wechat.utils.WechatResp
    /* renamed from: a */
    public void mo37693a(Bundle bundle) {
        super.mo37693a(bundle);
        this.f1715a = bundle.getString("_wxapi_sendauth_resp_userName");
        this.f1716b = bundle.getString("_wxapi_sendauth_resp_token");
        this.f1717c = bundle.getInt("_wxapi_sendauth_resp_expireDate", 0);
        this.f1718d = bundle.getString("_wxapi_sendauth_resp_state");
        this.f1719e = bundle.getString("_wxapi_sendauth_resp_url");
    }

    @Override // cn.sharesdk.wechat.utils.WechatResp
    /* renamed from: b */
    public void mo37692b(Bundle bundle) {
        super.mo37692b(bundle);
        bundle.putString("_wxapi_sendauth_resp_userName", this.f1715a);
        bundle.putString("_wxapi_sendauth_resp_token", this.f1716b);
        bundle.putInt("_wxapi_sendauth_resp_expireDate", this.f1717c);
        bundle.putString("_wxapi_sendauth_resp_state", this.f1718d);
        bundle.putString("_wxapi_sendauth_resp_url", this.f1719e);
    }
}
