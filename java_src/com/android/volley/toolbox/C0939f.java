package com.android.volley.toolbox;

import android.os.SystemClock;
import com.android.volley.AbstractC0900b;
import com.android.volley.C0968v;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
/* renamed from: com.android.volley.toolbox.f */
/* loaded from: classes.dex */
public class C0939f implements AbstractC0900b {

    /* renamed from: e */
    private static final int f2096e = 5242880;

    /* renamed from: f */
    private static final float f2097f = 0.9f;

    /* renamed from: g */
    private static final int f2098g = 538247942;

    /* renamed from: a */
    private final Map<String, C0941a> f2099a;

    /* renamed from: b */
    private long f2100b;

    /* renamed from: c */
    private final File f2101c;

    /* renamed from: d */
    private final int f2102d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.android.volley.toolbox.f$a */
    /* loaded from: classes.dex */
    public static class C0941a {

        /* renamed from: a */
        public long f2103a;

        /* renamed from: b */
        public String f2104b;

        /* renamed from: c */
        public String f2105c;

        /* renamed from: d */
        public long f2106d;

        /* renamed from: e */
        public long f2107e;

        /* renamed from: f */
        public long f2108f;

        /* renamed from: g */
        public long f2109g;

        /* renamed from: h */
        public Map<String, String> f2110h;

        private C0941a() {
        }

        public C0941a(String str, AbstractC0900b.C0901a c0901a) {
            this.f2104b = str;
            this.f2103a = c0901a.f1979a.length;
            this.f2105c = c0901a.f1980b;
            this.f2106d = c0901a.f1981c;
            this.f2107e = c0901a.f1982d;
            this.f2108f = c0901a.f1983e;
            this.f2109g = c0901a.f1984f;
            this.f2110h = c0901a.f1985g;
        }

        /* renamed from: a */
        public static C0941a m37340a(InputStream inputStream) {
            C0941a c0941a = new C0941a();
            if (C0939f.m37354a(inputStream) != C0939f.f2098g) {
                throw new IOException();
            }
            c0941a.f2104b = C0939f.m37346c(inputStream);
            c0941a.f2105c = C0939f.m37346c(inputStream);
            if (c0941a.f2105c.equals("")) {
                c0941a.f2105c = null;
            }
            c0941a.f2106d = C0939f.m37347b(inputStream);
            c0941a.f2107e = C0939f.m37347b(inputStream);
            c0941a.f2108f = C0939f.m37347b(inputStream);
            c0941a.f2109g = C0939f.m37347b(inputStream);
            c0941a.f2110h = C0939f.m37344d(inputStream);
            return c0941a;
        }

        /* renamed from: a */
        public AbstractC0900b.C0901a m37338a(byte[] bArr) {
            AbstractC0900b.C0901a c0901a = new AbstractC0900b.C0901a();
            c0901a.f1979a = bArr;
            c0901a.f1980b = this.f2105c;
            c0901a.f1981c = this.f2106d;
            c0901a.f1982d = this.f2107e;
            c0901a.f1983e = this.f2108f;
            c0901a.f1984f = this.f2109g;
            c0901a.f1985g = this.f2110h;
            return c0901a;
        }

