package com.fimi.soul.module.droneFragment;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.p001v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.fimi.kernel.view.percent.PercentRelativeLayout;
import com.fimi.overseas.soul.C1704R;
import com.fimi.soul.base.DroidPlannerApp;
import com.fimi.soul.drone.C2083a;
import com.fimi.soul.drone.C2104d;
import com.fimi.soul.utils.C3103au;
/* loaded from: classes.dex */
public class CameraFullScreenShowLeadFragment extends Fragment implements View.OnClickListener, C2104d.AbstractC2106b {

    /* renamed from: a */
    private TextView f8364a;

    /* renamed from: b */
    private ImageView f8365b;

    /* renamed from: c */
    private ImageView f8366c;

    /* renamed from: d */
    private PercentRelativeLayout f8367d;

    /* renamed from: e */
    private C2083a f8368e;

    /* renamed from: a */
    private void m31238a() {
        m31236a(getArguments().getBoolean("isOpen", true));
        this.f8368e.mo32908a(this);
    }

    /* renamed from: a */
    private void m31237a(View view) {
        this.f8367d = (PercentRelativeLayout) view.findViewById(C1704R.C1706id.root_layout);
        this.f8364a = (TextView) view.findViewById(C1704R.C1706id.prompt_tv);
        this.f8365b = (ImageView) view.findViewById(C1704R.C1706id.guide_full_sliding_open_iv);
        this.f8366c = (ImageView) view.findViewById(C1704R.C1706id.guide_full_sliding_close_iv);
        this.f8367d.setOnClickListener(this);
        C3103au.m29232a(getResources().getAssets(), this.f8364a);
    }

    /* renamed from: a */
    public void m31236a(boolean z) {
        if (z) {
            this.f8365b.setVisibility(0);
            this.f8366c.setVisibility(4);
            this.f8364a.setText(getString(C1704R.C1707string.camera_show_lead_promat_open));
            return;
        }
        this.f8365b.setVisibility(4);
        this.f8366c.setVisibility(0);
        this.f8364a.setText(getString(C1704R.C1707string.camera_show_lead_promat_close));
    }

    @Override // android.support.p001v4.app.Fragment
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        this.f8368e = ((DroidPlannerApp) activity.getApplication()).f4493a;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (C1704R.C1706id.root_layout == view.getId()) {
            this.f8368e.mo32909a(C2104d.EnumC2105a.CLOSE_FULL_SCREEN_LEAD);
        }
    }

    @Override // android.support.p001v4.app.Fragment
    @Nullable
    public View onCreateView(LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, Bundle bundle) {
        View inflate = View.inflate(getActivity(), C1704R.layout.fragment_camera_full_screen_show_lead, null);
        m31237a(inflate);
        m31238a();
        return inflate;
    }

    @Override // android.support.p001v4.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        this.f8368e.mo32903b(this);
    }

    @Override // com.fimi.soul.drone.C2104d.AbstractC2106b
    public void onDroneEvent(C2104d.EnumC2105a enumC2105a, C2083a c2083a) {
    }
}
