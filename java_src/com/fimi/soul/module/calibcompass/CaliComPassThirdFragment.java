package com.fimi.soul.module.calibcompass;

import android.app.Activity;
import android.os.Bundle;
import android.support.p001v4.app.Fragment;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import com.fimi.kernel.p165d.C1648b;
import com.fimi.overseas.soul.C1704R;
import com.fimi.soul.drone.C2083a;
import com.fimi.soul.drone.C2104d;
import com.fimi.soul.drone.p205i.C2352k;
import com.fimi.soul.utils.C3103au;
/* loaded from: classes.dex */
public class CaliComPassThirdFragment extends BaseCaliCompassFragment {

    /* renamed from: f */
    AbstractC2529a f8211f;

    /* renamed from: g */
    private TextView f8212g;

    /* renamed from: h */
    private TextView f8213h;

    /* renamed from: i */
    private Button f8214i;

    /* renamed from: j */
    private boolean f8215j;

    /* renamed from: com.fimi.soul.module.calibcompass.CaliComPassThirdFragment$a */
    /* loaded from: classes.dex */
    interface AbstractC2529a {
        /* renamed from: a */
        void mo31333a(boolean z);
    }

    /* renamed from: a */
    private void m31344a(View view) {
        this.f8213h = (TextView) view.findViewById(C1704R.C1706id.showtitleone);
        C3103au.m29232a(getActivity().getAssets(), this.f8213h);
    }

    /* renamed from: a */
    private void m31343a(TextView textView) {
        ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(getResources().getColor(C1704R.color.white));
        ForegroundColorSpan foregroundColorSpan2 = new ForegroundColorSpan(getResources().getColor(C1704R.color.white));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(textView.getText().toString());
        spannableStringBuilder.setSpan(foregroundColorSpan, 19, 23, 33);
        spannableStringBuilder.setSpan(foregroundColorSpan2, 29, this.f8213h.getText().length(), 33);
        this.f8213h.setText(spannableStringBuilder);
        m31342a(this.f8213h, 128);
    }

    /* renamed from: a */
    public void m31342a(TextView textView, int i) {
        textView.setTextColor(textView.getTextColors().withAlpha(i));
    }

    @Override // com.fimi.soul.module.calibcompass.BaseCaliCompassFragment, android.support.p001v4.app.Fragment
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        this.f8211f = (AbstractC2529a) activity;
    }

    @Override // com.fimi.soul.module.calibcompass.BaseCaliCompassFragment, android.view.View.OnClickListener
    public void onClick(View view) {
        super.onClick(view);
        switch (view.getId()) {
            case C1704R.C1706id.black_btn /* 2131756179 */:
                if (this.f8201e == null) {
                    return;
                }
                this.f8201e.mo31341a();
                return;
            default:
                return;
        }
    }

    @Override // com.fimi.soul.module.calibcompass.BaseCaliCompassFragment, android.support.p001v4.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(C1704R.layout.cali_compass_third, (ViewGroup) null);
        m31344a(inflate);
        return inflate;
    }

    @Override // android.support.p001v4.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        this.f8211f = null;
    }

    @Override // com.fimi.soul.module.calibcompass.BaseCaliCompassFragment, com.fimi.soul.drone.C2104d.AbstractC2106b
    public void onDroneEvent(C2104d.EnumC2105a enumC2105a, C2083a c2083a) {
        super.onDroneEvent(enumC2105a, c2083a);
        if (isVisible()) {
            switch (enumC2105a) {
                case CaliCompass:
                    C2352k m32978k = c2083a.m32978k();
                    if (this.f8211f != null) {
                        this.f8211f.mo31333a(true);
                    }
                    if (m32978k.m31916d() != 2 || m32978k.m31914e() != 1 || m32978k.m31920b() != 1 || m32978k.m31918c() != 2) {
                        return;
                    }
                    if (this.f8211f != null) {
                        this.f8211f.mo31333a(false);
                    }
                    this.f8215j = false;
                    Fragment findFragmentByTag = this.f8199c.findFragmentByTag("error");
                    if (findFragmentByTag == null || !(findFragmentByTag instanceof CaliCompassErrorFragment) || !findFragmentByTag.isHidden()) {
                        return;
                    }
                    ((CaliCompassErrorFragment) findFragmentByTag).m31324a(getString(C1704R.C1707string.calicomsucess), true, false);
                    ((CaliCompassActivity) getActivity()).m31334a(getString(C1704R.C1707string.calicompassesucess));
                    this.f8199c.beginTransaction().hide(this).show(findFragmentByTag).commitAllowingStateLoss();
                    return;
                default:
                    return;
            }
        }
    }

    @Override // android.support.p001v4.app.Fragment
    public void onHiddenChanged(boolean z) {
        super.onHiddenChanged(z);
        if (!z) {
            C1648b.m34869a(getActivity()).m34867a(getString(C1704R.C1707string.compass_ver));
        }
    }
}
