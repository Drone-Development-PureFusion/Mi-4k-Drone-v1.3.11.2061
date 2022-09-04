package com.p120c.p121a.p129b;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import com.p120c.p121a.p122a.p123a.AbstractC1255a;
import com.p120c.p121a.p122a.p127b.AbstractC1283c;
import com.p120c.p121a.p129b.C1311c;
import com.p120c.p121a.p129b.p130a.C1300e;
import com.p120c.p121a.p129b.p130a.EnumC1301f;
import com.p120c.p121a.p129b.p130a.EnumC1303h;
import com.p120c.p121a.p129b.p135e.AbstractC1333a;
import com.p120c.p121a.p129b.p135e.C1334b;
import com.p120c.p121a.p129b.p135e.C1335c;
import com.p120c.p121a.p129b.p136f.AbstractC1339a;
import com.p120c.p121a.p129b.p136f.AbstractC1340b;
import com.p120c.p121a.p129b.p136f.C1342d;
import com.p120c.p121a.p138c.C1352b;
import com.p120c.p121a.p138c.C1356d;
import com.p120c.p121a.p138c.C1357e;
/* renamed from: com.c.a.b.d */
/* loaded from: classes.dex */
public class C1321d {

    /* renamed from: a */
    public static final String f3356a = C1321d.class.getSimpleName();

    /* renamed from: b */
    static final String f3357b = "Initialize ImageLoader with configuration";

    /* renamed from: c */
    static final String f3358c = "Destroy ImageLoader";

    /* renamed from: d */
    static final String f3359d = "Load image from memory cache [%s]";

    /* renamed from: e */
    private static final String f3360e = "Try to initialize ImageLoader which had already been initialized before. To re-init ImageLoader with new configuration call ImageLoader.destroy() at first.";

    /* renamed from: f */
    private static final String f3361f = "Wrong arguments were passed to displayImage() method (ImageView reference must not be null)";

    /* renamed from: g */
    private static final String f3362g = "ImageLoader must be init with configuration before using";

    /* renamed from: h */
    private static final String f3363h = "ImageLoader configuration can not be initialized with null";

    /* renamed from: l */
    private static volatile C1321d f3364l;

    /* renamed from: i */
    private C1328e f3365i;

    /* renamed from: j */
    private C1337f f3366j;

    /* renamed from: k */
    private AbstractC1339a f3367k = new C1342d();

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.c.a.b.d$a */
    /* loaded from: classes.dex */
    public static class C1323a extends C1342d {

        /* renamed from: a */
        private Bitmap f3368a;

        private C1323a() {
        }

        /* renamed from: a */
        public Bitmap m35753a() {
            return this.f3368a;
        }

        @Override // com.p120c.p121a.p129b.p136f.C1342d, com.p120c.p121a.p129b.p136f.AbstractC1339a
        /* renamed from: a */
        public void mo35653a(String str, View view, Bitmap bitmap) {
            this.f3368a = bitmap;
        }
    }

    protected C1321d() {
    }

    /* renamed from: a */
    private static Handler m35792a(C1311c c1311c) {
        Handler m35847r = c1311c.m35847r();
        if (c1311c.m35845s()) {
            return null;
        }
        return (m35847r == null && Looper.myLooper() == Looper.getMainLooper()) ? new Handler() : m35847r;
    }

    /* renamed from: a */
    public static C1321d m35794a() {
        if (f3364l == null) {
            synchronized (C1321d.class) {
                if (f3364l == null) {
                    f3364l = new C1321d();
                }
            }
        }
        return f3364l;
    }

    /* renamed from: m */
    private void m35754m() {
        if (this.f3365i == null) {
            throw new IllegalStateException(f3362g);
        }
    }

    /* renamed from: a */
    public Bitmap m35788a(String str) {
        return m35781a(str, (C1300e) null, (C1311c) null);
    }

    /* renamed from: a */
    public Bitmap m35782a(String str, C1300e c1300e) {
        return m35781a(str, c1300e, (C1311c) null);
    }

    /* renamed from: a */
    public Bitmap m35781a(String str, C1300e c1300e, C1311c c1311c) {
        if (c1311c == null) {
            c1311c = this.f3365i.f3407r;
        }
        C1311c m35818d = new C1311c.C1313a().m35833a(c1311c).m35810f(true).m35818d();
        C1323a c1323a = new C1323a();
        m35780a(str, c1300e, m35818d, c1323a);
        return c1323a.m35753a();
    }

    /* renamed from: a */
    public Bitmap m35777a(String str, C1311c c1311c) {
        return m35781a(str, (C1300e) null, c1311c);
    }

    /* renamed from: a */
    public String m35793a(ImageView imageView) {
        return this.f3366j.m35675a(new C1334b(imageView));
    }

