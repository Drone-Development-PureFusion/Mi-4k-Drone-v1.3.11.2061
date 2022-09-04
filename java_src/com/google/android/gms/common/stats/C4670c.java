package com.google.android.gms.common.stats;

import com.google.android.gms.internal.aiz;
/* renamed from: com.google.android.gms.common.stats.c */
/* loaded from: classes2.dex */
public final class C4670c {

    /* renamed from: a */
    public static aiz<Integer> f17266a = aiz.m17159a("gms:common:stats:max_num_of_events", (Integer) 100);

    /* renamed from: b */
    public static aiz<Integer> f17267b = aiz.m17159a("gms:common:stats:max_chunk_size", (Integer) 100);

    /* renamed from: com.google.android.gms.common.stats.c$a */
    /* loaded from: classes2.dex */
    public static final class C4671a {

        /* renamed from: a */
        public static aiz<Integer> f17268a = aiz.m17159a("gms:common:stats:connections:level", Integer.valueOf(C4673d.f17277b));

        /* renamed from: b */
        public static aiz<String> f17269b = aiz.m17157a("gms:common:stats:connections:ignored_calling_processes", "");

        /* renamed from: c */
        public static aiz<String> f17270c = aiz.m17157a("gms:common:stats:connections:ignored_calling_services", "");

        /* renamed from: d */
        public static aiz<String> f17271d = aiz.m17157a("gms:common:stats:connections:ignored_target_processes", "");

        /* renamed from: e */
        public static aiz<String> f17272e = aiz.m17157a("gms:common:stats:connections:ignored_target_services", "com.google.android.gms.auth.GetToken");

        /* renamed from: f */
        public static aiz<Long> f17273f = aiz.m17158a("gms:common:stats:connections:time_out_duration", (Long) 600000L);
    }

    /* renamed from: com.google.android.gms.common.stats.c$b */
    /* loaded from: classes2.dex */
    public static final class C4672b {

        /* renamed from: a */
        public static aiz<Integer> f17274a = aiz.m17159a("gms:common:stats:wakeLocks:level", Integer.valueOf(C4673d.f17277b));

        /* renamed from: b */
        public static aiz<Long> f17275b = aiz.m17158a("gms:common:stats:wakelocks:time_out_duration", (Long) 600000L);
    }
}
