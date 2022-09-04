package com.fimi.x1bh.module.main;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.Process;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.Toast;
import com.fimi.kernel.C1642c;
import com.fimi.kernel.utils.C1681v;
import com.fimi.kernel.utils.C1688z;
import com.fimi.overseas.soul.C1704R;
import com.fimi.p140a.p145e.AbstractC1507b;
import com.fimi.p140a.p145e.C1508c;
import com.fimi.p148c.AbstractC1522a;
import com.fimi.p149d.p150a.C1526a;
import com.fimi.p149d.p150a.C1527b;
import com.fimi.p152e.C1549d;
import com.fimi.p153f.C1552b;
import com.fimi.soul.biz.camera.C1783b;
import com.fimi.soul.biz.camera.C1827d;
import com.fimi.soul.biz.camera.C1831e;
import com.fimi.soul.entity.DeviceType;
import com.fimi.soul.view.StrokeTextView;
import com.fimi.x1bh.module.X1bhBaseActivity;
import com.fimi.x1bh.module.main.AbstractC3362a;
import com.fimi.x1bh.module.main.CloudBatteryVoltageView;
import com.fimi.x1bh.p221b.C3339a;
/* loaded from: classes.dex */
public class CloudTerraceMainActivity extends X1bhBaseActivity implements View.OnClickListener, AbstractC3362a.AbstractC3363a {

    /* renamed from: v */
    private static final int f13413v = 3;

    /* renamed from: w */
    private static final int f13414w = 4;

    /* renamed from: x */
    private static final String f13415x = "CloudTerraceMainActivit";

    /* renamed from: b */
    private View f13417b;

    /* renamed from: c */
    private ImageButton f13418c;

    /* renamed from: d */
    private ImageButton f13419d;

    /* renamed from: e */
    private ImageButton f13420e;

    /* renamed from: f */
    private ImageButton f13421f;

    /* renamed from: g */
    private RelativeLayout f13422g;

    /* renamed from: h */
    private ImageView f13423h;

    /* renamed from: i */
    private StrokeTextView f13424i;

    /* renamed from: j */
    private StrokeTextView f13425j;

    /* renamed from: k */
    private StrokeTextView f13426k;

    /* renamed from: l */
    private StrokeTextView f13427l;

    /* renamed from: m */
    private CloudBatteryVoltageView f13428m;

    /* renamed from: n */
    private ImageView f13429n;

    /* renamed from: o */
    private C1526a f13430o;

    /* renamed from: p */
    private C1527b f13431p;

    /* renamed from: q */
    private AbstractC3362a f13432q;

    /* renamed from: r */
    private Toast f13433r;

    /* renamed from: s */
    private boolean f13434s;

    /* renamed from: t */
    private C3339a f13435t;

    /* renamed from: u */
    private boolean f13436u = false;

