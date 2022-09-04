package com.tencent.stat.common;

import java.io.File;
/* renamed from: com.tencent.stat.common.o */
/* loaded from: classes2.dex */
class C10350o {

    /* renamed from: a */
    private static int f32265a = -1;

    /* renamed from: a */
    public static boolean m5384a() {
        if (f32265a == 1) {
            return true;
        }
        if (f32265a == 0) {
            return false;
        }
        String[] strArr = {"/bin", "/system/bin/", "/system/xbin/", "/system/sbin/", "/sbin/", "/vendor/bin/"};
        for (int i = 0; i < strArr.length; i++) {
            try {
                File file = new File(strArr[i] + "su");
                if (file != null && file.exists()) {
                    f32265a = 1;
                    return true;
                }
            } catch (Exception e) {
            }
        }
        f32265a = 0;
        return false;
    }
}
