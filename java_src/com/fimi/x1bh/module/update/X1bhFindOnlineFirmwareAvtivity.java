package com.fimi.x1bh.module.update;

import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import com.fimi.kernel.C1642c;
import com.fimi.kernel.utils.C1681v;
import com.fimi.kernel.utils.C1688z;
import com.fimi.overseas.soul.C1704R;
import com.fimi.soul.base.BaseActivity;
import com.fimi.soul.base.C1756a;
import com.fimi.soul.biz.p181i.C1867a;
import com.fimi.soul.biz.update.AbstractC2056c;
import com.fimi.soul.biz.update.C2080l;
import com.fimi.soul.entity.UpdateVersonBean;
import com.fimi.soul.module.droneui.FlightActivity;
import com.fimi.soul.module.update.DowningActivity;
import com.fimi.soul.p168b.C1750i;
import com.fimi.soul.utils.C3103au;
import com.fimi.soul.utils.C3128l;
import com.fimi.soul.view.TranslationView;
import java.util.List;
/* loaded from: classes.dex */
public class X1bhFindOnlineFirmwareAvtivity extends BaseActivity implements View.OnClickListener {

    /* renamed from: a */
    TranslationView f13550a;

    /* renamed from: b */
    TextView f13551b;

    /* renamed from: c */
    TextView f13552c;

    /* renamed from: e */
    private Button f13554e;

    /* renamed from: f */
    private Button f13555f;

    /* renamed from: g */
    private Button f13556g;

    /* renamed from: h */
    private Boolean f13557h;

    /* renamed from: i */
    private ListView f13558i;

    /* renamed from: j */
    private TextView f13559j;

    /* renamed from: k */
    private C1750i f13560k;

    /* renamed from: l */
    private boolean f13561l;

    /* renamed from: d */
    List<UpdateVersonBean> f13553d = null;

    /* renamed from: m */
    private String f13562m = C1756a.f4519L;

    /* renamed from: a */
    public void m28071a() {
        if (!C3103au.m29221b(this)) {
            C1688z.m34450a(this, (int) C1704R.C1707string.network_disable_download2);
            this.f13559j.setText(getString(C1704R.C1707string.network_disable_download2));
            return;
        }
        if (!C3103au.m29213c(this)) {
            C1688z.m34450a(this, (int) C1704R.C1707string.network_download_wifi_tip);
            this.f13559j.setText(getString(C1704R.C1707string.network_download_wifi_tip));
        } else if (!m28066f()) {
            C1688z.m34450a(this, (int) C1704R.C1707string.network_disable_download2);
            this.f13559j.setText(getString(C1704R.C1707string.network_disable_download2));
            return;
        } else if (!C3103au.m29206e()) {
            C1688z.m34450a(this, (int) C1704R.C1707string.network_disable_download2);
            this.f13559j.setText(getString(C1704R.C1707string.network_disable_download2));
            return;
        } else {
            this.f13559j.setText(getString(C1704R.C1707string.network_download_confirm_tip));
        }
        m28070b();
    }

    /* renamed from: b */
    public void m28070b() {
        Intent intent = new Intent(this, DowningActivity.class);
        intent.putExtra("isForce", this.f13561l);
        startActivity(intent);
        finish();
        overridePendingTransition(17432576, 17432577);
    }

    /* renamed from: c */
    public void m28069c() {
        this.f13554e = (Button) findViewById(C1704R.C1706id.btn_down_after);
        C3103au.m29232a(getAssets(), this.f13554e);
        this.f13554e.setOnClickListener(this);
        this.f13555f = (Button) findViewById(C1704R.C1706id.btn_down);
        C3103au.m29232a(getAssets(), this.f13555f);
        this.f13555f.setOnClickListener(this);
        this.f13556g = (Button) findViewById(C1704R.C1706id.btn_down2);
        C3103au.m29232a(getAssets(), this.f13556g);
        this.f13556g.setOnClickListener(this);
        this.f13550a = (TranslationView) findViewById(C1704R.C1706id.translationview);
        this.f13550a.setVisibility(0);
        this.f13550a.m28854a();
        this.f13551b = (TextView) findViewById(C1704R.C1706id.update_firmware_title);
        C3103au.m29232a(getAssets(), this.f13551b);
        this.f13552c = (TextView) findViewById(C1704R.C1706id.down_firmwares_detail_ex);
        C3103au.m29232a(getAssets(), this.f13552c);
        this.f13559j = (TextView) findViewById(C1704R.C1706id.confirm_tv);
        C3103au.m29232a(getAssets(), this.f13559j);
        StringBuilder sb = new StringBuilder();
        String string = getString(C1704R.C1707string.down_firmwares_detail_ex);
        if (this.f13561l) {
            this.f13554e.setVisibility(8);
            this.f13555f.setVisibility(8);
            this.f13556g.setVisibility(0);
            sb.append(getString(C1704R.C1707string.update_firmware_title_ex));
        } else {
            this.f13554e.setVisibility(0);
            this.f13555f.setVisibility(0);
            this.f13556g.setVisibility(8);
            sb.append(getString(C1704R.C1707string.new_update));
        }
        this.f13551b.setText(sb.toString());
        this.f13552c.setText(String.format(string, C2080l.m33052c()));
        this.f13558i = (ListView) findViewById(C1704R.C1706id.testListView);
    }

