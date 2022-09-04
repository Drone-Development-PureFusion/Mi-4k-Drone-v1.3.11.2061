package com.fimi.soul.biz.p178f;

import com.fimi.soul.biz.camera.entity.RelayEntity;
import com.fimi.soul.biz.p170b.C1772d;
/* renamed from: com.fimi.soul.biz.f.a */
/* loaded from: classes.dex */
public class C1845a implements C1772d.AbstractC1774a {

    /* renamed from: a */
    public static C1845a f5018a = null;

    /* renamed from: b */
    private static final int f5019b = 100;

    /* renamed from: c */
    private volatile boolean f5020c;

    /* renamed from: d */
    private C1772d f5021d = C1772d.m34208a();

    public C1845a() {
        this.f5021d.m34206a(this);
    }

    /* renamed from: b */
    public static C1845a m33920b() {
        if (f5018a == null) {
            synchronized (C1845a.class) {
                if (f5018a == null) {
                    f5018a = new C1845a();
                }
            }
        }
        return f5018a;
    }

    /* renamed from: a */
    public void m33922a() {
        this.f5021d.m34203b();
        this.f5021d.m34198c("5G");
    }

    @Override // com.fimi.soul.biz.p170b.C1772d.AbstractC1774a
    /* renamed from: a */
    public void mo29620a(RelayEntity relayEntity) {
        if (relayEntity == null || "5G".equals(relayEntity.getDevice_type())) {
            return;
        }
        this.f5020c = true;
    }

    /* renamed from: a */
    public void m33921a(boolean z) {
        this.f5020c = z;
    }

    /* renamed from: c */
    public boolean m33919c() {
        return this.f5020c;
    }

    /* renamed from: d */
    public void m33918d() {
        this.f5020c = false;
    }
}
