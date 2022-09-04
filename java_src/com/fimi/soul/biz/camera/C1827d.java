package com.fimi.soul.biz.camera;

import com.fimi.soul.biz.camera.p173b.AbstractC1789c;
import com.fimi.soul.biz.camera.p174c.AbstractC1808a;
import com.fimi.soul.biz.camera.p174c.C1809b;
import com.fimi.soul.biz.camera.p174c.C1814c;
import com.fimi.soul.biz.camera.p174c.C1820d;
import com.fimi.soul.biz.camera.p174c.C1824e;
import com.fimi.soul.biz.camera.p174c.C1825f;
import com.fimi.soul.biz.camera.p174c.C1826g;
import java.text.SimpleDateFormat;
import java.util.Date;
/* renamed from: com.fimi.soul.biz.camera.d */
/* loaded from: classes.dex */
public class C1827d extends AbstractC1794c {

    /* renamed from: d */
    private C1814c f4765d = new C1814c(this);

    /* renamed from: e */
    private C1820d f4766e = new C1820d(this);

    /* renamed from: f */
    private C1825f f4767f = new C1825f(this);

    /* renamed from: g */
    private C1824e f4768g = new C1824e(this);

    /* renamed from: h */
    private C1826g f4769h = new C1826g(this);

    /* renamed from: i */
    private C1809b f4770i = new C1809b(this);

    public C1827d(AbstractC1789c abstractC1789c) {
        super(abstractC1789c);
        a((AbstractC1808a) this.f4765d);
        a((AbstractC1808a) this.f4766e);
        a((AbstractC1808a) this.f4767f);
        a((AbstractC1808a) this.f4768g);
        a((AbstractC1808a) this.f4769h);
        a((AbstractC1808a) this.f4770i);
    }

    /* renamed from: t */
    public C1826g m33990t() {
        return this.f4769h;
    }

    /* renamed from: u */
    public C1814c m33989u() {
        return this.f4765d;
    }

    /* renamed from: v */
    public C1820d m33988v() {
        return this.f4766e;
    }

    /* renamed from: w */
    public C1825f m33987w() {
        return this.f4767f;
    }

    /* renamed from: x */
    public C1824e m33986x() {
        return C1783b.m34166a().m34157b() ? this.f4768g : this.f4770i;
    }

    /* renamed from: y */
    public C1824e m33985y() {
        return this.f4768g;
    }

    /* renamed from: z */
    public void m33984z() {
        m33989u().m34054a(C1831e.f4855bB, new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()));
    }
}
