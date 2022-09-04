package com.google.android.gms.internal;

import android.os.SystemClock;
import com.google.android.gms.internal.AbstractC7674ru;
import java.io.BufferedInputStream;
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
/* loaded from: classes2.dex */
public class amj implements AbstractC7674ru {

    /* renamed from: a */
    private final Map<String, C6568a> f22269a;

    /* renamed from: b */
    private long f22270b;

    /* renamed from: c */
    private final File f22271c;

    /* renamed from: d */
    private final int f22272d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.gms.internal.amj$a */
    /* loaded from: classes2.dex */
    public static class C6568a {

        /* renamed from: a */
        public long f22273a;

        /* renamed from: b */
        public String f22274b;

        /* renamed from: c */
        public String f22275c;

        /* renamed from: d */
        public long f22276d;

        /* renamed from: e */
        public long f22277e;

        /* renamed from: f */
        public long f22278f;

        /* renamed from: g */
        public long f22279g;

        /* renamed from: h */
        public Map<String, String> f22280h;

        private C6568a() {
        }

        public C6568a(String str, AbstractC7674ru.C7675a c7675a) {
            this.f22274b = str;
            this.f22273a = c7675a.f25470a.length;
            this.f22275c = c7675a.f25471b;
            this.f22276d = c7675a.f25472c;
            this.f22277e = c7675a.f25473d;
            this.f22278f = c7675a.f25474e;
            this.f22279g = c7675a.f25475f;
            this.f22280h = c7675a.f25476g;
        }

        /* renamed from: a */
        public static C6568a m16797a(InputStream inputStream) {
            C6568a c6568a = new C6568a();
            if (amj.m16812a(inputStream) != 538247942) {
                throw new IOException();
            }
            c6568a.f22274b = amj.m16803c(inputStream);
            c6568a.f22275c = amj.m16803c(inputStream);
            if (c6568a.f22275c.equals("")) {
                c6568a.f22275c = null;
            }
            c6568a.f22276d = amj.m16805b(inputStream);
            c6568a.f22277e = amj.m16805b(inputStream);
            c6568a.f22278f = amj.m16805b(inputStream);
            c6568a.f22279g = amj.m16805b(inputStream);
            c6568a.f22280h = amj.m16801d(inputStream);
            return c6568a;
        }

        /* renamed from: a */
        public AbstractC7674ru.C7675a m16795a(byte[] bArr) {
            AbstractC7674ru.C7675a c7675a = new AbstractC7674ru.C7675a();
            c7675a.f25470a = bArr;
            c7675a.f25471b = this.f22275c;
            c7675a.f25472c = this.f22276d;
            c7675a.f25473d = this.f22277e;
            c7675a.f25474e = this.f22278f;
            c7675a.f25475f = this.f22279g;
            c7675a.f25476g = this.f22280h;
            return c7675a;
        }

        /* renamed from: a */
        public boolean m16796a(OutputStream outputStream) {
            try {
                amj.m16810a(outputStream, 538247942);
                amj.m16808a(outputStream, this.f22274b);
                amj.m16808a(outputStream, this.f22275c == null ? "" : this.f22275c);
                amj.m16809a(outputStream, this.f22276d);
                amj.m16809a(outputStream, this.f22277e);
                amj.m16809a(outputStream, this.f22278f);
                amj.m16809a(outputStream, this.f22279g);
                amj.m16806a(this.f22280h, outputStream);
                outputStream.flush();
                return true;
            } catch (IOException e) {
                ajg.m17131b("%s", e.toString());
                return false;
            }
        }
    }

    /* renamed from: com.google.android.gms.internal.amj$b */
    /* loaded from: classes2.dex */
    private static class C6569b extends FilterInputStream {

        /* renamed from: a */
        private int f22281a;

