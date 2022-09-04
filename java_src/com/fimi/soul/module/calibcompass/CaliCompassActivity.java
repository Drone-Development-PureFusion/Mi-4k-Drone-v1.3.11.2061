package com.fimi.soul.module.calibcompass;

import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.p001v4.app.Fragment;
import android.support.p001v4.app.FragmentManager;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.fimi.kernel.utils.C1681v;
import com.fimi.overseas.soul.C1704R;
import com.fimi.soul.base.BaseActivity;
import com.fimi.soul.base.C1756a;
import com.fimi.soul.drone.C2083a;
import com.fimi.soul.drone.C2104d;
import com.fimi.soul.drone.p205i.C2352k;
import com.fimi.soul.entity.DeviceType;
import com.fimi.soul.module.calibcompass.BaseCaliCompassFragment;
import com.fimi.soul.module.calibcompass.CaliComPassFirstFragment;
import com.fimi.soul.module.calibcompass.CaliComPassThirdFragment;
import com.fimi.soul.module.calibcompass.CaliCompassErrorFragment;
import com.fimi.soul.module.p214c.C2523d;
import com.fimi.soul.utils.p219a.C3069b;
import com.fimi.soul.view.CompassMeterView;
import com.fimi.soul.view.DialogC3245f;
import java.util.Iterator;
/* loaded from: classes.dex */
public class CaliCompassActivity extends BaseActivity implements View.OnClickListener, BaseCaliCompassFragment.AbstractC2524a, CaliComPassFirstFragment.AbstractC2527a, CaliComPassThirdFragment.AbstractC2529a, CaliCompassErrorFragment.AbstractC2536a {

    /* renamed from: a */
    private CaliComPassFirstFragment f8217a;

    /* renamed from: b */
    private CaliCompassSecondFragment f8218b;

    /* renamed from: c */
    private CaliCompassErrorFragment f8219c;

    /* renamed from: d */
    private CaliComPassThirdFragment f8220d;

    /* renamed from: e */
    private CaliCompassFourFragment f8221e;

    /* renamed from: f */
    private CaliCompassErrorVertialFragment f8222f;

    /* renamed from: g */
    private CaliCompassStatusFragment f8223g;

    /* renamed from: h */
    private FragmentManager f8224h;

    /* renamed from: i */
    private boolean f8225i;

    /* renamed from: j */
    private boolean f8226j;

    /* renamed from: l */
    private boolean f8228l;

    /* renamed from: p */
    private boolean f8232p;

    /* renamed from: q */
    private TextView f8233q;

    /* renamed from: r */
    private Button f8234r;

    /* renamed from: t */
    private CompassMeterView f8236t;

    /* renamed from: u */
    private RelativeLayout f8237u;

    /* renamed from: v */
    private TextView f8238v;

    /* renamed from: k */
    private boolean f8227k = true;

    /* renamed from: m */
    private final int f8229m = 11;

    /* renamed from: n */
    private final int f8230n = 12;

    /* renamed from: o */
    private final int f8231o = 13;

    /* renamed from: s */
    private Handler f8235s = new Handler() { // from class: com.fimi.soul.module.calibcompass.CaliCompassActivity.1
        @Override // android.os.Handler
        public void handleMessage(Message message) {
            super.handleMessage(message);
            switch (message.what) {
                case 11:
                default:
                    return;
                case 12:
                    if (CaliCompassActivity.this.f8217a == null) {
                        return;
                    }
                    CaliCompassActivity.this.f8232p = true;
                    CaliCompassActivity.this.f8217a.m31345a(true);
                    return;
                case 13:
                    if (!CaliCompassActivity.this.drone.mo32905ac() && CaliCompassActivity.this.drone.mo32906ab().mo32588a()) {
                        CaliCompassActivity.this.m31339a(C1704R.C1707string.GC_caliFail_discon_drone, "error", false, false);
                        return;
                    } else if (CaliCompassActivity.this.drone.mo32906ab().mo32588a()) {
                        return;
                    } else {
                        CaliCompassActivity.this.m31339a(C1704R.C1707string.GC_caliFail_discon, "error", false, false);
                        return;
                    }
            }
        }
    };

