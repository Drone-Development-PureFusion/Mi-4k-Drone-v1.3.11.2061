package com.fimi.soul.module.login;

import android.animation.ValueAnimator;
import android.annotation.TargetApi;
import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.p001v4.view.PagerAdapter;
import android.support.p001v4.view.ViewPager;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.fimi.kernel.C1642c;
import com.fimi.kernel.utils.C1681v;
import com.fimi.kernel.utils.C1685x;
import com.fimi.kernel.utils.C1688z;
import com.fimi.kernel.view.percent.PercentLinearLayout;
import com.fimi.kernel.view.progress.ProgressView;
import com.fimi.overseas.soul.C1704R;
import com.fimi.p140a.AbstractC1493b;
import com.fimi.p140a.C1500d;
import com.fimi.p140a.C1504e;
import com.fimi.p140a.C1514f;
import com.fimi.p140a.p142b.EnumC1494a;
import com.fimi.p140a.p142b.EnumC1495b;
import com.fimi.p140a.p143c.AbstractC1497a;
import com.fimi.p140a.p143c.AbstractC1498b;
import com.fimi.p140a.p143c.AbstractC1499c;
import com.fimi.p148c.AbstractC1522a;
import com.fimi.p152e.C1543b;
import com.fimi.p152e.C1549d;
import com.fimi.p153f.C1552b;
import com.fimi.soul.base.C1756a;
import com.fimi.soul.biz.camera.C1783b;
import com.fimi.soul.biz.camera.C1827d;
import com.fimi.soul.biz.camera.C1831e;
import com.fimi.soul.biz.camera.entity.X11RespCmd;
import com.fimi.soul.biz.camera.p173b.AbstractC1792f;
import com.fimi.soul.biz.p178f.C1845a;
import com.fimi.soul.biz.p179g.C1846a;
import com.fimi.soul.biz.p181i.C1867a;
import com.fimi.soul.biz.p183k.C1903e;
import com.fimi.soul.biz.update.C2046b;
import com.fimi.soul.drone.C2083a;
import com.fimi.soul.drone.C2104d;
import com.fimi.soul.entity.CameraValue;
import com.fimi.soul.module.droneui.FlightActivity;
import com.fimi.soul.module.login.LoginFragment;
import com.fimi.soul.module.login.UsbConnectFragment;
import com.fimi.soul.module.push.MessageDetailActivity;
import com.fimi.soul.module.setting.newhand.NewHandActivity;
import com.fimi.soul.module.update.FindNewFirmwareAvtivity;
import com.fimi.soul.module.update.FindOnlineFirmwareAvtivity;
import com.fimi.soul.module.update.UpdateConnectDefeaFrgment;
import com.fimi.soul.service.QueryDynamicFlyZoneSetvice;
import com.fimi.soul.service.UsbStatus;
import com.fimi.soul.utils.C3103au;
import com.fimi.soul.view.HackyViewPager;
import com.fimi.soul.view.TranslationView;
import com.fimi.x1bh.module.X1bhBaseActivity;
import com.fimi.x1bh.module.main.CloudTerraceMainActivity;
import com.fimi.x1bh.module.update.X1bhFindNewFirmwareAvtivity;
/* loaded from: classes.dex */
public class LoginActivity extends X1bhBaseActivity implements ViewPager.OnPageChangeListener, AbstractC1792f<X11RespCmd>, C2104d.AbstractC2106b, LoginFragment.AbstractC2800a, UsbConnectFragment.AbstractC2810a, UpdateConnectDefeaFrgment.AbstractC3008a {

    /* renamed from: H */
    private static final int f9751H = 3;

    /* renamed from: I */
    private static final int f9752I = 4;

    /* renamed from: M */
    private static final int f9753M = 8;

    /* renamed from: U */
    private static final int f9754U = 0;

    /* renamed from: W */
    private static final String f9755W = "LoginActivity";

    /* renamed from: A */
    private ImageView[] f9756A;

    /* renamed from: B */
    private int[] f9757B;

    /* renamed from: C */
    private ViewGroup f9758C;

    /* renamed from: D */
    private ImageView[] f9759D;

    /* renamed from: F */
    private ValueAnimator f9761F;

    /* renamed from: J */
    private boolean f9763J;

    /* renamed from: L */
    private EnumC1495b f9765L;

    /* renamed from: P */
    private ImageView f9768P;

    /* renamed from: Q */
    private C2046b f9769Q;

    /* renamed from: T */
    private AbstractC1497a f9772T;

    /* renamed from: V */
    private AbstractC1498b f9773V;

    /* renamed from: Y */
    private float f9775Y;

    /* renamed from: b */
    C1681v f9778b;

    /* renamed from: d */
    Drawable f9780d;

    /* renamed from: f */
    private UpdateConnectDefeaFrgment f9782f;

    /* renamed from: g */
    private LoginFragment f9783g;

    /* renamed from: h */
    private UsbConnectFragment f9784h;

    /* renamed from: i */
    private ImageView f9785i;

    /* renamed from: j */
    private AnimationDrawable f9786j;

