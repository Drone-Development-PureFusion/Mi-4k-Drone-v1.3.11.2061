package com.fimi.soul.biz.p180h;

import java.util.Observable;
/* renamed from: com.fimi.soul.biz.h.b */
/* loaded from: classes.dex */
public class C1851b extends Observable {

    /* renamed from: a */
    private boolean f5030a;

    /* renamed from: a */
    public void m33908a(boolean z) {
        if ((!this.f5030a) == z) {
            setChanged();
            notifyObservers();
        }
        this.f5030a = z;
    }

    /* renamed from: a */
    public boolean m33909a() {
        return this.f5030a;
    }
}
