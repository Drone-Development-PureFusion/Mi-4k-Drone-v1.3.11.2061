package com.fimi.soul.module.flyplannermedia;

import android.app.FragmentTransaction;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.fimi.kernel.C1642c;
import com.fimi.kernel.utils.C1681v;
import com.fimi.overseas.soul.C1704R;
import com.fimi.p140a.C1514f;
import com.fimi.p140a.p142b.EnumC1495b;
import com.fimi.soul.base.BaseActivity;
import com.fimi.soul.biz.camera.C1783b;
import com.fimi.soul.biz.camera.C1827d;
import com.fimi.soul.biz.camera.C1831e;
import com.fimi.soul.entity.CameraValue;
import com.fimi.soul.entity.DeviceType;
import com.fimi.soul.utils.C3103au;
import java.lang.ref.WeakReference;
/* loaded from: classes.dex */
public class DroneMediaTabActivity extends BaseActivity implements View.OnClickListener {

    /* renamed from: p */
    private static final int f9627p = 0;

    /* renamed from: q */
    private static final int f9628q = 5000;

    /* renamed from: r */
    private static final String f9629r = "DroneMediaTabActivity";

    /* renamed from: a */
    private DroneOnlineFragment f9630a;

    /* renamed from: b */
    private DroneLocalFragment f9631b;

    /* renamed from: d */
    private RelativeLayout f9633d;

    /* renamed from: e */
    private RelativeLayout f9634e;

    /* renamed from: f */
    private ImageView f9635f;

    /* renamed from: g */
    private ImageView f9636g;

    /* renamed from: h */
    private TextView f9637h;

    /* renamed from: i */
    private TextView f9638i;

    /* renamed from: j */
    private View f9639j;

    /* renamed from: k */
    private View f9640k;

    /* renamed from: l */
    private View f9641l;

    /* renamed from: m */
    private View f9642m;

    /* renamed from: n */
    private ImageButton f9643n;

    /* renamed from: o */
    private TextView f9644o;

    /* renamed from: c */
    private boolean f9632c = false;

    /* renamed from: s */
    private HandlerC2769a f9645s = new HandlerC2769a(this);

    /* renamed from: com.fimi.soul.module.flyplannermedia.DroneMediaTabActivity$a */
    /* loaded from: classes.dex */
    private static final class HandlerC2769a extends Handler {

        /* renamed from: a */
        private final WeakReference<DroneMediaTabActivity> f9647a;

