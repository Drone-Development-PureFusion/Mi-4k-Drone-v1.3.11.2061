package cn.sharesdk.wechat.utils;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import cn.sharesdk.framework.utils.C0831d;
/* loaded from: classes.dex */
public class WechatHandlerActivity extends Activity {
    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        setTheme(16973839);
        super.onCreate(bundle);
        try {
            WechatHelper.m37724a().m37712a(this);
        } catch (Throwable th) {
            C0831d.m37772a().m6199d(th);
        }
        finish();
    }

    public void onGetMessageFromWXReq(WXMediaMessage wXMediaMessage) {
    }

    @Override // android.app.Activity
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        setIntent(intent);
        try {
            WechatHelper.m37724a().m37712a(this);
        } catch (Throwable th) {
            C0831d.m37772a().m6199d(th);
        }
        finish();
    }

    public void onShowMessageFromWXReq(WXMediaMessage wXMediaMessage) {
    }
}
