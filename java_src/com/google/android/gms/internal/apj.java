package com.google.android.gms.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
/* loaded from: classes2.dex */
class apj extends BroadcastReceiver {

    /* renamed from: a */
    static final String f22702a = apj.class.getName();

    /* renamed from: b */
    private final apt f22703b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public apj(apt aptVar) {
        this.f22703b = aptVar;
    }

    /* renamed from: b */
    public static void m16383b(Context context) {
        Intent intent = new Intent("com.google.analytics.RADIO_POWERED");
        intent.addCategory(context.getPackageName());
        intent.putExtra(f22702a, true);
        context.sendBroadcast(intent);
    }

    /* renamed from: a */
    public void m16384a(Context context) {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        context.registerReceiver(this, intentFilter);
        IntentFilter intentFilter2 = new IntentFilter();
        intentFilter2.addAction("com.google.analytics.RADIO_POWERED");
        intentFilter2.addCategory(context.getPackageName());
        context.registerReceiver(this, intentFilter2);
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        String action = intent.getAction();
        if (!"android.net.conn.CONNECTIVITY_CHANGE".equals(action)) {
            if (!"com.google.analytics.RADIO_POWERED".equals(action) || intent.hasExtra(f22702a)) {
                return;
            }
            this.f22703b.mo16311a();
            return;
        }
        Bundle extras = intent.getExtras();
        Boolean bool = Boolean.FALSE;
        if (extras != null) {
            bool = Boolean.valueOf(intent.getExtras().getBoolean("noConnectivity"));
        }
        this.f22703b.mo16307a(!bool.booleanValue());
    }
}