        public HandlerC2769a(DroneMediaTabActivity droneMediaTabActivity) {
            this.f9647a = new WeakReference<>(droneMediaTabActivity);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            super.handleMessage(message);
            if (message.what == 0) {
                DroneMediaTabActivity.m30348b((C1827d) C1783b.m34166a().m34150d());
                sendEmptyMessageDelayed(0, 5000L);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public static void m30348b(C1827d c1827d) {
        CameraValue.PAGE_CAMERA_MENU_ALBUM = 1;
        if ("menu_album".equals("") || !c1827d.e()) {
            return;
        }
        if (C1681v.m34543a(C1642c.m34893a()).m34495v() != DeviceType.DEVICE_4K && C1514f.m35431a().m35429b() != EnumC1495b.X1BH) {
            return;
        }
        c1827d.m33989u().m34054a("menu_album", C1831e.f4911cE);
    }

    /* renamed from: d */
    private void m30346d() {
        FragmentTransaction beginTransaction = getFragmentManager().beginTransaction();
        if (!this.f9632c) {
            this.f9637h.setTextColor(getResources().getColor(C1704R.color.drone_tab_gray_color));
            this.f9635f.setVisibility(4);
            this.f9638i.setTextColor(-1);
            this.f9636g.setVisibility(0);
            beginTransaction.replace(C1704R.C1706id.ll_content, this.f9631b);
            beginTransaction.addToBackStack(null);
            beginTransaction.commitAllowingStateLoss();
            return;
        }
        this.f9638i.setTextColor(getResources().getColor(C1704R.color.drone_tab_gray_color));
        this.f9636g.setVisibility(4);
        this.f9637h.setTextColor(-1);
        this.f9635f.setVisibility(0);
        beginTransaction.replace(C1704R.C1706id.ll_content, this.f9630a);
        beginTransaction.addToBackStack(null);
        beginTransaction.commitAllowingStateLoss();
    }

    /* renamed from: a */
    public View m30352a() {
        return this.f9640k;
    }

    /* renamed from: a */
    public void m30350a(boolean z) {
        this.f9642m.setVisibility(z ? 0 : 8);
    }

    /* renamed from: b */
    public View m30349b() {
        return this.f9641l;
    }

    /* renamed from: c */
    public void m30347c() {
        C1827d c1827d = (C1827d) C1783b.m34166a().m34150d();
        CameraValue.PAGE_CAMERA_MENU_ALBUM = 0;
        if ("menu_album".equals("") || !c1827d.e()) {
            return;
        }
        if (C1681v.m34543a(C1642c.m34893a()).m34495v() != DeviceType.DEVICE_4K && C1514f.m35431a().m35429b() != EnumC1495b.X1BH) {
            return;
        }
        c1827d.m33989u().m34054a("menu_album", "off");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.support.p001v4.app.FragmentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i != 0 || intent == null) {
            return;
        }
        switch (i2) {
            case 1:
                this.f9631b.m30363a(intent);
                return;
            case 2:
                this.f9630a.m30343a(intent);
                return;
            default:
                return;
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view.getId() == C1704R.C1706id.local_layout) {
            this.f9632c = false;
        }
        if (view.getId() == C1704R.C1706id.online_layout) {
            this.f9632c = true;
        }
        m30346d();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.fimi.soul.base.BaseActivity, com.fimi.soul.base.BaseFimiActivity, com.fimi.kernel.BaseActivity, android.support.p001v4.app.FragmentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setResult(1001);
        this.f9630a = new DroneOnlineFragment();
        this.f9631b = new DroneLocalFragment();
        setContentView(C1704R.layout.activity_drone_media_tab);
        getWindow().setFlags(128, 128);
        this.f9639j = findViewById(C1704R.C1706id.rl_tab_top);
        this.f9639j.findViewById(C1704R.C1706id.ll_center_tab).setVisibility(0);
        this.f9643n = (ImageButton) this.f9639j.findViewById(C1704R.C1706id.btn_back);
        this.f9640k = findViewById(C1704R.C1706id.ll_actionBottom);
        this.f9640k.setVisibility(8);
        this.f9641l = findViewById(C1704R.C1706id.ll_actionTop);
        this.f9633d = (RelativeLayout) findViewById(C1704R.C1706id.online_layout);
        this.f9634e = (RelativeLayout) findViewById(C1704R.C1706id.local_layout);
        this.f9633d.setOnClickListener(this);
        this.f9634e.setOnClickListener(this);
        this.f9637h = (TextView) findViewById(C1704R.C1706id.tv_online);
        this.f9638i = (TextView) findViewById(C1704R.C1706id.tv_local);
        this.f9644o = (TextView) findViewById(C1704R.C1706id.vedio_empty_tv);
        if (C1514f.m35431a().m35429b() == EnumC1495b.DRONE) {
            this.f9644o.setText(C1704R.C1707string.use_angle_record_moments);
            this.f9637h.setText(C1704R.C1707string.media_aerial_image);
        } else {
            this.f9644o.setText(C1704R.C1707string.cloud_empty_media);
            this.f9637h.setText(C1704R.C1707string.cloud_online_media);
        }
        C3103au.m29233a(C1642c.m34893a().getResources().getAssets(), (ViewGroup) getWindow().getDecorView());
        this.f9635f = (ImageView) findViewById(C1704R.C1706id.iv_onlineDot);
        this.f9636g = (ImageView) findViewById(C1704R.C1706id.iv_localDot);
        this.f9642m = findViewById(C1704R.C1706id.ll_empty);
        this.f9643n.setOnClickListener(new View.OnClickListener() { // from class: com.fimi.soul.module.flyplannermedia.DroneMediaTabActivity.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                DroneMediaTabActivity.this.overridePendingTransition(17432576, 17432577);
                DroneMediaTabActivity.this.finish();
            }
        });
        this.f9632c = ((C1827d) C1783b.m34166a().m34150d()).e();
        m30346d();
        this.f9645s.sendEmptyMessage(0);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.fimi.soul.base.BaseActivity, com.fimi.soul.base.BaseFimiActivity, com.fimi.kernel.BaseActivity, android.support.p001v4.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.f9645s.removeCallbacksAndMessages(null);
        m30347c();
        if (this.f9630a != null) {
            this.f9630a.m30315p().removeCallbacksAndMessages(null);
        }
    }

    @Override // android.support.p001v4.app.FragmentActivity, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i == 4 && (m30349b().getVisibility() == 0 || m30352a().getVisibility() == 0)) {
            if (this.f9632c) {
                this.f9630a.m30316o();
            } else {
                this.f9631b.m30355o();
            }
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // android.support.p001v4.app.FragmentActivity, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
    }
}