    /* renamed from: a */
    Handler f13416a = new Handler() { // from class: com.fimi.x1bh.module.main.CloudTerraceMainActivity.1
        @Override // android.os.Handler
        public void handleMessage(Message message) {
            super.handleMessage(message);
            if (message.what == 3) {
                CloudTerraceMainActivity.this.f13430o = (C1526a) message.obj;
                byte m35366k = CloudTerraceMainActivity.this.f13430o.m35366k();
                CloudTerraceMainActivity.this.f13428m.setPercent(m35366k);
                if (m35366k >= 30) {
                    CloudTerraceMainActivity.this.f13428m.m28178a(CloudBatteryVoltageView.EnumC3358a.NOMAL);
                } else if (m35366k > 30 || m35366k <= 15) {
                    CloudTerraceMainActivity.this.f13428m.m28178a(CloudBatteryVoltageView.EnumC3358a.LOW);
                } else {
                    CloudTerraceMainActivity.this.f13428m.m28178a(CloudBatteryVoltageView.EnumC3358a.SERIOUS_LOW);
                }
            } else if (message.what != 4) {
            } else {
                CloudTerraceMainActivity.this.f13431p = (C1527b) message.obj;
                if (CloudTerraceMainActivity.this.f13431p.m35356k() == 0) {
                    CloudTerraceMainActivity.this.f13429n.setVisibility(8);
                } else {
                    CloudTerraceMainActivity.this.f13429n.setVisibility(0);
                }
                if (CloudTerraceMainActivity.this.f13431p.m35354m() == -1) {
                    CloudTerraceMainActivity.this.f13425j.setText("");
                } else if (CloudTerraceMainActivity.this.f13431p.m35354m() == 0) {
                    CloudTerraceMainActivity.this.f13425j.setText(C1704R.C1707string.cloud_cloud_error_0);
                } else if (CloudTerraceMainActivity.this.f13431p.m35354m() == 1) {
                    CloudTerraceMainActivity.this.f13425j.setText(C1704R.C1707string.cloud_cloud_error_1);
                } else if (CloudTerraceMainActivity.this.f13431p.m35354m() == 2) {
                    CloudTerraceMainActivity.this.f13425j.setText(C1704R.C1707string.cloud_cloud_error_2);
                } else if (CloudTerraceMainActivity.this.f13431p.m35354m() == 3) {
                    CloudTerraceMainActivity.this.f13425j.setText(C1704R.C1707string.cloud_cloud_error_3);
                } else if (CloudTerraceMainActivity.this.f13431p.m35354m() == 4) {
                    CloudTerraceMainActivity.this.f13425j.setText(C1704R.C1707string.cloud_cloud_error_4);
                } else if (CloudTerraceMainActivity.this.f13431p.m35354m() == 5) {
                    CloudTerraceMainActivity.this.f13425j.setText("");
                } else if (CloudTerraceMainActivity.this.f13431p.m35354m() == 6) {
                    CloudTerraceMainActivity.this.f13425j.setText("");
                } else if (CloudTerraceMainActivity.this.f13431p.m35354m() == 7) {
                    CloudTerraceMainActivity.this.f13425j.setText(C1704R.C1707string.cloud_cloud_error_7);
                } else if (CloudTerraceMainActivity.this.f13431p.m35354m() == 8) {
                    CloudTerraceMainActivity.this.f13425j.setText("");
                } else if (CloudTerraceMainActivity.this.f13431p.m35354m() != 9) {
                } else {
                    CloudTerraceMainActivity.this.f13425j.setText(C1704R.C1707string.cloud_cloud_error_9);
                }
            }
        }
    };

    /* renamed from: y */
    private AbstractC1522a f13437y = new AbstractC1522a() { // from class: com.fimi.x1bh.module.main.CloudTerraceMainActivity.2
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
    };

    /* renamed from: z */
    private AbstractC1522a f13438z = new AbstractC1522a() { // from class: com.fimi.x1bh.module.main.CloudTerraceMainActivity.3
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
    };

    /* renamed from: g */
    private void m28166g(String str) {
        if (C1831e.f4812aL.equals(str)) {
            this.f13424i.setText(getString(C1704R.C1707string.tf_remove_error));
        } else if (C1831e.f4813aM.equals(str)) {
            this.f13424i.setText("");
        } else if (C1831e.f4816aP.equals(str)) {
            this.f13424i.setText(getString(C1704R.C1707string.tf_io_error));
        } else if (C1831e.f4822aV.equals(str)) {
            this.f13424i.setText(getString(C1704R.C1707string.tf_io_error));
        } else if (C1831e.f4820aT.equals(str)) {
            this.f13424i.setText(getString(C1704R.C1707string.tf_low_speed_error));
        } else if (C1831e.f4821aU.equals(str)) {
            this.f13424i.setText(getString(C1704R.C1707string.tf_low_speed_error));
        } else if (C1831e.f4818aR.equals(str)) {
            this.f13424i.setText(getString(C1704R.C1707string.tf_low_speed_error));
        } else if (C1831e.f4819aS.equals(str)) {
            this.f13424i.setText(getString(C1704R.C1707string.tf_low_speed_error));
        } else if (C1831e.f4823aW.equals(str)) {
            this.f13424i.setText(getString(C1704R.C1707string.cloud_main_tf_will_runout));
        } else if (C1831e.f4809aI.equals(str)) {
            this.f13424i.setText(getString(C1704R.C1707string.tf_low_speed_error));
        } else if (!C1831e.f4807aG.equals(str)) {
        } else {
            this.f13424i.setText(getString(C1704R.C1707string.tf_full_error));
        }
    }

    /* renamed from: i */
    private void m28164i() {
        this.f13432q = new C3364b(this, this);
        m28167g();
    }

