package com.fimi.soul.module.droneFragment;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.annotation.Nullable;
import android.support.p001v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;
import com.fimi.kernel.C1642c;
import com.fimi.kernel.utils.C1679t;
import com.fimi.kernel.utils.C1688z;
import com.fimi.kernel.view.C1696c;
import com.fimi.kernel.view.percent.PercentRelativeLayout;
import com.fimi.overseas.soul.C1704R;
import com.fimi.soul.base.DroidPlannerApp;
import com.fimi.soul.biz.p170b.C1772d;
import com.fimi.soul.biz.p182j.C1877d;
import com.fimi.soul.biz.p182j.C1882h;
import com.fimi.soul.drone.C2083a;
import com.fimi.soul.drone.C2104d;
import com.fimi.soul.drone.p205i.C2338h;
import com.fimi.soul.module.droneui.FlightActivity;
import com.fimi.soul.module.p214c.C2523d;
import com.fimi.soul.module.setting.C2912d;
import com.fimi.soul.module.update.p218a.C3021a;
import com.fimi.soul.utils.C3103au;
import com.fimi.soul.view.DialogC3241e;
import com.fimi.soul.view.DialogC3245f;
import com.google.firebase.p253b.C9755a;
/* loaded from: classes.dex */
public class ShowDroneControlFragment extends Fragment implements View.OnClickListener, C2104d.AbstractC2106b {

    /* renamed from: H */
    private static final int f8427H = 17;

    /* renamed from: I */
    private static final int f8428I = 18;

    /* renamed from: M */
    private static final String f8429M = "ShowDroneControlFragmen";

    /* renamed from: A */
    private ImageView f8430A;

    /* renamed from: B */
    private ImageView f8431B;

    /* renamed from: C */
    private DialogC3245f.C3246a f8432C;

    /* renamed from: E */
    private double f8434E;

    /* renamed from: F */
    private int f8435F;

    /* renamed from: G */
    private int f8436G;

    /* renamed from: K */
    private int f8438K;

    /* renamed from: N */
    private Dialog f8440N;

    /* renamed from: O */
    private FlightActivity.AbstractC2736a f8441O;

    /* renamed from: a */
    private PercentRelativeLayout f8442a;

    /* renamed from: b */
    private PercentRelativeLayout f8443b;

    /* renamed from: c */
    private PercentRelativeLayout f8444c;

    /* renamed from: d */
    private PercentRelativeLayout f8445d;

    /* renamed from: e */
    private PercentRelativeLayout f8446e;

    /* renamed from: f */
    private PercentRelativeLayout f8447f;

    /* renamed from: g */
    private PercentRelativeLayout f8448g;

    /* renamed from: h */
    private ImageButton f8449h;

    /* renamed from: i */
    private Context f8450i;

    /* renamed from: j */
    private DroidPlannerApp f8451j;

    /* renamed from: k */
    private C2083a f8452k;

    /* renamed from: l */
    private C2523d f8453l;

    /* renamed from: m */
    private TextView f8454m;

    /* renamed from: n */
    private TextView f8455n;

    /* renamed from: o */
    private TextView f8456o;

    /* renamed from: p */
    private TextView f8457p;

    /* renamed from: q */
    private TextView f8458q;

    /* renamed from: r */
    private TextView f8459r;

    /* renamed from: s */
    private TextView f8460s;

    /* renamed from: t */
    private int f8461t;

    /* renamed from: v */
    private ImageView f8463v;

    /* renamed from: w */
    private ImageView f8464w;

    /* renamed from: x */
    private ImageView f8465x;

    /* renamed from: y */
    private ImageView f8466y;

    /* renamed from: z */
    private ImageView f8467z;

    /* renamed from: u */
    private int f8462u = 20;

    /* renamed from: D */
    private EnumC2581a f8433D = EnumC2581a.IDLE;

    /* renamed from: J */
    private int f8437J = 0;

