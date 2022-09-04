package com.fimi.soul.module.update;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.view.animation.AlphaAnimation;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.fimi.kernel.C1642c;
import com.fimi.kernel.p164c.C1645c;
import com.fimi.kernel.utils.C1681v;
import com.fimi.kernel.view.progress.ProgressView;
import com.fimi.overseas.soul.C1704R;
import com.fimi.soul.base.BaseActivity;
import com.fimi.soul.base.C1756a;
import com.fimi.soul.base.DroidPlannerApp;
import com.fimi.soul.biz.camera.C1783b;
import com.fimi.soul.biz.camera.C1827d;
import com.fimi.soul.biz.p170b.C1760b;
import com.fimi.soul.biz.p170b.C1772d;
import com.fimi.soul.biz.p181i.C1867a;
import com.fimi.soul.drone.C2083a;
import com.fimi.soul.drone.C2104d;
import com.fimi.soul.drone.p205i.C2365x;
import com.fimi.soul.entity.FirmwareInfo;
import com.fimi.soul.entity.UpdateVersonBean;
import com.fimi.soul.module.calibcompass.CaliCompassActivity;
import com.fimi.soul.module.droneui.DialogC2752a;
import com.fimi.soul.module.droneui.FlightActivity;
import com.fimi.soul.module.login.LoginActivity;
import com.fimi.soul.module.setting.newhand.C2954b;
import com.fimi.soul.module.setting.newhand.NewHandActivity;
import com.fimi.soul.module.update.UpdateConnectDefeaFrgment;
import com.fimi.soul.module.update.p218a.C3021a;
import com.fimi.soul.module.update.p218a.C3027g;
import com.fimi.soul.utils.C3103au;
import com.google.firebase.p251a.C9654a;
import java.util.List;
/* loaded from: classes.dex */
public class CheckFirmwareActvity extends BaseActivity implements C2104d.AbstractC2106b, UpdateConnectDefeaFrgment.AbstractC3008a {

    /* renamed from: b */
    C1827d f10994b;

    /* renamed from: c */
    C3027g f10995c;

    /* renamed from: d */
    C1772d f10996d;

    /* renamed from: h */
    private ProgressView f11000h;

    /* renamed from: n */
    private UpdateConnectDefeaFrgment f11006n;

    /* renamed from: o */
    private AutoSelfErrorFrgment f11007o;

    /* renamed from: r */
    private TextView f11010r;

    /* renamed from: t */
    private DialogC2752a f11012t;

    /* renamed from: v */
    private C2083a f11014v;

    /* renamed from: x */
    private ProgressBar f11016x;

    /* renamed from: y */
    private boolean f11017y;

    /* renamed from: z */
    private C1681v f11018z;

    /* renamed from: i */
    private boolean f11001i = false;

    /* renamed from: j */
    private final int f11002j = C2954b.f10826ao;

    /* renamed from: k */
    private final int f11003k = 10;

    /* renamed from: l */
    private final int f11004l = 1;

    /* renamed from: m */
    private final int f11005m = 2;

    /* renamed from: p */
    private float f11008p = 0.0f;

    /* renamed from: q */
    private final int f11009q = 1536;

    /* renamed from: s */
    private boolean f11011s = false;

    /* renamed from: a */
    List<FirmwareInfo> f10993a = null;

    /* renamed from: u */
    private C1760b f11013u = null;

    /* renamed from: w */
    private boolean f11015w = false;

    /* renamed from: A */
    private String f10992A = C1756a.f4517J;

