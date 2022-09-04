package com.google.android.gms.ads.internal;

import android.os.Handler;
import android.support.annotation.Nullable;
import com.google.android.gms.ads.internal.client.AdRequestParcel;
import com.google.android.gms.internal.aaa;
import com.google.android.gms.internal.abr;
import com.google.android.gms.internal.abv;
import java.lang.ref.WeakReference;
@aaa
/* renamed from: com.google.android.gms.ads.internal.r */
/* loaded from: classes.dex */
public class C3703r {

    /* renamed from: a */
    private final C3705a f14460a;

    /* renamed from: b */
    private final Runnable f14461b;
    @Nullable

    /* renamed from: c */
    private AdRequestParcel f14462c;

    /* renamed from: d */
    private boolean f14463d;

    /* renamed from: e */
    private boolean f14464e;

    /* renamed from: f */
    private long f14465f;

    /* renamed from: com.google.android.gms.ads.internal.r$a */
    /* loaded from: classes2.dex */
    public static class C3705a {

        /* renamed from: a */
        private final Handler f14468a;

        public C3705a(Handler handler) {
            this.f14468a = handler;
        }

        /* renamed from: a */
        public void m27041a(Runnable runnable) {
            this.f14468a.removeCallbacks(runnable);
        }

        /* renamed from: a */
        public boolean m27040a(Runnable runnable, long j) {
            return this.f14468a.postDelayed(runnable, j);
        }
    }

    public C3703r(AbstractBinderC3476a abstractBinderC3476a) {
        this(abstractBinderC3476a, new C3705a(abv.f21039a));
    }

    C3703r(AbstractBinderC3476a abstractBinderC3476a, C3705a c3705a) {
        this.f14463d = false;
        this.f14464e = false;
        this.f14465f = 0L;
        this.f14460a = c3705a;
        final WeakReference weakReference = new WeakReference(abstractBinderC3476a);
        this.f14461b = new Runnable() { // from class: com.google.android.gms.ads.internal.r.1
            @Override // java.lang.Runnable
            public void run() {
                C3703r.this.f14463d = false;
                AbstractBinderC3476a abstractBinderC3476a2 = (AbstractBinderC3476a) weakReference.get();
                if (abstractBinderC3476a2 != null) {
                    abstractBinderC3476a2.m27684c(C3703r.this.f14462c);
                }
            }
        };
    }

    /* renamed from: a */
    public void m27050a() {
        this.f14463d = false;
        this.f14460a.m27041a(this.f14461b);
    }

    /* renamed from: a */
    public void m27049a(AdRequestParcel adRequestParcel) {
        this.f14462c = adRequestParcel;
    }

    /* renamed from: a */
    public void m27048a(AdRequestParcel adRequestParcel, long j) {
        if (this.f14463d) {
            abr.d("An ad refresh is already scheduled.");
            return;
        }
        this.f14462c = adRequestParcel;
        this.f14463d = true;
        this.f14465f = j;
        if (this.f14464e) {
            return;
        }
        abr.c(new StringBuilder(65).append("Scheduling ad refresh ").append(j).append(" milliseconds from now.").toString());
        this.f14460a.m27040a(this.f14461b, j);
    }

    /* renamed from: b */
    public void m27045b() {
        this.f14464e = true;
        if (this.f14463d) {
            this.f14460a.m27041a(this.f14461b);
        }
    }

    /* renamed from: b */
    public void m27044b(AdRequestParcel adRequestParcel) {
        m27048a(adRequestParcel, 60000L);
    }

    /* renamed from: c */
    public void m27043c() {
        this.f14464e = false;
        if (this.f14463d) {
            this.f14463d = false;
            m27048a(this.f14462c, this.f14465f);
        }
    }

    /* renamed from: d */
    public boolean m27042d() {
        return this.f14463d;
    }
}
