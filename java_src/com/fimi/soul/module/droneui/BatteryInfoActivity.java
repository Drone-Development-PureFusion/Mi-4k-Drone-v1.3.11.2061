package com.fimi.soul.module.droneui;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.fimi.kernel.C1642c;
import com.fimi.kernel.utils.C1679t;
import com.fimi.overseas.soul.C1704R;
import com.fimi.soul.base.BaseActivity;
import com.fimi.soul.drone.C2083a;
import com.fimi.soul.drone.C2104d;
import com.fimi.soul.drone.p201e.C2252e;
import com.fimi.soul.drone.p201e.C2253f;
import com.fimi.soul.drone.p205i.C2296ab;
import com.fimi.soul.entity.BatteryUpdateSize;
import com.fimi.soul.module.update.C3029b;
import com.fimi.soul.module.update.p218a.C3021a;
import com.fimi.soul.module.update.p218a.C3022b;
import com.fimi.soul.module.update.p218a.C3025e;
import com.fimi.soul.utils.C3103au;
import com.fimi.soul.utils.p219a.C3067a;
import com.fimi.soul.view.BatteryCapacityView;
import com.fimi.soul.view.BatteryVoltageView;
import com.google.firebase.p253b.C9755a;
import com.xiaomi.mipush.sdk.Constants;
import org.codehaus.jackson.smile.SmileConstants;
/* loaded from: classes.dex */
public class BatteryInfoActivity extends BaseActivity implements View.OnClickListener, C2104d.AbstractC2106b {

    /* renamed from: A */
    private static int f9328A = 1;

    /* renamed from: C */
    private static final int f9329C = 1340;

    /* renamed from: w */
    private static final int f9330w = 75;

    /* renamed from: x */
    private static final int f9331x = 10;

    /* renamed from: D */
    private C3021a f9333D;

    /* renamed from: F */
    private float f9335F;

    /* renamed from: G */
    private float f9336G;

    /* renamed from: a */
    private Button f9338a;

    /* renamed from: b */
    private TextView f9339b;

    /* renamed from: c */
    private TextView f9340c;

    /* renamed from: d */
    private TextView f9341d;

    /* renamed from: e */
    private TextView f9342e;

    /* renamed from: f */
    private TextView f9343f;

    /* renamed from: g */
    private TextView f9344g;

    /* renamed from: h */
    private TextView f9345h;

    /* renamed from: i */
    private TextView f9346i;

    /* renamed from: j */
    private TextView f9347j;

    /* renamed from: k */
    private TextView f9348k;

    /* renamed from: l */
    private TextView f9349l;

    /* renamed from: m */
    private TextView f9350m;

    /* renamed from: n */
    private ImageView f9351n;

    /* renamed from: o */
    private BatteryCapacityView f9352o;

    /* renamed from: p */
    private BatteryVoltageView f9353p;

    /* renamed from: q */
    private BatteryVoltageView f9354q;

    /* renamed from: r */
    private BatteryVoltageView f9355r;

    /* renamed from: s */
    private BatteryVoltageView f9356s;

    /* renamed from: t */
    private C3067a f9357t;

    /* renamed from: v */
    private C3022b f9359v;

    /* renamed from: u */
    private boolean f9358u = false;

    /* renamed from: y */
    private int f9360y = 0;

    /* renamed from: z */
    private boolean f9361z = true;

    /* renamed from: B */
    private boolean f9332B = true;

    /* renamed from: E */
    private Handler f9334E = new Handler() { // from class: com.fimi.soul.module.droneui.BatteryInfoActivity.1
        @Override // android.os.Handler
        public void handleMessage(Message message) {
            super.handleMessage(message);
            if (message.what != BatteryInfoActivity.f9328A || BatteryInfoActivity.this.f9332B) {
                return;
            }
            C2253f.m32544i(BatteryInfoActivity.this.drone);
        }
    };

    /* renamed from: H */
    private boolean f9337H = true;

    /* renamed from: a */
    private String m30529a(int i) {
        return C1679t.m34552b((i / 100.0d) + 2.0d, 2) + " V";
    }

