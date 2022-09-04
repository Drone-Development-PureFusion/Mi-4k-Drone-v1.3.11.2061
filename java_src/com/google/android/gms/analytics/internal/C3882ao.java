package com.google.android.gms.analytics.internal;

import com.google.android.gms.common.internal.C4588d;
import com.google.android.gms.internal.aiz;
/* renamed from: com.google.android.gms.analytics.internal.ao */
/* loaded from: classes2.dex */
public final class C3882ao {

    /* renamed from: a */
    public static C3883a<Boolean> f15036a = C3883a.m26330a("analytics.service_enabled", false);

    /* renamed from: b */
    public static C3883a<Boolean> f15037b = C3883a.m26330a("analytics.service_client_enabled", true);

    /* renamed from: c */
    public static C3883a<String> f15038c = C3883a.m26331a("analytics.log_tag", "GAv4", "GAv4-SVC");

    /* renamed from: d */
    public static C3883a<Long> f15039d = C3883a.m26334a("analytics.max_tokens", 60L);

    /* renamed from: e */
    public static C3883a<Float> f15040e = C3883a.m26338a("analytics.tokens_per_sec", 0.5f);

    /* renamed from: f */
    public static C3883a<Integer> f15041f = C3883a.m26335a("analytics.max_stored_hits", 2000, 20000);

    /* renamed from: g */
    public static C3883a<Integer> f15042g = C3883a.m26336a("analytics.max_stored_hits_per_app", 2000);

    /* renamed from: h */
    public static C3883a<Integer> f15043h = C3883a.m26336a("analytics.max_stored_properties_per_app", 100);

    /* renamed from: i */
    public static C3883a<Long> f15044i = C3883a.m26333a("analytics.local_dispatch_millis", 1800000L, 120000L);

    /* renamed from: j */
    public static C3883a<Long> f15045j = C3883a.m26333a("analytics.initial_local_dispatch_millis", 5000L, 5000L);

    /* renamed from: k */
    public static C3883a<Long> f15046k = C3883a.m26334a("analytics.min_local_dispatch_millis", 120000L);

    /* renamed from: l */
    public static C3883a<Long> f15047l = C3883a.m26334a("analytics.max_local_dispatch_millis", 7200000L);

    /* renamed from: m */
    public static C3883a<Long> f15048m = C3883a.m26334a("analytics.dispatch_alarm_millis", 7200000L);

    /* renamed from: n */
    public static C3883a<Long> f15049n = C3883a.m26334a("analytics.max_dispatch_alarm_millis", 32400000L);

    /* renamed from: o */
    public static C3883a<Integer> f15050o = C3883a.m26336a("analytics.max_hits_per_dispatch", 20);

    /* renamed from: p */
    public static C3883a<Integer> f15051p = C3883a.m26336a("analytics.max_hits_per_batch", 20);

    /* renamed from: q */
    public static C3883a<String> f15052q = C3883a.m26332a("analytics.insecure_host", "http://www.google-analytics.com");

    /* renamed from: r */
    public static C3883a<String> f15053r = C3883a.m26332a("analytics.secure_host", "https://ssl.google-analytics.com");

    /* renamed from: s */
    public static C3883a<String> f15054s = C3883a.m26332a("analytics.simple_endpoint", "/collect");

    /* renamed from: t */
    public static C3883a<String> f15055t = C3883a.m26332a("analytics.batching_endpoint", "/batch");

    /* renamed from: u */
    public static C3883a<Integer> f15056u = C3883a.m26336a("analytics.max_get_length", 2036);

    /* renamed from: v */
    public static C3883a<String> f15057v = C3883a.m26331a("analytics.batching_strategy.k", EnumC3866ac.BATCH_BY_COUNT.name(), EnumC3866ac.BATCH_BY_COUNT.name());

    /* renamed from: w */
    public static C3883a<String> f15058w = C3883a.m26332a("analytics.compression_strategy.k", EnumC3870ae.GZIP.name());

    /* renamed from: x */
    public static C3883a<Integer> f15059x = C3883a.m26336a("analytics.max_hits_per_request.k", 20);

    /* renamed from: y */
    public static C3883a<Integer> f15060y = C3883a.m26336a("analytics.max_hit_length.k", 8192);

    /* renamed from: z */
    public static C3883a<Integer> f15061z = C3883a.m26336a("analytics.max_post_length.k", 8192);

    /* renamed from: A */
    public static C3883a<Integer> f15019A = C3883a.m26336a("analytics.max_batch_post_length", 8192);

