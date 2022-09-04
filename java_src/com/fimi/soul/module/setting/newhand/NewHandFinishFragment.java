package com.fimi.soul.module.setting.newhand;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import com.fimi.kernel.C1642c;
import com.fimi.overseas.soul.C1704R;
import com.fimi.soul.base.C1756a;
import com.fimi.soul.module.droneui.FlightActivity;
import com.fimi.soul.utils.C3103au;
/* loaded from: classes.dex */
public class NewHandFinishFragment extends BaseNewHandFragment {

    /* renamed from: c */
    TextView f10696c;

    /* renamed from: d */
    TextView f10697d;

    /* renamed from: e */
    Button f10698e;

    /* renamed from: f */
    Button f10699f;

    @Override // com.fimi.soul.module.setting.newhand.BaseNewHandFragment
    /* renamed from: a */
    protected View mo29834a(LayoutInflater layoutInflater) {
        return layoutInflater.inflate(C1704R.layout.fragment_newhand_finish, (ViewGroup) null);
    }

    @Override // com.fimi.soul.module.setting.newhand.BaseNewHandFragment
    /* renamed from: a */
    protected void mo29835a() {
    }

    @Override // com.fimi.soul.module.setting.newhand.BaseNewHandFragment
    /* renamed from: a */
    protected void mo29833a(View view) {
        this.f10696c = (TextView) view.findViewById(C1704R.C1706id.tv_finish);
        this.f10697d = (TextView) view.findViewById(C1704R.C1706id.tv_content);
        this.f10698e = (Button) view.findViewById(C1704R.C1706id.btn_study_again);
        this.f10698e.setOnClickListener(this);
        this.f10699f = (Button) view.findViewById(C1704R.C1706id.btn_try_fly);
        this.f10699f.setOnClickListener(this);
        C3103au.m29232a(this.f10604a.getAssets(), this.f10696c, this.f10697d, this.f10698e, this.f10699f);
    }

    @Override // com.fimi.soul.module.setting.newhand.BaseNewHandFragment
    /* renamed from: b */
    protected String mo29832b() {
        return NewHandFiveFragment.class.getName().toLowerCase();
    }

    @Override // com.fimi.soul.module.setting.newhand.BaseNewHandFragment, android.view.View.OnClickListener
    public void onClick(View view) {
        super.onClick(view);
        if (view == this.f10698e) {
            NewHandOneFragment newHandOneFragment = new NewHandOneFragment();
            this.f10605b.beginTransaction().replace(C1704R.C1706id.root_layout, newHandOneFragment, newHandOneFragment.mo29832b()).commitAllowingStateLoss();
        }
        if (view == this.f10699f) {
            C1642c.m34887c().mo34876a(C1756a.f4560s, true);
            if (C1642c.m34887c().mo34872d(C1756a.f4519L)) {
                getActivity().finish();
                return;
            }
            startActivity(new Intent(getActivity(), FlightActivity.class));
            getActivity().finish();
        }
    }
}
