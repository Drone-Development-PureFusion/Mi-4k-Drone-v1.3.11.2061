package com.fimi.soul.module.remote;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
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
public class RemoteEndCaliFragment extends BaseRemoteFragment {

    /* renamed from: f */
    private Button f10030f;

    /* renamed from: g */
    private TextView f10031g;

    /* renamed from: h */
    private Button f10032h;

    /* renamed from: i */
    private Handler f10033i = new Handler() { // from class: com.fimi.soul.module.remote.RemoteEndCaliFragment.1
        @Override // android.os.Handler
        public void handleMessage(Message message) {
            super.handleMessage(message);
            if (RemoteEndCaliFragment.this.f9984e != null) {
                RemoteEndCaliFragment.this.f9984e.mo30174a(C1704R.C1706id.endmidcalibration, C1704R.C1706id.caliremotestart);
            }
        }
    };

    /* renamed from: a */
    public void m30171a() {
        a(C1704R.C1706id.endmidcalibration, C1704R.C1706id.errorcalifragment, getString(C1704R.C1707string.remote_cali_outtime), false);
    }

    @Override // com.fimi.soul.module.remote.BaseRemoteFragment, android.support.p001v4.app.Fragment
    public void onAttach(Activity activity) {
        super.onAttach(activity);
    }

    @Override // com.fimi.soul.module.remote.BaseRemoteFragment, android.view.View.OnClickListener
    public void onClick(View view) {
        switch (view.getId()) {
            case C1704R.C1706id.nextbutton /* 2131755506 */:
            default:
                return;
            case C1704R.C1706id.black_btn /* 2131756179 */:
                if (!isVisible() || this.f9984e == null) {
                    return;
                }
                this.f9984e.mo30175a();
                return;
        }
    }

    @Override // com.fimi.soul.module.remote.BaseRemoteFragment, android.support.p001v4.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(C1704R.layout.endremotecalibation, (ViewGroup) null);
        this.f10031g = (TextView) inflate.findViewById(C1704R.C1706id.heardView).findViewById(C1704R.C1706id.tv_settingTitle);
        this.f10031g.setText(C1704R.C1707string.calireming);
        this.f10032h = (Button) inflate.findViewById(C1704R.C1706id.heardView).findViewById(C1704R.C1706id.black_btn);
        this.f10032h.setOnClickListener(this);
        this.f10030f = (Button) inflate.findViewById(C1704R.C1706id.nextbutton);
        this.f10030f.setOnClickListener(this);
        C3103au.m29232a(getActivity().getAssets(), this.f10031g, this.f10032h, this.f10030f);
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
                    if (!isVisible()) {
                        return;
                    }
                    C2540a.m31307a().m31305a("98");
                    if (c2083a.mo32918R().m32030c() != 3 || c2083a.mo32918R().m32031b() != 86) {
                        return;
                    }
                    m30171a();
                    return;
                default:
                    return;
            }
        }
    }

    @Override // android.support.p001v4.app.Fragment
    public void onHiddenChanged(boolean z) {
        super.onHiddenChanged(z);
        if (!z) {
            this.f10033i.sendEmptyMessageDelayed(0, 2000L);
        }
    }
}
