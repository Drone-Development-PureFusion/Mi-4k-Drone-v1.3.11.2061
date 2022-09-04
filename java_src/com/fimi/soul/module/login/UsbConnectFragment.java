package com.fimi.soul.module.login;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.app.Fragment;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.fimi.kernel.utils.C1688z;
import com.fimi.overseas.soul.C1704R;
import com.fimi.p140a.C1514f;
import com.fimi.p140a.p142b.EnumC1495b;
import com.fimi.soul.base.DroidPlannerApp;
import com.fimi.soul.biz.p179g.C1846a;
import com.fimi.soul.drone.C2083a;
import com.fimi.soul.entity.CameraValue;
import com.fimi.soul.utils.C3103au;
import com.fimi.soul.view.DialogC3203a;
/* loaded from: classes.dex */
public class UsbConnectFragment extends Fragment implements Handler.Callback, View.OnClickListener {

    /* renamed from: a */
    WifiManager f9843a;

    /* renamed from: c */
    private TextView f9845c;

    /* renamed from: d */
    private TextView f9846d;

    /* renamed from: e */
    private RelativeLayout f9847e;

    /* renamed from: f */
    private RelativeLayout f9848f;

    /* renamed from: g */
    private RelativeLayout f9849g;

    /* renamed from: h */
    private RelativeLayout f9850h;

    /* renamed from: i */
    private RelativeLayout f9851i;

    /* renamed from: j */
    private Context f9852j;

    /* renamed from: k */
    private Button f9853k;

    /* renamed from: l */
    private Button f9854l;

    /* renamed from: m */
    private Button f9855m;

    /* renamed from: n */
    private TextView f9856n;

    /* renamed from: o */
    private TextView f9857o;

    /* renamed from: p */
    private TextView f9858p;

    /* renamed from: q */
    private TextView f9859q;

    /* renamed from: r */
    private TextView f9860r;

    /* renamed from: s */
    private TextView f9861s;

    /* renamed from: t */
    private AbstractC2810a f9862t;

    /* renamed from: u */
    private Handler f9863u;

    /* renamed from: v */
    private C2083a f9864v;

    /* renamed from: w */
    private int f9865w = 100;

    /* renamed from: b */
    public Handler f9844b = new Handler() { // from class: com.fimi.soul.module.login.UsbConnectFragment.8
        @Override // android.os.Handler
        public void handleMessage(Message message) {
            super.handleMessage(message);
            C1688z.m34449a(UsbConnectFragment.this.getActivity(), (int) C1704R.C1707string.connectRcWifi, 3000);
        }
    };

    /* renamed from: com.fimi.soul.module.login.UsbConnectFragment$a */
    /* loaded from: classes.dex */
    public interface AbstractC2810a {
        /* renamed from: e */
        void mo30213e();

        /* renamed from: f */
        void mo30212f();
    }

