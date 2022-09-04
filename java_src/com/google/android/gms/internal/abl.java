package com.google.android.gms.internal;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcelable;
import android.security.NetworkSecurityPolicy;
import com.google.android.gms.ads.internal.C3779u;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.util.C4696s;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.C7756tp;
import com.google.android.gms.internal.abt;
import com.google.android.gms.internal.akb;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.Future;
@aaa
/* loaded from: classes.dex */
public class abl implements abt.AbstractC6149b, C7756tp.AbstractC7759b {

    /* renamed from: b */
    private final String f20956b;

    /* renamed from: c */
    private final abm f20957c;

    /* renamed from: d */
    private C7743ti f20958d;

    /* renamed from: l */
    private Context f20966l;

    /* renamed from: m */
    private VersionInfoParcel f20967m;

    /* renamed from: r */
    private String f20972r;

    /* renamed from: t */
    private String f20974t;

    /* renamed from: a */
    private final Object f20955a = new Object();

    /* renamed from: e */
    private BigInteger f20959e = BigInteger.ONE;

    /* renamed from: f */
    private final HashSet<abj> f20960f = new HashSet<>();

    /* renamed from: g */
    private final HashMap<String, abo> f20961g = new HashMap<>();

    /* renamed from: h */
    private boolean f20962h = false;

    /* renamed from: i */
    private boolean f20963i = true;

    /* renamed from: j */
    private int f20964j = 0;

    /* renamed from: k */
    private boolean f20965k = false;

    /* renamed from: n */
    private C7791uh f20968n = null;

    /* renamed from: o */
    private boolean f20969o = true;

    /* renamed from: p */
    private C7760tq f20970p = null;

    /* renamed from: q */
    private C7755to f20971q = null;

    /* renamed from: s */
    private Boolean f20973s = null;

    /* renamed from: u */
    private boolean f20975u = false;

    /* renamed from: v */
    private boolean f20976v = false;

    /* renamed from: w */
    private boolean f20977w = false;

    /* renamed from: x */
    private boolean f20978x = false;

    /* renamed from: y */
    private String f20979y = "";

    /* renamed from: z */
    private long f20980z = 0;

    /* renamed from: A */
    private long f20953A = 0;

    /* renamed from: B */
    private int f20954B = -1;

    public abl(abv abvVar) {
        this.f20956b = abvVar.m18324d();
        this.f20957c = new abm(this.f20956b);
    }

    /* renamed from: a */
    public Bundle m18459a(Context context, abn abnVar, String str) {
        Bundle bundle;
        synchronized (this.f20955a) {
            bundle = new Bundle();
            bundle.putBundle("app", this.f20957c.m18424a(context, str));
            Bundle bundle2 = new Bundle();
            for (String str2 : this.f20961g.keySet()) {
                bundle2.putBundle(str2, this.f20961g.get(str2).m18418a());
            }
            bundle.putBundle("slots", bundle2);
            ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
            Iterator<abj> it2 = this.f20960f.iterator();
            while (it2.hasNext()) {
                arrayList.add(it2.next().m18476d());
            }
            bundle.putParcelableArrayList("ads", arrayList);
            abnVar.mo18419a(this.f20960f);
            this.f20960f.clear();
        }
        return bundle;
    }

    /* renamed from: a */
    public C7760tq m18461a(Context context) {
        if (!C7788uf.f25732Q.m13486c().booleanValue() || !C4696s.m23110d() || m18449b()) {
            return null;
        }
        synchronized (this.f20955a) {
            if (Looper.getMainLooper() == null || context == null) {
                return null;
            }
            if (this.f20971q == null) {
                this.f20971q = new C7755to();
            }
            if (this.f20970p == null) {
                this.f20970p = new C7760tq(this.f20971q, new C8148zz(this.f20966l, this.f20967m, null, null));
            }
            this.f20970p.m13544a();
            return this.f20970p;
        }
    }

    /* renamed from: a */
    public String m18464a() {
        return this.f20956b;
    }

    /* renamed from: a */
    public Future m18463a(int i) {
        Future m18407a;
        synchronized (this.f20955a) {
            this.f20954B = i;
            m18407a = abt.m18407a(this.f20966l, i);
        }
        return m18407a;
    }

    /* renamed from: a */
    public Future m18462a(long j) {
        Future future;
        synchronized (this.f20955a) {
            if (this.f20953A < j) {
                this.f20953A = j;
                future = abt.m18406a(this.f20966l, j);
            } else {
                future = null;
            }
        }
        return future;
    }

