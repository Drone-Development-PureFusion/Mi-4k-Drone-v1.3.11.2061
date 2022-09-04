package com.fimi.soul.module.update.p218a;

import android.content.Context;
import android.util.Log;
import com.fimi.kernel.C1642c;
import com.fimi.soul.biz.camera.C1783b;
import com.fimi.soul.biz.camera.C1827d;
import com.fimi.soul.biz.p170b.C1772d;
import com.fimi.soul.biz.p180h.C1849a;
import com.fimi.soul.biz.update.C2065f;
import com.fimi.soul.drone.C2083a;
import com.fimi.soul.drone.C2104d;
import com.fimi.soul.drone.p201e.C2253f;
import com.fimi.soul.drone.p205i.C2296ab;
import com.fimi.soul.drone.p205i.C2349j;
import com.fimi.soul.entity.CameraValue;
import com.fimi.soul.entity.DroneInfoBean;
import com.fimi.soul.module.p214c.C2523d;
import org.codehaus.jackson.smile.SmileConstants;
/* renamed from: com.fimi.soul.module.update.a.g */
/* loaded from: classes.dex */
public class C3027g implements C2104d.AbstractC2106b {

    /* renamed from: a */
    Context f11251a;

    /* renamed from: b */
    C2083a f11252b;

    /* renamed from: c */
    C3021a f11253c = C3021a.m29616a();

    /* renamed from: d */
    C1827d f11254d = (C1827d) C1783b.m34166a().m34150d();

    public C3027g(Context context, C2083a c2083a) {
        this.f11251a = context;
        this.f11252b = c2083a;
        c2083a.mo32908a(this);
        C1642c.m34887c().mo34880a(C2065f.f5795j, DroneInfoBean.class);
    }

    public C3027g(C2083a c2083a) {
        this.f11252b = c2083a;
        c2083a.mo32908a(this);
        C1642c.m34887c().mo34880a(C2065f.f5795j, DroneInfoBean.class);
    }

    /* renamed from: a */
    private void m29534a(C2296ab c2296ab) {
        int m32379c = c2296ab.m32379c() & 65535;
        char m32380b = c2296ab.m32380b();
        int m32382a = c2296ab.m32382a() & SmileConstants.BYTE_MARKER_END_OF_CONTENT;
        byte m32378d = c2296ab.m32378d();
        long m32377e = c2296ab.m32377e();
        long m32376f = c2296ab.m32376f();
        long m32375g = c2296ab.m32375g();
        long m32374h = c2296ab.m32374h();
        if (m32379c > 0) {
            Log.d("moweiru", "type:" + m32382a + ";model:" + ((int) m32378d));
            this.f11253c.m29613a(new C3025e(m32382a, m32378d, m32379c, String.valueOf(Long.valueOf(m32380b)), m32377e, m32376f, m32375g, m32374h));
            this.f11253c.m29614a(m32382a, m32379c);
        }
        if (c2296ab.m32382a() == 0) {
            C1849a.m33913a().m33912a(c2296ab);
        }
    }

    /* renamed from: a */
    public void m29535a() {
        if (this.f11252b.f5918c.mo32435a() == 51) {
            C2349j c2349j = (C2349j) this.f11252b.f5918c;
            this.f11254d.j().setDvVersion(c2349j.m31927d() + "");
            this.f11254d.j().setCameraType(c2349j.m31932b());
            if (C1772d.m34208a().m34187k()) {
                this.f11253c.m29614a(13, c2349j.m31927d());
                this.f11253c.m29613a(new C3025e("", 13, c2349j.m31927d()));
            } else {
                this.f11253c.m29614a(4, c2349j.m31927d());
                this.f11253c.m29613a(new C3025e("", 4, c2349j.m31927d()));
            }
            CameraValue.version = c2349j.m31927d();
        }
    }

    /* renamed from: b */
    public void m29533b() {
        this.f11254d.m33986x().mo34001j();
        if (!C3021a.m29616a().m29611b().containsKey(3)) {
            C2523d.m31374a(this.f11252b).m31370b(3);
            C2253f.m32550c(this.f11252b);
        }
    }

    /* renamed from: c */
    public void m29532c() {
        C2253f.m32541l(this.f11252b);
        this.f11254d.m33986x().mo34001j();
    }

    /* renamed from: d */
    public void m29531d() {
        C2253f.m32542k(this.f11252b);
        this.f11254d.m33986x().mo34001j();
    }

    /* renamed from: e */
    public void m29530e() {
        this.f11252b.mo32903b(this);
    }

    @Override // com.fimi.soul.drone.C2104d.AbstractC2106b
    public void onDroneEvent(C2104d.EnumC2105a enumC2105a, C2083a c2083a) {
        switch (enumC2105a) {
            case FCVERSION2:
                m29534a(c2083a.mo32902l());
                return;
            case OnRecivedCloudCameraCommandInfo:
                m29535a();
                return;
            default:
                return;
        }
    }
}
