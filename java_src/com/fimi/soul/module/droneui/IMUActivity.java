package com.fimi.soul.module.droneui;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.fimi.overseas.soul.C1704R;
import com.fimi.soul.base.BaseActivity;
import com.fimi.soul.drone.C2083a;
import com.fimi.soul.drone.C2104d;
import com.fimi.soul.drone.p204h.C2283f;
import com.fimi.soul.module.p214c.C2523d;
import com.fimi.soul.utils.C3103au;
/* loaded from: classes.dex */
public class IMUActivity extends BaseActivity implements View.OnClickListener, C2104d.AbstractC2106b {

    /* renamed from: E */
    private static int f9522E = 2;

    /* renamed from: F */
    private static int f9523F = 3;

    /* renamed from: G */
    private static int f9524G = 1;

    /* renamed from: a */
    static C2283f f9525a;

    /* renamed from: A */
    private TextView f9526A;

    /* renamed from: B */
    private TextView f9527B;

    /* renamed from: C */
    private TextView f9528C;

    /* renamed from: D */
    private TextView f9529D;

    /* renamed from: H */
    private C2523d f9530H;

    /* renamed from: I */
    private C2283f f9531I;

    /* renamed from: J */
    private boolean f9532J = false;

    /* renamed from: K */
    private int f9533K = 0;

    /* renamed from: L */
    private Handler f9534L = new Handler() { // from class: com.fimi.soul.module.droneui.IMUActivity.1
        @Override // android.os.Handler
        public void handleMessage(Message message) {
            super.handleMessage(message);
            if (message.what == IMUActivity.f9522E) {
                if (IMUActivity.this.f9530H == null) {
                    return;
                }
                IMUActivity.this.f9530H.m31385a((byte) 4);
            } else if (message.what == IMUActivity.f9523F) {
                IMUActivity.this.m30426a();
            } else if (message.what != IMUActivity.f9524G) {
            } else {
                IMUActivity.this.f9530H.m31385a((byte) 7);
            }
        }
    };

    /* renamed from: b */
    private Button f9535b;

    /* renamed from: c */
    private Button f9536c;

    /* renamed from: d */
    private TextView f9537d;

    /* renamed from: e */
    private TextView f9538e;

    /* renamed from: f */
    private TextView f9539f;

    /* renamed from: g */
    private TextView f9540g;

    /* renamed from: h */
    private TextView f9541h;

    /* renamed from: i */
    private TextView f9542i;

    /* renamed from: j */
    private TextView f9543j;

    /* renamed from: k */
    private TextView f9544k;

    /* renamed from: l */
    private TextView f9545l;

    /* renamed from: m */
    private TextView f9546m;

    /* renamed from: n */
    private TextView f9547n;

    /* renamed from: o */
    private TextView f9548o;

    /* renamed from: p */
    private TextView f9549p;

    /* renamed from: q */
    private TextView f9550q;

    /* renamed from: r */
    private TextView f9551r;

    /* renamed from: s */
    private TextView f9552s;

    /* renamed from: t */
    private TextView f9553t;

    /* renamed from: u */
    private TextView f9554u;

    /* renamed from: v */
    private TextView f9555v;

    /* renamed from: w */
    private TextView f9556w;

    /* renamed from: x */
    private TextView f9557x;

    /* renamed from: y */
    private TextView f9558y;

    /* renamed from: z */
    private TextView f9559z;