    /* renamed from: j */
    private void m28163j() {
        this.f13417b = findViewById(C1704R.C1706id.bg_view);
        this.f13421f = (ImageButton) findViewById(C1704R.C1706id.ibtn_thumbnail);
        this.f13418c = (ImageButton) findViewById(C1704R.C1706id.btn_switch_mode);
        this.f13419d = (ImageButton) findViewById(C1704R.C1706id.btn_shutter_camera);
        this.f13420e = (ImageButton) findViewById(C1704R.C1706id.btn_shutter_record);
        this.f13423h = (ImageView) findViewById(C1704R.C1706id.setting_iv);
        this.f13424i = (StrokeTextView) findViewById(C1704R.C1706id.tv_camera_tf_card);
        this.f13425j = (StrokeTextView) findViewById(C1704R.C1706id.tv_cloud_error);
        this.f13426k = (StrokeTextView) findViewById(C1704R.C1706id.record_time_tv);
        this.f13428m = (CloudBatteryVoltageView) findViewById(C1704R.C1706id.cloud_battery_voltage_view);
        this.f13429n = (ImageView) findViewById(C1704R.C1706id.handle_lock_iv);
        this.f13429n.setVisibility(8);
        this.f13427l = (StrokeTextView) findViewById(C1704R.C1706id.tv_camera_ev);
        this.f13422g = (RelativeLayout) findViewById(C1704R.C1706id.rl_capture);
        this.f13418c.setOnClickListener(this);
        this.f13419d.setOnClickListener(this);
        this.f13420e.setOnClickListener(this);
        this.f13421f.setOnClickListener(this);
        this.f13423h.setOnClickListener(this);
        this.f13422g.setOnClickListener(this);
    }

    /* renamed from: k */
    private void m28162k() {
        if (this.f13434s) {
            m28168f();
            this.f13433r.cancel();
            finish();
            Process.killProcess(Process.myPid());
            return;
        }
        this.f13434s = true;
        this.f13433r = Toast.makeText(getApplicationContext(), (int) C1704R.C1707string.again_exit, 0);
        this.f13433r.show();
        getHandler().sendEmptyMessageDelayed(0, 2000L);
    }

    /* renamed from: a */
    public void m28177a() {
        View findViewById = findViewById(C1704R.C1706id.view_camera);
        this.f13435t = new C3339a();
        this.f13435t.m28244a(this, findViewById);
        this.f13435t.m28243b();
        this.f13432q.mo28145a(this.f13435t);
        this.f13427l.setText(getString(C1704R.C1707string.cloud_main_ev_show) + "0.0");
    }

    /* renamed from: a */
    public void m28176a(int i) {
        if (i >= 30) {
            this.f13428m.setPercent(i);
            this.f13428m.m28178a(CloudBatteryVoltageView.EnumC3358a.NOMAL);
        } else if (i >= 30 || i < 15) {
            this.f13428m.setPercent(i);
            this.f13428m.m28178a(CloudBatteryVoltageView.EnumC3358a.SERIOUS_LOW);
        } else {
            this.f13428m.setPercent(i);
            this.f13428m.m28178a(CloudBatteryVoltageView.EnumC3358a.LOW);
        }
    }

    @Override // com.fimi.x1bh.module.X1bhBaseActivity, com.fimi.p148c.AbstractC1523b
    /* renamed from: a */
    public void mo28086a(int i, C1508c c1508c) {
        super.mo28086a(i, c1508c);
        switch (i) {
            case 65:
                AbstractC1507b m35463g = c1508c.m35463g();
                if (!(m35463g instanceof C1526a)) {
                    return;
                }
                this.f13416a.obtainMessage(3, (C1526a) m35463g).sendToTarget();
                return;
            case 125:
                AbstractC1507b m35463g2 = c1508c.m35463g();
                if (!(m35463g2 instanceof C1527b)) {
                    return;
                }
                this.f13416a.obtainMessage(4, (C1527b) m35463g2).sendToTarget();
                return;
            default:
                return;
        }
    }

    @Override // com.fimi.x1bh.module.X1bhBaseActivity, com.fimi.p148c.AbstractC1522a
    /* renamed from: a */
    public void mo28082a(String str) {
        super.mo28082a(str);
        if (this.f13432q != null) {
            this.f13432q.mo28130g();
        }
    }

    @Override // com.fimi.x1bh.module.main.AbstractC3362a.AbstractC3363a
    /* renamed from: a */
    public void mo28160a(boolean z) {
        if (z) {
            return;
        }
        this.f13424i.setVisibility(0);
        this.f13424i.setText(getString(C1704R.C1707string.tf_remove_error));
    }

    @Override // com.fimi.x1bh.module.main.AbstractC3362a.AbstractC3363a
    /* renamed from: b */
    public void mo28159b() {
        this.f13436u = true;
        this.f13418c.setImageResource(C1704R.C1705drawable.cloud_select_record_selector);
        this.f13420e.setVisibility(0);
        this.f13419d.setVisibility(8);
    }

