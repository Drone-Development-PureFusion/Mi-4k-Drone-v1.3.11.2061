package com.p120c.p121a.p138c;

import android.content.Context;
import android.os.Environment;
import com.facebook.common.util.UriUtil;
import com.fimi.kernel.C1576a;
import java.io.File;
import java.io.IOException;
/* renamed from: com.c.a.c.f */
/* loaded from: classes.dex */
public final class C1359f {

    /* renamed from: a */
    private static final String f3537a = "android.permission.WRITE_EXTERNAL_STORAGE";

    /* renamed from: b */
    private static final String f3538b = "uil-images";

    private C1359f() {
    }

    /* renamed from: a */
    public static File m35597a(Context context) {
        return m35594a(context, true);
    }

    /* renamed from: a */
    public static File m35596a(Context context, String str) {
        File m35597a = m35597a(context);
        File file = new File(m35597a, str);
        return (file.exists() || file.mkdir()) ? file : m35597a;
    }

    /* renamed from: a */
    public static File m35595a(Context context, String str, boolean z) {
        File file = null;
        if (z && "mounted".equals(Environment.getExternalStorageState()) && m35590d(context)) {
            file = new File(Environment.getExternalStorageDirectory(), str);
        }
        return (file == null || (!file.exists() && !file.mkdirs())) ? context.getCacheDir() : file;
    }

    /* renamed from: a */
    public static File m35594a(Context context, boolean z) {
        String str;
        File file = null;
        try {
            str = Environment.getExternalStorageState();
        } catch (IncompatibleClassChangeError e) {
            str = "";
        } catch (NullPointerException e2) {
            str = "";
        }
        if (z && "mounted".equals(str) && m35590d(context)) {
            file = m35591c(context);
        }
        if (file == null) {
            file = context.getCacheDir();
        }
        if (file == null) {
            String str2 = "/data/data/" + context.getPackageName() + "/cache/";
            C1356d.m35605c("Can't define system cache directory! '%s' will be used.", str2);
            return new File(str2);
        }
        return file;
    }

    /* renamed from: b */
    public static File m35593b(Context context) {
        return m35596a(context, f3538b);
    }

    /* renamed from: b */
    public static File m35592b(Context context, String str) {
        File file = null;
        if ("mounted".equals(Environment.getExternalStorageState()) && m35590d(context)) {
            file = new File(Environment.getExternalStorageDirectory(), str);
        }
        return (file == null || (!file.exists() && !file.mkdirs())) ? context.getCacheDir() : file;
    }

    /* renamed from: c */
    private static File m35591c(Context context) {
        File file = new File(new File(new File(new File(Environment.getExternalStorageDirectory(), "Android"), UriUtil.DATA_SCHEME), context.getPackageName()), C1576a.f3874d);
        if (!file.exists()) {
            if (!file.mkdirs()) {
                C1356d.m35605c("Unable to create external cache directory", new Object[0]);
                return null;
            }
            try {
                new File(file, ".nomedia").createNewFile();
                return file;
            } catch (IOException e) {
                C1356d.m35607b("Can't create \".nomedia\" file in application external cache directory", new Object[0]);
                return file;
            }
        }
        return file;
    }

    /* renamed from: d */
    private static boolean m35590d(Context context) {
        return context.checkCallingOrSelfPermission(f3537a) == 0;
    }
}
