package com.fimi.x1bh.module.arrowkey;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import com.fimi.overseas.soul.C1704R;
import com.fimi.p140a.p145e.AbstractC1507b;
import com.fimi.p140a.p145e.C1508c;
import com.fimi.p149d.p150a.C1528c;
import com.fimi.p149d.p151b.C1535a;
import com.fimi.soul.utils.C3103au;
import com.fimi.x1bh.module.X1bhBaseActivity;
import com.fimi.x1bh.module.arrowkey.C3346b;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public class ArrowKeyActivity extends X1bhBaseActivity implements View.OnClickListener, AdapterView.OnItemClickListener, C3346b.AbstractC3348a {

    /* renamed from: h */
    private static final int f13320h = 1;

    /* renamed from: j */
    private static final String f13321j = "ArrowKeyActivity";

    /* renamed from: b */
    private Button f13323b;

    /* renamed from: c */
    private TextView f13324c;

    /* renamed from: d */
    private ListView f13325d;

    /* renamed from: e */
    private C3346b f13326e;

    /* renamed from: f */
    private List<C3345a> f13327f;

    /* renamed from: g */
    private C1528c f13328g;

    /* renamed from: i */
    private boolean f13329i = false;

    /* renamed from: a */
    Handler f13322a = new Handler() { // from class: com.fimi.x1bh.module.arrowkey.ArrowKeyActivity.1
        @Override // android.os.Handler
        public void handleMessage(Message message) {
            boolean z = true;
            super.handleMessage(message);
            if (message.what != 3) {
                if (message.what != 1) {
                    return;
                }
                ArrowKeyActivity.this.m28231a();
                Log.d(ArrowKeyActivity.f13321j, "handleMessage: isGetSuccess:" + ArrowKeyActivity.this.f13329i);
                if (ArrowKeyActivity.this.f13329i) {
                    return;
                }
                ArrowKeyActivity.this.f13322a.sendEmptyMessageDelayed(1, 400L);
                return;
            }
            ArrowKeyActivity.this.f13329i = true;
            ArrowKeyActivity.this.f13328g = (C1528c) message.obj;
            Log.d(ArrowKeyActivity.f13321j, "handleMessage: s:" + ArrowKeyActivity.this.f13328g.toString());
            switch (ArrowKeyActivity.this.f13328g.m35328q()) {
                case 1:
                case 2:
                case 3:
                case 4:
                default:
                    Log.d(ArrowKeyActivity.f13321j, "handleMessage: bit1:" + (ArrowKeyActivity.this.f13328g.m35334n() == 1) + ",bit2:" + (ArrowKeyActivity.this.f13328g.m35336m() == 1));
                    ((C3345a) ArrowKeyActivity.this.f13327f.get(C3346b.EnumC3349b.VERTIAL_OPERATION.ordinal())).m28218a(ArrowKeyActivity.this.f13328g.m35334n() == 1);
                    C3345a c3345a = (C3345a) ArrowKeyActivity.this.f13327f.get(C3346b.EnumC3349b.HORZONTAL_OPERATION.ordinal());
                    if (ArrowKeyActivity.this.f13328g.m35336m() != 1) {
                        z = false;
                    }
                    c3345a.m28218a(z);
                    ArrowKeyActivity.this.f13326e.notifyDataSetChanged();
                    return;
            }
        }
    };

    /* renamed from: b */
    private void m28226b() {
        this.f13323b = (Button) findViewById(C1704R.C1706id.black_btn);
        this.f13324c = (TextView) findViewById(C1704R.C1706id.tv_settingTitle);
        this.f13325d = (ListView) findViewById(C1704R.C1706id.setting_lv);
        this.f13323b.setOnClickListener(this);
        this.f13324c.setText(C1704R.C1707string.cloud_setting_arrow_key_set);
        C3103au.m29232a(getAssets(), this.f13324c);
    }

    /* renamed from: c */
    private void m28224c() {
        C3346b.EnumC3349b[] values;
        this.f13326e = new C3346b(this);
        this.f13326e.m28215a(this);
        this.f13327f = new ArrayList();
        for (C3346b.EnumC3349b enumC3349b : C3346b.EnumC3349b.values()) {
            C3345a c3345a = new C3345a();
            c3345a.m28218a(false);
            c3345a.m28219a(enumC3349b);
            this.f13327f.add(c3345a);
        }
        this.f13326e.m28211a(this.f13327f);
        this.f13325d.setAdapter((ListAdapter) this.f13326e);
        this.f13325d.setOnItemClickListener(this);
    }

    /* renamed from: a */
    public void m28231a() {
        C1535a c1535a = new C1535a();
        c1535a.c(2);
        c1535a.d(1);
        c1535a.a(0);
        c1535a.b(25);
        c1535a.m35295h((byte) 1);
        a(c1535a.mo35234g().m35464f());
    }

    /* renamed from: a */
    public void m28230a(byte b, byte b2) {
        if (this.f13328g == null) {
            return;
        }
        C1535a c1535a = new C1535a();
        c1535a.c(2);
        c1535a.d(1);
        c1535a.a(0);
        c1535a.b(25);
        c1535a.m35295h((byte) 2);
        c1535a.m35293i(this.f13328g.m35328q());
        c1535a.m35291j(this.f13328g.m35326r());
        c1535a.m35289k(this.f13328g.m35325s());
        c1535a.m35287l(this.f13328g.m35324t());
        c1535a.m35285m(this.f13328g.m35323u());
        c1535a.m35283n(this.f13328g.m35322v());
        c1535a.m35281o(this.f13328g.m35321w());
        c1535a.m35279p(this.f13328g.m35320x());
        c1535a.m35299e(b);
        c1535a.m35298f(b2);
        c1535a.m35277q(c1535a.m35294i());
        a(c1535a.mo35234g().m35464f());
    }

    @Override // com.fimi.x1bh.module.X1bhBaseActivity, com.fimi.p148c.AbstractC1523b
    /* renamed from: a */
    public void mo28086a(int i, C1508c c1508c) {
        AbstractC1507b m35463g = c1508c.m35463g();
        if (i != 65) {
            Log.d(f13321j, "onDataCallBack: cmd:" + i);
        }
        switch (i) {
            case 25:
                C1528c c1528c = (C1528c) m35463g;
                c1528c.m35330p();
                this.f13322a.obtainMessage(3, c1528c).sendToTarget();
                return;
            default:
                return;
        }
    }

    @Override // com.fimi.x1bh.module.arrowkey.C3346b.AbstractC3348a
    /* renamed from: a */
    public void mo28210a(C3346b.EnumC3349b enumC3349b) {
        byte b = 0;
        if (C3346b.EnumC3349b.HORZONTAL_OPERATION == enumC3349b) {
            byte b2 = this.f13327f.get(C3346b.EnumC3349b.VERTIAL_OPERATION.ordinal()).m28216c() ? (byte) 1 : (byte) 0;
            if (!this.f13327f.get(C3346b.EnumC3349b.HORZONTAL_OPERATION.ordinal()).m28216c()) {
                b = 1;
            }
            m28230a(b, b2);
        } else if (C3346b.EnumC3349b.VERTIAL_OPERATION != enumC3349b) {
        } else {
            byte b3 = this.f13327f.get(C3346b.EnumC3349b.HORZONTAL_OPERATION.ordinal()).m28216c() ? (byte) 1 : (byte) 0;
            if (!this.f13327f.get(C3346b.EnumC3349b.VERTIAL_OPERATION.ordinal()).m28216c()) {
                b = 1;
            }
            m28230a(b3, b);
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view.getId() == C1704R.C1706id.black_btn) {
            finish();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.fimi.x1bh.module.X1bhBaseActivity, com.fimi.soul.base.BaseActivity, com.fimi.soul.base.BaseFimiActivity, com.fimi.kernel.BaseActivity, android.support.p001v4.app.FragmentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C1704R.layout.activity_arrow_key);
        Log.d(f13321j, "onCreate: ");
        m28226b();
        m28224c();
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        byte b = 0;
        C3346b.EnumC3349b m28217b = this.f13327f.get(i).m28217b();
        if (m28217b == C3346b.EnumC3349b.HORZONTAL_OPERATION) {
            byte b2 = this.f13327f.get(C3346b.EnumC3349b.VERTIAL_OPERATION.ordinal()).m28216c() ? (byte) 1 : (byte) 0;
            if (!this.f13327f.get(C3346b.EnumC3349b.HORZONTAL_OPERATION.ordinal()).m28216c()) {
                b = 1;
            }
            m28230a(b, b2);
        } else if (m28217b != C3346b.EnumC3349b.VERTIAL_OPERATION) {
        } else {
            byte b3 = this.f13327f.get(C3346b.EnumC3349b.HORZONTAL_OPERATION.ordinal()).m28216c() ? (byte) 1 : (byte) 0;
            if (!this.f13327f.get(C3346b.EnumC3349b.VERTIAL_OPERATION.ordinal()).m28216c()) {
                b = 1;
            }
            m28230a(b3, b);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.fimi.soul.base.BaseActivity, com.fimi.kernel.BaseActivity, android.support.p001v4.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        Log.d(f13321j, "onResume: ");
        this.f13322a.sendEmptyMessage(1);
        this.f13329i = false;
    }
}