    @Override // com.fimi.x1bh.module.X1bhBaseActivity, com.fimi.p148c.AbstractC1522a
    /* renamed from: b */
    public void mo28051b(String str) {
        super.mo28051b(str);
        if (this.f13432q != null) {
            this.f13432q.mo28129h();
        }
        this.f13428m.setPercent(0);
        this.f13426k.setVisibility(8);
        this.f13421f.setVisibility(0);
        this.f13418c.setVisibility(0);
        this.f13423h.setVisibility(0);
        this.f13417b.setBackgroundResource(C1704R.color.main_menu_bg);
        this.f13427l.setText("");
        this.f13425j.setText("");
        if (!this.f13436u) {
            this.f13420e.setVisibility(8);
            this.f13419d.setVisibility(0);
            return;
        }
        this.f13420e.setVisibility(0);
        this.f13419d.setVisibility(8);
        this.f13420e.setBackgroundResource(C1704R.C1705drawable.btn_shutter_recorded);
    }

    @Override // com.fimi.x1bh.module.main.AbstractC3362a.AbstractC3363a
    /* renamed from: b */
    public void mo28158b(boolean z) {
        this.f13436u = true;
        getViewManager().mo34429c();
        this.f13418c.setImageResource(C1704R.C1705drawable.cloud_select_record_selector);
        this.f13420e.setVisibility(0);
        this.f13419d.setVisibility(8);
        this.f13420e.setEnabled(true);
        this.f13419d.setEnabled(true);
        this.f13422g.setEnabled(true);
        if (z) {
            this.f13420e.setBackgroundResource(C1704R.C1705drawable.btn_shutter_recording);
            this.f13417b.setBackgroundResource(C1704R.color.fcsensor);
            this.f13426k.setVisibility(0);
            this.f13421f.setVisibility(4);
            this.f13418c.setVisibility(4);
            this.f13423h.setVisibility(4);
            return;
        }
        this.f13420e.setBackgroundResource(C1704R.C1705drawable.btn_shutter_recorded);
        this.f13417b.setBackgroundResource(C1704R.color.main_menu_bg);
        this.f13426k.setVisibility(8);
        this.f13421f.setVisibility(0);
        this.f13418c.setVisibility(0);
        this.f13423h.setVisibility(0);
    }

    @Override // com.fimi.x1bh.module.main.AbstractC3362a.AbstractC3363a
    /* renamed from: c */
    public void mo28157c() {
        this.f13436u = false;
        this.f13418c.setImageResource(C1704R.C1705drawable.cloud_select_take_photo_selector);
        this.f13420e.setVisibility(8);
        this.f13419d.setVisibility(0);
    }

    @Override // com.fimi.x1bh.module.main.AbstractC3362a.AbstractC3363a
    /* renamed from: c */
    public void mo28156c(boolean z) {
        this.f13436u = false;
        this.f13422g.setEnabled(true);
        this.f13420e.setVisibility(8);
        this.f13419d.setVisibility(0);
        this.f13418c.setImageResource(C1704R.C1705drawable.cloud_select_take_photo_selector);
    }

    @Override // com.fimi.x1bh.module.main.AbstractC3362a.AbstractC3363a
    /* renamed from: d */
    public void mo28155d() {
        getViewManager().mo34429c();
        this.f13420e.setEnabled(true);
        this.f13419d.setEnabled(true);
    }

    @Override // com.fimi.x1bh.module.main.AbstractC3362a.AbstractC3363a
    /* renamed from: d */
    public void mo28154d(String str) {
        this.f13426k.setText(str);
        this.f13418c.setImageResource(C1704R.C1705drawable.cloud_select_take_photo_selector);
        this.f13420e.setVisibility(0);
        this.f13419d.setVisibility(8);
        this.f13420e.setEnabled(true);
        this.f13419d.setEnabled(true);
        this.f13420e.setBackgroundResource(C1704R.C1705drawable.btn_shutter_recording);
        this.f13417b.setBackgroundResource(C1704R.color.fcsensor);
        this.f13426k.setVisibility(0);
        this.f13421f.setVisibility(4);
        this.f13418c.setVisibility(4);
        this.f13423h.setVisibility(4);
    }