    /* renamed from: a */
    private void m30528a(C2296ab c2296ab) {
        int m32379c = c2296ab.m32379c() & 65535;
        char m32380b = c2296ab.m32380b();
        int m32382a = c2296ab.m32382a() & SmileConstants.BYTE_MARKER_END_OF_CONTENT;
        byte m32378d = c2296ab.m32378d();
        long m32377e = c2296ab.m32377e();
        long m32376f = c2296ab.m32376f();
        long m32375g = c2296ab.m32375g();
        long m32374h = c2296ab.m32374h();
        if (m32379c > 0) {
            this.f9333D.m29613a(new C3025e(m32382a, m32378d, m32379c, String.valueOf(Long.valueOf(m32380b)), m32377e, m32376f, m32375g, m32374h));
            this.f9333D.m29614a(m32382a, m32379c);
        }
    }

    /* renamed from: b */
    private void m30526b() {
        String str;
        if (this.drone.mo32905ac()) {
            if (this.f9337H) {
                C2252e.m32555a(this.drone);
            }
            String str2 = (this.drone.mo32889y().m32019i() - 60) + getString(C1704R.C1707string.temp_unit);
            if (this.drone.mo32889y().m32019i() - 60 >= 75) {
                str = str2 + getString(C1704R.C1707string.battery_high_temperature);
                this.f9339b.setTextColor(getResources().getColor(C1704R.color.battery_except));
            } else if (this.drone.mo32889y().m32019i() - 60 < 10) {
                str = str2 + getString(C1704R.C1707string.battery_low_temperature);
                this.f9339b.setTextColor(getResources().getColor(C1704R.color.battery_low_temperature));
            } else {
                str = str2 + getString(C1704R.C1707string.battery_nomal_temperature);
                this.f9339b.setTextColor(getResources().getColor(C1704R.color.white));
            }
            this.f9339b.setText(" " + str);
            m30524d();
        }
    }

