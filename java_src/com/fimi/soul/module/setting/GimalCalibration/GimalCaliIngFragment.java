package com.fimi.soul.module.setting.GimalCalibration;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.p001v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import com.fimi.kernel.view.progress.ProgressView;
import com.fimi.overseas.soul.C1704R;
import com.fimi.soul.utils.C3103au;
/* loaded from: classes.dex */
public class GimalCaliIngFragment extends Fragment implements View.OnClickListener {

    /* renamed from: i */
    private static final int f10187i = 100;

    /* renamed from: a */
    private TextView f10188a;

    /* renamed from: b */
    private TextView f10189b;

    /* renamed from: c */
    private TextView f10190c;

    /* renamed from: d */
    private TextView f10191d;

    /* renamed from: e */
    private TextView f10192e;

    /* renamed from: f */
    private Button f10193f;

    /* renamed from: g */
    private ProgressView f10194g;

    /* renamed from: h */
    private AbstractC2871a f10195h;

    /* renamed from: com.fimi.soul.module.setting.GimalCalibration.GimalCaliIngFragment$a */
    /* loaded from: classes.dex */
    interface AbstractC2871a {
        /* renamed from: a */
        void mo30139a();
    }

    /* renamed from: a */
    private void m30140a(View view) {
        this.f10188a = (TextView) view.findViewById(C1704R.C1706id.heardView).findViewById(C1704R.C1706id.tv_settingTitle);
        this.f10188a.setText(C1704R.C1707string.gc_calbrating_titling);
        this.f10189b = (TextView) view.findViewById(C1704R.C1706id.process);
        this.f10190c = (TextView) view.findViewById(C1704R.C1706id.processsign);
        this.f10191d = (TextView) view.findViewById(C1704R.C1706id.desTitle);
        this.f10192e = (TextView) view.findViewById(C1704R.C1706id.desTips);
        this.f10193f = (Button) view.findViewById(C1704R.C1706id.heardView).findViewById(C1704R.C1706id.black_btn);
        this.f10193f.setOnClickListener(this);
        this.f10194g = (ProgressView) view.findViewById(C1704R.C1706id.pro_calibration);
        this.f10194g.setMaxCount(100.0f);
        C3103au.m29232a(getActivity().getAssets(), this.f10188a, this.f10191d, this.f10193f);
        C3103au.m29218b(getActivity().getAssets(), this.f10189b, this.f10190c);
    }

    /* renamed from: a */
    public void m30141a(int i) {
        this.f10189b.setText(i + "");
        this.f10194g.setCurrentCount(i);
    }

    @Override // android.support.p001v4.app.Fragment
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        this.f10195h = (AbstractC2871a) activity;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view.getId() != C1704R.C1706id.black_btn || this.f10195h == null) {
            return;
        }
        this.f10195h.mo30139a();
    }

    @Override // android.support.p001v4.app.Fragment
    @Nullable
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(C1704R.layout.gimalcaliing, (ViewGroup) null);
        m30140a(inflate);
        return inflate;
    }

    @Override // android.support.p001v4.app.Fragment
    public void onDetach() {
        super.onDetach();
        if (this.f10195h != null) {
            this.f10195h = null;
        }
    }
}
