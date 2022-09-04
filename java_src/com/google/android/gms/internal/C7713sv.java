package com.google.android.gms.internal;

import android.os.Process;
import com.google.android.gms.internal.AbstractC7674ru;
import java.util.concurrent.BlockingQueue;
/* renamed from: com.google.android.gms.internal.sv */
/* loaded from: classes2.dex */
public class C7713sv extends Thread {

    /* renamed from: a */
    private static final boolean f25559a = ajg.f22012b;

    /* renamed from: b */
    private final BlockingQueue<abd<?>> f25560b;

    /* renamed from: c */
    private final BlockingQueue<abd<?>> f25561c;

    /* renamed from: d */
    private final AbstractC7674ru f25562d;

    /* renamed from: e */
    private final aeg f25563e;

    /* renamed from: f */
    private volatile boolean f25564f = false;

    public C7713sv(BlockingQueue<abd<?>> blockingQueue, BlockingQueue<abd<?>> blockingQueue2, AbstractC7674ru abstractC7674ru, aeg aegVar) {
        super("VolleyCacheDispatcher");
        this.f25560b = blockingQueue;
        this.f25561c = blockingQueue2;
        this.f25562d = abstractC7674ru;
        this.f25563e = aegVar;
    }

    /* renamed from: a */
    public void m13669a() {
        this.f25564f = true;
        interrupt();
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        if (f25559a) {
            ajg.m17133a("start new dispatcher", new Object[0]);
        }
        Process.setThreadPriority(10);
        this.f25562d.mo13737a();
        while (true) {
            try {
                final abd<?> take = this.f25560b.take();
                take.m18507b("cache-queue-take");
                if (take.m18502f()) {
                    take.m18505c("cache-discard-canceled");
                } else {
                    AbstractC7674ru.C7675a mo13736a = this.f25562d.mo13736a(take.m18504d());
                    if (mo13736a == null) {
                        take.m18507b("cache-miss");
                        this.f25561c.put(take);
                    } else if (mo13736a.m13734a()) {
                        take.m18507b("cache-hit-expired");
                        take.m18513a(mo13736a);
                        this.f25561c.put(take);
                    } else {
                        take.m18507b("cache-hit");
                        adf<?> mo18238a = take.mo18238a(new C8092zb(mo13736a.f25470a, mo13736a.f25476g));
                        take.m18507b("cache-hit-parsed");
                        if (!mo13736a.m13733b()) {
                            this.f25563e.mo13396a(take, mo18238a);
                        } else {
                            take.m18507b("cache-hit-refresh-needed");
                            take.m18513a(mo13736a);
                            mo18238a.f21268d = true;
                            this.f25563e.mo13395a(take, mo18238a, new Runnable() { // from class: com.google.android.gms.internal.sv.1
                                @Override // java.lang.Runnable
                                public void run() {
                                    try {
                                        C7713sv.this.f25561c.put(take);
                                    } catch (InterruptedException e) {
                                    }
                                }
                            });
                        }
                    }
                }
            } catch (InterruptedException e) {
                if (this.f25564f) {
                    return;
                }
            }
        }
    }
}
