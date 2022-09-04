package com.p120c.p121a.p129b;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import com.p120c.p121a.p122a.p123a.AbstractC1255a;
import com.p120c.p121a.p122a.p123a.p126b.AbstractC1270a;
import com.p120c.p121a.p122a.p127b.AbstractC1283c;
import com.p120c.p121a.p122a.p127b.p128a.C1275b;
import com.p120c.p121a.p129b.p130a.C1298c;
import com.p120c.p121a.p129b.p130a.C1300e;
import com.p120c.p121a.p129b.p130a.EnumC1302g;
import com.p120c.p121a.p129b.p132b.AbstractC1309b;
import com.p120c.p121a.p129b.p134d.AbstractC1326b;
import com.p120c.p121a.p129b.p137g.AbstractC1344a;
import com.p120c.p121a.p138c.C1356d;
import com.p120c.p121a.p138c.C1357e;
import java.io.InputStream;
import java.util.concurrent.Executor;
/* renamed from: com.c.a.b.e */
/* loaded from: classes.dex */
public final class C1328e {

    /* renamed from: a */
    final Resources f3390a;

    /* renamed from: b */
    final int f3391b;

    /* renamed from: c */
    final int f3392c;

    /* renamed from: d */
    final int f3393d;

    /* renamed from: e */
    final int f3394e;

    /* renamed from: f */
    final AbstractC1344a f3395f;

    /* renamed from: g */
    final Executor f3396g;

    /* renamed from: h */
    final Executor f3397h;

    /* renamed from: i */
    final boolean f3398i;

    /* renamed from: j */
    final boolean f3399j;

    /* renamed from: k */
    final int f3400k;

    /* renamed from: l */
    final int f3401l;

    /* renamed from: m */
    final EnumC1302g f3402m;

    /* renamed from: n */
    final AbstractC1283c f3403n;

    /* renamed from: o */
    final AbstractC1255a f3404o;

    /* renamed from: p */
    final AbstractC1326b f3405p;

    /* renamed from: q */
    final AbstractC1309b f3406q;

    /* renamed from: r */
    final C1311c f3407r;

    /* renamed from: s */
    final AbstractC1326b f3408s;

    /* renamed from: t */
    final AbstractC1326b f3409t;

    /* renamed from: com.c.a.b.e$a */
    /* loaded from: classes.dex */
    public static class C1330a {

        /* renamed from: a */
        public static final int f3411a = 3;

        /* renamed from: b */
        public static final int f3412b = 3;

        /* renamed from: c */
        public static final EnumC1302g f3413c = EnumC1302g.FIFO;

        /* renamed from: d */
        private static final String f3414d = "diskCache(), diskCacheSize() and diskCacheFileCount calls overlap each other";

        /* renamed from: e */
        private static final String f3415e = "diskCache() and diskCacheFileNameGenerator() calls overlap each other";

        /* renamed from: f */
        private static final String f3416f = "memoryCache() and memoryCacheSize() calls overlap each other";

        /* renamed from: g */
        private static final String f3417g = "threadPoolSize(), threadPriority() and tasksProcessingOrder() calls can overlap taskExecutor() and taskExecutorForCachedImages() calls.";

        /* renamed from: C */
        private AbstractC1309b f3420C;

        /* renamed from: h */
        private Context f3423h;

        /* renamed from: i */
        private int f3424i = 0;

        /* renamed from: j */
        private int f3425j = 0;

        /* renamed from: k */
        private int f3426k = 0;

        /* renamed from: l */
        private int f3427l = 0;

        /* renamed from: m */
        private AbstractC1344a f3428m = null;

        /* renamed from: n */
        private Executor f3429n = null;

        /* renamed from: o */
        private Executor f3430o = null;

        /* renamed from: p */
        private boolean f3431p = false;

        /* renamed from: q */
        private boolean f3432q = false;

        /* renamed from: r */
        private int f3433r = 3;

        /* renamed from: s */
        private int f3434s = 3;

        /* renamed from: t */
        private boolean f3435t = false;

        /* renamed from: u */
        private EnumC1302g f3436u = f3413c;

        /* renamed from: v */
        private int f3437v = 0;

        /* renamed from: w */
        private long f3438w = 0;

        /* renamed from: x */
        private int f3439x = 0;

        /* renamed from: y */
        private AbstractC1283c f3440y = null;

        /* renamed from: z */
        private AbstractC1255a f3441z = null;

        /* renamed from: A */
        private AbstractC1270a f3418A = null;

        /* renamed from: B */
        private AbstractC1326b f3419B = null;

        /* renamed from: D */
        private C1311c f3421D = null;

        /* renamed from: E */
        private boolean f3422E = false;

        public C1330a(Context context) {
            this.f3423h = context.getApplicationContext();
        }

