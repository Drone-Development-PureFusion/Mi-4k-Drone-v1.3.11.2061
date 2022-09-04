package com.fimi.soul.module.remote;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import com.fimi.kernel.utils.C1681v;
import com.fimi.kernel.utils.C1688z;
import com.fimi.overseas.soul.C1704R;
import com.fimi.soul.base.DroidPlannerApp;
import com.fimi.soul.drone.C2083a;
import com.fimi.soul.drone.C2104d;
import com.fimi.soul.drone.p205i.C2307am;
import com.fimi.soul.utils.C3103au;
import com.fimi.soul.view.MidView;
/* loaded from: classes.dex */
public class RemoteBeginMidCaFragment extends BaseRemoteFragment {

    /* renamed from: f */
    public DroidPlannerApp f10010f;

    /* renamed from: g */
    EnumC2839a f10011g;

    /* renamed from: h */
    private TextView f10012h;

    /* renamed from: i */
    private Button f10013i;

    /* renamed from: j */
    private Button f10014j;

    /* renamed from: k */
    private MidView f10015k;

    /* renamed from: l */
    private MidView f10016l;

    /* renamed from: m */
    private C2083a f10017m;

    /* renamed from: com.fimi.soul.module.remote.RemoteBeginMidCaFragment$a */
    /* loaded from: classes.dex */
    enum EnumC2839a {
        jap,
        usa
    }

    @Override // com.fimi.soul.module.remote.BaseRemoteFragment, android.support.p001v4.app.Fragment
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        this.f10010f = (DroidPlannerApp) activity.getApplication();
        this.f10017m = this.f10010f.f4493a;
    }

    @Override // com.fimi.soul.module.remote.BaseRemoteFragment, android.view.View.OnClickListener
    public void onClick(View view) {
        switch (view.getId()) {
            case C1704R.C1706id.nextbutton /* 2131755506 */:
                if (!this.f10017m.mo32906ab().mo32588a()) {
                    C1688z.m34447a(this.f9980a, this.f9980a.getString(C1704R.C1707string.cali_fail_please_connect_remote), C1688z.f4191b);
                    return;
                } else if (this.f10017m.mo32905ac()) {
                    C1688z.m34447a(this.f9980a, this.f9980a.getString(C1704R.C1707string.close_plane_to_remote_cali), C1688z.f4191b);
                    return;
                } else {
                    this.f9983d.m31356l();
                    this.f9982c.beginTransaction().hide(this.f9982c.findFragmentById(C1704R.C1706id.beginmidcalibration)).commit();
                    this.f9982c.beginTransaction().show(this.f9982c.findFragmentById(C1704R.C1706id.midcalibrationing)).commit();
                    return;
                }
            default:
                return;
        }
    }

    @Override // com.fimi.soul.module.remote.BaseRemoteFragment, android.support.p001v4.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(C1704R.layout.beginmidcalibration, (ViewGroup) null);
        this.f10012h = (TextView) inflate.findViewById(C1704R.C1706id.heardView).findViewById(C1704R.C1706id.tv_settingTitle);
        this.f10012h.setText(C1704R.C1707string.calireming);
        this.f10014j = (Button) inflate.findViewById(C1704R.C1706id.headview).findViewById(C1704R.C1706id.back_btn);
        this.f10015k = (MidView) inflate.findViewById(C1704R.C1706id.rightVew);
        this.f10016l = (MidView) inflate.findViewById(C1704R.C1706id.leftView);
        this.f10013i = (Button) inflate.findViewById(C1704R.C1706id.nextbutton);
        this.f10013i.setOnClickListener(this);
        this.f10014j.setOnClickListener(this);
        C3103au.m29232a(getActivity().getAssets(), this.f10012h, this.f10014j, this.f10013i);
        return inflate;
    }

    @Override // com.fimi.soul.module.remote.BaseRemoteFragment, com.fimi.soul.drone.C2104d.AbstractC2106b
    public void onDroneEvent(C2104d.EnumC2105a enumC2105a, C2083a c2083a) {
        if (isVisible()) {
            switch (enumC2105a) {
                case NEWREMOTEMODEL:
                    if (!isVisible()) {
                        return;
                    }
                    C2307am m32980i = c2083a.m32980i();
                    if (this.f10011g == EnumC2839a.jap) {
                        this.f10016l.m28877a((float) (m32980i.m32242f() * 0.0977d), (float) (m32980i.m32238h() * 0.0977d));
                        this.f10015k.m28877a((float) (m32980i.m32236i() * 0.0977d), (float) (m32980i.m32240g() * 0.0977d));
                        return;
                    } else if (this.f10011g != EnumC2839a.usa) {
                        return;
                    } else {
                        this.f10015k.m28877a((float) (m32980i.m32236i() * 0.0977d), (float) (m32980i.m32238h() * 0.0977d));
                        this.f10016l.m28877a((float) (m32980i.m32242f() * 0.0977d), (float) (m32980i.m32240g() * 0.0977d));
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
            this.f10011g = EnumC2839a.usa;
        } else {
            this.f10011g = EnumC2839a.jap;
        }
    }
}
