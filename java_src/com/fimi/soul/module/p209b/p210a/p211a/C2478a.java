package com.fimi.soul.module.p209b.p210a.p211a;

import android.content.Context;
import cn.sharesdk.framework.Platform;
import com.fimi.soul.module.p209b.AbstractC2513e;
import com.fimi.soul.module.p209b.p210a.p211a.p212a.C2483d;
import com.fimi.soul.module.p209b.p210a.p211a.p212a.View$OnClickListenerC2479a;
import com.fimi.soul.module.p209b.p210a.p211a.p213b.C2485a;
import com.fimi.soul.module.p209b.p210a.p211a.p213b.C2489d;
/* renamed from: com.fimi.soul.module.b.a.a.a */
/* loaded from: classes.dex */
public class C2478a extends AbstractC2513e {
    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.fimi.soul.module.p209b.AbstractC2513e
    /* renamed from: a */
    public void mo31419a(Context context, Platform platform, Platform.ShareParams shareParams) {
        View$OnClickListenerC2484b c2485a = context.getResources().getConfiguration().orientation == 1 ? new C2485a(this) : new View$OnClickListenerC2479a(this);
        c2485a.m31526d(platform);
        c2485a.m31529a(shareParams);
        c2485a.show(context, null);
    }

    @Override // com.fimi.soul.module.p209b.AbstractC2513e
    /* renamed from: b */
    protected void mo31411b(Context context) {
        (context.getResources().getConfiguration().orientation == 1 ? new C2489d(this) : new C2483d(this)).show(context, null);
    }
}
