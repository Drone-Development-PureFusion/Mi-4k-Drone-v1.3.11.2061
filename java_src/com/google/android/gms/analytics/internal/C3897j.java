package com.google.android.gms.analytics.internal;

import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.common.internal.C4588d;
import java.util.UUID;
/* renamed from: com.google.android.gms.analytics.internal.j */
/* loaded from: classes2.dex */
public class C3897j extends AbstractC3920t {

    /* renamed from: a */
    private SharedPreferences f15100a;

    /* renamed from: b */
    private long f15101b;

    /* renamed from: c */
    private long f15102c = -1;

    /* renamed from: d */
    private final C3899a f15103d = new C3899a("monitoring", q().m26384G());

    /* renamed from: com.google.android.gms.analytics.internal.j$a */
    /* loaded from: classes2.dex */
    public final class C3899a {

        /* renamed from: b */
        private final String f15105b;

        /* renamed from: c */
        private final long f15106c;

        private C3899a(String str, long j) {
            C4588d.m23625a(str);
            C4588d.m23619b(j > 0);
            this.f15105b = str;
            this.f15106c = j;
        }

        /* renamed from: c */
        private void m26240c() {
            long mo16434a = C3897j.this.n().mo16434a();
            SharedPreferences.Editor edit = C3897j.this.f15100a.edit();
            edit.remove(m26236g());
            edit.remove(m26241b());
            edit.putLong(m26237f(), mo16434a);
            edit.commit();
        }

        /* renamed from: d */
        private long m26239d() {
            long m26238e = m26238e();
            if (m26238e == 0) {
                return 0L;
            }
            return Math.abs(m26238e - C3897j.this.n().mo16434a());
        }

        /* renamed from: e */
        private long m26238e() {
            return C3897j.this.f15100a.getLong(m26237f(), 0L);
        }

        /* renamed from: f */
        private String m26237f() {
            return String.valueOf(this.f15105b).concat(":start");
        }

        /* renamed from: g */
        private String m26236g() {
            return String.valueOf(this.f15105b).concat(":count");
        }

        /* renamed from: a */
        public Pair<String, Long> m26243a() {
            long m26239d = m26239d();
            if (m26239d < this.f15106c) {
                return null;
            }
            if (m26239d > this.f15106c * 2) {
                m26240c();
                return null;
            }
            String string = C3897j.this.f15100a.getString(m26241b(), null);
            long j = C3897j.this.f15100a.getLong(m26236g(), 0L);
            m26240c();
            if (string != null && j > 0) {
                return new Pair<>(string, Long.valueOf(j));
            }
            return null;
        }

        /* renamed from: a */
        public void m26242a(String str) {
            if (m26238e() == 0) {
                m26240c();
            }
            if (str == null) {
                str = "";
            }
            synchronized (this) {
                long j = C3897j.this.f15100a.getLong(m26236g(), 0L);
                if (j <= 0) {
                    SharedPreferences.Editor edit = C3897j.this.f15100a.edit();
                    edit.putString(m26241b(), str);
                    edit.putLong(m26236g(), 1L);
                    edit.apply();
                    return;
                }
                boolean z = (UUID.randomUUID().getLeastSignificantBits() & Long.MAX_VALUE) < Long.MAX_VALUE / (j + 1);
                SharedPreferences.Editor edit2 = C3897j.this.f15100a.edit();
                if (z) {
                    edit2.putString(m26241b(), str);
                }
                edit2.putLong(m26236g(), j + 1);
                edit2.apply();
            }
        }

        /* renamed from: b */
        protected String m26241b() {
            return String.valueOf(this.f15105b).concat(":value");
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public C3897j(C3922v c3922v) {
        super(c3922v);
    }

    @Override // com.google.android.gms.analytics.internal.AbstractC3920t
    /* renamed from: a */
    protected void mo26047a() {
        this.f15100a = o().getSharedPreferences("com.google.android.gms.analytics.prefs", 0);
    }

    /* renamed from: a */
    public void m26250a(String str) {
        m();
        D();
        SharedPreferences.Editor edit = this.f15100a.edit();
        if (TextUtils.isEmpty(str)) {
            edit.remove("installation_campaign");
        } else {
            edit.putString("installation_campaign", str);
        }
        if (!edit.commit()) {
            t("Failed to commit campaign data");
        }
    }

    /* renamed from: b */
    public long m26249b() {
        m();
        D();
        if (this.f15101b == 0) {
            long j = this.f15100a.getLong("first_run", 0L);
            if (j != 0) {
                this.f15101b = j;
            } else {
                long mo16434a = n().mo16434a();
                SharedPreferences.Editor edit = this.f15100a.edit();
                edit.putLong("first_run", mo16434a);
                if (!edit.commit()) {
                    t("Failed to commit first run time");
                }
                this.f15101b = mo16434a;
            }
        }
        return this.f15101b;
    }

    /* renamed from: c */
    public C3905m m26248c() {
        return new C3905m(n(), m26249b());
    }

    /* renamed from: d */
    public long m26247d() {
        m();
        D();
        if (this.f15102c == -1) {
            this.f15102c = this.f15100a.getLong("last_dispatch", 0L);
        }
        return this.f15102c;
    }

    /* renamed from: e */
    public void m26246e() {
        m();
        D();
        long mo16434a = n().mo16434a();
        SharedPreferences.Editor edit = this.f15100a.edit();
        edit.putLong("last_dispatch", mo16434a);
        edit.apply();
        this.f15102c = mo16434a;
    }

    /* renamed from: f */
    public String m26245f() {
        m();
        D();
        String string = this.f15100a.getString("installation_campaign", null);
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        return string;
    }

    /* renamed from: g */
    public C3899a m26244g() {
        return this.f15103d;
    }
}
