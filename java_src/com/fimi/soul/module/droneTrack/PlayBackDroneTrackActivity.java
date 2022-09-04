package com.fimi.soul.module.droneTrack;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.p001v4.app.FragmentManager;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import com.fimi.kernel.C1642c;
import com.fimi.kernel.utils.C1679t;
import com.fimi.kernel.utils.C1688z;
import com.fimi.kernel.view.percent.PercentRelativeLayout;
import com.fimi.overseas.soul.C1704R;
import com.fimi.soul.base.BaseActivity;
import com.fimi.soul.drone.p205i.C2301ag;
import com.fimi.soul.drone.p205i.C2302ah;
import com.fimi.soul.drone.p205i.C2307am;
import com.fimi.soul.drone.p205i.C2311aq;
import com.fimi.soul.drone.p205i.C2319ay;
import com.fimi.soul.drone.p205i.C2333c;
import com.fimi.soul.drone.p205i.C2334d;
import com.fimi.soul.drone.p205i.C2335e;
import com.fimi.soul.drone.p205i.C2365x;
import com.fimi.soul.drone.p205i.p206a.C2289c;
import com.fimi.soul.drone.p205i.p206a.C2292f;
import com.fimi.soul.entity.ErrorMode;
import com.fimi.soul.module.droneTrack.p216a.C2671a;
import com.fimi.soul.module.droneTrack.p216a.C2672b;
import com.fimi.soul.module.droneTrack.p216a.C2673c;
import com.fimi.soul.module.droneTrack.p217b.C2682a;
import com.fimi.soul.module.droneui.DialogC2752a;
import com.fimi.soul.utils.C3103au;
import com.fimi.soul.view.RemotesimulatorView;
import com.google.android.gms.maps.model.LatLng;
import com.google.firebase.p253b.C9755a;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;
import p282m.framework.p285ui.widget.asyncview.AsyncImageView;
/* loaded from: classes.dex */
public class PlayBackDroneTrackActivity extends BaseActivity implements View.OnClickListener, SeekBar.OnSeekBarChangeListener, AbstractC2685e, AbstractC2686f {

    /* renamed from: I */
    private static final int f9007I = 3;

    /* renamed from: A */
    private TextView f9008A;

    /* renamed from: B */
    private PercentRelativeLayout f9009B;

    /* renamed from: C */
    private PercentRelativeLayout f9010C;

    /* renamed from: D */
    private PalyBackMapFragment f9011D;

    /* renamed from: E */
    private FragmentManager f9012E;

    /* renamed from: F */
    private RemotesimulatorView f9013F;

    /* renamed from: G */
    private C2673c f9014G;

    /* renamed from: M */
    private C2671a f9019M;

    /* renamed from: N */
    private Timer f9020N;

    /* renamed from: P */
    private boolean f9022P;

    /* renamed from: Q */
    private TextView f9023Q;

    /* renamed from: R */
    private RelativeLayout f9024R;

    /* renamed from: S */
    private TextView f9025S;

    /* renamed from: T */
    private TextView f9026T;

    /* renamed from: U */
    private TextView f9027U;

    /* renamed from: V */
    private TextView f9028V;

    /* renamed from: W */
    private TextView f9029W;

    /* renamed from: X */
    private TextView f9030X;

    /* renamed from: Y */
    private TextView f9031Y;

    /* renamed from: Z */
    private TextView f9032Z;

    /* renamed from: a */
    PercentRelativeLayout f9033a;

    /* renamed from: aa */
    private TextView f9034aa;

    /* renamed from: ab */
    private TextView f9035ab;

    /* renamed from: ac */
    private TextView f9036ac;

    /* renamed from: ad */
    private TextView f9037ad;

    /* renamed from: ae */
    private boolean f9038ae;

    /* renamed from: af */
    private boolean f9039af;

    /* renamed from: aj */
    private DialogC2752a f9043aj;

    /* renamed from: d */
    private ImageView f9047d;

    /* renamed from: e */
    private ImageView f9048e;

    /* renamed from: f */
    private ImageView f9049f;

    /* renamed from: g */
    private ImageView f9050g;

    /* renamed from: h */
    private ImageView f9051h;

    /* renamed from: i */
    private ImageView f9052i;

    /* renamed from: j */
    private ImageView f9053j;

    /* renamed from: k */
    private ImageView f9054k;

    /* renamed from: l */
    private ImageView f9055l;

    /* renamed from: m */
    private ImageView f9056m;

    /* renamed from: n */
    private TextView f9057n;

    /* renamed from: o */
    private TextView f9058o;

    /* renamed from: p */
    private TextView f9059p;

    /* renamed from: q */
    private SeekBar f9060q;

    /* renamed from: r */
    private TextView f9061r;

    /* renamed from: s */
    private TextView f9062s;

    /* renamed from: t */
    private TextView f9063t;

    /* renamed from: u */
    private TextView f9064u;

    /* renamed from: v */
    private TextView f9065v;

    /* renamed from: w */
    private TextView f9066w;

    /* renamed from: x */
    private TextView f9067x;

    /* renamed from: y */
    private TextView f9068y;

    /* renamed from: z */
    private TextView f9069z;

    /* renamed from: H */
    private final int f9015H = 100;

    /* renamed from: J */
    private int f9016J = 1000;

    /* renamed from: K */
    private int f9017K = 0;

    /* renamed from: L */
    private C2672b f9018L = C2672b.m30703a();

    /* renamed from: O */
    private final int f9021O = 1;

    /* renamed from: ag */
    private EnumC2668a f9040ag = EnumC2668a.Payback;

    /* renamed from: ah */
    private int f9041ah = 0;

