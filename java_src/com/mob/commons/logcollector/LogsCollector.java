package com.mob.commons.logcollector;

import android.content.Context;
import android.content.Intent;
import cn.sharesdk.framework.ShareSDK;
import com.mob.tools.MobLog;
import com.mob.tools.log.LogCollector;
import com.tencent.open.SocialConstants;
/* loaded from: classes2.dex */
public abstract class LogsCollector implements LogCollector {

    /* renamed from: a */
    private C10083c f31118a;

    /* renamed from: b */
    private boolean f31119b;

    public LogsCollector(Context context) {
        this.f31118a = C10083c.m6228a(context);
        this.f31118a.m6230a(getSDKVersion(), getSDKTag(), getAppkey());
        try {
            if (context.getPackageManager().getPackageInfo("cn.sharesdk.log", 64) != null) {
                this.f31119b = true;
            }
        } catch (Throwable th) {
        }
        this.f31119b = false;
    }

    /* renamed from: a */
    final int m6238a(int i, String str) {
        if (this.f31118a.m6232a() == null || !this.f31119b) {
            return 0;
        }
        try {
            Intent intent = new Intent();
            intent.setAction("cn.sharesdk.log");
            intent.putExtra("package", this.f31118a.m6232a().getPackageName());
            intent.putExtra("priority", i);
            intent.putExtra(SocialConstants.PARAM_SEND_MSG, str);
            this.f31118a.m6232a().sendBroadcast(intent);
            return 0;
        } catch (Throwable th) {
            MobLog.getInstance().m6187w(th);
            return 0;
        }
    }

    protected abstract String getAppkey();

    protected abstract String getSDKTag();

    protected abstract int getSDKVersion();

    @Override // com.mob.tools.log.LogCollector
    public final void log(String str, int i, int i2, String str2, String str3) {
        m6238a(i, str3);
        if (str == null || !str.equals(getSDKTag())) {
            return;
        }
        if (ShareSDK.SDK_TAG.equals(str) && (!str3.contains("com.mob.") || !str3.contains("cn.sharesdk."))) {
            return;
        }
        if (i2 == 1) {
            this.f31118a.m6223b(getSDKVersion(), i2, str, getAppkey(), str3);
        } else if (i2 == 2) {
            this.f31118a.m6231a(getSDKVersion(), i2, str, getAppkey(), str3);
        } else if (i != 5) {
        } else {
            this.f31118a.m6231a(getSDKVersion(), i2, str, getAppkey(), str3);
        }
    }
}
