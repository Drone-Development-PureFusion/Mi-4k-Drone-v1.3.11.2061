package com.fimi.soul.module.droneFragment;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.annotation.Nullable;
import android.support.p001v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.fimi.kernel.C1642c;
import com.fimi.kernel.utils.C1679t;
import com.fimi.kernel.utils.C1681v;
import com.fimi.kernel.utils.C1688z;
import com.fimi.overseas.soul.C1704R;
import com.fimi.soul.base.C1756a;
import com.fimi.soul.base.DroidPlannerApp;
import com.fimi.soul.biz.manager.C2001t;
import com.fimi.soul.biz.p170b.C1772d;
import com.fimi.soul.biz.p171c.C1775a;
import com.fimi.soul.biz.p180h.C1864j;
import com.fimi.soul.drone.C2083a;
import com.fimi.soul.drone.C2104d;
import com.fimi.soul.drone.p195d.p196a.p197a.C2155br;
import com.fimi.soul.drone.p195d.p196a.p197a.C2186r;
import com.fimi.soul.drone.p201e.C2252e;
import com.fimi.soul.drone.p205i.C2333c;
import com.fimi.soul.drone.p205i.C2363v;
import com.fimi.soul.entity.BatteryOverDischange;
import com.fimi.soul.entity.CameraMountState;
import com.fimi.soul.entity.DeviceType;
import com.fimi.soul.module.droneui.FlightActivity;
import com.fimi.soul.module.setting.newhand.C2955c;
import com.fimi.soul.module.update.C3029b;
import com.fimi.soul.module.update.p218a.C3021a;
import com.fimi.soul.module.update.p218a.C3022b;
import com.fimi.soul.utils.C3103au;
import com.fimi.soul.utils.C3119d;
import com.fimi.soul.view.EVview;
import com.fimi.soul.view.LightView;
import com.fimi.soul.view.marknumberprogress.EvProgressBar;
import com.fimi.soul.view.marknumberprogress.NumberMarkProgressBar;
import com.google.firebase.p253b.C9755a;
import java.util.Timer;
import java.util.TimerTask;
import org.codehaus.jackson.smile.SmileConstants;
import org.p356d.AbstractC11759f;
/* loaded from: classes.dex */
public class ShowDroneStatusFragment extends Fragment implements C2104d.AbstractC2106b {

    /* renamed from: aa */
    private static final int f8485aa = 1;

    /* renamed from: ab */
    private static final int f8486ab = 0;

    /* renamed from: ah */
    private static final double f8487ah = 0.20000000298023224d;

    /* renamed from: ai */
    private static final double f8488ai = 0.4000000059604645d;

    /* renamed from: al */
    private static final int f8489al = 1;

    /* renamed from: am */
    private static final int f8490am = 2;

    /* renamed from: an */
    private static final int f8491an = 3;

    /* renamed from: b */
    public static float f8492b;

    /* renamed from: f */
    public static int f8493f;

    /* renamed from: A */
    private TextView f8494A;

    /* renamed from: B */
    private TextView f8495B;

    /* renamed from: C */
    private TextView f8496C;

    /* renamed from: D */
    private TextView f8497D;

    /* renamed from: E */
    private TextView f8498E;

    /* renamed from: F */
    private TextView f8499F;

    /* renamed from: G */
    private Context f8500G;

    /* renamed from: H */
    private C2083a f8501H;

    /* renamed from: I */
    private DroidPlannerApp f8502I;

    /* renamed from: K */
    private int f8504K;

    /* renamed from: L */
    private EVview f8505L;

    /* renamed from: M */
    private LinearLayout f8506M;

    /* renamed from: N */
    private TextView f8507N;

    /* renamed from: O */
    private LightView f8508O;

    /* renamed from: P */
    private NumberMarkProgressBar f8509P;

    /* renamed from: Q */
    private EvProgressBar f8510Q;

    /* renamed from: R */
    private RelativeLayout f8511R;

    /* renamed from: S */
    private TextView f8512S;

    /* renamed from: T */
    private TextView f8513T;

    /* renamed from: U */
    private TextView f8514U;

    /* renamed from: a */
    C2001t f8520a;

    /* renamed from: aA */
    private FlightActivity.AbstractC2736a f8521aA;

    /* renamed from: aj */
    private BatteryOverDischange f8527aj;

    /* renamed from: ak */
    private C3119d f8528ak;

    /* renamed from: ao */
    private String[] f8529ao;

    /* renamed from: at */
    private Timer f8534at;

    /* renamed from: av */
    private int f8536av;

    /* renamed from: aw */
    private int f8537aw;

    /* renamed from: ay */
    private double f8539ay;

    /* renamed from: az */
    private double f8540az;

    /* renamed from: c */
    Timer f8541c;

    /* renamed from: d */
    Timer f8542d;

    /* renamed from: e */
    C2955c f8543e;

    /* renamed from: h */
    private TextView f8545h;

    /* renamed from: i */
    private TextView f8546i;

    /* renamed from: j */
    private TextView f8547j;

    /* renamed from: k */
    private TextView f8548k;

    /* renamed from: l */
    private TextView f8549l;

    /* renamed from: m */
    private TextView f8550m;

    /* renamed from: n */
    private TextView f8551n;

    /* renamed from: o */
    private TextView f8552o;

    /* renamed from: p */
    private TextView f8553p;

    /* renamed from: q */
    private TextView f8554q;

    /* renamed from: r */
    private TextView f8555r;

    /* renamed from: s */
    private TextView f8556s;

    /* renamed from: t */
    private TextView f8557t;

    /* renamed from: u */
    private TextView f8558u;

