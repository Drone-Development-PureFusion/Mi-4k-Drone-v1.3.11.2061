package com.fimi.soul.p168b;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.fimi.kernel.C1642c;
import com.fimi.kernel.view.button.SwitchButton;
import com.fimi.overseas.soul.C1704R;
import com.fimi.soul.entity.MoreSettingInfo;
import com.fimi.soul.utils.C3103au;
import java.util.List;
/* renamed from: com.fimi.soul.b.g */
/* loaded from: classes.dex */
public class C1744g extends BaseAdapter implements SwitchButton.AbstractC1695a {

    /* renamed from: a */
    private final Context f4455a;

    /* renamed from: b */
    private List<MoreSettingInfo> f4456b;

    /* renamed from: com.fimi.soul.b.g$a */
    /* loaded from: classes.dex */
    public enum EnumC1746a {
        FLIHGT_PARAMETER,
        GIMBAL_ANGLE,
        MAGNETIC_FIELD
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.fimi.soul.b.g$b */
    /* loaded from: classes.dex */
    public class C1747b {

        /* renamed from: a */
        TextView f4462a;

        /* renamed from: b */
        ImageView f4463b;

        /* renamed from: c */
        TextView f4464c;

        /* renamed from: d */
        TextView f4465d;

        /* renamed from: e */
        TextView f4466e;

        /* renamed from: f */
        ImageView f4467f;

        /* renamed from: g */
        TextView f4468g;

        /* renamed from: h */
        ImageView f4469h;

        /* renamed from: i */
        RelativeLayout f4470i;

        /* renamed from: j */
        SwitchButton f4471j;

        /* renamed from: k */
        TextView f4472k;

        private C1747b() {
        }

        /* renamed from: a */
        public View m34282a(ViewGroup viewGroup) {
            View inflate = LayoutInflater.from(C1744g.this.f4455a).inflate(C1704R.layout.adapt_setting, viewGroup, false);
            this.f4470i = (RelativeLayout) inflate.findViewById(C1704R.C1706id.rl);
            this.f4462a = (TextView) inflate.findViewById(C1704R.C1706id.setting_title_tv);
            this.f4463b = (ImageView) inflate.findViewById(C1704R.C1706id.general_setting_iv);
            this.f4464c = (TextView) inflate.findViewById(C1704R.C1706id.settig_coontent_tv);
            this.f4467f = (ImageView) inflate.findViewById(C1704R.C1706id.setting_more_iv);
            this.f4465d = (TextView) inflate.findViewById(C1704R.C1706id.switch_manul_tv);
            this.f4466e = (TextView) inflate.findViewById(C1704R.C1706id.switch_manul_child_tv);
            this.f4468g = (TextView) inflate.findViewById(C1704R.C1706id.setting_delcare);
            this.f4469h = (ImageView) inflate.findViewById(C1704R.C1706id.setting_point);
            this.f4471j = (SwitchButton) inflate.findViewById(C1704R.C1706id.switch_btn);
            this.f4472k = (TextView) inflate.findViewById(C1704R.C1706id.btn_set_model);
            C3103au.m29232a(C1744g.this.f4455a.getAssets(), this.f4462a, this.f4464c, this.f4468g, this.f4465d, this.f4466e, this.f4472k);
            return inflate;
        }
    }

    public C1744g(Context context, List<MoreSettingInfo> list) {
        this.f4455a = context;
        this.f4456b = list;
    }

    @Override // com.fimi.kernel.view.button.SwitchButton.AbstractC1695a
    /* renamed from: a */
    public void mo28184a(View view, boolean z) {
    }

    /* renamed from: a */
    public void m34286a(C1747b c1747b) {
        c1747b.f4472k.setVisibility(4);
        c1747b.f4467f.setVisibility(0);
        c1747b.f4464c.setVisibility(0);
        c1747b.f4462a.setVisibility(4);
        c1747b.f4463b.setBackgroundResource(C1704R.C1705drawable.setting_more_info);
        c1747b.f4464c.setText(C1704R.C1707string.show_flight_parameter);
        c1747b.f4463b.setVisibility(0);
        c1747b.f4471j.setVisibility(0);
        if (C1642c.m34885e().m34530d()) {
            c1747b.f4471j.m34420a(true, false);
        } else {
            c1747b.f4471j.m34420a(false, false);
        }
        c1747b.f4471j.setClickable(false);
        c1747b.f4467f.setVisibility(4);
    }

    /* renamed from: b */
    public void m34284b(C1747b c1747b) {
        c1747b.f4472k.setVisibility(4);
        c1747b.f4467f.setVisibility(0);
        c1747b.f4464c.setVisibility(0);
        c1747b.f4462a.setVisibility(4);
        c1747b.f4463b.setBackgroundResource(C1704R.C1705drawable.icon_setup_calibration3x);
        c1747b.f4464c.setText(C1704R.C1707string.show_calibration_angle);
        c1747b.f4463b.setVisibility(0);
        c1747b.f4471j.setVisibility(0);
        if (C1642c.m34885e().m34526e()) {
            c1747b.f4471j.m34420a(true, false);
        } else {
            c1747b.f4471j.m34420a(false, false);
        }
        c1747b.f4471j.setClickable(false);
        c1747b.f4467f.setVisibility(4);
    }

    /* renamed from: c */
    public void m34283c(C1747b c1747b) {
        c1747b.f4472k.setVisibility(4);
        c1747b.f4467f.setVisibility(0);
        c1747b.f4464c.setVisibility(0);
        c1747b.f4462a.setVisibility(4);
        c1747b.f4463b.setBackgroundResource(C1704R.C1705drawable.flight_parameter);
        c1747b.f4464c.setText(C1704R.C1707string.show_more_patter);
        c1747b.f4463b.setVisibility(0);
        c1747b.f4471j.setVisibility(0);
        if (C1642c.m34885e().m34530d()) {
            c1747b.f4471j.m34420a(true, false);
        } else {
            c1747b.f4471j.m34420a(false, false);
        }
        c1747b.f4471j.setClickable(false);
        c1747b.f4467f.setVisibility(4);
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f4456b.size();
    }

    @Override // android.widget.Adapter
    public Object getItem(int i) {
        return this.f4456b.get(i);
    }

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        return i;
    }

    @Override // android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        C1747b c1747b;
        if (view == null) {
            C1747b c1747b2 = new C1747b();
            view = c1747b2.m34282a(viewGroup);
            view.setTag(c1747b2);
            c1747b = c1747b2;
        } else {
            c1747b = (C1747b) view.getTag();
        }
        switch (this.f4456b.get(i).getIndexEnum()) {
            case FLIHGT_PARAMETER:
                m34286a(c1747b);
                break;
            case GIMBAL_ANGLE:
                m34284b(c1747b);
                break;
            case MAGNETIC_FIELD:
                m34283c(c1747b);
                break;
        }
        return view;
    }
}
