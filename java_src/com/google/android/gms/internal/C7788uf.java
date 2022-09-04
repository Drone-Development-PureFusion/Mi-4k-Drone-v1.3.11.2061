package com.google.android.gms.internal;

import android.content.Context;
import com.fimi.soul.service.CameraSocketService;
import com.google.android.gms.ads.internal.C3779u;
import com.google.android.gms.cast.framework.media.NotificationOptions;
import com.xiaomi.mistatistic.sdk.MiStatInterface;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
@aaa
/* renamed from: com.google.android.gms.internal.uf */
/* loaded from: classes.dex */
public final class C7788uf {

    /* renamed from: a */
    public static final AbstractC7779ub<String> f25742a = AbstractC7779ub.m13493a(0, "gads:sdk_core_experiment_id");

    /* renamed from: b */
    public static final AbstractC7779ub<String> f25795b = AbstractC7779ub.m13489a(0, "gads:sdk_core_location", "https://googleads.g.doubleclick.net/mads/static/mad/sdk/native/sdk-core-v40.html");

    /* renamed from: c */
    public static final AbstractC7779ub<Boolean> f25848c = AbstractC7779ub.m13490a(0, "gads:request_builder:singleton_webview", (Boolean) false);

    /* renamed from: d */
    public static final AbstractC7779ub<String> f25886d = AbstractC7779ub.m13493a(0, "gads:request_builder:singleton_webview_experiment_id");

    /* renamed from: e */
    public static final AbstractC7779ub<Boolean> f25887e = AbstractC7779ub.m13490a(0, "gads:sdk_use_dynamic_module", (Boolean) true);

    /* renamed from: f */
    public static final AbstractC7779ub<String> f25888f = AbstractC7779ub.m13493a(0, "gads:sdk_use_dynamic_module_experiment_id");

    /* renamed from: g */
    public static final AbstractC7779ub<Boolean> f25889g = AbstractC7779ub.m13490a(0, "gads:sdk_crash_report_enabled", (Boolean) false);

    /* renamed from: h */
    public static final AbstractC7779ub<Boolean> f25890h = AbstractC7779ub.m13490a(0, "gads:sdk_crash_report_full_stacktrace", (Boolean) false);

    /* renamed from: i */
    public static final AbstractC7779ub<String> f25891i = AbstractC7779ub.m13489a(0, "gads:sdk_crash_report_class_prefix", "com.google.");

    /* renamed from: j */
    public static final AbstractC7779ub<Boolean> f25892j = AbstractC7779ub.m13490a(0, "gads:block_autoclicks", (Boolean) false);

    /* renamed from: k */
    public static final AbstractC7779ub<String> f25893k = AbstractC7779ub.m13493a(0, "gads:block_autoclicks_experiment_id");

    /* renamed from: l */
    public static final AbstractC7779ub<String> f25894l = AbstractC7779ub.m13487b(0, "gads:prefetch:experiment_id");

    /* renamed from: m */
    public static final AbstractC7779ub<String> f25895m = AbstractC7779ub.m13493a(0, "gads:spam_app_context:experiment_id");

    /* renamed from: n */
    public static final AbstractC7779ub<Boolean> f25896n = AbstractC7779ub.m13490a(1, "gads:spam_app_context:enabled", (Boolean) false);

    /* renamed from: o */
    public static final AbstractC7779ub<Integer> f25897o = AbstractC7779ub.m13492a(1, "gads:http_url_connection_factory:timeout_millis", 10000);

    /* renamed from: p */
    public static final AbstractC7779ub<String> f25898p = AbstractC7779ub.m13489a(1, "gads:video_exo_player:version", "1");

    /* renamed from: q */
    public static final AbstractC7779ub<String> f25899q = AbstractC7779ub.m13493a(0, "gads:video_stream_cache:experiment_id");

    /* renamed from: r */
    public static final AbstractC7779ub<Integer> f25900r = AbstractC7779ub.m13492a(1, "gads:video_stream_cache:limit_count", 5);

    /* renamed from: s */
    public static final AbstractC7779ub<Integer> f25901s = AbstractC7779ub.m13492a(1, "gads:video_stream_cache:limit_space", 8388608);

    /* renamed from: t */
    public static final AbstractC7779ub<Integer> f25902t = AbstractC7779ub.m13492a(1, "gads:video_stream_exo_allocator:segment_size", 65536);

    /* renamed from: u */
    public static final AbstractC7779ub<Integer> f25903u = AbstractC7779ub.m13492a(1, "gads:video_stream_exo_cache:buffer_size", 8388608);

    /* renamed from: v */
    public static final AbstractC7779ub<Long> f25904v = AbstractC7779ub.m13491a(1, "gads:video_stream_cache:limit_time_sec", 300L);

    /* renamed from: w */
    public static final AbstractC7779ub<Long> f25905w = AbstractC7779ub.m13491a(1, "gads:video_stream_cache:notify_interval_millis", 1000L);

