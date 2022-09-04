package com.fimi.soul.module.setting.gimaltuneparameter;

import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.fimi.kernel.C1642c;
import com.fimi.kernel.utils.C1688z;
import com.fimi.overseas.soul.C1704R;
import com.fimi.soul.base.BaseActivity;
import com.fimi.soul.drone.C2083a;
import com.fimi.soul.drone.C2104d;
import com.fimi.soul.module.setting.GimalCalibration.C2874a;
import com.fimi.soul.module.setting.gimaltuneparameter.GimalTuneParameterView;
import com.fimi.soul.module.update.C3029b;
import com.fimi.soul.module.update.p218a.C3021a;
import com.fimi.soul.module.update.p218a.C3022b;
import com.fimi.soul.utils.C3103au;
import com.fimi.soul.view.DialogC3245f;
/* loaded from: classes.dex */
public class GimalTuneParameterActivity extends BaseActivity implements View.OnClickListener, C2874a.AbstractC2876a, GimalTuneParameterView.AbstractC2928a {

    /* renamed from: k */
    private static final int f10460k = 1;

    /* renamed from: l */
    private static final int f10461l = 2;

    /* renamed from: m */
    private static final int f10462m = 3;

    /* renamed from: a */
    private Button f10463a;

    /* renamed from: b */
    private Button f10464b;

    /* renamed from: c */
    private Button f10465c;

    /* renamed from: d */
    private Button f10466d;

    /* renamed from: e */
    private TextView f10467e;

    /* renamed from: f */
    private TextView f10468f;

    /* renamed from: g */
    private TextView f10469g;

    /* renamed from: h */
    private GimalTuneParameterView f10470h;

    /* renamed from: i */
    private C2874a f10471i;

    /* renamed from: j */
    private C2930a f10472j;

    /* renamed from: n */
    private boolean f10473n = false;

    /* renamed from: o */
    private boolean f10474o = false;

    /* renamed from: p */
    private int f10475p = 1;

    /* renamed from: q */
    private boolean f10476q = true;

    /* renamed from: r */
    private boolean f10477r = true;

    /* renamed from: s */
    private Handler f10478s = new Handler() { // from class: com.fimi.soul.module.setting.gimaltuneparameter.GimalTuneParameterActivity.1
        @Override // android.os.Handler
        public void handleMessage(Message message) {
            super.handleMessage(message);
            if (message.what == 1) {
                GimalTuneParameterActivity.this.f10472j.m29897a((byte) 2);
            } else if (message.what == 2) {
                if (GimalTuneParameterActivity.this.f10473n) {
                    return;
                }
                GimalTuneParameterActivity.this.f10471i.m30119c(5);
            } else if (message.what != 3) {
            } else {
                if (GimalTuneParameterActivity.this.f10474o) {
                    GimalTuneParameterActivity.this.f10465c.setBackgroundResource(C1704R.C1705drawable.button_setup_adjust_increase_selector);
                    GimalTuneParameterActivity.this.f10466d.setBackgroundResource(C1704R.C1705drawable.button_setup_adjust_reduce_selector);
                    GimalTuneParameterActivity.this.f10465c.setEnabled(true);
                    GimalTuneParameterActivity.this.f10466d.setEnabled(true);
                    GimalTuneParameterActivity.this.f10464b.setEnabled(true);
                    GimalTuneParameterActivity.this.f10464b.setAlpha(1.0f);
                    C1688z.m34448a(GimalTuneParameterActivity.this, GimalTuneParameterActivity.this.getString(C1704R.C1707string.gimal_tune_result_fault));
                }
                GimalTuneParameterActivity.this.f10474o = false;
                GimalTuneParameterActivity.this.f10470h.setState(GimalTuneParameterView.EnumC2929b.NOMAL);
            }
        }
    };

