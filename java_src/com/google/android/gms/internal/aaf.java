package com.google.android.gms.internal;

import android.content.Context;
import android.graphics.Color;
import android.location.Location;
import android.os.Build;
import android.os.Bundle;
import android.os.Debug;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.fimi.soul.biz.camera.C1831e;
import com.fimi.soul.media.player.FimiMediaMeta;
import com.fimi.soul.utils.C3134q;
import com.fimi.soul.utils.p219a.C3070c;
import com.google.android.gms.ads.internal.C3779u;
import com.google.android.gms.ads.internal.client.AdRequestParcel;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.client.SearchAdRequestParcel;
import com.google.android.gms.ads.internal.formats.NativeAdOptionsParcel;
import com.google.android.gms.ads.internal.request.AdRequestInfoParcel;
import com.google.android.gms.ads.internal.request.AdResponseParcel;
import com.google.android.gms.ads.internal.request.AutoClickProtectionConfigurationParcel;
import com.google.android.gms.ads.internal.reward.mediation.client.RewardItemParcel;
import com.google.android.gms.ads.internal.safebrowsing.SafeBrowsingConfigParcel;
import com.google.android.gms.internal.aao;
import com.tencent.p263mm.sdk.platformtools.LocaleUtil;
import com.xiaomi.mipush.sdk.Constants;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.p286a.p287a.p290c.p293c.C11044h;
@aaa
/* loaded from: classes.dex */
public final class aaf {

    /* renamed from: a */
    private static final SimpleDateFormat f20693a = new SimpleDateFormat("yyyyMMdd", Locale.US);

