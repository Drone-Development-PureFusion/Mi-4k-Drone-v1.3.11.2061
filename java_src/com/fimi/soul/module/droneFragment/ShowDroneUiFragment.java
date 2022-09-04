package com.fimi.soul.module.droneFragment;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.fimi.kernel.BaseFragment;
import com.fimi.kernel.C1642c;
import com.fimi.kernel.p158b.p160b.C1609c;
import com.fimi.kernel.p158b.p161c.AbstractC1625d;
import com.fimi.kernel.utils.C1679t;
import com.fimi.kernel.utils.C1681v;
import com.fimi.kernel.utils.C1688z;
import com.fimi.kernel.view.percent.PercentRelativeLayout;
import com.fimi.overseas.soul.C1704R;
import com.fimi.soul.base.C1756a;
import com.fimi.soul.base.DroidPlannerApp;
import com.fimi.soul.biz.camera.AbstractC1794c;
import com.fimi.soul.biz.camera.C1783b;
import com.fimi.soul.biz.camera.C1827d;
import com.fimi.soul.biz.camera.C1831e;
import com.fimi.soul.biz.camera.entity.X11RespCmd;
import com.fimi.soul.biz.camera.p173b.AbstractC1790d;
import com.fimi.soul.biz.camera.p173b.AbstractC1792f;
import com.fimi.soul.biz.p170b.C1772d;
import com.fimi.soul.biz.p182j.C1882h;
import com.fimi.soul.biz.p186n.C2018a;
import com.fimi.soul.drone.C2083a;
import com.fimi.soul.drone.C2104d;
import com.fimi.soul.drone.p205i.C2311aq;
import com.fimi.soul.drone.p205i.C2338h;
import com.fimi.soul.drone.p205i.C2349j;
import com.fimi.soul.drone.p205i.C2365x;
import com.fimi.soul.entity.CameraMountState;
import com.fimi.soul.entity.DeviceType;
import com.fimi.soul.entity.DroneFilghtState;
import com.fimi.soul.entity.VideoStatusCode;
import com.fimi.soul.media.player.FermiPlayerUtils;
import com.fimi.soul.module.droneFragment.SectorProgressBar;
import com.fimi.soul.module.droneFragment.View$OnTouchListenerC2622b;
import com.fimi.soul.module.droneui.FlightActivity;
import com.fimi.soul.module.flyplannermedia.DroneMediaTabActivity;
import com.fimi.soul.module.p208a.C2476f;
import com.fimi.soul.module.p208a.View$OnClickListenerC2474e;
import com.fimi.soul.module.p214c.C2523d;
import com.fimi.soul.module.update.C3029b;
import com.fimi.soul.module.update.p218a.C3022b;
import com.fimi.soul.utils.C3103au;
import com.fimi.soul.utils.C3123g;
import com.fimi.soul.utils.C3128l;
import com.fimi.soul.view.DialogC3245f;
import com.fimi.soul.view.UpDownSliding;
import com.google.android.gms.maps.model.LatLng;
import com.google.firebase.p253b.C9755a;
import com.p255mi.live.openlivesdk.C10027c;
import com.p255mi.live.openlivesdk.p256a.AbstractC10023a;
import java.util.Timer;
import java.util.TimerTask;
/* loaded from: classes.dex */
public class ShowDroneUiFragment extends BaseFragment implements View.OnClickListener, View.OnTouchListener, AbstractC1790d<X11RespCmd>, AbstractC1792f<X11RespCmd>, AbstractC1794c.AbstractC1807d, C2104d.AbstractC2106b {

    /* renamed from: I */
    private static final int f8622I = 1;

    /* renamed from: J */
    private static final int f8623J = 2;

    /* renamed from: K */
    private static final int f8624K = 3;

    /* renamed from: L */
    private static final int f8625L = 4;

    /* renamed from: M */
    private static final int f8626M = 5;

    /* renamed from: N */
    private static final int f8627N = 6;

    /* renamed from: O */
    private static final int f8628O = 7;

    /* renamed from: P */
    private static final int f8629P = 8;

    /* renamed from: R */
    private static final int f8630R = 9;

    /* renamed from: S */
    private static final int f8631S = 10;

    /* renamed from: T */
    private static final int f8632T = 11;

    /* renamed from: U */
    private static final int f8633U = 12;

    /* renamed from: V */
    private static final int f8634V = 13;

    /* renamed from: W */
    private static final int f8635W = 15;

    /* renamed from: aJ */
    private static final String f8636aJ = "ShowDroneUiFragment";

    /* renamed from: aw */
    private static final int f8637aw = 10;

    /* renamed from: B */
    private UpDownSliding f8639B;

    /* renamed from: C */
    private C10027c f8640C;

    /* renamed from: E */
    private UpDownSliding.EnumC3201b f8642E;

    /* renamed from: F */
    private View$OnTouchListenerC2622b f8643F;

    /* renamed from: G */
    private ShowDroneStatusLineFragment f8644G;

    /* renamed from: H */
    private ShowDroneStatusFragment f8645H;

    /* renamed from: X */
    private C2349j.EnumC2350a f8647X;

    /* renamed from: Y */
    private long f8648Y;

    /* renamed from: aC */
    private C2018a f8653aC;

    /* renamed from: aE */
    private DroneFilghtState f8655aE;

    /* renamed from: aH */
    private AbstractC2612d f8658aH;

    /* renamed from: aI */
    private C1882h f8659aI;

    /* renamed from: aK */
    private int f8660aK;

    /* renamed from: aL */
    private int f8661aL;

    /* renamed from: aN */
    private C1609c f8663aN;

    /* renamed from: aO */
    private String f8664aO;

    /* renamed from: ac */
    private Timer f8670ac;

    /* renamed from: ad */
    private Timer f8671ad;

    /* renamed from: ae */
    private Button f8672ae;

    /* renamed from: af */
    private Button f8673af;

    /* renamed from: ag */
    private PercentRelativeLayout f8674ag;

    /* renamed from: ak */
    private DialogC3245f.C3246a f8678ak;

    /* renamed from: al */
    private DialogC3245f.C3260d f8679al;

    /* renamed from: am */
    private ImageButton f8680am;

    /* renamed from: an */
    private View$OnClickListenerC2474e f8681an;

    /* renamed from: ao */
    private boolean f8682ao;

    /* renamed from: ap */
    private boolean f8683ap;

    /* renamed from: aq */
    private int f8684aq;

    /* renamed from: ar */
    private float f8685ar;

    /* renamed from: as */
    private float f8686as;

    /* renamed from: at */
    private float f8687at;

    /* renamed from: au */
    private float f8688au;

    /* renamed from: av */
    private int f8689av;

    /* renamed from: ax */
    private double f8690ax;

    /* renamed from: ay */
    private double f8691ay;

    /* renamed from: az */
    private int f8692az;

    /* renamed from: d */
    private SectorProgressBar f8695d;

    /* renamed from: e */
    private SectorProgressBar f8696e;

    /* renamed from: f */
    private SectorProgressBar f8697f;

    /* renamed from: g */
    private SectorProgressBar f8698g;

    /* renamed from: h */
    private ImageButton f8699h;

    /* renamed from: i */
    private ImageButton f8700i;

    /* renamed from: j */
    private ImageButton f8701j;

    /* renamed from: k */
    private ImageButton f8702k;

    /* renamed from: l */
    private ImageButton f8703l;

    /* renamed from: m */
    private TextView f8704m;

    /* renamed from: n */
    private TextView f8705n;

    /* renamed from: o */
    private TextView f8706o;

    /* renamed from: p */
    private TextView f8707p;

    /* renamed from: q */
    private RelativeLayout f8708q;

    /* renamed from: r */
    private RelativeLayout f8709r;

    /* renamed from: s */
    private View f8710s;

    /* renamed from: t */
    private Context f8711t;

    /* renamed from: u */
    private C2083a f8712u;

    /* renamed from: v */
    private DroidPlannerApp f8713v;

    /* renamed from: w */
    private PercentRelativeLayout f8714w;

    /* renamed from: x */
    private ImageView f8715x;

    /* renamed from: y */
    private ImageView f8716y;

    /* renamed from: z */
    private EnumC2611c f8717z = EnumC2611c.MAP;

    /* renamed from: D */
    private boolean f8641D = false;

    /* renamed from: Q */
    private boolean f8646Q = false;

    /* renamed from: Z */
    private boolean f8649Z = false;

    /* renamed from: aa */
    private boolean f8668aa = false;

    /* renamed from: ab */
    private boolean f8669ab = false;

    /* renamed from: ah */
    private boolean f8675ah = false;

    /* renamed from: ai */
    private boolean f8676ai = false;

    /* renamed from: aj */
    private boolean f8677aj = false;

    /* renamed from: aA */
    private boolean f8651aA = false;

    /* renamed from: aB */
    private EnumC2609a f8652aB = EnumC2609a.FIRSTSTATUS;

    /* renamed from: aD */
    private boolean f8654aD = true;

    /* renamed from: aF */
    private boolean f8656aF = false;

    /* renamed from: aG */
    private EnumC2613e f8657aG = EnumC2613e.Record;

    /* renamed from: aM */
    private EnumC2610b f8662aM = EnumC2610b.FIRSTSTATE;

    /* renamed from: a */
    String f8650a = null;

