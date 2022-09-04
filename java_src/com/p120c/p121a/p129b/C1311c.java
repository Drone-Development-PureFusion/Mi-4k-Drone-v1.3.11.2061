package com.p120c.p121a.p129b;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import com.p120c.p121a.p129b.p130a.EnumC1299d;
import com.p120c.p121a.p129b.p133c.AbstractC1314a;
import com.p120c.p121a.p129b.p137g.AbstractC1344a;
/* renamed from: com.c.a.b.c */
/* loaded from: classes.dex */
public final class C1311c {

    /* renamed from: a */
    private final int f3306a;

    /* renamed from: b */
    private final int f3307b;

    /* renamed from: c */
    private final int f3308c;

    /* renamed from: d */
    private final Drawable f3309d;

    /* renamed from: e */
    private final Drawable f3310e;

    /* renamed from: f */
    private final Drawable f3311f;

    /* renamed from: g */
    private final boolean f3312g;

    /* renamed from: h */
    private final boolean f3313h;

    /* renamed from: i */
    private final boolean f3314i;

    /* renamed from: j */
    private final EnumC1299d f3315j;

    /* renamed from: k */
    private final BitmapFactory.Options f3316k;

    /* renamed from: l */
    private final int f3317l;

    /* renamed from: m */
    private final boolean f3318m;

    /* renamed from: n */
    private final Object f3319n;

    /* renamed from: o */
    private final AbstractC1344a f3320o;

    /* renamed from: p */
    private final AbstractC1344a f3321p;

    /* renamed from: q */
    private final AbstractC1314a f3322q;

    /* renamed from: r */
    private final Handler f3323r;

    /* renamed from: s */
    private final boolean f3324s;

    /* renamed from: com.c.a.b.c$a */
    /* loaded from: classes.dex */
    public static class C1313a {

        /* renamed from: a */
        private int f3325a = 0;

        /* renamed from: b */
        private int f3326b = 0;

        /* renamed from: c */
        private int f3327c = 0;

        /* renamed from: d */
        private Drawable f3328d = null;

        /* renamed from: e */
        private Drawable f3329e = null;

        /* renamed from: f */
        private Drawable f3330f = null;

        /* renamed from: g */
        private boolean f3331g = false;

        /* renamed from: h */
        private boolean f3332h = false;

        /* renamed from: i */
        private boolean f3333i = false;

        /* renamed from: j */
        private EnumC1299d f3334j = EnumC1299d.IN_SAMPLE_POWER_OF_2;

        /* renamed from: k */
        private BitmapFactory.Options f3335k = new BitmapFactory.Options();

        /* renamed from: l */
        private int f3336l = 0;

        /* renamed from: m */
        private boolean f3337m = false;

        /* renamed from: n */
        private Object f3338n = null;

        /* renamed from: o */
        private AbstractC1344a f3339o = null;

        /* renamed from: p */
        private AbstractC1344a f3340p = null;

        /* renamed from: q */
        private AbstractC1314a f3341q = C1284a.m35950c();

        /* renamed from: r */
        private Handler f3342r = null;

        /* renamed from: s */
        private boolean f3343s = false;

        public C1313a() {
            this.f3335k.inPurgeable = true;
            this.f3335k.inInputShareable = true;
        }

        /* renamed from: a */
        public C1313a m35842a() {
            this.f3331g = true;
            return this;
        }

        @Deprecated
        /* renamed from: a */
        public C1313a m35841a(int i) {
            this.f3325a = i;
            return this;
        }

        /* renamed from: a */
        public C1313a m35840a(Bitmap.Config config) {
            if (config == null) {
                throw new IllegalArgumentException("bitmapConfig can't be null");
            }
            this.f3335k.inPreferredConfig = config;
            return this;
        }

        /* renamed from: a */
        public C1313a m35839a(BitmapFactory.Options options) {
            if (options == null) {
                throw new IllegalArgumentException("decodingOptions can't be null");
            }
            this.f3335k = options;
            return this;
        }

        /* renamed from: a */
        public C1313a m35838a(Drawable drawable) {
            this.f3328d = drawable;
            return this;
        }

        /* renamed from: a */
        public C1313a m35837a(Handler handler) {
            this.f3342r = handler;
            return this;
        }

        /* renamed from: a */
        public C1313a m35836a(EnumC1299d enumC1299d) {
            this.f3334j = enumC1299d;
            return this;
        }

        /* renamed from: a */
        public C1313a m35834a(AbstractC1314a abstractC1314a) {
            if (abstractC1314a == null) {
                throw new IllegalArgumentException("displayer can't be null");
            }
            this.f3341q = abstractC1314a;
            return this;
        }

        /* renamed from: a */
        public C1313a m35833a(C1311c c1311c) {
            this.f3325a = c1311c.f3306a;
            this.f3326b = c1311c.f3307b;
            this.f3327c = c1311c.f3308c;
            this.f3328d = c1311c.f3309d;
            this.f3329e = c1311c.f3310e;
            this.f3330f = c1311c.f3311f;
            this.f3331g = c1311c.f3312g;
            this.f3332h = c1311c.f3313h;
            this.f3333i = c1311c.f3314i;
            this.f3334j = c1311c.f3315j;
            this.f3335k = c1311c.f3316k;
            this.f3336l = c1311c.f3317l;
            this.f3337m = c1311c.f3318m;
            this.f3338n = c1311c.f3319n;
            this.f3339o = c1311c.f3320o;
            this.f3340p = c1311c.f3321p;
            this.f3341q = c1311c.f3322q;
            this.f3342r = c1311c.f3323r;
            this.f3343s = c1311c.f3324s;
            return this;
        }

