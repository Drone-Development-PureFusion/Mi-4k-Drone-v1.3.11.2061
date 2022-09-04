package com.fimi.soul.module.droneui;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.fimi.kernel.C1642c;
import com.fimi.kernel.utils.C1688z;
import com.fimi.overseas.soul.C1704R;
import com.fimi.soul.base.BaseActivity;
import com.fimi.soul.drone.C2083a;
import com.fimi.soul.drone.C2104d;
import com.fimi.soul.drone.p204h.C2283f;
import com.fimi.soul.module.p214c.C2523d;
import com.fimi.soul.module.update.C3029b;
import com.fimi.soul.module.update.p218a.C3022b;
import com.fimi.soul.utils.C3103au;
import org.codehaus.jackson.smile.SmileConstants;
/* loaded from: classes.dex */
public class IMU4KActivity extends BaseActivity implements View.OnClickListener {

    /* renamed from: U */
    private static int f9458U = 1;

    /* renamed from: V */
    private static int f9459V = 2;

    /* renamed from: W */
    private static int f9460W = 3;

    /* renamed from: X */
    private static int f9461X = 4;

    /* renamed from: Y */
    private static int f9462Y = 24;

    /* renamed from: Z */
    private static int f9463Z = 7;

    /* renamed from: a */
    static C2283f f9464a;

    /* renamed from: A */
    private TextView f9465A;

    /* renamed from: B */
    private TextView f9466B;

    /* renamed from: C */
    private TextView f9467C;

    /* renamed from: D */
    private TextView f9468D;

    /* renamed from: E */
    private TextView f9469E;

    /* renamed from: F */
    private TextView f9470F;

    /* renamed from: G */
    private TextView f9471G;

    /* renamed from: H */
    private TextView f9472H;

    /* renamed from: I */
    private TextView f9473I;

    /* renamed from: J */
    private TextView f9474J;

    /* renamed from: K */
    private TextView f9475K;

    /* renamed from: L */
    private TextView f9476L;

    /* renamed from: M */
    private TextView f9477M;

    /* renamed from: N */
    private TextView f9478N;

    /* renamed from: O */
    private TextView f9479O;

    /* renamed from: P */
    private TextView f9480P;

    /* renamed from: Q */
    private TextView f9481Q;

    /* renamed from: R */
    private TextView f9482R;

    /* renamed from: S */
    private TextView f9483S;

    /* renamed from: T */
    private TextView f9484T;

    /* renamed from: aa */
    private C2523d f9485aa;

    /* renamed from: ab */
    private C2283f f9486ab;

    /* renamed from: ae */
    private boolean f9489ae;

    /* renamed from: ag */
    private C3022b f9491ag;

    /* renamed from: f */
    byte f9496f;

    /* renamed from: g */
    byte f9497g;

    /* renamed from: j */
    private Button f9500j;

    /* renamed from: k */
    private Button f9501k;

    /* renamed from: l */
    private TextView f9502l;

    /* renamed from: m */
    private TextView f9503m;

    /* renamed from: n */
    private TextView f9504n;

    /* renamed from: o */
    private TextView f9505o;

    /* renamed from: p */
    private TextView f9506p;

    /* renamed from: q */
    private TextView f9507q;

    /* renamed from: r */
    private TextView f9508r;

    /* renamed from: s */
    private TextView f9509s;

    /* renamed from: t */
    private TextView f9510t;

    /* renamed from: u */
    private TextView f9511u;

    /* renamed from: v */
    private TextView f9512v;

    /* renamed from: w */
    private TextView f9513w;

    /* renamed from: x */
    private TextView f9514x;

    /* renamed from: y */
    private TextView f9515y;

    /* renamed from: z */
    private TextView f9516z;

    /* renamed from: ac */
    private boolean f9487ac = false;

    /* renamed from: ad */
    private int f9488ad = 0;

