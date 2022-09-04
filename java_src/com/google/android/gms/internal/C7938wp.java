package com.google.android.gms.internal;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Parcel;
import android.support.annotation.Nullable;
import android.util.Base64;
import com.google.android.gms.ads.internal.C3779u;
import com.google.android.gms.ads.internal.client.AdRequestParcel;
import com.google.android.gms.internal.C7940wr;
import com.google.android.gms.internal.aak;
import com.xiaomi.mipush.sdk.Constants;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.regex.Pattern;
@aaa
/* renamed from: com.google.android.gms.internal.wp */
/* loaded from: classes.dex */
public class C7938wp {

    /* renamed from: a */
    private final Map<C7939wq, C7940wr> f26111a = new HashMap();

    /* renamed from: b */
    private final LinkedList<C7939wq> f26112b = new LinkedList<>();
    @Nullable

    /* renamed from: c */
    private C7910wm f26113c;

    /* JADX INFO: Access modifiers changed from: package-private */
    @Nullable
    /* renamed from: a */
    public static Bundle m13224a(AdRequestParcel adRequestParcel) {
        Bundle bundle = adRequestParcel.f13857m;
        if (bundle == null) {
            return null;
        }
        return bundle.getBundle("com.google.ads.mediation.admob.AdMobAdapter");
    }

    /* renamed from: a */
    private static void m13225a(Bundle bundle, String str) {
        String[] split = str.split("/", 2);
        if (split.length == 0) {
            return;
        }
        String str2 = split[0];
        if (split.length == 1) {
            bundle.remove(str2);
            return;
        }
        Bundle bundle2 = bundle.getBundle(str2);
        if (bundle2 == null) {
            return;
        }
        m13225a(bundle2, split[1]);
    }

    /* renamed from: a */
    private static void m13220a(String str, C7939wq c7939wq) {
        if (abr.a(2)) {
            abr.m18409e(String.format(str, c7939wq));
        }
    }