    /* renamed from: a */
    private void m29926a(boolean z) {
        if (z) {
            this.f10465c.setBackgroundResource(C1704R.C1705drawable.button_setup_adjust_increase_selector);
            this.f10466d.setBackgroundResource(C1704R.C1705drawable.button_setup_adjust_reduce_selector);
            this.f10465c.setEnabled(true);
            this.f10466d.setEnabled(true);
            this.f10464b.setEnabled(true);
            this.f10464b.setAlpha(1.0f);
            return;
        }
        this.f10465c.setBackgroundResource(C1704R.C1705drawable.button_setup_adjust_increase_no);
        this.f10466d.setBackgroundResource(C1704R.C1705drawable.button_setup_adjust_reduce_no);
        this.f10465c.setEnabled(false);
        this.f10466d.setEnabled(false);
        this.f10464b.setEnabled(false);
        this.f10464b.setAlpha(0.3f);
    }

    /* renamed from: g */
    private void m29914g() {
        this.f10463a = (Button) findViewById(C1704R.C1706id.black_btn);
        this.f10463a.setOnClickListener(this);
        this.f10467e = (TextView) findViewById(C1704R.C1706id.tv_settingTitle);
        this.f10467e.setText(C1704R.C1707string.gimbal_tune_parameter);
        this.f10470h = (GimalTuneParameterView) findViewById(C1704R.C1706id.gimal_tune_parameter_view);
        this.f10469g = (TextView) findViewById(C1704R.C1706id.gimal_sensitivity_tv);
        this.f10465c = (Button) findViewById(C1704R.C1706id.increase_btn);
        this.f10466d = (Button) findViewById(C1704R.C1706id.reduce_btn);
        this.f10468f = (TextView) findViewById(C1704R.C1706id.prompt_tv);
        this.f10464b = (Button) findViewById(C1704R.C1706id.gimal_reset_btn);
        this.f10464b.setVisibility(0);
        this.f10464b.setOnClickListener(this);
        this.f10465c.setOnClickListener(this);
        this.f10466d.setOnClickListener(this);
        this.f10470h.setGimalTuneParameterListerner(this);
        C3103au.m29232a(getAssets(), this.f10467e, this.f10469g, this.f10468f);
    }

    /* renamed from: h */
    private void m29912h() {
        this.f10471i = new C2874a(this, this.drone);
        this.f10469g.setText(getString(C1704R.C1707string.gimal_tune_para_tune_sensitivity, new Object[]{100}));
        this.f10471i.m30115e();
        this.f10470h.setProgress(C1642c.m34885e().m34522f());
        this.f10472j = new C2930a(this.drone);
        this.f10472j.m29897a((byte) 2);
        if (!this.drone.mo32905ac()) {
            this.f10477r = false;
            this.f10468f.setText(C1704R.C1707string.gimal_tune_parameter_connect_flight_prompt);
            this.f10470h.setState(GimalTuneParameterView.EnumC2929b.ALL_NO_OPERABLE);
            m29926a(false);
        } else if (this.drone.m33007ao().m31755u()) {
            this.f10476q = false;
            this.f10468f.setText(C1704R.C1707string.gimal_tune_parameter_connect_gimal_prompt);
            this.f10470h.setState(GimalTuneParameterView.EnumC2929b.ALL_NO_OPERABLE);
            m29926a(false);
        } else {
            this.f10477r = true;
            this.f10476q = true;
            this.f10468f.setText(C1704R.C1707string.gimal_tune_parameter_no_move_gimal_prompt);
            m29926a(true);
        }
        C3021a.m29616a().m29615a(3).m29566b();
    }

    /* renamed from: i */
    private int m29910i() {
        C3022b c3022b = (C3022b) C1642c.m34887c().mo34880a(C3029b.f11258C, C3022b.class);
        if (c3022b == null) {
            c3022b = new C3022b();
        }
        if (c3022b == null || c3022b.m29600c() <= 0) {
            return 0;
        }
        return c3022b.m29600c();
    }