    /* renamed from: x */
    public static final AbstractC7779ub<Integer> f25906x = AbstractC7779ub.m13492a(1, "gads:video_stream_cache:connect_timeout_millis", 10000);

    /* renamed from: y */
    public static final AbstractC7779ub<Boolean> f25907y = AbstractC7779ub.m13490a(0, "gads:video:metric_reporting_enabled", (Boolean) false);

    /* renamed from: z */
    public static final AbstractC7779ub<String> f25908z = AbstractC7779ub.m13489a(1, "gads:video:metric_frame_hash_times", "");

    /* renamed from: A */
    public static final AbstractC7779ub<Long> f25716A = AbstractC7779ub.m13491a(1, "gads:video:metric_frame_hash_time_leniency", 500L);

    /* renamed from: B */
    public static final AbstractC7779ub<Boolean> f25717B = AbstractC7779ub.m13490a(1, "gads:video:force_watermark", (Boolean) false);

    /* renamed from: C */
    public static final AbstractC7779ub<Boolean> f25718C = AbstractC7779ub.m13490a(1, "gads:memory_bundle:debug_info", (Boolean) false);

    /* renamed from: D */
    public static final AbstractC7779ub<Boolean> f25719D = AbstractC7779ub.m13490a(1, "gads:memory_bundle:runtime_info", (Boolean) true);

    /* renamed from: E */
    public static final AbstractC7779ub<String> f25720E = AbstractC7779ub.m13487b(0, "gads:spam_ad_id_decorator:experiment_id");

    /* renamed from: F */
    public static final AbstractC7779ub<Boolean> f25721F = AbstractC7779ub.m13490a(0, "gads:spam_ad_id_decorator:enabled", (Boolean) false);

    /* renamed from: G */
    public static final AbstractC7779ub<String> f25722G = AbstractC7779ub.m13487b(0, "gads:looper_for_gms_client:experiment_id");

    /* renamed from: H */
    public static final AbstractC7779ub<Boolean> f25723H = AbstractC7779ub.m13490a(0, "gads:looper_for_gms_client:enabled", (Boolean) true);

    /* renamed from: I */
    public static final AbstractC7779ub<Boolean> f25724I = AbstractC7779ub.m13490a(0, "gads:sw_ad_request_service:enabled", (Boolean) true);

    /* renamed from: J */
    public static final AbstractC7779ub<Boolean> f25725J = AbstractC7779ub.m13490a(0, "gads:sw_dynamite:enabled", (Boolean) true);

    /* renamed from: K */
    public static final AbstractC7779ub<String> f25726K = AbstractC7779ub.m13489a(1, "gad:mraid:url_banner", "https://googleads.g.doubleclick.net/mads/static/mad/sdk/native/mraid/v2/mraid_app_banner.js");

    /* renamed from: L */
    public static final AbstractC7779ub<String> f25727L = AbstractC7779ub.m13489a(1, "gad:mraid:url_expanded_banner", "https://googleads.g.doubleclick.net/mads/static/mad/sdk/native/mraid/v2/mraid_app_expanded_banner.js");

    /* renamed from: M */
    public static final AbstractC7779ub<String> f25728M = AbstractC7779ub.m13489a(1, "gad:mraid:url_interstitial", "https://googleads.g.doubleclick.net/mads/static/mad/sdk/native/mraid/v2/mraid_app_interstitial.js");

    /* renamed from: N */
    public static final AbstractC7779ub<Boolean> f25729N = AbstractC7779ub.m13490a(0, "gads:enabled_sdk_csi", (Boolean) false);

    /* renamed from: O */
    public static final AbstractC7779ub<String> f25730O = AbstractC7779ub.m13489a(0, "gads:sdk_csi_server", "https://csi.gstatic.com/csi");

    /* renamed from: P */
    public static final AbstractC7779ub<Boolean> f25731P = AbstractC7779ub.m13490a(0, "gads:sdk_csi_write_to_file", (Boolean) false);

    /* renamed from: Q */
    public static final AbstractC7779ub<Boolean> f25732Q = AbstractC7779ub.m13490a(0, "gads:enable_content_fetching", (Boolean) true);

    /* renamed from: R */
    public static final AbstractC7779ub<Integer> f25733R = AbstractC7779ub.m13492a(0, "gads:content_length_weight", 1);

    /* renamed from: S */
    public static final AbstractC7779ub<Integer> f25734S = AbstractC7779ub.m13492a(0, "gads:content_age_weight", 1);

    /* renamed from: T */
    public static final AbstractC7779ub<Integer> f25735T = AbstractC7779ub.m13492a(0, "gads:min_content_len", 11);

    /* renamed from: U */
    public static final AbstractC7779ub<Integer> f25736U = AbstractC7779ub.m13492a(0, "gads:fingerprint_number", 10);

    /* renamed from: V */
    public static final AbstractC7779ub<Integer> f25737V = AbstractC7779ub.m13492a(0, "gads:sleep_sec", 10);

