package com.xiaomi.mistatistic.sdk;

import android.os.Build;
import android.os.StrictMode;
import com.xiaomi.mipush.sdk.Constants;
import com.xiaomi.mistatistic.sdk.controller.AbstractC10508a;
import com.xiaomi.mistatistic.sdk.controller.AbstractC10536q;
import com.xiaomi.mistatistic.sdk.controller.C10526g;
import com.xiaomi.mistatistic.sdk.controller.C10534o;
import com.xiaomi.mistatistic.sdk.controller.C10538s;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.Thread;
import java.util.ArrayList;
import org.apache.http.message.BasicNameValuePair;
/* renamed from: com.xiaomi.mistatistic.sdk.a */
/* loaded from: classes2.dex */
public class C10501a implements Thread.UncaughtExceptionHandler {

    /* renamed from: a */
    private static boolean f32617a = false;

    /* renamed from: b */
    private static int f32618b = 1;

    /* renamed from: c */
    private final Thread.UncaughtExceptionHandler f32619c;

    public C10501a() {
        this.f32619c = null;
    }

    public C10501a(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.f32619c = uncaughtExceptionHandler;
    }

    /* renamed from: a */
    public static void m4900a(int i) {
        f32618b = i;
    }

    /* renamed from: a */
    public static void m4899a(Throwable th) {
        if (!f32617a) {
            return;
        }
        if (th == null) {
            throw new IllegalArgumentException("the throwable is null.");
        }
        if (th.getStackTrace() == null || th.getStackTrace().length == 0) {
            return;
        }
        StringWriter stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter(stringWriter));
        String obj = stringWriter.toString();
        ArrayList arrayList = new ArrayList();
        arrayList.add(new BasicNameValuePair("app_id", AbstractC10508a.m4878b()));
        arrayList.add(new BasicNameValuePair("app_key", AbstractC10508a.m4877c()));
        arrayList.add(new BasicNameValuePair("device_uuid", C10526g.m4852a(AbstractC10508a.m4880a())));
        arrayList.add(new BasicNameValuePair("device_os", "Android " + Build.VERSION.SDK_INT));
        arrayList.add(new BasicNameValuePair("device_model", Build.MODEL));
        arrayList.add(new BasicNameValuePair(Constants.EXTRA_KEY_APP_VERSION, AbstractC10508a.m4875e()));
        arrayList.add(new BasicNameValuePair("app_channel", AbstractC10508a.m4876d()));
        arrayList.add(new BasicNameValuePair("app_start_time", String.valueOf(System.currentTimeMillis())));
        arrayList.add(new BasicNameValuePair("app_crash_time", String.valueOf(System.currentTimeMillis())));
        arrayList.add(new BasicNameValuePair("crash_exception_type", th.getClass().getName() + ":" + th.getMessage()));
        arrayList.add(new BasicNameValuePair("crash_exception_desc", th instanceof OutOfMemoryError ? "OutOfMemoryError" : obj));
        arrayList.add(new BasicNameValuePair("crash_callstack", obj));
        try {
            new C10534o().m4823a("upload the exception " + AbstractC10536q.m4820a(AbstractC10508a.m4880a(), BuildSetting.isTest() ? "http://10.99.168.145:8097/micrash" : "https://data.mistat.xiaomi.com/micrash", arrayList));
        } catch (IOException e) {
            new C10534o().m4822a("Error to upload the exception", e);
        }
    }

    /* renamed from: a */
    public static void m4898a(boolean z) {
        Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
        if (defaultUncaughtExceptionHandler instanceof C10501a) {
            return;
        }
        if (z) {
            defaultUncaughtExceptionHandler = null;
        }
        Thread.setDefaultUncaughtExceptionHandler(new C10501a(defaultUncaughtExceptionHandler));
        f32617a = true;
    }

    /* JADX WARN: Not initialized variable reg: 1, insn: 0x0061: MOVE  (r2 I:??[OBJECT, ARRAY]) = (r1 I:??[OBJECT, ARRAY]), block:B:38:0x0061 */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0031 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x005a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ArrayList m4897b() {
        ObjectInputStream objectInputStream;
        ObjectInputStream objectInputStream2;
        boolean z;
        ArrayList arrayList;
        File filesDir;
        ArrayList arrayList2;
        ArrayList arrayList3 = new ArrayList();
        ObjectInputStream objectInputStream3 = null;
        try {
            try {
                filesDir = AbstractC10508a.m4880a().getFilesDir();
            } catch (Throwable th) {
                th = th;
                objectInputStream3 = objectInputStream2;
                if (objectInputStream3 != null) {
                    try {
                        objectInputStream3.close();
                    } catch (IOException e) {
                    }
                }
                throw th;
            }
        } catch (Exception e2) {
            e = e2;
            objectInputStream = null;
        } catch (Throwable th2) {
            th = th2;
            if (objectInputStream3 != null) {
            }
            throw th;
        }
        if (filesDir != null) {
            File file = new File(filesDir, ".exception");
            if (file.isFile()) {
                objectInputStream = new ObjectInputStream(new FileInputStream(file));
                try {
                    arrayList2 = (ArrayList) objectInputStream.readObject();
                    objectInputStream3 = objectInputStream;
                    if (objectInputStream3 == null) {
                        try {
                            objectInputStream3.close();
                            arrayList = arrayList2;
                            z = false;
                        } catch (IOException e3) {
                            arrayList = arrayList2;
                            z = false;
                        }
                    } else {
                        arrayList = arrayList2;
                        z = false;
                    }
                } catch (Exception e4) {
                    e = e4;
                    new C10534o().m4822a("", e);
                    z = true;
                    if (objectInputStream != null) {
                        try {
                            objectInputStream.close();
                            arrayList = arrayList3;
                        } catch (IOException e5) {
                            arrayList = arrayList3;
                        }
                    } else {
                        arrayList = arrayList3;
                    }
                    if (z) {
                    }
                    return arrayList;
                }
                if (z) {
                    m4895c();
                }
                return arrayList;
            }
        }
        arrayList2 = arrayList3;
        if (objectInputStream3 == null) {
        }
        if (z) {
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0044 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.io.ObjectOutputStream] */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m4896b(Throwable th) {
        ArrayList m4897b = m4897b();
        m4897b.add(th);
        ObjectOutputStream size = m4897b.size();
        if (size > 5) {
            m4897b.remove(0);
        }
        try {
            try {
                size = new ObjectOutputStream(AbstractC10508a.m4880a().openFileOutput(".exception", 0));
                try {
                    size.writeObject(m4897b);
                    if (size == 0) {
                        return;
                    }
                    try {
                        size.close();
                    } catch (IOException e) {
                    }
                } catch (IOException e2) {
                    e = e2;
                    new C10534o().m4822a("", e);
                    if (size == 0) {
                        return;
                    }
                    try {
                        size.close();
                    } catch (IOException e3) {
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                if (size != 0) {
                    try {
                        size.close();
                    } catch (IOException e4) {
                    }
                }
                throw th;
            }
        } catch (IOException e5) {
            e = e5;
            size = 0;
        } catch (Throwable th3) {
            th = th3;
            size = 0;
            if (size != 0) {
            }
            throw th;
        }
    }

    /* renamed from: c */
    public static void m4895c() {
        new File(AbstractC10508a.m4880a().getFilesDir(), ".exception").delete();
    }

    /* renamed from: d */
    public static int m4894d() {
        return f32618b;
    }

    /* renamed from: a */
    public boolean m4901a() {
        if (System.currentTimeMillis() - C10538s.m4811a(AbstractC10508a.m4880a(), "crash_time", 0L) > MiStatInterface.MIN_UPLOAD_INTERVAL) {
            C10538s.m4809b(AbstractC10508a.m4880a(), "crash_count", 1);
            C10538s.m4808b(AbstractC10508a.m4880a(), "crash_time", System.currentTimeMillis());
        } else {
            int m4812a = C10538s.m4812a(AbstractC10508a.m4880a(), "crash_count", 0);
            if (m4812a == 0) {
                C10538s.m4808b(AbstractC10508a.m4880a(), "crash_time", System.currentTimeMillis());
            }
            int i = m4812a + 1;
            C10538s.m4809b(AbstractC10508a.m4880a(), "crash_count", i);
            if (i > 10) {
                return true;
            }
        }
        return false;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(Thread thread, Throwable th) {
        if (Build.VERSION.SDK_INT >= 9) {
            StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder().build());
        }
        if (!MiStatInterface.shouldExceptionUploadImmediately()) {
            m4896b(th);
        } else if (!m4901a()) {
            m4899a(th);
        } else {
            new C10534o().m4823a("crazy crash...");
        }
        if (this.f32619c != null) {
            this.f32619c.uncaughtException(thread, th);
        }
    }
}
