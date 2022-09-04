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
public class FeedBackNavigationActivity extends BaseActivity implements View.OnClickListener, AdapterView.OnItemClickListener {

    /* renamed from: a */
    private Button f8329a;

    /* renamed from: b */
    private TextView f8330b;

    /* renamed from: c */
    private List<String> f8331c = new ArrayList();

    /* renamed from: d */
    private C2556e f8332d;

    /* renamed from: e */
    private ListView f8333e;

    /* renamed from: a */
    private void m31260a() {
        String[] stringArray;
        for (String str : getResources().getStringArray(C1704R.array.feedback_navigation)) {
            if (!this.f8331c.contains(str)) {
                this.f8331c.add(str);
            }
        }
    }

    /* renamed from: a */
    private void m31259a(Class cls) {
        startActivity(new Intent(this, cls));
    }

    /* renamed from: b */
    private void m31258b() {
        C3103au.m29218b(getAssets(), this.f8330b);
    }

    /* renamed from: c */
    private void m31257c() {
        this.f8329a = (Button) findViewById(C1704R.C1706id.black_btn);
        this.f8329a.setOnClickListener(this);
        this.f8330b = (TextView) findViewById(C1704R.C1706id.tv_settingTitle);
        this.f8330b.setText(C1704R.C1707string.help);
        this.f8333e = (ListView) findViewById(C1704R.C1706id.navigation_listview);
        this.f8332d = new C2556e(this.f8331c, getApplicationContext());
        this.f8333e.setAdapter((ListAdapter) this.f8332d);
        this.f8333e.setOnItemClickListener(this);
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
        m31260a();
        m31257c();
        m31258b();
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        String str = (String) adapterView.getItemAtPosition(i);
        if (str.equals(getString(C1704R.C1707string.faq))) {
            m31259a(FaqActivity.class);
        } else if (str.equals(getString(C1704R.C1707string.totural))) {
            m31259a(WebViewActivity.class);
        } else if (!str.equals(getString(C1704R.C1707string.feedback_help))) {
        } else {
            m31259a(CustomerFeedBackActivity.class);
        }
    }
}
