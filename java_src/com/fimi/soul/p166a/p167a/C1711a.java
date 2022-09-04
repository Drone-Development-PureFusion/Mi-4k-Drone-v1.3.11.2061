package com.fimi.soul.p166a.p167a;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
/* renamed from: com.fimi.soul.a.a.a */
/* loaded from: classes.dex */
public class C1711a implements SensorEventListener {

    /* renamed from: a */
    boolean f4296a = true;

    /* renamed from: b */
    private Context f4297b;

    /* renamed from: c */
    private SensorManager f4298c;

    /* renamed from: d */
    private Sensor f4299d;

    /* renamed from: e */
    private Sensor f4300e;

    /* renamed from: f */
    private float f4301f;

    /* renamed from: g */
    private AbstractC1712a f4302g;

    /* renamed from: com.fimi.soul.a.a.a$a */
    /* loaded from: classes.dex */
    public interface AbstractC1712a {
        /* renamed from: a */
        void m34373a(float f);
    }

    public C1711a(Context context) {
        this.f4297b = context;
    }

    /* renamed from: a */
    public void m34376a() {
        this.f4298c = (SensorManager) this.f4297b.getSystemService("sensor");
        if (this.f4298c != null) {
            this.f4300e = this.f4298c.getDefaultSensor(3);
            this.f4299d = this.f4298c.getDefaultSensor(4);
        }
        if (this.f4300e == null && this.f4299d == null) {
            return;
        }
        this.f4298c.registerListener(this, this.f4300e, 2);
        SensorManager sensorManager = this.f4298c;
        Sensor sensor = this.f4299d;
        SensorManager sensorManager2 = this.f4298c;
        sensorManager.registerListener(this, sensor, 2);
    }

    /* renamed from: a */
    public void m34375a(AbstractC1712a abstractC1712a) {
        this.f4302g = abstractC1712a;
    }

    /* renamed from: b */
    public void m34374b() {
        if (this.f4298c != null) {
            this.f4298c.unregisterListener(this);
        }
    }

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(Sensor sensor, int i) {
    }

    @Override // android.hardware.SensorEventListener
    public void onSensorChanged(SensorEvent sensorEvent) {
        if (sensorEvent.sensor.getType() == 4 && Math.abs(sensorEvent.values[2]) > 0.1d) {
            this.f4296a = true;
        }
        if (sensorEvent.sensor.getType() != 3 || !this.f4296a) {
            return;
        }
        this.f4296a = false;
        float f = sensorEvent.values[0];
        if (Math.abs(f - this.f4301f) <= 1.5d) {
            return;
        }
        this.f4302g.m34373a(f);
        this.f4301f = f;
    }
}
