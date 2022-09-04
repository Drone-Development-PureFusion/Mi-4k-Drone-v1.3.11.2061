package com.fimi.soul.biz.camera.p174c;

import com.fimi.soul.biz.camera.AbstractC1794c;
import com.fimi.soul.biz.camera.C1831e;
import com.fimi.soul.biz.p170b.C1772d;
import com.fimi.soul.drone.C2083a;
import com.fimi.soul.drone.C2104d;
import com.fimi.soul.drone.p195d.p196a.p197a.C2172f;
import com.fimi.soul.drone.p204h.C2283f;
import com.fimi.soul.drone.p205i.C2338h;
import com.fimi.soul.drone.p205i.C2349j;
/* renamed from: com.fimi.soul.biz.camera.c.b */
/* loaded from: classes.dex */
public class C1809b extends C1824e {

    /* renamed from: h */
    private static C2283f f4715h;

    /* renamed from: a */
    private C2172f f4716a;

    /* renamed from: b */
    private boolean f4717b = false;

    /* renamed from: c */
    private boolean f4718c = false;

    /* renamed from: d */
    private boolean f4719d = false;

    /* renamed from: e */
    private int f4720e = 0;

    /* renamed from: f */
    private int f4721f = 0;

    /* renamed from: g */
    private C2283f f4722g;

    public C1809b(AbstractC1794c abstractC1794c) {
        super(abstractC1794c);
        f4715h = new C2283f(1000, new Runnable() { // from class: com.fimi.soul.biz.camera.c.b.1
            @Override // java.lang.Runnable
            public void run() {
                C1809b.m34072a(C1809b.this);
                if (C1809b.this.f4720e > 10) {
                    C1809b.this.f4719d = false;
                    C1809b.f4715h.m32437e();
                }
            }
        });
        m34061o();
    }

    /* renamed from: a */
    static /* synthetic */ int m34072a(C1809b c1809b) {
        int i = c1809b.f4720e;
        c1809b.f4720e = i + 1;
        return i;
    }

    /* renamed from: a */
    private void m34073a(AbstractC1794c.EnumC1804a enumC1804a) {
        if (a().m34092m() != null) {
            a().m34092m().mo31105a(enumC1804a, a().m34098g());
        }
    }

    /* renamed from: a */
    private void m34068a(C2083a c2083a) {
        AbstractC1794c.EnumC1804a m34098g = a().m34098g();
        switch (((C2338h) c2083a.f5918c).m31974f()) {
            case VideoRecording:
                a().m34137a(AbstractC1794c.EnumC1804a.Recoding);
                break;
            case PhotoShoting:
                a().m34137a(AbstractC1794c.EnumC1804a.ContinueCapturing);
                break;
            case NormalReady:
                a().m34137a(AbstractC1794c.EnumC1804a.Normal);
                break;
        }
        m34073a(m34098g);
    }

    /* renamed from: c */
    static /* synthetic */ int m34065c(C1809b c1809b) {
        int i = c1809b.f4721f;
        c1809b.f4721f = i + 1;
        return i;
    }

    /* renamed from: o */
    private void m34061o() {
        this.f4722g = new C2283f(1000, new Runnable() { // from class: com.fimi.soul.biz.camera.c.b.3
            @Override // java.lang.Runnable
            public void run() {
                C1809b.m34065c(C1809b.this);
                if (C1809b.this.f4721f > 2) {
                    if (!C1772d.m34208a().m34187k()) {
                        C1809b.this.mo34002i();
                    }
                    C1809b.this.f4721f = 0;
                }
            }
        });
    }

    @Override // com.fimi.soul.biz.camera.p174c.C1824e
    /* renamed from: a */
    public void mo34009a(C1831e.EnumC1832a enumC1832a) {
        if (this.f4716a != null) {
            this.f4716a.m32860a(enumC1832a);
        }
    }

    @Override // com.fimi.soul.biz.camera.p174c.C1824e
    /* renamed from: b */
    public boolean mo34008b() {
        return this.f4719d;
    }

    @Override // com.fimi.soul.biz.camera.p174c.C1824e
    /* renamed from: c */
    public void mo34007c() {
        if (this.f4716a != null) {
            this.f4717b = true;
            this.f4716a.m32843f();
        }
    }