    /* renamed from: a */
    private static Bundle m18676a(Bundle bundle) {
        Bundle bundle2 = new Bundle();
        bundle2.putString("runtime_free", Long.toString(bundle.getLong("runtime_free_memory", -1L)));
        bundle2.putString("runtime_max", Long.toString(bundle.getLong("runtime_max_memory", -1L)));
        bundle2.putString("runtime_total", Long.toString(bundle.getLong("runtime_total_memory", -1L)));
        Debug.MemoryInfo memoryInfo = (Debug.MemoryInfo) bundle.getParcelable("debug_memory_info");
        if (memoryInfo != null) {
            bundle2.putString("debug_info_dalvik_private_dirty", Integer.toString(memoryInfo.dalvikPrivateDirty));
            bundle2.putString("debug_info_dalvik_pss", Integer.toString(memoryInfo.dalvikPss));
            bundle2.putString("debug_info_dalvik_shared_dirty", Integer.toString(memoryInfo.dalvikSharedDirty));
            bundle2.putString("debug_info_native_private_dirty", Integer.toString(memoryInfo.nativePrivateDirty));
            bundle2.putString("debug_info_native_pss", Integer.toString(memoryInfo.nativePss));
            bundle2.putString("debug_info_native_shared_dirty", Integer.toString(memoryInfo.nativeSharedDirty));
            bundle2.putString("debug_info_other_private_dirty", Integer.toString(memoryInfo.otherPrivateDirty));
            bundle2.putString("debug_info_other_pss", Integer.toString(memoryInfo.otherPss));
            bundle2.putString("debug_info_other_shared_dirty", Integer.toString(memoryInfo.otherSharedDirty));
        }
        return bundle2;
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x0144 A[Catch: JSONException -> 0x022d, TryCatch #0 {JSONException -> 0x022d, blocks: (B:2:0x0000, B:4:0x0030, B:7:0x0038, B:9:0x0043, B:11:0x004e, B:12:0x0057, B:14:0x0075, B:15:0x0084, B:17:0x0097, B:18:0x009f, B:20:0x00a6, B:22:0x00ac, B:24:0x00c8, B:27:0x00e7, B:31:0x00f4, B:32:0x00f8, B:36:0x0105, B:37:0x0109, B:41:0x0116, B:43:0x011c, B:45:0x0121, B:46:0x0125, B:48:0x012d, B:49:0x012f, B:51:0x0144, B:52:0x014d, B:55:0x0255, B:56:0x0251, B:57:0x024d, B:59:0x00d6, B:61:0x00de), top: B:1:0x0000 }] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static AdResponseParcel m18678a(Context context, AdRequestInfoParcel adRequestInfoParcel, String str) {
        String str2;
        long j;
        boolean optBoolean;
        try {
            JSONObject jSONObject = new JSONObject(str);
            String optString = jSONObject.optString("ad_base_url", null);
            String optString2 = jSONObject.optString("ad_url", null);
            String optString3 = jSONObject.optString("ad_size", null);
            String optString4 = jSONObject.optString("ad_slot_size", optString3);
            boolean z = (adRequestInfoParcel == null || adRequestInfoParcel.f14497m == 0) ? false : true;
            String optString5 = jSONObject.optString("ad_json", null);
            if (optString5 == null) {
                optString5 = jSONObject.optString("ad_html", null);
            }
            if (optString5 == null) {
                optString5 = jSONObject.optString("body", null);
            }
            long j2 = -1;
            String optString6 = jSONObject.optString("debug_dialog", null);
            String optString7 = jSONObject.optString("debug_signals", null);
            long j3 = jSONObject.has("interstitial_timeout") ? (long) (jSONObject.getDouble("interstitial_timeout") * 1000.0d) : -1L;
            String optString8 = jSONObject.optString("orientation", null);
            int i = -1;
            if ("portrait".equals(optString8)) {
                i = C3779u.m26888g().mo18301b();
            } else if ("landscape".equals(optString8)) {
                i = C3779u.m26888g().mo18302a();
            }
            AdResponseParcel adResponseParcel = null;
            if (!TextUtils.isEmpty(optString5) || TextUtils.isEmpty(optString2)) {
                str2 = optString5;
            } else {
                adResponseParcel = aae.m18687a(adRequestInfoParcel, context, adRequestInfoParcel.f14495k.f14733b, optString2, null, null, null, null);
                optString = adResponseParcel.f14566b;
                str2 = adResponseParcel.f14567c;
                j2 = adResponseParcel.f14578n;
            }
            if (str2 == null) {
                return new AdResponseParcel(0);
            }
            JSONArray optJSONArray = jSONObject.optJSONArray("click_urls");
            List<String> list = adResponseParcel == null ? null : adResponseParcel.f14568d;
            if (optJSONArray != null) {
                list = m18666a(optJSONArray, list);
            }
            JSONArray optJSONArray2 = jSONObject.optJSONArray("impression_urls");
            List<String> list2 = adResponseParcel == null ? null : adResponseParcel.f14570f;
            if (optJSONArray2 != null) {
                list2 = m18666a(optJSONArray2, list2);
            }
            JSONArray optJSONArray3 = jSONObject.optJSONArray("manual_impression_urls");
            List<String> list3 = adResponseParcel == null ? null : adResponseParcel.f14574j;
            if (optJSONArray3 != null) {
                list3 = m18666a(optJSONArray3, list3);
            }
            if (adResponseParcel != null) {
                if (adResponseParcel.f14576l != -1) {
                    i = adResponseParcel.f14576l;
                }
                if (adResponseParcel.f14571g > 0) {
                    j = adResponseParcel.f14571g;
                    String optString9 = jSONObject.optString("active_view");
                    String str3 = null;
                    optBoolean = jSONObject.optBoolean("ad_is_javascript", false);
                    if (optBoolean) {
                        str3 = jSONObject.optString("ad_passback_url", null);
                    }
                    boolean optBoolean2 = jSONObject.optBoolean("mediation", false);
                    boolean optBoolean3 = jSONObject.optBoolean("custom_render_allowed", false);
                    boolean optBoolean4 = jSONObject.optBoolean("content_url_opted_out", true);
                    boolean optBoolean5 = jSONObject.optBoolean("prefetch", false);
                    long optLong = jSONObject.optLong("refresh_interval_milliseconds", -1L);
                    long optLong2 = jSONObject.optLong("mediation_config_cache_time_milliseconds", -1L);
                    String optString10 = jSONObject.optString("gws_query_id", "");
                    boolean equals = FimiMediaMeta.IJKM_KEY_HEIGHT.equals(jSONObject.optString("fluid", ""));
                    boolean optBoolean6 = jSONObject.optBoolean("native_express", false);
                    List<String> m18666a = m18666a(jSONObject.optJSONArray("video_start_urls"), (List<String>) null);
                    List<String> m18666a2 = m18666a(jSONObject.optJSONArray("video_complete_urls"), (List<String>) null);
                    return new AdResponseParcel(adRequestInfoParcel, optString, str2, list, list2, j, optBoolean2, optLong2, list3, optLong, i, optString3, j2, optString6, optBoolean, str3, optString9, optBoolean3, z, adRequestInfoParcel.f14500p, optBoolean4, optBoolean5, optString10, equals, optBoolean6, RewardItemParcel.m26948a(jSONObject.optJSONArray("rewards")), m18666a, m18666a2, jSONObject.optBoolean("use_displayed_impression", false), AutoClickProtectionConfigurationParcel.m27039a(jSONObject.optJSONObject("auto_protection_configuration")), adRequestInfoParcel.f14477I, jSONObject.optString("set_cookie", ""), m18666a(jSONObject.optJSONArray("remote_ping_urls"), (List<String>) null), jSONObject.optBoolean("render_in_browser", adRequestInfoParcel.f14481M), optString4, SafeBrowsingConfigParcel.m26933a(jSONObject.optJSONObject("safe_browsing")), optString7);
                }
            }
            j = j3;
            String optString92 = jSONObject.optString("active_view");
            String str32 = null;
            optBoolean = jSONObject.optBoolean("ad_is_javascript", false);
            if (optBoolean) {
            }
            boolean optBoolean22 = jSONObject.optBoolean("mediation", false);
            boolean optBoolean32 = jSONObject.optBoolean("custom_render_allowed", false);
            boolean optBoolean42 = jSONObject.optBoolean("content_url_opted_out", true);
            boolean optBoolean52 = jSONObject.optBoolean("prefetch", false);
            long optLong3 = jSONObject.optLong("refresh_interval_milliseconds", -1L);
            long optLong22 = jSONObject.optLong("mediation_config_cache_time_milliseconds", -1L);
            String optString102 = jSONObject.optString("gws_query_id", "");
            boolean equals2 = FimiMediaMeta.IJKM_KEY_HEIGHT.equals(jSONObject.optString("fluid", ""));
            boolean optBoolean62 = jSONObject.optBoolean("native_express", false);
            List<String> m18666a3 = m18666a(jSONObject.optJSONArray("video_start_urls"), (List<String>) null);
            List<String> m18666a22 = m18666a(jSONObject.optJSONArray("video_complete_urls"), (List<String>) null);
            return new AdResponseParcel(adRequestInfoParcel, optString, str2, list, list2, j, optBoolean22, optLong22, list3, optLong3, i, optString3, j2, optString6, optBoolean, str32, optString92, optBoolean32, z, adRequestInfoParcel.f14500p, optBoolean42, optBoolean52, optString102, equals2, optBoolean62, RewardItemParcel.m26948a(jSONObject.optJSONArray("rewards")), m18666a3, m18666a22, jSONObject.optBoolean("use_displayed_impression", false), AutoClickProtectionConfigurationParcel.m27039a(jSONObject.optJSONObject("auto_protection_configuration")), adRequestInfoParcel.f14477I, jSONObject.optString("set_cookie", ""), m18666a(jSONObject.optJSONArray("remote_ping_urls"), (List<String>) null), jSONObject.optBoolean("render_in_browser", adRequestInfoParcel.f14481M), optString4, SafeBrowsingConfigParcel.m26933a(jSONObject.optJSONObject("safe_browsing")), optString7);
        } catch (JSONException e) {
            String valueOf = String.valueOf(e.getMessage());
            abr.d(valueOf.length() != 0 ? "Could not parse the inline ad response: ".concat(valueOf) : new String("Could not parse the inline ad response: "));
            return new AdResponseParcel(0);
        }
    }

    /* renamed from: a */
    private static Integer m18665a(boolean z) {
        return Integer.valueOf(z ? 1 : 0);
    }

    /* renamed from: a */
    private static String m18679a(int i) {
        return String.format(Locale.US, "#%06x", Integer.valueOf(16777215 & i));
    }

    /* renamed from: a */
    private static String m18675a(NativeAdOptionsParcel nativeAdOptionsParcel) {
        switch (nativeAdOptionsParcel != null ? nativeAdOptionsParcel.f14076c : 0) {
            case 1:
                return "portrait";
            case 2:
                return "landscape";
            default:
                return "any";
        }
    }

    @Nullable
    /* renamed from: a */
    private static List<String> m18666a(@Nullable JSONArray jSONArray, @Nullable List<String> list) {
        if (jSONArray == null) {
            return null;
        }
        if (list == null) {
            list = new LinkedList<>();
        }
        for (int i = 0; i < jSONArray.length(); i++) {
            list.add(jSONArray.getString(i));
        }
        return list;
    }

    @Nullable
    /* renamed from: a */
    static JSONArray m18667a(List<String> list) {
        JSONArray jSONArray = new JSONArray();
        for (String str : list) {
            jSONArray.put(str);
        }
        return jSONArray;
    }

    @Nullable
    /* renamed from: a */
    public static JSONObject m18677a(Context context, aab aabVar) {
        AdSizeParcel[] adSizeParcelArr;
        AdSizeParcel[] adSizeParcelArr2;
        AdRequestInfoParcel adRequestInfoParcel = aabVar.f20654h;
        Location location = aabVar.f20650d;
        aak aakVar = aabVar.f20655i;
        Bundle bundle = aabVar.f20647a;
        JSONObject jSONObject = aabVar.f20656j;
        try {
            HashMap hashMap = new HashMap();
            hashMap.put("extra_caps", C7788uf.f25800bE.m13486c());
            if (aabVar.f20649c.size() > 0) {
                hashMap.put("eid", TextUtils.join(Constants.ACCEPT_TIME_SEPARATOR_SP, aabVar.f20649c));
            }
            if (adRequestInfoParcel.f14486b != null) {
                hashMap.put("ad_pos", adRequestInfoParcel.f14486b);
            }
            m18671a(hashMap, adRequestInfoParcel.f14487c);
            if (adRequestInfoParcel.f14488d.f13870h != null) {
                boolean z = false;
                boolean z2 = false;
                for (AdSizeParcel adSizeParcel : adRequestInfoParcel.f14488d.f13870h) {
                    if (!adSizeParcel.f13872j && !z2) {
                        hashMap.put(FimiMediaMeta.IJKM_KEY_FORMAT, adSizeParcel.f13864b);
                        z2 = true;
                    }
                    if (adSizeParcel.f13872j && !z) {
                        hashMap.put("fluid", FimiMediaMeta.IJKM_KEY_HEIGHT);
                        z = true;
                    }
                    if (z2 && z) {
                        break;
                    }
                }
            } else {
                hashMap.put(FimiMediaMeta.IJKM_KEY_FORMAT, adRequestInfoParcel.f14488d.f13864b);
                if (adRequestInfoParcel.f14488d.f13872j) {
                    hashMap.put("fluid", FimiMediaMeta.IJKM_KEY_HEIGHT);
                }
            }
            if (adRequestInfoParcel.f14488d.f13868f == -1) {
                hashMap.put("smart_w", C3134q.f11777au);
            }
            if (adRequestInfoParcel.f14488d.f13865c == -2) {
                hashMap.put("smart_h", "auto");
            }
            if (adRequestInfoParcel.f14488d.f13870h != null) {
                StringBuilder sb = new StringBuilder();
                boolean z3 = false;
                for (AdSizeParcel adSizeParcel2 : adRequestInfoParcel.f14488d.f13870h) {
                    if (adSizeParcel2.f13872j) {
                        z3 = true;
                    } else {
                        if (sb.length() != 0) {
                            sb.append("|");
                        }
                        sb.append(adSizeParcel2.f13868f == -1 ? (int) (adSizeParcel2.f13869g / aakVar.f20767r) : adSizeParcel2.f13868f);
                        sb.append("x");
                        sb.append(adSizeParcel2.f13865c == -2 ? (int) (adSizeParcel2.f13866d / aakVar.f20767r) : adSizeParcel2.f13865c);
                    }
                }
                if (z3) {
                    if (sb.length() != 0) {
                        sb.insert(0, "|");
                    }
                    sb.insert(0, "320x50");
                }
                hashMap.put("sz", sb);
            }
            if (adRequestInfoParcel.f14497m != 0) {
                hashMap.put("native_version", Integer.valueOf(adRequestInfoParcel.f14497m));
                hashMap.put("native_templates", adRequestInfoParcel.f14498n);
                hashMap.put("native_image_orientation", m18675a(adRequestInfoParcel.f14510z));
                if (!adRequestInfoParcel.f14469A.isEmpty()) {
                    hashMap.put("native_custom_templates", adRequestInfoParcel.f14469A);
                }
            }
            if (adRequestInfoParcel.f14488d.f13873k) {
                hashMap.put("ene", true);
            }
            hashMap.put("slotname", adRequestInfoParcel.f14489e);
            hashMap.put("pn", adRequestInfoParcel.f14490f.packageName);
            if (adRequestInfoParcel.f14491g != null) {
                hashMap.put("vc", Integer.valueOf(adRequestInfoParcel.f14491g.versionCode));
            }
            hashMap.put(LocaleUtil.MALAY, aabVar.f20653g);
            hashMap.put("seq_num", adRequestInfoParcel.f14493i);
            hashMap.put("session_id", adRequestInfoParcel.f14494j);
            hashMap.put("js", adRequestInfoParcel.f14495k.f14733b);
            m18669a(hashMap, aakVar, aabVar.f20651e, adRequestInfoParcel.f14483O, aabVar.f20648b);
            m18668a(hashMap, aabVar.f20652f);
            hashMap.put(com.tencent.connect.common.Constants.PARAM_PLATFORM, Build.MANUFACTURER);
            hashMap.put("submodel", Build.MODEL);
            if (location != null) {
                m18672a(hashMap, location);
            } else if (adRequestInfoParcel.f14487c.f13845a >= 2 && adRequestInfoParcel.f14487c.f13855k != null) {
                m18672a(hashMap, adRequestInfoParcel.f14487c.f13855k);
            }
            if (adRequestInfoParcel.f14485a >= 2) {
                hashMap.put("quality_signals", adRequestInfoParcel.f14496l);
            }
            if (adRequestInfoParcel.f14485a >= 4 && adRequestInfoParcel.f14500p) {
                hashMap.put("forceHttps", Boolean.valueOf(adRequestInfoParcel.f14500p));
            }
            if (bundle != null) {
                hashMap.put("content_info", bundle);
            }
            if (adRequestInfoParcel.f14485a >= 5) {
                hashMap.put("u_sd", Float.valueOf(adRequestInfoParcel.f14504t));
                hashMap.put("sh", Integer.valueOf(adRequestInfoParcel.f14503s));
                hashMap.put("sw", Integer.valueOf(adRequestInfoParcel.f14502r));
            } else {
                hashMap.put("u_sd", Float.valueOf(aakVar.f20767r));
                hashMap.put("sh", Integer.valueOf(aakVar.f20769t));
                hashMap.put("sw", Integer.valueOf(aakVar.f20768s));
            }
            if (adRequestInfoParcel.f14485a >= 6) {
                if (!TextUtils.isEmpty(adRequestInfoParcel.f14505u)) {
                    try {
                        hashMap.put("view_hierarchy", new JSONObject(adRequestInfoParcel.f14505u));
                    } catch (JSONException e) {
                        abr.d("Problem serializing view hierarchy to JSON", e);
                    }
                }
                hashMap.put("correlation_id", Long.valueOf(adRequestInfoParcel.f14506v));
            }
            if (adRequestInfoParcel.f14485a >= 7) {
                hashMap.put("request_id", adRequestInfoParcel.f14507w);
            }
            if (adRequestInfoParcel.f14485a >= 11 && adRequestInfoParcel.f14471C != null) {
                hashMap.put("capability", adRequestInfoParcel.f14471C.m27038a());
            }
            if (adRequestInfoParcel.f14485a >= 12 && !TextUtils.isEmpty(adRequestInfoParcel.f14472D)) {
                hashMap.put("anchor", adRequestInfoParcel.f14472D);
            }
            if (adRequestInfoParcel.f14485a >= 13) {
                hashMap.put("android_app_volume", Float.valueOf(adRequestInfoParcel.f14473E));
            }
            if (adRequestInfoParcel.f14485a >= 18) {
                hashMap.put("android_app_muted", Boolean.valueOf(adRequestInfoParcel.f14479K));
            }
            if (adRequestInfoParcel.f14485a >= 14 && adRequestInfoParcel.f14474F > 0) {
                hashMap.put("target_api", Integer.valueOf(adRequestInfoParcel.f14474F));
            }
            if (adRequestInfoParcel.f14485a >= 15) {
                hashMap.put("scroll_index", Integer.valueOf(adRequestInfoParcel.f14475G == -1 ? -1 : adRequestInfoParcel.f14475G));
            }
            if (adRequestInfoParcel.f14485a >= 16) {
                hashMap.put("_activity_context", Boolean.valueOf(adRequestInfoParcel.f14476H));
            }
            if (adRequestInfoParcel.f14485a >= 18) {
                if (!TextUtils.isEmpty(adRequestInfoParcel.f14480L)) {
                    try {
                        hashMap.put("app_settings", new JSONObject(adRequestInfoParcel.f14480L));
                    } catch (JSONException e2) {
                        abr.d("Problem creating json from app settings", e2);
                    }
                }
                hashMap.put("render_in_browser", Boolean.valueOf(adRequestInfoParcel.f14481M));
            }
            if (adRequestInfoParcel.f14485a >= 18) {
                hashMap.put("android_num_video_cache_tasks", Integer.valueOf(adRequestInfoParcel.f14482N));
            }
            m18673a(hashMap);
            hashMap.put("cache_state", jSONObject);
            if (adRequestInfoParcel.f14485a >= 19) {
                hashMap.put("gct", adRequestInfoParcel.f14484P);
            }
            if (abr.a(2)) {
                String valueOf = String.valueOf(C3779u.m26890e().m18343a(hashMap).toString(2));
                abr.m18409e(valueOf.length() != 0 ? "Ad Request JSON: ".concat(valueOf) : new String("Ad Request JSON: "));
            }
            return C3779u.m26890e().m18343a(hashMap);
        } catch (JSONException e3) {
            String valueOf2 = String.valueOf(e3.getMessage());
            abr.d(valueOf2.length() != 0 ? "Problem serializing ad request to JSON: ".concat(valueOf2) : new String("Problem serializing ad request to JSON: "));
            return null;
        }
    }

    /* renamed from: a */
    public static JSONObject m18674a(AdResponseParcel adResponseParcel) {
        JSONObject jSONObject = new JSONObject();
        if (adResponseParcel.f14566b != null) {
            jSONObject.put("ad_base_url", adResponseParcel.f14566b);
        }
        if (adResponseParcel.f14577m != null) {
            jSONObject.put("ad_size", adResponseParcel.f14577m);
        }
        jSONObject.put("native", adResponseParcel.f14584t);
        if (adResponseParcel.f14584t) {
            jSONObject.put("ad_json", adResponseParcel.f14567c);
        } else {
            jSONObject.put("ad_html", adResponseParcel.f14567c);
        }
        if (adResponseParcel.f14579o != null) {
            jSONObject.put("debug_dialog", adResponseParcel.f14579o);
        }
        if (adResponseParcel.f14563N != null) {
            jSONObject.put("debug_signals", adResponseParcel.f14563N);
        }
        if (adResponseParcel.f14571g != -1) {
            jSONObject.put("interstitial_timeout", adResponseParcel.f14571g / 1000.0d);
        }
        if (adResponseParcel.f14576l == C3779u.m26888g().mo18301b()) {
            jSONObject.put("orientation", "portrait");
        } else if (adResponseParcel.f14576l == C3779u.m26888g().mo18302a()) {
            jSONObject.put("orientation", "landscape");
        }
        if (adResponseParcel.f14568d != null) {
            jSONObject.put("click_urls", m18667a(adResponseParcel.f14568d));
        }
        if (adResponseParcel.f14570f != null) {
            jSONObject.put("impression_urls", m18667a(adResponseParcel.f14570f));
        }
        if (adResponseParcel.f14574j != null) {
            jSONObject.put("manual_impression_urls", m18667a(adResponseParcel.f14574j));
        }
        if (adResponseParcel.f14582r != null) {
            jSONObject.put("active_view", adResponseParcel.f14582r);
        }
        jSONObject.put("ad_is_javascript", adResponseParcel.f14580p);
        if (adResponseParcel.f14581q != null) {
            jSONObject.put("ad_passback_url", adResponseParcel.f14581q);
        }
        jSONObject.put("mediation", adResponseParcel.f14572h);
        jSONObject.put("custom_render_allowed", adResponseParcel.f14583s);
        jSONObject.put("content_url_opted_out", adResponseParcel.f14586v);
        jSONObject.put("prefetch", adResponseParcel.f14587w);
        if (adResponseParcel.f14575k != -1) {
            jSONObject.put("refresh_interval_milliseconds", adResponseParcel.f14575k);
        }
        if (adResponseParcel.f14573i != -1) {
            jSONObject.put("mediation_config_cache_time_milliseconds", adResponseParcel.f14573i);
        }
        if (!TextUtils.isEmpty(adResponseParcel.f14590z)) {
            jSONObject.put("gws_query_id", adResponseParcel.f14590z);
        }
        jSONObject.put("fluid", adResponseParcel.f14550A ? FimiMediaMeta.IJKM_KEY_HEIGHT : "");
        jSONObject.put("native_express", adResponseParcel.f14551B);
        if (adResponseParcel.f14553D != null) {
            jSONObject.put("video_start_urls", m18667a(adResponseParcel.f14553D));
        }
        if (adResponseParcel.f14554E != null) {
            jSONObject.put("video_complete_urls", m18667a(adResponseParcel.f14554E));
        }
        if (adResponseParcel.f14552C != null) {
            jSONObject.put("rewards", adResponseParcel.f14552C.m26950a());
        }
        jSONObject.put("use_displayed_impression", adResponseParcel.f14555F);
        jSONObject.put("auto_protection_configuration", adResponseParcel.f14556G);
        jSONObject.put("render_in_browser", adResponseParcel.f14560K);
        return jSONObject;
    }

    /* renamed from: a */
    private static void m18673a(HashMap<String, Object> hashMap) {
        Bundle bundle = new Bundle();
        Bundle bundle2 = new Bundle();
        bundle2.putString("cl", "133155058");
        bundle2.putString("rapid_rc", "dev");
        bundle2.putString("rapid_rollup", C11044h.f35585a);
        bundle.putBundle("build_meta", bundle2);
        bundle.putString("mf", Boolean.toString(C7788uf.f25802bG.m13486c().booleanValue()));
        hashMap.put("sdk_env", bundle);
    }

    /* renamed from: a */
    private static void m18672a(HashMap<String, Object> hashMap, Location location) {
        HashMap hashMap2 = new HashMap();
        Float valueOf = Float.valueOf(location.getAccuracy() * 1000.0f);
        Long valueOf2 = Long.valueOf(location.getTime() * 1000);
        Long valueOf3 = Long.valueOf((long) (location.getLatitude() * 1.0E7d));
        Long valueOf4 = Long.valueOf((long) (location.getLongitude() * 1.0E7d));
        hashMap2.put("radius", valueOf);
        hashMap2.put("lat", valueOf3);
        hashMap2.put("long", valueOf4);
        hashMap2.put(C3070c.C3071a.f11505i, valueOf2);
        hashMap.put("uule", hashMap2);
    }

    /* renamed from: a */
    private static void m18671a(HashMap<String, Object> hashMap, AdRequestParcel adRequestParcel) {
        String m18416a = abp.m18416a();
        if (m18416a != null) {
            hashMap.put("abf", m18416a);
        }
        if (adRequestParcel.f13846b != -1) {
            hashMap.put("cust_age", f20693a.format(new Date(adRequestParcel.f13846b)));
        }
        if (adRequestParcel.f13847c != null) {
            hashMap.put("extras", adRequestParcel.f13847c);
        }
        if (adRequestParcel.f13848d != -1) {
            hashMap.put("cust_gender", Integer.valueOf(adRequestParcel.f13848d));
        }
        if (adRequestParcel.f13849e != null) {
            hashMap.put("kw", adRequestParcel.f13849e);
        }
        if (adRequestParcel.f13851g != -1) {
            hashMap.put("tag_for_child_directed_treatment", Integer.valueOf(adRequestParcel.f13851g));
        }
        if (adRequestParcel.f13850f) {
            hashMap.put("adtest", C1831e.f4911cE);
        }
        if (adRequestParcel.f13845a >= 2) {
            if (adRequestParcel.f13852h) {
                hashMap.put("d_imp_hdr", 1);
            }
            if (!TextUtils.isEmpty(adRequestParcel.f13853i)) {
                hashMap.put("ppid", adRequestParcel.f13853i);
            }
            if (adRequestParcel.f13854j != null) {
                m18670a(hashMap, adRequestParcel.f13854j);
            }
        }
        if (adRequestParcel.f13845a >= 3 && adRequestParcel.f13856l != null) {
            hashMap.put("url", adRequestParcel.f13856l);
        }
        if (adRequestParcel.f13845a >= 5) {
            if (adRequestParcel.f13858n != null) {
                hashMap.put("custom_targeting", adRequestParcel.f13858n);
            }
            if (adRequestParcel.f13859o != null) {
                hashMap.put("category_exclusions", adRequestParcel.f13859o);
            }
            if (adRequestParcel.f13860p != null) {
                hashMap.put("request_agent", adRequestParcel.f13860p);
            }
        }
        if (adRequestParcel.f13845a >= 6 && adRequestParcel.f13861q != null) {
            hashMap.put("request_pkg", adRequestParcel.f13861q);
        }
        if (adRequestParcel.f13845a >= 7) {
            hashMap.put("is_designed_for_families", Boolean.valueOf(adRequestParcel.f13862r));
        }
    }

    /* renamed from: a */
    private static void m18670a(HashMap<String, Object> hashMap, SearchAdRequestParcel searchAdRequestParcel) {
        String str;
        String str2 = null;
        if (Color.alpha(searchAdRequestParcel.f13875b) != 0) {
            hashMap.put("acolor", m18679a(searchAdRequestParcel.f13875b));
        }
        if (Color.alpha(searchAdRequestParcel.f13876c) != 0) {
            hashMap.put("bgcolor", m18679a(searchAdRequestParcel.f13876c));
        }
        if (Color.alpha(searchAdRequestParcel.f13877d) != 0 && Color.alpha(searchAdRequestParcel.f13878e) != 0) {
            hashMap.put("gradientto", m18679a(searchAdRequestParcel.f13877d));
            hashMap.put("gradientfrom", m18679a(searchAdRequestParcel.f13878e));
        }
        if (Color.alpha(searchAdRequestParcel.f13879f) != 0) {
            hashMap.put("bcolor", m18679a(searchAdRequestParcel.f13879f));
        }
        hashMap.put("bthick", Integer.toString(searchAdRequestParcel.f13880g));
        switch (searchAdRequestParcel.f13881h) {
            case 0:
                str = "none";
                break;
            case 1:
                str = "dashed";
                break;
            case 2:
                str = "dotted";
                break;
            case 3:
                str = "solid";
                break;
            default:
                str = null;
                break;
        }
        if (str != null) {
            hashMap.put("btype", str);
        }
        switch (searchAdRequestParcel.f13882i) {
            case 0:
                str2 = "light";
                break;
            case 1:
                str2 = "medium";
                break;
            case 2:
                str2 = "dark";
                break;
        }
        if (str2 != null) {
            hashMap.put("callbuttoncolor", str2);
        }
        if (searchAdRequestParcel.f13883j != null) {
            hashMap.put("channel", searchAdRequestParcel.f13883j);
        }
        if (Color.alpha(searchAdRequestParcel.f13884k) != 0) {
            hashMap.put("dcolor", m18679a(searchAdRequestParcel.f13884k));
        }
        if (searchAdRequestParcel.f13885l != null) {
            hashMap.put("font", searchAdRequestParcel.f13885l);
        }
        if (Color.alpha(searchAdRequestParcel.f13886m) != 0) {
            hashMap.put("hcolor", m18679a(searchAdRequestParcel.f13886m));
        }
        hashMap.put("headersize", Integer.toString(searchAdRequestParcel.f13887n));
        if (searchAdRequestParcel.f13888o != null) {
            hashMap.put("q", searchAdRequestParcel.f13888o);
        }
    }

    /* renamed from: a */
    private static void m18669a(HashMap<String, Object> hashMap, aak aakVar, aao.C6117a c6117a, Bundle bundle, Bundle bundle2) {
        hashMap.put("am", Integer.valueOf(aakVar.f20750a));
        hashMap.put("cog", m18665a(aakVar.f20751b));
        hashMap.put("coh", m18665a(aakVar.f20752c));
        if (!TextUtils.isEmpty(aakVar.f20753d)) {
            hashMap.put("carrier", aakVar.f20753d);
        }
        hashMap.put("gl", aakVar.f20754e);
        if (aakVar.f20755f) {
            hashMap.put("simulator", 1);
        }
        if (aakVar.f20756g) {
            hashMap.put("is_sidewinder", 1);
        }
        hashMap.put("ma", m18665a(aakVar.f20757h));
        hashMap.put("sp", m18665a(aakVar.f20758i));
        hashMap.put("hl", aakVar.f20759j);
        if (!TextUtils.isEmpty(aakVar.f20760k)) {
            hashMap.put("mv", aakVar.f20760k);
        }
        hashMap.put("muv", Integer.valueOf(aakVar.f20761l));
        if (aakVar.f20762m != -2) {
            hashMap.put("cnt", Integer.valueOf(aakVar.f20762m));
        }
        hashMap.put("gnt", Integer.valueOf(aakVar.f20763n));
        hashMap.put(LocaleUtil.PORTUGUESE, Integer.valueOf(aakVar.f20764o));
        hashMap.put("rm", Integer.valueOf(aakVar.f20765p));
        hashMap.put("riv", Integer.valueOf(aakVar.f20766q));
        Bundle bundle3 = new Bundle();
        bundle3.putString("build", aakVar.f20774y);
        Bundle bundle4 = new Bundle();
        bundle4.putBoolean("is_charging", aakVar.f20771v);
        bundle4.putDouble("battery_level", aakVar.f20770u);
        bundle3.putBundle("battery", bundle4);
        Bundle bundle5 = new Bundle();
        bundle5.putInt("active_network_state", aakVar.f20773x);
        bundle5.putBoolean("active_network_metered", aakVar.f20772w);
        if (c6117a != null) {
            Bundle bundle6 = new Bundle();
            bundle6.putInt("predicted_latency_micros", 0);
            bundle6.putLong("predicted_down_throughput_bps", 0L);
            bundle6.putLong("predicted_up_throughput_bps", 0L);
            bundle5.putBundle("predictions", bundle6);
        }
        bundle3.putBundle("network", bundle5);
        Bundle bundle7 = new Bundle();
        bundle7.putBoolean("is_browser_custom_tabs_capable", aakVar.f20775z);
        bundle3.putBundle("browser", bundle7);
        if (bundle != null) {
            bundle3.putBundle("android_mem_info", m18676a(bundle));
        }
        Bundle bundle8 = new Bundle();
        bundle8.putBundle("parental_controls", bundle2);
        bundle3.putBundle("play_store", bundle8);
        hashMap.put("device", bundle3);
    }

    /* renamed from: a */
    private static void m18668a(HashMap<String, Object> hashMap, String str) {
        Bundle bundle = new Bundle();
        bundle.putString("doritos", str);
        hashMap.put("pii", bundle);
    }
}