    /* renamed from: W */
    public static final AbstractC7779ub<Boolean> f25738W = AbstractC7779ub.m13490a(0, "gad:app_index_enabled", (Boolean) true);

    /* renamed from: X */
    public static final AbstractC7779ub<Boolean> f25739X = AbstractC7779ub.m13490a(0, "gads:app_index:without_content_info_present:enabled", (Boolean) true);

    /* renamed from: Y */
    public static final AbstractC7779ub<Long> f25740Y = AbstractC7779ub.m13491a(0, "gads:app_index:timeout_ms", 1000L);

    /* renamed from: Z */
    public static final AbstractC7779ub<String> f25741Z = AbstractC7779ub.m13493a(0, "gads:app_index:experiment_id");

    /* renamed from: aa */
    public static final AbstractC7779ub<String> f25769aa = AbstractC7779ub.m13493a(0, "gads:kitkat_interstitial_workaround:experiment_id");

    /* renamed from: ab */
    public static final AbstractC7779ub<Boolean> f25770ab = AbstractC7779ub.m13490a(0, "gads:kitkat_interstitial_workaround:enabled", (Boolean) true);

    /* renamed from: ac */
    public static final AbstractC7779ub<Boolean> f25771ac = AbstractC7779ub.m13490a(0, "gads:interstitial_follow_url", (Boolean) true);

    /* renamed from: ad */
    public static final AbstractC7779ub<Boolean> f25772ad = AbstractC7779ub.m13490a(0, "gads:interstitial_follow_url:register_click", (Boolean) true);

    /* renamed from: ae */
    public static final AbstractC7779ub<String> f25773ae = AbstractC7779ub.m13493a(0, "gads:interstitial_follow_url:experiment_id");

    /* renamed from: af */
    public static final AbstractC7779ub<Boolean> f25774af = AbstractC7779ub.m13490a(0, "gads:analytics_enabled", (Boolean) true);

    /* renamed from: ag */
    public static final AbstractC7779ub<Boolean> f25775ag = AbstractC7779ub.m13490a(0, "gads:ad_key_enabled", (Boolean) false);

    /* renamed from: ah */
    public static final AbstractC7779ub<Integer> f25776ah = AbstractC7779ub.m13492a(0, "gads:webview_cache_version", 0);

    /* renamed from: ai */
    public static final AbstractC7779ub<Boolean> f25777ai = AbstractC7779ub.m13490a(1, "gads:webview_recycle:enabled", (Boolean) false);

    /* renamed from: aj */
    public static final AbstractC7779ub<String> f25778aj = AbstractC7779ub.m13493a(1, "gads:webview_recycle:experiment_id");

    /* renamed from: ak */
    public static final AbstractC7779ub<Boolean> f25779ak = AbstractC7779ub.m13490a(1, "gads:webview:ignore_over_scroll", (Boolean) true);

    /* renamed from: al */
    public static final AbstractC7779ub<String> f25780al = AbstractC7779ub.m13487b(0, "gads:pan:experiment_id");

    /* renamed from: am */
    public static final AbstractC7779ub<String> f25781am = AbstractC7779ub.m13493a(1, "gads:rewarded:experiment_id");

    /* renamed from: an */
    public static final AbstractC7779ub<Long> f25782an = AbstractC7779ub.m13491a(1, "gads:rewarded:adapter_timeout_ms", 20000L);

    /* renamed from: ao */
    public static final AbstractC7779ub<Boolean> f25783ao = AbstractC7779ub.m13490a(1, "gads:app_activity_tracker:enabled", (Boolean) true);

    /* renamed from: ap */
    public static final AbstractC7779ub<Long> f25784ap = AbstractC7779ub.m13491a(1, "gads:app_activity_tracker:notify_background_listeners_delay_ms", 500L);

    /* renamed from: aq */
    public static final AbstractC7779ub<Long> f25785aq = AbstractC7779ub.m13491a(1, "gads:app_activity_tracker:app_session_timeout_ms", TimeUnit.MINUTES.toMillis(5));

    /* renamed from: ar */
    public static final AbstractC7779ub<Boolean> f25786ar = AbstractC7779ub.m13490a(0, "gads:ad_manager_creator:enabled", (Boolean) true);

    /* renamed from: as */
    public static final AbstractC7779ub<String> f25787as = AbstractC7779ub.m13493a(1, "gads:ad_manager_enforce_arp_invariant:experiment_id");

    /* renamed from: at */
    public static final AbstractC7779ub<Boolean> f25788at = AbstractC7779ub.m13490a(1, "gads:ad_manager_enforce_arp_invariant:enabled", (Boolean) false);

    /* renamed from: au */
    public static final AbstractC7779ub<Long> f25789au = AbstractC7779ub.m13491a(1, "gads:ad_overlay:delay_page_close_timeout_ms", 5000L);

