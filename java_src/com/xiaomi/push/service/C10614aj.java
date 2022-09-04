package com.xiaomi.push.service;

import com.xiaomi.xmpush.thrift.EnumC10807f;
import com.xiaomi.xmpush.thrift.EnumC10808g;
/* renamed from: com.xiaomi.push.service.aj */
/* loaded from: classes2.dex */
/* synthetic */ class C10614aj {

    /* renamed from: a */
    static final /* synthetic */ int[] f32991a;

    /* renamed from: b */
    static final /* synthetic */ int[] f32992b = new int[EnumC10808g.values().length];

    static {
        try {
            f32992b[EnumC10808g.INT.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
        }
        try {
            f32992b[EnumC10808g.LONG.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
        }
        try {
            f32992b[EnumC10808g.STRING.ordinal()] = 3;
        } catch (NoSuchFieldError e3) {
        }
        try {
            f32992b[EnumC10808g.BOOLEAN.ordinal()] = 4;
        } catch (NoSuchFieldError e4) {
        }
        f32991a = new int[EnumC10807f.values().length];
        try {
            f32991a[EnumC10807f.MISC_CONFIG.ordinal()] = 1;
        } catch (NoSuchFieldError e5) {
        }
        try {
            f32991a[EnumC10807f.PLUGIN_CONFIG.ordinal()] = 2;
        } catch (NoSuchFieldError e6) {
        }
    }
}
