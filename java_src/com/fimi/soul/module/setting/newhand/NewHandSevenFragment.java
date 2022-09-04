package com.fimi.soul.module.setting.newhand;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import com.fimi.kernel.C1642c;
import com.fimi.kernel.utils.C1679t;
import com.fimi.overseas.soul.C1704R;
import com.fimi.soul.base.C1756a;
import com.fimi.soul.utils.C3103au;
import com.fimi.soul.utils.C3134q;
/* loaded from: classes.dex */
public class NewHandSevenFragment extends BaseNewHandFragment {

    /* renamed from: c */
    TextView f10735c;

    /* renamed from: d */
    TextView f10736d;

    /* renamed from: e */
    TextView f10737e;

    /* renamed from: f */
    TextView f10738f;

    /* renamed from: g */
    TextView f10739g;

    /* renamed from: h */
    TextView f10740h;

    /* renamed from: i */
    TextView f10741i;

    /* renamed from: j */
    TextView f10742j;

    /* renamed from: k */
    TextView f10743k;

    /* renamed from: l */
    TextView f10744l;

    /* renamed from: m */
    TextView f10745m;

    /* renamed from: n */
    Button f10746n;

    @Override // com.fimi.soul.module.setting.newhand.BaseNewHandFragment
    /* renamed from: a */
    protected View mo29834a(LayoutInflater layoutInflater) {
        return layoutInflater.inflate(C1704R.layout.fragment_newhand_seven, (ViewGroup) null);
    }

    @Override // com.fimi.soul.module.setting.newhand.BaseNewHandFragment
    /* renamed from: a */
    protected void mo29835a() {
        this.f10735c.setText(C3134q.f11824l);
        this.f10737e.setText(C1704R.C1707string.ready_flying);
        if (C1642c.m34885e().m34501p()) {
            this.f10741i.setText(getString(C1704R.C1707string.new_hand_seven_tip_one, C1679t.m34553b(5.0d) + " Ft"));
        } else {
            this.f10741i.setText(getString(C1704R.C1707string.new_hand_seven_tip_one, "5 m"));
        }
        this.f10742j.setText(C1704R.C1707string.new_hand_seven_tip_two);
        this.f10743k.setText(C1704R.C1707string.new_hand_seven_tip_three);
        this.f10745m.setText(C1704R.C1707string.new_hand_seven_tip_four);
        this.f10746n.setOnClickListener(this);
    }

    @Override // com.fimi.soul.module.setting.newhand.BaseNewHandFragment
    /* renamed from: a */
    protected void mo29833a(View view) {
        this.f10735c = (TextView) view.findViewById(C1704R.C1706id.tv_seq);
        this.f10736d = (TextView) view.findViewById(C1704R.C1706id.tv_total);
        this.f10737e = (TextView) view.findViewById(C1704R.C1706id.tv_title);
        this.f10738f = (TextView) view.findViewById(C1704R.C1706id.tv_number_one);
        this.f10741i = (TextView) view.findViewById(C1704R.C1706id.tv_tip_one);
        this.f10739g = (TextView) view.findViewById(C1704R.C1706id.tv_number_two);
        this.f10742j = (TextView) view.findViewById(C1704R.C1706id.tv_tip_two);
        this.f10740h = (TextView) view.findViewById(C1704R.C1706id.tv_number_three);
        this.f10743k = (TextView) view.findViewById(C1704R.C1706id.tv_tip_three);
        this.f10744l = (TextView) view.findViewById(C1704R.C1706id.tv_number_four);
        this.f10745m = (TextView) view.findViewById(C1704R.C1706id.tv_tip_four);
        this.f10746n = (Button) view.findViewById(C1704R.C1706id.btn_next);
        C3103au.m29218b(this.f10604a.getAssets(), this.f10735c, this.f10736d);
        C3103au.m29232a(this.f10604a.getAssets(), this.f10737e, this.f10738f, this.f10739g, this.f10740h, this.f10741i, this.f10742j, this.f10743k, this.f10746n, this.f10744l, this.f10745m);
    }

    @Override // com.fimi.soul.module.setting.newhand.BaseNewHandFragment
    /* renamed from: b */
    protected String mo29832b() {
        return NewHandSevenFragment.class.getName().toLowerCase();
    }

    @Override // com.fimi.soul.module.setting.newhand.BaseNewHandFragment, android.view.View.OnClickListener
    public void onClick(View view) {
        super.onClick(view);
        if (view == this.f10746n) {
            C1642c.m34887c().mo34876a(C1756a.f4560s, true);
            getActivity().finish();
        }
    }
}
