package com.fimi.soul.module.setting.GimalCalibration;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.p001v4.app.FragmentManager;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.fimi.kernel.p165d.C1648b;
import com.fimi.kernel.view.percent.PercentRelativeLayout;
import com.fimi.kernel.view.progress.ProgressView;
import com.fimi.overseas.soul.C1704R;
import com.fimi.soul.base.BaseActivity;
import com.fimi.soul.module.setting.GimalCalibration.C2874a;
import com.fimi.soul.module.setting.GimalCalibration.GimalCaliIngFragment;
import com.fimi.soul.utils.C3103au;
import com.fimi.soul.view.DialogC3245f;
import it.p273a.p274a.AbstractC10866e;
/* loaded from: classes.dex */
public class GimalCalibrationActivity extends BaseActivity implements View.OnClickListener, GimalCaliIngFragment.AbstractC2871a, C2874a.AbstractC2876a {

    /* renamed from: a */
    TextView f10196a;

    /* renamed from: b */
    TextView f10197b;

    /* renamed from: c */
    Button f10198c;

    /* renamed from: d */
    Button f10199d;

    /* renamed from: e */
    ProgressView f10200e;

    /* renamed from: f */
    C2874a f10201f;

    /* renamed from: g */
    private ImageView f10202g;

    /* renamed from: h */
    private GimalCaliIngFragment f10203h;

    /* renamed from: i */
    private FragmentManager f10204i;

    /* renamed from: j */
    private PercentRelativeLayout f10205j;

    /* renamed from: k */
    private boolean f10206k;

    /* renamed from: a */
    private void m30137a(TextView textView, int i, Button button, int i2, ImageView imageView, int i3) {
        imageView.setImageResource(i3);
        if (!textView.getText().toString().equals(getString(i))) {
            textView.setText(i);
        }
        button.setEnabled(false);
        m30138a(button, i2);
    }

    /* renamed from: f */
    private void m30135f() {
        this.f10202g = (ImageView) findViewById(C1704R.C1706id.img_calibration_plane);
        this.f10196a = (TextView) findViewById(C1704R.C1706id.tv_tips);
        this.f10198c = (Button) findViewById(C1704R.C1706id.btn_start_calibration);
        this.f10198c.setOnClickListener(this);
        this.f10198c.setEnabled(false);
        this.f10197b = (TextView) findViewById(C1704R.C1706id.heardView).findViewById(C1704R.C1706id.tv_settingTitle);
        this.f10197b.setText(C1704R.C1707string.gimbal_calibration);
        this.f10199d = (Button) findViewById(C1704R.C1706id.heardView).findViewById(C1704R.C1706id.black_btn);
        this.f10199d.setOnClickListener(this);
        this.f10200e = (ProgressView) findViewById(C1704R.C1706id.pro_calibration);
        this.f10200e.setMaxCount(C2874a.f10222a);
        C3103au.m29232a(getAssets(), this.f10196a, this.f10198c, this.f10197b);
        this.f10201f = new C2874a(this, this.drone);
        m30134g();
    }

