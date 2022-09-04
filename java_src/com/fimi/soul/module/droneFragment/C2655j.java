package com.fimi.soul.module.droneFragment;

import android.view.View;
import android.widget.ImageView;
import com.fimi.overseas.soul.C1704R;
import com.fimi.soul.biz.camera.C1831e;
/* renamed from: com.fimi.soul.module.droneFragment.j */
/* loaded from: classes.dex */
public class C2655j {

    /* renamed from: a */
    private String f8930a = C1831e.m33974d();

    /* renamed from: b */
    private ImageView f8931b;

    /* renamed from: c */
    private ImageView f8932c;

    public C2655j(View view) {
        this.f8931b = (ImageView) view.findViewById(C1704R.C1706id.targeImage);
        this.f8932c = (ImageView) view.findViewById(C1704R.C1706id.control_cantairn);
    }

    /* renamed from: a */
    public void m30853a() {
        this.f8931b.setVisibility(8);
        this.f8932c.setVisibility(0);
    }

    /* renamed from: b */
    public void m30852b() {
        this.f8932c.setVisibility(8);
    }
}
