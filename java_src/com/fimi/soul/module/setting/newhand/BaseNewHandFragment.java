package com.fimi.soul.module.setting.newhand;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.p001v4.app.Fragment;
import android.support.p001v4.app.FragmentManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.fimi.kernel.C1642c;
import com.fimi.overseas.soul.C1704R;
import com.fimi.soul.base.C1756a;
import com.fimi.soul.utils.C3103au;
/* loaded from: classes.dex */
public abstract class BaseNewHandFragment extends Fragment implements View.OnClickListener {

    /* renamed from: a */
    protected Context f10604a;

    /* renamed from: b */
    protected FragmentManager f10605b;

    /* renamed from: c */
    private TextView f10606c;

    /* renamed from: a */
    protected abstract View mo29834a(LayoutInflater layoutInflater);

    /* renamed from: a */
    protected abstract void mo29835a();

    /* renamed from: a */
    protected abstract void mo29833a(View view);

    /* renamed from: b */
    protected abstract String mo29832b();

    @Override // android.support.p001v4.app.Fragment
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        this.f10604a = activity.getApplicationContext();
        this.f10605b = getFragmentManager();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        switch (view.getId()) {
            case C1704R.C1706id.newhand_skip_tv /* 2131755881 */:
                getActivity().finish();
                return;
            default:
                return;
        }
    }

    @Override // android.support.p001v4.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        View mo29834a = mo29834a(layoutInflater);
        mo29833a(mo29834a);
        mo29835a();
        this.f10606c = (TextView) mo29834a.findViewById(C1704R.C1706id.newhand_skip_tv);
        C1642c.m34887c().mo34872d(C1756a.f4560s);
        this.f10606c.setOnClickListener(this);
        C3103au.m29232a(getActivity().getAssets(), this.f10606c);
        return mo29834a;
    }
}
