package com.fimi.soul.module.calibcompass;

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
import com.fimi.soul.drone.p205i.C2352k;
import com.fimi.soul.module.p214c.C2523d;
import com.fimi.soul.utils.C3103au;
/* loaded from: classes.dex */
public class CaliCompassSecondFragment extends BaseCaliCompassFragment {

    /* renamed from: f */
    private TextView f8270f;

    /* renamed from: g */
    private TextView f8271g;

    /* renamed from: h */
    private Button f8272h;

    /* renamed from: i */
    private Button f8273i;

    /* renamed from: j */
    private Handler f8274j = new Handler() { // from class: com.fimi.soul.module.calibcompass.CaliCompassSecondFragment.1
        @Override // android.os.Handler
        public void handleMessage(Message message) {
            super.handleMessage(message);
            C2523d.m31374a(CaliCompassSecondFragment.this.f8198b).m31371b((byte) 1, (byte) 1, (byte) 3);
        }
    };

    /* renamed from: a */
    private void m31311a(View view) {
        this.f8271g = (TextView) view.findViewById(C1704R.C1706id.showtitleone);
        this.f8273i = (Button) view.findViewById(C1704R.C1706id.nextstep);
        this.f8273i.setOnClickListener(this);
        C3103au.m29232a(getActivity().getAssets(), this.f8271g, this.f8273i);
    }

    @Override // com.fimi.soul.module.calibcompass.BaseCaliCompassFragment, android.view.View.OnClickListener
    public void onClick(View view) {
        super.onClick(view);
        switch (view.getId()) {
            case C1704R.C1706id.black_btn /* 2131756179 */:
                if (this.f8201e == null) {
                    return;
                }
                this.f8201e.mo31341a();
                return;
            default:
                return;
        }
    }

    @Override // com.fimi.soul.module.calibcompass.BaseCaliCompassFragment, android.support.p001v4.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(C1704R.layout.cali_compass_second, (ViewGroup) null);
        m31311a(inflate);
        return inflate;
    }

    @Override // com.fimi.soul.module.calibcompass.BaseCaliCompassFragment, com.fimi.soul.drone.C2104d.AbstractC2106b
    public void onDroneEvent(C2104d.EnumC2105a enumC2105a, C2083a c2083a) {
        super.onDroneEvent(enumC2105a, c2083a);
        if (!isVisible() || enumC2105a != C2104d.EnumC2105a.CaliCompass) {
            return;
        }
        C2352k m32978k = c2083a.m32978k();
        if (m32978k.m31916d() != 2 || m32978k.m31914e() != 1 || m32978k.m31920b() != 1 || m32978k.m31918c() != 1) {
            return;
        }
        C2540a.m31307a().m31305a("153");
        this.f8199c.beginTransaction().hide(this).show(this.f8199c.findFragmentByTag("thrid")).commitAllowingStateLoss();
    }

    @Override // android.support.p001v4.app.Fragment
    public void onHiddenChanged(boolean z) {
        super.onHiddenChanged(z);
        if (!z) {
            this.f8274j.sendEmptyMessageDelayed(0, 2000L);
        }
    }
}