        /* renamed from: d */
        private void m35711d() {
            if (this.f3429n == null) {
                this.f3429n = C1284a.m35959a(this.f3433r, this.f3434s, this.f3436u);
            } else {
                this.f3431p = true;
            }
            if (this.f3430o == null) {
                this.f3430o = C1284a.m35959a(this.f3433r, this.f3434s, this.f3436u);
            } else {
                this.f3432q = true;
            }
            if (this.f3441z == null) {
                if (this.f3418A == null) {
                    this.f3418A = C1284a.m35952b();
                }
                this.f3441z = C1284a.m35954a(this.f3423h, this.f3418A, this.f3438w, this.f3439x);
            }
            if (this.f3440y == null) {
                this.f3440y = C1284a.m35955a(this.f3423h, this.f3437v);
            }
            if (this.f3435t) {
                this.f3440y = new C1275b(this.f3440y, C1357e.m35603a());
            }
            if (this.f3419B == null) {
                this.f3419B = C1284a.m35956a(this.f3423h);
            }
            if (this.f3420C == null) {
                this.f3420C = C1284a.m35953a(this.f3422E);
            }
            if (this.f3421D == null) {
                this.f3421D = C1311c.m35843t();
            }
        }

        /* renamed from: a */
        public C1330a m35734a() {
            this.f3435t = true;
            return this;
        }

        /* renamed from: a */
        public C1330a m35733a(int i) {
            if (this.f3429n != null || this.f3430o != null) {
                C1356d.m35605c(f3417g, new Object[0]);
            }
            this.f3433r = i;
            return this;
        }

        /* renamed from: a */
        public C1330a m35732a(int i, int i2) {
            this.f3424i = i;
            this.f3425j = i2;
            return this;
        }

        @Deprecated
        /* renamed from: a */
        public C1330a m35731a(int i, int i2, AbstractC1344a abstractC1344a) {
            return m35719b(i, i2, abstractC1344a);
        }

        @Deprecated
        /* renamed from: a */
        public C1330a m35730a(AbstractC1255a abstractC1255a) {
            return m35718b(abstractC1255a);
        }

        @Deprecated
        /* renamed from: a */
        public C1330a m35729a(AbstractC1270a abstractC1270a) {
            return m35717b(abstractC1270a);
        }

        /* renamed from: a */
        public C1330a m35728a(AbstractC1283c abstractC1283c) {
            if (this.f3437v != 0) {
                C1356d.m35605c(f3416f, new Object[0]);
            }
            this.f3440y = abstractC1283c;
            return this;
        }

        /* renamed from: a */
        public C1330a m35727a(EnumC1302g enumC1302g) {
            if (this.f3429n != null || this.f3430o != null) {
                C1356d.m35605c(f3417g, new Object[0]);
            }
            this.f3436u = enumC1302g;
            return this;
        }

        /* renamed from: a */
        public C1330a m35726a(AbstractC1309b abstractC1309b) {
            this.f3420C = abstractC1309b;
            return this;
        }

        /* renamed from: a */
        public C1330a m35725a(C1311c c1311c) {
            this.f3421D = c1311c;
            return this;
        }

        /* renamed from: a */
        public C1330a m35724a(AbstractC1326b abstractC1326b) {
            this.f3419B = abstractC1326b;
            return this;
        }

        /* renamed from: a */
        public C1330a m35722a(Executor executor) {
            if (this.f3433r != 3 || this.f3434s != 3 || this.f3436u != f3413c) {
                C1356d.m35605c(f3417g, new Object[0]);
            }
            this.f3429n = executor;
            return this;
        }

        /* renamed from: b */
        public C1330a m35721b() {
            this.f3422E = true;
            return this;
        }

        /* renamed from: b */
        public C1330a m35720b(int i) {
            if (this.f3429n != null || this.f3430o != null) {
                C1356d.m35605c(f3417g, new Object[0]);
            }
            if (i < 1) {
                this.f3434s = 1;
            } else if (i > 10) {
                this.f3434s = 10;
            } else {
                this.f3434s = i;
            }
            return this;
        }

        /* renamed from: b */
        public C1330a m35719b(int i, int i2, AbstractC1344a abstractC1344a) {
            this.f3426k = i;
            this.f3427l = i2;
            this.f3428m = abstractC1344a;
            return this;
        }

        /* renamed from: b */
        public C1330a m35718b(AbstractC1255a abstractC1255a) {
            if (this.f3438w > 0 || this.f3439x > 0) {
                C1356d.m35605c(f3414d, new Object[0]);
            }
            if (this.f3418A != null) {
                C1356d.m35605c(f3415e, new Object[0]);
            }
            this.f3441z = abstractC1255a;
            return this;
        }

        /* renamed from: b */
        public C1330a m35717b(AbstractC1270a abstractC1270a) {
            if (this.f3441z != null) {
                C1356d.m35605c(f3415e, new Object[0]);
            }
            this.f3418A = abstractC1270a;
            return this;
        }

        /* renamed from: b */
        public C1330a m35715b(Executor executor) {
            if (this.f3433r != 3 || this.f3434s != 3 || this.f3436u != f3413c) {
                C1356d.m35605c(f3417g, new Object[0]);
            }
            this.f3430o = executor;
            return this;
        }

