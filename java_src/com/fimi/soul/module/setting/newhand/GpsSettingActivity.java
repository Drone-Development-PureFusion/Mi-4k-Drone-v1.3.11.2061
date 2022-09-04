package com.fimi.soul.module.setting.newhand;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;
import com.fimi.kernel.C1642c;
import com.fimi.kernel.utils.C1679t;
import com.fimi.kernel.utils.C1688z;
import com.fimi.kernel.view.button.SwitchButton;
import com.fimi.overseas.soul.C1704R;
import com.fimi.soul.base.BaseActivity;
import com.fimi.soul.base.DroidPlannerApp;
import com.fimi.soul.biz.p170b.C1772d;
import com.fimi.soul.drone.C2083a;
import com.fimi.soul.drone.C2104d;
import com.fimi.soul.module.setting.C2912d;
import com.fimi.soul.module.update.C3029b;
import com.fimi.soul.module.update.p218a.C3022b;
import com.fimi.soul.utils.C3103au;
import com.fimi.soul.view.DialogC3245f;
/* loaded from: classes.dex */
public class GpsSettingActivity extends BaseActivity implements View.OnClickListener, SwitchButton.AbstractC1695a, C2104d.AbstractC2106b {

    /* renamed from: H */
    private static final int f10607H = 1;

    /* renamed from: I */
    private static final int f10608I = 6;

    /* renamed from: J */
    private static final int f10609J = 2;

    /* renamed from: K */
    private static final int f10610K = 3;

    /* renamed from: L */
    private static final int f10611L = 5;

    /* renamed from: M */
    private static final int f10612M = 4;

    /* renamed from: N */
    private static final int f10613N = 1000;

    /* renamed from: O */
    private static final float f10614O = 0.3f;

    /* renamed from: P */
    private static final float f10615P = 1.0f;

    /* renamed from: Q */
    private static final int f10616Q = 300;

    /* renamed from: R */
    private static final int f10617R = 3000;

    /* renamed from: b */
    public static final String f10618b = "newhand_mode";

    /* renamed from: c */
    public static final String f10619c = "optical_flow_mode";

    /* renamed from: d */
    public static final String f10620d = "force_attitude_mode";

    /* renamed from: A */
    private int f10621A;

    /* renamed from: B */
    private float f10622B;

    /* renamed from: C */
    private float f10623C;

    /* renamed from: D */
    private float f10624D;

    /* renamed from: E */
    private float f10625E;

    /* renamed from: a */
    TextView f10634a;

    /* renamed from: e */
    private RelativeLayout f10635e;

    /* renamed from: f */
    private RelativeLayout f10636f;

    /* renamed from: g */
    private RelativeLayout f10637g;

    /* renamed from: h */
    private RelativeLayout f10638h;

    /* renamed from: i */
    private TextView f10639i;

    /* renamed from: j */
    private TextView f10640j;

    /* renamed from: k */
    private TextView f10641k;

    /* renamed from: l */
    private TextView f10642l;

    /* renamed from: m */
    private TextView f10643m;

    /* renamed from: n */
    private TextView f10644n;

    /* renamed from: o */
    private TextView f10645o;

    /* renamed from: p */
    private TextView f10646p;

    /* renamed from: q */
    private ImageView f10647q;

    /* renamed from: r */
    private ImageView f10648r;

    /* renamed from: s */
    private ImageView f10649s;

    /* renamed from: t */
    private SwitchButton f10650t;

    /* renamed from: u */
    private Context f10651u;

    /* renamed from: v */
    private AbstractC2973d f10652v;

    /* renamed from: w */
    private C3022b f10653w;

    /* renamed from: x */
    private boolean f10654x;

    /* renamed from: y */
    private C2083a f10655y;

    /* renamed from: z */
    private boolean f10656z = false;

    /* renamed from: F */
    private boolean f10626F = false;

    /* renamed from: G */
    private boolean f10627G = false;

    /* renamed from: S */
    private boolean f10628S = false;

    /* renamed from: T */
    private boolean f10629T = false;

    /* renamed from: U */
    private boolean f10630U = false;

    /* renamed from: V */
    private boolean f10631V = false;

    /* renamed from: W */
    private boolean f10632W = false;

