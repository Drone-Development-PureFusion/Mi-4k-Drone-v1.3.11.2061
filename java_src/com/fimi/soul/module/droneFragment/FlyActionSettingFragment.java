package com.fimi.soul.module.droneFragment;

import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import android.graphics.Rect;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.p001v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import com.fimi.kernel.utils.C1681v;
import com.fimi.kernel.utils.C1688z;
import com.fimi.kernel.view.percent.PercentRelativeLayout;
import com.fimi.overseas.soul.C1704R;
import com.fimi.soul.base.DroidPlannerApp;
import com.fimi.soul.biz.p182j.C1877d;
import com.fimi.soul.biz.p182j.C1882h;
import com.fimi.soul.drone.C2083a;
import com.fimi.soul.drone.C2104d;
import com.fimi.soul.drone.p204h.C2279c;
import com.fimi.soul.entity.FlyActionBean;
import com.fimi.soul.module.droneui.FlightActivity;
import com.fimi.soul.utils.C3103au;
import com.fimi.soul.view.DialogC3241e;
/* loaded from: classes.dex */
public class FlyActionSettingFragment extends Fragment implements View.OnClickListener, C2104d.AbstractC2106b {

    /* renamed from: a */
    private Button f8380a;

    /* renamed from: b */
    private Button f8381b;

    /* renamed from: c */
    private TextView f8382c;

    /* renamed from: d */
    private C2083a f8383d;

    /* renamed from: e */
    private PercentRelativeLayout f8384e;

    /* renamed from: f */
    private C1882h f8385f;

    /* renamed from: g */
    private C1681v f8386g;

    /* renamed from: h */
    private View$OnClickListenerC2634f f8387h;

    /* renamed from: i */
    private C2653h f8388i;

    /* renamed from: j */
    private ImageButton f8389j;

    /* renamed from: k */
    private boolean f8390k;

    /* renamed from: l */
    private View$OnClickListenerC2614a f8391l;

    /* renamed from: m */
    private View f8392m;

    /* renamed from: n */
    private Dialog f8393n;

    /* renamed from: o */
    private FlightActivity.AbstractC2736a f8394o;

    /* renamed from: a */
    private void m31227a(View view) {
        this.f8389j = (ImageButton) view.findViewById(C1704R.C1706id.toggleaction);
        this.f8389j.setOnClickListener(this);
        this.f8384e = (PercentRelativeLayout) view.findViewById(C1704R.C1706id.changgeHeight_view);
        this.f8380a = (Button) view.findViewById(C1704R.C1706id.fly_action_cancal_btn);
        this.f8380a.setOnClickListener(this);
        this.f8381b = (Button) view.findViewById(C1704R.C1706id.fly_action_execute_btn);
        this.f8381b.setOnClickListener(this);
        this.f8382c = (TextView) view.findViewById(C1704R.C1706id.title);
        C3103au.m29232a(getActivity().getAssets(), this.f8380a, this.f8381b, this.f8382c);
        C3103au.m29218b(getActivity().getAssets(), new View[0]);
    }