    /* renamed from: e */
    Handler f10997e = new Handler() { // from class: com.fimi.soul.module.update.CheckFirmwareActvity.2
        @Override // android.os.Handler
        public void handleMessage(Message message) {
            super.handleMessage(message);
            float floatValue = message.obj != null ? ((Float) message.obj).floatValue() : 0.0f;
            CheckFirmwareActvity.this.f11000h.setCurrentCount(floatValue);
            if (!CheckFirmwareActvity.this.f11014v.mo32906ab().mo32588a()) {
                CheckFirmwareActvity.this.m29736a(CheckFirmwareActvity.this.getString(C1704R.C1707string.disconnect_titlefaile), CheckFirmwareActvity.this.getString(C1704R.C1707string.disconnect_reson), false, false, false);
            } else if (!CheckFirmwareActvity.this.f11014v.mo32905ac()) {
                Log.d("DroidPlannerApp", "handleMessage: ");
                CheckFirmwareActvity.this.m29736a(CheckFirmwareActvity.this.getString(C1704R.C1707string.unconnectdrone), CheckFirmwareActvity.this.getString(C1704R.C1707string.fc_tip_error), false, false, false);
            } else if (floatValue == 390.0f) {
                if (CheckFirmwareActvity.this.m29735b()) {
                    return;
                }
                if (C1642c.m34887c().mo34872d(C1756a.f4560s)) {
                    CheckFirmwareActvity.this.f10997e.postDelayed(CheckFirmwareActvity.this.f10998f, 10L);
                    return;
                }
                CheckFirmwareActvity.this.f10997e.removeCallbacks(CheckFirmwareActvity.this.f10998f);
                CheckFirmwareActvity.this.startActivity(new Intent(CheckFirmwareActvity.this, NewHandActivity.class));
                CheckFirmwareActvity.this.finish();
                CheckFirmwareActvity.this.overridePendingTransition(17432576, 17432577);
            } else if (floatValue < 400.0f) {
                if (CheckFirmwareActvity.this.f11008p <= 0.0f) {
                    return;
                }
                CheckFirmwareActvity.this.f10997e.postDelayed(CheckFirmwareActvity.this.f10998f, 10L);
            } else {
                CheckFirmwareActvity.this.f10997e.removeCallbacks(CheckFirmwareActvity.this.f10998f);
                if (!CheckFirmwareActvity.this.f11017y) {
                    CheckFirmwareActvity.this.startActivity(new Intent(CheckFirmwareActvity.this, FlightActivity.class));
                    return;
                }
                CheckFirmwareActvity.this.f11018z.m34546a().edit().putBoolean(CheckFirmwareActvity.this.f10992A, true).commit();
                CheckFirmwareActvity.this.dpa.m34274d();
            }
        }
    };

    /* renamed from: f */
    Runnable f10998f = new Runnable() { // from class: com.fimi.soul.module.update.CheckFirmwareActvity.3
        @Override // java.lang.Runnable
        public void run() {
            CheckFirmwareActvity.m29726h(CheckFirmwareActvity.this);
            Message obtainMessage = CheckFirmwareActvity.this.f10997e.obtainMessage();
            obtainMessage.obj = Float.valueOf(CheckFirmwareActvity.this.f11008p);
            obtainMessage.what = 1;
            CheckFirmwareActvity.this.f10997e.sendMessage(obtainMessage);
        }
    };

    /* renamed from: g */
    int f10999g = 0;

    /* renamed from: a */
    private void m29740a(C2365x c2365x) {
        String string;
        int i = 5;
        String string2 = getString(C1704R.C1707string.self_error_result);
        if (!this.f11014v.m33005aq()) {
        }
        if (c2365x.m31762n()) {
            string = getString(C1704R.C1707string.self_error_battery_copyright);
            i = 1;
        } else if (c2365x.m31763m()) {
            string = getString(C1704R.C1707string.self_error_battery);
            i = 2;
        } else if (c2365x.m31792ah()) {
            string = getString(C1704R.C1707string.fault_short_life_battery);
            i = 3;
        } else if (c2365x.m31810S()) {
            string = getString(C1704R.C1707string.fault_low_battery);
            i = 4;
        } else if (c2365x.m31770f()) {
            string = getString(C1704R.C1707string.land_GPS_ERROR);
        } else if (c2365x.m31766j()) {
            string = getString(C1704R.C1707string.land_IMUACCEL_ERROR);
        } else if (c2365x.m31765k()) {
            string = getString(C1704R.C1707string.land_IMUGYRO_ERROR);
        } else if (c2365x.m31764l()) {
            string = getString(C1704R.C1707string.land_BRO_ERROR);
        } else if ((c2365x.m31768h() || c2365x.m31767i()) && !c2365x.m31817L()) {
            string = getString(C1704R.C1707string.land_CAMP1_ERROR);
            i = 6;
        } else if (c2365x.m31788al()) {
            string = getString(C1704R.C1707string.fault_bat_pre_heart_des);
            i = 7;
        } else if (c2365x.m31817L()) {
            string = getString(C1704R.C1707string.fault_compass);
            i = 8;
            this.f11011s = true;
        } else {
            if (c2365x.m31816M()) {
            }
            if (c2365x.m31815N()) {
            }
            if (c2365x.m31814O()) {
            }
            if (c2365x.m31813P()) {
                string = getString(C1704R.C1707string.fault_gesture);
                i = 12;
            } else if (this.f11014v.mo32919Q().m32126g()) {
                string = getString(C1704R.C1707string.rc_low_battery);
                i = 13;
            } else if (!c2365x.m31760p()) {
                if (!this.f11001i) {
                    this.f11001i = false;
                    return;
                }
                getFragmentManager().beginTransaction().remove(this.f11006n).commit();
                m29737a(getString(C1704R.C1707string.self_error_auto_result_title), getString(C1704R.C1707string.self_error_auto_result), false, true);
                this.f11001i = false;
                this.f10999g = 0;
                return;
            } else {
                string2 = getString(C1704R.C1707string.fault_vps_tip);
                string = getString(C1704R.C1707string.fault_vps_des);
                i = 14;
            }
        }
        this.f11001i = true;
        if (this.f10999g < i && this.f10999g != 0) {
            getFragmentManager().beginTransaction().remove(this.f11006n).commit();
            m29737a(getString(C1704R.C1707string.self_error_auto_result_title), getString(C1704R.C1707string.self_error_auto_result), false, true);
            this.f10999g = i;
        }
        if (this.f10999g == i || c2365x.m31802a() < 0) {
            return;
        }
        if (this.f11006n != null && this.f11006n.isVisible()) {
            return;
        }
        this.f10999g = i;
        m29736a(string2, string, true, false, this.f11011s);
    }

