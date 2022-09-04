package com.fimi.soul.module.setting.newhand;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import com.fimi.overseas.soul.C1704R;
import com.fimi.soul.utils.C3103au;
/* loaded from: classes.dex */
public class NewHandSixFragment extends BaseNewHandFragment {

    /* renamed from: c */
    TextView f10747c;

    /* renamed from: d */
    TextView f10748d;

    /* renamed from: e */
    TextView f10749e;

    /* renamed from: f */
    TextView f10750f;

    /* renamed from: g */
    TextView f10751g;

    /* renamed from: h */
    TextView f10752h;

    /* renamed from: i */
    TextView f10753i;

    /* renamed from: j */
    TextView f10754j;

    /* renamed from: k */
    Button f10755k;

    @Override // com.fimi.soul.module.setting.newhand.BaseNewHandFragment
    /* renamed from: a */
    protected View mo29834a(LayoutInflater layoutInflater) {
        return layoutInflater.inflate(C1704R.layout.fragment_newhand_six, (ViewGroup) null);
    }

    @Override // com.fimi.soul.module.setting.newhand.BaseNewHandFragment
    /* renamed from: a */
    protected void mo29835a() {
        this.f10747c.setText("6");
        this.f10749e.setText(C1704R.C1707string.about_motor);
        this.f10753i.setText(C1704R.C1707string.new_hand_six_tip_one);
        this.f10754j.setText(C1704R.C1707string.new_hand_six_tip_two);
        this.f10755k.setOnClickListener(this);
    }

    @Override // com.fimi.soul.module.setting.newhand.BaseNewHandFragment
    /* renamed from: a */
    protected void mo29833a(View view) {
        this.f10747c = (TextView) view.findViewById(C1704R.C1706id.tv_seq);
        this.f10748d = (TextView) view.findViewById(C1704R.C1706id.tv_total);
        this.f10749e = (TextView) view.findViewById(C1704R.C1706id.tv_title);
        this.f10750f = (TextView) view.findViewById(C1704R.C1706id.tv_number_one);
        this.f10753i = (TextView) view.findViewById(C1704R.C1706id.tv_tip_one);
        this.f10751g = (TextView) view.findViewById(C1704R.C1706id.tv_number_two);
        this.f10754j = (TextView) view.findViewById(C1704R.C1706id.tv_tip_two);
        this.f10752h = (TextView) view.findViewById(C1704R.C1706id.tv_number_three);
        this.f10755k = (Button) view.findViewById(C1704R.C1706id.btn_next);
        C3103au.m29218b(this.f10604a.getAssets(), this.f10747c, this.f10748d);
        C3103au.m29232a(this.f10604a.getAssets(), this.f10749e, this.f10750f, this.f10751g, this.f10752h, this.f10753i, this.f10754j, this.f10755k);
    }

    @Override // com.fimi.soul.module.setting.newhand.BaseNewHandFragment
    /* renamed from: b */
    protected String mo29832b() {
        return NewHandSixFragment.class.getName().toLowerCase();
    }

    @Override // com.fimi.soul.module.setting.newhand.BaseNewHandFragment, android.view.View.OnClickListener
    public void onClick(View view) {
        super.onClick(view);
        if (view == this.f10755k) {
            Log.i("zhej", "current:" + ((NewHandActivity) getActivity()).m29839a().getCurrentItem());
            ((NewHandActivity) getActivity()).m29839a().setCurrentItem(((NewHandActivity) getActivity()).m29839a().getCurrentItem() + 1, true);
        }
    }
}