    /* renamed from: v */
    private TextView f8559v;

    /* renamed from: w */
    private TextView f8560w;

    /* renamed from: x */
    private TextView f8561x;

    /* renamed from: y */
    private TextView f8562y;

    /* renamed from: z */
    private TextView f8563z;

    /* renamed from: J */
    private boolean f8503J = true;

    /* renamed from: V */
    private double f8515V = C9755a.f30449c;

    /* renamed from: W */
    private int f8516W = 1;

    /* renamed from: X */
    private boolean f8517X = false;

    /* renamed from: Y */
    private boolean f8518Y = false;

    /* renamed from: Z */
    private EnumC2588a f8519Z = EnumC2588a.none_model;

    /* renamed from: ac */
    private final int f8522ac = 2;

    /* renamed from: ad */
    private boolean f8523ad = false;

    /* renamed from: ae */
    private boolean f8524ae = false;

    /* renamed from: af */
    private boolean f8525af = false;

    /* renamed from: ag */
    private boolean f8526ag = false;

    /* renamed from: ap */
    private boolean f8530ap = true;

    /* renamed from: aq */
    private int f8531aq = 0;

    /* renamed from: ar */
    private int f8532ar = 0;

    /* renamed from: as */
    private CameraMountState f8533as = CameraMountState.IDLE;

    /* renamed from: au */
    private Handler f8535au = new Handler() { // from class: com.fimi.soul.module.droneFragment.ShowDroneStatusFragment.1
        @Override // android.os.Handler
        public void handleMessage(Message message) {
            super.handleMessage(message);
            switch (message.what) {
                case 0:
                    ShowDroneStatusFragment.this.f8506M.setVisibility(8);
                    return;
                case 1:
                    C1688z.m34449a(ShowDroneStatusFragment.this.f8500G, (int) C1704R.C1707string.show_drone_status_picture_carlton_toast, 1);
                    return;
                case 2:
                    ShowDroneStatusFragment.this.f8521aA.mo30458k();
                    return;
                default:
                    return;
            }
        }
    };

    /* renamed from: ax */
    private boolean f8538ax = true;

    /* renamed from: g */
    boolean f8544g = false;

    /* renamed from: com.fimi.soul.module.droneFragment.ShowDroneStatusFragment$a */
    /* loaded from: classes.dex */
    private enum EnumC2588a {
        none_model,
        light_model,
        ev_model
    }

    /* renamed from: a */
    private void m31187a(View view) {
        this.f8511R = (RelativeLayout) view.findViewById(C1704R.C1706id.blightness_ev_rl);
        this.f8509P = (NumberMarkProgressBar) view.findViewById(C1704R.C1706id.light_markbar);
        this.f8510Q = (EvProgressBar) view.findViewById(C1704R.C1706id.mEvProgressBar);
        this.f8512S = (TextView) view.findViewById(C1704R.C1706id.info_tv);
        this.f8513T = (TextView) view.findViewById(C1704R.C1706id.info_ev_tv);
        this.f8514U = (TextView) view.findViewById(C1704R.C1706id.model_tv);
        this.f8509P.setEnabled(false);
        this.f8510Q.setEnabled(false);
        this.f8529ao = getActivity().getResources().getStringArray(C1704R.array.ev);
    }

    /* renamed from: a */
    private void m31183a(String str, TextView textView) {
        if (str == null || str.equals(textView.getText().toString())) {
            return;
        }
        textView.setText(str);
    }

    /* renamed from: d */
    private double m31175d() {
        double[] dArr = {(this.f8501H.mo32889y().m32028a() / 100.0d) + 2.0d, (this.f8501H.mo32889y().m32026b() / 100.0d) + 2.0d, (this.f8501H.mo32889y().m32025c() / 100.0d) + 2.0d, (this.f8501H.mo32889y().m32024d() / 100.0d) + 2.0d};
        double d = C9755a.f30449c;
        int i = 0;
        while (i < 4) {
            double d2 = d;
            for (int i2 = i + 1; i2 < 4; i2++) {
                if (Math.abs(dArr[i2] - dArr[i]) > d2) {
                    d2 = Math.abs(dArr[i2] - dArr[i]);
                }
            }
            i++;
            d = d2;
        }
        return d;
    }

    /* renamed from: e */
    private String m31171e(int i) {
        return C1679t.m34552b((i / 100.0d) + 2.0d, 2);
    }

