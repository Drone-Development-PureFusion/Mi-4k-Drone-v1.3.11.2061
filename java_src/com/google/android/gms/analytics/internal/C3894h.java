package com.google.android.gms.analytics.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import com.google.android.gms.common.internal.C4588d;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.analytics.internal.h */
/* loaded from: classes2.dex */
public class C3894h extends BroadcastReceiver {

    /* renamed from: a */
    static final String f15090a = C3894h.class.getName();

    /* renamed from: b */
    private final C3922v f15091b;

    /* renamed from: c */
    private boolean f15092c;

    /* renamed from: d */
    private boolean f15093d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C3894h(C3922v c3922v) {
        C4588d.m23627a(c3922v);
        this.f15091b = c3922v;
    }

    /* renamed from: g */
    private void m26279g() {
        m26277i();
        m26276j();
    }

    /* renamed from: h */
    private Context m26278h() {
        return this.f15091b.m26112b();
    }

    /* renamed from: i */
    private C3893g m26277i() {
        return this.f15091b.m26108f();
    }

    /* renamed from: j */
    private C3911r m26276j() {
        return this.f15091b.m26105i();
    }

    /* renamed from: a */
    public void m26285a() {
        m26279g();
        if (this.f15092c) {
            return;
        }
        Context m26278h = m26278h();
        m26278h.registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        IntentFilter intentFilter = new IntentFilter("com.google.analytics.RADIO_POWERED");
        intentFilter.addCategory(m26278h.getPackageName());
        m26278h.registerReceiver(this, intentFilter);
        this.f15093d = m26280f();
        this.f15091b.m26108f().a("Registering connectivity change receiver. Network connected", Boolean.valueOf(this.f15093d));
        this.f15092c = true;
    }

    /* renamed from: b */
    public void m26284b() {
        if (!m26282d()) {
            return;
        }
        this.f15091b.m26108f().q("Unregistering connectivity change receiver");
        this.f15092c = false;
        this.f15093d = false;
        try {
            m26278h().unregisterReceiver(this);
        } catch (IllegalArgumentException e) {
            m26277i().e("Failed to unregister the network broadcast receiver", e);
        }
    }

    /* renamed from: c */
    public void m26283c() {
        if (Build.VERSION.SDK_INT <= 10) {
            return;
        }
        Context m26278h = m26278h();
        Intent intent = new Intent("com.google.analytics.RADIO_POWERED");
        intent.addCategory(m26278h.getPackageName());
        intent.putExtra(f15090a, true);
        m26278h.sendOrderedBroadcast(intent, null);
    }

    /* renamed from: d */
    public boolean m26282d() {
        return this.f15092c;
    }

    /* renamed from: e */
    public boolean m26281e() {
        if (!this.f15092c) {
            this.f15091b.m26108f().t("Connectivity unknown. Receiver not registered");
        }
        return this.f15093d;
    }

    /* renamed from: f */
    protected boolean m26280f() {
        try {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) m26278h().getSystemService("connectivity")).getActiveNetworkInfo();
            if (activeNetworkInfo != null) {
                if (activeNetworkInfo.isConnected()) {
                    return true;
                }
            }
            return false;
        } catch (SecurityException e) {
            return false;
        }
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        m26279g();
        String action = intent.getAction();
        this.f15091b.m26108f().a("NetworkBroadcastReceiver received action", action);
        if ("android.net.conn.CONNECTIVITY_CHANGE".equals(action)) {
            boolean m26280f = m26280f();
            if (this.f15093d == m26280f) {
                return;
            }
            this.f15093d = m26280f;
            m26276j().m26165a(m26280f);
        } else if (!"com.google.analytics.RADIO_POWERED".equals(action)) {
            this.f15091b.m26108f().d("NetworkBroadcastReceiver received unknown action", action);
        } else if (intent.hasExtra(f15090a)) {
        } else {
            m26276j().m26159g();
        }
    }
}
