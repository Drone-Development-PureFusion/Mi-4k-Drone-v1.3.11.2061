package com.p120c.p121a.p122a.p123a.p124a.p125a;

import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import org.p286a.p287a.p299f.p302c.C11125l;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.c.a.a.a.a.a.a */
/* loaded from: classes.dex */
public final class C1257a implements Closeable {

    /* renamed from: a */
    static final String f3130a = "journal";

    /* renamed from: b */
    static final String f3131b = "journal.tmp";

    /* renamed from: c */
    static final String f3132c = "journal.bkp";

    /* renamed from: d */
    static final String f3133d = "libcore.io.DiskLruCache";

    /* renamed from: e */
    static final String f3134e = "1";

    /* renamed from: f */
    static final long f3135f = -1;

    /* renamed from: i */
    private static final String f3137i = "CLEAN";

    /* renamed from: j */
    private static final String f3138j = "DIRTY";

    /* renamed from: k */
    private static final String f3139k = "REMOVE";

    /* renamed from: l */
    private static final String f3140l = "READ";

    /* renamed from: m */
    private final File f3143m;

    /* renamed from: n */
    private final File f3144n;

    /* renamed from: o */
    private final File f3145o;

    /* renamed from: p */
    private final File f3146p;

    /* renamed from: q */
    private final int f3147q;

    /* renamed from: r */
    private long f3148r;

    /* renamed from: s */
    private int f3149s;

    /* renamed from: t */
    private final int f3150t;

    /* renamed from: w */
    private Writer f3153w;

    /* renamed from: y */
    private int f3155y;

    /* renamed from: g */
    static final Pattern f3136g = Pattern.compile("[a-z0-9_-]{1,64}");

    /* renamed from: B */
    private static final OutputStream f3129B = new OutputStream() { // from class: com.c.a.a.a.a.a.a.2
        @Override // java.io.OutputStream
        public void write(int i) {
        }
    };

    /* renamed from: u */
    private long f3151u = 0;

    /* renamed from: v */
    private int f3152v = 0;

    /* renamed from: x */
    private final LinkedHashMap<String, C1262b> f3154x = new LinkedHashMap<>(0, 0.75f, true);

    /* renamed from: z */
    private long f3156z = 0;

