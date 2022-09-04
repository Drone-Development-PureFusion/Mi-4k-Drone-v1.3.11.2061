package com.google.android.gms.games.p240a;

import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.C4585c;
import com.google.android.gms.common.internal.C4588d;
import com.google.android.gms.games.internal.p242b.C5665x;
import java.util.HashMap;
/* renamed from: com.google.android.gms.games.a.n */
/* loaded from: classes2.dex */
public final class C5331n {

    /* renamed from: a */
    private static final String[] f19314a = {"leaderboardId", "playerId", "timeSpan", "hasResult", "rawScore", "formattedScore", "newBest", "scoreTag"};

    /* renamed from: b */
    private String f19315b;

    /* renamed from: c */
    private String f19316c;

    /* renamed from: d */
    private int f19317d;

    /* renamed from: e */
    private HashMap<Integer, C5332a> f19318e = new HashMap<>();

    /* renamed from: com.google.android.gms.games.a.n$a */
    /* loaded from: classes2.dex */
    public static final class C5332a {

        /* renamed from: a */
        public final long f19319a;

        /* renamed from: b */
        public final String f19320b;

        /* renamed from: c */
        public final String f19321c;

        /* renamed from: d */
        public final boolean f19322d;

        public C5332a(long j, String str, String str2, boolean z) {
            this.f19319a = j;
            this.f19320b = str;
            this.f19321c = str2;
            this.f19322d = z;
        }

        public String toString() {
            return C4585c.m23635a(this).m23632a("RawScore", Long.valueOf(this.f19319a)).m23632a("FormattedScore", this.f19320b).m23632a("ScoreTag", this.f19321c).m23632a("NewBest", Boolean.valueOf(this.f19322d)).toString();
        }
    }

    public C5331n(DataHolder dataHolder) {
        this.f19317d = dataHolder.m23883e();
        int m23879g = dataHolder.m23879g();
        C4588d.m23619b(m23879g == 3);
        for (int i = 0; i < m23879g; i++) {
            int m23898a = dataHolder.m23898a(i);
            if (i == 0) {
                this.f19315b = dataHolder.m23886c("leaderboardId", i, m23898a);
                this.f19316c = dataHolder.m23886c("playerId", i, m23898a);
            }
            if (dataHolder.m23884d("hasResult", i, m23898a)) {
                m20657a(new C5332a(dataHolder.m23893a("rawScore", i, m23898a), dataHolder.m23886c("formattedScore", i, m23898a), dataHolder.m23886c("scoreTag", i, m23898a), dataHolder.m23884d("newBest", i, m23898a)), dataHolder.m23888b("timeSpan", i, m23898a));
            }
        }
    }

    /* renamed from: a */
    private void m20657a(C5332a c5332a, int i) {
        this.f19318e.put(Integer.valueOf(i), c5332a);
    }

    /* renamed from: a */
    public C5332a m20658a(int i) {
        return this.f19318e.get(Integer.valueOf(i));
    }

    /* renamed from: a */
    public String m20659a() {
        return this.f19315b;
    }

    /* renamed from: b */
    public String m20656b() {
        return this.f19316c;
    }

    public String toString() {
        C4585c.C4587a m23632a = C4585c.m23635a(this).m23632a("PlayerId", this.f19316c).m23632a("StatusCode", Integer.valueOf(this.f19317d));
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 < 3) {
                C5332a c5332a = this.f19318e.get(Integer.valueOf(i2));
                m23632a.m23632a("TimesSpan", C5665x.m20224a(i2));
                m23632a.m23632a("Result", c5332a == null ? "null" : c5332a.toString());
                i = i2 + 1;
            } else {
                return m23632a.toString();
            }
        }
    }
}
