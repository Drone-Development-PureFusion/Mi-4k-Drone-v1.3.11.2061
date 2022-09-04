package com.google.android.gms.internal;

import android.os.RemoteException;
import android.support.annotation.Nullable;
import com.google.android.gms.ads.internal.C3779u;
import com.google.android.gms.ads.internal.client.AbstractC3553c;
import com.google.android.gms.ads.internal.client.AbstractC3556d;
import com.google.android.gms.common.util.C4683f;
import com.tencent.tauth.AuthActivity;
import java.util.HashMap;
import java.util.Map;
@aaa
/* loaded from: classes.dex */
public class add extends AbstractC3553c.AbstractBinderC3554a {

    /* renamed from: a */
    private final acy f21249a;

    /* renamed from: c */
    private final float f21251c;

    /* renamed from: d */
    private int f21252d;

    /* renamed from: e */
    private AbstractC3556d f21253e;

    /* renamed from: f */
    private boolean f21254f;

    /* renamed from: g */
    private boolean f21255g;

    /* renamed from: h */
    private float f21256h;

    /* renamed from: j */
    private float f21258j;

    /* renamed from: b */
    private final Object f21250b = new Object();

    /* renamed from: i */
    private boolean f21257i = true;

    public add(acy acyVar, float f) {
        this.f21249a = acyVar;
        this.f21251c = f;
    }

    /* renamed from: a */
    private void m18065a(final int i, final int i2) {
        C3779u.m26890e().m18348a(new Runnable() { // from class: com.google.android.gms.internal.add.2
            @Override // java.lang.Runnable
            public void run() {
                boolean z = false;
                synchronized (add.this.f21250b) {
                    boolean z2 = i != i2;
                    boolean z3 = !add.this.f21254f && i2 == 1;
                    boolean z4 = z2 && i2 == 1;
                    boolean z5 = z2 && i2 == 2;
                    boolean z6 = z2 && i2 == 3;
                    add addVar = add.this;
                    if (add.this.f21254f || z3) {
                        z = true;
                    }
                    addVar.f21254f = z;
                    if (add.this.f21253e == null) {
                        return;
                    }
                    if (z3) {
                        try {
                            add.this.f21253e.mo27430a();
                        } catch (RemoteException e) {
                            abr.d("Unable to call onVideoStart()", e);
                        }
                    }
                    if (z4) {
                        try {
                            add.this.f21253e.mo27429b();
                        } catch (RemoteException e2) {
                            abr.d("Unable to call onVideoPlay()", e2);
                        }
                    }
                    if (z5) {
                        try {
                            add.this.f21253e.mo27428c();
                        } catch (RemoteException e3) {
                            abr.d("Unable to call onVideoPause()", e3);
                        }
                    }
                    if (z6) {
                        try {
                            add.this.f21253e.mo27427d();
                        } catch (RemoteException e4) {
                            abr.d("Unable to call onVideoEnd()", e4);
                        }
                    }
                }
            }
        });
    }

    /* renamed from: a */
    private void m18061a(String str) {
        m18060a(str, (Map<String, String>) null);
    }

    /* renamed from: a */
    private void m18060a(String str, @Nullable Map<String, String> map) {
        final HashMap hashMap = map == null ? new HashMap() : new HashMap(map);
        hashMap.put(AuthActivity.ACTION_KEY, str);
        C3779u.m26890e().m18348a(new Runnable() { // from class: com.google.android.gms.internal.add.1
            @Override // java.lang.Runnable
            public void run() {
                add.this.f21249a.mo18107a("pubVideoCmd", hashMap);
            }
        });
    }

    @Override // com.google.android.gms.ads.internal.client.AbstractC3553c
    /* renamed from: a */
    public void mo18067a() {
        m18061a("play");
    }

    /* renamed from: a */
    public void m18066a(float f, int i, boolean z, float f2) {
        int i2;
        synchronized (this.f21250b) {
            this.f21256h = f;
            this.f21255g = z;
            i2 = this.f21252d;
            this.f21252d = i;
            this.f21258j = f2;
        }
        m18065a(i2, i);
    }

    @Override // com.google.android.gms.ads.internal.client.AbstractC3553c
    /* renamed from: a */
    public void mo18064a(AbstractC3556d abstractC3556d) {
        synchronized (this.f21250b) {
            this.f21253e = abstractC3556d;
        }
    }

    @Override // com.google.android.gms.ads.internal.client.AbstractC3553c
    /* renamed from: a */
    public void mo18059a(boolean z) {
        m18061a(z ? "mute" : "unmute");
    }

    @Override // com.google.android.gms.ads.internal.client.AbstractC3553c
    /* renamed from: b */
    public void mo18058b() {
        m18061a("pause");
    }

    /* renamed from: b */
    public void m18056b(boolean z) {
        synchronized (this.f21250b) {
            this.f21257i = z;
        }
        m18060a("initialState", C4683f.m23140c("muteStart", z ? "1" : "0"));
    }

    @Override // com.google.android.gms.ads.internal.client.AbstractC3553c
    /* renamed from: c */
    public boolean mo18055c() {
        boolean z;
        synchronized (this.f21250b) {
            z = this.f21255g;
        }
        return z;
    }

    @Override // com.google.android.gms.ads.internal.client.AbstractC3553c
    /* renamed from: d */
    public int mo18053d() {
        int i;
        synchronized (this.f21250b) {
            i = this.f21252d;
        }
        return i;
    }

    @Override // com.google.android.gms.ads.internal.client.AbstractC3553c
    /* renamed from: e */
    public float mo18051e() {
        return this.f21251c;
    }

    @Override // com.google.android.gms.ads.internal.client.AbstractC3553c
    /* renamed from: f */
    public float mo18050f() {
        float f;
        synchronized (this.f21250b) {
            f = this.f21256h;
        }
        return f;
    }

    @Override // com.google.android.gms.ads.internal.client.AbstractC3553c
    /* renamed from: g */
    public float mo18049g() {
        float f;
        synchronized (this.f21250b) {
            f = this.f21258j;
        }
        return f;
    }
}