    /* renamed from: a */
    public Future m18458a(Context context, String str) {
        Future m18403a;
        this.f20980z = C3779u.m26884k().mo16434a();
        synchronized (this.f20955a) {
            if (str != null) {
                if (!str.equals(this.f20979y)) {
                    this.f20979y = str;
                    m18403a = abt.m18403a(context, str, this.f20980z);
                }
            }
            m18403a = null;
        }
        return m18403a;
    }

    /* renamed from: a */
    public Future m18457a(Context context, boolean z) {
        Future future;
        synchronized (this.f20955a) {
            if (z != this.f20963i) {
                this.f20963i = z;
                future = abt.m18402a(context, z);
            } else {
                future = null;
            }
        }
        return future;
    }

    /* renamed from: a */
    public Future m18454a(String str) {
        Future m18404a;
        synchronized (this.f20955a) {
            if (str != null) {
                if (!str.equals(this.f20972r)) {
                    this.f20972r = str;
                    m18404a = abt.m18404a(this.f20966l, str);
                }
            }
            m18404a = null;
        }
        return m18404a;
    }

    @TargetApi(23)
    /* renamed from: a */
    public void m18460a(Context context, VersionInfoParcel versionInfoParcel) {
        synchronized (this.f20955a) {
            if (!this.f20965k) {
                this.f20966l = context.getApplicationContext();
                this.f20967m = versionInfoParcel;
                C3779u.m26887h().m13557a(this);
                abt.m18405a(context, this);
                abt.m18401b(context, this);
                abt.m18399c(context, this);
                abt.m18397d(context, this);
                abt.m18396e(context, this);
                abt.m18395f(context, this);
                abt.m18394g(context, this);
                m18452a(Thread.currentThread());
                this.f20974t = C3779u.m26890e().m18372a(context, versionInfoParcel.f14733b);
                if (C4696s.m23102l() && !NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted()) {
                    this.f20976v = true;
                }
                this.f20958d = new C7743ti(context.getApplicationContext(), this.f20967m, C3779u.m26890e().m18374a(context, versionInfoParcel));
                m18428s();
                C3779u.m26876s().m27083a(this.f20966l);
                this.f20965k = true;
            }
        }
    }

    @Override // com.google.android.gms.internal.abt.AbstractC6149b
    /* renamed from: a */
    public void mo18393a(Bundle bundle) {
        synchronized (this.f20955a) {
            this.f20963i = bundle.getBoolean("use_https", this.f20963i);
            this.f20964j = bundle.getInt("webview_cache_version", this.f20964j);
            if (bundle.containsKey("content_url_opted_out")) {
                m18447b(bundle.getBoolean("content_url_opted_out"));
            }
            if (bundle.containsKey("content_url_hashes")) {
                this.f20972r = bundle.getString("content_url_hashes");
            }
            this.f20977w = bundle.getBoolean("auto_collect_location", this.f20977w);
            this.f20979y = bundle.containsKey("app_settings_json") ? bundle.getString("app_settings_json") : this.f20979y;
            this.f20980z = bundle.getLong("app_settings_last_update_ms", this.f20980z);
            this.f20953A = bundle.getLong("app_last_background_time_ms", this.f20953A);
            this.f20954B = bundle.getInt("request_in_session_count", this.f20954B);
        }
    }

    /* renamed from: a */
    public void m18456a(abj abjVar) {
        synchronized (this.f20955a) {
            this.f20960f.add(abjVar);
        }
    }

    /* renamed from: a */
    public void m18455a(Boolean bool) {
        synchronized (this.f20955a) {
            this.f20973s = bool;
        }
    }

    /* renamed from: a */
    public void m18453a(String str, abo aboVar) {
        synchronized (this.f20955a) {
            this.f20961g.put(str, aboVar);
        }
    }

    /* renamed from: a */
    public void m18452a(Thread thread) {
        C8148zz.m12703a(this.f20966l, thread, this.f20967m);
    }

    /* renamed from: a */
    public void m18451a(Throwable th, String str) {
        new C8148zz(this.f20966l, this.f20967m, null, null).m12699a(th, str);
    }

    /* renamed from: a */
    public void m18450a(HashSet<abj> hashSet) {
        synchronized (this.f20955a) {
            this.f20960f.addAll(hashSet);
        }
    }

    @Override // com.google.android.gms.internal.C7756tp.AbstractC7759b
    /* renamed from: a */
    public void mo13545a(boolean z) {
        if (!z) {
            m18462a(C3779u.m26884k().mo16434a());
            m18463a(this.f20957c.m18420d());
        } else if (C3779u.m26884k().mo16434a() - this.f20953A > C7788uf.f25785aq.m13486c().longValue()) {
            this.f20957c.m18426a(-1);
        } else {
            this.f20957c.m18426a(this.f20954B);
        }
    }