    /* renamed from: af */
    private Handler f9490af = new Handler() { // from class: com.fimi.soul.module.droneui.IMU4KActivity.1
        @Override // android.os.Handler
        public void handleMessage(Message message) {
            super.handleMessage(message);
            if (message.what == IMU4KActivity.f9458U) {
                if (IMU4KActivity.this.f9485aa == null) {
                    return;
                }
                IMU4KActivity.this.f9485aa.m31385a((byte) 1);
            } else if (message.what == IMU4KActivity.f9459V) {
                if (IMU4KActivity.this.f9485aa == null) {
                    return;
                }
                IMU4KActivity.this.f9485aa.m31385a((byte) 2);
            } else if (message.what == IMU4KActivity.f9460W) {
                if (IMU4KActivity.this.f9485aa == null) {
                    return;
                }
                IMU4KActivity.this.f9485aa.m31385a((byte) 3);
            } else if (message.what == IMU4KActivity.f9461X) {
                if (IMU4KActivity.this.f9485aa == null) {
                    return;
                }
                IMU4KActivity.this.f9485aa.m31385a((byte) 4);
            } else if (message.what == IMU4KActivity.f9462Y) {
                IMU4KActivity.this.m30448a();
            } else if (message.what != IMU4KActivity.f9463Z) {
            } else {
                if ((IMU4KActivity.this.f9496f & SmileConstants.BYTE_MARKER_END_OF_CONTENT) != 0 && !IMU4KActivity.this.f9494d) {
                    IMU4KActivity.this.f9485aa.m31385a((byte) 5);
                }
                if ((IMU4KActivity.this.f9497g & SmileConstants.BYTE_MARKER_END_OF_CONTENT) == 0 || IMU4KActivity.this.f9495e) {
                    return;
                }
                IMU4KActivity.this.f9485aa.m31385a((byte) 6);
            }
        }
    };

    /* renamed from: b */
    int f9492b = -1;

    /* renamed from: c */
    int f9493c = -1;

    /* renamed from: d */
    boolean f9494d = false;

    /* renamed from: e */
    boolean f9495e = true;

    /* renamed from: h */
    RunnableC2745a f9498h = null;

    /* renamed from: i */
    boolean f9499i = true;