    /* renamed from: av */
    public static final AbstractC7779ub<Boolean> f25790av = AbstractC7779ub.m13490a(1, "gads:interstitial_ad_pool:enabled", (Boolean) false);

    /* renamed from: aw */
    public static final AbstractC7779ub<Boolean> f25791aw = AbstractC7779ub.m13490a(1, "gads:interstitial_ad_pool:enabled_for_rewarded", (Boolean) false);

    /* renamed from: ax */
    public static final AbstractC7779ub<String> f25792ax = AbstractC7779ub.m13489a(1, "gads:interstitial_ad_pool:schema", "customTargeting");

    /* renamed from: ay */
    public static final AbstractC7779ub<String> f25793ay = AbstractC7779ub.m13489a(1, "gads:interstitial_ad_pool:request_exclusions", "com.google.ads.mediation.admob.AdMobAdapter/_ad");

    /* renamed from: az */
    public static final AbstractC7779ub<Integer> f25794az = AbstractC7779ub.m13492a(1, "gads:interstitial_ad_pool:max_pools", 3);

    /* renamed from: aA */
    public static final AbstractC7779ub<Integer> f25743aA = AbstractC7779ub.m13492a(1, "gads:interstitial_ad_pool:max_pool_depth", 2);

    /* renamed from: aB */
    public static final AbstractC7779ub<Integer> f25744aB = AbstractC7779ub.m13492a(1, "gads:interstitial_ad_pool:time_limit_sec", (int) CameraSocketService.f11340b);

    /* renamed from: aC */
    public static final AbstractC7779ub<String> f25745aC = AbstractC7779ub.m13489a(1, "gads:interstitial_ad_pool:ad_unit_exclusions", "(?!)");

    /* renamed from: aD */
    public static final AbstractC7779ub<String> f25746aD = AbstractC7779ub.m13489a(1, "gads:spherical_video:vertex_shader", "");

    /* renamed from: aE */
    public static final AbstractC7779ub<String> f25747aE = AbstractC7779ub.m13489a(1, "gads:spherical_video:fragment_shader", "");

    /* renamed from: aF */
    public static final AbstractC7779ub<String> f25748aF = AbstractC7779ub.m13493a(1, "gads:spherical_video:experiment_id");

    /* renamed from: aG */
    public static final AbstractC7779ub<Boolean> f25749aG = AbstractC7779ub.m13490a(0, "gads:log:verbose_enabled", (Boolean) false);

    /* renamed from: aH */
    public static final AbstractC7779ub<Boolean> f25750aH = AbstractC7779ub.m13490a(1, "gads:include_local_global_rectangles", (Boolean) false);

    /* renamed from: aI */
    public static final AbstractC7779ub<String> f25751aI = AbstractC7779ub.m13493a(1, "gads:include_local_global_rectangles:experiment_id");

    /* renamed from: aJ */
    public static final AbstractC7779ub<Boolean> f25752aJ = AbstractC7779ub.m13490a(0, "gads:device_info_caching:enabled", (Boolean) true);

    /* renamed from: aK */
    public static final AbstractC7779ub<Long> f25753aK = AbstractC7779ub.m13491a(0, "gads:device_info_caching_expiry_ms:expiry", (long) MiStatInterface.MIN_UPLOAD_INTERVAL);

    /* renamed from: aL */
    public static final AbstractC7779ub<Boolean> f25754aL = AbstractC7779ub.m13490a(0, "gads:gen204_signals:enabled", (Boolean) false);

    /* renamed from: aM */
    public static final AbstractC7779ub<Boolean> f25755aM = AbstractC7779ub.m13490a(0, "gads:webview:error_reporting_enabled", (Boolean) false);

    /* renamed from: aN */
    public static final AbstractC7779ub<Boolean> f25756aN = AbstractC7779ub.m13490a(0, "gads:adid_reporting:enabled", (Boolean) false);

    /* renamed from: aO */
    public static final AbstractC7779ub<Boolean> f25757aO = AbstractC7779ub.m13490a(0, "gads:ad_settings_page_reporting:enabled", (Boolean) false);

    /* renamed from: aP */
    public static final AbstractC7779ub<Boolean> f25758aP = AbstractC7779ub.m13490a(0, "gads:adid_info_gmscore_upgrade_reporting:enabled", (Boolean) false);

    /* renamed from: aQ */
    public static final AbstractC7779ub<Boolean> f25759aQ = AbstractC7779ub.m13490a(0, "gads:request_pkg:enabled", (Boolean) true);

    /* renamed from: aR */
    public static final AbstractC7779ub<Boolean> f25760aR = AbstractC7779ub.m13490a(1, "gads:gmsg:disable_back_button:enabled", (Boolean) true);

    /* renamed from: aS */
    public static final AbstractC7779ub<Boolean> f25761aS = AbstractC7779ub.m13490a(0, "gads:gmsg:video_meta:enabled", (Boolean) true);

