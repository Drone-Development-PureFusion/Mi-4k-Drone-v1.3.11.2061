package com.fimi.soul.biz.p186n;

import android.location.Location;
import android.widget.ImageButton;
import com.fimi.overseas.soul.C1704R;
import com.fimi.soul.drone.C2083a;
import com.google.android.gms.maps.C8499b;
import com.google.android.gms.maps.C8500c;
import com.google.android.gms.maps.model.LatLng;
import java.lang.ref.WeakReference;
/* renamed from: com.fimi.soul.biz.n.a */
/* loaded from: classes.dex */
public class C2018a {

    /* renamed from: e */
    private static C2018a f5678e;

    /* renamed from: b */
    private ImageButton f5680b;

    /* renamed from: c */
    private C2083a f5681c;

    /* renamed from: f */
    private WeakReference<ImageButton> f5683f;

    /* renamed from: a */
    public volatile EnumC2021a f5679a = EnumC2021a.DRONE;

    /* renamed from: d */
    private int f5682d = 0;

    /* renamed from: g */
    private volatile boolean f5684g = true;

    /* renamed from: h */
    private int f5685h = 18;

    /* renamed from: com.fimi.soul.biz.n.a$a */
    /* loaded from: classes.dex */
    public enum EnumC2021a {
        PEOPLE,
        DRONE,
        DRONEPRESS,
        CACHESTATUS
    }

    /* renamed from: a */
    public static C2018a m33233a() {
        if (f5678e == null) {
            f5678e = new C2018a();
        }
        return f5678e;
    }

    /* renamed from: a */
    public void m33232a(int i) {
        if (this.f5680b == null || this.f5682d == i) {
            return;
        }
        this.f5680b.setImageResource(i);
        this.f5682d = i;
    }

    /* renamed from: a */
    public void m33231a(ImageButton imageButton, C2083a c2083a) {
        this.f5683f = new WeakReference<>(imageButton);
        this.f5680b = this.f5683f.get();
        this.f5681c = c2083a;
        m33227b();
    }

    /* renamed from: a */
    public void m33230a(EnumC2021a enumC2021a) {
        this.f5679a = enumC2021a;
    }

    /* renamed from: a */
    public void m33229a(LatLng latLng) {
        C8500c m33012aj = this.f5681c.m33012aj();
        if (m33012aj == null || latLng == null) {
            return;
        }
        m33012aj.m11608a(C8499b.m11620a(latLng), 300, new C8500c.AbstractC8526a() { // from class: com.fimi.soul.biz.n.a.1
            @Override // com.google.android.gms.maps.C8500c.AbstractC8526a
            /* renamed from: a */
            public void mo11522a() {
            }

            @Override // com.google.android.gms.maps.C8500c.AbstractC8526a
            /* renamed from: b */
            public void mo11521b() {
            }
        });
    }

    /* renamed from: a */
    public void m33228a(boolean z) {
        this.f5684g = z;
    }

    /* renamed from: b */
    public void m33227b() {
        if (!this.f5681c.mo32905ac() || this.f5681c.mo32891w().m32191d() < 3) {
            m33230a(EnumC2021a.PEOPLE);
            m33232a(C1704R.C1705drawable.locationbutton);
        } else if (this.f5679a == EnumC2021a.DRONEPRESS) {
            m33230a(EnumC2021a.DRONEPRESS);
            m33232a(C1704R.mipmap.btn_fly_location_plane_checked);
        } else {
            m33230a(EnumC2021a.DRONE);
            m33232a(C1704R.mipmap.btn_fly_location_plane_normal);
        }
    }

    /* renamed from: c */
    public EnumC2021a m33226c() {
        return this.f5679a;
    }

    /* renamed from: d */
    public void m33225d() {
        C8500c m33012aj = this.f5681c.m33012aj();
        if (m33012aj != null) {
            switch (this.f5679a) {
                case DRONE:
                    m33232a(C1704R.mipmap.btn_fly_location_plane_checked);
                    m33230a(EnumC2021a.DRONEPRESS);
                    m33012aj.m11609a(C8499b.m11615b(this.f5685h));
                    return;
                case PEOPLE:
                    Location m32995b = this.f5681c.m32995b();
                    if (m32995b == null) {
                        return;
                    }
                    m33012aj.m11569b(C8499b.m11619a(new LatLng(m32995b.getLatitude(), m32995b.getLongitude()), 18.0f));
                    return;
                case DRONEPRESS:
                    m33232a(C1704R.mipmap.btn_fly_location_plane_normal);
                    m33230a(EnumC2021a.DRONE);
                    return;
                default:
                    return;
            }
        }
    }

    /* renamed from: e */
    public boolean m33224e() {
        return this.f5684g;
    }
}