    /* renamed from: k */
    private TranslationView f9787k;

    /* renamed from: l */
    private ProgressView f9788l;

    /* renamed from: m */
    private TextView f9789m;

    /* renamed from: n */
    private TextView f9790n;

    /* renamed from: o */
    private TextView f9791o;

    /* renamed from: p */
    private TextView f9792p;

    /* renamed from: q */
    private ImageView f9793q;

    /* renamed from: r */
    private TextView f9794r;

    /* renamed from: s */
    private TextView f9795s;

    /* renamed from: t */
    private TextView f9796t;

    /* renamed from: u */
    private ImageView f9797u;

    /* renamed from: v */
    private ProgressBar f9798v;

    /* renamed from: w */
    private RelativeLayout f9799w;

    /* renamed from: x */
    private ImageView f9800x;

    /* renamed from: y */
    private ImageView f9801y;

    /* renamed from: z */
    private HackyViewPager f9802z;

    /* renamed from: E */
    private final int f9760E = 600;

    /* renamed from: G */
    private int f9762G = 0;

    /* renamed from: a */
    boolean f9777a = true;

    /* renamed from: K */
    private boolean f9764K = false;

    /* renamed from: N */
    private boolean f9766N = false;

    /* renamed from: O */
    private boolean f9767O = false;

    /* renamed from: R */
    private int f9770R = 0;

    /* renamed from: S */
    private boolean f9771S = false;

    /* renamed from: c */
    public Handler f9779c = new Handler() { // from class: com.fimi.soul.module.login.LoginActivity.1
        @Override // android.os.Handler
        @TargetApi(16)
        public void handleMessage(Message message) {
            super.handleMessage(message);
            switch (message.what) {
                case 3:
                    LoginActivity.this.m30275a(false);
                    return;
                case 4:
                    if (LoginActivity.this.f9785i == null) {
                        return;
                    }
                    LoginActivity.this.f9785i.setBackground(LoginActivity.this.f9780d);
                    return;
                default:
                    return;
            }
        }
    };

