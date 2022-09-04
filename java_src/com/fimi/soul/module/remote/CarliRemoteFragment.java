package com.fimi.soul.module.remote;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import com.fimi.kernel.p165d.C1648b;
import com.fimi.kernel.utils.C1681v;
import com.fimi.overseas.soul.C1704R;
import com.fimi.soul.drone.C2083a;
import com.fimi.soul.drone.C2104d;
import com.fimi.soul.drone.p205i.C2307am;
import com.fimi.soul.utils.C3103au;
import com.fimi.soul.view.MidView;
/* loaded from: classes.dex */
public class CarliRemoteFragment extends BaseRemoteFragment {

    /* renamed from: f */
    EnumC2836a f9985f;

    /* renamed from: g */
    private Button f9986g;

    /* renamed from: h */
    private Button f9987h;

    /* renamed from: i */
    private TextView f9988i;

    /* renamed from: j */
    private TextView f9989j;

    /* renamed from: k */
    private TextView f9990k;

    /* renamed from: l */
    private MidView f9991l;

    /* renamed from: m */
    private MidView f9992m;

    /* renamed from: com.fimi.soul.module.remote.CarliRemoteFragment$a */
    /* loaded from: classes.dex */
    enum EnumC2836a {
        jap,
        usa
    }

    /* renamed from: a */
    public void m30180a() {
        a(C1704R.C1706id.caliremotestart, C1704R.C1706id.errorcalifragment, getString(C1704R.C1707string.remote_cali_outtime), false);
    }

    @Override // com.fimi.soul.module.remote.BaseRemoteFragment, android.support.p001v4.app.Fragment
    public void onAttach(Activity activity) {
        super.onAttach(activity);
    }

    @Override // com.fimi.soul.module.remote.BaseRemoteFragment, android.view.View.OnClickListener
    public void onClick(View view) {
        switch (view.getId()) {
            case C1704R.C1706id.nextbutton /* 2131755506 */:
                this.f9983d.m31353o();
                if (this.f9984e == null) {
                    return;
                }
                this.f9984e.mo30174a(C1704R.C1706id.caliremotestart, C1704R.C1706id.cariremotecomple);
                return;
            case C1704R.C1706id.black_btn /* 2131756179 */:
                if (!isVisible() || this.f9984e == null) {
                    return;
                }
                this.f9984e.mo30175a();
                return;
            default:
                return;
        }
    }

    @Override // com.fimi.soul.module.remote.BaseRemoteFragment, android.support.p001v4.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(C1704R.layout.caliremotebegin, (ViewGroup) null);
        this.f9990k = (TextView) inflate.findViewById(C1704R.C1706id.heardView).findViewById(C1704R.C1706id.tv_settingTitle);
        this.f9990k.setText(C1704R.C1707string.calireming);
        this.f9987h = (Button) inflate.findViewById(C1704R.C1706id.heardView).findViewById(C1704R.C1706id.black_btn);
        this.f9987h.setOnClickListener(this);
        this.f9991l = (MidView) inflate.findViewById(C1704R.C1706id.leftcircle).findViewById(C1704R.C1706id.rightremoteview);
        this.f9992m = (MidView) inflate.findViewById(C1704R.C1706id.rightcircle).findViewById(C1704R.C1706id.rightremoteview);
        this.f9988i = (TextView) inflate.findViewById(C1704R.C1706id.showtitleone);
        this.f9989j = (TextView) inflate.findViewById(C1704R.C1706id.showtitletwo);
        this.f9986g = (Button) inflate.findViewById(C1704R.C1706id.nextbutton);
        this.f9986g.setOnClickListener(this);
        C3103au.m29232a(getActivity().getAssets(), this.f9986g, this.f9988i, this.f9989j, this.f9990k);
        return inflate;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.fimi.soul.module.remote.BaseRemoteFragment, com.fimi.soul.drone.C2104d.AbstractC2106b
    public void onDroneEvent(C2104d.EnumC2105a enumC2105a, C2083a c2083a) {
        if (isVisible()) {
            switch (enumC2105a) {
                case QuitCaliRemote:
                    c2083a.mo32903b(this);
                    return;
                case NEWREMOTEMODEL:
                    if (isVisible()) {
                        C2307am m32980i = c2083a.m32980i();
                        if (this.f9985f != EnumC2836a.usa) {
                            if (this.f9985f == EnumC2836a.jap) {
                                this.f9992m.m28877a((float) (m32980i.m32236i() * 0.0977d), (float) (m32980i.m32240g() * 0.0977d));
                                this.f9991l.m28877a((float) (m32980i.m32242f() * 0.0977d), (float) (m32980i.m32238h() * 0.0977d));
                                break;
                            }
                        } else {
                            this.f9992m.m28877a((float) (m32980i.m32236i() * 0.0977d), (float) (m32980i.m32238h() * 0.0977d));
                            this.f9991l.m28877a((float) (m32980i.m32242f() * 0.0977d), (float) (m32980i.m32240g() * 0.0977d));
                            break;
                        }
                    }
                    break;
                case backControl:
                    break;
                default:
                    return;
            }
            if (c2083a.mo32918R().m32030c() != 3) {
                return;
            }
            if (c2083a.mo32918R().m32031b() != 86 && c2083a.mo32918R().m32031b() != 85) {
                return;
            }
            m30180a();
        }
    }

    @Override // android.support.p001v4.app.Fragment
    public void onHiddenChanged(boolean z) {
        super.onHiddenChanged(z);
        if (z || !isVisible()) {
            return;
        }
        C1648b.m34863b(getActivity()).m34867a(getString(C1704R.C1707string.calirockertitle));
    }

    @Override // com.fimi.soul.module.remote.BaseRemoteFragment, android.support.p001v4.app.Fragment
    public void onStart() {
        super.onStart();
        if (C1681v.m34543a(getActivity()).m34546a().getInt(RemoteModelActivity.f10053a, 0) == 0) {
            this.f9985f = EnumC2836a.usa;
        } else {
            this.f9985f = EnumC2836a.jap;
        }
    }
}