    /* renamed from: g */
    private void m30134g() {
        if (!this.drone.mo32906ab().mo32588a()) {
            m30137a(this.f10196a, C1704R.C1707string.calidisconremote, this.f10198c, 75, this.f10202g, C1704R.C1705drawable.gimbal_calibration_plane);
        } else if (!this.drone.mo32905ac()) {
            m30137a(this.f10196a, C1704R.C1707string.calisiacondrone, this.f10198c, 75, this.f10202g, C1704R.C1705drawable.gimbal_calibration_plane);
        } else if (this.drone.mo32905ac() && this.drone.m33009am()) {
            m30137a(this.f10196a, C1704R.C1707string.caligcremider, this.f10198c, 75, this.f10202g, C1704R.C1705drawable.gimbal_calibration_plane);
        } else if (this.drone.m33007ao().m31787am()) {
            m30137a(this.f10196a, C1704R.C1707string.calicompasscoming, this.f10198c, 75, this.f10202g, C1704R.C1705drawable.gimbal_calibration_plane);
        } else if (this.drone.m33007ao().m31755u()) {
            m30137a(this.f10196a, C1704R.C1707string.discongc, this.f10198c, 75, this.f10202g, C1704R.C1705drawable.img_no_pan_tilt_calibration_plane);
        } else if (this.drone.m33007ao().m31797ac()) {
            m30137a(this.f10196a, C1704R.C1707string.gcpreheat, this.f10198c, 75, this.f10202g, C1704R.C1705drawable.gimbal_calibration_plane);
        } else if (this.drone.m33007ao().m31756t()) {
            m30137a(this.f10196a, C1704R.C1707string.gcunready, this.f10198c, 75, this.f10202g, C1704R.C1705drawable.gimbal_calibration_plane);
        } else if (this.drone.m33007ao().m31813P()) {
            m30137a(this.f10196a, C1704R.C1707string.compasscgerror, this.f10198c, 75, this.f10202g, C1704R.C1705drawable.img_pan_tilt_calibration_jiggly);
        } else {
            if (!this.f10198c.isEnabled()) {
                C1648b.m34863b(this).m34867a(getResources().getString(C1704R.C1707string.reminder_calibration_canStart));
            }
            this.f10196a.setText(getString(C1704R.C1707string.gc_calbration_tips));
            this.f10198c.setEnabled(true);
            m30138a(this.f10198c, AbstractC10866e.f34827F);
            this.f10202g.setImageResource(C1704R.C1705drawable.imh_pan_tilt_calibration_plane);
        }
    }

    /* renamed from: h */
    private SpannableString m30133h() {
        String string = getString(C1704R.C1707string.gc_calbration_tips);
        SpannableString spannableString = new SpannableString(string);
        spannableString.setSpan(new ForegroundColorSpan(getResources().getColor(C1704R.color.gc_calibration_tips)), 0, 11, 33);
        spannableString.setSpan(new ForegroundColorSpan(getResources().getColor(C1704R.color.white)), 11, 15, 33);
        spannableString.setSpan(new ForegroundColorSpan(getResources().getColor(C1704R.color.gc_calibration_tips)), 16, string.length(), 33);
        return spannableString;
    }

