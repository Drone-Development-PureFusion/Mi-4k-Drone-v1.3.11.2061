package com.fimi.soul.module.update;

import android.app.Activity;
import android.app.Fragment;
import android.content.Context;
import android.content.Intent;
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
import com.fimi.soul.module.droneui.FlightActivity;
import com.fimi.soul.utils.C3103au;
/* loaded from: classes.dex */
public class AutoSelfErrorFrgment extends Fragment {

    /* renamed from: n */
    private static int f10977n = 0;

    /* renamed from: b */
    private Button f10979b;

    /* renamed from: c */
    private Button f10980c;

    /* renamed from: d */
    private Button f10981d;

    /* renamed from: e */
    private ImageView f10982e;

    /* renamed from: f */
    private TextView f10983f;

    /* renamed from: g */
    private TextView f10984g;

    /* renamed from: h */
    private Context f10985h;

    /* renamed from: i */
    private String f10986i;

    /* renamed from: j */
    private String f10987j;

    /* renamed from: k */
    private String f10988k;

    /* renamed from: l */
    private boolean f10989l = false;

    /* renamed from: m */
    private boolean f10990m = false;

    /* renamed from: a */
    Handler f10978a = new Handler() { // from class: com.fimi.soul.module.update.AutoSelfErrorFrgment.1
        @Override // android.os.Handler
        public void handleMessage(Message message) {
            super.handleMessage(message);
            if (AutoSelfErrorFrgment.this.getActivity() != null) {
                AutoSelfErrorFrgment.this.startActivity(new Intent(AutoSelfErrorFrgment.this.getActivity(), FlightActivity.class));
                AutoSelfErrorFrgment.this.getActivity().finish();
            }
        }
    };

    /* renamed from: a */
    private void m29747a() {
        this.f10982e.startAnimation(AnimationUtils.loadAnimation(this.f10985h, C1704R.anim.update_connect_defea_scale));
        Animation loadAnimation = AnimationUtils.loadAnimation(this.f10985h, C1704R.anim.update_connect_defea_alpha_trans);
        loadAnimation.setStartOffset(350L);
        this.f10983f.startAnimation(loadAnimation);
        Animation loadAnimation2 = AnimationUtils.loadAnimation(this.f10985h, C1704R.anim.update_connect_defea_alpha_trans);
        loadAnimation2.setStartOffset(400L);
        this.f10984g.startAnimation(loadAnimation2);
        Animation loadAnimation3 = AnimationUtils.loadAnimation(this.f10985h, C1704R.anim.update_connect_defea_alpha_trans);
        loadAnimation3.setStartOffset(450L);
        this.f10979b.startAnimation(loadAnimation3);
        this.f10980c.startAnimation(loadAnimation3);
    }

    /* renamed from: a */
    public void m29746a(String str) {
        this.f10987j = str;
    }

    /* renamed from: a */
    public void m29745a(boolean z) {
        this.f10990m = z;
    }

    /* renamed from: b */
    public void m29744b(String str) {
        this.f10986i = str;
    }

    /* renamed from: b */
    public void m29743b(boolean z) {
        this.f10989l = z;
    }

    /* renamed from: c */
    public void m29742c(String str) {
        this.f10988k = str;
    }

    @Override // android.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        int i = 0;
        super.onActivityCreated(bundle);
        this.f10984g.setText(this.f10987j);
        this.f10983f.setText(this.f10986i);
        this.f10979b.setText(this.f10988k);
        if (this.f10990m) {
            this.f10978a.sendEmptyMessageDelayed(f10977n, 2000L);
            this.f10982e.setBackgroundResource(C1704R.C1705drawable.newbie_finish_icon);
        }
        this.f10980c.setVisibility((this.f10989l || this.f10990m) ? 8 : 0);
        this.f10979b.setVisibility((this.f10989l || this.f10990m) ? 8 : 0);
        Button button = this.f10981d;
        if (!this.f10989l || this.f10990m) {
            i = 8;
        }
        button.setVisibility(i);
    }

    @Override // android.app.Fragment
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        this.f10985h = activity;
    }

    @Override // android.app.Fragment
    @Nullable
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(C1704R.layout.activity_update_connect_defea, viewGroup, false);
        this.f10983f = (TextView) inflate.findViewById(C1704R.C1706id.update_fail_tv);
        this.f10984g = (TextView) inflate.findViewById(C1704R.C1706id.fail_reason);
        this.f10982e = (ImageView) inflate.findViewById(C1704R.C1706id.connect_defeat_iv);
        this.f10979b = (Button) inflate.findViewById(C1704R.C1706id.noconnect_bt);
        this.f10980c = (Button) inflate.findViewById(C1704R.C1706id.retry_btn);
        this.f10981d = (Button) inflate.findViewById(C1704R.C1706id.ignore_bt);
        m29747a();
        C3103au.m29232a(this.f10985h.getAssets(), this.f10983f, this.f10984g, this.f10980c, this.f10979b);
        return inflate;
    }

    @Override // android.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        this.f10978a.removeMessages(f10977n);
    }
}
