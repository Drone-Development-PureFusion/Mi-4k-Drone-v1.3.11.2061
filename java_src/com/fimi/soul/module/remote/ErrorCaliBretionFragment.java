package com.fimi.soul.module.remote;

import android.os.Bundle;
import android.os.Handler;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.fimi.kernel.p165d.C1648b;
import com.fimi.kernel.utils.C1681v;
import com.fimi.kernel.view.percent.PercentRelativeLayout;
import com.fimi.overseas.soul.C1704R;
import com.fimi.soul.utils.C3103au;
import it.p273a.p274a.AbstractC10866e;
/* loaded from: classes.dex */
public class ErrorCaliBretionFragment extends BaseRemoteFragment {

    /* renamed from: f */
    C1681v f9997f;

    /* renamed from: g */
    Runnable f9998g = new Runnable() { // from class: com.fimi.soul.module.remote.ErrorCaliBretionFragment.1
        @Override // java.lang.Runnable
        public void run() {
            ErrorCaliBretionFragment.this.f9983d.m31355m();
            ErrorCaliBretionFragment.this.getActivity().finish();
        }
    };

    /* renamed from: h */
    private TextView f9999h;

    /* renamed from: i */
    private Button f10000i;

    /* renamed from: j */
    private Button f10001j;

    /* renamed from: k */
    private Button f10002k;

    /* renamed from: l */
    private Button f10003l;

    /* renamed from: m */
    private TextView f10004m;

    /* renamed from: n */
    private TextView f10005n;

    /* renamed from: o */
    private ImageView f10006o;

    /* renamed from: p */
    private int f10007p;

    /* renamed from: q */
    private boolean f10008q;

    /* renamed from: a */
    private void m30179a() {
        this.f10001j.setVisibility(0);
        this.f10002k.setVisibility(0);
        this.f10003l.setVisibility(8);
    }

    /* renamed from: b */
    private void m30176b() {
        this.f10001j.setVisibility(8);
        this.f10002k.setVisibility(8);
        this.f10003l.setVisibility(0);
    }

    /* renamed from: a */
    public void m30178a(Button button, int i) {
        button.setTextColor(button.getTextColors().withAlpha(i));
    }

    /* renamed from: a */
    public void m30177a(String str, boolean z) {
        this.f10008q = z;
        PercentRelativeLayout.LayoutParams layoutParams = (PercentRelativeLayout.LayoutParams) this.f10006o.getLayoutParams();
        if (true == z) {
            this.f10004m.setText(C1704R.C1707string.calisucess);
            this.f10005n.setText(C1704R.C1707string.caliremotesucess);
            this.f10005n.setVisibility(4);
            layoutParams.setMargins(0, (int) (this.f10007p * 0.1111d), 0, 0);
            this.f10006o.setLayoutParams(layoutParams);
            this.f10006o.setImageResource(C1704R.C1705drawable.icon_calibration_succeed);
            m30176b();
            return;
        }
        this.f10004m.setText(C1704R.C1707string.califail);
        this.f10005n.setVisibility(0);
        if (str == null || "".equals(str)) {
            this.f10005n.setText(C1704R.C1707string.caliremotefail);
        } else {
            this.f10005n.setText(str);
        }
        layoutParams.setMargins(0, (int) (this.f10007p * 0.12592d), 0, 0);
        this.f10006o.setLayoutParams(layoutParams);
        this.f10006o.setImageResource(C1704R.C1705drawable.icon_calibration_defeat);
        m30179a();
    }

    @Override // com.fimi.soul.module.remote.BaseRemoteFragment, android.view.View.OnClickListener
    public void onClick(View view) {
        super.onClick(view);
        switch (view.getId()) {
            case C1704R.C1706id.quit /* 2131755040 */:
                this.f9983d.m31354n();
                this.f9983d.m31355m();
                getActivity().finish();
                return;
            case C1704R.C1706id.again /* 2131755511 */:
                if (this.f9984e == null) {
                    return;
                }
                this.f9984e.mo30174a(C1704R.C1706id.errorcalifragment, C1704R.C1706id.remote_roller_fragment);
                return;
            case C1704R.C1706id.sucesscomplete /* 2131755512 */:
                getActivity().finish();
                new Handler().post(this.f9998g);
                return;
            case C1704R.C1706id.black_btn /* 2131756179 */:
                getActivity().finish();
                return;
            default:
                return;
        }
    }

    @Override // android.support.p001v4.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        DisplayMetrics displayMetrics = new DisplayMetrics();
        getActivity().getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        this.f10007p = displayMetrics.heightPixels;
    }

    @Override // com.fimi.soul.module.remote.BaseRemoteFragment, android.support.p001v4.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(C1704R.layout.caliremotesucess, (ViewGroup) null);
        this.f10006o = (ImageView) inflate.findViewById(C1704R.C1706id.tagIcon);
        this.f9999h = (TextView) inflate.findViewById(C1704R.C1706id.heardView).findViewById(C1704R.C1706id.tv_settingTitle);
        this.f9999h.setText(C1704R.C1707string.caliremotesucess);
        this.f10000i = (Button) inflate.findViewById(C1704R.C1706id.heardView).findViewById(C1704R.C1706id.black_btn);
        this.f10000i.setOnClickListener(this);
        this.f10001j = (Button) inflate.findViewById(C1704R.C1706id.quit);
        this.f10001j.setOnClickListener(this);
        this.f10002k = (Button) inflate.findViewById(C1704R.C1706id.again);
        this.f10002k.setOnClickListener(this);
        this.f10003l = (Button) inflate.findViewById(C1704R.C1706id.sucesscomplete);
        this.f10003l.setOnClickListener(this);
        this.f10004m = (TextView) inflate.findViewById(C1704R.C1706id.destitle);
        this.f10005n = (TextView) inflate.findViewById(C1704R.C1706id.calireason);
        this.f9997f = new C1681v(getActivity());
        C3103au.m29232a(getActivity().getAssets(), this.f9999h, this.f10000i, this.f10001j, this.f10002k, this.f10003l, this.f10004m, this.f10005n);
        m30178a(this.f10001j, 128);
        m30178a(this.f10002k, AbstractC10866e.f34827F);
        return inflate;
    }

    @Override // android.support.p001v4.app.Fragment
    public void onHiddenChanged(boolean z) {
        super.onHiddenChanged(z);
        if (!z) {
            if (this.f10008q) {
                C1648b.m34863b(getActivity()).m34867a(getString(C1704R.C1707string.calisucess));
            } else {
                C1648b.m34863b(getActivity()).m34867a(getString(C1704R.C1707string.calibration_failure));
            }
        }
    }
}
