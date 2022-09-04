package com.tencent.p263mm.sdk.openapi;

import android.content.Intent;
/* renamed from: com.tencent.mm.sdk.openapi.IWXAPI */
/* loaded from: classes2.dex */
public interface IWXAPI {
    int getWXAppSupportAPI();

    boolean handleIntent(Intent intent, IWXAPIEventHandler iWXAPIEventHandler);

    boolean isWXAppInstalled();

    boolean isWXAppSupportAPI();

    boolean openWXApp();

    boolean registerApp(String str);

    boolean sendReq(BaseReq baseReq);

    boolean sendResp(BaseResp baseResp);

    void unregisterApp();
}
