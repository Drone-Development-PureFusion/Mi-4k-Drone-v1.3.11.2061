package com.google.android.gms.gcm;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Build;
import android.support.p001v4.content.WakefulBroadcastReceiver;
import android.util.Base64;
import android.util.Log;
import com.google.android.gms.wallet.C9357e;
/* loaded from: classes2.dex */
public class GcmReceiver extends WakefulBroadcastReceiver {

    /* renamed from: a */
    private static String f20489a = "gcm.googleapis.com/refresh";

    /* renamed from: b */
    private void m18927b(Context context, Intent intent) {
        ComponentName startService;
        if (isOrderedBroadcast()) {
            setResultCode(500);
        }
        m18926c(context, intent);
        try {
            if (context.checkCallingOrSelfPermission("android.permission.WAKE_LOCK") == 0) {
                startService = startWakefulService(context, intent);
            } else {
                startService = context.startService(intent);
                Log.d("GcmReceiver", "Missing wake lock permission, service start may be delayed");
            }
            if (startService != null) {
                if (!isOrderedBroadcast()) {
                    return;
                }
                setResultCode(-1);
                return;
            }
            Log.e("GcmReceiver", "Error while delivering the message: ServiceIntent not found.");
            if (!isOrderedBroadcast()) {
                return;
            }
            setResultCode(C9357e.f29594j);
        } catch (SecurityException e) {
            Log.e("GcmReceiver", "Error while delivering the message to the serviceIntent", e);
            if (!isOrderedBroadcast()) {
                return;
            }
            setResultCode(401);
        }
    }

    /* renamed from: c */
    private void m18926c(Context context, Intent intent) {
        ResolveInfo resolveService = context.getPackageManager().resolveService(intent, 0);
        if (resolveService == null || resolveService.serviceInfo == null) {
            Log.e("GcmReceiver", "Failed to resolve target intent service, skipping classname enforcement");
            return;
        }
        ServiceInfo serviceInfo = resolveService.serviceInfo;
        if (!context.getPackageName().equals(serviceInfo.packageName) || serviceInfo.name == null) {
            String valueOf = String.valueOf(serviceInfo.packageName);
            String valueOf2 = String.valueOf(serviceInfo.name);
            Log.e("GcmReceiver", new StringBuilder(String.valueOf(valueOf).length() + 94 + String.valueOf(valueOf2).length()).append("Error resolving target intent service, skipping classname enforcement. Resolved service was: ").append(valueOf).append("/").append(valueOf2).toString());
            return;
        }
        String str = serviceInfo.name;
        if (str.startsWith(".")) {
            String valueOf3 = String.valueOf(context.getPackageName());
            String valueOf4 = String.valueOf(str);
            str = valueOf4.length() != 0 ? valueOf3.concat(valueOf4) : new String(valueOf3);
        }
        if (Log.isLoggable("GcmReceiver", 3)) {
            String valueOf5 = String.valueOf(str);
            Log.d("GcmReceiver", valueOf5.length() != 0 ? "Restricting intent to a specific service: ".concat(valueOf5) : new String("Restricting intent to a specific service: "));
        }
        intent.setClassName(context.getPackageName(), str);
    }

    /* renamed from: a */
    public void m18928a(Context context, Intent intent) {
        m18927b(context, intent);
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        intent.setComponent(null);
        intent.setPackage(context.getPackageName());
        if (Build.VERSION.SDK_INT <= 18) {
            intent.removeCategory(context.getPackageName());
        }
        String stringExtra = intent.getStringExtra("from");
        if ("com.google.android.c2dm.intent.REGISTRATION".equals(intent.getAction()) || "google.com/iid".equals(stringExtra) || f20489a.equals(stringExtra)) {
            intent.setAction("com.google.android.gms.iid.InstanceID");
        }
        String stringExtra2 = intent.getStringExtra("gcm.rawData64");
        if (stringExtra2 != null) {
            intent.putExtra("rawData", Base64.decode(stringExtra2, 0));
            intent.removeExtra("gcm.rawData64");
        }
        if ("com.google.android.c2dm.intent.RECEIVE".equals(intent.getAction())) {
            m18928a(context, intent);
        } else {
            m18927b(context, intent);
        }
        if (!isOrderedBroadcast() || getResultCode() != 0) {
            return;
        }
        setResultCode(-1);
    }
}
