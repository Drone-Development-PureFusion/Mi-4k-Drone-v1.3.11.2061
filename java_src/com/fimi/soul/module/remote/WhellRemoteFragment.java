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
import com.fimi.kernel.p165d.C1648b;
import com.fimi.overseas.soul.C1704R;
import com.fimi.soul.drone.C2083a;
import com.fimi.soul.drone.C2104d;
import com.fimi.soul.drone.p205i.C2307am;
import com.fimi.soul.module.calibcompass.C2540a;
import com.fimi.soul.utils.C3103au;
import com.fimi.soul.view.RemoteRollerView;
/* loaded from: classes.dex */
public class WhellRemoteFragment extends BaseRemoteFragment {

    /* renamed from: f */
    private TextView f10088f;

    /* renamed from: g */
    private TextView f10089g;

    /* renamed from: h */
    private TextView f10090h;

    /* renamed from: i */
    private Button f10091i;

    /* renamed from: j */
    private Button f10092j;

    /* renamed from: k */
    private RemoteRollerView f10093k;

    /* renamed from: l */
    private RemoteRollerView f10094l;

    /* renamed from: m */
    private RemoteRollerView f10095m;

    /* renamed from: n */
    private RemoteRollerView f10096n;

    /* renamed from: o */
    private boolean f10097o;

    /* renamed from: p */
    private final int f10098p = 1;

    /* renamed from: q */
    private Handler f10099q = new Handler() { // from class: com.fimi.soul.module.remote.WhellRemoteFragment.1
        @Override // android.os.Handler
        public void handleMessage(Message message) {
            super.handleMessage(message);
            if (!WhellRemoteFragment.this.f10097o) {
                C1648b.m34863b(WhellRemoteFragment.this.getActivity()).m34867a(WhellRemoteFragment.this.getString(C1704R.C1707string.caliwhell));
            }
        }
    };

    /* renamed from: a */
    public void m30161a(boolean z, String str) {
        if (this.f10099q.hasMessages(1)) {
            this.f10099q.removeMessages(1);
        }
        if (z) {
            a(C1704R.C1706id.cariremotecomple, C1704R.C1706id.errorcalifragment, "", z);
        } else {
            a(C1704R.C1706id.cariremotecomple, C1704R.C1706id.errorcalifragment, str, z);
        }
    }

    @Override // com.fimi.soul.module.remote.BaseRemoteFragment, android.support.p001v4.app.Fragment
    public void onAttach(Activity activity) {
        super.onAttach(activity);
    }

    @Override // com.fimi.soul.module.remote.BaseRemoteFragment, android.view.View.OnClickListener
    public void onClick(View view) {
        super.onClick(view);
        switch (view.getId()) {
            case C1704R.C1706id.nextbutton /* 2131755506 */:
                this.f9983d.m31352p();
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
        View inflate = layoutInflater.inflate(C1704R.layout.whellcalicomplete, (ViewGroup) null);
        this.f10090h = (TextView) inflate.findViewById(C1704R.C1706id.heardView).findViewById(C1704R.C1706id.tv_settingTitle);
        this.f10090h.setText(C1704R.C1707string.calireming);
        this.f10092j = (Button) inflate.findViewById(C1704R.C1706id.heardView).findViewById(C1704R.C1706id.black_btn);
        this.f10092j.setOnClickListener(this);
        this.f10088f = (TextView) inflate.findViewById(C1704R.C1706id.showtitleone);
        this.f10089g = (TextView) inflate.findViewById(C1704R.C1706id.showtitletwo);
        this.f10091i = (Button) inflate.findViewById(C1704R.C1706id.nextbutton);
        this.f10091i.setOnClickListener(this);
        this.f10093k = (RemoteRollerView) inflate.findViewById(C1704R.C1706id.left_up_arrow);
        this.f10094l = (RemoteRollerView) inflate.findViewById(C1704R.C1706id.left_down_arrow);
        this.f10095m = (RemoteRollerView) inflate.findViewById(C1704R.C1706id.right_up_arrow);
        this.f10096n = (RemoteRollerView) inflate.findViewById(C1704R.C1706id.right_down_arrow);
        this.f10093k.setInitView(0);
        this.f10094l.setInitView(1);
        this.f10095m.setInitView(2);
        this.f10096n.setInitView(3);
        this.f10093k.setSweep(51.0f);
        this.f10094l.setSweep(1.0f);
        this.f10095m.setSweep(51.0f);
        this.f10096n.setSweep(1.0f);
        C3103au.m29232a(getActivity().getAssets(), this.f10091i, this.f10088f, this.f10089g);
        return inflate;
    }

    @Override // com.fimi.soul.module.remote.BaseRemoteFragment, com.fimi.soul.drone.C2104d.AbstractC2106b
    public void onDroneEvent(C2104d.EnumC2105a enumC2105a, C2083a c2083a) {
        super.onDroneEvent(enumC2105a, c2083a);
        if (isVisible()) {
            switch (enumC2105a) {
                case QuitCaliRemote:
                    c2083a.mo32903b(this);
                    return;
                case backControl:
                    C2540a.m31307a().m31305a("98");
                    if (c2083a.mo32918R().m32031b() == 86 && c2083a.mo32918R().m32030c() == 2 && c2083a.mo32918R().m32029d() == 1) {
                        m30161a(true, "");
                        return;
                    } else if (c2083a.mo32918R().m32030c() >= 2 && c2083a.mo32918R().m32031b() == 85 && c2083a.mo32918R().m32029d() == 2) {
                        this.f10097o = true;
                        m30161a(false, getString(C1704R.C1707string.remote_cali_rocker_failue));
                        return;
                    } else if (c2083a.mo32918R().m32030c() >= 2 && c2083a.mo32918R().m32031b() == 86 && c2083a.mo32918R().m32029d() == 2) {
                        this.f10097o = true;
                        m30161a(false, getString(C1704R.C1707string.remote_cali_roller_failue));
                        return;
                    } else if (c2083a.mo32918R().m32030c() != 3 || c2083a.mo32918R().m32031b() != 86) {
                        return;
                    } else {
                        m30161a(false, getString(C1704R.C1707string.remote_cali_outtime));
                        return;
                    }
                case NEWREMOTEMODEL:
                    C2307am m32980i = c2083a.m32980i();
                    short m32246d = m32980i.m32246d() > 50 ? m32980i.m32246d() : m32980i.m32246d();
                    short m32244e = m32980i.m32244e() > 50 ? m32980i.m32244e() : m32980i.m32244e();
                    if (m32246d >= 992) {
                        m32246d = 1023;
                    }
                    int i = (int) (m32246d * 0.0977d);
                    int i2 = (int) ((m32244e >= 992 ? (short) 1023 : m32244e) * 0.0977d);
                    this.f10093k.setSweep(i > 50 ? i : 51.0f);
                    this.f10094l.setSweep(i < 50 ? 50 - i : 1.0f);
                    this.f10095m.setSweep(i2 > 50 ? i2 : 51.0f);
                    this.f10096n.setSweep(i2 < 50 ? 50 - i2 : 1.0f);
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
            this.f10099q.sendEmptyMessageDelayed(1, 2000L);
        } else {
            this.f10097o = false;
        }
    }
}
