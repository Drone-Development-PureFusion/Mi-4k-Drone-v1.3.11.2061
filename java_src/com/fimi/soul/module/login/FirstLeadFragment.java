package com.fimi.soul.module.login;

import android.os.Bundle;
import android.support.p001v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.fimi.kernel.utils.C1681v;
import com.fimi.kernel.view.percent.PercentRelativeLayout;
import com.fimi.overseas.soul.C1704R;
import com.fimi.soul.utils.C3103au;
/* loaded from: classes.dex */
public class FirstLeadFragment extends Fragment implements View.OnClickListener {

    /* renamed from: k */
    private static final int f9701k = 1;

    /* renamed from: l */
    private static final int f9702l = 2;

    /* renamed from: m */
    private static final int f9703m = 3;

    /* renamed from: n */
    private static final int f9704n = 4;

    /* renamed from: o */
    private static final int f9705o = 5;

    /* renamed from: p */
    private static final int f9706p = 6;

    /* renamed from: q */
    private static final int f9707q = 7;

    /* renamed from: r */
    private static final int f9708r = 8;

    /* renamed from: A */
    private TextView f9709A;

    /* renamed from: B */
    private TextView f9710B;

    /* renamed from: C */
    private TextView f9711C;

    /* renamed from: D */
    private TextView f9712D;

    /* renamed from: E */
    private TextView f9713E;

    /* renamed from: F */
    private TextView f9714F;

    /* renamed from: G */
    private TextView f9715G;

    /* renamed from: H */
    private TextView f9716H;

    /* renamed from: I */
    private TextView f9717I;

    /* renamed from: J */
    private TextView f9718J;

    /* renamed from: a */
    RelativeLayout f9719a;

    /* renamed from: b */
    RelativeLayout f9720b;

    /* renamed from: c */
    RelativeLayout f9721c;

    /* renamed from: d */
    RelativeLayout f9722d;

    /* renamed from: e */
    RelativeLayout f9723e;

    /* renamed from: f */
    RelativeLayout f9724f;

    /* renamed from: g */
    RelativeLayout f9725g;

    /* renamed from: h */
    RelativeLayout f9726h;

    /* renamed from: i */
    PercentRelativeLayout f9727i;

    /* renamed from: j */
    AbstractC2787a f9728j;

    /* renamed from: s */
    private int f9729s = 1;

    /* renamed from: t */
    private C1681v f9730t;

    /* renamed from: u */
    private TextView f9731u;

    /* renamed from: v */
    private TextView f9732v;

    /* renamed from: w */
    private TextView f9733w;

    /* renamed from: x */
    private TextView f9734x;

    /* renamed from: y */
    private TextView f9735y;

    /* renamed from: z */
    private TextView f9736z;

    /* renamed from: com.fimi.soul.module.login.FirstLeadFragment$a */
    /* loaded from: classes.dex */
    public interface AbstractC2787a {
        /* renamed from: n */
        void mo30291n();
    }

    /* renamed from: a */
    public AbstractC2787a m30295a() {
        return this.f9728j;
    }

    /* renamed from: a */
    void m30294a(int i) {
        this.f9719a.setVisibility(8);
        this.f9720b.setVisibility(8);
        this.f9721c.setVisibility(8);
        this.f9722d.setVisibility(8);
        this.f9723e.setVisibility(8);
        this.f9725g.setVisibility(8);
        this.f9724f.setVisibility(8);
        this.f9726h.setVisibility(8);
        switch (i) {
            case 1:
                this.f9720b.setVisibility(0);
                return;
            case 2:
                this.f9724f.setVisibility(0);
                return;
            case 3:
                this.f9725g.setVisibility(0);
                return;
            case 4:
                this.f9723e.setVisibility(0);
                return;
            case 5:
                this.f9722d.setVisibility(0);
                return;
            case 6:
                this.f9721c.setVisibility(0);
                return;
            case 7:
                this.f9719a.setVisibility(0);
                return;
            case 8:
                this.f9726h.setVisibility(0);
                return;
            default:
                return;
        }
    }

