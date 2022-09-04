package com.google.android.gms.internal;

import android.net.Uri;
import android.text.TextUtils;
import com.fimi.soul.media.player.FimiMediaMeta;
import com.google.android.gms.ads.internal.C3779u;
import com.google.android.gms.ads.internal.request.AdRequestInfoParcel;
import com.google.android.gms.ads.internal.request.AdResponseParcel;
import com.google.android.gms.ads.internal.request.AutoClickProtectionConfigurationParcel;
import com.google.android.gms.ads.internal.reward.mediation.client.RewardItemParcel;
import com.google.android.gms.ads.internal.safebrowsing.SafeBrowsingConfigParcel;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
@aaa
/* loaded from: classes.dex */
public final class aah {

    /* renamed from: B */
    private String f20706B;

    /* renamed from: C */
    private List<String> f20707C;

    /* renamed from: D */
    private boolean f20708D;

    /* renamed from: E */
    private String f20709E;

    /* renamed from: F */
    private SafeBrowsingConfigParcel f20710F;

    /* renamed from: G */
    private final AdRequestInfoParcel f20711G;

    /* renamed from: a */
    private String f20712a;

    /* renamed from: b */
    private String f20713b;

    /* renamed from: c */
    private String f20714c;

    /* renamed from: d */
    private List<String> f20715d;

    /* renamed from: e */
    private String f20716e;

    /* renamed from: f */
    private String f20717f;

    /* renamed from: g */
    private String f20718g;

    /* renamed from: h */
    private List<String> f20719h;

    /* renamed from: l */
    private List<String> f20723l;

    /* renamed from: v */
    private RewardItemParcel f20733v;

    /* renamed from: w */
    private List<String> f20734w;

    /* renamed from: x */
    private List<String> f20735x;

    /* renamed from: z */
    private AutoClickProtectionConfigurationParcel f20737z;

    /* renamed from: i */
    private long f20720i = -1;

    /* renamed from: j */
    private boolean f20721j = false;

    /* renamed from: k */
    private final long f20722k = -1;

    /* renamed from: m */
    private long f20724m = -1;

    /* renamed from: n */
    private int f20725n = -1;

    /* renamed from: o */
    private boolean f20726o = false;

    /* renamed from: p */
    private boolean f20727p = false;

    /* renamed from: q */
    private boolean f20728q = false;

    /* renamed from: r */
    private boolean f20729r = true;

    /* renamed from: s */
    private String f20730s = "";

    /* renamed from: t */
    private boolean f20731t = false;

    /* renamed from: u */
    private boolean f20732u = false;

    /* renamed from: y */
    private boolean f20736y = false;

    /* renamed from: A */
    private boolean f20705A = false;

    public aah(AdRequestInfoParcel adRequestInfoParcel) {
        this.f20711G = adRequestInfoParcel;
    }

    /* renamed from: A */
    private void m18656A(Map<String, List<String>> map) {
        List<String> m18645c = m18645c(map, "X-Afma-Remote-Ping-Urls");
        if (m18645c != null) {
            this.f20707C = m18645c;
        }
    }

    /* renamed from: B */
    private void m18655B(Map<String, List<String>> map) {
        String m18649a = m18649a(map, "X-Afma-Auto-Protection-Configuration");
        if (m18649a != null && !TextUtils.isEmpty(m18649a)) {
            try {
                this.f20737z = AutoClickProtectionConfigurationParcel.m27039a(new JSONObject(m18649a));
                return;
            } catch (JSONException e) {
                abr.d("Error parsing configuration JSON", e);
                this.f20737z = new AutoClickProtectionConfigurationParcel();
                return;
            }
        }
        Uri.Builder buildUpon = Uri.parse("https://pagead2.googlesyndication.com/pagead/gen_204").buildUpon();
        buildUpon.appendQueryParameter("id", "gmob-apps-blocked-navigation");
        if (!TextUtils.isEmpty(this.f20717f)) {
            buildUpon.appendQueryParameter("debugDialog", this.f20717f);
        }
        boolean booleanValue = C7788uf.f25892j.m13486c().booleanValue();
        String valueOf = String.valueOf(buildUpon.toString());
        String valueOf2 = String.valueOf("navigationURL");
        this.f20737z = new AutoClickProtectionConfigurationParcel(booleanValue, Arrays.asList(new StringBuilder(String.valueOf(valueOf).length() + 18 + String.valueOf(valueOf2).length()).append(valueOf).append("&").append(valueOf2).append("={NAVIGATION_URL}").toString()));
    }

    /* renamed from: C */
    private void m18654C(Map<String, List<String>> map) {
        this.f20706B = m18649a(map, "Set-Cookie");
    }

