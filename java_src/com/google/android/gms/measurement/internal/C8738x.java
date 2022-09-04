package com.google.android.gms.measurement.internal;

import com.facebook.common.util.UriUtil;
import com.google.android.gms.common.internal.C4588d;
import com.google.android.gms.internal.aiz;
import com.tencent.p263mm.sdk.platformtools.Util;
/* renamed from: com.google.android.gms.measurement.internal.x */
/* loaded from: classes2.dex */
public final class C8738x {

    /* renamed from: a */
    public static C8739a<Boolean> f27954a = C8739a.m10330a("measurement.service_enabled", true);

    /* renamed from: b */
    public static C8739a<Boolean> f27955b = C8739a.m10330a("measurement.service_client_enabled", true);

    /* renamed from: c */
    public static C8739a<String> f27956c = C8739a.m10331a("measurement.log_tag", "FA", "FA-SVC");

    /* renamed from: d */
    public static C8739a<Long> f27957d = C8739a.m10334a("measurement.ad_id_cache_time", 10000L);

    /* renamed from: e */
    public static C8739a<Long> f27958e = C8739a.m10334a("measurement.monitoring.sample_period_millis", 86400000L);

    /* renamed from: f */
    public static C8739a<Long> f27959f = C8739a.m10333a("measurement.config.cache_time", 86400000, (long) Util.MILLSECONDS_OF_HOUR);

    /* renamed from: g */
    public static C8739a<String> f27960g = C8739a.m10332a("measurement.config.url_scheme", UriUtil.HTTPS_SCHEME);

    /* renamed from: h */
    public static C8739a<String> f27961h = C8739a.m10332a("measurement.config.url_authority", "app-measurement.com");

    /* renamed from: i */
    public static C8739a<Integer> f27962i = C8739a.m10336a("measurement.upload.max_bundles", 100);

    /* renamed from: j */
    public static C8739a<Integer> f27963j = C8739a.m10336a("measurement.upload.max_batch_size", 65536);

    /* renamed from: k */
    public static C8739a<Integer> f27964k = C8739a.m10336a("measurement.upload.max_bundle_size", 65536);

    /* renamed from: l */
    public static C8739a<Integer> f27965l = C8739a.m10336a("measurement.upload.max_events_per_bundle", 1000);

    /* renamed from: m */
    public static C8739a<Integer> f27966m = C8739a.m10336a("measurement.upload.max_events_per_day", 100000);

    /* renamed from: n */
    public static C8739a<Integer> f27967n = C8739a.m10336a("measurement.upload.max_error_events_per_day", 1000);

    /* renamed from: o */
    public static C8739a<Integer> f27968o = C8739a.m10336a("measurement.upload.max_public_events_per_day", 50000);

    /* renamed from: p */
    public static C8739a<Integer> f27969p = C8739a.m10336a("measurement.upload.max_conversions_per_day", 500);

    /* renamed from: q */
    public static C8739a<Integer> f27970q = C8739a.m10336a("measurement.upload.max_realtime_events_per_day", 10);

    /* renamed from: r */
    public static C8739a<Integer> f27971r = C8739a.m10336a("measurement.store.max_stored_events_per_app", 100000);

    /* renamed from: s */
    public static C8739a<String> f27972s = C8739a.m10332a("measurement.upload.url", "https://app-measurement.com/a");

    /* renamed from: t */
    public static C8739a<Long> f27973t = C8739a.m10334a("measurement.upload.backoff_period", 43200000L);

    /* renamed from: u */
    public static C8739a<Long> f27974u = C8739a.m10334a("measurement.upload.window_interval", (long) Util.MILLSECONDS_OF_HOUR);

    /* renamed from: v */
    public static C8739a<Long> f27975v = C8739a.m10334a("measurement.upload.interval", (long) Util.MILLSECONDS_OF_HOUR);

    /* renamed from: w */
    public static C8739a<Long> f27976w = C8739a.m10334a("measurement.upload.realtime_upload_interval", 10000L);

    /* renamed from: x */
    public static C8739a<Long> f27977x = C8739a.m10334a("measurement.upload.minimum_delay", 500L);

    /* renamed from: y */
    public static C8739a<Long> f27978y = C8739a.m10334a("measurement.alarm_manager.minimum_interval", 60000L);

    /* renamed from: z */
    public static C8739a<Long> f27979z = C8739a.m10334a("measurement.upload.stale_data_deletion_interval", 86400000L);

    /* renamed from: A */
    public static C8739a<Long> f27947A = C8739a.m10334a("measurement.upload.initial_upload_delay_time", 15000L);

    /* renamed from: B */
    public static C8739a<Long> f27948B = C8739a.m10334a("measurement.upload.retry_time", 1800000L);

    /* renamed from: C */
    public static C8739a<Integer> f27949C = C8739a.m10336a("measurement.upload.retry_count", 6);

    /* renamed from: D */
    public static C8739a<Long> f27950D = C8739a.m10334a("measurement.upload.max_queue_time", 2419200000L);

    /* renamed from: E */
    public static C8739a<Integer> f27951E = C8739a.m10336a("measurement.lifetimevalue.max_currency_tracked", 4);

    /* renamed from: F */
    public static C8739a<Integer> f27952F = C8739a.m10336a("measurement.audience.filter_result_max_count", 200);

    /* renamed from: G */
    public static C8739a<Long> f27953G = C8739a.m10334a("measurement.service_client.idle_disconnect_millis", 5000L);

    /* renamed from: com.google.android.gms.measurement.internal.x$a */
    /* loaded from: classes2.dex */
    public static final class C8739a<V> {

        /* renamed from: a */
        private final V f27980a;

        /* renamed from: b */
        private final aiz<V> f27981b;

        /* renamed from: c */
        private final String f27982c;

        private C8739a(String str, aiz<V> aizVar, V v) {
            C4588d.m23627a(aizVar);
            this.f27981b = aizVar;
            this.f27980a = v;
            this.f27982c = str;
        }

        /* renamed from: a */
        static C8739a<Integer> m10336a(String str, int i) {
            return m10335a(str, i, i);
        }

        /* renamed from: a */
        static C8739a<Integer> m10335a(String str, int i, int i2) {
            return new C8739a<>(str, aiz.m17159a(str, Integer.valueOf(i2)), Integer.valueOf(i));
        }

        /* renamed from: a */
        static C8739a<Long> m10334a(String str, long j) {
            return m10333a(str, j, j);
        }

        /* renamed from: a */
        static C8739a<Long> m10333a(String str, long j, long j2) {
            return new C8739a<>(str, aiz.m17158a(str, Long.valueOf(j2)), Long.valueOf(j));
        }

        /* renamed from: a */
        static C8739a<String> m10332a(String str, String str2) {
            return m10331a(str, str2, str2);
        }

        /* renamed from: a */
        static C8739a<String> m10331a(String str, String str2, String str3) {
            return new C8739a<>(str, aiz.m17157a(str, str3), str2);
        }

        /* renamed from: a */
        static C8739a<Boolean> m10330a(String str, boolean z) {
            return m10329a(str, z, z);
        }

        /* renamed from: a */
        static C8739a<Boolean> m10329a(String str, boolean z, boolean z2) {
            return new C8739a<>(str, aiz.m17156a(str, z2), Boolean.valueOf(z));
        }

        /* renamed from: a */
        public V m10337a(V v) {
            return v != null ? v : this.f27980a;
        }

        /* renamed from: a */
        public String m10338a() {
            return this.f27982c;
        }

        /* renamed from: b */
        public V m10328b() {
            return this.f27980a;
        }
    }
}