    /* renamed from: aT */
    public static final AbstractC7779ub<String> f25762aT = AbstractC7779ub.m13493a(0, "gads:gmsg:video_meta:experiment_id");

    /* renamed from: aU */
    public static final AbstractC7779ub<Long> f25763aU = AbstractC7779ub.m13491a(0, "gads:network:cache_prediction_duration_s", 300L);

    /* renamed from: aV */
    public static final AbstractC7779ub<Boolean> f25764aV = AbstractC7779ub.m13490a(0, "gads:mediation:dynamite_first:admobadapter", (Boolean) true);

    /* renamed from: aW */
    public static final AbstractC7779ub<Boolean> f25765aW = AbstractC7779ub.m13490a(0, "gads:mediation:dynamite_first:adurladapter", (Boolean) true);

    /* renamed from: aX */
    public static final AbstractC7779ub<Long> f25766aX = AbstractC7779ub.m13491a(0, "gads:ad_loader:timeout_ms", 60000L);

    /* renamed from: aY */
    public static final AbstractC7779ub<Long> f25767aY = AbstractC7779ub.m13491a(0, "gads:rendering:timeout_ms", 60000L);

    /* renamed from: aZ */
    public static final AbstractC7779ub<Boolean> f25768aZ = AbstractC7779ub.m13490a(0, "gads:adshield:enable_adshield_instrumentation", (Boolean) false);

    /* renamed from: ba */
    public static final AbstractC7779ub<Long> f25822ba = AbstractC7779ub.m13491a(1, "gads:gestures:task_timeout", 2000L);

    /* renamed from: bb */
    public static final AbstractC7779ub<String> f25823bb = AbstractC7779ub.m13493a(1, "gads:gestures:encrypt_size_limit:experiment_id");

    /* renamed from: bc */
    public static final AbstractC7779ub<Boolean> f25824bc = AbstractC7779ub.m13490a(1, "gads:gestures:encrypt_size_limit:enabled", (Boolean) false);

    /* renamed from: bd */
    public static final AbstractC7779ub<String> f25825bd = AbstractC7779ub.m13493a(1, "gads:gestures:appid:experiment_id");

    /* renamed from: be */
    public static final AbstractC7779ub<Boolean> f25826be = AbstractC7779ub.m13490a(1, "gads:gestures:appid:enabled", (Boolean) false);

    /* renamed from: bf */
    public static final AbstractC7779ub<Boolean> f25827bf = AbstractC7779ub.m13490a(0, "gads:gestures:v6:enabled", (Boolean) false);

    /* renamed from: bg */
    public static final AbstractC7779ub<String> f25828bg = AbstractC7779ub.m13493a(1, "gads:gestures:usb_query:experiment_id");

    /* renamed from: bh */
    public static final AbstractC7779ub<Boolean> f25829bh = AbstractC7779ub.m13490a(1, "gads:gestures:usb_query:enabled", (Boolean) false);

    /* renamed from: bi */
    public static final AbstractC7779ub<String> f25830bi = AbstractC7779ub.m13493a(1, "gads:gestures:usb_click:experiment_id");

    /* renamed from: bj */
    public static final AbstractC7779ub<Boolean> f25831bj = AbstractC7779ub.m13490a(1, "gads:gestures:usb_click:enabled", (Boolean) false);

    /* renamed from: bk */
    public static final AbstractC7779ub<Boolean> f25832bk = AbstractC7779ub.m13490a(1, "gads:gestures:touchinfo:enabled", (Boolean) false);

    /* renamed from: bl */
    public static final AbstractC7779ub<String> f25833bl = AbstractC7779ub.m13493a(1, "gads:gestures:touchinfo:experiment_id");

    /* renamed from: bm */
    public static final AbstractC7779ub<Boolean> f25834bm = AbstractC7779ub.m13490a(1, "gads:gestures:clock_query:enabled", (Boolean) false);

    /* renamed from: bn */
    public static final AbstractC7779ub<String> f25835bn = AbstractC7779ub.m13493a(1, "gads:gestures:clock_query:experiment_id");

    /* renamed from: bo */
    public static final AbstractC7779ub<Boolean> f25836bo = AbstractC7779ub.m13490a(1, "gads:gestures:clock_click:enabled", (Boolean) false);

    /* renamed from: bp */
    public static final AbstractC7779ub<String> f25837bp = AbstractC7779ub.m13493a(1, "gads:gestures:clock_click:experiment_id");

    /* renamed from: bq */
    public static AbstractC7779ub<Boolean> f25838bq = AbstractC7779ub.m13490a(1, "gads:gestures:btl_click:enabled", (Boolean) false);

    /* renamed from: br */
    public static AbstractC7779ub<String> f25839br = AbstractC7779ub.m13493a(1, "gads:gestures:btl_click:experiment_id");

    /* renamed from: bs */
    public static final AbstractC7779ub<String> f25840bs = AbstractC7779ub.m13493a(1, "gads:gestures:click_stk:experiment_id");

