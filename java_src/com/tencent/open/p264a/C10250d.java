package com.tencent.open.p264a;

import android.annotation.SuppressLint;
import android.os.Environment;
import android.os.StatFs;
import java.io.File;
import java.text.SimpleDateFormat;
/* renamed from: com.tencent.open.a.d */
/* loaded from: classes.dex */
public class C10250d {

    /* renamed from: com.tencent.open.a.d$a */
    /* loaded from: classes.dex */
    public static final class C10251a {
        /* renamed from: a */
        public static final boolean m5690a(int i, int i2) {
            return i2 == (i & i2);
        }
    }

    /* renamed from: com.tencent.open.a.d$b */
    /* loaded from: classes.dex */
    public static final class C10252b {
        /* renamed from: a */
        public static boolean m5689a(File file) {
            if (file != null) {
                if (file.isFile()) {
                    if (file.delete()) {
                        return true;
                    }
                    file.deleteOnExit();
                    return false;
                } else if (!file.isDirectory()) {
                    return false;
                } else {
                    for (File file2 : file.listFiles()) {
                        m5689a(file2);
                    }
                    return file.delete();
                }
            }
            return false;
        }
    }

    /* renamed from: com.tencent.open.a.d$c */
    /* loaded from: classes.dex */
    public static final class C10253c {
        /* renamed from: a */
        public static boolean m5688a() {
            String externalStorageState = Environment.getExternalStorageState();
            return "mounted".equals(externalStorageState) || "mounted_ro".equals(externalStorageState);
        }

        /* renamed from: b */
        public static C10254d m5687b() {
            if (!m5688a()) {
                return null;
            }
            return C10254d.m5681b(Environment.getExternalStorageDirectory());
        }
    }

    /* renamed from: com.tencent.open.a.d$d */
    /* loaded from: classes.dex */
    public static class C10254d {

        /* renamed from: a */
        private File f31911a;

        /* renamed from: b */
        private long f31912b;

        /* renamed from: c */
        private long f31913c;

        /* renamed from: b */
        public static C10254d m5681b(File file) {
            StatFs statFs;
            C10254d c10254d = new C10254d();
            c10254d.m5684a(file);
            long blockSize = new StatFs(file.getAbsolutePath()).getBlockSize();
            c10254d.m5685a(statFs.getBlockCount() * blockSize);
            c10254d.m5682b(blockSize * statFs.getAvailableBlocks());
            return c10254d;
        }

        /* renamed from: a */
        public File m5686a() {
            return this.f31911a;
        }

        /* renamed from: a */
        public void m5685a(long j) {
            this.f31912b = j;
        }

        /* renamed from: a */
        public void m5684a(File file) {
            this.f31911a = file;
        }

        /* renamed from: b */
        public long m5683b() {
            return this.f31912b;
        }

        /* renamed from: b */
        public void m5682b(long j) {
            this.f31913c = j;
        }

        /* renamed from: c */
        public long m5680c() {
            return this.f31913c;
        }

        public String toString() {
            return String.format("[%s : %d / %d]", m5686a().getAbsolutePath(), Long.valueOf(m5680c()), Long.valueOf(m5683b()));
        }
    }

    /* renamed from: com.tencent.open.a.d$e */
    /* loaded from: classes.dex */
    public static final class C10255e {
        @SuppressLint({"SimpleDateFormat"})
        /* renamed from: a */
        public static SimpleDateFormat m5679a(String str) {
            return new SimpleDateFormat(str);
        }
    }
}
