package com.fimi.soul.module.droneui;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import com.fimi.kernel.C1642c;
import com.fimi.kernel.view.button.SwitchButton;
import com.fimi.overseas.soul.C1704R;
import com.fimi.soul.base.BaseActivity;
import com.fimi.soul.entity.MoreSettingInfo;
import com.fimi.soul.p168b.C1744g;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public class MoreInfoSettingAcitivity extends BaseActivity implements View.OnClickListener, AdapterView.OnItemClickListener {

    /* renamed from: a */
    private Button f9565a;

    /* renamed from: b */
    private TextView f9566b;

    /* renamed from: c */
    private ListView f9567c;

    /* renamed from: d */
    private List<MoreSettingInfo> f9568d;

    /* renamed from: e */
    private C1744g.EnumC1746a[] f9569e = {C1744g.EnumC1746a.FLIHGT_PARAMETER, C1744g.EnumC1746a.GIMBAL_ANGLE};

    /* renamed from: a */
    public void m30409a() {
        this.f9565a = (Button) findViewById(C1704R.C1706id.black_btn);
        this.f9566b = (TextView) findViewById(C1704R.C1706id.tv_settingTitle);
        this.f9567c = (ListView) findViewById(C1704R.C1706id.setting_lv);
    }

    /* renamed from: b */
    public void m30408b() {
        this.f9566b.setText(getString(C1704R.C1707string.show_more_patter));
        this.f9568d = new ArrayList();
        for (int i = 0; i < this.f9569e.length; i++) {
            MoreSettingInfo moreSettingInfo = new MoreSettingInfo();
            moreSettingInfo.setIndexEnum(this.f9569e[i]);
            this.f9568d.add(moreSettingInfo);
        }
        this.f9567c.setAdapter((ListAdapter) new C1744g(this, this.f9568d));
        this.f9567c.setOnItemClickListener(this);
    }

    /* renamed from: c */
    public void m30407c() {
        this.f9565a.setOnClickListener(this);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        switch (view.getId()) {
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
        setContentView(C1704R.layout.activity_more_info_setting_acitivity);
        m30409a();
        m30408b();
        m30407c();
    }

    public void onFlightParameter(View view) {
        SwitchButton switchButton = (SwitchButton) view.findViewById(C1704R.C1706id.switch_btn);
        if (C1642c.m34885e().m34530d()) {
            C1642c.m34885e().m34539a(false);
            switchButton.m34420a(false, true);
            return;
        }
        C1642c.m34885e().m34539a(true);
        switchButton.m34420a(true, true);
    }

    public void onGimbalAngle(View view) {
        SwitchButton switchButton = (SwitchButton) view.findViewById(C1704R.C1706id.switch_btn);
        if (C1642c.m34885e().m34526e()) {
            C1642c.m34885e().m34535b(false);
            switchButton.m34420a(false, true);
            return;
        }
        C1642c.m34885e().m34535b(true);
        switchButton.m34420a(true, true);
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        switch (this.f9568d.get(i).getIndexEnum()) {
            case FLIHGT_PARAMETER:
                onFlightParameter(view);
                return;
            case GIMBAL_ANGLE:
                onGimbalAngle(view);
                return;
            default:
                return;
        }
    }
}
