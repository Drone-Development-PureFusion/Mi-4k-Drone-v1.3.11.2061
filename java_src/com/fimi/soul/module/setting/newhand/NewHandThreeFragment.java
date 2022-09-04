package com.fimi.soul.module.setting.newhand;

import android.graphics.drawable.AnimationDrawable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.fimi.overseas.soul.C1704R;
import com.fimi.soul.utils.C3103au;
/* loaded from: classes.dex */
public class NewHandThreeFragment extends BaseNewHandFragment {

    /* renamed from: c */
    TextView f10759c;

    /* renamed from: d */
    TextView f10760d;

    /* renamed from: e */
    TextView f10761e;

    /* renamed from: f */
    TextView f10762f;

    /* renamed from: g */
    TextView f10763g;

    /* renamed from: h */
    TextView f10764h;

    /* renamed from: i */
    TextView f10765i;

    /* renamed from: j */
    TextView f10766j;

    /* renamed from: k */
    TextView f10767k;

    /* renamed from: l */
    TextView f10768l;

    /* renamed from: m */
    TextView f10769m;

    /* renamed from: n */
    Button f10770n;

    /* renamed from: o */
    private ImageView f10771o;

    @Override // com.fimi.soul.module.setting.newhand.BaseNewHandFragment
    /* renamed from: a */
    protected View mo29834a(LayoutInflater layoutInflater) {
        return layoutInflater.inflate(C1704R.layout.fragment_newhand_three, (ViewGroup) null);
    }

    @Override // com.fimi.soul.module.setting.newhand.BaseNewHandFragment
    /* renamed from: a */
    protected void mo29835a() {
        this.f10759c.setText("3");
        this.f10761e.setText(C1704R.C1707string.new_hand_about_drone);
        this.f10765i.setText(C1704R.C1707string.new_hand_three_tip_one);
        this.f10766j.setText(C1704R.C1707string.new_hand_three_tip_two);
        this.f10767k.setText(C1704R.C1707string.new_hand_three_tip_three);
        this.f10770n.setOnClickListener(this);
    }

    @Override // com.fimi.soul.module.setting.newhand.BaseNewHandFragment
    /* renamed from: a */
    protected void mo29833a(View view) {
        this.f10771o = (ImageView) view.findViewById(C1704R.C1706id.left_iv);
        this.f10771o.setBackgroundResource(C1704R.C1705drawable.newhand_three_anim);
        ((AnimationDrawable) this.f10771o.getBackground()).start();
        this.f10759c = (TextView) view.findViewById(C1704R.C1706id.tv_seq);
        this.f10760d = (TextView) view.findViewById(C1704R.C1706id.tv_total);
        this.f10761e = (TextView) view.findViewById(C1704R.C1706id.tv_title);
        this.f10762f = (TextView) view.findViewById(C1704R.C1706id.tv_number_one);
        this.f10765i = (TextView) view.findViewById(C1704R.C1706id.tv_tip_one);
        this.f10763g = (TextView) view.findViewById(C1704R.C1706id.tv_number_two);
        this.f10766j = (TextView) view.findViewById(C1704R.C1706id.tv_tip_two);
        this.f10764h = (TextView) view.findViewById(C1704R.C1706id.tv_number_three);
        this.f10767k = (TextView) view.findViewById(C1704R.C1706id.tv_tip_three);
        this.f10770n = (Button) view.findViewById(C1704R.C1706id.btn_next);
        this.f10768l = (TextView) view.findViewById(C1704R.C1706id.tv_plane_header);
        this.f10769m = (TextView) view.findViewById(C1704R.C1706id.tv_plane_tail);
        C3103au.m29218b(this.f10604a.getAssets(), this.f10759c, this.f10760d);
        C3103au.m29232a(this.f10604a.getAssets(), this.f10761e, this.f10762f, this.f10763g, this.f10764h, this.f10765i, this.f10766j, this.f10767k, this.f10770n, this.f10768l, this.f10769m);
    }

    @Override // com.fimi.soul.module.setting.newhand.BaseNewHandFragment
    /* renamed from: b */
    protected String mo29832b() {
        return NewHandThreeFragment.class.getName().toLowerCase();
    }

    @Override // com.fimi.soul.module.setting.newhand.BaseNewHandFragment, android.view.View.OnClickListener
    public void onClick(View view) {
        super.onClick(view);
        if (view == this.f10770n) {
            Log.i("zhej", "current:" + ((NewHandActivity) getActivity()).m29839a().getCurrentItem());
            ((NewHandActivity) getActivity()).m29839a().setCurrentItem(((NewHandActivity) getActivity()).m29839a().getCurrentItem() + 1, true);
        }
    }
}
