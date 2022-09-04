package com.fimi.soul.module.setting.GimalCalibration;

import android.content.Intent;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.fimi.kernel.p165d.C1648b;
import com.fimi.kernel.view.percent.PercentRelativeLayout;
import com.fimi.overseas.soul.C1704R;
import com.fimi.soul.base.BaseActivity;
import com.fimi.soul.utils.C3103au;
import it.p273a.p274a.AbstractC10866e;
/* loaded from: classes.dex */
public class ResultCalibrationActivity extends BaseActivity implements View.OnClickListener {

    /* renamed from: a */
    public static final int f10209a = 0;

    /* renamed from: b */
    public static final int f10210b = 1;

    /* renamed from: c */
    public static final String f10211c = "calibration_result";

    /* renamed from: d */
    public static final String f10212d = "calibration_result_reson";

    /* renamed from: e */
    private TextView f10213e;

    /* renamed from: f */
    private Button f10214f;

    /* renamed from: g */
    private Button f10215g;

    /* renamed from: h */
    private Button f10216h;

    /* renamed from: i */
    private Button f10217i;

    /* renamed from: j */
    private ImageView f10218j;

    /* renamed from: k */
    private TextView f10219k;

    /* renamed from: l */
    private TextView f10220l;

    /* renamed from: m */
    private int f10221m;

    /* renamed from: a */
    private void m30132a() {
        Intent intent = getIntent();
        if (intent != null) {
            int intExtra = intent.getIntExtra(f10211c, 0);
            String stringExtra = intent.getStringExtra(f10212d);
            if (intExtra == 1) {
                this.f10219k.setText(C1704R.C1707string.califail);
                C1648b.m34863b(this).m34867a(getString(C1704R.C1707string.calibration_failure));
                if (stringExtra != null) {
                    this.f10220l.setText(stringExtra);
                }
                PercentRelativeLayout.LayoutParams layoutParams = (PercentRelativeLayout.LayoutParams) this.f10218j.getLayoutParams();
                layoutParams.setMargins(0, (int) (this.f10221m * 0.12592f), 0, 0);
                this.f10218j.setLayoutParams(layoutParams);
                this.f10218j.setImageResource(C1704R.C1705drawable.icon_calibration_defeat);
                m30129c();
                return;
            }
            this.f10219k.setText(getString(C1704R.C1707string.calisucess));
            C1648b.m34863b(this).m34867a(getString(C1704R.C1707string.calisucess));
            if (stringExtra != null) {
                this.f10220l.setText("");
            }
            PercentRelativeLayout.LayoutParams layoutParams2 = (PercentRelativeLayout.LayoutParams) this.f10218j.getLayoutParams();
            layoutParams2.setMargins(0, (int) (this.f10221m * 0.1111f), 0, 0);
            this.f10218j.setLayoutParams(layoutParams2);
            this.f10218j.setImageResource(C1704R.C1705drawable.icon_calibration_succeed);
            m30128d();
        }
    }

    /* renamed from: b */
    private void m30130b() {
        this.f10218j = (ImageView) findViewById(C1704R.C1706id.tagIcon);
        this.f10213e = (TextView) findViewById(C1704R.C1706id.heardView).findViewById(C1704R.C1706id.tv_settingTitle);
        this.f10213e.setText(C1704R.C1707string.gccalisucess);
        this.f10214f = (Button) findViewById(C1704R.C1706id.heardView).findViewById(C1704R.C1706id.black_btn);
        this.f10214f.setOnClickListener(this);
        this.f10215g = (Button) findViewById(C1704R.C1706id.quit);
        this.f10215g.setOnClickListener(this);
        this.f10216h = (Button) findViewById(C1704R.C1706id.again);
        this.f10216h.setOnClickListener(this);
        this.f10217i = (Button) findViewById(C1704R.C1706id.sucesscomplete);
        this.f10217i.setOnClickListener(this);
        this.f10219k = (TextView) findViewById(C1704R.C1706id.destitle);
        this.f10220l = (TextView) findViewById(C1704R.C1706id.calireason);
        m30131a(this.f10215g, 128);
        m30131a(this.f10216h, AbstractC10866e.f34827F);
        C3103au.m29232a(getAssets(), this.f10213e, this.f10214f, this.f10215g, this.f10216h, this.f10217i, this.f10219k, this.f10220l);
    }

    /* renamed from: c */
    private void m30129c() {
        this.f10215g.setVisibility(0);
        this.f10216h.setVisibility(0);
        this.f10217i.setVisibility(8);
    }

    /* renamed from: d */
    private void m30128d() {
        this.f10215g.setVisibility(8);
        this.f10216h.setVisibility(8);
        this.f10217i.setVisibility(0);
    }

    /* renamed from: a */
    public void m30131a(Button button, int i) {
        button.setTextColor(button.getTextColors().withAlpha(i));
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        switch (view.getId()) {
            case C1704R.C1706id.quit /* 2131755040 */:
                finish();
                return;
            case C1704R.C1706id.again /* 2131755511 */:
                startActivity(new Intent(this, GimalCalibrationActivity.class));
                finish();
                return;
            case C1704R.C1706id.sucesscomplete /* 2131755512 */:
                finish();
                return;
            case C1704R.C1706id.black_btn /* 2131756179 */:
                finish();
                return;
            default:
                return;
        }
    }

    @Override // com.fimi.soul.base.BaseActivity, com.fimi.soul.base.BaseFimiActivity, com.fimi.kernel.BaseActivity, android.support.p001v4.app.FragmentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        getWindow().setFlags(128, 128);
        super.onCreate(bundle);
        setContentView(C1704R.layout.caliremotesucess);
        DisplayMetrics displayMetrics = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        this.f10221m = displayMetrics.heightPixels;
        m30130b();
        m30132a();
    }
}