    /* renamed from: B */
    public static C3883a<String> f15020B = C3883a.m26332a("analytics.fallback_responses.k", "404,502");

    /* renamed from: C */
    public static C3883a<Integer> f15021C = C3883a.m26336a("analytics.batch_retry_interval.seconds.k", 3600);

    /* renamed from: D */
    public static C3883a<Long> f15022D = C3883a.m26334a("analytics.service_monitor_interval", 86400000L);

    /* renamed from: E */
    public static C3883a<Integer> f15023E = C3883a.m26336a("analytics.http_connection.connect_timeout_millis", 60000);

    /* renamed from: F */
    public static C3883a<Integer> f15024F = C3883a.m26336a("analytics.http_connection.read_timeout_millis", 61000);

    /* renamed from: G */
    public static C3883a<Long> f15025G = C3883a.m26334a("analytics.campaigns.time_limit", 86400000L);

    /* renamed from: H */
    public static C3883a<String> f15026H = C3883a.m26332a("analytics.first_party_experiment_id", "");

    /* renamed from: I */
    public static C3883a<Integer> f15027I = C3883a.m26336a("analytics.first_party_experiment_variant", 0);

    /* renamed from: J */
    public static C3883a<Boolean> f15028J = C3883a.m26330a("analytics.test.disable_receiver", false);

    /* renamed from: K */
    public static C3883a<Long> f15029K = C3883a.m26333a("analytics.service_client.idle_disconnect_millis", 10000L, 10000L);

    /* renamed from: L */
    public static C3883a<Long> f15030L = C3883a.m26334a("analytics.service_client.connect_timeout_millis", 5000L);

    /* renamed from: M */
    public static C3883a<Long> f15031M = C3883a.m26334a("analytics.service_client.second_connect_delay_millis", 5000L);

    /* renamed from: N */
    public static C3883a<Long> f15032N = C3883a.m26334a("analytics.service_client.unexpected_reconnect_millis", 60000L);

    /* renamed from: O */
    public static C3883a<Long> f15033O = C3883a.m26334a("analytics.service_client.reconnect_throttle_millis", 1800000L);

    /* renamed from: P */
    public static C3883a<Long> f15034P = C3883a.m26334a("analytics.monitoring.sample_period_millis", 86400000L);

    /* renamed from: Q */
    public static C3883a<Long> f15035Q = C3883a.m26334a("analytics.initialization_warning_threshold", 5000L);

    /* renamed from: com.google.android.gms.analytics.internal.ao$a */
    /* loaded from: classes2.dex */
    public static final class C3883a<V> {

        /* renamed from: a */
        private final V f15062a;

        /* renamed from: b */
        private final aiz<V> f15063b;

        private C3883a(aiz<V> aizVar, V v) {
            C4588d.m23627a(aizVar);
            this.f15063b = aizVar;
            this.f15062a = v;
        }

        /* renamed from: a */
        static C3883a<Float> m26338a(String str, float f) {
            return m26337a(str, f, f);
        }

        /* renamed from: a */
        static C3883a<Float> m26337a(String str, float f, float f2) {
            return new C3883a<>(aiz.m17160a(str, Float.valueOf(f2)), Float.valueOf(f));
        }

        /* renamed from: a */
        static C3883a<Integer> m26336a(String str, int i) {
            return m26335a(str, i, i);
        }

        /* renamed from: a */
        static C3883a<Integer> m26335a(String str, int i, int i2) {
            return new C3883a<>(aiz.m17159a(str, Integer.valueOf(i2)), Integer.valueOf(i));
        }

        /* renamed from: a */
        static C3883a<Long> m26334a(String str, long j) {
            return m26333a(str, j, j);
        }

        /* renamed from: a */
        static C3883a<Long> m26333a(String str, long j, long j2) {
            return new C3883a<>(aiz.m17158a(str, Long.valueOf(j2)), Long.valueOf(j));
        }

        /* renamed from: a */
        static C3883a<String> m26332a(String str, String str2) {
            return m26331a(str, str2, str2);
        }

        /* renamed from: a */
        static C3883a<String> m26331a(String str, String str2, String str3) {
            return new C3883a<>(aiz.m17157a(str, str3), str2);
        }

        /* renamed from: a */
        static C3883a<Boolean> m26330a(String str, boolean z) {
            return m26329a(str, z, z);
        }

        /* renamed from: a */
        static C3883a<Boolean> m26329a(String str, boolean z, boolean z2) {
            return new C3883a<>(aiz.m17156a(str, z2), Boolean.valueOf(z));
        }

        /* renamed from: a */
        public V m26339a() {
            return this.f15062a;
        }
    }
}
