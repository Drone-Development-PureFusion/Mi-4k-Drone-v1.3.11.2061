package com.fimi.soul.utils;

import android.os.Environment;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
/* renamed from: com.fimi.soul.utils.v */
/* loaded from: classes.dex */
public class C3143v {
    /* renamed from: a */
    public static String m29020a() {
        return new SimpleDateFormat("yyyy-MM-dd HH-mm-ss", Locale.US).format(new Date());
    }

    /* renamed from: b */
    public static boolean m29019b() {
        return "mounted".equals(Environment.getExternalStorageState());
    }
}
