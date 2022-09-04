package com.fimi.soul.module.update;

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
import com.fimi.p140a.C1514f;
import com.fimi.p140a.p142b.EnumC1495b;
import com.fimi.soul.base.BaseActivity;
import com.fimi.soul.base.C1756a;
import com.fimi.soul.biz.p181i.C1867a;
import com.fimi.soul.biz.update.AbstractC2056c;
import com.fimi.soul.biz.update.C2080l;
import com.fimi.soul.entity.UpdateVersonBean;
import com.fimi.soul.module.droneui.FlightActivity;
import com.fimi.soul.p168b.C1750i;
import com.fimi.soul.utils.C3103au;
import com.fimi.soul.utils.C3128l;
import com.fimi.soul.view.TranslationView;
import com.fimi.x1bh.module.main.CloudTerraceMainActivity;
import java.util.List;
/* loaded from: classes.dex */
public class FindOnlineFirmwareAvtivity extends BaseActivity implements View.OnClickListener {

    /* renamed from: a */
    TranslationView f11094a;

    /* renamed from: b */
    TextView f11095b;

    /* renamed from: c */
    TextView f11096c;

    /* renamed from: e */
    private Button f11098e;

    /* renamed from: f */
    private Button f11099f;

    /* renamed from: g */
    private Button f11100g;

    /* renamed from: h */
    private Boolean f11101h;

    /* renamed from: i */
    private ListView f11102i;

    /* renamed from: j */
    private TextView f11103j;

    /* renamed from: k */
    private C1750i f11104k;

    /* renamed from: l */
    private boolean f11105l;

    /* renamed from: d */
    List<UpdateVersonBean> f11097d = null;

    /* renamed from: m */
    private String f11106m = C1756a.f4519L;

    /* renamed from: a */
    public void m29693a() {
        if (!C3103au.m29221b(this)) {
            C1688z.m34450a(this, (int) C1704R.C1707string.network_disable_download2);
            this.f11103j.setText(getString(C1704R.C1707string.network_disable_download2));
            return;
        }
        if (!C3103au.m29213c(this)) {
            C1688z.m34450a(this, (int) C1704R.C1707string.network_download_wifi_tip);
            this.f11103j.setText(getString(C1704R.C1707string.network_download_wifi_tip));
        } else if (!m29688f()) {
            C1688z.m34450a(this, (int) C1704R.C1707string.network_disable_download2);
            this.f11103j.setText(getString(C1704R.C1707string.network_disable_download2));
            return;
        } else if (!C3103au.m29206e()) {
            C1688z.m34450a(this, (int) C1704R.C1707string.network_disable_download2);
            this.f11103j.setText(getString(C1704R.C1707string.network_disable_download2));
            return;
        } else {
            this.f11103j.setText(getString(C1704R.C1707string.network_download_confirm_tip));
        }
        m29692b();
    }

    /* renamed from: b */
    public void m29692b() {
        Intent intent = new Intent(this, DowningActivity.class);
        intent.putExtra("isForce", this.f11105l);
        startActivity(intent);
        finish();
        overridePendingTransition(17432576, 17432577);
    }

