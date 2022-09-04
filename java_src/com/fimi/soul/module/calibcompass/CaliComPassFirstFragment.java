package com.fimi.soul.module.calibcompass;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.p001v4.app.Fragment;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.fimi.kernel.p165d.C1648b;
import com.fimi.overseas.soul.C1704R;
import com.fimi.soul.drone.C2083a;
import com.fimi.soul.drone.C2104d;
import com.fimi.soul.drone.p205i.C2352k;
import com.fimi.soul.module.p214c.C2523d;
import com.fimi.soul.utils.C3103au;
/* loaded from: classes.dex */
public class CaliComPassFirstFragment extends BaseCaliCompassFragment {

    /* renamed from: f */
    AbstractC2527a f8202f;

    /* renamed from: g */
    private TextView f8203g;

    /* renamed from: h */
    private boolean f8204h;

    /* renamed from: i */
    private boolean f8205i;

    /* renamed from: j */
    private Handler f8206j = new Handler() { // from class: com.fimi.soul.module.calibcompass.CaliComPassFirstFragment.1
        @Override // android.os.Handler
        public void handleMessage(Message message) {
            super.handleMessage(message);
            CaliComPassFirstFragment.this.f8205i = true;
        }
    };

    /* renamed from: k */
    private boolean f8207k;

    /* renamed from: l */
    private boolean f8208l;

    /* renamed from: com.fimi.soul.module.calibcompass.CaliComPassFirstFragment$a */
    /* loaded from: classes.dex */
    interface AbstractC2527a {
        /* renamed from: b */
        void mo31332b();
    }

    /* renamed from: a */
    private void m31349a(View view) {
        this.f8203g = (TextView) view.findViewById(C1704R.C1706id.showtitleone);
        C3103au.m29232a(getActivity().getAssets(), this.f8203g);
    }

    /* renamed from: a */
    private void m31348a(TextView textView) {
        ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(getResources().getColor(C1704R.color.white));
        ForegroundColorSpan foregroundColorSpan2 = new ForegroundColorSpan(getResources().getColor(C1704R.color.white));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(textView.getText().toString());
        spannableStringBuilder.setSpan(foregroundColorSpan, 19, 21, 33);
        spannableStringBuilder.setSpan(foregroundColorSpan2, 27, textView.getText().length(), 33);
        textView.setText(spannableStringBuilder);
        m31347a(textView, 128);
    }

    /* renamed from: a */
    public void m31347a(TextView textView, int i) {
        textView.setTextColor(textView.getTextColors().withAlpha(i));
    }

    /* renamed from: a */
    public void m31345a(boolean z) {
        this.f8207k = z;
    }

    @Override // com.fimi.soul.module.calibcompass.BaseCaliCompassFragment, android.support.p001v4.app.Fragment
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        this.f8202f = (AbstractC2527a) activity;
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
        View inflate = layoutInflater.inflate(C1704R.layout.cali_compass_first, (ViewGroup) null);
        m31349a(inflate);
        return inflate;
    }

    @Override // android.support.p001v4.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        this.f8202f = null;
    }

    @Override // com.fimi.soul.module.calibcompass.BaseCaliCompassFragment, com.fimi.soul.drone.C2104d.AbstractC2106b
    public void onDroneEvent(C2104d.EnumC2105a enumC2105a, C2083a c2083a) {
        super.onDroneEvent(enumC2105a, c2083a);
        if (isVisible()) {
            switch (enumC2105a) {
                case CaliCompass:
                    C2352k m32978k = c2083a.m32978k();
                    if (!this.f8207k) {
                        return;
                    }
                    if (this.f8205i && m32978k.m31916d() == 1 && m32978k.m31914e() == 1 && m32978k.m31920b() == 1 && m32978k.m31918c() == 2) {
                        this.f8205i = false;
                        this.f8208l = true;
                        C2523d.m31374a(c2083a).m31371b((byte) 1, (byte) 1, (byte) 3);
                        return;
                    } else if (m32978k.m31916d() == 1 && m32978k.m31914e() == 1 && m32978k.m31920b() == 0 && m32978k.m31918c() == 1) {
                        Fragment findFragmentByTag = this.f8199c.findFragmentByTag("error");
                        if (findFragmentByTag == null || !(findFragmentByTag instanceof CaliCompassErrorFragment) || !findFragmentByTag.isHidden()) {
                            return;
                        }
                        ((CaliCompassErrorFragment) findFragmentByTag).m31324a(getString(C1704R.C1707string.remindererror), false, false);
                        ((CaliCompassActivity) getActivity()).m31334a(getString(C1704R.C1707string.calicompassesucess));
                        this.f8199c.beginTransaction().hide(this).show(findFragmentByTag).commitAllowingStateLoss();
                        return;
                    } else if (this.f8208l && m32978k.m31916d() == 2 && m32978k.m31914e() == 1 && m32978k.m31920b() == 1 && m32978k.m31918c() == 1) {
                        this.f8208l = false;
                        this.f8204h = false;
                        ((CaliCompassActivity) getActivity()).m31334a(getString(C1704R.C1707string.compass_ver_calibration));
                        this.f8199c.beginTransaction().hide(this).show(this.f8199c.findFragmentByTag("thrid")).setCustomAnimations(17432578, 17432579).commitAllowingStateLoss();
                        return;
                    } else if (m32978k.m31916d() != 1 || m32978k.m31914e() != 1 || m32978k.m31920b() != 1 || m32978k.m31918c() != 1 || this.f8204h) {
                        return;
                    } else {
                        this.f8204h = true;
                        this.f8208l = true;
                        C1648b.m34863b(getActivity()).m34867a(getString(C1704R.C1707string.compass_hor));
                        return;
                    }
                default:
                    return;
            }
        }
    }

    @Override // android.support.p001v4.app.Fragment
    public void onHiddenChanged(boolean z) {
        super.onHiddenChanged(z);
        if (!z) {
            this.f8204h = false;
            this.f8206j.sendEmptyMessageDelayed(0, 2000L);
        }
    }

    @Override // com.fimi.soul.module.calibcompass.BaseCaliCompassFragment, android.support.p001v4.app.Fragment
    public void onStart() {
        super.onStart();
    }
}