    /* renamed from: L */
    private Handler f8439L = new Handler() { // from class: com.fimi.soul.module.droneFragment.ShowDroneControlFragment.1
        @Override // android.os.Handler
        public void handleMessage(Message message) {
            super.handleMessage(message);
            if (message.what == 17) {
                C1696c.m34418a().mo34440a();
            } else if (message.what != 18) {
            } else {
                if (ShowDroneControlFragment.this.f8437J >= 2) {
                    C1696c.m34418a().mo34429c();
                    return;
                }
                ShowDroneControlFragment.m31202b(ShowDroneControlFragment.this);
                C2912d.m29999a(ShowDroneControlFragment.this.f8452k).m30000a(ShowDroneControlFragment.this.f8435F);
                ShowDroneControlFragment.this.f8439L.sendEmptyMessageDelayed(18, 2000L);
            }
        }
    };

    /* renamed from: com.fimi.soul.module.droneFragment.ShowDroneControlFragment$a */
    /* loaded from: classes.dex */
    public enum EnumC2581a {
        IDLE,
        LEFT,
        RIGHT
    }

    /* renamed from: a */
    private void m31208a(int i, int i2) {
        if (!this.f8452k.mo32906ab().mo32588a() || !this.f8452k.mo32905ac()) {
            return;
        }
        if (!this.f8452k.m33009am()) {
            if (this.f8452k.m33001au().m32390g().isEnforcementAtti()) {
                m31209a(1.0f, false, this.f8442a);
                m31209a(0.3f, false, this.f8466y, this.f8454m);
            } else {
                m31209a(1.0f, true, this.f8442a, this.f8466y, this.f8454m);
            }
            m31209a(0.3f, false, this.f8467z, this.f8430A, this.f8456o, this.f8455n, this.f8464w, this.f8465x, this.f8458q, this.f8459r, this.f8463v, this.f8457p, this.f8460s, this.f8431B);
            m31209a(1.0f, false, this.f8443b, this.f8444c, this.f8446e, this.f8447f, this.f8445d, this.f8448g);
            return;
        }
        m31209a(0.3f, false, this.f8466y, this.f8454m);
        m31209a(1.0f, false, this.f8442a);
        if (this.f8452k.m33001au().m32390g().isLightStream() || this.f8452k.m33001au().m32390g().isEnforcementAtti()) {
            if (this.f8452k.m33001au().m32390g().isEnforcementAtti()) {
                m31209a(0.3f, false, this.f8467z, this.f8455n);
                m31209a(1.0f, false, this.f8443b);
            } else {
                m31209a(1.0f, true, this.f8443b, this.f8467z, this.f8455n);
            }
            m31209a(0.3f, false, this.f8464w, this.f8458q, this.f8465x, this.f8459r, this.f8463v, this.f8457p, this.f8430A, this.f8456o, this.f8460s, this.f8431B);
            m31209a(1.0f, false, this.f8447f, this.f8445d, this.f8446e, this.f8447f, this.f8444c, this.f8448g);
        } else if (!this.f8452k.m33001au().m32390g().judgeNoAction() || this.f8452k.m32999aw().m32264c()) {
            m31209a(1.0f, true, this.f8430A, this.f8456o, this.f8444c, this.f8443b, this.f8467z, this.f8455n);
            m31209a(0.3f, false, this.f8464w, this.f8465x, this.f8458q, this.f8459r, this.f8457p, this.f8463v, this.f8460s, this.f8431B);
            m31209a(1.0f, false, this.f8445d, this.f8446e, this.f8447f, this.f8448g);
        } else if (this.f8452k.m33007ao().m31810S() || this.f8452k.m33001au().m32394c() == 3 || this.f8452k.m33001au().m32397a() == 5) {
            m31203b();
        } else if (this.f8452k.m33001au().m32390g().isGoHome()) {
            m31198d();
        } else if (this.f8452k.m33001au().m32390g().isLanding()) {
            m31200c();
        } else {
            m31196e();
        }
    }

    /* renamed from: b */
    static /* synthetic */ int m31202b(ShowDroneControlFragment showDroneControlFragment) {
        int i = showDroneControlFragment.f8437J;
        showDroneControlFragment.f8437J = i + 1;
        return i;
    }

    /* renamed from: a */
    public void m31210a() {
        m31209a(1.0f, false, this.f8442a, this.f8443b, this.f8444c, this.f8445d, this.f8446e, this.f8447f, this.f8448g);
        m31209a(0.3f, false, this.f8467z, this.f8466y, this.f8430A, this.f8454m, this.f8456o, this.f8455n, this.f8460s);
        m31209a(0.3f, false, this.f8463v, this.f8457p, this.f8464w, this.f8465x, this.f8458q, this.f8459r, this.f8431B);
    }