    /* renamed from: bt */
    public static final AbstractC7779ub<Boolean> f25841bt = AbstractC7779ub.m13490a(1, "gads:gestures:click_stk:enabled", (Boolean) true);

    /* renamed from: bu */
    public static final AbstractC7779ub<Boolean> f25842bu = AbstractC7779ub.m13490a(0, "gass:client:enabled", (Boolean) true);

    /* renamed from: bv */
    public static final AbstractC7779ub<String> f25843bv = AbstractC7779ub.m13493a(0, "gass:client:experiment_id");

    /* renamed from: bw */
    public static final AbstractC7779ub<Boolean> f25844bw = AbstractC7779ub.m13490a(0, "gass:enabled", (Boolean) true);

    /* renamed from: bx */
    public static final AbstractC7779ub<Boolean> f25845bx = AbstractC7779ub.m13490a(0, "gass:enable_int_signal", (Boolean) true);

    /* renamed from: by */
    public static final AbstractC7779ub<Boolean> f25846by = AbstractC7779ub.m13490a(0, "gads:adid_notification:first_party_check:enabled", (Boolean) true);

    /* renamed from: bz */
    public static final AbstractC7779ub<Boolean> f25847bz = AbstractC7779ub.m13490a(0, "gads:edu_device_helper:enabled", (Boolean) true);

    /* renamed from: bA */
    public static final AbstractC7779ub<Boolean> f25796bA = AbstractC7779ub.m13490a(0, "gads:support_screen_shot", (Boolean) true);

    /* renamed from: bB */
    public static final AbstractC7779ub<Boolean> f25797bB = AbstractC7779ub.m13490a(0, "gads:use_get_drawing_cache_for_screenshot:enabled", (Boolean) true);

    /* renamed from: bC */
    public static final AbstractC7779ub<String> f25798bC = AbstractC7779ub.m13493a(0, "gads:use_get_drawing_cache_for_screenshot:experiment_id");

    /* renamed from: bD */
    public static final AbstractC7779ub<String> f25799bD = AbstractC7779ub.m13493a(1, "gads:sdk_core_constants:experiment_id");

    /* renamed from: bE */
    public static final AbstractC7779ub<String> f25800bE = AbstractC7779ub.m13489a(1, "gads:sdk_core_constants:caps", "");

    /* renamed from: bF */
    public static final AbstractC7779ub<Long> f25801bF = AbstractC7779ub.m13491a(0, "gads:js_flags:update_interval", TimeUnit.HOURS.toMillis(12));

    /* renamed from: bG */
    public static final AbstractC7779ub<Boolean> f25802bG = AbstractC7779ub.m13490a(0, "gads:js_flags:mf", (Boolean) false);

    /* renamed from: bH */
    public static final AbstractC7779ub<Boolean> f25803bH = AbstractC7779ub.m13490a(0, "gads:custom_render:ping_on_ad_rendered", (Boolean) false);

    /* renamed from: bI */
    public static final AbstractC7779ub<String> f25804bI = AbstractC7779ub.m13489a(0, "gads:native:engine_url", "//googleads.g.doubleclick.net/mads/static/mad/sdk/native/native_ads.html");

    /* renamed from: bJ */
    public static final AbstractC7779ub<String> f25805bJ = AbstractC7779ub.m13489a(1, "gads:native:video_url", "//googleads.g.doubleclick.net/mads/static/mad/sdk/native/native_video_ads.html");

    /* renamed from: bK */
    public static final AbstractC7779ub<Boolean> f25806bK = AbstractC7779ub.m13490a(1, "gads:singleton_webview_native", (Boolean) false);

    /* renamed from: bL */
    public static final AbstractC7779ub<String> f25807bL = AbstractC7779ub.m13493a(1, "gads:singleton_webview_native:experiment_id");

    /* renamed from: bM */
    public static final AbstractC7779ub<Boolean> f25808bM = AbstractC7779ub.m13490a(1, "gads:enable_untrack_view_native", (Boolean) true);

    /* renamed from: bN */
    public static final AbstractC7779ub<Boolean> f25809bN = AbstractC7779ub.m13490a(1, "gads:reset_listeners_preparead_native", (Boolean) true);

    /* renamed from: bO */
    public static final AbstractC7779ub<Integer> f25810bO = AbstractC7779ub.m13492a(1, "gads:native_video_load_timeout", 10);

    /* renamed from: bP */
    public static final AbstractC7779ub<String> f25811bP = AbstractC7779ub.m13493a(1, "gads:native_video_load_timeout:experiment_id");

    /* renamed from: bQ */
    public static final AbstractC7779ub<String> f25812bQ = AbstractC7779ub.m13489a(1, "gads:ad_choices_content_description", "Ad Choices Icon");

    /* renamed from: bR */
    public static final AbstractC7779ub<Boolean> f25813bR = AbstractC7779ub.m13490a(1, "gads:clamp_native_video_player_dimensions", (Boolean) true);

