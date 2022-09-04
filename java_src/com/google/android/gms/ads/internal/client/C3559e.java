package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.mediation.AbstractC3792b;
import com.google.android.gms.ads.mediation.AbstractC3816m;
import com.google.android.gms.ads.mediation.customevent.AbstractC3798a;
import com.google.android.gms.ads.mediation.p228a.C3791a;
import com.google.android.gms.ads.search.C3825b;
import com.google.android.gms.internal.aaa;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
@aaa
/* renamed from: com.google.android.gms.ads.internal.client.e */
/* loaded from: classes.dex */
public final class C3559e {

    /* renamed from: a */
    public static final String f13956a = C3514ac.m27586a().m26858a("emulator");

    /* renamed from: b */
    private final Date f13957b;

    /* renamed from: c */
    private final String f13958c;

    /* renamed from: d */
    private final int f13959d;

    /* renamed from: e */
    private final Set<String> f13960e;

    /* renamed from: f */
    private final Location f13961f;

    /* renamed from: g */
    private final boolean f13962g;

    /* renamed from: h */
    private final Bundle f13963h;

    /* renamed from: i */
    private final Map<Class<? extends AbstractC3816m>, AbstractC3816m> f13964i;

    /* renamed from: j */
    private final String f13965j;

    /* renamed from: k */
    private final String f13966k;

    /* renamed from: l */
    private final C3825b f13967l;

    /* renamed from: m */
    private final int f13968m;

    /* renamed from: n */
    private final Set<String> f13969n;

    /* renamed from: o */
    private final Bundle f13970o;

    /* renamed from: p */
    private final Set<String> f13971p;

    /* renamed from: q */
    private final boolean f13972q;

    /* renamed from: com.google.android.gms.ads.internal.client.e$a */
    /* loaded from: classes.dex */
    public static final class C3560a {

        /* renamed from: g */
        private Date f13979g;

        /* renamed from: h */
        private String f13980h;

        /* renamed from: j */
        private Location f13982j;

        /* renamed from: l */
        private String f13984l;

        /* renamed from: m */
        private String f13985m;

        /* renamed from: o */
        private boolean f13987o;

        /* renamed from: a */
        private final HashSet<String> f13973a = new HashSet<>();

        /* renamed from: b */
        private final Bundle f13974b = new Bundle();

        /* renamed from: c */
        private final HashMap<Class<? extends AbstractC3816m>, AbstractC3816m> f13975c = new HashMap<>();

        /* renamed from: d */
        private final HashSet<String> f13976d = new HashSet<>();

        /* renamed from: e */
        private final Bundle f13977e = new Bundle();

        /* renamed from: f */
        private final HashSet<String> f13978f = new HashSet<>();

        /* renamed from: i */
        private int f13981i = -1;

        /* renamed from: k */
        private boolean f13983k = false;

        /* renamed from: n */
        private int f13986n = -1;

        /* renamed from: a */
        public void m27540a(int i) {
            this.f13981i = i;
        }

        /* renamed from: a */
        public void m27539a(Location location) {
            this.f13982j = location;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Deprecated
        /* renamed from: a */
        public void m27537a(AbstractC3816m abstractC3816m) {
            if (abstractC3816m instanceof C3791a) {
                m27536a(AdMobAdapter.class, ((C3791a) abstractC3816m).m26818a());
            } else {
                this.f13975c.put(abstractC3816m.getClass(), abstractC3816m);
            }
        }

        /* renamed from: a */
        public void m27536a(Class<? extends AbstractC3792b> cls, Bundle bundle) {
            this.f13974b.putBundle(cls.getName(), bundle);
        }

        /* renamed from: a */
        public void m27535a(String str) {
            this.f13973a.add(str);
        }

        /* renamed from: a */
        public void m27534a(String str, String str2) {
            this.f13977e.putString(str, str2);
        }

        /* renamed from: a */
        public void m27533a(Date date) {
            this.f13979g = date;
        }

        /* renamed from: a */
        public void m27532a(boolean z) {
            this.f13983k = z;
        }

        /* renamed from: b */
        public void m27530b(Class<? extends AbstractC3798a> cls, Bundle bundle) {
            if (this.f13974b.getBundle("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter") == null) {
                this.f13974b.putBundle("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter", new Bundle());
            }
            this.f13974b.getBundle("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter").putBundle(cls.getName(), bundle);
        }

        /* renamed from: b */
        public void m27529b(String str) {
            this.f13976d.add(str);
        }

        /* renamed from: b */
        public void m27528b(boolean z) {
            this.f13986n = z ? 1 : 0;
        }

        /* renamed from: c */
        public void m27526c(String str) {
            this.f13976d.remove(str);
        }

        /* renamed from: c */
        public void m27525c(boolean z) {
            this.f13987o = z;
        }

        /* renamed from: d */
        public void m27523d(String str) {
            this.f13980h = str;
        }

        /* renamed from: e */
        public void m27521e(String str) {
            this.f13984l = str;
        }

        /* renamed from: f */
        public void m27519f(String str) {
            this.f13985m = str;
        }

        /* renamed from: g */
        public void m27517g(String str) {
            this.f13978f.add(str);
        }
    }