    /* renamed from: e */
    private boolean m31172e() {
        double[] dArr = {(this.f8501H.mo32889y().m32028a() / 100.0d) + 2.0d, (this.f8501H.mo32889y().m32026b() / 100.0d) + 2.0d, (this.f8501H.mo32889y().m32025c() / 100.0d) + 2.0d, (this.f8501H.mo32889y().m32024d() / 100.0d) + 2.0d};
        for (int i = 0; i < 4; i++) {
            if (dArr[i] < 3.0d) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: f */
    private void m31169f() {
        this.f8543e.mo29787e();
        m31162j();
    }

    /* renamed from: f */
    private void m31168f(int i) {
        if (this.f8528ak == null) {
            this.f8528ak = C3119d.m29115a(this.f8500G);
        }
        this.f8527aj = new BatteryOverDischange();
        this.f8527aj.setVoltage(C1679t.m34552b(((((this.f8501H.mo32889y().m32028a() + this.f8501H.mo32889y().m32026b()) + this.f8501H.mo32889y().m32025c()) + this.f8501H.mo32889y().m32024d()) / 100.0d) + 8.0d, 2));
        short m32021g = this.f8501H.mo32889y().m32021g();
        if (m32021g < 0) {
            m32021g = 0;
        }
        this.f8527aj.setBatteryCurrent(((int) m32021g) + "");
        this.f8527aj.setTemperature((this.f8501H.mo32889y().m32019i() - 60) + "");
        this.f8539ay = this.f8501H.mo32926J().m32009e();
        this.f8540az = this.f8501H.mo32926J().m32010d();
        this.f8527aj.setBatteryFull((this.f8540az > this.f8539ay ? (int) this.f8540az : (int) this.f8539ay) + "");
        f8493f = (int) ((m32021g / this.f8539ay) * 100.0d);
        if (f8493f <= 30) {
            this.f8527aj.setBatteryLevel(f8493f + "%");
        } else {
            this.f8527aj.setBatteryLevel(f8493f + "%");
        }
        this.f8527aj.setUserId(C1756a.m34259c(this.f8500G).getUserID());
        this.f8527aj.setBatteryId(C3021a.m29616a().m29615a(5).m29550i() == null ? "0" : C3021a.m29616a().m29615a(5).m29550i());
        this.f8527aj.setBatteryLevel(((int) this.f8501H.mo32889y().m32018j()) + "");
        this.f8527aj.setBatteryOne(m31171e(this.f8501H.mo32889y().m32028a()));
        this.f8527aj.setBatteryTwo(m31171e(this.f8501H.mo32889y().m32026b()));
        this.f8527aj.setBatteryThree(m31171e(this.f8501H.mo32889y().m32025c()));
        this.f8527aj.setBatteryFour(m31171e(this.f8501H.mo32889y().m32024d()));
        this.f8527aj.setBatteryRecyle(((int) this.f8501H.mo32926J().m32011c()) + "");
        this.f8527aj.setVersion(C3021a.m29616a().m29615a(5).m29566b() + "");
        this.f8527aj.setAppType("0");
        this.f8527aj.setAccidentType(i);
        C3022b c3022b = (C3022b) C1642c.m34887c().mo34880a(C3029b.f11258C, C3022b.class);
        if (c3022b != null) {
            this.f8527aj.setFcVersion(String.valueOf(c3022b.m29604a()));
        }
        this.f8527aj.setUpdateTimes(String.valueOf((int) this.f8501H.mo32889y().m32015m()));
        this.f8527aj.setUpdateTimes(String.valueOf(-this.f8501H.mo32889y().m32020h()));
        new C1775a(getActivity()).m34178a(this.f8527aj);
    }

    /* renamed from: g */
    private float m31166g(int i) {
        if (i < 0 || i > 78) {
            if (i > 78 && i <= 156) {
                return -1.7f;
            }
            if (i > 156 && i <= 234) {
                return -1.3f;
            }
            if (i > 234 && i <= 312) {
                return -1.0f;
            }
            if (i > 312 && i <= 390) {
                return -0.7f;
            }
            if (i > 390 && i <= 468) {
                return -0.3f;
            }
            if (i > 468 && i <= 546) {
                return 0.0f;
            }
            if (i > 546 && i <= 624) {
                return 0.3f;
            }
            if (i > 624 && i <= 702) {
                return 0.7f;
            }
            if (i > 702 && i <= 780) {
                return 1.0f;
            }
            if (i > 780 && i <= 858) {
                return 1.3f;
            }
            if (i > 858 && i <= 936) {
                return 1.7f;
            }
            return (i <= 936 || i > 1024) ? 0.0f : 2.0f;
        }
        return -2.0f;
    }

    /* renamed from: g */
    private void m31167g() {
        boolean z = false;
        if (C1681v.m34543a(this.f8500G).m34495v() == DeviceType.DEVICE_4K) {
            z = true;
        }
        if (!z || m31165h() < 2016) {
            short m32223c = this.f8501H.mo32910Z().m32223c();
            if (this.f8537aw - m32223c < 0) {
                this.f8536av = ((m32223c - 255) * 90) / 255;
            } else {
                this.f8536av = ((m32223c * 90) / 255) - 90;
            }
            this.f8537aw = m32223c;
        } else {
            this.f8536av = this.f8501H.mo32910Z().m32210j();
        }
        this.f8499F.setText(String.valueOf(this.f8536av) + this.f8500G.getString(C1704R.C1707string.degree_unit));
    }

    /* renamed from: h */
    private float m31164h(int i) {
        if (i < 0 || i > 156) {
            if (i > 156 && i <= 312) {
                return -1.3f;
            }
            if (i > 312 && i <= 468) {
                return -0.7f;
            }
            if (i > 468 && i <= 546) {
                return 0.0f;
            }
            if (i > 546 && i <= 702) {
                return 0.7f;
            }
            if (i > 702 && i <= 858) {
                return 1.3f;
            }
            return (i <= 858 || i > 1024) ? 0.0f : 2.0f;
        }
        return -2.0f;
    }

    /* renamed from: h */
    private int m31165h() {
        C3022b c3022b = (C3022b) C1642c.m34887c().mo34880a(C3029b.f11258C, C3022b.class);
        if (c3022b == null) {
            c3022b = new C3022b();
        }
        if (c3022b == null || c3022b.m29600c() <= 0) {
            return 0;
        }
        return c3022b.m29600c();
    }

    /* renamed from: i */
    private void m31163i() {
        if (this.f8539ay > C9755a.f30449c) {
            short m32021g = this.f8501H.mo32889y().m32021g();
            if (m32021g < 0) {
                m32021g = 0;
            }
            f8493f = (int) ((m32021g / this.f8539ay) * 100.0d);
            if (f8493f < 0) {
                return;
            }
            if (f8493f > 100) {
                this.f8538ax = true;
                this.f8539ay = C9755a.f30449c;
                return;
            }
            if (f8493f <= 0 || f8493f >= 30) {
                this.f8551n.setTextColor(getResources().getColor(C1704R.color.changebetery));
                this.f8547j.setTextColor(getResources().getColor(C1704R.color.changebetery));
                this.f8555r.setTextColor(getResources().getColor(C1704R.color.changebetery));
                this.f8556s.setTextColor(getResources().getColor(C1704R.color.changebetery));
            } else {
                this.f8551n.setTextColor(getResources().getColor(C1704R.color.changebeterylow));
                this.f8547j.setTextColor(getResources().getColor(C1704R.color.changebeterylow));
                this.f8555r.setTextColor(getResources().getColor(C1704R.color.changebeterylow));
                this.f8556s.setTextColor(getResources().getColor(C1704R.color.changebeterylow));
            }
            if (f8493f <= 30) {
                this.f8547j.setText(f8493f + "");
            } else {
                this.f8547j.setText(f8493f + "");
            }
            this.f8556s.setVisibility(8);
            this.f8555r.setVisibility(0);
            m31183a("%", this.f8555r);
            m31183a(getString(C1704R.C1707string.electricity), this.f8551n);
            this.f8555r.setTextSize(16.0f);
            this.f8501H.mo32909a(C2104d.EnumC2105a.NOTIFYPBATTERY);
        }
    }

    /* renamed from: j */
    private void m31162j() {
        C2155br c2155br = new C2155br();
        c2155br.f6616d = C2186r.f6822a;
        c2155br.f6617e = (byte) 1;
        c2155br.f6618f = (byte) 0;
        this.f8501H.mo32906ab().mo32587a(c2155br.mo32762b());
    }

    /* renamed from: a */
    public int m31184a(String str) {
        if (str.equals("unknown")) {
            return 6;
        }
        int i = 0;
        while (true) {
            if (i >= this.f8529ao.length) {
                i = 6;
                break;
            } else if (str.contains(this.f8529ao[i])) {
                break;
            } else {
                i++;
            }
        }
        return i;
    }

    /* renamed from: a */
    public void m31190a() {
        this.f8533as = CameraMountState.MOUNT;
    }

    /* renamed from: a */
    public void m31189a(float f) {
        if (this.f8521aA != null) {
            this.f8521aA.mo30459j();
        }
        String str = "";
        if (f > 0.0f) {
            str = AbstractC11759f.f37105b;
        }
        String str2 = str + f;
        this.f8510Q.setProgress(m31184a(str2));
        this.f8513T.setTextSize(0, this.f8531aq);
        this.f8513T.setTextColor(getActivity().getResources().getColor(C1704R.color.white));
        this.f8513T.setText(getString(C1704R.C1707string.ev2) + "" + str2);
    }

    /* renamed from: a */
    public void m31188a(int i) {
        if (i == 0) {
            this.f8511R.setBackgroundResource(C1704R.C1705drawable.blightness_ev_bg1);
            this.f8512S.setVisibility(i);
        } else {
            this.f8511R.setBackgroundResource(C1704R.C1705drawable.blightness_ev_bg2);
            this.f8512S.setVisibility(4);
        }
        this.f8509P.setVisibility(i);
        this.f8514U.setVisibility(i);
    }

    /* renamed from: a */
    public void m31185a(FlightActivity.AbstractC2736a abstractC2736a) {
        this.f8521aA = abstractC2736a;
    }

    /* renamed from: a */
    public void m31182a(boolean z) {
        if (z) {
            this.f8506M.setVisibility(8);
            this.f8497D.setVisibility(8);
            this.f8498E.setVisibility(8);
        }
        this.f8544g = z;
    }

    /* renamed from: b */
    public void m31181b() {
        this.f8533as = CameraMountState.DISMOUNT;
    }

    /* renamed from: b */
    public void m31180b(int i) {
        this.f8510Q.setVisibility(i);
        this.f8513T.setVisibility(i);
    }

    /* renamed from: c */
    public void m31178c() {
        if (this.f8534at != null) {
            this.f8534at.cancel();
            this.f8534at = null;
        }
        if (this.f8534at == null) {
            this.f8534at = new Timer();
        }
        this.f8534at.schedule(new TimerTask() { // from class: com.fimi.soul.module.droneFragment.ShowDroneStatusFragment.5
            @Override // java.util.TimerTask, java.lang.Runnable
            public void run() {
                ShowDroneStatusFragment.this.f8535au.sendEmptyMessage(2);
            }
        }, 200L);
    }

    /* renamed from: c */
    public void m31177c(int i) {
        this.f8509P.setProgressAndInvalidate(i);
        this.f8512S.setText(getString(C1704R.C1707string.blightness) + "" + i + "%");
        this.f8512S.setTextColor(getActivity().getResources().getColor(C1704R.color.front_light_info_text_color));
        this.f8512S.setTextSize(0, this.f8532ar);
    }

    /* renamed from: d */
    public void m31174d(int i) {
        this.f8496C.setVisibility(i);
        this.f8495B.setVisibility(i);
    }

    @Override // android.support.p001v4.app.Fragment
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        this.f8500G = activity.getApplicationContext();
        this.f8502I = (DroidPlannerApp) activity.getApplication();
        this.f8520a = C2001t.m33304a(getActivity());
    }

    @Override // android.support.p001v4.app.Fragment
    @Nullable
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(C1704R.layout.showdronestates, (ViewGroup) null);
        if (C1642c.m34885e().m34530d()) {
            inflate.findViewById(C1704R.C1706id.bottom_state_rl).setVisibility(0);
        } else {
            inflate.findViewById(C1704R.C1706id.bottom_state_rl).setVisibility(4);
        }
        if (C1642c.m34885e().m34526e()) {
            inflate.findViewById(C1704R.C1706id.bottom_state_rl2).setVisibility(0);
        } else {
            inflate.findViewById(C1704R.C1706id.bottom_state_rl2).setVisibility(4);
        }
        this.f8557t = (TextView) inflate.findViewById(C1704R.C1706id.deslevelspeek);
        this.f8558u = (TextView) inflate.findViewById(C1704R.C1706id.levelspeek);
        this.f8505L = (EVview) inflate.findViewById(C1704R.C1706id.ev_v);
        this.f8508O = (LightView) inflate.findViewById(C1704R.C1706id.light_v);
        m31187a(inflate);
        this.f8499F = (TextView) inflate.findViewById(C1704R.C1706id.gimbal_angle);
        this.f8507N = (TextView) inflate.findViewById(C1704R.C1706id.ev_title);
        this.f8559v = (TextView) inflate.findViewById(C1704R.C1706id.desverticalspeek);
        this.f8560w = (TextView) inflate.findViewById(C1704R.C1706id.verticalspeek);
        this.f8561x = (TextView) inflate.findViewById(C1704R.C1706id.desremotesign);
        this.f8562y = (TextView) inflate.findViewById(C1704R.C1706id.remotesign);
        this.f8563z = (TextView) inflate.findViewById(C1704R.C1706id.desimagetransmission);
        this.f8494A = (TextView) inflate.findViewById(C1704R.C1706id.imagetransmission);
        this.f8495B = (TextView) inflate.findViewById(C1704R.C1706id.network_text);
        this.f8496C = (TextView) inflate.findViewById(C1704R.C1706id.network);
        this.f8497D = (TextView) inflate.findViewById(C1704R.C1706id.ev_text);
        this.f8498E = (TextView) inflate.findViewById(C1704R.C1706id.ev_value_tv);
        this.f8506M = (LinearLayout) inflate.findViewById(C1704R.C1706id.ev_layout);
        this.f8549l = (TextView) inflate.findViewById(C1704R.C1706id.texthight);
        this.f8549l.getPaint().setFakeBoldText(true);
        this.f8550m = (TextView) inflate.findViewById(C1704R.C1706id.textdistance);
        this.f8550m.getPaint().setFakeBoldText(true);
        this.f8551n = (TextView) inflate.findViewById(C1704R.C1706id.textpower);
        this.f8551n.getPaint().setFakeBoldText(true);
        this.f8553p = (TextView) inflate.findViewById(C1704R.C1706id.texthightbelowafter);
        this.f8552o = (TextView) inflate.findViewById(C1704R.C1706id.textsign);
        this.f8552o.getPaint().setFakeBoldText(true);
        this.f8548k = (TextView) inflate.findViewById(C1704R.C1706id.textsignbelow);
        this.f8554q = (TextView) inflate.findViewById(C1704R.C1706id.textdistancenum);
        this.f8555r = (TextView) inflate.findViewById(C1704R.C1706id.textpowernumbelow);
        this.f8556s = (TextView) inflate.findViewById(C1704R.C1706id.textpowernumbelowsec);
        this.f8545h = (TextView) inflate.findViewById(C1704R.C1706id.texthightbelow);
        this.f8545h.getPaint().setFakeBoldText(true);
        this.f8547j = (TextView) inflate.findViewById(C1704R.C1706id.textpowernum);
        this.f8547j.getPaint().setFakeBoldText(true);
        this.f8546i = (TextView) inflate.findViewById(C1704R.C1706id.textdistancenumbelow);
        this.f8546i.getPaint().setFakeBoldText(true);
        this.f8548k = (TextView) inflate.findViewById(C1704R.C1706id.textsignbelow);
        this.f8548k.getPaint().setFakeBoldText(true);
        this.f8530ap = C1642c.m34885e().m34501p();
        this.f8553p.setText(this.f8530ap ? this.f8500G.getString(C1704R.C1707string.distance_unit_ft) : "M");
        this.f8554q.setText(this.f8530ap ? this.f8500G.getString(C1704R.C1707string.distance_unit_ft) : "M");
        C3103au.m29218b(getActivity().getAssets(), this.f8545h, this.f8546i, this.f8547j, this.f8553p, this.f8554q, this.f8555r, this.f8558u, this.f8560w);
        C3103au.m29232a(getActivity().getAssets(), this.f8548k, this.f8549l, this.f8550m, this.f8551n, this.f8552o, this.f8556s, this.f8557t, this.f8559v, this.f8561x, this.f8563z, this.f8562y, this.f8494A, this.f8495B, this.f8496C);
        this.f8501H = this.f8502I.f4493a;
        this.f8520a.m33303a(new C2001t.AbstractC2003a() { // from class: com.fimi.soul.module.droneFragment.ShowDroneStatusFragment.2
            @Override // com.fimi.soul.biz.manager.C2001t.AbstractC2003a
            /* renamed from: a */
            public void mo31161a(String str, String str2) {
                ShowDroneStatusFragment.this.f8496C.setText(str);
            }
        });
        this.f8532ar = getActivity().getResources().getDimensionPixelOffset(C1704R.dimen.progress_text_tile_size);
        this.f8531aq = getActivity().getResources().getDimensionPixelOffset(C1704R.dimen.progress_text_tile2_size);
        return inflate;
    }