    /* renamed from: X */
    private Runnable f9774X = new Runnable() { // from class: com.fimi.soul.module.login.LoginActivity.5
        @Override // java.lang.Runnable
        public void run() {
            if (LoginActivity.this.f9784h.isAdded() || LoginActivity.this.isFinishing()) {
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putBoolean("isEnterLoginFragment", true);
            LoginActivity.this.f9784h.setArguments(bundle);
            LoginActivity.this.m30242z();
            LoginActivity.this.getFragmentManager().beginTransaction().replace(C1704R.C1706id.main_layout, LoginActivity.this.f9784h).commitAllowingStateLoss();
        }
    };

    /* renamed from: e */
    public AbstractC1499c f9781e = new AbstractC1499c() { // from class: com.fimi.soul.module.login.LoginActivity.7
        @Override // com.fimi.p140a.p143c.AbstractC1499c
        /* renamed from: a */
        public void mo30241a(float f) {
            float f2 = 600.0f;
            if (f == 200.0f) {
                Log.d("moweiru", "progress:" + f);
                LoginActivity.this.f9772T.mo28263g();
            }
            float currentCount = f < 390.0f ? LoginActivity.this.f9788l.getCurrentCount() + LoginActivity.this.f9775Y : 200.0f + f;
            if (currentCount <= 600.0f) {
                f2 = currentCount;
            }
            LoginActivity.this.f9788l.setCurrentCount(f2);
        }

        @Override // com.fimi.p140a.p143c.AbstractC1499c
        /* renamed from: a */
        public void mo30240a(EnumC1494a enumC1494a) {
            if (LoginActivity.this.f9772T != null) {
                LoginActivity.this.f9772T.mo28270d();
                LoginActivity.this.f9772T = null;
            }
            if (C1514f.m35431a().m35429b() == EnumC1495b.X1BH && ((C1827d) C1783b.m34166a().m34150d()).f() == -3) {
                LoginActivity.this.m30282a(C1704R.C1707string.rc_tip_error_x1bh_occupied, C1704R.C1707string.unconnetremote_x1bh);
                return;
            }
            LoginActivity.this.m30283a(1);
            switch (C27978.f9810a[enumC1494a.ordinal()]) {
                case 1:
                    LoginActivity.this.m30277a(FindOnlineFirmwareAvtivity.class);
                    return;
                case 2:
                    if (C1514f.m35431a().m35429b() == EnumC1495b.DRONE) {
                        LoginActivity.this.m30277a(FindNewFirmwareAvtivity.class);
                        return;
                    } else if (C1514f.m35431a().m35429b() != EnumC1495b.X1BH) {
                        return;
                    } else {
                        LoginActivity.this.m30277a(X1bhFindNewFirmwareAvtivity.class);
                        return;
                    }
                case 3:
                    if (C1514f.m35431a().m35429b() == EnumC1495b.DRONE) {
                        LoginActivity.this.m30277a(FlightActivity.class);
                        return;
                    } else if (C1514f.m35431a().m35429b() != EnumC1495b.X1BH) {
                        return;
                    } else {
                        LoginActivity.this.m30277a(CloudTerraceMainActivity.class);
                        return;
                    }
                case 4:
                    LoginActivity.this.dpa.m34274d();
                    return;
                default:
                    return;
            }
        }

        @Override // com.fimi.p140a.p143c.AbstractC1499c
        /* renamed from: a */
        public void mo30239a(String str, String str2) {
            LoginActivity.this.f9772T = null;
            LoginActivity.this.m30276a(str, str2);
        }
    };

    /* renamed from: Z */
    private int f9776Z = 0;

    /* renamed from: com.fimi.soul.module.login.LoginActivity$8 */
    /* loaded from: classes.dex */
    static /* synthetic */ class C27978 {

        /* renamed from: a */
        static final /* synthetic */ int[] f9810a = new int[EnumC1494a.values().length];

        static {
            try {
                f9810a[EnumC1494a.FIND_ONLINE_FIRMWARE.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
            }
            try {
                f9810a[EnumC1494a.FIND_NEW_FIRMWARE.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
            }
            try {
                f9810a[EnumC1494a.FLIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError e3) {
            }
            try {
                f9810a[EnumC1494a.SETTING.ordinal()] = 4;
            } catch (NoSuchFieldError e4) {
            }
        }
    }

    /* loaded from: classes.dex */
    public class MyAdapter extends PagerAdapter {
        public MyAdapter() {
        }

        @Override // android.support.p001v4.view.PagerAdapter
        public void destroyItem(View view, int i, Object obj) {
        }

        @Override // android.support.p001v4.view.PagerAdapter
        public int getCount() {
            return LoginActivity.this.f9756A.length;
        }

        @Override // android.support.p001v4.view.PagerAdapter
        public Object instantiateItem(View view, int i) {
            try {
                ((HackyViewPager) view).addView(LoginActivity.this.f9756A[i % LoginActivity.this.f9756A.length], 0);
            } catch (Exception e) {
            }
            return LoginActivity.this.f9756A[i % LoginActivity.this.f9756A.length];
        }

        @Override // android.support.p001v4.view.PagerAdapter
        public boolean isViewFromObject(View view, Object obj) {
            return view == obj;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m30276a(String str, String str2) {
        boolean m30248t = m30248t();
        if (this.f9782f == null) {
            this.f9782f = new UpdateConnectDefeaFrgment();
        }
        if (this.f9767O) {
            return;
        }
        if (m30248t) {
            getFragmentManager().beginTransaction().show(this.f9782f);
        } else {
            getFragmentManager().beginTransaction().add(C1704R.C1706id.main_layout, this.f9782f).commitAllowingStateLoss();
        }
        this.f9782f.m29685a(str);
        this.f9782f.m29683b(str2);
        this.f9782f.m29681c(getString(C1704R.C1707string.no_connect));
        this.f9782f.m29680c(false);
        this.f9782f.m29684a(false);
        getFragmentManager().beginTransaction().setCustomAnimations(17432576, 17432577);
    }

    /* renamed from: b */
    private void m30271b(Class<?> cls) {
        startActivity(new Intent(this, cls));
        overridePendingTransition(17432576, 17432577);
    }

    /* renamed from: b */
    private void m30270b(boolean z) {
        Log.d(f9755W, "showUsbConnecting: " + z);
        this.f9799w.setVisibility(z ? 0 : 8);
    }

    /* renamed from: c */
    private void m30269c(int i) {
        for (int i2 = 0; i2 < this.f9759D.length; i2++) {
            if (i2 == i) {
                this.f9759D[i2].setBackgroundResource(C1704R.C1705drawable.page_indicator_focused);
            } else {
                this.f9759D[i2].setBackgroundResource(C1704R.C1705drawable.page_indicator_unfocused);
            }
        }
    }

    /* renamed from: c */
    private void m30267c(boolean z) {
        Bundle bundle = new Bundle();
        bundle.putBoolean("isenterLoginFragment", z);
        this.f9784h.setArguments(bundle);
        m30242z();
        getFragmentManager().beginTransaction().replace(C1704R.C1706id.main_layout, this.f9784h).commit();
    }

    /* renamed from: d */
    private void m30265d(boolean z) {
        int i = 0;
        this.f9790n.setVisibility(z ? 0 : 8);
        ProgressView progressView = this.f9788l;
        if (!z) {
            i = 8;
        }
        progressView.setVisibility(i);
    }

    /* renamed from: p */
    private void m30252p() {
        this.f9768P = (ImageView) findViewById(C1704R.C1706id.login_mask_iv);
        this.f9787k = (TranslationView) findViewById(C1704R.C1706id.translationview);
        this.f9783g = new LoginFragment();
        this.f9784h = new UsbConnectFragment();
        this.f9761F = ValueAnimator.ofFloat(0.0f, 200.0f);
        this.f9761F.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.fimi.soul.module.login.LoginActivity.2
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                LoginActivity.this.f9788l.setCurrentCount(((Float) valueAnimator.getAnimatedValue()).floatValue());
            }
        });
        m30246v();
        this.f9788l = (ProgressView) findViewById(C1704R.C1706id.checkFirmwareprogress);
        this.f9789m = (TextView) findViewById(C1704R.C1706id.tv_x1bh_camera_hint);
        this.f9789m.setVisibility(8);
        this.f9788l.setMaxCount(600.0f);
        this.f9790n = (TextView) findViewById(C1704R.C1706id.checking_hard_tv);
        C3103au.m29232a(getAssets(), this.f9790n, this.f9789m);
        m30251q();
        m30250r();
        m30284a();
    }

    /* renamed from: q */
    private void m30251q() {
        int m34499r = C1642c.m34885e().m34499r();
        this.f9758C = (ViewGroup) findViewById(C1704R.C1706id.viewGroup);
        this.f9802z = (HackyViewPager) findViewById(C1704R.C1706id.view_pager);
        this.f9800x = (ImageView) findViewById(C1704R.C1706id.iv_right_slide);
        this.f9801y = (ImageView) findViewById(C1704R.C1706id.iv_left_slide);
        this.f9757B = new int[]{C1704R.C1705drawable.select_device_flight, C1704R.C1705drawable.select_device_cloud};
        this.f9759D = new ImageView[this.f9757B.length];
        for (int i = 0; i < this.f9759D.length; i++) {
            ImageView imageView = new ImageView(this);
            imageView.setLayoutParams(new PercentLinearLayout.LayoutParams(10, 10));
            this.f9759D[i] = imageView;
            if (i == 0) {
                this.f9759D[i].setBackgroundResource(C1704R.C1705drawable.page_indicator_focused);
            } else {
                this.f9759D[i].setBackgroundResource(C1704R.C1705drawable.page_indicator_unfocused);
            }
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(new ViewGroup.LayoutParams(-2, -2));
            layoutParams.leftMargin = 5;
            layoutParams.rightMargin = 5;
            this.f9758C.addView(imageView, layoutParams);
        }
        this.f9756A = new ImageView[this.f9757B.length];
        for (int i2 = 0; i2 < this.f9756A.length; i2++) {
            ImageView imageView2 = new ImageView(this);
            this.f9756A[i2] = imageView2;
            imageView2.setBackgroundResource(this.f9757B[i2]);
        }
        this.f9802z.setAdapter(new MyAdapter());
        this.f9802z.setOnPageChangeListener(this);
        this.f9802z.setCurrentItem(m34499r, false);
        this.f9802z.setOverScrollMode(2);
    }

    /* renamed from: r */
    private void m30250r() {
        switch (getIntent().getExtras().getInt(AbstractC1493b.f3577j, 4)) {
            case 2:
                C1514f.m35431a().m35430a(EnumC1495b.DRONE);
                this.f9802z.setVisibility(0);
                this.f9758C.setVisibility(0);
                this.f9801y.setVisibility(0);
                this.f9800x.setVisibility(0);
                this.f9802z.setCurrentItem(0);
                m30267c(true);
                getWindow().setFlags(128, 128);
                m30273b(0);
                return;
            case 3:
                C1514f.m35431a().m35430a(EnumC1495b.X1BH);
                this.f9802z.setVisibility(0);
                this.f9758C.setVisibility(0);
                this.f9801y.setVisibility(0);
                this.f9800x.setVisibility(0);
                this.f9802z.setCurrentItem(1);
                m30267c(true);
                getWindow().setFlags(128, 128);
                m30273b(1);
                return;
            case 4:
                ((ViewStub) findViewById(C1704R.C1706id.login_animation_vs)).inflate();
                this.f9785i = (ImageView) findViewById(C1704R.C1706id.login_animation_iv);
                this.f9785i.setVisibility(0);
                m30283a(0);
                getFragmentManager().beginTransaction().replace(C1704R.C1706id.main_layout, this.f9783g).commit();
                this.f9768P.setAlpha(0.0f);
                this.f9802z.setVisibility(8);
                this.f9758C.setVisibility(8);
                this.f9801y.setVisibility(8);
                this.f9800x.setVisibility(8);
                return;
            default:
                return;
        }
    }

    /* renamed from: s */
    private void m30249s() {
        switch (getIntent().getExtras().getInt(AbstractC1493b.f3577j, 4)) {
            case 2:
                C1514f.m35431a().m35430a(EnumC1495b.DRONE);
                this.f9787k.setVisibility(0);
                this.f9787k.m28854a();
                m30267c(true);
                getWindow().setFlags(128, 128);
                this.f9768P.setAlpha(1.0f);
                return;
            case 3:
                C1514f.m35431a().m35430a(EnumC1495b.X1BH);
                this.f9787k.setVisibility(0);
                this.f9787k.m28854a();
                m30267c(true);
                getWindow().setFlags(128, 128);
                this.f9768P.setAlpha(1.0f);
                return;
            case 4:
                ((ViewStub) findViewById(C1704R.C1706id.login_animation_vs)).inflate();
                this.f9785i = (ImageView) findViewById(C1704R.C1706id.login_animation_iv);
                this.f9785i.setVisibility(0);
                m30283a(0);
                getFragmentManager().beginTransaction().replace(C1704R.C1706id.main_layout, this.f9783g).commit();
                this.f9768P.setAlpha(0.0f);
                return;
            default:
                return;
        }
    }

    /* renamed from: t */
    private boolean m30248t() {
        try {
            this.f9782f = (UpdateConnectDefeaFrgment) getFragmentManager().findFragmentById(C1704R.C1706id.main_layout);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return this.f9782f != null;
    }

    /* renamed from: u */
    private void m30247u() {
        C1867a.m33847a().m33841a(getLocalClassName());
        this.dpa.m34274d();
        this.dpa.m34276b(this);
        startService(new Intent(this, UsbStatus.class));
        if (getIntent().getBooleanExtra("islaunchexit", false)) {
            this.f9769Q = new C2046b(this);
            this.f9769Q.m33131a(false);
        }
        this.f9778b = C1681v.m34543a(this);
        this.f9766N = this.f9778b.m34546a().getBoolean(C1756a.f4519L, false);
        this.drone.mo32908a(this);
        this.f9770R = getIntent().getIntExtra("sp_upgrade_skip", 0);
        Bundle bundleExtra = getIntent().getBundleExtra("launchBundle");
        if (bundleExtra != null) {
            Intent intent = new Intent(this, MessageDetailActivity.class);
            intent.putExtra("redirectURL", bundleExtra.getString("redirectURL"));
            startActivity(intent);
        }
        ((C1827d) C1783b.m34166a().m34150d()).a(this);
    }

    /* renamed from: v */
    private void m30246v() {
        this.f9799w = (RelativeLayout) findViewById(C1704R.C1706id.usb_connecting_rl);
        this.f9791o = (TextView) findViewById(C1704R.C1706id.connecting_return_height_title_tv);
        this.f9792p = (TextView) findViewById(C1704R.C1706id.connecting_return_height_content_tv);
        this.f9793q = (ImageView) findViewById(C1704R.C1706id.connecting_return_height_iv);
        this.f9794r = (TextView) findViewById(C1704R.C1706id.connecting_emergency_stop_blade_title_tv);
        this.f9795s = (TextView) findViewById(C1704R.C1706id.connecting_emergency_stop_blade_content_tv);
        this.f9796t = (TextView) findViewById(C1704R.C1706id.connecting_emergency_stop_blade_content_child_tv);
        this.f9797u = (ImageView) findViewById(C1704R.C1706id.cloud_connecting_iv);
        this.f9798v = (ProgressBar) findViewById(C1704R.C1706id.cloud_connecting_pb);
        C3103au.m29232a(getAssets(), this.f9791o, this.f9792p, this.f9794r, this.f9795s, this.f9796t);
    }

    /* renamed from: w */
    private void m30245w() {
        int i = 0;
        if (C1514f.m35431a().m35429b() != EnumC1495b.DRONE) {
            this.f9799w.setBackgroundResource(C1704R.C1705drawable.check_connect_bg);
            this.f9791o.setVisibility(8);
            this.f9792p.setVisibility(8);
            this.f9793q.setVisibility(8);
            this.f9794r.setVisibility(8);
            this.f9795s.setVisibility(8);
            this.f9796t.setVisibility(8);
            this.f9798v.setVisibility(0);
            this.f9797u.setVisibility(0);
            return;
        }
        boolean z = Math.random() > 0.5d;
        this.f9799w.setBackgroundResource(z ? C1704R.C1705drawable.connect_return_height_bg : C1704R.C1705drawable.connect_emergency_bg);
        this.f9791o.setVisibility(z ? 0 : 8);
        this.f9792p.setVisibility(z ? 0 : 8);
        this.f9793q.setVisibility(z ? 0 : 8);
        this.f9794r.setVisibility(z ? 8 : 0);
        this.f9795s.setVisibility(z ? 8 : 0);
        TextView textView = this.f9796t;
        if (z) {
            i = 8;
        }
        textView.setVisibility(i);
        this.f9798v.setVisibility(8);
        this.f9797u.setVisibility(8);
    }

    /* renamed from: x */
    private void m30244x() {
        if (C1514f.m35431a().m35429b() == EnumC1495b.DRONE) {
            m30271b(FlightActivity.class);
        } else if (C1514f.m35431a().m35429b() != EnumC1495b.X1BH) {
        } else {
            m30271b(CloudTerraceMainActivity.class);
        }
    }

    /* renamed from: y */
    private void m30243y() {
        if (this.f9763J) {
            finish();
            return;
        }
        this.f9763J = true;
        C1688z.m34449a(getApplicationContext(), (int) C1704R.C1707string.again_exit, C1688z.f4191b);
        this.f9779c.sendEmptyMessageDelayed(3, 2000L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: z */
    public void m30242z() {
        if (this.f9784h != null) {
            if (C1514f.m35431a().m35429b() != EnumC1495b.DRONE) {
                this.f9784h.m30226a(true);
            } else {
                this.f9784h.m30226a(false);
            }
        }
    }

    /* renamed from: a */
    public void m30284a() {
        this.f9768P.setBackgroundResource(C1704R.C1705drawable.login_mask);
        C1685x.m34455b(new Runnable() { // from class: com.fimi.soul.module.login.LoginActivity.3
            @Override // java.lang.Runnable
            public void run() {
                if (LoginActivity.this.getIntent().getExtras().getInt(AbstractC1493b.f3577j) == 4) {
                    LoginActivity.this.f9780d = LoginActivity.this.getResources().getDrawable(C1704R.C1705drawable.login_anim);
                    LoginActivity.this.f9786j = (AnimationDrawable) LoginActivity.this.f9780d;
                    LoginActivity.this.f9786j.setOneShot(true);
                    LoginActivity.this.f9779c.sendEmptyMessage(4);
                }
            }
        });
    }

    /* renamed from: a */
    public void m30283a(int i) {
        this.f9776Z = i;
    }

    /* renamed from: a */
    public void m30282a(int i, int i2) {
        m30276a(getString(i), getString(i2));
    }

    /* renamed from: a */
    public void m30277a(Class<?> cls) {
        startActivity(new Intent(this, cls));
        overridePendingTransition(17432576, 17432577);
        if (this.f9773V != null) {
            this.f9773V.mo28246i();
        }
    }

    /* renamed from: a */
    public void m30275a(boolean z) {
        this.f9763J = true;
    }

    @Override // com.fimi.soul.biz.camera.p173b.AbstractC1792f
    /* renamed from: a  reason: avoid collision after fix types in other method */
    public void mo28055a(boolean z, X11RespCmd x11RespCmd) {
        x11RespCmd.getMsg_id();
    }

    @Override // com.fimi.soul.module.login.LoginFragment.AbstractC2800a
    /* renamed from: b */
    public void mo30232b() {
        if (this.f9786j == null) {
            return;
        }
        m30283a(1);
        this.f9786j.stop();
        this.f9786j.start();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.fimi.soul.module.login.LoginActivity.4
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                LoginActivity.this.f9768P.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
            }
        });
        ofFloat.setDuration(720L);
        ofFloat.start();
        getWindow().setFlags(128, 128);
        this.f9779c.postDelayed(this.f9774X, 1100L);
    }

    /* renamed from: b */
    public void m30273b(int i) {
        this.f9773V = null;
        m30283a(1);
        if (i == 0) {
            if (this.f9785i != null) {
                this.f9785i.setVisibility(8);
            }
            m30270b(false);
            getFragmentManager().beginTransaction().replace(C1704R.C1706id.main_layout, this.f9784h).commitAllowingStateLoss();
            C1514f.m35431a().m35430a(EnumC1495b.DRONE);
            C1642c.m34885e().m34529d(0);
            if (this.f9773V == null) {
                this.f9773V = new C1504e(this, this.drone, C1514f.m35431a().m35429b());
            }
            this.f9773V.mo28259a(C1845a.m33920b());
            C1831e.m33977a();
            this.f9761F.setDuration(this.f9773V.mo28256c());
        } else if (i == 1) {
            if (this.f9785i != null) {
                this.f9785i.setVisibility(8);
            }
            C1846a.C1848a.f5025a.m33916a(2);
            m30270b(false);
            getFragmentManager().beginTransaction().replace(C1704R.C1706id.main_layout, this.f9784h).commitAllowingStateLoss();
            C1514f.m35431a().m35430a(EnumC1495b.X1BH);
            C1642c.m34885e().m34529d(1);
            if (this.f9773V == null) {
                this.f9773V = new C1504e(this, this.drone, C1514f.m35431a().m35429b());
            }
            this.f9773V.mo28259a(C1845a.m33920b());
            C1831e.m33977a();
            this.f9761F.setDuration(this.f9773V.mo28256c());
        }
        m30242z();
    }

    @Override // com.fimi.soul.module.login.LoginFragment.AbstractC2800a
    /* renamed from: c */
    public void mo30231c() {
        this.f9771S = true;
        startActivity(new Intent(this, NewHandActivity.class));
        overridePendingTransition(17432576, 17432577);
    }

    @Override // com.fimi.soul.module.login.LoginFragment.AbstractC2800a
    /* renamed from: d */
    public void mo30230d() {
        if (C1642c.m34885e().m34499r() == 0) {
            m30273b(0);
        } else {
            m30273b(1);
        }
        this.f9802z.setVisibility(0);
        this.f9758C.setVisibility(0);
        this.f9801y.setVisibility(0);
        this.f9800x.setVisibility(0);
    }

    @Override // com.fimi.soul.module.login.UsbConnectFragment.AbstractC2810a
    /* renamed from: e */
    public void mo30213e() {
        if (this.f9773V != null) {
            this.f9773V.mo28254d();
        }
        m30283a(2);
        if (this.f9785i != null) {
            this.f9785i.setVisibility(8);
        }
        m30270b(true);
        m30245w();
        if (this.f9773V != null) {
            this.f9773V.mo28250f();
        }
        this.f9762G = 0;
        this.f9768P.setAlpha(0.0f);
        m30265d(true);
        if (C1514f.m35431a().m35429b() == EnumC1495b.X1BH) {
            this.f9789m.setVisibility(0);
        }
        this.f9761F.start();
        m30242z();
        this.f9758C.setVisibility(8);
        this.f9802z.setVisibility(8);
        this.f9801y.setVisibility(8);
        this.f9800x.setVisibility(8);
        getFragmentManager().beginTransaction().remove(this.f9784h).commitAllowingStateLoss();
    }

    @Override // com.fimi.soul.module.login.UsbConnectFragment.AbstractC2810a
    /* renamed from: f */
    public void mo30212f() {
        if (!this.f9766N) {
            m30244x();
        } else if (this.f9765L != C1514f.m35431a().m35429b()) {
            m30244x();
        } else {
            this.f9778b.m34546a().edit().putBoolean(C1756a.f4517J, false).commit();
            this.dpa.m34274d();
        }
    }

    @Override // com.fimi.soul.module.update.UpdateConnectDefeaFrgment.AbstractC3008a
    /* renamed from: g */
    public void mo29679g() {
        if (this.f9766N) {
            this.f9778b.m34546a().edit().putBoolean(C1756a.f4517J, false);
            this.dpa.m34274d();
        } else if (C1514f.m35431a().m35429b() == EnumC1495b.DRONE) {
            startActivity(new Intent(this, FlightActivity.class));
        } else if (C1514f.m35431a().m35429b() != EnumC1495b.X1BH) {
        } else {
            startActivity(new Intent(this, CloudTerraceMainActivity.class));
        }
    }

    @Override // com.fimi.soul.module.update.UpdateConnectDefeaFrgment.AbstractC3008a
    /* renamed from: h */
    public void mo29678h() {
        m30283a(1);
        getFragmentManager().beginTransaction().remove(this.f9782f).commit();
        this.f9777a = true;
        this.f9790n.setVisibility(4);
        this.f9788l.setVisibility(4);
        this.f9789m.setVisibility(4);
        this.f9802z.setVisibility(0);
        this.f9758C.setVisibility(0);
        this.f9801y.setVisibility(0);
        this.f9800x.setVisibility(0);
        m30270b(false);
        m30242z();
        getFragmentManager().beginTransaction().replace(C1704R.C1706id.main_layout, this.f9784h).commit();
    }

    /* renamed from: i */
    public void m30260i() {
    }

    /* renamed from: j */
    public void m30258j() {
        this.f9790n.setText(getString(C1704R.C1707string.checking_hard));
        if (this.f9761F.isRunning()) {
            this.f9761F.cancel();
        }
        m30283a(1);
        this.f9777a = true;
        if (this.f9773V != null) {
            this.f9773V.mo28248g();
        }
        this.f9790n.setVisibility(4);
        this.f9788l.setVisibility(4);
        this.f9789m.setVisibility(4);
        m30270b(false);
        m30242z();
        getFragmentManager().beginTransaction().replace(C1704R.C1706id.main_layout, this.f9784h).commitAllowingStateLoss();
        this.f9758C.setVisibility(0);
        this.f9802z.setVisibility(0);
        this.f9801y.setVisibility(0);
        this.f9800x.setVisibility(0);
        if (this.f9772T != null) {
            this.f9772T.mo28268e();
            this.f9772T = null;
        }
    }

    /* renamed from: k */
    public void m30257k() {
        startActivity(new Intent(this, FlightActivity.class));
        finish();
    }

    /* renamed from: l */
    public void m30256l() {
        C1543b.m35230a();
        C1549d.m35213a();
        C1552b.m35201a().m35200a(new AbstractC1522a() { // from class: com.fimi.soul.module.login.LoginActivity.6
            @Override // com.fimi.p148c.AbstractC1522a
            /* renamed from: a */
            public void mo28082a(String str) {
            }

            @Override // com.fimi.p148c.AbstractC1522a
            /* renamed from: b */
            public void mo28051b(String str) {
            }

            @Override // com.fimi.p148c.AbstractC1522a
            /* renamed from: c */
            public void mo28161c(String str) {
            }
        });
        this.f9772T = new C1500d(this, C1514f.m35431a().m35429b(), this.f9781e);
        this.f9775Y = (600.0f - this.f9788l.getCurrentCount()) / 400.0f;
        this.f9772T.mo28274b();
    }

    /* renamed from: m */
    public void m30255m() {
        this.dpa.m34277b();
        this.dpa.m34276b(this);
        m30254n();
    }

    /* renamed from: n */
    public void m30254n() {
        if (this.f9761F.isRunning()) {
            this.f9761F.cancel();
        }
    }

    /* renamed from: o */
    public int m30253o() {
        return this.f9776Z;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.support.p001v4.app.FragmentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        if (i == 0) {
            this.f9777a = true;
            this.f9790n.setVisibility(4);
            this.f9788l.setVisibility(4);
            this.f9789m.setVisibility(4);
            m30270b(false);
            if (this.f9785i != null) {
                this.f9785i.setVisibility(4);
            }
            this.f9787k.setVisibility(0);
            this.f9787k.m28854a();
            m30242z();
            getFragmentManager().beginTransaction().replace(C1704R.C1706id.main_layout, this.f9784h).commit();
        }
        super.onActivityResult(i, i2, intent);
    }

    @Override // com.fimi.x1bh.module.X1bhBaseActivity, com.fimi.soul.base.BaseActivity, com.fimi.soul.base.BaseFimiActivity, com.fimi.kernel.BaseActivity, android.support.p001v4.app.FragmentActivity, android.app.Activity
    @TargetApi(16)
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C1704R.layout.activity_login);
        m30247u();
        m30252p();
        C1903e.m33631a().m33629a(C1903e.EnumC1904a.IDEL);
        QueryDynamicFlyZoneSetvice.m29455a(getApplicationContext());
    }

    @Override // com.fimi.x1bh.module.X1bhBaseActivity, com.fimi.soul.base.BaseActivity, com.fimi.soul.base.BaseFimiActivity, com.fimi.kernel.BaseActivity, android.support.p001v4.app.FragmentActivity, android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        Log.d(f9755W, "onDestroy: ");
        this.f9767O = true;
        if (this.f9787k != null) {
            this.f9787k.m28846c();
        }
        this.drone.mo32903b(this);
        if (this.f9773V != null) {
            this.f9773V.mo35495a();
        }
        if (this.f9773V != null) {
            this.f9773V.mo28247h();
        }
        if (this.f9772T != null) {
            this.f9772T.mo28272c();
        }
    }