    /* renamed from: b */
    public Future m18448b(Context context, boolean z) {
        Future future;
        synchronized (this.f20955a) {
            if (z != this.f20977w) {
                this.f20977w = z;
                future = abt.m18398c(context, z);
            } else {
                future = null;
            }
        }
        return future;
    }

    /* renamed from: b */
    public void m18447b(boolean z) {
        synchronized (this.f20955a) {
            if (this.f20969o != z) {
                abt.m18400b(this.f20966l, z);
            }
            this.f20969o = z;
            C7760tq m18461a = m18461a(this.f20966l);
            if (m18461a != null && !m18461a.isAlive()) {
                abr.c("start fetching content...");
                m18461a.m13544a();
            }
        }
    }

    /* renamed from: b */
    public boolean m18449b() {
        boolean z;
        synchronized (this.f20955a) {
            z = this.f20969o;
        }
        return z;
    }

    /* renamed from: c */
    public String m18446c() {
        String bigInteger;
        synchronized (this.f20955a) {
            bigInteger = this.f20959e.toString();
            this.f20959e = this.f20959e.add(BigInteger.ONE);
        }
        return bigInteger;
    }

    /* renamed from: c */
    public void m18445c(boolean z) {
        this.f20978x = z;
    }

    /* renamed from: d */
    public abm m18444d() {
        abm abmVar;
        synchronized (this.f20955a) {
            abmVar = this.f20957c;
        }
        return abmVar;
    }

    /* renamed from: d */
    public void m18443d(boolean z) {
        synchronized (this.f20955a) {
            this.f20975u = z;
        }
    }

    /* renamed from: e */
    public C7791uh m18442e() {
        C7791uh c7791uh;
        synchronized (this.f20955a) {
            c7791uh = this.f20968n;
        }
        return c7791uh;
    }

    /* renamed from: f */
    public boolean m18441f() {
        boolean z;
        synchronized (this.f20955a) {
            z = this.f20962h;
            this.f20962h = true;
        }
        return z;
    }

    /* renamed from: g */
    public boolean m18440g() {
        boolean z;
        synchronized (this.f20955a) {
            z = this.f20963i || this.f20976v;
        }
        return z;
    }

    /* renamed from: h */
    public String m18439h() {
        String str;
        synchronized (this.f20955a) {
            str = this.f20974t;
        }
        return str;
    }

    /* renamed from: i */
    public String m18438i() {
        String str;
        synchronized (this.f20955a) {
            str = this.f20972r;
        }
        return str;
    }

    /* renamed from: j */
    public Boolean m18437j() {
        Boolean bool;
        synchronized (this.f20955a) {
            bool = this.f20973s;
        }
        return bool;
    }

    /* renamed from: k */
    public boolean m18436k() {
        boolean z;
        synchronized (this.f20955a) {
            z = this.f20977w;
        }
        return z;
    }

    /* renamed from: l */
    public long m18435l() {
        long j;
        synchronized (this.f20955a) {
            j = this.f20953A;
        }
        return j;
    }

    /* renamed from: m */
    public int m18434m() {
        int i;
        synchronized (this.f20955a) {
            i = this.f20954B;
        }
        return i;
    }

    /* renamed from: n */
    public boolean m18433n() {
        return this.f20978x;
    }

    /* renamed from: o */
    public abk m18432o() {
        abk abkVar;
        synchronized (this.f20955a) {
            abkVar = new abk(this.f20979y, this.f20980z);
        }
        return abkVar;
    }

    /* renamed from: p */
    public C7743ti m18431p() {
        return this.f20958d;
    }

    /* renamed from: q */
    public Resources m18430q() {
        if (this.f20967m.f14736e) {
            return this.f20966l.getResources();
        }
        try {
            akb m17066a = akb.m17066a(this.f20966l, akb.f22109a, ModuleDescriptor.MODULE_ID);
            if (m17066a == null) {
                return null;
            }
            return m17066a.m17068a().getResources();
        } catch (akb.C6444a e) {
            abr.d("Cannot load resource from dynamite apk or local jar", e);
            return null;
        }
    }

    /* renamed from: r */
    public boolean m18429r() {
        boolean z;
        synchronized (this.f20955a) {
            z = this.f20975u;
        }
        return z;
    }

    /* renamed from: s */
    void m18428s() {
        try {
            this.f20968n = C3779u.m26883l().m13453a(new C7790ug(this.f20966l, this.f20967m.f14733b));
        } catch (IllegalArgumentException e) {
            abr.d("Cannot initialize CSI reporter.", e);
        }
    }
}
