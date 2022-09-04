package cn.sharesdk.wechat.utils;

import android.os.Bundle;
/* loaded from: classes.dex */
public abstract class WechatResp {

    /* renamed from: f */
    public int f1710f;

    /* renamed from: g */
    public String f1711g;

    /* renamed from: h */
    public String f1712h;

    /* loaded from: classes.dex */
    public interface ErrCode {
        public static final int ERR_AUTH_DENIED = -4;
        public static final int ERR_COMM = -1;
        public static final int ERR_OK = 0;
        public static final int ERR_SENT_FAILED = -3;
        public static final int ERR_UNSUPPORT = -5;
        public static final int ERR_USER_CANCEL = -2;
    }

    public WechatResp(Bundle bundle) {
        mo37693a(bundle);
    }

    /* renamed from: a */
    public abstract int mo37694a();

    /* renamed from: a */
    public void mo37693a(Bundle bundle) {
        this.f1710f = bundle.getInt("_wxapi_baseresp_errcode");
        this.f1711g = bundle.getString("_wxapi_baseresp_errstr");
        this.f1712h = bundle.getString("_wxapi_baseresp_transaction");
    }

    /* renamed from: b */
    public void mo37692b(Bundle bundle) {
        bundle.putInt("_wxapi_command_type", mo37694a());
        bundle.putInt("_wxapi_baseresp_errcode", this.f1710f);
        bundle.putString("_wxapi_baseresp_errstr", this.f1711g);
        bundle.putString("_wxapi_baseresp_transaction", this.f1712h);
    }
}
