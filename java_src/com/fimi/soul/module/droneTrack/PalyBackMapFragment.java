package com.fimi.soul.module.droneTrack;

import android.app.Activity;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.fimi.overseas.soul.C1704R;
import com.fimi.soul.drone.p204h.C2279c;
import com.fimi.soul.drone.p205i.C2302ah;
import com.fimi.soul.drone.p205i.C2311aq;
import com.fimi.soul.drone.p205i.p206a.C2289c;
import com.fimi.soul.module.droneFragment.AbstractC2631d;
import com.fimi.soul.module.droneTrack.p216a.C2672b;
import com.google.android.gms.maps.AbstractC8554f;
import com.google.android.gms.maps.C8499b;
import com.google.android.gms.maps.C8500c;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.C8610b;
import com.google.android.gms.maps.model.C8611c;
import com.google.android.gms.maps.model.C8615g;
import com.google.android.gms.maps.model.C8617i;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.CircleOptions;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.PolylineOptions;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
/* loaded from: classes.dex */
public class PalyBackMapFragment extends SupportMapFragment implements AbstractC2631d, C8500c.AbstractC8527b, AbstractC8554f {

    /* renamed from: a */
    protected C8500c f8997a;

    /* renamed from: b */
    private SharedPreferences f8998b;

    /* renamed from: c */
    private AbstractC2685e f8999c;

    /* renamed from: d */
    private C8615g f9000d;

    /* renamed from: e */
    private C8615g f9001e;

    /* renamed from: f */
    private C8617i f9002f;

    /* renamed from: g */
    private boolean f9003g = true;

    /* renamed from: h */
    private List<C8611c> f9004h = new CopyOnWriteArrayList();

    /* renamed from: i */
    private C8611c f9005i;

    /* renamed from: j */
    private C8611c f9006j;

    /* renamed from: a */
    private C8615g m30800a(LatLng latLng) {
        if (this.f8997a == null) {
            return null;
        }
        return this.f8997a.m11577a(new MarkerOptions().m11352a(C8610b.m11086a((int) C1704R.C1705drawable.icon_fly_handpiece_location)).m11353a(latLng));
    }

    /* renamed from: a */
    private synchronized String m30805a(double d) {
        return String.format("%.8f", Double.valueOf(d));
    }

    /* renamed from: a */
    private void m30799a(LatLng latLng, int i, int i2) {
        int i3 = this.f8998b.getInt(C2279c.f7282s, 1);
        if (i2 == 3) {
            if (this.f9006j != null) {
                this.f9006j.m11075a(latLng);
                if (i != this.f9006j.m11068d()) {
                    this.f9006j.m11078a(i + 100);
                }
            } else if (this.f8997a != null) {
                this.f9006j = this.f8997a.m11581a(new CircleOptions().m11413a(latLng).m11416a(i + 100).m11414a(Color.argb(127, 0, 0, 0)).m11415a(2.0f).m11409b(1 == i3 ? Color.argb(204, 198, 200, 203) : Color.argb(204, 101, 104, 106)));
            }
        } else if (this.f9006j != null) {
            this.f9006j.m11079a();
            this.f9006j = null;
        }
        if (this.f9005i != null && this.f9004h.contains(this.f9005i)) {
            this.f9005i.m11075a(latLng);
            if (i != this.f9005i.m11068d()) {
                this.f9005i.m11078a(i);
            }
        } else if (this.f8997a != null) {
            this.f9005i = this.f8997a.m11581a(new CircleOptions().m11413a(latLng).m11416a(i).m11414a(Color.argb(127, 255, 54, 0)).m11415a(2.0f).m11409b(Color.argb(51, 255, 54, 0)).m11410b(100.0f));
        }
        if (!this.f9004h.contains(this.f9005i)) {
            this.f9004h.add(this.f9005i);
        }
    }

    /* renamed from: b */
    private C8617i m30794b(List<LatLng> list) {
        if (this.f8997a == null) {
            return null;
        }
        return this.f8997a.m11575a(new PolylineOptions().m11301a(list).m11303a(Color.rgb(255, 42, 92)).m11304a(3.0f));
    }

    /* renamed from: d */
    private void m30792d() {
        this.f8997a.m11611a(this.f8998b.getInt(C2279c.f7235bK, 1));
        if (this.f8999c != null) {
            this.f8999c.mo30632a(this.f8997a.m11561g());
        }
        this.f8997a.m11572a(false);
        this.f8997a.m11555m().m11451a(false);
        this.f8997a.m11606a(this);
    }

    /* renamed from: g */
    private synchronized float m30791g() {
        CameraPosition m11613a;
        float f = 0.0f;
        synchronized (this) {
            try {
                if (this.f8997a != null && (m11613a = this.f8997a.m11613a()) != null) {
                    f = m11613a.f27433d;
                }
            } catch (Exception e) {
            }
        }
        return f;
    }

    /* renamed from: a */
    public int m30806a() {
        int i = 2;
        if (this.f8998b.getInt(C2279c.f7235bK, 1) == 1) {
            this.f8998b.edit().putInt(C2279c.f7235bK, 2).commit();
        } else {
            this.f8998b.edit().putInt(C2279c.f7235bK, 1).commit();
            i = 1;
        }
        if (this.f8997a != null) {
            this.f8997a.m11611a(i);
        }
        return i;
    }

    @Override // com.google.android.gms.maps.C8500c.AbstractC8527b
    /* renamed from: a */
    public View mo11520a(C8615g c8615g) {
        View inflate = LayoutInflater.from(getActivity()).inflate(C1704R.layout.play_back_inforwindow, (ViewGroup) null);
        ((TextView) inflate.findViewById(C1704R.C1706id.drone_location)).setText(c8615g.m11016e());
        return inflate;
    }