        /* renamed from: a */
        public boolean m37339a(OutputStream outputStream) {
            try {
                C0939f.m37352a(outputStream, (int) C0939f.f2098g);
                C0939f.m37350a(outputStream, this.f2104b);
                C0939f.m37350a(outputStream, this.f2105c == null ? "" : this.f2105c);
                C0939f.m37351a(outputStream, this.f2106d);
                C0939f.m37351a(outputStream, this.f2107e);
                C0939f.m37351a(outputStream, this.f2108f);
                C0939f.m37351a(outputStream, this.f2109g);
                C0939f.m37348a(this.f2110h, outputStream);
                outputStream.flush();
                return true;
            } catch (IOException e) {
                C0968v.m37260b("%s", e.toString());
                return false;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.android.volley.toolbox.f$b */
    /* loaded from: classes.dex */
    public static class C0942b extends FilterInputStream {

        /* renamed from: a */
        private int f2111a;

        private C0942b(InputStream inputStream) {
            super(inputStream);
            this.f2111a = 0;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public int read() {
            int read = super.read();
            if (read != -1) {
                this.f2111a++;
            }
            return read;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public int read(byte[] bArr, int i, int i2) {
            int read = super.read(bArr, i, i2);
            if (read != -1) {
                this.f2111a += read;
            }
            return read;
        }
    }

    public C0939f(File file) {
        this(file, f2096e);
    }

    public C0939f(File file, int i) {
        this.f2099a = new LinkedHashMap(16, 0.75f, true);
        this.f2100b = 0L;
        this.f2101c = file;
        this.f2102d = i;
    }

    /* renamed from: a */
    static int m37354a(InputStream inputStream) {
        return 0 | (m37342e(inputStream) << 0) | (m37342e(inputStream) << 8) | (m37342e(inputStream) << 16) | (m37342e(inputStream) << 24);
    }

    /* renamed from: a */
    private void m37355a(int i) {
        int i2;
        if (this.f2100b + i < this.f2102d) {
            return;
        }
        if (C0968v.f2167b) {
            C0968v.m37262a("Pruning old cache entries.", new Object[0]);
        }
        long j = this.f2100b;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        Iterator<Map.Entry<String, C0941a>> it2 = this.f2099a.entrySet().iterator();
        int i3 = 0;
        while (true) {
            if (!it2.hasNext()) {
                i2 = i3;
                break;
            }
            C0941a value = it2.next().getValue();
            if (m37345c(value.f2104b).delete()) {
                this.f2100b -= value.f2103a;
            } else {
                C0968v.m37260b("Could not delete cache entry for key=%s, filename=%s", value.f2104b, m37343d(value.f2104b));
            }
            it2.remove();
            i2 = i3 + 1;
            if (((float) (this.f2100b + i)) < this.f2102d * f2097f) {
                break;
            }
            i3 = i2;
        }
        if (!C0968v.f2167b) {
            return;
        }
        C0968v.m37262a("pruned %d files, %d bytes, %d ms", Integer.valueOf(i2), Long.valueOf(this.f2100b - j), Long.valueOf(SystemClock.elapsedRealtime() - elapsedRealtime));
    }

    /* renamed from: a */
    static void m37352a(OutputStream outputStream, int i) {
        outputStream.write((i >> 0) & 255);
        outputStream.write((i >> 8) & 255);
        outputStream.write((i >> 16) & 255);
        outputStream.write((i >> 24) & 255);
    }

    /* renamed from: a */
    static void m37351a(OutputStream outputStream, long j) {
        outputStream.write((byte) (j >>> 0));
        outputStream.write((byte) (j >>> 8));
        outputStream.write((byte) (j >>> 16));
        outputStream.write((byte) (j >>> 24));
        outputStream.write((byte) (j >>> 32));
        outputStream.write((byte) (j >>> 40));
        outputStream.write((byte) (j >>> 48));
        outputStream.write((byte) (j >>> 56));
    }

    /* renamed from: a */
    static void m37350a(OutputStream outputStream, String str) {
        byte[] bytes = str.getBytes("UTF-8");
        m37351a(outputStream, bytes.length);
        outputStream.write(bytes, 0, bytes.length);
    }

    /* renamed from: a */
    private void m37349a(String str, C0941a c0941a) {
        if (!this.f2099a.containsKey(str)) {
            this.f2100b += c0941a.f2103a;
        } else {
            this.f2100b = (c0941a.f2103a - this.f2099a.get(str).f2103a) + this.f2100b;
        }
        this.f2099a.put(str, c0941a);
    }

    /* renamed from: a */
    static void m37348a(Map<String, String> map, OutputStream outputStream) {
        if (map == null) {
            m37352a(outputStream, 0);
            return;
        }
        m37352a(outputStream, map.size());
        for (Map.Entry<String, String> entry : map.entrySet()) {
            m37350a(outputStream, entry.getKey());
            m37350a(outputStream, entry.getValue());
        }
    }

    /* renamed from: a */
    private static byte[] m37353a(InputStream inputStream, int i) {
        byte[] bArr = new byte[i];
        int i2 = 0;
        while (i2 < i) {
            int read = inputStream.read(bArr, i2, i - i2);
            if (read == -1) {
                break;
            }
            i2 += read;
        }
        if (i2 != i) {
            throw new IOException("Expected " + i + " bytes, read " + i2 + " bytes");
        }
        return bArr;
    }

    /* renamed from: b */
    static long m37347b(InputStream inputStream) {
        return 0 | ((m37342e(inputStream) & 255) << 0) | ((m37342e(inputStream) & 255) << 8) | ((m37342e(inputStream) & 255) << 16) | ((m37342e(inputStream) & 255) << 24) | ((m37342e(inputStream) & 255) << 32) | ((m37342e(inputStream) & 255) << 40) | ((m37342e(inputStream) & 255) << 48) | ((m37342e(inputStream) & 255) << 56);
    }

    /* renamed from: c */
    static String m37346c(InputStream inputStream) {
        return new String(m37353a(inputStream, (int) m37347b(inputStream)), "UTF-8");
    }

    /* renamed from: d */
    private String m37343d(String str) {
        int length = str.length() / 2;
        return String.valueOf(str.substring(0, length).hashCode()) + String.valueOf(str.substring(length).hashCode());
    }

    /* renamed from: d */
    static Map<String, String> m37344d(InputStream inputStream) {
        int m37354a = m37354a(inputStream);
        Map<String, String> emptyMap = m37354a == 0 ? Collections.emptyMap() : new HashMap<>(m37354a);
        for (int i = 0; i < m37354a; i++) {
            emptyMap.put(m37346c(inputStream).intern(), m37346c(inputStream).intern());
        }
        return emptyMap;
    }

    /* renamed from: e */
    private static int m37342e(InputStream inputStream) {
        int read = inputStream.read();
        if (read == -1) {
            throw new EOFException();
        }
        return read;
    }

    /* renamed from: e */
    private void m37341e(String str) {
        C0941a c0941a = this.f2099a.get(str);
        if (c0941a != null) {
            this.f2100b -= c0941a.f2103a;
            this.f2099a.remove(str);
        }
    }

    @Override // com.android.volley.AbstractC0900b
    /* renamed from: a */
    public synchronized AbstractC0900b.C0901a mo37280a(String str) {
        C0942b c0942b;
        AbstractC0900b.C0901a c0901a;
        File m37345c;
        C0941a c0941a = this.f2099a.get(str);
        if (c0941a == null) {
            c0901a = null;
        } else {
            try {
                m37345c = m37345c(str);
            } catch (Throwable th) {
                th = th;
            }
            try {
                c0942b = new C0942b(new BufferedInputStream(new FileInputStream(m37345c)));
                try {
                    C0941a.m37340a(c0942b);
                    c0901a = c0941a.m37338a(m37353a(c0942b, (int) (m37345c.length() - c0942b.f2111a)));
                    if (c0942b != null) {
                        try {
                            c0942b.close();
                        } catch (IOException e) {
                            c0901a = null;
                        }
                    }
                } catch (IOException e2) {
                    e = e2;
                    C0968v.m37260b("%s: %s", m37345c.getAbsolutePath(), e.toString());
                    mo37276b(str);
                    if (c0942b != null) {
                        try {
                            c0942b.close();
                        } catch (IOException e3) {
                            c0901a = null;
                        }
                    }
                    c0901a = null;
                    return c0901a;
                } catch (NegativeArraySizeException e4) {
                    e = e4;
                    C0968v.m37260b("%s: %s", m37345c.getAbsolutePath(), e.toString());
                    mo37276b(str);
                    if (c0942b != null) {
                        try {
                            c0942b.close();
                        } catch (IOException e5) {
                            c0901a = null;
                        }
                    }
                    c0901a = null;
                    return c0901a;
                }
            } catch (IOException e6) {
                e = e6;
                c0942b = null;
            } catch (NegativeArraySizeException e7) {
                e = e7;
                c0942b = null;
            } catch (Throwable th2) {
                th = th2;
                c0942b = null;
                if (c0942b != null) {
                    try {
                        c0942b.close();
                    } catch (IOException e8) {
                        c0901a = null;
                    }
                }
                throw th;
            }
        }
        return c0901a;
    }

    @Override // com.android.volley.AbstractC0900b
    /* renamed from: a */
    public synchronized void mo37281a() {
        BufferedInputStream bufferedInputStream;
        if (this.f2101c.exists()) {
            File[] listFiles = this.f2101c.listFiles();
            if (listFiles != null) {
                for (File file : listFiles) {
                    BufferedInputStream bufferedInputStream2 = null;
                    try {
                        bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
                        try {
                            try {
                                C0941a m37340a = C0941a.m37340a(bufferedInputStream);
                                m37340a.f2103a = file.length();
                                m37349a(m37340a.f2104b, m37340a);
                                if (bufferedInputStream != null) {
                                    try {
                                        bufferedInputStream.close();
                                    } catch (IOException e) {
                                    }
                                }
                            } catch (IOException e2) {
                                if (file != null) {
                                    file.delete();
                                }
                                if (bufferedInputStream != null) {
                                    try {
                                        bufferedInputStream.close();
                                    } catch (IOException e3) {
                                    }
                                }
                            }
                        } catch (Throwable th) {
                            bufferedInputStream2 = bufferedInputStream;
                            th = th;
                            if (bufferedInputStream2 != null) {
                                try {
                                    bufferedInputStream2.close();
                                } catch (IOException e4) {
                                }
                            }
                            throw th;
                        }
                    } catch (IOException e5) {
                        bufferedInputStream = null;
                    } catch (Throwable th2) {
                        th = th2;
                    }
                }
            }
        } else if (!this.f2101c.mkdirs()) {
            C0968v.m37258c("Unable to create cache dir %s", this.f2101c.getAbsolutePath());
        }
    }

    @Override // com.android.volley.AbstractC0900b
    /* renamed from: a */
    public synchronized void mo37279a(String str, AbstractC0900b.C0901a c0901a) {
        BufferedOutputStream bufferedOutputStream;
        C0941a c0941a;
        m37355a(c0901a.f1979a.length);
        File m37345c = m37345c(str);
        try {
            bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(m37345c));
            c0941a = new C0941a(str, c0901a);
        } catch (IOException e) {
            if (!m37345c.delete()) {
                C0968v.m37260b("Could not clean up file %s", m37345c.getAbsolutePath());
            }
        }
        if (!c0941a.m37339a(bufferedOutputStream)) {
            bufferedOutputStream.close();
            C0968v.m37260b("Failed to write header for %s", m37345c.getAbsolutePath());
            throw new IOException();
        }
        bufferedOutputStream.write(c0901a.f1979a);
        bufferedOutputStream.close();
        m37349a(str, c0941a);
    }

    @Override // com.android.volley.AbstractC0900b
    /* renamed from: a */
    public synchronized void mo37278a(String str, boolean z) {
        AbstractC0900b.C0901a mo37280a = mo37280a(str);
        if (mo37280a != null) {
            mo37280a.f1984f = 0L;
            if (z) {
                mo37280a.f1983e = 0L;
            }
            mo37279a(str, mo37280a);
        }
    }

    @Override // com.android.volley.AbstractC0900b
    /* renamed from: b */
    public synchronized void mo37277b() {
        synchronized (this) {
            File[] listFiles = this.f2101c.listFiles();
            if (listFiles != null) {
                for (File file : listFiles) {
                    file.delete();
                }
            }
            this.f2099a.clear();
            this.f2100b = 0L;
            C0968v.m37260b("Cache cleared.", new Object[0]);
        }
    }

    @Override // com.android.volley.AbstractC0900b
    /* renamed from: b */
    public synchronized void mo37276b(String str) {
        boolean delete = m37345c(str).delete();
        m37341e(str);
        if (!delete) {
            C0968v.m37260b("Could not delete cache entry for key=%s, filename=%s", str, m37343d(str));
        }
    }

    /* renamed from: c */
    public File m37345c(String str) {
        return new File(this.f2101c, m37343d(str));
    }
}
