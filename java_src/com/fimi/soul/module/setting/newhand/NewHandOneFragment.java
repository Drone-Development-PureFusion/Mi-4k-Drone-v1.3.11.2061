package com.fimi.soul.module.setting.newhand;

import android.graphics.drawable.AnimationDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.fimi.kernel.C1642c;
import com.fimi.kernel.utils.C1679t;
import com.fimi.overseas.soul.C1704R;
import com.fimi.soul.utils.C3103au;
import java.util.Timer;
/* loaded from: classes.dex */
public class NewHandOneFragment extends BaseNewHandFragment {

    /* renamed from: n */
    private static AbstractC2953a f10720n;

    /* renamed from: c */
    TextView f10721c;

    /* renamed from: d */
    TextView f10722d;

    /* renamed from: e */
    TextView f10723e;

    /* renamed from: f */
    TextView f10724f;

    /* renamed from: g */
    TextView f10725g;

    /* renamed from: h */
    TextView f10726h;

    /* renamed from: i */
    TextView f10727i;

    /* renamed from: j */
    TextView f10728j;

    /* renamed from: k */
    TextView f10729k;

    /* renamed from: l */
    Button f10730l;

    /* renamed from: m */
    private ImageView f10731m;

    /* renamed from: p */
    private Timer f10733p;

    /* renamed from: o */
    private boolean f10732o = false;

    /* renamed from: q */
    private AnimationDrawable f10734q = null;

    /* renamed from: a */
    public static NewHandOneFragment m29836a(AbstractC2953a abstractC2953a) {
        f10720n = abstractC2953a;
        return new NewHandOneFragment();
    }

    @Override // com.fimi.soul.module.setting.newhand.BaseNewHandFragment
    /* renamed from: a */
    protected View mo29834a(LayoutInflater layoutInflater) {
        return layoutInflater.inflate(C1704R.layout.fragment_newhand_one, (ViewGroup) null);
    }

    @Override // com.fimi.soul.module.setting.newhand.BaseNewHandFragment
    /* renamed from: a */
    protected void mo29835a() {
        this.f10721c.setText("1");
        this.f10723e.setText(C1704R.C1707string.new_hand_mode);
        if (C1642c.m34885e().m34501p()) {
            this.f10728j.setText(getString(C1704R.C1707string.new_hand_one_tip_two, Math.round(C1679t.m34553b(50.0d)) + getString(C1704R.C1707string.distance_unit_ft), Math.round(C1679t.m34553b(100.0d)) + getString(C1704R.C1707string.distance_unit_ft)));
        } else {
            this.f10728j.setText(getString(C1704R.C1707string.new_hand_one_tip_two, "50m", "100m"));
        }
        this.f10729k.setText(C1704R.C1707string.new_hand_one_tip_three);
        this.f10730l.setText(C1704R.C1707string.new_hand_next);
        this.f10730l.setOnClickListener(this);
    }

    @Override // com.fimi.soul.module.setting.newhand.BaseNewHandFragment
    /* renamed from: a */
    protected void mo29833a(View view) {
        this.f10731m = (ImageView) view.findViewById(C1704R.C1706id.img_left);
        if (C1642c.m34885e().m34501p()) {
            this.f10731m.setBackgroundResource(C1704R.C1705drawable.img_guide_fly_scope_en_ft);
        } else {
            this.f10731m.setBackgroundResource(C1704R.C1705drawable.img_guide_fly_scope_en);
        }
        this.f10721c = (TextView) view.findViewById(C1704R.C1706id.tv_seq);
        this.f10722d = (TextView) view.findViewById(C1704R.C1706id.tv_total);
        this.f10723e = (TextView) view.findViewById(C1704R.C1706id.tv_title);
        this.f10724f = (TextView) view.findViewById(C1704R.C1706id.tv_number_one);
        this.f10725g = (TextView) view.findViewById(C1704R.C1706id.tv_number_two);
        this.f10728j = (TextView) view.findViewById(C1704R.C1706id.tv_tip_two);
        this.f10726h = (TextView) view.findViewById(C1704R.C1706id.tv_number_three);
        this.f10729k = (TextView) view.findViewById(C1704R.C1706id.tv_tip_three);
        this.f10730l = (Button) view.findViewById(C1704R.C1706id.btn_next);
        C3103au.m29218b(this.f10604a.getAssets(), this.f10721c, this.f10722d);
        C3103au.m29232a(this.f10604a.getAssets(), this.f10723e, this.f10724f, this.f10725g, this.f10726h, this.f10728j, this.f10729k, this.f10730l);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.fimi.soul.module.setting.newhand.BaseNewHandFragment
    /* renamed from: b */
    public String mo29832b() {
        return NewHandOneFragment.class.getName().toLowerCase();
    }

    @Override // com.fimi.soul.module.setting.newhand.BaseNewHandFragment, android.view.View.OnClickListener
    public void onClick(View view) {
        super.onClick(view);
        if (view == this.f10730l) {
            ((NewHandActivity) getActivity()).m29839a().setCurrentItem(((NewHandActivity) getActivity()).m29839a().getCurrentItem() + 1, true);
        }
    }
}
