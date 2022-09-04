package com.fimi.soul.module.update;

import android.app.Activity;
import android.app.Fragment;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.fimi.overseas.soul.C1704R;
import com.fimi.soul.utils.C3103au;
/* loaded from: classes.dex */
public class UpdateConnectDefeaFrgment extends Fragment implements View.OnClickListener {

    /* renamed from: b */
    private Button f11108b;

    /* renamed from: c */
    private Button f11109c;

    /* renamed from: d */
    private Button f11110d;

    /* renamed from: e */
    private ImageView f11111e;

    /* renamed from: f */
    private TextView f11112f;

    /* renamed from: g */
    private TextView f11113g;

    /* renamed from: h */
    private Context f11114h;

    /* renamed from: i */
    private String f11115i;

    /* renamed from: j */
    private String f11116j;

    /* renamed from: k */
    private String f11117k;

    /* renamed from: n */
    private AbstractC3008a f11120n;

    /* renamed from: l */
    private boolean f11118l = false;

    /* renamed from: m */
    private boolean f11119m = false;

    /* renamed from: o */
    private boolean f11121o = false;

    /* renamed from: a */
    Handler f11107a = new Handler() { // from class: com.fimi.soul.module.update.UpdateConnectDefeaFrgment.1
        @Override // android.os.Handler
        public void handleMessage(Message message) {
            super.handleMessage(message);
            UpdateConnectDefeaFrgment.this.f11120n.mo29679g();
        }
    };

    /* renamed from: com.fimi.soul.module.update.UpdateConnectDefeaFrgment$a */
    /* loaded from: classes.dex */
    public interface AbstractC3008a {
        /* renamed from: g */
        void mo29679g();

        /* renamed from: h */
        void mo29678h();
    }

    /* renamed from: a */
    private void m29687a() {
        this.f11111e.startAnimation(AnimationUtils.loadAnimation(this.f11114h, C1704R.anim.update_connect_defea_scale));
        Animation loadAnimation = AnimationUtils.loadAnimation(this.f11114h, C1704R.anim.update_connect_defea_alpha_trans);
        loadAnimation.setStartOffset(350L);
        this.f11112f.startAnimation(loadAnimation);
        Animation loadAnimation2 = AnimationUtils.loadAnimation(this.f11114h, C1704R.anim.update_connect_defea_alpha_trans);
        loadAnimation2.setStartOffset(400L);
        this.f11113g.startAnimation(loadAnimation2);
        Animation loadAnimation3 = AnimationUtils.loadAnimation(this.f11114h, C1704R.anim.update_connect_defea_alpha_trans);
        loadAnimation3.setStartOffset(450L);
        this.f11108b.startAnimation(loadAnimation3);
        this.f11109c.startAnimation(loadAnimation3);
    }

    /* renamed from: a */
    public void m29685a(String str) {
        this.f11116j = str;
    }

    /* renamed from: a */
    public void m29684a(boolean z) {
        this.f11119m = z;
    }

    /* renamed from: b */
    public void m29683b(String str) {
        this.f11115i = str;
    }

    /* renamed from: b */
    public void m29682b(boolean z) {
        this.f11121o = z;
    }

    /* renamed from: c */
    public void m29681c(String str) {
        this.f11117k = str;
    }

    /* renamed from: c */
    public void m29680c(boolean z) {
        this.f11118l = z;
    }

    @Override // android.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        int i = 0;
        super.onActivityCreated(bundle);
        this.f11113g.setText(this.f11116j);
        this.f11112f.setText(this.f11115i);
        this.f11108b.setText(this.f11117k);
        if (this.f11119m) {
            this.f11107a.sendEmptyMessageDelayed(0, 2000L);
            this.f11111e.setBackgroundResource(C1704R.C1705drawable.newbie_finish_icon);
        }
        if (this.f11121o) {
            this.f11109c.setVisibility(0);
            this.f11109c.setText(getString(C1704R.C1707string.begincalibration));
            this.f11108b.setVisibility(0);
            this.f11108b.setText(getString(C1704R.C1707string.ignore));
            this.f11110d.setVisibility(8);
            return;
        }
        this.f11109c.setVisibility((this.f11118l || this.f11119m) ? 8 : 0);
        this.f11108b.setVisibility((this.f11118l || this.f11119m) ? 8 : 0);
        Button button = this.f11110d;
        if (!this.f11118l || this.f11119m) {
            i = 8;
        }
        button.setVisibility(i);
    }

    @Override // android.app.Fragment
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        this.f11114h = activity;
        this.f11120n = (AbstractC3008a) activity;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        switch (view.getId()) {
            case C1704R.C1706id.retry_btn /* 2131755262 */:
                this.f11120n.mo29678h();
                return;
            case C1704R.C1706id.noconnect_bt /* 2131755425 */:
                this.f11120n.mo29679g();
                return;
            case C1704R.C1706id.ignore_bt /* 2131755426 */:
                this.f11120n.mo29679g();
                return;
            default:
                return;
        }
    }

    @Override // android.app.Fragment
    @Nullable
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(C1704R.layout.activity_update_connect_defea, viewGroup, false);
        this.f11112f = (TextView) inflate.findViewById(C1704R.C1706id.update_fail_tv);
        this.f11113g = (TextView) inflate.findViewById(C1704R.C1706id.fail_reason);
        this.f11111e = (ImageView) inflate.findViewById(C1704R.C1706id.connect_defeat_iv);
        this.f11108b = (Button) inflate.findViewById(C1704R.C1706id.noconnect_bt);
        this.f11109c = (Button) inflate.findViewById(C1704R.C1706id.retry_btn);
        this.f11110d = (Button) inflate.findViewById(C1704R.C1706id.ignore_bt);
        this.f11108b.setOnClickListener(this);
        this.f11109c.setOnClickListener(this);
        this.f11110d.setOnClickListener(this);
        m29687a();
        C3103au.m29232a(this.f11114h.getAssets(), this.f11112f, this.f11113g, this.f11109c, this.f11108b);
        return inflate;
    }
}