    public C3559e(C3560a c3560a) {
        this(c3560a, null);
    }

    public C3559e(C3560a c3560a, C3825b c3825b) {
        this.f13957b = c3560a.f13979g;
        this.f13958c = c3560a.f13980h;
        this.f13959d = c3560a.f13981i;
        this.f13960e = Collections.unmodifiableSet(c3560a.f13973a);
        this.f13961f = c3560a.f13982j;
        this.f13962g = c3560a.f13983k;
        this.f13963h = c3560a.f13974b;
        this.f13964i = Collections.unmodifiableMap(c3560a.f13975c);
        this.f13965j = c3560a.f13984l;
        this.f13966k = c3560a.f13985m;
        this.f13967l = c3825b;
        this.f13968m = c3560a.f13986n;
        this.f13969n = Collections.unmodifiableSet(c3560a.f13976d);
        this.f13970o = c3560a.f13977e;
        this.f13971p = Collections.unmodifiableSet(c3560a.f13978f);
        this.f13972q = c3560a.f13987o;
    }

    @Deprecated
    /* renamed from: a */
    public <T extends AbstractC3816m> T m27557a(Class<T> cls) {
        return (T) this.f13964i.get(cls);
    }

    /* renamed from: a */
    public Date m27559a() {
        return this.f13957b;
    }

    /* renamed from: a */
    public boolean m27558a(Context context) {
        return this.f13969n.contains(C3514ac.m27586a().m26866a(context));
    }

    /* renamed from: b */
    public Bundle m27555b(Class<? extends AbstractC3792b> cls) {
        return this.f13963h.getBundle(cls.getName());
    }

    /* renamed from: b */
    public String m27556b() {
        return this.f13958c;
    }

    /* renamed from: c */
    public int m27554c() {
        return this.f13959d;
    }

    /* renamed from: c */
    public Bundle m27553c(Class<? extends AbstractC3798a> cls) {
        Bundle bundle = this.f13963h.getBundle("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter");
        if (bundle != null) {
            return bundle.getBundle(cls.getName());
        }
        return null;
    }

    /* renamed from: d */
    public Set<String> m27552d() {
        return this.f13960e;
    }

    /* renamed from: e */
    public Location m27551e() {
        return this.f13961f;
    }

    /* renamed from: f */
    public boolean m27550f() {
        return this.f13962g;
    }

    /* renamed from: g */
    public String m27549g() {
        return this.f13965j;
    }

    /* renamed from: h */
    public String m27548h() {
        return this.f13966k;
    }

    /* renamed from: i */
    public C3825b m27547i() {
        return this.f13967l;
    }

    /* renamed from: j */
    public Map<Class<? extends AbstractC3816m>, AbstractC3816m> m27546j() {
        return this.f13964i;
    }

    /* renamed from: k */
    public Bundle m27545k() {
        return this.f13963h;
    }

    /* renamed from: l */
    public int m27544l() {
        return this.f13968m;
    }

    /* renamed from: m */
    public Bundle m27543m() {
        return this.f13970o;
    }

    /* renamed from: n */
    public Set<String> m27542n() {
        return this.f13971p;
    }

    /* renamed from: o */
    public boolean m27541o() {
        return this.f13972q;
    }
}
