package com.tencent.stat;

import android.content.Context;
import android.os.Environment;
import android.provider.Settings;
import com.tencent.stat.common.C10339d;
import com.tencent.stat.common.C10346k;
import com.tencent.stat.common.C10351p;
import com.tencent.stat.common.StatLogger;
import com.xiaomi.mipush.sdk.Constants;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
/* renamed from: com.tencent.stat.a */
/* loaded from: classes2.dex */
public class C10322a {

    /* renamed from: b */
    private static C10322a f32155b = null;

    /* renamed from: a */
    private StatLogger f32156a = C10346k.m5425b();

    /* renamed from: c */
    private boolean f32157c;

    /* renamed from: d */
    private boolean f32158d;

    /* renamed from: e */
    private boolean f32159e;

    /* renamed from: f */
    private Context f32160f;

    private C10322a(Context context) {
        this.f32157c = false;
        this.f32158d = false;
        this.f32159e = false;
        this.f32160f = null;
        this.f32160f = context.getApplicationContext();
        this.f32157c = m5488b(context);
        this.f32158d = m5484d(context);
        this.f32159e = m5486c(context);
    }

    /* renamed from: a */
    public static synchronized C10322a m5490a(Context context) {
        C10322a c10322a;
        synchronized (C10322a.class) {
            if (f32155b == null) {
                f32155b = new C10322a(context);
            }
            c10322a = f32155b;
        }
        return c10322a;
    }

    /* renamed from: b */
    private boolean m5488b(Context context) {
        if (!C10346k.m5430a(context, "android.permission.WRITE_EXTERNAL_STORAGE")) {
            this.f32156a.m5464e("Check permission failed: android.permission.WRITE_EXTERNAL_STORAGE");
            return false;
        }
        return true;
    }

    /* renamed from: c */
    private boolean m5486c(Context context) {
        if (!C10346k.m5430a(context, "android.permission.WRITE_SETTINGS")) {
            this.f32156a.m5464e("Check permission failed: android.permission.WRITE_SETTINGS");
            return false;
        }
        return true;
    }

    /* renamed from: d */
    private boolean m5484d(Context context) {
        if (C10346k.m5418d() < 14) {
            return m5488b(context);
        }
        return true;
    }

    /* renamed from: a */
    public boolean m5489a(String str, String str2) {
        C10351p.m5377b(this.f32160f, str, str2);
        return true;
    }

    /* renamed from: b */
    public String m5487b(String str, String str2) {
        return C10351p.m5380a(this.f32160f, str, str2);
    }

    /* renamed from: c */
    public boolean m5485c(String str, String str2) {
        if (!this.f32157c) {
            return false;
        }
        try {
            C10339d.m5455a(Environment.getExternalStorageDirectory() + "/Tencent/mta");
            File file = new File(Environment.getExternalStorageDirectory(), "Tencent/mta/.mid.txt");
            if (file != null) {
                BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file));
                bufferedWriter.write(str + Constants.ACCEPT_TIME_SEPARATOR_SP + str2);
                bufferedWriter.write("\n");
                bufferedWriter.close();
            }
            return true;
        } catch (Throwable th) {
            this.f32156a.m5461w(th);
            return false;
        }
    }

    /* renamed from: d */
    public String m5483d(String str, String str2) {
        if (!this.f32157c) {
            return null;
        }
        try {
            File file = new File(Environment.getExternalStorageDirectory(), "Tencent/mta/.mid.txt");
            if (file != null) {
                for (String str3 : C10339d.m5456a(file)) {
                    String[] split = str3.split(Constants.ACCEPT_TIME_SEPARATOR_SP);
                    if (split.length == 2 && split[0].equals(str)) {
                        return split[1];
                    }
                }
            }
        } catch (FileNotFoundException e) {
            this.f32156a.m5461w("Tencent/mta/.mid.txt not found.");
        } catch (Throwable th) {
            this.f32156a.m5461w(th);
        }
        return null;
    }

    /* renamed from: e */
    public boolean m5482e(String str, String str2) {
        if (!this.f32159e) {
            return false;
        }
        Settings.System.putString(this.f32160f.getContentResolver(), str, str2);
        return true;
    }

    /* renamed from: f */
    public String m5481f(String str, String str2) {
        return !this.f32159e ? str2 : Settings.System.getString(this.f32160f.getContentResolver(), str);
    }
}
