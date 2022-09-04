package com.fimi.p140a;

import android.content.Context;
import com.fimi.p140a.p142b.EnumC1495b;
import com.fimi.p140a.p143c.AbstractC1497a;
import com.fimi.p140a.p143c.AbstractC1499c;
import com.fimi.soul.drone.p192a.C2093b;
import com.fimi.x1bh.p220a.C3331a;
/* renamed from: com.fimi.a.d */
/* loaded from: classes.dex */
public class C1500d implements AbstractC1497a {

    /* renamed from: a */
    private AbstractC1488a f3594a;

    public C1500d(Context context, EnumC1495b enumC1495b, AbstractC1499c abstractC1499c) {
        switch (enumC1495b) {
            case DRONE:
                this.f3594a = new C2093b(context, abstractC1499c);
                return;
            case X1BH:
                this.f3594a = new C3331a(context, abstractC1499c);
                return;
            default:
                return;
        }
    }

    @Override // com.fimi.p140a.p143c.AbstractC1497a
    /* renamed from: a */
    public void mo28277a() {
        this.f3594a.a();
    }

    @Override // com.fimi.p140a.p143c.AbstractC1497a
    /* renamed from: b */
    public void mo28274b() {
        this.f3594a.b();
    }

    @Override // com.fimi.p140a.p143c.AbstractC1497a
    /* renamed from: c */
    public void mo28272c() {
        this.f3594a.c();
    }

    @Override // com.fimi.p140a.p143c.AbstractC1497a
    /* renamed from: d */
    public void mo28270d() {
        this.f3594a.d();
    }

    @Override // com.fimi.p140a.p143c.AbstractC1497a
    /* renamed from: e */
    public void mo28268e() {
        this.f3594a.e();
    }

    @Override // com.fimi.p140a.p143c.AbstractC1497a
    /* renamed from: f */
    public void mo28265f() {
        this.f3594a.f();
    }

    @Override // com.fimi.p140a.p143c.AbstractC1497a
    /* renamed from: g */
    public void mo28263g() {
        this.f3594a.g();
    }
}