    /* renamed from: ai */
    private Handler f9042ai = new Handler() { // from class: com.fimi.soul.module.droneTrack.PlayBackDroneTrackActivity.1
        @Override // android.os.Handler
        public void handleMessage(Message message) {
            super.handleMessage(message);
            if (!PlayBackDroneTrackActivity.this.f9038ae) {
                if (message.what == 100) {
                    PlayBackDroneTrackActivity.this.f9022P = true;
                    if (PlayBackDroneTrackActivity.this.f9033a.isShown()) {
                        PlayBackDroneTrackActivity.this.f9033a.setVisibility(8);
                    }
                    PlayBackDroneTrackActivity.this.f9041ah = C2672b.m30703a().m30696b().size();
                    PlayBackDroneTrackActivity.this.f9008A.setText(PlayBackDroneTrackActivity.m30765b((PlayBackDroneTrackActivity.this.f9041ah * 1000) + ""));
                    PlayBackDroneTrackActivity.this.f9060q.setMax(PlayBackDroneTrackActivity.this.f9041ah);
                    PlayBackDroneTrackActivity.this.f9069z.setText(PlayBackDroneTrackActivity.m30765b((PlayBackDroneTrackActivity.this.f9017K * 1000) + ""));
                } else if (message.what != 3) {
                    if (message.what != 1) {
                        return;
                    }
                    PlayBackDroneTrackActivity.this.m30772b();
                } else {
                    PlayBackDroneTrackActivity.m30749g(PlayBackDroneTrackActivity.this);
                    PlayBackDroneTrackActivity.this.f9060q.setProgress(PlayBackDroneTrackActivity.this.f9017K);
                    PlayBackDroneTrackActivity.this.f9069z.setText(PlayBackDroneTrackActivity.m30765b((PlayBackDroneTrackActivity.this.f9017K * 1000) + ""));
                    PlayBackDroneTrackActivity.this.m30770b(PlayBackDroneTrackActivity.this.f9017K);
                    if (PlayBackDroneTrackActivity.this.f9017K == 1) {
                        PlayBackDroneTrackActivity.this.f9011D.m30795b();
                        PlayBackDroneTrackActivity.this.f9018L.m30693c().clear();
                    }
                    if (PlayBackDroneTrackActivity.this.f9017K <= PlayBackDroneTrackActivity.this.f9060q.getMax()) {
                        PlayBackDroneTrackActivity.this.f9042ai.sendEmptyMessageDelayed(3, PlayBackDroneTrackActivity.this.f9016J);
                        return;
                    }
                    PlayBackDroneTrackActivity.this.f9017K = 0;
                    PlayBackDroneTrackActivity.this.f9060q.setProgress(PlayBackDroneTrackActivity.this.f9017K);
                    PlayBackDroneTrackActivity.this.f9069z.setText(PlayBackDroneTrackActivity.m30765b((PlayBackDroneTrackActivity.this.f9017K * 1000) + ""));
                    PlayBackDroneTrackActivity.this.m30746i((int) C1704R.mipmap.btn_playback_play);
                    PlayBackDroneTrackActivity.this.f9040ag = EnumC2668a.Payback;
                }
            }
        }
    };

    /* renamed from: b */
    int f9045b = 0;

    /* renamed from: c */
    int f9046c = 0;

    /* renamed from: ak */
    private double f9044ak = C9755a.f30449c;

    /* renamed from: com.fimi.soul.module.droneTrack.PlayBackDroneTrackActivity$a */
    /* loaded from: classes.dex */
    enum EnumC2668a {
        Payback,
        Stop
    }

    /* renamed from: a */
    private float m30773a(double[] dArr, boolean z, float f) {
        if (z) {
            if (f < dArr[0]) {
                return 0.0f;
            }
            if (f >= dArr[0] && f < dArr[1]) {
                return (f - 3.15f) / 0.32f;
            }
            if (f >= dArr[1] && f < dArr[2]) {
                return (f - 3.47f) / 0.17f;
            }
            if (f >= dArr[2] && f < dArr[3]) {
                return (f - 3.64f) / 0.15f;
            }
            if (f >= dArr[3]) {
            }
            return 0.0f;
        } else if (f < dArr[0]) {
            return 0.0f;
        } else {
            if (f >= dArr[0] && f < dArr[1]) {
                return (f - 3.43f) / 0.3f;
            }
            if (f >= dArr[1] && f < dArr[2]) {
                return (f - 3.73f) / 0.15f;
            }
            if (f >= dArr[2] && f < dArr[3]) {
                return (f - 3.88f) / 0.14f;
            }
            if (f >= dArr[3]) {
            }
            return 0.0f;
        }
    }

    /* renamed from: a */
    private String m30790a(double d) {
        return String.format("%.2f", Double.valueOf(d));
    }

    /* renamed from: a */
    private void m30789a(double d, boolean z) {
    }

    /* renamed from: a */
    private void m30788a(int i, int i2, int i3) {
        if (this.f9043aj != null && this.f9043aj.isShowing()) {
            this.f9043aj.dismiss();
            this.f9043aj = null;
        }
        this.f9043aj = new DialogC2752a(this, getString(i), getString(i2), i3, 3, false, new DialogC2752a.AbstractC2755a() { // from class: com.fimi.soul.module.droneTrack.PlayBackDroneTrackActivity.2
            @Override // com.fimi.soul.module.droneui.DialogC2752a.AbstractC2755a
            /* renamed from: a */
            public void mo29725a() {
                if (PlayBackDroneTrackActivity.this.f9043aj != null) {
                    PlayBackDroneTrackActivity.this.f9043aj.dismiss();
                    PlayBackDroneTrackActivity.this.f9043aj = null;
                }
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
                if (PlayBackDroneTrackActivity.this.f9043aj != null) {
                    PlayBackDroneTrackActivity.this.f9043aj.dismiss();
                    PlayBackDroneTrackActivity.this.f9043aj = null;
                }
            }
        });
        this.f9043aj.setCancelable(true);
        this.f9043aj.show();
    }

