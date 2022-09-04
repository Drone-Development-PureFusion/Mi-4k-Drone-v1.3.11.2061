package com.fimi.x1bh.module.camerasetting;

import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import com.fimi.overseas.soul.C1704R;
import com.fimi.soul.biz.camera.C1783b;
import com.fimi.soul.biz.camera.C1827d;
import com.fimi.soul.biz.camera.C1831e;
import com.fimi.soul.entity.CameraValue;
import com.fimi.soul.utils.C3103au;
import com.fimi.x1bh.module.X1bhBaseActivity;
/* loaded from: classes.dex */
public class CloudCameraSettingActivity extends X1bhBaseActivity implements View.OnClickListener {

    /* renamed from: a */
    private ListView f13345a;

    /* renamed from: b */
    private Button f13346b;

    /* renamed from: c */
    private TextView f13347c;

    /* renamed from: d */
    private C3351a f13348d;

    /* renamed from: a */
    private void m28207a() {
        this.f13346b = (Button) findViewById(C1704R.C1706id.black_btn);
        this.f13347c = (TextView) findViewById(C1704R.C1706id.tv_settingTitle);
        this.f13345a = (ListView) findViewById(C1704R.C1706id.setting_lv);
        this.f13345a.setOverScrollMode(2);
        this.f13347c.setText(C1704R.C1707string.camera_setting);
        this.f13346b.setOnClickListener(this);
        C3103au.m29232a(getAssets(), this.f13347c);
    }

    /* renamed from: a */
    private void m28206a(C1827d c1827d) {
        CameraValue.PAGE_CAMERA_MENU_ALBUM = 2;
        if ("menu_album".equals("") || !c1827d.e()) {
            return;
        }
        c1827d.m33989u().m34054a("menu_album", C1831e.f4911cE);
    }

    /* renamed from: b */
    private void m28205b() {
        this.f13348d = new C3351a(this);
        this.f13348d.m28204a();
        this.f13348d.m28194b();
        this.f13345a.setAdapter((ListAdapter) this.f13348d);
        this.f13345a.setOnItemClickListener(this.f13348d);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view.getId() == C1704R.C1706id.black_btn) {
            ((C1827d) C1783b.m34166a().m34150d()).m33989u().m34045e();
            finish();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.fimi.x1bh.module.X1bhBaseActivity, com.fimi.soul.base.BaseActivity, com.fimi.soul.base.BaseFimiActivity, com.fimi.kernel.BaseActivity, android.support.p001v4.app.FragmentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C1704R.layout.activity_camera_setting);
        m28207a();
        m28205b();
    }

    @Override // android.support.p001v4.app.FragmentActivity, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i == 4) {
            ((C1827d) C1783b.m34166a().m34150d()).m33989u().m34045e();
            finish();
        }
        return super.onKeyDown(i, keyEvent);
    }
}
