package com.google.android.gms.internal;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.C3779u;
import com.google.android.gms.ads.internal.client.AdRequestParcel;
import com.google.android.gms.ads.internal.util.client.C3780a;
import com.google.android.gms.internal.aaw;
import com.google.android.gms.internal.abi;
import com.google.android.gms.p232c.BinderC4173f;
@aaa
/* loaded from: classes.dex */
public class aav extends abq implements aax, aba {

    /* renamed from: a */
    private final abi.C6129a f20818a;

    /* renamed from: b */
    private final Context f20819b;

    /* renamed from: c */
    private final abc f20820c;

    /* renamed from: d */
    private final aba f20821d;

    /* renamed from: f */
    private final String f20823f;

    /* renamed from: g */
    private final String f20824g;

    /* renamed from: h */
    private final C7989xg f20825h;

    /* renamed from: i */
    private final long f20826i;

    /* renamed from: l */
    private aaw f20829l;

    /* renamed from: j */
    private int f20827j = 0;

    /* renamed from: k */
    private int f20828k = 3;

    /* renamed from: e */
    private final Object f20822e = new Object();

    public aav(Context context, String str, String str2, C7989xg c7989xg, abi.C6129a c6129a, abc abcVar, aba abaVar, long j) {
        this.f20819b = context;
        this.f20823f = str;
        this.f20824g = str2;
        this.f20825h = c7989xg;
        this.f20818a = c6129a;
        this.f20820c = abcVar;
        this.f20821d = abaVar;
        this.f20826i = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m18569a(AdRequestParcel adRequestParcel, AbstractC8008xr abstractC8008xr) {
        this.f20820c.m18520b().m18540a((aba) this);
        try {
            if ("com.google.ads.mediation.admob.AdMobAdapter".equals(this.f20823f)) {
                abstractC8008xr.mo12975a(adRequestParcel, this.f20824g, this.f20825h.f26216a);
            } else {
                abstractC8008xr.mo12976a(adRequestParcel, this.f20824g);
            }
        } catch (RemoteException e) {
            abr.d("Fail to load ad from adapter.", e);
            mo18527a(this.f20823f, 0);
        }
    }

    /* renamed from: b */
    private void m18566b(long j) {
        while (true) {
            synchronized (this.f20822e) {
                if (this.f20827j != 0) {
                    this.f20829l = new aaw.C6123a().m18559a(C3779u.m26884k().mo16432b() - j).m18560a(1 == this.f20827j ? 6 : this.f20828k).m18557a(this.f20823f).m18555b(this.f20825h.f26219d).m18561a();
                    return;
                } else if (!m18570a(j)) {
                    this.f20829l = new aaw.C6123a().m18560a(this.f20828k).m18559a(C3779u.m26884k().mo16432b() - j).m18557a(this.f20823f).m18555b(this.f20825h.f26219d).m18561a();
                    return;
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.abq
    /* renamed from: a */
    public void mo12782a() {
        if (this.f20820c == null || this.f20820c.m18520b() == null || this.f20820c.m18521a() == null) {
            return;
        }
        final aaz m18520b = this.f20820c.m18520b();
        m18520b.m18540a((aba) null);
        m18520b.m18541a((aax) this);
        final AdRequestParcel adRequestParcel = this.f20818a.f20920a.f14487c;
        final AbstractC8008xr m18521a = this.f20820c.m18521a();
        try {
            if (m18521a.mo12961g()) {
                C3780a.f14737a.post(new Runnable() { // from class: com.google.android.gms.internal.aav.1
                    @Override // java.lang.Runnable
                    public void run() {
                        aav.this.m18569a(adRequestParcel, m18521a);
                    }
                });
            } else {
                C3780a.f14737a.post(new Runnable() { // from class: com.google.android.gms.internal.aav.2
                    @Override // java.lang.Runnable
                    public void run() {
                        try {
                            m18521a.mo12973a(BinderC4173f.m25293a(aav.this.f20819b), adRequestParcel, (String) null, m18520b, aav.this.f20824g);
                        } catch (RemoteException e) {
                            String valueOf = String.valueOf(aav.this.f20823f);
                            abr.d(valueOf.length() != 0 ? "Fail to initialize adapter ".concat(valueOf) : new String("Fail to initialize adapter "), e);
                            aav.this.mo18527a(aav.this.f20823f, 0);
                        }
                    }
                });
            }
        } catch (RemoteException e) {
            abr.d("Fail to check if adapter is initialized.", e);
            mo18527a(this.f20823f, 0);
        }
        m18566b(C3779u.m26884k().mo16432b());
        m18520b.m18540a((aba) null);
        m18520b.m18541a((aax) null);
        if (this.f20827j == 1) {
            this.f20821d.mo18528a(this.f20823f);
        } else {
            this.f20821d.mo18527a(this.f20823f, this.f20828k);
        }
    }

    @Override // com.google.android.gms.internal.aax
    /* renamed from: a */
    public void mo18552a(int i) {
        mo18527a(this.f20823f, 0);
    }

    @Override // com.google.android.gms.internal.aba
    /* renamed from: a */
    public void mo18528a(String str) {
        synchronized (this.f20822e) {
            this.f20827j = 1;
            this.f20822e.notify();
        }
    }

    @Override // com.google.android.gms.internal.aba
    /* renamed from: a */
    public void mo18527a(String str, int i) {
        synchronized (this.f20822e) {
            this.f20827j = 2;
            this.f20828k = i;
            this.f20822e.notify();
        }
    }

    /* renamed from: a */
    protected boolean m18570a(long j) {
        long mo16432b = this.f20826i - (C3779u.m26884k().mo16432b() - j);
        if (mo16432b <= 0) {
            this.f20828k = 4;
            return false;
        }
        try {
            this.f20822e.wait(mo16432b);
            return true;
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            this.f20828k = 5;
            return false;
        }
    }

    @Override // com.google.android.gms.internal.abq
    /* renamed from: b */
    public void mo12779b() {
    }

    /* renamed from: c */
    public aaw m18564c() {
        aaw aawVar;
        synchronized (this.f20822e) {
            aawVar = this.f20829l;
        }
        return aawVar;
    }

    /* renamed from: f */
    public C7989xg m18562f() {
        return this.f20825h;
    }

    @Override // com.google.android.gms.internal.aax
    /* renamed from: g */
    public void mo18551g() {
        m18569a(this.f20818a.f20920a.f14487c, this.f20820c.m18521a());
    }
}
