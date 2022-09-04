package com.fimi.soul.drone;

import android.os.Handler;
import com.fimi.soul.drone.C2104d;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;
/* renamed from: com.fimi.soul.drone.b */
/* loaded from: classes.dex */
public class C2097b extends C2247e {

    /* renamed from: c */
    private final Handler f5991c;

    /* renamed from: b */
    private final ConcurrentLinkedQueue<C2104d.EnumC2105a> f5990b = new ConcurrentLinkedQueue<>();

    /* renamed from: d */
    private final Runnable f5992d = new Runnable() { // from class: com.fimi.soul.drone.b.1
        @Override // java.lang.Runnable
        public void run() {
            do {
                C2097b.this.f5991c.removeCallbacks(this);
                C2104d.EnumC2105a enumC2105a = (C2104d.EnumC2105a) C2097b.this.f5990b.poll();
                if (enumC2105a != null && !C2097b.this.f5993e.isEmpty()) {
                    Iterator it2 = C2097b.this.f5993e.iterator();
                    while (it2.hasNext()) {
                        ((C2104d.AbstractC2106b) it2.next()).onDroneEvent(enumC2105a, C2097b.this.f7081a);
                    }
                }
            } while (!C2097b.this.f5990b.isEmpty());
        }
    };

    /* renamed from: e */
    private final ConcurrentLinkedQueue<C2104d.AbstractC2106b> f5993e = new ConcurrentLinkedQueue<>();

    public C2097b(C2083a c2083a, Handler handler) {
        super(c2083a);
        this.f5991c = handler;
    }

    /* renamed from: a */
    public void m32941a(C2104d.EnumC2105a enumC2105a) {
        this.f5990b.offer(enumC2105a);
        this.f5991c.post(this.f5992d);
    }

    /* renamed from: a */
    public void m32940a(C2104d.AbstractC2106b abstractC2106b) {
        boolean z = true;
        boolean z2 = abstractC2106b != null;
        if (this.f5993e.contains(abstractC2106b)) {
            z = false;
        }
        if (z2 && z) {
            this.f5993e.add(abstractC2106b);
        }
    }

    /* renamed from: b */
    public void m32938b(C2104d.AbstractC2106b abstractC2106b) {
        if (abstractC2106b == null || !this.f5993e.contains(abstractC2106b)) {
            return;
        }
        this.f5993e.remove(abstractC2106b);
    }
}
