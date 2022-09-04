package com.google.android.gms.analytics;

import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.analytics.internal.C3887c;
import com.google.android.gms.analytics.internal.C3909p;
import com.google.android.gms.analytics.internal.C3919s;
import com.google.android.gms.analytics.internal.C3921u;
import com.google.android.gms.analytics.internal.C3922v;
import com.google.android.gms.analytics.internal.C3925x;
import com.google.android.gms.analytics.p229a.C3832a;
import com.google.android.gms.analytics.p229a.C3833b;
import com.google.android.gms.analytics.p229a.C3834c;
import com.google.android.gms.common.internal.C4588d;
import com.google.android.gms.internal.C6217ads;
import com.google.android.gms.internal.ado;
import com.google.android.gms.internal.adp;
import com.google.android.gms.internal.adq;
import com.google.android.gms.internal.adr;
import com.google.android.gms.internal.adt;
import com.google.android.gms.internal.adu;
import com.google.android.gms.internal.adv;
import com.google.android.gms.internal.adw;
import com.google.android.gms.internal.adx;
import com.google.android.gms.internal.ady;
import com.google.android.gms.internal.adz;
import com.google.android.gms.internal.aea;
import com.google.firebase.p253b.C9755a;
import com.tencent.stat.DeviceInfo;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* renamed from: com.google.android.gms.analytics.i */
/* loaded from: classes2.dex */
public class C3856i extends C3919s implements AbstractC3947r {

    /* renamed from: a */
    private static DecimalFormat f14956a;

    /* renamed from: b */
    private final C3922v f14957b;

    /* renamed from: c */
    private final String f14958c;

    /* renamed from: d */
    private final Uri f14959d;

    /* renamed from: e */
    private final boolean f14960e;

    /* renamed from: f */
    private final boolean f14961f;

    public C3856i(C3922v c3922v, String str) {
        this(c3922v, str, true, false);
    }

    public C3856i(C3922v c3922v, String str, boolean z, boolean z2) {
        super(c3922v);
        C4588d.m23625a(str);
        this.f14957b = c3922v;
        this.f14958c = str;
        this.f14960e = z;
        this.f14961f = z2;
        this.f14959d = m26462a(this.f14958c);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static Uri m26462a(String str) {
        C4588d.m23625a(str);
        Uri.Builder builder = new Uri.Builder();
        builder.scheme("uri");
        builder.authority("google-analytics.com");
        builder.path(str);
        return builder.build();
    }

    /* renamed from: a */
    static String m26464a(double d) {
        if (f14956a == null) {
            f14956a = new DecimalFormat("0.######");
        }
        return f14956a.format(d);
    }

    /* renamed from: a */
    private static String m26463a(Object obj) {
        if (obj == null) {
            return null;
        }
        if (obj instanceof String) {
            String str = (String) obj;
            if (!TextUtils.isEmpty(str)) {
                return str;
            }
            return null;
        } else if (obj instanceof Double) {
            Double d = (Double) obj;
            if (d.doubleValue() == C9755a.f30449c) {
                return null;
            }
            return m26464a(d.doubleValue());
        } else if (!(obj instanceof Boolean)) {
            return String.valueOf(obj);
        } else {
            if (obj == Boolean.FALSE) {
                return null;
            }
            return "1";
        }
    }

    /* renamed from: a */
    private static String m26461a(Map<String, String> map) {
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            if (sb.length() != 0) {
                sb.append(", ");
            }
            sb.append(entry.getKey());
            sb.append("=");
            sb.append(entry.getValue());
        }
        return sb.toString();
    }

    /* renamed from: a */
    private static void m26460a(Map<String, String> map, String str, double d) {
        if (d != C9755a.f30449c) {
            map.put(str, m26464a(d));
        }
    }

    /* renamed from: a */
    private static void m26459a(Map<String, String> map, String str, int i, int i2) {
        if (i <= 0 || i2 <= 0) {
            return;
        }
        map.put(str, new StringBuilder(23).append(i).append("x").append(i2).toString());
    }

    /* renamed from: a */
    private static void m26458a(Map<String, String> map, String str, String str2) {
        if (!TextUtils.isEmpty(str2)) {
            map.put(str, str2);
        }
    }

    /* renamed from: a */
    private static void m26457a(Map<String, String> map, String str, boolean z) {
        if (z) {
            map.put(str, "1");
        }
    }