    /* renamed from: d */
    public void m28068d() {
        if (!C3103au.m29221b(this)) {
            this.f13559j.setText(getString(C1704R.C1707string.network_disable_download2));
        } else if (!C3103au.m29213c(this)) {
            this.f13559j.setText(getString(C1704R.C1707string.network_download_wifi_tip));
        } else if (!m28066f()) {
            this.f13559j.setText(getString(C1704R.C1707string.network_disable_download2));
        } else if (!C3103au.m29206e()) {
            this.f13559j.setText(getString(C1704R.C1707string.network_disable_download2));
        } else {
            this.f13559j.setText(getString(C1704R.C1707string.network_download_confirm_tip));
        }
    }

    /* renamed from: e */
    public void m28067e() {
        this.f13560k = new C1750i(this, this.f13553d);
        this.f13558i.setAdapter((ListAdapter) this.f13560k);
    }

    /* renamed from: f */
    public boolean m28066f() {
        C3128l c3128l = new C3128l(C1756a.f4541ag);
        c3128l.start();
        try {
            c3128l.join(500L);
        } catch (Exception e) {
        }
        return c3128l.m29072a() != null;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        switch (view.getId()) {
            case C1704R.C1706id.btn_down_after /* 2131755409 */:
                if (!this.f13557h.booleanValue()) {
                    startActivity(new Intent(this, FlightActivity.class));
                    return;
                }
                this.preferencesUtil.m34546a().edit().putBoolean(C1756a.f4517J, true).commit();
                this.dpa.m34274d();
                return;
            case C1704R.C1706id.btn_down /* 2131755410 */:
                m28071a();
                return;
            case C1704R.C1706id.btn_down2 /* 2131755411 */:
                m28071a();
                return;
            default:
                return;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.fimi.soul.base.BaseActivity, com.fimi.soul.base.BaseFimiActivity, com.fimi.kernel.BaseActivity, android.support.p001v4.app.FragmentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        int i = 0;
        super.onCreate(bundle);
        this.dpa.m34276b(this);
        C1867a.m33847a().m33841a(getLocalClassName());
        setContentView(C1704R.layout.activity_online_new_firmware);
        getWindow().setFlags(128, 128);
        AbstractC2056c.f5765c = true;
        AbstractC2056c.f5764b = true;
        this.preferencesUtil = C1681v.m34543a(this);
        this.f13562m = C1756a.f4519L;
        this.f13557h = Boolean.valueOf(this.preferencesUtil.m34546a().getBoolean(this.f13562m, false));
        this.f13553d = C1642c.m34887c().mo34874b(UpdateVersonBean.SP_NEED_DOWN_FIRMWWARES, UpdateVersonBean.class);
        while (true) {
            int i2 = i;
            if (i2 >= this.f13553d.size()) {
                break;
            } else if ("2".equals(this.f13553d.get(i2).getForceSign())) {
                this.f13561l = true;
                break;
            } else {
                i = i2 + 1;
            }
        }
        m28069c();
        m28067e();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.fimi.soul.base.BaseActivity, com.fimi.soul.base.BaseFimiActivity, com.fimi.kernel.BaseActivity, android.support.p001v4.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        if (this.f13550a != null) {
            this.f13550a.m28846c();
        }
    }

    @Override // android.support.p001v4.app.FragmentActivity, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i != 4 || !this.f13561l) {
            return super.onKeyDown(i, keyEvent);
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.fimi.soul.base.BaseActivity, com.fimi.kernel.BaseActivity, android.support.p001v4.app.FragmentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
        C1867a.m33847a().m33840a(getLocalClassName(), 1, this.drone);
        m28068d();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
    }
}
