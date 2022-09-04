package com.fimi.p140a;

import com.fimi.p140a.p142b.EnumC1495b;
import com.fimi.p140a.p143c.AbstractC1498b;
import com.fimi.soul.biz.p178f.C1845a;
import com.fimi.soul.drone.C2083a;
import com.fimi.soul.module.login.C2811a;
import com.fimi.soul.module.login.LoginActivity;
import com.fimi.x1bh.p220a.C3334b;
/* renamed from: com.fimi.a.e */
/* loaded from: classes.dex */
public class C1504e implements AbstractC1498b {

    /* renamed from: a */
    AbstractC1498b f3602a;

    public C1504e(LoginActivity loginActivity, C2083a c2083a, EnumC1495b enumC1495b) {
        switch (enumC1495b) {
            case DRONE:
                this.f3602a = new C2811a(loginActivity, c2083a);
                return;
            case X1BH:
                this.f3602a = new C3334b(loginActivity);
                return;
            default:
                return;
        }
    }

    @Override // com.fimi.p140a.p143c.AbstractC1498b
    /* renamed from: a */
    public void mo35495a() {
        this.f3602a.mo35495a();
    }

    @Override // com.fimi.p140a.p143c.AbstractC1498b
    /* renamed from: a */
    public void mo35494a(int i) {
        this.f3602a.mo35494a(i);
    }

    @Override // com.fimi.p140a.p143c.AbstractC1498b
    /* renamed from: a */
    public void mo28259a(C1845a c1845a) {
        this.f3602a.mo28259a(c1845a);
    }

    @Override // com.fimi.p140a.p143c.AbstractC1498b
    /* renamed from: a */
    public void mo35493a(Runnable runnable) {
        this.f3602a.mo35493a(runnable);
    }

    @Override // com.fimi.p140a.p143c.AbstractC1498b
    /* renamed from: a */
    public void mo35492a(boolean z) {
        this.f3602a.mo35492a(z);
    }

    @Override // com.fimi.p140a.p143c.AbstractC1498b
    /* renamed from: b */
    public boolean mo35491b() {
        return this.f3602a.mo35491b();
    }

    @Override // com.fimi.p140a.p143c.AbstractC1498b
    /* renamed from: c */
    public int mo28256c() {
        return this.f3602a.mo28256c();
    }

    @Override // com.fimi.p140a.p143c.AbstractC1498b
    /* renamed from: d */
    public void mo28254d() {
        this.f3602a.mo28254d();
    }

    @Override // com.fimi.p140a.p143c.AbstractC1498b
    /* renamed from: e */
    public void mo28252e() {
        this.f3602a.mo28252e();
    }

    @Override // com.fimi.p140a.p143c.AbstractC1498b
    /* renamed from: f */
    public void mo28250f() {
        this.f3602a.mo28250f();
    }

    @Override // com.fimi.p140a.p143c.AbstractC1498b
    /* renamed from: g */
    public void mo28248g() {
        this.f3602a.mo28248g();
    }

    @Override // com.fimi.p140a.p143c.AbstractC1498b
    /* renamed from: h */
    public void mo28247h() {
        this.f3602a.mo28247h();
    }

    @Override // com.fimi.p140a.p143c.AbstractC1498b
    /* renamed from: i */
    public void mo28246i() {
        this.f3602a.mo28246i();
    }
}
