package com.google.android.gms.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
/* loaded from: classes2.dex */
public final class zzqv extends BroadcastReceiver {

    /* renamed from: a */
    protected Context f26599a;

    /* renamed from: b */
    private final AbstractC8149a f26600b;

    /* renamed from: com.google.android.gms.internal.zzqv$a */
    /* loaded from: classes2.dex */
    public static abstract class AbstractC8149a {
        /* renamed from: a */
        public abstract void mo12692a();
    }

    public zzqv(AbstractC8149a abstractC8149a) {
        this.f26600b = abstractC8149a;
    }

    /* renamed from: a */
    public synchronized void m12694a() {
        if (this.f26599a != null) {
            this.f26599a.unregisterReceiver(this);
        }
        this.f26599a = null;
    }

    /* renamed from: a */
    public void m12693a(Context context) {
        this.f26599a = context;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        Uri data = intent.getData();
        String str = null;
        if (data != null) {
            str = data.getSchemeSpecificPart();
        }
        if ("com.google.android.gms".equals(str)) {
            this.f26600b.mo12692a();
            m12694a();
        }
    }
}
