package com.fimi.soul.module.remote;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.fimi.kernel.utils.C1681v;
import com.fimi.kernel.utils.C1688z;
import com.fimi.kernel.view.percent.PercentRelativeLayout;
import com.fimi.overseas.soul.C1704R;
import com.fimi.soul.base.BaseActivity;
import com.fimi.soul.drone.C2083a;
import com.fimi.soul.drone.C2104d;
import com.fimi.soul.module.calibcompass.C2540a;
import com.fimi.soul.module.p214c.C2523d;
import com.fimi.soul.utils.C3103au;
import com.fimi.soul.view.DialogC3245f;
/* loaded from: classes.dex */
public class RemoteModelActivity extends BaseActivity implements View.OnClickListener, C2104d.AbstractC2106b {

    /* renamed from: a */
    public static final String f10053a = "remodel";

    /* renamed from: n */
    private static final String f10054n = "RemoteModelActivity";

    /* renamed from: b */
    private PercentRelativeLayout f10055b;

    /* renamed from: c */
    private Button f10056c;

    /* renamed from: d */
    private Button f10057d;

    /* renamed from: e */
    private Button f10058e;

    /* renamed from: f */
    private TextView f10059f;

    /* renamed from: g */
    private TextView f10060g;

    /* renamed from: h */
    private TextView f10061h;

    /* renamed from: i */
    private ImageView f10062i;

    /* renamed from: j */
    private ImageView f10063j;

    /* renamed from: k */
    private C2523d f10064k;

    /* renamed from: l */
    private boolean f10065l;

    /* renamed from: m */
    private C1681v f10066m;

    /* renamed from: a */
    private void m30169a() {
        this.f10065l = false;
        this.f10062i.setImageResource(C1704R.C1705drawable.switchover_japan_right);
        this.f10063j.setImageResource(C1704R.C1705drawable.switchover_japan__leftbg);
        m30168a(this.f10058e, 75);
        m30168a(this.f10057d, 255);
        this.f10058e.setBackgroundResource(C1704R.C1705drawable.btn_switchover_left);
        this.f10057d.setBackgroundResource(C1704R.C1705drawable.btn_switchover_right_on);
    }

    /* renamed from: b */
    private void m30166b() {
        this.f10065l = true;
        this.f10062i.setImageResource(C1704R.C1705drawable.switchover_usa_right_bg);
        this.f10063j.setImageResource(C1704R.C1705drawable.switchover_usa_left_bg);
        m30168a(this.f10058e, 255);
        m30168a(this.f10057d, 75);
        this.f10058e.setBackgroundResource(C1704R.C1705drawable.btn_switchover_left_on);
        this.f10057d.setBackgroundResource(C1704R.C1705drawable.btn_switchover_right);
    }