    /* renamed from: h */
    final ThreadPoolExecutor f3142h = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue());

    /* renamed from: A */
    private final Callable<Void> f3141A = new Callable<Void>() { // from class: com.c.a.a.a.a.a.a.1
        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public Void call() {
            synchronized (C1257a.this) {
                if (C1257a.this.f3153w != null) {
                    C1257a.this.m36024o();
                    C1257a.this.m36023p();
                    if (C1257a.this.m36026m()) {
                        C1257a.this.m36027l();
                        C1257a.this.f3155y = 0;
                    }
                }
            }
            return null;
        }
    };

    /* renamed from: com.c.a.a.a.a.a.a$a */
    /* loaded from: classes.dex */
    public final class C1260a {

        /* renamed from: b */
        private final C1262b f3159b;

        /* renamed from: c */
        private final boolean[] f3160c;

        /* renamed from: d */
        private boolean f3161d;

        /* renamed from: e */
        private boolean f3162e;

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: com.c.a.a.a.a.a.a$a$a */
        /* loaded from: classes.dex */
        public class C1261a extends FilterOutputStream {
            private C1261a(OutputStream outputStream) {
                super(outputStream);
            }

            @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
            public void close() {
                try {
                    this.out.close();
                } catch (IOException e) {
                    C1260a.this.f3161d = true;
                }
            }

            @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Flushable
            public void flush() {
                try {
                    this.out.flush();
                } catch (IOException e) {
                    C1260a.this.f3161d = true;
                }
            }

            @Override // java.io.FilterOutputStream, java.io.OutputStream
            public void write(int i) {
                try {
                    this.out.write(i);
                } catch (IOException e) {
                    C1260a.this.f3161d = true;
                }
            }

            @Override // java.io.FilterOutputStream, java.io.OutputStream
            public void write(byte[] bArr, int i, int i2) {
                try {
                    this.out.write(bArr, i, i2);
                } catch (IOException e) {
                    C1260a.this.f3161d = true;
                }
            }
        }

        private C1260a(C1262b c1262b) {
            this.f3159b = c1262b;
            this.f3160c = c1262b.f3167d ? null : new boolean[C1257a.this.f3150t];
        }

        /* renamed from: a */
        public InputStream m36020a(int i) {
            synchronized (C1257a.this) {
                if (this.f3159b.f3168e != this) {
                    throw new IllegalStateException();
                }
                if (!this.f3159b.f3167d) {
                    return null;
                }
                try {
                    return new FileInputStream(this.f3159b.m36010a(i));
                } catch (FileNotFoundException e) {
                    return null;
                }
            }
        }

        /* renamed from: a */
        public void m36021a() {
            if (this.f3161d) {
                C1257a.this.m36059a(this, false);
                C1257a.this.m36042c(this.f3159b.f3165b);
            } else {
                C1257a.this.m36059a(this, true);
            }
            this.f3162e = true;
        }

        /* renamed from: a */
        public void m36019a(int i, String str) {
            OutputStreamWriter outputStreamWriter;
            try {
                outputStreamWriter = new OutputStreamWriter(m36012c(i), C1267d.f3196b);
            } catch (Throwable th) {
                th = th;
                outputStreamWriter = null;
            }
            try {
                outputStreamWriter.write(str);
                C1267d.m35982a(outputStreamWriter);
            } catch (Throwable th2) {
                th = th2;
                C1267d.m35982a(outputStreamWriter);
                throw th;
            }
        }

        /* renamed from: b */
        public String m36015b(int i) {
            InputStream m36020a = m36020a(i);
            if (m36020a != null) {
                return C1257a.m36046b(m36020a);
            }
            return null;
        }

        /* renamed from: b */
        public void m36016b() {
            C1257a.this.m36059a(this, false);
        }

        /* renamed from: c */
        public OutputStream m36012c(int i) {
            OutputStream outputStream;
            FileOutputStream fileOutputStream;
            synchronized (C1257a.this) {
                if (this.f3159b.f3168e != this) {
                    throw new IllegalStateException();
                }
                if (!this.f3159b.f3167d) {
                    this.f3160c[i] = true;
                }
                File m36003b = this.f3159b.m36003b(i);
                try {
                    fileOutputStream = new FileOutputStream(m36003b);
                } catch (FileNotFoundException e) {
                    C1257a.this.f3143m.mkdirs();
                    try {
                        fileOutputStream = new FileOutputStream(m36003b);
                    } catch (FileNotFoundException e2) {
                        outputStream = C1257a.f3129B;
                    }
                }
                outputStream = new C1261a(fileOutputStream);
            }
            return outputStream;
        }

        /* renamed from: c */
        public void m36013c() {
            if (!this.f3162e) {
                try {
                    m36016b();
                } catch (IOException e) {
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.c.a.a.a.a.a.a$b */
    /* loaded from: classes.dex */
    public final class C1262b {

        /* renamed from: b */
        private final String f3165b;

        /* renamed from: c */
        private final long[] f3166c;

        /* renamed from: d */
        private boolean f3167d;

        /* renamed from: e */
        private C1260a f3168e;

        /* renamed from: f */
        private long f3169f;

        private C1262b(String str) {
            this.f3165b = str;
            this.f3166c = new long[C1257a.this.f3150t];
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: a */
        public void m36004a(String[] strArr) {
            if (strArr.length != C1257a.this.f3150t) {
                throw m36001b(strArr);
            }
            for (int i = 0; i < strArr.length; i++) {
                try {
                    this.f3166c[i] = Long.parseLong(strArr[i]);
                } catch (NumberFormatException e) {
                    throw m36001b(strArr);
                }
            }
        }

        /* renamed from: b */
        private IOException m36001b(String[] strArr) {
            throw new IOException("unexpected journal line: " + Arrays.toString(strArr));
        }

        /* renamed from: a */
        public File m36010a(int i) {
            return new File(C1257a.this.f3143m, this.f3165b + "." + i);
        }

        /* renamed from: a */
        public String m36011a() {
            StringBuilder sb = new StringBuilder();
            for (long j : this.f3166c) {
                sb.append(C11125l.f35805c).append(j);
            }
            return sb.toString();
        }

        /* renamed from: b */
        public File m36003b(int i) {
            return new File(C1257a.this.f3143m, this.f3165b + "." + i + ".tmp");
        }
    }

    /* renamed from: com.c.a.a.a.a.a.a$c */
    /* loaded from: classes.dex */
    public final class C1263c implements Closeable {

        /* renamed from: b */
        private final String f3171b;

        /* renamed from: c */
        private final long f3172c;

        /* renamed from: d */
        private File[] f3173d;

        /* renamed from: e */
        private final InputStream[] f3174e;

        /* renamed from: f */
        private final long[] f3175f;

        private C1263c(String str, long j, File[] fileArr, InputStream[] inputStreamArr, long[] jArr) {
            this.f3171b = str;
            this.f3172c = j;
            this.f3173d = fileArr;
            this.f3174e = inputStreamArr;
            this.f3175f = jArr;
        }

        /* renamed from: a */
        public C1260a m35997a() {
            return C1257a.this.m36049a(this.f3171b, this.f3172c);
        }

        /* renamed from: a */
        public File m35996a(int i) {
            return this.f3173d[i];
        }

        /* renamed from: b */
        public InputStream m35995b(int i) {
            return this.f3174e[i];
        }

        /* renamed from: c */
        public String m35994c(int i) {
            return C1257a.m36046b(m35995b(i));
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            for (InputStream inputStream : this.f3174e) {
                C1267d.m35982a(inputStream);
            }
        }

        /* renamed from: d */
        public long m35993d(int i) {
            return this.f3175f[i];
        }
    }

    private C1257a(File file, int i, int i2, long j, int i3) {
        this.f3143m = file;
        this.f3147q = i;
        this.f3144n = new File(file, f3130a);
        this.f3145o = new File(file, f3131b);
        this.f3146p = new File(file, f3132c);
        this.f3150t = i2;
        this.f3148r = j;
        this.f3149s = i3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public synchronized C1260a m36049a(String str, long j) {
        C1262b c1262b;
        C1260a c1260a;
        m36025n();
        m36036e(str);
        C1262b c1262b2 = this.f3154x.get(str);
        if (j == -1 || (c1262b2 != null && c1262b2.f3169f == j)) {
            if (c1262b2 == null) {
                C1262b c1262b3 = new C1262b(str);
                this.f3154x.put(str, c1262b3);
                c1262b = c1262b3;
            } else if (c1262b2.f3168e != null) {
                c1260a = null;
            } else {
                c1262b = c1262b2;
            }
            c1260a = new C1260a(c1262b);
            c1262b.f3168e = c1260a;
            this.f3153w.write("DIRTY " + str + '\n');
            this.f3153w.flush();
        } else {
            c1260a = null;
        }
        return c1260a;
    }

    /* renamed from: a */
    public static C1257a m36053a(File file, int i, int i2, long j, int i3) {
        if (j <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        if (i3 <= 0) {
            throw new IllegalArgumentException("maxFileCount <= 0");
        }
        if (i2 <= 0) {
            throw new IllegalArgumentException("valueCount <= 0");
        }
        File file2 = new File(file, f3132c);
        if (file2.exists()) {
            File file3 = new File(file, f3130a);
            if (file3.exists()) {
                file2.delete();
            } else {
                m36052a(file2, file3, false);
            }
        }
        C1257a c1257a = new C1257a(file, i, i2, j, i3);
        if (c1257a.f3144n.exists()) {
            try {
                c1257a.m36029j();
                c1257a.m36028k();
                c1257a.f3153w = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(c1257a.f3144n, true), C1267d.f3195a));
                return c1257a;
            } catch (IOException e) {
                System.out.println("DiskLruCache " + file + " is corrupt: " + e.getMessage() + ", removing");
                c1257a.m36031h();
            }
        }
        file.mkdirs();
        C1257a c1257a2 = new C1257a(file, i, i2, j, i3);
        c1257a2.m36027l();
        return c1257a2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public synchronized void m36059a(C1260a c1260a, boolean z) {
        synchronized (this) {
            C1262b c1262b = c1260a.f3159b;
            if (c1262b.f3168e != c1260a) {
                throw new IllegalStateException();
            }
            if (z && !c1262b.f3167d) {
                for (int i = 0; i < this.f3150t; i++) {
                    if (!c1260a.f3160c[i]) {
                        c1260a.m36016b();
                        throw new IllegalStateException("Newly created entry didn't create value for index " + i);
                    } else if (!c1262b.m36003b(i).exists()) {
                        c1260a.m36016b();
                        break;
                    }
                }
            }
            for (int i2 = 0; i2 < this.f3150t; i2++) {
                File m36003b = c1262b.m36003b(i2);
                if (!z) {
                    m36054a(m36003b);
                } else if (m36003b.exists()) {
                    File m36010a = c1262b.m36010a(i2);
                    m36003b.renameTo(m36010a);
                    long j = c1262b.f3166c[i2];
                    long length = m36010a.length();
                    c1262b.f3166c[i2] = length;
                    this.f3151u = (this.f3151u - j) + length;
                    this.f3152v++;
                }
            }
            this.f3155y++;
            c1262b.f3168e = null;
            if (c1262b.f3167d || z) {
                c1262b.f3167d = true;
                this.f3153w.write("CLEAN " + c1262b.f3165b + c1262b.m36011a() + '\n');
                if (z) {
                    long j2 = this.f3156z;
                    this.f3156z = 1 + j2;
                    c1262b.f3169f = j2;
                }
            } else {
                this.f3154x.remove(c1262b.f3165b);
                this.f3153w.write("REMOVE " + c1262b.f3165b + '\n');
            }
            this.f3153w.flush();
            if (this.f3151u > this.f3148r || this.f3152v > this.f3149s || m36026m()) {
                this.f3142h.submit(this.f3141A);
            }
        }
    }

    /* renamed from: a */
    private static void m36054a(File file) {
        if (!file.exists() || file.delete()) {
            return;
        }
        throw new IOException();
    }

    /* renamed from: a */
    private static void m36052a(File file, File file2, boolean z) {
        if (z) {
            m36054a(file2);
        }
        if (!file.renameTo(file2)) {
            throw new IOException();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public static String m36046b(InputStream inputStream) {
        return C1267d.m35980a((Reader) new InputStreamReader(inputStream, C1267d.f3196b));
    }

    /* renamed from: d */
    private void m36039d(String str) {
        String substring;
        int indexOf = str.indexOf(32);
        if (indexOf == -1) {
            throw new IOException("unexpected journal line: " + str);
        }
        int i = indexOf + 1;
        int indexOf2 = str.indexOf(32, i);
        if (indexOf2 == -1) {
            String substring2 = str.substring(i);
            if (indexOf == f3139k.length() && str.startsWith(f3139k)) {
                this.f3154x.remove(substring2);
                return;
            }
            substring = substring2;
        } else {
            substring = str.substring(i, indexOf2);
        }
        C1262b c1262b = this.f3154x.get(substring);
        if (c1262b == null) {
            c1262b = new C1262b(substring);
            this.f3154x.put(substring, c1262b);
        }
        if (indexOf2 != -1 && indexOf == f3137i.length() && str.startsWith(f3137i)) {
            String[] split = str.substring(indexOf2 + 1).split(" ");
            c1262b.f3167d = true;
            c1262b.f3168e = null;
            c1262b.m36004a(split);
        } else if (indexOf2 == -1 && indexOf == f3138j.length() && str.startsWith(f3138j)) {
            c1262b.f3168e = new C1260a(c1262b);
        } else if (indexOf2 != -1 || indexOf != f3140l.length() || !str.startsWith(f3140l)) {
            throw new IOException("unexpected journal line: " + str);
        }
    }

    /* renamed from: e */
    private void m36036e(String str) {
        if (!f3136g.matcher(str).matches()) {
            throw new IllegalArgumentException("keys must match regex [a-z0-9_-]{1,64}: \"" + str + "\"");
        }
    }

    /* renamed from: j */
    private void m36029j() {
        C1265c c1265c = new C1265c(new FileInputStream(this.f3144n), C1267d.f3195a);
        try {
            String m35985a = c1265c.m35985a();
            String m35985a2 = c1265c.m35985a();
            String m35985a3 = c1265c.m35985a();
            String m35985a4 = c1265c.m35985a();
            String m35985a5 = c1265c.m35985a();
            if (!f3133d.equals(m35985a) || !"1".equals(m35985a2) || !Integer.toString(this.f3147q).equals(m35985a3) || !Integer.toString(this.f3150t).equals(m35985a4) || !"".equals(m35985a5)) {
                throw new IOException("unexpected journal header: [" + m35985a + ", " + m35985a2 + ", " + m35985a4 + ", " + m35985a5 + "]");
            }
            int i = 0;
            while (true) {
                try {
                    m36039d(c1265c.m35985a());
                    i++;
                } catch (EOFException e) {
                    this.f3155y = i - this.f3154x.size();
                    C1267d.m35982a(c1265c);
                    return;
                }
            }
        } catch (Throwable th) {
            C1267d.m35982a(c1265c);
            throw th;
        }
    }

    /* renamed from: k */
    private void m36028k() {
        m36054a(this.f3145o);
        Iterator<C1262b> it2 = this.f3154x.values().iterator();
        while (it2.hasNext()) {
            C1262b next = it2.next();
            if (next.f3168e == null) {
                for (int i = 0; i < this.f3150t; i++) {
                    this.f3151u += next.f3166c[i];
                    this.f3152v++;
                }
            } else {
                next.f3168e = null;
                for (int i2 = 0; i2 < this.f3150t; i2++) {
                    m36054a(next.m36010a(i2));
                    m36054a(next.m36003b(i2));
                }
                it2.remove();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: l */
    public synchronized void m36027l() {
        if (this.f3153w != null) {
            this.f3153w.close();
        }
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f3145o), C1267d.f3195a));
        bufferedWriter.write(f3133d);
        bufferedWriter.write("\n");
        bufferedWriter.write("1");
        bufferedWriter.write("\n");
        bufferedWriter.write(Integer.toString(this.f3147q));
        bufferedWriter.write("\n");
        bufferedWriter.write(Integer.toString(this.f3150t));
        bufferedWriter.write("\n");
        bufferedWriter.write("\n");
        for (C1262b c1262b : this.f3154x.values()) {
            if (c1262b.f3168e != null) {
                bufferedWriter.write("DIRTY " + c1262b.f3165b + '\n');
            } else {
                bufferedWriter.write("CLEAN " + c1262b.f3165b + c1262b.m36011a() + '\n');
            }
        }
        bufferedWriter.close();
        if (this.f3144n.exists()) {
            m36052a(this.f3144n, this.f3146p, true);
        }
        m36052a(this.f3145o, this.f3144n, false);
        this.f3146p.delete();
        this.f3153w = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f3144n, true), C1267d.f3195a));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: m */
    public boolean m36026m() {
        return this.f3155y >= 2000 && this.f3155y >= this.f3154x.size();
    }

    /* renamed from: n */
    private void m36025n() {
        if (this.f3153w == null) {
            throw new IllegalStateException("cache is closed");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: o */
    public void m36024o() {
        while (this.f3151u > this.f3148r) {
            m36042c(this.f3154x.entrySet().iterator().next().getKey());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: p */
    public void m36023p() {
        while (this.f3152v > this.f3149s) {
            m36042c(this.f3154x.entrySet().iterator().next().getKey());
        }
    }

    /* renamed from: a */
    public synchronized C1263c m36050a(String str) {
        C1263c c1263c = null;
        synchronized (this) {
            m36025n();
            m36036e(str);
            C1262b c1262b = this.f3154x.get(str);
            if (c1262b != null && c1262b.f3167d) {
                File[] fileArr = new File[this.f3150t];
                InputStream[] inputStreamArr = new InputStream[this.f3150t];
                for (int i = 0; i < this.f3150t; i++) {
                    try {
                        File m36010a = c1262b.m36010a(i);
                        fileArr[i] = m36010a;
                        inputStreamArr[i] = new FileInputStream(m36010a);
                    } catch (FileNotFoundException e) {
                        for (int i2 = 0; i2 < this.f3150t && inputStreamArr[i2] != null; i2++) {
                            C1267d.m35982a(inputStreamArr[i2]);
                        }
                    }
                }
                this.f3155y++;
                this.f3153w.append((CharSequence) ("READ " + str + '\n'));
                if (m36026m()) {
                    this.f3142h.submit(this.f3141A);
                }
                c1263c = new C1263c(str, c1262b.f3169f, fileArr, inputStreamArr, c1262b.f3166c);
            }
        }
        return c1263c;
    }

    /* renamed from: a */
    public File m36061a() {
        return this.f3143m;
    }

    /* renamed from: a */
    public synchronized void m36060a(long j) {
        this.f3148r = j;
        this.f3142h.submit(this.f3141A);
    }

    /* renamed from: b */
    public synchronized long m36048b() {
        return this.f3148r;
    }

    /* renamed from: b */
    public C1260a m36045b(String str) {
        return m36049a(str, -1L);
    }

    /* renamed from: c */
    public synchronized int m36044c() {
        return this.f3149s;
    }

    /* renamed from: c */
    public synchronized boolean m36042c(String str) {
        boolean z;
        synchronized (this) {
            m36025n();
            m36036e(str);
            C1262b c1262b = this.f3154x.get(str);
            if (c1262b == null || c1262b.f3168e != null) {
                z = false;
            } else {
                for (int i = 0; i < this.f3150t; i++) {
                    File m36010a = c1262b.m36010a(i);
                    if (m36010a.exists() && !m36010a.delete()) {
                        throw new IOException("failed to delete " + m36010a);
                    }
                    this.f3151u -= c1262b.f3166c[i];
                    this.f3152v--;
                    c1262b.f3166c[i] = 0;
                }
                this.f3155y++;
                this.f3153w.append((CharSequence) ("REMOVE " + str + '\n'));
                this.f3154x.remove(str);
                if (m36026m()) {
                    this.f3142h.submit(this.f3141A);
                }
                z = true;
            }
        }
        return z;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        if (this.f3153w != null) {
            Iterator it2 = new ArrayList(this.f3154x.values()).iterator();
            while (it2.hasNext()) {
                C1262b c1262b = (C1262b) it2.next();
                if (c1262b.f3168e != null) {
                    c1262b.f3168e.m36016b();
                }
            }
            m36024o();
            m36023p();
            this.f3153w.close();
            this.f3153w = null;
        }
    }

    /* renamed from: d */
    public synchronized long m36041d() {
        return this.f3151u;
    }

    /* renamed from: e */
    public synchronized long m36038e() {
        return this.f3152v;
    }

    /* renamed from: f */
    public synchronized boolean m36035f() {
        return this.f3153w == null;
    }

    /* renamed from: g */
    public synchronized void m36033g() {
        m36025n();
        m36024o();
        m36023p();
        this.f3153w.flush();
    }

    /* renamed from: h */
    public void m36031h() {
        close();
        C1267d.m35981a(this.f3143m);
    }
}
