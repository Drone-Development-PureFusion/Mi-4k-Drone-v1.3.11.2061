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
import com.fimi.kernel.utils.C1688z;
import com.fimi.overseas.soul.C1704R;
import com.fimi.soul.drone.C2083a;
import com.fimi.soul.drone.C2104d;
import com.fimi.soul.drone.p205i.C2307am;
import com.fimi.soul.utils.C3103au;
import com.fimi.soul.view.MidView;
import com.fimi.soul.view.RemoteRollerView;
import it.p273a.p274a.AbstractC10866e;
/* loaded from: classes.dex */
public class RemoteRollerFragment extends BaseRemoteFragment {

    /* renamed from: f */
    MidView f10072f;

    /* renamed from: g */
    MidView f10073g;

    /* renamed from: h */
    EnumC2854a f10074h;

    /* renamed from: i */
    private TextView f10075i;

    /* renamed from: j */
    private TextView f10076j;

    /* renamed from: k */
    private TextView f10077k;

    /* renamed from: l */
    private Button f10078l;

    /* renamed from: m */
    private Button f10079m;

    /* renamed from: n */
    private RemoteRollerView f10080n;

    /* renamed from: o */
    private RemoteRollerView f10081o;

    /* renamed from: p */
    private RemoteRollerView f10082p;

    /* renamed from: q */
    private RemoteRollerView f10083q;

    /* renamed from: com.fimi.soul.module.remote.RemoteRollerFragment$a */
    /* loaded from: classes.dex */
    enum EnumC2854a {
        jap,
        usa
    }

    /* renamed from: a */
    public void m30165a() {
        if (this.f9981b.mo32905ac()) {
            if (this.f9981b.m33009am()) {
                this.f10076j.setText(C1704R.C1707string.calremotewaringfly);
            } else {
                this.f10076j.setText(C1704R.C1707string.remotewaring);
            }
            this.f10078l.setEnabled(false);
            m30163a(this.f10078l, 77);
            this.f10077k.setVisibility(4);
        } else if (!this.f9981b.mo32906ab().mo32588a()) {
            this.f10078l.setEnabled(false);
            m30163a(this.f10078l, 77);
            this.f10076j.setText(C1704R.C1707string.disconremote);
            this.f10077k.setVisibility(4);
        } else {
            if (!this.f10078l.isEnabled()) {
                C1648b.m34863b(getActivity()).m34867a(getString(C1704R.C1707string.reminder_calibration_canStart));
            }
            this.f10078l.setEnabled(true);
            m30163a(this.f10078l, AbstractC10866e.f34827F);
            this.f10076j.setText(C1704R.C1707string.remote_roller_title_one);
            this.f10077k.setVisibility(0);
        }
    }

    /* renamed from: a */
    public void m30164a(View view) {
        this.f10078l = (Button) view.findViewById(C1704R.C1706id.nextbutton);
        this.f10078l.setOnClickListener(this);
        this.f10078l.setEnabled(false);
        this.f10080n = (RemoteRollerView) view.findViewById(C1704R.C1706id.left_up_arrow);
        this.f10081o = (RemoteRollerView) view.findViewById(C1704R.C1706id.left_down_arrow);
        this.f10082p = (RemoteRollerView) view.findViewById(C1704R.C1706id.right_up_arrow);
        this.f10083q = (RemoteRollerView) view.findViewById(C1704R.C1706id.right_down_arrow);
        this.f10080n.setInitView(0);
        this.f10081o.setInitView(1);
        this.f10082p.setInitView(2);
        this.f10083q.setInitView(3);
        this.f10080n.setSweep(51.0f);
        this.f10081o.setSweep(1.0f);
        this.f10082p.setSweep(51.0f);
        this.f10083q.setSweep(1.0f);
        this.f10075i.setText(C1704R.C1707string.calibrate_remote);
        C3103au.m29232a(getActivity().getAssets(), this.f10079m, this.f10075i, this.f10076j, this.f10077k, this.f10078l);
        m30165a();
    }