    /* renamed from: a */
    private String[] m13221a(String str) {
        try {
            String[] split = str.split("\u0000");
            for (int i = 0; i < split.length; i++) {
                split[i] = new String(Base64.decode(split[i], 0), "UTF-8");
            }
            return split;
        } catch (UnsupportedEncodingException e) {
            return new String[0];
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static AdRequestParcel m13218b(AdRequestParcel adRequestParcel) {
        AdRequestParcel m13212d = m13212d(adRequestParcel);
        Bundle m13224a = m13224a(m13212d);
        if (m13224a == null) {
            m13224a = new Bundle();
            m13212d.f13857m.putBundle("com.google.ads.mediation.admob.AdMobAdapter", m13224a);
        }
        m13224a.putBoolean("_skipMediation", true);
        return m13212d;
    }

    /* renamed from: b */
    private boolean m13216b(String str) {
        try {
            return Pattern.matches(C7788uf.f25745aC.m13486c(), str);
        } catch (RuntimeException e) {
            C3779u.m26886i().m18451a(e, "InterstitialAdPool.isExcludedAdUnit");
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static boolean m13214c(AdRequestParcel adRequestParcel) {
        Bundle bundle;
        Bundle bundle2 = adRequestParcel.f13857m;
        return (bundle2 == null || (bundle = bundle2.getBundle("com.google.ads.mediation.admob.AdMobAdapter")) == null || !bundle.containsKey("_skipMediation")) ? false : true;
    }

    /* renamed from: d */
    static AdRequestParcel m13212d(AdRequestParcel adRequestParcel) {
        Parcel obtain = Parcel.obtain();
        adRequestParcel.writeToParcel(obtain, 0);
        obtain.setDataPosition(0);
        AdRequestParcel adRequestParcel2 = (AdRequestParcel) AdRequestParcel.CREATOR.createFromParcel(obtain);
        obtain.recycle();
        AdRequestParcel.m27640a(adRequestParcel2);
        return adRequestParcel2;
    }

    /* renamed from: e */
    private static AdRequestParcel m13210e(AdRequestParcel adRequestParcel) {
        AdRequestParcel m13212d = m13212d(adRequestParcel);
        for (String str : C7788uf.f25793ay.m13486c().split(Constants.ACCEPT_TIME_SEPARATOR_SP)) {
            m13225a(m13212d.f13857m, str);
        }
        return m13212d;
    }

    /* renamed from: e */
    private String m13211e() {
        try {
            StringBuilder sb = new StringBuilder();
            Iterator<C7939wq> it2 = this.f26112b.iterator();
            while (it2.hasNext()) {
                sb.append(Base64.encodeToString(it2.next().toString().getBytes("UTF-8"), 0));
                if (it2.hasNext()) {
                    sb.append("\u0000");
                }
            }
            return sb.toString();
        } catch (UnsupportedEncodingException e) {
            return "";
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Nullable
    /* renamed from: a */
    public C7940wr.C7941a m13223a(AdRequestParcel adRequestParcel, String str) {
        C7940wr c7940wr;
        if (m13216b(str)) {
            return null;
        }
        int i = new aak.C6115a(this.f26113c.m13250a()).m18608a().f20762m;
        AdRequestParcel m13210e = m13210e(adRequestParcel);
        C7939wq c7939wq = new C7939wq(m13210e, str, i);
        C7940wr c7940wr2 = this.f26111a.get(c7939wq);
        if (c7940wr2 == null) {
            m13220a("Interstitial pool created at %s.", c7939wq);
            C7940wr c7940wr3 = new C7940wr(m13210e, str, i);
            this.f26111a.put(c7939wq, c7940wr3);
            c7940wr = c7940wr3;
        } else {
            c7940wr = c7940wr2;
        }
        this.f26112b.remove(c7939wq);
        this.f26112b.add(c7939wq);
        c7940wr.m13196g();
        while (this.f26112b.size() > C7788uf.f25794az.m13486c().intValue()) {
            C7939wq remove = this.f26112b.remove();
            C7940wr c7940wr4 = this.f26111a.get(remove);
            m13220a("Evicting interstitial queue for %s.", remove);
            while (c7940wr4.m13199d() > 0) {
                c7940wr4.m13206a((AdRequestParcel) null).f26120a.m27305I();
            }
            this.f26111a.remove(remove);
        }
        while (c7940wr.m13199d() > 0) {
            C7940wr.C7941a m13206a = c7940wr.m13206a(m13210e);
            if (!m13206a.f26124e || C3779u.m26884k().mo16434a() - m13206a.f26123d <= 1000 * C7788uf.f25744aB.m13486c().intValue()) {
                String str2 = m13206a.f26121b != null ? " (inline) " : " ";
                m13220a(new StringBuilder(String.valueOf(str2).length() + 34).append("Pooled interstitial").append(str2).append("returned at %s.").toString(), c7939wq);
                return m13206a;
            }
            m13220a("Expired interstitial at %s.", c7939wq);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m13226a() {
        int m13199d;
        int m13198e;
        if (this.f26113c == null) {
            return;
        }
        for (Map.Entry<C7939wq, C7940wr> entry : this.f26111a.entrySet()) {
            C7939wq key = entry.getKey();
            C7940wr value = entry.getValue();
            if (abr.a(2) && (m13198e = value.m13198e()) < (m13199d = value.m13199d())) {
                abr.m18409e(String.format("Loading %s/%s pooled interstitials for %s.", Integer.valueOf(m13199d - m13198e), Integer.valueOf(m13199d), key));
            }
            value.m13197f();
            while (value.m13199d() < C7788uf.f25743aA.m13486c().intValue()) {
                m13220a("Pooling and loading one new interstitial for %s.", key);
                value.m13205a(this.f26113c);
            }
        }
        m13219b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m13222a(C7910wm c7910wm) {
        if (this.f26113c == null) {
            this.f26113c = c7910wm.m13248b();
            m13215c();
        }
    }

    /* renamed from: b */
    void m13219b() {
        if (this.f26113c == null) {
            return;
        }
        SharedPreferences.Editor edit = this.f26113c.m13250a().getSharedPreferences("com.google.android.gms.ads.internal.interstitial.InterstitialAdPool", 0).edit();
        edit.clear();
        for (Map.Entry<C7939wq, C7940wr> entry : this.f26111a.entrySet()) {
            C7939wq key = entry.getKey();
            C7940wr value = entry.getValue();
            if (value.m13195h()) {
                edit.putString(key.toString(), new C7943wt(value).m13164a());
                m13220a("Saved interstitial queue for %s.", key);
            }
        }
        edit.putString("PoolKeys", m13211e());
        edit.apply();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public void m13217b(AdRequestParcel adRequestParcel, String str) {
        if (this.f26113c == null) {
            return;
        }
        int i = new aak.C6115a(this.f26113c.m13250a()).m18608a().f20762m;
        AdRequestParcel m13210e = m13210e(adRequestParcel);
        C7939wq c7939wq = new C7939wq(m13210e, str, i);
        C7940wr c7940wr = this.f26111a.get(c7939wq);
        if (c7940wr == null) {
            m13220a("Interstitial pool created at %s.", c7939wq);
            c7940wr = new C7940wr(m13210e, str, i);
            this.f26111a.put(c7939wq, c7940wr);
        }
        c7940wr.m13204a(this.f26113c, adRequestParcel);
        c7940wr.m13196g();
        m13220a("Inline entry added to the queue at %s.", c7939wq);
    }

    /* renamed from: c */
    void m13215c() {
        if (this.f26113c == null) {
            return;
        }
        SharedPreferences sharedPreferences = this.f26113c.m13250a().getSharedPreferences("com.google.android.gms.ads.internal.interstitial.InterstitialAdPool", 0);
        m13213d();
        try {
            HashMap hashMap = new HashMap();
            for (Map.Entry<String, ?> entry : sharedPreferences.getAll().entrySet()) {
                if (!entry.getKey().equals("PoolKeys")) {
                    C7943wt m13163a = C7943wt.m13163a((String) entry.getValue());
                    C7939wq c7939wq = new C7939wq(m13163a.f26133a, m13163a.f26134b, m13163a.f26135c);
                    if (!this.f26111a.containsKey(c7939wq)) {
                        this.f26111a.put(c7939wq, new C7940wr(m13163a.f26133a, m13163a.f26134b, m13163a.f26135c));
                        hashMap.put(c7939wq.toString(), c7939wq);
                        m13220a("Restored interstitial queue for %s.", c7939wq);
                    }
                }
            }
            for (String str : m13221a(sharedPreferences.getString("PoolKeys", ""))) {
                C7939wq c7939wq2 = (C7939wq) hashMap.get(str);
                if (this.f26111a.containsKey(c7939wq2)) {
                    this.f26112b.add(c7939wq2);
                }
            }
        } catch (Throwable th) {
            C3779u.m26886i().m18451a(th, "InterstitialAdPool.restore");
            abr.d("Malformed preferences value for InterstitialAdPool.", th);
            this.f26111a.clear();
            this.f26112b.clear();
        }
    }

    /* renamed from: d */
    void m13213d() {
        while (this.f26112b.size() > 0) {
            C7939wq remove = this.f26112b.remove();
            C7940wr c7940wr = this.f26111a.get(remove);
            m13220a("Flushing interstitial queue for %s.", remove);
            while (c7940wr.m13199d() > 0) {
                c7940wr.m13206a((AdRequestParcel) null).f26120a.m27305I();
            }
            this.f26111a.remove(remove);
        }
    }
}
