package com.google.android.gms.internal;

import java.io.IOException;
import java.io.Reader;
import java.nio.CharBuffer;
import java.util.ArrayList;
import java.util.List;
/* renamed from: com.google.android.gms.internal.hx */
/* loaded from: classes2.dex */
public class C7135hx extends Reader {

    /* renamed from: a */
    private List<String> f24026a;

    /* renamed from: b */
    private boolean f24027b = false;

    /* renamed from: c */
    private int f24028c;

    /* renamed from: e */
    private int f24030e = this.f24028c;

    /* renamed from: d */
    private int f24029d;

    /* renamed from: f */
    private int f24031f = this.f24029d;

    /* renamed from: g */
    private boolean f24032g = false;

    public C7135hx() {
        this.f24026a = null;
        this.f24026a = new ArrayList();
    }

    /* renamed from: a */
    private long m15443a(long j) {
        long j2 = 0;
        while (this.f24029d < this.f24026a.size() && j2 < j) {
            int m15440c = m15440c();
            long j3 = j - j2;
            if (j3 < m15440c) {
                this.f24028c = (int) (this.f24028c + j3);
                j2 += j3;
            } else {
                j2 += m15440c;
                this.f24028c = 0;
                this.f24029d++;
            }
        }
        return j2;
    }

    /* renamed from: b */
    private String m15441b() {
        if (this.f24029d < this.f24026a.size()) {
            return this.f24026a.get(this.f24029d);
        }
        return null;
    }

    /* renamed from: c */
    private int m15440c() {
        String m15441b = m15441b();
        if (m15441b == null) {
            return 0;
        }
        return m15441b.length() - this.f24028c;
    }

    /* renamed from: d */
    private void m15439d() {
        if (this.f24027b) {
            throw new IOException("Stream already closed");
        }
        if (this.f24032g) {
            return;
        }
        throw new IOException("Reader needs to be frozen before read operations can be called");
    }

    /* renamed from: a */
    public void m15444a() {
        if (this.f24032g) {
            throw new IllegalStateException("Trying to freeze frozen StringListReader");
        }
        this.f24032g = true;
    }

    /* renamed from: a */
    public void m15442a(String str) {
        if (this.f24032g) {
            throw new IllegalStateException("Trying to add string after reading");
        }
        if (str.length() <= 0) {
            return;
        }
        this.f24026a.add(str);
    }

    @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        m15439d();
        this.f24027b = true;
    }

    @Override // java.io.Reader
    public void mark(int i) {
        m15439d();
        this.f24030e = this.f24028c;
        this.f24031f = this.f24029d;
    }

    @Override // java.io.Reader
    public boolean markSupported() {
        return true;
    }

    @Override // java.io.Reader
    public int read() {
        m15439d();
        String m15441b = m15441b();
        if (m15441b == null) {
            return -1;
        }
        char charAt = m15441b.charAt(this.f24028c);
        m15443a(1L);
        return charAt;
    }

    @Override // java.io.Reader, java.lang.Readable
    public int read(CharBuffer charBuffer) {
        m15439d();
        int remaining = charBuffer.remaining();
        int i = 0;
        String m15441b = m15441b();
        while (remaining > 0 && m15441b != null) {
            int min = Math.min(m15441b.length() - this.f24028c, remaining);
            charBuffer.put(this.f24026a.get(this.f24029d), this.f24028c, this.f24028c + min);
            remaining -= min;
            i += min;
            m15443a(min);
            m15441b = m15441b();
        }
        if (i > 0 || m15441b != null) {
            return i;
        }
        return -1;
    }

    @Override // java.io.Reader
    public int read(char[] cArr, int i, int i2) {
        m15439d();
        int i3 = 0;
        String m15441b = m15441b();
        while (m15441b != null && i3 < i2) {
            int min = Math.min(m15440c(), i2 - i3);
            m15441b.getChars(this.f24028c, this.f24028c + min, cArr, i + i3);
            m15443a(min);
            i3 += min;
            m15441b = m15441b();
        }
        if (i3 > 0 || m15441b != null) {
            return i3;
        }
        return -1;
    }

    @Override // java.io.Reader
    public boolean ready() {
        m15439d();
        return true;
    }

    @Override // java.io.Reader
    public void reset() {
        this.f24028c = this.f24030e;
        this.f24029d = this.f24031f;
    }

    @Override // java.io.Reader
    public long skip(long j) {
        m15439d();
        return m15443a(j);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (String str : this.f24026a) {
            sb.append(str);
        }
        return sb.toString();
    }
}
