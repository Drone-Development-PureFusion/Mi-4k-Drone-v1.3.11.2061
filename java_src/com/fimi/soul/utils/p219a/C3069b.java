package com.fimi.soul.utils.p219a;

import android.content.Context;
import com.fimi.kernel.C1642c;
import com.fimi.kernel.utils.C1688z;
import com.fimi.overseas.soul.C1704R;
import com.fimi.soul.drone.C2083a;
import com.fimi.soul.module.update.C3029b;
import com.fimi.soul.module.update.p218a.C3022b;
/* renamed from: com.fimi.soul.utils.a.b */
/* loaded from: classes.dex */
public class C3069b {
    /* renamed from: a */
    public boolean m29395a(Context context, C2083a c2083a, int i) {
        if (!c2083a.mo32905ac()) {
            C1688z.m34447a(context, context.getString(C1704R.C1707string.front_lights_setting_no_connect), C1688z.f4191b);
            return false;
        }
        C3022b c3022b = (C3022b) C1642c.m34887c().mo34880a(C3029b.f11258C, C3022b.class);
        if (c3022b == null) {
            c3022b = new C3022b();
        }
        boolean z = c3022b != null && c3022b.m29604a() > 0 && c3022b.m29604a() >= i;
        if (z) {
            return z;
        }
        C1688z.m34447a(context, context.getString(C1704R.C1707string.fc_update_tip), C1688z.f4191b);
        return z;
    }

    /* renamed from: b */
    public boolean m29394b(Context context, C2083a c2083a, int i) {
        C3022b c3022b = (C3022b) C1642c.m34887c().mo34880a(C3029b.f11258C, C3022b.class);
        if (c3022b == null) {
            c3022b = new C3022b();
        }
        return c3022b != null && c3022b.m29604a() > 0 && c3022b.m29604a() >= i;
    }
}
