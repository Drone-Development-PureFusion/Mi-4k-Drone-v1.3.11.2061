package com.p120c.p121a.p129b;

import android.graphics.Bitmap;
import com.p120c.p121a.p129b.p130a.EnumC1301f;
import com.p120c.p121a.p129b.p133c.AbstractC1314a;
import com.p120c.p121a.p129b.p135e.AbstractC1333a;
import com.p120c.p121a.p129b.p136f.AbstractC1339a;
import com.p120c.p121a.p138c.C1356d;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.c.a.b.b */
/* loaded from: classes.dex */
public final class RunnableC1305b implements Runnable {

    /* renamed from: a */
    private static final String f3274a = "Display image in ImageAware (loaded from %1$s) [%2$s]";

    /* renamed from: b */
    private static final String f3275b = "ImageAware is reused for another image. Task is cancelled. [%s]";

    /* renamed from: c */
    private static final String f3276c = "ImageAware was collected by GC. Task is cancelled. [%s]";

    /* renamed from: d */
    private final Bitmap f3277d;

    /* renamed from: e */
    private final String f3278e;

    /* renamed from: f */
    private final AbstractC1333a f3279f;

    /* renamed from: g */
    private final String f3280g;

    /* renamed from: h */
    private final AbstractC1314a f3281h;

    /* renamed from: i */
    private final AbstractC1339a f3282i;

    /* renamed from: j */
    private final C1337f f3283j;

    /* renamed from: k */
    private final EnumC1301f f3284k;

    public RunnableC1305b(Bitmap bitmap, C1343g c1343g, C1337f c1337f, EnumC1301f enumC1301f) {
        this.f3277d = bitmap;
        this.f3278e = c1343g.f3467a;
        this.f3279f = c1343g.f3469c;
        this.f3280g = c1343g.f3468b;
        this.f3281h = c1343g.f3471e.m35849q();
        this.f3282i = c1343g.f3472f;
        this.f3283j = c1337f;
        this.f3284k = enumC1301f;
    }

    /* renamed from: a */
    private boolean m35906a() {
        return !this.f3280g.equals(this.f3283j.m35675a(this.f3279f));
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.f3279f.mo35678e()) {
            C1356d.m35612a(f3276c, this.f3280g);
            this.f3282i.mo35651b(this.f3278e, this.f3279f.mo35679d());
        } else if (m35906a()) {
            C1356d.m35612a(f3275b, this.f3280g);
            this.f3282i.mo35651b(this.f3278e, this.f3279f.mo35679d());
        } else {
            C1356d.m35612a(f3274a, this.f3284k, this.f3280g);
            this.f3281h.mo35795a(this.f3277d, this.f3279f, this.f3284k);
            this.f3283j.m35666b(this.f3279f);
            this.f3282i.mo35653a(this.f3278e, this.f3279f.mo35679d(), this.f3277d);
        }
    }
}