        /* renamed from: a */
        public C1313a m35832a(AbstractC1344a abstractC1344a) {
            this.f3339o = abstractC1344a;
            return this;
        }

        /* renamed from: a */
        public C1313a m35831a(Object obj) {
            this.f3338n = obj;
            return this;
        }

        /* renamed from: a */
        public C1313a m35830a(boolean z) {
            this.f3331g = z;
            return this;
        }

        @Deprecated
        /* renamed from: b */
        public C1313a m35829b() {
            this.f3332h = true;
            return this;
        }

        /* renamed from: b */
        public C1313a m35828b(int i) {
            this.f3325a = i;
            return this;
        }

        /* renamed from: b */
        public C1313a m35827b(Drawable drawable) {
            this.f3329e = drawable;
            return this;
        }

        /* renamed from: b */
        public C1313a m35825b(AbstractC1344a abstractC1344a) {
            this.f3340p = abstractC1344a;
            return this;
        }

        /* renamed from: b */
        public C1313a m35824b(boolean z) {
            this.f3332h = z;
            return this;
        }

        @Deprecated
        /* renamed from: c */
        public C1313a m35823c() {
            return m35815d(true);
        }

        /* renamed from: c */
        public C1313a m35822c(int i) {
            this.f3326b = i;
            return this;
        }

        /* renamed from: c */
        public C1313a m35821c(Drawable drawable) {
            this.f3330f = drawable;
            return this;
        }

        @Deprecated
        /* renamed from: c */
        public C1313a m35819c(boolean z) {
            return m35815d(z);
        }

        /* renamed from: d */
        public C1313a m35817d(int i) {
            this.f3327c = i;
            return this;
        }

        /* renamed from: d */
        public C1313a m35815d(boolean z) {
            this.f3333i = z;
            return this;
        }

        /* renamed from: d */
        public C1311c m35818d() {
            return new C1311c(this);
        }

        /* renamed from: e */
        public C1313a m35814e(int i) {
            this.f3336l = i;
            return this;
        }

        /* renamed from: e */
        public C1313a m35812e(boolean z) {
            this.f3337m = z;
            return this;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: f */
        public C1313a m35810f(boolean z) {
            this.f3343s = z;
            return this;
        }
    }

    private C1311c(C1313a c1313a) {
        this.f3306a = c1313a.f3325a;
        this.f3307b = c1313a.f3326b;
        this.f3308c = c1313a.f3327c;
        this.f3309d = c1313a.f3328d;
        this.f3310e = c1313a.f3329e;
        this.f3311f = c1313a.f3330f;
        this.f3312g = c1313a.f3331g;
        this.f3313h = c1313a.f3332h;
        this.f3314i = c1313a.f3333i;
        this.f3315j = c1313a.f3334j;
        this.f3316k = c1313a.f3335k;
        this.f3317l = c1313a.f3336l;
        this.f3318m = c1313a.f3337m;
        this.f3319n = c1313a.f3338n;
        this.f3320o = c1313a.f3339o;
        this.f3321p = c1313a.f3340p;
        this.f3322q = c1313a.f3341q;
        this.f3323r = c1313a.f3342r;
        this.f3324s = c1313a.f3343s;
    }

    /* renamed from: t */
    public static C1311c m35843t() {
        return new C1313a().m35818d();
    }

    /* renamed from: a */
    public Drawable m35883a(Resources resources) {
        return this.f3306a != 0 ? resources.getDrawable(this.f3306a) : this.f3309d;
    }

    /* renamed from: a */
    public boolean m35884a() {
        return (this.f3309d == null && this.f3306a == 0) ? false : true;
    }

    /* renamed from: b */
    public Drawable m35880b(Resources resources) {
        return this.f3307b != 0 ? resources.getDrawable(this.f3307b) : this.f3310e;
    }

    /* renamed from: b */
    public boolean m35881b() {
        return (this.f3310e == null && this.f3307b == 0) ? false : true;
    }

    /* renamed from: c */
    public Drawable m35877c(Resources resources) {
        return this.f3308c != 0 ? resources.getDrawable(this.f3308c) : this.f3311f;
    }

    /* renamed from: c */
    public boolean m35878c() {
        return (this.f3311f == null && this.f3308c == 0) ? false : true;
    }

    /* renamed from: d */
    public boolean m35875d() {
        return this.f3320o != null;
    }

    /* renamed from: e */
    public boolean m35873e() {
        return this.f3321p != null;
    }

    /* renamed from: f */
    public boolean m35871f() {
        return this.f3317l > 0;
    }

    /* renamed from: g */
    public boolean m35869g() {
        return this.f3312g;
    }

    /* renamed from: h */
    public boolean m35867h() {
        return this.f3313h;
    }

    /* renamed from: i */
    public boolean m35865i() {
        return this.f3314i;
    }

    /* renamed from: j */
    public EnumC1299d m35863j() {
        return this.f3315j;
    }

    /* renamed from: k */
    public BitmapFactory.Options m35861k() {
        return this.f3316k;
    }

    /* renamed from: l */
    public int m35859l() {
        return this.f3317l;
    }

    /* renamed from: m */
    public boolean m35857m() {
        return this.f3318m;
    }

    /* renamed from: n */
    public Object m35855n() {
        return this.f3319n;
    }

    /* renamed from: o */
    public AbstractC1344a m35853o() {
        return this.f3320o;
    }

    /* renamed from: p */
    public AbstractC1344a m35851p() {
        return this.f3321p;
    }

    /* renamed from: q */
    public AbstractC1314a m35849q() {
        return this.f3322q;
    }

    /* renamed from: r */
    public Handler m35847r() {
        return this.f3323r;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: s */
    public boolean m35845s() {
        return this.f3324s;
    }
}