    /* renamed from: bS */
    public static final AbstractC7779ub<Boolean> f25814bS = AbstractC7779ub.m13490a(1, "gads:fluid_ad:use_wrap_content_height", (Boolean) false);

    /* renamed from: bT */
    public static final AbstractC7779ub<Boolean> f25815bT = AbstractC7779ub.m13490a(0, "gads:method_tracing:enabled", (Boolean) false);

    /* renamed from: bU */
    public static final AbstractC7779ub<Long> f25816bU = AbstractC7779ub.m13491a(0, "gads:method_tracing:duration_ms", (long) NotificationOptions.f16268b);

    /* renamed from: bV */
    public static final AbstractC7779ub<Integer> f25817bV = AbstractC7779ub.m13492a(0, "gads:method_tracing:count", 5);

    /* renamed from: bW */
    public static final AbstractC7779ub<Integer> f25818bW = AbstractC7779ub.m13492a(0, "gads:method_tracing:filesize", 134217728);

    /* renamed from: bX */
    public static final AbstractC7779ub<Boolean> f25819bX = AbstractC7779ub.m13490a(1, "gads:auto_location_for_coarse_permission", (Boolean) false);

    /* renamed from: bY */
    public static final AbstractC7779ub<String> f25820bY = AbstractC7779ub.m13487b(1, "gads:auto_location_for_coarse_permission:experiment_id");

    /* renamed from: bZ */
    public static final AbstractC7779ub<Long> f25821bZ = AbstractC7779ub.m13491a(1, "gads:auto_location_timeout", 2000L);

    /* renamed from: ca */
    public static final AbstractC7779ub<String> f25860ca = AbstractC7779ub.m13487b(1, "gads:auto_location_timeout:experiment_id");

    /* renamed from: cb */
    public static final AbstractC7779ub<Long> f25861cb = AbstractC7779ub.m13491a(1, "gads:auto_location_interval", -1L);

    /* renamed from: cc */
    public static final AbstractC7779ub<String> f25862cc = AbstractC7779ub.m13487b(1, "gads:auto_location_interval:experiment_id");

    /* renamed from: cd */
    public static final AbstractC7779ub<Boolean> f25863cd = AbstractC7779ub.m13490a(1, "gads:fetch_app_settings_using_cld:enabled", (Boolean) false);

    /* renamed from: ce */
    public static final AbstractC7779ub<String> f25864ce = AbstractC7779ub.m13493a(1, "gads:fetch_app_settings_using_cld:enabled:experiment_id");

    /* renamed from: cf */
    public static final AbstractC7779ub<Long> f25865cf = AbstractC7779ub.m13491a(1, "gads:fetch_app_settings_using_cld:refresh_interval_ms", 7200000L);

    /* renamed from: cg */
    public static final AbstractC7779ub<String> f25866cg = AbstractC7779ub.m13493a(1, "gads:fetch_app_settings_using_cld:refresh_interval_ms:experiment_id");

    /* renamed from: ch */
    public static final AbstractC7779ub<String> f25867ch = AbstractC7779ub.m13493a(0, "gads:afs:csa:experiment_id");

    /* renamed from: ci */
    public static final AbstractC7779ub<String> f25868ci = AbstractC7779ub.m13489a(0, "gads:afs:csa_webview_gmsg_ad_failed", "gmsg://noAdLoaded");

    /* renamed from: cj */
    public static final AbstractC7779ub<String> f25869cj = AbstractC7779ub.m13489a(0, "gads:afs:csa_webview_gmsg_script_load_failed", "gmsg://scriptLoadFailed");

    /* renamed from: ck */
    public static final AbstractC7779ub<String> f25870ck = AbstractC7779ub.m13489a(0, "gads:afs:csa_webview_gmsg_ad_loaded", "gmsg://adResized");

    /* renamed from: cl */
    public static final AbstractC7779ub<String> f25871cl = AbstractC7779ub.m13489a(0, "gads:afs:csa_webview_static_file_path", "/afs/ads/i/webview.html");

    /* renamed from: cm */
    public static final AbstractC7779ub<String> f25872cm = AbstractC7779ub.m13489a(0, "gads:afs:csa_webview_custom_domain_param_key", "csa_customDomain");

    /* renamed from: cn */
    public static final AbstractC7779ub<Long> f25873cn = AbstractC7779ub.m13491a(0, "gads:afs:csa_webview_adshield_timeout_ms", 1000L);

    /* renamed from: co */
    public static final AbstractC7779ub<Boolean> f25874co = AbstractC7779ub.m13490a(0, "gads:afs:csa_ad_manager_enabled", (Boolean) true);

    /* renamed from: cp */
    public static final AbstractC7779ub<Boolean> f25875cp = AbstractC7779ub.m13490a(1, "gads:parental_controls:send_from_client", (Boolean) true);

