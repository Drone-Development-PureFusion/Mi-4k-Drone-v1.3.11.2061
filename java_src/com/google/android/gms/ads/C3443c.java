package com.google.android.gms.ads;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.internal.client.C3559e;
import com.google.android.gms.ads.mediation.AbstractC3792b;
import com.google.android.gms.ads.mediation.AbstractC3816m;
import com.google.android.gms.ads.mediation.customevent.AbstractC3798a;
import com.google.android.gms.common.internal.C4588d;
import java.util.Date;
import java.util.Set;
/* renamed from: com.google.android.gms.ads.c */
/* loaded from: classes.dex */
public final class C3443c {

    /* renamed from: a */
    public static final int f13724a = 0;

    /* renamed from: b */
    public static final int f13725b = 1;

    /* renamed from: c */
    public static final int f13726c = 2;

    /* renamed from: d */
    public static final int f13727d = 3;

    /* renamed from: e */
    public static final int f13728e = 0;

    /* renamed from: f */
    public static final int f13729f = 1;

    /* renamed from: g */
    public static final int f13730g = 2;

    /* renamed from: h */
    public static final int f13731h = 512;

    /* renamed from: i */
    public static final String f13732i = C3559e.f13956a;

    /* renamed from: j */
    private final C3559e f13733j;

    /* renamed from: com.google.android.gms.ads.c$a */
    /* loaded from: classes2.dex */
    public static final class C3445a {

        /* renamed from: a */
        private final C3559e.C3560a f13734a = new C3559e.C3560a();

        public C3445a() {
            this.f13734a.m27529b(C3443c.f13732i);
        }

        /* renamed from: a */
        public C3445a m27830a(int i) {
            this.f13734a.m27540a(i);
            return this;
        }

        /* renamed from: a */
        public C3445a m27829a(Location location) {
            this.f13734a.m27539a(location);
            return this;
        }

        /* renamed from: a */
        public C3445a m27827a(AbstractC3816m abstractC3816m) {
            this.f13734a.m27537a(abstractC3816m);
            return this;
        }

        /* renamed from: a */
        public C3445a m27826a(Class<? extends AbstractC3792b> cls, Bundle bundle) {
            this.f13734a.m27536a(cls, bundle);
            if (cls.equals(AdMobAdapter.class) && bundle.getBoolean("_emulatorLiveAds")) {
                this.f13734a.m27526c(C3443c.f13732i);
            }
            return this;
        }

        /* renamed from: a */
        public C3445a m27825a(String str) {
            this.f13734a.m27535a(str);
            return this;
        }

        /* renamed from: a */
        public C3445a m27824a(Date date) {
            this.f13734a.m27533a(date);
            return this;
        }

        /* renamed from: a */
        public C3445a m27823a(boolean z) {
            this.f13734a.m27528b(z);
            return this;
        }

        /* renamed from: a */
        public C3443c m27831a() {
            return new C3443c(this);
        }

        /* renamed from: b */
        public C3445a m27822b(Class<? extends AbstractC3798a> cls, Bundle bundle) {
            this.f13734a.m27530b(cls, bundle);
            return this;
        }

        /* renamed from: b */
        public C3445a m27821b(String str) {
            this.f13734a.m27529b(str);
            return this;
        }

        /* renamed from: b */
        public C3445a m27820b(boolean z) {
            this.f13734a.m27525c(z);
            return this;
        }

        /* renamed from: c */
        public C3445a m27819c(String str) {
            C4588d.m23626a(str, (Object) "Content URL must be non-null.");
            C4588d.m23624a(str, (Object) "Content URL must be non-empty.");
            C4588d.m23617b(str.length() <= 512, "Content URL must not exceed %d in length.  Provided length was %d.", 512, Integer.valueOf(str.length()));
            this.f13734a.m27523d(str);
            return this;
        }

        /* renamed from: d */
        public C3445a m27818d(String str) {
            this.f13734a.m27519f(str);
            return this;
        }
    }

    private C3443c(C3445a c3445a) {
        this.f13733j = new C3559e(c3445a.f13734a);
    }

    @Deprecated
    /* renamed from: a */
    public <T extends AbstractC3816m> T m27839a(Class<T> cls) {
        return (T) this.f13733j.m27557a(cls);
    }

    /* renamed from: a */
    public Date m27841a() {
        return this.f13733j.m27559a();
    }

    /* renamed from: a */
    public boolean m27840a(Context context) {
        return this.f13733j.m27558a(context);
    }

    /* renamed from: b */
    public <T extends AbstractC3792b> Bundle m27837b(Class<T> cls) {
        return this.f13733j.m27555b(cls);
    }

    /* renamed from: b */
    public String m27838b() {
        return this.f13733j.m27556b();
    }

    /* renamed from: c */
    public int m27836c() {
        return this.f13733j.m27554c();
    }

    /* renamed from: c */
    public <T extends AbstractC3798a> Bundle m27835c(Class<T> cls) {
        return this.f13733j.m27553c(cls);
    }

    /* renamed from: d */
    public Set<String> m27834d() {
        return this.f13733j.m27552d();
    }

    /* renamed from: e */
    public Location m27833e() {
        return this.f13733j.m27551e();
    }

    /* renamed from: f */
    public C3559e m27832f() {
        return this.f13733j;
    }
}