    /* renamed from: a */
    public String m35791a(AbstractC1333a abstractC1333a) {
        return this.f3366j.m35675a(abstractC1333a);
    }

    /* renamed from: a */
    public synchronized void m35790a(C1328e c1328e) {
        if (c1328e == null) {
            throw new IllegalArgumentException(f3363h);
        }
        if (this.f3365i == null) {
            C1356d.m35612a(f3357b, new Object[0]);
            this.f3366j = new C1337f(c1328e);
            this.f3365i = c1328e;
        } else {
            C1356d.m35605c(f3360e, new Object[0]);
        }
    }

    /* renamed from: a */
    public void m35789a(AbstractC1339a abstractC1339a) {
        if (abstractC1339a == null) {
            abstractC1339a = new C1342d();
        }
        this.f3367k = abstractC1339a;
    }

    /* renamed from: a */
    public void m35787a(String str, ImageView imageView) {
        m35772a(str, new C1334b(imageView), (C1311c) null, (AbstractC1339a) null, (AbstractC1340b) null);
    }

    /* renamed from: a */
    public void m35786a(String str, ImageView imageView, C1311c c1311c) {
        m35772a(str, new C1334b(imageView), c1311c, (AbstractC1339a) null, (AbstractC1340b) null);
    }

    /* renamed from: a */
    public void m35785a(String str, ImageView imageView, C1311c c1311c, AbstractC1339a abstractC1339a) {
        m35784a(str, imageView, c1311c, abstractC1339a, (AbstractC1340b) null);
    }

    /* renamed from: a */
    public void m35784a(String str, ImageView imageView, C1311c c1311c, AbstractC1339a abstractC1339a, AbstractC1340b abstractC1340b) {
        m35772a(str, new C1334b(imageView), c1311c, abstractC1339a, abstractC1340b);
    }

    /* renamed from: a */
    public void m35783a(String str, ImageView imageView, AbstractC1339a abstractC1339a) {
        m35772a(str, new C1334b(imageView), (C1311c) null, abstractC1339a, (AbstractC1340b) null);
    }

    /* renamed from: a */
    public void m35780a(String str, C1300e c1300e, C1311c c1311c, AbstractC1339a abstractC1339a) {
        m35779a(str, c1300e, c1311c, abstractC1339a, (AbstractC1340b) null);
    }

    /* renamed from: a */
    public void m35779a(String str, C1300e c1300e, C1311c c1311c, AbstractC1339a abstractC1339a, AbstractC1340b abstractC1340b) {
        m35754m();
        if (c1300e == null) {
            c1300e = this.f3365i.m35736a();
        }
        m35772a(str, new C1335c(str, c1300e, EnumC1303h.CROP), c1311c == null ? this.f3365i.f3407r : c1311c, abstractC1339a, abstractC1340b);
    }

    /* renamed from: a */
    public void m35778a(String str, C1300e c1300e, AbstractC1339a abstractC1339a) {
        m35779a(str, c1300e, (C1311c) null, abstractC1339a, (AbstractC1340b) null);
    }

    /* renamed from: a */
    public void m35776a(String str, C1311c c1311c, AbstractC1339a abstractC1339a) {
        m35779a(str, (C1300e) null, c1311c, abstractC1339a, (AbstractC1340b) null);
    }

    /* renamed from: a */
    public void m35775a(String str, AbstractC1333a abstractC1333a) {
        m35772a(str, abstractC1333a, (C1311c) null, (AbstractC1339a) null, (AbstractC1340b) null);
    }

    /* renamed from: a */
    public void m35774a(String str, AbstractC1333a abstractC1333a, C1311c c1311c) {
        m35772a(str, abstractC1333a, c1311c, (AbstractC1339a) null, (AbstractC1340b) null);
    }

    /* renamed from: a */
    public void m35773a(String str, AbstractC1333a abstractC1333a, C1311c c1311c, AbstractC1339a abstractC1339a) {
        m35772a(str, abstractC1333a, c1311c, abstractC1339a, (AbstractC1340b) null);
    }

