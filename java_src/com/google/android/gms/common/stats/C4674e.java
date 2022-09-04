package com.google.android.gms.common.stats;

import android.os.SystemClock;
import android.support.p001v4.util.SimpleArrayMap;
import android.util.Log;
/* renamed from: com.google.android.gms.common.stats.e */
/* loaded from: classes2.dex */
public class C4674e {

    /* renamed from: a */
    private final long f17285a;

    /* renamed from: b */
    private final int f17286b;

    /* renamed from: c */
    private final SimpleArrayMap<String, Long> f17287c;

    public C4674e() {
        this.f17285a = 60000L;
        this.f17286b = 10;
        this.f17287c = new SimpleArrayMap<>(10);
    }

    public C4674e(int i, long j) {
        this.f17285a = j;
        this.f17286b = i;
        this.f17287c = new SimpleArrayMap<>();
    }

    /* renamed from: a */
    private void m23188a(long j, long j2) {
        for (int size = this.f17287c.size() - 1; size >= 0; size--) {
            if (j2 - this.f17287c.valueAt(size).longValue() > j) {
                this.f17287c.removeAt(size);
            }
        }
    }

    /* renamed from: a */
    public Long m23187a(String str) {
        Long put;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j = this.f17285a;
        synchronized (this) {
            while (this.f17287c.size() >= this.f17286b) {
                m23188a(j, elapsedRealtime);
                j /= 2;
                Log.w("ConnectionTracker", new StringBuilder(94).append("The max capacity ").append(this.f17286b).append(" is not enough. Current durationThreshold is: ").append(j).toString());
            }
            put = this.f17287c.put(str, Long.valueOf(elapsedRealtime));
        }
        return put;
    }

    /* renamed from: b */
    public boolean m23186b(String str) {
        boolean z;
        synchronized (this) {
            z = this.f17287c.remove(str) != null;
        }
        return z;
    }
}