    @Override // com.fimi.soul.base.BaseActivity, com.fimi.soul.drone.C2104d.AbstractC2106b
    public void onDroneEvent(C2104d.EnumC2105a enumC2105a, C2083a c2083a) {
    }

    @Override // android.support.p001v4.app.FragmentActivity, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i == 4) {
            switch (this.f9776Z) {
                case 0:
                    if (this.f9766N) {
                        finish();
                        return false;
                    }
                    m30243y();
                    return false;
                case 1:
                    if (this.f9764K) {
                        m30243y();
                        return false;
                    } else if (this.f9766N) {
                        finish();
                        return false;
                    } else {
                        m30243y();
                        return false;
                    }
                case 2:
                    if (this.f9773V != null) {
                        this.f9773V.mo28247h();
                        this.f9773V.mo35495a();
                    }
                    m30258j();
                    return false;
                case 3:
                    m30258j();
                    return false;
                case 4:
                    mo29678h();
                    return false;
                case 5:
                    if (this.f9766N) {
                        finish();
                        return false;
                    }
                    m30243y();
                    return false;
            }
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // android.support.p001v4.view.ViewPager.OnPageChangeListener
    public void onPageScrollStateChanged(int i) {
    }

    @Override // android.support.p001v4.view.ViewPager.OnPageChangeListener
    public void onPageScrolled(int i, float f, int i2) {
    }