    /* renamed from: a */
    private void m30787a(ImageView imageView, int i) {
        imageView.setImageResource(i);
    }

    /* renamed from: a */
    private void m30786a(TextView textView) {
        ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(getResources().getColor(AsyncImageView.f35337a));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(textView.getText().toString());
        spannableStringBuilder.setSpan(foregroundColorSpan, 1, 3, 33);
        textView.setText(spannableStringBuilder);
    }

    /* renamed from: a */
    private void m30785a(C2292f c2292f) {
        m30769b(c2292f.m32393d(), c2292f.m32392e(), c2292f.m32391f());
    }

    /* renamed from: a */
    private void m30784a(C2301ag c2301ag) {
        this.f9039af = C1642c.m34885e().m34501p();
        double m34556a = C1679t.m34556a(this.f9039af ? C1679t.m34551c(c2301ag.m32334a() / 100.0d) : c2301ag.m32334a() / 100.0d, 2);
        double m34556a2 = C1679t.m34556a(this.f9039af ? C1679t.m34551c(c2301ag.m32328b() / 100.0d) : c2301ag.m32328b() / 100.0d, 2);
        this.f9062s.setText(m34556a + (this.f9039af ? this.drone.f5919d.getString(C1704R.C1707string.speed_unit_mph) : this.drone.f5919d.getString(C1704R.C1707string.speed_unit_m)));
        this.f9064u.setText(m34556a2 + (this.f9039af ? this.drone.f5919d.getString(C1704R.C1707string.speed_unit_mph) : this.drone.f5919d.getString(C1704R.C1707string.speed_unit_m)));
        this.f9011D.m30804a((float) (c2301ag.m32310k() / 10.0d));
    }

    /* renamed from: a */
    private void m30783a(C2307am c2307am) {
        C2333c m30683k = this.f9018L.m30683k();
        C3103au.m29241a(c2307am.m32251b(), 12);
        int m29241a = C3103au.m29241a(c2307am.m32251b(), 13);
        if (m30683k != null) {
            if (m29241a == 1) {
                this.f9013F.m28869a((int) c2307am.m32236i(), (int) c2307am.m32238h(), (int) c2307am.m32240g(), (int) c2307am.m32242f());
            } else {
                this.f9013F.m28869a((int) c2307am.m32236i(), (int) c2307am.m32240g(), (int) c2307am.m32238h(), (int) c2307am.m32242f());
            }
        }
    }

    /* renamed from: a */
    private void m30782a(C2311aq c2311aq) {
        double d = -999.0d;
        this.f9039af = C1642c.m34885e().m34501p();
        double m32188g = (c2311aq.m32188g() - 677216.0d) / 10.0d;
        String string = this.f9039af ? this.drone.f5919d.getString(C1704R.C1707string.distance_unit_ft) : this.drone.f5919d.getString(C1704R.C1707string.distance_unit_m);
        if (m32188g < 3000.0d) {
            if (this.f9039af) {
                m32188g = C1679t.m34553b(m32188g);
            }
            if (m32188g >= 100.0d || m32188g < C9755a.f30449c) {
                if (m32188g >= -999.0d) {
                    d = m32188g;
                }
                m30774a(d < 100.0d ? m30771b(d) + string : ((int) d) + string, this.f9066w);
            } else {
                m30774a(m30771b(m32188g) + string, this.f9066w);
            }
        }
        double m32187h = c2311aq.m32187h();
        if (m32187h > -50.0d && m32187h < 10000.0d && !this.drone.m33001au().m32390g().isLightStream()) {
            if (this.f9039af) {
                m32187h = C1679t.m34553b(m32187h);
            }
            if (m32187h >= 100.0d) {
                m30774a(((int) m32187h) + string, this.f9068y);
            } else {
                m30774a(m30771b(m32187h) + string, this.f9068y);
            }
        }
        m30750g(c2311aq.m32191d());
    }

    /* renamed from: a */
    private void m30781a(C2319ay c2319ay) {
        m30748h(c2319ay.m32135a());
    }

    /* renamed from: a */
    private void m30780a(C2334d c2334d) {
        this.f9025S.setText((c2334d.m32019i() - 60) + getString(C1704R.C1707string.temp_unit));
        this.f9026T.setText(m30790a(Math.abs((int) c2334d.m32020h()) / 1000.0d) + "A");
        this.f9027U.setText(m30790a((c2334d.m32028a() / 100.0d) + 2.0d) + "V");
        this.f9028V.setText(m30790a((c2334d.m32026b() / 100.0d) + 2.0d) + "V");
        this.f9029W.setText(m30790a((c2334d.m32025c() / 100.0d) + 2.0d) + "V");
        this.f9030X.setText(m30790a((c2334d.m32024d() / 100.0d) + 2.0d) + "V");
    }

    /* renamed from: a */
    private void m30774a(String str, TextView textView) {
        if (str == null || str.equals(textView.getText().toString())) {
            return;
        }
        textView.setText(str);
    }

    /* renamed from: b */
    private String m30771b(double d) {
        return String.format("%.1f", Double.valueOf(d));
    }

