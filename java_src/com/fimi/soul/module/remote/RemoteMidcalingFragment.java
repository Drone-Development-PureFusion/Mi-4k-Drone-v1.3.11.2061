package com.fimi.soul.module.remote;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import com.fimi.overseas.soul.C1704R;
import com.fimi.soul.drone.C2083a;
import com.fimi.soul.drone.C2104d;
import com.fimi.soul.module.calibcompass.C2540a;
import com.fimi.soul.utils.C3103au;
/* loaded from: classes.dex */
public class RemoteMidcalingFragment extends BaseRemoteFragment {

    /* renamed from: f */
    private RemoteEndCaliFragment f10049f;

    /* renamed from: g */
    private TextView f10050g;

    /* renamed from: h */
    private Button f10051h;

    /* renamed from: a */
    public void m30170a() {
        a(C1704R.C1706id.midcalibrationing, C1704R.C1706id.errorcalifragment, getString(C1704R.C1707string.remote_cali_outtime), false);
    }

    @Override // com.fimi.soul.module.remote.BaseRemoteFragment, android.support.p001v4.app.Fragment
    public void onAttach(Activity activity) {
        super.onAttach(activity);
    }

    @Override // com.fimi.soul.module.remote.BaseRemoteFragment, android.view.View.OnClickListener
    public void onClick(View view) {
        super.onClick(view);
        if (view.getId() != C1704R.C1706id.black_btn || !isVisible() || this.f9984e == null) {
            return;
        }
        this.f9984e.mo30175a();
    }

    @Override // com.fimi.soul.module.remote.BaseRemoteFragment, android.support.p001v4.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(C1704R.layout.remotecaliing, (ViewGroup) null);
        this.f10050g = (TextView) inflate.findViewById(C1704R.C1706id.heardView).findViewById(C1704R.C1706id.tv_settingTitle);
        this.f10050g.setText(C1704R.C1707string.calireming);
        this.f10051h = (Button) inflate.findViewById(C1704R.C1706id.heardView).findViewById(C1704R.C1706id.black_btn);
        this.f10051h.setOnClickListener(this);
        C3103au.m29232a(getActivity().getAssets(), this.f10050g, this.f10051h);
        return inflate;
    }

    @Override // com.fimi.soul.module.remote.BaseRemoteFragment, com.fimi.soul.drone.C2104d.AbstractC2106b
    public void onDroneEvent(C2104d.EnumC2105a enumC2105a, C2083a c2083a) {
        if (isVisible()) {
            switch (enumC2105a) {
                case QuitCaliRemote:
                    c2083a.mo32903b(this);
                    return;
                case backControl:
                    if (isVisible()) {
                        C2540a.m31307a().m31305a("98");
                        if (c2083a.mo32918R().m32030c() == 1 && c2083a.mo32918R().m32031b() == 82) {
                            if (this.f9984e != null) {
                                this.f9984e.mo30174a(C1704R.C1706id.midcalibrationing, C1704R.C1706id.endmidcalibration);
                            }
                            this.f9983d.m31357k();
                        }
                    }
                    if (c2083a.mo32918R().m32030c() != 3 || c2083a.mo32918R().m32031b() != 86) {
                        return;
                    }
                    m30170a();
                    return;
                default:
                    return;
            }
        }
    }
}