    /* renamed from: a */
    public void m30804a(float f) {
        if (this.f9001e != null) {
            float m30791g = m30791g();
            if (f < 0.0f) {
                f += 360.0f;
            }
            this.f9001e.m11024b(m30791g + f);
        }
    }

    /* renamed from: a */
    public void m30803a(C2289c c2289c) {
        m30799a(new LatLng(c2289c.m32406f(), c2289c.m32405g()), c2289c.m32409c() * 10, c2289c.m32407e());
    }

    /* renamed from: a */
    public void m30802a(C2302ah c2302ah) {
        LatLng latLng = new LatLng(c2302ah.m32302b(), c2302ah.m32301c());
        if (this.f9000d != null) {
            this.f9000d.m11030a(latLng);
        } else if (this.f8997a == null) {
        } else {
            this.f9000d = this.f8997a.m11577a(new MarkerOptions().m11352a(C8610b.m11086a((int) C1704R.C1705drawable.home_point)).m11353a(latLng));
        }
    }

    /* renamed from: a */
    public void m30801a(C2311aq c2311aq) {
        LatLng latLng = new LatLng(c2311aq.m32189f(), c2311aq.m32190e());
        List<LatLng> m30693c = C2672b.m30703a().m30693c();
        if (!m30693c.contains(latLng)) {
            m30693c.add(latLng);
        }
        if (this.f9001e == null) {
            this.f9001e = m30800a(latLng);
            if (this.f9001e != null) {
                this.f9001e.m11031a(0.5f, 0.5f);
            }
        } else {
            this.f9001e.m11030a(latLng);
        }
        if (this.f9001e != null) {
            String m30805a = m30805a(latLng.f27462a);
            this.f9001e.m11027a(m30805a + "，" + m30805a(latLng.f27463b));
            this.f9001e.m11013h();
        }
        m30797a(m30693c);
    }

    @Override // com.fimi.soul.module.droneFragment.AbstractC2631d
    /* renamed from: a */
    public void mo30502a(C8500c c8500c) {
    }

    /* renamed from: a */
    public void m30798a(LatLng latLng, List<LatLng> list) {
        if (latLng == null || list == null) {
            return;
        }
        if (this.f9001e != null) {
            this.f9001e.m11030a(latLng);
        } else {
            this.f9001e = m30800a(latLng);
            this.f9001e.m11031a(0.5f, 0.5f);
        }
        if (this.f9001e != null) {
            String m30805a = m30805a(latLng.f27462a);
            this.f9001e.m11027a(m30805a + "，" + m30805a(latLng.f27463b));
            this.f9001e.m11013h();
        }
        m30797a(list);
    }

    /* renamed from: a */
    public void m30797a(List<LatLng> list) {
        if (list == null) {
            return;
        }
        if (this.f9002f == null) {
            this.f9002f = m30794b(list);
        } else {
            this.f9002f.m10982a(list);
        }
        if (!this.f9003g || this.f8997a == null) {
            return;
        }
        m30796a(false);
        this.f8997a.m11609a(C8499b.m11619a(list.get(0), 18.0f));
    }

    /* renamed from: a */
    public void m30796a(boolean z) {
        this.f9003g = z;
    }

    @Override // com.google.android.gms.maps.C8500c.AbstractC8527b
    /* renamed from: b */
    public View mo11519b(C8615g c8615g) {
        return null;
    }

    /* renamed from: b */
    public void m30795b() {
        if (this.f9000d != null) {
            this.f9000d.m11033a();
            this.f9000d = null;
        }
        if (this.f9001e != null) {
            this.f9001e.m11033a();
            this.f9001e = null;
        }
        if (this.f9002f != null) {
            this.f9002f.m10985a();
            this.f9002f = null;
        }
    }

    @Override // com.google.android.gms.maps.AbstractC8554f
    /* renamed from: b */
    public void mo11486b(C8500c c8500c) {
        if (c8500c != null) {
            this.f8997a = c8500c;
            m30792d();
        }
    }

    /* renamed from: c */
    public boolean m30793c() {
        return this.f9003g;
    }

    @Override // com.google.android.gms.maps.SupportMapFragment, android.support.p001v4.app.Fragment
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        this.f8999c = (AbstractC2685e) activity;
    }

    @Override // com.google.android.gms.maps.SupportMapFragment, android.support.p001v4.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f8998b = PreferenceManager.getDefaultSharedPreferences(getActivity());
    }

    @Override // com.google.android.gms.maps.SupportMapFragment, android.support.p001v4.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View onCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        a(this);
        return onCreateView;
    }

    @Override // com.google.android.gms.maps.SupportMapFragment, android.support.p001v4.app.Fragment
    public void onDestroy() {
        if (this.f8999c != null) {
            this.f8999c = null;
        }
        if (this.f9000d != null) {
            this.f9000d.m11033a();
            this.f9000d = null;
        }
        if (this.f9001e != null) {
            this.f9001e.m11033a();
            this.f9001e = null;
        }
        if (this.f9002f != null) {
            this.f9002f.m10985a();
            this.f9002f = null;
        }
        if (this.f9005i != null) {
            this.f9005i.m11079a();
            this.f9005i = null;
        }
        if (this.f9006j != null) {
            this.f9006j.m11079a();
            this.f9006j = null;
        }
        this.f9004h.clear();
        super.onDestroy();
    }

    @Override // com.google.android.gms.maps.SupportMapFragment, android.support.p001v4.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
    }
}
