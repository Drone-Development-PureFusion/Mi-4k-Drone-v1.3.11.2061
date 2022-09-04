package com.fimi.soul.module.update;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.fimi.kernel.utils.C1681v;
import com.fimi.kernel.utils.C1688z;
import com.fimi.overseas.soul.C1704R;
import com.fimi.soul.base.BaseActivity;
import com.fimi.soul.base.C1756a;
import com.fimi.soul.module.droneui.FlightActivity;
import com.fimi.soul.utils.C3103au;
/* loaded from: classes.dex */
public class DownFailedActivity extends BaseActivity implements View.OnClickListener {

    /* renamed from: a */
    private TextView f11024a;

    /* renamed from: b */
    private TextView f11025b;

    /* renamed from: c */
    private Button f11026c;

    /* renamed from: d */
    private Button f11027d;

    /* renamed from: e */
    private ImageView f11028e;

    /* renamed from: f */
    private Boolean f11029f;

    /* renamed from: g */
    private Boolean f11030g;

    /* renamed from: h */
    private C1681v f11031h;

    /* renamed from: i */
    private String f11032i = C1756a.f4519L;

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        switch (view.getId()) {
            case C1704R.C1706id.download_later /* 2131755261 */:
                if (!this.f11029f.booleanValue()) {
                    startActivity(new Intent(this, FlightActivity.class));
                    return;
                }
                this.f11031h.m34546a().edit().putBoolean(C1756a.f4517J, true).commit();
                this.dpa.m34274d();
                return;
            case C1704R.C1706id.retry_btn /* 2131755262 */:
                if (!C3103au.m29221b(this)) {
                    C1688z.m34450a(this, (int) C1704R.C1707string.no_available_network);
                    return;
                }
                startActivity(new Intent(this, DowningActivity.class));
                finish();
                overridePendingTransition(17432576, 17432577);
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
        this.f11031h = C1681v.m34543a(this);
        this.f11032i = C1756a.f4519L;
        getWindow().setFlags(128, 128);
        this.f11029f = Boolean.valueOf(this.f11031h.m34546a().getBoolean(this.f11032i, false));
        setContentView(C1704R.layout.activity_down_failed);
        this.f11024a = (TextView) findViewById(C1704R.C1706id.downResult);
        this.f11025b = (TextView) findViewById(C1704R.C1706id.downFailedText);
        C3103au.m29232a(getAssets(), this.f11024a, this.f11025b);
        this.f11027d = (Button) findViewById(C1704R.C1706id.download_later);
        this.f11027d.setOnClickListener(this);
        this.f11026c = (Button) findViewById(C1704R.C1706id.retry_btn);
        this.f11026c.setOnClickListener(this);
        this.f11028e = (ImageView) findViewById(C1704R.C1706id.upgrade_iv);
        this.f11030g = Boolean.valueOf(getIntent().getBooleanExtra(C1756a.f4517J, true));
        this.f11025b.setText(getIntent().getStringExtra("DownLoadFailedInfo"));
    }
}