    /* renamed from: b */
    Handler f8693b = new Handler() { // from class: com.fimi.soul.module.droneFragment.ShowDroneUiFragment.3
        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (message.what == 1) {
                long currentTimeMillis = System.currentTimeMillis() - ShowDroneUiFragment.this.f8648Y;
                if (ShowDroneUiFragment.this.f8644G != null && ShowDroneUiFragment.this.getActivity() != null) {
                    ShowDroneUiFragment.this.f8644G.m31150a(true);
                    ShowDroneUiFragment.this.f8664aO = FermiPlayerUtils.getTimelineString(currentTimeMillis);
                    ShowDroneUiFragment.this.f8644G.m31151a(ShowDroneUiFragment.this.f8664aO);
                }
            } else if (message.what != 2) {
                if (message.what == 7) {
                    if (!ShowDroneUiFragment.this.f8669ab && ShowDroneUiFragment.this.a().mo34433b().isShowing()) {
                        ShowDroneUiFragment.this.a().mo34429c();
                        ShowDroneUiFragment.this.m31087b(true);
                    }
                    ShowDroneUiFragment.this.f8693b.sendEmptyMessageDelayed(2, 2000L);
                } else if (message.what == 3) {
                    ShowDroneUiFragment.this.m31094a(true);
                    ShowDroneUiFragment.this.f8693b.sendEmptyMessageDelayed(2, 2000L);
                } else if (message.what == 8) {
                    ShowDroneUiFragment.this.f8646Q = true;
                    ShowDroneUiFragment.this.f8696e.m31214a(1000, 0);
                    ShowDroneUiFragment.this.f8698g.m31214a(1000, 0);
                    ShowDroneUiFragment.this.f8697f.m31214a(1000, 0);
                    ShowDroneUiFragment.this.f8695d.m31214a(1000, 0);
                    ShowDroneUiFragment.this.f8693b.sendEmptyMessageDelayed(9, 3000L);
                } else if (message.what == 9) {
                    ShowDroneUiFragment.this.f8696e.m31216a();
                    ShowDroneUiFragment.this.f8698g.m31216a();
                    ShowDroneUiFragment.this.f8697f.m31216a();
                    ShowDroneUiFragment.this.f8695d.m31216a();
                } else if (message.what == 10) {
                    ShowDroneUiFragment.this.f8675ah = false;
                } else if (message.what == 11) {
                    ShowDroneUiFragment.this.f8676ai = false;
                } else if (message.what == 12) {
                    ShowDroneUiFragment.this.f8649Z = false;
                }
            }
            super.handleMessage(message);
        }
    };

    /* renamed from: c */
    public final int f8694c = 0;

    /* renamed from: aP */
    private Handler f8665aP = new Handler() { // from class: com.fimi.soul.module.droneFragment.ShowDroneUiFragment.4
        @Override // android.os.Handler
        public void handleMessage(Message message) {
            switch (message.arg1) {
                case 0:
                    C1688z.m34450a(ShowDroneUiFragment.this.getActivity(), (int) C1704R.C1707string.network_disable_live);
                    return;
                case 1:
                    ShowDroneUiFragment.this.f8638A.m33989u().m34043f();
                    ShowDroneUiFragment.this.f8640C.m6436a(ShowDroneUiFragment.this.getActivity());
                    ShowDroneUiFragment.this.f8643F.m30965n();
                    return;
                default:
                    return;
            }
        }
    };

    /* renamed from: aQ */
    private CameraMountState f8666aQ = CameraMountState.IDLE;

    /* renamed from: aR */
    private View$OnClickListenerC2474e.AbstractC2475a f8667aR = new View$OnClickListenerC2474e.AbstractC2475a() { // from class: com.fimi.soul.module.droneFragment.ShowDroneUiFragment.5
        @Override // com.fimi.soul.module.p208a.View$OnClickListenerC2474e.AbstractC2475a
        /* renamed from: a */
        public void mo31028a() {
            ShowDroneUiFragment.this.m31032w();
        }

        @Override // com.fimi.soul.module.p208a.View$OnClickListenerC2474e.AbstractC2475a
        /* renamed from: a */
        public void mo31027a(int i, String str) {
            if (i != 0 || !ShowDroneUiFragment.this.f8654aD) {
                String m31537a = new C2476f().m31537a(i);
                if (m31537a.equals("")) {
                    return;
                }
                if (ShowDroneUiFragment.this.f8638A.e()) {
                    ShowDroneUiFragment.this.f8638A.m33989u().m34054a(m31537a, str);
                } else {
                    C1688z.m34447a(ShowDroneUiFragment.this.f8711t, ShowDroneUiFragment.this.f8711t.getString(C1704R.C1707string.set_fail_no_connect_camera), C1688z.f4191b);
                }
            }
        }
    };

    /* renamed from: A */
    private C1827d f8638A = (C1827d) C1783b.m34166a().m34150d();

    /* renamed from: com.fimi.soul.module.droneFragment.ShowDroneUiFragment$a */
    /* loaded from: classes.dex */
    private enum EnumC2609a {
        FIRSTSTATUS,
        SECONDSTATUS
    }

    /* renamed from: com.fimi.soul.module.droneFragment.ShowDroneUiFragment$b */
    /* loaded from: classes.dex */
    private enum EnumC2610b {
        FIRSTSTATE,
        SECONDSTATE
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.fimi.soul.module.droneFragment.ShowDroneUiFragment$c */
    /* loaded from: classes.dex */
    public enum EnumC2611c {
        MAP,
        CAMER
    }

    /* renamed from: com.fimi.soul.module.droneFragment.ShowDroneUiFragment$d */
    /* loaded from: classes.dex */
    public interface AbstractC2612d {
        /* renamed from: a */
        void mo30507a();
    }

    /* renamed from: com.fimi.soul.module.droneFragment.ShowDroneUiFragment$e */
    /* loaded from: classes.dex */
    public enum EnumC2613e {
        Record,
        ContinueCapture,
        TakePhoto,
        Live
    }

    public ShowDroneUiFragment() {
        this.f8638A.c(new AbstractC1625d() { // from class: com.fimi.soul.module.droneFragment.ShowDroneUiFragment.1
            @Override // com.fimi.kernel.p158b.p161c.AbstractC1625d
            /* renamed from: a */
            public void mo28036a(String str) {
                Log.d("Good", str);
            }
        });
        this.f8638A.a((AbstractC1790d) this);
    }

    /* renamed from: E */
    private void m31121E() {
        boolean z = false;
        if (C1681v.m34543a(this.f8711t).m34495v() == DeviceType.DEVICE_4K) {
            z = true;
        }
        if (!z || m31120F() < 2016) {
            short m32223c = this.f8712u.mo32910Z().m32223c();
            if (this.f8661aL - m32223c < 0) {
                this.f8660aK = ((m32223c - 255) * 90) / 255;
            } else {
                this.f8660aK = ((m32223c * 90) / 255) - 90;
            }
            this.f8661aL = m32223c;
        } else {
            this.f8660aK = this.f8712u.mo32910Z().m32210j();
        }
        this.f8704m.setText(String.valueOf(this.f8660aK) + this.f8711t.getString(C1704R.C1707string.degree_unit));
    }

    /* renamed from: F */
    private int m31120F() {
        C3022b c3022b = (C3022b) C1642c.m34887c().mo34880a(C3029b.f11258C, C3022b.class);
        if (c3022b == null) {
            c3022b = new C3022b();
        }
        if (c3022b == null || c3022b.m29600c() <= 0) {
            return 0;
        }
        return c3022b.m29600c();
    }

    /* renamed from: G */
    private void m31119G() {
        short m32021g = this.f8712u.mo32889y().m32021g();
        if (m32021g < 0) {
            m32021g = 0;
        }
        this.f8692az = (int) ((m32021g / this.f8690ax) * 100.0d);
        if (this.f8692az < 0) {
            return;
        }
        if (this.f8692az > 100) {
            this.f8690ax = C9755a.f30449c;
        } else {
            this.f8705n.setText(String.valueOf(this.f8692az) + "%");
        }
    }

    /* renamed from: H */
    private void m31118H() {
        this.f8638A.m33986x().mo34009a(C1831e.EnumC1832a.StopRecord);
        if (this.f8717z.equals(EnumC2611c.CAMER)) {
            this.f8701j.setImageDrawable(getResources().getDrawable(C1704R.C1705drawable.recording));
        }
        C1688z.m34442b(getActivity(), getString(C1704R.C1707string.record_end), C1688z.f4191b);
        if (!this.f8676ai) {
            this.f8676ai = true;
            C3103au.m29190l(getActivity());
            this.f8693b.sendEmptyMessageDelayed(11, 2000L);
        }
        this.f8638A.a(AbstractC1794c.EnumC1804a.Normal);
        m31110P();
        if (this.f8663aN == null) {
            this.f8663aN = C1609c.m34997a(C1642c.m34893a());
        }
        this.f8663aN.m34986e();
    }

    /* renamed from: I */
    private void m31117I() {
        this.f8638A.m33986x().mo34009a(C1831e.EnumC1832a.TakePhote);
        if (this.f8638A.g() == AbstractC1794c.EnumC1804a.Recoding) {
            C1688z.m34442b(getActivity(), getString(C1704R.C1707string.capture_success), C1688z.f4191b);
        } else {
            if (this.f8717z.equals(EnumC2611c.CAMER)) {
                this.f8701j.setImageDrawable(getResources().getDrawable(C1704R.C1705drawable.recording));
            }
            C1688z.m34444b(getActivity(), (int) C1704R.C1707string.take_photo_success, C1688z.f4191b);
            if (this.f8644G != null) {
                this.f8644G.m31151a(this.f8664aO);
            }
            this.f8638A.a(AbstractC1794c.EnumC1804a.Normal);
            this.f8643F.m30969j();
        }
        if (!this.f8675ah) {
            this.f8675ah = true;
            C3103au.m29188n(getActivity());
            this.f8693b.sendEmptyMessageDelayed(10, 1500L);
        }
        m31100a(EnumC2613e.TakePhoto);
        this.f8638A.a(true);
    }

    /* renamed from: J */
    private void m31116J() {
        if (this.f8641D) {
            this.f8640C.m6433b(getActivity());
        } else if (!C3103au.m29221b(getActivity())) {
            C1688z.m34450a(getActivity(), (int) C1704R.C1707string.network_disable_live);
        } else if (!m31034u()) {
            C1688z.m34450a(getActivity(), (int) C1704R.C1707string.network_disable_live);
        } else if (!C3103au.m29206e()) {
            C1688z.m34450a(getActivity(), (int) C1704R.C1707string.network_disable_live);
        } else {
            this.f8638A.m33989u().m34043f();
            this.f8640C.m6436a(getActivity());
            this.f8643F.m30965n();
        }
    }

    /* renamed from: K */
    private void m31115K() {
        this.f8717z = EnumC2611c.CAMER;
        this.f8639B.setVisibility(0);
        this.f8701j.setImageDrawable(getResources().getDrawable(C1704R.C1705drawable.camer_btn_selector));
        if (this.f8653aC != null) {
            this.f8653aC.m33232a(C1704R.C1705drawable.photo);
        }
        this.f8699h.setImageDrawable(getResources().getDrawable(C1704R.C1705drawable.map));
        this.f8703l.setImageDrawable(getResources().getDrawable(C1704R.C1705drawable.map_1080));
        m31112N();
        this.f8643F.m30986a(this.f8638A.e());
        ((FlightActivity) getActivity()).m30493d();
        this.f8643F.m30977d();
        this.f8643F.m30971h();
        if (this.f8712u.mo32904af()) {
            this.f8712u.mo32909a(C2104d.EnumC2105a.SHOW_FULL_SCREEN_LEAD);
        }
    }

    /* renamed from: L */
    private void m31114L() {
        if (C1642c.m34885e().m34505l()) {
            if (this.f8678ak == null) {
                this.f8678ak = new DialogC3245f.C3246a(getActivity());
            }
            if (this.f8678ak.m28638b().isShowing()) {
                return;
            }
            this.f8678ak.m28641a(getString(C1704R.C1707string.check_tf_card_must_format)).m28644a(getResources().getColor(C1704R.color.dialog_ensure_hot)).m28634b(getString(C1704R.C1707string.ensure), new DialogInterface.OnClickListener() { // from class: com.fimi.soul.module.droneFragment.ShowDroneUiFragment.13
                @Override // android.content.DialogInterface.OnClickListener
                public void onClick(DialogInterface dialogInterface, int i) {
                    C1642c.m34889b().mo34440a();
                    ShowDroneUiFragment.this.f8638A.m33989u().m34049c();
                }
            }).m28640a(getString(C1704R.C1707string.cancel), new DialogInterface.OnClickListener() { // from class: com.fimi.soul.module.droneFragment.ShowDroneUiFragment.12
                @Override // android.content.DialogInterface.OnClickListener
                public void onClick(DialogInterface dialogInterface, int i) {
                    C1642c.m34885e().m34527d(false);
                }
            }).m28645a().show();
        }
    }

    /* renamed from: M */
    private void m31113M() {
        if (C1642c.m34885e().m34504m()) {
            if (this.f8679al == null) {
                this.f8679al = new DialogC3245f.C3260d(getActivity());
            }
            if (this.f8679al.m28578b().isShowing()) {
                return;
            }
            this.f8679al.m28581a(getString(C1704R.C1707string.tf_card_no_use_please_change)).m28580a(getString(C1704R.C1707string.ensure), new DialogInterface.OnClickListener() { // from class: com.fimi.soul.module.droneFragment.ShowDroneUiFragment.14
                @Override // android.content.DialogInterface.OnClickListener
                public void onClick(DialogInterface dialogInterface, int i) {
                    C1642c.m34885e().m34523e(false);
                }
            }).m28584a().show();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: N */
    public void m31112N() {
        boolean z = true;
        if (this.f8638A.g() == AbstractC1794c.EnumC1804a.ContinueCapturing || this.f8638A.g() == AbstractC1794c.EnumC1804a.Recoding || this.f8641D) {
            z = false;
        }
        m31072d(z);
        if (this.f8717z.equals(EnumC2611c.MAP)) {
            return;
        }
        if (this.f8657aG != EnumC2613e.Record) {
            if (this.f8638A.j().isContinueCaptureMode()) {
                m31100a(EnumC2613e.ContinueCapture);
            }
            if (AbstractC1794c.EnumC1804a.Recoding == this.f8638A.g()) {
                m31100a(EnumC2613e.Record);
            }
        }
        m31109Q();
        m31111O();
    }

    /* renamed from: O */
    private void m31111O() {
        if (!isAdded()) {
            return;
        }
        if (this.f8641D) {
            this.f8701j.setImageDrawable(getResources().getDrawable(C1704R.C1705drawable.btn_live_stop));
            return;
        }
        switch (this.f8638A.g()) {
            case Recoding:
                this.f8701j.setImageDrawable(getResources().getDrawable(C1704R.C1705drawable.recording_on));
                this.f8639B.setEnabled(false);
                return;
            case ContinueCapturing:
                this.f8701j.setImageDrawable(getResources().getDrawable(C1704R.C1705drawable.recording_on));
                this.f8639B.setEnabled(false);
                return;
            case IDLE:
                this.f8639B.setEnabled(true);
                return;
            case Normal:
                this.f8639B.setEnabled(true);
                return;
            default:
                return;
        }
    }

    /* renamed from: P */
    private void m31110P() {
        try {
            if (this.f8670ac != null) {
                this.f8670ac.cancel();
                this.f8670ac = null;
            }
            if (this.f8644G == null || getActivity() == null) {
                return;
            }
            this.f8644G.m31150a(false);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: Q */
    private void m31109Q() {
        if (isAdded() && !this.f8717z.equals(EnumC2611c.MAP)) {
            switch (this.f8657aG) {
                case Record:
                    this.f8639B.setState(UpDownSliding.EnumC3201b.Record);
                    this.f8701j.setImageDrawable(getResources().getDrawable(C1704R.C1705drawable.video_btn_selector));
                    if (this.f8645H == null) {
                        return;
                    }
                    this.f8645H.m31182a(false);
                    return;
                case ContinueCapture:
                    this.f8701j.setImageDrawable(getResources().getDrawable(C1704R.C1705drawable.video_btn_selector));
                    return;
                case TakePhoto:
                    this.f8639B.setState(UpDownSliding.EnumC3201b.TakePhoto);
                    this.f8701j.setImageDrawable(getResources().getDrawable(C1704R.C1705drawable.camer_btn_selector));
                    if (this.f8645H == null) {
                        return;
                    }
                    this.f8645H.m31182a(false);
                    return;
                case Live:
                    this.f8639B.setState(UpDownSliding.EnumC3201b.Live);
                    this.f8701j.setImageDrawable(getResources().getDrawable(C1704R.C1705drawable.btn_live_play));
                    if (this.f8645H == null) {
                        return;
                    }
                    this.f8645H.m31182a(true);
                    return;
                default:
                    return;
            }
        }
    }

    /* renamed from: a */
    private void m31106a(TextView textView, String str) {
        if (!textView.getText().toString().equals(str)) {
            textView.setText(str);
        }
    }

    /* renamed from: a */
    private void m31104a(C2083a c2083a) {
        double m32188g = (c2083a.mo32891w().m32188g() - 677216.0d) / 10.0d;
        if (!c2083a.m33009am()) {
            m32188g = 0.0d;
        }
        if (m32188g < C9755a.f30449c) {
            this.f8695d.setProgress(0.0f);
        } else if (m32188g >= 500.0d) {
            this.f8695d.setProgress(500.0f);
            this.f8695d.m31215a(70.0f);
        } else {
            this.f8695d.setProgress((float) (m32188g * 0.7d));
            this.f8695d.m31215a((float) (m32188g * 0.7d));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0099, code lost:
        if (r2 < 30.0d) goto L22;
     */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void m31103a(C2104d.EnumC2105a enumC2105a, C2083a c2083a) {
        double d = 30.0d;
        switch (enumC2105a) {
            case NEWFRONEMODEL:
                if (c2083a.m33001au().m32391f() == 4) {
                    m31106a(this.f8673af, getString(C1704R.C1707string.actionresume));
                } else if (c2083a.m33001au().m32391f() == 2) {
                    m31106a(this.f8673af, getString(C1704R.C1707string.actionpause));
                }
                if (c2083a.m33001au().m32390g().isExceAction()) {
                    if (C1882h.m33763a(getActivity().getApplicationContext()).m33765a().get() == 2 || c2083a.m33001au().m32392e() == 4) {
                        if (this.f8717z.equals(EnumC2611c.CAMER)) {
                            if (this.f8674ag.isShown()) {
                                this.f8674ag.setVisibility(8);
                            }
                        } else if (!this.f8674ag.isShown()) {
                            this.f8674ag.setVisibility(0);
                        }
                    } else if (!this.f8674ag.isShown()) {
                        this.f8674ag.setVisibility(0);
                    }
                } else if (this.f8674ag.isShown()) {
                    this.f8674ag.setVisibility(8);
                }
                double m32188g = (c2083a.mo32891w().m32188g() - 677216.0d) / 10.0d;
                String m34515h = C1642c.m34885e().m34515h();
                if (c2083a.m32999aw().m32264c()) {
                    break;
                } else {
                    if (m32188g < Double.valueOf(m34515h).doubleValue()) {
                        d = Double.valueOf(m34515h).doubleValue();
                    }
                    d = m32188g;
                }
                double m32187h = c2083a.mo32891w().m32187h();
                if (!c2083a.m33009am()) {
                    m32187h = C9755a.f30449c;
                }
                boolean m34501p = C1642c.m34885e().m34501p();
                if (m34501p) {
                    d = C1679t.m34553b(d);
                }
                if (m32187h < 10.0d || !c2083a.m33009am() || !(c2083a.m33001au().m32392e() == 7 || c2083a.m33001au().m32392e() == 8)) {
                    this.f8656aF = false;
                    return;
                }
                if (!this.f8656aF) {
                    Context context = this.f8711t;
                    Object[] objArr = new Object[1];
                    objArr[0] = String.valueOf(Math.round(d)) + (m34501p ? this.f8711t.getString(C1704R.C1707string.distance_unit_ft) : this.f8711t.getString(C1704R.C1707string.distance_unit_m));
                    C1688z.m34448a(context, getString(C1704R.C1707string.show_drone_ui_return_home, objArr));
                }
                this.f8656aF = true;
                return;
            case DISCONNECTVIDEO:
            default:
                return;
            case ENTRYTAKEPHOTOMODEL:
                m31115K();
                return;
            case SENDHOVERWAYPOINT:
                C2523d.m31374a(c2083a).m31362f(147);
                m31068e(c2083a);
                return;
            case HEARDDAY:
                if (this.f8653aC != null && this.f8653aC.m33224e()) {
                    if (this.f8717z.equals(EnumC2611c.MAP)) {
                        this.f8653aC.m33227b();
                    } else {
                        this.f8653aC.m33232a(C1704R.C1705drawable.photo);
                    }
                    if (this.f8653aC.m33226c() == C2018a.EnumC2021a.DRONEPRESS) {
                        C2311aq mo32891w = c2083a.mo32891w();
                        this.f8653aC.m33229a(new LatLng(mo32891w.m32189f(), mo32891w.m32190e()));
                    }
                }
                m31104a(c2083a);
                m31091b(c2083a);
                if (!c2083a.m33007ao().m31755u()) {
                    return;
                }
                this.f8704m.setText(getString(C1704R.C1707string.no_use));
                return;
            case PTZ_GAIN:
                if (!c2083a.mo32904af()) {
                    return;
                }
                m31121E();
                return;
            case NOTIFYPBATTERY:
                m31084c(c2083a);
                return;
            case Remotecontrol:
                m31080c(c2083a.mo32905ac());
                m31076d(c2083a);
                return;
            case CONNECTSUCESS:
                m31094a(c2083a.mo32904af());
                m31112N();
                return;
            case ERROR_CODE:
                m31102a(c2083a.m33007ao());
                return;
            case BATTERY:
                m31119G();
                return;
            case BATTERYINFO:
                this.f8690ax = c2083a.mo32926J().m32009e();
                this.f8691ay = c2083a.mo32926J().m32010d();
                return;
        }
    }

    /* renamed from: a */
    private void m31102a(C2365x c2365x) {
        if (c2365x.m31797ac() && !c2365x.m31755u()) {
            this.f8643F.m30982b(getString(C1704R.C1707string.fault_super_heat));
        } else if (c2365x.m31795ae() && !c2365x.m31755u()) {
            this.f8643F.m30982b(getString(C1704R.C1707string.fault_sevo_stal));
        } else if (c2365x.m31789ak() && !c2365x.m31755u()) {
            this.f8643F.m30982b(getString(C1704R.C1707string.land_GC_PREHEAT));
        } else if (c2365x.m31756t() && !c2365x.m31755u()) {
            this.f8643F.m30982b(getString(C1704R.C1707string.land_GC_UNREADY));
        } else if (c2365x.m31798ab() && !c2365x.m31755u()) {
            this.f8643F.m30982b(getString(C1704R.C1707string.gc_fault));
        } else if (c2365x.m31796ad() && !c2365x.m31755u()) {
            this.f8643F.m30982b(getString(C1704R.C1707string.fault_self_fail));
        } else if (c2365x.m31794af() && !c2365x.m31755u()) {
            this.f8643F.m30982b(getString(C1704R.C1707string.fault_gc_heat_error));
        } else if (c2365x.m31793ag() && !c2365x.m31755u()) {
            this.f8643F.m30982b(getString(C1704R.C1707string.fault_ahrs));
        } else if (!c2365x.m31755u() || this.f8712u.mo32904af()) {
            this.f8643F.m30982b((String) null);
        } else {
            this.f8643F.m30982b(getString(C1704R.C1707string.fault_camera));
            m31108a(C1704R.C1707string.fault_camera);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m31100a(EnumC2613e enumC2613e) {
        if (!this.f8641D) {
            this.f8657aG = enumC2613e;
        }
    }

    /* renamed from: b */
    private void m31091b(C2083a c2083a) {
        float f = 100.0f;
        double m32187h = c2083a.mo32891w().m32187h();
        if (!c2083a.m33009am()) {
            m32187h = 0.0d;
        }
        if (m32187h <= C9755a.f30449c) {
            this.f8696e.setProgress(0.0f);
            return;
        }
        SectorProgressBar sectorProgressBar = this.f8696e;
        if (((float) m32187h) <= 100.0f) {
            f = (float) (m32187h * 0.7d);
        }
        sectorProgressBar.setProgress(f);
        this.f8696e.m31215a((float) (m32187h * 0.7d));
    }

    /* renamed from: b */
    private void m31090b(C2104d.EnumC2105a enumC2105a, C2083a c2083a) {
        C2349j c2349j = (C2349j) c2083a.f5918c;
        if (!this.f8668aa && c2349j.m31926e() != C2349j.EnumC2350a.StopQuicklyShot) {
            a().mo34429c();
            this.f8693b.removeMessages(7);
        }
        if (c2349j.m31926e() == C2349j.EnumC2350a.StartRecord) {
            m31062f(c2083a);
        } else if (c2349j.m31926e() == C2349j.EnumC2350a.StopRecrod) {
            m31118H();
        } else if (c2349j.m31926e() == C2349j.EnumC2350a.NormalShot) {
            m31117I();
        }
        m31112N();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @TargetApi(16)
    /* renamed from: b */
    public void m31087b(boolean z) {
        if (this.f8717z.equals(EnumC2611c.CAMER)) {
            m31080c(z);
            m31072d(z);
        }
    }

    /* renamed from: c */
    private void m31084c(C2083a c2083a) {
        double d = ShowDroneStatusFragment.f8493f;
        if (C9755a.f30449c >= d || d >= 30.0d) {
            this.f8697f.setSectorProgressBarType(SectorProgressBar.EnumC2567a.RightTop);
        } else {
            this.f8697f.setSectorProgressBarType(SectorProgressBar.EnumC2567a.RightToplow);
        }
        this.f8697f.setProgress((float) d);
        this.f8697f.m31215a((float) (d * 0.7d));
    }

    /* renamed from: c */
    private void m31083c(C2104d.EnumC2105a enumC2105a, C2083a c2083a) {
        switch (enumC2105a) {
            case OnRecivedCloudCameraCommandInfo:
                int mo32435a = c2083a.f5918c.mo32435a();
                if (mo32435a != 50) {
                    if (mo32435a != 49) {
                        return;
                    }
                    m31090b(enumC2105a, c2083a);
                    return;
                }
                C2338h c2338h = (C2338h) c2083a.f5918c;
                if (c2338h.m31974f() != C2338h.EnumC2339a.NoSDCard) {
                    this.f8638A.b(true);
                } else {
                    this.f8638A.b(false);
                }
                if (this.f8638A.m33986x().mo34008b()) {
                    switch (c2338h.m31974f()) {
                        case VideoRecording:
                            if (this.f8638A.e()) {
                                m31100a(EnumC2613e.Record);
                                this.f8638A.a(AbstractC1794c.EnumC1804a.Recoding);
                                if (c2338h.m31976d() != 0) {
                                    m31107a(System.currentTimeMillis() - c2338h.m31976d());
                                }
                                this.f8638A.a(true);
                                break;
                            }
                            break;
                    }
                } else {
                    switch (c2338h.m31974f()) {
                        case VideoRecording:
                            if (this.f8638A.e()) {
                                m31100a(EnumC2613e.Record);
                                this.f8638A.a(AbstractC1794c.EnumC1804a.Recoding);
                                if (c2338h.m31976d() != 0) {
                                    m31107a(System.currentTimeMillis() - c2338h.m31976d());
                                }
                                this.f8638A.a(true);
                                break;
                            }
                            break;
                        case PhotoShoting:
                            m31100a(EnumC2613e.ContinueCapture);
                            this.f8638A.a(AbstractC1794c.EnumC1804a.ContinueCapturing);
                            if (this.f8644G != null) {
                                this.f8644G.m31151a(c2338h.m31976d() + "张");
                            }
                            this.f8638A.a(true);
                            break;
                        case NormalReady:
                            if (this.f8644G != null) {
                                this.f8644G.m31151a(this.f8664aO);
                            }
                            m31110P();
                            this.f8638A.a(AbstractC1794c.EnumC1804a.Normal);
                            break;
                        case NoSDCard:
                            m31108a(C1704R.C1707string.tf_remove_error);
                            this.f8638A.a(AbstractC1794c.EnumC1804a.Normal);
                            break;
                        case FullSDCard:
                            m31108a(C1704R.C1707string.tf_full_error);
                            this.f8638A.a(AbstractC1794c.EnumC1804a.Normal);
                            break;
                        case OUTSDCard:
                            m31108a(C1704R.C1707string.tf_out_error);
                            this.f8638A.a(AbstractC1794c.EnumC1804a.Normal);
                            break;
                        case WIFIINIT:
                            m31108a(C1704R.C1707string.tf_camera_init_wifi);
                            break;
                        case CAMERASTART:
                            m31108a(C1704R.C1707string.tf_camera_start);
                            break;
                        case Error:
                            m31108a(C1704R.C1707string.fault_camera);
                            this.f8638A.l().getFileList().clear();
                            m31110P();
                            break;
                        case SAVEPHOTO:
                            this.f8668aa = true;
                            m31108a(C1704R.C1707string.tf_save_photo);
                            break;
                        case LOW_SPEED_CARD:
                        case CardNoPropose:
                        case CardNoProposeAndParamerr:
                        case CardWriteLow:
                        case CardWriteLowAndParamerr:
                            m31108a(C1704R.C1707string.tf_low_speed_error);
                            break;
                        case CardSetroot:
                            m31108a(C1704R.C1707string.tf_io_error);
                            break;
                        case CardFileSysError:
                        case CardParametersError:
                            m31108a(C1704R.C1707string.tf_io_error);
                            break;
                        case Formating:
                            m31108a(C1704R.C1707string.formating);
                            break;
                        case MachineException:
                            m31108a(C1704R.C1707string.camera_exception);
                            break;
                    }
                    m31112N();
                }
                switch (c2338h.m31974f()) {
                    case LOW_SPEED_CARD:
                    case CardNoPropose:
                    case CardNoProposeAndParamerr:
                    case CardWriteLow:
                    case CardWriteLowAndParamerr:
                        m31113M();
                        break;
                    case CardFileSysError:
                    case CardParametersError:
                        m31114L();
                        break;
                }
                m31112N();
                return;
            default:
                return;
        }
    }

    @TargetApi(16)
    /* renamed from: c */
    private void m31080c(boolean z) {
        if (this.f8712u.mo32904af() && this.f8644G != null && this.f8666aQ == CameraMountState.MOUNT && this.f8644G.m31160a() == C1704R.C1707string.fault_camera) {
            m31108a(C1704R.C1707string.tf_normal);
        }
        if (!this.f8717z.equals(EnumC2611c.CAMER)) {
            this.f8701j.setEnabled(true);
            this.f8701j.setImageAlpha(255);
            return;
        }
        this.f8701j.setEnabled(z);
        if (z) {
            this.f8701j.setImageAlpha(255);
        } else {
            this.f8701j.setImageAlpha(85);
        }
    }

    /* renamed from: d */
    private void m31077d(int i) {
        m31064e(false);
        new DialogC3245f.C3260d(getActivity()).m28581a(C1642c.m34886d().getString(C1704R.C1707string.live_stopped) + getString(i)).m28580a(getString(C1704R.C1707string.ensure), new DialogInterface.OnClickListener() { // from class: com.fimi.soul.module.droneFragment.ShowDroneUiFragment.9
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i2) {
            }
        }).m28584a().show();
    }

    /* renamed from: d */
    private void m31076d(C2083a c2083a) {
        if (c2083a.m33001au().m32390g().isLightStream()) {
            if (this.f8698g.getProgress() == 0.0f) {
                return;
            }
            this.f8698g.setProgress(0.0f);
            this.f8698g.m31215a(0.0f);
            return;
        }
        byte m32191d = c2083a.mo32891w().m32191d();
        if (m32191d <= 4) {
            return;
        }
        if (m32191d <= 8) {
            this.f8698g.setSectorProgressBarType(SectorProgressBar.EnumC2567a.RightBottomSatt);
        } else {
            this.f8698g.setSectorProgressBarType(SectorProgressBar.EnumC2567a.RightBottom);
        }
        if (m32191d <= 8) {
            this.f8698g.setProgress(m32191d * 4.2f);
            this.f8698g.m31215a(m32191d * 2.87f);
        } else if (m32191d <= 8 || m32191d > 13) {
            this.f8698g.setProgress((m32191d * 4.7f) + 5.0f);
            this.f8698g.m31215a((float) ((m32191d * 3.29f) + 3.2d));
        } else {
            this.f8698g.setProgress((m32191d * 5.5f) - 11.0f);
            this.f8698g.m31215a((float) ((m32191d * 4.6f) - 13.8d));
        }
    }

    /* renamed from: d */
    private void m31075d(C2104d.EnumC2105a enumC2105a, C2083a c2083a) {
        if (!c2083a.mo32905ac() || c2083a.m33007ao().m31755u()) {
            m31108a(C1704R.C1707string.fault_camera);
            this.f8664aO = getString(C1704R.C1707string.tf_normal);
            this.f8638A.l().getFileList().clear();
            this.f8638A.a(AbstractC1794c.EnumC1804a.Normal);
            m31064e(false);
            m31112N();
            m31080c(false);
            this.f8643F.m30982b((String) null);
            this.f8638A.a(true);
            m31112N();
            return;
        }
        switch (enumC2105a) {
            case OnRecivedCloudCameraCommandInfo:
                if (c2083a.f5918c.mo32435a() != 50) {
                    return;
                }
                if (((C2338h) c2083a.f5918c).m31974f() != C2338h.EnumC2339a.NoSDCard) {
                    this.f8638A.b(true);
                } else {
                    this.f8638A.b(false);
                }
                switch (r0.m31974f()) {
                    case WIFIINIT:
                        m31108a(C1704R.C1707string.tf_camera_init_wifi);
                        return;
                    case CAMERASTART:
                        m31108a(C1704R.C1707string.tf_camera_start);
                        return;
                    case Error:
                        m31108a(C1704R.C1707string.fault_camera);
                        this.f8638A.l().getFileList().clear();
                        return;
                    case SAVEPHOTO:
                    case Formating:
                    default:
                        return;
                    case LOW_SPEED_CARD:
                    case CardNoPropose:
                    case CardNoProposeAndParamerr:
                    case CardWriteLow:
                    case CardWriteLowAndParamerr:
                        m31108a(C1704R.C1707string.tf_low_speed_error);
                        m31113M();
                        return;
                    case CardSetroot:
                        m31108a(C1704R.C1707string.tf_io_error);
                        return;
                    case CardFileSysError:
                    case CardParametersError:
                        m31108a(C1704R.C1707string.tf_io_error);
                        m31114L();
                        return;
                    case MachineException:
                        m31108a(C1704R.C1707string.camera_exception);
                        return;
                }
            default:
                return;
        }
    }

    @TargetApi(16)
    /* renamed from: d */
    private void m31072d(boolean z) {
        if (this.f8717z.equals(EnumC2611c.MAP)) {
            this.f8702k.setEnabled(true);
            this.f8702k.setImageAlpha(255);
        } else {
            this.f8702k.setEnabled(z);
            if (z) {
                this.f8702k.setImageAlpha(255);
            } else {
                this.f8702k.setImageAlpha(85);
            }
        }
        this.f8700i.setEnabled(z);
        if (z) {
            this.f8700i.setImageAlpha(255);
        } else {
            this.f8700i.setImageAlpha(85);
        }
    }

    /* renamed from: e */
    private void m31069e(int i) {
    }

    /* renamed from: e */
    private void m31068e(C2083a c2083a) {
        byte m32115a = c2083a.mo32920P().m32115a();
        if (m32115a == 80) {
            if (!getString(C1704R.C1707string.actionpause).equals(this.f8673af.getText().toString())) {
                return;
            }
            m31106a(this.f8673af, getString(C1704R.C1707string.actionresume));
        } else if (m32115a == 82) {
            m31106a(this.f8673af, getString(C1704R.C1707string.actionpause));
        } else {
            if (this.f8674ag.isShown()) {
                this.f8674ag.setVisibility(8);
            }
            switch (this.f8659aI.m33765a().get()) {
                case 1:
                    c2083a.mo32909a(C2104d.EnumC2105a.SHOWINFORWINDOW);
                    break;
                case 2:
                    c2083a.mo32909a(C2104d.EnumC2105a.SHOWQUITDOUBLEINFRWINDOW);
                    break;
                case 3:
                    c2083a.mo32909a(C2104d.EnumC2105a.SHOWDOUBLEPOI);
                    break;
                case 4:
                    c2083a.mo32909a(C2104d.EnumC2105a.QUITTAKEPHOTOFLY);
                    break;
            }
            this.f8659aI.m33764a(0);
            m31106a(this.f8673af, getString(C1704R.C1707string.actionpause));
        }
    }

    /* renamed from: e */
    private void m31067e(C2104d.EnumC2105a enumC2105a, C2083a c2083a) {
        switch (enumC2105a) {
            case CLEANALLOBJ:
                if (c2083a.m33007ao().m31755u()) {
                    this.f8704m.setText(getString(C1704R.C1707string.no_use));
                }
                m31094a(false);
                m31110P();
                if (this.f8674ag.isShown()) {
                    this.f8674ag.setVisibility(8);
                    break;
                }
                break;
        }
        if (!c2083a.mo32906ab().mo32588a()) {
            if (this.f8696e.getProgress() != 0.0f) {
                this.f8696e.setProgress(0.0f);
                this.f8696e.m31215a(0.0f);
            }
            if (this.f8698g.getProgress() != 0.0f) {
                this.f8698g.setProgress(0.0f);
                this.f8698g.m31215a(0.0f);
            }
            if (this.f8697f.getProgress() != 0.0f) {
                this.f8697f.setProgress(0.0f);
                this.f8697f.m31215a(0.0f);
            }
            if (this.f8695d.getProgress() != 0.0f) {
                this.f8695d.setProgress(0.0f);
                this.f8695d.m31215a(0.0f);
            }
        }
        if (!c2083a.mo32904af()) {
            m31094a(false);
        }
        if (!c2083a.mo32905ac() && this.f8653aC != null) {
            if (this.f8717z.equals(EnumC2611c.MAP)) {
                this.f8653aC.m33227b();
            } else {
                this.f8653aC.m33232a(C1704R.C1705drawable.photo);
            }
        }
        this.f8638A.a(AbstractC1794c.EnumC1804a.Normal);
        m31064e(false);
        m31112N();
        m31080c(false);
        this.f8643F.m30982b((String) null);
        this.f8638A.a(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @TargetApi(16)
    /* renamed from: e */
    public void m31064e(boolean z) {
        boolean z2 = true;
        int i = 0;
        this.f8641D = z;
        if (this.f8717z.equals(EnumC2611c.CAMER)) {
            if (C1642c.m34886d() != null) {
                this.f8701j.setImageDrawable(C1642c.m34886d().getResources().getDrawable(!z ? C1704R.C1705drawable.btn_live_play : C1704R.C1705drawable.btn_live_stop));
            }
            this.f8700i.setEnabled(!z);
            this.f8702k.setEnabled(!z);
            if (z) {
                this.f8702k.setImageAlpha(85);
                this.f8700i.setImageAlpha(85);
            } else {
                this.f8700i.setImageAlpha(255);
                this.f8702k.setImageAlpha(255);
            }
        }
        UpDownSliding upDownSliding = this.f8639B;
        if (z) {
            z2 = false;
        }
        upDownSliding.setEnabled(z2);
        if (this.f8645H != null) {
            ShowDroneStatusFragment showDroneStatusFragment = this.f8645H;
            if (!z) {
                i = 8;
            }
            showDroneStatusFragment.m31174d(i);
        }
        if (this.f8644G != null) {
            this.f8644G.m31143b(z);
        }
    }

    /* renamed from: f */
    private void m31062f(C2083a c2083a) {
        this.f8638A.m33986x().mo34009a(C1831e.EnumC1832a.StartRecord);
        if (this.f8717z.equals(EnumC2611c.CAMER)) {
            this.f8701j.setImageDrawable(getResources().getDrawable(C1704R.C1705drawable.recording));
        }
        this.f8638A.a(AbstractC1794c.EnumC1804a.Recoding);
        if (!this.f8649Z) {
            this.f8649Z = true;
            C3103au.m29189m(getActivity());
            this.f8693b.sendEmptyMessageDelayed(12, 2000L);
        }
        C1688z.m34442b(getActivity(), getString(C1704R.C1707string.record_start), C1688z.f4191b);
        m31107a(System.currentTimeMillis());
        c2083a.mo32909a(C2104d.EnumC2105a.CAMERARECORD);
        if (this.f8663aN == null) {
            this.f8663aN = C1609c.m34997a(C1642c.m34893a());
        }
        this.f8663aN.m34987d();
    }

    /* renamed from: A */
    public void m31125A() {
        if (this.f8681an != null) {
            this.f8681an.m31546a();
        }
    }

    /* renamed from: B */
    public void m31124B() {
        if ("off".equals("") || !this.f8638A.e() || C1681v.m34543a(C1642c.m34893a()).m34495v() != DeviceType.DEVICE_4K) {
            return;
        }
        this.f8638A.m33989u().m34054a("menu_album", "off");
    }

    /* renamed from: C */
    public void m31123C() {
        String ae_bias = this.f8638A.j().getAe_bias();
        if (ae_bias == null || ae_bias.equals("")) {
            return;
        }
        ShowDroneStatusFragment.f8492b = Float.valueOf(ae_bias.replace("EV", "").replace(" ", "")).floatValue();
    }

    /* renamed from: D */
    public boolean m31122D() {
        return this.f8717z == EnumC2611c.MAP;
    }

    /* renamed from: a */
    public void m31108a(int i) {
        if (this.f8644G == null || getActivity() == null) {
            return;
        }
        this.f8644G.m31141c(i);
    }

    /* renamed from: a */
    public void m31107a(long j) {
        this.f8648Y = j;
        if (this.f8670ac == null) {
            this.f8670ac = new Timer();
            this.f8670ac.schedule(new TimerTask() { // from class: com.fimi.soul.module.droneFragment.ShowDroneUiFragment.2
                @Override // java.util.TimerTask, java.lang.Runnable
                public void run() {
                    if (ShowDroneUiFragment.this.f8638A.g() == AbstractC1794c.EnumC1804a.Recoding) {
                        ShowDroneUiFragment.this.f8693b.sendEmptyMessage(1);
                    } else if (ShowDroneUiFragment.this.f8670ac == null) {
                        ShowDroneUiFragment.this.f8670ac = null;
                    } else {
                        ShowDroneUiFragment.this.f8670ac.cancel();
                        ShowDroneUiFragment.this.f8670ac = null;
                    }
                }
            }, 0L, 1000L);
        }
    }

    @Override // com.fimi.soul.biz.camera.AbstractC1794c.AbstractC1807d
    /* renamed from: a */
    public void mo31105a(AbstractC1794c.EnumC1804a enumC1804a, AbstractC1794c.EnumC1804a enumC1804a2) {
        C1688z.m34447a(getActivity(), "状态变化啦" + enumC1804a + "-->" + enumC1804a2, 1000);
    }

    /* renamed from: a */
    public void m31101a(ShowDroneStatusLineFragment showDroneStatusLineFragment, ShowDroneStatusFragment showDroneStatusFragment) {
        this.f8644G = showDroneStatusLineFragment;
        this.f8645H = showDroneStatusFragment;
    }

    /* renamed from: a */
    public void m31094a(boolean z) {
        if (this.f8717z.equals(EnumC2611c.CAMER)) {
        }
    }

    @Override // com.fimi.soul.biz.camera.p173b.AbstractC1792f
    /* renamed from: a  reason: avoid collision after fix types in other method */
    public void mo28055a(boolean z, X11RespCmd x11RespCmd) {
        if (this.f8644G != null) {
            X11RespCmd.NotificationType notificationType = x11RespCmd.getNotificationType();
            if (notificationType == X11RespCmd.NotificationType.CardRemoved) {
                this.f8638A.a(true);
                this.f8638A.a(AbstractC1794c.EnumC1804a.Normal);
            } else if (notificationType == X11RespCmd.NotificationType.PhotoFinish) {
                m31094a(true);
            }
            if (!z) {
                switch (x11RespCmd.getRval()) {
                    case -4:
                        this.f8638A.a(-4);
                        this.f8638A.m33987w().m33996b();
                        break;
                }
            }
            switch (x11RespCmd.getMsg_id()) {
                case 2:
                    m31071d(z, x11RespCmd);
                    if (!z) {
                        if (x11RespCmd.getType() != null) {
                            C1688z.m34447a(this.f8711t, this.f8711t.getString(C1704R.C1707string.setting_false), C1688z.f4192c);
                        }
                        C1642c.m34889b().mo34429c();
                        return;
                    }
                    if (!C1831e.f4855bB.equals(x11RespCmd.getType())) {
                    }
                    if (!C1831e.f4935cd.equals(x11RespCmd.getType())) {
                        return;
                    }
                    m31125A();
                    return;
                case 3:
                    if (EnumC2611c.CAMER == this.f8717z && isAdded()) {
                        m31112N();
                    }
                    m31123C();
                    return;
                case 4:
                    if (z) {
                        C1688z.m34447a(this.f8711t, getString(C1704R.C1707string.format_success), C1688z.f4192c);
                        this.f8638A.m33989u().m34046d(C1831e.f4927cU);
                        this.f8638A.a(true);
                    } else {
                        C1688z.m34447a(this.f8711t, this.f8711t.getString(C1704R.C1707string.format_fail), C1688z.f4192c);
                    }
                    C1642c.m34889b().mo34429c();
                    return;
                case 257:
                    m31094a(true);
                    this.f8638A.l().getFileList().clear();
                    if (getActivity() != null) {
                        m31108a(C1704R.C1707string.tf_normal);
                    }
                    if (!z) {
                        return;
                    }
                    this.f8638A.m33989u().m34052b();
                    return;
                case 260:
                    this.f8638A.m33989u().m34045e();
                    if (this.f8641D) {
                        this.f8638A.m33989u().m34041g();
                    } else {
                        this.f8638A.m33989u().m34040h();
                    }
                    m31112N();
                    return;
                case C1831e.f4836aj /* 7829367 */:
                    C3123g.m29090a().m29089a(" changeMountState --->" + CameraMountState.DISMOUNT);
                    if (!isAdded()) {
                        return;
                    }
                    m31036s();
                    return;
                case C1831e.f4835ai /* 10066329 */:
                    if (this.f8712u.mo32904af() && this.f8638A.g() != AbstractC1794c.EnumC1804a.Recoding && this.f8666aQ == CameraMountState.MOUNT) {
                        m31094a(true);
                    }
                    this.f8693b.sendEmptyMessageDelayed(2, 2000L);
                    if (this.f8638A.e()) {
                        return;
                    }
                    this.f8638A.m33987w().m33996b();
                    return;
                case C1831e.f4838al /* 25725064 */:
                    C3123g.m29090a().m29089a(" changeMountState --->" + CameraMountState.MOUNT);
                    m31037r();
                    return;
                default:
                    return;
            }
        }
    }

    /* renamed from: b */
    public void m31092b(int i) {
        this.f8714w.setVisibility(i);
    }

    @Override // com.fimi.soul.biz.camera.p173b.AbstractC1790d
    /* renamed from: b  reason: avoid collision after fix types in other method */
    public void mo28242b(boolean z, X11RespCmd x11RespCmd) {
        C3123g.m29090a().m29089a(" changeMountState onMount ");
        m31037r();
    }

    /* renamed from: c */
    public void m31085c(int i) {
        if (i == 0) {
            this.f8708q.setVisibility(0);
            this.f8709r.setVisibility(0);
            return;
        }
        this.f8708q.setVisibility(4);
        this.f8709r.setVisibility(4);
    }

    @Override // com.fimi.soul.biz.camera.p173b.AbstractC1790d
    /* renamed from: c  reason: avoid collision after fix types in other method */
    public void mo28240c(boolean z, X11RespCmd x11RespCmd) {
        C3123g.m29090a().m29089a(" changeMountState onDisMount ");
        m31036s();
    }

    /* renamed from: d */
    public void m31078d() {
        if (!this.f8712u.m32982h().m31830c() || this.f8643F == null) {
            return;
        }
        this.f8643F.m30964o();
    }

    /* renamed from: d */
    public void m31071d(boolean z, X11RespCmd x11RespCmd) {
        if (!z || !"ae_bias".equals(x11RespCmd.getType())) {
            return;
        }
        m31032w();
    }

    /* renamed from: e */
    public void m31070e() {
        if (this.f8643F != null) {
            this.f8643F.m30962q();
        }
    }

    /* renamed from: f */
    public void m31063f() {
        if (C1681v.m34543a(getActivity()).m34495v() == DeviceType.DEVICE_4K) {
            m31059g();
        } else if (C1681v.m34543a(getActivity()).m34495v() != DeviceType.DEVICE_1080P) {
        } else {
            m31057h();
        }
    }

    /* renamed from: g */
    public void m31059g() {
        this.f8699h.setVisibility(0);
        this.f8710s.setVisibility(0);
        this.f8680am.setVisibility(0);
        this.f8703l.setVisibility(8);
    }

    /* renamed from: h */
    public void m31057h() {
        this.f8699h.setVisibility(8);
        this.f8710s.setVisibility(8);
        this.f8680am.setVisibility(8);
        this.f8703l.setVisibility(0);
    }

    /* renamed from: i */
    public void m31055i() {
        this.f8640C = new C10027c(C1756a.f4508A, C1756a.f4509B, 1, new AbstractC10023a() { // from class: com.fimi.soul.module.droneFragment.ShowDroneUiFragment.10
            @Override // com.p255mi.live.openlivesdk.p256a.AbstractC10023a
            /* renamed from: a */
            public void mo6441a() {
                ShowDroneUiFragment.this.f8638A.m33989u().m34040h();
                ShowDroneUiFragment.this.m31064e(false);
                C3123g.m29090a().m29089a(" onEndLiveSuccess ");
                ShowDroneUiFragment.this.f8643F.m30975e();
            }

            @Override // com.p255mi.live.openlivesdk.p256a.AbstractC10023a
            /* renamed from: a */
            public void mo6440a(int i, String str) {
                switch (i) {
                    case -3:
                        C1688z.m34449a(ShowDroneUiFragment.this.getActivity(), (int) C1704R.C1707string.stream_live_version_error, 2000);
                        return;
                    case -2:
                        C1688z.m34449a(ShowDroneUiFragment.this.getActivity(), (int) C1704R.C1707string.stream_live_uninstall_error, 2000);
                        return;
                    default:
                        return;
                }
            }

            @Override // com.p255mi.live.openlivesdk.p256a.AbstractC10023a
            /* renamed from: a */
            public void mo6439a(String str) {
                ShowDroneUiFragment.this.f8650a = str;
                ShowDroneUiFragment.this.f8638A.m33989u().m34041g();
                ShowDroneUiFragment.this.f8643F.m30988a(str);
                ShowDroneUiFragment.this.m31064e(true);
            }

            @Override // com.p255mi.live.openlivesdk.p256a.AbstractC10023a
            /* renamed from: b */
            public void mo6438b(int i, String str) {
                switch (i) {
                    case -3:
                        C1688z.m34449a(ShowDroneUiFragment.this.getActivity(), (int) C1704R.C1707string.stream_live_version_error, 2000);
                        return;
                    case -2:
                        C1688z.m34449a(ShowDroneUiFragment.this.getActivity(), (int) C1704R.C1707string.stream_live_uninstall_error, 2000);
                        C3123g.m29090a().m29089a(" stream_live_uninstall_error ");
                        ShowDroneUiFragment.this.m31064e(false);
                        return;
                    default:
                        return;
                }
            }
        }, this.f8713v);
        this.f8643F.m30991a(new View$OnTouchListenerC2622b.AbstractC2628c() { // from class: com.fimi.soul.module.droneFragment.ShowDroneUiFragment.11
            @Override // com.fimi.soul.module.droneFragment.View$OnTouchListenerC2622b.AbstractC2628c
            /* renamed from: a */
            public void mo30957a(int i, int i2, int i3) {
                ShowDroneUiFragment.this.f8693b.obtainMessage(VideoStatusCode.STATUS_CODE, new VideoStatusCode(i, i2, i3)).sendToTarget();
            }
        });
    }

    /* renamed from: j */
    public void m31053j() {
        if (this.f8638A != null) {
            this.f8638A.n();
        }
    }

    @TargetApi(16)
    /* renamed from: k */
    public void m31051k() {
        if (this.f8717z.equals(EnumC2611c.MAP)) {
            if ((C1882h.m33763a(getActivity().getApplicationContext()).m33765a().get() == 2 || this.f8712u.m33001au().m32392e() == 4) && this.f8674ag.isShown()) {
                this.f8674ag.setVisibility(8);
            }
            m31115K();
            m31035t();
            ((FlightActivity) getActivity()).m30479k();
        } else {
            this.f8717z = EnumC2611c.MAP;
            m31035t();
            this.f8639B.setVisibility(8);
            this.f8701j.setImageDrawable(getResources().getDrawable(C1704R.C1705drawable.navigabutton));
            if (this.f8653aC != null) {
                this.f8653aC.m33227b();
            }
            this.f8699h.setImageDrawable(getResources().getDrawable(C1704R.C1705drawable.video));
            this.f8703l.setImageDrawable(getResources().getDrawable(C1704R.C1705drawable.video_1080));
            ((FlightActivity) getActivity()).m30491e();
            this.f8643F.m30985b();
            this.f8702k.setEnabled(true);
            this.f8702k.setImageAlpha(255);
            this.f8643F.m30973f();
            this.f8643F.m30970i();
            ((FlightActivity) getActivity()).m30479k();
        }
        m31080c(this.f8712u.mo32905ac());
    }

    /* renamed from: l */
    public void m31049l() {
        this.f8643F.m30982b(getString(C1704R.C1707string.fault_camera));
        m31108a(C1704R.C1707string.fault_camera);
    }

    /* renamed from: m */
    public void m31047m() {
        if (this.f8643F != null) {
            this.f8643F.m30964o();
        }
    }

    /* renamed from: n */
    public void m31045n() {
        this.f8699h.performClick();
    }

    /* renamed from: o */
    public void m31043o() {
        if (!this.f8717z.equals(EnumC2611c.MAP)) {
            this.f8699h.performClick();
        }
    }

    @Override // android.support.p001v4.app.Fragment
    public void onActivityCreated(@Nullable Bundle bundle) {
        super.onActivityCreated(bundle);
        this.f8663aN = C1609c.m34997a(getActivity());
    }

    @Override // android.support.p001v4.app.Fragment
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        this.f8711t = activity.getApplicationContext();
        this.f8713v = (DroidPlannerApp) activity.getApplication();
        this.f8658aH = (AbstractC2612d) activity;
        this.f8712u = this.f8713v.f4493a;
    }

    @Override // android.view.View.OnClickListener
    @TargetApi(16)
    public void onClick(View view) {
        String videoResolution;
        switch (view.getId()) {
            case C1704R.C1706id.view_camera /* 2131755838 */:
                if (this.f8638A.g() != AbstractC1794c.EnumC1804a.Recoding || (videoResolution = this.f8638A.j().getVideoResolution()) == null || "".equals(videoResolution) || C1831e.f4941cj.contains(videoResolution) || C1831e.f4945cn.contains(videoResolution) || C1831e.f4946co.contains(videoResolution)) {
                    return;
                }
                if (a().mo34433b() != null && a().mo34433b().isShowing()) {
                    return;
                }
                a().mo34440a();
                if (a().mo34433b() != null) {
                    a().mo34433b().setCancelable(false);
                }
                this.f8638A.m33986x().mo34000k();
                this.f8693b.sendEmptyMessageDelayed(7, 4000L);
                return;
            case C1704R.C1706id.cameraButton_1080 /* 2131756224 */:
                m31051k();
                return;
            case C1704R.C1706id.camerButton /* 2131756225 */:
                m31051k();
                return;
            case C1704R.C1706id.setttingbutton /* 2131756231 */:
                this.f8658aH.mo30507a();
                return;
            case C1704R.C1706id.rightcenterbutton /* 2131756232 */:
                if (this.f8717z.equals(EnumC2611c.MAP)) {
                    if (!this.f8712u.m33001au().m32390g().judgeOpenDrawLayout()) {
                        return;
                    }
                    this.f8712u.mo32909a(C2104d.EnumC2105a.OPENDRAWCONTROL);
                    return;
                }
                int i = 4000;
                if (a().mo34433b() != null && a().mo34433b().isShowing()) {
                    return;
                }
                if (this.f8657aG == EnumC2613e.Live) {
                    m31116J();
                    return;
                }
                a().mo34440a();
                if (a().mo34433b() != null) {
                    a().mo34433b().setCancelable(false);
                }
                switch (this.f8657aG) {
                    case Record:
                        if (this.f8638A.g() != AbstractC1794c.EnumC1804a.Recoding) {
                            this.f8638A.m33986x().mo34004f();
                            break;
                        } else {
                            this.f8638A.m33986x().mo34003g();
                            this.f8693b.sendEmptyMessageDelayed(2, 2000L);
                            break;
                        }
                    case ContinueCapture:
                        if (this.f8638A.g() != AbstractC1794c.EnumC1804a.ContinueCapturing) {
                            Log.d("Good", "开始连拍");
                            this.f8638A.m33986x().mo34005e();
                            break;
                        } else {
                            Log.d("Good", "连拍中--》停止连拍");
                            i = 13000;
                            this.f8668aa = true;
                            m31087b(false);
                            this.f8638A.m33986x().mo34006d();
                            break;
                        }
                    case TakePhoto:
                        if (C1831e.f4907cA.equals(this.f8638A.j().getImage_format())) {
                            i = 10000;
                        }
                        this.f8638A.m33986x().mo34007c();
                        break;
                }
                this.f8693b.removeMessages(7);
                this.f8693b.sendEmptyMessageDelayed(7, i);
                return;
            case C1704R.C1706id.locationbutton /* 2131756233 */:
                if (this.f8717z.equals(EnumC2611c.MAP)) {
                    if (this.f8653aC == null) {
                        return;
                    }
                    this.f8653aC.m33225d();
                    return;
                }
                m31094a(false);
                this.f8643F.m30966m();
                Intent intent = new Intent();
                intent.setClass(getActivity(), DroneMediaTabActivity.class);
                getActivity().startActivityForResult(intent, 1000);
                return;
            case C1704R.C1706id.left_pause_btn /* 2131756238 */:
                C2523d.m31374a(this.f8712u).m31367d();
                return;
            case C1704R.C1706id.right_pause_btn /* 2131756239 */:
                if (getString(C1704R.C1707string.actionpause).equals(this.f8673af.getText().toString())) {
                    C2523d.m31374a(this.f8712u).m31363f();
                    return;
                } else {
                    C2523d.m31374a(this.f8712u).m31365e();
                    return;
                }
            default:
                return;
        }
    }

    @Override // android.support.p001v4.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f8659aI = C1882h.m33763a(getActivity());
    }

    @Override // com.fimi.kernel.BaseFragment, android.support.p001v4.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(C1704R.layout.showdroncontral, (ViewGroup) null);
        this.f8714w = (PercentRelativeLayout) inflate.findViewById(C1704R.C1706id.showui);
        this.f8655aE = new DroneFilghtState();
        this.f8680am = (ImageButton) inflate.findViewById(C1704R.C1706id.cameraMenuButton);
        this.f8680am.setOnClickListener(new View.OnClickListener() { // from class: com.fimi.soul.module.droneFragment.ShowDroneUiFragment.7
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                ShowDroneUiFragment.this.m31031x();
            }
        });
        this.f8708q = (RelativeLayout) inflate.findViewById(C1704R.C1706id.gimal_angle_rl);
        this.f8709r = (RelativeLayout) inflate.findViewById(C1704R.C1706id.electivity_rl);
        this.f8704m = (TextView) inflate.findViewById(C1704R.C1706id.gimal_angle_tv);
        this.f8706o = (TextView) inflate.findViewById(C1704R.C1706id.gimal_angle_label_tv);
        this.f8705n = (TextView) inflate.findViewById(C1704R.C1706id.electivity_tv);
        this.f8707p = (TextView) inflate.findViewById(C1704R.C1706id.electivity_lable_tv);
        m31035t();
        View findViewById = inflate.findViewById(C1704R.C1706id.view_camera);
        this.f8643F = new View$OnTouchListenerC2622b(getActivity(), findViewById);
        findViewById.setOnClickListener(this);
        findViewById.setOnTouchListener(this);
        this.f8715x = (ImageView) this.f8714w.findViewById(C1704R.C1706id.leftbg);
        this.f8716y = (ImageView) this.f8714w.findViewById(C1704R.C1706id.rghtbg);
        this.f8695d = (SectorProgressBar) this.f8714w.findViewById(C1704R.C1706id.spb_leftTop);
        this.f8695d.setSectorProgressBarType(SectorProgressBar.EnumC2567a.LeftTop);
        this.f8696e = (SectorProgressBar) this.f8714w.findViewById(C1704R.C1706id.spb_leftBottom);
        this.f8696e.setSectorProgressBarType(SectorProgressBar.EnumC2567a.LeftBottom);
        this.f8697f = (SectorProgressBar) this.f8714w.findViewById(C1704R.C1706id.spb_rightTop);
        if (ShowDroneStatusFragment.f8493f > 30 || ShowDroneStatusFragment.f8493f == 0) {
            this.f8697f.setSectorProgressBarType(SectorProgressBar.EnumC2567a.RightTop);
        } else {
            this.f8697f.setSectorProgressBarType(SectorProgressBar.EnumC2567a.RightToplow);
        }
        this.f8698g = (SectorProgressBar) this.f8714w.findViewById(C1704R.C1706id.spb_rightBottom);
        this.f8698g.setSectorProgressBarType(SectorProgressBar.EnumC2567a.RightBottom);
        this.f8674ag = (PercentRelativeLayout) this.f8714w.findViewById(C1704R.C1706id.status_action_vg);
        this.f8672ae = (Button) this.f8714w.findViewById(C1704R.C1706id.left_pause_btn);
        this.f8673af = (Button) this.f8714w.findViewById(C1704R.C1706id.right_pause_btn);
        C3103au.m29232a(getActivity().getAssets(), this.f8672ae, this.f8673af, this.f8705n, this.f8707p, this.f8706o, this.f8704m);
        this.f8699h = (ImageButton) this.f8714w.findViewById(C1704R.C1706id.camerButton);
        this.f8703l = (ImageButton) this.f8714w.findViewById(C1704R.C1706id.cameraButton_1080);
        this.f8710s = this.f8714w.findViewById(C1704R.C1706id.camerdived);
        this.f8700i = (ImageButton) this.f8714w.findViewById(C1704R.C1706id.setttingbutton);
        this.f8701j = (ImageButton) this.f8714w.findViewById(C1704R.C1706id.rightcenterbutton);
        this.f8702k = (ImageButton) this.f8714w.findViewById(C1704R.C1706id.locationbutton);
        for (View view : new View[]{this.f8699h, this.f8703l, this.f8700i, this.f8701j, this.f8702k, this.f8672ae, this.f8673af}) {
            view.setOnClickListener(this);
        }
        this.f8639B = (UpDownSliding) this.f8714w.findViewById(C1704R.C1706id.up_down_slid);
        if (this.f8639B.getCurrentState() == UpDownSliding.EnumC3201b.Record) {
            m31100a(EnumC2613e.Record);
        } else if (this.f8639B.getCurrentState() == UpDownSliding.EnumC3201b.TakePhoto) {
            m31100a(EnumC2613e.TakePhoto);
        } else if (this.f8639B.getCurrentState() == UpDownSliding.EnumC3201b.Live) {
            m31100a(EnumC2613e.Live);
        }
        this.f8639B.setOnUpDownSliding(new UpDownSliding.AbstractC3202c() { // from class: com.fimi.soul.module.droneFragment.ShowDroneUiFragment.8
            @Override // com.fimi.soul.view.UpDownSliding.AbstractC3202c
            /* renamed from: a */
            public void mo28768a(UpDownSliding.EnumC3201b enumC3201b) {
                Log.i("ljh", "current mode : " + enumC3201b);
                if (enumC3201b == UpDownSliding.EnumC3201b.TakePhoto) {
                    ShowDroneUiFragment.this.m31100a(EnumC2613e.TakePhoto);
                } else if (enumC3201b == UpDownSliding.EnumC3201b.Live) {
                    ShowDroneUiFragment.this.m31100a(EnumC2613e.Live);
                } else if (enumC3201b == UpDownSliding.EnumC3201b.Record) {
                    ShowDroneUiFragment.this.m31100a(EnumC2613e.Record);
                }
                ShowDroneUiFragment.this.m31112N();
                if (ShowDroneUiFragment.this.f8644G != null) {
                    ShowDroneStatusLineFragment unused = ShowDroneUiFragment.this.f8644G;
                    if (!ShowDroneStatusLineFragment.f8575a || !ShowDroneUiFragment.this.f8712u.mo32904af()) {
                        return;
                    }
                    EnumC2613e enumC2613e = ShowDroneUiFragment.this.f8657aG;
                    EnumC2613e unused2 = ShowDroneUiFragment.this.f8657aG;
                    if (enumC2613e == EnumC2613e.Record) {
                        if (ShowDroneUiFragment.this.f8644G.m31160a() != 0) {
                            return;
                        }
                        ShowDroneUiFragment.this.f8644G.m31151a(ShowDroneUiFragment.this.getString(C1704R.C1707string.tf_normal));
                        return;
                    }
                    EnumC2613e enumC2613e2 = ShowDroneUiFragment.this.f8657aG;
                    EnumC2613e unused3 = ShowDroneUiFragment.this.f8657aG;
                    if (enumC2613e2 == EnumC2613e.ContinueCapture) {
                        ShowDroneUiFragment.this.f8644G.m31151a("0张");
                        return;
                    }
                    if (ShowDroneUiFragment.this.f8657aG != EnumC2613e.TakePhoto || ShowDroneUiFragment.this.f8644G.m31160a() == 0) {
                    }
                }
            }
        });
        this.f8664aO = getString(C1704R.C1707string.tf_normal);
        m31063f();
        this.f8689av = ViewConfiguration.get(this.f8711t).getScaledTouchSlop();
        return inflate;
    }

    @Override // android.support.p001v4.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        this.f8712u.mo32903b(this);
        this.f8669ab = true;
        this.f8695d.m31212b();
        this.f8696e.m31212b();
        this.f8697f.m31212b();
        this.f8698g.m31212b();
        this.f8640C.m6437a();
        if (this.f8670ac != null) {
            this.f8670ac.cancel();
        }
    }

    @Override // com.fimi.soul.drone.C2104d.AbstractC2106b
    public void onDroneEvent(C2104d.EnumC2105a enumC2105a, C2083a c2083a) {
        if (enumC2105a == C2104d.EnumC2105a.Show9Grid) {
            if (this.f8643F != null && this.f8717z == EnumC2611c.CAMER) {
                this.f8643F.m30971h();
            }
        } else if (enumC2105a == C2104d.EnumC2105a.hide9Grid && this.f8643F != null) {
            this.f8643F.m30970i();
        }
        if (!c2083a.mo32905ac() || !c2083a.mo32906ab().mo32588a()) {
            m31067e(enumC2105a, c2083a);
        } else {
            m31103a(enumC2105a, c2083a);
        }
        if (c2083a.mo32904af()) {
            m31083c(enumC2105a, c2083a);
        } else {
            m31075d(enumC2105a, c2083a);
            m31067e(enumC2105a, c2083a);
        }
        switch (enumC2105a) {
            case EMERGENCY:
                if (!C1772d.m34208a().m34187k()) {
                    return;
                }
                m31078d();
                return;
            case NEWFRONEMODEL:
                if (this.f8655aE == null || !this.f8655aE.isFilghtPhaseFinish(c2083a.m33001au().m32395b())) {
                    return;
                }
                m31070e();
                return;
            case DISCONNECTVIDEO:
                if (this.f8643F == null) {
                    return;
                }
                this.f8643F.m30963p();
                return;
            default:
                return;
        }
    }

    @Override // android.support.p001v4.app.Fragment
    public void onResume() {
        super.onResume();
        this.f8639B.m28776b(getActivity());
        boolean m34187k = C1772d.m34208a().m34187k();
        if (m34187k != C1772d.m34208a().m34187k() && m34187k) {
            this.f8657aG = EnumC2613e.TakePhoto;
        }
        this.f8638A.c(true);
        if (!this.f8646Q) {
            this.f8693b.sendEmptyMessage(8);
        }
        m31063f();
    }

    @Override // android.support.p001v4.app.Fragment
    public void onStart() {
        super.onStart();
        if (this.f8653aC == null) {
            this.f8653aC = C2018a.m33233a();
            this.f8653aC.m33231a(this.f8702k, this.f8712u);
        }
        this.f8676ai = false;
        this.f8675ah = false;
        this.f8712u.mo32908a(this);
        this.f8638A.a((AbstractC1794c.AbstractC1807d) this);
        this.f8638A.a((AbstractC1792f<X11RespCmd>) this);
        if (!this.f8638A.e() && this.f8712u.mo32904af()) {
            this.f8638A.m33987w().m33996b();
        }
        if (this.f8638A.e()) {
            this.f8638A.m33989u().m34052b();
        }
        this.f8643F.m30967l();
        m31094a(true);
        this.f8693b.sendEmptyMessageDelayed(2, 2000L);
        this.f8677aj = C1772d.m34208a().m34187k();
    }

    @Override // android.support.p001v4.app.Fragment
    public void onStop() {
        super.onStop();
        this.f8643F.m30968k();
        m31094a(false);
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        switch (motionEvent.getAction() & 255) {
            case 0:
                this.f8682ao = false;
                this.f8683ap = true;
                this.f8651aA = false;
                this.f8684aq = 1;
                this.f8687at = 0.0f;
                this.f8688au = 0.0f;
                this.f8685ar = 0.0f;
                this.f8686as = 0.0f;
                break;
            case 1:
                if (!this.f8682ao && !this.f8641D) {
                    float abs = Math.abs(this.f8685ar) - Math.abs(this.f8687at);
                    float abs2 = Math.abs(this.f8686as) - Math.abs(this.f8688au);
                    if (Math.sqrt(Math.pow(abs, 2.0d) + Math.pow(abs2, 2.0d)) > this.f8689av * 10) {
                        if (Math.abs(abs) <= Math.abs(abs2)) {
                            abs = abs2;
                        }
                        if (abs <= 0.0f) {
                            this.f8712u.mo32909a(C2104d.EnumC2105a.HIDE_FULL_SCREEN);
                        } else if (this.f8712u.mo32904af()) {
                            this.f8712u.mo32909a(C2104d.EnumC2105a.SHOW_FULL_SCREEN);
                        }
                    }
                    this.f8684aq = 0;
                    if (this.f8651aA) {
                        return true;
                    }
                }
                break;
            case 2:
                if (this.f8684aq == 2) {
                    if (this.f8683ap) {
                        this.f8687at = motionEvent.getX(1) - motionEvent.getX(0);
                        this.f8688au = motionEvent.getY(1) - motionEvent.getY(0);
                        this.f8683ap = false;
                    }
                    this.f8685ar = motionEvent.getX(1) - motionEvent.getX(0);
                    this.f8686as = motionEvent.getY(1) - motionEvent.getY(0);
                    break;
                }
                break;
            case 3:
                this.f8682ao = true;
                break;
            case 5:
                this.f8684aq++;
                if (this.f8684aq > 1) {
                    this.f8651aA = true;
                    break;
                }
                break;
            case 6:
                this.f8684aq--;
                break;
        }
        return false;
    }

    @Override // android.support.p001v4.app.Fragment
    public void onViewCreated(View view, @Nullable Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f8643F.m30980c();
        m31055i();
    }

    /* renamed from: p */
    public void m31041p() {
        this.f8643F.m30961r();
    }

    /* renamed from: q */
    public boolean m31039q() {
        return this.f8717z.equals(EnumC2611c.MAP);
    }

    /* renamed from: r */
    public void m31037r() {
        ((FlightActivity) getActivity()).m30487g();
        m31124B();
        this.f8643F.m30982b((String) null);
        m31108a(C1704R.C1707string.tf_normal);
        this.f8666aQ = CameraMountState.MOUNT;
        m31035t();
        if (this.f8645H != null) {
            this.f8645H.m31190a();
        }
        this.f8643F.m30984b(this.f8666aQ);
    }

    /* renamed from: s */
    public void m31036s() {
        m31030y();
        this.f8638A.a(AbstractC1794c.EnumC1804a.Normal);
        m31094a(false);
        m31112N();
        m31049l();
        this.f8643F.m30982b(getString(C1704R.C1707string.fault_camera));
        this.f8643F.m30993a(CameraMountState.DISMOUNT);
        this.f8666aQ = CameraMountState.DISMOUNT;
        m31035t();
        if (this.f8645H != null) {
            this.f8645H.m31181b();
        }
        this.f8643F.m30984b(this.f8666aQ);
    }

    /* renamed from: t */
    public void m31035t() {
        if (!C1772d.m34208a().m34187k() || !this.f8712u.mo32905ac() || this.f8666aQ != CameraMountState.MOUNT || this.f8717z != EnumC2611c.CAMER) {
            this.f8680am.setClickable(false);
            this.f8680am.setAlpha((int) (0.5f * 255.0f));
            return;
        }
        this.f8680am.setClickable(true);
        this.f8680am.setAlpha(255);
    }

    /* renamed from: u */
    public boolean m31034u() {
        C3128l c3128l = new C3128l(C1756a.f4541ag);
        c3128l.start();
        try {
            c3128l.join(500L);
        } catch (Exception e) {
        }
        return c3128l.m29072a() != null;
    }

    /* renamed from: v */
    public void m31033v() {
        this.f8643F.m30960s();
        this.f8638A.a((AbstractC1790d) null);
        this.f8638A.r();
    }

    /* renamed from: w */
    public void m31032w() {
        this.f8638A.m33989u().m34052b();
    }

    /* renamed from: x */
    public void m31031x() {
        ((FlightActivity) getActivity()).m30487g();
        if (this.f8638A.e()) {
            this.f8638A.m33989u().m34052b();
        }
        C3022b c3022b = (C3022b) C1642c.m34887c().mo34880a(C3029b.f11258C, C3022b.class);
        if (c3022b == null) {
            c3022b = new C3022b();
        }
        if (c3022b != null && c3022b.m29580m() > 0 && c3022b.m29580m() < 1063 && this.f8666aQ == CameraMountState.MOUNT) {
            C1688z.m34447a(this.f8711t, this.f8711t.getString(C1704R.C1707string.camera_menu_update_tip), C1688z.f4191b);
            return;
        }
        this.f8654aD = ((FlightActivity) getActivity()).m30489f();
        this.f8681an = new View$OnClickListenerC2474e(getActivity(), this.f8667aR, this.f8654aD);
        this.f8681an.m31538b(new String[]{this.f8638A.j().getAe_bias(), this.f8638A.j().getSaturation(), this.f8638A.j().getContrast(), this.f8638A.j().getSharpness(), this.f8638A.j().getAwb()});
    }

    /* renamed from: y */
    public void m31030y() {
        if (this.f8681an != null) {
            this.f8681an.m31539b();
        }
    }

    /* renamed from: z */
    public void m31029z() {
        m31030y();
    }
}