    /* renamed from: cq */
    public static final AbstractC7779ub<Long> f25876cq = AbstractC7779ub.m13491a(1, "gads:parental_controls:timeout", 2000L);

    /* renamed from: cr */
    public static final AbstractC7779ub<String> f25877cr = AbstractC7779ub.m13489a(0, "gads:safe_browsing:api_key", "AIzaSyDRKQ9d6kfsoZT2lUnZcZnBYvH69HExNPE");

    /* renamed from: cs */
    public static final AbstractC7779ub<Long> f25878cs = AbstractC7779ub.m13491a(0, "gads:safe_browsing:safety_net:delay_ms", 2000L);

    /* renamed from: ct */
    public static final AbstractC7779ub<Boolean> f25879ct = AbstractC7779ub.m13490a(0, "gads:safe_browsing:debug", (Boolean) false);

    /* renamed from: cu */
    public static final AbstractC7779ub<Boolean> f25880cu = AbstractC7779ub.m13490a(0, "gads:webview_cookie:enabled", (Boolean) true);

    /* renamed from: cv */
    public static final AbstractC7779ub<Integer> f25881cv = AbstractC7779ub.m13492a(1, "gads:cache:max_concurrent_downloads", 10);

    /* renamed from: cw */
    public static final AbstractC7779ub<Long> f25882cw = AbstractC7779ub.m13491a(1, "gads:cache:javascript_timeout_millis", 5000L);

    /* renamed from: cx */
    public static final AbstractC7779ub<Boolean> f25883cx = AbstractC7779ub.m13490a(1, "gads:cache:bind_on_foreground", (Boolean) false);

    /* renamed from: cy */
    public static final AbstractC7779ub<Boolean> f25884cy = AbstractC7779ub.m13490a(1, "gads:cache:bind_on_init", (Boolean) false);

    /* renamed from: cz */
    public static final AbstractC7779ub<Boolean> f25885cz = AbstractC7779ub.m13490a(1, "gads:cache:bind_on_request", (Boolean) false);

    /* renamed from: cA */
    public static final AbstractC7779ub<Long> f25849cA = AbstractC7779ub.m13491a(1, "gads:cache:bind_on_request_keep_alive", TimeUnit.SECONDS.toMillis(30));

    /* renamed from: cB */
    public static final AbstractC7779ub<Boolean> f25850cB = AbstractC7779ub.m13490a(1, "gads:cache:use_cache_data_source", (Boolean) false);

    /* renamed from: cC */
    public static final AbstractC7779ub<Boolean> f25851cC = AbstractC7779ub.m13490a(1, "gads:chrome_custom_tabs:enabled", (Boolean) true);

    /* renamed from: cD */
    public static final AbstractC7779ub<Boolean> f25852cD = AbstractC7779ub.m13490a(1, "gads:drx_debug:enabled", (Boolean) false);

    /* renamed from: cE */
    public static final AbstractC7779ub<String> f25853cE = AbstractC7779ub.m13489a(1, "gads:drx_debug:debug_device_linking_url", "https://www.google.com/dfp/linkDevice");

    /* renamed from: cF */
    public static final AbstractC7779ub<String> f25854cF = AbstractC7779ub.m13489a(1, "gads:drx_debug:in_app_preview_status_url", "https://www.google.com/dfp/inAppPreview");

    /* renamed from: cG */
    public static final AbstractC7779ub<String> f25855cG = AbstractC7779ub.m13489a(1, "gads:drx_debug:debug_signal_status_url", "https://www.google.com/dfp/debugSignals");

    /* renamed from: cH */
    public static final AbstractC7779ub<String> f25856cH = AbstractC7779ub.m13489a(1, "gads:drx_debug:send_debug_data_url", "https://www.google.com/dfp/sendDebugData");

    /* renamed from: cI */
    public static final AbstractC7779ub<Integer> f25857cI = AbstractC7779ub.m13492a(1, "gads:drx_debug:timeout_ms", 5000);

    /* renamed from: cJ */
    public static final AbstractC7779ub<Integer> f25858cJ = AbstractC7779ub.m13492a(1, "gad:pixel_dp_comparision_multiplier", 1);

    /* renamed from: cK */
    public static final AbstractC7779ub<Boolean> f25859cK = AbstractC7779ub.m13490a(1, "gad:interstitial_for_multi_window", (Boolean) false);

    /* renamed from: a */
    public static List<String> m13471a() {
        return C3779u.m26879p().m13480a();
    }

    /* renamed from: a */
    public static void m13470a(final Context context) {
        acj.m18219a(new Callable<Void>() { // from class: com.google.android.gms.internal.uf.1
            @Override // java.util.concurrent.Callable
            /* renamed from: a */
            public Void call() {
                C3779u.m26878q().m13474a(context);
                return null;
            }
        });
    }

    /* renamed from: b */
    public static List<String> m13469b() {
        return C3779u.m26879p().m13478b();
    }
}