    /* renamed from: a */
    private void m31224a(String str) {
        if (this.f8393n != null && this.f8393n.isShowing()) {
            this.f8393n.dismiss();
            this.f8393n = null;
        }
        DialogC3241e.C3242a c3242a = new DialogC3241e.C3242a(getActivity());
        c3242a.m28655a(str);
        c3242a.m28653a(true);
        c3242a.m28654a(getString(C1704R.C1707string.finish), new DialogInterface.OnClickListener() { // from class: com.fimi.soul.module.droneFragment.FlyActionSettingFragment.1
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i) {
                if (FlyActionSettingFragment.this.f8385f.m33765a().get() == 2) {
                    C1688z.m34449a(FlyActionSettingFragment.this.getActivity(), (int) C1704R.C1707string.promtt_fly_to, 2000);
                } else if (FlyActionSettingFragment.this.f8385f.m33765a().get() == 1) {
                    C1688z.m34449a(FlyActionSettingFragment.this.getActivity(), (int) C1704R.C1707string.promtt_waypoint, 2000);
                } else if (FlyActionSettingFragment.this.f8385f.m33765a().get() != 3) {
                } else {
                    FlyActionSettingFragment.this.f8387h.m30931a();
                }
            }
        });
        this.f8393n = c3242a.m28659a();
        this.f8393n.setCanceledOnTouchOutside(false);
        this.f8393n.show();
    }

    /* renamed from: b */
    private boolean m31222b(View view) {
        Rect rect = new Rect();
        view.getWindowVisibleDisplayFrame(rect);
        return ((float) (view.getBottom() - rect.bottom)) > view.getResources().getDisplayMetrics().density * 100.0f;
    }

    /* renamed from: c */
    private void m31220c() {
        this.f8383d.mo32909a(C2104d.EnumC2105a.DISPLAYLIMITCIRCLE);
        this.f8383d.mo32909a(C2104d.EnumC2105a.CLEARTAKEPHOTO);
    }

    /* renamed from: d */
    private void m31219d() {
        if (this.f8385f.m33765a().get() == 1) {
            this.f8382c.setText(C1704R.C1707string.settingwaypoint);
            this.f8391l.m31013b(C1704R.C1707string.delete_wraypoint);
            this.f8387h.m30906e();
            this.f8389j.setVisibility(8);
            if (!this.f8386g.m34546a().getBoolean(C2279c.f7227bC, false)) {
                m31224a(getString(C1704R.C1707string.fly_action_tip));
            } else if (isVisible()) {
                C1688z.m34449a(getActivity(), (int) C1704R.C1707string.promtt_waypoint, 2000);
            }
        } else if (this.f8385f.m33765a().get() == 2) {
            this.f8382c.setText(C1704R.C1707string.settingtargetplace);
            this.f8391l.m31013b(C1704R.C1707string.delete_flytopoint);
            this.f8387h.m30906e();
            this.f8389j.setVisibility(8);
            if (!this.f8386g.m34546a().getBoolean(C2279c.f7228bD, false)) {
                m31224a(getString(C1704R.C1707string.fly_action_flyto_tip));
            } else {
                C1688z.m34449a(getActivity(), (int) C1704R.C1707string.promtt_fly_to, 2000);
            }
        } else if (this.f8385f.m33765a().get() == 3) {
            this.f8387h.m30909d();
            this.f8382c.setText(C1704R.C1707string.set_interest_point);
            this.f8389j.setVisibility(0);
            if (!this.f8386g.m34546a().getBoolean(C2279c.f7229bE, false)) {
                m31224a(getString(C1704R.C1707string.fly_action_poi_tip));
            } else {
                this.f8387h.m30931a();
            }
        }
        int m32188g = (int) ((this.f8383d.mo32891w().m32188g() - 677216.0d) / 10.0d);
        this.f8391l.m31025a(m32188g);
        C1877d.m33782p().m33801b(m32188g);
        C1877d.m33782p().m33779s();
        this.f8383d.mo32909a(C2104d.EnumC2105a.CLEARDATA);
        this.f8391l.m31015b();
    }

    /* renamed from: e */
    private void m31218e() {
        if (C1877d.m33782p().m33788j().size() > 0) {
            this.f8381b.setBackgroundResource(C1704R.C1705drawable.flyaction_bg);
        } else {
            this.f8381b.setBackgroundResource(C1704R.C1705drawable.fly_action_cancal_bg);
        }
    }

    /* renamed from: f */
    private void m31217f() {
        this.f8381b.setBackgroundResource(C1704R.C1705drawable.fly_action_cancal_bg);
    }

    /* renamed from: a */
    public void m31228a() {
        this.f8387h.m30909d();
        this.f8387h.m30906e();
        this.f8388i.m30863b();
        this.f8389j.setImageResource(C1704R.C1705drawable.switch_action_poi);
        this.f8390k = false;
        C1877d.m33782p().m33779s();
        C1882h.m33763a(getActivity().getApplicationContext()).m33764a(0);
        this.f8383d.mo32909a(C2104d.EnumC2105a.CANCALFLYACTION);
        this.f8394o.mo30462g();
    }

    /* renamed from: a */
    public void m31225a(FlightActivity.AbstractC2736a abstractC2736a) {
        this.f8394o = abstractC2736a;
    }

    /* renamed from: b */
    public boolean m31223b() {
        if (this.f8393n == null || !this.f8393n.isShowing()) {
            return m31222b(this.f8392m);
        }
        return false;
    }

    @Override // android.support.p001v4.app.Fragment
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        this.f8383d = ((DroidPlannerApp) activity.getApplication()).f4493a;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        switch (view.getId()) {
            case C1704R.C1706id.fly_action_cancal_btn /* 2131755705 */:
                m31228a();
                return;
            case C1704R.C1706id.fly_action_execute_btn /* 2131755706 */:
                if (this.f8383d.m33001au().m32390g().isLightStream()) {
                    C1688z.m34449a(getActivity(), (int) C1704R.C1707string.in_light_stream, 3000);
                    return;
                } else if (this.f8383d.m33001au().m32390g().isEnforcementAtti()) {
                    C1688z.m34449a(getActivity(), (int) C1704R.C1707string.in_Atti, 3000);
                    return;
                } else if (this.f8385f.m33765a().get() == 1) {
                    this.f8383d.mo32909a(C2104d.EnumC2105a.UPWAYPOINT);
                    return;
                } else if (this.f8385f.m33765a().get() == 2) {
                    this.f8383d.mo32909a(C2104d.EnumC2105a.ASSIGNWAYPOINT);
                    return;
                } else if (this.f8385f.m33765a().get() != 3) {
                    return;
                } else {
                    this.f8383d.mo32909a(C2104d.EnumC2105a.INTERESTWAYPOINT);
                    return;
                }
            case C1704R.C1706id.toggleaction /* 2131755792 */:
                if (!this.f8390k) {
                    this.f8390k = true;
                    this.f8389j.setImageResource(C1704R.C1705drawable.switch_poi_map);
                } else {
                    this.f8390k = false;
                    this.f8388i.m30863b();
                    this.f8389j.setImageResource(C1704R.C1705drawable.switch_action_poi);
                }
                this.f8394o.mo30464e();
                return;
            default:
                return;
        }
    }

    @Override // android.support.p001v4.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f8385f = C1882h.m33763a(this.f8383d.f5919d);
        this.f8386g = C1681v.m34543a(getActivity());
    }

    @Override // android.support.p001v4.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        View inflate = layoutInflater.inflate(C1704R.layout.fly_drone_action, (ViewGroup) null);
        this.f8392m = inflate.getRootView();
        this.f8387h = new View$OnClickListenerC2634f(inflate, this.f8383d);
        this.f8388i = new C2653h(inflate, this.f8383d.f5919d);
        this.f8391l = new View$OnClickListenerC2614a(this.f8383d, inflate);
        m31227a(inflate);
        return inflate;
    }

    @Override // android.support.p001v4.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        this.f8383d.mo32903b(this);
    }

    @Override // android.support.p001v4.app.Fragment
    public void onDetach() {
        super.onDetach();
        if (this.f8387h != null) {
            this.f8387h = null;
        }
        if (this.f8388i != null) {
            this.f8388i = null;
        }
    }

    @Override // com.fimi.soul.drone.C2104d.AbstractC2106b
    public void onDroneEvent(C2104d.EnumC2105a enumC2105a, C2083a c2083a) {
        switch (enumC2105a) {
            case UPDATE_FLYZONE:
                if (this.f8387h == null) {
                    return;
                }
                this.f8387h.m30894k();
                return;
            case CLEARDATATAKEPHOTO:
                m31228a();
                return;
            case CREATEPOI:
                this.f8390k = false;
                this.f8388i.m30863b();
                this.f8394o.mo30463f();
                this.f8389j.setImageResource(C1704R.C1705drawable.switch_action_poi);
                return;
            case NOTIFICHANGECIECLERIDUS:
            default:
                return;
            case CHANGESTARTMARKER:
                if (this.f8387h == null) {
                    return;
                }
                this.f8387h.m30919a(false);
                return;
            case SHOWHEIGHTVIEW:
                this.f8391l.m31026a();
                FlyActionBean flyActionBean = null;
                if (C1877d.m33782p().m33811a() == 2) {
                    flyActionBean = C1877d.m33782p().m33783o();
                } else if (C1877d.m33782p().m33811a() == 1) {
                    flyActionBean = C1877d.m33782p().m33784n();
                } else if (C1877d.m33782p().m33811a() == 3) {
                    flyActionBean = C1877d.m33782p().m33792f();
                }
                if (flyActionBean != null) {
                    this.f8391l.m31025a(flyActionBean.getHeight());
                    this.f8391l.m31014b(flyActionBean.getSpeek());
                }
                m31218e();
                return;
            case HIDEHEIGHTVALUE:
                m31218e();
                this.f8391l.m31015b();
                return;
            case CLOSEFLYACTIONFRAGMENT:
                if (!isVisible() || !c2083a.m33001au().m32390g().judgeNoAction()) {
                    return;
                }
                m31219d();
                m31220c();
                return;
            case SHOWPOIOPERA:
                m31218e();
                this.f8387h.m30902g();
                return;
            case CLEANALLOBJ:
                if (this.f8387h == null) {
                    return;
                }
                this.f8387h.m30909d();
                return;
            case CLEARPOIDATA:
                if (this.f8387h == null) {
                    return;
                }
                this.f8387h.m30909d();
                return;
            case CLOSECARMERPOI:
                this.f8388i.m30863b();
                this.f8387h.m30896j();
                this.f8389j.setImageResource(C1704R.C1705drawable.switch_action_poi);
                this.f8390k = false;
                return;
            case CLEARDATA:
                m31218e();
                return;
        }
    }

    @Override // android.support.p001v4.app.Fragment
    public void onHiddenChanged(boolean z) {
        super.onHiddenChanged(z);
        if (isAdded()) {
            if (!z) {
                m31217f();
                m31219d();
                m31220c();
                return;
            }
            if (this.f8393n != null) {
                this.f8393n.dismiss();
            }
            this.f8390k = false;
            if (this.f8388i != null) {
                this.f8388i.m30863b();
            }
            if (this.f8389j == null) {
                return;
            }
            this.f8389j.setImageResource(C1704R.C1705drawable.switch_action_poi);
        }
    }

    @Override // android.support.p001v4.app.Fragment
    public void onResume() {
        super.onResume();
    }

    @Override // android.support.p001v4.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
    }

    @Override // android.support.p001v4.app.Fragment
    public void onStart() {
        super.onStart();
        this.f8383d.mo32908a(this);
    }

    @Override // android.support.p001v4.app.Fragment
    public void onStop() {
        super.onStop();
    }
}
