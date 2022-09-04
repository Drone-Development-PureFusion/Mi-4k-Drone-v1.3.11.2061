package com.fimi.soul.utils;

import com.xiaomi.mipush.sdk.Constants;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
/* renamed from: com.fimi.soul.utils.x */
/* loaded from: classes.dex */
public class C3152x {
    /* renamed from: a */
    public static FileOutputStream m29009a() {
        File file = new File(C3129m.m29067b());
        file.mkdirs();
        File file2 = new File(file, "Parameters-" + C3143v.m29020a() + ".param");
        if (file2.exists()) {
            file2.delete();
        }
        return new FileOutputStream(file2);
    }

    /* renamed from: a */
    public static FileOutputStream m29008a(String str) {
        File file = new File(C3129m.m29064c());
        file.mkdirs();
        File file2 = new File(file, str + Constants.ACCEPT_TIME_SEPARATOR_SERVER + C3143v.m29020a() + ".txt");
        if (file2.exists()) {
            file2.delete();
        }
        return new FileOutputStream(file2);
    }

    /* renamed from: b */
    public static FileOutputStream m29007b() {
        File file = new File(C3129m.m29059h());
        file.mkdirs();
        File file2 = new File(file, C3143v.m29020a() + ".txt");
        if (file2.exists()) {
            file2.delete();
        }
        return new FileOutputStream(file2);
    }

    /* renamed from: c */
    public static BufferedOutputStream m29006c() {
        File file = new File(C3129m.m29062e());
        file.mkdirs();
        File file2 = new File(file, C3143v.m29020a() + ".tlog");
        if (file2.exists()) {
            file2.delete();
        }
        return new BufferedOutputStream(new FileOutputStream(file2));
    }

    /* renamed from: d */
    public static void m29005d() {
        File file = new File(C3129m.m29061f());
        file.mkdirs();
        new File(file, ".nomedia").createNewFile();
    }
}
