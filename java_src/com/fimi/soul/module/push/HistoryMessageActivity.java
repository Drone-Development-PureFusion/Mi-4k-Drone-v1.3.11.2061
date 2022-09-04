package com.fimi.soul.module.push;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import com.fimi.overseas.soul.C1704R;
import com.fimi.soul.base.BaseActivity;
import com.fimi.soul.entity.HistoryPushMessage;
import com.fimi.soul.utils.C3103au;
import com.fimi.soul.utils.p219a.C3070c;
import java.util.List;
/* loaded from: classes.dex */
public class HistoryMessageActivity extends BaseActivity implements AdapterView.OnItemClickListener {

    /* renamed from: a */
    private C2831a f9958a;

    /* renamed from: b */
    private ListView f9959b;

    /* renamed from: c */
    private List<HistoryPushMessage> f9960c;

    /* renamed from: d */
    private C3070c f9961d;

    /* renamed from: e */
    private TextView f9962e;

    /* renamed from: f */
    private ImageView f9963f;

    /* renamed from: a */
    private void m30185a() {
        TextView textView = (TextView) findViewById(C1704R.C1706id.tv_settingTitle);
        textView.setText(C1704R.C1707string.setting_history_message);
        Button button = (Button) findViewById(C1704R.C1706id.black_btn);
        button.setOnClickListener(new View.OnClickListener() { // from class: com.fimi.soul.module.push.HistoryMessageActivity.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                HistoryMessageActivity.this.finish();
            }
        });
        this.f9959b = (ListView) findViewById(C1704R.C1706id.history_message_lv);
        this.f9959b.setOnItemClickListener(this);
        this.f9959b.setOverScrollMode(2);
        this.f9962e = (TextView) findViewById(C1704R.C1706id.history_message_no_tv);
        this.f9963f = (ImageView) findViewById(C1704R.C1706id.history_message_no_iv);
        C3103au.m29232a(getAssets(), textView, button, this.f9962e);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.fimi.soul.base.BaseActivity, com.fimi.soul.base.BaseFimiActivity, com.fimi.kernel.BaseActivity, android.support.p001v4.app.FragmentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getWindow().setFlags(128, 128);
        setContentView(C1704R.layout.activity_history_message);
        m30185a();
        this.f9961d = C3070c.m29392a(this);
        this.f9960c = this.f9961d.m29393a();
        if (this.f9960c.size() <= 0) {
            this.f9962e.setVisibility(0);
            this.f9963f.setVisibility(0);
            return;
        }
        this.f9962e.setVisibility(8);
        this.f9963f.setVisibility(8);
        this.f9958a = new C2831a(this, this.f9960c);
        this.f9959b.setAdapter((ListAdapter) this.f9958a);
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        Intent intent = new Intent(this, MessageDetailActivity.class);
        intent.putExtra("redirectURL", this.f9960c.get(i).getRedirectURL());
        startActivity(intent);
    }
}