    /* renamed from: X */
    private Handler f10633X = new Handler() { // from class: com.fimi.soul.module.setting.newhand.GpsSettingActivity.1
        @Override // android.os.Handler
        public void handleMessage(Message message) {
            super.handleMessage(message);
            switch (message.what) {
                case 1:
                    C2912d.m29999a(GpsSettingActivity.this.f10655y).m30001a();
                    return;
                case 2:
                    GpsSettingActivity.this.f10652v.mo29801a();
                    return;
                case 3:
                    GpsSettingActivity.this.f10652v.mo29793b();
                    return;
                case 4:
                    if (!GpsSettingActivity.this.f10628S) {
                        Toast.makeText(GpsSettingActivity.this.f10651u, (int) C1704R.C1707string.gps_setting_get_return_height_fail, 0).show();
                        GpsSettingActivity.this.f10645o.setText(C2954b.f10832au);
                    }
                    if (!GpsSettingActivity.this.f10631V) {
                        Toast.makeText(GpsSettingActivity.this.f10651u, (int) C1704R.C1707string.gps_setting_flight_distance_fail, 0).show();
                        if (GpsSettingActivity.this.f10650t.getToggleOn()) {
                            GpsSettingActivity.this.f10650t.m34420a(false, true);
                            GpsSettingActivity.this.f10646p.setText(C1704R.C1707string.gps_setting_distance_limit_500m);
                        }
                    }
                    if (!GpsSettingActivity.this.f10629T) {
                        Toast.makeText(GpsSettingActivity.this.f10651u, (int) C1704R.C1707string.get_setting_flight_speed_fail, 0).show();
                        GpsSettingActivity.this.f10643m.setText(C2954b.f10832au);
                    }
                    if (GpsSettingActivity.this.f10630U) {
                        return;
                    }
                    Toast.makeText(GpsSettingActivity.this.f10651u, (int) C1704R.C1707string.get_setting_flight_height_fail, 0).show();
                    GpsSettingActivity.this.f10644n.setText(C2954b.f10832au);
                    return;
                case 5:
                    GpsSettingActivity.this.f10652v.mo29790c();
                    return;
                case 6:
                    Toast.makeText(GpsSettingActivity.this.f10651u, "SET_RETURN_HEIGHT", 1).show();
                    C2912d.m29999a(GpsSettingActivity.this.f10655y).m30000a(30.0f);
                    return;
                default:
                    return;
            }
        }
    };

