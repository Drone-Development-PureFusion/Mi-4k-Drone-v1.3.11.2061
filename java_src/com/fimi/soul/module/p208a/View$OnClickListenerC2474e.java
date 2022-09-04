package com.fimi.soul.module.p208a;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.SeekBar;
import android.widget.TextView;
import com.fimi.overseas.soul.C1704R;
import com.fimi.soul.module.p208a.C2462b;
import com.fimi.soul.module.p208a.View$OnClickListenerC2464c;
import com.fimi.soul.view.wheelview.WheelView;
/* renamed from: com.fimi.soul.module.a.e */
/* loaded from: classes.dex */
public class View$OnClickListenerC2474e implements View.OnClickListener, PopupWindow.OnDismissListener, View$OnClickListenerC2464c.AbstractC2472a {

    /* renamed from: a */
    private C2462b f8020a;

    /* renamed from: b */
    private View$OnClickListenerC2464c f8021b;

    /* renamed from: c */
    private SeekBar f8022c;

    /* renamed from: d */
    private boolean f8023d;

    /* renamed from: e */
    private Context f8024e;

    /* renamed from: f */
    private AbstractC2475a f8025f;

    /* renamed from: g */
    private TextView f8026g;

    /* renamed from: h */
    private LinearLayout f8027h;

    /* renamed from: i */
    private PopupWindow f8028i;

    /* renamed from: j */
    private int f8029j;

    /* renamed from: k */
    private WheelView f8030k;

    /* renamed from: l */
    private TextView f8031l;

    /* renamed from: m */
    private LinearLayout f8032m;

    /* renamed from: com.fimi.soul.module.a.e$a */
    /* loaded from: classes.dex */
    public interface AbstractC2475a {
        /* renamed from: a */
        void mo31028a();

        /* renamed from: a */
        void mo31027a(int i, String str);
    }

    public View$OnClickListenerC2474e(Context context, AbstractC2475a abstractC2475a, boolean z) {
        this.f8023d = false;
        this.f8025f = abstractC2475a;
        this.f8024e = context;
        this.f8023d = z;
        this.f8029j = context.getResources().getDimensionPixelSize(C1704R.dimen.camera_menu_location_y);
    }

    /* renamed from: a */
    public void m31546a() {
        if (this.f8028i == null || !this.f8028i.isShowing() || this.f8030k == null) {
            return;
        }
        this.f8030k.m28286a(this.f8021b.m31570d());
        this.f8021b.m31574c();
    }

    @Override // com.fimi.soul.module.p208a.View$OnClickListenerC2464c.AbstractC2472a
    /* renamed from: a */
    public void mo31545a(int i) {
        this.f8032m.setVisibility(i);
        this.f8027h.setVisibility(i);
    }

    @Override // com.fimi.soul.module.p208a.View$OnClickListenerC2464c.AbstractC2472a
    /* renamed from: a */
    public void mo31544a(int i, String str) {
        if (this.f8025f != null) {
            this.f8025f.mo31027a(i, str);
        }
    }

    @Override // com.fimi.soul.module.p208a.View$OnClickListenerC2464c.AbstractC2472a
    /* renamed from: a */
    public void mo31543a(int i, String str, String str2) {
        if (this.f8030k != null) {
            this.f8030k.m28291a(i + 1, str);
        }
    }

    @Override // com.fimi.soul.module.p208a.View$OnClickListenerC2464c.AbstractC2472a
    /* renamed from: a */
    public void mo31542a(int i, boolean z) {
        if (i != 0 || !this.f8023d) {
            this.f8026g.setText(this.f8024e.getString(C1704R.C1707string.camera_menu));
        } else {
            this.f8026g.setText(this.f8024e.getString(C1704R.C1707string.front__setting_app_enable_tip));
        }
    }

    /* renamed from: a */
    public void m31541a(View view, String[] strArr) {
        this.f8026g = (TextView) view.findViewById(C1704R.C1706id.ae_tv);
        this.f8031l = (TextView) view.findViewById(C1704R.C1706id.tv_default);
        if (this.f8023d) {
            this.f8026g.setText(this.f8024e.getString(C1704R.C1707string.front__setting_app_enable_tip));
        }
        this.f8027h = (LinearLayout) view.findViewById(C1704R.C1706id.tab);
        this.f8032m = (LinearLayout) view.findViewById(C1704R.C1706id.main_wv_ly);
        this.f8021b = new View$OnClickListenerC2464c(view, this.f8023d);
        int[] m31579a = this.f8021b.m31579a(strArr);
        this.f8021b.m31584a(this);
        this.f8021b.m31580a(m31579a);
        this.f8020a = new C2462b(this.f8024e);
        this.f8020a.m31587a(this.f8021b.m31567e());
        this.f8030k = (WheelView) view.findViewById(C1704R.C1706id.main_wv);
        this.f8030k.setOffset(1);
        this.f8030k.setItems(this.f8020a.m31588a(C2462b.EnumC2463a.AE, this.f8023d));
        this.f8030k.setOnWheelViewListener(this.f8021b);
        this.f8031l.setOnClickListener(this);
    }

    @Override // com.fimi.soul.module.p208a.View$OnClickListenerC2464c.AbstractC2472a
    /* renamed from: a */
    public void mo31540a(String[] strArr) {
        this.f8025f.mo31027a(-1, this.f8021b.m31556k());
    }

    /* renamed from: b */
    public void m31539b() {
        if (this.f8028i == null || !this.f8028i.isShowing()) {
            return;
        }
        this.f8028i.dismiss();
    }

    /* renamed from: b */
    public void m31538b(String[] strArr) {
        View inflate = LayoutInflater.from(this.f8024e).inflate(C1704R.layout.camera_menu_popup, (ViewGroup) null);
        m31541a(inflate, strArr);
        this.f8028i = new PopupWindow(inflate, this.f8024e.getResources().getDimensionPixelSize(C1704R.dimen.popupwindow_width), this.f8024e.getResources().getDimensionPixelSize(C1704R.dimen.popupwindow_hight), true);
        this.f8028i.setOnDismissListener(this);
        this.f8028i.setBackgroundDrawable(new ColorDrawable(0));
        inflate.measure(0, 0);
        inflate.getMeasuredWidth();
        inflate.getMeasuredHeight();
        this.f8028i.showAtLocation(inflate, 17, 0, -this.f8029j);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        switch (view.getId()) {
            case C1704R.C1706id.tv_default /* 2131755560 */:
                this.f8021b.m31561g();
                return;
            default:
                return;
        }
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public void onDismiss() {
        if (this.f8025f != null) {
            this.f8025f.mo31028a();
        }
    }
}