    /* renamed from: a */
    public void m31209a(float f, boolean z, View... viewArr) {
        for (int i = 0; i < viewArr.length; i++) {
            View view = viewArr[i];
            if (view.getAlpha() != f) {
                view.setAlpha(f);
            }
            if (view.isEnabled() != z) {
                viewArr[i].setEnabled(z);
            }
        }
    }

    /* renamed from: a */
    public void m31207a(EnumC2581a enumC2581a) {
        if (this.f8433D == enumC2581a) {
            return;
        }
        this.f8433D = enumC2581a;
    }

    /* renamed from: a */
    public void m31204a(FlightActivity.AbstractC2736a abstractC2736a) {
        this.f8441O = abstractC2736a;
    }

    /* renamed from: b */
    public void m31203b() {
        m31209a(1.0f, true, this.f8430A, this.f8456o, this.f8444c, this.f8443b, this.f8467z, this.f8455n);
        m31209a(0.3f, false, this.f8464w, this.f8465x, this.f8458q, this.f8459r, this.f8457p, this.f8463v, this.f8460s, this.f8431B);
        m31209a(1.0f, false, this.f8445d, this.f8446e, this.f8447f, this.f8448g);
    }

    /* renamed from: c */
    public void m31200c() {
        m31209a(1.0f, true, this.f8430A, this.f8456o, this.f8444c);
        m31209a(1.0f, false, this.f8443b, this.f8445d, this.f8446e, this.f8447f, this.f8448g);
        m31209a(0.3f, false, this.f8467z, this.f8455n, this.f8464w, this.f8465x, this.f8458q, this.f8459r, this.f8457p, this.f8463v, this.f8460s, this.f8431B);
    }

    /* renamed from: d */
    public void m31198d() {
        m31209a(1.0f, true, this.f8443b, this.f8467z, this.f8455n);
        m31209a(1.0f, false, this.f8444c, this.f8445d, this.f8446e, this.f8447f, this.f8448g);
        m31209a(0.3f, false, this.f8430A, this.f8456o, this.f8464w, this.f8465x, this.f8458q, this.f8459r, this.f8457p, this.f8463v, this.f8460s, this.f8431B);
    }

    /* renamed from: e */
    public void m31196e() {
        m31209a(1.0f, true, this.f8430A, this.f8456o, this.f8444c, this.f8443b, this.f8467z, this.f8455n);
        if (this.f8433D == EnumC2581a.LEFT) {
            m31209a(1.0f, true, this.f8445d, this.f8463v, this.f8457p, this.f8464w, this.f8446e, this.f8458q, this.f8459r, this.f8465x, this.f8447f, this.f8448g, this.f8460s, this.f8431B);
        } else if (this.f8433D != EnumC2581a.RIGHT) {
        } else {
            m31198d();
        }
    }

    /* renamed from: f */
    public void m31194f() {
        int m29566b = C3021a.m29616a().m29615a(0).m29566b();
        if (m29566b <= 0 || m29566b >= 1894 || C1772d.m34208a().m34187k()) {
            return;
        }
        if (this.f8440N == null) {
            DialogC3241e.C3242a c3242a = new DialogC3241e.C3242a(getActivity());
            c3242a.m28655a(getString(C1704R.C1707string.fc_version_compare_tip));
            c3242a.m28653a(false);
            c3242a.m28654a(getString(C1704R.C1707string.finish), new DialogInterface.OnClickListener() { // from class: com.fimi.soul.module.droneFragment.ShowDroneControlFragment.4
                @Override // android.content.DialogInterface.OnClickListener
                public void onClick(DialogInterface dialogInterface, int i) {
                }
            });
            this.f8440N = c3242a.m28659a();
            this.f8440N.setCanceledOnTouchOutside(false);
        }
        this.f8440N.show();
    }

    /* renamed from: g */
    public boolean m31192g() {
        if (this.f8440N == null) {
            return false;
        }
        return this.f8440N.isShowing();
    }

