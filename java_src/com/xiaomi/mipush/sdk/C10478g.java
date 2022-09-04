package com.xiaomi.mipush.sdk;

import android.content.Context;
import com.google.firebase.p253b.C9755a;
import com.xiaomi.metok.geofencing.C10462a;
import com.xiaomi.xmpush.thrift.C10812j;
import com.xiaomi.xmpush.thrift.C10815l;
/* renamed from: com.xiaomi.mipush.sdk.g */
/* loaded from: classes2.dex */
public class C10478g {

    /* renamed from: a */
    private final int f32569a = -1;

    /* renamed from: b */
    private final double f32570b = C9755a.f30449c;

    /* renamed from: c */
    private C10462a f32571c;

    /* renamed from: d */
    private Context f32572d;

    public C10478g(Context context) {
        this.f32572d = context;
        m4985a();
    }

    /* renamed from: a */
    private void m4985a() {
        this.f32571c = new C10462a(this.f32572d);
    }

    /* renamed from: a */
    public void m4983a(String str) {
        this.f32571c.m5061a(this.f32572d, "com.xiaomi.xmsf", str);
    }

    /* renamed from: a */
    public boolean m4984a(C10812j c10812j) {
        if (c10812j == null) {
            return false;
        }
        if (c10812j.m3390m() != null && c10812j.m3388o() > C9755a.f30449c) {
            C10815l m3390m = c10812j.m3390m();
            this.f32571c.m5062a(this.f32572d, m3390m.m3370c(), m3390m.m3378a(), (float) c10812j.m3388o(), -1L, "com.xiaomi.xmsf", c10812j.m3417a(), c10812j.m3384s().name());
        }
        return true;
    }
}
