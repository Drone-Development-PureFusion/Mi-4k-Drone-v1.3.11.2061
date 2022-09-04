package com.xiaomi.push.service.receivers;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.xiaomi.channel.commonutils.logger.AbstractC10404b;
import com.xiaomi.push.service.AbstractC10626ap;
import com.xiaomi.push.service.C10665h;
import com.xiaomi.push.service.XMPushService;
/* loaded from: classes2.dex */
public class PkgUninstallReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if (intent == null || !"android.intent.action.PACKAGE_REMOVED".equals(intent.getAction())) {
            return;
        }
        boolean z = intent.getExtras().getBoolean("android.intent.extra.REPLACING");
        Uri data = intent.getData();
        if (data == null || z) {
            return;
        }
        try {
            Intent intent2 = new Intent(context, XMPushService.class);
            intent2.setAction(AbstractC10626ap.f33057a);
            intent2.putExtra("uninstall_pkg_name", data.getEncodedSchemeSpecificPart());
            context.startService(intent2);
            C10665h.m4250a(context.getApplicationContext(), data.getEncodedSchemeSpecificPart());
        } catch (Exception e) {
            AbstractC10404b.m5267a(e);
        }
    }
}
