package com.fimi.soul.module.droneFragment;

import android.annotation.TargetApi;
import com.fimi.overseas.soul.C1704R;
import com.fimi.soul.drone.p204h.C2279c;
import com.google.android.gms.maps.C8500c;
import com.google.android.gms.maps.model.C8575a;
import com.google.android.gms.maps.model.C8610b;
import com.google.android.gms.maps.model.C8615g;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import java.util.HashMap;
@TargetApi(19)
/* renamed from: com.fimi.soul.module.droneFragment.g */
/* loaded from: classes.dex */
public class C2652g {

    /* renamed from: d */
    private static C2652g f8912d;

    /* renamed from: a */
    C8615g f8913a;

    /* renamed from: b */
    private C8500c f8914b;

    /* renamed from: c */
    private HashMap<String, C8615g> f8915c = new HashMap<>();

    /* renamed from: e */
    private C8615g f8916e;

    /* renamed from: f */
    private LatLng f8917f;

    /* renamed from: g */
    private C8575a f8918g;

    /* renamed from: h */
    private C8575a f8919h;

    private C2652g() {
        this.f8915c.clear();
    }

    /* renamed from: a */
    public static C2652g m30871a() {
        if (f8912d == null) {
            f8912d = new C2652g();
        }
        return f8912d;
    }

    /* renamed from: d */
    private MarkerOptions m30865d(String str) {
        return new MarkerOptions().m11353a(this.f8917f).m11352a(m30866c(str));
    }

    /* renamed from: a */
    public void m30870a(C8500c c8500c, LatLng latLng) {
        this.f8914b = c8500c;
        this.f8917f = latLng;
    }

    /* renamed from: a */
    public void m30869a(String str) {
        if (this.f8915c.containsKey(str)) {
            this.f8915c.get(str).m11030a(this.f8917f);
            this.f8915c.get(str).m11021b(true);
            return;
        }
        this.f8913a = this.f8914b.m11577a(m30865d(str));
        this.f8913a.m11028a((Object) str);
        if (C2279c.f7169Y.equals(str)) {
            this.f8913a.m11031a(0.15f, 1.0f);
            this.f8913a.m11032a(80.0f);
        } else {
            this.f8913a.m11031a(0.5f, 0.5f);
            this.f8913a.m11032a(100.0f);
        }
        this.f8915c.put(str, this.f8913a);
    }

    /* renamed from: b */
    public void m30868b() {
        for (String str : this.f8915c.keySet()) {
            this.f8915c.get(str).m11033a();
        }
        this.f8915c.clear();
    }

    /* renamed from: b */
    public void m30867b(String str) {
        if (this.f8915c.containsKey(str)) {
            this.f8916e = this.f8915c.get(str);
            this.f8915c.remove(str);
            this.f8916e.m11033a();
        }
    }

    /* renamed from: c */
    protected C8575a m30866c(String str) {
        if (C2279c.f7168X.equals(str)) {
            if (this.f8919h == null) {
                this.f8919h = C8610b.m11086a((int) C1704R.C1705drawable.fuselage);
            }
            return this.f8919h;
        }
        if (this.f8918g == null) {
            this.f8918g = C8610b.m11086a((int) C1704R.C1705drawable.home_point);
        }
        return this.f8918g;
    }
}
