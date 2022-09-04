package com.google.android.gms.ads.doubleclick;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import com.google.android.gms.ads.internal.client.C3559e;
import com.google.android.gms.ads.mediation.AbstractC3792b;
import com.google.android.gms.ads.mediation.AbstractC3816m;
import com.google.android.gms.ads.mediation.customevent.AbstractC3798a;
import com.google.android.gms.common.internal.C4583ak;
import com.google.android.gms.common.internal.C4588d;
import com.xiaomi.mipush.sdk.Constants;
import java.util.Date;
import java.util.List;
import java.util.Set;
/* renamed from: com.google.android.gms.ads.doubleclick.d */
/* loaded from: classes.dex */
public final class C3450d {

    /* renamed from: a */
    public static final int f13750a = 0;

    /* renamed from: b */
    public static final int f13751b = 1;

    /* renamed from: c */
    public static final int f13752c = 2;

    /* renamed from: d */
    public static final int f13753d = 3;

    /* renamed from: e */
    public static final int f13754e = 0;

    /* renamed from: f */
    public static final int f13755f = 1;

    /* renamed from: g */
    public static final int f13756g = 2;

    /* renamed from: h */
    public static final String f13757h = C3559e.f13956a;

    /* renamed from: i */
    private final C3559e f13758i;

    /* renamed from: com.google.android.gms.ads.doubleclick.d$a */
    /* loaded from: classes.dex */
    public static final class C3452a {

        /* renamed from: a */
        private final C3559e.C3560a f13759a = new C3559e.C3560a();

        /* renamed from: a */
        public C3452a m27787a(int i) {
            this.f13759a.m27540a(i);
            return this;
        }

        /* renamed from: a */
        public C3452a m27786a(Location location) {
            this.f13759a.m27539a(location);
            return this;
        }

        /* renamed from: a */
        public C3452a m27784a(AbstractC3816m abstractC3816m) {
            this.f13759a.m27537a(abstractC3816m);
            return this;
        }

        /* renamed from: a */
        public C3452a m27783a(Class<? extends AbstractC3792b> cls, Bundle bundle) {
            this.f13759a.m27536a(cls, bundle);
            return this;
        }

        /* renamed from: a */
        public C3452a m27782a(String str) {
            this.f13759a.m27535a(str);
            return this;
        }

        /* renamed from: a */
        public C3452a m27781a(String str, String str2) {
            this.f13759a.m27534a(str, str2);
            return this;
        }

        /* renamed from: a */
        public C3452a m27780a(String str, List<String> list) {
            if (list != null) {
                this.f13759a.m27534a(str, C4583ak.m23640a(Constants.ACCEPT_TIME_SEPARATOR_SP).m23642a((Iterable<?>) list));
            }
            return this;
        }

        /* renamed from: a */
        public C3452a m27779a(Date date) {
            this.f13759a.m27533a(date);
            return this;
        }

        @Deprecated
        /* renamed from: a */
        public C3452a m27778a(boolean z) {
            this.f13759a.m27532a(z);
            return this;
        }

        /* renamed from: a */
        public C3450d m27788a() {
            return new C3450d(this);
        }

        /* renamed from: b */
        public C3452a m27777b(Class<? extends AbstractC3798a> cls, Bundle bundle) {
            this.f13759a.m27530b(cls, bundle);
            return this;
        }

        /* renamed from: b */
        public C3452a m27776b(String str) {
            this.f13759a.m27529b(str);
            return this;
        }

        /* renamed from: b */
        public C3452a m27775b(boolean z) {
            this.f13759a.m27528b(z);
            return this;
        }

        /* renamed from: c */
        public C3452a m27774c(String str) {
            C4588d.m23626a(str, (Object) "Content URL must be non-null.");
            C4588d.m23624a(str, (Object) "Content URL must be non-empty.");
            C4588d.m23617b(str.length() <= 512, "Content URL must not exceed %d in length.  Provided length was %d.", 512, Integer.valueOf(str.length()));
            this.f13759a.m27523d(str);
            return this;
        }

        /* renamed from: c */
        public C3452a m27773c(boolean z) {
            this.f13759a.m27525c(z);
            return this;
        }

        /* renamed from: d */
        public C3452a m27772d(String str) {
            this.f13759a.m27521e(str);
            return this;
        }

        /* renamed from: e */
        public C3452a m27771e(String str) {
            this.f13759a.m27519f(str);
            return this;
        }

        /* renamed from: f */
        public C3452a m27770f(String str) {
            this.f13759a.m27517g(str);
            return this;
        }
    }

    private C3450d(C3452a c3452a) {
        this.f13758i = new C3559e(c3452a.f13759a);
    }

    /* renamed from: i */
    public static void m27790i() {
    }

    @Deprecated
    /* renamed from: a */
    public <T extends AbstractC3816m> T m27800a(Class<T> cls) {
        return (T) this.f13758i.m27557a(cls);
    }

    /* renamed from: a */
    public Date m27802a() {
        return this.f13758i.m27559a();
    }

    /* renamed from: a */
    public boolean m27801a(Context context) {
        return this.f13758i.m27558a(context);
    }

    /* renamed from: b */
    public <T extends AbstractC3792b> Bundle m27798b(Class<T> cls) {
        return this.f13758i.m27555b(cls);
    }

    /* renamed from: b */
    public String m27799b() {
        return this.f13758i.m27556b();
    }

    /* renamed from: c */
    public int m27797c() {
        return this.f13758i.m27554c();
    }

    /* renamed from: c */
    public <T extends AbstractC3798a> Bundle m27796c(Class<T> cls) {
        return this.f13758i.m27553c(cls);
    }

    /* renamed from: d */
    public Set<String> m27795d() {
        return this.f13758i.m27552d();
    }

    /* renamed from: e */
    public Location m27794e() {
        return this.f13758i.m27551e();
    }

    /* renamed from: f */
    public boolean m27793f() {
        return this.f13758i.m27550f();
    }

    /* renamed from: g */
    public String m27792g() {
        return this.f13758i.m27549g();
    }

    /* renamed from: h */
    public Bundle m27791h() {
        return this.f13758i.m27543m();
    }

    /* renamed from: j */
    public C3559e m27789j() {
        return this.f13758i;
    }
}
