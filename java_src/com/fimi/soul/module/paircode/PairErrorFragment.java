package com.fimi.soul.module.paircode;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import com.fimi.overseas.soul.C1704R;
import com.fimi.soul.utils.C3103au;
/* loaded from: classes.dex */
public class PairErrorFragment extends Fragment implements View.OnClickListener {

    /* renamed from: a */
    PairCodeActivity f9899a;

    /* renamed from: b */
    Button f9900b;

    /* renamed from: c */
    View f9901c;

    /* renamed from: d */
    private TextView f9902d;

    /* renamed from: e */
    private TextView f9903e;

    /* renamed from: a */
    private void m30193a(View view) {
        this.f9902d = (TextView) view.findViewById(C1704R.C1706id.connect_dis_title);
        this.f9903e = (TextView) view.findViewById(C1704R.C1706id.connect_dis_tip);
        this.f9900b = (Button) view.findViewById(C1704R.C1706id.dis_con_submit);
        C3103au.m29232a(this.f9899a.getAssets(), this.f9903e, this.f9902d, this.f9900b);
        this.f9900b.setOnClickListener(this);
    }

    @Override // android.app.Fragment
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        this.f9899a = (PairCodeActivity) activity;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        switch (view.getId()) {
            case C1704R.C1706id.dis_con_submit /* 2131756094 */:
                this.f9899a.finish();
                return;
            default:
                return;
        }
    }

    @Override // android.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f9901c = layoutInflater.inflate(C1704R.layout.pair_disconnect_layout, (ViewGroup) null);
        m30193a(this.f9901c);
        return this.f9901c;
    }
}
