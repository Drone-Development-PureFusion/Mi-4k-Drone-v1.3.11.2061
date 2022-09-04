package com.fimi.soul.module.setting.newhand;

import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import com.fimi.overseas.soul.C1704R;
import com.fimi.soul.utils.C3103au;
/* loaded from: classes.dex */
public class NewHandFourFragment extends BaseNewHandFragment {

    /* renamed from: c */
    TextView f10710c;

    /* renamed from: d */
    TextView f10711d;

    /* renamed from: e */
    TextView f10712e;

    /* renamed from: f */
    TextView f10713f;

    /* renamed from: g */
    TextView f10714g;

    /* renamed from: h */
    TextView f10715h;

    /* renamed from: i */
    TextView f10716i;

    /* renamed from: j */
    TextView f10717j;

    /* renamed from: k */
    TextView f10718k;

    /* renamed from: l */
    Button f10719l;

    /* renamed from: a */
    private SpannableString m29837a(int i) {
        String string = getString(i);
        SpannableString spannableString = new SpannableString(string);
        spannableString.setSpan(new ForegroundColorSpan(getResources().getColor(C1704R.color.white)), string.length() - 2, string.length(), 33);
        return spannableString;
    }

    @Override // com.fimi.soul.module.setting.newhand.BaseNewHandFragment
    /* renamed from: a */
    protected View mo29834a(LayoutInflater layoutInflater) {
        return layoutInflater.inflate(C1704R.layout.fragment_newhand_four, (ViewGroup) null);
    }

    @Override // com.fimi.soul.module.setting.newhand.BaseNewHandFragment
    /* renamed from: a */
    protected void mo29835a() {
        this.f10710c.setText("4");
        this.f10712e.setText(C1704R.C1707string.about_left_stick);
        this.f10716i.setText(C1704R.C1707string.new_hand_four_tip_one);
        this.f10717j.setText(C1704R.C1707string.new_hand_four_tip_two);
    }

    @Override // com.fimi.soul.module.setting.newhand.BaseNewHandFragment
    /* renamed from: a */
    protected void mo29833a(View view) {
        this.f10710c = (TextView) view.findViewById(C1704R.C1706id.tv_seq);
        this.f10711d = (TextView) view.findViewById(C1704R.C1706id.tv_total);
        this.f10712e = (TextView) view.findViewById(C1704R.C1706id.tv_title);
        this.f10713f = (TextView) view.findViewById(C1704R.C1706id.tv_number_one);
        this.f10716i = (TextView) view.findViewById(C1704R.C1706id.tv_tip_one);
        this.f10714g = (TextView) view.findViewById(C1704R.C1706id.tv_number_two);
        this.f10717j = (TextView) view.findViewById(C1704R.C1706id.tv_tip_two);
        this.f10715h = (TextView) view.findViewById(C1704R.C1706id.tv_number_three);
        this.f10719l = (Button) view.findViewById(C1704R.C1706id.btn_next);
        this.f10719l.setOnClickListener(this);
        this.f10718k = (TextView) view.findViewById(C1704R.C1706id.tv_tip_four);
        C3103au.m29218b(this.f10604a.getAssets(), this.f10710c, this.f10711d);
        C3103au.m29232a(this.f10604a.getAssets(), this.f10712e, this.f10713f, this.f10714g, this.f10715h, this.f10716i, this.f10717j, this.f10718k, this.f10719l);
    }

    @Override // com.fimi.soul.module.setting.newhand.BaseNewHandFragment
    /* renamed from: b */
    protected String mo29832b() {
        return NewHandFourFragment.class.getName().toLowerCase();
    }

    @Override // com.fimi.soul.module.setting.newhand.BaseNewHandFragment, android.view.View.OnClickListener
    public void onClick(View view) {
        super.onClick(view);
        if (view == this.f10719l) {
            Log.i("zhej", "current:" + ((NewHandActivity) getActivity()).m29839a().getCurrentItem());
            ((NewHandActivity) getActivity()).m29839a().setCurrentItem(((NewHandActivity) getActivity()).m29839a().getCurrentItem() + 1, true);
        }
    }
}