    @Override // com.fimi.soul.module.setting.GimalCalibration.GimalCaliIngFragment.AbstractC2871a
    /* renamed from: a */
    public void mo30139a() {
        if (this.f10203h == null || !this.f10203h.isVisible()) {
            return;
        }
        DialogC3245f.C3246a c3246a = new DialogC3245f.C3246a(this);
        c3246a.m28641a(getString(C1704R.C1707string.interruptcaliremote));
        c3246a.m28640a(getString(C1704R.C1707string.cancel), new DialogInterface.OnClickListener() { // from class: com.fimi.soul.module.setting.GimalCalibration.GimalCalibrationActivity.2
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.dismiss();
            }
        }).m28634b(getString(C1704R.C1707string.ensure), new DialogInterface.OnClickListener() { // from class: com.fimi.soul.module.setting.GimalCalibration.GimalCalibrationActivity.1
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.dismiss();
                GimalCalibrationActivity.this.f10201f.m30118d();
                GimalCalibrationActivity.this.finish();
            }
        }).m28645a().show();
    }

    @Override // com.fimi.soul.module.setting.GimalCalibration.C2874a.AbstractC2876a
    /* renamed from: a */
    public void mo29930a(int i) {
        if (this.f10203h != null) {
            this.f10203h.m30141a(i);
        }
        if (!this.f10206k) {
            this.f10206k = true;
            C1648b.m34863b(this).m34867a(getString(C1704R.C1707string.GC_calibrationing));
        }
    }

    /* renamed from: a */
    public void m30138a(TextView textView, int i) {
        textView.setTextColor(textView.getTextColors().withAlpha(i));
    }

    /* renamed from: a */
    public void m30136a(Class cls, int i, String str) {
        Intent intent = new Intent(this, cls);
        intent.putExtra(ResultCalibrationActivity.f10211c, i);
        intent.putExtra(ResultCalibrationActivity.f10212d, str);
        startActivity(intent);
        finish();
        overridePendingTransition(17432576, 17432577);
    }

    @Override // com.fimi.soul.module.setting.GimalCalibration.C2874a.AbstractC2876a
    /* renamed from: a */
    public void mo29927a(String str) {
        if (str == null) {
            m30136a(ResultCalibrationActivity.class, 1, this.drone.f5919d.getString(C1704R.C1707string.GC_califail));
        } else {
            m30136a(ResultCalibrationActivity.class, 1, str);
        }
    }

    @Override // com.fimi.soul.module.setting.GimalCalibration.C2874a.AbstractC2876a
    /* renamed from: b */
    public void mo29925b() {
        if (this.f10203h == null || this.f10203h.isVisible()) {
            return;
        }
        this.f10204i.beginTransaction().show(this.f10203h).commitAllowingStateLoss();
        this.f10205j.setVisibility(8);
    }

    @Override // com.fimi.soul.module.setting.GimalCalibration.C2874a.AbstractC2876a
    /* renamed from: b */
    public void mo29924b(int i) {
        m30137a(this.f10196a, i, this.f10198c, 75, this.f10202g, C1704R.C1705drawable.gimbal_calibration_plane);
    }

    @Override // com.fimi.soul.module.setting.GimalCalibration.C2874a.AbstractC2876a
    /* renamed from: c */
    public void mo29922c() {
    }

    @Override // com.fimi.soul.module.setting.GimalCalibration.C2874a.AbstractC2876a
    /* renamed from: d */
    public void mo29920d() {
        m30136a(ResultCalibrationActivity.class, 0, getString(C1704R.C1707string.GC_caliSucess));
    }

    @Override // com.fimi.soul.module.setting.GimalCalibration.C2874a.AbstractC2876a
    /* renamed from: e */
    public void mo29918e() {
        m30134g();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view == this.f10198c) {
            this.f10201f.m30127a();
        }
        if (view == this.f10199d) {
            finish();
        }
    }

    @Override // com.fimi.soul.base.BaseActivity, com.fimi.soul.base.BaseFimiActivity, com.fimi.kernel.BaseActivity, android.support.p001v4.app.FragmentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        getWindow().setFlags(128, 128);
        super.onCreate(bundle);
        setContentView(C1704R.layout.activity_gc_calibration);
        this.f10205j = (PercentRelativeLayout) findViewById(C1704R.C1706id.activity_PL);
        this.f10204i = getSupportFragmentManager();
        this.f10203h = (GimalCaliIngFragment) this.f10204i.findFragmentById(C1704R.C1706id.caligamble);
        if (this.f10203h == null) {
            this.f10203h = new GimalCaliIngFragment();
        }
        if (!this.f10203h.isAdded()) {
            this.f10204i.beginTransaction().add(C1704R.C1706id.caligamble, this.f10203h).hide(this.f10203h).commitAllowingStateLoss();
        } else {
            this.f10204i.beginTransaction().hide(this.f10203h).commitAllowingStateLoss();
        }
        m30135f();
        this.f10206k = false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.fimi.soul.base.BaseActivity, com.fimi.soul.base.BaseFimiActivity, com.fimi.kernel.BaseActivity, android.support.p001v4.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.f10201f.m30113g();
        this.f10201f.m30114f();
        if (this.f10201f != null) {
            this.f10201f = null;
        }
    }

    @Override // android.support.p001v4.app.FragmentActivity, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i != 4 || this.f10203h == null || !this.f10203h.isVisible()) {
            return super.onKeyDown(i, keyEvent);
        }
        mo30139a();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.fimi.soul.base.BaseActivity, com.fimi.kernel.BaseActivity, android.support.p001v4.app.FragmentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
        this.f10201f.m30115e();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.fimi.soul.base.BaseActivity, android.support.p001v4.app.FragmentActivity, android.app.Activity
    public void onStop() {
        super.onStop();
    }
}
