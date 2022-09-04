package com.google.android.gms.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import com.google.ads.mediation.AdUrlAdapter;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.formats.C3458b;
import com.google.android.gms.ads.internal.C3779u;
import com.google.android.gms.ads.internal.client.AdRequestParcel;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.formats.NativeAdOptionsParcel;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.mediation.AbstractC3792b;
import com.google.android.gms.internal.AbstractC8014xt;
import com.google.android.gms.internal.C7996xl;
import com.google.android.gms.p232c.BinderC4173f;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;
@aaa
/* renamed from: com.google.android.gms.internal.xk */
/* loaded from: classes.dex */
public class C7993xk implements C7996xl.AbstractC7997a {

    /* renamed from: a */
    private final String f26251a;

    /* renamed from: b */
    private final AbstractC8005xq f26252b;

    /* renamed from: c */
    private final long f26253c;

    /* renamed from: d */
    private final C7990xh f26254d;

    /* renamed from: e */
    private final C7989xg f26255e;

    /* renamed from: f */
    private AdRequestParcel f26256f;

    /* renamed from: g */
    private final AdSizeParcel f26257g;

    /* renamed from: h */
    private final Context f26258h;

    /* renamed from: j */
    private final VersionInfoParcel f26260j;

    /* renamed from: k */
    private final boolean f26261k;

    /* renamed from: l */
    private final NativeAdOptionsParcel f26262l;

    /* renamed from: m */
    private final List<String> f26263m;

    /* renamed from: n */
    private final boolean f26264n;

    /* renamed from: o */
    private AbstractC8008xr f26265o;

    /* renamed from: q */
    private AbstractC8014xt f26267q;

    /* renamed from: i */
    private final Object f26259i = new Object();

    /* renamed from: p */
    private int f26266p = -2;

    public C7993xk(Context context, String str, AbstractC8005xq abstractC8005xq, C7990xh c7990xh, C7989xg c7989xg, AdRequestParcel adRequestParcel, AdSizeParcel adSizeParcel, VersionInfoParcel versionInfoParcel, boolean z, boolean z2, NativeAdOptionsParcel nativeAdOptionsParcel, List<String> list) {
        this.f26258h = context;
        this.f26252b = abstractC8005xq;
        this.f26255e = c7989xg;
        if ("com.google.ads.mediation.customevent.CustomEventAdapter".equals(str)) {
            this.f26251a = m13088b();
        } else {
            this.f26251a = str;
        }
        this.f26254d = c7990xh;
        this.f26253c = c7990xh.f26233b != -1 ? c7990xh.f26233b : 10000L;
        this.f26256f = adRequestParcel;
        this.f26257g = adSizeParcel;
        this.f26260j = versionInfoParcel;
        this.f26261k = z;
        this.f26264n = z2;
        this.f26262l = nativeAdOptionsParcel;
        this.f26263m = list;
    }

    /* renamed from: a */
    private long m13096a(long j, long j2, long j3, long j4) {
        while (this.f26266p == -2) {
            m13086b(j, j2, j3, j4);
        }
        return C3779u.m26884k().mo16432b() - j;
    }