    /* renamed from: D */
    private void m18653D(Map<String, List<String>> map) {
        String m18649a = m18649a(map, "X-Afma-Safe-Browsing");
        if (TextUtils.isEmpty(m18649a)) {
            return;
        }
        try {
            this.f20710F = SafeBrowsingConfigParcel.m26933a(new JSONObject(m18649a));
        } catch (JSONException e) {
            abr.d("Error parsing safe browsing header", e);
        }
    }

    /* renamed from: a */
    static String m18649a(Map<String, List<String>> map, String str) {
        List<String> list = map.get(str);
        if (list == null || list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    /* renamed from: b */
    static long m18647b(Map<String, List<String>> map, String str) {
        List<String> list = map.get(str);
        if (list != null && !list.isEmpty()) {
            String str2 = list.get(0);
            try {
                return Float.parseFloat(str2) * 1000.0f;
            } catch (NumberFormatException e) {
                abr.d(new StringBuilder(String.valueOf(str).length() + 36 + String.valueOf(str2).length()).append("Could not parse float from ").append(str).append(" header: ").append(str2).toString());
            }
        }
        return -1L;
    }

    /* renamed from: b */
    private void m18648b(Map<String, List<String>> map) {
        this.f20712a = m18649a(map, "X-Afma-Ad-Size");
    }

    /* renamed from: c */
    static List<String> m18645c(Map<String, List<String>> map, String str) {
        String str2;
        List<String> list = map.get(str);
        if (list == null || list.isEmpty() || (str2 = list.get(0)) == null) {
            return null;
        }
        return Arrays.asList(str2.trim().split("\\s+"));
    }

    /* renamed from: c */
    private void m18646c(Map<String, List<String>> map) {
        this.f20709E = m18649a(map, "X-Afma-Ad-Slot-Size");
    }

    /* renamed from: d */
    private void m18644d(Map<String, List<String>> map) {
        List<String> m18645c = m18645c(map, "X-Afma-Click-Tracking-Urls");
        if (m18645c != null) {
            this.f20715d = m18645c;
        }
    }

    /* renamed from: d */
    private boolean m18643d(Map<String, List<String>> map, String str) {
        List<String> list = map.get(str);
        return list != null && !list.isEmpty() && Boolean.valueOf(list.get(0)).booleanValue();
    }

    /* renamed from: e */
    private void m18642e(Map<String, List<String>> map) {
        this.f20716e = m18649a(map, "X-Afma-Debug-Signals");
    }

    /* renamed from: f */
    private void m18641f(Map<String, List<String>> map) {
        List<String> list = map.get("X-Afma-Debug-Dialog");
        if (list == null || list.isEmpty()) {
            return;
        }
        this.f20717f = list.get(0);
    }

    /* renamed from: g */
    private void m18640g(Map<String, List<String>> map) {
        List<String> m18645c = m18645c(map, "X-Afma-Tracking-Urls");
        if (m18645c != null) {
            this.f20719h = m18645c;
        }
    }

    /* renamed from: h */
    private void m18639h(Map<String, List<String>> map) {
        long m18647b = m18647b(map, "X-Afma-Interstitial-Timeout");
        if (m18647b != -1) {
            this.f20720i = m18647b;
        }
    }

    /* renamed from: i */
    private void m18638i(Map<String, List<String>> map) {
        this.f20718g = m18649a(map, "X-Afma-ActiveView");
    }

    /* renamed from: j */
    private void m18637j(Map<String, List<String>> map) {
        this.f20727p = "native".equals(m18649a(map, "X-Afma-Ad-Format"));
    }

    /* renamed from: k */
    private void m18636k(Map<String, List<String>> map) {
        this.f20726o |= m18643d(map, "X-Afma-Custom-Rendering-Allowed");
    }

    /* renamed from: l */
    private void m18635l(Map<String, List<String>> map) {
        this.f20721j |= m18643d(map, "X-Afma-Mediation");
    }

    /* renamed from: m */
    private void m18634m(Map<String, List<String>> map) {
        this.f20708D |= m18643d(map, "X-Afma-Render-In-Browser");
    }

    /* renamed from: n */
    private void m18633n(Map<String, List<String>> map) {
        List<String> m18645c = m18645c(map, "X-Afma-Manual-Tracking-Urls");
        if (m18645c != null) {
            this.f20723l = m18645c;
        }
    }

    /* renamed from: o */
    private void m18632o(Map<String, List<String>> map) {
        long m18647b = m18647b(map, "X-Afma-Refresh-Rate");
        if (m18647b != -1) {
            this.f20724m = m18647b;
        }
    }

    /* renamed from: p */
    private void m18631p(Map<String, List<String>> map) {
        List<String> list = map.get("X-Afma-Orientation");
        if (list == null || list.isEmpty()) {
            return;
        }
        String str = list.get(0);
        if ("portrait".equalsIgnoreCase(str)) {
            this.f20725n = C3779u.m26888g().mo18301b();
        } else if (!"landscape".equalsIgnoreCase(str)) {
        } else {
            this.f20725n = C3779u.m26888g().mo18302a();
        }
    }

    /* renamed from: q */
    private void m18630q(Map<String, List<String>> map) {
        List<String> list = map.get("X-Afma-Use-HTTPS");
        if (list == null || list.isEmpty()) {
            return;
        }
        this.f20728q = Boolean.valueOf(list.get(0)).booleanValue();
    }

    /* renamed from: r */
    private void m18629r(Map<String, List<String>> map) {
        List<String> list = map.get("X-Afma-Content-Url-Opted-Out");
        if (list == null || list.isEmpty()) {
            return;
        }
        this.f20729r = Boolean.valueOf(list.get(0)).booleanValue();
    }

    /* renamed from: s */
    private void m18628s(Map<String, List<String>> map) {
        List<String> list = map.get("X-Afma-Gws-Query-Id");
        if (list == null || list.isEmpty()) {
            return;
        }
        this.f20730s = list.get(0);
    }

    /* renamed from: t */
    private void m18627t(Map<String, List<String>> map) {
        String m18649a = m18649a(map, "X-Afma-Fluid");
        if (m18649a == null || !m18649a.equals(FimiMediaMeta.IJKM_KEY_HEIGHT)) {
            return;
        }
        this.f20731t = true;
    }

    /* renamed from: u */
    private void m18626u(Map<String, List<String>> map) {
        this.f20732u = "native_express".equals(m18649a(map, "X-Afma-Ad-Format"));
    }

    /* renamed from: v */
    private void m18625v(Map<String, List<String>> map) {
        this.f20733v = RewardItemParcel.m26949a(m18649a(map, "X-Afma-Rewards"));
    }

    /* renamed from: w */
    private void m18624w(Map<String, List<String>> map) {
        if (this.f20734w != null) {
            return;
        }
        this.f20734w = m18645c(map, "X-Afma-Reward-Video-Start-Urls");
    }

    /* renamed from: x */
    private void m18623x(Map<String, List<String>> map) {
        if (this.f20735x != null) {
            return;
        }
        this.f20735x = m18645c(map, "X-Afma-Reward-Video-Complete-Urls");
    }

    /* renamed from: y */
    private void m18622y(Map<String, List<String>> map) {
        this.f20736y |= m18643d(map, "X-Afma-Use-Displayed-Impression");
    }

    /* renamed from: z */
    private void m18621z(Map<String, List<String>> map) {
        this.f20705A |= m18643d(map, "X-Afma-Auto-Collect-Location");
    }

    /* renamed from: a */
    public AdResponseParcel m18652a(long j) {
        return new AdResponseParcel(this.f20711G, this.f20713b, this.f20714c, this.f20715d, this.f20719h, this.f20720i, this.f20721j, -1L, this.f20723l, this.f20724m, this.f20725n, this.f20712a, j, this.f20717f, this.f20718g, this.f20726o, this.f20727p, this.f20728q, this.f20729r, false, this.f20730s, this.f20731t, this.f20732u, this.f20733v, this.f20734w, this.f20735x, this.f20736y, this.f20737z, this.f20705A, this.f20706B, this.f20707C, this.f20708D, this.f20709E, this.f20710F, this.f20716e);
    }

    /* renamed from: a */
    public void m18651a(String str, Map<String, List<String>> map, String str2) {
        this.f20713b = str;
        this.f20714c = str2;
        m18650a(map);
    }

    /* renamed from: a */
    public void m18650a(Map<String, List<String>> map) {
        m18648b(map);
        m18646c(map);
        m18644d(map);
        m18642e(map);
        m18641f(map);
        m18640g(map);
        m18639h(map);
        m18635l(map);
        m18633n(map);
        m18632o(map);
        m18631p(map);
        m18638i(map);
        m18630q(map);
        m18636k(map);
        m18637j(map);
        m18629r(map);
        m18628s(map);
        m18627t(map);
        m18626u(map);
        m18625v(map);
        m18624w(map);
        m18623x(map);
        m18622y(map);
        m18621z(map);
        m18654C(map);
        m18655B(map);
        m18656A(map);
        m18653D(map);
        m18634m(map);
    }
}
