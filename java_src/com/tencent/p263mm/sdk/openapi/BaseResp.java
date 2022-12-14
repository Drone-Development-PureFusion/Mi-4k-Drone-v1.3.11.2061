package com.tencent.p263mm.sdk.openapi;

import android.os.Bundle;
/* renamed from: com.tencent.mm.sdk.openapi.BaseResp */
/* loaded from: classes2.dex */
public abstract class BaseResp {
    public int errCode;
    public String errStr;
    public String transaction;

    /* renamed from: com.tencent.mm.sdk.openapi.BaseResp$ErrCode */
    /* loaded from: classes2.dex */
    public interface ErrCode {
        public static final int ERR_AUTH_DENIED = -4;
        public static final int ERR_COMM = -1;
        public static final int ERR_OK = 0;
        public static final int ERR_SENT_FAILED = -3;
        public static final int ERR_UNSUPPORT = -5;
        public static final int ERR_USER_CANCEL = -2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract boolean checkArgs();

    public void fromBundle(Bundle bundle) {
        this.errCode = bundle.getInt("_wxapi_baseresp_errcode");
        this.errStr = bundle.getString("_wxapi_baseresp_errstr");
        this.transaction = bundle.getString("_wxapi_baseresp_transaction");
    }

    public abstract int getType();

    public void toBundle(Bundle bundle) {
        bundle.putInt("_wxapi_command_type", getType());
        bundle.putInt("_wxapi_baseresp_errcode", this.errCode);
        bundle.putString("_wxapi_baseresp_errstr", this.errStr);
        bundle.putString("_wxapi_baseresp_transaction", this.transaction);
    }
}
