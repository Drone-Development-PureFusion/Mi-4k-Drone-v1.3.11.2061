package com.fimi.soul.biz.manager;

import android.annotation.SuppressLint;
import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.fimi.soul.biz.p187o.C2022a;
import com.fimi.soul.receiver.NetworkStateReceiver;
import com.fimi.soul.utils.C3078af;
import com.fimi.soul.utils.C3084al;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.AbstractC4489g;
import com.google.android.gms.location.AbstractC8227l;
import com.google.android.gms.location.C8229n;
import com.google.android.gms.location.LocationRequest;
import com.google.firebase.p251a.C9654a;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public class MyLocationManager extends NetworkStateReceiver implements AbstractC4489g.AbstractC4491b, AbstractC4489g.AbstractC4492c, AbstractC8227l {

    /* renamed from: d */
    private static MyLocationManager f5355d;

    /* renamed from: f */
    private Location f5357f;

    /* renamed from: g */
    private LocationManager f5358g;

    /* renamed from: i */
    private AbstractC4489g f5360i;

    /* renamed from: e */
    private Location f5356e = null;

    /* renamed from: h */
    private List<AbstractC1952a> f5359h = new ArrayList();

    /* renamed from: j */
    private int f5361j = 1000;

    /* renamed from: com.fimi.soul.biz.manager.MyLocationManager$a */
    /* loaded from: classes.dex */
    public interface AbstractC1952a {
        /* renamed from: a */
        void mo30513a(Location location);
    }

    @SuppressLint({"ServiceCast"})
    private MyLocationManager(Context context) {
        this.f5358g = (LocationManager) context.getSystemService(C9654a.C9656b.f30231p);
        this.f5360i = new AbstractC4489g.C4490a(context.getApplicationContext()).m23963a((AbstractC4489g.AbstractC4491b) this).m23962a((AbstractC4489g.AbstractC4492c) this).m23968a(C8229n.f26829a).m23957c();
    }

    /* renamed from: a */
    public static MyLocationManager m33443a(Context context) {
        if (f5355d == null) {
            f5355d = new MyLocationManager(context);
        }
        return f5355d;
    }

    /* renamed from: d */
    private void m33437d() {
        if (this.f5360i == null || this.f5360i.mo17353j()) {
            return;
        }
        this.f5360i.mo17358e();
    }

    /* renamed from: a */
    public double m33444a() {
        if (this.f5357f != null) {
            return this.f5357f.getLatitude();
        }
        return -1.0d;
    }

    @Override // com.google.android.gms.common.api.AbstractC4489g.AbstractC4491b
    /* renamed from: a */
    public void mo17285a(int i) {
    }

    /* renamed from: a */
    public void m33442a(Location location) {
        this.f5357f = location;
        this.f5356e = location;
    }

    @Override // com.google.android.gms.common.api.AbstractC4489g.AbstractC4491b
    /* renamed from: a */
    public void mo17281a(@Nullable Bundle bundle) {
        LocationRequest locationRequest = new LocationRequest();
        locationRequest.m12624a(this.f5361j);
        locationRequest.m12617c(this.f5361j);
        locationRequest.m12625a(100);
        C8229n.f26830b.mo12503a(this.f5360i, locationRequest, this);
    }

    /* renamed from: a */
    public void m33441a(AbstractC1952a abstractC1952a) {
        if (!this.f5359h.contains(abstractC1952a)) {
            this.f5359h.add(abstractC1952a);
        }
        m33437d();
    }

    @Override // com.fimi.soul.receiver.NetworkStateReceiver
    /* renamed from: a */
    public void mo29420a(NetworkStateReceiver.EnumC3033a enumC3033a, Context context) {
        if (enumC3033a == null || enumC3033a == NetworkStateReceiver.EnumC3033a.None) {
            return;
        }
        m33437d();
    }

    @Override // com.google.android.gms.common.api.AbstractC4489g.AbstractC4492c
    /* renamed from: a */
    public void mo17280a(@NonNull ConnectionResult connectionResult) {
    }

    /* renamed from: b */
    public double m33440b() {
        if (this.f5357f != null) {
            return this.f5357f.getLongitude();
        }
        return -1.0d;
    }

    @Override // com.google.android.gms.location.AbstractC8227l
    /* renamed from: b */
    public void mo12376b(Location location) {
        if (!C2022a.m33223a().m33221b()) {
            C3084al m29346a = C3078af.m29346a(location.getLatitude(), location.getLongitude());
            location.setLatitude(m29346a.m29322a());
            location.setLongitude(m29346a.m29320b());
        } else {
            location.setLatitude(location.getLatitude());
            location.setLongitude(location.getLongitude());
        }
        m33442a(location);
        for (AbstractC1952a abstractC1952a : this.f5359h) {
            if (abstractC1952a != null) {
                abstractC1952a.mo30513a(location);
            }
        }
    }

    /* renamed from: b */
    public void m33439b(AbstractC1952a abstractC1952a) {
        if (this.f5359h.contains(abstractC1952a)) {
            this.f5359h.remove(abstractC1952a);
        }
    }

    /* renamed from: c */
    public Location m33438c() {
        if (this.f5356e == null) {
            return null;
        }
        return this.f5356e;
    }
}
