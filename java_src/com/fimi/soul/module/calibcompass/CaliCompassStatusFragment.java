package com.fimi.soul.module.calibcompass;

import android.os.Bundle;
import android.support.p001v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import com.fimi.kernel.p165d.C1648b;
import com.fimi.overseas.soul.C1704R;
import com.fimi.soul.drone.C2083a;
import com.fimi.soul.drone.C2104d;
import com.fimi.soul.drone.p205i.C2352k;
import com.fimi.soul.module.p214c.C2523d;
import com.fimi.soul.utils.C3103au;
import it.p273a.p274a.AbstractC10866e;
/* loaded from: classes.dex */
public class CaliCompassStatusFragment extends BaseCaliCompassFragment {

    /* renamed from: f */
    private TextView f8276f;

    /* renamed from: g */
    private TextView f8277g;

    /* renamed from: h */
    private Button f8278h;

    /* renamed from: i */
    private Button f8279i;

    /* renamed from: j */
    private boolean f8280j;

    /* renamed from: a */
    public void m31310a(int i, boolean z) {
        if (!getString(i).toString().equals(this.f8277g.getText().toString())) {
            this.f8277g.setText(i);
        }
        if (this.f8279i.isEnabled() != z && z) {
            C1648b.m34863b(getActivity()).m34867a(getString(C1704R.C1707string.reminder_calibration_canStart));
        }
        this.f8279i.setEnabled(z);
        if (z) {
            m31309a(this.f8279i, AbstractC10866e.f34827F);
        } else {
            m31309a(this.f8279i, 77);
        }
    }

    /* renamed from: a */
    public void m31309a(Button button, int i) {
        button.setTextColor(button.getTextColors().withAlpha(i));
    }

    /* renamed from: a */
    public void m31308a(boolean z) {
        this.f8279i.setEnabled(z);
    }

    @Override // com.fimi.soul.module.calibcompass.BaseCaliCompassFragment, android.view.View.OnClickListener
    public void onClick(View view) {
        super.onClick(view);
        switch (view.getId()) {
            case C1704R.C1706id.begincalicompss /* 2131755503 */:
                C2523d.m31374a(this.f8198b).m31384a((byte) 1, (byte) 1, (byte) 1);
                ((CaliCompassActivity) getActivity()).m31334a(getString(C1704R.C1707string.compass_hor_calibration));
                this.f8199c.beginTransaction().hide(this).show(this.f8199c.findFragmentByTag("first")).commitAllowingStateLoss();
                return;
            case C1704R.C1706id.black_btn /* 2131756179 */:
                getActivity().finish();
                return;
            default:
                return;
        }
    }

    @Override // com.fimi.soul.module.calibcompass.BaseCaliCompassFragment, android.support.p001v4.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(C1704R.layout.begin_calicaompass, (ViewGroup) null);
        this.f8277g = (TextView) inflate.findViewById(C1704R.C1706id.showtitleone);
        this.f8279i = (Button) inflate.findViewById(C1704R.C1706id.begincalicompss);
        this.f8279i.setOnClickListener(this);
        this.f8279i.setEnabled(false);
        C3103au.m29232a(getActivity().getAssets(), this.f8277g);
        if (!this.f8198b.mo32906ab().mo32588a() || this.f8198b.m33009am()) {
            if (this.f8198b.m33009am()) {
                m31310a(C1704R.C1707string.plane_start_can_not_calration_compass, false);
            } else {
                m31310a(C1704R.C1707string.calidisconremote, false);
            }
        } else if (this.f8198b.m33007ao().m31787am()) {
            m31310a(C1704R.C1707string.calicpmssing, false);
            C1648b.m34863b(getActivity()).m34867a(getString(C1704R.C1707string.calicpmssing));
        } else {
            m31310a(C1704R.C1707string.begincalocomremider, true);
        }
        return inflate;
    }

    @Override // com.fimi.soul.module.calibcompass.BaseCaliCompassFragment, com.fimi.soul.drone.C2104d.AbstractC2106b
    public void onDroneEvent(C2104d.EnumC2105a enumC2105a, C2083a c2083a) {
        super.onDroneEvent(enumC2105a, c2083a);
        if (isVisible()) {
            switch (enumC2105a) {
                case CaliCompass:
                    C2352k m32978k = c2083a.m32978k();
                    if (m32978k.m31916d() != 2 || m32978k.m31914e() != 1 || m32978k.m31920b() != 1) {
                        return;
                    }
                    if (m32978k.m31918c() != 2 && m32978k.m31918c() != 3) {
                        return;
                    }
                    if (m32978k.m31918c() != 2) {
                        this.f8280j = true;
                        m31310a(C1704R.C1707string.calicompasscoming, false);
                        return;
                    }
                    Fragment findFragmentByTag = this.f8199c.findFragmentByTag("error");
                    if (findFragmentByTag == null || !(findFragmentByTag instanceof CaliCompassErrorFragment) || findFragmentByTag.isHidden()) {
                        return;
                    }
                    ((CaliCompassErrorFragment) findFragmentByTag).m31324a(getString(C1704R.C1707string.calicomsucess), true, false);
                    this.f8199c.beginTransaction().hide(this).show(findFragmentByTag).commitAllowingStateLoss();
                    return;
                case SIMULATORINFO:
                default:
                    return;
                case Remotecontrol:
                    if (!c2083a.mo32905ac() && this.f8280j) {
                        this.f8280j = false;
                    }
                    if (this.f8280j) {
                        return;
                    }
                    if (!c2083a.mo32905ac()) {
                        m31310a(C1704R.C1707string.calisiacondrone, false);
                        return;
                    } else if (c2083a.mo32905ac() && c2083a.m33009am()) {
                        m31310a(C1704R.C1707string.plane_start_can_not_calration_compass, false);
                        return;
                    } else if (!c2083a.mo32905ac()) {
                        return;
                    } else {
                        if (c2083a.m33007ao().m31787am()) {
                            m31310a(C1704R.C1707string.calicpmssing, false);
                            return;
                        } else {
                            m31310a(C1704R.C1707string.begincalocomremider, true);
                            return;
                        }
                    }
                case CLEANALLOBJ:
                    m31310a(C1704R.C1707string.GC_caliFail_discon, false);
                    return;
            }
        }
    }

    @Override // android.support.p001v4.app.Fragment
    public void onHiddenChanged(boolean z) {
        super.onHiddenChanged(z);
        if (!z) {
            if (this.f8198b.mo32906ab().mo32588a() && !this.f8198b.m33009am()) {
                return;
            }
            if (this.f8198b.m33009am()) {
                m31310a(C1704R.C1707string.plane_start_can_not_calration_compass, false);
            } else {
                m31310a(C1704R.C1707string.calidisconremote, false);
            }
        }
    }
}
