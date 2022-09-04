package com.fimi.soul.module.paircode;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.fimi.overseas.soul.C1704R;
import com.fimi.soul.biz.p170b.C1772d;
import com.fimi.soul.drone.C2083a;
import com.fimi.soul.drone.C2104d;
import com.fimi.soul.drone.p195d.p196a.p197a.C2113ac;
import com.fimi.soul.utils.C3103au;
/* loaded from: classes.dex */
public class PairFragment extends Fragment implements View.OnClickListener, C2104d.AbstractC2106b, AbstractC2825a {

    /* renamed from: a */
    public static final int f9904a = 2;

    /* renamed from: b */
    public static final int f9905b = 16;

    /* renamed from: c */
    View f9906c;

    /* renamed from: d */
    private RelativeLayout f9907d;

    /* renamed from: e */
    private RelativeLayout f9908e;

    /* renamed from: f */
    private RelativeLayout f9909f;

    /* renamed from: g */
    private TextView f9910g;

    /* renamed from: h */
    private PairCodeActivity f9911h;

    /* renamed from: com.fimi.soul.module.paircode.PairFragment$a */
    /* loaded from: classes.dex */
    enum EnumC2820a {
        in_sky,
        no_connected,
        prepared
    }

    /* renamed from: a */
    private void m30192a() {
        C2113ac c2113ac = new C2113ac();
        c2113ac.m32875a((byte) 8);
        c2113ac.m32873a(C1772d.m34208a().m34187k());
        this.f9911h.drone.mo32906ab().mo32587a(c2113ac.mo32762b());
        this.f9911h.m30196a(true);
    }

    /* renamed from: a */
    private void m30191a(EnumC2820a enumC2820a) {
        this.f9907d.setVisibility(8);
        this.f9908e.setVisibility(8);
        this.f9909f.setVisibility(8);
        switch (enumC2820a) {
            case in_sky:
                this.f9907d.setVisibility(0);
                return;
            case no_connected:
                this.f9908e.setVisibility(0);
                return;
            case prepared:
                this.f9909f.setVisibility(0);
                ((Button) this.f9906c.findViewById(C1704R.C1706id.pre_pair_btn)).setOnClickListener(this);
                return;
            default:
                return;
        }
    }

    @Override // com.fimi.soul.module.paircode.AbstractC2825a
    /* renamed from: a */
    public void mo30187a(int i) {
        switch (i) {
            case 2:
                m30191a(EnumC2820a.no_connected);
                return;
            case 16:
                if (this.f9911h.drone.m33009am()) {
                    m30191a(EnumC2820a.in_sky);
                    return;
                } else {
                    m30191a(EnumC2820a.prepared);
                    return;
                }
            default:
                return;
        }
    }

    @Override // com.fimi.soul.module.paircode.AbstractC2825a
    /* renamed from: a */
    public void mo30186a(int i, int i2) {
    }

    @Override // android.app.Fragment
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        this.f9911h = (PairCodeActivity) activity;
        this.f9911h.m30197a(this);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        switch (view.getId()) {
            case C1704R.C1706id.pre_pair_btn /* 2131756155 */:
                if (!this.f9911h.drone.mo32906ab().mo32588a()) {
                    return;
                }
                m30192a();
                return;
            default:
                return;
        }
    }

    @Override // android.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f9906c = layoutInflater.inflate(C1704R.layout.pair_status_layout, (ViewGroup) null);
        this.f9907d = (RelativeLayout) this.f9906c.findViewById(C1704R.C1706id.sky_layout);
        this.f9908e = (RelativeLayout) this.f9906c.findViewById(C1704R.C1706id.connect_layout);
        this.f9909f = (RelativeLayout) this.f9906c.findViewById(C1704R.C1706id.prepare_layout);
        this.f9910g = (TextView) this.f9906c.findViewById(C1704R.C1706id.pair_des);
        return this.f9906c;
    }

    @Override // com.fimi.soul.drone.C2104d.AbstractC2106b
    public void onDroneEvent(C2104d.EnumC2105a enumC2105a, C2083a c2083a) {
        if (!c2083a.mo32905ac() || !c2083a.mo32906ab().mo32588a()) {
            return;
        }
        switch (enumC2105a) {
            case FLY_INSKY:
                if (c2083a.m33009am()) {
                    m30191a(EnumC2820a.in_sky);
                    return;
                } else {
                    m30191a(EnumC2820a.prepared);
                    return;
                }
            default:
                return;
        }
    }

    @Override // android.app.Fragment
    public void onResume() {
        super.onResume();
        if (C1772d.m34208a().m34187k()) {
            this.f9910g.setText(getString(C1704R.C1707string.paircode_step_des_4k));
        } else {
            this.f9910g.setText(getString(C1704R.C1707string.paircode_step_des));
        }
        C3103au.m29232a(this.f9911h.getAssets(), this.f9910g);
        if (!this.f9911h.drone.mo32906ab().mo32588a()) {
            m30191a(EnumC2820a.no_connected);
        } else if (this.f9911h.drone.m33009am()) {
            m30191a(EnumC2820a.in_sky);
        } else {
            m30191a(EnumC2820a.prepared);
        }
    }

    @Override // android.app.Fragment
    public void onStart() {
        super.onStart();
        this.f9911h.drone.mo32908a(this);
    }

    @Override // android.app.Fragment
    public void onStop() {
        super.onStop();
        this.f9911h.drone.mo32903b(this);
    }
}