    @Override // android.support.p001v4.app.Fragment
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        this.f8450i = activity.getApplicationContext();
        this.f8451j = (DroidPlannerApp) activity.getApplication();
        this.f8452k = this.f8451j.f4493a;
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:141:0x051a -> B:130:0x0010). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:143:0x0533 -> B:130:0x0010). Please submit an issue!!! */
    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        C2338h c2338h;
        switch (view.getId()) {
            case C1704R.C1706id.closebutton /* 2131755727 */:
                this.f8452k.mo32909a(C2104d.EnumC2105a.CLOSEDRAWCONTROLClose);
                return;
            case C1704R.C1706id.takeoffrl /* 2131755728 */:
                C1882h.m33763a(getActivity().getApplicationContext()).m33764a(0);
                if (!this.f8452k.m33009am()) {
                    boolean m34501p = C1642c.m34885e().m34501p();
                    if (this.f8462u == 2) {
                        this.f8432C.m28641a(getString(C1704R.C1707string.takeoffpromptlightstream, m34501p ? C1679t.m34553b(1.0d) + " Ft" : "1 m"));
                    } else if (this.f8462u != 1) {
                        C1688z.m34449a(getActivity(), (int) C1704R.C1707string.wrongtakeoff, 2000);
                        return;
                    } else {
                        this.f8432C.m28641a(getString(C1704R.C1707string.takeoffpromptgps, m34501p ? C1679t.m34553b(4.0d) + " Ft" : "4 m"));
                    }
                    this.f8432C.m28634b(getString(C1704R.C1707string.ensure), new DialogInterface.OnClickListener() { // from class: com.fimi.soul.module.droneFragment.ShowDroneControlFragment.7
                        @Override // android.content.DialogInterface.OnClickListener
                        public void onClick(DialogInterface dialogInterface, int i) {
                            ShowDroneControlFragment.this.f8453l.m31386a();
                            dialogInterface.dismiss();
                        }
                    }).m28640a(getString(C1704R.C1707string.cancel), new DialogInterface.OnClickListener() { // from class: com.fimi.soul.module.droneFragment.ShowDroneControlFragment.6
                        @Override // android.content.DialogInterface.OnClickListener
                        public void onClick(DialogInterface dialogInterface, int i) {
                            dialogInterface.dismiss();
                        }
                    }).m28645a().show();
                } else {
                    C1688z.m34449a(getActivity(), (int) C1704R.C1707string.wrongtakeoff, 2000);
                }
                this.f8452k.mo32909a(C2104d.EnumC2105a.CLOSEDRAWCONTROL);
                return;
            case C1704R.C1706id.landingpl /* 2131755731 */:
                C1882h.m33763a(getActivity().getApplicationContext()).m33764a(0);
                if (this.f8452k.m33009am()) {
                    this.f8432C.m28641a(getString(C1704R.C1707string.landprompt));
                    this.f8432C.m28634b(getString(C1704R.C1707string.ensure), new DialogInterface.OnClickListener() { // from class: com.fimi.soul.module.droneFragment.ShowDroneControlFragment.9
                        @Override // android.content.DialogInterface.OnClickListener
                        public void onClick(DialogInterface dialogInterface, int i) {
                            ShowDroneControlFragment.this.f8453l.m31372b();
                            dialogInterface.dismiss();
                        }
                    }).m28640a(getString(C1704R.C1707string.cancel), new DialogInterface.OnClickListener() { // from class: com.fimi.soul.module.droneFragment.ShowDroneControlFragment.8
                        @Override // android.content.DialogInterface.OnClickListener
                        public void onClick(DialogInterface dialogInterface, int i) {
                            dialogInterface.dismiss();
                        }
                    }).m28645a().show();
                } else {
                    C1688z.m34449a(getActivity(), (int) C1704R.C1707string.wrongLanding, 2000);
                }
                this.f8452k.mo32909a(C2104d.EnumC2105a.CLOSEDRAWCONTROL);
                return;
            case C1704R.C1706id.gohomepl /* 2131755734 */:
                boolean m34501p2 = C1642c.m34885e().m34501p();
                C1882h.m33763a(getActivity().getApplicationContext()).m33764a(0);
                boolean isLightStream = this.f8452k.m33001au().m32390g().isLightStream();
                double m32188g = (this.f8452k.mo32891w().m32188g() - 677216.0d) / 10.0d;
                double m32187h = this.f8452k.mo32891w().m32187h();
                if (!this.f8452k.m33009am()) {
                    m32187h = C9755a.f30449c;
                }
                String m34515h = C1642c.m34885e().m34515h();
                if (this.f8452k.m32999aw().m32264c()) {
                    if (m32188g < 30.0d) {
                        this.f8434E = 30.0d;
                    } else {
                        this.f8434E = (int) Math.round(m32188g);
                    }
                } else if (m32188g < Float.valueOf(m34515h).floatValue()) {
                    this.f8434E = Float.valueOf(m34515h).floatValue();
                } else {
                    this.f8434E = (int) Math.round(m32188g);
                }
                int round = m34501p2 ? (int) Math.round(C1679t.m34553b(this.f8434E)) : (int) Math.round(this.f8434E);
                this.f8436G = round;
                this.f8435F = round;
                if (!this.f8452k.m33009am() || isLightStream) {
                    if (isLightStream) {
                        C1688z.m34449a(getActivity(), (int) C1704R.C1707string.lightstreamgohome, 3000);
                    } else {
                        C1688z.m34449a(getActivity(), (int) C1704R.C1707string.wrongbackhome, 2000);
                    }
                } else if (m32187h >= 10.0d) {
                    DialogC3245f.C3254c c3254c = new DialogC3245f.C3254c(getActivity());
                    c3254c.m28591c(m34501p2 ? (int) Math.round(C1679t.m34553b(120.0d)) : 120).m28595b(getActivity().getResources().getColor(C1704R.color.dialog_ensure_hot)).m28587d(m34501p2 ? (int) Math.round(C1679t.m34553b(30.0d)) : 30).m28592b(getActivity().getString(C1704R.C1707string.horizonal_screen_return_height_msg)).m28597a(m34501p2 ? this.f8450i.getString(C1704R.C1707string.distance_unit_ft) : this.f8450i.getString(C1704R.C1707string.distance_unit_M)).m28602a(this.f8435F).m28601a(new DialogInterface.OnClickListener() { // from class: com.fimi.soul.module.droneFragment.ShowDroneControlFragment.12
                        @Override // android.content.DialogInterface.OnClickListener
                        public void onClick(DialogInterface dialogInterface, int i) {
                            if (ShowDroneControlFragment.this.f8436G == ShowDroneControlFragment.this.f8435F) {
                                ShowDroneControlFragment.this.f8453l.m31369c();
                                return;
                            }
                            Log.d(ShowDroneControlFragment.f8429M, "onClick: 3");
                            ShowDroneControlFragment.this.f8437J = 0;
                            ShowDroneControlFragment.this.f8439L.sendEmptyMessageDelayed(17, 1000L);
                            ShowDroneControlFragment.this.f8439L.sendEmptyMessageDelayed(18, 2000L);
                            C2912d.m29999a(ShowDroneControlFragment.this.f8452k).m30000a(ShowDroneControlFragment.this.f8435F);
                        }
                    }).m28594b(new DialogInterface.OnClickListener() { // from class: com.fimi.soul.module.droneFragment.ShowDroneControlFragment.11
                        @Override // android.content.DialogInterface.OnClickListener
                        public void onClick(DialogInterface dialogInterface, int i) {
                        }
                    }).m28600a(new SeekBar.OnSeekBarChangeListener() { // from class: com.fimi.soul.module.droneFragment.ShowDroneControlFragment.10
                        @Override // android.widget.SeekBar.OnSeekBarChangeListener
                        public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
                            ShowDroneControlFragment.this.f8435F = i;
                        }

                        @Override // android.widget.SeekBar.OnSeekBarChangeListener
                        public void onStartTrackingTouch(SeekBar seekBar) {
                        }

                        @Override // android.widget.SeekBar.OnSeekBarChangeListener
                        public void onStopTrackingTouch(SeekBar seekBar) {
                        }
                    });
                    if (!this.f8452k.m32999aw().m32264c()) {
                        c3254c.m28590c(new DialogInterface.OnClickListener() { // from class: com.fimi.soul.module.droneFragment.ShowDroneControlFragment.13
                            @Override // android.content.DialogInterface.OnClickListener
                            public void onClick(DialogInterface dialogInterface, int i) {
                            }
                        }).m28603a().show();
                    } else {
                        c3254c.m28603a().show();
                    }
                } else {
                    this.f8432C.m28641a(getString(C1704R.C1707string.gohomeprompt3));
                    this.f8432C.m28634b(getString(C1704R.C1707string.ensure), new DialogInterface.OnClickListener() { // from class: com.fimi.soul.module.droneFragment.ShowDroneControlFragment.3
                        @Override // android.content.DialogInterface.OnClickListener
                        public void onClick(DialogInterface dialogInterface, int i) {
                            ShowDroneControlFragment.this.f8453l.m31369c();
                            dialogInterface.dismiss();
                        }
                    }).m28640a(getString(C1704R.C1707string.cancel), new DialogInterface.OnClickListener() { // from class: com.fimi.soul.module.droneFragment.ShowDroneControlFragment.2
                        @Override // android.content.DialogInterface.OnClickListener
                        public void onClick(DialogInterface dialogInterface, int i) {
                            dialogInterface.dismiss();
                        }
                    }).m28645a().show();
                }
                this.f8452k.mo32909a(C2104d.EnumC2105a.CLOSEDRAWCONTROL);
                return;
            case C1704R.C1706id.detoruingpointpl /* 2131755737 */:
                if ((this.f8452k.m32979j() != null && this.f8452k.m32979j().m32411b() == 1) || this.f8452k.m33007ao().m31769g()) {
                    C1688z.m34448a(this.f8450i, getString(C1704R.C1707string.show_drone_control_no_zoom_auto_flight));
                    return;
                } else if (!this.f8452k.m33001au().m32390g().isGps()) {
                    C1688z.m34450a(getActivity(), (int) C1704R.C1707string.cant_action_interest);
                    return;
                } else {
                    m31194f();
                    if (m31192g()) {
                        return;
                    }
                    this.f8441O.mo30465d();
                    C1877d.m33782p().m33803a(false);
                    C1882h.m33763a(getActivity().getApplicationContext()).m33764a(3);
                    this.f8452k.mo32909a(C2104d.EnumC2105a.CLOSEDRAWCONTROL);
                    return;
                }
            case C1704R.C1706id.takephonemyselfpl /* 2131755740 */:
                if ((this.f8452k.m32979j() != null && this.f8452k.m32979j().m32411b() == 1) || this.f8452k.m33007ao().m31769g()) {
                    C1688z.m34448a(this.f8450i, getString(C1704R.C1707string.show_drone_control_no_zoom_auto_flight));
                    return;
                } else if (!this.f8452k.m33001au().m32390g().isGps()) {
                    C1688z.m34450a(getActivity(), (int) C1704R.C1707string.cant_action_tajephoto);
                    this.f8441O.mo30468a();
                    return;
                } else if (this.f8452k.m33007ao().m31755u()) {
                    C1688z.m34449a(getActivity(), (int) C1704R.C1707string.discongc, 3000);
                    return;
                } else if (this.f8452k.m33007ao().m31756t()) {
                    C1688z.m34449a(getActivity(), (int) C1704R.C1707string.gcunready, 3000);
                    return;
                } else if (!C1772d.m34208a().m34185m()) {
                    C1688z.m34449a(getActivity(), (int) C1704R.C1707string.no_connect_camera, 3000);
                    return;
                } else {
                    try {
                        c2338h = (C2338h) this.f8452k.f5918c;
                    } catch (Exception e) {
                    }
                    if (c2338h.m31974f() == C2338h.EnumC2339a.NoSDCard) {
                        C1688z.m34449a(getActivity(), (int) C1704R.C1707string.tf_remove_error, 3000);
                    } else if (c2338h.m31974f() == C2338h.EnumC2339a.FullSDCard) {
                        C1688z.m34449a(getActivity(), (int) C1704R.C1707string.tf_full_error, 3000);
                    } else if (c2338h.m31974f() == C2338h.EnumC2339a.Error) {
                        C1688z.m34449a(getActivity(), (int) C1704R.C1707string.tf_io_error, 3000);
                    } else {
                        if (c2338h.m31974f() == C2338h.EnumC2339a.LOW_SPEED_CARD) {
                            C1688z.m34449a(getActivity(), (int) C1704R.C1707string.tf_low_speed_error, 3000);
                        }
                        m31194f();
                        if (!m31192g()) {
                            C1882h.m33763a(getActivity().getApplicationContext()).m33764a(4);
                            this.f8452k.mo32909a(C2104d.EnumC2105a.CLOSEDRAWCONTROL);
                            this.f8441O.mo30468a();
                        }
                    }
                    return;
                }
            case C1704R.C1706id.setwaypointpl /* 2131755743 */:
                if ((this.f8452k.m32979j() != null && this.f8452k.m32979j().m32411b() == 1) || this.f8452k.m33007ao().m31769g()) {
                    C1688z.m34448a(this.f8450i, getString(C1704R.C1707string.show_drone_control_no_zoom_auto_flight));
                    return;
                } else if (!this.f8452k.m33001au().m32390g().isGps()) {
                    C1688z.m34450a(getActivity(), (int) C1704R.C1707string.cant_action_waypoint);
                    return;
                } else {
                    m31194f();
                    if (m31192g()) {
                        return;
                    }
                    this.f8441O.mo30465d();
                    C1877d.m33782p().m33803a(false);
                    C1882h.m33763a(getActivity().getApplicationContext()).m33764a(1);
                    this.f8452k.mo32909a(C2104d.EnumC2105a.CLOSEDRAWCONTROL);
                    return;
                }
            case C1704R.C1706id.setdestination /* 2131755746 */:
                if ((this.f8452k.m32979j() != null && this.f8452k.m32979j().m32411b() == 1) || this.f8452k.m33007ao().m31769g()) {
                    C1688z.m34448a(this.f8450i, getString(C1704R.C1707string.show_drone_control_no_zoom_auto_flight));
                    return;
                } else if (!this.f8452k.m33001au().m32390g().isGps()) {
                    C1688z.m34450a(getActivity(), (int) C1704R.C1707string.cant_action_flyto);
                    return;
                } else {
                    m31194f();
                    if (m31192g()) {
                        return;
                    }
                    this.f8441O.mo30465d();
                    C1877d.m33782p().m33803a(false);
                    C1882h.m33763a(getActivity().getApplicationContext()).m33764a(2);
                    this.f8452k.mo32909a(C2104d.EnumC2105a.CLOSEDRAWCONTROL);
                    return;
                }
            default:
                return;
        }
    }

    @Override // android.support.p001v4.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f8432C = new DialogC3245f.C3246a(getActivity());
    }

    @Override // android.support.p001v4.app.Fragment
    @Nullable
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(C1704R.layout.dronecontrol, (ViewGroup) null);
        this.f8448g = (PercentRelativeLayout) inflate.findViewById(C1704R.C1706id.takephonemyselfpl);
        this.f8460s = (TextView) inflate.findViewById(C1704R.C1706id.takephonetext);
        this.f8431B = (ImageView) inflate.findViewById(C1704R.C1706id.takephoneicon);
        this.f8449h = (ImageButton) inflate.findViewById(C1704R.C1706id.closebutton);
        this.f8442a = (PercentRelativeLayout) inflate.findViewById(C1704R.C1706id.takeoffrl);
        this.f8443b = (PercentRelativeLayout) inflate.findViewById(C1704R.C1706id.landingpl);
        this.f8444c = (PercentRelativeLayout) inflate.findViewById(C1704R.C1706id.gohomepl);
        this.f8445d = (PercentRelativeLayout) inflate.findViewById(C1704R.C1706id.detoruingpointpl);
        this.f8446e = (PercentRelativeLayout) inflate.findViewById(C1704R.C1706id.setwaypointpl);
        this.f8447f = (PercentRelativeLayout) inflate.findViewById(C1704R.C1706id.setdestination);
        for (View view : new View[]{this.f8448g, this.f8442a, this.f8443b, this.f8444c, this.f8445d, this.f8446e, this.f8447f, this.f8449h}) {
            view.setOnClickListener(this);
        }
        this.f8453l = C2523d.m31374a(this.f8452k);
        this.f8454m = (TextView) inflate.findViewById(C1704R.C1706id.takeofftext);
        this.f8456o = (TextView) inflate.findViewById(C1704R.C1706id.gohometext);
        this.f8455n = (TextView) inflate.findViewById(C1704R.C1706id.landingtext);
        this.f8457p = (TextView) inflate.findViewById(C1704R.C1706id.controlfourtext);
        this.f8458q = (TextView) inflate.findViewById(C1704R.C1706id.waypointtext);
        this.f8459r = (TextView) inflate.findViewById(C1704R.C1706id.targetplacetext);
        C3103au.m29232a(getActivity().getAssets(), this.f8454m, this.f8456o, this.f8457p, this.f8458q, this.f8459r, this.f8460s);
        this.f8466y = (ImageView) inflate.findViewById(C1704R.C1706id.takeofficon);
        this.f8467z = (ImageView) inflate.findViewById(C1704R.C1706id.landingicon);
        this.f8430A = (ImageView) inflate.findViewById(C1704R.C1706id.gohomeicon);
        this.f8463v = (ImageView) inflate.findViewById(C1704R.C1706id.detoruingpointicon);
        this.f8464w = (ImageView) inflate.findViewById(C1704R.C1706id.setwaypointicon);
        this.f8465x = (ImageView) inflate.findViewById(C1704R.C1706id.setdestinationicon);
        m31210a();
        return inflate;
    }

    @Override // android.support.p001v4.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        this.f8452k.mo32903b(this);
        if (this.f8440N != null) {
            this.f8440N = null;
        }
    }

    @Override // android.support.p001v4.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.f8452k.mo32903b(this);
        if (this.f8432C != null) {
            this.f8432C = null;
        }
    }

    @Override // com.fimi.soul.drone.C2104d.AbstractC2106b
    public void onDroneEvent(C2104d.EnumC2105a enumC2105a, C2083a c2083a) {
        switch (enumC2105a) {
            case HEARDATA:
                this.f8461t = c2083a.m33001au().m32392e();
                this.f8462u = c2083a.m33001au().m32393d();
                m31208a(this.f8461t, this.f8462u);
                return;
            case CLEANALLOBJ:
                m31210a();
                return;
            case Remotecontrol:
                if (c2083a.mo32905ac()) {
                    return;
                }
                m31210a();
                return;
            case HOME_RIGHT:
                m31207a(EnumC2581a.RIGHT);
                return;
            case HOME_LEFT:
                m31207a(EnumC2581a.LEFT);
                return;
            case RETURN_HEIGHT:
                if (!isResumed()) {
                    return;
                }
                Log.d(f8429M, "onDroneEvent: 1");
                if (c2083a.mo32896r().m31896b() != C2912d.f10397d) {
                    if (c2083a.mo32896r().m31896b() != C2912d.f10398e || c2083a.mo32896r().m31892d() != C2912d.f10399f) {
                        return;
                    }
                    C1642c.m34885e().m34536b(c2083a.mo32896r().m31894c() + "");
                    return;
                } else if (c2083a.mo32896r().m31892d() == C2912d.f10399f) {
                    Log.d(f8429M, "onDroneEvent: " + c2083a.mo32896r().m31894c());
                    C1642c.m34885e().m34536b(c2083a.mo32896r().m31894c() + "");
                    this.f8453l.m31369c();
                    C1696c.m34418a().mo34429c();
                    this.f8439L.removeMessages(17);
                    this.f8439L.removeMessages(18);
                    return;
                } else {
                    Log.d(f8429M, "onDroneEvent: 2");
                    if (this.f8437J >= 2) {
                        this.f8453l.m31369c();
                        C1696c.m34418a().mo34429c();
                        return;
                    }
                    C2912d.m29999a(c2083a).m30000a(this.f8435F);
                    this.f8439L.sendEmptyMessageDelayed(18, 2000L);
                    return;
                }
            case NEWFRONEMODEL:
                this.f8438K = c2083a.m33001au().m32389h();
                return;
            default:
                return;
        }
    }

    @Override // android.support.p001v4.app.Fragment
    public void onResume() {
        super.onResume();
    }

    @Override // android.support.p001v4.app.Fragment
    public void onStart() {
        super.onStart();
        this.f8452k.mo32908a(this);
    }
}
