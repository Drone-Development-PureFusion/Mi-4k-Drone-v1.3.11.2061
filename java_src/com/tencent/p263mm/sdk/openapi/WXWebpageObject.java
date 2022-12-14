package com.tencent.p263mm.sdk.openapi;

import android.os.Bundle;
import com.tencent.p263mm.sdk.openapi.WXMediaMessage;
import com.tencent.p263mm.sdk.platformtools.Log;
/* renamed from: com.tencent.mm.sdk.openapi.WXWebpageObject */
/* loaded from: classes2.dex */
public class WXWebpageObject implements WXMediaMessage.IMediaObject {
    public String webpageUrl;

    public WXWebpageObject() {
    }

    public WXWebpageObject(String str) {
        this.webpageUrl = str;
    }

    @Override // com.tencent.p263mm.sdk.openapi.WXMediaMessage.IMediaObject
    public boolean checkArgs() {
        if (this.webpageUrl == null || this.webpageUrl.length() == 0 || this.webpageUrl.length() > 10240) {
            Log.m5875e("MicroMsg.SDK.WXWebpageObject", "checkArgs fail, webpageUrl is invalid");
            return false;
        }
        return true;
    }

    @Override // com.tencent.p263mm.sdk.openapi.WXMediaMessage.IMediaObject
    public void serialize(Bundle bundle) {
        bundle.putString("_wxwebpageobject_webpageUrl", this.webpageUrl);
    }

    @Override // com.tencent.p263mm.sdk.openapi.WXMediaMessage.IMediaObject
    public int type() {
        return 5;
    }

    @Override // com.tencent.p263mm.sdk.openapi.WXMediaMessage.IMediaObject
    public void unserialize(Bundle bundle) {
        this.webpageUrl = bundle.getString("_wxwebpageobject_webpageUrl");
    }
}
