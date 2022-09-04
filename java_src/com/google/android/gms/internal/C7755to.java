package com.google.android.gms.internal;

import android.support.annotation.Nullable;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
@aaa
/* renamed from: com.google.android.gms.internal.to */
/* loaded from: classes.dex */
public class C7755to {

    /* renamed from: b */
    private int f25649b;

    /* renamed from: a */
    private final Object f25648a = new Object();

    /* renamed from: c */
    private List<C7754tn> f25650c = new LinkedList();

    @Nullable
    /* renamed from: a */
    public C7754tn m13563a() {
        int i;
        C7754tn c7754tn;
        C7754tn c7754tn2 = null;
        synchronized (this.f25648a) {
            if (this.f25650c.size() == 0) {
                abr.a("Queue empty");
                return null;
            } else if (this.f25650c.size() < 2) {
                C7754tn c7754tn3 = this.f25650c.get(0);
                c7754tn3.m13569d();
                return c7754tn3;
            } else {
                int i2 = Integer.MIN_VALUE;
                for (C7754tn c7754tn4 : this.f25650c) {
                    int m13565h = c7754tn4.m13565h();
                    if (m13565h > i2) {
                        c7754tn = c7754tn4;
                        i = m13565h;
                    } else {
                        i = i2;
                        c7754tn = c7754tn2;
                    }
                    i2 = i;
                    c7754tn2 = c7754tn;
                }
                this.f25650c.remove(c7754tn2);
                return c7754tn2;
            }
        }
    }

    /* renamed from: a */
    public boolean m13562a(C7754tn c7754tn) {
        boolean z;
        synchronized (this.f25648a) {
            z = this.f25650c.contains(c7754tn);
        }
        return z;
    }

    /* renamed from: b */
    public boolean m13561b(C7754tn c7754tn) {
        boolean z;
        synchronized (this.f25648a) {
            Iterator<C7754tn> it2 = this.f25650c.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    z = false;
                    break;
                }
                C7754tn next = it2.next();
                if (c7754tn != next && next.m13573b().equals(c7754tn.m13573b())) {
                    it2.remove();
                    z = true;
                    break;
                }
            }
        }
        return z;
    }

    /* renamed from: c */
    public void m13560c(C7754tn c7754tn) {
        synchronized (this.f25648a) {
            if (this.f25650c.size() >= 10) {
                abr.a(new StringBuilder(41).append("Queue is full, current size = ").append(this.f25650c.size()).toString());
                this.f25650c.remove(0);
            }
            int i = this.f25649b;
            this.f25649b = i + 1;
            c7754tn.m13577a(i);
            this.f25650c.add(c7754tn);
        }
    }
}