    @Override // android.support.p001v4.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        this.f8501H.mo32903b(this);
        this.f8520a.m33305a();
    }

    @Override // com.fimi.soul.drone.C2104d.AbstractC2106b
    public void onDroneEvent(C2104d.EnumC2105a enumC2105a, C2083a c2083a) {
        if (!c2083a.mo32905ac() || !c2083a.mo32906ab().mo32588a()) {
            switch (enumC2105a) {
                case ImperialUnits:
                    this.f8530ap = C1642c.m34885e().m34501p();
                    this.f8553p.setText(this.f8530ap ? this.f8500G.getString(C1704R.C1707string.distance_unit_ft) : "M");
                    this.f8554q.setText(this.f8530ap ? this.f8500G.getString(C1704R.C1707string.distance_unit_ft) : "M");
                    m31183a(C9755a.f30449c + (this.f8530ap ? this.f8500G.getString(C1704R.C1707string.speed_unit_mph) : this.f8500G.getString(C1704R.C1707string.speed_unit_m)), this.f8558u);
                    m31183a(C9755a.f30449c + (this.f8530ap ? this.f8500G.getString(C1704R.C1707string.speed_unit_mph) : this.f8500G.getString(C1704R.C1707string.speed_unit_m)), this.f8560w);
                    break;
            }
            this.f8530ap = C1642c.m34885e().m34501p();
            this.f8524ae = false;
            this.f8525af = false;
            this.f8526ag = false;
            this.f8556s.setVisibility(8);
            this.f8555r.setVisibility(0);
            m31183a("0.0", this.f8546i);
            m31183a("0.0", this.f8545h);
            m31183a("0", this.f8547j);
            m31183a(C9755a.f30449c + (this.f8530ap ? this.f8500G.getString(C1704R.C1707string.speed_unit_mph) : this.f8500G.getString(C1704R.C1707string.speed_unit_m)), this.f8558u);
            m31183a(C9755a.f30449c + (this.f8530ap ? this.f8500G.getString(C1704R.C1707string.speed_unit_mph) : this.f8500G.getString(C1704R.C1707string.speed_unit_m)), this.f8560w);
            m31183a(getString(C1704R.C1707string.electricity), this.f8551n);
            m31183a("%", this.f8555r);
            m31183a(getString(C1704R.C1707string.nothing), this.f8548k);
            m31183a(getString(C1704R.C1707string.nothing), this.f8562y);
            m31183a(getString(C1704R.C1707string.nothing), this.f8494A);
            this.f8499F.setText(getString(C1704R.C1707string.no_use));
            if (c2083a.mo32905ac()) {
                return;
            }
            this.f8539ay = C9755a.f30449c;
            this.f8538ax = true;
            this.f8524ae = false;
            this.f8525af = false;
            this.f8526ag = false;
            return;
        }
        switch (enumC2105a) {
            case ImperialUnits:
                this.f8530ap = C1642c.m34885e().m34501p();
                this.f8553p.setText(this.f8530ap ? this.f8500G.getString(C1704R.C1707string.distance_unit_ft) : "M");
                this.f8554q.setText(this.f8530ap ? this.f8500G.getString(C1704R.C1707string.distance_unit_ft) : "M");
                m31183a(C9755a.f30449c + (this.f8530ap ? this.f8500G.getString(C1704R.C1707string.speed_unit_mph) : this.f8500G.getString(C1704R.C1707string.speed_unit_m)), this.f8558u);
                m31183a(C9755a.f30449c + (this.f8530ap ? this.f8500G.getString(C1704R.C1707string.speed_unit_mph) : this.f8500G.getString(C1704R.C1707string.speed_unit_m)), this.f8560w);
                return;
            case HEARDATA:
                if (c2083a.mo32905ac() && this.f8538ax) {
                    C2252e.m32555a(c2083a);
                }
                double m34556a = C1679t.m34556a(this.f8530ap ? C1679t.m34551c(c2083a.mo32894t().m32334a() / 100.0d) : c2083a.mo32894t().m32334a() / 100.0d, 1);
                double m34556a2 = C1679t.m34556a(this.f8530ap ? C1679t.m34551c(c2083a.mo32894t().m32328b() / 100.0d) : c2083a.mo32894t().m32328b() / 100.0d, 1);
                m31183a(m34556a + (this.f8530ap ? this.f8500G.getString(C1704R.C1707string.speed_unit_mph) : this.f8500G.getString(C1704R.C1707string.speed_unit_m)), this.f8558u);
                m31183a(m34556a2 + (this.f8530ap ? this.f8500G.getString(C1704R.C1707string.speed_unit_mph) : this.f8500G.getString(C1704R.C1707string.speed_unit_m)), this.f8560w);
                if (!this.f8524ae && m31175d() > f8487ah && m31175d() <= f8488ai) {
                    this.f8524ae = true;
                    m31168f(1);
                }
                if (!this.f8525af && m31175d() > f8488ai) {
                    this.f8525af = true;
                    m31168f(2);
                }
                if (this.f8526ag || !m31172e()) {
                    return;
                }
                this.f8526ag = true;
                m31168f(3);
                return;
            case Remotecontrol:
                byte m32135a = c2083a.mo32919Q().m32135a();
                if (30 <= m32135a && m32135a < 80) {
                    m31183a(getString(C1704R.C1707string.remotrmid), this.f8562y);
                    return;
                } else if (m32135a >= 80) {
                    m31183a(getString(C1704R.C1707string.strong), this.f8562y);
                    return;
                } else if (5 >= m32135a || m32135a >= 30) {
                    m31183a(getString(C1704R.C1707string.nothing), this.f8562y);
                    return;
                } else {
                    m31183a(getString(C1704R.C1707string.remotelow), this.f8562y);
                    return;
                }
            case SIMULATORINFO:
            default:
                return;
            case NEWREMOTEMODEL:
                this.f8515V = c2083a.m32980i().m32244e();
                if (!this.f8517X || this.f8518Y) {
                    return;
                }
                this.f8498E.setVisibility(8);
                this.f8497D.setVisibility(8);
                int i = (int) ((this.f8515V * 100.0d) / 1024.0d);
                this.f8508O.setLightPercent(this.f8516W);
                m31177c(this.f8516W);
                if (i == this.f8516W || this.f8519Z != EnumC2588a.light_model) {
                    return;
                }
                this.f8506M.setVisibility(0);
                this.f8508O.setVisibility(0);
                m31188a(0);
                m31180b(8);
                if (this.f8521aA != null) {
                    this.f8521aA.mo30459j();
                }
                this.f8516W = i;
                this.f8535au.removeMessages(0);
                if (this.f8542d != null) {
                    this.f8542d.cancel();
                    this.f8542d = null;
                }
                if (this.f8542d == null) {
                    this.f8542d = new Timer();
                }
                this.f8542d.schedule(new TimerTask() { // from class: com.fimi.soul.module.droneFragment.ShowDroneStatusFragment.3
                    @Override // java.util.TimerTask, java.lang.Runnable
                    public void run() {
                        ShowDroneStatusFragment.this.f8535au.sendEmptyMessage(0);
                    }
                }, 3000L);
                return;
            case HEARDDAY:
                double m32188g = (c2083a.mo32891w().m32188g() - 677216.0d) / 10.0d;
                if (!c2083a.m33009am()) {
                    m32188g = 0.0d;
                }
                if (m32188g < 3000.0d) {
                    if (this.f8530ap) {
                        m32188g = C1679t.m34553b(m32188g);
                    }
                    if (m32188g >= 100.0d || m32188g < C9755a.f30449c) {
                        double d = m32188g < -999.0d ? -999.0d : m32188g;
                        m31183a(d < 100.0d ? C1679t.m34556a(d, 1) + "" : ((int) d) + "", this.f8545h);
                        m32188g = d;
                    } else {
                        m31183a(C1679t.m34556a(m32188g, 1) + "", this.f8545h);
                    }
                }
                double m32187h = c2083a.mo32891w().m32187h();
                if (!c2083a.m33009am()) {
                    m32187h = 0.0d;
                }
                if (m32187h > -50.0d && m32187h < 10000.0d && !c2083a.m33001au().m32390g().isLightStream()) {
                    if (this.f8530ap) {
                        m32187h = C1679t.m34553b(m32187h);
                    }
                    if (m32187h >= 100.0d) {
                        m31183a(((int) m32187h) + "", this.f8546i);
                    } else {
                        m31183a(C1679t.m34556a(m32187h, 1) + "", this.f8546i);
                    }
                }
                if (c2083a.m33009am()) {
                    C1864j m33867a = C1864j.m33867a();
                    m33867a.m33855d(this.f8530ap ? C1679t.m34549e(m32187h) : m32187h);
                    if (this.f8530ap) {
                        m32188g = C1679t.m34549e(m32188g);
                    }
                    m33867a.m33858c(m32188g);
                    m33867a.m33865a((int) c2083a.mo32891w().m32192c());
                }
                C1772d m34208a = C1772d.m34208a();
                int m34193f = m34208a.m34193f();
                if (!C1772d.m34208a().m34185m() || m34193f >= 50 || m32187h >= 300.0d || c2083a.m33001au().m32390g().isLightStream()) {
                    this.f8523ad = false;
                } else if (!this.f8523ad && !C1772d.m34208a().m34187k()) {
                    this.f8535au.sendEmptyMessage(1);
                    this.f8523ad = true;
                }
                if (!m34208a.m34184n() || !m34208a.m34185m()) {
                    m31183a(getString(C1704R.C1707string.nothing), this.f8494A);
                } else if (this.f8533as != CameraMountState.MOUNT) {
                    m31183a(getString(C1704R.C1707string.nothing), this.f8494A);
                } else if (20 <= m34193f && m34193f < 45) {
                    m31183a(getString(C1704R.C1707string.remotrmid), this.f8494A);
                } else if (m34193f >= 45) {
                    m31183a(getString(C1704R.C1707string.strong), this.f8494A);
                } else if (m34193f <= 0 || m34193f >= 20) {
                    m31183a(getString(C1704R.C1707string.nothing), this.f8494A);
                } else {
                    m31183a(getString(C1704R.C1707string.remotelow), this.f8494A);
                }
                if (c2083a.m33001au().m32390g().isLightStream()) {
                    m31183a(getString(C1704R.C1707string.nothing), this.f8548k);
                    return;
                }
                byte m32191d = c2083a.mo32891w().m32191d();
                if (m32191d > 13) {
                    m31183a(((int) m32191d) + " ", this.f8548k);
                } else if (8 < m32191d && m32191d <= 13) {
                    m31183a(((int) m32191d) + " ", this.f8548k);
                } else if (m32191d > 8 || m32191d <= 4) {
                    m31183a(getString(C1704R.C1707string.nothing), this.f8548k);
                } else {
                    m31183a(((int) m32191d) + " ", this.f8548k);
                }
                if (m32191d <= 8) {
                    this.f8548k.setTextColor(getResources().getColor(C1704R.color.changebeterylow));
                    this.f8552o.setTextColor(getResources().getColor(C1704R.color.changebeterylow));
                } else {
                    this.f8548k.setTextColor(getResources().getColor(C1704R.color.changebetery));
                    this.f8552o.setTextColor(getResources().getColor(C1704R.color.changebetery));
                }
                if (!c2083a.m33007ao().m31755u()) {
                    return;
                }
                this.f8499F.setText(getString(C1704R.C1707string.no_use));
                return;
            case BATTERYINFO:
                this.f8538ax = false;
                this.f8539ay = c2083a.mo32926J().m32009e();
                this.f8540az = c2083a.mo32926J().m32010d();
                return;
            case NEW_HAND_OPERATE:
                if (c2083a.m32999aw().m32261f() == 3 && c2083a.m32999aw().m32263d() == 51 && c2083a.m32999aw().m32260g() == 4) {
                    if (c2083a.m32999aw().m32259h() == 1.0f) {
                        this.f8518Y = true;
                        this.f8506M.setVisibility(8);
                    } else {
                        this.f8518Y = false;
                        if (this.f8519Z == EnumC2588a.light_model) {
                            this.f8506M.setVisibility(0);
                        }
                        this.f8535au.sendEmptyMessageDelayed(0, 2000L);
                    }
                }
                if (c2083a.m32999aw().m32263d() != 34) {
                    return;
                }
                if (c2083a.m32999aw().m32261f() != 1 && c2083a.m32999aw().m32261f() != 3) {
                    return;
                }
                if (c2083a.m32999aw().m32263d() == 34) {
                    if ((((int) c2083a.m32999aw().m32259h()) & 4) == 4) {
                        this.f8518Y = true;
                        this.f8506M.setVisibility(8);
                    } else {
                        this.f8518Y = false;
                        if (this.f8519Z == EnumC2588a.light_model) {
                            this.f8506M.setVisibility(0);
                        }
                        this.f8535au.sendEmptyMessageDelayed(0, 2000L);
                    }
                }
                if (c2083a.m32999aw().m32261f() != 1 || c2083a.m32999aw().m32262e() != 0) {
                    return;
                }
                this.f8518Y = false;
                m31162j();
                return;
            case BATTERY:
                m31163i();
                return;
            case backControl:
                C2333c mo32918R = c2083a.mo32918R();
                if (mo32918R == null || mo32918R.m32031b() != 115 || mo32918R.f7578c != 2) {
                    return;
                }
                switch (mo32918R.f7579d) {
                    case 1:
                        if (!this.f8544g) {
                            m31182a(false);
                        }
                        this.f8507N.setText(getString(C1704R.C1707string.ev_value));
                        this.f8517X = false;
                        this.f8508O.setVisibility(8);
                        this.f8505L.setVisibility(0);
                        this.f8497D.setVisibility(0);
                        m31188a(8);
                        m31180b(0);
                        this.f8498E.setVisibility(0);
                        this.f8498E.setText(String.valueOf(f8492b));
                        return;
                    case 2:
                        if (this.f8518Y) {
                            return;
                        }
                        m31182a(false);
                        this.f8507N.setText(getString(C1704R.C1707string.light_ev));
                        this.f8508O.setVisibility(0);
                        this.f8505L.setVisibility(8);
                        m31188a(0);
                        m31180b(8);
                        this.f8517X = true;
                        this.f8519Z = EnumC2588a.light_model;
                        return;
                    default:
                        return;
                }
            case EV_VALUE:
                this.f8519Z = EnumC2588a.ev_model;
                C2363v m32986f = c2083a.m32986f();
                if (m32986f.m31840c() != 2) {
                    return;
                }
                int m31838d = m32986f.m31838d() & SmileConstants.BYTE_MARKER_END_OF_CONTENT;
                int m31836e = m32986f.m31836e() & SmileConstants.BYTE_MARKER_END_OF_CONTENT;
                float m31166g = m31166g((m31836e << 8) | m31838d);
                this.f8507N.setText(getString(C1704R.C1707string.ev_value));
                if (f8492b == m31166g) {
                    return;
                }
                if (m31836e == 255 && m31838d == 255) {
                    return;
                }
                this.f8535au.removeMessages(0);
                this.f8535au.removeMessages(2);
                f8492b = m31166g;
                this.f8498E.setText(String.valueOf(f8492b));
                this.f8505L.m28944a(m31166g);
                m31189a(m31166g);
                if (this.f8506M.getVisibility() == 8 && !this.f8544g) {
                    this.f8498E.setVisibility(0);
                    this.f8497D.setVisibility(0);
                    this.f8506M.setVisibility(0);
                }
                if (this.f8541c != null) {
                    this.f8541c.cancel();
                    this.f8541c = null;
                }
                if (this.f8541c == null) {
                    this.f8541c = new Timer();
                }
                this.f8541c.schedule(new TimerTask() { // from class: com.fimi.soul.module.droneFragment.ShowDroneStatusFragment.4
                    @Override // java.util.TimerTask, java.lang.Runnable
                    public void run() {
                        ShowDroneStatusFragment.this.f8535au.sendEmptyMessage(0);
                    }
                }, 3000L);
                m31178c();
                return;
            case PTZ_GAIN:
                if (c2083a.m33007ao().m31755u()) {
                    return;
                }
                m31167g();
                return;
        }
    }

    @Override // android.support.p001v4.app.Fragment
    public void onResume() {
        super.onResume();
        m31169f();
        this.f8530ap = C1642c.m34885e().m34501p();
    }

    @Override // android.support.p001v4.app.Fragment
    public void onStart() {
        super.onStart();
        this.f8501H.mo32908a(this);
        this.f8543e = new C2955c(this.f8501H, this.f8500G);
    }

    @Override // android.support.p001v4.app.Fragment
    public void onStop() {
        super.onStop();
    }
}
