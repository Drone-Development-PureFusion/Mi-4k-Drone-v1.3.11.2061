package com.fimi.soul.module.droneFragment;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import com.fimi.overseas.soul.C1704R;
import com.fimi.soul.biz.camera.C1831e;
/* renamed from: com.fimi.soul.module.droneFragment.h */
/* loaded from: classes.dex */
public class C2653h {

    /* renamed from: a */
    private View f8920a;

    /* renamed from: b */
    private String f8921b = C1831e.m33974d();

    /* renamed from: c */
    private ImageView f8922c;

    /* renamed from: d */
    private Context f8923d;

    public C2653h(View view, Context context) {
        this.f8920a = view;
        this.f8922c = (ImageView) view.findViewById(C1704R.C1706id.targeImage);
        this.f8923d = context;
    }

    /* renamed from: c */
    private void m30862c() {
    }

    /* renamed from: a */
    public void m30864a() {
        m30862c();
    }

    /* renamed from: b */
    public void m30863b() {
        this.f8922c.setVisibility(8);
    }
}
