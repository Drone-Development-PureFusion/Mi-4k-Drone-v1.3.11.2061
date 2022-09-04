package com.fimi.x1bh.module.about;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Message;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.fimi.kernel.C1642c;
import com.fimi.overseas.soul.C1704R;
import com.fimi.p140a.p145e.C1508c;
import com.fimi.p149d.p150a.C1529d;
import com.fimi.p155h.C1562a;
import com.fimi.soul.biz.p189q.C2027a;
import com.fimi.soul.module.update.C3029b;
import com.fimi.soul.module.update.p218a.C3022b;
import com.fimi.soul.utils.C3103au;
import com.fimi.x1bh.module.X1bhBaseActivity;
import com.google.android.gms.drive.AbstractC4808e;
/* loaded from: classes.dex */
public class CloudAboutActivity extends X1bhBaseActivity {

    /* renamed from: l */
    private static final int f13299l = 1;

    /* renamed from: m */
    private static final int f13300m = 0;

    /* renamed from: n */
    private static final int f13301n = 1;

    /* renamed from: r */
    private static final int f13302r = 5000;

    /* renamed from: s */
    private static final int f13303s = 153;

    /* renamed from: a */
    private TextView f13304a;

    /* renamed from: b */
    private TextView f13305b;

    /* renamed from: c */
    private TextView f13306c;

    /* renamed from: d */
    private TextView f13307d;

    /* renamed from: e */
    private TextView f13308e;

    /* renamed from: f */
    private TextView f13309f;

    /* renamed from: g */
    private TextView f13310g;

    /* renamed from: h */
    private TextView f13311h;

    /* renamed from: i */
    private Button f13312i;

    /* renamed from: j */
    private Button f13313j;

    /* renamed from: k */
    private C3022b f13314k;

    /* renamed from: o */
    private int f13315o = 0;

    /* renamed from: p */
    private TextView f13316p;

    /* renamed from: q */
    private C1562a f13317q;

    /* renamed from: a */
    private String m28234a(int i) {
        return String.valueOf(i);
    }

    /* renamed from: a */
    private void m28235a() {
        this.f13304a = (TextView) findViewById(C1704R.C1706id.tv_camera);
        this.f13305b = (TextView) findViewById(C1704R.C1706id.tv_gimbal);
        this.f13306c = (TextView) findViewById(C1704R.C1706id.tv_servo);
        this.f13307d = (TextView) findViewById(C1704R.C1706id.tv_handle);
        this.f13308e = (TextView) findViewById(C1704R.C1706id.tv_camera_tip);
        this.f13309f = (TextView) findViewById(C1704R.C1706id.tv_gimbal_tip);
        this.f13310g = (TextView) findViewById(C1704R.C1706id.tv_servo_tip);
        this.f13311h = (TextView) findViewById(C1704R.C1706id.tv_handle_tip);
        this.f13316p = (TextView) findViewById(C1704R.C1706id.aboutVersion);
        C3103au.m29232a(getAssets(), this.f13316p, this.f13304a, this.f13305b, this.f13306c, this.f13307d, this.f13308e, this.f13309f, this.f13310g, this.f13311h);
    }

    /* renamed from: b */
    private void m28233b() {
        this.f13316p.setText(getString(C1704R.C1707string.about_version, new Object[]{C3103au.m29209d(this)}));
        m28232c();
        this.f13317q = new C1562a();
        this.f13317q.m35145b();
        getHandler().sendEmptyMessageDelayed(153, 5000L);
        this.f13312i = (Button) findViewById(C1704R.C1706id.scoreBtn);
        this.f13312i.setOnClickListener(new View.OnClickListener() { // from class: com.fimi.x1bh.module.about.CloudAboutActivity.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("https://play.google.com/store/apps/details?id=" + CloudAboutActivity.this.getPackageName()));
                intent.addFlags(AbstractC4808e.f17570a_);
                CloudAboutActivity.this.startActivity(intent);
            }
        });
        this.f13313j = (Button) findViewById(C1704R.C1706id.aboutBtn);
        this.f13313j.setOnClickListener(new View.OnClickListener() { // from class: com.fimi.x1bh.module.about.CloudAboutActivity.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                CloudAboutActivity.this.finish();
            }
        });
    }

    /* renamed from: c */
    private void m28232c() {
        C2027a.m33210a();
        this.f13314k = (C3022b) C1642c.m34887c().mo34880a(C3029b.f11258C, C3022b.class);
        if (this.f13314k != null && this.f13314k.m29600c() > 0) {
            this.f13305b.setText(m28234a(this.f13314k.m29600c()));
        } else if (this.f13315o == 1) {
            this.f13305b.setText(C1704R.C1707string.no_get_versin);
        }
        if (this.f13314k != null && this.f13314k.m29590h() > 0) {
            this.f13306c.setText(m28234a(this.f13314k.m29590h()));
        } else if (this.f13315o == 1) {
            this.f13306c.setText(C1704R.C1707string.no_get_versin);
        }
        if (this.f13314k != null && this.f13314k.m29578n() > 0) {
            this.f13304a.setText(m28234a(this.f13314k.m29578n()));
        } else if (this.f13315o == 1) {
            this.f13304a.setText(C1704R.C1707string.no_get_versin);
        }
        if (this.f13314k != null && this.f13314k.m29578n() > 0) {
            this.f13307d.setText(m28234a(this.f13314k.m29575p()));
        } else if (this.f13315o != 1) {
        } else {
            this.f13307d.setText(C1704R.C1707string.no_get_versin);
        }
    }

    @Override // com.fimi.x1bh.module.X1bhBaseActivity, com.fimi.p148c.AbstractC1523b
    /* renamed from: a */
    public void mo28086a(int i, C1508c c1508c) {
        super.mo28086a(i, c1508c);
        if (c1508c.m35463g() instanceof C1529d) {
            m28232c();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.fimi.x1bh.module.X1bhBaseActivity, com.fimi.soul.base.BaseActivity, com.fimi.soul.base.BaseFimiActivity, com.fimi.kernel.BaseActivity, android.support.p001v4.app.FragmentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C1704R.layout.activity_cloud_about);
        this.dpa.m34276b(this);
        m28235a();
        m28233b();
    }

    @Override // com.fimi.kernel.BaseActivity
    public void onHandleMessage(Message message) {
        super.onHandleMessage(message);
        if (message.what == 153) {
            this.f13315o = 1;
            m28232c();
        }
    }
}
