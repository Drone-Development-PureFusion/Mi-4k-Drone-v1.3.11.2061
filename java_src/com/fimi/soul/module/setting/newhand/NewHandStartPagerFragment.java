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
public class NewHandStartPagerFragment extends BaseNewHandFragment {

    /* renamed from: c */
    private TextView f10756c;

    /* renamed from: d */
    private TextView f10757d;

    /* renamed from: e */
    private Button f10758e;

    @Override // com.fimi.soul.module.setting.newhand.BaseNewHandFragment
    /* renamed from: a */
    protected View mo29834a(LayoutInflater layoutInflater) {
        return layoutInflater.inflate(C1704R.layout.fragment_newhand_start, (ViewGroup) null);
    }

    @Override // com.fimi.soul.module.setting.newhand.BaseNewHandFragment
    /* renamed from: a */
    protected void mo29835a() {
    }

    @Override // com.fimi.soul.module.setting.newhand.BaseNewHandFragment
    /* renamed from: a */
    protected void mo29833a(View view) {
        this.f10756c = (TextView) view.findViewById(C1704R.C1706id.newhand_title_tv);
        this.f10757d = (TextView) view.findViewById(C1704R.C1706id.newhand_content_tv);
        this.f10758e = (Button) view.findViewById(C1704R.C1706id.newhand_start_btn);
        this.f10758e.setOnClickListener(this);
        C3103au.m29232a(getActivity().getAssets(), this.f10756c, this.f10757d, this.f10758e);
    }

    @Override // com.fimi.soul.module.setting.newhand.BaseNewHandFragment
    /* renamed from: b */
    protected String mo29832b() {
        return null;
    }

    @Override // com.fimi.soul.module.setting.newhand.BaseNewHandFragment, android.view.View.OnClickListener
    public void onClick(View view) {
        super.onClick(view);
        switch (view.getId()) {
            case C1704R.C1706id.newhand_start_btn /* 2131755896 */:
                Log.i("zhej", "current:" + ((NewHandActivity) getActivity()).m29839a().getCurrentItem());
                ((NewHandActivity) getActivity()).m29839a().setCurrentItem(((NewHandActivity) getActivity()).m29839a().getCurrentItem() + 1, true);
                return;
            default:
                return;
        }
    }
}