    /* renamed from: h */
    private void m30411h() {
        this.f9535b = (Button) findViewById(C1704R.C1706id.back_btn);
        this.f9535b.setOnClickListener(this);
        this.f9537d = (TextView) findViewById(C1704R.C1706id.aboutTitle);
        this.f9538e = (TextView) findViewById(C1704R.C1706id.imu_gyroscope_x);
        this.f9539f = (TextView) findViewById(C1704R.C1706id.imu_gyroscope_y);
        this.f9540g = (TextView) findViewById(C1704R.C1706id.imu_gyroscope_z);
        this.f9541h = (TextView) findViewById(C1704R.C1706id.imu_gyroscope_mod);
        this.f9542i = (TextView) findViewById(C1704R.C1706id.imu_accelerometer_x);
        this.f9543j = (TextView) findViewById(C1704R.C1706id.imu_accelerometer_y);
        this.f9544k = (TextView) findViewById(C1704R.C1706id.imu_accelerometer_z);
        this.f9545l = (TextView) findViewById(C1704R.C1706id.imu_accelerometer_mod);
        this.f9546m = (TextView) findViewById(C1704R.C1706id.imu_compass_one_x);
        this.f9547n = (TextView) findViewById(C1704R.C1706id.imu_compass_one_y);
        this.f9548o = (TextView) findViewById(C1704R.C1706id.imu_compass_one_z);
        this.f9549p = (TextView) findViewById(C1704R.C1706id.imu_compass_one_mod);
        this.f9550q = (TextView) findViewById(C1704R.C1706id.imu_compass_two_x);
        this.f9551r = (TextView) findViewById(C1704R.C1706id.imu_compass_two_y);
        this.f9552s = (TextView) findViewById(C1704R.C1706id.imu_compass_two_z);
        this.f9553t = (TextView) findViewById(C1704R.C1706id.imu_compass_two_mod);
        this.f9554u = (TextView) findViewById(C1704R.C1706id.tv_imu_error);
        this.f9536c = (Button) findViewById(C1704R.C1706id.btn_imu_detection);
        this.f9536c.setOnClickListener(this);
        this.f9555v = (TextView) findViewById(C1704R.C1706id.tv_imu_hint);
        this.f9556w = (TextView) findViewById(C1704R.C1706id.tv_x);
        this.f9557x = (TextView) findViewById(C1704R.C1706id.tv_y);
        this.f9558y = (TextView) findViewById(C1704R.C1706id.tv_z);
        this.f9556w = (TextView) findViewById(C1704R.C1706id.tv_mod);
        this.f9526A = (TextView) findViewById(C1704R.C1706id.tv_gyroscope);
        this.f9527B = (TextView) findViewById(C1704R.C1706id.tv_accelerometer);
        this.f9528C = (TextView) findViewById(C1704R.C1706id.tv_compass_one);
        this.f9529D = (TextView) findViewById(C1704R.C1706id.tv_compass_two);
        if (!this.drone.mo32905ac()) {
            m30424a(this.f9554u, getResources().getColor(C1704R.color.white_90), getResources().getString(C1704R.C1707string.connect_aircraft_hint));
        } else if (this.drone.mo32894t().m32323d() == 0) {
            m30424a(this.f9554u, getResources().getColor(C1704R.color.white_90), getResources().getString(C1704R.C1707string.hint_one));
        } else {
            m30424a(this.f9554u, getResources().getColor(C1704R.color.white_90), getResources().getString(C1704R.C1707string.state_flight_hint));
            m30425a(this.f9536c, getResources().getColor(C1704R.color.white_half), false);
        }
    }

    /* renamed from: i */
    private void m30410i() {
        this.f9530H = C2523d.m31374a(this.drone);
        this.f9530H.m31385a((byte) 4);
        this.f9530H.m31385a((byte) 5);
        m30426a();
    }