    /* renamed from: a */
    void m30293a(View view) {
        this.f9727i = (PercentRelativeLayout) view.findViewById(C1704R.C1706id.root_layout);
        this.f9719a = (RelativeLayout) view.findViewById(C1704R.C1706id.setting_layout);
        this.f9720b = (RelativeLayout) view.findViewById(C1704R.C1706id.error_status_layout);
        this.f9721c = (RelativeLayout) view.findViewById(C1704R.C1706id.baoxiang_layout);
        this.f9722d = (RelativeLayout) view.findViewById(C1704R.C1706id.location_layout);
        this.f9723e = (RelativeLayout) view.findViewById(C1704R.C1706id.controll_status_layout);
        this.f9724f = (RelativeLayout) view.findViewById(C1704R.C1706id.battery_layout);
        this.f9725g = (RelativeLayout) view.findViewById(C1704R.C1706id.gsp_layout);
        this.f9726h = (RelativeLayout) view.findViewById(C1704R.C1706id.modle_layout);
        this.f9711C = (TextView) view.findViewById(C1704R.C1706id.error_des);
        this.f9712D = (TextView) view.findViewById(C1704R.C1706id.setting_des);
        this.f9713E = (TextView) view.findViewById(C1704R.C1706id.battery_des);
        this.f9714F = (TextView) view.findViewById(C1704R.C1706id.gsp_des);
        this.f9715G = (TextView) view.findViewById(C1704R.C1706id.controller_des);
        this.f9716H = (TextView) view.findViewById(C1704R.C1706id.location_des);
        this.f9718J = (TextView) view.findViewById(C1704R.C1706id.modle_des);
        this.f9731u = (TextView) view.findViewById(C1704R.C1706id.error_status_title);
        this.f9732v = (TextView) view.findViewById(C1704R.C1706id.setting_title);
        this.f9733w = (TextView) view.findViewById(C1704R.C1706id.battery_title);
        this.f9734x = (TextView) view.findViewById(C1704R.C1706id.gsp_title);
        this.f9735y = (TextView) view.findViewById(C1704R.C1706id.controll_status_title);
        this.f9736z = (TextView) view.findViewById(C1704R.C1706id.location_title);
        this.f9710B = (TextView) view.findViewById(C1704R.C1706id.modle_title);
        C3103au.m29232a(getActivity().getAssets(), this.f9711C, this.f9713E, this.f9712D, this.f9716H, this.f9714F, this.f9717I, this.f9715G, this.f9713E, this.f9718J, this.f9731u, this.f9733w, this.f9732v, this.f9736z, this.f9734x, this.f9709A, this.f9735y, this.f9733w, this.f9710B);
        this.f9727i.setOnClickListener(this);
    }

    /* renamed from: a */
    public void m30292a(AbstractC2787a abstractC2787a) {
        this.f9728j = abstractC2787a;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        switch (view.getId()) {
            case C1704R.C1706id.root_layout /* 2131755408 */:
                switch (this.f9729s) {
                    case 1:
                        this.f9729s = 2;
                        break;
                    case 2:
                        this.f9729s = 3;
                        break;
                    case 3:
                        this.f9729s = 4;
                        break;
                    case 4:
                        this.f9729s = 5;
                        break;
                    case 5:
                        this.f9729s = 6;
                        break;
                    case 6:
                        this.f9729s = 7;
                        break;
                    case 7:
                        this.f9729s = 8;
                        break;
                    case 8:
                        if (this.f9728j != null) {
                            this.f9728j.mo30291n();
                            break;
                        }
                        break;
                }
            case C1704R.C1706id.error_status_layout /* 2131755999 */:
                this.f9729s = 2;
                break;
            case C1704R.C1706id.controll_status_layout /* 2131756003 */:
                this.f9729s = 5;
                break;
            case C1704R.C1706id.baoxiang_layout /* 2131756007 */:
                this.f9729s = 7;
                break;
            case C1704R.C1706id.location_layout /* 2131756011 */:
                this.f9729s = 6;
                break;
            case C1704R.C1706id.gsp_layout /* 2131756015 */:
                this.f9729s = 4;
                break;
            case C1704R.C1706id.setting_layout /* 2131756019 */:
                this.f9729s = 8;
                break;
            case C1704R.C1706id.battery_layout /* 2131756023 */:
                this.f9729s = 3;
                break;
            case C1704R.C1706id.modle_layout /* 2131756027 */:
                if (this.f9728j != null) {
                    this.f9728j.mo30291n();
                    break;
                }
                break;
        }
        m30294a(this.f9729s);
        this.f9730t.m34546a().edit().putInt("curModel", this.f9729s).commit();
    }

    @Override // android.support.p001v4.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = View.inflate(getActivity(), C1704R.layout.lead_layout, null);
        m30293a(inflate);
        return inflate;
    }

    @Override // android.support.p001v4.app.Fragment
    public void onResume() {
        super.onResume();
    }

    @Override // android.support.p001v4.app.Fragment
    public void onStart() {
        super.onStart();
        this.f9730t = C1681v.m34543a(getActivity());
        this.f9729s = this.f9730t.m34546a().getInt("curModel", 1);
        m30294a(this.f9729s);
    }
}
