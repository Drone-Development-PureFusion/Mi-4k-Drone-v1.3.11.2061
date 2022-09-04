package com.fimi.soul.module.calibcompass;

import android.content.Intent;
import android.location.Location;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import com.fimi.kernel.p164c.C1645c;
import com.fimi.overseas.soul.C1704R;
import com.fimi.soul.biz.manager.MyLocationManager;
import com.fimi.soul.drone.p204h.C2279c;
import com.fimi.soul.entity.CheckCampssBeann;
import com.fimi.soul.module.login.LoginActivity;
import com.fimi.soul.module.p214c.C2523d;
import com.fimi.soul.utils.C3103au;
import com.google.android.gms.maps.model.LatLng;
import com.google.firebase.p251a.C9654a;
import java.util.List;
/* loaded from: classes.dex */
public class CaliCompassFourFragment extends BaseCaliCompassFragment {

    /* renamed from: f */
    private TextView f8262f;

    /* renamed from: g */
    private TextView f8263g;

    /* renamed from: h */
    private TextView f8264h;

    /* renamed from: i */
    private Button f8265i;

    /* renamed from: j */
    private boolean f8266j;

    /* renamed from: k */
    private Handler f8267k = new Handler();

    /* renamed from: l */
    private Runnable f8268l = new Runnable() { // from class: com.fimi.soul.module.calibcompass.CaliCompassFourFragment.1
        @Override // java.lang.Runnable
        public void run() {
            if (!CaliCompassFourFragment.this.f8266j) {
                CaliCompassFourFragment.this.getActivity().setResult(0);
                CaliCompassFourFragment.this.getActivity().finish();
                return;
            }
            Intent intent = new Intent(CaliCompassFourFragment.this.getActivity(), LoginActivity.class);
            intent.putExtra(C9654a.C9655a.f30195k, false);
            CaliCompassFourFragment.this.startActivity(intent);
            CaliCompassFourFragment.this.getActivity().finish();
        }
    };

    /* renamed from: a */
    private void m31314a(View view) {
        this.f8262f = (TextView) view.findViewById(C1704R.C1706id.title);
        this.f8263g = (TextView) view.findViewById(C1704R.C1706id.descompass);
        this.f8264h = (TextView) view.findViewById(C1704R.C1706id.descompasscom);
        this.f8265i = (Button) view.findViewById(C1704R.C1706id.endcalicompass);
        this.f8265i.setOnClickListener(this);
        C3103au.m29232a(getActivity().getAssets(), this.f8262f, this.f8263g, this.f8264h, this.f8265i);
    }

    /* renamed from: a */
    public void m31315a() {
        C2523d.m31374a(this.f8198b).m31384a((byte) 1, (byte) 1, (byte) 4);
        getActivity().finish();
    }

    /* renamed from: a */
    public void m31312a(boolean z) {
        this.f8266j = z;
    }

    @Override // com.fimi.soul.module.calibcompass.BaseCaliCompassFragment, android.view.View.OnClickListener
    public void onClick(View view) {
        super.onClick(view);
        if (view.getId() == C1704R.C1706id.endcalicompass) {
            this.f8267k.postDelayed(this.f8268l, 300L);
        }
    }

    @Override // com.fimi.soul.module.calibcompass.BaseCaliCompassFragment, android.support.p001v4.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(C1704R.layout.cali_compass_four, (ViewGroup) null);
        m31314a(inflate);
        return inflate;
    }

    @Override // android.support.p001v4.app.Fragment
    public void onHiddenChanged(boolean z) {
        CheckCampssBeann checkCampssBeann;
        List<LatLng> listLatlng;
        super.onHiddenChanged(z);
        if (z || !isVisible()) {
            return;
        }
        CheckCampssBeann checkCampssBeann2 = (CheckCampssBeann) C1645c.m34884a().mo34880a(C2279c.f7170Z, CheckCampssBeann.class);
        if (checkCampssBeann2 != null) {
            checkCampssBeann = checkCampssBeann2;
            listLatlng = checkCampssBeann2.getListLatlng();
        } else {
            checkCampssBeann = new CheckCampssBeann();
            listLatlng = checkCampssBeann.getListLatlng();
        }
        Location m33438c = MyLocationManager.m33443a(getActivity()).m33438c();
        if (m33438c == null) {
            return;
        }
        listLatlng.add(new LatLng(m33438c.getLatitude(), m33438c.getLongitude()));
        checkCampssBeann.setListLatlng(listLatlng);
        C1645c.m34884a().mo34879a(C2279c.f7170Z, checkCampssBeann);
    }

    @Override // android.support.p001v4.app.Fragment
    public void onResume() {
        super.onResume();
    }
}
