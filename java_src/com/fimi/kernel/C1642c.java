package com.fimi.kernel;

import android.app.Activity;
import android.content.Context;
import com.fimi.kernel.p158b.C1620c;
import com.fimi.kernel.p158b.EnumC1626d;
import com.fimi.kernel.p164c.AbstractC1643a;
import com.fimi.kernel.p164c.C1645c;
import com.fimi.kernel.utils.C1681v;
import com.fimi.kernel.view.AbstractC1692b;
import com.fimi.kernel.view.C1696c;
/* renamed from: com.fimi.kernel.c */
/* loaded from: classes.dex */
public final class C1642c {

    /* renamed from: a */
    private static Context f4051a = null;

    /* renamed from: b */
    private static Activity f4052b = null;

    /* renamed from: c */
    private static String f4053c = null;

    private C1642c() {
    }

    /* renamed from: a */
    public static Context m34893a() {
        return f4051a;
    }

    /* renamed from: a */
    public static <T> T m34890a(EnumC1626d enumC1626d) {
        return (T) C1620c.m34954a(enumC1626d);
    }

    /* renamed from: a */
    public static void m34892a(Activity activity) {
        f4052b = null;
        f4052b = activity;
        f4053c = f4052b.getClass().getName();
    }

    /* renamed from: a */
    public static void m34891a(Context context) {
        f4051a = context;
    }

    /* renamed from: b */
    public static AbstractC1692b m34889b() {
        return C1696c.m34418a();
    }

    /* renamed from: b */
    public static void m34888b(Activity activity) {
        if (activity.getClass().getName().equals(f4053c)) {
            f4052b = null;
            f4053c = null;
        }
    }

    /* renamed from: c */
    public static AbstractC1643a m34887c() {
        return C1645c.m34884a();
    }

    /* renamed from: d */
    public static Activity m34886d() {
        return f4052b;
    }

    /* renamed from: e */
    public static C1681v m34885e() {
        return C1681v.m34543a(m34893a());
    }
}
