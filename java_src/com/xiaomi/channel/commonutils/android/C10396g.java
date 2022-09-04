package com.xiaomi.channel.commonutils.android;

import android.os.Environment;
import com.xiaomi.channel.commonutils.file.C10400a;
import com.xiaomi.channel.commonutils.logger.AbstractC10404b;
import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;
/* renamed from: com.xiaomi.channel.commonutils.android.g */
/* loaded from: classes2.dex */
public class C10396g {

    /* renamed from: a */
    private static int f32325a = 0;

    /* renamed from: a */
    public static synchronized boolean m5303a() {
        boolean z = true;
        synchronized (C10396g.class) {
            if (m5301c() != 1) {
                z = false;
            }
        }
        return z;
    }

    /* renamed from: b */
    public static synchronized boolean m5302b() {
        boolean z;
        synchronized (C10396g.class) {
            z = m5301c() == 2;
        }
        return z;
    }

    /* renamed from: c */
    public static synchronized int m5301c() {
        FileInputStream fileInputStream;
        Properties properties;
        int i = 1;
        synchronized (C10396g.class) {
            if (f32325a == 0) {
                try {
                    properties = new Properties();
                    fileInputStream = new FileInputStream(new File(Environment.getRootDirectory(), "build.prop"));
                } catch (Throwable th) {
                    th = th;
                    fileInputStream = null;
                }
                try {
                    properties.load(fileInputStream);
                    if (!((properties.getProperty("ro.miui.ui.version.code", null) == null && properties.getProperty("ro.miui.ui.version.name", null) == null) ? false : true)) {
                        i = 2;
                    }
                    f32325a = i;
                    C10400a.m5287a(fileInputStream);
                } catch (Throwable th2) {
                    th = th2;
                    AbstractC10404b.m5268a("get isMIUI failed", th);
                    f32325a = 0;
                    C10400a.m5287a(fileInputStream);
                    AbstractC10404b.m5266b("isMIUI's value is: " + f32325a);
                    return f32325a;
                }
                AbstractC10404b.m5266b("isMIUI's value is: " + f32325a);
            }
        }
        return f32325a;
    }
}