    @Override // com.fimi.x1bh.module.main.AbstractC3362a.AbstractC3363a
    /* renamed from: d */
    public void mo28153d(boolean z) {
        this.f13422g.setEnabled(true);
    }

    @Override // com.fimi.x1bh.module.main.AbstractC3362a.AbstractC3363a
    /* renamed from: e */
    public void mo28152e() {
        getViewManager().mo34429c();
        this.f13420e.setEnabled(true);
        this.f13419d.setEnabled(true);
    }

    @Override // com.fimi.x1bh.module.main.AbstractC3362a.AbstractC3363a
    /* renamed from: e */
    public void mo28151e(String str) {
        if (this.f13427l.getText().toString().equals(str)) {
            return;
        }
        this.f13427l.setText(getString(C1704R.C1707string.cloud_main_ev_show) + str);
    }

    /* renamed from: f */
    public void m28168f() {
        C1552b.m35201a().m35198b();
        C1549d.m35208b().m35204e();
    }

    @Override // com.fimi.x1bh.module.main.AbstractC3362a.AbstractC3363a
    /* renamed from: f */
    public void mo28150f(String str) {
        m28166g(str);
    }

    /* renamed from: g */
    public void m28167g() {
        C1549d.m35208b().m35212a(this.f13437y);
    }

    /* renamed from: h */
    public void m28165h() {
        if (!"off".equals("")) {
            C1827d c1827d = (C1827d) C1783b.m34166a().m34150d();
            if (!c1827d.e() || C1681v.m34543a(C1642c.m34893a()).m34495v() != DeviceType.DEVICE_4K) {
                return;
            }
            c1827d.m33989u().m34054a("menu_album", "off");
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view.getId() == C1704R.C1706id.btn_switch_mode) {
            this.f13432q.mo28149a();
        } else if (view.getId() == C1704R.C1706id.btn_shutter_camera) {
            if (!((C1827d) C1783b.m34166a().m34150d()).s()) {
                C1688z.m34449a(this, (int) C1704R.C1707string.no_connect_camera, 3000);
                return;
            }
            this.f13432q.mo28135c();
            this.f13419d.setEnabled(false);
            getViewManager().mo34440a();
        } else if (view.getId() == C1704R.C1706id.btn_shutter_record) {
            if (!((C1827d) C1783b.m34166a().m34150d()).s()) {
                C1688z.m34449a(this, (int) C1704R.C1707string.no_connect_camera, 3000);
                return;
            }
            this.f13432q.mo28139b();
            this.f13420e.setEnabled(false);
            getViewManager().mo34440a();
        } else if (view.getId() == C1704R.C1706id.ibtn_thumbnail) {
            this.f13432q.mo28133d();
        } else if (view.getId() == C1704R.C1706id.setting_iv) {
            this.f13432q.mo28132e();
        } else if (view.getId() != C1704R.C1706id.rl_capture) {
        } else {
            this.f13422g.setEnabled(false);
            this.f13432q.mo28131f();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.fimi.x1bh.module.X1bhBaseActivity, com.fimi.soul.base.BaseActivity, com.fimi.soul.base.BaseFimiActivity, com.fimi.kernel.BaseActivity, android.support.p001v4.app.FragmentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C1704R.layout.activity_cloud_terrace_main);
        this.dpa.m34274d();
        this.dpa.m34276b(this);
        m28163j();
        m28164i();
        m28177a();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.fimi.x1bh.module.X1bhBaseActivity, com.fimi.soul.base.BaseActivity, com.fimi.soul.base.BaseFimiActivity, com.fimi.kernel.BaseActivity, android.support.p001v4.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        if (this.f13435t != null) {
            this.f13435t.m28245a();
        }
    }

    @Override // com.fimi.kernel.BaseActivity
    public void onHandleMessage(Message message) {
        super.onHandleMessage(message);
        this.f13434s = false;
    }

    @Override // android.support.p001v4.app.FragmentActivity, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i == 4) {
            m28162k();
            return false;
        }
        return super.onKeyDown(i, keyEvent);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.fimi.soul.base.BaseActivity, com.fimi.kernel.BaseActivity, android.support.p001v4.app.FragmentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
        ((C3364b) this.f13432q).m28127j();
        this.f13432q.mo28130g();
    }

    @Override // com.fimi.soul.base.BaseActivity, android.support.p001v4.app.FragmentActivity, android.app.Activity
    public void onStop() {
        super.onStop();
        if (this.f13435t != null) {
            Log.d(f13415x, "onStart: ");
            this.f13435t.m28239d();
        }
    }
}
