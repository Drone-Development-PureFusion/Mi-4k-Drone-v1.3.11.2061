package com.tencent.map.p260a.p261a;

import android.content.Context;
import com.tencent.map.p262b.C10172f;
/* renamed from: com.tencent.map.a.a.a */
/* loaded from: classes2.dex */
public class C10151a {

    /* renamed from: a */
    private static C10172f f31316a = C10172f.m5995a();

    /* renamed from: b */
    private static C10151a f31317b;

    /* renamed from: a */
    public static synchronized C10151a m6052a() {
        C10151a c10151a;
        synchronized (C10151a.class) {
            if (f31317b == null) {
                f31317b = new C10151a();
            }
            c10151a = f31317b;
        }
        return c10151a;
    }

    /* renamed from: a */
    public boolean m6051a(Context context, C10152b c10152b) {
        return f31316a.m5992a(context, c10152b);
    }

    /* renamed from: a */
    public boolean m6050a(String str, String str2) {
        return f31316a.m5978a(str, str2);
    }

    /* renamed from: b */
    public void m6049b() {
        f31316a.m5975b();
    }
}