    /* renamed from: a */
    private void m30229a() {
        DialogC3203a.C3206b c3206b = new DialogC3203a.C3206b(getActivity());
        c3206b.m28752a(getString(C1704R.C1707string.good), new DialogInterface.OnClickListener() { // from class: com.fimi.soul.module.login.UsbConnectFragment.7
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i) {
                if (C1846a.m33917a().m33915b() != 1) {
                    if (UsbConnectFragment.this.f9864v.mo32906ab().mo32588a()) {
                        UsbConnectFragment.this.f9863u.sendMessageDelayed(Message.obtain(), 300L);
                        return;
                    }
                    if (!UsbConnectFragment.this.f9843a.isWifiEnabled()) {
                        UsbConnectFragment.this.f9843a.setWifiEnabled(true);
                    }
                    UsbConnectFragment.this.startActivityForResult(new Intent("android.settings.WIFI_SETTINGS"), UsbConnectFragment.this.f9865w);
                    return;
                }
                try {
                    if (UsbConnectFragment.this.getActivity() == null || Build.VERSION.SDK_INT >= 24 || !C3103au.m29193i(UsbConnectFragment.this.getActivity()).booleanValue()) {
                        try {
                            Intent intent = new Intent();
                            intent.setClassName("com.android.settings", "com.android.settings.TetherSettings");
                            if (UsbConnectFragment.this.getActivity() != null) {
                                UsbConnectFragment.this.startActivityForResult(intent, 0);
                            }
                        } catch (Exception e) {
                            Intent intent2 = new Intent("android.settings.AIRPLANE_MODE_SETTINGS");
                            if (UsbConnectFragment.this.getActivity() != null) {
                                UsbConnectFragment.this.startActivityForResult(intent2, 0);
                            }
                        }
                    } else {
                        UsbConnectFragment.this.m30225b();
                        UsbConnectFragment.this.f9862t.mo30213e();
                    }
                } catch (Exception e2) {
                    Intent intent3 = new Intent("android.settings.AIRPLANE_MODE_SETTINGS");
                    if (UsbConnectFragment.this.getActivity() == null) {
                        return;
                    }
                    UsbConnectFragment.this.startActivityForResult(intent3, 0);
                }
            }
        });
        c3206b.m28758a().show();
    }

    /* renamed from: a */
    private void m30228a(View view) {
        this.f9856n = (TextView) view.findViewById(C1704R.C1706id.declare_one_tv);
        this.f9857o = (TextView) view.findViewById(C1704R.C1706id.declare_two_tv);
        this.f9858p = (TextView) view.findViewById(C1704R.C1706id.declare_three_tv);
        this.f9859q = (TextView) view.findViewById(C1704R.C1706id.declare_four_tv);
        this.f9860r = (TextView) view.findViewById(C1704R.C1706id.declare_two_child_tv);
        this.f9861s = (TextView) view.findViewById(C1704R.C1706id.declare_three_child_tv);
        C3103au.m29232a(this.f9852j.getAssets(), this.f9856n, this.f9857o, this.f9858p, this.f9859q, this.f9860r, this.f9861s, this.f9853k, this.f9854l, this.f9845c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public void m30225b() {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f9845c, "translationX", 0.0f, 1000.0f);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.f9847e, "translationX", 0.0f, 1000.0f);
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this.f9848f, "translationX", 0.0f, 1000.0f);
        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(this.f9849g, "translationX", 0.0f, 1000.0f);
        ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(this.f9850h, "translationX", 0.0f, 1000.0f);
        ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(this.f9851i, "translationX", 0.0f, 1000.0f);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(ofFloat6).with(ofFloat5).with(ofFloat4).with(ofFloat2).with(ofFloat3).with(ofFloat);
        animatorSet.setDuration(500L);
        animatorSet.start();
    }

    /* renamed from: b */
    private void m30224b(View view) {
        this.f9853k = (Button) view.findViewById(C1704R.C1706id.next_bt);
        this.f9853k.setOnClickListener(this);
        this.f9854l = (Button) view.findViewById(C1704R.C1706id.noconnect_bt);
        this.f9854l.setOnClickListener(this);
        this.f9847e = (RelativeLayout) view.findViewById(C1704R.C1706id.usbconnect_one_rl);
        this.f9848f = (RelativeLayout) view.findViewById(C1704R.C1706id.usbconnect_two_rl);
        this.f9849g = (RelativeLayout) view.findViewById(C1704R.C1706id.usbconnect_three_rl);
        this.f9850h = (RelativeLayout) view.findViewById(C1704R.C1706id.usbconnect_four_rl);
        this.f9851i = (RelativeLayout) view.findViewById(C1704R.C1706id.usbconnect_button_rl);
        this.f9845c = (TextView) view.findViewById(C1704R.C1706id.connectplane_tv);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f9845c, "translationX", 800.0f, 0.0f);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.f9847e, "translationX", 800.0f, 0.0f);
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this.f9848f, "translationX", 800.0f, 0.0f);
        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(this.f9849g, "translationX", 800.0f, 0.0f);
        ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(this.f9850h, "translationX", 800.0f, 0.0f);
        ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(this.f9851i, "translationX", 800.0f, 0.0f);
        this.f9855m = (Button) view.findViewById(C1704R.C1706id.next_bt);
        this.f9855m.setOnClickListener(this);
        ofFloat.setStartDelay(0L);
        ofFloat2.setStartDelay(70L);
        ofFloat3.setStartDelay(140L);
        ofFloat4.setStartDelay(210L);
        ofFloat5.setStartDelay(280L);
        ofFloat6.setStartDelay(350L);
        ofFloat.setDuration(250L);
        ofFloat2.setDuration(250L);
        ofFloat3.setDuration(250L);
        ofFloat4.setDuration(250L);
        ofFloat5.setDuration(250L);
        ofFloat6.setDuration(250L);
        ofFloat.addListener(new AnimatorListenerAdapter() { // from class: com.fimi.soul.module.login.UsbConnectFragment.1
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                super.onAnimationStart(animator);
                UsbConnectFragment.this.f9845c.setVisibility(0);
            }
        });
        ofFloat2.addListener(new AnimatorListenerAdapter() { // from class: com.fimi.soul.module.login.UsbConnectFragment.2
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                super.onAnimationStart(animator);
                UsbConnectFragment.this.f9847e.setVisibility(0);
            }
        });
        ofFloat3.addListener(new AnimatorListenerAdapter() { // from class: com.fimi.soul.module.login.UsbConnectFragment.3
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                super.onAnimationStart(animator);
                UsbConnectFragment.this.f9848f.setVisibility(0);
            }
        });
        ofFloat4.addListener(new AnimatorListenerAdapter() { // from class: com.fimi.soul.module.login.UsbConnectFragment.4
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                super.onAnimationStart(animator);
                UsbConnectFragment.this.f9849g.setVisibility(0);
            }
        });
        ofFloat5.addListener(new AnimatorListenerAdapter() { // from class: com.fimi.soul.module.login.UsbConnectFragment.5
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                super.onAnimationStart(animator);
                UsbConnectFragment.this.f9850h.setVisibility(0);
            }
        });
        ofFloat6.addListener(new AnimatorListenerAdapter() { // from class: com.fimi.soul.module.login.UsbConnectFragment.6
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                super.onAnimationStart(animator);
                UsbConnectFragment.this.f9851i.setVisibility(0);
            }
        });
        if (getArguments() == null || !getArguments().getBoolean("isEnterLoginFragment", false)) {
            this.f9845c.setVisibility(0);
            this.f9847e.setVisibility(0);
            this.f9848f.setVisibility(0);
            this.f9849g.setVisibility(0);
            this.f9850h.setVisibility(0);
            this.f9851i.setVisibility(0);
            return;
        }
        ofFloat.start();
        ofFloat2.start();
        ofFloat3.start();
        ofFloat4.start();
        ofFloat5.start();
        ofFloat6.start();
    }

    /* renamed from: a */
    public void m30226a(boolean z) {
        if (this.f9845c == null) {
            return;
        }
        if (z) {
            this.f9845c.setText(C1704R.C1707string.usb_connect_camera_title);
            this.f9856n.setText(C1704R.C1707string.usb_connect_camera_one);
            this.f9857o.setText(C1704R.C1707string.usb_connect_camera_two);
            this.f9860r.setVisibility(8);
            this.f9858p.setText(C1704R.C1707string.usb_connect_camera_three);
            this.f9861s.setVisibility(8);
            this.f9859q.setText(C1704R.C1707string.usb_connect_camera_four);
            return;
        }
        this.f9845c.setText(C1704R.C1707string.please_connect_micraft);
        this.f9856n.setText(C1704R.C1707string.connect_hardware);
        this.f9857o.setText(C1704R.C1707string.open_remote_batter);
        this.f9860r.setText(C1704R.C1707string.short_long_batter);
        this.f9860r.setVisibility(0);
        this.f9858p.setText(C1704R.C1707string.open_micraft_batter);
        this.f9861s.setVisibility(0);
        this.f9861s.setText(C1704R.C1707string.short_long_micraft);
        this.f9859q.setText(C1704R.C1707string.connect_ipone_remote);
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        m30225b();
        this.f9862t.mo30213e();
        return false;
    }

    @Override // android.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        if (i == 0) {
            if (Build.VERSION.SDK_INT >= 24) {
                this.f9863u.sendMessageDelayed(Message.obtain(), 300L);
            } else if (C3103au.m29193i(this.f9852j).booleanValue()) {
                this.f9863u.sendMessageDelayed(Message.obtain(), 300L);
            }
        } else if (i == this.f9865w) {
            if (!C3103au.m29213c(getActivity().getApplicationContext())) {
                C1688z.m34449a(getActivity(), (int) C1704R.C1707string.connectRcWifi, 3000);
            } else {
                this.f9863u.sendMessageDelayed(Message.obtain(), 300L);
            }
        }
        if (intent == null) {
            return;
        }
        super.onActivityResult(i, i2, intent);
    }

    @Override // android.app.Fragment
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        this.f9852j = activity;
        this.f9862t = (AbstractC2810a) activity;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        switch (view.getId()) {
            case C1704R.C1706id.noconnect_bt /* 2131755425 */:
                if (this.f9862t != null) {
                    this.f9862t.mo30212f();
                }
                CameraValue.isAutoConnect = false;
                return;
            case C1704R.C1706id.next_bt /* 2131755924 */:
                if (C1514f.m35431a().m35429b() != EnumC1495b.DRONE) {
                    if (!this.f9843a.isWifiEnabled()) {
                        this.f9843a.setWifiEnabled(true);
                    }
                    startActivityForResult(new Intent("android.settings.WIFI_SETTINGS"), this.f9865w);
                    CameraValue.isAutoConnect = true;
                    return;
                } else if (this.f9864v == null || (!this.f9864v.mo32906ab().mo32588a() && !this.f9864v.mo32905ac())) {
                    m30229a();
                    return;
                } else {
                    this.f9863u.sendMessageDelayed(Message.obtain(), 300L);
                    return;
                }
            default:
                return;
        }
    }

    @Override // android.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f9843a = (WifiManager) this.f9852j.getSystemService("wifi");
        this.f9864v = ((DroidPlannerApp) getActivity().getApplication()).f4493a;
    }

    @Override // android.app.Fragment
    @Nullable
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(C1704R.layout.fragment_usbconnect, viewGroup, false);
        m30224b(inflate);
        m30228a(inflate);
        if (C1514f.m35431a().m35429b() != EnumC1495b.DRONE) {
            m30226a(true);
        } else {
            m30226a(false);
        }
        this.f9863u = new Handler(this);
        return inflate;
    }

    @Override // android.app.Fragment
    public void onResume() {
        super.onResume();
    }
}
