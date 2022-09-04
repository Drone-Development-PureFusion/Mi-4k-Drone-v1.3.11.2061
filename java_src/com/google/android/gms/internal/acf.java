package com.google.android.gms.internal;

import android.graphics.Bitmap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
@aaa
/* loaded from: classes.dex */
public class acf {

    /* renamed from: a */
    Map<Integer, Bitmap> f21122a = new ConcurrentHashMap();

    /* renamed from: b */
    private AtomicInteger f21123b = new AtomicInteger(0);

    /* renamed from: a */
    public int m18225a(Bitmap bitmap) {
        if (bitmap == null) {
            abr.a("Bitmap is null. Skipping putting into the Memory Map.");
            return -1;
        }
        this.f21122a.put(Integer.valueOf(this.f21123b.get()), bitmap);
        return this.f21123b.getAndIncrement();
    }

    /* renamed from: a */
    public Bitmap m18224a(Integer num) {
        return this.f21122a.get(num);
    }

    /* renamed from: b */
    public void m18223b(Integer num) {
        this.f21122a.remove(num);
    }
}