    /* renamed from: b */
    public static String m30765b(String str) {
        return new SimpleDateFormat("mm:ss").format(new Date(new Long(str).longValue()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public void m30772b() {
        ErrorMode m30642a;
        if (this.f9019M == null || (m30642a = C2682a.m30643a().m30642a(this.f9019M)) == null) {
            return;
        }
        ArrayList lightErrorList = m30642a.getLightErrorList();
        if (lightErrorList.size() <= this.f9045b) {
            this.f9045b = 0;
        }
        if (this.drone.m33009am()) {
            if (this.drone.m33007ao().m31807V()) {
                this.f9046c++;
                if (this.f9046c >= 3) {
                    m30788a(C1704R.C1707string.title_sky_bat_lowpower_dangerous, C1704R.C1707string.des_sky_bat_lowpower_dangerous, C1704R.C1705drawable.plane_fall_bg);
                    this.f9046c = 0;
                }
            } else if (this.drone.m33007ao().m31810S()) {
                this.f9046c++;
                if (this.f9046c >= 7) {
                    m30788a(C1704R.C1707string.title_sky_landing_BAT_LOWPOWER, C1704R.C1707string.des_sky_landing_BAT_LOWPOWER, C1704R.C1705drawable.plane_fall_bg);
                    this.f9046c = 0;
                }
            }
        }
        if (lightErrorList == null || lightErrorList.size() <= 0) {
            m30760c("");
            m30764c();
        } else {
            m30759d();
            this.f9059p.setTextColor(getResources().getColor(C1704R.color.warmtextcl));
            m30760c(getText(((Integer) lightErrorList.get(this.f9045b)).intValue()).toString());
        }
        this.f9045b++;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public void m30770b(int i) {
        C2289c c2289c;
        List<Object> list = this.f9018L.m30696b().get(Integer.valueOf(i));
        if (list != null) {
            for (Object obj : list) {
                if (obj != null) {
                    if (obj instanceof C2311aq) {
                        C2311aq c2311aq = (C2311aq) obj;
                        if (c2311aq != null) {
                            this.f9019M.m30724a(c2311aq);
                            this.f9011D.m30801a(c2311aq);
                            m30782a(c2311aq);
                        }
                    } else if (obj instanceof C2302ah) {
                        C2302ah c2302ah = (C2302ah) obj;
                        if (c2302ah != null && this.f9011D != null) {
                            this.f9019M.m30727a(c2302ah);
                            this.f9011D.m30802a(c2302ah);
                        }
                    } else if (obj instanceof C2301ag) {
                        C2301ag c2301ag = (C2301ag) obj;
                        if (c2301ag != null) {
                            m30784a(c2301ag);
                            this.f9019M.m30728a(c2301ag);
                        }
                    } else if (obj instanceof C2319ay) {
                        C2319ay c2319ay = (C2319ay) obj;
                        if (c2319ay != null) {
                            m30781a(c2319ay);
                            this.f9019M.m30723a(c2319ay);
                        }
                    } else if (obj instanceof C2335e) {
                        C2335e c2335e = (C2335e) obj;
                        if (c2335e != null) {
                            this.f9019M.m30720a(c2335e);
                        }
                    } else if (obj instanceof C2334d) {
                        C2334d c2334d = (C2334d) obj;
                        if (c2334d != null) {
                            this.f9019M.m30721a(c2334d);
                            m30768b(c2334d);
                            m30780a(c2334d);
                        }
                    } else if (obj instanceof C2292f) {
                        C2292f c2292f = (C2292f) obj;
                        if (c2292f != null) {
                            this.f9019M.m30729a(c2292f);
                            m30785a(c2292f);
                        }
                    } else if (obj instanceof C2307am) {
                        C2307am c2307am = (C2307am) obj;
                        if (c2307am != null) {
                            this.f9019M.m30725a(c2307am);
                            m30783a(c2307am);
                        }
                    } else if (obj instanceof C2365x) {
                        C2365x c2365x = (C2365x) obj;
                        if (c2365x != null) {
                            this.f9019M.m30719a(c2365x);
                        }
                    } else if ((obj instanceof C2289c) && (c2289c = (C2289c) obj) != null) {
                        this.f9019M.m30730a(c2289c);
                        if (c2289c.m32411b() != 4 && c2289c.m32411b() != 5 && c2289c.m32411b() != 6) {
                            this.f9011D.m30803a(c2289c);
                        }
                    }
                }
            }
        }
    }

    /* renamed from: b */
    private void m30769b(int i, int i2, int i3) {
        if (i == 2 && !this.f9019M.m30709j() && i2 == 1) {
            m30763c(C1704R.C1707string.lightstreamfly);
            m30758d(C1704R.C1705drawable.icon_flight_model_vpu3x);
        } else if (i == 1 && !this.f9019M.m30709j() && i2 == 1) {
            m30763c(C1704R.C1707string.gpsfly);
            m30758d(C1704R.C1705drawable.icon_flight_model_gps3x);
        } else if (i == 0 && !this.f9019M.m30709j() && i2 == 1) {
            m30763c(C1704R.C1707string.attibase);
            m30758d(C1704R.C1705drawable.icon_flight_model_atti3x);
        } else if (i == 2 && this.f9019M.m30709j() && i2 == 1) {
            m30763c(C1704R.C1707string.lightstreamfling);
            m30758d(C1704R.C1705drawable.icon_flight_model_vpu3x);
        } else if (i == 1 && this.f9019M.m30709j() && i2 == 1) {
            m30763c(C1704R.C1707string.gpsfling);
            m30758d(C1704R.C1705drawable.icon_flight_model_gps3x);
        } else if (i == 0 && this.f9019M.m30709j() && i2 == 1) {
            m30763c(C1704R.C1707string.attfling);
            m30758d(C1704R.C1705drawable.icon_flight_model_atti3x);
        } else if (i2 == 7) {
            m30763c(C1704R.C1707string.tohome);
            m30758d(C1704R.C1705drawable.sailround_icon);
        } else if (i2 == 8) {
            m30763c(C1704R.C1707string.returntohome);
            m30758d(C1704R.C1705drawable.sailround_icon);
        } else if (i2 == 3) {
            m30763c(C1704R.C1707string.landing);
            m30758d(C1704R.C1705drawable.landing_icon);
        } else if (i2 == 9) {
            m30763c(C1704R.C1707string.lowlanding);
            m30758d(C1704R.C1705drawable.landing_icon);
        } else if (i2 == 2) {
            m30763c(C1704R.C1707string.take_off);
            m30758d(C1704R.C1705drawable.takeoff_icon);
        } else if (i2 == 4) {
            if (i3 == 4) {
                m30763c(C1704R.C1707string.stopflyto);
                m30758d(C1704R.C1705drawable.destination_icon);
            } else if (i3 != 2) {
            } else {
                m30763c(C1704R.C1707string.flyto);
                m30758d(C1704R.C1705drawable.destination_icon);
            }
        } else if (i2 == 5) {
            if (i3 == 4) {
                m30763c(C1704R.C1707string.stop_poi_fly);
                m30758d(C1704R.C1705drawable.detouringpoint_icon);
            } else if (i3 != 2) {
            } else {
                m30763c(C1704R.C1707string.interestFly);
                m30758d(C1704R.C1705drawable.detouringpoint_icon);
            }
        } else if (i2 == 6) {
            if (i3 == 4) {
                m30763c(C1704R.C1707string.stopwaypoint);
                m30758d(C1704R.C1705drawable.icon_fly_airline);
            } else if (i3 != 2) {
            } else {
                m30763c(C1704R.C1707string.execuwaypoint);
                m30758d(C1704R.C1705drawable.icon_fly_airline);
            }
        } else if (i2 != 10) {
            m30763c(C1704R.C1707string.condrone);
            m30758d(C1704R.C1705drawable.normal_icon);
        } else if (i3 == 4) {
            m30763c(C1704R.C1707string.stoptake_photo);
            m30758d(C1704R.mipmap.icon_fly_mode_selfie);
        } else if (i3 != 2) {
        } else {
            m30763c(C1704R.C1707string.take_photo_fly);
            m30758d(C1704R.mipmap.icon_fly_mode_selfie);
        }
    }

    /* renamed from: b */
    private void m30768b(C2334d c2334d) {
        int i = 100;
        C2335e m30710i = this.f9019M.m30710i();
        double m32010d = m30710i.m32010d();
        double m32009e = m30710i.m32009e();
        int m32021g = C9755a.f30449c != m32009e ? (int) ((c2334d.m32021g() / m32009e) * 100.0d) : (int) ((c2334d.m32021g() / 5200.0d) * 100.0d);
        int m32021g2 = C9755a.f30449c != m32010d ? (int) ((c2334d.m32021g() / m32010d) * 100.0d) : (int) ((c2334d.m32021g() / 5200.0d) * 100.0d);
        if (m32021g < 0 || m32021g2 < 0) {
            return;
        }
        if (m32021g2 > 100) {
            m32021g2 = 100;
        }
        if (m32021g <= 100) {
            i = m32021g;
        }
        if (m32021g2 <= 0 || m32021g2 >= 30) {
            this.f9058o.setTextColor(getResources().getColor(C1704R.color.white));
            this.f9058o.setText(i + "%");
            return;
        }
        this.f9058o.setText(m32021g2 + "%");
        this.f9058o.setTextColor(getResources().getColor(C1704R.color.battery_except));
    }

    /* renamed from: c */
    private void m30764c() {
        this.f9049f.setVisibility(4);
    }

    /* renamed from: c */
    private void m30763c(int i) {
        if (i == 0 || getString(i).equals(this.f9057n.getText().toString())) {
            return;
        }
        this.f9057n.setText(i);
    }

    /* renamed from: c */
    private void m30760c(String str) {
        if (str == null || str.equals(this.f9059p.getText().toString())) {
            return;
        }
        this.f9059p.setText(str, TextView.BufferType.NORMAL);
    }

    /* renamed from: d */
    private void m30759d() {
        this.f9049f.setVisibility(0);
    }

    /* renamed from: d */
    private void m30758d(int i) {
        if (getString(C1704R.C1707string.self_error_result).equals(this.f9057n.getText().toString())) {
            this.f9048e.setImageResource(C1704R.C1705drawable.notnormal_icon);
            this.f9048e.setTag(Integer.valueOf((int) C1704R.C1705drawable.notnormal_icon));
        } else if (this.f9048e.getTag() == null) {
            this.f9048e.setImageResource(i);
            this.f9048e.setTag(Integer.valueOf(i));
        } else if (i == ((Integer) this.f9048e.getTag()).intValue()) {
        } else {
            this.f9048e.setImageResource(i);
            this.f9048e.setTag(Integer.valueOf(i));
        }
    }

    /* renamed from: e */
    private void m30755e() {
        this.f9039af = C1642c.m34885e().m34501p();
        this.f9056m = (ImageView) findViewById(C1704R.C1706id.show_more_battery_status);
        this.f9010C = (PercentRelativeLayout) findViewById(C1704R.C1706id.dront_battery_RL);
        this.f9031Y = (TextView) findViewById(C1704R.C1706id.battery_tem_des);
        this.f9032Z = (TextView) findViewById(C1704R.C1706id.battery_electricity_des);
        this.f9034aa = (TextView) findViewById(C1704R.C1706id.battery_voltage_one);
        this.f9035ab = (TextView) findViewById(C1704R.C1706id.battery_voltage_sencond);
        this.f9036ac = (TextView) findViewById(C1704R.C1706id.battery_voltage_three);
        this.f9037ad = (TextView) findViewById(C1704R.C1706id.battery_voltage_four);
        this.f9025S = (TextView) findViewById(C1704R.C1706id.battery_tem_des_value);
        this.f9026T = (TextView) findViewById(C1704R.C1706id.battery_electricity_des_value);
        this.f9027U = (TextView) findViewById(C1704R.C1706id.battery_voltage_one_value);
        this.f9028V = (TextView) findViewById(C1704R.C1706id.battery_voltage_sencond_value);
        this.f9029W = (TextView) findViewById(C1704R.C1706id.battery_voltage_three_value);
        this.f9030X = (TextView) findViewById(C1704R.C1706id.battery_voltage_four_value);
        this.f9024R = (RelativeLayout) findViewById(C1704R.C1706id.play_back_start);
        this.f9023Q = (TextView) findViewById(C1704R.C1706id.drone_gps_number);
        this.f9033a = (PercentRelativeLayout) findViewById(C1704R.C1706id.progress_loading);
        this.f9013F = (RemotesimulatorView) findViewById(C1704R.C1706id.remote_simulator);
        this.f9009B = (PercentRelativeLayout) findViewById(C1704R.C1706id.drone_more_status);
        this.f9059p = (TextView) findViewById(C1704R.C1706id.dronerrorcode);
        this.f9059p.requestFocus();
        this.f9060q = (SeekBar) findViewById(C1704R.C1706id.paly_seebar);
        this.f9060q.setOnSeekBarChangeListener(this);
        this.f9055l = (ImageView) findViewById(C1704R.C1706id.paly_btn);
        this.f9055l.setOnClickListener(this);
        this.f9047d = (ImageView) findViewById(C1704R.C1706id.back_btn);
        this.f9048e = (ImageView) findViewById(C1704R.C1706id.headview);
        this.f9049f = (ImageView) findViewById(C1704R.C1706id.divide_line2);
        this.f9050g = (ImageView) findViewById(C1704R.C1706id.remote_signal);
        this.f9051h = (ImageView) findViewById(C1704R.C1706id.gps_signal);
        this.f9052i = (ImageView) findViewById(C1704R.C1706id.show_more_status);
        this.f9053j = (ImageView) findViewById(C1704R.C1706id.show_more_remote_status);
        this.f9054k = (ImageView) findViewById(C1704R.C1706id.show_more_gps_status);
        this.f9057n = (TextView) findViewById(C1704R.C1706id.dronestuts);
        this.f9058o = (TextView) findViewById(C1704R.C1706id.drone_signal_value);
        this.f9061r = (TextView) findViewById(C1704R.C1706id.hs_des);
        this.f9062s = (TextView) findViewById(C1704R.C1706id.hs_value);
        this.f9063t = (TextView) findViewById(C1704R.C1706id.vs_des);
        this.f9064u = (TextView) findViewById(C1704R.C1706id.vs_value);
        this.f9065v = (TextView) findViewById(C1704R.C1706id.height_des);
        this.f9066w = (TextView) findViewById(C1704R.C1706id.height_des_value);
        this.f9067x = (TextView) findViewById(C1704R.C1706id.distance_des);
        this.f9068y = (TextView) findViewById(C1704R.C1706id.distance_des_value);
        this.f9069z = (TextView) findViewById(C1704R.C1706id.play_back_progress_fact);
        this.f9008A = (TextView) findViewById(C1704R.C1706id.play_back_progress_all);
        C3103au.m29218b(getAssets(), this.f9058o, this.f9062s, this.f9064u, this.f9066w, this.f9068y, this.f9069z, this.f9008A, this.f9031Y, this.f9032Z, this.f9034aa, this.f9035ab, this.f9036ac, this.f9037ad);
        C3103au.m29232a(getAssets(), this.f9057n, this.f9061r, this.f9063t, this.f9065v, this.f9067x, this.f9059p, this.f9025S, this.f9026T, this.f9027U, this.f9028V, this.f9029W, this.f9030X);
        for (View view : new View[]{this.f9047d, this.f9055l, this.f9054k, this.f9053j, this.f9024R, this.f9052i, this.f9056m}) {
            view.setOnClickListener(this);
        }
        this.f9062s.setText("0.0" + (this.f9039af ? getString(C1704R.C1707string.speed_unit_mph) : getString(C1704R.C1707string.speed_unit_m)));
        this.f9064u.setText("0.0" + (this.f9039af ? getString(C1704R.C1707string.speed_unit_mph) : getString(C1704R.C1707string.speed_unit_m)));
        this.f9066w.setText("0.0" + (this.f9039af ? getString(C1704R.C1707string.distance_unit_ft) : getString(C1704R.C1707string.distance_unit_m)));
        this.f9068y.setText("0.0" + (this.f9039af ? getString(C1704R.C1707string.distance_unit_ft) : getString(C1704R.C1707string.distance_unit_m)));
    }

    /* renamed from: e */
    private void m30754e(int i) {
        C2289c c2289c;
        List<LatLng> m30693c = C2672b.m30703a().m30693c();
        m30693c.clear();
        for (int i2 = 0; i2 < i; i2++) {
            List<Object> list = this.f9018L.m30696b().get(Integer.valueOf(i2));
            if (list != null) {
                for (Object obj : list) {
                    if (obj != null) {
                        if (obj instanceof C2311aq) {
                            C2311aq c2311aq = (C2311aq) obj;
                            if (c2311aq != null) {
                                this.f9019M.m30724a(c2311aq);
                                LatLng latLng = new LatLng(c2311aq.m32189f(), c2311aq.m32190e());
                                if (!m30693c.contains(latLng)) {
                                    m30693c.add(latLng);
                                }
                            }
                        } else if (obj instanceof C2302ah) {
                            C2302ah c2302ah = (C2302ah) obj;
                            if (c2302ah != null && this.f9011D != null) {
                                this.f9019M.m30727a(c2302ah);
                            }
                        } else if (obj instanceof C2301ag) {
                            C2301ag c2301ag = (C2301ag) obj;
                            if (c2301ag != null) {
                                this.f9019M.m30728a(c2301ag);
                            }
                        } else if (obj instanceof C2319ay) {
                            C2319ay c2319ay = (C2319ay) obj;
                            if (c2319ay != null) {
                                this.f9019M.m30723a(c2319ay);
                            }
                        } else if (obj instanceof C2335e) {
                            C2335e c2335e = (C2335e) obj;
                            if (c2335e != null) {
                                this.f9019M.m30720a(c2335e);
                            }
                        } else if (obj instanceof C2334d) {
                            C2334d c2334d = (C2334d) obj;
                            if (c2334d != null) {
                                this.f9019M.m30721a(c2334d);
                                m30768b(c2334d);
                            }
                        } else if (obj instanceof C2292f) {
                            C2292f c2292f = (C2292f) obj;
                            if (c2292f != null) {
                                this.f9019M.m30729a(c2292f);
                            }
                        } else if (obj instanceof C2307am) {
                            C2307am c2307am = (C2307am) obj;
                            if (c2307am != null) {
                                this.f9019M.m30725a(c2307am);
                                m30783a(c2307am);
                            }
                        } else if (obj instanceof C2335e) {
                            C2335e c2335e2 = (C2335e) obj;
                            if (c2335e2 != null) {
                                this.f9019M.m30720a(c2335e2);
                            }
                        } else if (obj instanceof C2333c) {
                            C2333c c2333c = (C2333c) obj;
                            if (c2333c != null) {
                                this.f9019M.m30722a(c2333c);
                            }
                        } else if (obj instanceof C2335e) {
                            C2335e c2335e3 = (C2335e) obj;
                            if (c2335e3 != null) {
                                this.f9019M.m30720a(c2335e3);
                            }
                        } else if (obj instanceof C2333c) {
                            C2333c c2333c2 = (C2333c) obj;
                            if (c2333c2 != null) {
                                this.f9019M.m30722a(c2333c2);
                            }
                        } else if ((obj instanceof C2289c) && (c2289c = (C2289c) obj) != null) {
                            this.f9019M.m30730a(c2289c);
                        }
                    }
                }
            }
            if (i2 == i - 1 && m30693c.size() > 0) {
                this.f9011D.m30798a(m30693c.get(m30693c.size() - 1), m30693c);
            }
        }
    }

    /* renamed from: f */
    private void m30752f(int i) {
        if (i == 1) {
            m30787a(this.f9054k, C1704R.C1705drawable.btn_playback_satellite_map_normal);
        } else {
            m30787a(this.f9054k, C1704R.C1705drawable.btn_playback_satellite_map_checked);
        }
    }

    /* renamed from: g */
    static /* synthetic */ int m30749g(PlayBackDroneTrackActivity playBackDroneTrackActivity) {
        int i = playBackDroneTrackActivity.f9017K;
        playBackDroneTrackActivity.f9017K = i + 1;
        return i;
    }

    /* renamed from: g */
    private void m30750g(int i) {
        this.f9023Q.setText(i + "");
        if (i < 2) {
            m30787a(this.f9051h, C1704R.mipmap.icon_playback_signal_0);
        } else if (i >= 2 && i < 4) {
            m30787a(this.f9051h, C1704R.mipmap.icon_playback_signal_1);
        } else if (i >= 4 && i < 8) {
            m30787a(this.f9051h, C1704R.mipmap.icon_playback_signal_2);
        } else if (i >= 8 && i < 12) {
            m30787a(this.f9051h, C1704R.mipmap.icon_playback_signal_3);
        } else if (i >= 12 && i < 16) {
            m30787a(this.f9051h, C1704R.mipmap.icon_playback_signal_4);
        } else if (i < 16) {
        } else {
            m30787a(this.f9051h, C1704R.mipmap.icon_playback_signal_5);
        }
    }

    /* renamed from: h */
    private void m30748h(int i) {
        if (i < 25) {
            m30787a(this.f9050g, C1704R.mipmap.icon_playback_signal_0);
        } else if (i >= 25 && i < 35) {
            m30787a(this.f9050g, C1704R.mipmap.icon_playback_signal_1);
        } else if (i >= 35 && i < 50) {
            m30787a(this.f9050g, C1704R.mipmap.icon_playback_signal_2);
        } else if (i >= 50 && i < 65) {
            m30787a(this.f9050g, C1704R.mipmap.icon_playback_signal_3);
        } else if (i >= 65 && i < 80) {
            m30787a(this.f9050g, C1704R.mipmap.icon_playback_signal_4);
        } else if (i < 80) {
        } else {
            m30787a(this.f9050g, C1704R.mipmap.icon_playback_signal_5);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i */
    public void m30746i(int i) {
        this.f9055l.setImageResource(i);
    }

    @Override // com.fimi.soul.module.droneTrack.AbstractC2686f
    /* renamed from: a */
    public void mo30631a() {
        this.f9042ai.sendEmptyMessage(100);
    }

    @Override // com.fimi.soul.module.droneTrack.AbstractC2685e
    /* renamed from: a */
    public void mo30632a(int i) {
        m30752f(i);
    }

    @Override // com.fimi.soul.module.droneTrack.AbstractC2686f
    /* renamed from: a */
    public void mo30630a(String str) {
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        switch (view.getId()) {
            case C1704R.C1706id.back_btn /* 2131755442 */:
                finish();
                return;
            case C1704R.C1706id.play_back_start /* 2131755694 */:
            case C1704R.C1706id.paly_btn /* 2131755701 */:
                if (!this.f9022P) {
                    C1688z.m34447a(this, "正在加载数据", 3000);
                    return;
                } else if (this.f9040ag != EnumC2668a.Payback) {
                    this.f9042ai.removeMessages(3);
                    m30746i(C1704R.mipmap.btn_playback_play);
                    this.f9040ag = EnumC2668a.Payback;
                    return;
                } else {
                    if (this.f9017K != this.f9060q.getMax()) {
                        m30746i(C1704R.C1705drawable.btn_playback_pause);
                        this.f9040ag = EnumC2668a.Stop;
                    } else {
                        this.f9017K = 0;
                        m30746i(C1704R.mipmap.btn_playback_play);
                    }
                    this.f9042ai.sendEmptyMessage(3);
                    return;
                }
            case C1704R.C1706id.show_more_status /* 2131755697 */:
                if (this.f9009B.isShown()) {
                    m30787a(this.f9052i, C1704R.C1705drawable.btn_playback_more_normal);
                    this.f9009B.setVisibility(8);
                    this.f9009B.setAnimation(AnimationUtils.loadAnimation(this, C1704R.anim.more_drone_status_detial));
                    return;
                }
                m30787a(this.f9052i, C1704R.C1705drawable.btn_playback_more_checked);
                this.f9009B.setVisibility(0);
                this.f9009B.setAnimation(AnimationUtils.loadAnimation(this, 17432578));
                return;
            case C1704R.C1706id.show_more_remote_status /* 2131755698 */:
                if (this.f9013F.isShown()) {
                    m30787a(this.f9053j, C1704R.C1705drawable.btn_playback_rc_normal);
                    this.f9013F.setVisibility(8);
                    this.f9013F.setAnimation(AnimationUtils.loadAnimation(this, 17432579));
                    return;
                }
                m30787a(this.f9053j, C1704R.C1705drawable.btn_playback_rc_checked);
                this.f9013F.setVisibility(0);
                this.f9013F.setAnimation(AnimationUtils.loadAnimation(this, C1704R.anim.more_remote_detial));
                return;
            case C1704R.C1706id.show_more_gps_status /* 2131755699 */:
                m30752f(this.f9011D.m30806a());
                return;
            case C1704R.C1706id.show_more_battery_status /* 2131755700 */:
                if (this.f9010C.isShown()) {
                    m30787a(this.f9056m, C1704R.C1705drawable.btn_playback_battery_info_normal);
                    this.f9010C.setVisibility(8);
                    this.f9010C.setAnimation(AnimationUtils.loadAnimation(this, C1704R.anim.more_drone_status_detial));
                    return;
                }
                m30787a(this.f9056m, C1704R.C1705drawable.btn_playback_battery_info_checked);
                this.f9010C.setVisibility(0);
                this.f9010C.setAnimation(AnimationUtils.loadAnimation(this, 17432578));
                return;
            default:
                return;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.fimi.soul.base.BaseActivity, com.fimi.soul.base.BaseFimiActivity, com.fimi.kernel.BaseActivity, android.support.p001v4.app.FragmentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f9038ae = false;
        getWindow().setFlags(128, 128);
        setContentView(C1704R.layout.drone_paly_back_main);
        m30755e();
        this.f9012E = getSupportFragmentManager();
        this.f9011D = (PalyBackMapFragment) this.f9012E.findFragmentById(C1704R.C1706id.mapFragment);
        if (this.f9011D == null) {
            this.f9011D = new PalyBackMapFragment();
            this.f9012E.beginTransaction().add(C1704R.C1706id.mapFragment, this.f9011D).commit();
        }
        this.f9014G = C2673c.m30681a();
        if (getIntent() != null) {
            this.f9014G.m30677a(getIntent().getStringExtra("path"), this);
        }
        this.f9019M = new C2671a();
        if (this.f9020N == null) {
            this.f9020N = new Timer();
            this.f9020N.schedule(new TimerTask() { // from class: com.fimi.soul.module.droneTrack.PlayBackDroneTrackActivity.3
                @Override // java.util.TimerTask, java.lang.Runnable
                public void run() {
                    PlayBackDroneTrackActivity.this.f9042ai.sendEmptyMessage(1);
                }
            }, 0L, 3000L);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.fimi.soul.base.BaseActivity, com.fimi.soul.base.BaseFimiActivity, com.fimi.kernel.BaseActivity, android.support.p001v4.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        this.f9038ae = true;
        if (this.f9019M != null) {
            this.f9019M = null;
        }
        if (this.f9042ai.hasMessages(3)) {
            this.f9042ai.removeMessages(3);
        }
        this.f9022P = false;
        if (this.f9020N != null) {
            this.f9020N.cancel();
        }
        C2683c.m30635b();
        this.f9014G.m30675b();
        super.onDestroy();
        setContentView(C1704R.layout.empty_layout);
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        if (this.f9042ai.hasMessages(3)) {
            this.f9042ai.removeMessages(3);
        }
        this.f9017K = i;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.fimi.soul.base.BaseActivity, com.fimi.kernel.BaseActivity, android.support.p001v4.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        if (this.f9022P || this.f9033a.isShown()) {
            return;
        }
        this.f9033a.setVisibility(0);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.fimi.soul.base.BaseActivity, com.fimi.kernel.BaseActivity, android.support.p001v4.app.FragmentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public void onStartTrackingTouch(SeekBar seekBar) {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.fimi.soul.base.BaseActivity, android.support.p001v4.app.FragmentActivity, android.app.Activity
    public void onStop() {
        super.onStop();
        if (this.f9040ag == EnumC2668a.Stop) {
            this.f9042ai.removeMessages(3);
            m30746i(C1704R.mipmap.btn_playback_play);
            this.f9040ag = EnumC2668a.Payback;
        }
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public void onStopTrackingTouch(SeekBar seekBar) {
        if (this.f9040ag == EnumC2668a.Stop && !this.f9042ai.hasMessages(3)) {
            this.f9042ai.sendEmptyMessageDelayed(3, this.f9016J);
        }
        this.f9069z.setText(m30765b((seekBar.getProgress() * 1000) + ""));
        m30754e(seekBar.getProgress());
    }
}