    /* renamed from: a */
    private void m29737a(String str, String str2, boolean z, boolean z2) {
        this.f11008p = 0.0f;
        this.f10997e.removeCallbacks(this.f10998f);
        if (this.f11007o == null) {
            this.f11007o = new AutoSelfErrorFrgment();
        }
        this.f11007o.m29746a(str2);
        this.f11007o.m29744b(str);
        this.f11007o.m29743b(z);
        this.f11007o.m29745a(z2);
        getFragmentManager().beginTransaction().setCustomAnimations(17432576, 17432577);
        getFragmentManager().beginTransaction().add(C1704R.C1706id.contrain_layout, this.f11007o).commit();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m29736a(String str, String str2, boolean z, boolean z2, boolean z3) {
        this.f11008p = 0.0f;
        this.f10997e.removeCallbacks(this.f10998f);
        boolean m29733c = m29733c();
        if (this.f11006n == null) {
            this.f11006n = new UpdateConnectDefeaFrgment();
        }
        if (!m29733c) {
            getFragmentManager().beginTransaction().replace(C1704R.C1706id.contrain_layout, this.f11006n).commitAllowingStateLoss();
        } else if (this.f11006n.isAdded()) {
            getFragmentManager().beginTransaction().remove(this.f11006n).commit();
            this.f11006n = new UpdateConnectDefeaFrgment();
            getFragmentManager().beginTransaction().add(C1704R.C1706id.contrain_layout, this.f11006n).commitAllowingStateLoss();
        }
        this.f11006n.m29685a(str2);
        this.f11006n.m29683b(str);
        this.f11006n.m29681c(getString(C1704R.C1707string.no_connect));
        this.f11006n.m29680c(z);
        this.f11006n.m29684a(z2);
        this.f11006n.m29682b(z3);
        getFragmentManager().beginTransaction().setCustomAnimations(17432576, 17432577);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public boolean m29735b() {
        new StringBuffer();
        List<UpdateVersonBean> m29607e = C3021a.m29616a().m29607e();
        if (m29607e != null && m29607e.size() > 0) {
            C1645c.m34884a().mo34877a(UpdateVersonBean.SP_NEED_DOWN_FIRMWWARES, (List) m29607e);
            this.f10997e.removeCallbacks(this.f10998f);
            startActivity(new Intent(this, FindOnlineFirmwareAvtivity.class));
            finish();
            overridePendingTransition(17432576, 17432577);
            return true;
        }
        this.f10993a = C3021a.m29616a().m29608d();
        if (this.f10993a == null || this.f10993a.size() <= 0) {
            return false;
        }
        this.f10997e.removeCallbacks(this.f10998f);
        Intent intent = new Intent(this, FindNewFirmwareAvtivity.class);
        C1645c.m34884a().mo34877a("upgrade_firmwares", (List) this.f10993a);
        startActivity(intent);
        finish();
        overridePendingTransition(17432576, 17432577);
        return true;
    }

    /* renamed from: c */
    private boolean m29733c() {
        try {
            this.f11006n = (UpdateConnectDefeaFrgment) getFragmentManager().findFragmentById(C1704R.C1706id.main_layout);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return this.f11006n != null;
    }

    /* renamed from: d */
    private DialogC2752a.AbstractC2755a m29731d() {
        return new DialogC2752a.AbstractC2755a() { // from class: com.fimi.soul.module.update.CheckFirmwareActvity.4
            @Override // com.fimi.soul.module.droneui.DialogC2752a.AbstractC2755a
            /* renamed from: a */
            public void mo29725a() {
            }

            @Override // com.fimi.soul.module.droneui.DialogC2752a.AbstractC2755a
            /* renamed from: b */
            public void mo29724b() {
            }

            @Override // com.fimi.soul.module.droneui.DialogC2752a.AbstractC2755a
            /* renamed from: c */
            public void mo29723c() {
            }

            @Override // com.fimi.soul.module.droneui.DialogC2752a.AbstractC2755a
            /* renamed from: d */
            public void mo29722d() {
                Intent intent = new Intent(CheckFirmwareActvity.this, LoginActivity.class);
                intent.putExtra(C9654a.C9655a.f30195k, false);
                CheckFirmwareActvity.this.startActivity(intent);
                CheckFirmwareActvity.this.finish();
            }
        };
    }

    /* renamed from: h */
    static /* synthetic */ float m29726h(CheckFirmwareActvity checkFirmwareActvity) {
        float f = checkFirmwareActvity.f11008p;
        checkFirmwareActvity.f11008p = 1.0f + f;
        return f;
    }

    /* renamed from: a */
    public void m29741a() {
        this.f11010r = (TextView) findViewById(C1704R.C1706id.tv_check_firmware);
        C3103au.m29232a(getAssets(), this.f11010r);
        this.f11000h = (ProgressView) findViewById(C1704R.C1706id.checkFirmwareprogress);
        this.f11000h.setMaxCount(400.0f);
        C3021a.m29616a().m29609c();
        this.f11014v = ((DroidPlannerApp) getApplication()).f4493a;
        C1772d.m34208a().m34201b((String) null);
        this.f10994b = (C1827d) C1783b.m34166a().m34150d();
        this.f10994b.m33987w().m33996b();
        if (this.f10994b.e()) {
            this.f10994b.m33989u().m34037k();
        }
        this.f11016x = (ProgressBar) findViewById(C1704R.C1706id.checkFirmwareProgressBar);
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
        alphaAnimation.setDuration(300L);
        this.f11016x.setAnimation(alphaAnimation);
        alphaAnimation.start();
    }

    @Override // com.fimi.soul.module.update.UpdateConnectDefeaFrgment.AbstractC3008a
    /* renamed from: g */
    public void mo29679g() {
        if (!this.f11014v.mo32905ac() || m29735b()) {
            if (this.f11014v.mo32905ac()) {
                return;
            }
            startActivity(new Intent(this, FlightActivity.class));
        } else if (!this.f11017y) {
            startActivity(new Intent(this, FlightActivity.class));
        } else {
            this.f11018z.m34546a().edit().putBoolean(this.f10992A, false).commit();
            this.dpa.m34274d();
        }
    }

    @Override // com.fimi.soul.module.update.UpdateConnectDefeaFrgment.AbstractC3008a
    /* renamed from: h */
    public void mo29678h() {
        if (this.f11011s) {
            startActivity(new Intent(this, CaliCompassActivity.class));
            finish();
            overridePendingTransition(17432576, 17432577);
        }
        finish();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.fimi.soul.base.BaseActivity, com.fimi.soul.base.BaseFimiActivity, com.fimi.kernel.BaseActivity, android.support.p001v4.app.FragmentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C1867a.m33847a().m33841a(getLocalClassName());
        this.dpa.m34276b(this);
        this.f11018z = C1681v.m34543a(this);
        this.f10992A = C1756a.f4517J;
        this.f11017y = C1642c.m34887c().mo34872d(C1756a.f4519L);
        this.f11001i = false;
        getWindow().setFlags(128, 128);
        setContentView(C1704R.layout.activity_check_firmware_actvity);
        m29741a();
        this.f10995c = new C3027g(this, this.f11014v);
        new Thread(new Runnable() { // from class: com.fimi.soul.module.update.CheckFirmwareActvity.1
            @Override // java.lang.Runnable
            public void run() {
                Looper.prepare();
                for (int i = 0; i < 5; i++) {
                    CheckFirmwareActvity.this.f10995c.m29532c();
                }
            }
        }).start();
        this.f10997e.postDelayed(this.f10998f, 200L);
        this.f11014v.mo32908a(this);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.fimi.soul.base.BaseActivity, com.fimi.soul.base.BaseFimiActivity, com.fimi.kernel.BaseActivity, android.support.p001v4.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.f10997e.removeMessages(1);
        this.f11014v.mo32903b(this);
    }

    @Override // com.fimi.soul.base.BaseActivity, com.fimi.soul.drone.C2104d.AbstractC2106b
    public void onDroneEvent(C2104d.EnumC2105a enumC2105a, C2083a c2083a) {
        switch (enumC2105a) {
            case ERROR_CODE:
                c2083a.m33007ao();
                if (this.f11008p > 200.0f || this.f11001i) {
                }
                return;
            default:
                return;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.fimi.soul.base.BaseActivity, com.fimi.kernel.BaseActivity, android.support.p001v4.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        if (this.f11008p > 0.0f) {
            this.f10997e.postDelayed(this.f10998f, 10L);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.fimi.soul.base.BaseActivity, com.fimi.kernel.BaseActivity, android.support.p001v4.app.FragmentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.fimi.soul.base.BaseActivity, android.support.p001v4.app.FragmentActivity, android.app.Activity
    public void onStop() {
        super.onStop();
        this.f10995c.m29530e();
        this.f10997e.removeCallbacks(this.f10998f);
    }
}
