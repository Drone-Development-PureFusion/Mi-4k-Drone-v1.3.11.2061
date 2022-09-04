package com.fimi.soul.module.setting.newhand;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import com.fimi.kernel.C1642c;
import com.fimi.kernel.utils.C1679t;
import com.fimi.overseas.soul.C1704R;
import com.fimi.soul.utils.C3103au;
/* loaded from: classes.dex */
public class NewHandTwoFragment extends BaseNewHandFragment {

    /* renamed from: c */
    TextView f10772c;

    /* renamed from: d */
    TextView f10773d;

    /* renamed from: e */
    TextView f10774e;

    /* renamed from: f */
    TextView f10775f;

    /* renamed from: g */
    TextView f10776g;

    /* renamed from: h */
    TextView f10777h;

    /* renamed from: i */
    TextView f10778i;

    /* renamed from: j */
    TextView f10779j;

    /* renamed from: k */
    TextView f10780k;

    /* renamed from: l */
    TextView f10781l;

    /* renamed from: m */
    TextView f10782m;

    /* renamed from: n */
    Button f10783n;

    /* renamed from: o */
    LoopWidget f10784o;

    @Override // com.fimi.soul.module.setting.newhand.BaseNewHandFragment
    /* renamed from: a */
    protected View mo29834a(LayoutInflater layoutInflater) {
        return layoutInflater.inflate(C1704R.layout.fragment_newhand_two, (ViewGroup) null);
    }

    @Override // com.fimi.soul.module.setting.newhand.BaseNewHandFragment
    /* renamed from: a */
    protected void mo29835a() {
        this.f10772c.setText("2");
        this.f10774e.setText(C1704R.C1707string.new_hand_take_care);
        this.f10778i.setText(C1704R.C1707string.new_hand_two_tip_one);
        this.f10779j.setText(C1704R.C1707string.new_hand_two_tip_two);
        this.f10780k.setText(C1704R.C1707string.new_hand_two_tip_three);
        if (C1642c.m34885e().m34501p()) {
            this.f10782m.setText(getString(C1704R.C1707string.new_hand_two_tip_four, C1679t.m34553b(5.0d) + " Ft"));
        } else {
            this.f10782m.setText(getString(C1704R.C1707string.new_hand_two_tip_four, "5 m"));
        }
        this.f10783n.setOnClickListener(this);
        int[] iArr = new int[4];
        iArr[0] = C1704R.C1705drawable.newhand_pic_one;
        iArr[1] = C1704R.C1705drawable.newhand_pic_two;
        iArr[2] = C1704R.C1705drawable.newhand_pic_three;
        if (C1642c.m34885e().m34501p()) {
            iArr[3] = C1704R.C1705drawable.newhand_pic_four_en_ft;
        } else {
            iArr[3] = C1704R.C1705drawable.newhand_pic_four_en;
        }
        this.f10784o.setVisibility(0);
        this.f10784o.setImagesRes(iArr);
    }

    @Override // com.fimi.soul.module.setting.newhand.BaseNewHandFragment
    /* renamed from: a */
    protected void mo29833a(View view) {
        this.f10772c = (TextView) view.findViewById(C1704R.C1706id.tv_seq);
        this.f10773d = (TextView) view.findViewById(C1704R.C1706id.tv_total);
        this.f10774e = (TextView) view.findViewById(C1704R.C1706id.tv_title);
        this.f10775f = (TextView) view.findViewById(C1704R.C1706id.tv_number_one);
        this.f10778i = (TextView) view.findViewById(C1704R.C1706id.tv_tip_one);
        this.f10776g = (TextView) view.findViewById(C1704R.C1706id.tv_number_two);
        this.f10779j = (TextView) view.findViewById(C1704R.C1706id.tv_tip_two);
        this.f10777h = (TextView) view.findViewById(C1704R.C1706id.tv_number_three);
        this.f10780k = (TextView) view.findViewById(C1704R.C1706id.tv_tip_three);
        this.f10783n = (Button) view.findViewById(C1704R.C1706id.btn_next);
        this.f10781l = (TextView) view.findViewById(C1704R.C1706id.tv_number_four);
        this.f10782m = (TextView) view.findViewById(C1704R.C1706id.tv_tip_four);
        this.f10784o = (LoopWidget) view.findViewById(C1704R.C1706id.kanner);
        C3103au.m29218b(this.f10604a.getAssets(), this.f10772c, this.f10773d);
        C3103au.m29232a(this.f10604a.getAssets(), this.f10774e, this.f10775f, this.f10776g, this.f10777h, this.f10778i, this.f10779j, this.f10780k, this.f10781l, this.f10782m, this.f10783n);
    }

    @Override // com.fimi.soul.module.setting.newhand.BaseNewHandFragment
    /* renamed from: b */
    protected String mo29832b() {
        return NewHandTwoFragment.class.getName().toLowerCase();
    }

    @Override // com.fimi.soul.module.setting.newhand.BaseNewHandFragment, android.view.View.OnClickListener
    public void onClick(View view) {
        super.onClick(view);
        if (view == this.f10783n) {
            ((NewHandActivity) getActivity()).m29839a().setCurrentItem(((NewHandActivity) getActivity()).m29839a().getCurrentItem() + 1, true);
        }
    }
}
