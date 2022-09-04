package com.fimi.soul.module.setting;

import android.content.Context;
import android.view.View;
import com.fimi.overseas.soul.C1704R;
import com.fimi.soul.biz.camera.entity.X11RespCmd;
import com.fimi.soul.drone.C2083a;
/* renamed from: com.fimi.soul.module.setting.b */
/* loaded from: classes.dex */
public class C2902b extends AbstractC2900a {

    /* renamed from: a */
    C2083a f10376a;

    public C2902b(Context context, C2083a c2083a) {
        super(context);
        this.f10376a = c2083a;
    }

    /* renamed from: g */
    private void m30024g() {
        a(C1704R.C1707string.follow_mode, "", new View.OnClickListener() { // from class: com.fimi.soul.module.setting.b.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
            }
        });
        a(C1704R.C1707string.follow_sensitivity, "", (View.OnClickListener) null);
        a(C1704R.C1707string.follow_dead_zone, "", (View.OnClickListener) null);
        a(C1704R.C1707string.work_mode, "", (View.OnClickListener) null);
        a(C1704R.C1707string.angle_limit, "", (View.OnClickListener) null);
        a(C1704R.C1707string.platform_correct, "", (View.OnClickListener) null);
        a(C1704R.C1707string.cloud_platform_upgrade, "", (View.OnClickListener) null);
    }

    @Override // com.fimi.soul.biz.camera.p173b.AbstractC1792f
    /* renamed from: a  reason: avoid collision after fix types in other method */
    public void mo28055a(boolean z, X11RespCmd x11RespCmd) {
    }

    @Override // com.fimi.soul.module.setting.AbstractC2900a
    /* renamed from: c */
    public View mo30019c() {
        m30024g();
        return b();
    }
}