    @Override // com.fimi.soul.biz.camera.p174c.C1824e
    /* renamed from: d */
    public void mo34006d() {
        m34063h();
    }

    @Override // com.fimi.soul.biz.camera.p174c.C1824e
    /* renamed from: e */
    public void mo34005e() {
        if (this.f4716a != null) {
            this.f4718c = true;
            this.f4716a.m32840i();
        }
    }

    @Override // com.fimi.soul.biz.camera.p174c.C1824e
    /* renamed from: f */
    public void mo34004f() {
        if (this.f4716a != null) {
            this.f4718c = true;
            this.f4716a.m32849b();
        }
    }

    @Override // com.fimi.soul.biz.camera.p174c.C1824e
    /* renamed from: g */
    public void mo34003g() {
        if (this.f4716a != null) {
            this.f4718c = true;
            this.f4716a.m32845d();
        }
    }

    /* renamed from: h */
    public void m34063h() {
        if (this.f4716a != null) {
            this.f4718c = true;
            this.f4716a.m32841h();
        }
    }

    @Override // com.fimi.soul.biz.camera.p174c.C1824e
    /* renamed from: i */
    public void mo34002i() {
        if (this.f4716a != null) {
            this.f4718c = true;
            this.f4716a.m32863a();
        }
    }

    @Override // com.fimi.soul.biz.camera.p174c.C1824e
    /* renamed from: j */
    public void mo34001j() {
        if (this.f4716a != null) {
            this.f4718c = true;
            this.f4716a.m32847c();
        }
    }

    @Override // com.fimi.soul.biz.camera.p174c.C1824e
    /* renamed from: k */
    public void mo34000k() {
        if (this.f4716a != null) {
            this.f4717b = true;
            this.f4716a.m32842g();
        }
    }

    @Override // com.fimi.soul.biz.camera.p174c.C1824e, com.fimi.soul.drone.C2104d.AbstractC2106b
    public void onDroneEvent(C2104d.EnumC2105a enumC2105a, C2083a c2083a) {
        if (!c2083a.mo32905ac() || !c2083a.mo32906ab().mo32588a()) {
            if (f4715h != null) {
                f4715h.m32437e();
            }
            this.f4719d = false;
            if (this.f4722g == null) {
                return;
            }
            this.f4722g.m32436f();
            this.f4722g = null;
            return;
        }
        if (this.f4722g == null) {
            m34061o();
            this.f4722g.m32441c();
        }
        if (this.f4716a == null && c2083a != null) {
            this.f4716a = C2172f.m32859a(c2083a);
            this.f4716a.m32863a();
        }
        if (enumC2105a != C2104d.EnumC2105a.OnRecivedCloudCameraCommandInfo || c2083a.f5918c == null) {
            return;
        }
        int mo32435a = c2083a.f5918c.mo32435a();
        if (mo32435a == 50) {
            this.f4721f = 0;
            switch (((C2338h) c2083a.f5918c).m31974f()) {
                case VideoRecording:
                    this.f4719d = true;
                    this.f4720e = 0;
                    if (f4715h == null) {
                        f4715h = new C2283f(1000, new Runnable() { // from class: com.fimi.soul.biz.camera.c.b.2
                            @Override // java.lang.Runnable
                            public void run() {
                                C1809b.m34072a(C1809b.this);
                                if (C1809b.this.f4720e > 10) {
                                    C1809b.this.f4719d = false;
                                    C1809b.f4715h.m32437e();
                                }
                            }
                        });
                    }
                    f4715h.m32439d();
                    return;
                default:
                    return;
            }
        } else if (mo32435a != 49) {
        } else {
            C2349j c2349j = (C2349j) c2083a.f5918c;
            if (c2349j.m31926e() == C2349j.EnumC2350a.StartRecord) {
                this.f4719d = true;
                this.f4720e = 0;
                if (f4715h == null) {
                    return;
                }
                f4715h.m32439d();
            } else if (c2349j.m31926e() != C2349j.EnumC2350a.StopRecrod) {
            } else {
                this.f4719d = false;
                if (f4715h == null) {
                    return;
                }
                f4715h.m32437e();
            }
        }
    }
}
