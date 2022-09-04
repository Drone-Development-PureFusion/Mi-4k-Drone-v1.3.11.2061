package com.fimi.soul.module.droneui;

import android.app.Activity;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.location.Location;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.fimi.overseas.soul.C1704R;
import com.fimi.soul.base.DroidPlannerApp;
import com.fimi.soul.biz.manager.MyLocationManager;
import com.fimi.soul.drone.C2083a;
import com.fimi.soul.drone.C2104d;
import com.google.android.gms.maps.AbstractC8554f;
import com.google.android.gms.maps.C8499b;
import com.google.android.gms.maps.C8500c;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.C8610b;
import com.google.android.gms.maps.model.C8615g;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.firebase.p253b.C9755a;
/* loaded from: classes.dex */
public abstract class DroneMap extends SupportMapFragment implements MyLocationManager.AbstractC1952a, C2104d.AbstractC2106b, AbstractC8554f {

    /* renamed from: m */
    public static final byte f9376m = 80;

    /* renamed from: n */
    public static final byte f9377n = 82;

    /* renamed from: o */
    public static final byte f9378o = 67;

    /* renamed from: q */
    public static final int f9380q = 3;

    /* renamed from: a */
    private SensorManager f9382a;

    /* renamed from: b */
    private Sensor f9383b;

    /* renamed from: d */
    private C8615g f9385d;

    /* renamed from: j */
    protected C8500c f9387j;

    /* renamed from: k */
    public C2083a f9388k;

    /* renamed from: l */
    public static int f9375l = 20;

    /* renamed from: p */
    public static int f9379p = 0;

    /* renamed from: r */
    public static int f9381r = 0;

    /* renamed from: c */
    private boolean f9384c = true;

    /* renamed from: e */
    private long f9386e = System.currentTimeMillis();

    /* renamed from: a */
    private void m30510a(LatLng latLng) {
        this.f9385d = this.f9387j.m11577a(new MarkerOptions().m11353a(latLng).m11352a(C8610b.m11086a((int) C1704R.C1705drawable.location_map)));
        this.f9385d.m11031a(0.5f, 0.5f);
        if (getActivity() == null) {
            return;
        }
        this.f9382a = (SensorManager) getActivity().getSystemService("sensor");
        this.f9383b = this.f9382a.getDefaultSensor(3);
        this.f9382a.registerListener(new SensorEventListener() { // from class: com.fimi.soul.module.droneui.DroneMap.1
            @Override // android.hardware.SensorEventListener
            public void onAccuracyChanged(Sensor sensor, int i) {
            }

            @Override // android.hardware.SensorEventListener
            public void onSensorChanged(SensorEvent sensorEvent) {
                long currentTimeMillis = System.currentTimeMillis();
                if (currentTimeMillis - DroneMap.this.f9386e >= 500) {
                    DroneMap.this.f9386e = currentTimeMillis;
                    if (sensorEvent.sensor.getType() != 3) {
                        return;
                    }
                    float f = sensorEvent.values[0];
                    float f2 = DroneMap.this.f9387j.m11613a().f27433d;
                    if (f + f2 > 360.0f) {
                        DroneMap.this.f9385d.m11024b(((f - f2) + 180.0f) - 90.0f);
                    } else {
                        DroneMap.this.f9385d.m11024b(((f - f2) - 180.0f) - 90.0f);
                    }
                }
            }
        }, this.f9383b, 2);
    }

    @Override // com.fimi.soul.biz.manager.MyLocationManager.AbstractC1952a
    /* renamed from: a */
    public void mo30513a(Location location) {
        if (this.f9387j == null || location == null || location.getLatitude() == C9755a.f30449c || location.getLongitude() == C9755a.f30449c) {
            return;
        }
        this.f9388k.m33034a(location);
        LatLng latLng = new LatLng(location.getLatitude(), location.getLongitude());
        if (this.f9388k.mo32905ac()) {
            return;
        }
        if (!this.f9388k.m32996az()) {
            this.f9388k.m32983g(true);
            this.f9387j.m11609a(C8499b.m11619a(latLng, 18.0f));
        }
        this.f9388k.mo32909a(C2104d.EnumC2105a.QUERYDYNAMICDATAGPS);
        if (this.f9385d == null) {
            m30510a(latLng);
            this.f9388k.m32991c(true);
            return;
        }
        if (!this.f9385d.m11010k()) {
            this.f9385d.m11033a();
            m30510a(latLng);
        }
        this.f9385d.m11030a(latLng);
    }

    /* renamed from: b */
    public void mo11486b(C8500c c8500c) {
        if (c8500c != null) {
            this.f9387j = c8500c;
            this.f9388k.m33029a(this.f9387j);
        }
    }

    /* renamed from: d */
    public void m30508d() {
        super.onDestroy();
    }

    @Override // com.google.android.gms.maps.SupportMapFragment, android.support.p001v4.app.Fragment
    public void onAttach(Activity activity) {
        super.onAttach(activity);
    }

    @Override // com.google.android.gms.maps.SupportMapFragment, android.support.p001v4.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View onCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        this.f9388k = ((DroidPlannerApp) getActivity().getApplication()).f4493a;
        MyLocationManager.m33443a(getActivity()).m33441a(this);
        a((AbstractC8554f) this);
        return onCreateView;
    }

    public void onDroneEvent(C2104d.EnumC2105a enumC2105a, C2083a c2083a) {
        switch (enumC2105a) {
            case MISSION_UPDATE:
            default:
                return;
            case HEARDATA:
                c2083a.mo32894t();
                f9375l = c2083a.m33001au().m32392e();
                return;
        }
    }

    @Override // com.google.android.gms.maps.SupportMapFragment, android.support.p001v4.app.Fragment
    public void onResume() {
        super.onResume();
    }

    @Override // com.google.android.gms.maps.SupportMapFragment, android.support.p001v4.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
    }

    @Override // com.google.android.gms.maps.SupportMapFragment, android.support.p001v4.app.Fragment
    public void onStart() {
        super.onStart();
        this.f9388k.mo32908a(this);
    }

    @Override // com.google.android.gms.maps.SupportMapFragment, android.support.p001v4.app.Fragment
    public void onStop() {
        super.onStop();
        this.f9388k.mo32903b(this);
    }
}