    /* renamed from: w */
    private boolean f8239w = false;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m31339a(int i, String str, boolean z, boolean z2) {
        m31334a(getString(C1704R.C1707string.calicompassesucess));
        if (this.f8227k) {
            Iterator<Fragment> it2 = this.f8224h.getFragments().iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Fragment next = it2.next();
                if (next != null && next.isVisible()) {
                    Fragment findFragmentByTag = this.f8224h.findFragmentByTag(str);
                    if ((findFragmentByTag instanceof CaliCompassErrorFragment) && findFragmentByTag.isHidden()) {
                        ((CaliCompassErrorFragment) findFragmentByTag).m31324a(getString(i), z, z2);
                        this.f8224h.beginTransaction().hide(next).show(findFragmentByTag).commitAllowingStateLoss();
                    }
                }
            }
        }
        this.f8223g.m31308a(false);
    }

    /* renamed from: a */
    private void m31338a(Bundle bundle) {
        this.f8224h = getSupportFragmentManager();
        if (bundle == null) {
            this.f8223g = (CaliCompassStatusFragment) this.f8224h.findFragmentById(C1704R.C1706id.compass_begin);
            if (this.f8223g == null) {
                this.f8223g = new CaliCompassStatusFragment();
            }
            this.f8224h.beginTransaction().add(C1704R.C1706id.compass_begin, this.f8223g, "begin").commitAllowingStateLoss();
            this.f8217a = (CaliComPassFirstFragment) this.f8224h.findFragmentById(C1704R.C1706id.compass_first);
            if (this.f8217a == null) {
                this.f8217a = new CaliComPassFirstFragment();
            }
            this.f8224h.beginTransaction().add(C1704R.C1706id.compass_first, this.f8217a, "first").hide(this.f8217a).commitAllowingStateLoss();
            this.f8218b = (CaliCompassSecondFragment) this.f8224h.findFragmentById(C1704R.C1706id.compass_second);
            if (this.f8218b == null) {
                this.f8218b = new CaliCompassSecondFragment();
            }
            this.f8224h.beginTransaction().add(C1704R.C1706id.compass_second, this.f8218b, "second").hide(this.f8218b).commitAllowingStateLoss();
            this.f8219c = (CaliCompassErrorFragment) this.f8224h.findFragmentById(C1704R.C1706id.compass_error);
            if (this.f8219c == null) {
                this.f8219c = new CaliCompassErrorFragment();
                this.f8219c.m31323a(this.f8225i);
            }
            this.f8224h.beginTransaction().add(C1704R.C1706id.compass_error, this.f8219c, "error").hide(this.f8219c).commitAllowingStateLoss();
            this.f8220d = (CaliComPassThirdFragment) this.f8224h.findFragmentById(C1704R.C1706id.compass_thrid);
            if (this.f8220d == null) {
                this.f8220d = new CaliComPassThirdFragment();
            }
            this.f8224h.beginTransaction().add(C1704R.C1706id.compass_thrid, this.f8220d, "thrid").hide(this.f8220d).commitAllowingStateLoss();
            this.f8221e = (CaliCompassFourFragment) this.f8224h.findFragmentById(C1704R.C1706id.compass_four);
            if (this.f8221e == null) {
                this.f8221e = new CaliCompassFourFragment();
            }
            this.f8221e.m31312a(this.f8225i);
            this.f8224h.beginTransaction().add(C1704R.C1706id.compass_four, this.f8221e, "four").hide(this.f8221e).commitAllowingStateLoss();
            this.f8222f = (CaliCompassErrorVertialFragment) this.f8224h.findFragmentById(C1704R.C1706id.compass_error_vertail);
            if (this.f8222f == null) {
                this.f8222f = new CaliCompassErrorVertialFragment();
            }
            this.f8224h.beginTransaction().add(C1704R.C1706id.compass_error_vertail, this.f8222f, "errortratil").hide(this.f8222f).commitAllowingStateLoss();
        }
    }

    @Override // com.fimi.soul.module.calibcompass.BaseCaliCompassFragment.AbstractC2524a
    /* renamed from: a */
    public void mo31341a() {
        new DialogC3245f.C3246a(this).m28641a(getString(C1704R.C1707string.interruptcaliremote)).m28640a(getString(C1704R.C1707string.cancel), new DialogInterface.OnClickListener() { // from class: com.fimi.soul.module.calibcompass.CaliCompassActivity.3
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i) {
            }
        }).m28634b(getString(C1704R.C1707string.ensure), new DialogInterface.OnClickListener() { // from class: com.fimi.soul.module.calibcompass.CaliCompassActivity.2
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i) {
                if (CaliCompassActivity.this.f8219c != null) {
                    CaliCompassActivity.this.f8228l = true;
                    CaliCompassActivity.this.f8219c.m31327a();
                }
                CaliCompassActivity.this.finish();
            }
        }).m28645a().show();
    }

    /* renamed from: a */
    public void m31340a(float f) {
        Log.i("istep", "" + f);
        float abs = Math.abs(1.0f - (f / 10.0f));
        this.f8236t.setEngine(true);
        this.f8236t.setCurrentProgress((int) (100.0f * abs));
        if (0.4d < abs && abs <= 1.0d) {
            this.f8238v.setText(getString(C1704R.C1707string.magnetic_environment_C));
            this.f8238v.setTextColor(getResources().getColor(C1704R.color.magnetic_environment_C));
        } else if (0.2d >= abs || abs > 0.4d) {
            this.f8238v.setText(getString(C1704R.C1707string.magnetic_environment_A));
            this.f8238v.setTextColor(getResources().getColor(C1704R.color.magnetic_environment_A));
        } else {
            this.f8238v.setText(getString(C1704R.C1707string.magnetic_environment_B));
            this.f8238v.setTextColor(getResources().getColor(C1704R.color.magnetic_environment_B));
        }
    }

    /* renamed from: a */
    public void m31334a(String str) {
        this.f8233q.setText(str);
    }

    @Override // com.fimi.soul.module.calibcompass.CaliComPassThirdFragment.AbstractC2529a
    /* renamed from: a */
    public void mo31333a(boolean z) {
        if (!z && this.f8235s.hasMessages(13)) {
            this.f8235s.removeMessages(13);
        }
        this.f8239w = z;
    }

    @Override // com.fimi.soul.module.calibcompass.CaliComPassFirstFragment.AbstractC2527a
    /* renamed from: b */
    public void mo31332b() {
    }

    /* renamed from: c */
    public void m31329c() {
        this.f8236t = (CompassMeterView) findViewById(C1704R.C1706id.campass_meter_h_view);
        this.f8238v = (TextView) findViewById(C1704R.C1706id.campass_info_tv);
        this.f8236t.setTitle(getString(C1704R.C1707string.compass_magnetic_h));
        this.f8237u = (RelativeLayout) findViewById(C1704R.C1706id.leftView);
        this.f8233q = (TextView) findViewById(C1704R.C1706id.tv_settingTitle);
        this.f8233q.setText(C1704R.C1707string.compass_calibration);
        this.f8234r = (Button) findViewById(C1704R.C1706id.black_btn);
        this.f8234r.setOnClickListener(this);
    }

    @Override // com.fimi.soul.module.calibcompass.CaliCompassErrorFragment.AbstractC2536a
    /* renamed from: d */
    public void mo31318d() {
        this.f8226j = true;
        this.f8224h.beginTransaction().hide(this.f8219c).show(this.f8224h.findFragmentByTag("begin")).commitAllowingStateLoss();
    }

    @Override // com.fimi.soul.module.calibcompass.CaliCompassErrorFragment.AbstractC2536a
    /* renamed from: e */
    public void mo31317e() {
        if (this.f8221e != null) {
            this.f8221e.m31315a();
        }
    }

    /* renamed from: f */
    public void m31328f() {
        this.f8238v.setText(C1704R.C1707string.no_use);
        this.f8238v.setTextColor(getResources().getColor(C1704R.color.meter_text));
        this.f8236t.setEngine(false);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        switch (view.getId()) {
            case C1704R.C1706id.black_btn /* 2131756179 */:
                if (this.f8223g == null || this.f8223g.isVisible() || this.f8219c == null || this.f8219c.isVisible()) {
                    finish();
                    return;
                } else {
                    mo31341a();
                    return;
                }
            default:
                return;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.fimi.soul.base.BaseActivity, com.fimi.soul.base.BaseFimiActivity, com.fimi.kernel.BaseActivity, android.support.p001v4.app.FragmentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        getWindow().setFlags(128, 128);
        super.onCreate(bundle);
        setContentView(C1704R.layout.calicompassmain);
        m31329c();
        this.f8225i = getIntent().getBooleanExtra(C1756a.f4525R, false);
        m31338a(bundle);
        this.dpa.m34276b(this);
        this.f8235s.sendEmptyMessageDelayed(12, 300L);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.fimi.soul.base.BaseActivity, com.fimi.soul.base.BaseFimiActivity, com.fimi.kernel.BaseActivity, android.support.p001v4.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.f8239w = false;
        if (this.speakTTs != null) {
            this.speakTTs.m34856e();
        }
    }

    @Override // com.fimi.soul.base.BaseActivity, com.fimi.soul.drone.C2104d.AbstractC2106b
    public void onDroneEvent(C2104d.EnumC2105a enumC2105a, C2083a c2083a) {
        super.onDroneEvent(enumC2105a, c2083a);
        switch (enumC2105a) {
            case Remotecontrol:
                if (!c2083a.mo32905ac() && this.f8223g != null && !this.f8223g.isVisible()) {
                    if (!this.f8239w) {
                        m31339a(C1704R.C1707string.GC_caliFail_discon_drone, "error", false, false);
                    } else if (!this.f8235s.hasMessages(13)) {
                        this.f8235s.sendEmptyMessageDelayed(13, 10000L);
                    }
                }
                if (!c2083a.mo32905ac()) {
                    m31328f();
                    break;
                }
                break;
            case HEARDDAY:
                m31340a(c2083a.mo32891w().m32196a());
                break;
            case CLEANALLOBJ:
                m31328f();
                break;
        }
        if (enumC2105a == C2104d.EnumC2105a.CLEANALLOBJ && this.f8223g != null && !this.f8223g.isVisible()) {
            m31339a(C1704R.C1707string.GC_caliFail_discon, "error", false, false);
            m31328f();
        }
        if (this.f8223g == null || this.f8223g.isVisible() || enumC2105a != C2104d.EnumC2105a.CaliCompass) {
            return;
        }
        C2352k m32978k = c2083a.m32978k();
        if (this.f8232p && ((m32978k.m31916d() == 1 || m32978k.m31916d() == 2) && m32978k.m31914e() == 1 && m32978k.m31920b() == 1 && m32978k.m31918c() == 3)) {
            m31339a(C1704R.C1707string.calierrordata, "error", false, false);
        } else if (this.f8226j && ((m32978k.m31916d() == 1 || m32978k.m31916d() == 0) && m32978k.m31914e() == 1 && m32978k.m31920b() == 1 && (m32978k.m31918c() == 1 || m32978k.m31918c() == 0))) {
            this.f8226j = false;
            this.f8227k = true;
            C2523d.m31374a(c2083a).m31384a((byte) 1, (byte) 1, (byte) 1);
        } else if (m32978k.m31918c() != 4) {
            if (m32978k.m31918c() != 5) {
                return;
            }
            m31339a(0, "errortratil", false, false);
        } else if (this.f8228l) {
            m31339a(C1704R.C1707string.calierror, "error", false, true);
        } else {
            m31339a(C1704R.C1707string.calierror, "error", false, false);
        }
    }

    @Override // android.support.p001v4.app.FragmentActivity, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i != 4 || this.f8223g == null || this.f8223g.isVisible() || this.f8219c == null || this.f8219c.isVisible()) {
            return super.onKeyDown(i, keyEvent);
        }
        mo31341a();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.fimi.soul.base.BaseActivity, com.fimi.kernel.BaseActivity, android.support.p001v4.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        if (C1681v.m34543a(this).m34495v() != DeviceType.DEVICE_4K) {
            if (C1681v.m34543a(this).m34495v() != DeviceType.DEVICE_1080P) {
                return;
            }
            this.f8237u.setVisibility(8);
        } else if (new C3069b().m29394b(this, this.drone, 1069)) {
            this.f8237u.setVisibility(0);
        } else {
            this.f8237u.setVisibility(8);
        }
    }
}