    /* renamed from: c */
    private void m30525c() {
        this.f9338a = (Button) findViewById(C1704R.C1706id.back_btn);
        this.f9338a.setOnClickListener(new View.OnClickListener() { // from class: com.fimi.soul.module.droneui.BatteryInfoActivity.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                BatteryInfoActivity.this.finish();
            }
        });
    }

    /* renamed from: d */
    private void m30524d() {
        this.f9335F = this.drone.mo32926J().m32009e();
        this.f9336G = this.drone.mo32926J().m32010d();
        if (this.f9335F > 0.0f) {
            this.f9346i.setText(" " + m30529a(this.drone.mo32889y().m32028a()));
            this.f9347j.setText(" " + m30529a(this.drone.mo32889y().m32026b()));
            this.f9348k.setText(" " + m30529a(this.drone.mo32889y().m32025c()));
            this.f9349l.setText(" " + m30529a(this.drone.mo32889y().m32024d()));
            this.f9345h.setText(" " + ((int) this.drone.mo32926J().f7595d) + "");
            short m32021g = this.drone.mo32889y().m32021g();
            if (m32021g < 0) {
                m32021g = 0;
            }
            int i = (int) ((m32021g / this.f9335F) * 100.0f);
            int i2 = (int) ((m32021g / this.f9336G) * 100.0f);
            if (i < 0) {
                i = 0;
            }
            if (i > 100) {
                i = 100;
            }
            if (i2 <= 30) {
                this.f9352o.setPercent(i2);
            } else {
                this.f9352o.setPercent(i);
            }
            this.f9344g.setText(" " + ((int) this.f9335F) + " mAH");
            this.f9340c.setText(" " + ((int) m32021g) + " mAH");
            double d = 4.35d - 3.2d;
            BatteryVoltageView batteryVoltageView = this.f9353p;
            double m32028a = ((this.drone.mo32889y().m32028a() / 100.0d) + 2.0d) - 3.2d;
            batteryVoltageView.setPercent(m32028a > C9755a.f30449c ? (int) ((m32028a / d) * 100.0d) : 0);
            BatteryVoltageView batteryVoltageView2 = this.f9354q;
            double m32026b = ((this.drone.mo32889y().m32026b() / 100.0d) + 2.0d) - 3.2d;
            batteryVoltageView2.setPercent(m32026b > C9755a.f30449c ? (int) ((m32026b / d) * 100.0d) : 0);
            BatteryVoltageView batteryVoltageView3 = this.f9355r;
            double m32025c = ((this.drone.mo32889y().m32025c() / 100.0d) + 2.0d) - 3.2d;
            batteryVoltageView3.setPercent(m32025c > C9755a.f30449c ? (int) ((m32025c / d) * 100.0d) : 0);
            BatteryVoltageView batteryVoltageView4 = this.f9356s;
            double m32024d = ((this.drone.mo32889y().m32024d() / 100.0d) + 2.0d) - 3.2d;
            batteryVoltageView4.setPercent(m32024d > C9755a.f30449c ? (int) ((m32024d / d) * 100.0d) : 0);
            if (this.f9360y >= f9329C) {
                this.f9341d.setText(((int) this.drone.mo32889y().m32016l()) + "");
            }
            double m32028a2 = (this.drone.mo32889y().m32028a() / 100.0d) + 2.0d;
            double m32026b2 = (this.drone.mo32889y().m32026b() / 100.0d) + 2.0d;
            double m32025c2 = (this.drone.mo32889y().m32025c() / 100.0d) + 2.0d;
            double m32024d2 = 2.0d + (this.drone.mo32889y().m32024d() / 100.0d);
            double d2 = m32028a2 > m32026b2 ? m32028a2 : m32026b2;
            if (d2 <= m32025c2) {
                d2 = m32025c2;
            }
            if (d2 <= m32024d2) {
                d2 = m32024d2;
            }
            StringBuilder sb = new StringBuilder();
            int i3 = 0;
            if (m30530a(d2, m32028a2) > 0.2d || m32028a2 < 3.0d) {
                if (m30530a(d2, m32028a2) > 0.4d) {
                    this.f9346i.setTextColor(getResources().getColor(C1704R.color.battery_damage));
                    this.f9353p.m28966a(BatteryVoltageView.EnumC3157a.DAMAGE);
                    sb.append(getString(C1704R.C1707string.battery_one) + getString(C1704R.C1707string.battery_damage));
                } else if (m32028a2 < 3.0d) {
                    this.f9346i.setTextColor(getResources().getColor(C1704R.color.battery_except));
                    this.f9353p.m28966a(BatteryVoltageView.EnumC3157a.EXCEPT);
                    sb.append(getString(C1704R.C1707string.battery_one) + getString(C1704R.C1707string.battery_over_dischange));
                } else {
                    this.f9346i.setTextColor(getResources().getColor(C1704R.color.battery_except));
                    this.f9353p.m28966a(BatteryVoltageView.EnumC3157a.EXCEPT);
                    sb.append(getString(C1704R.C1707string.battery_one) + getString(C1704R.C1707string.battery_pressure_highter));
                }
                i3 = 1;
            } else {
                this.f9353p.m28966a(BatteryVoltageView.EnumC3157a.NOMAL);
                this.f9346i.setTextColor(getResources().getColor(C1704R.color.battery_standar_text));
            }
            if (m30530a(d2, m32026b2) > 0.2d || m32026b2 < 3.0d) {
                if (i3 % 2 != 0) {
                    sb.append(Constants.ACCEPT_TIME_SEPARATOR_SP);
                }
                if (m30530a(d2, m32026b2) > 0.4d) {
                    this.f9347j.setTextColor(getResources().getColor(C1704R.color.battery_damage));
                    this.f9354q.m28966a(BatteryVoltageView.EnumC3157a.DAMAGE);
                    sb.append(getString(C1704R.C1707string.battery_two) + getString(C1704R.C1707string.battery_damage));
                } else if (m32026b2 < 3.0d) {
                    this.f9347j.setTextColor(getResources().getColor(C1704R.color.battery_except));
                    this.f9354q.m28966a(BatteryVoltageView.EnumC3157a.EXCEPT);
                    sb.append(getString(C1704R.C1707string.battery_two) + getString(C1704R.C1707string.battery_over_dischange));
                } else {
                    this.f9347j.setTextColor(getResources().getColor(C1704R.color.battery_except));
                    this.f9354q.m28966a(BatteryVoltageView.EnumC3157a.EXCEPT);
                    sb.append(getString(C1704R.C1707string.battery_two) + getString(C1704R.C1707string.battery_pressure_highter));
                }
                i3++;
                if (i3 % 2 == 0) {
                    sb.append("\n");
                }
            } else {
                this.f9354q.m28966a(BatteryVoltageView.EnumC3157a.NOMAL);
                this.f9347j.setTextColor(getResources().getColor(C1704R.color.battery_standar_text));
            }
            if (m30530a(d2, m32025c2) > 0.2d || m32025c2 < 3.0d) {
                if (i3 % 2 != 0) {
                    sb.append(Constants.ACCEPT_TIME_SEPARATOR_SP);
                }
                if (m30530a(d2, m32025c2) > 0.4d) {
                    this.f9348k.setTextColor(getResources().getColor(C1704R.color.battery_damage));
                    this.f9355r.m28966a(BatteryVoltageView.EnumC3157a.DAMAGE);
                    sb.append(getString(C1704R.C1707string.battery_three) + getString(C1704R.C1707string.battery_damage));
                } else if (m32025c2 < 3.0d) {
                    this.f9348k.setTextColor(getResources().getColor(C1704R.color.battery_except));
                    this.f9355r.m28966a(BatteryVoltageView.EnumC3157a.EXCEPT);
                    sb.append(getString(C1704R.C1707string.battery_three) + getString(C1704R.C1707string.battery_over_dischange));
                } else {
                    this.f9348k.setTextColor(getResources().getColor(C1704R.color.battery_except));
                    this.f9355r.m28966a(BatteryVoltageView.EnumC3157a.EXCEPT);
                    sb.append(getString(C1704R.C1707string.battery_three) + getString(C1704R.C1707string.battery_pressure_highter));
                }
                i3++;
                if (i3 % 2 == 0) {
                    sb.append("\n");
                }
            } else {
                this.f9355r.m28966a(BatteryVoltageView.EnumC3157a.NOMAL);
                this.f9348k.setTextColor(getResources().getColor(C1704R.color.battery_standar_text));
            }
            if (m30530a(d2, m32024d2) > 0.2d || m32024d2 < 3.0d) {
                if (i3 % 2 != 0) {
                    sb.append(Constants.ACCEPT_TIME_SEPARATOR_SP);
                }
                if (m30530a(d2, m32024d2) > 0.4d) {
                    this.f9349l.setTextColor(getResources().getColor(C1704R.color.battery_damage));
                    this.f9356s.m28966a(BatteryVoltageView.EnumC3157a.DAMAGE);
                    sb.append(getString(C1704R.C1707string.battery_four) + getString(C1704R.C1707string.battery_damage));
                } else if (m32024d2 < 3.0d) {
                    this.f9349l.setTextColor(getResources().getColor(C1704R.color.battery_except));
                    this.f9356s.m28966a(BatteryVoltageView.EnumC3157a.EXCEPT);
                    sb.append(getString(C1704R.C1707string.battery_four) + getString(C1704R.C1707string.battery_over_dischange));
                } else {
                    this.f9349l.setTextColor(getResources().getColor(C1704R.color.battery_except));
                    this.f9356s.m28966a(BatteryVoltageView.EnumC3157a.EXCEPT);
                    sb.append(getString(C1704R.C1707string.battery_four) + getString(C1704R.C1707string.battery_pressure_highter));
                }
                if ((i3 + 1) % 2 == 0) {
                    sb.append("\n");
                }
            } else {
                this.f9356s.m28966a(BatteryVoltageView.EnumC3157a.NOMAL);
                this.f9349l.setTextColor(getResources().getColor(C1704R.color.battery_standar_text));
            }
            this.f9343f.setText(sb.toString());
        }
    }

    /* renamed from: e */
    private void m30523e() {
        if (this.f9360y < 1342 || this.f9358u) {
            return;
        }
        BatteryUpdateSize batteryUpdateSize = new BatteryUpdateSize();
        batteryUpdateSize.setBatteryId(C3021a.m29616a().m29615a(5).m29550i());
        if (TextUtils.isEmpty(batteryUpdateSize.getBatteryId())) {
            return;
        }
        batteryUpdateSize.setBatteryUpdateSize((this.drone.mo32889y().m32015m() / 20) * 20);
        if (batteryUpdateSize.getBatteryUpdateSize() < 20) {
            this.f9357t.m29396d(batteryUpdateSize);
            this.f9358u = false;
            return;
        }
        BatteryUpdateSize m29398b = this.f9357t.m29398b(batteryUpdateSize);
        if (m29398b == null) {
            batteryUpdateSize.setMessageHintSize(1);
            this.f9357t.m29399a(batteryUpdateSize);
            this.f9351n.setVisibility(0);
            this.f9358u = true;
        } else if (m29398b.getMessageHintSize() >= 3) {
        } else {
            batteryUpdateSize.setMessageHintSize(m29398b.getMessageHintSize() + 1);
            this.f9357t.m29397c(batteryUpdateSize);
            this.f9351n.setVisibility(0);
            this.f9358u = true;
        }
    }

    /* renamed from: a */
    public double m30530a(double d, double d2) {
        return ((d * 100.0d) - (d2 * 100.0d)) / 100.0d;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        switch (view.getId()) {
            case C1704R.C1706id.update_flag_iv /* 2131755487 */:
                if (this.f9350m.getVisibility() == 0) {
                    this.f9350m.setVisibility(8);
                    return;
                } else {
                    this.f9350m.setVisibility(0);
                    return;
                }
            default:
                return;
        }
    }

    @Override // com.fimi.soul.base.BaseActivity, com.fimi.soul.base.BaseFimiActivity, com.fimi.kernel.BaseActivity, android.support.p001v4.app.FragmentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getWindow().setFlags(128, 128);
        setContentView(C1704R.layout.battery_info);
        this.f9360y = C3021a.m29616a().m29615a(5).m29566b();
        this.f9343f = (TextView) findViewById(C1704R.C1706id.except_tv);
        this.f9339b = (TextView) findViewById(C1704R.C1706id.temperature);
        this.f9352o = (BatteryCapacityView) findViewById(C1704R.C1706id.residue_capacity);
        this.f9340c = (TextView) findViewById(C1704R.C1706id.current_capacity);
        this.f9344g = (TextView) findViewById(C1704R.C1706id.all_capacity);
        this.f9345h = (TextView) findViewById(C1704R.C1706id.discharge_times);
        this.f9346i = (TextView) findViewById(C1704R.C1706id.battery_one);
        this.f9347j = (TextView) findViewById(C1704R.C1706id.battery_two);
        this.f9348k = (TextView) findViewById(C1704R.C1706id.battery_three);
        this.f9349l = (TextView) findViewById(C1704R.C1706id.battery_four);
        this.f9353p = (BatteryVoltageView) findViewById(C1704R.C1706id.battery_voltage_view1);
        this.f9354q = (BatteryVoltageView) findViewById(C1704R.C1706id.battery_voltage_view2);
        this.f9355r = (BatteryVoltageView) findViewById(C1704R.C1706id.battery_voltage_view3);
        this.f9356s = (BatteryVoltageView) findViewById(C1704R.C1706id.battery_voltage_view4);
        this.f9341d = (TextView) findViewById(C1704R.C1706id.over_dischange_tv);
        this.f9342e = (TextView) findViewById(C1704R.C1706id.over_dischange_declare_tv);
        if (this.f9360y < f9329C) {
            this.f9341d.setVisibility(8);
            this.f9342e.setVisibility(8);
        }
        this.f9351n = (ImageView) findViewById(C1704R.C1706id.update_flag_iv);
        this.f9351n.setVisibility(8);
        this.f9351n.setOnClickListener(this);
        this.f9350m = (TextView) findViewById(C1704R.C1706id.battery_update_hint_tv);
        this.f9350m.setVisibility(8);
        m30525c();
        m30526b();
        C3103au.m29234a(getAssets(), getWindow().getDecorView());
        this.drone.mo32908a(this);
        C2253f.m32544i(this.drone);
        this.f9334E.sendEmptyMessageDelayed(f9328A, 200L);
        this.f9334E.sendEmptyMessageDelayed(f9328A, 400L);
        this.f9334E.sendEmptyMessageDelayed(f9328A, 600L);
        this.f9334E.sendEmptyMessageDelayed(f9328A, 800L);
        this.f9332B = false;
        this.f9340c.setSingleLine(true);
        this.f9340c.setEllipsize(TextUtils.TruncateAt.MARQUEE);
        this.f9340c.setMarqueeRepeatLimit(6);
        this.f9357t = C3067a.m29400a(this);
        this.f9333D = C3021a.m29616a();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.fimi.soul.base.BaseActivity, com.fimi.soul.base.BaseFimiActivity, com.fimi.kernel.BaseActivity, android.support.p001v4.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.drone.mo32903b(this);
    }

    @Override // com.fimi.soul.base.BaseActivity, com.fimi.soul.drone.C2104d.AbstractC2106b
    public void onDroneEvent(C2104d.EnumC2105a enumC2105a, C2083a c2083a) {
        switch (enumC2105a) {
            case BATTERYINFO:
                m30526b();
                this.f9337H = false;
                break;
            case BATTERY:
                m30526b();
                m30523e();
                break;
            case FCVERSION2:
                this.f9359v = (C3022b) C1642c.m34887c().mo34880a(C3029b.f11258C, C3022b.class);
                if (this.f9332B) {
                    return;
                }
                if (c2083a.mo32902l().m32382a() == 5) {
                    this.f9360y = c2083a.mo32902l().m32379c() & 65535;
                    this.f9332B = true;
                }
                m30528a(c2083a.mo32902l());
                if (this.f9360y < f9329C) {
                    this.f9341d.setVisibility(8);
                    this.f9342e.setVisibility(8);
                    break;
                } else {
                    this.f9341d.setVisibility(0);
                    this.f9342e.setVisibility(0);
                    break;
                }
        }
        if (!c2083a.mo32905ac()) {
            this.f9358u = false;
            this.f9350m.setVisibility(8);
            this.f9351n.setVisibility(8);
            this.f9337H = true;
            this.f9352o.setPercent(-1);
            this.f9353p.setPercent(0);
            this.f9354q.setPercent(0);
            this.f9355r.setPercent(0);
            this.f9356s.setPercent(0);
            this.f9346i.setText(getResources().getString(C1704R.C1707string.no_use));
            this.f9347j.setText(getResources().getString(C1704R.C1707string.no_use));
            this.f9348k.setText(getResources().getString(C1704R.C1707string.no_use));
            this.f9349l.setText(getResources().getString(C1704R.C1707string.no_use));
            this.f9346i.setTextColor(getResources().getColor(C1704R.color.battery_standar_text));
            this.f9347j.setTextColor(getResources().getColor(C1704R.color.battery_standar_text));
            this.f9348k.setTextColor(getResources().getColor(C1704R.color.battery_standar_text));
            this.f9349l.setTextColor(getResources().getColor(C1704R.color.battery_standar_text));
            this.f9339b.setTextColor(getResources().getColor(C1704R.color.battery_standar_text));
            this.f9340c.setText(getString(C1704R.C1707string.no_use));
            this.f9339b.setText(getString(C1704R.C1707string.no_use));
            this.f9345h.setText(getString(C1704R.C1707string.no_use));
            if (this.f9360y >= f9329C) {
                this.f9341d.setText(getString(C1704R.C1707string.no_use));
                this.f9341d.setVisibility(8);
                this.f9342e.setVisibility(8);
            }
            this.f9344g.setText(getString(C1704R.C1707string.no_use));
            this.f9343f.setText("");
            this.f9361z = false;
        }
        if (!c2083a.mo32905ac() || this.f9361z) {
            return;
        }
        this.f9332B = false;
        C2253f.m32544i(c2083a);
        this.f9334E.sendEmptyMessageDelayed(f9328A, 200L);
        this.f9334E.sendEmptyMessageDelayed(f9328A, 400L);
        this.f9334E.sendEmptyMessageDelayed(f9328A, 600L);
        this.f9334E.sendEmptyMessageDelayed(f9328A, 800L);
        this.f9361z = true;
    }

    @Override // com.fimi.kernel.BaseActivity
    public void onHandleMessage(Message message) {
    }
}