    @Override // com.fimi.soul.module.setting.gimaltuneparameter.GimalTuneParameterView.AbstractC2928a
    /* renamed from: a */
    public void mo29899a() {
        if (m29910i() < 2016) {
            C1688z.m34448a(this, getString(C1704R.C1707string.gimal_please_upgrade_new_fimware));
        } else if (this.drone.m33009am()) {
            C1688z.m34448a(this, getString(C1704R.C1707string.gimal_tune_flight_hint));
        } else {
            this.f10471i.m30119c(6);
        }
    }

    @Override // com.fimi.soul.module.setting.GimalCalibration.C2874a.AbstractC2876a
    /* renamed from: a */
    public void mo29930a(int i) {
        if (this.drone.m33000av().m32359c() == 6) {
            if (i <= 0 || i == 100) {
                if (i != 100) {
                    return;
                }
                this.f10475p = 0;
                this.f10470h.setState(GimalTuneParameterView.EnumC2929b.NOMAL);
                this.f10470h.setCenterBtnText(getString(C1704R.C1707string.gimal_tune_para_auto_tune));
                this.f10468f.setText(C1704R.C1707string.gimal_tune_para_tune_completed_prompt);
                m29926a(true);
                this.f10472j.m29897a((byte) 2);
                return;
            }
            this.f10475p++;
            if (this.f10475p <= 10) {
                this.f10470h.setCenterBtnText(getString(C1704R.C1707string.gimal_tune_para_tuning) + ".");
            } else if (this.f10475p <= 20) {
                this.f10470h.setCenterBtnText(getString(C1704R.C1707string.gimal_tune_para_tuning) + "..");
            } else if (this.f10475p <= 30) {
                this.f10470h.setCenterBtnText(getString(C1704R.C1707string.gimal_tune_para_tuning) + "...");
            } else {
                this.f10475p = 0;
            }
            this.f10470h.setState(GimalTuneParameterView.EnumC2929b.AUTO_TUNE);
            this.f10468f.setText(C1704R.C1707string.gimal_tune_parameter_no_move_gimal_prompt);
            this.f10470h.setTuneProgress(i);
            m29926a(false);
        }
    }

    @Override // com.fimi.soul.module.setting.gimaltuneparameter.GimalTuneParameterView.AbstractC2928a
    /* renamed from: a */
    public void mo29898a(int i, boolean z) {
        if (!z) {
            this.f10469g.setText(getString(C1704R.C1707string.gimal_tune_para_tune_sensitivity, new Object[]{Integer.valueOf(i)}));
        } else if (m29910i() < 2016) {
            C1688z.m34448a(this, getString(C1704R.C1707string.gimal_please_upgrade_new_fimware));
        } else {
            this.f10464b.setEnabled(true);
            this.f10464b.setAlpha(1.0f);
            this.f10472j.m29896a((byte) 2, i, i, i);
        }
    }

    @Override // com.fimi.soul.module.setting.GimalCalibration.C2874a.AbstractC2876a
    /* renamed from: a */
    public void mo29927a(String str) {
        if (str != null) {
            this.f10468f.setText(str);
            return;
        }
        this.f10468f.setText(this.drone.f5919d.getString(C1704R.C1707string.GC_tune_fail));
        this.f10470h.setState(GimalTuneParameterView.EnumC2929b.NOMAL);
        this.f10470h.setCenterBtnText(getString(C1704R.C1707string.gimal_tune_para_auto_tune));
        m29926a(true);
        this.f10472j.m29897a((byte) 2);
    }

    @Override // com.fimi.soul.module.setting.GimalCalibration.C2874a.AbstractC2876a
    /* renamed from: b */
    public void mo29925b() {
    }

    @Override // com.fimi.soul.module.setting.GimalCalibration.C2874a.AbstractC2876a
    /* renamed from: b */
    public void mo29924b(int i) {
    }

    @Override // com.fimi.soul.module.setting.GimalCalibration.C2874a.AbstractC2876a
    /* renamed from: c */
    public void mo29922c() {
        this.f10478s.removeMessages(1);
        this.f10473n = true;
        this.f10478s.sendEmptyMessageDelayed(1, 1000L);
        this.f10478s.sendEmptyMessageDelayed(1, 2000L);
        this.f10478s.sendEmptyMessageDelayed(1, 3000L);
    }

