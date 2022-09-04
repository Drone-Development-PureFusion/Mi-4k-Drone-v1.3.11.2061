package com.fimi.soul.module.p209b.p210a.p211a.p212a;

import com.fimi.soul.module.p209b.AbstractC2513e;
import com.fimi.soul.module.p209b.p210a.p211a.AbstractC2502i;
import com.fimi.soul.module.p209b.p210a.p211a.AbstractView$OnClickListenerC2507j;
import java.util.ArrayList;
/* renamed from: com.fimi.soul.module.b.a.a.a.d */
/* loaded from: classes.dex */
public class C2483d extends AbstractC2502i {
    public C2483d(AbstractC2513e abstractC2513e) {
        super(abstractC2513e);
    }

    @Override // com.fimi.soul.module.p209b.p210a.p211a.AbstractC2502i
    /* renamed from: a */
    protected AbstractView$OnClickListenerC2507j mo31488a(ArrayList<Object> arrayList) {
        return new C2482c(this, arrayList);
    }

    @Override // com.fimi.soul.module.p209b.p210a.p211a.AbstractC2502i, com.mob.tools.FakeActivity
    public void onCreate() {
        requestLandscapeOrientation();
        super.onCreate();
    }
}
