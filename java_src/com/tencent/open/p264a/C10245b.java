package com.tencent.open.p264a;

import com.tencent.open.p264a.C10250d;
import java.io.File;
import java.io.FileFilter;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Comparator;
/* renamed from: com.tencent.open.a.b */
/* loaded from: classes.dex */
public class C10245b {

    /* renamed from: a */
    private static SimpleDateFormat f31876a = C10250d.C10255e.m5679a("yyyy-MM-dd");

    /* renamed from: b */
    private static FileFilter f31877b = new FileFilter() { // from class: com.tencent.open.a.b.1
        @Override // java.io.FileFilter
        public boolean accept(File file) {
            return file.isDirectory() && C10245b.m5715a(file) > 0;
        }
    };

    /* renamed from: h */
    private File f31883h;

    /* renamed from: c */
    private String f31878c = "Tracer.File";

    /* renamed from: d */
    private int f31879d = Integer.MAX_VALUE;

    /* renamed from: e */
    private int f31880e = Integer.MAX_VALUE;

    /* renamed from: f */
    private int f31881f = 4096;

    /* renamed from: g */
    private long f31882g = 10000;

    /* renamed from: i */
    private int f31884i = 10;

    /* renamed from: j */
    private String f31885j = ".log";

    /* renamed from: k */
    private long f31886k = Long.MAX_VALUE;

    /* renamed from: l */
    private FileFilter f31887l = new FileFilter() { // from class: com.tencent.open.a.b.2
        @Override // java.io.FileFilter
        public boolean accept(File file) {
            return file.getName().endsWith(C10245b.this.m5693i()) && C10245b.m5696f(file) != -1;
        }
    };

    /* renamed from: m */
    private Comparator<? super File> f31888m = new Comparator<File>() { // from class: com.tencent.open.a.b.3
        @Override // java.util.Comparator
        /* renamed from: a */
        public int compare(File file, File file2) {
            return C10245b.m5696f(file) - C10245b.m5696f(file2);
        }
    };

    public C10245b(File file, int i, int i2, int i3, String str, long j, int i4, String str2, long j2) {
        m5704c(file);
        m5711b(i);
        m5717a(i2);
        m5706c(i3);
        m5714a(str);
        m5710b(j);
        m5702d(i4);
        m5708b(str2);
        m5705c(j2);
    }

    /* renamed from: a */
    public static long m5715a(File file) {
        try {
            return f31876a.parse(file.getName()).getTime();
        } catch (Exception e) {
            return -1L;
        }
    }

    /* renamed from: d */
    private File m5701d(long j) {
        return m5698e(m5716a(j));
    }

    /* renamed from: e */
    private File m5698e(File file) {
        File[] m5709b = m5709b(file);
        if (m5709b == null || m5709b.length == 0) {
            return new File(file, "1" + m5693i());
        }
        m5713a(m5709b);
        File file2 = m5709b[m5709b.length - 1];
        int length = m5709b.length - m5699e();
        if (((int) file2.length()) > m5703d()) {
            file2 = new File(file, (m5696f(file2) + 1) + m5693i());
            length++;
        }
        for (int i = 0; i < length; i++) {
            m5709b[i].delete();
        }
        return file2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f */
    public static int m5696f(File file) {
        try {
            String name = file.getName();
            return Integer.parseInt(name.substring(0, name.indexOf(46)));
        } catch (Exception e) {
            return -1;
        }
    }

    /* renamed from: a */
    public File m5718a() {
        return m5701d(System.currentTimeMillis());
    }

    /* renamed from: a */
    public File m5716a(long j) {
        File file = new File(m5695g(), f31876a.format(Long.valueOf(j)));
        file.mkdirs();
        return file;
    }

    /* renamed from: a */
    public void m5717a(int i) {
        this.f31879d = i;
    }

    /* renamed from: a */
    public void m5714a(String str) {
        this.f31878c = str;
    }

    /* renamed from: a */
    public File[] m5713a(File[] fileArr) {
        Arrays.sort(fileArr, this.f31888m);
        return fileArr;
    }

    /* renamed from: b */
    public void m5712b() {
        File[] listFiles;
        if (m5695g() == null || (listFiles = m5695g().listFiles(f31877b)) == null) {
            return;
        }
        for (File file : listFiles) {
            if (System.currentTimeMillis() - m5715a(file) > m5692j()) {
                C10250d.C10252b.m5689a(file);
            }
        }
    }

    /* renamed from: b */
    public void m5711b(int i) {
        this.f31880e = i;
    }

    /* renamed from: b */
    public void m5710b(long j) {
        this.f31882g = j;
    }

    /* renamed from: b */
    public void m5708b(String str) {
        this.f31885j = str;
    }

    /* renamed from: b */
    public File[] m5709b(File file) {
        return file.listFiles(this.f31887l);
    }

    /* renamed from: c */
    public String m5707c() {
        return this.f31878c;
    }

    /* renamed from: c */
    public void m5706c(int i) {
        this.f31881f = i;
    }

    /* renamed from: c */
    public void m5705c(long j) {
        this.f31886k = j;
    }

    /* renamed from: c */
    public void m5704c(File file) {
        this.f31883h = file;
    }

    /* renamed from: d */
    public int m5703d() {
        return this.f31879d;
    }

    /* renamed from: d */
    public void m5702d(int i) {
        this.f31884i = i;
    }

    /* renamed from: e */
    public int m5699e() {
        return this.f31880e;
    }

    /* renamed from: f */
    public int m5697f() {
        return this.f31881f;
    }

    /* renamed from: g */
    public File m5695g() {
        return this.f31883h;
    }

    /* renamed from: h */
    public int m5694h() {
        return this.f31884i;
    }

    /* renamed from: i */
    public String m5693i() {
        return this.f31885j;
    }

    /* renamed from: j */
    public long m5692j() {
        return this.f31886k;
    }
}
