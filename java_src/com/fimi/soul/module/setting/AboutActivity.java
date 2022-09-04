package com.fimi.soul.module.setting;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Message;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.fimi.kernel.C1642c;
import com.fimi.overseas.soul.C1704R;
import com.fimi.soul.base.BaseActivity;
import com.fimi.soul.base.C1756a;
import com.fimi.soul.base.DroidPlannerApp;
import com.fimi.soul.biz.camera.C1783b;
import com.fimi.soul.biz.camera.C1827d;
import com.fimi.soul.biz.p170b.C1769c;
import com.fimi.soul.biz.p170b.C1772d;
import com.fimi.soul.biz.p189q.C2027a;
import com.fimi.soul.drone.C2083a;
import com.fimi.soul.drone.C2104d;
import com.fimi.soul.module.update.C3029b;
import com.fimi.soul.module.update.p218a.C3022b;
import com.fimi.soul.module.update.p218a.C3027g;
import com.fimi.soul.utils.C3103au;
import com.google.android.gms.drive.AbstractC4808e;
/* loaded from: classes.dex */
public class AboutActivity extends BaseActivity implements View.OnClickListener, C2104d.AbstractC2106b {

    /* renamed from: F */
    private static final int f10102F = 1;

    /* renamed from: G */
    private static final int f10103G = 0;

    /* renamed from: H */
    private static final int f10104H = 1;

    /* renamed from: A */
    private TextView f10105A;

    /* renamed from: B */
    private TextView f10106B;

    /* renamed from: C */
    private TextView f10107C;

    /* renamed from: D */
    private TextView f10108D;

    /* renamed from: E */
    private C1827d f10109E;

    /* renamed from: I */
    private int f10110I = 0;

    /* renamed from: J */
    private C2083a f10111J;

    /* renamed from: a */
    C3027g f10112a;

    /* renamed from: b */
    private Button f10113b;

    /* renamed from: c */
    private Button f10114c;

    /* renamed from: d */
    private TextView f10115d;

    /* renamed from: e */
    private TextView f10116e;

    /* renamed from: f */
    private ImageView f10117f;

    /* renamed from: g */
    private TextView f10118g;

    /* renamed from: h */
    private C3022b f10119h;

    /* renamed from: i */
    private TextView f10120i;

    /* renamed from: j */
    private TextView f10121j;

    /* renamed from: k */
    private TextView f10122k;

    /* renamed from: l */
    private TextView f10123l;

    /* renamed from: m */
    private TextView f10124m;

    /* renamed from: n */
    private TextView f10125n;

    /* renamed from: o */
    private TextView f10126o;

    /* renamed from: p */
    private TextView f10127p;

    /* renamed from: q */
    private TextView f10128q;

    /* renamed from: r */
    private TextView f10129r;

    /* renamed from: s */
    private TextView f10130s;

    /* renamed from: t */
    private TextView f10131t;

    /* renamed from: u */
    private TextView f10132u;

    /* renamed from: v */
    private TextView f10133v;

    /* renamed from: w */
    private TextView f10134w;

    /* renamed from: x */
    private TextView f10135x;

    /* renamed from: y */
    private TextView f10136y;

    /* renamed from: z */
    private TextView f10137z;

    /* renamed from: a */
    private String m30159a(int i) {
        return String.valueOf(i);
    }

