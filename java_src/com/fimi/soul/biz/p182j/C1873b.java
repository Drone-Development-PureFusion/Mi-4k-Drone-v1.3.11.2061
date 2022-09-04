package com.fimi.soul.biz.p182j;

import android.content.Context;
import com.fimi.overseas.soul.C1704R;
import com.fimi.soul.biz.p187o.C2022a;
import com.fimi.soul.drone.C2083a;
import com.fimi.soul.utils.C3078af;
import com.fimi.soul.utils.C3084al;
import com.google.android.gms.maps.C8500c;
import com.google.android.gms.maps.model.C8615g;
import com.google.android.gms.maps.model.C8617i;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import java.util.List;
/* renamed from: com.fimi.soul.biz.j.b */
/* loaded from: classes.dex */
public class C1873b {

    /* renamed from: a */
    public volatile boolean f5092a;

    /* renamed from: b */
    private C8500c f5093b;

    /* renamed from: c */
    private Context f5094c;

    /* renamed from: d */
    private C2083a f5095d;

    /* renamed from: e */
    private C8615g f5096e;

    /* renamed from: f */
    private C8617i f5097f;

    /* renamed from: g */
    private boolean f5098g;

    public C1873b(C8500c c8500c, Context context, C2083a c2083a) {
        this.f5095d = c2083a;
        this.f5093b = c8500c;
        this.f5094c = context;
    }

    /* renamed from: a */
    public void m33836a() {
        m33835a(new LatLng(this.f5095d.mo32891w().m32189f(), this.f5095d.mo32891w().m32190e()));
    }

    /* renamed from: a */
    public void m33835a(LatLng latLng) {
        if (this.f5096e == null) {
            this.f5096e = this.f5093b.m11577a(new MarkerOptions().m11352a(C1884j.m33758a(C1704R.C1705drawable.img_fly_origin_blue)).m11353a(latLng));
            this.f5096e.m11031a(0.5f, 0.88f);
            this.f5096e.m11028a(this);
        }
    }

    /* renamed from: b */
    public void m33834b() {
        if (this.f5096e != null) {
            this.f5096e.m11029a(C1884j.m33758a(C1704R.C1705drawable.img_fly_origin_red));
        }
    }

    /* renamed from: b */
    public void m33833b(LatLng latLng) {
        List<LatLng> m33798c = C1877d.m33782p().m33798c();
        if (m33798c == null || m33798c.contains(latLng)) {
            return;
        }
        m33798c.add(latLng);
        if (m33798c.size() < 2) {
            return;
        }
        if (this.f5097f == null) {
            this.f5097f = this.f5093b.m11575a(C1883i.m33759a(m33798c, 4, this.f5094c.getResources().getColor(C1704R.color.drone_inface_line)).m11297b(50.0f));
        } else {
            this.f5097f.m10982a(m33798c);
        }
    }

    /* renamed from: c */
    public void m33832c() {
        if (this.f5096e != null) {
            this.f5096e.m11033a();
            this.f5096e = null;
        }
        if (this.f5097f != null) {
            this.f5097f.m10985a();
            this.f5097f = null;
        }
    }

    /* renamed from: d */
    public void m33831d() {
        this.f5092a = false;
        if (this.f5096e != null) {
            this.f5096e.m11027a(this.f5095d.f5919d.getString(C1704R.C1707string.delete_marker));
            this.f5096e.m11013h();
        }
    }

    /* renamed from: e */
    public void m33830e() {
        this.f5092a = false;
        if (this.f5096e != null) {
            this.f5096e.m11012i();
        }
    }

    /* renamed from: f */
    public void m33829f() {
        this.f5092a = true;
        if (this.f5096e != null) {
            this.f5096e.m11012i();
        }
    }

    /* renamed from: g */
    public boolean m33828g() {
        return this.f5096e == null;
    }

    /* renamed from: h */
    public void m33827h() {
        LatLng latLng;
        if (this.f5096e != null) {
            LatLng m11020c = this.f5096e.m11020c();
            if (!C2022a.m33223a().m33221b() && !this.f5098g) {
                C3084al m29346a = C3078af.m29346a(m11020c.f27462a, m11020c.f27463b);
                latLng = new LatLng(m29346a.m29322a(), m29346a.m29320b());
                this.f5098g = true;
            } else if (this.f5098g) {
                C3084al m29345a = C3078af.m29345a(0.5d, m11020c.f27462a, m11020c.f27463b);
                latLng = new LatLng(m29345a.m29322a(), m29345a.m29320b());
                this.f5098g = false;
            } else {
                latLng = m11020c;
            }
            this.f5096e.m11030a(latLng);
            C1877d.m33782p().m33798c().clear();
            if (this.f5097f == null) {
                return;
            }
            this.f5097f.m10985a();
            this.f5097f = null;
        }
    }
}
