package com.tencent.p263mm.sdk.platformtools;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import com.xiaomi.account.openauth.XiaomiOAuthConstants;
/* renamed from: com.tencent.mm.sdk.platformtools.SensorController */
/* loaded from: classes2.dex */
public class SensorController extends BroadcastReceiver implements SensorEventListener {

    /* renamed from: aR */
    private static float f31650aR = 4.2949673E9f;

    /* renamed from: aU */
    private static float f31651aU = 0.5f;

    /* renamed from: aS */
    private SensorManager f31652aS;

    /* renamed from: aT */
    private float f31653aT;

    /* renamed from: aV */
    private SensorEventCallBack f31654aV;

    /* renamed from: aW */
    private Sensor f31655aW;

    /* renamed from: aX */
    private final boolean f31656aX;

    /* renamed from: aY */
    private boolean f31657aY = false;

    /* renamed from: aZ */
    private boolean f31658aZ = false;

    /* renamed from: com.tencent.mm.sdk.platformtools.SensorController$SensorEventCallBack */
    /* loaded from: classes2.dex */
    public interface SensorEventCallBack {
        void onSensorEvent(boolean z);
    }

    public SensorController(Context context) {
        this.f31652aS = (SensorManager) context.getSystemService("sensor");
        this.f31655aW = this.f31652aS.getDefaultSensor(8);
        this.f31656aX = this.f31655aW != null;
        this.f31653aT = f31651aU + 1.0f;
    }

    public boolean isSensorEnable() {
        return this.f31656aX;
    }

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(Sensor sensor, int i) {
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if (intent.getAction().equals("android.intent.action.HEADSET_PLUG")) {
            int intExtra = intent.getIntExtra(XiaomiOAuthConstants.EXTRA_STATE_2, 0);
            if (intExtra == 1) {
                this.f31657aY = true;
            }
            if (intExtra != 0) {
                return;
            }
            this.f31657aY = false;
        }
    }

    @Override // android.hardware.SensorEventListener
    public void onSensorChanged(SensorEvent sensorEvent) {
        if (this.f31657aY) {
            return;
        }
        float f = sensorEvent.values[0];
        switch (sensorEvent.sensor.getType()) {
            case 8:
                if (f < f31650aR) {
                    f31650aR = f;
                    f31651aU = 0.5f + f;
                }
                if (this.f31653aT < f31651aU || f >= f31651aU) {
                    if (this.f31653aT <= f31651aU && f > f31651aU && this.f31654aV != null) {
                        Log.m5869v("MicroMsg.SensorController", "sensor event true");
                        this.f31654aV.onSensorEvent(true);
                    }
                } else if (this.f31654aV != null) {
                    Log.m5869v("MicroMsg.SensorController", "sensor event false");
                    this.f31654aV.onSensorEvent(false);
                }
                this.f31653aT = f;
                return;
            default:
                return;
        }
    }

    public void removeSensorCallBack() {
        Log.m5869v("MicroMsg.SensorController", "sensor callback removed");
        this.f31652aS.unregisterListener(this, this.f31655aW);
        this.f31652aS.unregisterListener(this);
        this.f31658aZ = false;
        this.f31654aV = null;
    }

    public void setSensorCallBack(SensorEventCallBack sensorEventCallBack) {
        Log.m5869v("MicroMsg.SensorController", "sensor callback set");
        if (!this.f31658aZ) {
            this.f31652aS.registerListener(this, this.f31655aW, 2);
            this.f31658aZ = true;
        }
        this.f31654aV = sensorEventCallBack;
    }
}