    /* renamed from: a */
    private void m30160a() {
        this.f10113b = (Button) findViewById(C1704R.C1706id.aboutBtn);
        this.f10113b.setOnClickListener(new View.OnClickListener() { // from class: com.fimi.soul.module.setting.AboutActivity.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                AboutActivity.this.finish();
            }
        });
    }

    /* renamed from: b */
    private void m30158b() {
        this.f10118g = (TextView) findViewById(C1704R.C1706id.copyright);
        this.f10115d = (TextView) findViewById(C1704R.C1706id.aboutVersion);
        this.f10116e = (TextView) findViewById(C1704R.C1706id.agreementshengming_tv);
        this.f10116e.setOnClickListener(this);
        this.f10116e.getPaint().setFlags(8);
        this.f10116e.getPaint().setAntiAlias(true);
        this.f10115d.setText(getString(C1704R.C1707string.about_version, new Object[]{C3103au.m29209d(this)}));
        this.f10114c = (Button) findViewById(C1704R.C1706id.scoreBtn);
        this.f10114c.setOnClickListener(new View.OnClickListener() { // from class: com.fimi.soul.module.setting.AboutActivity.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("https://play.google.com/store/apps/details?id=" + AboutActivity.this.getPackageName()));
                intent.addFlags(AbstractC4808e.f17570a_);
                AboutActivity.this.startActivity(intent);
            }
        });
        this.f10117f = (ImageView) findViewById(C1704R.C1706id.aboutImg);
        this.f10124m = (TextView) findViewById(C1704R.C1706id.tv_camera);
        this.f10120i = (TextView) findViewById(C1704R.C1706id.tv_fc);
        this.f10122k = (TextView) findViewById(C1704R.C1706id.tv_x2);
        this.f10121j = (TextView) findViewById(C1704R.C1706id.tv_battery);
        this.f10123l = (TextView) findViewById(C1704R.C1706id.tv_rc);
        this.f10125n = (TextView) findViewById(C1704R.C1706id.tv_gimbal);
        this.f10126o = (TextView) findViewById(C1704R.C1706id.tv_servo);
        this.f10127p = (TextView) findViewById(C1704R.C1706id.tv_nofly);
        this.f10131t = (TextView) findViewById(C1704R.C1706id.tv_fc_tip);
        this.f10132u = (TextView) findViewById(C1704R.C1706id.tv_battery_tip);
        this.f10133v = (TextView) findViewById(C1704R.C1706id.tv_x2_tip);
        this.f10134w = (TextView) findViewById(C1704R.C1706id.tv_rc_tip);
        this.f10135x = (TextView) findViewById(C1704R.C1706id.tv_camera_tip);
        this.f10136y = (TextView) findViewById(C1704R.C1706id.tv_gimbal_tip);
        this.f10137z = (TextView) findViewById(C1704R.C1706id.tv_servo_tip);
        this.f10105A = (TextView) findViewById(C1704R.C1706id.tv_nofly_tip);
        this.f10128q = (TextView) findViewById(C1704R.C1706id.tv_rc_x6);
        this.f10129r = (TextView) findViewById(C1704R.C1706id.tv_fc_x6);
        this.f10106B = (TextView) findViewById(C1704R.C1706id.tv_fc_x6_tip);
        this.f10107C = (TextView) findViewById(C1704R.C1706id.tv_rc_x6_tip);
        if (!C1772d.m34208a().m34187k()) {
            this.f10106B.setVisibility(8);
            this.f10129r.setVisibility(8);
        }
        this.f10108D = (TextView) findViewById(C1704R.C1706id.tv_fc_bootloader_tip);
        this.f10130s = (TextView) findViewById(C1704R.C1706id.tv_fc_bootloader_version);
        this.f10130s.setVisibility(8);
        this.f10108D.setVisibility(8);
        this.f10112a = new C3027g(this, this.f10111J);
    }

    /* renamed from: c */
    private void m30157c() {
        C2027a m33210a = C2027a.m33210a();
        this.f10119h = (C3022b) C1642c.m34887c().mo34880a(C3029b.f11258C, C3022b.class);
        if (this.f10119h != null && this.f10119h.m29602b() > 0) {
            this.f10123l.setText(m30159a(this.f10119h.m29602b()) + m33210a.m33204b(1));
        } else if (this.f10110I == 1) {
            this.f10123l.setText(C1704R.C1707string.no_get_versin);
        }
        if (this.f10119h != null && this.f10119h.m29604a() > 0) {
            this.f10120i.setText(m30159a(this.f10119h.m29604a()) + m33210a.m33204b(0));
        } else if (this.f10110I == 1) {
            this.f10120i.setText(C1704R.C1707string.no_get_versin);
        }
        if (this.f10119h != null && this.f10119h.m29600c() > 0) {
            this.f10125n.setText(m30159a(this.f10119h.m29600c()) + m33210a.m33204b(3));
        } else if (this.f10110I == 1) {
            this.f10125n.setText(C1704R.C1707string.no_get_versin);
        }
        if (this.f10119h != null && this.f10119h.m29590h() > 0) {
            this.f10126o.setText(m30159a(this.f10119h.m29590h()) + m33210a.m33204b(6));
        } else if (this.f10110I == 1) {
            this.f10126o.setText(C1704R.C1707string.no_get_versin);
        }
        if (this.f10119h != null && this.f10119h.m29594f() > 0) {
            this.f10122k.setText(m30159a(this.f10119h.m29594f()) + m33210a.m33204b(9));
        } else if (this.f10110I == 1) {
            this.f10122k.setText(C1704R.C1707string.no_get_versin);
        }
        if (this.f10119h != null && this.f10119h.m29592g() > 0) {
            this.f10127p.setText(m30159a(this.f10119h.m29592g()) + m33210a.m33204b(10));
        } else if (this.f10110I == 1) {
            this.f10127p.setText(C1704R.C1707string.no_get_versin);
        }
        if (this.f10119h != null && this.f10119h.m29596e() > 0) {
            this.f10128q.setText(m30159a(this.f10119h.m29596e()) + m33210a.m33204b(10));
        } else if (this.f10110I == 1) {
            this.f10128q.setText(C1704R.C1707string.no_get_versin);
        }
        if (this.f10119h != null && this.f10119h.m29578n() > 0) {
            this.f10124m.setText(this.f10119h.m29578n() + "" + m33210a.m33204b(4));
        } else if (this.f10110I == 1) {
            this.f10124m.setText(C1704R.C1707string.no_get_versin);
        }
        if (!TextUtils.isEmpty(C1769c.m34218a().m34210e()) && Integer.valueOf(C1769c.m34218a().m34210e()).intValue() > 0) {
            this.f10129r.setText(C1769c.m34218a().m34210e() + "");
        } else if (this.f10110I == 1) {
            this.f10129r.setText(C1704R.C1707string.no_get_versin);
        }
        if (this.f10119h != null && this.f10119h.m29582l() > 0) {
            this.f10121j.setText(m30159a(this.f10119h.m29582l()));
        } else if (this.f10110I == 1) {
            this.f10121j.setText(C1704R.C1707string.no_get_versin);
        }
        if (this.f10119h != null && this.f10119h.m29576o() > 0) {
            this.f10130s.setText(m30159a(this.f10119h.m29576o()));
        } else if (this.f10110I == 1) {
            this.f10130s.setText(C1704R.C1707string.no_get_versin);
        }
        if (this.f10110I != 1) {
            m30156d();
        }
    }

    /* renamed from: d */
    private void m30156d() {
        this.f10110I = 1;
        new Thread(new Runnable() { // from class: com.fimi.soul.module.setting.AboutActivity.3
            @Override // java.lang.Runnable
            public void run() {
                AboutActivity.this.f10112a.m29531d();
            }
        }).start();
        getHandler().sendEmptyMessageDelayed(1, 2200L);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        switch (view.getId()) {
            case C1704R.C1706id.agreementshengming_tv /* 2131755245 */:
                Intent intent = new Intent(this, ShowTextActivity.class);
                intent.putExtra(ShowTextActivity.f10328c, C1756a.f4549h);
                intent.putExtra(ShowTextActivity.f10326a, C1704R.C1707string.agreement_shengming);
                intent.putExtra(ShowTextActivity.f10327b, "file:///android_asset/statement.html");
                startActivity(intent);
                return;
            default:
                return;
        }
    }

    @Override // com.fimi.soul.base.BaseActivity, com.fimi.soul.base.BaseFimiActivity, com.fimi.kernel.BaseActivity, android.support.p001v4.app.FragmentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C1704R.layout.activity_about);
        this.f10111J = ((DroidPlannerApp) getApplication()).f4493a;
        this.f10109E = (C1827d) C1783b.m34166a().m34150d();
        m30160a();
        m30158b();
        m30157c();
        C3103au.m29232a(getAssets(), this.f10115d, this.f10116e, this.f10113b, this.f10118g, this.f10120i, this.f10121j, this.f10122k, this.f10123l, this.f10124m, this.f10125n, this.f10126o, this.f10127p, this.f10131t, this.f10132u, this.f10133v, this.f10134w, this.f10135x, this.f10136y, this.f10137z, this.f10105A, this.f10128q, this.f10129r, this.f10106B, this.f10107C);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.fimi.soul.base.BaseActivity, com.fimi.soul.base.BaseFimiActivity, com.fimi.kernel.BaseActivity, android.support.p001v4.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.f10111J.mo32903b(this);
        if (this.f10112a != null) {
            this.f10112a.m29530e();
        }
    }

    @Override // com.fimi.soul.base.BaseActivity, com.fimi.soul.drone.C2104d.AbstractC2106b
    public void onDroneEvent(C2104d.EnumC2105a enumC2105a, C2083a c2083a) {
        super.onDroneEvent(enumC2105a, c2083a);
        if (enumC2105a == C2104d.EnumC2105a.ENDQUESTNOTIFY) {
            m30157c();
        }
    }

    @Override // com.fimi.kernel.BaseActivity
    public void onHandleMessage(Message message) {
        if (message.what == 1) {
            m30157c();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.fimi.soul.base.BaseActivity, com.fimi.kernel.BaseActivity, android.support.p001v4.app.FragmentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
        this.f10111J.mo32908a(this);
    }
}
