package com.fimi.soul.module.remote;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import com.fimi.kernel.utils.C1681v;
import com.fimi.kernel.view.percent.PercentRelativeLayout;
import com.fimi.overseas.soul.C1704R;
import com.fimi.soul.drone.C2083a;
import com.fimi.soul.drone.C2104d;
import com.fimi.soul.drone.p205i.C2307am;
import com.fimi.soul.utils.C3103au;
import com.fimi.soul.view.MidView;
/* loaded from: classes.dex */
public class RemoteMidCalibrationFragment extends BaseRemoteFragment {

    /* renamed from: f */
    EnumC2846a f10036f;

    /* renamed from: g */
    private PercentRelativeLayout f10037g;

    /* renamed from: h */
    private Button f10038h;

    /* renamed from: i */
    private Button f10039i;

    /* renamed from: j */
    private TextView f10040j;

    /* renamed from: k */
    private TextView f10041k;

    /* renamed from: l */
    private TextView f10042l;

    /* renamed from: m */
    private MidView f10043m;

    /* renamed from: n */
    private MidView f10044n;

    /* renamed from: com.fimi.soul.module.remote.RemoteMidCalibrationFragment$a */
    /* loaded from: classes.dex */
    enum EnumC2846a {
        jap,
        usa
    }

    @Override // com.fimi.soul.module.remote.BaseRemoteFragment, android.support.p001v4.app.Fragment
    public void onAttach(Activity activity) {
        super.onAttach(activity);
    }

    @Override // com.fimi.soul.module.remote.BaseRemoteFragment, android.view.View.OnClickListener
    public void onClick(View view) {
        switch (view.getId()) {
            case C1704R.C1706id.nextbutton /* 2131755506 */:
                this.f9982c.beginTransaction().hide(this.f9982c.findFragmentById(C1704R.C1706id.midcalibreation)).commit();
                this.f9982c.beginTransaction().show(this.f9982c.findFragmentById(C1704R.C1706id.remote_roller_fragment)).commit();
                return;
            case C1704R.C1706id.black_btn /* 2131756179 */:
                this.f9983d.m31355m();
                getActivity().finish();
                return;
            default:
                return;
        }
    }

    @Override // com.fimi.soul.module.remote.BaseRemoteFragment, android.support.p001v4.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(C1704R.layout.midcalibration, (ViewGroup) null);
        this.f10037g = (PercentRelativeLayout) inflate.findViewById(C1704R.C1706id.heardView);
        this.f10043m = (MidView) inflate.findViewById(C1704R.C1706id.leftremoteview);
        this.f10044n = (MidView) inflate.findViewById(C1704R.C1706id.rightremoteview);
        this.f10041k = (TextView) inflate.findViewById(C1704R.C1706id.showtitleone);
        this.f10042l = (TextView) inflate.findViewById(C1704R.C1706id.showtitletwo);
        this.f10038h = (Button) this.f10037g.findViewById(C1704R.C1706id.black_btn);
        this.f10038h.setOnClickListener(this);
        this.f10040j = (TextView) this.f10037g.findViewById(C1704R.C1706id.tv_settingTitle);
        this.f10040j.setText(C1704R.C1707string.calibration_remote);
        this.f10039i = (Button) inflate.findViewById(C1704R.C1706id.nextbutton);
        this.f10039i.setOnClickListener(this);
        C3103au.m29232a(getActivity().getAssets(), this.f10040j, this.f10039i, this.f10041k, this.f10042l);
        return inflate;
    }

    @Override // com.fimi.soul.module.remote.BaseRemoteFragment, com.fimi.soul.drone.C2104d.AbstractC2106b
    public void onDroneEvent(C2104d.EnumC2105a enumC2105a, C2083a c2083a) {
        if (isVisible()) {
            switch (enumC2105a) {
                case NEWREMOTEMODEL:
                    C2307am m32980i = c2083a.m32980i();
                    if (this.f10036f == EnumC2846a.jap) {
                        this.f10043m.m28877a((float) (m32980i.m32242f() * 0.0977d), (float) (m32980i.m32238h() * 0.0977d));
                        this.f10044n.m28877a((float) (m32980i.m32236i() * 0.0977d), (float) (m32980i.m32240g() * 0.0977d));
                        return;
                    } else if (this.f10036f != EnumC2846a.usa) {
                        return;
                    } else {
                        this.f10044n.m28877a((float) (m32980i.m32236i() * 0.0977d), (float) (m32980i.m32238h() * 0.0977d));
                        this.f10043m.m28877a((float) (m32980i.m32242f() * 0.0977d), (float) (m32980i.m32240g() * 0.0977d));
                        return;
                    }
                default:
                    return;
            }
        }
    }

    @Override // com.fimi.soul.module.remote.BaseRemoteFragment, android.support.p001v4.app.Fragment
    public void onStart() {
        super.onStart();
        if (C1681v.m34543a(getActivity()).m34546a().getInt(RemoteModelActivity.f10053a, 0) == 0) {
            this.f10036f = EnumC2846a.usa;
        } else {
            this.f10036f = EnumC2846a.jap;
        }
    }
}