    /* renamed from: a */
    public void m30163a(Button button, int i) {
        button.setTextColor(button.getTextColors().withAlpha(i));
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
                if (!this.f9981b.mo32906ab().mo32588a()) {
                    C1688z.m34447a(this.f9980a, this.f9980a.getString(C1704R.C1707string.cali_fail_please_connect_remote), C1688z.f4191b);
                    return;
                } else if (this.f9981b.mo32905ac()) {
                    C1688z.m34447a(this.f9980a, this.f9980a.getString(C1704R.C1707string.close_plane_to_remote_cali), C1688z.f4191b);
                    return;
                } else {
                    this.f9983d.m31356l();
                    if (this.f9984e == null) {
                        return;
                    }
                    this.f9984e.mo30174a(C1704R.C1706id.remote_roller_fragment, C1704R.C1706id.midcalibrationing);
                    return;
                }
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
        View inflate = layoutInflater.inflate(C1704R.layout.fragment_remote_roller, (ViewGroup) null);
        this.f10072f = (MidView) inflate.findViewById(C1704R.C1706id.leftview).findViewById(C1704R.C1706id.rightremoteview);
        this.f10073g = (MidView) inflate.findViewById(C1704R.C1706id.rightview).findViewById(C1704R.C1706id.rightremoteview);
        this.f10079m = (Button) inflate.findViewById(C1704R.C1706id.heardView).findViewById(C1704R.C1706id.black_btn);
        this.f10079m.setOnClickListener(this);
        this.f10075i = (TextView) inflate.findViewById(C1704R.C1706id.heardView).findViewById(C1704R.C1706id.tv_settingTitle);
        this.f10076j = (TextView) inflate.findViewById(C1704R.C1706id.showtitleone);
        this.f10077k = (TextView) inflate.findViewById(C1704R.C1706id.showtitletwo);
        m30164a(inflate);
        return inflate;
    }

    @Override // com.fimi.soul.module.remote.BaseRemoteFragment, com.fimi.soul.drone.C2104d.AbstractC2106b
    public void onDroneEvent(C2104d.EnumC2105a enumC2105a, C2083a c2083a) {
        float f = 51.0f;
        float f2 = 1.0f;
        super.onDroneEvent(enumC2105a, c2083a);
        if (enumC2105a == C2104d.EnumC2105a.CLEANALLOBJ) {
            m30165a();
        }
        if (isVisible()) {
            switch (enumC2105a) {
                case NEWREMOTEMODEL:
                    C2307am m32980i = c2083a.m32980i();
                    if (this.f10074h == EnumC2854a.jap) {
                        this.f10072f.m28877a((float) (m32980i.m32242f() * 0.0977d), (float) (m32980i.m32238h() * 0.0977d));
                        this.f10073g.m28877a((float) (m32980i.m32236i() * 0.0977d), (float) (m32980i.m32240g() * 0.0977d));
                    } else if (this.f10074h == EnumC2854a.usa) {
                        this.f10073g.m28877a((float) (m32980i.m32236i() * 0.0977d), (float) (m32980i.m32238h() * 0.0977d));
                        this.f10072f.m28877a((float) (m32980i.m32242f() * 0.0977d), (float) (m32980i.m32240g() * 0.0977d));
                    }
                    short m32246d = m32980i.m32246d() > 50 ? m32980i.m32246d() : m32980i.m32246d();
                    short m32244e = m32980i.m32244e() > 50 ? m32980i.m32244e() : m32980i.m32244e();
                    if (m32246d >= 992) {
                        m32246d = 1023;
                    }
                    int i = (int) (m32246d * 0.0977d);
                    int i2 = (int) ((m32244e >= 992 ? (short) 1023 : m32244e) * 0.0977d);
                    this.f10080n.setSweep(i > 50 ? i : 51.0f);
                    this.f10081o.setSweep(i < 50 ? 50 - i : 1.0f);
                    RemoteRollerView remoteRollerView = this.f10082p;
                    if (i2 > 50) {
                        f = i2;
                    }
                    remoteRollerView.setSweep(f);
                    RemoteRollerView remoteRollerView2 = this.f10083q;
                    if (i2 < 50) {
                        f2 = 50 - i2;
                    }
                    remoteRollerView2.setSweep(f2);
                    return;
                case Remotecontrol:
                    m30165a();
                    return;
                default:
                    return;
            }
        }
    }

    @Override // android.support.p001v4.app.Fragment
    public void onHiddenChanged(boolean z) {
        super.onHiddenChanged(z);
        this.f10078l.setEnabled(false);
    }

    @Override // com.fimi.soul.module.remote.BaseRemoteFragment, android.support.p001v4.app.Fragment
    public void onStart() {
        super.onStart();
        if (C1681v.m34543a(getActivity()).m34546a().getInt(RemoteModelActivity.f10053a, 0) == 0) {
            this.f10074h = EnumC2854a.usa;
        } else {
            this.f10074h = EnumC2854a.jap;
        }
    }
}