    /* renamed from: a */
    public void m30426a() {
        if (!this.drone.mo32905ac() || this.drone.m33009am()) {
            if (this.drone.mo32894t().m32323d() != 0) {
                m30424a(this.f9554u, getResources().getColor(C1704R.color.white_90), getResources().getString(C1704R.C1707string.state_flight_hint));
            } else if (this.f9533K != 1) {
                m30424a(this.f9554u, getResources().getColor(C1704R.color.white_90), getResources().getString(C1704R.C1707string.connect_aircraft_hint));
                this.f9532J = true;
            }
            m30425a(this.f9536c, getResources().getColor(C1704R.color.white_half), false);
            this.f9538e.setText(getResources().getString(C1704R.C1707string.no_use));
            this.f9539f.setText(getResources().getString(C1704R.C1707string.no_use));
            this.f9540g.setText(getResources().getString(C1704R.C1707string.no_use));
            this.f9541h.setText(getResources().getString(C1704R.C1707string.no_use));
            this.f9542i.setText(getResources().getString(C1704R.C1707string.no_use));
            this.f9543j.setText(getResources().getString(C1704R.C1707string.no_use));
            this.f9544k.setText(getResources().getString(C1704R.C1707string.no_use));
            this.f9545l.setText(getResources().getString(C1704R.C1707string.no_use));
            this.f9546m.setText(getResources().getString(C1704R.C1707string.no_use));
            this.f9547n.setText(getResources().getString(C1704R.C1707string.no_use));
            this.f9548o.setText(getResources().getString(C1704R.C1707string.no_use));
            this.f9549p.setText(getResources().getString(C1704R.C1707string.no_use));
            this.f9550q.setText(getResources().getString(C1704R.C1707string.no_use));
            this.f9551r.setText(getResources().getString(C1704R.C1707string.no_use));
            this.f9552s.setText(getResources().getString(C1704R.C1707string.no_use));
            this.f9553t.setText(getResources().getString(C1704R.C1707string.no_use));
            return;
        }
        if (this.f9532J && this.f9533K != 1) {
            m30424a(this.f9554u, getResources().getColor(C1704R.color.white_90), getResources().getString(C1704R.C1707string.hint_one));
            this.f9532J = false;
        } else if (!this.f9554u.getText().toString().equals(getResources().getString(C1704R.C1707string.detection_hint))) {
            m30425a(this.f9536c, getResources().getColor(C1704R.color.white_90), true);
        }
        this.f9538e.setText(this.drone.mo32888z().m32296a() + "");
        this.f9539f.setText(this.drone.mo32888z().m32293b() + "");
        this.f9540g.setText(this.drone.mo32888z().m32292c() + "");
        this.f9541h.setText(this.drone.mo32888z().m32291d() + "");
        this.f9542i.setText(this.drone.mo32888z().m32290e() + "");
        this.f9543j.setText(this.drone.mo32888z().m32289f() + "");
        this.f9544k.setText(this.drone.mo32888z().m32288g() + "");
        this.f9545l.setText(this.drone.mo32888z().m32287h() + "");
        this.f9546m.setText(this.drone.mo32931E().m31912a() + "");
        this.f9547n.setText(this.drone.mo32931E().m31909b() + "");
        this.f9548o.setText(this.drone.mo32931E().m31908c() + "");
        this.f9549p.setText(this.drone.mo32931E().m31907d() + "");
        this.f9550q.setText(this.drone.mo32931E().m31912a() + "");
        this.f9551r.setText(this.drone.mo32931E().m31909b() + "");
        this.f9552s.setText(this.drone.mo32931E().m31908c() + "");
        this.f9553t.setText(this.drone.mo32931E().m31907d() + "");
    }

    /* renamed from: a */
    public void m30425a(Button button, int i, boolean z) {
        button.setEnabled(z);
        button.setTextColor(i);
    }

    /* renamed from: a */
    public void m30424a(TextView textView, int i, String str) {
        textView.setTextColor(i);
        textView.setText(str);
    }

    /* renamed from: b */
    public void m30421b() {
        C2523d.m31374a(this.drone).m31362f(153);
        this.f9531I.m32436f();
        if (this.drone.mo32933C().m32275a() == 0) {
            this.f9533K = 1;
            m30425a(this.f9536c, getResources().getColor(C1704R.color.white_90), true);
            m30424a(this.f9554u, getResources().getColor(C1704R.color.battery_green), getResources().getString(C1704R.C1707string.imu_normal));
            return;
        }
        this.f9533K = 1;
        m30425a(this.f9536c, getResources().getColor(C1704R.color.white_90), true);
        m30424a(this.f9554u, getResources().getColor(C1704R.color.insurance_white), getResources().getString(C1704R.C1707string.imu_exception));
    }

