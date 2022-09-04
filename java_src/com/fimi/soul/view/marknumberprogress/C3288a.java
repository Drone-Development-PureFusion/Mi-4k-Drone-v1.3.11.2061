package com.fimi.soul.view.marknumberprogress;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.Handler;
import android.os.Message;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.fimi.overseas.soul.C1704R;
/* renamed from: com.fimi.soul.view.marknumberprogress.a */
/* loaded from: classes2.dex */
public class C3288a implements PopupWindow.OnDismissListener, AbstractC3290b {

    /* renamed from: a */
    private Context f12993a;

    /* renamed from: b */
    private NumberMarkProgressBar f12994b;

    /* renamed from: c */
    private TextView f12995c;

    /* renamed from: d */
    private TextView f12996d;

    /* renamed from: e */
    private AbstractC3290b f12997e;

    /* renamed from: f */
    private String f12998f;

    /* renamed from: g */
    private PopupWindow f12999g;

    /* renamed from: h */
    private boolean f13000h;

    /* renamed from: i */
    private int f13001i;

    /* renamed from: j */
    private boolean f13002j;

    /* renamed from: k */
    private Handler f13003k = new Handler() { // from class: com.fimi.soul.view.marknumberprogress.a.1
        @Override // android.os.Handler
        public void handleMessage(Message message) {
            super.handleMessage(message);
            C3288a.this.f12999g.dismiss();
        }
    };

    public C3288a(Context context, AbstractC3290b abstractC3290b) {
        this.f12993a = context;
        this.f12997e = abstractC3290b;
        this.f12998f = context.getString(C1704R.C1707string.blightness);
    }

    @Override // com.fimi.soul.view.marknumberprogress.AbstractC3290b
    /* renamed from: a */
    public void mo28463a(int i) {
    }

    @Override // com.fimi.soul.view.marknumberprogress.AbstractC3290b
    /* renamed from: a */
    public void mo28462a(int i, int i2) {
        this.f13003k.removeMessages(0);
        this.f13003k.sendEmptyMessageDelayed(0, 3000L);
        this.f12995c.setText(this.f12998f + "" + this.f12994b.getProgress() + "%");
        if (this.f12997e != null && this.f13000h && !this.f13002j) {
            this.f12997e.mo28462a(i, i2);
        }
        this.f13002j = false;
    }

    /* renamed from: a */
    public void m28467a(int i, boolean z) {
        View inflate = LayoutInflater.from(this.f12993a).inflate(C1704R.layout.front_light_popup, (ViewGroup) null);
        this.f12999g = new PopupWindow(inflate, -2, -2, true);
        this.f12999g.setBackgroundDrawable(new ColorDrawable(0));
        inflate.measure(0, 0);
        inflate.getMeasuredWidth();
        inflate.getMeasuredHeight();
        this.f12994b = (NumberMarkProgressBar) inflate.findViewById(C1704R.C1706id.markbar);
        this.f13001i = i;
        this.f13002j = true;
        this.f12994b.setProgress(i);
        this.f12994b.setOnProgressBarListener(this);
        this.f13000h = z;
        this.f12994b.setEnabled(z);
        this.f12995c = (TextView) inflate.findViewById(C1704R.C1706id.info_tv);
        this.f12996d = (TextView) inflate.findViewById(C1704R.C1706id.model_tv);
        this.f12995c.setText(this.f12998f + "" + this.f12994b.getProgress() + "%");
        int[] iArr = new int[2];
        this.f12999g.showAtLocation(inflate, 17, 0, 0);
        this.f12999g.setOnDismissListener(this);
        this.f13003k.sendEmptyMessageDelayed(0, 3000L);
    }

    /* renamed from: a */
    public void m28466a(int i, boolean z, String str) {
        m28467a(i, z);
        if (z) {
            this.f12996d.setVisibility(8);
            return;
        }
        this.f12996d.setVisibility(0);
        this.f12996d.setText(str);
    }

    /* renamed from: a */
    public boolean m28468a() {
        return this.f12999g != null && this.f12999g.isShowing();
    }

    /* renamed from: b */
    public void m28464b(int i) {
        if (this.f12999g == null || this.f12994b == null || this.f13001i == i) {
            return;
        }
        this.f13002j = true;
        this.f12994b.setProgressAndInvalidate(i);
    }

    @Override // com.fimi.soul.view.marknumberprogress.AbstractC3290b
    /* renamed from: b */
    public void mo28461b(int i, int i2) {
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public void onDismiss() {
        this.f13003k.removeMessages(0);
    }
}
