package com.fimi.soul.module.paircode;

import android.app.FragmentManager;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.fimi.kernel.utils.C1688z;
import com.fimi.overseas.soul.C1704R;
import com.fimi.soul.base.BaseActivity;
import com.fimi.soul.biz.p170b.C1772d;
import com.fimi.soul.drone.C2083a;
import com.fimi.soul.drone.C2104d;
import com.fimi.soul.drone.p195d.p196a.p197a.C2113ac;
import com.fimi.soul.drone.p205i.C2309ao;
import com.fimi.soul.utils.C3103au;
import com.fimi.soul.view.DialogC3245f;
/* loaded from: classes.dex */
public class PairCodeActivity extends BaseActivity implements View.OnClickListener, C2104d.AbstractC2106b {

    /* renamed from: a */
    public boolean f9888a = false;

    /* renamed from: b */
    private FragmentManager f9889b;

    /* renamed from: c */
    private PairResultFragment f9890c;

    /* renamed from: d */
    private PairErrorFragment f9891d;

    /* renamed from: e */
    private PairFragment f9892e;

    /* renamed from: f */
    private TextView f9893f;

    /* renamed from: g */
    private ImageView f9894g;

    /* renamed from: h */
    private AbstractC2825a f9895h;

    /* renamed from: b */
    private void m30195b() {
        DialogC3245f.C3246a c3246a = new DialogC3245f.C3246a(this);
        c3246a.m28641a(getString(C1704R.C1707string.exit_dialog_msg));
        c3246a.m28640a(getString(C1704R.C1707string.cancel), new DialogInterface.OnClickListener() { // from class: com.fimi.soul.module.paircode.PairCodeActivity.1
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i) {
            }
        });
        c3246a.m28634b(getString(C1704R.C1707string.ensure), new DialogInterface.OnClickListener() { // from class: com.fimi.soul.module.paircode.PairCodeActivity.2
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i) {
                PairCodeActivity.this.m30194c();
            }
        });
        c3246a.m28645a().show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public void m30194c() {
        C2113ac c2113ac = new C2113ac();
        c2113ac.m32875a((byte) 9);
        c2113ac.m32873a(C1772d.m34208a().m34187k());
        this.drone.mo32906ab().mo32587a(c2113ac.mo32762b());
    }

    /* renamed from: a */
    public void m30199a() {
        this.f9889b.beginTransaction().replace(C1704R.C1706id.pair_context, this.f9892e).commit();
    }

    /* renamed from: a */
    public void m30197a(AbstractC2825a abstractC2825a) {
        this.f9895h = abstractC2825a;
    }

    /* renamed from: a */
    public void m30196a(boolean z) {
        this.f9888a = z;
    }

    @Override // android.support.p001v4.app.FragmentActivity, android.app.Activity
    public void onBackPressed() {
        if (this.f9890c == null || !this.f9888a || !this.drone.mo32906ab().mo32588a()) {
            super.onBackPressed();
        } else {
            m30195b();
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        switch (view.getId()) {
            case C1704R.C1706id.pair_back_btn /* 2131756111 */:
                if (this.f9890c == null || !this.f9888a || !this.drone.mo32906ab().mo32588a()) {
                    finish();
                    return;
                } else {
                    m30195b();
                    return;
                }
            default:
                return;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.fimi.soul.base.BaseActivity, com.fimi.soul.base.BaseFimiActivity, com.fimi.kernel.BaseActivity, android.support.p001v4.app.FragmentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C1704R.layout.paircode_layout);
        this.f9893f = (TextView) findViewById(C1704R.C1706id.pair_title);
        this.f9894g = (ImageView) findViewById(C1704R.C1706id.pair_back_btn);
        this.f9894g.setOnClickListener(this);
        C3103au.m29232a(getAssets(), this.f9893f, this.f9894g);
        this.f9889b = getFragmentManager();
        this.f9890c = new PairResultFragment();
        this.f9892e = new PairFragment();
        this.f9891d = new PairErrorFragment();
        this.f9889b.beginTransaction().replace(C1704R.C1706id.pair_context, this.f9892e).commit();
        getWindow().addFlags(128);
    }

    @Override // com.fimi.soul.base.BaseActivity, com.fimi.soul.drone.C2104d.AbstractC2106b
    public void onDroneEvent(C2104d.EnumC2105a enumC2105a, C2083a c2083a) {
        super.onDroneEvent(enumC2105a, c2083a);
        switch (enumC2105a) {
            case PAIR_CODE:
                C2309ao m32988e = c2083a.m32988e();
                byte m32205c = m32988e.m32205c();
                if (m32988e.m32203d() != 9) {
                    this.f9889b.beginTransaction().replace(C1704R.C1706id.pair_context, this.f9890c).commit();
                } else if (m32205c == 2) {
                    finish();
                } else if (m32205c == 3) {
                    C1688z.m34448a(this, getString(C1704R.C1707string.pair_fail));
                    this.f9888a = false;
                    finish();
                    return;
                }
                if (this.f9895h == null) {
                    return;
                }
                this.f9895h.mo30186a(m32205c, m32988e.m32201e());
                return;
            case CLEANALLOBJ:
                if (this.f9888a) {
                    this.f9889b.beginTransaction().replace(C1704R.C1706id.pair_context, this.f9891d).commit();
                    this.f9888a = false;
                    return;
                } else if (this.f9895h == null) {
                    return;
                } else {
                    this.f9895h.mo30187a(2);
                    this.f9888a = false;
                    return;
                }
            case CONNECTSUCESS:
                if (this.f9895h == null) {
                    return;
                }
                this.f9895h.mo30187a(16);
                return;
            default:
                return;
        }
    }
}
