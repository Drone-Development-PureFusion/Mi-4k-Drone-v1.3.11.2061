package com.fimi.soul.biz.p176d;

import android.content.Context;
import com.fimi.kernel.utils.C1681v;
import com.tencent.p263mm.sdk.plugin.MMPluginProviderConstants;
/* renamed from: com.fimi.soul.biz.d.a */
/* loaded from: classes.dex */
public class C1833a {
    /* renamed from: a */
    public static String m33971a(Context context, int i) {
        return m33965d(context, i).m34514h("macAlgorithm");
    }

    /* renamed from: a */
    public static void m33970a(Context context, int i, String str) {
        m33965d(context, i).m34540a("macAlgorithm", str);
    }

    /* renamed from: b */
    public static String m33969b(Context context, int i) {
        return m33965d(context, i).m34514h("mackey");
    }

    /* renamed from: b */
    public static void m33968b(Context context, int i, String str) {
        m33965d(context, i).m34540a("mackey", str);
    }

    /* renamed from: c */
    public static String m33967c(Context context, int i) {
        return m33965d(context, i).m34514h(MMPluginProviderConstants.OAuth.ACCESS_TOKEN);
    }

    /* renamed from: c */
    public static void m33966c(Context context, int i, String str) {
        m33965d(context, i).m34540a(MMPluginProviderConstants.OAuth.ACCESS_TOKEN, str);
    }

    /* renamed from: d */
    private static C1681v m33965d(Context context, int i) {
        return C1681v.m34543a(context);
    }
}