    /* renamed from: b */
    public static Map<String, String> m26456b(C3936l c3936l) {
        HashMap hashMap = new HashMap();
        C6217ads c6217ads = (C6217ads) c3936l.m25997a(C6217ads.class);
        if (c6217ads != null) {
            for (Map.Entry<String, Object> entry : c6217ads.m17998a().entrySet()) {
                String m26463a = m26463a(entry.getValue());
                if (m26463a != null) {
                    hashMap.put(entry.getKey(), m26463a);
                }
            }
        }
        adx adxVar = (adx) c3936l.m25997a(adx.class);
        if (adxVar != null) {
            m26458a(hashMap, "t", adxVar.m17961a());
            m26458a(hashMap, "cid", adxVar.m17956b());
            m26458a(hashMap, "uid", adxVar.m17953c());
            m26458a(hashMap, "sc", adxVar.m17947f());
            m26460a(hashMap, "sf", adxVar.m17945h());
            m26457a(hashMap, "ni", adxVar.m17946g());
            m26458a(hashMap, "adid", adxVar.m17951d());
            m26457a(hashMap, "ate", adxVar.m17949e());
        }
        ady adyVar = (ady) c3936l.m25997a(ady.class);
        if (adyVar != null) {
            m26458a(hashMap, "cd", adyVar.m17939b());
            m26460a(hashMap, "a", adyVar.m17935c());
            m26458a(hashMap, "dr", adyVar.m17933d());
        }
        adv advVar = (adv) c3936l.m25997a(adv.class);
        if (advVar != null) {
            m26458a(hashMap, "ec", advVar.m17975a());
            m26458a(hashMap, "ea", advVar.m17971b());
            m26458a(hashMap, "el", advVar.m17969c());
            m26460a(hashMap, "ev", advVar.m17967d());
        }
        adp adpVar = (adp) c3936l.m25997a(adp.class);
        if (adpVar != null) {
            m26458a(hashMap, "cn", adpVar.m18023a());
            m26458a(hashMap, "cs", adpVar.m18020b());
            m26458a(hashMap, "cm", adpVar.m18018c());
            m26458a(hashMap, "ck", adpVar.m18016d());
            m26458a(hashMap, "cc", adpVar.m18014e());
            m26458a(hashMap, "ci", adpVar.m18012f());
            m26458a(hashMap, "anid", adpVar.m18010g());
            m26458a(hashMap, "gclid", adpVar.m18008h());
            m26458a(hashMap, "dclid", adpVar.m18006i());
            m26458a(hashMap, "aclid", adpVar.m18004j());
        }
        adw adwVar = (adw) c3936l.m25997a(adw.class);
        if (adwVar != null) {
            m26458a(hashMap, "exd", adwVar.m17966a());
            m26457a(hashMap, "exf", adwVar.m17962b());
        }
        adz adzVar = (adz) c3936l.m25997a(adz.class);
        if (adzVar != null) {
            m26458a(hashMap, "sn", adzVar.m17931a());
            m26458a(hashMap, "sa", adzVar.m17928b());
            m26458a(hashMap, "st", adzVar.m17926c());
        }
        aea aeaVar = (aea) c3936l.m25997a(aea.class);
        if (aeaVar != null) {
            m26458a(hashMap, "utv", aeaVar.m17924a());
            m26460a(hashMap, "utt", aeaVar.m17919b());
            m26458a(hashMap, "utc", aeaVar.m17917c());
            m26458a(hashMap, "utl", aeaVar.m17915d());
        }
        adq adqVar = (adq) c3936l.m25997a(adq.class);
        if (adqVar != null) {
            for (Map.Entry<Integer, String> entry2 : adqVar.m18002a().entrySet()) {
                String m26013b = C3933j.m26013b(entry2.getKey().intValue());
                if (!TextUtils.isEmpty(m26013b)) {
                    hashMap.put(m26013b, entry2.getValue());
                }
            }
        }
        adr adrVar = (adr) c3936l.m25997a(adr.class);
        if (adrVar != null) {
            for (Map.Entry<Integer, Double> entry3 : adrVar.m18000a().entrySet()) {
                String m26011d = C3933j.m26011d(entry3.getKey().intValue());
                if (!TextUtils.isEmpty(m26011d)) {
                    hashMap.put(m26011d, m26464a(entry3.getValue().doubleValue()));
                }
            }
        }
        adu aduVar = (adu) c3936l.m25997a(adu.class);
        if (aduVar != null) {
            C3833b m17981a = aduVar.m17981a();
            if (m17981a != null) {
                for (Map.Entry<String, String> entry4 : m17981a.m26616a().entrySet()) {
                    if (entry4.getKey().startsWith("&")) {
                        hashMap.put(entry4.getKey().substring(1), entry4.getValue());
                    } else {
                        hashMap.put(entry4.getKey(), entry4.getValue());
                    }
                }
            }
            int i = 1;
            for (C3834c c3834c : aduVar.m17976d()) {
                hashMap.putAll(c3834c.m26599e(C3933j.m26007h(i)));
                i++;
            }
            int i2 = 1;
            for (C3832a c3832a : aduVar.m17978b()) {
                hashMap.putAll(c3832a.m26617g(C3933j.m26009f(i2)));
                i2++;
            }
            int i3 = 1;
            for (Map.Entry<String, List<C3832a>> entry5 : aduVar.m17977c().entrySet()) {
                String m26004k = C3933j.m26004k(i3);
                int i4 = 1;
                for (C3832a c3832a2 : entry5.getValue()) {
                    String valueOf = String.valueOf(m26004k);
                    String valueOf2 = String.valueOf(C3933j.m26006i(i4));
                    hashMap.putAll(c3832a2.m26617g(valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf)));
                    i4++;
                }
                if (!TextUtils.isEmpty(entry5.getKey())) {
                    String valueOf3 = String.valueOf(m26004k);
                    String valueOf4 = String.valueOf("nm");
                    hashMap.put(valueOf4.length() != 0 ? valueOf3.concat(valueOf4) : new String(valueOf3), entry5.getKey());
                }
                i3++;
            }
        }
        adt adtVar = (adt) c3936l.m25997a(adt.class);
        if (adtVar != null) {
            m26458a(hashMap, "ul", adtVar.m17982f());
            m26460a(hashMap, "sd", adtVar.m17994a());
            m26459a(hashMap, "sr", adtVar.m17990b(), adtVar.m17988c());
            m26459a(hashMap, "vp", adtVar.m17986d(), adtVar.m17984e());
        }
        ado adoVar = (ado) c3936l.m25997a(ado.class);
        if (adoVar != null) {
            m26458a(hashMap, "an", adoVar.m18032a());
            m26458a(hashMap, DeviceInfo.TAG_ANDROID_ID, adoVar.m18027c());
            m26458a(hashMap, "aiid", adoVar.m18025d());
            m26458a(hashMap, "av", adoVar.m18029b());
        }
        return hashMap;
    }

    @Override // com.google.android.gms.analytics.AbstractC3947r
    /* renamed from: a */
    public Uri mo25960a() {
        return this.f14959d;
    }

    @Override // com.google.android.gms.analytics.AbstractC3947r
    /* renamed from: a */
    public void mo25959a(C3936l c3936l) {
        C4588d.m23627a(c3936l);
        C4588d.m23618b(c3936l.m25990f(), "Can't deliver not submitted measurement");
        C4588d.m23616c("deliver should be called on worker thread");
        C3936l m26000a = c3936l.m26000a();
        adx adxVar = (adx) m26000a.m25995b(adx.class);
        if (TextUtils.isEmpty(adxVar.m17961a())) {
            p().m26288a(m26456b(m26000a), "Ignoring measurement without type");
        } else if (TextUtils.isEmpty(adxVar.m17956b())) {
            p().m26288a(m26456b(m26000a), "Ignoring measurement without client id");
        } else if (this.f14957b.m26103k().m26575f()) {
        } else {
            double m17945h = adxVar.m17945h();
            if (C3909p.m26200a(m17945h, adxVar.m17956b())) {
                b("Sampling enabled. Hit sampled out. sampling rate", Double.valueOf(m17945h));
                return;
            }
            Map<String, String> m26456b = m26456b(m26000a);
            m26456b.put("v", "1");
            m26456b.put("_v", C3921u.f15154b);
            m26456b.put("tid", this.f14958c);
            if (this.f14957b.m26103k().m26576e()) {
                c("Dry run is enabled. GoogleAnalytics would have sent", m26461a(m26456b));
                return;
            }
            HashMap hashMap = new HashMap();
            C3909p.m26192a(hashMap, "uid", adxVar.m17953c());
            ado adoVar = (ado) c3936l.m25997a(ado.class);
            if (adoVar != null) {
                C3909p.m26192a(hashMap, "an", adoVar.m18032a());
                C3909p.m26192a(hashMap, DeviceInfo.TAG_ANDROID_ID, adoVar.m18027c());
                C3909p.m26192a(hashMap, "av", adoVar.m18029b());
                C3909p.m26192a(hashMap, "aiid", adoVar.m18025d());
            }
            m26456b.put("_s", String.valueOf(t().m26167a(new C3925x(0L, adxVar.m17956b(), this.f14958c, !TextUtils.isEmpty(adxVar.m17951d()), 0L, hashMap))));
            t().m26169a(new C3887c(p(), m26456b, c3936l.m25992d(), true));
        }
    }
}
