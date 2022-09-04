package com.google.android.gms.ads.internal.overlay;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.view.Display;
import android.view.WindowManager;
import com.google.android.gms.internal.aaa;
import com.google.android.gms.internal.abr;
@aaa
/* renamed from: com.google.android.gms.ads.internal.overlay.v */
/* loaded from: classes.dex */
class C3676v implements SensorEventListener {

    /* renamed from: a */
    private final SensorManager f14344a;

    /* renamed from: c */
    private final Display f14346c;

    /* renamed from: f */
    private float[] f14349f;

    /* renamed from: g */
    private Handler f14350g;

    /* renamed from: h */
    private AbstractC3678a f14351h;

    /* renamed from: d */
    private final float[] f14347d = new float[9];

    /* renamed from: e */
    private final float[] f14348e = new float[9];

    /* renamed from: b */
    private final Object f14345b = new Object();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.gms.ads.internal.overlay.v$a */
    /* loaded from: classes2.dex */
    public interface AbstractC3678a {
        /* renamed from: a */
        void mo27152a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C3676v(Context context) {
        this.f14344a = (SensorManager) context.getSystemService("sensor");
        this.f14346c = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
    }

    /* renamed from: a */
    private void m27158a(int i, int i2) {
        float f = this.f14348e[i];
        this.f14348e[i] = this.f14348e[i2];
        this.f14348e[i2] = f;
    }

    /* renamed from: a */
    int m27159a() {
        return this.f14346c.getRotation();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m27157a(AbstractC3678a abstractC3678a) {
        this.f14351h = abstractC3678a;
    }

    /* renamed from: a */
    void m27156a(float[] fArr) {
        if (fArr[0] == 0.0f && fArr[1] == 0.0f && fArr[2] == 0.0f) {
            return;
        }
        synchronized (this.f14345b) {
            if (this.f14349f == null) {
                this.f14349f = new float[9];
            }
        }
        SensorManager.getRotationMatrixFromVector(this.f14347d, fArr);
        switch (m27159a()) {
            case 1:
                SensorManager.remapCoordinateSystem(this.f14347d, 2, 129, this.f14348e);
                break;
            case 2:
                SensorManager.remapCoordinateSystem(this.f14347d, 129, 130, this.f14348e);
                break;
            case 3:
                SensorManager.remapCoordinateSystem(this.f14347d, 130, 1, this.f14348e);
                break;
            default:
                System.arraycopy(this.f14347d, 0, this.f14348e, 0, 9);
                break;
        }
        m27158a(1, 3);
        m27158a(2, 6);
        m27158a(5, 7);
        synchronized (this.f14345b) {
            System.arraycopy(this.f14348e, 0, this.f14349f, 0, 9);
        }
        if (this.f14351h == null) {
            return;
        }
        this.f14351h.mo27152a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public void m27155b() {
        if (this.f14350g != null) {
            return;
        }
        Sensor defaultSensor = this.f14344a.getDefaultSensor(11);
        if (defaultSensor == null) {
            abr.b("No Sensor of TYPE_ROTATION_VECTOR");
            return;
        }
        HandlerThread handlerThread = new HandlerThread("OrientationMonitor");
        handlerThread.start();
        this.f14350g = new Handler(handlerThread.getLooper());
        if (this.f14344a.registerListener(this, defaultSensor, 0, this.f14350g)) {
            return;
        }
        abr.b("SensorManager.registerListener failed.");
        m27153c();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public boolean m27154b(float[] fArr) {
        boolean z = false;
        synchronized (this.f14345b) {
            if (this.f14349f != null) {
                System.arraycopy(this.f14349f, 0, fArr, 0, this.f14349f.length);
                z = true;
            }
        }
        return z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public void m27153c() {
        if (this.f14350g == null) {
            return;
        }
        this.f14344a.unregisterListener(this);
        this.f14350g.post(new Runnable() { // from class: com.google.android.gms.ads.internal.overlay.v.1
            @Override // java.lang.Runnable
            public void run() {
                Looper.myLooper().quit();
            }
        });
        this.f14350g = null;
    }

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(Sensor sensor, int i) {
    }

    @Override // android.hardware.SensorEventListener
    public void onSensorChanged(SensorEvent sensorEvent) {
        m27156a(sensorEvent.values);
    }
}
