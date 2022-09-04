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
public class NewHandFiveFragment extends BaseNewHandFragment {

    /* renamed from: c */
    TextView f10700c;

    /* renamed from: d */
    TextView f10701d;

    /* renamed from: e */
    TextView f10702e;

    /* renamed from: f */
    TextView f10703f;

    /* renamed from: g */
    TextView f10704g;

    /* renamed from: h */
    TextView f10705h;

    /* renamed from: i */
    TextView f10706i;

    /* renamed from: j */
    TextView f10707j;

    /* renamed from: k */
    TextView f10708k;

    /* renamed from: l */
    Button f10709l;

    /* renamed from: a */
    private SpannableString m29838a(int i) {
        String string = getString(i);
        SpannableString spannableString = new SpannableString(string);
        spannableString.setSpan(new ForegroundColorSpan(getResources().getColor(C1704R.color.white)), string.length() - 2, string.length(), 33);
        return spannableString;
    }

    @Override // com.fimi.soul.module.setting.newhand.BaseNewHandFragment
    /* renamed from: a */
    protected View mo29834a(LayoutInflater layoutInflater) {
        return layoutInflater.inflate(C1704R.layout.fragment_newhand_five, (ViewGroup) null);
    }

    @Override // com.fimi.soul.module.setting.newhand.BaseNewHandFragment
    /* renamed from: a */
    protected void mo29835a() {
        this.f10700c.setText("5");
        this.f10702e.setText(C1704R.C1707string.about_right_stick);
        this.f10706i.setText(C1704R.C1707string.new_hand_five_tip_one);
        this.f10707j.setText(C1704R.C1707string.new_hand_five_tip_two);
    }

    @Override // com.fimi.soul.module.setting.newhand.BaseNewHandFragment
    /* renamed from: a */
    protected void mo29833a(View view) {
        this.f10700c = (TextView) view.findViewById(C1704R.C1706id.tv_seq);
        this.f10701d = (TextView) view.findViewById(C1704R.C1706id.tv_total);
        this.f10702e = (TextView) view.findViewById(C1704R.C1706id.tv_title);
        this.f10703f = (TextView) view.findViewById(C1704R.C1706id.tv_number_one);
        this.f10706i = (TextView) view.findViewById(C1704R.C1706id.tv_tip_one);
        this.f10704g = (TextView) view.findViewById(C1704R.C1706id.tv_number_two);
        this.f10707j = (TextView) view.findViewById(C1704R.C1706id.tv_tip_two);
        this.f10705h = (TextView) view.findViewById(C1704R.C1706id.tv_number_three);
        this.f10709l = (Button) view.findViewById(C1704R.C1706id.btn_next);
        this.f10709l.setOnClickListener(this);
        this.f10708k = (TextView) view.findViewById(C1704R.C1706id.tv_tip_four);
        C3103au.m29218b(this.f10604a.getAssets(), this.f10700c, this.f10701d);
        C3103au.m29232a(this.f10604a.getAssets(), this.f10702e, this.f10703f, this.f10704g, this.f10705h, this.f10706i, this.f10707j, this.f10708k, this.f10709l);
    }

    @Override // com.fimi.soul.module.setting.newhand.BaseNewHandFragment
    /* renamed from: b */
    protected String mo29832b() {
        return NewHandFiveFragment.class.getName().toLowerCase();
    }

    @Override // com.fimi.soul.module.setting.newhand.BaseNewHandFragment, android.view.View.OnClickListener
    public void onClick(View view) {
        super.onClick(view);
        if (view == this.f10709l) {
            Log.i("zhej", "current:" + ((NewHandActivity) getActivity()).m29839a().getCurrentItem());
            ((NewHandActivity) getActivity()).m29839a().setCurrentItem(((NewHandActivity) getActivity()).m29839a().getCurrentItem() + 1, true);
        }
    }
}