    /* renamed from: c */
    public void m29691c() {
        this.f11098e = (Button) findViewById(C1704R.C1706id.btn_down_after);
        C3103au.m29232a(getAssets(), this.f11098e);
        this.f11098e.setOnClickListener(this);
        this.f11099f = (Button) findViewById(C1704R.C1706id.btn_down);
        C3103au.m29232a(getAssets(), this.f11099f);
        this.f11099f.setOnClickListener(this);
        this.f11100g = (Button) findViewById(C1704R.C1706id.btn_down2);
        C3103au.m29232a(getAssets(), this.f11100g);
        this.f11100g.setOnClickListener(this);
        this.f11094a = (TranslationView) findViewById(C1704R.C1706id.translationview);
        this.f11094a.setVisibility(0);
        this.f11094a.m28854a();
        this.f11095b = (TextView) findViewById(C1704R.C1706id.update_firmware_title);
        C3103au.m29232a(getAssets(), this.f11095b);
        this.f11096c = (TextView) findViewById(C1704R.C1706id.down_firmwares_detail_ex);
        C3103au.m29232a(getAssets(), this.f11096c);
        this.f11103j = (TextView) findViewById(C1704R.C1706id.confirm_tv);
        C3103au.m29232a(getAssets(), this.f11103j);
        StringBuilder sb = new StringBuilder();
        String string = getString(C1704R.C1707string.down_firmwares_detail_ex);
        if (this.f11105l) {
            this.f11098e.setVisibility(8);
            this.f11099f.setVisibility(8);
            this.f11100g.setVisibility(0);
            sb.append(getString(C1704R.C1707string.update_firmware_title_ex));
        } else {
            this.f11098e.setVisibility(0);
            this.f11099f.setVisibility(0);
            this.f11100g.setVisibility(8);
            sb.append(getString(C1704R.C1707string.new_update));
        }
        this.f11095b.setText(sb.toString());
        this.f11096c.setText(String.format(string, C2080l.m33052c()));
        this.f11102i = (ListView) findViewById(C1704R.C1706id.testListView);
    }

    /* renamed from: d */
    public void m29690d() {
        if (!C3103au.m29221b(this)) {
            this.f11103j.setText(getString(C1704R.C1707string.network_disable_download2));
        } else if (!C3103au.m29213c(this)) {
            this.f11103j.setText(getString(C1704R.C1707string.network_download_wifi_tip));
        } else if (!m29688f()) {
            this.f11103j.setText(getString(C1704R.C1707string.network_disable_download2));
        } else if (!C3103au.m29206e()) {
            this.f11103j.setText(getString(C1704R.C1707string.network_disable_download2));
        } else {
            this.f11103j.setText(getString(C1704R.C1707string.network_download_confirm_tip));
        }
    }

    /* renamed from: e */
    public void m29689e() {
        this.f11104k = new C1750i(this, this.f11097d);
        this.f11102i.setAdapter((ListAdapter) this.f11104k);
    }

    /* renamed from: f */
    public boolean m29688f() {
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
                if (this.f11101h.booleanValue()) {
                    this.preferencesUtil.m34546a().edit().putBoolean(C1756a.f4517J, true).commit();
                    this.dpa.m34274d();
                    return;
                } else if (C1514f.m35431a().m35429b() == EnumC1495b.DRONE) {
                    startActivity(new Intent(this, FlightActivity.class));
                    return;
                } else if (C1514f.m35431a().m35429b() != EnumC1495b.X1BH) {
                    return;
                } else {
                    startActivity(new Intent(this, CloudTerraceMainActivity.class));
                    return;
                }
            case C1704R.C1706id.btn_down /* 2131755410 */:
                m29693a();
                return;
            case C1704R.C1706id.btn_down2 /* 2131755411 */:
                m29693a();
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
        this.f11106m = C1756a.f4519L;
        this.f11101h = Boolean.valueOf(this.preferencesUtil.m34546a().getBoolean(this.f11106m, false));
        this.f11097d = C1642c.m34887c().mo34874b(UpdateVersonBean.SP_NEED_DOWN_FIRMWWARES, UpdateVersonBean.class);
        while (true) {
            int i2 = i;
            if (i2 >= this.f11097d.size()) {
                break;
            } else if ("2".equals(this.f11097d.get(i2).getForceSign())) {
                this.f11105l = true;
                break;
            } else {
                i = i2 + 1;
            }
        }
        m29691c();
        m29689e();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.fimi.soul.base.BaseActivity, com.fimi.soul.base.BaseFimiActivity, com.fimi.kernel.BaseActivity, android.support.p001v4.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        if (this.f11094a != null) {
            this.f11094a.m28846c();
        }
    }

    @Override // android.support.p001v4.app.FragmentActivity, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i != 4 || !this.f11105l) {
            return super.onKeyDown(i, keyEvent);
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.fimi.soul.base.BaseActivity, com.fimi.kernel.BaseActivity, android.support.p001v4.app.FragmentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
        C1867a.m33847a().m33840a(getLocalClassName(), 1, this.drone);
        m29690d();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
    }
}