        /* renamed from: c */
        public C1330a m35713c(int i) {
            if (i <= 0) {
                throw new IllegalArgumentException("memoryCacheSize must be a positive number");
            }
            if (this.f3440y != null) {
                C1356d.m35605c(f3416f, new Object[0]);
            }
            this.f3437v = i;
            return this;
        }

        /* renamed from: c */
        public C1328e m35714c() {
            m35711d();
            return new C1328e(this);
        }

        /* renamed from: d */
        public C1330a m35710d(int i) {
            if (i <= 0 || i >= 100) {
                throw new IllegalArgumentException("availableMemoryPercent must be in range (0 < % < 100)");
            }
            if (this.f3440y != null) {
                C1356d.m35605c(f3416f, new Object[0]);
            }
            this.f3437v = (int) (((float) Runtime.getRuntime().maxMemory()) * (i / 100.0f));
            return this;
        }

        @Deprecated
        /* renamed from: e */
        public C1330a m35708e(int i) {
            return m35706f(i);
        }

        /* renamed from: f */
        public C1330a m35706f(int i) {
            if (i <= 0) {
                throw new IllegalArgumentException("maxCacheSize must be a positive number");
            }
            if (this.f3441z != null) {
                C1356d.m35605c(f3414d, new Object[0]);
            }
            this.f3438w = i;
            return this;
        }

        @Deprecated
        /* renamed from: g */
        public C1330a m35704g(int i) {
            return m35702h(i);
        }

        /* renamed from: h */
        public C1330a m35702h(int i) {
            if (i <= 0) {
                throw new IllegalArgumentException("maxFileCount must be a positive number");
            }
            if (this.f3441z != null) {
                C1356d.m35605c(f3414d, new Object[0]);
            }
            this.f3439x = i;
            return this;
        }
    }

    /* renamed from: com.c.a.b.e$b */
    /* loaded from: classes.dex */
    private static class C1331b implements AbstractC1326b {

        /* renamed from: a */
        private final AbstractC1326b f3442a;

        public C1331b(AbstractC1326b abstractC1326b) {
            this.f3442a = abstractC1326b;
        }

        @Override // com.p120c.p121a.p129b.p134d.AbstractC1326b
        /* renamed from: a */
        public InputStream mo35687a(String str, Object obj) {
            switch (AbstractC1326b.EnumC1327a.m35740a(str)) {
                case HTTP:
                case HTTPS:
                    throw new IllegalStateException();
                default:
                    return this.f3442a.mo35687a(str, obj);
            }
        }
    }

    /* renamed from: com.c.a.b.e$c */
    /* loaded from: classes.dex */
    private static class C1332c implements AbstractC1326b {

        /* renamed from: a */
        private final AbstractC1326b f3443a;

        public C1332c(AbstractC1326b abstractC1326b) {
            this.f3443a = abstractC1326b;
        }

        @Override // com.p120c.p121a.p129b.p134d.AbstractC1326b
        /* renamed from: a */
        public InputStream mo35687a(String str, Object obj) {
            InputStream mo35687a = this.f3443a.mo35687a(str, obj);
            switch (AbstractC1326b.EnumC1327a.m35740a(str)) {
                case HTTP:
                case HTTPS:
                    return new C1298c(mo35687a);
                default:
                    return mo35687a;
            }
        }
    }

    private C1328e(C1330a c1330a) {
        this.f3390a = c1330a.f3423h.getResources();
        this.f3391b = c1330a.f3424i;
        this.f3392c = c1330a.f3425j;
        this.f3393d = c1330a.f3426k;
        this.f3394e = c1330a.f3427l;
        this.f3395f = c1330a.f3428m;
        this.f3396g = c1330a.f3429n;
        this.f3397h = c1330a.f3430o;
        this.f3400k = c1330a.f3433r;
        this.f3401l = c1330a.f3434s;
        this.f3402m = c1330a.f3436u;
        this.f3404o = c1330a.f3441z;
        this.f3403n = c1330a.f3440y;
        this.f3407r = c1330a.f3421D;
        this.f3405p = c1330a.f3419B;
        this.f3406q = c1330a.f3420C;
        this.f3398i = c1330a.f3431p;
        this.f3399j = c1330a.f3432q;
        this.f3408s = new C1331b(this.f3405p);
        this.f3409t = new C1332c(this.f3405p);
        C1356d.m35609a(c1330a.f3422E);
    }

    /* renamed from: a */
    public static C1328e m35735a(Context context) {
        return new C1330a(context).m35714c();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public C1300e m35736a() {
        DisplayMetrics displayMetrics = this.f3390a.getDisplayMetrics();
        int i = this.f3391b;
        if (i <= 0) {
            i = displayMetrics.widthPixels;
        }
        int i2 = this.f3392c;
        if (i2 <= 0) {
            i2 = displayMetrics.heightPixels;
        }
        return new C1300e(i, i2);
    }
}