    /* renamed from: a */
    public void m30168a(Button button, int i) {
        button.setTextColor(button.getTextColors().withAlpha(i));
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        switch (view.getId()) {
            case C1704R.C1706id.usabutton /* 2131755754 */:
                if (this.f10065l) {
                    return;
                }
                if (!this.drone.mo32906ab().mo32588a()) {
                    C1688z.m34447a(this, getString(C1704R.C1707string.switch_mode_fail_please_connect_remote), C1688z.f4191b);
                    return;
                } else if (this.drone.mo32905ac()) {
                    C1688z.m34447a(this, getString(C1704R.C1707string.close_plane_switch_rocket), C1688z.f4191b);
                    return;
                } else {
                    new DialogC3245f.C3246a(this).m28641a(getString(C1704R.C1707string.choose_recoker_mode_msg)).m28633c(17).m28644a(getResources().getColor(C1704R.color.dialog_ensure_hot)).m28634b(getString(C1704R.C1707string.ensure), new DialogInterface.OnClickListener() { // from class: com.fimi.soul.module.remote.RemoteModelActivity.2
                        @Override // android.content.DialogInterface.OnClickListener
                        public void onClick(DialogInterface dialogInterface, int i) {
                            RemoteModelActivity.this.f10064k.m31360h();
                        }
                    }).m28640a(getString(C1704R.C1707string.cancel), new DialogInterface.OnClickListener() { // from class: com.fimi.soul.module.remote.RemoteModelActivity.1
                        @Override // android.content.DialogInterface.OnClickListener
                        public void onClick(DialogInterface dialogInterface, int i) {
                        }
                    }).m28645a().show();
                    return;
                }
            case C1704R.C1706id.jpabutton /* 2131755755 */:
                if (!this.f10065l) {
                    return;
                }
                if (!this.drone.mo32906ab().mo32588a()) {
                    C1688z.m34447a(this, getString(C1704R.C1707string.switch_mode_fail_please_connect_remote), C1688z.f4191b);
                    return;
                } else if (this.drone.mo32905ac()) {
                    C1688z.m34447a(this, getString(C1704R.C1707string.close_plane_switch_rocket), C1688z.f4191b);
                    return;
                } else {
                    new DialogC3245f.C3246a(this).m28641a(getString(C1704R.C1707string.choose_recoker_mode_msg)).m28633c(17).m28644a(getResources().getColor(C1704R.color.dialog_ensure_hot)).m28634b(getString(C1704R.C1707string.ensure), new DialogInterface.OnClickListener() { // from class: com.fimi.soul.module.remote.RemoteModelActivity.4
                        @Override // android.content.DialogInterface.OnClickListener
                        public void onClick(DialogInterface dialogInterface, int i) {
                            RemoteModelActivity.this.f10064k.m31359i();
                        }
                    }).m28640a(getString(C1704R.C1707string.cancel), new DialogInterface.OnClickListener() { // from class: com.fimi.soul.module.remote.RemoteModelActivity.3
                        @Override // android.content.DialogInterface.OnClickListener
                        public void onClick(DialogInterface dialogInterface, int i) {
                        }
                    }).m28645a().show();
                    return;
                }
            case C1704R.C1706id.black_btn /* 2131756179 */:
                finish();
                return;
            default:
                return;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.fimi.soul.base.BaseActivity, com.fimi.soul.base.BaseFimiActivity, com.fimi.kernel.BaseActivity, android.support.p001v4.app.FragmentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C1704R.layout.droneremotemodel);
        getWindow().setFlags(128, 128);
        this.f10055b = (PercentRelativeLayout) findViewById(C1704R.C1706id.heardView);
        this.f10056c = (Button) this.f10055b.findViewById(C1704R.C1706id.black_btn);
        this.f10056c.setOnClickListener(this);
        this.f10058e = (Button) findViewById(C1704R.C1706id.usabutton);
        this.f10058e.setOnClickListener(this);
        this.f10057d = (Button) findViewById(C1704R.C1706id.jpabutton);
        this.f10057d.setOnClickListener(this);
        this.f10062i = (ImageView) findViewById(C1704R.C1706id.remoteviewright);
        this.f10063j = (ImageView) findViewById(C1704R.C1706id.remoteviewleft);
        this.f10059f = (TextView) findViewById(C1704R.C1706id.tv_settingTitle);
        this.f10060g = (TextView) findViewById(C1704R.C1706id.leftremotetext);
        this.f10061h = (TextView) findViewById(C1704R.C1706id.rightremotetext);
        this.f10059f.setText(C1704R.C1707string.switch_remote_mode);
        C3103au.m29232a(getAssets(), this.f10059f, this.f10060g, this.f10061h, this.f10058e, this.f10057d);
        this.f10066m = C1681v.m34543a(this);
        if (this.f10066m.m34546a().getInt(f10053a, 0) == 0) {
            m30166b();
        } else {
            m30169a();
        }
        this.f10064k = C2523d.m31374a(this.drone);
    }

    @Override // com.fimi.soul.base.BaseActivity, com.fimi.soul.drone.C2104d.AbstractC2106b
    public void onDroneEvent(C2104d.EnumC2105a enumC2105a, C2083a c2083a) {
        super.onDroneEvent(enumC2105a, c2083a);
        switch (enumC2105a) {
            case backControl:
                C2540a.m31307a().m31305a("98");
                if (c2083a.mo32918R().m32031b() != 114 || c2083a.mo32918R().m32030c() != 2) {
                    return;
                }
                if (c2083a.mo32918R().m32029d() == 2) {
                    this.f10066m.m34546a().edit().putInt(f10053a, 1).commit();
                    m30169a();
                    return;
                } else if (c2083a.mo32918R().m32029d() != 1) {
                    return;
                } else {
                    this.f10066m.m34546a().edit().putInt(f10053a, 0).commit();
                    m30166b();
                    return;
                }
            default:
                return;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.fimi.soul.base.BaseActivity, com.fimi.kernel.BaseActivity, android.support.p001v4.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        this.drone.mo32908a(this);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.fimi.soul.base.BaseActivity, android.support.p001v4.app.FragmentActivity, android.app.Activity
    public void onStop() {
        super.onStop();
        this.drone.mo32903b(this);
    }
}
