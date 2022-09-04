package com.fimi.soul.module.update;

import android.content.Intent;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import com.fimi.kernel.view.percent.PercentRelativeLayout;
import com.fimi.overseas.soul.C1704R;
import com.fimi.p140a.C1514f;
import com.fimi.p140a.p142b.EnumC1495b;
import com.fimi.soul.base.BaseActivity;
import com.fimi.soul.base.DroidPlannerApp;
import com.fimi.soul.biz.camera.C1783b;
import com.fimi.soul.biz.camera.C1827d;
import com.fimi.soul.entity.FirmwareInfo;
import com.fimi.soul.entity.UpgradeResultDetail;
import com.fimi.soul.module.forum.CameraCourseActivity;
import com.fimi.soul.p168b.C1748h;
import com.fimi.soul.utils.C3103au;
import com.fimi.soul.view.TranslationView;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public class UpgradeResultActivity extends BaseActivity implements View.OnClickListener {

    /* renamed from: a */
    public static final String f11131a = "result_list";

    /* renamed from: b */
    StringBuffer f11132b;

    /* renamed from: c */
    StringBuffer f11133c;

    /* renamed from: d */
    TranslationView f11134d;

    /* renamed from: e */
    TextView f11135e;

    /* renamed from: f */
    C1748h f11136f;

    /* renamed from: g */
    private TextView f11137g;

    /* renamed from: h */
    private TextView f11138h;

    /* renamed from: i */
    private TextView f11139i;

    /* renamed from: j */
    private TextView f11140j;

    /* renamed from: k */
    private Button f11141k;

    /* renamed from: l */
    private Button f11142l;

    /* renamed from: m */
    private Button f11143m;

    /* renamed from: n */
    private ImageView f11144n;

    /* renamed from: o */
    private PercentRelativeLayout f11145o;

    /* renamed from: p */
    private PercentRelativeLayout f11146p;

    /* renamed from: q */
    private PercentRelativeLayout f11147q;

    /* renamed from: r */
    private Button f11148r;

    /* renamed from: s */
    private Button f11149s;

    /* renamed from: t */
    private TextView f11150t;

    /* renamed from: u */
    private TextView f11151u;

    /* renamed from: v */
    private ListView f11152v;

    /* renamed from: w */
    private List<UpgradeResultDetail> f11153w = new ArrayList();

    /* renamed from: x */
    private int f11154x = -1;

    /* renamed from: y */
    private int f11155y;

    /* renamed from: a */
    private String m29675a(StringBuffer stringBuffer, int i) {
        stringBuffer.deleteCharAt(stringBuffer.length() - 1);
        return String.format(getString(i), stringBuffer.toString());
    }

    /* renamed from: d */
    private void m29672d() {
        this.f11144n = (ImageView) findViewById(C1704R.C1706id.img_result);
        this.f11137g = (TextView) findViewById(C1704R.C1706id.tv_result);
        this.f11138h = (TextView) findViewById(C1704R.C1706id.tv_sucess_firmware);
        this.f11139i = (TextView) findViewById(C1704R.C1706id.tv_fail_firmwares);
        this.f11141k = (Button) findViewById(C1704R.C1706id.bt_ensure);
        this.f11141k.setOnClickListener(this);
        this.f11140j = (TextView) findViewById(C1704R.C1706id.warm_prompt);
        this.f11142l = (Button) findViewById(C1704R.C1706id.btn_exit);
        this.f11142l.setOnClickListener(this);
        this.f11143m = (Button) findViewById(C1704R.C1706id.btn_reconnect);
        this.f11143m.setOnClickListener(this);
        this.f11145o = (PercentRelativeLayout) findViewById(C1704R.C1706id.result_rl1);
        this.f11146p = (PercentRelativeLayout) findViewById(C1704R.C1706id.result_rl2);
        this.f11147q = (PercentRelativeLayout) findViewById(C1704R.C1706id.main_rl);
        C3103au.m29232a(getAssets(), this.f11137g, this.f11138h, this.f11139i, this.f11140j);
    }

    /* renamed from: e */
    private void m29671e() {
        List<FirmwareInfo> list = (List) getIntent().getSerializableExtra(f11131a);
        this.f11132b = new StringBuffer();
        this.f11133c = new StringBuffer();
        if (list != null && list.size() > 0) {
            for (FirmwareInfo firmwareInfo : list) {
                if (firmwareInfo.isUpgradeSuccess().booleanValue()) {
                    this.f11132b.append(firmwareInfo.getSysName() + getString(C1704R.C1707string.upgrade_symbol));
                } else {
                    this.f11133c.append(firmwareInfo.getSysName() + getString(C1704R.C1707string.upgrade_symbol));
                }
            }
        }
        if (this.f11132b.length() > 0 && this.f11133c.length() == 0) {
            this.f11139i.setVisibility(8);
            this.f11140j.setVisibility(8);
            this.f11138h.setText(m29675a(this.f11132b, C1704R.C1707string.upgrade_firmware_success));
        } else if (this.f11132b.length() <= 0 || this.f11133c.length() <= 0) {
            this.f11139i.setTextSize(2, 11.3f);
            this.f11139i.setVisibility(0);
            this.f11138h.setText(m29675a(this.f11133c, C1704R.C1707string.upgrade_firmware_failing));
            this.f11139i.setText(getString(C1704R.C1707string.warm_prompt));
            this.f11140j.setVisibility(4);
        } else {
            this.f11139i.setVisibility(0);
            this.f11138h.setText(m29675a(this.f11132b, C1704R.C1707string.upgrade_firmware_success));
            this.f11139i.setText(m29675a(this.f11133c, C1704R.C1707string.upgrade_firmware_failing));
            this.f11140j.setTextSize(2, 11.3f);
            this.f11140j.setVisibility(0);
            this.f11140j.setText(getString(C1704R.C1707string.warm_prompt));
        }
    }

    /* renamed from: f */
    private void m29670f() {
        List list = (List) getIntent().getSerializableExtra(f11131a);
        this.f11132b = new StringBuffer();
        this.f11133c = new StringBuffer();
        this.f11155y = getResources().getColor(C1704R.color.camera_course_txt);
        if (list != null && list.size() > 0) {
            for (int i = 0; i < list.size(); i++) {
                FirmwareInfo firmwareInfo = (FirmwareInfo) list.get(i);
                if (firmwareInfo.isUpgradeSuccess().booleanValue()) {
                    UpgradeResultDetail upgradeResultDetail = new UpgradeResultDetail();
                    upgradeResultDetail.setDetail(firmwareInfo.getSysName() + getString(C1704R.C1707string.upgrade_success1));
                    upgradeResultDetail.setImg(C1704R.C1705drawable.icon_upgrade_succeed);
                    this.f11153w.add(upgradeResultDetail);
                    this.f11132b.append(firmwareInfo.getSysName());
                    if (i != list.size() - 1) {
                        this.f11132b.append(getString(C1704R.C1707string.upgrade_symbol));
                    }
                } else {
                    UpgradeResultDetail upgradeResultDetail2 = new UpgradeResultDetail();
                    upgradeResultDetail2.setDetail(firmwareInfo.getSysName() + getString(C1704R.C1707string.upgrade_faile1));
                    upgradeResultDetail2.setImg(C1704R.C1705drawable.icon_upgrade_defeated);
                    this.f11153w.add(upgradeResultDetail2);
                    this.f11133c.append(firmwareInfo.getSysName());
                    if (i != list.size() - 1) {
                        this.f11133c.append(getString(C1704R.C1707string.upgrade_symbol));
                    }
                    if (firmwareInfo.getSysId() == 4) {
                        this.f11154x = 1;
                    } else if (firmwareInfo.getSysId() == 13) {
                        this.f11154x = 2;
                    }
                }
            }
        }
        if (this.f11132b.length() > 0 && this.f11133c.length() == 0) {
            this.f11139i.setVisibility(8);
            this.f11140j.setVisibility(8);
            this.f11142l.setVisibility(8);
            this.f11143m.setVisibility(8);
            this.f11132b.append(getString(C1704R.C1707string.upgrade_success1));
            this.f11138h.setText(this.f11132b.toString());
        } else if (this.f11132b.length() == 0 && this.f11133c.length() > 0) {
            this.f11133c.append(getString(C1704R.C1707string.upgrade_faile1));
            this.f11133c.append(getString(C1704R.C1707string.upgrade_faile_tip2));
            this.f11138h.setText(this.f11133c.toString());
            this.f11144n.setBackgroundResource(C1704R.C1705drawable.update_waining);
            this.f11141k.setVisibility(8);
            this.f11137g.setText(getString(C1704R.C1707string.upgrade_faile));
            if (this.f11154x > 0) {
                this.f11140j.setVisibility(0);
                String string = getString(C1704R.C1707string.camera_faile_tip);
                int length = string.length();
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
                ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(this.f11155y);
                if (length - 35 >= 0) {
                    spannableStringBuilder.setSpan(foregroundColorSpan, length - 35, length, 33);
                    this.f11140j.setText(spannableStringBuilder);
                }
                C3103au.m29232a(getAssets(), this.f11140j);
                this.f11140j.setOnClickListener(this);
            }
        } else if (this.f11132b.length() > 0 && this.f11133c.length() > 0) {
            this.f11145o.setVisibility(8);
            this.f11146p.setVisibility(0);
            this.f11147q.setBackgroundResource(C1704R.C1705drawable.upgradbg2);
            m29674b();
            m29673c();
        }
        if (list == null || list.size() <= 0) {
            return;
        }
        for (int i2 = 0; i2 < list.size(); i2++) {
            if (((FirmwareInfo) list.get(i2)).getSysId() == 4 || ((FirmwareInfo) list.get(i2)).getSysId() == 13 || C1514f.m35431a().m35429b() == EnumC1495b.X1BH) {
                ((C1827d) C1783b.m34166a().m34150d()).a(-1);
            }
        }
    }

    /* renamed from: a */
    public void m29676a() {
        Intent intent = new Intent(this, CameraCourseActivity.class);
        intent.putExtra("type", this.f11154x);
        startActivity(intent);
    }

    /* renamed from: b */
    public void m29674b() {
        this.f11148r = (Button) findViewById(C1704R.C1706id.btn_down_after);
        C3103au.m29232a(getAssets(), this.f11148r);
        this.f11148r.setOnClickListener(this);
        this.f11149s = (Button) findViewById(C1704R.C1706id.btn_down);
        C3103au.m29232a(getAssets(), this.f11149s);
        this.f11149s.setOnClickListener(this);
        this.f11134d = (TranslationView) findViewById(C1704R.C1706id.translationview);
        this.f11134d.setVisibility(0);
        this.f11134d.m28854a();
        this.f11135e = (TextView) findViewById(C1704R.C1706id.update_firmware_title);
        C3103au.m29232a(getAssets(), this.f11135e);
        this.f11151u = (TextView) findViewById(C1704R.C1706id.camerafailed_tv);
        this.f11150t = (TextView) findViewById(C1704R.C1706id.confirm_tv);
        this.f11151u.setOnClickListener(this);
        if (this.f11154x == -1) {
            this.f11151u.setVisibility(8);
            this.f11150t.setVisibility(0);
            C3103au.m29232a(getAssets(), this.f11150t);
        } else if (this.f11154x > 0) {
            this.f11150t.setVisibility(8);
            this.f11151u.setVisibility(0);
            String charSequence = this.f11151u.getText().toString();
            int length = charSequence.length();
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
            ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(this.f11155y);
            if (length - 35 >= 0) {
                spannableStringBuilder.setSpan(foregroundColorSpan, length - 35, length, 33);
                this.f11151u.setText(spannableStringBuilder);
            }
            C3103au.m29232a(getAssets(), this.f11151u);
        }
        new StringBuilder().append(getString(C1704R.C1707string.update_firmware_title));
        getString(C1704R.C1707string.down_firmwares_detail_ex);
        this.f11152v = (ListView) findViewById(C1704R.C1706id.testListView);
    }

    /* renamed from: c */
    public void m29673c() {
        this.f11136f = new C1748h(this, this.f11153w);
        this.f11152v.setAdapter((ListAdapter) this.f11136f);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        switch (view.getId()) {
            case C1704R.C1706id.btn_down_after /* 2131755409 */:
                finish();
                return;
            case C1704R.C1706id.btn_down /* 2131755410 */:
                finish();
                return;
            case C1704R.C1706id.warm_prompt /* 2131755433 */:
                m29676a();
                return;
            case C1704R.C1706id.bt_ensure /* 2131755434 */:
                finish();
                return;
            case C1704R.C1706id.btn_exit /* 2131755435 */:
                finish();
                return;
            case C1704R.C1706id.btn_reconnect /* 2131755436 */:
                finish();
                return;
            case C1704R.C1706id.camerafailed_tv /* 2131755438 */:
                m29676a();
                return;
            default:
                return;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.fimi.soul.base.BaseActivity, com.fimi.soul.base.BaseFimiActivity, com.fimi.kernel.BaseActivity, android.support.p001v4.app.FragmentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C1704R.layout.activity_upgrade_result);
        m29672d();
        m29670f();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.fimi.soul.base.BaseActivity, com.fimi.soul.base.BaseFimiActivity, com.fimi.kernel.BaseActivity, android.support.p001v4.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        DroidPlannerApp.f4489f = false;
        if (this.f11134d != null) {
            this.f11134d.m28846c();
        }
    }
}
