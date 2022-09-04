package com.fimi.soul.module.remote;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.p001v4.app.Fragment;
import android.support.p001v4.app.FragmentManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.fimi.overseas.soul.C1704R;
import com.fimi.soul.base.DroidPlannerApp;
import com.fimi.soul.drone.C2083a;
import com.fimi.soul.drone.C2104d;
import com.fimi.soul.module.p214c.C2523d;
/* loaded from: classes.dex */
public class BaseRemoteFragment extends Fragment implements View.OnClickListener, C2104d.AbstractC2106b {

    /* renamed from: a */
    protected Context f9980a;

    /* renamed from: b */
    protected C2083a f9981b;

    /* renamed from: c */
    protected FragmentManager f9982c;

    /* renamed from: d */
    protected C2523d f9983d;

    /* renamed from: e */
    protected AbstractC2834a f9984e;

    /* renamed from: com.fimi.soul.module.remote.BaseRemoteFragment$a */
    /* loaded from: classes.dex */
    protected interface AbstractC2834a {
        /* renamed from: a */
        void mo30175a();

        /* renamed from: a */
        void mo30174a(int i, int i2);

        /* renamed from: a */
        void mo30173a(int i, int i2, String str, boolean z);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public void m30181a(int i, int i2, String str, boolean z) {
        if (!this.f9982c.findFragmentById(C1704R.C1706id.errorcalifragment).isHidden() || this.f9984e == null) {
            return;
        }
        this.f9984e.mo30173a(i, i2, str, z);
    }

    @Override // android.support.p001v4.app.Fragment
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        this.f9984e = (AbstractC2834a) activity;
        this.f9980a = activity.getApplicationContext();
        this.f9981b = ((DroidPlannerApp) activity.getApplication()).f4493a;
        this.f9982c = getFragmentManager();
        this.f9983d = C2523d.m31374a(this.f9981b);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
    }

    @Override // android.support.p001v4.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return super.onCreateView(layoutInflater, viewGroup, bundle);
    }

    @Override // android.support.p001v4.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        this.f9981b.mo32903b(this);
    }

    @Override // android.support.p001v4.app.Fragment
    public void onDetach() {
        super.onDetach();
        if (this.f9984e != null) {
            this.f9984e = null;
        }
    }

    @Override // com.fimi.soul.drone.C2104d.AbstractC2106b
    public void onDroneEvent(C2104d.EnumC2105a enumC2105a, C2083a c2083a) {
    }

    @Override // android.support.p001v4.app.Fragment
    public void onStart() {
        super.onStart();
        this.f9981b.mo32908a(this);
    }

    @Override // android.support.p001v4.app.Fragment
    public void onStop() {
        super.onStop();
    }
}
