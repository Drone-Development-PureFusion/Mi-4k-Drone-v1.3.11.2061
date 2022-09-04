package com.google.android.gms.tagmanager;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
/* renamed from: com.google.android.gms.tagmanager.bb */
/* loaded from: classes2.dex */
class C9072bb extends BroadcastReceiver {

    /* renamed from: a */
    static final String f28732a = C9072bb.class.getName();

    /* renamed from: b */
    private final AbstractC9126cl f28733b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C9072bb(AbstractC9126cl abstractC9126cl) {
        this.f28733b = abstractC9126cl;
    }

    /* renamed from: b */
    public static void m9291b(Context context) {
        Intent intent = new Intent("com.google.analytics.RADIO_POWERED");
        intent.addCategory(context.getPackageName());
        intent.putExtra(f28732a, true);
        context.sendBroadcast(intent);
    }

    /* renamed from: a */
    public void m9292a(Context context) {
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
            if (!"com.google.analytics.RADIO_POWERED".equals(action) || intent.hasExtra(f28732a)) {
                return;
            }
            this.f28733b.mo9179b();
            return;
        }
        Bundle extras = intent.getExtras();
        Boolean bool = Boolean.FALSE;
        if (extras != null) {
            bool = Boolean.valueOf(intent.getExtras().getBoolean("noConnectivity"));
        }
        this.f28733b.mo9181a(!bool.booleanValue());
    }
}