    /* renamed from: a */
    public void m35772a(String str, AbstractC1333a abstractC1333a, C1311c c1311c, AbstractC1339a abstractC1339a, AbstractC1340b abstractC1340b) {
        m35754m();
        if (abstractC1333a == null) {
            throw new IllegalArgumentException(f3361f);
        }
        AbstractC1339a abstractC1339a2 = abstractC1339a == null ? this.f3367k : abstractC1339a;
        C1311c c1311c2 = c1311c == null ? this.f3365i.f3407r : c1311c;
        if (TextUtils.isEmpty(str)) {
            this.f3366j.m35666b(abstractC1333a);
            abstractC1339a2.mo35654a(str, abstractC1333a.mo35679d());
            if (c1311c2.m35881b()) {
                abstractC1333a.mo35683a(c1311c2.m35880b(this.f3365i.f3390a));
            } else {
                abstractC1333a.mo35683a((Drawable) null);
            }
            abstractC1339a2.mo35653a(str, abstractC1333a.mo35679d(), (Bitmap) null);
            return;
        }
        C1300e m35622a = C1352b.m35622a(abstractC1333a, this.f3365i.m35736a());
        String m35601a = C1357e.m35601a(str, m35622a);
        this.f3366j.m35674a(abstractC1333a, m35601a);
        abstractC1339a2.mo35654a(str, abstractC1333a.mo35679d());
        Bitmap mo35964a = this.f3365i.f3403n.mo35964a(m35601a);
        if (mo35964a == null || mo35964a.isRecycled()) {
            if (c1311c2.m35884a()) {
                abstractC1333a.mo35683a(c1311c2.m35883a(this.f3365i.f3390a));
            } else if (c1311c2.m35869g()) {
                abstractC1333a.mo35683a((Drawable) null);
            }
            RunnableC1345h runnableC1345h = new RunnableC1345h(this.f3366j, new C1343g(str, abstractC1333a, m35622a, m35601a, c1311c2, abstractC1339a2, abstractC1340b, this.f3366j.m35669a(str)), m35792a(c1311c2));
            if (c1311c2.m35845s()) {
                runnableC1345h.run();
                return;
            } else {
                this.f3366j.m35672a(runnableC1345h);
                return;
            }
        }
        C1356d.m35612a(f3359d, m35601a);
        if (!c1311c2.m35873e()) {
            c1311c2.m35849q().mo35795a(mo35964a, abstractC1333a, EnumC1301f.MEMORY_CACHE);
            abstractC1339a2.mo35653a(str, abstractC1333a.mo35679d(), mo35964a);
            return;
        }
        RunnableC1350i runnableC1350i = new RunnableC1350i(this.f3366j, mo35964a, new C1343g(str, abstractC1333a, m35622a, m35601a, c1311c2, abstractC1339a2, abstractC1340b, this.f3366j.m35669a(str)), m35792a(c1311c2));
        if (c1311c2.m35845s()) {
            runnableC1350i.run();
        } else {
            this.f3366j.m35671a(runnableC1350i);
        }
    }

    /* renamed from: a */
    public void m35771a(String str, AbstractC1333a abstractC1333a, AbstractC1339a abstractC1339a) {
        m35772a(str, abstractC1333a, (C1311c) null, abstractC1339a, (AbstractC1340b) null);
    }

    /* renamed from: a */
    public void m35770a(String str, AbstractC1339a abstractC1339a) {
        m35779a(str, (C1300e) null, (C1311c) null, abstractC1339a, (AbstractC1340b) null);
    }

    /* renamed from: a */
    public void m35769a(boolean z) {
        this.f3366j.m35668a(z);
    }

    /* renamed from: b */
    public void m35767b(ImageView imageView) {
        this.f3366j.m35666b(new C1334b(imageView));
    }

    /* renamed from: b */
    public void m35766b(AbstractC1333a abstractC1333a) {
        this.f3366j.m35666b(abstractC1333a);
    }

    /* renamed from: b */
    public void m35765b(boolean z) {
        this.f3366j.m35664b(z);
    }

    /* renamed from: b */
    public boolean m35768b() {
        return this.f3365i != null;
    }

    /* renamed from: c */
    public AbstractC1283c m35764c() {
        m35754m();
        return this.f3365i.f3403n;
    }

    /* renamed from: d */
    public void m35763d() {
        m35754m();
        this.f3365i.f3403n.mo35962b();
    }

    @Deprecated
    /* renamed from: e */
    public AbstractC1255a m35762e() {
        return m35761f();
    }

    /* renamed from: f */
    public AbstractC1255a m35761f() {
        m35754m();
        return this.f3365i.f3404o;
    }

    @Deprecated
    /* renamed from: g */
    public void m35760g() {
        m35759h();
    }

    /* renamed from: h */
    public void m35759h() {
        m35754m();
        this.f3365i.f3404o.mo35975c();
    }

    /* renamed from: i */
    public void m35758i() {
        this.f3366j.m35676a();
    }

    /* renamed from: j */
    public void m35757j() {
        this.f3366j.m35667b();
    }

    /* renamed from: k */
    public void m35756k() {
        this.f3366j.m35663c();
    }

    /* renamed from: l */
    public void m35755l() {
        if (this.f3365i != null) {
            C1356d.m35612a(f3358c, new Object[0]);
        }
        m35756k();
        this.f3365i.f3404o.mo35988b();
        this.f3366j = null;
        this.f3365i = null;
    }
}
