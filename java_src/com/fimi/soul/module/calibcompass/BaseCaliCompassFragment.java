package com.fimi.soul.module.calibcompass;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.p001v4.app.Fragment;
import android.support.p001v4.app.FragmentManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.fimi.soul.base.DroidPlannerApp;
import com.fimi.soul.drone.C2083a;
import com.fimi.soul.drone.C2104d;
import com.fimi.soul.module.p214c.C2523d;
/* loaded from: classes.dex */
public class BaseCaliCompassFragment extends Fragment implements View.OnClickListener, C2104d.AbstractC2106b {

    /* renamed from: a */
    protected Context f8197a;

    /* renamed from: b */
    protected C2083a f8198b;

    /* renamed from: c */
    protected FragmentManager f8199c;

    /* renamed from: d */
    protected C2523d f8200d;

    /* renamed from: e */
    protected AbstractC2524a f8201e;

    /* renamed from: com.fimi.soul.module.calibcompass.BaseCaliCompassFragment$a */
    /* loaded from: classes.dex */
    protected interface AbstractC2524a {
        /* renamed from: a */
        void mo31341a();
    }

    @Override // android.support.p001v4.app.Fragment
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        this.f8201e = (AbstractC2524a) activity;
        this.f8197a = activity.getApplicationContext();
        this.f8198b = ((DroidPlannerApp) activity.getApplication()).f4493a;
        this.f8199c = getFragmentManager();
        this.f8200d = C2523d.m31374a(this.f8198b);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
    }

    @Override // android.support.p001v4.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return super.onCreateView(layoutInflater, viewGroup, bundle);
    }

    @Override // android.support.p001v4.app.Fragment
    public void onDetach() {
        super.onDetach();
        if (this.f8201e != null) {
            this.f8201e = null;
        }
    }

    @Override // com.fimi.soul.drone.C2104d.AbstractC2106b
    public void onDroneEvent(C2104d.EnumC2105a enumC2105a, C2083a c2083a) {
    }

    @Override // android.support.p001v4.app.Fragment
    public void onStart() {
        super.onStart();
        this.f8198b.mo32908a(this);
    }

    @Override // android.support.p001v4.app.Fragment
    public void onStop() {
        super.onStop();
        this.f8198b.mo32903b(this);
    }
}
