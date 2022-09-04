package com.fimi.soul.module.customerfeedback;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import com.fimi.overseas.soul.C1704R;
import com.fimi.soul.base.BaseActivity;
import com.fimi.soul.utils.C3103au;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public class FaqActivity extends BaseActivity implements View.OnClickListener, AdapterView.OnItemClickListener {

    /* renamed from: a */
    private Button f8324a;

    /* renamed from: b */
    private TextView f8325b;

    /* renamed from: c */
    private ListView f8326c;

    /* renamed from: d */
    private List<String> f8327d = new ArrayList();

    /* renamed from: e */
    private C2551b f8328e;

    /* renamed from: a */
    private void m31264a() {
        String[] stringArray;
        for (String str : getResources().getStringArray(C1704R.array.faq_list_content)) {
            if (!this.f8327d.contains(str)) {
                this.f8327d.add(str);
            }
        }
    }

    /* renamed from: a */
    private void m31263a(Class cls) {
        startActivity(new Intent(this, cls));
    }

    /* renamed from: b */
    private void m31262b() {
        C3103au.m29218b(getAssets(), this.f8325b);
    }

    /* renamed from: c */
    private void m31261c() {
        this.f8324a = (Button) findViewById(C1704R.C1706id.black_btn);
        this.f8324a.setOnClickListener(this);
        this.f8325b = (TextView) findViewById(C1704R.C1706id.tv_settingTitle);
        this.f8325b.setText(C1704R.C1707string.help);
        this.f8326c = (ListView) findViewById(C1704R.C1706id.navigation_listview);
        this.f8328e = new C2551b(this.f8327d, getApplicationContext());
        this.f8326c.setAdapter((ListAdapter) this.f8328e);
        this.f8326c.setOnItemClickListener(this);
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
        setContentView(C1704R.layout.navifation_feedback_activity);
        m31264a();
        m31261c();
        m31262b();
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        String str = (String) adapterView.getItemAtPosition(i);
        if (!str.equals(getString(C1704R.C1707string.hot_answer)) && !str.equals(getString(C1704R.C1707string.drone)) && !str.equals(getString(C1704R.C1707string.remote)) && !str.equals(getString(C1704R.C1707string.cloud_camera)) && !str.equals(getString(C1704R.C1707string.faq_battery)) && !str.equals(getString(C1704R.C1707string.app)) && !str.equals(getString(C1704R.C1707string.faq_secure)) && str.equals(getString(C1704R.C1707string.others))) {
        }
    }
}