    /* renamed from: c */
    public void m30419c() {
        if (f9525a != null) {
            f9525a.m32441c();
            return;
        }
        f9525a = new C2283f(5000, new Runnable() { // from class: com.fimi.soul.module.droneui.IMUActivity.3
            @Override // java.lang.Runnable
            public void run() {
                IMUActivity.this.f9534L.sendEmptyMessage(IMUActivity.f9522E);
            }
        });
        f9525a.m32439d();
    }

    /* renamed from: d */
    public void m30417d() {
        if (this.f9531I != null) {
            this.f9531I.m32441c();
            return;
        }
        this.f9531I = new C2283f(1000, new Runnable() { // from class: com.fimi.soul.module.droneui.IMUActivity.4
            @Override // java.lang.Runnable
            public void run() {
                IMUActivity.this.f9534L.sendEmptyMessage(IMUActivity.f9524G);
            }
        });
        this.f9531I.m32439d();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int id = view.getId();
        if (id == C1704R.C1706id.back_btn) {
            finish();
        } else if (id != C1704R.C1706id.btn_imu_detection) {
        } else {
            m30425a(this.f9536c, getResources().getColor(C1704R.color.white_half), false);
            m30424a(this.f9554u, getResources().getColor(C1704R.color.white_half), getResources().getString(C1704R.C1707string.detection_hint));
            this.f9533K = 0;
            m30417d();
            this.f9534L.postDelayed(new Runnable() { // from class: com.fimi.soul.module.droneui.IMUActivity.2
                @Override // java.lang.Runnable
                public void run() {
                    if (IMUActivity.this.f9533K != 1) {
                        IMUActivity.this.f9533K = 0;
                        IMUActivity.this.m30424a(IMUActivity.this.f9554u, IMUActivity.this.getResources().getColor(C1704R.color.white_90), IMUActivity.this.getResources().getString(C1704R.C1707string.imu_detection_retry));
                        IMUActivity.this.f9531I.m32436f();
                    }
                }
            }, 10000L);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.fimi.soul.base.BaseActivity, com.fimi.soul.base.BaseFimiActivity, com.fimi.kernel.BaseActivity, android.support.p001v4.app.FragmentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getWindow().setFlags(128, 128);
        setContentView(C1704R.layout.activity_imu);
        m30411h();
        C3103au.m29232a(getAssets(), this.f9535b, this.f9536c, this.f9537d, this.f9538e, this.f9539f, this.f9540g, this.f9541h, this.f9542i, this.f9543j, this.f9544k, this.f9545l, this.f9546m, this.f9547n, this.f9548o, this.f9549p, this.f9550q, this.f9551r, this.f9552s, this.f9553t, this.f9554u, this.f9555v, this.f9556w, this.f9557x, this.f9558y, this.f9559z, this.f9526A, this.f9527B, this.f9528C, this.f9529D);
        this.drone.mo32908a(this);
        m30410i();
        m30419c();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.fimi.soul.base.BaseActivity, com.fimi.soul.base.BaseFimiActivity, com.fimi.kernel.BaseActivity, android.support.p001v4.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.drone.mo32903b(this);
        f9525a.m32436f();
        if (this.f9531I != null) {
            this.f9531I.m32436f();
        }
    }

    @Override // com.fimi.soul.base.BaseActivity, com.fimi.soul.drone.C2104d.AbstractC2106b
    public void onDroneEvent(C2104d.EnumC2105a enumC2105a, C2083a c2083a) {
        switch (enumC2105a) {
            case IMU_INFO:
                this.f9534L.sendEmptyMessage(f9523F);
                break;
            case IMU_WORKSTATE:
                m30421b();
                break;
            case CLEANALLOBJ:
                this.f9534L.sendEmptyMessage(f9523F);
                break;
        }
        this.f9534L.sendEmptyMessage(f9523F);
    }
}
