package com.p120c.p121a.p122a.p127b.p128a;

import android.graphics.Bitmap;
import com.p120c.p121a.p122a.p127b.AbstractC1282b;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
/* renamed from: com.c.a.a.b.a.d */
/* loaded from: classes.dex */
public class C1277d extends AbstractC1282b {

    /* renamed from: a */
    private final Map<Bitmap, Integer> f3208a = Collections.synchronizedMap(new HashMap());

    public C1277d(int i) {
        super(i);
    }

    @Override // com.p120c.p121a.p122a.p127b.AbstractC1273a
    /* renamed from: a */
    protected Reference<Bitmap> mo35969a(Bitmap bitmap) {
        return new WeakReference(bitmap);
    }

    @Override // com.p120c.p121a.p122a.p127b.AbstractC1282b, com.p120c.p121a.p122a.p127b.AbstractC1273a, com.p120c.p121a.p122a.p127b.AbstractC1283c
    /* renamed from: a */
    public boolean mo35963a(String str, Bitmap bitmap) {
        if (super.mo35963a(str, bitmap)) {
            this.f3208a.put(bitmap, Integer.valueOf(mo35968b(bitmap)));
            return true;
        }
        return false;
    }

    @Override // com.p120c.p121a.p122a.p127b.AbstractC1282b
    /* renamed from: b */
    protected int mo35968b(Bitmap bitmap) {
        return bitmap.getRowBytes() * bitmap.getHeight();
    }

    @Override // com.p120c.p121a.p122a.p127b.AbstractC1282b, com.p120c.p121a.p122a.p127b.AbstractC1273a, com.p120c.p121a.p122a.p127b.AbstractC1283c
    /* renamed from: b */
    public Bitmap mo35961b(String str) {
        Bitmap a = super.a(str);
        if (a != null) {
            this.f3208a.remove(a);
        }
        return super.mo35961b(str);
    }

    @Override // com.p120c.p121a.p122a.p127b.AbstractC1282b, com.p120c.p121a.p122a.p127b.AbstractC1273a, com.p120c.p121a.p122a.p127b.AbstractC1283c
    /* renamed from: b */
    public void mo35962b() {
        this.f3208a.clear();
        super.mo35962b();
    }

    @Override // com.p120c.p121a.p122a.p127b.AbstractC1282b
    /* renamed from: d */
    protected Bitmap mo35966d() {
        Bitmap bitmap;
        Integer num;
        Bitmap bitmap2 = null;
        Set<Map.Entry<Bitmap, Integer>> entrySet = this.f3208a.entrySet();
        synchronized (this.f3208a) {
            Integer num2 = null;
            for (Map.Entry<Bitmap, Integer> entry : entrySet) {
                if (bitmap2 == null) {
                    bitmap = entry.getKey();
                    num = entry.getValue();
                } else {
                    Integer value = entry.getValue();
                    if (value.intValue() > num2.intValue()) {
                        Bitmap key = entry.getKey();
                        num = value;
                        bitmap = key;
                    } else {
                        bitmap = bitmap2;
                        num = num2;
                    }
                }
                bitmap2 = bitmap;
                num2 = num;
            }
        }
        this.f3208a.remove(bitmap2);
        return bitmap2;
    }
}