    /* renamed from: a */
    private void m29877a() {
        this.f10635e = (RelativeLayout) findViewById(C1704R.C1706id.flight_speed_rl);
        this.f10638h = (RelativeLayout) findViewById(C1704R.C1706id.flight_height_rl);
        this.f10636f = (RelativeLayout) findViewById(C1704R.C1706id.flight_distance_rl);
        this.f10637g = (RelativeLayout) findViewById(C1704R.C1706id.flight_back_height_rl);
        this.f10635e.setOnClickListener(this);
        this.f10638h.setOnClickListener(this);
        this.f10636f.setOnClickListener(this);
        this.f10637g.setOnClickListener(this);
        this.f10639i = (TextView) findViewById(C1704R.C1706id.flight_speed_setting_coontent_tv);
        this.f10640j = (TextView) findViewById(C1704R.C1706id.flight_height_setting_coontent_tv);
        this.f10641k = (TextView) findViewById(C1704R.C1706id.flight_distance_settig_coontent_tv);
        this.f10646p = (TextView) findViewById(C1704R.C1706id.flight_distance_settig_child_coontent_tv);
        this.f10642l = (TextView) findViewById(C1704R.C1706id.flight_back_height_coontent_tv);
        this.f10643m = (TextView) findViewById(C1704R.C1706id.flight_speed_setting_delcare);
        this.f10644n = (TextView) findViewById(C1704R.C1706id.flight_height_setting_delcare);
        this.f10645o = (TextView) findViewById(C1704R.C1706id.flight_back_height_setting_delcare);
        TextView textView = (TextView) findViewById(C1704R.C1706id.tv_settingTitle);
        textView.setText(getString(C1704R.C1707string.setting_gps_mode));
        this.f10634a = (TextView) findViewById(C1704R.C1706id.is_connect_tv);
        C3103au.m29232a(getAssets(), this.f10639i, this.f10640j, this.f10641k, this.f10646p, this.f10642l, this.f10643m, this.f10644n, this.f10645o, textView, this.f10634a);
        this.f10647q = (ImageView) findViewById(C1704R.C1706id.flight_speed_setting_more_iv);
        this.f10648r = (ImageView) findViewById(C1704R.C1706id.flight_height_setting_more_iv);
        this.f10649s = (ImageView) findViewById(C1704R.C1706id.flight_back_height_setting_more_iv);
        this.f10650t = (SwitchButton) findViewById(C1704R.C1706id.flight_distance_switch_btn);
        this.f10650t.setOnSwitchListener(this);
        if (this.f10627G) {
            this.f10646p.setText(String.format(getString(C1704R.C1707string.gps_setting_distance_limit_500m), String.valueOf((int) C1679t.m34553b(500.0d)) + "mph"));
        } else {
            this.f10646p.setText(String.format(getString(C1704R.C1707string.gps_setting_distance_limit_500m), "500m"));
        }
        findViewById(C1704R.C1706id.black_btn).setOnClickListener(new View.OnClickListener() { // from class: com.fimi.soul.module.setting.newhand.GpsSettingActivity.3
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                GpsSettingActivity.this.finish();
            }
        });
    }

    @TargetApi(16)
    /* renamed from: a */
    private void m29873a(boolean z) {
        float f = z ? f10614O : 1.0f;
        this.f10639i.setAlpha(f);
        this.f10643m.setAlpha(f);
        this.f10647q.setAlpha(f);
        this.f10640j.setAlpha(f);
        this.f10644n.setAlpha(f);
        this.f10648r.setAlpha(f);
        this.f10641k.setAlpha(f);
        this.f10646p.setAlpha(f);
        this.f10650t.setAlpha(f);
        this.f10642l.setAlpha(f);
        this.f10645o.setAlpha(f);
        this.f10649s.setAlpha(f);
        if (z) {
            this.f10635e.setBackgroundColor(getResources().getColor(C1704R.color.list_nomal));
            this.f10638h.setBackgroundColor(getResources().getColor(C1704R.color.list_nomal));
            this.f10636f.setBackgroundColor(getResources().getColor(C1704R.color.list_nomal));
            this.f10637g.setBackgroundColor(getResources().getColor(C1704R.color.list_nomal));
            return;
        }
        this.f10635e.setBackground(getResources().getDrawable(C1704R.C1705drawable.list_setting_selector));
        this.f10638h.setBackground(getResources().getDrawable(C1704R.C1705drawable.list_setting_selector));
        this.f10636f.setBackground(getResources().getDrawable(C1704R.C1705drawable.list_setting_selector));
        this.f10637g.setBackground(getResources().getDrawable(C1704R.C1705drawable.list_setting_selector));
    }

    /* renamed from: a */
    public void m29876a(float f, boolean z) {
        if (!z) {
            this.f10623C = f;
            C1642c.m34885e().m34532c(this.f10623C + "");
        }
        if (C1642c.m34885e().m34501p()) {
            if (f <= C1679t.m34551c(6.0d)) {
                this.f10643m.setText(Math.round(f) + this.f10651u.getString(C1704R.C1707string.speed_unit_mph) + this.f10651u.getString(C1704R.C1707string.setting_speed_low));
            } else if (f <= C1679t.m34551c(6.0d) || f > C1679t.m34551c(10.0d)) {
                this.f10643m.setText(Math.round(f) + this.f10651u.getString(C1704R.C1707string.speed_unit_mph) + this.f10651u.getString(C1704R.C1707string.setting_speed_hight));
            } else {
                this.f10643m.setText(Math.round(f) + this.f10651u.getString(C1704R.C1707string.speed_unit_mph) + this.f10651u.getString(C1704R.C1707string.setting_speed_standard));
            }
        } else if (f <= 6.0f) {
            this.f10643m.setText(((int) f) + this.f10651u.getString(C1704R.C1707string.speed_unit_m) + this.f10651u.getString(C1704R.C1707string.setting_speed_low));
        } else if (f <= 6.0f || f > 10.0f) {
            this.f10643m.setText(((int) f) + this.f10651u.getString(C1704R.C1707string.speed_unit_m) + this.f10651u.getString(C1704R.C1707string.setting_speed_hight));
        } else {
            this.f10643m.setText(((int) f) + this.f10651u.getString(C1704R.C1707string.speed_unit_m) + this.f10651u.getString(C1704R.C1707string.setting_speed_standard));
        }
    }

    @Override // com.fimi.kernel.view.button.SwitchButton.AbstractC1695a
    /* renamed from: a */
    public void mo28184a(View view, boolean z) {
        if (view.getId() == C1704R.C1706id.flight_distance_switch_btn) {
            if (z) {
                this.f10650t.m34420a(false, false);
            } else {
                this.f10650t.m34420a(true, false);
            }
            if (this.f10656z) {
                return;
            }
            this.f10652v.mo29797a(Math.round(this.f10625E), new AbstractC2974e() { // from class: com.fimi.soul.module.setting.newhand.GpsSettingActivity.10
                @Override // com.fimi.soul.module.setting.newhand.AbstractC2974e
                /* renamed from: a */
                public void mo29786a(int i) {
                    GpsSettingActivity.this.f10625E = i;
                }
            });
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        switch (view.getId()) {
            case C1704R.C1706id.flight_speed_rl /* 2131755310 */:
                if (this.f10656z) {
                    return;
                }
                this.f10652v.mo29791b(Math.round(this.f10623C), new AbstractC2974e() { // from class: com.fimi.soul.module.setting.newhand.GpsSettingActivity.4
                    @Override // com.fimi.soul.module.setting.newhand.AbstractC2974e
                    /* renamed from: a */
                    public void mo29786a(int i) {
                        GpsSettingActivity.this.f10623C = i;
                    }
                });
                return;
            case C1704R.C1706id.flight_distance_rl /* 2131755314 */:
                if (this.f10656z) {
                    return;
                }
                this.f10652v.mo29797a(Math.round(this.f10625E), new AbstractC2974e() { // from class: com.fimi.soul.module.setting.newhand.GpsSettingActivity.6
                    @Override // com.fimi.soul.module.setting.newhand.AbstractC2974e
                    /* renamed from: a */
                    public void mo29786a(int i) {
                        GpsSettingActivity.this.f10625E = i;
                    }
                });
                return;
            case C1704R.C1706id.flight_height_rl /* 2131755318 */:
                if (this.f10656z) {
                    return;
                }
                this.f10652v.mo29789c(Math.round(this.f10624D), new AbstractC2974e() { // from class: com.fimi.soul.module.setting.newhand.GpsSettingActivity.5
                    @Override // com.fimi.soul.module.setting.newhand.AbstractC2974e
                    /* renamed from: a */
                    public void mo29786a(int i) {
                        GpsSettingActivity.this.f10624D = i;
                    }
                });
                return;
            case C1704R.C1706id.flight_back_height_rl /* 2131755322 */:
                if (this.f10656z) {
                    return;
                }
                if (!this.f10654x && this.f10621A < C2912d.f10400g) {
                    C1688z.m34447a(this.f10651u, this.f10651u.getString(C1704R.C1707string.please_update_the_last_flight_version), 0);
                    return;
                } else if (!this.f10655y.mo32905ac()) {
                    C1688z.m34449a(this.f10651u, (int) C1704R.C1707string.set_new_hand_fail, C1688z.f4191b);
                    return;
                } else if (C1772d.m34208a().m34187k() && this.f10655y.m33009am() && (this.f10655y.m33001au().m32392e() == 7 || this.f10655y.m33001au().m32392e() == 8)) {
                    C1688z.m34447a(this.f10651u, this.f10651u.getString(C1704R.C1707string.not_set_back_back_height), C1688z.f4191b);
                    return;
                } else if (!C1772d.m34208a().m34187k() && this.f10655y.m33009am()) {
                    C1688z.m34447a(this.f10651u, this.f10651u.getString(C1704R.C1707string.not_set_flight_back_height), C1688z.f4191b);
                    return;
                } else {
                    DialogC3245f.C3249b c3249b = new DialogC3245f.C3249b(this.f10651u);
                    int m34553b = this.f10627G ? (int) C1679t.m34553b(Double.parseDouble(C1642c.m34885e().m34515h())) : (int) Double.parseDouble(C1642c.m34885e().m34515h());
                    int round = this.f10627G ? ((float) Math.round(C1679t.m34553b(120.0d))) > this.f10624D ? Math.round(this.f10624D) : (int) Math.round(C1679t.m34553b(120.0d)) : 120.0f > this.f10624D ? Math.round(this.f10624D) : 120;
                    final int m34553b2 = this.f10627G ? (int) C1679t.m34553b(30.0d) : 30;
                    c3249b.m28613c(this.f10651u.getString(C1704R.C1707string.return_height)).m28620b(round).m28627a(m34553b2).m28623a(this.f10627G ? this.f10651u.getString(C1704R.C1707string.distance_unit_ft) : this.f10651u.getString(C1704R.C1707string.distance_unit_m)).m28618b(this.f10651u.getString(C1704R.C1707string.dialog_height_unit)).m28611d(this.f10651u.getResources().getColor(C1704R.color.dialog_ensure_hot)).m28615c(m34553b).m28622a(this.f10651u.getString(C1704R.C1707string.cancel), new DialogInterface.OnClickListener() { // from class: com.fimi.soul.module.setting.newhand.GpsSettingActivity.9
                        @Override // android.content.DialogInterface.OnClickListener
                        public void onClick(DialogInterface dialogInterface, int i) {
                        }
                    }).m28617b(this.f10651u.getString(C1704R.C1707string.ensure), new DialogInterface.OnClickListener() { // from class: com.fimi.soul.module.setting.newhand.GpsSettingActivity.8
                        @Override // android.content.DialogInterface.OnClickListener
                        public void onClick(DialogInterface dialogInterface, int i) {
                            if (GpsSettingActivity.this.f10622B > GpsSettingActivity.this.f10624D) {
                                GpsSettingActivity.this.f10622B = GpsSettingActivity.this.f10624D;
                            }
                            C2912d.m29999a(GpsSettingActivity.this.f10655y).m30000a(GpsSettingActivity.this.f10622B);
                        }
                    }).m28626a(new SeekBar.OnSeekBarChangeListener() { // from class: com.fimi.soul.module.setting.newhand.GpsSettingActivity.7
                        @Override // android.widget.SeekBar.OnSeekBarChangeListener
                        public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
                            GpsSettingActivity.this.f10622B = m34553b2 + i;
                        }

                        @Override // android.widget.SeekBar.OnSeekBarChangeListener
                        public void onStartTrackingTouch(SeekBar seekBar) {
                        }

                        @Override // android.widget.SeekBar.OnSeekBarChangeListener
                        public void onStopTrackingTouch(SeekBar seekBar) {
                        }
                    }).m28628a().show();
                    return;
                }
            default:
                return;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.fimi.soul.base.BaseActivity, com.fimi.soul.base.BaseFimiActivity, com.fimi.kernel.BaseActivity, android.support.p001v4.app.FragmentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C1704R.layout.activity_gps_setting);
        getWindow().setFlags(128, 128);
        m29877a();
        this.f10651u = this;
        this.f10627G = C1642c.m34885e().m34501p();
        this.f10655y = ((DroidPlannerApp) getApplication()).f4493a;
        if (getIntent().getBooleanExtra(f10618b, true)) {
            m29876a(this.f10627G ? (int) C1679t.m34551c(6.0d) : 6, true);
            this.f10645o.setText(30 + getString(C1704R.C1707string.distance_unit_m));
        }
        if (!this.f10655y.mo32905ac()) {
            this.f10634a.setVisibility(0);
            m29873a(true);
            this.f10656z = true;
            this.f10626F = true;
            return;
        }
        this.f10634a.setVisibility(4);
        if (!getIntent().getBooleanExtra(f10618b, true) && !getIntent().getBooleanExtra(f10620d, false)) {
            return;
        }
        m29873a(true);
        this.f10656z = true;
    }

    @Override // com.fimi.soul.base.BaseActivity, com.fimi.soul.base.BaseFimiActivity, com.fimi.kernel.BaseActivity, android.support.p001v4.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.f10633X.removeCallbacksAndMessages(null);
    }

    @Override // com.fimi.soul.base.BaseActivity, com.fimi.soul.drone.C2104d.AbstractC2106b
    public void onDroneEvent(C2104d.EnumC2105a enumC2105a, C2083a c2083a) {
        switch (enumC2105a) {
            case NEW_HAND_OPERATE:
                if (c2083a.m32999aw().m32263d() == 51) {
                    if (c2083a.m32999aw().m32261f() != 2) {
                        return;
                    }
                    if (c2083a.m32999aw().m32258i() != 0) {
                        C1688z.m34450a(this.f10651u, (int) C1704R.C1707string.set_model_fail);
                        return;
                    }
                    C1688z.m34450a(this.f10651u, (int) C1704R.C1707string.set_model_success);
                    if (c2083a.m32999aw().m32260g() == 7) {
                        this.f10633X.sendEmptyMessageDelayed(2, 1000L);
                        if (((int) c2083a.m32999aw().m32259h()) == 10000) {
                            this.f10650t.m34420a(true, true);
                            this.f10646p.setText(C1704R.C1707string.gps_setting_distance_unlimt);
                            this.f10625E = 10000.0f;
                            return;
                        }
                        this.f10650t.m34420a(false, true);
                        if (this.f10627G) {
                            this.f10646p.setText(String.format(getString(C1704R.C1707string.gps_setting_distance_limit_500m), String.valueOf((int) C1679t.m34553b(500.0d)) + getString(C1704R.C1707string.distance_unit_ft)));
                        } else {
                            this.f10646p.setText(String.format(getString(C1704R.C1707string.gps_setting_distance_limit_500m), "500m"));
                        }
                        this.f10625E = 500.0f;
                        return;
                    } else if (c2083a.m32999aw().m32260g() == 3) {
                        this.f10633X.sendEmptyMessageDelayed(3, 1000L);
                        m29876a(this.f10627G ? (float) C1679t.m34551c(c2083a.m32999aw().m32259h()) : c2083a.m32999aw().m32259h(), false);
                        return;
                    } else if (c2083a.m32999aw().m32260g() != 5) {
                        return;
                    } else {
                        this.f10633X.sendEmptyMessageDelayed(5, 1000L);
                        this.f10624D = c2083a.m32999aw().m32259h();
                        this.f10624D = this.f10627G ? (float) Math.round(C1679t.m34553b(this.f10624D)) : this.f10624D;
                        C1642c.m34885e().m34528d(c2083a.m32999aw().m32259h() + "");
                        if (C1642c.m34885e().m34501p()) {
                            this.f10644n.setText(Math.round(this.f10624D) + this.f10651u.getString(C1704R.C1707string.distance_unit_ft));
                        } else {
                            this.f10644n.setText(Math.round(this.f10624D) + this.f10651u.getString(C1704R.C1707string.distance_unit_m));
                        }
                        if (this.f10622B <= this.f10624D) {
                            return;
                        }
                        this.f10633X.sendEmptyMessageDelayed(1, 1000L);
                        return;
                    }
                } else if (c2083a.m32999aw().m32263d() != 34) {
                    return;
                } else {
                    if (c2083a.m32999aw().m32261f() != 2 && c2083a.m32999aw().m32261f() != 4) {
                        return;
                    }
                    if (c2083a.m32999aw().m32260g() == 7) {
                        this.f10631V = true;
                        this.f10633X.removeMessages(2);
                        float m32259h = c2083a.m32999aw().m32259h();
                        if (m32259h != 0.0f) {
                            C1642c.m34885e().m34542a(m32259h + "");
                        }
                        if (((int) m32259h) == 10000) {
                            this.f10650t.m34420a(true, true);
                            this.f10646p.setText(C1704R.C1707string.gps_setting_distance_unlimt);
                            this.f10625E = 10000.0f;
                            return;
                        }
                        this.f10650t.m34420a(false, true);
                        if (this.f10627G) {
                            this.f10646p.setText(String.format(getString(C1704R.C1707string.gps_setting_distance_limit_500m), String.valueOf((int) C1679t.m34553b(500.0d)) + getString(C1704R.C1707string.distance_unit_ft)));
                        } else {
                            this.f10646p.setText(String.format(getString(C1704R.C1707string.gps_setting_distance_limit_500m), "500m"));
                        }
                        this.f10625E = 500.0f;
                        return;
                    } else if (c2083a.m32999aw().m32260g() == 3) {
                        this.f10629T = true;
                        this.f10633X.removeMessages(3);
                        float m34551c = this.f10627G ? (float) C1679t.m34551c(c2083a.m32999aw().m32259h()) : c2083a.m32999aw().m32259h();
                        if (m34551c != 0.0f) {
                            m29876a(m34551c, false);
                            return;
                        } else {
                            m29876a(this.f10627G ? (int) C1679t.m34551c(10.0d) : 10, false);
                            return;
                        }
                    } else if (c2083a.m32999aw().m32260g() != 5) {
                        return;
                    } else {
                        this.f10630U = true;
                        this.f10633X.removeMessages(5);
                        if (c2083a.m32999aw().m32259h() != 0.0f) {
                            this.f10624D = c2083a.m32999aw().m32259h();
                            this.f10624D = this.f10627G ? (float) Math.round(C1679t.m34553b(this.f10624D)) : this.f10624D;
                            C1642c.m34885e().m34528d(c2083a.m32999aw().m32259h() + "");
                            if (this.f10627G) {
                                this.f10644n.setText(Math.round(this.f10624D) + this.f10651u.getString(C1704R.C1707string.distance_unit_ft));
                                return;
                            } else {
                                this.f10644n.setText(Math.round(this.f10624D) + this.f10651u.getString(C1704R.C1707string.distance_unit_m));
                                return;
                            }
                        }
                        this.f10624D = 10.0f;
                        this.f10624D = this.f10627G ? (int) C1679t.m34553b(this.f10624D) : this.f10624D;
                        C1642c.m34885e().m34528d("10");
                        if (this.f10627G) {
                            this.f10644n.setText(Math.round(this.f10624D) + this.f10651u.getString(C1704R.C1707string.distance_unit_ft));
                            return;
                        } else {
                            this.f10644n.setText(Math.round(this.f10624D) + this.f10651u.getString(C1704R.C1707string.distance_unit_m));
                            return;
                        }
                    }
                }
            case RETURN_HEIGHT:
                if (c2083a.mo32896r().m31896b() == C2912d.f10397d) {
                    if (c2083a.mo32896r().m31892d() == C2912d.f10399f) {
                        C1688z.m34450a(this.f10651u, (int) C1704R.C1707string.set_model_success);
                        float m31894c = c2083a.mo32896r().m31894c();
                        C1642c.m34885e().m34536b(m31894c + "");
                        if (this.f10627G) {
                            m31894c = (float) C1679t.m34553b(m31894c);
                        }
                        this.f10622B = m31894c;
                        if (this.f10627G) {
                            this.f10645o.setText(Math.round(this.f10622B) + this.f10651u.getString(C1704R.C1707string.distance_unit_ft));
                        } else {
                            this.f10645o.setText(Math.round(this.f10622B) + this.f10651u.getString(C1704R.C1707string.distance_unit_m));
                        }
                    } else {
                        C1688z.m34450a(this.f10651u, (int) C1704R.C1707string.set_model_fail);
                    }
                    this.f10633X.sendEmptyMessageDelayed(1, 1000L);
                    return;
                } else if (c2083a.mo32896r().m31896b() != C2912d.f10398e) {
                    return;
                } else {
                    this.f10628S = true;
                    this.f10633X.removeMessages(1);
                    if (c2083a.mo32896r().m31892d() != C2912d.f10399f) {
                        return;
                    }
                    float m31894c2 = c2083a.mo32896r().m31894c();
                    C1642c.m34885e().m34536b(m31894c2 + "");
                    if (Math.round(this.f10624D) < Math.round(this.f10622B)) {
                        Context context = this.f10651u;
                        Object[] objArr = new Object[2];
                        objArr[0] = Integer.valueOf(Math.round(this.f10624D));
                        objArr[1] = this.f10627G ? this.f10651u.getString(C1704R.C1707string.distance_unit_ft) : this.f10651u.getString(C1704R.C1707string.distance_unit_m);
                        C1688z.m34447a(context, getString(C1704R.C1707string.adjust_flight_height_value, objArr), C1688z.f4191b);
                    }
                    this.f10622B = this.f10627G ? (float) C1679t.m34553b(m31894c2) : m31894c2;
                    if (this.f10627G) {
                        this.f10645o.setText(Math.round(this.f10622B) + this.f10651u.getString(C1704R.C1707string.distance_unit_ft));
                        return;
                    } else {
                        this.f10645o.setText(Math.round(this.f10622B) + this.f10651u.getString(C1704R.C1707string.distance_unit_m));
                        return;
                    }
                }
            case CLEANALLOBJ:
            case Remotecontrol:
                if (!c2083a.mo32905ac()) {
                    this.f10645o.setText(C2954b.f10832au);
                    this.f10643m.setText(C2954b.f10832au);
                    this.f10644n.setText(C2954b.f10832au);
                    this.f10650t.m34420a(false, false);
                    if (this.f10627G) {
                        this.f10646p.setText(String.format(getString(C1704R.C1707string.gps_setting_distance_limit_500m), String.valueOf((int) C1679t.m34553b(500.0d)) + "ft"));
                    } else {
                        this.f10646p.setText(String.format(getString(C1704R.C1707string.gps_setting_distance_limit_500m), "500m"));
                    }
                    this.f10634a.setVisibility(0);
                    m29873a(true);
                    this.f10656z = true;
                    this.f10626F = true;
                    return;
                }
                if (getIntent().getBooleanExtra(f10618b, true) || getIntent().getBooleanExtra(f10620d, false)) {
                    m29873a(true);
                    this.f10656z = true;
                } else {
                    m29873a(false);
                    this.f10656z = false;
                }
                this.f10634a.setVisibility(4);
                if (!this.f10626F) {
                    return;
                }
                this.f10626F = false;
                this.f10652v.mo29793b();
                this.f10652v.mo29801a();
                this.f10652v.mo29790c();
                this.f10633X.sendEmptyMessageDelayed(2, 300L);
                this.f10633X.sendEmptyMessageDelayed(3, 300L);
                this.f10633X.sendEmptyMessageDelayed(5, 300L);
                this.f10633X.sendEmptyMessageDelayed(2, 600L);
                this.f10633X.sendEmptyMessageDelayed(3, 600L);
                this.f10633X.sendEmptyMessageDelayed(5, 600L);
                if (!this.f10654x && this.f10621A < C2912d.f10400g) {
                    return;
                }
                C2912d.m29999a(c2083a).m30001a();
                return;
            default:
                return;
        }
    }

    @Override // com.fimi.soul.base.BaseActivity, com.fimi.kernel.BaseActivity, android.support.p001v4.app.FragmentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
        this.f10655y.mo32908a(this);
        this.f10653w = (C3022b) C1642c.m34887c().mo34880a(C3029b.f11258C, C3022b.class);
        this.f10654x = C1772d.m34208a().m34187k();
        if (this.f10652v == null) {
            this.f10652v = new C2955c(this.f10655y, this.f10651u);
        }
        if (this.f10653w != null) {
            this.f10621A = this.f10653w.m29604a();
        }
        this.f10652v.mo29790c();
        this.f10652v.mo29793b();
        this.f10652v.mo29801a();
        this.f10633X.sendEmptyMessageDelayed(2, 300L);
        this.f10633X.sendEmptyMessageDelayed(3, 300L);
        this.f10633X.sendEmptyMessageDelayed(5, 300L);
        this.f10633X.sendEmptyMessageDelayed(2, 600L);
        this.f10633X.sendEmptyMessageDelayed(3, 600L);
        this.f10633X.sendEmptyMessageDelayed(5, 600L);
        this.f10633X.sendEmptyMessageDelayed(2, 900L);
        this.f10633X.sendEmptyMessageDelayed(3, 900L);
        this.f10633X.sendEmptyMessageDelayed(5, 900L);
        this.f10633X.sendEmptyMessageDelayed(2, 1200L);
        this.f10633X.sendEmptyMessageDelayed(3, 1200L);
        this.f10633X.sendEmptyMessageDelayed(5, 1200L);
        if (this.f10654x || this.f10621A >= C2912d.f10400g) {
            C2912d.m29999a(this.f10655y).m30001a();
            this.f10633X.sendEmptyMessageDelayed(1, 300L);
            this.f10633X.sendEmptyMessageDelayed(1, 600L);
            this.f10633X.sendEmptyMessageDelayed(1, 900L);
            this.f10633X.sendEmptyMessageDelayed(1, 1200L);
            this.f10628S = false;
        } else {
            this.f10628S = true;
        }
        this.f10623C = Float.parseFloat(C1642c.m34885e().m34512i());
        this.f10623C = this.f10627G ? (int) C1679t.m34551c(this.f10623C) : this.f10623C;
        m29876a(this.f10623C, true);
        this.f10624D = this.f10627G ? (float) C1679t.m34553b(Double.parseDouble(C1642c.m34885e().m34509j())) : Float.parseFloat(C1642c.m34885e().m34509j());
        this.f10644n.setText(this.f10627G ? Math.round(this.f10624D) + getString(C1704R.C1707string.distance_unit_ft) : Math.round(this.f10624D) + getString(C1704R.C1707string.distance_unit_m));
        this.f10622B = this.f10627G ? (float) C1679t.m34553b(Double.parseDouble(C1642c.m34885e().m34515h())) : Float.parseFloat(C1642c.m34885e().m34515h());
        this.f10645o.setText(this.f10627G ? Math.round(this.f10622B) + getString(C1704R.C1707string.distance_unit_ft) : Math.round(this.f10622B) + getString(C1704R.C1707string.distance_unit_m));
        this.f10625E = Float.parseFloat(C1642c.m34885e().m34518g());
        if (Math.round(this.f10625E) == 10000) {
            this.f10650t.m34420a(true, false);
            this.f10646p.setText(C1704R.C1707string.gps_setting_distance_unlimt);
        } else {
            this.f10650t.m34420a(false, false);
            if (this.f10627G) {
                this.f10646p.setText(String.format(getString(C1704R.C1707string.gps_setting_distance_limit_500m), String.valueOf((int) C1679t.m34553b(500.0d)) + getString(C1704R.C1707string.distance_unit_ft)));
            } else {
                this.f10646p.setText(String.format(getString(C1704R.C1707string.gps_setting_distance_limit_500m), "500m"));
            }
        }
        if (this.f10655y.mo32905ac()) {
            this.f10633X.sendEmptyMessageDelayed(4, 3000L);
            return;
        }
        this.f10645o.setText(C2954b.f10832au);
        this.f10643m.setText(C2954b.f10832au);
        this.f10644n.setText(C2954b.f10832au);
        this.f10650t.m34420a(false, false);
        if (this.f10627G) {
            this.f10646p.setText(String.format(getString(C1704R.C1707string.gps_setting_distance_limit_500m), String.valueOf((int) C1679t.m34553b(500.0d)) + getString(C1704R.C1707string.distance_unit_ft)));
        } else {
            this.f10646p.setText(String.format(getString(C1704R.C1707string.gps_setting_distance_limit_500m), "500m"));
        }
    }

    @Override // com.fimi.soul.base.BaseActivity, android.support.p001v4.app.FragmentActivity, android.app.Activity
    public void onStop() {
        super.onStop();
    }
}