    /* renamed from: com.fimi.soul.module.droneui.IMU4KActivity$a */
    /* loaded from: classes.dex */
    class RunnableC2745a implements Runnable {
        RunnableC2745a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (IMU4KActivity.this.f9488ad != 1) {
                IMU4KActivity.this.f9488ad = 0;
                IMU4KActivity.this.f9492b = -1;
                IMU4KActivity.this.f9493c = -1;
                IMU4KActivity.this.f9499i = true;
                IMU4KActivity.this.m30445a(IMU4KActivity.this.f9475K, IMU4KActivity.this.getResources().getColor(C1704R.color.white_90), IMU4KActivity.this.getResources().getString(C1704R.C1707string.imu_detection_retry));
                if (IMU4KActivity.this.f9486ab == null) {
                    return;
                }
                IMU4KActivity.this.f9486ab.m32436f();
            }
        }
    }

    /* renamed from: a */
    private boolean m30447a(int i, byte b) {
        return i == 0 && b == 0;
    }

    /* renamed from: l */
    private void m30428l() {
        this.f9500j = (Button) findViewById(C1704R.C1706id.back_btn);
        this.f9500j.setOnClickListener(this);
        this.f9502l = (TextView) findViewById(C1704R.C1706id.aboutTitle);
        this.f9503m = (TextView) findViewById(C1704R.C1706id.imu_gyroscope_x);
        this.f9504n = (TextView) findViewById(C1704R.C1706id.imu_gyroscope_y);
        this.f9505o = (TextView) findViewById(C1704R.C1706id.imu_gyroscope_z);
        this.f9506p = (TextView) findViewById(C1704R.C1706id.imu_gyroscope_mod);
        this.f9507q = (TextView) findViewById(C1704R.C1706id.imu_accelerometer_x);
        this.f9508r = (TextView) findViewById(C1704R.C1706id.imu_accelerometer_y);
        this.f9509s = (TextView) findViewById(C1704R.C1706id.imu_accelerometer_z);
        this.f9510t = (TextView) findViewById(C1704R.C1706id.imu_accelerometer_mod);
        this.f9511u = (TextView) findViewById(C1704R.C1706id.imu_gyroscope_two_x);
        this.f9512v = (TextView) findViewById(C1704R.C1706id.imu_gyroscope_two_y);
        this.f9513w = (TextView) findViewById(C1704R.C1706id.imu_gyroscope_two_z);
        this.f9514x = (TextView) findViewById(C1704R.C1706id.imu_gyroscope_two_mod);
        this.f9515y = (TextView) findViewById(C1704R.C1706id.imu_accelerometer_two_x);
        this.f9516z = (TextView) findViewById(C1704R.C1706id.imu_accelerometer_two_y);
        this.f9465A = (TextView) findViewById(C1704R.C1706id.imu_accelerometer_two_z);
        this.f9466B = (TextView) findViewById(C1704R.C1706id.imu_accelerometer_two_mod);
        this.f9467C = (TextView) findViewById(C1704R.C1706id.imu_compass_one_x);
        this.f9468D = (TextView) findViewById(C1704R.C1706id.imu_compass_one_y);
        this.f9469E = (TextView) findViewById(C1704R.C1706id.imu_compass_one_z);
        this.f9470F = (TextView) findViewById(C1704R.C1706id.imu_compass_one_mod);
        this.f9471G = (TextView) findViewById(C1704R.C1706id.imu_compass_two_x);
        this.f9472H = (TextView) findViewById(C1704R.C1706id.imu_compass_two_y);
        this.f9473I = (TextView) findViewById(C1704R.C1706id.imu_compass_two_z);
        this.f9474J = (TextView) findViewById(C1704R.C1706id.imu_compass_two_mod);
        this.f9475K = (TextView) findViewById(C1704R.C1706id.tv_imu_error);
        this.f9501k = (Button) findViewById(C1704R.C1706id.btn_imu_detection);
        this.f9501k.setOnClickListener(this);
        this.f9476L = (TextView) findViewById(C1704R.C1706id.tv_imu_hint);
        this.f9477M = (TextView) findViewById(C1704R.C1706id.tv_x);
        this.f9478N = (TextView) findViewById(C1704R.C1706id.tv_y);
        this.f9479O = (TextView) findViewById(C1704R.C1706id.tv_z);
        this.f9477M = (TextView) findViewById(C1704R.C1706id.tv_mod);
        this.f9481Q = (TextView) findViewById(C1704R.C1706id.tv_gyroscope);
        this.f9482R = (TextView) findViewById(C1704R.C1706id.tv_accelerometer);
        this.f9483S = (TextView) findViewById(C1704R.C1706id.tv_compass_one);
        this.f9484T = (TextView) findViewById(C1704R.C1706id.tv_compass_two);
        if (!this.drone.mo32905ac()) {
            m30445a(this.f9475K, getResources().getColor(C1704R.color.white_90), getResources().getString(C1704R.C1707string.connect_aircraft_hint));
        } else if (this.drone.mo32935A().m32286a() != 2) {
            m30445a(this.f9475K, getResources().getColor(C1704R.color.white_90), getResources().getString(C1704R.C1707string.hint_one));
        } else {
            m30445a(this.f9475K, getResources().getColor(C1704R.color.white_90), getResources().getString(C1704R.C1707string.state_flight_hint));
            m30446a(this.f9501k, getResources().getColor(C1704R.color.white_half), false);
        }
    }

    /* renamed from: m */
    private void m30427m() {
        this.f9485aa = C2523d.m31374a(this.drone);
        this.f9485aa.m31385a((byte) 1);
        this.f9485aa.m31385a((byte) 2);
        this.f9485aa.m31385a((byte) 3);
        this.f9485aa.m31385a((byte) 4);
        m30448a();
    }

    /* renamed from: a */
    public void m30448a() {
        if (this.drone.mo32905ac() && this.drone.mo32935A().m32286a() != 2 && this.f9489ae) {
            if (this.f9487ac && this.f9488ad != 1) {
                m30445a(this.f9475K, getResources().getColor(C1704R.color.white_90), getResources().getString(C1704R.C1707string.hint_one));
                this.f9487ac = false;
            } else if (!this.f9475K.getText().toString().equals(getResources().getString(C1704R.C1707string.detection_hint))) {
                m30446a(this.f9501k, getResources().getColor(C1704R.color.white_90), true);
            }
            this.f9511u.setText(this.drone.mo32935A().m32283b() + "");
            this.f9512v.setText(this.drone.mo32935A().m32282c() + "");
            this.f9513w.setText(this.drone.mo32935A().m32281d() + "");
            this.f9514x.setText(this.drone.mo32935A().m32280e() + "");
            this.f9515y.setText(this.drone.mo32935A().m32279f() + "");
            this.f9516z.setText(this.drone.mo32935A().m32278g() + "");
            this.f9465A.setText(this.drone.mo32935A().m32277h() + "");
            this.f9466B.setText(this.drone.mo32935A().m32276i() + "");
            this.f9503m.setText(this.drone.mo32934B().m32283b() + "");
            this.f9504n.setText(this.drone.mo32934B().m32282c() + "");
            this.f9505o.setText(this.drone.mo32934B().m32281d() + "");
            this.f9506p.setText(this.drone.mo32934B().m32280e() + "");
            this.f9507q.setText(this.drone.mo32934B().m32279f() + "");
            this.f9508r.setText(this.drone.mo32934B().m32278g() + "");
            this.f9509s.setText(this.drone.mo32934B().m32277h() + "");
            this.f9510t.setText(this.drone.mo32934B().m32276i() + "");
            this.f9467C.setText(this.drone.mo32931E().m31912a() + "");
            this.f9468D.setText(this.drone.mo32931E().m31909b() + "");
            this.f9469E.setText(this.drone.mo32931E().m31908c() + "");
            this.f9470F.setText(this.drone.mo32931E().m31907d() + "");
            this.f9471G.setText(this.drone.mo32930F().m31912a() + "");
            this.f9472H.setText(this.drone.mo32930F().m31909b() + "");
            this.f9473I.setText(this.drone.mo32930F().m31908c() + "");
            this.f9474J.setText(this.drone.mo32930F().m31907d() + "");
            return;
        }
        if (this.drone.mo32935A().m32286a() == 2) {
            m30445a(this.f9475K, getResources().getColor(C1704R.color.white_90), getResources().getString(C1704R.C1707string.state_flight_hint));
        } else if (!this.drone.mo32905ac()) {
            m30445a(this.f9475K, getResources().getColor(C1704R.color.white_90), getResources().getString(C1704R.C1707string.connect_aircraft_hint));
        }
        m30446a(this.f9501k, getResources().getColor(C1704R.color.white_half), false);
        this.f9503m.setText(getResources().getString(C1704R.C1707string.no_use));
        this.f9504n.setText(getResources().getString(C1704R.C1707string.no_use));
        this.f9505o.setText(getResources().getString(C1704R.C1707string.no_use));
        this.f9506p.setText(getResources().getString(C1704R.C1707string.no_use));
        this.f9507q.setText(getResources().getString(C1704R.C1707string.no_use));
        this.f9508r.setText(getResources().getString(C1704R.C1707string.no_use));
        this.f9509s.setText(getResources().getString(C1704R.C1707string.no_use));
        this.f9510t.setText(getResources().getString(C1704R.C1707string.no_use));
        this.f9511u.setText(getResources().getString(C1704R.C1707string.no_use));
        this.f9512v.setText(getResources().getString(C1704R.C1707string.no_use));
        this.f9513w.setText(getResources().getString(C1704R.C1707string.no_use));
        this.f9514x.setText(getResources().getString(C1704R.C1707string.no_use));
        this.f9515y.setText(getResources().getString(C1704R.C1707string.no_use));
        this.f9516z.setText(getResources().getString(C1704R.C1707string.no_use));
        this.f9465A.setText(getResources().getString(C1704R.C1707string.no_use));
        this.f9466B.setText(getResources().getString(C1704R.C1707string.no_use));
        this.f9467C.setText(getResources().getString(C1704R.C1707string.no_use));
        this.f9468D.setText(getResources().getString(C1704R.C1707string.no_use));
        this.f9469E.setText(getResources().getString(C1704R.C1707string.no_use));
        this.f9470F.setText(getResources().getString(C1704R.C1707string.no_use));
        this.f9471G.setText(getResources().getString(C1704R.C1707string.no_use));
        this.f9472H.setText(getResources().getString(C1704R.C1707string.no_use));
        this.f9473I.setText(getResources().getString(C1704R.C1707string.no_use));
        this.f9474J.setText(getResources().getString(C1704R.C1707string.no_use));
        this.f9487ac = true;
        this.f9488ad = 0;
    }

    /* renamed from: a */
    public void m30446a(Button button, int i, boolean z) {
        button.setEnabled(z);
        button.setTextColor(i);
    }

    /* renamed from: a */
    public void m30445a(TextView textView, int i, String str) {
        textView.setTextColor(i);
        textView.setText(str);
    }

    /* renamed from: b */
    public void m30442b() {
        this.f9492b = this.drone.mo32933C().m32275a();
        byte m32273b = this.drone.mo32933C().m32273b();
        if (m32273b == 1 && this.f9496f == 1) {
            this.f9495e = true;
            return;
        }
        if (m32273b == 0) {
            this.f9495e = false;
            this.f9494d = true;
            this.f9496f = m32273b;
        } else {
            this.f9495e = true;
            this.f9496f = m32273b;
        }
        this.f9493c = this.drone.mo32932D().m32275a();
        byte m32273b2 = this.drone.mo32932D().m32273b();
        if (m32273b2 == 1 && this.f9497g == 1) {
            this.f9494d = true;
            return;
        }
        if (m32273b2 == 0) {
            this.f9494d = false;
            this.f9495e = true;
            this.f9497g = m32273b2;
        } else {
            this.f9494d = false;
            this.f9497g = m32273b2;
        }
        C2523d.m31374a(this.drone).m31362f(154);
        if (this.f9486ab != null) {
            this.f9486ab.m32436f();
        }
        if (m30447a(this.f9492b, this.f9496f) && m30447a(this.f9493c, this.f9497g)) {
            this.f9488ad = 1;
            m30446a(this.f9501k, getResources().getColor(C1704R.color.white_90), true);
            m30445a(this.f9475K, getResources().getColor(C1704R.color.battery_green), getResources().getString(C1704R.C1707string.imu_normal));
        } else if (1 == this.f9488ad) {
        } else {
            this.f9488ad = 1;
            this.f9492b = -1;
            this.f9493c = -1;
            m30446a(this.f9501k, getResources().getColor(C1704R.color.white_90), true);
            m30445a(this.f9475K, getResources().getColor(C1704R.color.insurance_white), getResources().getString(C1704R.C1707string.imu_exception));
        }
    }

    /* renamed from: c */
    public void m30440c() {
        if (f9464a != null) {
            f9464a.m32441c();
            return;
        }
        f9464a = new C2283f(1000, new Runnable() { // from class: com.fimi.soul.module.droneui.IMU4KActivity.2
            @Override // java.lang.Runnable
            public void run() {
                IMU4KActivity.this.f9490af.sendEmptyMessage(IMU4KActivity.f9458U);
                IMU4KActivity.this.f9490af.sendEmptyMessage(IMU4KActivity.f9459V);
                IMU4KActivity.this.f9490af.sendEmptyMessage(IMU4KActivity.f9460W);
                IMU4KActivity.this.f9490af.sendEmptyMessage(IMU4KActivity.f9461X);
            }
        });
        f9464a.m32439d();
    }

    /* renamed from: d */
    public void m30438d() {
        if (this.f9486ab != null) {
            this.f9486ab.m32441c();
            return;
        }
        this.f9486ab = new C2283f(1500, new Runnable() { // from class: com.fimi.soul.module.droneui.IMU4KActivity.3
            @Override // java.lang.Runnable
            public void run() {
                IMU4KActivity.this.f9490af.sendEmptyMessage(IMU4KActivity.f9463Z);
            }
        });
        this.f9486ab.m32439d();
    }

    /* renamed from: e */
    public boolean m30436e() {
        if (this.f9491ag == null) {
            this.f9491ag = (C3022b) C1642c.m34887c().mo34880a(C3029b.f11258C, C3022b.class);
        }
        boolean z = this.f9491ag != null && this.f9491ag.m29604a() > 0 && this.f9491ag.m29604a() >= 1067;
        if (!z) {
            C1688z.m34447a(this, getString(C1704R.C1707string.fc_update_tip), C1688z.f4191b);
        }
        return z;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int id = view.getId();
        if (id == C1704R.C1706id.back_btn) {
            finish();
        } else if (id != C1704R.C1706id.btn_imu_detection) {
        } else {
            this.f9494d = false;
            this.f9495e = true;
            this.f9497g = (byte) 1;
            this.f9496f = (byte) 1;
            this.drone.mo32933C().m32274a(1, (byte) 1);
            this.drone.mo32932D().m32274a(1, (byte) 1);
            m30446a(this.f9501k, getResources().getColor(C1704R.color.white_half), false);
            m30445a(this.f9475K, getResources().getColor(C1704R.color.white_half), getResources().getString(C1704R.C1707string.detection_hint));
            this.f9488ad = 0;
            this.f9492b = -1;
            this.f9493c = -1;
            this.f9499i = false;
            m30438d();
            if (this.f9498h != null) {
                this.f9490af.removeCallbacks(this.f9498h);
            }
            this.f9498h = new RunnableC2745a();
            this.f9490af.postDelayed(this.f9498h, 350000L);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.fimi.soul.base.BaseActivity, com.fimi.soul.base.BaseFimiActivity, com.fimi.kernel.BaseActivity, android.support.p001v4.app.FragmentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getWindow().setFlags(128, 128);
        setContentView(C1704R.layout.activity_imu_4k);
        m30428l();
        C3103au.m29232a(getAssets(), this.f9500j, this.f9501k, this.f9502l, this.f9503m, this.f9504n, this.f9505o, this.f9506p, this.f9507q, this.f9508r, this.f9509s, this.f9510t, this.f9511u, this.f9512v, this.f9513w, this.f9514x, this.f9515y, this.f9516z, this.f9465A, this.f9466B, this.f9467C, this.f9468D, this.f9469E, this.f9470F, this.f9471G, this.f9472H, this.f9473I, this.f9474J, this.f9475K, this.f9476L, this.f9477M, this.f9478N, this.f9479O, this.f9480P, this.f9481Q, this.f9482R, this.f9483S, this.f9484T);
        this.drone.mo32908a(this);
        this.f9489ae = m30436e();
        m30427m();
        m30440c();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.fimi.soul.base.BaseActivity, com.fimi.soul.base.BaseFimiActivity, com.fimi.kernel.BaseActivity, android.support.p001v4.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.drone.mo32903b(this);
        if (this.f9486ab != null) {
            this.f9486ab.m32436f();
        }
    }

    @Override // com.fimi.soul.base.BaseActivity, com.fimi.soul.drone.C2104d.AbstractC2106b
    public void onDroneEvent(C2104d.EnumC2105a enumC2105a, C2083a c2083a) {
        switch (enumC2105a) {
            case IMU_INFO:
                this.f9490af.sendEmptyMessage(f9462Y);
                return;
            case IMU_COMPASS:
                this.f9490af.sendEmptyMessage(f9462Y);
                return;
            case IMU_WORKSTATE:
                if (this.f9499i) {
                    return;
                }
                m30442b();
                return;
            case CLEANALLOBJ:
                this.f9490af.sendEmptyMessage(f9462Y);
                return;
            default:
                return;
        }
    }
}
