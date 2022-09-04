package com.fimi.soul.module.paircode;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.fimi.kernel.view.progress.ProgressView;
import com.fimi.overseas.soul.C1704R;
import com.fimi.soul.biz.p170b.C1772d;
import com.fimi.soul.utils.C3103au;
import java.util.Timer;
import java.util.TimerTask;
/* loaded from: classes.dex */
public class PairResultFragment extends Fragment implements View.OnClickListener, AbstractC2825a {

    /* renamed from: a */
    RelativeLayout f9918a;

    /* renamed from: b */
    RelativeLayout f9919b;

    /* renamed from: c */
    RelativeLayout f9920c;

    /* renamed from: e */
    TextView f9922e;

    /* renamed from: f */
    TextView f9923f;

    /* renamed from: g */
    TextView f9924g;

    /* renamed from: h */
    TextView f9925h;

    /* renamed from: i */
    Button f9926i;

    /* renamed from: j */
    Button f9927j;

    /* renamed from: k */
    Button f9928k;

    /* renamed from: l */
    ProgressView f9929l;

    /* renamed from: m */
    PairCodeActivity f9930m;

    /* renamed from: n */
    View f9931n;

    /* renamed from: o */
    Timer f9932o;

    /* renamed from: p */
    private final int f9933p = 2;

    /* renamed from: q */
    private final int f9934q = 3;

    /* renamed from: r */
    private final int f9935r = 4;

    /* renamed from: s */
    private final int f9936s = -1;

    /* renamed from: t */
    private final int f9937t = 0;

    /* renamed from: d */
    public int f9921d = 0;

    /* renamed from: u */
    private final int f9938u = 256;

    /* renamed from: v */
    private Handler f9939v = new Handler() { // from class: com.fimi.soul.module.paircode.PairResultFragment.2
        @Override // android.os.Handler
        public void handleMessage(Message message) {
            super.handleMessage(message);
            switch (message.what) {
                case 256:
                    PairResultFragment.this.f9929l.setCurrentCount(PairResultFragment.this.f9921d);
                    PairResultFragment.this.f9924g.setText(String.valueOf(PairResultFragment.this.f9921d));
                    return;
                default:
                    return;
            }
        }
    };

    /* renamed from: com.fimi.soul.module.paircode.PairResultFragment$a */
    /* loaded from: classes.dex */
    public enum EnumC2824a {
        success,
        fail,
        busy
    }

    /* renamed from: a */
    private void m30190a(View view) {
        this.f9919b = (RelativeLayout) view.findViewById(C1704R.C1706id.pair_fail);
        this.f9925h = (TextView) this.f9919b.findViewById(C1704R.C1706id.pair_fail_rt);
        this.f9918a = (RelativeLayout) view.findViewById(C1704R.C1706id.pair_success);
        this.f9920c = (RelativeLayout) view.findViewById(C1704R.C1706id.pair_progress);
        this.f9929l = (ProgressView) this.f9931n.findViewById(C1704R.C1706id.progress_v);
        this.f9929l.setFrontColor(getResources().getColor(C1704R.color.white_half));
        this.f9929l.setMaxCount(100.0f);
        this.f9929l.setCurrentCount(0.0f);
        this.f9922e = (TextView) this.f9931n.findViewById(C1704R.C1706id.connect_des);
        this.f9923f = (TextView) this.f9931n.findViewById(C1704R.C1706id.connect_des_tip);
        this.f9924g = (TextView) this.f9931n.findViewById(C1704R.C1706id.pair_index);
        C3103au.m29218b(getActivity().getAssets(), this.f9924g);
        this.f9926i = (Button) this.f9931n.findViewById(C1704R.C1706id.exit_btn);
        this.f9927j = (Button) this.f9931n.findViewById(C1704R.C1706id.repair_btn);
        this.f9928k = (Button) this.f9931n.findViewById(C1704R.C1706id.con_submit);
        this.f9928k.setOnClickListener(this);
        this.f9926i.setOnClickListener(this);
        this.f9927j.setOnClickListener(this);
        C3103au.m29232a(getActivity().getAssets(), this.f9922e, this.f9923f, this.f9924g, this.f9926i, this.f9927j, this.f9928k);
    }

    /* renamed from: a */
    private void m30189a(EnumC2824a enumC2824a) {
        this.f9919b.setVisibility(8);
        this.f9918a.setVisibility(8);
        this.f9920c.setVisibility(8);
        switch (enumC2824a) {
            case success:
                this.f9920c.setVisibility(0);
                if (this.f9921d == -1) {
                    this.f9920c.setVisibility(8);
                    this.f9925h.setText(getResources().getString(C1704R.C1707string.pair_outtime));
                    this.f9919b.setVisibility(0);
                    this.f9930m.m30196a(false);
                    return;
                } else if (this.f9921d != 100) {
                    if (C1772d.m34208a().m34187k()) {
                        this.f9929l.setCurrentCount(this.f9921d);
                        this.f9924g.setText(String.valueOf(this.f9921d));
                        return;
                    }
                    this.f9932o = new Timer();
                    this.f9932o.schedule(new TimerTask() { // from class: com.fimi.soul.module.paircode.PairResultFragment.1
                        @Override // java.util.TimerTask, java.lang.Runnable
                        public void run() {
                            PairResultFragment.this.f9939v.sendEmptyMessage(256);
                            PairResultFragment.this.f9921d = 10;
                        }
                    }, 200L, 200L);
                    return;
                } else {
                    this.f9920c.setVisibility(8);
                    this.f9919b.setVisibility(8);
                    this.f9918a.setVisibility(0);
                    if (C1772d.m34208a().m34187k() || this.f9932o == null) {
                        return;
                    }
                    this.f9932o.cancel();
                    this.f9932o = null;
                    return;
                }
            case fail:
                this.f9919b.setVisibility(0);
                return;
            case busy:
                this.f9925h.setText(getResources().getString(C1704R.C1707string.pair_busy));
                this.f9919b.setVisibility(0);
                return;
            default:
                return;
        }
    }

    @Override // com.fimi.soul.module.paircode.AbstractC2825a
    /* renamed from: a */
    public void mo30187a(int i) {
    }

    @Override // com.fimi.soul.module.paircode.AbstractC2825a
    /* renamed from: a */
    public void mo30186a(int i, int i2) {
        switch (i) {
            case 2:
                this.f9921d = i2;
                m30189a(EnumC2824a.success);
                return;
            case 3:
                m30189a(EnumC2824a.fail);
                return;
            case 4:
                m30189a(EnumC2824a.busy);
                return;
            default:
                return;
        }
    }

    @Override // android.app.Fragment
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        this.f9930m = (PairCodeActivity) activity;
        this.f9930m.m30197a(this);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        switch (view.getId()) {
            case C1704R.C1706id.exit_btn /* 2131756099 */:
                getActivity().finish();
                return;
            case C1704R.C1706id.repair_btn /* 2131756100 */:
                this.f9930m.m30199a();
                return;
            case C1704R.C1706id.con_submit /* 2131756109 */:
                getActivity().finish();
                return;
            default:
                return;
        }
    }

    @Override // android.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f9931n = layoutInflater.inflate(C1704R.layout.pair_rt_layout, (ViewGroup) null);
        m30190a(this.f9931n);
        return this.f9931n;
    }
}
