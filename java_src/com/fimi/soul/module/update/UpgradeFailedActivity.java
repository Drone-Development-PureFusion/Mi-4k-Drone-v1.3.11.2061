package com.fimi.soul.module.update;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.fimi.kernel.utils.C1681v;
import com.fimi.overseas.soul.C1704R;
import com.fimi.soul.base.BaseActivity;
import com.fimi.soul.base.C1756a;
import com.fimi.soul.drone.p201e.C2262o;
import com.fimi.soul.module.droneui.FlightActivity;
import com.fimi.soul.utils.C3103au;
/* loaded from: classes.dex */
public class UpgradeFailedActivity extends BaseActivity implements View.OnClickListener {

    /* renamed from: a */
    private TextView f11123a;

    /* renamed from: b */
    private TextView f11124b;

    /* renamed from: c */
    private Button f11125c;

    /* renamed from: d */
    private Button f11126d;

    /* renamed from: e */
    private ImageView f11127e;

    /* renamed from: f */
    private Boolean f11128f;

    /* renamed from: g */
    private Boolean f11129g;

    /* renamed from: h */
    private C1681v f11130h;

    /* renamed from: a */
    public void m29677a() {
        C2262o.f7109a.f6364d = (byte) 0;
        C2262o.f7109a.f6365e = (byte) 2;
        this.drone.mo32906ab().mo32587a(C2262o.f7109a.mo32762b());
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        switch (view.getId()) {
            case C1704R.C1706id.retry_btn /* 2131755262 */:
                if (!this.drone.mo32906ab().mo32588a()) {
                    finish();
                    return;
                }
                startActivity(new Intent(this, UpgradingActivity.class));
                finish();
                overridePendingTransition(17432576, 17432577);
                return;
            case C1704R.C1706id.noconnect_bt /* 2131755425 */:
                if (!this.f11128f.booleanValue()) {
                    startActivity(new Intent(this, FlightActivity.class));
                    return;
                }
                C1681v.m34543a(this).m34546a().edit().putBoolean(C1756a.f4517J, true).commit();
                this.dpa.m34274d();
                return;
            default:
                return;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.fimi.soul.base.BaseActivity, com.fimi.soul.base.BaseFimiActivity, com.fimi.kernel.BaseActivity, android.support.p001v4.app.FragmentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.dpa.m34276b(this);
        this.f11130h = C1681v.m34543a(this);
        getWindow().setFlags(128, 128);
        this.f11128f = Boolean.valueOf(this.f11130h.m34546a().getBoolean(C1756a.f4519L, false));
        setContentView(C1704R.layout.activity_upgrade_failed);
        this.f11123a = (TextView) findViewById(C1704R.C1706id.upgradeResult);
        C3103au.m29232a(getAssets(), this.f11123a);
        this.f11124b = (TextView) findViewById(C1704R.C1706id.failedText);
        C3103au.m29232a(getAssets(), this.f11124b);
        this.f11126d = (Button) findViewById(C1704R.C1706id.noconnect_bt);
        this.f11126d.setOnClickListener(this);
        this.f11125c = (Button) findViewById(C1704R.C1706id.retry_btn);
        this.f11125c.setOnClickListener(this);
        this.f11127e = (ImageView) findViewById(C1704R.C1706id.upgrade_iv);
        this.f11129g = Boolean.valueOf(getIntent().getBooleanExtra(C1756a.f4517J, true));
        if (!this.f11129g.booleanValue()) {
            this.f11124b.setText(getIntent().getStringExtra("reson"));
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.fimi.soul.base.BaseActivity, com.fimi.soul.base.BaseFimiActivity, com.fimi.kernel.BaseActivity, android.support.p001v4.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        m29677a();
    }
}
