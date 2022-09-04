package com.google.android.gms.internal;

import com.google.android.gms.common.internal.C4588d;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
/* loaded from: classes2.dex */
public class ajm implements ThreadFactory {

    /* renamed from: a */
    private final String f22025a;

    /* renamed from: b */
    private final int f22026b;

    /* renamed from: c */
    private final AtomicInteger f22027c;

    /* renamed from: d */
    private final ThreadFactory f22028d;

    public ajm(String str) {
        this(str, 0);
    }

    public ajm(String str, int i) {
        this.f22027c = new AtomicInteger();
        this.f22028d = Executors.defaultThreadFactory();
        this.f22025a = (String) C4588d.m23626a(str, (Object) "Name must not be null");
        this.f22026b = i;
    }

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(Runnable runnable) {
        Thread newThread = this.f22028d.newThread(new ajn(runnable, this.f22026b));
        String str = this.f22025a;
        newThread.setName(new StringBuilder(String.valueOf(str).length() + 13).append(str).append("[").append(this.f22027c.getAndIncrement()).append("]").toString());
        return newThread;
    }
}
