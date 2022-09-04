package com.google.android.gms.internal;

import android.os.Bundle;
import android.os.RemoteException;
import android.os.SystemClock;
import android.support.annotation.Nullable;
import android.support.annotation.WorkerThread;
import com.google.android.gms.common.util.AbstractC4682e;
import com.google.android.gms.tagmanager.AbstractC9042aj;
import java.util.Date;
import java.util.Map;
/* loaded from: classes2.dex */
public class aow implements AbstractC4682e {

    /* renamed from: a */
    private final Bundle f22668a;

    /* renamed from: b */
    private final String f22669b;

    /* renamed from: c */
    private final Date f22670c;

    /* renamed from: d */
    private final String f22671d;

    /* renamed from: e */
    private Map<String, Object> f22672e;

    /* renamed from: f */
    private boolean f22673f;

    /* renamed from: g */
    private final AbstractC9042aj f22674g;

    public aow(@Nullable String str, @Nullable Bundle bundle, String str2, Date date, boolean z, AbstractC9042aj abstractC9042aj) {
        this.f22669b = str;
        this.f22668a = bundle == null ? new Bundle() : bundle;
        this.f22670c = date;
        this.f22671d = str2;
        this.f22673f = z;
        this.f22674g = abstractC9042aj;
    }

    @Override // com.google.android.gms.common.util.AbstractC4682e
    /* renamed from: a */
    public long mo16434a() {
        return this.f22670c.getTime();
    }

    /* renamed from: a */
    public void m16433a(boolean z) {
        this.f22673f = z;
    }

    @Override // com.google.android.gms.common.util.AbstractC4682e
    /* renamed from: b */
    public long mo16432b() {
        return SystemClock.elapsedRealtime();
    }

    @Override // com.google.android.gms.common.util.AbstractC4682e
    /* renamed from: c */
    public long mo16431c() {
        return System.nanoTime();
    }

    /* renamed from: d */
    public String m16430d() {
        return this.f22669b;
    }

    /* renamed from: e */
    public Bundle m16429e() {
        return this.f22668a;
    }

    /* renamed from: f */
    public String m16428f() {
        return this.f22671d;
    }

    @WorkerThread
    /* renamed from: g */
    public Map<String, Object> m16427g() {
        if (this.f22672e == null) {
            try {
                this.f22672e = this.f22674g.mo8898a();
            } catch (RemoteException e) {
                String valueOf = String.valueOf(e.getMessage());
                aph.m16396a(valueOf.length() != 0 ? "Error calling measurement proxy:".concat(valueOf) : new String("Error calling measurement proxy:"));
            }
        }
        return this.f22672e;
    }

    /* renamed from: h */
    public boolean m16426h() {
        return this.f22673f;
    }
}