    @Override // android.support.p001v4.view.ViewPager.OnPageChangeListener
    public void onPageSelected(int i) {
        m30269c(i);
        CameraValue.isAutoConnect = false;
        if (i == 0) {
            m30273b(0);
        } else {
            m30273b(1);
        }
    }

    @Override // com.fimi.soul.base.BaseActivity, com.fimi.kernel.BaseActivity, android.support.p001v4.app.FragmentActivity, android.app.Activity
    protected void onResume() {
        super.onResume();
        if (this.f9770R == 20) {
            m30276a(getString(C1704R.C1707string.phone_unconect_flight), getString(C1704R.C1707string.remote_noconnect_plane));
        }
        if (this.f9772T != null) {
            this.f9772T.mo28265f();
        }
        if (this.f9771S) {
            this.f9771S = false;
            if (C1642c.m34885e().m34499r() == 0) {
                m30273b(0);
            } else {
                m30273b(1);
            }
            this.f9802z.setVisibility(0);
            this.f9758C.setVisibility(0);
            this.f9801y.setVisibility(0);
            this.f9800x.setVisibility(0);
        }
    }

    @Override // com.fimi.soul.base.BaseActivity, com.fimi.kernel.BaseActivity, android.support.p001v4.app.FragmentActivity, android.app.Activity
    protected void onStart() {
        super.onStart();
        if (this.f9773V != null) {
            this.f9773V.mo28259a(C1845a.m33920b());
        }
        this.f9767O = false;
    }

    @Override // com.fimi.soul.base.BaseActivity, android.support.p001v4.app.FragmentActivity, android.app.Activity
    protected void onStop() {
        super.onStop();
        this.f9767O = true;
        this.f9779c.removeCallbacks(this.f9774X);
        if (this.f9769Q != null && this.f9769Q.m33130b() != null) {
            this.f9769Q.m33137a((C2046b.AbstractC2055b) null);
        }
        if (this.f9772T != null) {
            this.f9772T.mo28270d();
        }
    }
}
