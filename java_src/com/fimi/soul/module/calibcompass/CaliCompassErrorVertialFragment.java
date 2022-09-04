package com.fimi.soul.module.calibcompass;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import com.fimi.overseas.soul.C1704R;
import com.fimi.soul.utils.C3103au;
/* loaded from: classes.dex */
public class CaliCompassErrorVertialFragment extends BaseCaliCompassFragment {

    /* renamed from: f */
    private TextView f8259f;

    /* renamed from: g */
    private TextView f8260g;

    /* renamed from: h */
    private Button f8261h;

    /* renamed from: a */
    private void m31316a(View view) {
        this.f8259f = (TextView) view.findViewById(C1704R.C1706id.title);
        this.f8260g = (TextView) view.findViewById(C1704R.C1706id.descompass);
        this.f8261h = (Button) view.findViewById(C1704R.C1706id.againcali);
        this.f8261h.setOnClickListener(this);
        C3103au.m29232a(getActivity().getAssets(), this.f8259f, this.f8260g, this.f8261h);
    }

    @Override // com.fimi.soul.module.calibcompass.BaseCaliCompassFragment, android.view.View.OnClickListener
    public void onClick(View view) {
        super.onClick(view);
        switch (view.getId()) {
            case C1704R.C1706id.againcali /* 2131755515 */:
                getActivity().finish();
                return;
            default:
                return;
        }
    }

    @Override // com.fimi.soul.module.calibcompass.BaseCaliCompassFragment, android.support.p001v4.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(C1704R.layout.cali_compass_error_vertical, (ViewGroup) null);
        m31316a(inflate);
        return inflate;
    }
}
