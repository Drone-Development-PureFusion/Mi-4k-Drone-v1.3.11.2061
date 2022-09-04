package com.fimi.soul.module.droneTrack.p216a;

import com.fimi.soul.drone.p205i.C2301ag;
import com.fimi.soul.drone.p205i.C2302ah;
import com.fimi.soul.drone.p205i.C2306al;
import com.fimi.soul.drone.p205i.C2307am;
import com.fimi.soul.drone.p205i.C2311aq;
import com.fimi.soul.drone.p205i.C2319ay;
import com.fimi.soul.drone.p205i.C2333c;
import com.fimi.soul.drone.p205i.C2334d;
import com.fimi.soul.drone.p205i.C2335e;
import com.fimi.soul.drone.p205i.C2365x;
import com.fimi.soul.drone.p205i.p206a.C2289c;
import com.fimi.soul.drone.p205i.p206a.C2292f;
import com.fimi.soul.utils.C3103au;
/* renamed from: com.fimi.soul.module.droneTrack.a.a */
/* loaded from: classes.dex */
public class C2671a {

    /* renamed from: j */
    C2333c f9110j;

    /* renamed from: k */
    boolean f9111k;

    /* renamed from: a */
    C2301ag f9101a = new C2301ag();

    /* renamed from: b */
    C2311aq f9102b = new C2311aq();

    /* renamed from: c */
    C2302ah f9103c = new C2302ah();

    /* renamed from: d */
    C2334d f9104d = new C2334d();

    /* renamed from: e */
    C2289c f9105e = new C2289c();

    /* renamed from: l */
    C2365x f9112l = new C2365x();

    /* renamed from: f */
    C2292f f9106f = new C2292f();

    /* renamed from: g */
    C2319ay f9107g = new C2319ay();

    /* renamed from: h */
    C2335e f9108h = new C2335e();

    /* renamed from: i */
    C2307am f9109i = new C2307am();

    /* renamed from: m */
    private C2306al f9113m = new C2306al();

    /* renamed from: a */
    public C2292f m30731a() {
        return this.f9106f;
    }

    /* renamed from: a */
    public void m30730a(C2289c c2289c) {
        this.f9105e = c2289c;
    }

    /* renamed from: a */
    public void m30729a(C2292f c2292f) {
        this.f9106f = c2292f;
    }

    /* renamed from: a */
    public void m30728a(C2301ag c2301ag) {
        this.f9101a = c2301ag;
        if (((c2301ag.m32317g() & 240) >> 4) == 1) {
            m30718a(true);
        } else {
            m30718a(false);
        }
    }

    /* renamed from: a */
    public void m30727a(C2302ah c2302ah) {
        this.f9103c = c2302ah;
    }

    /* renamed from: a */
    public void m30726a(C2306al c2306al) {
        this.f9113m = c2306al;
    }

    /* renamed from: a */
    public void m30725a(C2307am c2307am) {
        this.f9109i = c2307am;
    }

    /* renamed from: a */
    public void m30724a(C2311aq c2311aq) {
        this.f9102b = c2311aq;
    }

    /* renamed from: a */
    public void m30723a(C2319ay c2319ay) {
        this.f9107g = c2319ay;
    }

    /* renamed from: a */
    public void m30722a(C2333c c2333c) {
        this.f9110j = c2333c;
    }

    /* renamed from: a */
    public void m30721a(C2334d c2334d) {
        this.f9104d = c2334d;
    }

    /* renamed from: a */
    public void m30720a(C2335e c2335e) {
        this.f9108h = c2335e;
    }

    /* renamed from: a */
    public void m30719a(C2365x c2365x) {
        this.f9112l = c2365x;
    }

    /* renamed from: a */
    public void m30718a(boolean z) {
        this.f9111k = z;
    }

    /* renamed from: b */
    public C2365x m30717b() {
        return this.f9112l;
    }

    /* renamed from: c */
    public C2289c m30716c() {
        return this.f9105e;
    }

    /* renamed from: d */
    public C2334d m30715d() {
        return this.f9104d;
    }

    /* renamed from: e */
    public C2302ah m30714e() {
        return this.f9103c;
    }

    /* renamed from: f */
    public C2311aq m30713f() {
        return this.f9102b;
    }

    /* renamed from: g */
    public C2301ag m30712g() {
        return this.f9101a;
    }

    /* renamed from: h */
    public C2319ay m30711h() {
        return this.f9107g;
    }

    /* renamed from: i */
    public C2335e m30710i() {
        return this.f9108h;
    }

    /* renamed from: j */
    public boolean m30709j() {
        return this.f9111k;
    }

    /* renamed from: k */
    public C2307am m30708k() {
        return this.f9109i;
    }

    /* renamed from: l */
    public C2333c m30707l() {
        return this.f9110j;
    }

    /* renamed from: m */
    public boolean m30706m() {
        return this.f9107g != null && C3103au.m29241a(this.f9107g.m32128e(), Math.abs(0)) > 0;
    }

    /* renamed from: n */
    public boolean m30705n() {
        return this.f9107g != null && C3103au.m29241a(this.f9107g.m32128e(), Math.abs(1)) > 0;
    }

    /* renamed from: o */
    public C2306al m30704o() {
        return this.f9113m;
    }
}
