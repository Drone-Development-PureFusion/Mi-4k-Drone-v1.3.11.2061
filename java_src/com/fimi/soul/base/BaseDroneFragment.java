package com.fimi.soul.base;

import android.app.Activity;
import com.fimi.kernel.BaseFragment;
import com.fimi.soul.drone.C2083a;
/* loaded from: classes.dex */
public abstract class BaseDroneFragment extends BaseFragment {

    /* renamed from: a */
    private DroidPlannerApp f4487a;

    /* renamed from: d */
    public DroidPlannerApp m34281d() {
        return this.f4487a;
    }

    /* renamed from: e */
    protected C2083a m34280e() {
        return m34281d().f4493a;
    }

    @Override // android.support.p001v4.app.Fragment
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        this.f4487a = (DroidPlannerApp) activity.getApplication();
    }
}
