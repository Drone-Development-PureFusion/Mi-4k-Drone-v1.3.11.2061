package com.google.android.gms.internal;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;
/* loaded from: classes2.dex */
public class ake {

    /* renamed from: a */
    private static final List<TimeUnit> f22122a = Arrays.asList(TimeUnit.NANOSECONDS, TimeUnit.MICROSECONDS, TimeUnit.MILLISECONDS, TimeUnit.SECONDS, TimeUnit.MINUTES, TimeUnit.HOURS, TimeUnit.DAYS);

    /* renamed from: a */
    public static long m17051a(long j, TimeUnit timeUnit, TimeUnit timeUnit2) {
        return timeUnit.convert(timeUnit2.convert(j, timeUnit), timeUnit2);
    }

    /* renamed from: a */
    public static boolean m17050a(TimeUnit timeUnit) {
        return m17049a(timeUnit, TimeUnit.MILLISECONDS);
    }

    /* renamed from: a */
    private static boolean m17049a(TimeUnit timeUnit, TimeUnit timeUnit2) {
        return f22122a.indexOf(timeUnit) < f22122a.indexOf(timeUnit2);
    }
}
