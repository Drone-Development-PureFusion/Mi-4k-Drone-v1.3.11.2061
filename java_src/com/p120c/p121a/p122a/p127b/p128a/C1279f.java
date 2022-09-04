package com.p120c.p121a.p122a.p127b.p128a;

import android.graphics.Bitmap;
import com.p120c.p121a.p122a.p127b.AbstractC1283c;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
/* renamed from: com.c.a.a.b.a.f */
/* loaded from: classes.dex */
public class C1279f implements AbstractC1283c {

    /* renamed from: a */
    private final LinkedHashMap<String, Bitmap> f3212a;

    /* renamed from: b */
    private final int f3213b;

    /* renamed from: c */
    private int f3214c;

    public C1279f(int i) {
        if (i <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        this.f3213b = i;
        this.f3212a = new LinkedHashMap<>(0, 0.75f, true);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0031, code lost:
        throw new java.lang.IllegalStateException(getClass().getName() + ".sizeOf() is reporting inconsistent results!");
     */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void m35971a(int i) {
        while (true) {
            synchronized (this) {
                if (this.f3214c < 0 || (this.f3212a.isEmpty() && this.f3214c != 0)) {
                    break;
                } else if (this.f3214c <= i || this.f3212a.isEmpty()) {
                    break;
                } else {
                    Map.Entry<String, Bitmap> next = this.f3212a.entrySet().iterator().next();
                    if (next == null) {
                        return;
                    }
                    String key = next.getKey();
                    this.f3212a.remove(key);
                    this.f3214c -= m35970b(key, next.getValue());
                }
            }
        }
    }

    /* renamed from: b */
    private int m35970b(String str, Bitmap bitmap) {
        return bitmap.getRowBytes() * bitmap.getHeight();
    }

    @Override // com.p120c.p121a.p122a.p127b.AbstractC1283c
    /* renamed from: a */
    public final Bitmap mo35964a(String str) {
        Bitmap bitmap;
        if (str == null) {
            throw new NullPointerException("key == null");
        }
        synchronized (this) {
            bitmap = this.f3212a.get(str);
        }
        return bitmap;
    }

    @Override // com.p120c.p121a.p122a.p127b.AbstractC1283c
    /* renamed from: a */
    public Collection<String> mo35965a() {
        HashSet hashSet;
        synchronized (this) {
            hashSet = new HashSet(this.f3212a.keySet());
        }
        return hashSet;
    }

    @Override // com.p120c.p121a.p122a.p127b.AbstractC1283c
    /* renamed from: a */
    public final boolean mo35963a(String str, Bitmap bitmap) {
        if (str == null || bitmap == null) {
            throw new NullPointerException("key == null || value == null");
        }
        synchronized (this) {
            this.f3214c += m35970b(str, bitmap);
            Bitmap put = this.f3212a.put(str, bitmap);
            if (put != null) {
                this.f3214c -= m35970b(str, put);
            }
        }
        m35971a(this.f3213b);
        return true;
    }

    @Override // com.p120c.p121a.p122a.p127b.AbstractC1283c
    /* renamed from: b */
    public final Bitmap mo35961b(String str) {
        Bitmap remove;
        if (str == null) {
            throw new NullPointerException("key == null");
        }
        synchronized (this) {
            remove = this.f3212a.remove(str);
            if (remove != null) {
                this.f3214c -= m35970b(str, remove);
            }
        }
        return remove;
    }

    @Override // com.p120c.p121a.p122a.p127b.AbstractC1283c
    /* renamed from: b */
    public void mo35962b() {
        m35971a(-1);
    }

    public final synchronized String toString() {
        return String.format("LruCache[maxSize=%d]", Integer.valueOf(this.f3213b));
    }
}
