package com.google.android.gms.internal;

import android.os.Bundle;
import android.os.Parcelable;
import android.os.SystemClock;
import com.google.android.gms.ads.internal.C3779u;
import com.google.android.gms.ads.internal.client.AdRequestParcel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
@aaa
/* loaded from: classes.dex */
public class abj {

    /* renamed from: a */
    private final abl f20928a;

    /* renamed from: b */
    private final LinkedList<C6130a> f20929b;

    /* renamed from: c */
    private final Object f20930c;

    /* renamed from: d */
    private final String f20931d;

    /* renamed from: e */
    private final String f20932e;

    /* renamed from: f */
    private long f20933f;

    /* renamed from: g */
    private long f20934g;

    /* renamed from: h */
    private boolean f20935h;

    /* renamed from: i */
    private long f20936i;

    /* renamed from: j */
    private long f20937j;

    /* renamed from: k */
    private long f20938k;

    /* renamed from: l */
    private long f20939l;

    /* JADX INFO: Access modifiers changed from: private */
    @aaa
    /* renamed from: com.google.android.gms.internal.abj$a */
    /* loaded from: classes.dex */
    public static final class C6130a {

        /* renamed from: a */
        private long f20940a = -1;

        /* renamed from: b */
        private long f20941b = -1;

        /* renamed from: a */
        public long m18475a() {
            return this.f20941b;
        }

        /* renamed from: b */
        public void m18474b() {
            this.f20941b = SystemClock.elapsedRealtime();
        }

        /* renamed from: c */
        public void m18473c() {
            this.f20940a = SystemClock.elapsedRealtime();
        }

        /* renamed from: d */
        public Bundle m18472d() {
            Bundle bundle = new Bundle();
            bundle.putLong("topen", this.f20940a);
            bundle.putLong("tclose", this.f20941b);
            return bundle;
        }
    }

    public abj(abl ablVar, String str, String str2) {
        this.f20930c = new Object();
        this.f20933f = -1L;
        this.f20934g = -1L;
        this.f20935h = false;
        this.f20936i = -1L;
        this.f20937j = 0L;
        this.f20938k = -1L;
        this.f20939l = -1L;
        this.f20928a = ablVar;
        this.f20931d = str;
        this.f20932e = str2;
        this.f20929b = new LinkedList<>();
    }

    public abj(String str, String str2) {
        this(C3779u.m26886i(), str, str2);
    }

    /* renamed from: a */
    public void m18484a() {
        synchronized (this.f20930c) {
            if (this.f20939l != -1 && this.f20934g == -1) {
                this.f20934g = SystemClock.elapsedRealtime();
                this.f20928a.m18456a(this);
            }
            this.f20928a.m18444d().m18421c();
        }
    }

    /* renamed from: a */
    public void m18483a(long j) {
        synchronized (this.f20930c) {
            this.f20939l = j;
            if (this.f20939l != -1) {
                this.f20928a.m18456a(this);
            }
        }
    }

    /* renamed from: a */
    public void m18482a(AdRequestParcel adRequestParcel) {
        synchronized (this.f20930c) {
            this.f20938k = SystemClock.elapsedRealtime();
            this.f20928a.m18444d().m18423a(adRequestParcel, this.f20938k);
        }
    }

    /* renamed from: a */
    public void m18481a(boolean z) {
        synchronized (this.f20930c) {
            if (this.f20939l != -1) {
                this.f20936i = SystemClock.elapsedRealtime();
                if (!z) {
                    this.f20934g = this.f20936i;
                    this.f20928a.m18456a(this);
                }
            }
        }
    }

    /* renamed from: b */
    public void m18480b() {
        synchronized (this.f20930c) {
            if (this.f20939l != -1) {
                C6130a c6130a = new C6130a();
                c6130a.m18473c();
                this.f20929b.add(c6130a);
                this.f20937j++;
                this.f20928a.m18444d().m18422b();
                this.f20928a.m18456a(this);
            }
        }
    }

    /* renamed from: b */
    public void m18479b(long j) {
        synchronized (this.f20930c) {
            if (this.f20939l != -1) {
                this.f20933f = j;
                this.f20928a.m18456a(this);
            }
        }
    }

    /* renamed from: b */
    public void m18478b(boolean z) {
        synchronized (this.f20930c) {
            if (this.f20939l != -1) {
                this.f20935h = z;
                this.f20928a.m18456a(this);
            }
        }
    }

    /* renamed from: c */
    public void m18477c() {
        synchronized (this.f20930c) {
            if (this.f20939l != -1 && !this.f20929b.isEmpty()) {
                C6130a last = this.f20929b.getLast();
                if (last.m18475a() == -1) {
                    last.m18474b();
                    this.f20928a.m18456a(this);
                }
            }
        }
    }

    /* renamed from: d */
    public Bundle m18476d() {
        Bundle bundle;
        synchronized (this.f20930c) {
            bundle = new Bundle();
            bundle.putString("seq_num", this.f20931d);
            bundle.putString("slotid", this.f20932e);
            bundle.putBoolean("ismediation", this.f20935h);
            bundle.putLong("treq", this.f20938k);
            bundle.putLong("tresponse", this.f20939l);
            bundle.putLong("timp", this.f20934g);
            bundle.putLong("tload", this.f20936i);
            bundle.putLong("pcc", this.f20937j);
            bundle.putLong("tfetch", this.f20933f);
            ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
            Iterator<C6130a> it2 = this.f20929b.iterator();
            while (it2.hasNext()) {
                arrayList.add(it2.next().m18472d());
            }
            bundle.putParcelableArrayList("tclick", arrayList);
        }
        return bundle;
    }
}