    @Override // com.fimi.soul.module.setting.GimalCalibration.C2874a.AbstractC2876a
    /* renamed from: d */
    public void mo29920d() {
    }

    @Override // com.fimi.soul.module.setting.GimalCalibration.C2874a.AbstractC2876a
    /* renamed from: e */
    public void mo29918e() {
    }

    /* renamed from: f */
    public void m29916f() {
        DialogC3245f.C3246a c3246a = new DialogC3245f.C3246a(this);
        c3246a.m28641a(getString(C1704R.C1707string.interrupt_tune));
        c3246a.m28640a(getString(C1704R.C1707string.cancel), new DialogInterface.OnClickListener() { // from class: com.fimi.soul.module.setting.gimaltuneparameter.GimalTuneParameterActivity.3
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.dismiss();
            }
        }).m28634b(getString(C1704R.C1707string.ensure), new DialogInterface.OnClickListener() { // from class: com.fimi.soul.module.setting.gimaltuneparameter.GimalTuneParameterActivity.2
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.dismiss();
                GimalTuneParameterActivity.this.f10471i.m30118d();
                GimalTuneParameterActivity.this.finish();
            }
        }).m28645a().show();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view.getId() == C1704R.C1706id.black_btn) {
            if (this.f10470h.getState() == GimalTuneParameterView.EnumC2929b.AUTO_TUNE) {
                m29916f();
            } else {
                finish();
            }
        } else if (view.getId() == C1704R.C1706id.increase_btn) {
            int progress = this.f10470h.getProgress();
            if (progress >= 120) {
                return;
            }
            if (m29910i() < 2016) {
                C1688z.m34448a(this, getString(C1704R.C1707string.gimal_please_upgrade_new_fimware));
            } else {
                this.f10472j.m29896a((byte) 2, progress + 1, progress + 1, progress + 1);
            }
        } else if (view.getId() == C1704R.C1706id.reduce_btn) {
            int progress2 = this.f10470h.getProgress();
            if (progress2 <= 80) {
                return;
            }
            if (m29910i() < 2016) {
                C1688z.m34448a(this, getString(C1704R.C1707string.gimal_please_upgrade_new_fimware));
            } else {
                this.f10472j.m29896a((byte) 2, progress2 - 1, progress2 - 1, progress2 - 1);
            }
        } else if (view.getId() != C1704R.C1706id.gimal_reset_btn) {
        } else {
            if (m29910i() < 2016) {
                C1688z.m34448a(this, getString(C1704R.C1707string.gimal_please_upgrade_new_fimware));
                return;
            }
            this.f10471i.m30119c(5);
            this.f10464b.setEnabled(false);
            this.f10464b.setAlpha(0.3f);
            this.f10473n = false;
            this.f10474o = true;
            this.f10478s.removeMessages(2);
            this.f10478s.removeMessages(3);
            this.f10478s.sendEmptyMessageDelayed(2, 1000L);
            this.f10478s.sendEmptyMessageDelayed(3, 3000L);
            this.f10470h.setState(GimalTuneParameterView.EnumC2929b.ALL_NO_OPERABLE);
            m29926a(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.fimi.soul.base.BaseActivity, com.fimi.soul.base.BaseFimiActivity, com.fimi.kernel.BaseActivity, android.support.p001v4.app.FragmentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C1704R.layout.activity_gimal_tune_parameter);
        m29914g();
        m29912h();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.fimi.soul.base.BaseActivity, com.fimi.soul.base.BaseFimiActivity, com.fimi.kernel.BaseActivity, android.support.p001v4.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        if (this.f10478s != null) {
            this.f10478s.removeCallbacksAndMessages(null);
        }
        this.f10471i.m30114f();
    }

    @Override // com.fimi.soul.base.BaseActivity, com.fimi.soul.drone.C2104d.AbstractC2106b
    public void onDroneEvent(C2104d.EnumC2105a enumC2105a, C2083a c2083a) {
        super.onDroneEvent(enumC2105a, c2083a);
        switch (enumC2105a) {
            case GIMAL_PARAMETER_CONFIG:
                if (c2083a.mo32907aa().m32352b() != 0 || c2083a.mo32907aa().m32350c() != 2) {
                    return;
                }
                if (c2083a.mo32907aa().m32348d() == 5) {
                    this.f10464b.setEnabled(true);
                    this.f10464b.setAlpha(1.0f);
                }
                if (this.f10474o && c2083a.mo32907aa().m32346e() == 100) {
                    this.f10465c.setBackgroundResource(C1704R.C1705drawable.button_setup_adjust_increase_selector);
                    this.f10466d.setBackgroundResource(C1704R.C1705drawable.button_setup_adjust_reduce_selector);
                    this.f10465c.setEnabled(true);
                    this.f10466d.setEnabled(true);
                    this.f10470h.setState(GimalTuneParameterView.EnumC2929b.NOMAL);
                    C1688z.m34448a(this, getString(C1704R.C1707string.gimal_tune_result_success));
                    this.f10474o = false;
                }
                if (c2083a.mo32907aa().m32346e() == 100) {
                    this.f10478s.removeMessages(1);
                }
                byte m32346e = c2083a.mo32907aa().m32346e();
                C1642c.m34885e().m34537b(m32346e);
                this.f10469g.setText(getString(C1704R.C1707string.gimal_tune_para_tune_sensitivity, new Object[]{Integer.valueOf(m32346e)}));
                this.f10470h.setProgress(m32346e);
                return;
            case CLEANALLOBJ:
            case Remotecontrol:
                if (!c2083a.mo32905ac() && this.f10477r) {
                    this.f10477r = false;
                    this.f10468f.setText(C1704R.C1707string.gimal_tune_parameter_connect_flight_prompt);
                    this.f10470h.setCenterBtnText(getString(C1704R.C1707string.gimal_tune_para_auto_tune));
                    this.f10470h.setState(GimalTuneParameterView.EnumC2929b.ALL_NO_OPERABLE);
                    m29926a(false);
                    return;
                } else if (c2083a.m33007ao().m31755u() && this.f10476q) {
                    this.f10476q = false;
                    this.f10470h.setCenterBtnText(getString(C1704R.C1707string.gimal_tune_para_auto_tune));
                    this.f10468f.setText(C1704R.C1707string.gimal_tune_parameter_connect_gimal_prompt);
                    this.f10470h.setState(GimalTuneParameterView.EnumC2929b.ALL_NO_OPERABLE);
                    m29926a(false);
                    return;
                } else if (c2083a.mo32905ac() && !this.f10477r) {
                    this.f10477r = true;
                    this.f10470h.setCenterBtnText(getString(C1704R.C1707string.gimal_tune_para_auto_tune));
                    this.f10470h.setState(GimalTuneParameterView.EnumC2929b.NOMAL);
                    this.f10468f.setText(C1704R.C1707string.gimal_tune_parameter_no_move_gimal_prompt);
                    this.f10472j.m29897a((byte) 2);
                    m29926a(true);
                    return;
                } else if (c2083a.m33007ao().m31755u() || this.f10476q) {
                    return;
                } else {
                    this.f10476q = true;
                    this.f10470h.setCenterBtnText(getString(C1704R.C1707string.gimal_tune_para_auto_tune));
                    this.f10470h.setState(GimalTuneParameterView.EnumC2929b.NOMAL);
                    this.f10468f.setText(C1704R.C1707string.gimal_tune_parameter_no_move_gimal_prompt);
                    this.f10472j.m29897a((byte) 2);
                    m29926a(true);
                    return;
                }
            case PTZ_GAIN:
                if (this.f10470h == null) {
                }
                return;
            default:
                return;
        }
    }

    @Override // android.support.p001v4.app.FragmentActivity, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i == 4 && this.f10470h.getState() == GimalTuneParameterView.EnumC2929b.AUTO_TUNE) {
            m29916f();
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }
}
