package com.fimi.soul.biz.p182j;

import com.fimi.soul.entity.FlyActionBean;
import com.google.android.gms.maps.model.C8611c;
import com.google.android.gms.maps.model.C8615g;
import com.google.android.gms.maps.model.C8617i;
import com.google.android.gms.maps.model.LatLng;
import java.util.ArrayList;
import java.util.List;
/* renamed from: com.fimi.soul.biz.j.d */
/* loaded from: classes.dex */
public class C1877d {

    /* renamed from: e */
    private int f5129e;

    /* renamed from: f */
    private C8611c f5130f;

    /* renamed from: i */
    private C8617i f5133i;

    /* renamed from: l */
    private volatile FlyActionBean f5136l;

    /* renamed from: m */
    private volatile FlyActionBean f5137m;

    /* renamed from: n */
    private volatile FlyActionBean f5138n;

    /* renamed from: p */
    private C8615g f5140p;

    /* renamed from: q */
    private boolean f5141q;

    /* renamed from: a */
    private int f5125a = 5;

    /* renamed from: b */
    private float f5126b = 4.0f;

    /* renamed from: c */
    private float f5127c = 4.0f;

    /* renamed from: d */
    private int f5128d = 4;

    /* renamed from: g */
    private volatile List<LatLng> f5131g = new ArrayList();

    /* renamed from: h */
    private volatile List<LatLng> f5132h = new ArrayList();

    /* renamed from: j */
    private int f5134j = 20;

    /* renamed from: k */
    private float f5135k = 1.0f;

    /* renamed from: o */
    private volatile float f5139o = 30.0f;

    /* renamed from: r */
    private List<C8615g> f5142r = new ArrayList();

    /* renamed from: s */
    private volatile List<FlyActionBean> f5143s = new ArrayList();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.fimi.soul.biz.j.d$a */
    /* loaded from: classes.dex */
    public static class C1878a {

        /* renamed from: a */
        static final C1877d f5144a = new C1877d();

        C1878a() {
        }
    }

    /* renamed from: p */
    public static C1877d m33782p() {
        return C1878a.f5144a;
    }

    /* renamed from: a */
    public int m33811a() {
        return this.f5129e;
    }

    /* renamed from: a */
    public void m33810a(float f) {
        this.f5135k = f;
    }

    /* renamed from: a */
    public void m33809a(int i) {
        this.f5129e = i;
    }

    /* renamed from: a */
    public void m33808a(FlyActionBean flyActionBean) {
        this.f5137m = flyActionBean;
    }

    /* renamed from: a */
    public void m33807a(C8611c c8611c) {
        this.f5130f = c8611c;
    }

    /* renamed from: a */
    public void m33806a(C8615g c8615g) {
        this.f5140p = c8615g;
    }

    /* renamed from: a */
    public void m33805a(C8617i c8617i) {
        this.f5133i = c8617i;
    }

    /* renamed from: a */
    public void m33804a(List<FlyActionBean> list) {
        this.f5143s = list;
    }

    /* renamed from: a */
    public void m33803a(boolean z) {
        this.f5141q = z;
    }

    /* renamed from: b */
    public C8611c m33802b() {
        return this.f5130f;
    }

    /* renamed from: b */
    public void m33801b(float f) {
        if (f < this.f5125a) {
            f = this.f5125a;
        }
        this.f5139o = f;
    }

    /* renamed from: b */
    public void m33800b(int i) {
        this.f5134j = i;
    }

    /* renamed from: b */
    public void m33799b(FlyActionBean flyActionBean) {
        this.f5136l = flyActionBean;
    }

    /* renamed from: c */
    public List<LatLng> m33798c() {
        return this.f5131g;
    }

    /* renamed from: c */
    public void m33797c(float f) {
        this.f5126b = f;
    }

    /* renamed from: c */
    public void m33796c(FlyActionBean flyActionBean) {
        this.f5138n = flyActionBean;
    }

    /* renamed from: d */
    public int m33795d() {
        return this.f5134j;
    }

    /* renamed from: d */
    public void m33794d(float f) {
        this.f5127c = f;
    }

    /* renamed from: e */
    public float m33793e() {
        return this.f5135k;
    }

    /* renamed from: f */
    public FlyActionBean m33792f() {
        return this.f5137m;
    }

    /* renamed from: g */
    public C8615g m33791g() {
        return this.f5140p;
    }

    /* renamed from: h */
    public boolean m33790h() {
        return this.f5141q;
    }

    /* renamed from: i */
    public List<C8615g> m33789i() {
        return this.f5142r;
    }

    /* renamed from: j */
    public List<FlyActionBean> m33788j() {
        return this.f5143s;
    }

    /* renamed from: k */
    public float m33787k() {
        return this.f5139o;
    }

    /* renamed from: l */
    public List<LatLng> m33786l() {
        return this.f5132h;
    }

    /* renamed from: m */
    public C8617i m33785m() {
        return this.f5133i;
    }

    /* renamed from: n */
    public FlyActionBean m33784n() {
        return this.f5136l;
    }

    /* renamed from: o */
    public FlyActionBean m33783o() {
        return this.f5138n;
    }

    /* renamed from: q */
    public float m33781q() {
        return this.f5126b;
    }

    /* renamed from: r */
    public float m33780r() {
        return this.f5127c;
    }

    /* renamed from: s */
    public void m33779s() {
        if (this.f5142r != null) {
            for (C8615g c8615g : this.f5142r) {
                c8615g.m11033a();
            }
            this.f5142r.clear();
        }
        if (this.f5133i != null) {
            this.f5133i.m10985a();
            this.f5133i = null;
        }
        this.f5132h.clear();
        this.f5143s.clear();
        this.f5131g.clear();
    }
}