    /* renamed from: a */
    private String m13089a(String str) {
        if (str == null || !m13077e() || m13087b(2)) {
            return str;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            jSONObject.remove("cpm_floor_cents");
            return jSONObject.toString();
        } catch (JSONException e) {
            abr.d("Could not remove field. Returning the original value");
            return str;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m13094a(BinderC7992xj binderC7992xj) {
        String m13089a = m13089a(this.f26255e.f26224i);
        try {
            if (this.f26260j.f14735d < 4100000) {
                if (this.f26257g.f13867e) {
                    this.f26265o.mo12972a(BinderC4173f.m25293a(this.f26258h), this.f26256f, m13089a, binderC7992xj);
                } else {
                    this.f26265o.mo12969a(BinderC4173f.m25293a(this.f26258h), this.f26257g, this.f26256f, m13089a, binderC7992xj);
                }
            } else if (this.f26261k) {
                this.f26265o.mo12970a(BinderC4173f.m25293a(this.f26258h), this.f26256f, m13089a, this.f26255e.f26216a, binderC7992xj, this.f26262l, this.f26263m);
            } else if (this.f26257g.f13867e) {
                this.f26265o.mo12971a(BinderC4173f.m25293a(this.f26258h), this.f26256f, m13089a, this.f26255e.f26216a, binderC7992xj);
            } else if (!this.f26264n) {
                this.f26265o.mo12968a(BinderC4173f.m25293a(this.f26258h), this.f26257g, this.f26256f, m13089a, this.f26255e.f26216a, binderC7992xj);
            } else if (this.f26255e.f26227l != null) {
                this.f26265o.mo12970a(BinderC4173f.m25293a(this.f26258h), this.f26256f, m13089a, this.f26255e.f26216a, binderC7992xj, new NativeAdOptionsParcel(m13084b(this.f26255e.f26231p)), this.f26255e.f26230o);
            } else {
                this.f26265o.mo12968a(BinderC4173f.m25293a(this.f26258h), this.f26257g, this.f26256f, m13089a, this.f26255e.f26216a, binderC7992xj);
            }
        } catch (RemoteException e) {
            abr.d("Could not request ad from mediation adapter.", e);
            mo13073a(5);
        }
    }

    /* renamed from: b */
    private static C3458b m13084b(String str) {
        C3458b.C3461b c3461b = new C3458b.C3461b();
        if (str == null) {
            return c3461b.m27728a();
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            c3461b.m27721b(jSONObject.optBoolean("multiple_images", false));
            c3461b.m27724a(jSONObject.optBoolean("only_urls", false));
            c3461b.m27727a(m13080c(jSONObject.optString("native_image_orientation", "any")));
        } catch (JSONException e) {
            abr.d("Exception occurred when creating native ad options", e);
        }
        return c3461b.m27728a();
    }

    /* renamed from: b */
    private String m13088b() {
        try {
            if (!TextUtils.isEmpty(this.f26255e.f26220e)) {
                return this.f26252b.mo13052b(this.f26255e.f26220e) ? "com.google.android.gms.ads.mediation.customevent.CustomEventAdapter" : "com.google.ads.mediation.customevent.CustomEventAdapter";
            }
        } catch (RemoteException e) {
            abr.d("Fail to determine the custom event's version, assuming the old one.");
        }
        return "com.google.ads.mediation.customevent.CustomEventAdapter";
    }

    /* renamed from: b */
    private void m13086b(long j, long j2, long j3, long j4) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j5 = j2 - (elapsedRealtime - j);
        long j6 = j4 - (elapsedRealtime - j3);
        if (j5 <= 0 || j6 <= 0) {
            abr.c("Timed out waiting for adapter.");
            this.f26266p = 3;
            return;
        }
        try {
            this.f26259i.wait(Math.min(j5, j6));
        } catch (InterruptedException e) {
            this.f26266p = -1;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public boolean m13087b(int i) {
        try {
            Bundle mo12956l = this.f26261k ? this.f26265o.mo12956l() : this.f26257g.f13867e ? this.f26265o.mo12957k() : this.f26265o.mo12958j();
            if (mo12956l == null) {
                return false;
            }
            return (mo12956l.getInt("capabilities", 0) & i) == i;
        } catch (RemoteException e) {
            abr.d("Could not get adapter info. Returning false");
            return false;
        }
    }

    /* renamed from: c */
    private static int m13080c(String str) {
        if ("landscape".equals(str)) {
            return 2;
        }
        return "portrait".equals(str) ? 1 : 0;
    }

    /* renamed from: c */
    private AbstractC8014xt m13083c() {
        if (this.f26266p != 0 || !m13077e()) {
            return null;
        }
        try {
            if (m13087b(4) && this.f26267q != null && this.f26267q.mo13040a() != 0) {
                return this.f26267q;
            }
        } catch (RemoteException e) {
            abr.d("Could not get cpm value from MediationResponseMetadata");
        }
        return m13082c(m13075f());
    }

    /* renamed from: c */
    private static AbstractC8014xt m13082c(final int i) {
        return new AbstractC8014xt.AbstractBinderC8015a() { // from class: com.google.android.gms.internal.xk.2
            @Override // com.google.android.gms.internal.AbstractC8014xt
            /* renamed from: a */
            public int mo13040a() {
                return i;
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public AbstractC8008xr m13079d() {
        String valueOf = String.valueOf(this.f26251a);
        abr.c(valueOf.length() != 0 ? "Instantiating mediation adapter: ".concat(valueOf) : new String("Instantiating mediation adapter: "));
        if (!this.f26261k) {
            if (C7788uf.f25764aV.m13486c().booleanValue() && "com.google.ads.mediation.admob.AdMobAdapter".equals(this.f26251a)) {
                return m13095a(new AdMobAdapter());
            }
            if (C7788uf.f25765aW.m13486c().booleanValue() && "com.google.ads.mediation.AdUrlAdapter".equals(this.f26251a)) {
                return m13095a(new AdUrlAdapter());
            }
            if ("com.google.ads.mediation.admob.AdMobCustomTabsAdapter".equals(this.f26251a)) {
                return new BinderC8024xx(new C8046yg());
            }
        }
        try {
            return this.f26252b.mo13053a(this.f26251a);
        } catch (RemoteException e) {
            String valueOf2 = String.valueOf(this.f26251a);
            abr.a(valueOf2.length() != 0 ? "Could not instantiate mediation adapter: ".concat(valueOf2) : new String("Could not instantiate mediation adapter: "), e);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e */
    public boolean m13077e() {
        return this.f26254d.f26243l != -1;
    }

    /* renamed from: f */
    private int m13075f() {
        if (this.f26255e.f26224i == null) {
            return 0;
        }
        try {
            JSONObject jSONObject = new JSONObject(this.f26255e.f26224i);
            if ("com.google.ads.mediation.admob.AdMobAdapter".equals(this.f26251a)) {
                return jSONObject.optInt("cpm_cents", 0);
            }
            int optInt = m13087b(2) ? jSONObject.optInt("cpm_floor_cents", 0) : 0;
            return optInt == 0 ? jSONObject.optInt("penalized_average_cpm_cents", 0) : optInt;
        } catch (JSONException e) {
            abr.d("Could not convert to json. Returning 0");
            return 0;
        }
    }

    /* renamed from: a */
    public C7996xl m13097a(long j, long j2) {
        C7996xl c7996xl;
        synchronized (this.f26259i) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            final BinderC7992xj binderC7992xj = new BinderC7992xj();
            abv.f21039a.post(new Runnable() { // from class: com.google.android.gms.internal.xk.1
                @Override // java.lang.Runnable
                public void run() {
                    synchronized (C7993xk.this.f26259i) {
                        if (C7993xk.this.f26266p != -2) {
                            return;
                        }
                        C7993xk.this.f26265o = C7993xk.this.m13079d();
                        if (C7993xk.this.f26265o == null) {
                            C7993xk.this.mo13073a(4);
                        } else if (!C7993xk.this.m13077e() || C7993xk.this.m13087b(1)) {
                            binderC7992xj.m13099a(C7993xk.this);
                            C7993xk.this.m13094a(binderC7992xj);
                        } else {
                            String str = C7993xk.this.f26251a;
                            abr.d(new StringBuilder(String.valueOf(str).length() + 56).append("Ignoring adapter ").append(str).append(" as delayed impression is not supported").toString());
                            C7993xk.this.mo13073a(2);
                        }
                    }
                }
            });
            c7996xl = new C7996xl(this.f26255e, this.f26265o, this.f26251a, binderC7992xj, this.f26266p, m13083c(), m13096a(elapsedRealtime, this.f26253c, j, j2));
        }
        return c7996xl;
    }

    /* renamed from: a */
    protected AbstractC8008xr m13095a(AbstractC3792b abstractC3792b) {
        return new BinderC8024xx(abstractC3792b);
    }

    /* renamed from: a */
    public void m13098a() {
        synchronized (this.f26259i) {
            try {
                if (this.f26265o != null) {
                    this.f26265o.mo12965c();
                }
            } catch (RemoteException e) {
                abr.d("Could not destroy mediation adapter.", e);
            }
            this.f26266p = -1;
            this.f26259i.notify();
        }
    }

    @Override // com.google.android.gms.internal.C7996xl.AbstractC7997a
    /* renamed from: a */
    public void mo13073a(int i) {
        synchronized (this.f26259i) {
            this.f26266p = i;
            this.f26259i.notify();
        }
    }

    @Override // com.google.android.gms.internal.C7996xl.AbstractC7997a
    /* renamed from: a */
    public void mo13072a(int i, AbstractC8014xt abstractC8014xt) {
        synchronized (this.f26259i) {
            this.f26266p = i;
            this.f26267q = abstractC8014xt;
            this.f26259i.notify();
        }
    }
}