        private C6569b(InputStream inputStream) {
            super(inputStream);
            this.f22281a = 0;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public int read() {
            int read = super.read();
            if (read != -1) {
                this.f22281a++;
            }
            return read;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public int read(byte[] bArr, int i, int i2) {
            int read = super.read(bArr, i, i2);
            if (read != -1) {
                this.f22281a += read;
            }
            return read;
        }
    }

    public amj(File file) {
        this(file, 5242880);
    }

    public amj(File file, int i) {
        this.f22269a = new LinkedHashMap(16, 0.75f, true);
        this.f22270b = 0L;
        this.f22271c = file;
        this.f22272d = i;
    }

    /* renamed from: a */
    static int m16812a(InputStream inputStream) {
        return (m16799e(inputStream) << 0) | 0 | (m16799e(inputStream) << 8) | (m16799e(inputStream) << 16) | (m16799e(inputStream) << 24);
    }

    /* renamed from: a */
    private void m16813a(int i) {
        int i2;
        if (this.f22270b + i < this.f22272d) {
            return;
        }
        if (ajg.f22012b) {
            ajg.m17133a("Pruning old cache entries.", new Object[0]);
        }
        long j = this.f22270b;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        Iterator<Map.Entry<String, C6568a>> it2 = this.f22269a.entrySet().iterator();
        int i3 = 0;
        while (true) {
            if (!it2.hasNext()) {
                i2 = i3;
                break;
            }
            C6568a value = it2.next().getValue();
            if (m16802c(value.f22274b).delete()) {
                this.f22270b -= value.f22273a;
            } else {
                ajg.m17131b("Could not delete cache entry for key=%s, filename=%s", value.f22274b, m16800d(value.f22274b));
            }
            it2.remove();
            i2 = i3 + 1;
            if (((float) (this.f22270b + i)) < this.f22272d * 0.9f) {
                break;
            }
            i3 = i2;
        }
        if (!ajg.f22012b) {
            return;
        }
        ajg.m17133a("pruned %d files, %d bytes, %d ms", Integer.valueOf(i2), Long.valueOf(this.f22270b - j), Long.valueOf(SystemClock.elapsedRealtime() - elapsedRealtime));
    }

    /* renamed from: a */
    static void m16810a(OutputStream outputStream, int i) {
        outputStream.write((i >> 0) & 255);
        outputStream.write((i >> 8) & 255);
        outputStream.write((i >> 16) & 255);
        outputStream.write((i >> 24) & 255);
    }

    /* renamed from: a */
    static void m16809a(OutputStream outputStream, long j) {
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
    static void m16808a(OutputStream outputStream, String str) {
        byte[] bytes = str.getBytes("UTF-8");
        m16809a(outputStream, bytes.length);
        outputStream.write(bytes, 0, bytes.length);
    }

    /* renamed from: a */
    private void m16807a(String str, C6568a c6568a) {
        if (!this.f22269a.containsKey(str)) {
            this.f22270b += c6568a.f22273a;
        } else {
            this.f22270b = (c6568a.f22273a - this.f22269a.get(str).f22273a) + this.f22270b;
        }
        this.f22269a.put(str, c6568a);
    }

    /* renamed from: a */
    static void m16806a(Map<String, String> map, OutputStream outputStream) {
        if (map == null) {
            m16810a(outputStream, 0);
            return;
        }
        m16810a(outputStream, map.size());
        for (Map.Entry<String, String> entry : map.entrySet()) {
            m16808a(outputStream, entry.getKey());
            m16808a(outputStream, entry.getValue());
        }
    }

    /* renamed from: a */
    private static byte[] m16811a(InputStream inputStream, int i) {
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
            throw new IOException(new StringBuilder(50).append("Expected ").append(i).append(" bytes, read ").append(i2).append(" bytes").toString());
        }
        return bArr;
    }

    /* renamed from: b */
    static long m16805b(InputStream inputStream) {
        return 0 | ((m16799e(inputStream) & 255) << 0) | ((m16799e(inputStream) & 255) << 8) | ((m16799e(inputStream) & 255) << 16) | ((m16799e(inputStream) & 255) << 24) | ((m16799e(inputStream) & 255) << 32) | ((m16799e(inputStream) & 255) << 40) | ((m16799e(inputStream) & 255) << 48) | ((m16799e(inputStream) & 255) << 56);
    }

    /* renamed from: c */
    static String m16803c(InputStream inputStream) {
        return new String(m16811a(inputStream, (int) m16805b(inputStream)), "UTF-8");
    }

    /* renamed from: d */
    private String m16800d(String str) {
        int length = str.length() / 2;
        String valueOf = String.valueOf(String.valueOf(str.substring(0, length).hashCode()));
        String valueOf2 = String.valueOf(String.valueOf(str.substring(length).hashCode()));
        return valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
    }

    /* renamed from: d */
    static Map<String, String> m16801d(InputStream inputStream) {
        int m16812a = m16812a(inputStream);
        Map<String, String> emptyMap = m16812a == 0 ? Collections.emptyMap() : new HashMap<>(m16812a);
        for (int i = 0; i < m16812a; i++) {
            emptyMap.put(m16803c(inputStream).intern(), m16803c(inputStream).intern());
        }
        return emptyMap;
    }

    /* renamed from: e */
    private static int m16799e(InputStream inputStream) {
        int read = inputStream.read();
        if (read == -1) {
            throw new EOFException();
        }
        return read;
    }

    /* renamed from: e */
    private void m16798e(String str) {
        C6568a c6568a = this.f22269a.get(str);
        if (c6568a != null) {
            this.f22270b -= c6568a.f22273a;
            this.f22269a.remove(str);
        }
    }

    @Override // com.google.android.gms.internal.AbstractC7674ru
    /* renamed from: a */
    public synchronized AbstractC7674ru.C7675a mo13736a(String str) {
        C6569b c6569b;
        AbstractC7674ru.C7675a c7675a;
        File m16802c;
        C6568a c6568a = this.f22269a.get(str);
        if (c6568a == null) {
            c7675a = null;
        } else {
            try {
                m16802c = m16802c(str);
            } catch (Throwable th) {
                th = th;
            }
            try {
                c6569b = new C6569b(new FileInputStream(m16802c));
                try {
                    C6568a.m16797a(c6569b);
                    c7675a = c6568a.m16795a(m16811a(c6569b, (int) (m16802c.length() - c6569b.f22281a)));
                    if (c6569b != null) {
                        try {
                            c6569b.close();
                        } catch (IOException e) {
                            c7675a = null;
                        }
                    }
                } catch (IOException e2) {
                    e = e2;
                    ajg.m17131b("%s: %s", m16802c.getAbsolutePath(), e.toString());
                    m16804b(str);
                    if (c6569b != null) {
                        try {
                            c6569b.close();
                        } catch (IOException e3) {
                            c7675a = null;
                        }
                    }
                    c7675a = null;
                    return c7675a;
                }
            } catch (IOException e4) {
                e = e4;
                c6569b = null;
            } catch (Throwable th2) {
                th = th2;
                c6569b = null;
                if (c6569b != null) {
                    try {
                        c6569b.close();
                    } catch (IOException e5) {
                        c7675a = null;
                    }
                }
                throw th;
            }
        }
        return c7675a;
    }

    @Override // com.google.android.gms.internal.AbstractC7674ru
    /* renamed from: a */
    public synchronized void mo13737a() {
        BufferedInputStream bufferedInputStream;
        if (this.f22271c.exists()) {
            File[] listFiles = this.f22271c.listFiles();
            if (listFiles != null) {
                for (File file : listFiles) {
                    BufferedInputStream bufferedInputStream2 = null;
                    try {
                        bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
                        try {
                            try {
                                C6568a m16797a = C6568a.m16797a(bufferedInputStream);
                                m16797a.f22273a = file.length();
                                m16807a(m16797a.f22274b, m16797a);
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
        } else if (!this.f22271c.mkdirs()) {
            ajg.m17130c("Unable to create cache dir %s", this.f22271c.getAbsolutePath());
        }
    }

    @Override // com.google.android.gms.internal.AbstractC7674ru
    /* renamed from: a */
    public synchronized void mo13735a(String str, AbstractC7674ru.C7675a c7675a) {
        FileOutputStream fileOutputStream;
        C6568a c6568a;
        m16813a(c7675a.f25470a.length);
        File m16802c = m16802c(str);
        try {
            fileOutputStream = new FileOutputStream(m16802c);
            c6568a = new C6568a(str, c7675a);
        } catch (IOException e) {
            if (!m16802c.delete()) {
                ajg.m17131b("Could not clean up file %s", m16802c.getAbsolutePath());
            }
        }
        if (!c6568a.m16796a(fileOutputStream)) {
            fileOutputStream.close();
            ajg.m17131b("Failed to write header for %s", m16802c.getAbsolutePath());
            throw new IOException();
        }
        fileOutputStream.write(c7675a.f25470a);
        fileOutputStream.close();
        m16807a(str, c6568a);
    }

    /* renamed from: b */
    public synchronized void m16804b(String str) {
        boolean delete = m16802c(str).delete();
        m16798e(str);
        if (!delete) {
            ajg.m17131b("Could not delete cache entry for key=%s, filename=%s", str, m16800d(str));
        }
    }

    /* renamed from: c */
    public File m16802c(String str) {
        return new File(this.f22271c, m16800d(str));
    }
}
